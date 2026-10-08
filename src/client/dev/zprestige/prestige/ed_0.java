/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2848
 *  net.minecraft.class_310
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.a_;
import dev.zprestige.prestige.bG;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.bh_0;
import dev.zprestige.prestige.dM;
import dev.zprestige.prestige.dO;
import dev.zprestige.prestige.dQ;
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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_2848;
import net.minecraft.class_310;

/*
 * Renamed from dev.zprestige.prestige.ed
 */
public class ed_0
extends dV {
    private dM d;
    private dQ a;
    private dM c;
    private dM e;
    private dO f;
    private dM g;
    private dM h;
    private dM i;
    private dQ j;
    private f5 k;
    private f5 l;
    private f5 m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private int r;
    private int s;
    private int t;
    public static boolean u;
    public static ed_0 v;
    private static final long w;
    private static final long[] x;
    private static final Integer[] y;
    private static final Map z;
    private static final Object[] A;
    private static final String[] B;

    private static void lambda$onKey$2(boolean[] blArray) {
        block5: {
            long l;
            block4: {
                l = w ^ 0x506838222E31L;
                long l2 = l ^ 0x7F5C84040371L;
                CallSite callSite = ed_0.c("\u00cf", (long)2613373598499516996L, (long)l);
                try {
                    CallSite callSite2;
                    try {
                        callSite2 = ed_0.c("\u00c2", (Object)ed_0.c("\u00c2", (Object)ed_0.c("z", (Object)b, (long)2612664229623777616L, (long)l), (long)2615064784200860538L, (long)l), (Object)ed_0.c("d", (long)2612189498308368686L, (long)l), (long)2613465478208587643L, (long)l);
                        if (callSite != null) break block4;
                        if (callSite2 == false) break block5;
                    }
                    catch (MatchException matchException) {
                        throw ed_0.c("\u00cf", (Object)matchException, (long)2616367667396062516L, (long)l);
                    }
                    Object[] objectArray = new Object[2];
                    objectArray[1] = l2;
                    objectArray[0] = ed_0.c("d", (long)2615138199178087811L, (long)l);
                    callSite2 = ed_0.c("\u00cf", (Object)objectArray, (long)2612629337101164420L, (long)l);
                }
                catch (MatchException matchException) {
                    throw ed_0.c("\u00cf", (Object)matchException, (long)2616367667396062516L, (long)l);
                }
            }
            ed_0.c("\u00c2", (Object)ed_0.c("d", (long)2616513691862123817L, (long)l), (Object)new Object[]{true}, (long)2615021795490761329L, (long)l);
            blArray[0] = 1;
        }
    }

    public ed_0() {
        long l;
        long l2 = l = w ^ 0x34165F46318EL;
        long l3 = l2 ^ 0x2890EE57B37BL;
        long l4 = l2 ^ 0x1EC9D908C071L;
        long l5 = l2 ^ 0x16FFCA3DD7A8L;
        this.k = new f5(l4);
        this.l = new f5(l4);
        this.m = new f5(l4);
        this.r = 0;
        this.s = -1;
        this.t = -1;
        v = this;
        Object[] objectArray = new Object[2];
        objectArray[1] = l5;
        objectArray[0] = this::lambda$new$0;
        ed_0.c("\u00c2", (Object)this.f, (Object)objectArray, (long)4321769057978197131L, (long)l);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l3;
        objectArray2[0] = this::lambda$new$1;
        ed_0.c("\u00c2", (Object)this.j, (Object)objectArray2, (long)4321914962049769372L, (long)l);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                ed_0.w = hc.a(4379651009471862583L, 589578742679090161L, MethodHandles.lookup().lookupClass()).a(195121261072611L);
                ed_0.A = new Object[125];
                ed_0.B = new String[125];
                ed_0.f();
                ed_0.z = new HashMap<K, V>(13);
                var0 = ed_0.w ^ 104536626092476L;
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
                var8_3 = new long[8];
                var5_4 = 0;
                var6_5 = "\u0013\u009a\u0016E2\u00d6\n\u00f1h/\u0080\u00d2\u0001\u00bc\u00c9k`_\u001f\u00edi\u000e\u00bb?\u00c6\u009a\u00fa\u00c7\u00a00U\u000b{}\u00bc\u009b\u00e5Q\u00b1\u00f8\u00dd\u00fc\u00c4A\u0093\u0002\u00c0;";
                var7_6 = "\u0013\u009a\u0016E2\u00d6\n\u00f1h/\u0080\u00d2\u0001\u00bc\u00c9k`_\u001f\u00edi\u000e\u00bb?\u00c6\u009a\u00fa\u00c7\u00a00U\u000b{}\u00bc\u009b\u00e5Q\u00b1\u00f8\u00dd\u00fc\u00c4A\u0093\u0002\u00c0;".length();
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
                    var6_5 = "\u00f6i|Rx\u0085\u00d20\u0005\u00b9\u0018g\u00e8\u00bb\u00c9%";
                    var7_6 = "\u00f6i|Rx\u0085\u00d20\u0005\u00b9\u0018g\u00e8\u00bb\u00c9%".length();
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
        ed_0.x = var8_3;
        ed_0.y = new Integer[8];
    }

    @Override
    public void e(Object[] objectArray) {
        Object object;
        block20: {
            block21: {
                CallSite callSite;
                long l;
                block16: {
                    block17: {
                        block18: {
                            l = (Long)objectArray[0];
                            long l2 = l ^ 0x4F0FC97360C9L;
                            callSite = ed_0.c("\u00cf", (long)3995497226662551922L, (long)l);
                            try {
                                ed_0 ed_02;
                                block19: {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    object = ed_0.c("\u00c2", (Object)((Boolean)((Object)ed_0.c("\u00c2", (Object)this.e, (long)3995760025378774526L, (long)l))), (long)3994946905033290665L, (long)l);
                                                    if (callSite != null) break block16;
                                                    if (object != false) break block17;
                                                }
                                                catch (MatchException matchException) {
                                                    throw ed_0.c("\u00cf", (Object)matchException, (long)3997365189593841154L, (long)l);
                                                }
                                                ed_02 = this;
                                                if (callSite != null) break block18;
                                            }
                                            catch (MatchException matchException) {
                                                throw ed_0.c("\u00cf", (Object)matchException, (long)3997365189593841154L, (long)l);
                                            }
                                            if (ed_02.o) break block19;
                                        }
                                        catch (MatchException matchException) {
                                            throw ed_0.c("\u00cf", (Object)matchException, (long)3997365189593841154L, (long)l);
                                        }
                                        this.o = 1;
                                        Object[] objectArray2 = new Object[1];
                                        objectArray2[0] = l2;
                                        ed_0.c("\u00c2", (Object)this, (Object)objectArray2, (long)3996618333061953140L, (long)l);
                                        if (callSite == null) break block17;
                                    }
                                    catch (MatchException matchException) {
                                        throw ed_0.c("\u00cf", (Object)matchException, (long)3997365189593841154L, (long)l);
                                    }
                                }
                                ed_02 = this;
                            }
                            catch (MatchException matchException) {
                                throw ed_0.c("\u00cf", (Object)matchException, (long)3997365189593841154L, (long)l);
                            }
                        }
                        ed_02.o = 0;
                        return;
                    }
                    object = this.o;
                }
                try {
                    try {
                        try {
                            if (callSite != null) break block20;
                            if (object != false) break block21;
                        }
                        catch (MatchException matchException) {
                            throw ed_0.c("\u00cf", (Object)matchException, (long)3997365189593841154L, (long)l);
                        }
                        if (ed_0.c("\u00c2", (Object)ed_0.c("\u00c2", (Object)ed_0.c("z", (Object)b, (long)3995896526406507110L, (long)l), (Object)ed_0.c("d", (long)3997068492020979355L, (long)l), (long)3994808185977478819L, (long)l), (long)3998589826898136798L, (long)l) != ed_0.c("d", (long)3997197898671993888L, (long)l)) break block21;
                    }
                    catch (MatchException matchException) {
                        throw ed_0.c("\u00cf", (Object)matchException, (long)3997365189593841154L, (long)l);
                    }
                    this.o = 1;
                }
                catch (MatchException matchException) {
                    throw ed_0.c("\u00cf", (Object)matchException, (long)3997365189593841154L, (long)l);
                }
            }
            object = 0;
        }
        u = object;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ed_0.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x529C;
        if (y[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = x[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])z.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    z.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/ed", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ed_0.y[n2] = n3;
        }
        return y[n2];
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/ed" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @Override
    public boolean b(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return false;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/ed" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ed_0.m(l, l2);
            object = A[n];
            try {
                if (!(object instanceof String)) break block2;
                ed_0.A[n] = clazz = Class.forName(B[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = ed_0.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ed_0.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ed_0.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ed_0.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = A;
        A[0] = "i-YbJOb\"H-&Ll Jb\n";
        objectArray[1] = Boolean.TYPE;
        ed_0.B[1] = "java/lang/Boolean";
        objectArray[2] = ",;]`\u00057:;X:\u0016 -p[<\u001a4<7L+Q#\u0003";
        objectArray[3] = "h+|\u000fQXc$m@0Vh/i\u001a";
        objectArray[4] = "gL'\u007f\u001d4qL\"%\u000e#f\u0007!#\u00027w@64I%K";
        objectArray[5] = "]hX;\u001bd(HS4\n+UP@3\u0003b=";
        objectArray[6] = "\\\u001d_\u0010&\u0012J\u001dZJ5\u0005]VYL9\u0011L\u0011N[r\u0007\\";
        objectArray[7] = "\u0018\u001fpzZ\r\u0013\u0010a59\u0000\u0006\u001dn^\f\u0002\u0017\u000err\u001b\u000f";
        objectArray[8] = "\u0010s kk\u000f\u0006s%1x\u0018\u00118&7t\f\u0000\u007f1 ?\u001b%";
        objectArray[9] = "U\u0006g\u001e\n` &l\u0011\u001b/A(g\u001a\u001fu5";
        objectArray[10] = Void.TYPE;
        ed_0.B[10] = "java/lang/Void";
        objectArray[11] = "U\t\u0002\u0005YRC\t\u0007_JETB\u0004YFQE\u0005\u0013N\rD\u0004";
        objectArray[12] = "\r*=c\u001d_x\n6l\f\u0010\u0019\u0004=g\bJm";
        objectArray[13] = "5\u0000\u0016Mky5\u0000\u0001\u0011gv/K\u0001\u000fgc(:P[2(";
        objectArray[14] = "||!TV9||6\bZ6f76\u0016Z#aFgB\u000fh6z9\u001bH#M+mN\u0002";
        objectArray[15] = "1ah\u0006CjDAc\tR%%Oh\u0002V\u007fQ";
        objectArray[16] = "Iv.\u0014}\u001a_v+Nn\rH=(Hb\u0019Yz?_)\bE";
        objectArray[17] = "w#\u0006l\u000bq\u0002\u0003\rc\u001a>c\r\u0006h\u001ed\u0017";
        objectArray[18] = "&B\u001bJB\u0016&B\f\u0016N\u0019<\t\f\bN\f;x]Q\u0016I";
        objectArray[19] = "*;!E\u0000\u000b*;6\u0019\f\u00040p6\u0007\f\u00117\u0001fZ]";
        objectArray[20] = ".H;\u000e\u000b`.H,R\u0007o4\u0003,L\u0007z3rx\u0014P";
        objectArray[21] = "\u0005Oq&}d\u0013Ot|ns\u0004\u0004wzbg\u0015C`m)w\u000e";
        objectArray[22] = "z\u0012\u000fmr\u0018\u000f2\u0004bcWn<\u000fig\r\u001a";
        objectArray[23] = "i 290~i %e<qsk%{<dt\u001aw/m%";
        objectArray[24] = "\u0019AQ[\u0011E\u0019AF\u0007\u001dJ\u0003\nF\u0019\u001d_\u0004{\u0014BE\u001e";
        objectArray[25] = "nOE}OWxO@'\\@o\u0004C!PT~CT6\u001bCN";
        objectArray[26] = "j\fNP\b\u0000\u001f,E_\u0019O~\"NT\u001d\u0015\n";
        objectArray[27] = "\u0000C>oG\u0015\u0016C;5T\u0002\u0001\b83X\u0016\u0010O/$\u0013\u0006\bO-/IK4T-2I\f\u0003C";
        objectArray[28] = "\u0012\u000f\u001bOq\u0003\u0012\u000f\f\u0013}\f\bD\f\r}\u0019\u000f5^S*R";
        objectArray[29] = "Sh@\u000bu\u0015ShWWy\u001aI#WIy\u000fNR\u0005\u0012!E";
        objectArray[30] = "\u000eHJR.?\u0018HO\b=(\u000f\u0003L\u000e1<\u001eD[\u0019z,\u0018";
        objectArray[31] = "Im\u0000_lL<M\u000bP}\u0003]C\u0000[yY)";
        objectArray[32] = "v\u007f\u0013\ryu\u0003_\u0018\u0002h:bQ\u0013\tl`\u0016";
        objectArray[33] = "y\tC4>\u0005y\tTh2\ncBTv2\u001fd3\u0001)k";
        objectArray[34] = "Hkdp&zHks,*uR s2*`UQ$m|";
        objectArray[35] = "\"]T#: W}_,+o6sT'/5B";
        objectArray[36] = "m.,d\"\u0005{.)>1\u0012le*8=\u0006}\"=/v\u00161";
        objectArray[37] = "xH7\u0006y,\rh<\thclf7\u0002l9\u0018";
        objectArray[38] = "aN\u0006rJ\u0018wN\u0003(Y\u000f`\u0005\u0000.U\u001bqB\u00179\u001e\tZ";
        objectArray[39] = "\nM{F\u0006_\u007fmpI\u0017\u0010\u001ec{B\u0013Jj";
        objectArray[40] = Integer.TYPE;
        ed_0.B[40] = "java/lang/Integer";
        objectArray[41] = "s4\u0014\u001c0|\u0006\u0014\u001f\u0013!3g\u001a\u0014\u0018%i\u0013";
        objectArray[42] = "8n\u000bq\\nMN\u0000~M!,@\u000buI{X";
        objectArray[43] = "7\u0002c\u0014!\u00017\u0002tH-\u000e-ItV-\u001b*8&\t|\\";
        objectArray[44] = "vy)n|=`y,4o*w2/2c>fu8%()D";
        objectArray[45] = "T\u007fuuyn!_~zh!@Quql{4";
        objectArray[46] = "$#\u001c\fk12#\u0019Vx&%h\u001aPt24/\rG?%\u000f";
        objectArray[47] = "<m7V`$IM<Yqk(C7Ru1\\";
        objectArray[48] = "dU&\u001e6]\u0011u-\u0011'\u0012p{&\u001a#H\u0004";
        objectArray[49] = "Bj\b\u001f#OBj\u001fC/@X!\u001f]/U_PM\u0006\u007f\u0015";
        objectArray[50] = "\u001am;\b)moM0\u00078\"\u000eC;\f<xz";
        objectArray[51] = "\"hbUN%WHiZ_j6FbQ[0B";
        objectArray[52] = "QPAl\n(QPV0\u0006'K\u001bV.\u00062Lj\u0003qQ";
        objectArray[53] = "D+>:\t_D+)f\u0005P^`)x\u0005EY\u0011{\"Q\u0001";
        objectArray[54] = ",\u000b\u001at\u0002#Y+\u0011{\u0013l8%\u001ap\u00176L";
        objectArray[55] = "\u0019XpeE%\u0007Pj*'9\u0000M";
        objectArray[56] = "]s\u0007*3p]s\u0010v?\u007fG8\u0010h?j@IE7j";
        objectArray[57] = "\\hP\u0019\n\u0006JhUC\u0019\u0011]#VE\u0015\u0005LdAR^\u0015M";
        objectArray[58] = "~N?I}\r\u000bn4FlBj`?Mh\u0018\u001e";
        objectArray[59] = "\u0004L]hO{\u0004LJ4Ct\u001e\u0007J*Ca\u0019v\u0018q\u0012!";
        objectArray[60] = "R#EK:|Y,T\u0004]~L'TOf";
        objectArray[61] = "{\t]e\u0007g\u000e)Vj\u0016(o']a\u0012r\u001b";
        objectArray[62] = "TQ#*9O!q(%(\u0000@\u007f#.,Z4";
        objectArray[63] = "\u001aBo\u001b'`\u0011M~TO`\u001fBm";
        objectArray[64] = Float.TYPE;
        ed_0.B[64] = "java/lang/Float";
        objectArray[65] = "#6Cd&F=>Y+[V=";
        objectArray[66] = "?\u001emd\u000f\u00185\u0011;&q\n[J:i\u000e\u0014)H`y\u0016P[Joy@\u0013`\n8t\u0017h";
        objectArray[67] = "Gw=~$\u0013\u0007}u%I\u001eWw)+\u001eO\t+uG8\u001dF# $x\u0017\u000ex";
        objectArray[68] = "M\"49|d\u0015xp9\u0016a\u0011cmbzSE%6;+\u0004Mmb`*}\u001b#}w\u0016";
        objectArray[69] = "s\u000fr\u0004'Ag\u000f#\u0007F\u0011~\u001fyQ\u0011F H!=*\u000eb\u0010,S*\u0004d\f";
        objectArray[70] = "A*\u001db\u0003d\b#Qh8lq\"\u0012vGy\u0003 Hf_=q\"Gf\t~Jb\u0010k^\u0005";
        objectArray[71] = "^\u0014~7TW\u0003\blt;[eC,:DN\u0017Av*\\\neE}(]^[\u0001sw[2";
        objectArray[72] = "58\u0001G{ +~@\f\u001ep[?OLaf)=\u0015\\y\"[9\u001e^xve}\u0010\u0001~\u001a";
        objectArray[73] = "(\b\u001eR\u0000&-\u001dH\rp,'\u0014EX'x|A\u001b\u0004p-!\u0019XI\u0013\u007f}\u0003N";
        objectArray[74] = "N\u0003Rw\bwPE\u0013<m& \u0004\u001c|\u00121R\u0006Fl\nu \u0004Il\\6\u001bD\u001ea\u000bM";
        objectArray[75] = "d\\^W[OnS\b\u0015%V\u0000\b\tZZCr\nSJB\u0007\u0000\b\r\u0014NSfC^\u0016DA\u0000";
        objectArray[76] = "CI9\u0010\u001c\u000bF\\oOl\u0001LUb\u001a;_\u0013\u00037v\u0003\bMA{\u0015QTWW";
        objectArray[77] = "Po2@M\\Qe8C}]nl`J\u0002K\u001cn:Z\u001a\u000fnj1X\u001b[P.?\u0007\u001d7";
        objectArray[78] = "\u0015t/\\8W\u0001t~_Y\u0007\u0018d$\t\u000ePF4}e?\u0018\u0000j:];\t\u001fj";
        objectArray[79] = "{\u0014\u0013!\u00145e\u0017\u001fzum\u0005\u0017@h\nxw\u0015\u001ax\u0012<\u0005\u0011\u0011z\u0013h;U\u001f%\u0015\u0004";
        objectArray[80] = "\u0019\u001dT#L\u0018A\u0011\t$\u000fgGBk~\u001c\u0015OG\u0007#\u0011\u0006Q,Q*\u0000\bK@\f'\u0013\u0016 \u0015Z{\u0015Y_MV&\u0012\u001a ";
        objectArray[81] = " hPvb\u00014h\u0001u\u0003Z!i_(ohu(\u0001~\u0003\u0006't\u000e48FpyYO";
        objectArray[82] = "U:#ycN\u001ei!sq(\u0003m`\\nR\u0017|\u001c(aZ\u0003kpulI\u001d\u0000";
        objectArray[83] = "%3CkF^l0Bk\u001f`u\u000fA>\b\u001f`}Cd\u0018\u0007$\u000fGo\u001a\u0006p1\u0003aE\u0000\u001c";
        objectArray[84] = "\u001e`Y|A\u001fWi\u0015vz\u0014.hVh\u0005\u0002\\j\fx\u001dF.h\u0003xK\u0005\u0015(Tu\u001c~";
        objectArray[85] = "X\u0013\r8\u001e|X\u0019\u000b$/wY\u001e\u0010=CE\n[Ij/o\u000f]\u0000 MrM\b\u001bZLq\u0005X\u001f6A-J\u001ep";
        objectArray[86] = "\u0001&U3\bp\u0019x\f.upkx\u0002'\ne\u0019zX7\u0012!k*ClLs\u0012&Si\u001a\u0019";
        objectArray[87] = "\u00179\u0014NSH\t=\u0018\"\u0005E\u001cc\u0007K\t|\u0012c\u0017Oo\u001b\u0010f[YT[Gk\f\"";
        objectArray[88] = "(_7\u001d_S7\u00064X0\u0000W_2\u0015O\u0015%]h\u0005WQW\u00195_I\u0006m\u0006l\\\fi";
        objectArray[89] = "Y\u001e.\fyLS\u0011xN\u0007X=Jy\u0001x@OH#\u0011`\u0004=J,\u00116G\u0006\n{\u001ca<";
        objectArray[90] = "_ \u0012\u001e\r>^*\u0018\u001d=<a#@\u0014B)\u0013!\u001a\u0004Zma$D\tFe\n%N\u0003EU";
        objectArray[91] = "Z_\u0011{\":\t\u0018D%\u001f<`\\Gmp>\f\u0001J~nU";
        objectArray[92] = "\u001ckU-\u000bx\u001caS1:s\u001dfH(VAJ&\u0018u\n\u0016IqI~A-\t&D):";
        objectArray[93] = ">RY\u000e\b\u000b=\u001ePES:i\u000eTZ\u0005m8P\u0007\u0005iAlU\u0002B\u0004\u000b8\u0013\u0006";
        objectArray[94] = "h\u0001Z`YDe]\u0015&6Mf\u001e\u000b=Z\u007f0[Ve\n(d\u0005\u000b#KK6Y\u001156\u0011`\u0003Z!\rQ7\u000e\rZ";
        objectArray[95] = "^;b&s\u0012\u0003'pe\u001c\u001denuj|L\n4k`,w";
        objectArray[96] = "I\u0016]n^Z]\u0016\fm?\nD\u0006V;h]\u001b[\rWZ\u0014\u0014\u0000R<B\u0014E\u0005";
        objectArray[97] = "z\u0015\u0016H3Pn\u0015GKR\u000b{\u0014\u0019\u0016>9/UANR\bg\u0011\u001a\u000bj\fv\u000e\u001aqm\u0001u\u000e\u0015O)\u000f*\by";
        objectArray[98] = "\b\u0007Y@E\u000e[TRYFqTRGD[\u001df\u0005\n\u001c\u0002qJT\u0001\u001f@\u001c\u0000\u0000G\u001b<\nZ\u0005\u0000XQ@\u000eC\u0004$G\u001a\u000b\u0004GI\rNM\u0000;UQ\u0001\bRX\u0015[IS?\u0002\u001cG\u001d_[\u000bMUMM?\u0004K_\u0017]\u0001@E\u0000\u00111";
        objectArray[99] = "\u000fw\u000bj<G\u0002+D,SN\u0001hZ7?|S%\u0002aSD\u000btC-0\u0016WnUP";
        objectArray[100] = "Lf\u0007IlPNs\u000eWSF,&\t\\,U^$SL4\u0011, XN5E\u0012dV\u00113)";
        objectArray[101] = "y4g}w\u000b?q?fyi%b!cz\u0005\u00172g<-V@d\"9$\u00039h2<ri\u007f`>eqW;nac\u001d";
        objectArray[102] = "T\u0016\b\f\b^\u000fU\t\r8KW\u0001\u000e[o\u0018\u0006TZ7Z_TWZL\u0001\u001cUV";
        objectArray[103] = "%*+\u0016\u000fw% -\n>|$'6\u0013RNwcjK>z*jl\u001bRwv%*t";
        objectArray[104] = "C\\\n%M\u0001\u0003VB~ \fS\\\u001epw]\r\u0000C\u001cQ\u000fB\b\u0017\u007f\u0011\u0005\nS";
        objectArray[105] = "_\u0010y>\u001c\u0003Z\u0005/al\tP\f\"4;W\b_|X\u0003\u0000Q\u0018;;Q\\K\u000e";
        objectArray[106] = "\t\u0010HSab@\u0019\u0004YZj9\u0018GG%\u007fK\u001a\u001dW=;9\u001e\u0016U<o\u0007Z\u0018\n:\u0003";
        objectArray[107] = "^\u001ad1@>BQg1/*'Xa'P?UZ;7H{'\u001a4l\u0014?JP`*\u0010C";
        objectArray[108] = "VH\u0017\u0006\u001d$T]\u001e\u0018\"16\b\u0019\u0013]!D\nC\u0003Ee6\bL\u0003\u0013&\rH\u001b\u000eD]";
        objectArray[109] = "OHX~>\u0010\u0004\u001bZt,v\u0017\t*p*\n\u0007r^~3G\rI\u001e)>\u0010v";
        objectArray[110] = "@Z7\u0018Bc\\\u00114\u0018-t9\u00182\u000eRbK\u001ah\u001eJ&9ZgE\u0016bT\u00103\u0003\u0012\u001e";
        objectArray[111] = "'\u00132\bE\u0019'\u00194\u0014t\u0019*\u000f+\u0006#Hv[ujMJ+R.[N\u0006\"\u0019u";
        objectArray[112] = "\u001bI\\\"J9\u001bCZ>{9\u0016UE,,lF\u0004\u001d@BlMFK\"\u0004)\u0015]E";
        objectArray[113] = "-&\\a\u0010(m)\u0010!y'\u0011p\u0010 \u001e\")4]2BN-1\u0010:\u0015vi|\u0002fy";
        objectArray[114] = "V\u001e)\u0010|\u0013\u000b\u001e4Feh\u000eE$!o\f\u0012NX\u0004mRT_5N9\u0014P#";
        objectArray[115] = "2\u000eGh/$5\u001cNv\u0011>P\u0004P<uf)\u0006E5k";
        objectArray[116] = "Z\u0001zN,MP\u000e,\fRT>U-C-ALWwS5\u0005>S|Q4Q\u0000\u0017r\u000e2=";
        objectArray[117] = "&y\td]\u0000;;\\\u007f'\f:/Rxp\\b}\n\u0014ZYd2LvG\u001b1)";
        objectArray[118] = "6VU\b?V3C\u0003WO\\9J\u000e\u0002\u0018\u0002`\u001aZn U8^\u0017\rr\t\"H";
        objectArray[119] = "}\"s\\\u001cOx7%\u0003lEr>(V;\u001b#hw:\u0003Ls*1YQ\u0010i<";
        objectArray[120] = "+ro\u0019FG}<p\u000ezP{md\u0010-\u0007 10Fz\u000fhoe@\u0003Y&pr";
        objectArray[121] = "\u0006\u001a$\\\u0006C\f\u0015r\u001exZbNsQ\u0007O\u0010L)A\u001f\u000bb\f&\u001aCO\u000fFr\\G3";
        objectArray[122] = "pk\u0001E&AdkPFG\u0011}{\n\u0010\u0010F#(W|~G~r\u0017\u0003-\u0014uk\u0014";
        objectArray[123] = "$+8a*\u0001cp<j)hs\u007ffh)6t\u007f|lUQ-kzq>V%rslU";
        Object[] objectArray2 = objectArray;
        objectArray[124] = "\u000fO+jv6F@hs\u00042w\u0016/p{'\u0005\u0014u`ccw\u0016z`5 LV-mb[";
    }

    @Override
    public void d(Object[] objectArray) {
        int n;
        block2: {
            long l;
            long l2;
            long l3;
            block3: {
                l3 = (Long)objectArray[0];
                long l4 = l3;
                l2 = l4 ^ 0x2930131F329BL;
                l = l4 ^ 0x4FC9861B63E7L;
                CallSite callSite = ed_0.c("\u00cf", (long)3247517597169466129L, (long)l3);
                try {
                    n = this.o;
                    if (callSite != null) break block2;
                    if (n == 0) break block3;
                }
                catch (MatchException matchException) {
                    throw ed_0.c("\u00cf", (Object)matchException, (long)3249951817145689185L, (long)l3);
                }
                return;
            }
            this.n = 0;
            this.r = 0;
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l2;
            ed_0.c("\u00c2", (Object)this.k, (Object)objectArray2, (long)3250749511447537858L, (long)l3);
            Object[] objectArray3 = new Object[1];
            objectArray3[0] = l;
            ed_0.c("\u00c2", (Object)this.a, (Object)objectArray3, (long)3248516160482911322L, (long)l3);
            Object[] objectArray4 = new Object[1];
            objectArray4[0] = l2;
            ed_0.c("\u00c2", (Object)this.l, (Object)objectArray4, (long)3250749511447537858L, (long)l3);
            this.s = -1;
            this.t = -1;
            this.p = 0;
            n = 1;
        }
        u = n;
        this.q = 0;
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'z' || c == '\u00fa' || c == 'd' || c == '\u00fe') {
                field = ed_0.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'z' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00fa' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'd' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ed_0.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00c2' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00cf' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = ed_0.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    @Override
    public Set a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return ed_0.c("\u00cf", (Object)((Object)q_0.Crystal), (Object)((Object)q_0.Mace), (long)-2444293980291882000L, (long)l);
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @bP
    public void a(a_ a_2) {
        long l;
        long l2;
        block66: {
            Object object;
            CallSite callSite;
            long l3;
            long l4;
            block64: {
                block65: {
                    long l5;
                    block62: {
                        long l6;
                        block63: {
                            block60: {
                                block61: {
                                    block57: {
                                        long l7;
                                        block58: {
                                            Object object2;
                                            block59: {
                                                block55: {
                                                    block56: {
                                                        block53: {
                                                            long l8;
                                                            block54: {
                                                                class_310 class_3102;
                                                                block51: {
                                                                    block52: {
                                                                        block49: {
                                                                            block50: {
                                                                                block48: {
                                                                                    Object object3;
                                                                                    CallSite callSite2;
                                                                                    block46: {
                                                                                        block47: {
                                                                                            block44: {
                                                                                                block45: {
                                                                                                    long l9 = l2 = w ^ 0x738478509654L;
                                                                                                    l4 = l9 ^ 0x1BA1358283ABL;
                                                                                                    l7 = l9 ^ 0x1F2A52CAFE5BL;
                                                                                                    l5 = l9 ^ 0x5CB0C476BB14L;
                                                                                                    l3 = l9 ^ 0x26C427C9325AL;
                                                                                                    l8 = l9 ^ 0x23F91EB0F167L;
                                                                                                    l = l9 ^ 0x7D58A086D2D7L;
                                                                                                    l6 = l9 ^ 0x7529B5915E68L;
                                                                                                    callSite = ed_0.c("\u00cf", (long)-7196274340915049951L, (long)l2);
                                                                                                    try {
                                                                                                        callSite2 = ed_0.c("\u00c2", (Object)((Boolean)((Object)ed_0.c("\u00c2", (Object)this.i, (long)-7196572430835386707L, (long)l2))), (long)-7195751541435164422L, (long)l2);
                                                                                                        if (callSite != null) break block44;
                                                                                                        if (callSite2 != false) break block45;
                                                                                                        return;
                                                                                                    }
                                                                                                    catch (MatchException matchException) {
                                                                                                        throw ed_0.c("\u00cf", (Object)matchException, (long)-7193911735289965231L, (long)l2);
                                                                                                    }
                                                                                                }
                                                                                                callSite2 = ed_0.c("\u00c2", (Object)a_2, (Object)new Object[0], (long)-7192819396193125244L, (long)l2);
                                                                                            }
                                                                                            try {
                                                                                                object3 = 1;
                                                                                                if (callSite != null) break block46;
                                                                                                if (callSite2 == object3) break block47;
                                                                                                return;
                                                                                            }
                                                                                            catch (MatchException matchException) {
                                                                                                throw ed_0.c("\u00cf", (Object)matchException, (long)-7193911735289965231L, (long)l2);
                                                                                            }
                                                                                        }
                                                                                        callSite2 = ed_0.c("\u00c2", (Object)a_2, (Object)new Object[0], (long)-7193229356001658044L, (long)l2);
                                                                                        object3 = ed_0.b("i", (int)8694, (long)(0x5E981553F04F6F5EL ^ l2));
                                                                                    }
                                                                                    if (callSite2 != object3) {
                                                                                        return;
                                                                                    }
                                                                                    try {
                                                                                        try {
                                                                                            class_3102 = b;
                                                                                            if (callSite != null) break block48;
                                                                                            if (ed_0.c("z", (Object)class_3102, (long)-7194729470422748875L, (long)l2) == null) return;
                                                                                        }
                                                                                        catch (MatchException matchException) {
                                                                                            throw ed_0.c("\u00cf", (Object)matchException, (long)-7193911735289965231L, (long)l2);
                                                                                        }
                                                                                        class_3102 = b;
                                                                                    }
                                                                                    catch (MatchException matchException) {
                                                                                        throw ed_0.c("\u00cf", (Object)matchException, (long)-7193911735289965231L, (long)l2);
                                                                                    }
                                                                                }
                                                                                try {
                                                                                    try {
                                                                                        if (callSite != null) break block49;
                                                                                        if (ed_0.c("z", (Object)class_3102, (long)-7192731453136472134L, (long)l2) != null) break block50;
                                                                                        return;
                                                                                    }
                                                                                    catch (MatchException matchException) {
                                                                                        throw ed_0.c("\u00cf", (Object)matchException, (long)-7193911735289965231L, (long)l2);
                                                                                    }
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw ed_0.c("\u00cf", (Object)matchException, (long)-7193911735289965231L, (long)l2);
                                                                                }
                                                                            }
                                                                            class_3102 = b;
                                                                        }
                                                                        try {
                                                                            try {
                                                                                if (callSite != null) break block51;
                                                                                if (ed_0.c("z", (Object)class_3102, (long)-7195088355902344360L, (long)l2) == null) break block52;
                                                                                return;
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw ed_0.c("\u00cf", (Object)matchException, (long)-7193911735289965231L, (long)l2);
                                                                            }
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw ed_0.c("\u00cf", (Object)matchException, (long)-7193911735289965231L, (long)l2);
                                                                        }
                                                                    }
                                                                    class_3102 = b;
                                                                }
                                                                try {
                                                                    object = ed_0.c("\u00c2", (Object)class_3102, (long)-7196126449457921442L, (long)l2);
                                                                    if (callSite != null) break block53;
                                                                    if (object != false) break block54;
                                                                    return;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw ed_0.c("\u00cf", (Object)matchException, (long)-7193911735289965231L, (long)l2);
                                                                }
                                                            }
                                                            Object[] objectArray = new Object[1];
                                                            objectArray[0] = l8;
                                                            object = ed_0.c("\u00cf", (Object)objectArray, (long)-7194145671633855520L, (long)l2);
                                                        }
                                                        try {
                                                            if (callSite != null) break block55;
                                                            if (object != false) break block56;
                                                            return;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw ed_0.c("\u00cf", (Object)matchException, (long)-7193911735289965231L, (long)l2);
                                                        }
                                                    }
                                                    object = u;
                                                }
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    if (callSite != null) break block57;
                                                                    if (object == false) break block58;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw ed_0.c("\u00cf", (Object)matchException, (long)-7193911735289965231L, (long)l2);
                                                                }
                                                                Object object2 = this.r;
                                                                object2 = 4;
                                                                if (callSite != null) break block59;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw ed_0.c("\u00cf", (Object)matchException, (long)-7193911735289965231L, (long)l2);
                                                            }
                                                            if (object < object2) return;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw ed_0.c("\u00cf", (Object)matchException, (long)-7193911735289965231L, (long)l2);
                                                        }
                                                        object = this.r;
                                                        if (callSite != null) break block57;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw ed_0.c("\u00cf", (Object)matchException, (long)-7193911735289965231L, (long)l2);
                                                    }
                                                    object2 = ed_0.b("i", (int)19810, (long)(0x221A3D903E83CCL ^ l2));
                                                }
                                                catch (MatchException matchException) {
                                                    throw ed_0.c("\u00cf", (Object)matchException, (long)-7193911735289965231L, (long)l2);
                                                }
                                            }
                                            if (object > object2) {
                                                return;
                                            }
                                        }
                                        Object[] objectArray = new Object[2];
                                        objectArray[1] = l7;
                                        objectArray[0] = this.j;
                                        object = ed_0.c("\u00c2", (Object)this.m, (Object)objectArray, (long)-7195828041252678368L, (long)l2);
                                    }
                                    try {
                                        if (callSite != null) break block60;
                                        if (object != false) break block61;
                                        return;
                                    }
                                    catch (MatchException matchException) {
                                        throw ed_0.c("\u00cf", (Object)matchException, (long)-7193911735289965231L, (long)l2);
                                    }
                                }
                                object = ed_0.c("\u00c2", (Object)ed_0.c("d", (long)-7193767325729686196L, (long)l2), (Object)new Object[0], (long)-7192990582172716100L, (long)l2);
                            }
                            try {
                                if (callSite != null) break block62;
                                if (object == false) break block63;
                                return;
                            }
                            catch (MatchException matchException) {
                                throw ed_0.c("\u00cf", (Object)matchException, (long)-7193911735289965231L, (long)l2);
                            }
                        }
                        Object[] objectArray = new Object[2];
                        objectArray[1] = l6;
                        objectArray[0] = ed_0.c("d", (long)-7195204717136338613L, (long)l2);
                        object = ed_0.c("\u00cf", (Object)objectArray, (long)-7196742501324468355L, (long)l2);
                    }
                    try {
                        try {
                            if (callSite != null) break block64;
                            if (object == false) break block65;
                        }
                        catch (MatchException matchException) {
                            throw ed_0.c("\u00cf", (Object)matchException, (long)-7193911735289965231L, (long)l2);
                        }
                        Object[] objectArray = new Object[2];
                        objectArray[1] = l5;
                        objectArray[0] = ed_0.c("d", (long)-7192259898915015194L, (long)l2);
                        ed_0.c("\u00cf", (Object)objectArray, (long)-7195398265760684063L, (long)l2);
                        ed_0.c("\u00c2", (Object)ed_0.c("d", (long)-7193767325729686196L, (long)l2), (Object)new Object[]{true}, (long)-7192442550327496172L, (long)l2);
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l4;
                        ed_0.c("\u00c2", (Object)this.m, (Object)objectArray2, (long)-7193152522703906318L, (long)l2);
                        Object[] objectArray3 = new Object[1];
                        objectArray3[0] = l;
                        ed_0.c("\u00c2", (Object)this.j, (Object)objectArray3, (long)-7195275913847728790L, (long)l2);
                        return;
                    }
                    catch (MatchException matchException) {
                        throw ed_0.c("\u00cf", (Object)matchException, (long)-7193911735289965231L, (long)l2);
                    }
                }
                object = 1;
            }
            boolean[] blArray = new boolean[object];
            blArray[0] = 0;
            boolean[] blArray2 = blArray;
            try {
                try {
                    Object[] objectArray = new Object[4];
                    objectArray[3] = l3;
                    objectArray[2] = true;
                    objectArray[1] = () -> ed_0.lambda$onKey$2(blArray2);
                    objectArray[0] = ed_0.c("d", (long)-7195204717136338613L, (long)l2);
                    ed_0.c("\u00cf", (Object)objectArray, (long)-7194814174647203783L, (long)l2);
                    if (callSite != null) break block66;
                    if (!blArray2[0]) return;
                }
                catch (MatchException matchException) {
                    throw ed_0.c("\u00cf", (Object)matchException, (long)-7193911735289965231L, (long)l2);
                }
                Object[] objectArray = new Object[1];
                objectArray[0] = l4;
                ed_0.c("\u00c2", (Object)this.m, (Object)objectArray, (long)-7193152522703906318L, (long)l2);
            }
            catch (MatchException matchException) {
                throw ed_0.c("\u00cf", (Object)matchException, (long)-7193911735289965231L, (long)l2);
            }
        }
        Object[] objectArray = new Object[1];
        objectArray[0] = l;
        ed_0.c("\u00c2", (Object)this.j, (Object)objectArray, (long)-7195275913847728790L, (long)l2);
    }

    /*
     * Exception decompiling
     */
    @bP
    public void a(bG var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [43[TRYBLOCK]], but top level block is 116[SWITCH]
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

    @bP
    public void a(bh_0 bh_02) {
        block11: {
            CallSite callSite;
            long l;
            block10: {
                l = w ^ 0x6F2895D72A3FL;
                CallSite callSite2 = ed_0.c("\u00cf", (long)2326863685752436298L, (long)l);
                try {
                    if (!this.n) {
                        return;
                    }
                }
                catch (MatchException matchException) {
                    throw ed_0.c("\u00cf", (Object)matchException, (long)2324151839089535290L, (long)l);
                }
                CallSite callSite3 = ed_0.c("\u00c2", (Object)bh_02, (Object)new Object[0], (long)2326366666117443689L, (long)l);
                try {
                    try {
                        callSite = callSite3;
                        if (callSite2 != null) break block10;
                        if (!(callSite instanceof class_2848)) break block11;
                    }
                    catch (MatchException matchException) {
                        throw ed_0.c("\u00cf", (Object)matchException, (long)2324151839089535290L, (long)l);
                    }
                    callSite = callSite3;
                }
                catch (MatchException matchException) {
                    throw ed_0.c("\u00cf", (Object)matchException, (long)2324151839089535290L, (long)l);
                }
            }
            class_2848 class_28482 = (class_2848)callSite;
            try {
                if (ed_0.c("\u00c2", (Object)class_28482, (long)2327313560439179549L, (long)l) == ed_0.c("d", (long)2324772360889529270L, (long)l)) {
                    ed_0.c("\u00c2", (Object)bh_02, (Object)new Object[0], (long)2327377877012496152L, (long)l);
                }
            }
            catch (MatchException matchException) {
                throw ed_0.c("\u00cf", (Object)matchException, (long)2324151839089535290L, (long)l);
            }
        }
    }

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (B[n3] != null) {
            return n3;
        }
        Object object = A[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 1;
            case 1 -> 32;
            case 2 -> 6;
            case 3 -> 3;
            case 4 -> 53;
            case 5 -> 52;
            case 6 -> 4;
            case 7 -> 25;
            case 8 -> 56;
            case 9 -> 60;
            case 10 -> 61;
            case 11 -> 50;
            case 12 -> 22;
            case 13 -> 31;
            case 14 -> 36;
            case 15 -> 15;
            case 16 -> 59;
            case 17 -> 23;
            case 18 -> 46;
            case 19 -> 44;
            case 20 -> 63;
            case 21 -> 20;
            case 22 -> 33;
            case 23 -> 43;
            case 24 -> 12;
            case 25 -> 40;
            case 26 -> 45;
            case 27 -> 42;
            case 28 -> 29;
            case 29 -> 49;
            case 30 -> 9;
            case 31 -> 37;
            case 32 -> 18;
            case 33 -> 57;
            case 34 -> 8;
            case 35 -> 19;
            case 36 -> 27;
            case 37 -> 10;
            case 38 -> 55;
            case 39 -> 58;
            case 40 -> 7;
            case 41 -> 13;
            case 42 -> 48;
            case 43 -> 47;
            case 44 -> 21;
            case 45 -> 28;
            case 46 -> 35;
            case 47 -> 30;
            case 48 -> 34;
            case 49 -> 51;
            case 50 -> 39;
            case 51 -> 14;
            case 52 -> 11;
            case 53 -> 41;
            case 54 -> 16;
            case 55 -> 26;
            case 56 -> 54;
            case 57 -> 17;
            case 58 -> 2;
            case 59 -> 62;
            case 60 -> 5;
            case 61 -> 0;
            case 62 -> 38;
            default -> 24;
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
        ed_0.B[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = ed_0.m(l, l2);
        Object object = A[n];
        if (object instanceof String) {
            String string = B[n];
            int n2 = string.indexOf(8);
            Class clazz = ed_0.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ed_0.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ed_0.g(clazz3, string2, clazz2)) != null) {
                    ed_0.A[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ed_0.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ed_0.A[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ed_0.n(248214884784874L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = ed_0.m(l, l2);
        Object object = A[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = B[n];
                int n3 = string2.indexOf(8);
                clazz3 = ed_0.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ed_0.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ed_0.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        ed_0.A[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ed_0.n(248214884784874L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ed_0.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ed_0.A[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ed_0.n(248214884784874L, 0L);
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

    private boolean lambda$new$0(Float f) {
        long l = w ^ 0x600B6DB4B7C3L;
        return (boolean)ed_0.c("\u00c2", (Object)((Boolean)((Object)ed_0.c("\u00c2", (Object)this.e, (long)-4776155298005264582L, (long)l))), (long)-4777020036673062547L, (long)l);
    }

    private boolean lambda$new$1(Float f) {
        long l = w ^ 0x1E6EE27360F1L;
        return (boolean)ed_0.c("\u00c2", (Object)((Boolean)((Object)ed_0.c("\u00c2", (Object)this.i, (long)7675768095818645512L, (long)l))), (long)7676073250180984415L, (long)l);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ed_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(ed_0.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


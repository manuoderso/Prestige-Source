/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.slf4j.Logger
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.dp_0;
import dev.zprestige.prestige.hc;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.ref.Cleaner;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.slf4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class bS
implements AutoCloseable {
    private static final Logger a;
    private final int b;
    private final AtomicLong c;
    private final Cleaner.Cleanable d;
    private int e;
    private static final long f;
    private static final long[] g;
    private static final Integer[] h;
    private static final Map i;
    private static final long[] j;
    private static final Long[] k;
    private static final Map l;
    private static final Object[] m;
    private static final String[] n;

    public bS(int n, AtomicLong atomicLong, long l) {
        l = f ^ l;
        this.e = (int)bS.a("r", (int)28187, (long)(0x73A401B2D039F070L ^ l));
        this.b = n;
        this.c = atomicLong;
        this.d = bS.c("\u00c2", (Object)dp_0.a, (Object)this, () -> bS.lambda$new$1(n), (long)-629714550469062914L, (long)l);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                block12: {
                    block11: {
                        bS.f = hc.a(6635047287570607382L, -7842991618471027945L, MethodHandles.lookup().lookupClass()).a(114190118214782L);
                        var22 = bS.f ^ 90436933280188L;
                        bS.m = new Object[47];
                        bS.n = new String[47];
                        bS.b();
                        bS.i = new HashMap<K, V>(13);
                        var11_1 = Cipher.getInstance("DES/CBC/NoPadding");
                        v0 = SecretKeyFactory.getInstance("DES");
                        v1 = new byte[8];
                        v2 = v1;
                        v1[0] = (byte)(var22 >>> 56);
                        for (var12_2 = 1; var12_2 < 8; ++var12_2) {
                            v2 = v2;
                            v2[var12_2] = (byte)(var22 << var12_2 * 8 >>> 56);
                        }
                        var11_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                        var17_3 = new long[9];
                        var14_4 = 0;
                        var15_5 = "Z7\u0013}\u00da\u00a4\u00b6S\u00de\u0001\u00f2\u0081\u00ebz\u00995\u00d3{\u00a82\u00d7%\u0086\u00e4\u0099\u001a\u007fU\u0003\u00abI\u00fa\u0087M^\u008e\u0019\u00ed\u008a\u0012\u0001\u00c5\u00bdXr\u0090\u0018%2_7\u00e3B\u00f5\u009ah";
                        var16_6 = "Z7\u0013}\u00da\u00a4\u00b6S\u00de\u0001\u00f2\u0081\u00ebz\u00995\u00d3{\u00a82\u00d7%\u0086\u00e4\u0099\u001a\u007fU\u0003\u00abI\u00fa\u0087M^\u008e\u0019\u00ed\u008a\u0012\u0001\u00c5\u00bdXr\u0090\u0018%2_7\u00e3B\u00f5\u009ah".length();
                        var13_7 = 0;
                        while (true) {
                            var18_8 = var15_5.substring(var13_7, var13_7 += 8).getBytes("ISO-8859-1");
                            v3 = var17_3;
                            v4 = var14_4++;
                            v5 = ((long)var18_8[0] & 255L) << 56 | ((long)var18_8[1] & 255L) << 48 | ((long)var18_8[2] & 255L) << 40 | ((long)var18_8[3] & 255L) << 32 | ((long)var18_8[4] & 255L) << 24 | ((long)var18_8[5] & 255L) << 16 | ((long)var18_8[6] & 255L) << 8 | (long)var18_8[7] & 255L;
                            v6 = -1;
                            break block11;
                            break;
                        }
lbl41:
                        // 1 sources

                        while (true) {
                            v3[v4] = v7;
                            if (var13_7 < var16_6) ** continue;
                            var15_5 = "\u00de6\u00f8\u00ea\u0007\u009fY\u008e\u00dc'*\u009d\t\u00be\u008cg";
                            var16_6 = "\u00de6\u00f8\u00ea\u0007\u009fY\u008e\u00dc'*\u009d\t\u00be\u008cg".length();
                            var13_7 = 0;
                            while (true) {
                                var18_8 = var15_5.substring(var13_7, var13_7 += 8).getBytes("ISO-8859-1");
                                v3 = var17_3;
                                v4 = var14_4++;
                                v5 = ((long)var18_8[0] & 255L) << 56 | ((long)var18_8[1] & 255L) << 48 | ((long)var18_8[2] & 255L) << 40 | ((long)var18_8[3] & 255L) << 32 | ((long)var18_8[4] & 255L) << 24 | ((long)var18_8[5] & 255L) << 16 | ((long)var18_8[6] & 255L) << 8 | (long)var18_8[7] & 255L;
                                v6 = 0;
                                break block11;
                                break;
                            }
                            break;
                        }
lbl60:
                        // 1 sources

                        while (true) {
                            v3[v4] = v7;
                            if (var13_7 < var16_6) ** continue;
                            break block12;
                            break;
                        }
                    }
                    var19_9 = v5;
                    var21_10 = var11_1.doFinal(new byte[]{(byte)(var19_9 >>> 56), (byte)(var19_9 >>> 48), (byte)(var19_9 >>> 40), (byte)(var19_9 >>> 32), (byte)(var19_9 >>> 24), (byte)(var19_9 >>> 16), (byte)(var19_9 >>> 8), (byte)var19_9});
                    v7 = ((long)var21_10[0] & 255L) << 56 | ((long)var21_10[1] & 255L) << 48 | ((long)var21_10[2] & 255L) << 40 | ((long)var21_10[3] & 255L) << 32 | ((long)var21_10[4] & 255L) << 24 | ((long)var21_10[5] & 255L) << 16 | ((long)var21_10[6] & 255L) << 8 | (long)var21_10[7] & 255L;
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
                bS.g = var17_3;
                bS.h = new Integer[9];
                bS.l = new HashMap<K, V>(13);
                var0_11 = Cipher.getInstance("DES/CBC/NoPadding");
                v8 = SecretKeyFactory.getInstance("DES");
                v9 = new byte[8];
                v10 = v9;
                v9[0] = (byte)(var22 >>> 56);
                for (var1_12 = 1; var1_12 < 8; ++var1_12) {
                    v10 = v10;
                    v10[var1_12] = (byte)(var22 << var1_12 * 8 >>> 56);
                }
                var0_11.init(2, (Key)v8.generateSecret(new DESKeySpec(v10)), new IvParameterSpec(new byte[8]));
                var6_13 = new long[2];
                var3_14 = 0;
                var4_15 = "\u00c2e\u007f\u00d5\u001f\u009a<\u0004\u00f3\u00f2\u00a7\u00cdL\u0097[1";
                var5_16 = "\u00c2e\u007f\u00d5\u001f\u009a<\u0004\u00f3\u00f2\u00a7\u00cdL\u0097[1".length();
                var2_17 = 0;
                while (true) {
                    break block13;
                    break;
                }
lbl104:
                // 1 sources

                while (true) {
                    var6_13[v11] = ((long)var10_20[0] & 255L) << 56 | ((long)var10_20[1] & 255L) << 48 | ((long)var10_20[2] & 255L) << 40 | ((long)var10_20[3] & 255L) << 32 | ((long)var10_20[4] & 255L) << 24 | ((long)var10_20[5] & 255L) << 16 | ((long)var10_20[6] & 255L) << 8 | (long)var10_20[7] & 255L;
                    if (var2_17 < var5_16) ** continue;
                    break block14;
                    break;
                }
            }
            var7_18 = var4_15.substring(var2_17, var2_17 += 8).getBytes("ISO-8859-1");
            v11 = var3_14++;
            var8_19 = ((long)var7_18[0] & 255L) << 56 | ((long)var7_18[1] & 255L) << 48 | ((long)var7_18[2] & 255L) << 40 | ((long)var7_18[3] & 255L) << 32 | ((long)var7_18[4] & 255L) << 24 | ((long)var7_18[5] & 255L) << 16 | ((long)var7_18[6] & 255L) << 8 | (long)var7_18[7] & 255L;
            var10_20 = var0_11.doFinal(new byte[]{(byte)(var8_19 >>> 56), (byte)(var8_19 >>> 48), (byte)(var8_19 >>> 40), (byte)(var8_19 >>> 32), (byte)(var8_19 >>> 24), (byte)(var8_19 >>> 16), (byte)(var8_19 >>> 8), (byte)var8_19});
            ** while (true)
        }
        bS.j = var6_13;
        bS.k = new Long[2];
        bS.a = bS.c("\u00b5", bS.class, (long)7197508546064940155L, (long)var22);
    }

    public void e(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (Long)objectArray[1];
        long l3 = (Long)objectArray[2];
        l3 = f ^ l3;
        CallSite callSite = bS.c("\u00b5", (int)bS.a("r", (int)11274, (long)(0x2FE26E14AB8AA7E0L ^ l3)), (long)7118140465220865163L, (long)l3);
        bS.c("\u00b5", (int)bS.a("r", (int)12094, (long)(0x1B93A07F7DDAA4D2L ^ l3)), (int)this.b, (long)7117362166534558324L, (long)l3);
        bS.c("\u00b5", (int)bS.a("r", (int)12094, (long)(0x1B93A07F7DDAA4D2L ^ l3)), (long)l, (long)l2, (long)7117229790720596107L, (long)l3);
        bS.c("\u00b5", (int)bS.a("r", (int)12094, (long)(0x1B93A07F7DDAA4D2L ^ l3)), (int)callSite, (long)7117362166534558324L, (long)l3);
    }

    private static long b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = bS.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Long.TYPE, l2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return l2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/bS" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = bS.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = bS.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static long b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7864;
        if (k[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = j[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])bS.l.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    bS.l.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/bS", exception);
            }
            long l4 = ((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL;
            bS.k[n2] = l4;
        }
        return k[n2];
    }

    public int b(Object[] objectArray) {
        return this.e;
    }

    public void b(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        ByteBuffer byteBuffer = (ByteBuffer)objectArray[1];
        long l = (Long)objectArray[2];
        l = f ^ l;
        CallSite callSite = bS.c("\u00b5", (int)bS.a("r", (int)11274, (long)(0x2FE268C787E00F55L ^ l)), (long)-3855730160146291650L, (long)l);
        bS.c("\u00b5", (int)bS.a("r", (int)12094, (long)(0x1B93A6AC51B00C67L ^ l)), (int)this.b, (long)-3859314411693770047L, (long)l);
        bS.c("\u00b5", (int)bS.a("r", (int)12094, (long)(0x1B93A6AC51B00C67L ^ l)), (Object)byteBuffer, (int)n, (long)-3858950188023765855L, (long)l);
        bS.c("\u00b5", (int)bS.a("r", (int)12094, (long)(0x1B93A6AC51B00C67L ^ l)), (int)callSite, (long)-3859314411693770047L, (long)l);
        this.e = n;
        bS.c("\u00c2", (Object)this.c, (long)((long)bS.c("\u00c2", (Object)byteBuffer, (long)-3859444136901378501L, (long)l)), (long)-3858675169790747338L, (long)l);
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = bS.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = bS.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = bS.a(l, l2);
            object = m[n];
            try {
                if (!(object instanceof String)) break block2;
                bS.m[n] = clazz = Class.forName(bS.n[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static void b() {
        Object[] objectArray = m;
        m[0] = "V\rvA= S\u0018}A>'\\\u0011v\u0003\u007f\u0010uN ";
        objectArray[1] = Integer.TYPE;
        bS.n[1] = "java/lang/Integer";
        objectArray[2] = "\u000bd@=% \u000eqK=&'\u0001x@\u007fg\u0010('\u0012";
        objectArray[3] = ")I4]aQ*Gl~6K&j7Z)Z1";
        objectArray[4] = Void.TYPE;
        bS.n[4] = "java/lang/Void";
        objectArray[5] = ".N(u\u0017j0F2:Zp*L+fKz*[puMp)F=:xk+B7wup*H";
        objectArray[6] = Long.TYPE;
        bS.n[6] = "java/lang/Long";
        objectArray[7] = "\u0002\u0004\u0005b\u00011\u0007\u0011\u000eb\u00026\b\u0018\u0005 C\u0001!ER";
        objectArray[8] = "] j\fe[V/{C9RQo_\u0001.VY$n";
        objectArray[9] = "\u00026dCA\u0017\t9u\f \u0019\u00022qV";
        objectArray[10] = "\u0010\u0001A*9r\u001b\u000ePeEk\u0014\u000eV){{";
        objectArray[11] = "i}zZ\b\u0001brk\u0015T\be2OWC\fmy~\u001fe\u0001f}bZD\u0001f";
        objectArray[12] = "CR\u001eT[HFG\u0015TXOIN\u001e\u0016\u0019x`\u0013H";
        objectArray[13] = "Vpf\b{N_6k\bDM^edTNCZvnTq";
        objectArray[14] = "m\u0017Snpdf\u0018B!\u001ddf\u0005V";
        objectArray[15] = "v\u000f`6L\t\u007fIm6s\n~\u001abj";
        objectArray[16] = "\bWR\u001fV]\u001eWWEEJ\t\u001cTCI^\u0018[CT\u0002I\u001c";
        objectArray[17] = "%W'\n\bpPw,\u0005\u0019?1y'\u000e\u001deE";
        objectArray[18] = "\u001c:\rkAR\n:\b1RE\u001dq\u000b7^Q\f6\u001c \u0015@+";
        objectArray[19] = "<=]-apI\u001dV\"p?(\u0013])te\\";
        objectArray[20] = " 9ggQ\b69b=B\u001f!ra;N\u000b05v,\u0005\u0019\f";
        objectArray[21] = "\u000e<\u001af\u001d\u0004{\u001c\u0011i\fK\u0006\u0004\u0002n\u0005\u0002n";
        objectArray[22] = ":\u0002O\u0005I@1\r^J*M$\u0000Q!\u001fO5\u0013M\r\bB";
        objectArray[23] = "n&L.yF\u001b\u0006G!h\tz\bL*lS\u000e";
        objectArray[24] = Boolean.TYPE;
        bS.n[24] = "java/lang/Boolean";
        objectArray[25] = "\u0012jM|e\u0014MyA'\u0015\tO\\Y#{\u000bQZM1|f\u0012,\u0018sz\u001cZvI.\u0015Z@\u007fB+(]H.\u001aM,\\\u0017(K7d\u0006Fu$wi\u0003\u001bzG()\b\u001a\u0016";
        objectArray[26] = "j|\u0005hc\bx}Y3S\u0016\u0000u\u000f\"5\t=g\u001a30x:f\u0003`?\u001be&\baS";
        objectArray[27] = "'f wqU0zh+\u000fFLn8;i\\q|-*l-v}4ycN)=?x\u000f";
        objectArray[28] = "'\u0007x_Z\u00076\u001bw\u00003\u0010J\u0007aMM\u0001t\t{ACz";
        objectArray[29] = ";6S l\u0003,*\u001b|\u0012\u0012P?O|.\u001a :]pj{><@\"s\u000b;.Lf\u0012";
        objectArray[30] = "\r:\u0012^\u000bdQp\u0002\\5{Qv&GZ{QpbI\bp\\s\\O\u0005\u007f]\n\b\u001a\by@e\u001fN\nu<";
        objectArray[31] = "5qK+OT\"h\u0019\u0011XK\u0017g]PQS5eLk7\u0016b6\u001f~M^8gB\u0011\u000e\u0015d4NkFO5i!";
        objectArray[32] = "\rH>qP\\R[2* AP~*.NCNx><I.\r\u000ek~OTET:# \u0014V^=pLHO\r'@\u0019\u0014\b\n8:QNYWWz\\K\u0004X4%\u001c@\u00054";
        objectArray[33] = "`m\u0018N%i?~\u0014\u0015Ut=L\u0017\u001a<c\u0013l\u001f\u00118aY(KCkt#`\u0011\u00126\u001b9 \u0013B5#4-\u0013\u0019U";
        objectArray[34] = "=\u001f\u0001NHDjMM\u0019&UiO\u0014B&\u0004qGMHE[1LL$";
        objectArray[35] = "(uP+R\u001fw:\f*3\u000exdU:O\u0019o\u000b\n-Y\u000fw4T \u0003\n\u00154]{X\u0017w5\u000e,Tt%6H+]\u000erd\u0004|3";
        objectArray[36] = "2^K+J\u0011bBUp,\u001edB/sG\u0018oX\u0012tOI7>";
        objectArray[37] = "\u0005j[=D UvEf\";Sv?eI)Xl\u0002bAx\u0000\n\u0005%GpRiZeLq>";
        objectArray[38] = "R zZ`\u0004E<2\u0006\u001e\u00169(b\u0016x\r\u0004:w\u0007}|\u0003;nTr\u001f\\{eU\u001e";
        objectArray[39] = "\u0005Cjj~+ZPf1\u000e6Xsn?c%Qu~5`4FD\u0003b4e\u0002Py*n4_?9'kiP\\fg`h<";
        objectArray[40] = "rB\u000b\u007f\bXpH\u001dnnQ+f\u000b|\u0015^\nA\u0017y\u0003R\u0005U\u0001o\u0003D\u0015A\tn\u0003>v\u0012S?\u0001D>H\u0002bn\u0002$A\tgS\u0005,\u0010Q\u0001RU&N\t<U]w\u0016o;\u0012[\u007fD\fdRP~(";
        objectArray[41] = "#I\u0011CV9!C\u0007R00zf\u001cEz\"pM\u0018Gj6xL\u0018=\te\"\u001d\u001aGA?s@u\u0001[6xEH\u0006Sg #IVY9x\u001eN^\ba\u001e\u001aO\u0001\u000e0dR\u0015PS_$A\u001fW\u00003xXLM0";
        objectArray[42] = "Q;\u0016, H\u000e(\u001awPU\f\r\u001e{<p\u0015)\u0011p*:Q}C#?@\u0019'\u0012~P\u0003R{Ar*K\b*\u001c\u001djF\rw\u0013~5\u0006\u0006v\u007f";
        objectArray[43] = "\u001a\u0000\u0013~\u0002wF\u0019@d2aM\u0007\u0010uTzF\ry-\b'\u001e\r\u0003eRvCb";
        objectArray[44] = "tVP6aL|\\\u001e<\u0000] oH4qx9JA!zi9Nc%|[D\u001d\u0015p>]>UO!c2}\u001e\u0013roH5DB/\u0000\u000e/MI*=\t'\u001c\u0011L<Y-BIq;Q|\u001a/pk[\"B\u0012wc\nz$\u00150e\u0002(GJpn\u0003D";
        objectArray[45] = ",H\u0003o\u0004gs[\u000f4tzq{\u00078>h{Z\u0007$\u000f\u0015,\u000eV`\u001bodT\u0007=t";
        Object[] objectArray2 = objectArray;
        objectArray[46] = "@\u00183IDS\u001f\u000b?\u00124N\u001d.'\u0016ZL\u0003?'\u0012xH\u0005\rZA\u000e\u001dG\u000b \tTL\u001adf\u0013]G\u001fYa\u001b\f\u001fy^8\u0012^\u0011\u0015\u0002!AD!C\u0018?HXB\u001cX4I4";
    }

    private static Field c(long l, long l2) {
        int n = bS.a(l, l2);
        Object object = m[n];
        if (object instanceof String) {
            String string = bS.n[n];
            int n2 = string.indexOf(8);
            Class clazz = bS.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = bS.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = bS.a(clazz3, string2, clazz2)) != null) {
                    bS.m[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = bS.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        bS.m[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = bS.b(646958285949343L, 0L);
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
            throw new RuntimeException("dev/zprestige/prestige/bS" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public void c(Object[] objectArray) {
        long l = (Long)objectArray[0];
        ByteBuffer byteBuffer = (ByteBuffer)objectArray[1];
        long l2 = (Long)objectArray[2];
        l2 = f ^ l2;
        CallSite callSite = bS.c("\u00b5", (int)bS.a("r", (int)11274, (long)(0x2FE201715491094DL ^ l2)), (long)-3718327942350544346L, (long)l2);
        bS.c("\u00b5", (int)bS.a("r", (int)12094, (long)(0x1B93CF1A82C10A7FL ^ l2)), (int)this.b, (long)-3717549643689394983L, (long)l2);
        bS.c("\u00b5", (int)bS.a("r", (int)12094, (long)(0x1B93CF1A82C10A7FL ^ l2)), (long)l, (Object)byteBuffer, (long)-3717295506116321241L, (long)l2);
        bS.c("\u00b5", (int)bS.a("r", (int)12094, (long)(0x1B93CF1A82C10A7FL ^ l2)), (int)callSite, (long)-3717549643689394983L, (long)l2);
    }

    public void f(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = (Long)objectArray[2];
        long l3 = (Long)objectArray[3];
        long l4 = (Long)objectArray[4];
        l4 = f ^ l4;
        bS.c("\u00b5", (int)bS.a("r", (int)7919, (long)(0x2374D61CC96ADB5CL ^ l4)), (int)this.b, (long)3213773683153542184L, (long)l4);
        bS.c("\u00b5", (int)bS.a("r", (int)882, (long)(0x1E3CC9EC746646CEL ^ l4)), (int)n, (long)3213773683153542184L, (long)l4);
        bS.c("\u00b5", (int)bS.a("r", (int)17381, (long)(0x6253925EA7058652L ^ l4)), (int)bS.a("r", (int)27980, (long)(0x728DB7F0DC12A8FDL ^ l4)), (long)l, (long)l2, (long)l3, (long)3213387448186942967L, (long)l4);
    }

    public void d(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = f ^ l;
        CallSite callSite = bS.c("\u00b5", (int)bS.a("r", (int)11274, (long)(0x2FE256BF4D022231L ^ l)), (long)-1794245051583674022L, (long)l);
        bS.c("\u00b5", (int)bS.a("r", (int)12094, (long)(0x1B9398D49B522103L ^ l)), (int)this.b, (long)-1795586576159320155L, (long)l);
        bS.c("\u00b5", (int)bS.a("r", (int)12094, (long)(0x1B9398D49B522103L ^ l)), (long)-1795225639975497412L, (long)l);
        bS.c("\u00b5", (int)bS.a("r", (int)12094, (long)(0x1B9398D49B522103L ^ l)), (int)callSite, (long)-1795586576159320155L, (long)l);
    }

    private static Method d(long l, long l2) {
        int n = bS.a(l, l2);
        Object object = m[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = bS.n[n];
                int n3 = string2.indexOf(8);
                clazz3 = bS.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = bS.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = bS.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        bS.m[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = bS.b(646958285949343L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = bS.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        bS.m[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = bS.b(646958285949343L, 0L);
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

    public ByteBuffer a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (Long)objectArray[1];
        int n = (Integer)objectArray[2];
        long l3 = (Long)objectArray[3];
        l3 = f ^ l3;
        CallSite callSite = bS.c("\u00b5", (int)bS.a("r", (int)11274, (long)(0x2FE23B01B40832F7L ^ l3)), (long)-585500802734335588L, (long)l3);
        bS.c("\u00b5", (int)bS.a("r", (int)12094, (long)(0x1B93F56A625831C5L ^ l3)), (int)this.b, (long)-589225827731093661L, (long)l3);
        CallSite callSite2 = bS.c("\u00b5", (int)bS.a("r", (int)12094, (long)(0x1B93F56A625831C5L ^ l3)), (long)l, (long)l2, (int)n, (long)-589299218606864806L, (long)l3);
        bS.c("\u00b5", (int)bS.a("r", (int)12094, (long)(0x1B93F56A625831C5L ^ l3)), (int)callSite, (long)-589225827731093661L, (long)l3);
        return callSite2;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6927;
        if (h[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = g[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])i.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    i.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/bS", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            bS.h[n2] = n3;
        }
        return h[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = bS.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'N' || c == 'y' || c == '\u00ff' || c == '\u00c1') {
                field = bS.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'N' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'y' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00ff' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = bS.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00c2' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00b5' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public static bS a() {
        long l = f ^ 0x95ABF0F6FE2L;
        long l2 = l ^ 0x3602E4EA98A8L;
        return new bS((int)bS.c("\u00b5", (long)7903820847539107959L, (long)l), new AtomicLong((long)bS.b("a", (int)26277, (long)(0x46798BFD9455F37BL ^ l))), l2);
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

    public void a(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = (Long)objectArray[2];
        l2 = f ^ l2;
        CallSite callSite = bS.c("\u00b5", (int)bS.a("r", (int)8295, (long)(0x5CD3068EB7A0FE9DL ^ l2)), (long)4024739457187682713L, (long)l2);
        bS.c("\u00b5", (int)bS.a("r", (int)13039, (long)(0x405948CC95826C14L ^ l2)), (int)this.b, (long)4023960847408793446L, (long)l2);
        bS.c("\u00b5", (int)bS.a("r", (int)12094, (long)(0x1B93A8430423F1C0L ^ l2)), (long)l, (int)n, (long)4024845130889878129L, (long)l2);
        bS.c("\u00b5", (int)bS.a("r", (int)12094, (long)(0x1B93A8430423F1C0L ^ l2)), (int)callSite, (long)4023960847408793446L, (long)l2);
        this.e = n;
        bS.c("\u00c2", (Object)this.c, (long)l, (long)4022899258743283857L, (long)l2);
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = bS.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    public int a(Object[] objectArray) {
        return this.b;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    public AtomicLong a(Object[] objectArray) {
        return this.c;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (bS.n[n3] != null) {
            return n3;
        }
        Object object = m[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 41;
            case 1 -> 14;
            case 2 -> 1;
            case 3 -> 44;
            case 4 -> 39;
            case 5 -> 63;
            case 6 -> 27;
            case 7 -> 37;
            case 8 -> 30;
            case 9 -> 5;
            case 10 -> 0;
            case 11 -> 42;
            case 12 -> 8;
            case 13 -> 35;
            case 14 -> 53;
            case 15 -> 54;
            case 16 -> 4;
            case 17 -> 47;
            case 18 -> 43;
            case 19 -> 36;
            case 20 -> 31;
            case 21 -> 15;
            case 22 -> 19;
            case 23 -> 50;
            case 24 -> 40;
            case 25 -> 7;
            case 26 -> 62;
            case 27 -> 24;
            case 28 -> 26;
            case 29 -> 57;
            case 30 -> 11;
            case 31 -> 17;
            case 32 -> 45;
            case 33 -> 32;
            case 34 -> 51;
            case 35 -> 9;
            case 36 -> 28;
            case 37 -> 21;
            case 38 -> 48;
            case 39 -> 20;
            case 40 -> 18;
            case 41 -> 12;
            case 42 -> 58;
            case 43 -> 59;
            case 44 -> 2;
            case 45 -> 10;
            case 46 -> 61;
            case 47 -> 23;
            case 48 -> 49;
            case 49 -> 60;
            case 50 -> 29;
            case 51 -> 33;
            case 52 -> 16;
            case 53 -> 34;
            case 54 -> 52;
            case 55 -> 22;
            case 56 -> 13;
            case 57 -> 3;
            case 58 -> 6;
            case 59 -> 38;
            case 60 -> 56;
            case 61 -> 55;
            case 62 -> 46;
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
        bS.n[n3] = new String(cArray);
        return n3;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/bS" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Unable to fully structure code
     */
    public void g(Object[] var1_1) {
        block9: {
            block8: {
                var3_2 = (Integer)var1_1[0];
                var2_3 = (ByteBuffer)var1_1[1];
                var4_4 = (Long)var1_1[2];
                v0 = var4_4 = bS.f ^ var4_4;
                var6_5 = v0 ^ 29458747798335L;
                var8_6 = v0 ^ 126977306768679L;
                var10_7 = bS.c("\u00b5", (long)8870695260590840683L, (long)var4_4);
                try {
                    try {
                        if (var10_7 != null) break block8;
                        if ((long)bS.c("\u00c2", (Object)var2_3, (long)8869512743103680349L, (long)var4_4) > bS.c("\u00c2", (Object)this.c, (long)8868999861077125477L, (long)var4_4)) {
                        }
                        ** GOTO lbl30
                    }
                    catch (MatchException v1) {
                        throw bS.c("\u00b5", (Object)v1, (long)8870775322231287448L, (long)var4_4);
                    }
                    v2 = new Object[3];
                    v2[2] = var6_5;
                    v2[1] = var2_3;
                    v2[0] = var3_2;
                    bS.c("\u00c2", (Object)this, (Object)v2, (long)8869196692758157368L, (long)var4_4);
                }
                catch (MatchException v3) {
                    throw bS.c("\u00b5", (Object)v3, (long)8870775322231287448L, (long)var4_4);
                }
            }
            try {
                if (var10_7 == null) break block9;
lbl30:
                // 2 sources

                v4 = new Object[3];
                v4[2] = var8_6;
                v4[1] = var2_3;
                v4[0] = (long)bS.b("a", (int)3577, (long)(8018001830068489857L ^ var4_4));
                bS.c("\u00c2", (Object)this, (Object)v4, (long)8870682554256601257L, (long)var4_4);
            }
            catch (MatchException v5) {
                throw bS.c("\u00b5", (Object)v5, (long)8870775322231287448L, (long)var4_4);
            }
        }
    }

    @Override
    public void close() {
        long l = f ^ 0x670E7A681F63L;
        bS.c("\u00c2", (Object)this.d, (long)2103928066981906053L, (long)l);
    }

    private static void lambda$new$0(int n) {
        long l = f ^ 0x56C7F723DF43L;
        bS.c("\u00b5", (int)n, (long)-2516410814923406829L, (long)l);
    }

    private static void lambda$new$1(int n) {
        long l = f ^ 0x1AACB5A03FE7L;
        long l2 = l ^ 0x4A54F112B3FBL;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = () -> bS.lambda$new$0(n);
        bS.c("\u00b5", (Object)objectArray, (long)4447582444411926292L, (long)l);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(bS.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)J", null));
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
            return MethodHandles.lookup().findStatic(bS.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(bS.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


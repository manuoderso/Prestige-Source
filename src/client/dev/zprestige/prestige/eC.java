/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_243
 *  net.minecraft.class_2828$class_2829
 *  net.minecraft.class_2879
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.aK;
import dev.zprestige.prestige.bD;
import dev.zprestige.prestige.bG;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.bh_0;
import dev.zprestige.prestige.dR;
import dev.zprestige.prestige.dV;
import dev.zprestige.prestige.hc;
import dev.zprestige.prestige.q_0;
import dev.zprestige.prestige.y_0;
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
import net.minecraft.class_1297;
import net.minecraft.class_243;
import net.minecraft.class_2828;
import net.minecraft.class_2879;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class eC
extends dV {
    private dR a;
    private class_1297 c = null;
    private int d = 0;
    private boolean i = 0;
    private static final long k;
    private static final String[] l;
    private static final String[] m;
    private static final Map n;
    private static final long o;
    private static final Object[] p;
    private static final String[] q;

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                block12: {
                    eC.k = hc.a(2589874193247893992L, 4230733846955946897L, MethodHandles.lookup().lookupClass()).a(246807395210256L);
                    eC.p = new Object[65];
                    eC.q = new String[65];
                    eC.f();
                    eC.n = new HashMap<K, V>(13);
                    var5 = eC.k ^ 42182871858121L;
                    var7_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    v0 = SecretKeyFactory.getInstance("DES");
                    v1 = new byte[8];
                    v2 = v1;
                    v1[0] = (byte)(var5 >>> 56);
                    for (var8_2 = 1; var8_2 < 8; ++var8_2) {
                        v2 = v2;
                        v2[var8_2] = (byte)(var5 << var8_2 * 8 >>> 56);
                    }
                    var7_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                    var14_3 = new String[4];
                    var12_4 = 0;
                    var11_5 = "\b\u00ad\u00c6\u0090\u00ac\u00ad\u0005|\u0081\u0001c`\u0092\u00eco\u00ad\u0010\"\u00ab\u00a1u}\u00c5\u00bfA\u00b5y\u00ad(\u00ec\u008aa\u00b8";
                    var13_6 = "\b\u00ad\u00c6\u0090\u00ac\u00ad\u0005|\u0081\u0001c`\u0092\u00eco\u00ad\u0010\"\u00ab\u00a1u}\u00c5\u00bfA\u00b5y\u00ad(\u00ec\u008aa\u00b8".length();
                    var10_7 = 16;
                    var9_8 = -1;
lbl32:
                    // 2 sources

                    while (true) {
                        v3 = ++var9_8;
                        v4 = var11_5.substring(v3, v3 + var10_7);
                        v5 = -1;
                        break block12;
                        break;
                    }
lbl37:
                    // 1 sources

                    while (true) {
                        var14_3[var12_4++] = eC.b(var15_9).intern();
                        if ((var9_8 += var10_7) < var13_6) {
                            var10_7 = var11_5.charAt(var9_8);
                            ** continue;
                        }
                        var11_5 = "\u00d8\u008c\u0012\u0015\u00b5\u0013\u008a\u00d5\t\u0017.\u00ff\n\u00a0n(\u0010\u007fB\u00fe\u00a9\u0017\u00c8>\u00c8k\u001a\u00e9r\u00e0\u00ecE\u00c4";
                        var13_6 = "\u00d8\u008c\u0012\u0015\u00b5\u0013\u008a\u00d5\t\u0017.\u00ff\n\u00a0n(\u0010\u007fB\u00fe\u00a9\u0017\u00c8>\u00c8k\u001a\u00e9r\u00e0\u00ecE\u00c4".length();
                        var10_7 = 16;
                        var9_8 = -1;
lbl46:
                        // 2 sources

                        while (true) {
                            v6 = ++var9_8;
                            v4 = var11_5.substring(v6, v6 + var10_7);
                            v5 = 0;
                            break block12;
                            break;
                        }
                        break;
                    }
lbl51:
                    // 1 sources

                    while (true) {
                        var14_3[var12_4++] = eC.b(var15_9).intern();
                        if ((var9_8 += var10_7) < var13_6) {
                            var10_7 = var11_5.charAt(var9_8);
                            ** continue;
                        }
                        break block13;
                        break;
                    }
                }
                var15_9 = var7_1.doFinal(v4.getBytes("ISO-8859-1"));
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
            eC.l = var14_3;
            eC.m = new String[4];
            var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
            v7 = SecretKeyFactory.getInstance("DES");
            v8 = new byte[8];
            v9 = v8;
            v8[0] = (byte)(var5 >>> 56);
            for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                v9 = v9;
                v9[var1_11] = (byte)(var5 << var1_11 * 8 >>> 56);
            }
            break block14;
lbl83:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
        var2_12 = 7941041335008615435L;
        var4_13 = var0_10.doFinal(new byte[]{(byte)(var2_12 >>> 56), (byte)(var2_12 >>> 48), (byte)(var2_12 >>> 40), (byte)(var2_12 >>> 32), (byte)(var2_12 >>> 24), (byte)(var2_12 >>> 16), (byte)(var2_12 >>> 8), (byte)var2_12});
        ** while (true)
        eC.o = ((long)var4_13[0] & 255L) << 56 | ((long)var4_13[1] & 255L) << 48 | ((long)var4_13[2] & 255L) << 40 | ((long)var4_13[3] & 255L) << 32 | ((long)var4_13[4] & 255L) << 24 | ((long)var4_13[5] & 255L) << 16 | ((long)var4_13[6] & 255L) << 8 | (long)var4_13[7] & 255L;
    }

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x14CD;
        if (m[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])eC.n.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    eC.n.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/eC", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = eC.l[n2].getBytes("ISO-8859-1");
            eC.m[n2] = eC.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return m[n2];
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
            throw new RuntimeException("dev/zprestige/prestige/eC" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = eC.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/eC" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = eC.m(l, l2);
            object = p[n];
            try {
                if (!(object instanceof String)) break block2;
                eC.p[n] = clazz = Class.forName(q[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = eC.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = eC.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = eC.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = eC.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = p;
        p[0] = "]5\u0003YZ_K5\u0006\u0003IH\\~\u0005\u0005E\\M9\u0012\u0012\u000eNq";
        objectArray[1] = "k\u0001&~\u001fk\u001e!-q\u000e$c9>v\u0007m\u000b";
        objectArray[2] = "'T\u0018\u000eO+'T\u000fRC$=\u001f\u000fLC1:n_\u0011\u0012";
        objectArray[3] = "\u0017\u0017!_a|\u0017\u00176\u0003ms\r\\6\u001dmf\n-bE:";
        objectArray[4] = Boolean.TYPE;
        eC.q[4] = "java/lang/Boolean";
        objectArray[5] = "* 7lEd< 26Vs+k10Zg:,&'\u0011q\r";
        objectArray[6] = "e{C'q\u000fntRh\u0012\u0002{y]\u0003'\u0000jjA/0\r";
        objectArray[7] = "%ZM6%\u001fPzF94P1tM20\nE";
        objectArray[8] = Void.TYPE;
        eC.q[8] = "java/lang/Void";
        objectArray[9] = "+p\u0003WqS^P\bX`\u001c?^\u0003SdFK";
        objectArray[10] = "z=Gs2.l=B)!9{vA/--j1V8f'";
        objectArray[11] = "]q\u001d\u001d\u0017-Kq\u0018G\u0004:\\:\u001bA\b.M}\fVC<r";
        objectArray[12] = ":AklrqOa`cc>.okhgdZ";
        objectArray[13] = ",p\nf\u0017k,p\u001d:\u001bd6;\u001d$\u001bq1JOzC5";
        objectArray[14] = "#\u0015OZ\u0005\u001cV5DU\u0014S7;O^\u0010\tC";
        objectArray[15] = "\u001e]m\u0018\u0012\n\u001e]zD\u001e\u0005\u0004\u0016zZ\u001e\u0010\u0003g+\u0002L";
        objectArray[16] = Double.TYPE;
        eC.q[16] = "java/lang/Double";
        objectArray[17] = "`EgK5J\u0015elD$\u0005tkgO _\u0000";
        objectArray[18] = "\u0016J'6N-\u0000J\"l]:\u0017\u0001!jQ.\u0006F6}\u001a99";
        objectArray[19] = "l?\u000eMi\tg0\u001f\u0002\b\u0007l;\u001bX";
        objectArray[20] = "CKq#OLHD`l2T[Ci%";
        objectArray[21] = "UJnF\fMCJk\u001c\u001fZT\u0001h\u001a\u0013NEF\u007f\rX^D";
        objectArray[22] = "\u001dT_b\fphtTm\u001d?\tz_f\u0019e}";
        objectArray[23] = "\u007fdRX%AidW\u00026V~/T\u0004:BohC\u0013qSs";
        objectArray[24] = "\u001a[g\u0000<\u0003o{l\u000f-L\u000eug\u0004)\u0016z";
        objectArray[25] = "v\rk o\u0015v\r||c\u001alF|bc\u000fk7-;;J";
        objectArray[26] = "\\\u001ad\u001eX9B\u0012~Q%)B";
        objectArray[27] = "\u001d=s9\rJ\u000b=vc\u001e]\u001cvue\u0012I\r1brYYJ";
        objectArray[28] = "iv?I\u000e\u0001\u001cV4F\u001fN}X?M\u001b\u0014\t";
        objectArray[29] = "+g2RJW+g%\u000eFX1,%\u0010FM6]tO\u001e";
        objectArray[30] = "\u000f\byd(k\u000f\bn8$d\u0015Cn&$q\u00122?y|&\u0002\u0001l96]SY=";
        objectArray[31] = "6\u0014\"p)m \u0014'*:z7_$,6n&\u00183;}~=";
        objectArray[32] = "E~x#\u0011\u00020^s,\u0000MQPx'\u0004\u0017%";
        objectArray[33] = "`&]/%b>yJ%\u001b97=M#w\u000b`z\u0016}+\\0&Wu~7<z] \u001b";
        objectArray[34] = "\u0011.cVY\u007fG(i.\u000b\u0003^.pA\u0007iB &.";
        objectArray[35] = "c_OLtK1Z\u0001CIL;PT]\u001e\u001be\u0007\f1sE*V\u000e\u000f-\u001a=\\";
        objectArray[36] = "'2[\u0003\u0005Yj \u0018\u0002u\u000b\u0018/\u0005\u0000I\u000fw-\u0001\r\rb)+\nM\u0005\r~t\u001f\u0001u";
        objectArray[37] = "R;-]K\u0013\u0000>cRv\u0014\n46L!CTgo \u0015\u001b\u0011bbJ\u0018BRe";
        objectArray[38] = "{Z<\u0001!h-\\6yp\u0014.Z{Et{,^v\u0001\u0019)-E4G&{/B'y";
        objectArray[39] = "f_dKtO>\u0000\"D\u0015B]\\>H)M2^:Em `_!\u0007+\u001f2]&\u0014\u0015";
        objectArray[40] = "Q:k\r\u001fl\u000fe|\u0007!7\u0006!{\u0001M\u0005Rm$W\u0010R\u00022 XQ#\u0016a&\u001a!o\r#iX\u001e=\u000f$zf";
        objectArray[41] = "=m}B\u001byc2jH%\"jvmNI\u0010::3\u0018%|hg4FH={e4)";
        objectArray[42] = "\u000358\u001d\u000e\u007f[j~\u0012oy8o=L\u000b/Roe_\u000f\u0010\u0004mlGPz\u00045\u007fCo";
        objectArray[43] = "\u001aNF\u001a9e\u001dM\nJZe\u0010+KQ;\u007f\u0018pZ\u0015+(\u0014\f]\u0016gxw";
        objectArray[44] = "\u0005YKSX\f\n\\\u0004L R\n=WSOP\u001c@EVQNdQBEEM\u0019CG[[5\u0005YKSX\f\n\\\u0004L ";
        objectArray[45] = "\u007f. M2ik}&\u000fBvw,\u007f\u001f\u0015!-|\"s(\u007flp~\u0018$#f%";
        objectArray[46] = "1=\u001b.#bob\f$\u001d9f&\u000b\"q\u000b5cS|\u001dgd7R*p&w5RE";
        objectArray[47] = "+\u001a/2\u00070>Iw{a)EGv>]-*Er3\u0019@xDiq_\u007f*Fnba";
        objectArray[48] = "\u000eq\u0013\t^uP.\u0004\u0003`%U{\u0007\u000e7v\u0005)]b[$Y/\f\u000f\u001a7[/";
        objectArray[49] = " ~RGNJ4-T\u0005>U(|\r\u0015i\u0002r,QyT\\3 \f\u0012X\u00009u";
        objectArray[50] = "vak=,j{buiW9tp}`\u0000n.& \f4+g,b19(yx";
        objectArray[51] = "xTS\u0016?\u001d&\u000bD\u001c\u0001F/OC\u001amtx\b\u0018G8#(TYLdH$\bS\u0019\u0001";
        objectArray[52] = "\u001cwY,\u0014VB(N&*\rKlI F?\u001b/\u0016~*SI}\u0010(G\u0012Z\u007f\u0010G";
        objectArray[53] = "J7(]:D\u0012hnR[Gq4r^gF\u001e6vS#+J>~Z4F\u000b-|Z[";
        objectArray[54] = "^AI_H\t@CDD*\u001a1\u001c\u0015\u0007\u0016\u001e^\u001e\u0011\nRsQ\u0000\u001aVW\u0003]\u0014\u0006C*";
        objectArray[55] = "y.Y3\u00063'qN98h.5I?TZzy\u0016i\b\r*&\u0012fH|>u\u0014$8";
        objectArray[56] = "x]Q3|IwQR,\u0004\\\u001cDN~8XsFJs|5!GQ1:\nsEV\"\u0004";
        objectArray[57] = "K+\ns0u\u0015t\u001dy\u000e.\u001c0\u001a\u007fb\u001cKpJ\">KJ#\u0017!a&\u000b0\u0015!\u000e";
        objectArray[58] = "\u001bO\u0004\u001eB \u001aX\u0001E97p]@N\\&\rOEPB^";
        objectArray[59] = ")w\u0002\u000f_ %s\u0005\u0012!/Hl\u001cT\u001d+'n\u0018YYFuo\u0003\u001b\u001fy'm\u0004\b!";
        objectArray[60] = "\u007f!\u007f3-Z!~h9\u0013\u0001(:o?\u007f3\u007f}4a,d/!uiv\u000f#}\u007f<\u0013";
        objectArray[61] = "\u000eTE_bL\u0003\r\u0006XRC\u0000I_\u0003>qT\n\u0000Ti&\u000eIMU)\u001b\u0003JS\u0001R";
        objectArray[62] = "\u000f3_W\u00110Y5U/@LZ3\u0018\u0013D#X7\u0015W)rN?YIBs\\)Z/";
        objectArray[63] = "f\u0019\u001ec\u0019trJ\u0018!ikn\u001bA1><4K\u001f]\u0003buG@6\u000f>\u007f\u0012";
        Object[] objectArray2 = objectArray;
        objectArray[64] = "~\u0000Q\u0006\u0013\ry\u0003\u001dVp\u001cjCIS\u000bq\u007fGOR\b\fmBQLpJ|S\u0019X\u001d\u000boQ\u00197";
    }

    private boolean d(Object[] objectArray) {
        Object object;
        block23: {
            block19: {
                CallSite callSite;
                long l;
                block22: {
                    block21: {
                        block20: {
                            CallSite callSite2;
                            block18: {
                                l = (Long)objectArray[0];
                                l = k ^ l;
                                callSite = eC.c("\u00ca", (long)5052669078498590212L, (long)l);
                                try {
                                    try {
                                        callSite2 = eC.c("B", (Object)b, (long)5052701240117079510L, (long)l);
                                        if (callSite != null) break block18;
                                        if (callSite2 == null) break block19;
                                    }
                                    catch (MatchException matchException) {
                                        throw eC.c("\u00ca", (Object)matchException, (long)5052107757517526337L, (long)l);
                                    }
                                    callSite2 = eC.c("B", (Object)b, (long)5052701240117079510L, (long)l);
                                }
                                catch (MatchException matchException) {
                                    throw eC.c("\u00ca", (Object)matchException, (long)5052107757517526337L, (long)l);
                                }
                            }
                            try {
                                try {
                                    object = eC.c("\u00de", (Object)callSite2, (long)5050895814260610167L, (long)l);
                                    if (callSite != null) break block20;
                                    if (object == false) break block19;
                                }
                                catch (MatchException matchException) {
                                    throw eC.c("\u00ca", (Object)matchException, (long)5052107757517526337L, (long)l);
                                }
                                object = eC.c("\u00de", (Object)eC.c("B", (Object)b, (long)5052701240117079510L, (long)l), (long)5052034981873296895L, (long)l);
                            }
                            catch (MatchException matchException) {
                                throw eC.c("\u00ca", (Object)matchException, (long)5052107757517526337L, (long)l);
                            }
                        }
                        try {
                            try {
                                if (callSite != null) break block21;
                                if (object != false) break block19;
                            }
                            catch (MatchException matchException) {
                                throw eC.c("\u00ca", (Object)matchException, (long)5052107757517526337L, (long)l);
                            }
                            object = eC.c("\u00de", (Object)eC.c("B", (Object)b, (long)5052701240117079510L, (long)l), (long)5051672571597597454L, (long)l);
                        }
                        catch (MatchException matchException) {
                            throw eC.c("\u00ca", (Object)matchException, (long)5052107757517526337L, (long)l);
                        }
                    }
                    try {
                        try {
                            if (callSite != null) break block22;
                            if (object != false) break block19;
                        }
                        catch (MatchException matchException) {
                            throw eC.c("\u00ca", (Object)matchException, (long)5052107757517526337L, (long)l);
                        }
                        object = eC.c("\u00de", (Object)eC.c("B", (Object)b, (long)5052701240117079510L, (long)l), (long)5052364897077434602L, (long)l);
                    }
                    catch (MatchException matchException) {
                        throw eC.c("\u00ca", (Object)matchException, (long)5052107757517526337L, (long)l);
                    }
                }
                try {
                    if (callSite != null) break block23;
                    if (object != false) break block19;
                }
                catch (MatchException matchException) {
                    throw eC.c("\u00ca", (Object)matchException, (long)5052107757517526337L, (long)l);
                }
                object = 1;
                break block23;
            }
            object = false;
        }
        return (boolean)object;
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'B' || c == 'V' || c == 'g' || c == 'q') {
                field = eC.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'B' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'V' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'g' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = eC.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00de' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00ca' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = eC.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    @bP
    public void a(bD bD2) {
        block11: {
            eC eC2;
            long l;
            block10: {
                l = k ^ 0x3D0A2E23B070L;
                CallSite callSite = eC.c("\u00ca", (long)4147446637289816468L, (long)l);
                try {
                    if (eC.c("\u00de", (Object)bD2, (Object)new Object[0], (long)4146010492139099652L, (long)l) != y_0.PRE) {
                        return;
                    }
                }
                catch (MatchException matchException) {
                    throw eC.c("\u00ca", (Object)matchException, (long)4146880961279011537L, (long)l);
                }
                try {
                    try {
                        eC2 = this;
                        if (callSite != null) break block10;
                        if (eC2.c == null) break block11;
                    }
                    catch (MatchException matchException) {
                        throw eC.c("\u00ca", (Object)matchException, (long)4146880961279011537L, (long)l);
                    }
                    eC2 = this;
                }
                catch (MatchException matchException) {
                    throw eC.c("\u00ca", (Object)matchException, (long)4146880961279011537L, (long)l);
                }
            }
            try {
                if (eC2.d > 0) {
                    eC.c("\u00de", (Object)bD2, (Object)new Object[0], (long)4147705026421765807L, (long)l);
                }
            }
            catch (MatchException matchException) {
                throw eC.c("\u00ca", (Object)matchException, (long)4146880961279011537L, (long)l);
            }
        }
    }

    @Override
    public String a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return eC.c("\u00de", (String)((Object)eC.c("\u00de", (Object)this.a, (long)-819114498848252585L, (long)l)), (long)-818087177765145456L, (long)l);
    }

    @bP
    public void a(bh_0 bh_02) {
        block23: {
            eC eC2;
            long l;
            block24: {
                Object object;
                block22: {
                    CallSite callSite;
                    block20: {
                        block21: {
                            block19: {
                                block18: {
                                    l = k ^ 0x2F8A2C2C2A7EL;
                                    long l2 = l ^ 0x31CF78A56C68L;
                                    callSite = eC.c("\u00ca", (long)-6665149060958921830L, (long)l);
                                    try {
                                        try {
                                            Object[] objectArray = new Object[1];
                                            objectArray[0] = l2;
                                            object = eC.c("\u00de", (Object)this, (Object)objectArray, (long)-6663787619401184725L, (long)l);
                                            if (callSite != null) break block18;
                                            if (object == false) break block19;
                                        }
                                        catch (MatchException matchException) {
                                            throw eC.c("\u00ca", (Object)matchException, (long)-6664556951292989217L, (long)l);
                                        }
                                        object = this.i;
                                    }
                                    catch (MatchException matchException) {
                                        throw eC.c("\u00ca", (Object)matchException, (long)-6664556951292989217L, (long)l);
                                    }
                                }
                                try {
                                    if (callSite != null) break block20;
                                    if (object == false) break block21;
                                }
                                catch (MatchException matchException) {
                                    throw eC.c("\u00ca", (Object)matchException, (long)-6664556951292989217L, (long)l);
                                }
                            }
                            return;
                        }
                        object = eC.c("\u00de", (Object)bh_02, (Object)new Object[0], (long)-6663729429583396459L, (long)l) instanceof class_2879;
                    }
                    try {
                        try {
                            try {
                                if (callSite != null) break block22;
                                if (object == false) break block23;
                            }
                            catch (MatchException matchException) {
                                throw eC.c("\u00ca", (Object)matchException, (long)-6664556951292989217L, (long)l);
                            }
                            eC2 = this;
                            if (callSite != null) break block24;
                        }
                        catch (MatchException matchException) {
                            throw eC.c("\u00ca", (Object)matchException, (long)-6664556951292989217L, (long)l);
                        }
                        object = eC.c("\u00de", (String)((Object)eC.c("\u00de", (Object)eC2.a, (long)-6663445706030036368L, (long)l)), (Object)eC.b("x", (int)12950, (long)(0x28851AD8687B05D0L ^ l)), (long)-6658511823658261115L, (long)l);
                    }
                    catch (MatchException matchException) {
                        throw eC.c("\u00ca", (Object)matchException, (long)-6664556951292989217L, (long)l);
                    }
                }
                if (object != false) break block23;
                eC2 = this;
            }
            try {
                if (eC2.c != null) {
                    eC.c("\u00de", (Object)bh_02, (Object)new Object[0], (long)-6664895069873034079L, (long)l);
                }
            }
            catch (MatchException matchException) {
                throw eC.c("\u00ca", (Object)matchException, (long)-6664556951292989217L, (long)l);
            }
        }
    }

    @Override
    public Set a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return eC.c("\u00ca", (Object)((Object)q_0.Sword), (Object)((Object)q_0.UHC), (long)-2446857782071725709L, (long)l);
    }

    /*
     * Unable to fully structure code
     */
    @bP
    public void a(bG var1_1) {
        block16: {
            block17: {
                block18: {
                    block19: {
                        block15: {
                            var2_2 = eC.k ^ 30062696909335L;
                            var4_3 = var2_2 ^ 65891290480327L;
                            var6_4 = eC.c("\u00ca", (long)4893608375019977715L, (long)var2_2);
                            try {
                                try {
                                    v0 = this;
                                    if (var6_4 != null) break block15;
                                    if (v0.c == null) break block16;
                                }
                                catch (MatchException v1) {
                                    throw eC.c("\u00ca", (Object)v1, (long)4894155086602752182L, (long)var2_2);
                                }
                                v0 = this;
                            }
                            catch (MatchException v2) {
                                throw eC.c("\u00ca", (Object)v2, (long)4894155086602752182L, (long)var2_2);
                            }
                        }
                        try {
                            try {
                                try {
                                    try {
                                        if (var6_4 != null) break block17;
                                        if (v0.d <= 0) {
                                        }
                                        ** GOTO lbl51
                                    }
                                    catch (MatchException v3) {
                                        throw eC.c("\u00ca", (Object)v3, (long)4894155086602752182L, (long)var2_2);
                                    }
                                    this.i = 1;
                                    if (var6_4 != null) break block18;
                                }
                                catch (MatchException v4) {
                                    throw eC.c("\u00ca", (Object)v4, (long)4894155086602752182L, (long)var2_2);
                                }
                                if (eC.c("\u00de", (Object)eC.c("B", (Object)eC.b, (long)4893297448416921247L, (long)var2_2), (long)4894973548985760548L, (long)var2_2) != eC.c("g", (long)4894728093864853735L, (long)var2_2)) break block19;
                            }
                            catch (MatchException v5) {
                                throw eC.c("\u00ca", (Object)v5, (long)4894155086602752182L, (long)var2_2);
                            }
                            v6 = new Object[2];
                            v6[1] = var4_3;
                            v6[0] = this.c;
                            eC.c("\u00ca", (Object)v6, (long)4895183565166119332L, (long)var2_2);
                        }
                        catch (MatchException v7) {
                            throw eC.c("\u00ca", (Object)v7, (long)4894155086602752182L, (long)var2_2);
                        }
                    }
                    this.i = 0;
                    this.c = null;
                }
                try {
                    if (var6_4 == null) break block16;
lbl51:
                    // 2 sources

                    v0 = this;
                }
                catch (MatchException v8) {
                    throw eC.c("\u00ca", (Object)v8, (long)4894155086602752182L, (long)var2_2);
                }
            }
            --v0.d;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @bP
    public void a(aK var1_1) {
        block32: {
            block37: {
                block38: {
                    block36: {
                        block35: {
                            block33: {
                                block31: {
                                    block39: {
                                        block30: {
                                            block29: {
                                                v0 = var2_2 = eC.k ^ 27487435733983L;
                                                var4_3 = v0 ^ 23616882226794L;
                                                var6_4 = v0 ^ 104236222135887L;
                                                var8_5 = v0 ^ 7399127580105L;
                                                var10_6 = eC.c("\u00ca", (long)3612332528980478523L, (long)var2_2);
                                                try {
                                                    try {
                                                        v1 = new Object[1];
                                                        v1[0] = var8_5;
                                                        v2 /* !! */  = eC.c("\u00de", (Object)this, (Object)v1, (long)3613099673751509898L, (long)var2_2);
                                                        if (var10_6 != null) break block29;
                                                        if (v2 /* !! */  == false) break block30;
                                                    }
                                                    catch (MatchException v3) {
                                                        throw eC.c("\u00ca", (Object)v3, (long)3612884942467998078L, (long)var2_2);
                                                    }
                                                    v2 /* !! */  = (CallSite)this.i;
                                                }
                                                catch (MatchException v4) {
                                                    throw eC.c("\u00ca", (Object)v4, (long)3612884942467998078L, (long)var2_2);
                                                }
                                            }
                                            if (v2 /* !! */  == false) break block39;
                                        }
                                        return;
                                    }
                                    var11_7 = eC.c("\u00de", (Object)var1_1, (Object)new Object[0], (long)3611947134056293555L, (long)var2_2);
                                    try {
                                        try {
                                            v5 = var11_7;
                                            if (var10_6 != null) break block31;
                                            if (v5 == null) break block32;
                                        }
                                        catch (MatchException v6) {
                                            throw eC.c("\u00ca", (Object)v6, (long)3612884942467998078L, (long)var2_2);
                                        }
                                        v5 = eC.c("\u00de", (Object)this.a, (long)3614024465723284433L, (long)var2_2);
                                    }
                                    catch (MatchException v7) {
                                        throw eC.c("\u00ca", (Object)v7, (long)3612884942467998078L, (long)var2_2);
                                    }
                                }
                                try {
                                    try {
                                        block34: {
                                            try {
                                                try {
                                                    v8 = eC.c("\u00de", (String)v5, (Object)eC.b("x", (int)5004, (long)(5345969588229027177L ^ var2_2)), (long)3618925646377907236L, (long)var2_2);
                                                    if (var10_6 != null) break block33;
                                                    if (v8 == false) break block34;
                                                }
                                                catch (MatchException v9) {
                                                    throw eC.c("\u00ca", (Object)v9, (long)3612884942467998078L, (long)var2_2);
                                                }
                                                v10 = new Object[2];
                                                v10[1] = var4_3;
                                                v10[0] = Float.valueOf(0.0625f);
                                                eC.c("\u00de", (Object)this, (Object)v10, (long)3612132486810021740L, (long)var2_2);
                                                v11 = new Object[2];
                                                v11[1] = var4_3;
                                                v11[0] = Float.valueOf(0.0f);
                                                eC.c("\u00de", (Object)this, (Object)v11, (long)3612132486810021740L, (long)var2_2);
                                                if (var10_6 == null) break block32;
                                            }
                                            catch (MatchException v12) {
                                                throw eC.c("\u00ca", (Object)v12, (long)3612884942467998078L, (long)var2_2);
                                            }
                                        }
                                        this.c = var11_7;
                                        if (var10_6 != null) break block35;
                                    }
                                    catch (MatchException v13) {
                                        throw eC.c("\u00ca", (Object)v13, (long)3612884942467998078L, (long)var2_2);
                                    }
                                    v8 = eC.c("\u00de", (String)eC.c("\u00de", (Object)this.a, (long)3614024465723284433L, (long)var2_2), (Object)eC.b("x", (int)14241, (long)(2123887152811741509L ^ var2_2)), (long)3618925646377907236L, (long)var2_2);
                                }
                                catch (MatchException v14) {
                                    throw eC.c("\u00ca", (Object)v14, (long)3612884942467998078L, (long)var2_2);
                                }
                            }
                            try {
                                if (v8 != false) {
                                    v15 = new Object[1];
                                    v15[0] = var6_4;
                                    eC.c("\u00ca", (Object)v15, (long)3612695709074665804L, (long)var2_2);
                                }
                                ** GOTO lbl89
                            }
                            catch (MatchException v16) {
                                throw eC.c("\u00ca", (Object)v16, (long)3612884942467998078L, (long)var2_2);
                            }
                        }
                        try {
                            if (var10_6 == null) break block36;
lbl89:
                            // 2 sources

                            eC.c("\u00de", (Object)eC.c("B", (Object)eC.b, (long)3612440554826160617L, (long)var2_2), (Object)new class_243((double)eC.c("B", (Object)eC.c("\u00de", (Object)eC.c("B", (Object)eC.b, (long)3612440554826160617L, (long)var2_2), (long)3613229374665508841L, (long)var2_2), (long)3613819767601728771L, (long)var2_2), (double)(eC.c("B", (Object)eC.c("\u00de", (Object)eC.c("B", (Object)eC.b, (long)3612440554826160617L, (long)var2_2), (long)3613229374665508841L, (long)var2_2), (long)3612558046602965742L, (long)var2_2) + 0.15), (double)eC.c("B", (Object)eC.c("\u00de", (Object)eC.c("B", (Object)eC.b, (long)3612440554826160617L, (long)var2_2), (long)3613229374665508841L, (long)var2_2), (long)3613388920136522340L, (long)var2_2)), (long)3612801390699440204L, (long)var2_2);
                        }
                        catch (MatchException v17) {
                            throw eC.c("\u00ca", (Object)v17, (long)3612884942467998078L, (long)var2_2);
                        }
                    }
                    try {
                        v18 = this;
                        v19 = eC.c("\u00de", (String)eC.c("\u00de", (Object)this.a, (long)3614024465723284433L, (long)var2_2), (Object)eC.b("x", (int)8816, (long)(8990587379827278998L ^ var2_2)), (long)3618925646377907236L, (long)var2_2);
                        if (var10_6 != null) break block37;
                        if (v19 == false) break block38;
                    }
                    catch (MatchException v20) {
                        throw eC.c("\u00ca", (Object)v20, (long)3612884942467998078L, (long)var2_2);
                    }
                    v19 = (int)eC.o;
                    break block37;
                }
                v19 = 1;
            }
            v18.d = v19;
            eC.c("\u00de", (Object)var1_1, (Object)new Object[0], (long)3612096131423321344L, (long)var2_2);
        }
    }

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (q[n3] != null) {
            return n3;
        }
        Object object = p[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 1;
            case 1 -> 41;
            case 2 -> 8;
            case 3 -> 44;
            case 4 -> 48;
            case 5 -> 2;
            case 6 -> 11;
            case 7 -> 54;
            case 8 -> 43;
            case 9 -> 20;
            case 10 -> 53;
            case 11 -> 35;
            case 12 -> 58;
            case 13 -> 49;
            case 14 -> 56;
            case 15 -> 25;
            case 16 -> 60;
            case 17 -> 55;
            case 18 -> 4;
            case 19 -> 57;
            case 20 -> 61;
            case 21 -> 23;
            case 22 -> 12;
            case 23 -> 45;
            case 24 -> 14;
            case 25 -> 42;
            case 26 -> 0;
            case 27 -> 18;
            case 28 -> 26;
            case 29 -> 21;
            case 30 -> 5;
            case 31 -> 30;
            case 32 -> 50;
            case 33 -> 40;
            case 34 -> 6;
            case 35 -> 37;
            case 36 -> 31;
            case 37 -> 62;
            case 38 -> 13;
            case 39 -> 19;
            case 40 -> 47;
            case 41 -> 24;
            case 42 -> 32;
            case 43 -> 63;
            case 44 -> 7;
            case 45 -> 39;
            case 46 -> 33;
            case 47 -> 34;
            case 48 -> 38;
            case 49 -> 46;
            case 50 -> 28;
            case 51 -> 10;
            case 52 -> 22;
            case 53 -> 36;
            case 54 -> 16;
            case 55 -> 51;
            case 56 -> 59;
            case 57 -> 52;
            case 58 -> 27;
            case 59 -> 3;
            case 60 -> 9;
            case 61 -> 15;
            case 62 -> 29;
            default -> 17;
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
        eC.q[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = eC.m(l, l2);
        Object object = p[n];
        if (object instanceof String) {
            String string = q[n];
            int n2 = string.indexOf(8);
            Class clazz = eC.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = eC.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = eC.g(clazz3, string2, clazz2)) != null) {
                    eC.p[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = eC.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        eC.p[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = eC.n(1394931573648244L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = eC.m(l, l2);
        Object object = p[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = q[n];
                int n3 = string2.indexOf(8);
                clazz3 = eC.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = eC.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = eC.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        eC.p[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = eC.n(1394931573648244L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = eC.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        eC.p[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = eC.n(1394931573648244L, 0L);
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
        float f = ((Float)objectArray[0]).floatValue();
        long l = (Long)objectArray[1];
        long l2 = (l = k ^ l) ^ 0x3D51FEC0A8BBL;
        class_2828.class_2829 class_28292 = new class_2828.class_2829((double)eC.c("\u00de", (Object)eC.c("B", (Object)b, (long)-8233179619346061707L, (long)l), (long)-8234257758171828320L, (long)l), (double)(eC.c("\u00de", (Object)eC.c("B", (Object)b, (long)-8233179619346061707L, (long)l), (long)-8233324714384205602L, (long)l) + (double)f), (double)eC.c("\u00de", (Object)eC.c("B", (Object)b, (long)-8233179619346061707L, (long)l), (long)-8234292661161438358L, (long)l), false, (boolean)eC.c("B", (Object)eC.c("B", (Object)b, (long)-8233179619346061707L, (long)l), (long)-8234523542737340176L, (long)l));
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = class_28292;
        eC.c("\u00ca", (Object)objectArray2, (long)-8233751080437296789L, (long)l);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(eC.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(eC.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


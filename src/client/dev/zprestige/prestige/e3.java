/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1657
 *  net.minecraft.class_243
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.bG;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.bt_0;
import dev.zprestige.prestige.ct_0;
import dev.zprestige.prestige.dM;
import dev.zprestige.prestige.dN;
import dev.zprestige.prestige.dO;
import dev.zprestige.prestige.dP;
import dev.zprestige.prestige.dV;
import dev.zprestige.prestige.hc;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
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
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1657;
import net.minecraft.class_243;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class e3
extends dV {
    private dM d;
    private dO a;
    private dP c;
    private dO e;
    private dO f;
    private dM g;
    private dN h;
    private Map i;
    private Map j;
    private List k;
    private static final long l = hc.a(7519175530666767988L, -8545721361242323856L, MethodHandles.lookup().lookupClass()).a(243993626529150L);
    private static final long m;
    private static final long[] n;
    private static final Long[] o;
    private static final Map p;
    private static final Object[] q;
    private static final String[] r;

    public e3() {
        long l = e3.l ^ 0x7FDBACB40B03L;
        long l2 = l ^ 0x5887082178DEL;
        this.i = new HashMap();
        this.j = new HashMap();
        this.k = new ArrayList();
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = this::lambda$new$0;
        e3.c("m", (Object)this.h, (Object)objectArray, (long)-8112065705867582926L, (long)l);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        q = new Object[92];
        r = new String[92];
        e3.f();
        long l = e3.l ^ 0x62C6F83B6D05L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        long l2 = 3763470507556053872L;
        byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
        m = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
        p = new HashMap(13);
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
        long[] lArray = new long[2];
        int n = 0;
        String string = "\"!\u00cd9\u00c9\u00c3\u001b_\u00ba0\u00a7\u00e1\u0095\u00f4\u00b0\u0007";
        int n2 = "\"!\u00cd9\u00c9\u00c3\u001b_\u00ba0\u00a7\u00e1\u0095\u00f4\u00b0\u0007".length();
        int n3 = 0;
        do {
            byte[] byArray6 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l3 = ((long)byArray6[0] & 0xFFL) << 56 | ((long)byArray6[1] & 0xFFL) << 48 | ((long)byArray6[2] & 0xFFL) << 40 | ((long)byArray6[3] & 0xFFL) << 32 | ((long)byArray6[4] & 0xFFL) << 24 | ((long)byArray6[5] & 0xFFL) << 16 | ((long)byArray6[6] & 0xFFL) << 8 | (long)byArray6[7] & 0xFFL;
            byte[] byArray7 = cipher2.doFinal(new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3});
            lArray[n4] = ((long)byArray7[0] & 0xFFL) << 56 | ((long)byArray7[1] & 0xFFL) << 48 | ((long)byArray7[2] & 0xFFL) << 40 | ((long)byArray7[3] & 0xFFL) << 32 | ((long)byArray7[4] & 0xFFL) << 24 | ((long)byArray7[5] & 0xFFL) << 16 | ((long)byArray7[6] & 0xFFL) << 8 | (long)byArray7[7] & 0xFFL;
        } while (n3 < n2);
        e3.n = lArray;
        o = new Long[2];
    }

    @Override
    public void e(Object[] objectArray) {
        long l = (Long)objectArray[0];
        e3.c("m", (Object)this.k, (long)3992520389005019322L, (long)l);
        e3.c("m", (Object)this.i, (long)3992629609163497101L, (long)l);
        e3.c("m", (Object)this.j, (long)3992629609163497101L, (long)l);
    }

    private static long b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x26C3;
        if (o[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = e3.n[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])p.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    p.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/e3", exception);
            }
            long l4 = ((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL;
            e3.o[n2] = l4;
        }
        return o[n2];
    }

    private static long b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = e3.b(n, l);
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
            throw new RuntimeException("dev/zprestige/prestige/e3" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static float b(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        return 1.0f - (1.0f - f) * (1.0f - f);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/e3" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = e3.m(l, l2);
            object = q[n];
            try {
                if (!(object instanceof String)) break block2;
                e3.q[n] = clazz = Class.forName(r[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = e3.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = e3.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = e3.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = e3.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = q;
        q[0] = "VwPiIV@wU3ZAW<V5VUF{A\"\u001dGz";
        objectArray[1] = "A\u0005RpTU4%Y\u007fE\u001aI=JxLS!";
        objectArray[2] = "+;[Eg\u001d=;^\u001ft\n*p]\u0019x\u001e;7J\u000e3\b|";
        objectArray[3] = "$M6Z8'/B'\u0015B#<C7Zt'+";
        objectArray[4] = "z\u0007\t|yuq\b\u00183\u0015v\u007f\n\u001a|9";
        objectArray[5] = Boolean.TYPE;
        e3.r[5] = "java/lang/Boolean";
        objectArray[6] = "'#o\u0000\u0000\u00181#jZ\u0013\u000f&hi\\\u001f\u001b7/~KT\f\b";
        objectArray[7] = ")9\rQq!\"6\u001c\u001e\u0010/)=\u0018D";
        objectArray[8] = "N\u0013\u000b\u0000b\u0007N\u0013\u001c\\n\bTX\u001cBn\u001dS)L\u001f?";
        objectArray[9] = "Ii\u007f\u001a^\u0015IihFR\u001aS\"hXR\u000fTS<\u0000\u0005";
        objectArray[10] = "_WxB~(_Wo\u001er'E\u001co\u0000r2Bm:_+";
        objectArray[11] = "9rYV(M'zC\u0019JQ g";
        objectArray[12] = "Y3m6SmR<|y9nF0w2";
        objectArray[13] = Double.TYPE;
        e3.r[13] = "java/lang/Double";
        objectArray[14] = "\u001463/{\u001c\u001f9\"`\u001c\u001e\n2\"+'";
        objectArray[15] = Integer.TYPE;
        e3.r[15] = "java/lang/Integer";
        objectArray[16] = "\\.2t\u0019BB&(;zVF";
        objectArray[17] = "\u0013\u0010mnV\u0002\r\u0018w!+\u0012\r";
        objectArray[18] = "$!^8\u0006Q:)DwaP+2I-GV";
        objectArray[19] = "\u0018s\u0003AL\u0004\u0018s\u0014\u001d@\u000b\u00028\u0014\u0003@\u001e\u0005IE[\u0012";
        objectArray[20] = "<DmCH\\\"Lw\f%F:I~A\u0012@9K";
        objectArray[21] = "\u0012{C\u0005`j\u0012{TYle\b0TGlp\u000fA\u0006\u001d84";
        objectArray[22] = "md-\u0010t.\u0018D&\u001feayJ-\u0014a;\r";
        objectArray[23] = "\f9}%s\u0016\u001a9x\u007f`\u0001\rr{yl\u0015\u001c5ln'\u0002&";
        objectArray[24] = "\u001ctd\n\\{iTo\u0005M4\bZd\u000eIn|";
        objectArray[25] = "Bi9\u000bx9_|a)94Gz";
        objectArray[26] = "$!\u0002,21/.\u0013cQ<:(";
        objectArray[27] = "M\u0016\u0000\u001d9~[\u0016\u0005G*iL]\u0006A&}]\u001a\u0011Vmol";
        objectArray[28] = "|/\u001e\u001f`\u0005\t\u000f\u0015\u0010qJh\u0001\u001e\u001bu\u0010\u001c";
        objectArray[29] = "_S\u000fcz2*s\u0004lk}K}\u000fgo'?";
        objectArray[30] = "Z\u0000\u00049?\fL\u0000\u0001c,\u001b[K\u0002e \u000fJ\f\u0015rk\u0018\u007f";
        objectArray[31] = "B\u0016^+@876U$QwV8^/U-\"";
        objectArray[32] = Void.TYPE;
        e3.r[32] = "java/lang/Void";
        objectArray[33] = ".X%CME[x.L\\\n:v%GXPN";
        objectArray[34] = Float.TYPE;
        e3.r[34] = "java/lang/Float";
        objectArray[35] = "oiwVK\u0019dff\u0019#\u0019jiu";
        objectArray[36] = "\u001fb\u0017\"MD\u0014m\u0006m0Q\u0006w\u0004.";
        objectArray[37] = Long.TYPE;
        e3.r[37] = "java/lang/Long";
        objectArray[38] = "uT\t+\u0004kk\\\u0013dLkqV\u000b#Ep1e\r/Nw|T\u000b/";
        objectArray[39] = "\u000esI7q\u0000\u000es^k}\u000f\u00148^u}\u001a\u0013I\n-.[";
        objectArray[40] = "5 ;\u001c^_6pc\u001f%H8<E\u001cHJ3@c\u0003Z\u0016//l\u001e@\\U";
        objectArray[41] = "io\u0010cIEd2\tg$Z5a\u0014is\rk6L\u0005\u001aM.3\to@S/4";
        objectArray[42] = "My\u0017lnsC'\r!\u00101M&\tqW!$+\u0011c!5K$\fykOMy\u0017lnsC'\r!\u0010";
        objectArray[43] = "9\u0000q \f..\n\u007ffb'.\u0018\u0012e]f1^n&\u001b19d/g[=i\u0018l!\f5SY-a\u0000e/\u001ak6\b_";
        objectArray[44] = " Xr\u0018i3'JrYQ#\u0019NtT4 xF\u007fX*JyH%\u0012*2z\u0018}\u0011Q";
        objectArray[45] = "E7o\u0015DCR=aS*QB\"W\u0000V2Dk3\u0016OW\u001fbfT*";
        objectArray[46] = "vO=\u0013=\n&JdWG\u0004tM@\u00047\u0018\u001d\rb\u0000$[`W\u007f\u0011~d";
        objectArray[47] = "\u0007\u0001i\t&\u0001[\u000b,XAW\n\u000btY\u0016\u0000P[)5pT\u0017Ww_qEU\u0004";
        objectArray[48] = "U\u001dMn\u001d^\u0011_Ks'O\u0006\u0002Q{`_o]H\u007fD\u000e\u0012\u0007Un\u001e1U\u001dMn\u001d^\u0011_Ks'";
        objectArray[49] = "d;|Kpi3xd\u001b\u0013ggzc\u0016\u007fU6=8A\"\u0002pje\u0018ji:v;\u0017\u0013";
        objectArray[50] = "D-\u001bg1 \u0013n\u00037R.Gl\u0004:>\u001c\u0010+_dmK\u001b}\u0018l5!\u001alZ?R";
        objectArray[51] = "\u000b`80$6\fr8q\u001c&2*2-erKv3+|O\b|39!6T}5 \u001c";
        objectArray[52] = "t]\t\u0016G\u0013w\rQ\u0015<\u0001n\\W\f@\u0006n=X\f\r\u0011oE[\\U\u0012\u0014";
        objectArray[53] = "\u000bsC\\%F_?XWCHPc@JCF\u00047XSyD\u00052W0";
        objectArray[54] = "dhu=X*sb{{60ja\u007f?6>>5g&\f<?0hE";
        objectArray[55] = "bK\u0013\u0003_\u0010&\t\u0015\u001ee\u0015?W\u0016\u0016\f\u0019\u0006Y\u0016\u0006\b\u007fcT\u001b\u0018Z\u00029I\nBe";
        objectArray[56] = "\u0010\"p8D\u0001\u000f1td*\u0015s9n:O\u0011\u00121e6Q{\u0016o7wIA\u0014n2x*";
        objectArray[57] = "2'Q|\u001d8edI,~61fN!\u0012\u0004f!\u0015|GSmwRw\u00199lf\u0010$~";
        objectArray[58] = "(^H#\tkt\u0003\u001d&c{\u0014\u000fIs\u0001(hL\u000f$\t\u0012";
        objectArray[59] = "mjY\u001dWQ:)AM4_n+F@Xm>i\u001c\u00174Sf(\u0017][\\{2]'";
        objectArray[60] = ":!7MYay3v[dd?73I\u0002s\u001e,,I!n&)(_dw9t;\u001f\u0007m241$";
        objectArray[61] = "pg&i\u0011\u0011gm(/\u007f\u000fw\u007f\u0002k3\rtj8u\u0003`'<|sE\u001cdz+{\u007f]%:'+\u0003\u001ecm/\u0011B_#a\u007fm\u0001\u0019tiE";
        objectArray[62] = "s\u0001\u0010\u00148\t#\\IU]Vs\\yC8L#@\u0016L%Vi:\u0010O\"\u0002hU\u001fR8H\u0012S\u001cUlI}\\\u0001O&3";
        objectArray[63] = "\\FXT<@NQ\u00157l#\nK\u001d\u000bj]KF_J\u0006";
        objectArray[64] = "7;\u000351&6tVp^+XlZ7;(9dQ;%B7;\u000351&6tVp^";
        objectArray[65] = "qN\u000f)\\F1A];m\u001a#Q\u0002,\u0001(w\u001d^vS\u007fqP\b'\u000b\u001a%\u001c\u0013,m";
        objectArray[66] = "e|\u0013Ii\u0005f,KJ\u0012\u0012h`x^~}ly]\u0002h\u0012cdGH\u0012";
        objectArray[67] = "9gNm\u000f\u00114:Wib\u000eeiJg5Y:4\u0011\u000b]\u0003if\u001f2\u001d\f;t";
        objectArray[68] = "\\W\u0015pT$\f\nL11{T\u001c|'Ta\f\u0016\u0013(I{Fl\u0015+N/G\u0003\u001a6Te=\u0005\u00191\u0000dR\n\u0004+J\u001e";
        objectArray[69] = "\fM\u007f\u0011/Z\u0001N|AO\u0006[H/D\"4UQ8MO[QItG%Z@\u000b' ";
        objectArray[70] = "\u0017WPe\u0006\u0019I\u0012V>\u007f\tvMH`\u001a\u000f\u0017ECl\u0004e\u0016K\u0019&\u0004\u001d\u0015\u001bA%\u007f";
        objectArray[71] = "\u0001a\u0001c\u007f\u0000V\"\u00193\u001c\u000e\u0002 \u001e>p<UgE`,k^1\u0002h{\u0001_ @;\u001c";
        objectArray[72] = "\u0002fT\u007f\u0011\rHz\nph\u0003\u0015vRq\u00041D1\u000e&Yf\u0000q\u000bdS\u0005\u001azKnh\u001e\u00033@-\u000b\u0004\bsJ\u0016\u0010\u001dAx\tu\n\u0016\u0001r2z\u000f\u001fDm\n&\u0005Z\u0015\n";
        objectArray[73] = "\f\u0007so\u0011b\u0001\u0004p?q,U\u001b436<<N$\"@5VO5`\u0013R\f\u0007so\u0011b\u0001\u0004p?q";
        objectArray[74] = "yl\u0012#uK- \t(\u0013O=\\\u001d7o_F*\u001c&p\u0011;p\u00017*.";
        objectArray[75] = "{5\u0015 \u001b6xeM#`!v)m>\u0018.rUM?\u001f\u007fa:B\"\u00055\u001b";
        objectArray[76] = "kp&a\u001c\u0011;-\u007f yNk-O8CBp038FB3K(e\u0010Qq7(`\u0010\u0012\n,u6\u0003Pv,p6@+";
        objectArray[77] = "'\u001eXq\u0005Ew\u001b\u00015\u007fM!\u0017\u001f\u000bB\u0014u\u0005Yw\u0001R\"\rc";
        objectArray[78] = "\u0016+DbklJ!\u00013\f:\u001b!Y2[mAq\u0005^=9\u0006}Z4<(D.";
        objectArray[79] = "8\u0003r|VIc\n'>3V>G$fUe7_MkAJ7[${\u0003\u00109;vcZOlF,~K\u0015S";
        objectArray[80] = "=_\rD8\u00053\u0001\u0017\tFX2\u00180]\"D9d\u0007Q9\b.\u000b\bL#BT";
        objectArray[81] = "BB\u001aX6+\u0016\u000e\u0001SP'\u0011Sp\tow\u001f\u0005\fJ) \u0017?KP9-BB\u0011M(w}";
        objectArray[82] = "D7SYM%\u0013tK\t.+GvL\u0004B\u0019\u00106\u001cY\u001eN\u0011nE\u0000\u00113KsTZ.";
        objectArray[83] = "4\t%\u001eWS7Y}\u001d,D9\u0015^\u0000QFT\u0000q\u001b\u001dQ;\u000fl\u0001W+";
        objectArray[84] = "h\\\u0004[kVoN\u0004\u001aSEQJ\u0002\u00176E0B\t\u001b(/6\u0016\u000bQ(S6\u0013\u000b\u0012S";
        objectArray[85] = "\u0006D\u0006vguR\b\u001d}\u0001qET\u0016s}wC9\u0007c:jCWWfc.9";
        objectArray[86] = "\u0014~\u001b\u001dI.OwN_,\"\u0013*$[\u0013r\u001d|X\u0018U%\u0015F\u001f\u0002E(@;E\u001fTr\u007f";
        objectArray[87] = "&\u001a\nIUs.\\\u0017Y>,%\u0001\u0000O`+%\u001b\u00043Yx(\u001c\u0012OY}(_i";
        objectArray[88] = "\r\bQ9H;Q\u0002\u0014h/m\u0000\u0002Lix:ZR\u0012\u0005\u001en\u001d^Oo\u001f\u007f_\r";
        objectArray[89] = "Z%N\u0014lF]7NUTVc3HX1U\u0002;CT/?\u000f2QX3\u0007S8\u0014\tT";
        objectArray[90] = "\u0000'f\u0006\reTk}\rkzR?k\u0014\u0006AQZu\u0011V}\u0006`l\u0006Wx?ah\u0003\b?B;u\u0012R\u0000";
        Object[] objectArray2 = objectArray;
        objectArray[91] = "+\u0003\"!xu{^{`\u001d*#HKx'&0C7x\"&s8,%t51D, tvJ_qvg46_tv$O";
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = e3.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00d3' || c == '\u00c0' || c == '\u00e7' || c == '\u00f5') {
                field = e3.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00d3' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00c0' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e7' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = e3.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'm' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'f' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    /*
     * Loose catch block
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private class_243 a(Object[] objectArray) {
        class_1657 class_16572;
        long l;
        class_1657 class_16573;
        block6: {
            class_16573 = (class_1657)objectArray[0];
            l = (Long)objectArray[1];
            l = e3.l ^ l;
            CallSite callSite = e3.c("f", (long)-3593078201307207481L, (long)l);
            class_16572 = class_16573;
            if (callSite != null) return e3.c("m", (Object)e3.c("m", (Object)class_16572, (long)-3593505410591679303L, (long)l), (long)e3.b("d", (int)16660, (long)(0x312339CC0379A9FBL ^ l)), (long)e3.b("d", (int)5306, (long)(0x26C3931A23C07C54L ^ l)), (long)e3.b("d", (int)5306, (long)(0x26C3931A23C07C54L ^ l)), (long)-3585132945475042162L, (long)l);
            try {
                if (class_16572 != e3.c("\u00d3", (Object)b, (long)-3591789446892366358L, (long)l)) break block6;
                return new class_243((double)e3.c("m", (Object)class_16573, (long)-3593384608772574644L, (long)l), (double)e3.c("m", (Object)class_16573, (long)-3585743572283731807L, (long)l), (double)e3.c("m", (Object)class_16573, (long)-3592889415006534314L, (long)l));
                catch (Throwable throwable) {
                    throw e3.c("f", (Object)throwable, (long)-3593341834293571363L, (long)l);
                }
            }
            catch (Throwable throwable) {
                throw e3.c("f", (Object)throwable, (long)-3593341834293571363L, (long)l);
            }
        }
        try {
            class_16572 = class_16573;
            return e3.c("m", (Object)e3.c("m", (Object)class_16572, (long)-3593505410591679303L, (long)l), (long)e3.b("d", (int)16660, (long)(0x312339CC0379A9FBL ^ l)), (long)e3.b("d", (int)5306, (long)(0x26C3931A23C07C54L ^ l)), (long)e3.b("d", (int)5306, (long)(0x26C3931A23C07C54L ^ l)), (long)-3585132945475042162L, (long)l);
        }
        catch (Throwable throwable) {
            return new class_243((double)e3.c("m", (Object)class_16573, (long)-3593384608772574644L, (long)l), (double)e3.c("m", (Object)class_16573, (long)-3585743572283731807L, (long)l), (double)e3.c("m", (Object)class_16573, (long)-3592889415006534314L, (long)l));
        }
    }

    private static Color a(Object[] objectArray) {
        Color color = (Color)objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        long l = (Long)objectArray[2];
        l = e3.l ^ l;
        CallSite callSite = e3.c("f", (int)0, (int)e3.c("f", (int)((int)m), (int)((int)((float)e3.c("m", (Object)color, (long)3733134746664525913L, (long)l) * f)), (long)3734479530122888590L, (long)l), (long)3732701019778449432L, (long)l);
        return new Color((int)e3.c("m", (Object)color, (long)3732530219971486496L, (long)l), (int)e3.c("m", (Object)color, (long)3735195871247833871L, (long)l), (int)e3.c("m", (Object)color, (long)3731501384086345992L, (long)l), (int)callSite);
    }

    @bP
    public void a(bG bG2) {
        block24: {
            CallSite callSite;
            long l;
            long l2 = l = e3.l ^ 0x38CC1FCD8749L;
            long l3 = l2 ^ 0x311278701034L;
            long l4 = l2 ^ 0x1573DA504964L;
            CallSite callSite2 = e3.c("f", (long)232372273336919516L, (long)l);
            try {
                if (e3.c("\u00d3", (Object)b, (long)227012207244689103L, (long)l) == null) {
                    return;
                }
            }
            catch (MatchException matchException) {
                throw e3.c("f", (Object)matchException, (long)232706772461575622L, (long)l);
            }
            HashSet hashSet = new HashSet();
            CallSite callSite3 = e3.c("m", (Object)e3.c("m", (Object)e3.c("\u00d3", (Object)b, (long)227012207244689103L, (long)l), (long)226883044291147467L, (long)l), (long)226025005663801105L, (long)l);
            while (e3.c("m", (Object)callSite3, (long)233601456953571897L, (long)l) != false) {
                block27: {
                    Object object;
                    CallSite callSite4;
                    CallSite callSite5;
                    CallSite callSite6;
                    block28: {
                        CallSite callSite7;
                        CallSite callSite8;
                        CallSite callSite9;
                        block30: {
                            reference var20_15;
                            block29: {
                                block25: {
                                    class_1657 class_16572 = (class_1657)e3.c("m", (Object)callSite3, (long)226601481807625631L, (long)l);
                                    callSite6 = e3.c("m", (Object)class_16572, (long)232145589535257069L, (long)l);
                                    e3.c("m", hashSet, (Object)e3.c("f", (int)callSite6, (long)233338917882975722L, (long)l), (long)226273345702651870L, (long)l);
                                    CallSite callSite10 = e3.c("m", (Object)((Boolean)((Object)e3.c("m", (Object)this.i, (Object)e3.c("f", (int)callSite6, (long)233338917882975722L, (long)l), (Object)e3.c("f", (boolean)false, (long)232584945393609709L, (long)l), (long)232286592573297572L, (long)l))), (long)232972051228479623L, (long)l);
                                    callSite5 = e3.c("m", (Object)class_16572, (long)226014677466193903L, (long)l);
                                    Object[] objectArray = new Object[2];
                                    objectArray[1] = l4;
                                    objectArray[0] = class_16572;
                                    callSite9 = e3.c("m", (Object)this, (Object)objectArray, (long)225194282372739595L, (long)l);
                                    callSite4 = e3.c("\u00d3", (Object)callSite9, (long)233525643596743647L, (long)l);
                                    callSite8 = e3.c("m", (Object)((Double)((Object)e3.c("m", (Object)this.j, (Object)e3.c("f", (int)callSite6, (long)233338917882975722L, (long)l), (Object)e3.c("f", (double)callSite4, (long)226338648591209912L, (long)l), (long)232286592573297572L, (long)l))), (long)227180283614553425L, (long)l);
                                    var20_15 = callSite4 - callSite8;
                                    try {
                                        block26: {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            callSite = e3.c("m", (Object)((Boolean)((Object)e3.c("m", (Object)this.d, (long)232168011575360023L, (long)l))), (long)232972051228479623L, (long)l);
                                                            if (callSite2 != null) break block24;
                                                            if (callSite2 != null) break block25;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw e3.c("f", (Object)matchException, (long)232706772461575622L, (long)l);
                                                        }
                                                        if (callSite == false) break block26;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw e3.c("f", (Object)matchException, (long)232706772461575622L, (long)l);
                                                    }
                                                    object = class_16572;
                                                    if (callSite2 != null) break block27;
                                                }
                                                catch (MatchException matchException) {
                                                    throw e3.c("f", (Object)matchException, (long)232706772461575622L, (long)l);
                                                }
                                                if (object != e3.c("\u00d3", (Object)b, (long)233124740787345649L, (long)l)) break block28;
                                            }
                                            catch (MatchException matchException) {
                                                throw e3.c("f", (Object)matchException, (long)232706772461575622L, (long)l);
                                            }
                                        }
                                        callSite7 = callSite10;
                                    }
                                    catch (MatchException matchException) {
                                        throw e3.c("f", (Object)matchException, (long)232706772461575622L, (long)l);
                                    }
                                }
                                try {
                                    if (callSite2 != null) break block29;
                                    if (callSite7 == false) break block28;
                                }
                                catch (MatchException matchException) {
                                    throw e3.c("f", (Object)matchException, (long)232706772461575622L, (long)l);
                                }
                                callSite7 = callSite5;
                            }
                            try {
                                try {
                                    if (callSite2 != null) break block30;
                                    if (callSite7 != false) break block28;
                                }
                                catch (MatchException matchException) {
                                    throw e3.c("f", (Object)matchException, (long)232706772461575622L, (long)l);
                                }
                                reference cfr_temp_0 = var20_15 - 0.05;
                                callSite7 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 > 0 ? 1 : -1);
                            }
                            catch (MatchException matchException) {
                                throw e3.c("f", (Object)matchException, (long)232706772461575622L, (long)l);
                            }
                        }
                        try {
                            try {
                                if (callSite2 != null || callSite7 <= 0) break block28;
                            }
                            catch (MatchException matchException) {
                                throw e3.c("f", (Object)matchException, (long)232706772461575622L, (long)l);
                            }
                            callSite7 = e3.c("m", (Object)this.k, (Object)new ct_0(new class_243((double)e3.c("\u00d3", (Object)callSite9, (long)225266667143423899L, (long)l), (double)callSite8, (double)e3.c("\u00d3", (Object)callSite9, (long)226836056765683639L, (long)l)), (int)e3.c("m", (Object)((Integer)((Object)e3.c("m", (Object)this.c, (long)232168011575360023L, (long)l))), (long)225857732817003527L, (long)l), l3), (long)225767789555118565L, (long)l);
                        }
                        catch (MatchException matchException) {
                            throw e3.c("f", (Object)matchException, (long)232706772461575622L, (long)l);
                        }
                    }
                    e3.c("m", (Object)this.i, (Object)e3.c("f", (int)callSite6, (long)233338917882975722L, (long)l), (Object)e3.c("f", (boolean)callSite5, (long)232584945393609709L, (long)l), (long)233243893210550841L, (long)l);
                    object = e3.c("m", (Object)this.j, (Object)e3.c("f", (int)callSite6, (long)233338917882975722L, (long)l), (Object)e3.c("f", (double)callSite4, (long)226338648591209912L, (long)l), (long)233243893210550841L, (long)l);
                }
                if (callSite2 == null) continue;
            }
            e3.c("m", (Object)e3.c("m", (Object)this.i, (long)233360217214080886L, (long)l), hashSet, (long)226769949223025386L, (long)l);
            callSite = e3.c("m", (Object)e3.c("m", (Object)this.j, (long)233360217214080886L, (long)l), hashSet, (long)226769949223025386L, (long)l);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @bP
    public void a(bt_0 var1_1) {
        block20: {
            block18: {
                block19: {
                    block16: {
                        block17: {
                            v0 = var2_2 = e3.l ^ 84604398582856L;
                            var4_3 = v0 ^ 115564228709377L;
                            var6_4 = v0 ^ 83242927958173L;
                            var8_5 = v0 ^ 123310052511636L;
                            var11_6 = e3.c("f", (long)4051045333511714860L, (long)var2_2);
                            v1 = e3.c("f", (long)4051262088133713629L, (long)var2_2);
                            e3.c("m", (Object)this.k, (Predicate<ct_0>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lambda$onRenderWorld$1(long dev.zprestige.prestige.ct_0 ), (Ldev/zprestige/prestige/ct;)Z)((long)var11_6), (long)4044662806919859004L, (long)var2_2);
                            var10_7 = v1;
                            try {
                                v2 = e3.c("m", (Object)this.k, (long)4045808363879390689L, (long)var2_2);
                                if (var10_7 != null) break block16;
                                if (v2 == false) break block17;
                            }
                            catch (MatchException v3) {
                                throw e3.c("f", (Object)v3, (long)4052054038872876743L, (long)var2_2);
                            }
                            return;
                        }
                        try {
                            v4 = (Boolean)e3.c("m", (Object)this.g, (long)4051453705344139542L, (long)var2_2);
                            if (var10_7 != null) break block18;
                            v2 = e3.c("m", (Object)v4, (long)4051791499451657094L, (long)var2_2);
                        }
                        catch (MatchException v5) {
                            throw e3.c("f", (Object)v5, (long)4052054038872876743L, (long)var2_2);
                        }
                    }
                    try {
                        if (v2 == false) break block19;
                        v6 = new Object[1];
                        v6[0] = var4_3;
                        v7 = e3.c("f", (Object)v6, (long)4046096951655396647L, (long)var2_2);
                        break block20;
                    }
                    catch (MatchException v8) {
                        throw e3.c("f", (Object)v8, (long)4052054038872876743L, (long)var2_2);
                    }
                }
                v4 = e3.c("m", (Object)this.h, (long)4051453705344139542L, (long)var2_2);
            }
            v7 = (Color)v4;
        }
        var13_8 = v7;
        var14_9 = e3.c("m", (Object)var13_8, (long)4051560468216384290L, (long)var2_2);
        var15_10 = e3.c("m", (Object)((Float)e3.c("m", (Object)this.e, (long)4051453705344139542L, (long)var2_2)), (long)4045059753057672299L, (long)var2_2);
        var16_11 = e3.c("m", (Object)((Float)e3.c("m", (Object)this.f, (long)4051453705344139542L, (long)var2_2)), (long)4045059753057672299L, (long)var2_2);
        var17_12 = e3.c("m", (Object)((Float)e3.c("m", (Object)this.a, (long)4051453705344139542L, (long)var2_2)), (long)4045059753057672299L, (long)var2_2);
        var18_13 = e3.c("m", (Object)this.k, (long)4044923740031579152L, (long)var2_2);
        while (e3.c("m", (Object)var18_13, (long)4052289102277050680L, (long)var2_2) != false) {
            block24: {
                block23: {
                    block22: {
                        block21: {
                            var19_14 = (ct_0)e3.c("m", (Object)var18_13, (long)4045491297684440734L, (long)var2_2);
                            var20_15 = (float)(var11_6 - var19_14.b) / (float)var19_14.c;
                            try {
                                cfr_temp_0 = var20_15 - 0.0f;
                                v9 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1);
                                if (var10_7 != null) break block21;
                                if (v9 < 0) continue;
                            }
                            catch (MatchException v10) {
                                throw e3.c("f", (Object)v10, (long)4052054038872876743L, (long)var2_2);
                            }
                            try {
                                v11 = var20_15;
                                v12 /* !! */  = 1.0f;
                                if (var10_7 != null) break block22;
                                cfr_temp_1 = v11 - v12 /* !! */ ;
                                v9 = cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1);
                            }
                            catch (MatchException v13) {
                                throw e3.c("f", (Object)v13, (long)4052054038872876743L, (long)var2_2);
                            }
                        }
                        if (v9 > 0) continue;
                        v11 = 0.1f;
                        v12 /* !! */  = (float)((var17_12 - 0.1f) * e3.c("f", (Object)new Object[]{Float.valueOf(var20_15)}, (long)4044845294458357756L, (long)var2_2));
                    }
                    var21_16 = v11 + v12 /* !! */ ;
                    try {
                        v14 = var20_15;
                        v15 = 0.2f;
                        if (var10_7 != null) break block23;
                        if (v14 < v15) {
                        }
                        ** GOTO lbl86
                    }
                    catch (MatchException v16) {
                        throw e3.c("f", (Object)v16, (long)4052054038872876743L, (long)var2_2);
                    }
                    var22_17 /* !! */  = var20_15 / 0.2f;
                    try {
                        if (var10_7 == null) break block24;
lbl86:
                        // 2 sources

                        v14 = 1.0f;
                        v15 = (var20_15 - 0.2f) / 0.8f;
                    }
                    catch (MatchException v17) {
                        throw e3.c("f", (Object)v17, (long)4052054038872876743L, (long)var2_2);
                    }
                }
                var22_17 /* !! */  = v14 - v15;
            }
            var22_17 /* !! */  = (float)e3.c("f", (float)0.0f, (float)e3.c("f", (float)1.0f, (float)var22_17 /* !! */ , (long)4045410624823816944L, (long)var2_2), (long)4044731490642729029L, (long)var2_2);
            v18 = new Object[3];
            v18[2] = var8_5;
            v18[1] = Float.valueOf(var22_17 /* !! */ );
            v18[0] = var14_9;
            var23_18 = e3.c("f", (Object)v18, (long)4052153917175070528L, (long)var2_2);
            v19 = new Object[3];
            v19[2] = var8_5;
            v19[1] = Float.valueOf(var22_17 /* !! */ );
            v19[0] = var13_8;
            var24_19 = e3.c("f", (Object)v19, (long)4052153917175070528L, (long)var2_2);
            v20 = new Object[11];
            v20[10] = var6_4;
            v20[9] = var24_19;
            v20[8] = var23_18;
            v20[7] = Float.valueOf((float)var16_11);
            v20[6] = Float.valueOf((float)var15_10);
            v20[5] = Float.valueOf(var21_16);
            v20[4] = Float.valueOf((float)e3.c("\u00d3", (Object)var19_14.a, (long)4045523358485769398L, (long)var2_2));
            v20[3] = Float.valueOf((float)e3.c("\u00d3", (Object)var19_14.a, (long)4052345124017240286L, (long)var2_2));
            v20[2] = Float.valueOf((float)e3.c("\u00d3", (Object)var19_14.a, (long)4044578714804280474L, (long)var2_2));
            v20[1] = var1_1.a;
            v20[0] = var1_1.b;
            e3.c("f", (Object)v20, (long)4051312431827833759L, (long)var2_2);
            if (var10_7 == null) continue;
        }
    }

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (r[n3] != null) {
            return n3;
        }
        Object object = q[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 45;
            case 1 -> 25;
            case 2 -> 46;
            case 3 -> 50;
            case 4 -> 4;
            case 5 -> 39;
            case 6 -> 0;
            case 7 -> 47;
            case 8 -> 53;
            case 9 -> 40;
            case 10 -> 36;
            case 11 -> 55;
            case 12 -> 20;
            case 13 -> 33;
            case 14 -> 9;
            case 15 -> 34;
            case 16 -> 61;
            case 17 -> 51;
            case 18 -> 11;
            case 19 -> 42;
            case 20 -> 32;
            case 21 -> 38;
            case 22 -> 2;
            case 23 -> 28;
            case 24 -> 10;
            case 25 -> 13;
            case 26 -> 5;
            case 27 -> 52;
            case 28 -> 15;
            case 29 -> 16;
            case 30 -> 24;
            case 31 -> 6;
            case 32 -> 3;
            case 33 -> 19;
            case 34 -> 54;
            case 35 -> 21;
            case 36 -> 37;
            case 37 -> 30;
            case 38 -> 35;
            case 39 -> 48;
            case 40 -> 7;
            case 41 -> 29;
            case 42 -> 27;
            case 43 -> 59;
            case 44 -> 8;
            case 45 -> 23;
            case 46 -> 44;
            case 47 -> 60;
            case 48 -> 43;
            case 49 -> 57;
            case 50 -> 49;
            case 51 -> 41;
            case 52 -> 1;
            case 53 -> 56;
            case 54 -> 22;
            case 55 -> 58;
            case 56 -> 62;
            case 57 -> 12;
            case 58 -> 26;
            case 59 -> 14;
            case 60 -> 17;
            case 61 -> 18;
            case 62 -> 31;
            default -> 63;
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
        e3.r[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = e3.m(l, l2);
        Object object = q[n];
        if (object instanceof String) {
            String string = r[n];
            int n2 = string.indexOf(8);
            Class clazz = e3.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = e3.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = e3.g(clazz3, string2, clazz2)) != null) {
                    e3.q[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = e3.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        e3.q[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = e3.n(527667446844551L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = e3.m(l, l2);
        Object object = q[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = r[n];
                int n3 = string2.indexOf(8);
                clazz3 = e3.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = e3.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = e3.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        e3.q[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = e3.n(527667446844551L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = e3.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        e3.q[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = e3.n(527667446844551L, 0L);
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

    private boolean lambda$new$0(Color color) {
        Object object;
        block2: {
            block3: {
                long l = e3.l ^ 0x5FBB9105563L;
                CallSite callSite = e3.c("f", (long)-3381164907369564170L, (long)l);
                try {
                    object = e3.c("m", (Object)((Boolean)((Object)e3.c("m", (Object)this.g, (long)-3381377981171259331L, (long)l))), (long)-3381759190425107795L, (long)l);
                    if (callSite != null) break block2;
                    if (object != false) break block3;
                }
                catch (MatchException matchException) {
                    throw e3.c("f", (Object)matchException, (long)-3382061877290102804L, (long)l);
                }
                object = 1;
                break block2;
            }
            object = 0;
        }
        return (boolean)object;
    }

    private static boolean lambda$onRenderWorld$1(long l, ct_0 ct_02) {
        long l2;
        block2: {
            block3: {
                long l3 = e3.l ^ 0x773CA7116431L;
                CallSite callSite = e3.c("f", (long)-2287333103293086044L, (long)l3);
                try {
                    long l4 = l - ct_02.b - (long)ct_02.c;
                    l2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                    if (callSite != null) break block2;
                    if (l2 < 0) break block3;
                }
                catch (MatchException matchException) {
                    throw e3.c("f", (Object)matchException, (long)-2286999153102111042L, (long)l3);
                }
                l2 = 1;
                break block2;
            }
            l2 = 0;
        }
        return (boolean)l2;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(e3.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)J", null));
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
            return MethodHandles.lookup().findStatic(e3.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


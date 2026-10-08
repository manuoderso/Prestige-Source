/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_310
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.bG;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.dO;
import dev.zprestige.prestige.dR;
import dev.zprestige.prestige.dV;
import dev.zprestige.prestige.dn_0;
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
import net.minecraft.class_310;

/*
 * Renamed from dev.zprestige.prestige.el
 */
public class el_0
extends dV {
    private dR a;
    private dO c;
    private dO d;
    private f5 e;
    private static final long k = hc.a(1774043910847273377L, 7279813860122718437L, MethodHandles.lookup().lookupClass()).a(122030579090231L);
    private static final String[] l;
    private static final String[] m;
    private static final Map n;
    private static final long o;
    private static final Object[] p;
    private static final String[] q;

    public el_0() {
        long l = k ^ 0x1B5477BFC7CAL;
        long l2 = l ^ 0x79308346939EL;
        this.e = new f5(l2);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        p = new Object[50];
        q = new String[50];
        el_0.f();
        n = new HashMap(13);
        long l = k ^ 0x27B7A8FBFF57L;
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
        String string = "\u00b5q\u0001:\u0002\u00a17j\u00c2\u00d7\u00fd\u00ecb\u001b\u009f_\u0010=\u009c\u00ed_\u00ccy\u0018\u008d\u007f<\u00ad\u00a5\u0091U\u00f8\u0095";
        int n2 = "\u00b5q\u0001:\u0002\u00a17j\u00c2\u00d7\u00fd\u00ecb\u001b\u009f_\u0010=\u009c\u00ed_\u00ccy\u0018\u008d\u007f<\u00ad\u00a5\u0091U\u00f8\u0095".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = el_0.b(byArray3).intern();
            if ((n4 += n3) >= n2) break;
            n3 = string.charAt(n4);
        }
        el_0.l = stringArray;
        m = new String[2];
        Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
        byte[] byArray4 = new byte[8];
        byte[] byArray5 = byArray4;
        byArray4[0] = (byte)(l >>> 56);
        int n6 = 1;
        while (true) {
            if (n6 >= 8) {
                cipher2.init(2, (Key)secretKeyFactory2.generateSecret(new DESKeySpec(byArray5)), new IvParameterSpec(new byte[8]));
                long l2 = -4836632706543798277L;
                byte[] byArray6 = cipher2.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                o = ((long)byArray6[0] & 0xFFL) << 56 | ((long)byArray6[1] & 0xFFL) << 48 | ((long)byArray6[2] & 0xFFL) << 40 | ((long)byArray6[3] & 0xFFL) << 32 | ((long)byArray6[4] & 0xFFL) << 24 | ((long)byArray6[5] & 0xFFL) << 16 | ((long)byArray6[6] & 0xFFL) << 8 | (long)byArray6[7] & 0xFFL;
                return;
            }
            byArray5 = byArray5;
            byArray5[n6] = (byte)(l << n6 * 8 >>> 56);
            ++n6;
        }
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

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1FC;
        if (m[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])el_0.n.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    el_0.n.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/el", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = el_0.l[n2].getBytes("ISO-8859-1");
            el_0.m[n2] = el_0.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return m[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = el_0.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/el" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/el" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = el_0.m(l, l2);
            object = p[n];
            try {
                if (!(object instanceof String)) break block2;
                el_0.p[n] = clazz = Class.forName(q[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = el_0.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = el_0.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = el_0.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = el_0.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = p;
        p[0] = "%:5l\"\"3:0615$q30=!56$'v6\n";
        objectArray[1] = "z\u000e\u0019\u0007\"^q\u0001\bHCPz\n\f\u0012";
        objectArray[2] = "Y\n=t\\\fR\u0005,;!\u0014A\u0002%r";
        objectArray[3] = Boolean.TYPE;
        el_0.q[3] = "java/lang/Boolean";
        objectArray[4] = "e{\u0000>oGs{\u0005d|Pd0\u0006bpDuw\u0011u;VI";
        objectArray[5] = "\u001b\u001c;'\u000bsn<0(\u001a<\u0013$#/\u0013u{";
        objectArray[6] = "N\u00145OA-N\u0014\"\u0013M\"T_\"\rM7S.rP\u001c";
        objectArray[7] = "1U\r7'\u001b1U\u001ak+\u0014+\u001e\u001au+\u0001,oN-|";
        objectArray[8] = "\u001b]W\u007f\u0010Z\r]R%\u0003M\u001a\u0016Q#\u000fY\u000bQF4DLJ";
        objectArray[9] = "\t\u001d\u001e\f\u0005*|=\u0015\u0003\u0014e\u001d3\u001e\b\u0010?i";
        objectArray[10] = Float.TYPE;
        el_0.q[10] = "java/lang/Float";
        objectArray[11] = "Oj\u000e\"\u0011^Yj\u000bx\u0002IN!\b~\u000e]_f\u001fiEMD";
        objectArray[12] = "\u0000ghl\u001d5uGcc\fz\u0014Ihh\b `";
        objectArray[13] = "\u001e_pg\u0007N\u0015Pa(`L\u0000[ac[";
        objectArray[14] = Integer.TYPE;
        el_0.q[14] = "java/lang/Integer";
        objectArray[15] = "C?9\u001b\\tC?.GP{Yt.YPn^\u0005|\u0007\b)";
        objectArray[16] = "\u0017*\u0004\u0015Pe\u0017*\u0013I\\j\ra\u0013W\\\u007f\n\u0010F\u0003\u0005<";
        objectArray[17] = "+^\u001fJX>+^\b\u0016T11\u0015\b\bT$6d_W\u0002";
        objectArray[18] = "5'\u0007K>U+/\u001d\u0004BA1\"\u001eG";
        objectArray[19] = "a`Z'\u001a\u0002w`_}\t\u0015`+\\{\u0005\u0001qlKlN\u0017i";
        objectArray[20] = "\u0019\u001c\u0004Oqm\u0012\u0013\u0015\u0000\u0012`\u0007\u001e\u001ak'b\u0016\r\u0006G0o";
        objectArray[21] = "iNJ\u0015!\u0014iN]I-\u001bs\u0005]W-\u000ett\u000f\tzE";
        objectArray[22] = "\f\u001a<bKo\u0007\u0015--#o\t\u001a>";
        objectArray[23] = "[\u001d\u0007\u0010[\u001bM\u001d\u0002JH\fZV\u0001LD\u0018K\u0011\u0016[\u000f\bM";
        objectArray[24] = "gqeNU2\u0012QnAD}s_eJ@'\u0007";
        objectArray[25] = Void.TYPE;
        el_0.q[25] = "java/lang/Void";
        objectArray[26] = "0q,-\u0010bEQ'\"\u0001-$_,)\u0005wP";
        objectArray[27] = "Y\u0007Nv9\u0010,'Ey(_M)Nr,\u00059";
        objectArray[28] = "l\r3tT6r\u0005);)&r";
        objectArray[29] = "uQ\u0005lTr4\\G~9%O\u001bU`G&-IViPO";
        objectArray[30] = "C6K~6/E3\u00138P'\u001e8\u0014i\u0007p@oL\u0005mvA1\u001f?.&\u000e7";
        objectArray[31] = ">\u0000XNP\u001an\u0017\u000eM:\u0014\u0003\u001b@PJAn\u0004SC\u000b}9J\\R\u0005\u0007jFN]:";
        objectArray[32] = "\u0014\u00157j-\u0016WExlBIDVii.{\u0017\u001224B\u0013E\u001664$E\u0014G3\u000e";
        objectArray[33] = ".\u0014loD\n.\u0002{={\u0004\u0011\u0004xo\u000bS|\u001bk|Jo+UdmD\u0015xYvb{";
        objectArray[34] = "\t{SB1UT(N\u001d\u0000P^7j\u0016dLUK\u0005\u0002xL^,UEl\b8";
        objectArray[35] = ";\u0002}\u0013+[xR2\u0015D\u0004kA#\u0010(6=\u0003\u007fJya9Q\u007fH~\u0007o\u0000.MD";
        objectArray[36] = "-M\"Z^> \u0016 \u0004`m%D!\b7>u\u0010xd\nh#H8\u000f_n;\u0014";
        objectArray[37] = " %Q#\u0000*& \tef\"}+\u000e41u#{WX\r u(\u00076\r+m?";
        objectArray[38] = "\u0004L\u001bg0x\u0014@\u001biKf\u0002]\fW/g\u0006Qp&'<P\u0017\u0016pvmU-";
        objectArray[39] = "mMx^X}<Np\u0000`*\u0001YoF\u0010sh^dC_Cl[}KP*kPx\u0004`";
        objectArray[40] = "\u0011/>\u0018\u0013\u001e\u0010yj\u001aq\u0002\u001e~0N&QO+d\"\u001fP\u0015)6P\u001e\u0006A+";
        objectArray[41] = "mp\u0000e\u0005[3cS\u000f\u0006'd;Xi\u0015Z,nRvo";
        objectArray[42] = "{\n'\n\u0013Kg_vOuHq\u0006vM+Oq\u001cr1JJ)^%W\u001c\u001bx[\u001f";
        objectArray[43] = "K\u001b`*\u0014j\u0011Kewd7F!8,\r6R\\py\u0007)(B;wX \u0012\u0018kr\u0005P";
        objectArray[44] = "\u0013^$\u0000@\r\u001d\u0005:\u0010\"\t|Z8\u0012R_\u0011E+\u0001\u0013c\u001cC)GLY\u0005T*@\"";
        objectArray[45] = "\u0019\u0014ihn\u0003\\J77V\rY\rn5-`\u0019Jn7,\u001dQ\u001fd(VZ\u0010\u0013jn,\t\u001c\u0001eQ";
        objectArray[46] = "R^\u0013u-U\u0002IEvG[oE\u000bk7\u000e\u0002Z\u0018xv2\u000f\\\u001a>)\b\u0016K\u00199G";
        objectArray[47] = "t@\u0005lilrE]*\u000fo%_^pc]q\u001e\u0000&\u000f0x@S(uctR\\\u0017";
        objectArray[48] = ":wQ|]:y'\u001ez2ej4\u000f\u007f^W<vS%\r\u00008$S'\bfnu\u0002\"2`\u007f&Uv\byh%R\u0018";
        Object[] objectArray2 = objectArray;
        objectArray[49] = "\u001a\b)kG\u0005\u0014S7{%\u0006u\f5yUW\u0018\u0013&j\u0014kD]-+\u0014\u000f\u0019\u000e0t%";
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = el_0.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00eb' || c == 'G' || c == '\u00db' || c == '\u00de') {
                field = el_0.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00eb' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'G' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00db' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = el_0.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e1' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00f1' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    @bP
    public void a(bG bG2) {
        block34: {
            long l;
            long l2;
            long l3;
            block31: {
                CallSite callSite;
                CallSite callSite2;
                long l4;
                block32: {
                    CallSite callSite3;
                    block33: {
                        CallSite callSite4;
                        long l5;
                        block30: {
                            block28: {
                                CallSite callSite5;
                                block29: {
                                    block26: {
                                        long l6;
                                        block27: {
                                            CallSite callSite6;
                                            block24: {
                                                block25: {
                                                    block23: {
                                                        class_310 class_3102;
                                                        block22: {
                                                            long l7 = l3 = k ^ 0x34C1E4A222AFL;
                                                            l4 = l7 ^ 0x71A353C52DE4L;
                                                            l2 = l7 ^ 0x145FDBC792FBL;
                                                            l5 = l7 ^ 0x4E6D156B0E0DL;
                                                            l = l7 ^ 0x534E2A33AA44L;
                                                            l6 = l7 ^ 0x430B8280AA6AL;
                                                            callSite2 = el_0.c("\u00f1", (long)-8259267915024158787L, (long)l3);
                                                            try {
                                                                try {
                                                                    class_3102 = b;
                                                                    if (callSite2 != null) break block22;
                                                                    if (el_0.c("\u00eb", (Object)class_3102, (long)-8255331166848644034L, (long)l3) != null) break block23;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw el_0.c("\u00f1", (Object)matchException, (long)-8255238537605205372L, (long)l3);
                                                                }
                                                                class_3102 = b;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw el_0.c("\u00f1", (Object)matchException, (long)-8255238537605205372L, (long)l3);
                                                            }
                                                        }
                                                        try {
                                                            callSite6 = el_0.c("\u00e1", (Object)class_3102, (long)-8255737722211115324L, (long)l3);
                                                            if (callSite2 != null) break block24;
                                                            if (callSite6 != false) break block25;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw el_0.c("\u00f1", (Object)matchException, (long)-8255238537605205372L, (long)l3);
                                                        }
                                                    }
                                                    return;
                                                }
                                                callSite6 = el_0.c("\u00e1", (String)((Object)el_0.c("\u00e1", (Object)this.a, (long)-8256209176232886010L, (long)l3)), (Object)el_0.b("m", (int)25597, (long)(0x6939D04B5C44EF66L ^ l3)), (long)-8255880161482475752L, (long)l3);
                                            }
                                            callSite5 = callSite6;
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            callSite4 = callSite5;
                                                            if (callSite2 != null) break block26;
                                                            if (callSite4 == false) break block27;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw el_0.c("\u00f1", (Object)matchException, (long)-8255238537605205372L, (long)l3);
                                                        }
                                                        reference cfr_temp_0 = el_0.c("\u00e1", (Object)el_0.c("\u00eb", (Object)b, (long)-8259055139202549582L, (long)l3), (long)-8255574135922247896L, (long)l3) - el_0.c("\u00e1", (Object)((Float)((Object)el_0.c("\u00e1", (Object)this.c, (long)-8256209176232886010L, (long)l3))), (long)-8255964248036815404L, (long)l3);
                                                        callSite4 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 > 0 ? 1 : -1);
                                                        if (callSite2 != null) break block26;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw el_0.c("\u00f1", (Object)matchException, (long)-8255238537605205372L, (long)l3);
                                                    }
                                                    if (callSite4 <= 0) break block27;
                                                }
                                                catch (MatchException matchException) {
                                                    throw el_0.c("\u00f1", (Object)matchException, (long)-8255238537605205372L, (long)l3);
                                                }
                                                Object[] objectArray = new Object[1];
                                                objectArray[0] = l2;
                                                el_0.c("\u00e1", (Object)this.e, (Object)objectArray, (long)-8255675777052804053L, (long)l3);
                                                return;
                                            }
                                            catch (MatchException matchException) {
                                                throw el_0.c("\u00f1", (Object)matchException, (long)-8255238537605205372L, (long)l3);
                                            }
                                        }
                                        Object[] objectArray = new Object[2];
                                        objectArray[1] = l6;
                                        objectArray[0] = Float.valueOf(300.0f);
                                        callSite4 = el_0.c("\u00e1", (Object)this.e, (Object)objectArray, (long)-8259133750134297118L, (long)l3);
                                    }
                                    try {
                                        if (callSite2 != null) break block28;
                                        if (callSite4 != false) break block29;
                                    }
                                    catch (MatchException matchException) {
                                        throw el_0.c("\u00f1", (Object)matchException, (long)-8255238537605205372L, (long)l3);
                                    }
                                    return;
                                }
                                callSite4 = callSite5;
                            }
                            try {
                                if (callSite2 != null) break block30;
                                if (callSite4 == false) break block31;
                            }
                            catch (MatchException matchException) {
                                throw el_0.c("\u00f1", (Object)matchException, (long)-8255238537605205372L, (long)l3);
                            }
                            callSite4 = (CallSite)0;
                        }
                        Object[] objectArray = new Object[4];
                        objectArray[3] = l5;
                        objectArray[2] = el_0.c("\u00db", (long)-8255262799773824949L, (long)l3);
                        objectArray[1] = (int)o;
                        objectArray[0] = (int)callSite4;
                        callSite3 = el_0.c("\u00f1", (Object)objectArray, (long)-8256776329367590044L, (long)l3);
                        try {
                            callSite = callSite3;
                            if (callSite2 != null) break block32;
                            if (callSite != null) break block33;
                        }
                        catch (MatchException matchException) {
                            throw el_0.c("\u00f1", (Object)matchException, (long)-8255238537605205372L, (long)l3);
                        }
                        return;
                    }
                    callSite = callSite3;
                }
                Object[] objectArray = new Object[4];
                objectArray[3] = l4;
                objectArray[2] = true;
                objectArray[1] = this::lambda$onTick$1;
                objectArray[0] = (int)el_0.c("\u00e1", (Object)callSite, (long)-8255383268185127133L, (long)l3);
                el_0.c("\u00f1", (Object)objectArray, (long)-8255866016710957705L, (long)l3);
                Object[] objectArray2 = new Object[1];
                objectArray2[0] = l2;
                el_0.c("\u00e1", (Object)this.e, (Object)objectArray2, (long)-8255675777052804053L, (long)l3);
                if (callSite2 == null) break block34;
            }
            CallSite callSite = el_0.c("\u00e1", (Object)el_0.c("\u00eb", (Object)b, (long)-8259055139202549582L, (long)l3), (long)-8255488980589136142L, (long)l3);
            el_0.c("\u00e1", (Object)el_0.c("\u00eb", (Object)b, (long)-8259055139202549582L, (long)l3), (float)(el_0.c("\u00e1", (Object)((Float)((Object)el_0.c("\u00e1", (Object)this.d, (long)-8256209176232886010L, (long)l3))), (long)-8255964248036815404L, (long)l3) - 1.0f + el_0.c("\u00e1", (Object)dn_0.a, (long)-8255105257297709092L, (long)l3)), (long)-8256707659878358720L, (long)l3);
            Object[] objectArray = new Object[2];
            objectArray[1] = l;
            objectArray[0] = el_0.c("\u00db", (long)-8256107987634192160L, (long)l3);
            el_0.c("\u00f1", (Object)objectArray, (long)-8255652832102654606L, (long)l3);
            el_0.c("\u00e1", (Object)el_0.c("\u00eb", (Object)b, (long)-8259055139202549582L, (long)l3), (float)callSite, (long)-8256707659878358720L, (long)l3);
            Object[] objectArray3 = new Object[1];
            objectArray3[0] = l2;
            el_0.c("\u00e1", (Object)this.e, (Object)objectArray3, (long)-8255675777052804053L, (long)l3);
        }
    }

    @Override
    public Set a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return el_0.c("\u00f1", (Object)((Object)q_0.UHC), (long)-2446891807474231176L, (long)l);
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
            case 0 -> 0;
            case 1 -> 38;
            case 2 -> 30;
            case 3 -> 42;
            case 4 -> 18;
            case 5 -> 29;
            case 6 -> 25;
            case 7 -> 52;
            case 8 -> 8;
            case 9 -> 39;
            case 10 -> 34;
            case 11 -> 3;
            case 12 -> 24;
            case 13 -> 16;
            case 14 -> 26;
            case 15 -> 51;
            case 16 -> 40;
            case 17 -> 45;
            case 18 -> 31;
            case 19 -> 49;
            case 20 -> 35;
            case 21 -> 61;
            case 22 -> 63;
            case 23 -> 53;
            case 24 -> 56;
            case 25 -> 44;
            case 26 -> 48;
            case 27 -> 20;
            case 28 -> 21;
            case 29 -> 11;
            case 30 -> 22;
            case 31 -> 14;
            case 32 -> 17;
            case 33 -> 28;
            case 34 -> 36;
            case 35 -> 5;
            case 36 -> 55;
            case 37 -> 62;
            case 38 -> 46;
            case 39 -> 33;
            case 40 -> 47;
            case 41 -> 1;
            case 42 -> 7;
            case 43 -> 4;
            case 44 -> 19;
            case 45 -> 9;
            case 46 -> 50;
            case 47 -> 12;
            case 48 -> 23;
            case 49 -> 13;
            case 50 -> 54;
            case 51 -> 27;
            case 52 -> 60;
            case 53 -> 10;
            case 54 -> 6;
            case 55 -> 43;
            case 56 -> 41;
            case 57 -> 57;
            case 58 -> 15;
            case 59 -> 2;
            case 60 -> 58;
            case 61 -> 37;
            case 62 -> 32;
            default -> 59;
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
        el_0.q[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = el_0.m(l, l2);
        Object object = p[n];
        if (object instanceof String) {
            String string = q[n];
            int n2 = string.indexOf(8);
            Class clazz = el_0.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = el_0.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = el_0.g(clazz3, string2, clazz2)) != null) {
                    el_0.p[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = el_0.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        el_0.p[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = el_0.n(108037568701034L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = el_0.m(l, l2);
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
                clazz3 = el_0.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = el_0.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = el_0.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        el_0.p[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = el_0.n(108037568701034L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = el_0.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        el_0.p[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = el_0.n(108037568701034L, 0L);
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

    private boolean lambda$new$0(Float f) {
        long l = k ^ 0xB003573A849L;
        return (boolean)el_0.c("\u00e1", (String)((Object)el_0.c("\u00e1", (Object)this.a, (long)543302499000388576L, (long)l)), (Object)el_0.b("m", (int)27767, (long)(0x57BD95D73E6FEA0BL ^ l)), (long)543536416759873022L, (long)l);
    }

    private void lambda$onTick$1() {
        long l = k ^ 0x17E1F8374C30L;
        long l2 = l ^ 0x706E36A6C4DBL;
        CallSite callSite = el_0.c("\u00e1", (Object)el_0.c("\u00eb", (Object)b, (long)-2017944428212988371L, (long)l), (long)-2021624051377612691L, (long)l);
        el_0.c("\u00e1", (Object)el_0.c("\u00eb", (Object)b, (long)-2017944428212988371L, (long)l), (float)(el_0.c("\u00e1", (Object)((Float)((Object)el_0.c("\u00e1", (Object)this.d, (long)-2021220820998361191L, (long)l))), (long)-2021043786974125237L, (long)l) - 1.0f + el_0.c("\u00e1", (Object)dn_0.a, (long)-2021875844982892221L, (long)l)), (long)-2020591205596704801L, (long)l);
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = el_0.c("\u00db", (long)-2021189725744140673L, (long)l);
        el_0.c("\u00f1", (Object)objectArray, (long)-2021794774569733139L, (long)l);
        el_0.c("\u00e1", (Object)el_0.c("\u00eb", (Object)b, (long)-2017944428212988371L, (long)l), (float)callSite, (long)-2020591205596704801L, (long)l);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(el_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(el_0.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


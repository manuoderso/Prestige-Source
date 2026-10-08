/*
 * Decompiled with CFR 0.152.
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.bl_0;
import dev.zprestige.prestige.dC;
import dev.zprestige.prestige.dF;
import dev.zprestige.prestige.dM;
import dev.zprestige.prestige.dO;
import dev.zprestige.prestige.dQ;
import dev.zprestige.prestige.dR;
import dev.zprestige.prestige.dV;
import dev.zprestige.prestige.dn_0;
import dev.zprestige.prestige.f5;
import dev.zprestige.prestige.hc;
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

/*
 * Renamed from dev.zprestige.prestige.fv
 */
public class fv_0
extends dV
implements dF {
    private dR a;
    private dQ c;
    private dM d;
    private dO e;
    private dO f;
    private f5 g;
    private float h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private float n;
    private static final long o = hc.a(934465965174737161L, -7356164953289117885L, MethodHandles.lookup().lookupClass()).a(274134896364780L);
    private static final String[] p;
    private static final String[] q;
    private static final Map r;
    private static final Object[] s;
    private static final String[] t;

    public fv_0() {
        long l = o ^ 0xB8ADDDC58EAL;
        long l2 = l ^ 0x381C4DBD00F6L;
        this.g = new f5(l2);
        this.h = 0.0f;
        this.i = 0;
        this.j = 0;
        this.k = -1;
        this.l = -1;
        this.m = -1;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        s = new Object[73];
        t = new String[73];
        fv_0.f();
        r = new HashMap(13);
        long l = o ^ 0x488FF7E3721BL;
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
        String string = "\t\u008f\u00d1d\u00e9\u00f2U\u00e6\u00a7\u00e6AP\u00c4m+\u00c0\u0010 u\u00a2U\u00b0\u00b9\u00c4%\nE\u00e12R\u009f4e\u0010@\u0093\u00ad\u009fF_\u00da\u00b2\u0013\u009f\u00f5+e@6Z";
        int n2 = "\t\u008f\u00d1d\u00e9\u00f2U\u00e6\u00a7\u00e6AP\u00c4m+\u00c0\u0010 u\u00a2U\u00b0\u00b9\u00c4%\nE\u00e12R\u009f4e\u0010@\u0093\u00ad\u009fF_\u00da\u00b2\u0013\u009f\u00f5+e@6Z".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = fv_0.b(byArray3).intern();
            if ((n4 += n3) >= n2) {
                p = stringArray;
                q = new String[3];
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    @Override
    public void e(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x7FAB131DDD11L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = this;
        fv_0.c("\u00ec", (Object)fv_0.c("y", (long)3996222969183651099L, (long)l), (Object)objectArray2, (long)3992544038594885709L, (long)l);
    }

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7E77;
        if (q[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])r.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    r.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/fv", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = p[n2].getBytes("ISO-8859-1");
            fv_0.q[n2] = fv_0.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return q[n2];
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/fv" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
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

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = fv_0.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
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
            throw new RuntimeException("dev/zprestige/prestige/fv" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = fv_0.m(l, l2);
            object = s[n];
            try {
                if (!(object instanceof String)) break block2;
                fv_0.s[n] = clazz = Class.forName(t[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = fv_0.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = fv_0.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = fv_0.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = fv_0.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = s;
        s[0] = "Kt\u0010{\\;]t\u0015!O,J?\u0016'C8[x\u00010\b/~";
        objectArray[1] = "?\"w\u000e=\u0017J\u0002|\u0001,X+\fw\n(\u0002_";
        objectArray[2] = Void.TYPE;
        fv_0.t[2] = "java/lang/Void";
        objectArray[3] = "?V2JB#)V7\u0010Q4>\u001d4\u0016] /Z#\u0001\u00165n";
        objectArray[4] = "%\u000ed\\\u000e\u0011P.oS\u001f^1 dX\u001b\u0004E";
        objectArray[5] = "J'8\t\u001cq\\'=S\u000ffKl>U\u0003rZ+)BHee";
        objectArray[6] = "\u0013&=\b\u001e\r\u0018),G\u007f\u0003\u0013\"(\u001d";
        objectArray[7] = "U~E*\u0017\t^qTej\u0011Mv],";
        objectArray[8] = Boolean.TYPE;
        fv_0.t[8] = "java/lang/Boolean";
        objectArray[9] = "\u0007\u001bU)Qg\u0007\u001bBu]h\u001dPBk]}\u001a!\u00126\f";
        objectArray[10] = "\u000f3b\u001cB0\u000f3u@N?\u0015xu^N*\u0012\t!\u0006\u0019";
        objectArray[11] = "J\u001ceB7M\\\u001c`\u0018$ZKWc\u001e(NZ\u0010t\tcYj";
        objectArray[12] = "Ck\u0015g\u000e\u00126K\u001eh\u001f]WE\u0015c\u001b\u0007#";
        objectArray[13] = Float.TYPE;
        fv_0.t[13] = "java/lang/Float";
        objectArray[14] = "\u0006,6\u001f@i\u0010,3ES~\u0007g0C_j\u0016 'T\u0014z\u000e %_N72;%BNp\u0005,";
        objectArray[15] = "{V0p4R\u000ev;\u007f%\u001dox0t!G\u001b";
        objectArray[16] = "\u0000(N\u0014|t\u0016(KNoc\u0001cHHcw\u0010$__(g\u000b";
        objectArray[17] = "AXas\u0000{4xj|\u00114Uvaw\u0015n!";
        objectArray[18] = "+EFD\u001a:+EQ\u0018\u001651\u000eQ\u0006\u0016 6\u007f\u0003XAk";
        objectArray[19] = "\n?KJF\u0002\u001c?N\u0010U\u0015\u000btM\u0016Y\u0001\u001a3Z\u0001\u0012\u0013&";
        objectArray[20] = "U[a,k+ {j#zd]cy$s-5";
        objectArray[21] = "\u0010t/>\n\\eT$1\u001b\u0013\u0004Z/:\u001fIp";
        objectArray[22] = "i\u0019B;dFi\u0019UghIsRUyh\\t#\u0007\"0\u0016";
        objectArray[23] = "0[]un\u00020[J)b\r*\u0010J7b\u0018-a\u0018l:Y";
        objectArray[24] = "e\u0019Fxd0s\u0019C\"w'dR@${3u\u0015W30&w";
        objectArray[25] = "\u0004rz`!L\u000f}k/BA\u001apdDwC\u000bcxh`N";
        objectArray[26] = "\u0013r\u001b'\u0007P\u0018}\nh`R\rv\n#[";
        objectArray[27] = Integer.TYPE;
        fv_0.t[27] = "java/lang/Integer";
        objectArray[28] = "7[4K\u001c@<T%\u0004pC2V'K\\";
        objectArray[29] = "+Z\u0019\\qf=Z\u001c\u0006bq*\u0011\u001f\u0000ne;V\b\u0017%u=";
        objectArray[30] = "w6}}BU\u0002\u0016vrS\u001ac\u0018}yW@\u0017";
        objectArray[31] = "\u001e\u001c*,D;\b\u001c/vW,\u001fW,p[8\u000e\u0010;g\u0010/,";
        objectArray[32] = "H\u0004P\u0007!4=$[\b0{\\*P\u00034!(";
        objectArray[33] = "\bj'%\u001c\r\bj0y\u0010\u0002\u0012!0g\u0010\u0017\u0015Pb3AV";
        objectArray[34] = "\u0000{'\u0000\u007f\u0017u[,\u000fnX\u0014U'\u0004j\u0002`";
        objectArray[35] = "o6\u0001\u000f#;d9\u0010@K;j6\u0003";
        objectArray[36] = "pO\u000f[4\u0006fO\n\u0001'\u0011q\u0004\t\u0007+\u0005`C\u001e\u0010`\u0012S";
        objectArray[37] = "v|\u0001\u0004_I\u0003\\\n\u000bN\u0006bR\u0001\u0000J\\\u0016";
        objectArray[38] = "N\u0012liSs;2gfB<Z<lmFf.";
        objectArray[39] = "sY~\"\u007f9\u0006yu-nvgw~&j,\u0013";
        objectArray[40] = "e-Yb'\u001e\u0010\rRm6Qq\u0003Yf2\u000b\u0005";
        objectArray[41] = "W[u\u0014\u0011\u0018ISo[m\fS^l\u0018";
        objectArray[42] = "@IPPGBN\u001a\u0006C)_#QPDDTR\u0015\u0002DD=\u001eQ\\U\u0010_\u001cX\u000e\u0006)";
        objectArray[43] = ",KT\u0000\u001e\u0000=J\r\u001a.\u0010@G\u001a\t\u0013\u0002;\u0011\u0005]\u001ez";
        objectArray[44] = "\u000fAU)\u0012\u001c\u0000\u0014\u001d8{\u001cPC\t=,K\u000e\u0014QQDIP@T1\u001cK\u000bO";
        objectArray[45] = "\u0007\u001bS(tHCETx\u001d@=\u0005\u0016jp@LADjp)\u0000\u0005\u001a{$K\u0002\fH(\u001d";
        objectArray[46] = "J\u00047z|(OVl=\u0010y \u001c0>}{QXb>}\u0012\u001d\u001c</)p\u001f\u0015n|\u0010";
        objectArray[47] = "\u001d\u007f8\u0014L\u0004\u0018t1P%\f\u001eha\tI>L%9_%\u0006\u001evp\u001eE\u0005H+1n";
        objectArray[48] = "!eZ \u000e\u0001!`Ldd\u0010A?^y\t\u0016$3Tz^y!5Pp\u000b\u001c-?S'd";
        objectArray[49] = "\u000b\u0003\u001b\u007f\u0003cS\u0001@p:mUU\u001e}m=\f\u0001@\u0011X:EX\u0018`UnEF";
        objectArray[50] = "\u0000O<@Wc\u0012U%xY\f\u0019\u0019\"\u0015Z}]K\"\u001535\u001a\u001fc\u0015R=\u001c[<x";
        objectArray[51] = "E\n)3qCX\u0019w.\tG!\t{0dGPM)0d.\u0018\n}qdO\u0010\f9.\t";
        objectArray[52] = "tA=&w_s\u00188t\u0013AbW?\u0003w@f[C|w[1U>2+[n'";
        objectArray[53] = "5\u0019:h^\u0001gF1}c\u0013\u0005^a{\u000e\u0014t\u001a3{\u000e}<]g:\u000e\u001c4[#ec";
        objectArray[54] = "XQCXC)\u000b\u0012\u0004R\"zRC\u001c_u)\u0003\u0016H3Ik\bE\u0019\u000e\u001a(OO";
        objectArray[55] = "zi\u001fFddvk\u0004Y\u0018x~{\u001fPO&!-G<w{}g\u000b\\t- &";
        objectArray[56] = "nz{\u000b>Z6x \u0004\u0007_<=z\u0002kmoy&Z\u0007T:x`\fjQ1q$e";
        objectArray[57] = "L:Xc\u000e_\bd_3gWv$\u001d!\nW\u0007`O!\n>O'\u001b`\n_G!_?g";
        objectArray[58] = "`\u0007W])\u0016#\u001f\u000bDLD\u0018\u0016\u0007G!AiRUG!(%\u0016\u000bVuJ'\u001fY\u0005L";
        objectArray[59] = "x&.\u007fWR $upnW*a/v\u0002e|#s,R2vy3/\u001cO8%3pn";
        objectArray[60] = "l };17bs+(_!\u000f8}/2!~|//2Hn{?)08e(;3_";
        objectArray[61] = "\u001a_\u0012\u0019n%H\u0000\u0019\fS4*\u0018I\n>0[\\\u001b\n>Y\u0013\u001bOK>8\u001b\u001d\u000b\u0014S";
        objectArray[62] = "z\u0018f\u0004K|\"\u001a=\u000bry(_g\r\u001eK~\u001d;WO\u001ctG{T\u0000a:\u001b{\u000br";
        objectArray[63] = ")\u001f\u0016\u0002\u0012B\"L\u0012\u0018}S.[6\u0013\u0019O%'\nC\fR*V\u0007\u0017\fLH";
        objectArray[64] = "JQ\u001bjx0ABR'\u00148OJ\u000f8}4vD\u000f(yR\u0015V[:-0\u0017_\ti\u0014";
        objectArray[65] = ";U\u001dgN).@Fz?>R\u000f\u001e}Rd.]AvG";
        objectArray[66] = "V7Kn?VXd\u001d}Q@5/Kz<@Dk\u0019z<)\f,M;<H\u0004*\tdQ";
        objectArray[67] = "\u0004y]Z.G\n*\u000bI@Qga]N-Q\u0016%\u000fN-8\u0005#\u0010P\"I\bw\u0010N@";
        objectArray[68] = "aM\b\u0002|^f@\u001b\u000f\u0001NZ\u0012\u0001Vs[7PB\u0017?'";
        objectArray[69] = "@o^.V*N>@!k-C9W75*C#SKZ'[`L6\u0014{[?>";
        objectArray[70] = "\u0011\u0018p\u0016+\u0002\u0013\u000b \u0014F\u0003U\t%I=n\u0010\ft_:\u0003RO5\u0013FSWD#\u0014$Q^\u0016p-";
        objectArray[71] = "c&v7Yx;$-8`}1aw>\fOg#+d_\u0018mykg\u0012e#%k8`!$'(4\u0001)\"cwY";
        Object[] objectArray2 = objectArray;
        objectArray[72] = "IAUw\u0010iIDC3zs)\u0000\u00074\u0017xXDU4\u0017\u0011\u0010\u0003\u0001u\u0017p\u0018\u0005E*z";
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = fv_0.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00cb' || c == 'B' || c == 'y' || c == '\u00c9') {
                field = fv_0.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00cb' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'B' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'y' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = fv_0.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00ec' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00dc' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        long l2 = l;
        long l3 = l2 ^ 0x2930131F329BL;
        long l4 = l2 ^ 0x4FC9861B63E7L;
        long l5 = l2 ^ 0x52D6E774439DL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l5;
        objectArray2[0] = this;
        fv_0.c("\u00ec", (Object)fv_0.c("y", (long)3248841482301923192L, (long)l), (Object)objectArray2, (long)3245144605739521771L, (long)l);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l3;
        fv_0.c("\u00ec", (Object)this.g, (Object)objectArray3, (long)3244870458685657925L, (long)l);
        this.h = (float)fv_0.c("\u00ec", (Object)fv_0.c("\u00cb", (Object)b, (long)3246356111047227572L, (long)l), (long)3245349812454880983L, (long)l);
        this.i = 0;
        this.k = -1;
        this.l = -1;
        this.m = -1;
        Object[] objectArray4 = new Object[1];
        objectArray4[0] = l3;
        fv_0.c("\u00ec", (Object)this.g, (Object)objectArray4, (long)3244870458685657925L, (long)l);
        Object[] objectArray5 = new Object[1];
        objectArray5[0] = l4;
        fv_0.c("\u00ec", (Object)this.c, (Object)objectArray5, (long)3245617825595065498L, (long)l);
    }

    @Override
    public dC a(Object[] objectArray) {
        reference var9_6;
        long l;
        block19: {
            block20: {
                Object object;
                CallSite callSite;
                long l2;
                block16: {
                    block17: {
                        long l3;
                        block18: {
                            Object object2;
                            block14: {
                                block15: {
                                    l = (Long)objectArray[0];
                                    long l4 = l;
                                    l3 = l4 ^ 0x27251590B815L;
                                    l2 = l4 ^ 0x27FCB0ED41D5L;
                                    callSite = fv_0.c("\u00dc", (long)-1174391597786138812L, (long)l);
                                    try {
                                        try {
                                            object2 = fv_0.c("\u00ec", (String)((Object)fv_0.c("\u00ec", (Object)this.a, (long)-1177598641381197841L, (long)l)), (Object)fv_0.b("e", (int)22663, (long)(0x6D81F2F718AB494BL ^ l)), (long)-1177433800115691712L, (long)l);
                                            if (callSite != null) break block14;
                                            if (object2 != false) break block15;
                                        }
                                        catch (MatchException matchException) {
                                            throw fv_0.c("\u00dc", (Object)matchException, (long)-1173917032843645899L, (long)l);
                                        }
                                        return null;
                                    }
                                    catch (MatchException matchException) {
                                        throw fv_0.c("\u00dc", (Object)matchException, (long)-1173917032843645899L, (long)l);
                                    }
                                }
                                try {
                                    object = this;
                                    if (callSite != null) break block16;
                                    object2 = ((fv_0)object).m;
                                }
                                catch (MatchException matchException) {
                                    throw fv_0.c("\u00dc", (Object)matchException, (long)-1173917032843645899L, (long)l);
                                }
                            }
                            try {
                                try {
                                    if (object2 == -1) break block17;
                                    if (fv_0.c("\u00cb", (Object)fv_0.c("\u00cb", (Object)b, (long)-1174757773643433461L, (long)l), (long)-1173986217602617311L, (long)l) > this.m + 1) break block18;
                                }
                                catch (MatchException matchException) {
                                    throw fv_0.c("\u00dc", (Object)matchException, (long)-1173917032843645899L, (long)l);
                                }
                                return new dC((float)fv_0.c("\u00ec", (Object)fv_0.c("\u00cb", (Object)b, (long)-1174757773643433461L, (long)l), (long)-1173292745724484397L, (long)l), this.n);
                            }
                            catch (MatchException matchException) {
                                throw fv_0.c("\u00dc", (Object)matchException, (long)-1173917032843645899L, (long)l);
                            }
                        }
                        this.m = -1;
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l3;
                        fv_0.c("\u00ec", (Object)this, (Object)objectArray2, (long)-1173862869611709323L, (long)l);
                        return null;
                    }
                    object = fv_0.c("\u00ec", (Object)this.e, (long)-1177598641381197841L, (long)l);
                }
                var9_6 = fv_0.c("\u00ec", (Object)((Float)object), (long)-1177671905295428776L, (long)l) - 1.0f + fv_0.c("\u00ec", (Object)dn_0.a, (long)-1174188756461074991L, (long)l) * 2.0f;
                try {
                    try {
                        if (callSite != null) break block19;
                        Object[] objectArray3 = new Object[4];
                        objectArray3[3] = l2;
                        objectArray3[2] = true;
                        objectArray3[1] = () -> fv_0.lambda$calculate$3((float)var9_6);
                        objectArray3[0] = fv_0.c("y", (long)-1174171190096727311L, (long)l);
                        if (fv_0.c("\u00dc", (Object)objectArray3, (long)-1174361159457472055L, (long)l) != false) break block20;
                    }
                    catch (MatchException matchException) {
                        throw fv_0.c("\u00dc", (Object)matchException, (long)-1173917032843645899L, (long)l);
                    }
                    return null;
                }
                catch (MatchException matchException) {
                    throw fv_0.c("\u00dc", (Object)matchException, (long)-1173917032843645899L, (long)l);
                }
            }
            this.m = (int)fv_0.c("\u00cb", (Object)fv_0.c("\u00cb", (Object)b, (long)-1174757773643433461L, (long)l), (long)-1173986217602617311L, (long)l);
            this.n = (float)var9_6;
        }
        return new dC((float)fv_0.c("\u00ec", (Object)fv_0.c("\u00cb", (Object)b, (long)-1174757773643433461L, (long)l), (long)-1173292745724484397L, (long)l), (float)var9_6);
    }

    /*
     * Exception decompiling
     */
    @bP
    public void a(bl_0 var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [4[TRYBLOCK]], but top level block is 23[SWITCH]
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

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (t[n3] != null) {
            return n3;
        }
        Object object = s[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 54;
            case 1 -> 62;
            case 2 -> 29;
            case 3 -> 25;
            case 4 -> 36;
            case 5 -> 58;
            case 6 -> 39;
            case 7 -> 41;
            case 8 -> 56;
            case 9 -> 27;
            case 10 -> 14;
            case 11 -> 2;
            case 12 -> 3;
            case 13 -> 49;
            case 14 -> 8;
            case 15 -> 57;
            case 16 -> 18;
            case 17 -> 15;
            case 18 -> 45;
            case 19 -> 10;
            case 20 -> 0;
            case 21 -> 52;
            case 22 -> 4;
            case 23 -> 22;
            case 24 -> 12;
            case 25 -> 13;
            case 26 -> 16;
            case 27 -> 28;
            case 28 -> 37;
            case 29 -> 26;
            case 30 -> 51;
            case 31 -> 21;
            case 32 -> 35;
            case 33 -> 20;
            case 34 -> 7;
            case 35 -> 17;
            case 36 -> 31;
            case 37 -> 40;
            case 38 -> 59;
            case 39 -> 43;
            case 40 -> 50;
            case 41 -> 19;
            case 42 -> 60;
            case 43 -> 23;
            case 44 -> 61;
            case 45 -> 1;
            case 46 -> 44;
            case 47 -> 24;
            case 48 -> 32;
            case 49 -> 34;
            case 50 -> 47;
            case 51 -> 42;
            case 52 -> 63;
            case 53 -> 38;
            case 54 -> 5;
            case 55 -> 46;
            case 56 -> 55;
            case 57 -> 53;
            case 58 -> 9;
            case 59 -> 48;
            case 60 -> 6;
            case 61 -> 11;
            case 62 -> 30;
            default -> 33;
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
        fv_0.t[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = fv_0.m(l, l2);
        Object object = s[n];
        if (object instanceof String) {
            String string = t[n];
            int n2 = string.indexOf(8);
            Class clazz = fv_0.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = fv_0.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = fv_0.g(clazz3, string2, clazz2)) != null) {
                    fv_0.s[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = fv_0.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        fv_0.s[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = fv_0.n(476845540226718L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = fv_0.m(l, l2);
        Object object = s[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = t[n];
                int n3 = string2.indexOf(8);
                clazz3 = fv_0.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = fv_0.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = fv_0.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        fv_0.s[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = fv_0.n(476845540226718L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = fv_0.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        fv_0.s[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = fv_0.n(476845540226718L, 0L);
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
        long l = (Long)objectArray[0];
        long l2 = l = o ^ l;
        long l3 = l2 ^ 0x725BA4DF8A67L;
        long l4 = l2 ^ 0x14A231DBDB1BL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        fv_0.c("\u00ec", (Object)this.g, (Object)objectArray2, (long)-7641408902485070919L, (long)l);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l4;
        fv_0.c("\u00ec", (Object)this.c, (Object)objectArray3, (long)-7640748894782636954L, (long)l);
        ++this.i;
    }

    private boolean lambda$new$0(Float f) {
        long l = o ^ 0x23C7E8FA0E5DL;
        return (boolean)fv_0.c("\u00ec", (String)((Object)fv_0.c("\u00ec", (Object)this.a, (long)-5923046649074223734L, (long)l)), (Object)fv_0.b("e", (int)14290, (long)(0x9088965D36BE478L ^ l)), (long)-5922899812357661403L, (long)l);
    }

    private boolean lambda$new$2(Float f) {
        long l = o ^ 0x737FE60DDFA1L;
        return (boolean)fv_0.c("\u00ec", (String)((Object)fv_0.c("\u00ec", (Object)this.a, (long)8949018374745826422L, (long)l)), (Object)fv_0.b("e", (int)14290, (long)(0x908D9DDDD9C3584L ^ l)), (long)8949200808441171161L, (long)l);
    }

    private boolean lambda$new$1(Boolean bl) {
        long l = o ^ 0x6FFA984C0D07L;
        return (boolean)fv_0.c("\u00ec", (String)((Object)fv_0.c("\u00ec", (Object)this.a, (long)-5866131714133526832L, (long)l)), (Object)fv_0.b("e", (int)6680, (long)(0x1D35631FE8894AE9L ^ l)), (long)-5865958043521933697L, (long)l);
    }

    private static void lambda$calculate$3(float f) {
        long l = o ^ 0x3F49D3EC5E9CL;
        long l2 = l ^ 0x93479E5DA3FL;
        CallSite callSite = fv_0.c("\u00ec", (Object)fv_0.c("\u00cb", (Object)b, (long)-209917955634517841L, (long)l), (long)-210917802984462644L, (long)l);
        fv_0.c("\u00ec", (Object)fv_0.c("\u00cb", (Object)b, (long)-209917955634517841L, (long)l), (float)f, (long)-212514182685756456L, (long)l);
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = fv_0.c("y", (long)-211500123048485982L, (long)l);
        fv_0.c("\u00dc", (Object)objectArray, (long)-209811628438118240L, (long)l);
        fv_0.c("\u00ec", (Object)fv_0.c("\u00cb", (Object)b, (long)-209917955634517841L, (long)l), (float)callSite, (long)-212514182685756456L, (long)l);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(fv_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(fv_0.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


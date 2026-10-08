/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1799
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.bG;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.dQ;
import dev.zprestige.prestige.dR;
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
import net.minecraft.class_1799;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class e6
extends dV {
    private dR a;
    private dQ c;
    private f5 d;
    private int e;
    private boolean i;
    private static final long k = hc.a(943073718337483397L, 3054387450912430064L, MethodHandles.lookup().lookupClass()).a(234547767605880L);
    private static final String[] l;
    private static final String[] m;
    private static final Map n;
    private static final long o;
    private static final Object[] p;
    private static final String[] q;

    public e6() {
        long l = k ^ 0x7DFA1B46CC63L;
        long l2 = l ^ 0x2A12AE9F8E66L;
        this.d = new f5(l2);
        this.e = 0;
        this.i = 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        p = new Object[65];
        q = new String[65];
        e6.f();
        n = new HashMap(13);
        long l = k ^ 0x7AE71696CC43L;
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
        String string = "(q*\u00f1\u00ed\u00bd\u008b[\u00fa\u00ff\u0015#\u0000Z\u001aL\u0010S\u0085\u00fd@\u00a5{\u0082\u00fa\u00b9m0R \u009aP\u0012\u0010\u0099\u0093\u0097\u00834&[\u008dX\u001a\u001dQ7\u00a0~4";
        int n2 = "(q*\u00f1\u00ed\u00bd\u008b[\u00fa\u00ff\u0015#\u0000Z\u001aL\u0010S\u0085\u00fd@\u00a5{\u0082\u00fa\u00b9m0R \u009aP\u0012\u0010\u0099\u0093\u0097\u00834&[\u008dX\u001a\u001dQ7\u00a0~4".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = e6.b(byArray3).intern();
            if ((n4 += n3) >= n2) break;
            n3 = string.charAt(n4);
        }
        e6.l = stringArray;
        m = new String[3];
        Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
        byte[] byArray4 = new byte[8];
        byte[] byArray5 = byArray4;
        byArray4[0] = (byte)(l >>> 56);
        int n6 = 1;
        while (true) {
            if (n6 >= 8) {
                cipher2.init(2, (Key)secretKeyFactory2.generateSecret(new DESKeySpec(byArray5)), new IvParameterSpec(new byte[8]));
                long l2 = 3094670671996345976L;
                byte[] byArray6 = cipher2.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                o = ((long)byArray6[0] & 0xFFL) << 56 | ((long)byArray6[1] & 0xFFL) << 48 | ((long)byArray6[2] & 0xFFL) << 40 | ((long)byArray6[3] & 0xFFL) << 32 | ((long)byArray6[4] & 0xFFL) << 24 | ((long)byArray6[5] & 0xFFL) << 16 | ((long)byArray6[6] & 0xFFL) << 8 | (long)byArray6[7] & 0xFFL;
                return;
            }
            byArray5 = byArray5;
            byArray5[n6] = (byte)(l << n6 * 8 >>> 56);
            ++n6;
        }
    }

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2CC5;
        if (m[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])e6.n.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    e6.n.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/e6", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = e6.l[n2].getBytes("ISO-8859-1");
            e6.m[n2] = e6.b(((Cipher)objectArray[0]).doFinal(byArray2));
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
            throw new RuntimeException("dev/zprestige/prestige/e6" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = e6.b(n, l);
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
            throw new RuntimeException("dev/zprestige/prestige/e6" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = e6.m(l, l2);
            object = p[n];
            try {
                if (!(object instanceof String)) break block2;
                e6.p[n] = clazz = Class.forName(q[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = e6.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = e6.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = e6.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = e6.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = p;
        p[0] = "\u0012m\u001ak\u0005]\u0004m\u001f1\u0016J\u0013&\u001c7\u001a^\u0002a\u000b QH@";
        objectArray[1] = "w \"/\u000b\u0015|/3`h\u0018i\"<\u000b]\u001ax1 'J\u0017";
        objectArray[2] = "\r>F?wS\u001b>CedD\fu@chP\u001d2Wt#B!";
        objectArray[3] = "I\u001b\u0011i\u0016u<;\u001af\u0007:A#\ta\u000es)";
        objectArray[4] = ")}\u001f9\u0010<)}\be\u001c336\b{\u001c&4GX&M";
        objectArray[5] = "\u0002i+T=2\u0002i<\b1=\u0018\"<\u00161(\u001fShNf";
        objectArray[6] = "%ai(kSPAb'z\u001c1Oi,~FE";
        objectArray[7] = Boolean.TYPE;
        e6.q[7] = "java/lang/Boolean";
        objectArray[8] = "\u0018\"+?)\u0014\u0018\"<c%\u001b\u0002i<}%\u000e\u0005\u0018n'rL";
        objectArray[9] = Integer.TYPE;
        e6.q[9] = "java/lang/Integer";
        objectArray[10] = "*Gh$;!*G\u007fx7.0\f\u007ff7;7}-=oq";
        objectArray[11] = ";xBv\u0010k0wS9qe;|Wc";
        objectArray[12] = "(1Ww'\n(1@++\u00052z@5+\u00105\u000b\u0012azQ";
        objectArray[13] = "hds ddhdd|hkr/dbh~u^690?";
        objectArray[14] = "\u0000'6U`\"\u0016'3\u000fs5\u0001l0\t\u007f!\u0010+'\u001e41\u000b";
        objectArray[15] = "-]!r\n;X}*}\u001bt9s!v\u001f.M";
        objectArray[16] = "\rz\u0002\u0006\bA\rz\u0015Z\u0004N\u00171\u0015D\u0004[\u0010@G\u001aS\u0010";
        objectArray[17] = "I;\u0017E%N<\u001b\u001cJ4\u0001]\u0015\u0017A0[)";
        objectArray[18] = Void.TYPE;
        e6.q[18] = "java/lang/Void";
        objectArray[19] = "v:T\u0000\u0004\u0019`:QZ\u0017\u000ewqR\\\u001b\u001af6EKP\u000f'";
        objectArray[20] = "/\u001b!|\u0010{Z;*s\u00014;5!x\u0005nO";
        objectArray[21] = "\u0004SG\u001fr_\u0004SPC~P\u001e\u0018P]~E\u0019i\u0007\u0002(";
        objectArray[22] = "~p{`\u001e\u0004hp~:\r\u0013\u007f;}<\u0001\u0007n|j+J\u0017h";
        objectArray[23] = "\\[\\2pM){W=a\u0002Hu\\6eX<";
        objectArray[24] = "Lq7S%oZq2\t6xM:1\u000f:l\\}&\u0018q{~";
        objectArray[25] = "]\f1`\u0019W(,:o\b\u0018I\"1d\fB=";
        objectArray[26] = "}CsN'i\bcxA6&imsJ2|\u001d";
        objectArray[27] = "%j9\u0014\u0016{.e([kc=b!\u0012";
        objectArray[28] = "\u0006u\u001f\u0011j'sU\u0014\u001e{h\u0012[\u001f\u0015\u007f2f";
        objectArray[29] = ">'NuQP('K/BG?lH)NS.+_>\u0005D\u0011";
        objectArray[30] = "?xoWyz4w~\u0018\u0011z:xm";
        objectArray[31] = Float.TYPE;
        e6.q[31] = "java/lang/Float";
        objectArray[32] = "~?\u000b3(h\u000b\u001f\u0000<9'j\u0011\u000b7=}\u001e";
        objectArray[33] = "vNe\u000eFghF\u007fA;wh";
        objectArray[34] = "\u0010\u0017!\u0013p\u0017\u0006\u0017$Ic\u0000\u0011\\'Oo\u0014\u0000\u001b0X$\u0003%";
        objectArray[35] = "b\b^@k(\u0017(UOzgv&^D~=\u0002";
        objectArray[36] = "\tB!^[;|b*QJt\u001dl!ZN.i";
        objectArray[37] = "a|\u0010\u0004p@gnV[\u001a\u0015X=K\u0005+\u0002?~\u0015\u0005z\u007f";
        objectArray[38] = "\u0015\u0011(\n\r/\u0011\u001b;\nh&OL-\u0016?q\u0011\u001buzS,PB&\u0019\u0005/\u0012\u001f";
        objectArray[39] = "\u000b\b\u0017!\u0003cP\u0001S\u0010\r\u0003B\u0015V!\\s@\u0012H}d>Z\u0019\u0016p\u00159\u0002\u0001X\u0010";
        objectArray[40] = "~9\fQQOv*\bV+\u0017\u0012,\nB\u001aFb.\r\\F~/4\u0006\u0002K\u000f(l\u001eL+";
        objectArray[41] = ".ge\u007f!!6c=d\u001e Gtfb/s7va|sKzlj\"~:}4rl\u001e";
        objectArray[42] = ">\u0000\u001b/&GhA\b)\u001eElB\u001avrw>\u000fB \u001e\u0011l@\nz#G`F\u0018\u0011";
        objectArray[43] = "Xh%\nr6\\b6\n\u0017?\u00025 \u0016@h\\eyzyk\f(y\u000b.;\u001e&";
        objectArray[44] = "LMyG\u000f\u001d[OiF5\u0013+\nr\u0003\u0004A[\bu\u001dXyGK,\u0016^E\u0017M~\u001d5";
        objectArray[45] = "y\u0018( Vkg\u0010u>/~\u0019Pt?\u001e/iRs!B\u0017u\u0011**D+%\u0017x!/";
        objectArray[46] = "\rD\u0006c\u0000X]JF!pT\u0006J\\q'\u0007W\u001f\b\u001d\u001aYYYH\u007fJW\u0019\u001b";
        objectArray[47] = "Zu@X%\u000f\fv\u0002\u0005J\t\fm^\\&;_)\u0002\u0004JS_p\u0000\u0003-\u0005\u001ec\u0006;";
        objectArray[48] = "tM%\u001b\u007fo-C4\u0019\u0014?\u007f\t4js3{rjY-.xN;Xx%\u0016";
        objectArray[49] = "5\u001eCq<-c\u001d\u0001,S+c\u0006]u?\u00195C\u0000.cN3\u0005\u0003yotl\u0015[tS";
        objectArray[50] = "k%43?z0,p\u00021\u001a\"8u3`j ?koX$\"d{ldu#1p\u0002";
        objectArray[51] = "X)\u007fmjwZ&u4\u0005r6,ht4 F.ojh\u0018Zm6an$\nkdj\u0005";
        objectArray[52] = "L[\\6>HDHX1D\u0010 NZ%uAPL];)yL\u000f\u00040/E\u001c\tV;D";
        objectArray[53] = "\u0004MfogT\u0000Guo\u0002VR\u0001gxnd\u0006@9.\u0002\u000e_\u00148\u007fs\t\u0007\fv\u001f";
        objectArray[54] = "bra\u0001Vr9{%0X\u0012j:%[Z~md=I1+cp4[],=h&0";
        objectArray[55] = "OttbseI24t\u00190\trd{b]OttbseI24t\u0019`\u0010f2\u007fhgH~|\u001f";
        objectArray[56] = "|\\d\u0017rl'U &w\f5A%\u0017-|7F;K\u0015`t\u001f0M)0rM;&";
        objectArray[57] = "^=\u0015rzI\t @5A\u0017\u000f6N'\u0016E_c\u001b{AH\u0003%Z |\u001e\u000f#H";
        objectArray[58] = "\u001e\u001fGef|\u001c\u0010M<\tzp\u001aP|8+\u0000\u0018Wbd\u0013\u001c[\u000eib/L]\\b\t";
        objectArray[59] = ":r39p\u000febk4LPjqm5 b:16bL\u000b\u007f4|<pZ~awRs\u000bf355%Ju5\r";
        objectArray[60] = "'(B\u001fW\u0019%'HF8\u001fI-U\u0006\tN9/R\u0018Uvw-\t\bVJ&,\\\u00038";
        objectArray[61] = "`'`]\r,e+r\n0%\u0003xtIM&;~2\t[L";
        objectArray[62] = ",N7Qc;9G/\u0015Y9,\u0010$\u0012\u0007>,\n n='9NuRcn4\u0013M";
        objectArray[63] = "pw(i\u000fvxq{v?kxIutFq|qs2\u0006g\u0016/tmY<l'r>F\f";
        Object[] objectArray2 = objectArray;
        objectArray[64] = "\fz\r\u001a/\\Ut\u001c\u0018D\u0001\u00178\u0015D?lQ>\u0005].TWxEKDQ\u000e,C@5VV4\r ";
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'M' || c == '\u00ce' || c == '\u00ed' || c == '\u00c7') {
                field = e6.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'M' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ce' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00ed' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = e6.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00d0' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00f6' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        long l2 = l ^ 0x62A99867B6E6L;
        this.i = 0;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        e6.c("\u00d0", (Object)this, (Object)objectArray2, (long)3244947981162919068L, (long)l);
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = e6.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private int a(Object[] objectArray) {
        Object object;
        block5: {
            long l = (Long)objectArray[0];
            long l2 = (l = k ^ l) ^ 0x33B7D60F7AD1L;
            CallSite callSite = e6.c("\u00f6", (long)-804081752494358750L, (long)l);
            for (int i = 0; i <= (int)o; ++i) {
                int n;
                block6: {
                    try {
                        try {
                            Object[] objectArray2 = new Object[2];
                            objectArray2[1] = l2;
                            objectArray2[0] = e6.c("\u00d0", (Object)e6.c("\u00d0", (Object)e6.c("M", (Object)b, (long)-803988476951459833L, (long)l), (long)-805472206911258657L, (long)l), (int)i, (long)-805868000345551058L, (long)l);
                            object = e6.c("\u00f6", (Object)objectArray2, (long)-803932935615526457L, (long)l);
                            if (callSite != null) break block5;
                            if (callSite != null) break block6;
                        }
                        catch (MatchException matchException) {
                            throw e6.c("\u00f6", (Object)matchException, (long)-805094595242698144L, (long)l);
                        }
                        if (object == 0) continue;
                    }
                    catch (MatchException matchException) {
                        throw e6.c("\u00f6", (Object)matchException, (long)-805094595242698144L, (long)l);
                    }
                    n = i;
                }
                return n;
            }
            object = -1;
        }
        return object;
    }

    /*
     * Exception decompiling
     */
    @bP
    public void a(bG var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [5[TRYBLOCK]], but top level block is 18[SWITCH]
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

    public static boolean a(Object[] objectArray) {
        class_1799 class_17992 = (class_1799)objectArray[0];
        long l = (Long)objectArray[1];
        l = k ^ l;
        return (boolean)e6.c("\u00d0", (Object)e6.c("\u00d0", (Object)class_17992, (long)4007585757688930858L, (long)l), (Object)e6.c("\u00ed", (long)4006270358657110241L, (long)l), (long)4006716908044588947L, (long)l);
    }

    @Override
    public Set a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return e6.c("\u00f6", (Object)((Object)q_0.Mace), (long)-2445455528681606619L, (long)l);
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
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
            case 0 -> 43;
            case 1 -> 45;
            case 2 -> 28;
            case 3 -> 56;
            case 4 -> 23;
            case 5 -> 0;
            case 6 -> 38;
            case 7 -> 8;
            case 8 -> 22;
            case 9 -> 16;
            case 10 -> 24;
            case 11 -> 40;
            case 12 -> 39;
            case 13 -> 52;
            case 14 -> 58;
            case 15 -> 44;
            case 16 -> 49;
            case 17 -> 6;
            case 18 -> 55;
            case 19 -> 59;
            case 20 -> 20;
            case 21 -> 35;
            case 22 -> 63;
            case 23 -> 12;
            case 24 -> 31;
            case 25 -> 42;
            case 26 -> 27;
            case 27 -> 17;
            case 28 -> 61;
            case 29 -> 48;
            case 30 -> 19;
            case 31 -> 5;
            case 32 -> 11;
            case 33 -> 25;
            case 34 -> 34;
            case 35 -> 46;
            case 36 -> 21;
            case 37 -> 36;
            case 38 -> 50;
            case 39 -> 1;
            case 40 -> 4;
            case 41 -> 30;
            case 42 -> 54;
            case 43 -> 2;
            case 44 -> 41;
            case 45 -> 53;
            case 46 -> 7;
            case 47 -> 32;
            case 48 -> 10;
            case 49 -> 18;
            case 50 -> 60;
            case 51 -> 26;
            case 52 -> 57;
            case 53 -> 51;
            case 54 -> 37;
            case 55 -> 15;
            case 56 -> 33;
            case 57 -> 3;
            case 58 -> 47;
            case 59 -> 29;
            case 60 -> 9;
            case 61 -> 14;
            case 62 -> 13;
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
        e6.q[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = e6.m(l, l2);
        Object object = p[n];
        if (object instanceof String) {
            String string = q[n];
            int n2 = string.indexOf(8);
            Class clazz = e6.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = e6.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = e6.g(clazz3, string2, clazz2)) != null) {
                    e6.p[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = e6.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        e6.p[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = e6.n(792014211005376L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = e6.m(l, l2);
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
                clazz3 = e6.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = e6.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = e6.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        e6.p[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = e6.n(792014211005376L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = e6.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        e6.p[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = e6.n(792014211005376L, 0L);
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
        long l = (Long)objectArray[0];
        long l2 = l = k ^ l;
        long l3 = l2 ^ 0xB98D8E53DE5L;
        long l4 = l2 ^ 0x6D614DE16C99L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l4;
        e6.c("\u00d0", (Object)this.c, (Object)objectArray2, (long)2482463142502466809L, (long)l);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l3;
        e6.c("\u00d0", (Object)this.d, (Object)objectArray3, (long)2483026349296815225L, (long)l);
    }

    private boolean lambda$new$0(Float f) {
        long l = k ^ 0x704A8B1CA830L;
        return (boolean)e6.c("\u00d0", (String)((Object)e6.c("\u00d0", (Object)this.a, (long)1272110402760303965L, (long)l)), (Object)e6.b("j", (int)26230, (long)(0x4099D93A470FDB1BL ^ l)), (long)1276809688518680659L, (long)l);
    }

    private static void lambda$onTick$1() {
        long l = k ^ 0x55675D988969L;
        long l2 = l ^ 0x764D22917D3L;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = e6.c("\u00ed", (long)3529325489609117512L, (long)l);
        e6.c("\u00f6", (Object)objectArray, (long)3529533233740102969L, (long)l);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(e6.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(e6.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


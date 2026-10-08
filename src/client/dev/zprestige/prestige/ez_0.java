/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1733
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.bl_0;
import dev.zprestige.prestige.dL;
import dev.zprestige.prestige.dM;
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
import net.minecraft.class_1733;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from dev.zprestige.prestige.ez
 */
public class ez_0
extends dV {
    private dQ a;
    private dM d;
    private dL f;
    private f5 c;
    private static final long k = hc.a(-403616244018505013L, -5852712111125503595L, MethodHandles.lookup().lookupClass()).a(54052325631194L);
    private static final long[] l;
    private static final Integer[] m;
    private static final Map n;
    private static final Object[] o;
    private static final String[] p;

    public ez_0() {
        long l = k ^ 0x881C4EFD6E4L;
        long l2 = l ^ 0x17471E29A720L;
        this.c = new f5(l2);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        o = new Object[57];
        p = new String[57];
        ez_0.f();
        n = new HashMap(13);
        long l = k ^ 0x5E4207449C58L;
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
        long[] lArray = new long[3];
        int n = 0;
        String string = "\u00c1\u00f8\u00ecA\u0092\u00a7v\n\u0088\u008b=\u00a6\u00fe\u00e4\u00b0o^\u0082cZT\u00d5cd";
        int n2 = "\u00c1\u00f8\u00ecA\u0092\u00a7v\n\u0088\u008b=\u00a6\u00fe\u00e4\u00b0o^\u0082cZT\u00d5cd".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        ez_0.l = lArray;
        m = new Integer[3];
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5643;
        if (m[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = ez_0.l[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])ez_0.n.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    ez_0.n.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/ez", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ez_0.m[n2] = n3;
        }
        return m[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ez_0.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/ez" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/ez" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ez_0.m(l, l2);
            object = o[n];
            try {
                if (!(object instanceof String)) break block2;
                ez_0.o[n] = clazz = Class.forName(p[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = ez_0.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ez_0.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ez_0.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ez_0.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = o;
        o[0] = "\u001a\u001d\u007f6S]\u0004\u0015ey.M\u0004";
        objectArray[1] = "\u0000+.\u0005z@\u000b$?J\u001bN\u0000/;\u0010";
        objectArray[2] = "X-\u0003\u000eg\\N-\u0006TtKYf\u0005Rx_H!\u0012E3Mt";
        objectArray[3] = "$\u0018C0kOQ8H?z\u0000, [8sID";
        objectArray[4] = "k\u001dP\njak\u001dGVfnqVGHf{v'\u0015\u00134;";
        objectArray[5] = Integer.TYPE;
        ez_0.p[5] = "java/lang/Integer";
        objectArray[6] = "W${\u001e\u0016\rW$lB\u001a\u0002Mol\\\u001a\u0017J\u001e>\u0007HQ";
        objectArray[7] = Boolean.TYPE;
        ez_0.p[7] = "java/lang/Boolean";
        objectArray[8] = "F-\u000eB\u0006_P-\u000b\u0018\u0015HGf\b\u001e\u0019\\V!\u001f\tRJX";
        objectArray[9] = "z}=\u0013\u001fgqr,\\|jd\u007f#7Ihul?\u001b^e";
        objectArray[10] = "j\u0007bO\u0007qj\u0007u\u0013\u000b~pLu\r\u000bkw=%PZ";
        objectArray[11] = "gfI\bE\ngf^TI\u0005}-^JI\u0010z\\\f\u0016\u001cR";
        objectArray[12] = "X\u0001Q%\u007f\f]\u0014Z%t\u0017Q\u0004\u0018L_=`";
        objectArray[13] = Long.TYPE;
        ez_0.p[13] = "java/lang/Long";
        objectArray[14] = "\u0006sR\\\rQ\u0006sE\u0000\u0001^\u001c8E\u001e\u0001K\u001bI\u0011FV";
        objectArray[15] = "\u001e\fev\u0013D\u001e\fr*\u001fK\u0004Gr4\u001f^\u00036 oN\u001e";
        objectArray[16] = "^W/a+sHW*;8d_\u001c)=4pN[>*\u007fe\u000f";
        objectArray[17] = "\fuW\\{(yU\\Sjg\u0018[WXn=l";
        objectArray[18] = "#\u0010i\u001d<\n#\u0010~A0\u00059[~_0\u0010>*+\u0000g";
        objectArray[19] = "TE;\u0018s\u0016TE,D\u007f\u0019N\u000e,Z\u007f\fI\u007f~\u0001/L";
        objectArray[20] = "e\u0010i2*me\u0010~n&b\u007f[~p&wx*,*r3";
        objectArray[21] = Void.TYPE;
        ez_0.p[21] = "java/lang/Void";
        objectArray[22] = "GB\u0019@\u0002T2b\u0012O\u0013\u001bSl\u0019D\u0017A'";
        objectArray[23] = "y U\u000e`{y BRltckBLlad\u001a\u0010\u00174+";
        objectArray[24] = "/5ml@U$:|#'W11|h\u001c";
        objectArray[25] = "^Awc]\u0018^A`?Q\u0017D\n`!Q\u0002C{2u\u0000C";
        objectArray[26] = "\fO+ncr\fO<2o}\u0016\u0004<,oh\u0011unw7)";
        objectArray[27] = "y\"\u000b,\u007f0r-\u001ac\u00133|/\u0018,?";
        objectArray[28] = "'dC`e\b1dF:v\u001f&/E<z\u000b7hR+1\u001c\u0012";
        objectArray[29] = "uk\u0018*/G\u0000K\u0013%>\baE\u0018.:R\u0015";
        objectArray[30] = "s TLLFe Q\u0016_QrkR\u0010SEc,E\u0007\u0018R\\";
        objectArray[31] = "+\r<zS\u0010^-7uB_?#<~F\u0005K";
        objectArray[32] = "b27x`\u00142/0e\n\u00110\"=af#gdc61tmd9xd\u001dcd'w\n";
        objectArray[33] = "\fp6\u001b\u0003\u0017V|5\u0004<@5%g\tA\u001a\u0005e8\u0007\u0002*";
        objectArray[34] = "A8'\u0016\\\u0010\u0010*6Xb\u0010\u0017-7A\u000e\"Eon\u001fbIG:h\u0017\u001b\u0013\u00016:&^\u0012B05\u001b\\\b\u0003lW";
        objectArray[35] = "\u001d=`\u0003gO\u0013=~\f\tC@{d\u001aeq\u0011;5E\t\u0017\u0010;j\u0016wANw}}";
        objectArray[36] = "\bu \u0014/{Xh'\tEuVt.\u0006\u0012\"\b#vj,'Pz!\u0017#\"I`";
        objectArray[37] = "\u0014: \u0002<\u001cBs1MY\u0017\u0012?,U5%Ert\fYNB(s\u0003 \u0014\u0004$!2eO\u0014|}K?\t\u0018.L\u000ed\u0019@r5T\"\u0015\u0012C H4C\u0018!pQ5\u0010\u007f.v@&NBy!W\"r\u0012'%T6\u0011\u001d)qQY";
        objectArray[38] = "Ed#\u0017\u0000\u0006Dng]c\u0010{;}]\u0006\u0005@fwC\u0001yGbr\u0013R\u0000\u001d$~Ac";
        objectArray[39] = "Ejg\u0004i\nD`#N\n\u001c{olRjD\u001e5aBfuE`0_;\u0010\u001fm S\n";
        objectArray[40] = "5\u0005549{?\u0017or\u0005k4\u0013neR5m@;\tde)\u0006jcezn\u0019";
        objectArray[41] = "\u00051$\u00044-U(%WS!\b&-Y\u0004pVzu5?5\u0004z.Wo,\u0005)";
        objectArray[42] = "Y\u000fP\u000eN\u0003\u0006U\u0012DqR;\r\u0004N\u0014D\u0000P\u000eP\u00138V\r\tY\u001e[Y\u0003]\\q";
        objectArray[43] = "=\t#\u0005$\u00192\f:\u001fO\u00019I$\u0001#3k\u000exXO\t0\\\"\t,\u0006>\b'f";
        objectArray[44] = "\u00118\u0003\u001b\b\u0019F*E\trN{6\u001c\u0016\u0017[@k\u0016\b\u0010'\u00166\u0011\u0001\u001dD\u00198E\u0004r";
        objectArray[45] = "\b<fO15Y.w\u0001\u000f>R8r\u0013Xo\fk-\u007f3mXj'\u0006i+T8";
        objectArray[46] = "Z<G\u000f-HVb\u001b[SW\u000e3]+>D)0Sdb\u0005V3I\u001a4[\u001a$\"XnSUl[\u0002(_\u0007]\u001eY8\u0007[$D\u001f4Uj";
        objectArray[47] = "n\u001d?c\u001b6a\u0018&yp%fL<l't:\u0018b\u0000\u00190:[7d\t*b\u001b";
        objectArray[48] = "\u0002'Z\u0011xV\u0000=\u001bM\u001a\u000eS<\u0002\u0017v<\u0001~RI\u001aVQ0\u0013M+\u0007\u0001)\u0007p";
        objectArray[49] = "\u001c\u0000mf\u001e\u001dK\u0012+tdIv\u000erk\u0001_MSxu\u0006#K\u0005fkY\u0012\u001aU\u007f\u007fd";
        objectArray[50] = "\b?\u0016\r\u0002k\n%WQ`3Y$N\u000b\f\u0001\u000bf\u0011S`9[)C\u0011\u0006$TiLl";
        objectArray[51] = "Ls\f\"\r-Hc\u0000(l'E~#/\b;N\u0002A{\u0007y\u0012{\u001b=\u000b+#";
        objectArray[52] = "\u0005J\u0007a*S\u001f\bZu\u0015G\u0000\u0011Xt|K9\u001fXdx-Z\u0019Lh(\u001c\u000bIU|\u0015";
        objectArray[53] = "Ao7l2G\u0011r0qXI\u001fn9~\u000f\u001eA=d\u00123^\u001238|e\u0017\u0003|";
        objectArray[54] = "-<f#Z\u0013;1>,1BI/#&CG#i:?1";
        objectArray[55] = "|d\u00188r\u001a<bF_x\rC`\u00044m\u000f)&\u001d-\u001f\\8y\u00192f\u001c>'~";
        Object[] objectArray2 = objectArray;
        objectArray[56] = "U\u000fN\u0003TxH\u0000\u000e\f){W\u001c_\tEI\u0001Y\u0002Q\u0015\u001e[\u0000C\u0016ItZ\u001f\u0004\t)#U\u0010NS\u0018r\u0005\tZn";
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ez_0.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00ca' || c == 'Z' || c == '$' || c == '\u00d9') {
                field = ez_0.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00ca' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'Z' ? lookup.findSetter(clazz, string2, clazz2) : (c == '$' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ez_0.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00d4' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'p' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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

    /*
     * WARNING - void declaration
     */
    private int a(Object[] objectArray) {
        Object object;
        block3: {
            void var7_7;
            class_1733 class_17332 = (class_1733)objectArray[0];
            long l = (Long)objectArray[1];
            l = k ^ l;
            int n = 0;
            CallSite callSite = ez_0.c("p", (long)4165080921063640729L, (long)l);
            CallSite callSite2 = ez_0.b("c", (int)31022, (long)(0x6C6A7F9268816A9L ^ l));
            while (var7_7 < ez_0.b("c", (int)6889, (long)(0x70FDF96A1D73756DL ^ l))) {
                block4: {
                    try {
                        object = ez_0.c("\u00d4", (Object)ez_0.c("\u00d4", (Object)class_17332, (int)var7_7, (long)4165162036851161820L, (long)l), (long)4163920516516636245L, (long)l);
                        if (callSite != null) break block3;
                        if (object != 0) break block4;
                    }
                    catch (MatchException matchException) {
                        throw ez_0.c("p", (Object)matchException, (long)4164959129758002924L, (long)l);
                    }
                    ++n;
                }
                ++var7_7;
                if (callSite == null) continue;
            }
            object = n;
        }
        return object;
    }

    @Override
    public Set a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return ez_0.c("p", (Object)((Object)q_0.Cart), (long)-2446021828238783368L, (long)l);
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @bP
    public void a(bl_0 bl_02) {
        CallSite callSite;
        long l;
        block39: {
            void var14_10;
            class_1733 class_17332;
            CallSite callSite2;
            long l2;
            long l3;
            block36: {
                CallSite callSite3;
                Object object;
                block37: {
                    CallSite callSite4;
                    long l4;
                    block35: {
                        CallSite callSite5;
                        block33: {
                            long l5;
                            block34: {
                                long l6 = l = k ^ 0x7975F23DBDBAL;
                                l3 = l6 ^ 0x2449E367287EL;
                                l4 = l6 ^ 0x6DCF5B3B847FL;
                                l5 = l6 ^ 0x20C2842F558EL;
                                l2 = l6 ^ 0x42B076637902L;
                                callSite2 = ez_0.c("p", (long)4029370263081074879L, (long)l);
                                try {
                                    try {
                                        try {
                                            try {
                                                callSite5 = ez_0.c("\u00d4", (Object)((Integer)((Object)ez_0.c("\u00d4", (Object)this.f, (long)4030434297472076802L, (long)l))), (long)4030598390910926745L, (long)l);
                                                if (callSite2 != null) break block33;
                                                if (callSite5 == -1) break block34;
                                            }
                                            catch (MatchException matchException) {
                                                throw ez_0.c("p", (Object)matchException, (long)4029188546220253386L, (long)l);
                                            }
                                            callSite5 = ez_0.c("p", (long)ez_0.c("\u00d4", (Object)ez_0.c("\u00d4", (Object)b, (long)4029429989965196112L, (long)l), (long)4029494763393708635L, (long)l), (int)ez_0.c("\u00d4", (Object)((Integer)((Object)ez_0.c("\u00d4", (Object)this.f, (long)4030434297472076802L, (long)l))), (long)4030598390910926745L, (long)l), (long)4028742940497394445L, (long)l);
                                            if (callSite2 != null) break block33;
                                        }
                                        catch (MatchException matchException) {
                                            throw ez_0.c("p", (Object)matchException, (long)4029188546220253386L, (long)l);
                                        }
                                        if (callSite5 == 1) break block34;
                                        return;
                                    }
                                    catch (MatchException matchException) {
                                        throw ez_0.c("p", (Object)matchException, (long)4029188546220253386L, (long)l);
                                    }
                                }
                                catch (MatchException matchException) {
                                    throw ez_0.c("p", (Object)matchException, (long)4029188546220253386L, (long)l);
                                }
                            }
                            Object[] objectArray = new Object[2];
                            objectArray[1] = l5;
                            objectArray[0] = this.a;
                            callSite5 = ez_0.c("\u00d4", (Object)this.c, (Object)objectArray, (long)4030459557690225830L, (long)l);
                        }
                        if (callSite5 == false) {
                            return;
                        }
                        CallSite callSite6 = ez_0.c("\u00ca", (Object)ez_0.c("\u00ca", (Object)b, (long)4029123221996227235L, (long)l), (long)4028637608808801805L, (long)l);
                        try {
                            try {
                                callSite4 = callSite6;
                                if (callSite2 != null) break block35;
                                if (!(callSite4 instanceof class_1733)) return;
                            }
                            catch (MatchException matchException) {
                                throw ez_0.c("p", (Object)matchException, (long)4029188546220253386L, (long)l);
                            }
                            callSite4 = callSite6;
                        }
                        catch (MatchException matchException) {
                            throw ez_0.c("p", (Object)matchException, (long)4029188546220253386L, (long)l);
                        }
                    }
                    class_17332 = (class_1733)callSite4;
                    try {
                        if (callSite2 != null) {
                            return;
                        }
                    }
                    catch (MatchException matchException) {
                        throw ez_0.c("p", (Object)matchException, (long)4029188546220253386L, (long)l);
                    }
                    try {
                        try {
                            try {
                                Object[] objectArray = new Object[2];
                                objectArray[1] = l4;
                                objectArray[0] = class_17332;
                                object = ez_0.c("\u00d4", (Object)this, (Object)objectArray, (long)4029288015110694853L, (long)l);
                                if (callSite2 != null) break block36;
                                if (object > 1) break block37;
                            }
                            catch (MatchException matchException) {
                                throw ez_0.c("p", (Object)matchException, (long)4029188546220253386L, (long)l);
                            }
                            if (ez_0.c("\u00d4", (Object)((Boolean)((Object)ez_0.c("\u00d4", (Object)this.d, (long)4030434297472076802L, (long)l))), (long)4030271563155071318L, (long)l) == false) return;
                        }
                        catch (MatchException matchException) {
                            throw ez_0.c("p", (Object)matchException, (long)4029188546220253386L, (long)l);
                        }
                        ez_0.c("\u00d4", (Object)ez_0.c("\u00ca", (Object)b, (long)4029123221996227235L, (long)l), (long)4028895205391325666L, (long)l);
                        return;
                    }
                    catch (MatchException matchException) {
                        throw ez_0.c("p", (Object)matchException, (long)4029188546220253386L, (long)l);
                    }
                }
                object = callSite3 = (Object)0;
            }
            while (var14_10 < ez_0.b("c", (int)2657, (long)(0x586E00AE3FDC6BC1L ^ l))) {
                block38: {
                    block40: {
                        CallSite callSite7 = ez_0.c("\u00d4", (Object)class_17332, (int)var14_10, (long)4029531091123418362L, (long)l);
                        try {
                            try {
                                try {
                                    try {
                                        if (callSite2 != null) break block38;
                                        callSite = ez_0.c("\u00d4", (Object)callSite7, (long)4030530650449012851L, (long)l);
                                        if (callSite2 != null) break block39;
                                    }
                                    catch (MatchException matchException) {
                                        throw ez_0.c("p", (Object)matchException, (long)4029188546220253386L, (long)l);
                                    }
                                    if (callSite == false) break block40;
                                }
                                catch (MatchException matchException) {
                                    throw ez_0.c("p", (Object)matchException, (long)4029188546220253386L, (long)l);
                                }
                                if (ez_0.c("\u00d4", (Object)ez_0.c("\u00d4", (Object)callSite7, (long)4030711904185027977L, (long)l), (Object)ez_0.c("$", (long)4028850229690324262L, (long)l), (long)4029981992994139844L, (long)l) == false) break block40;
                            }
                            catch (MatchException matchException) {
                                throw ez_0.c("p", (Object)matchException, (long)4029188546220253386L, (long)l);
                            }
                            ez_0.c("\u00d4", (Object)ez_0.c("\u00ca", (Object)b, (long)4030169265256533682L, (long)l), (int)ez_0.c("\u00ca", (Object)class_17332, (long)4028478582406489744L, (long)l), (int)var14_10, (int)0, (Object)ez_0.c("$", (long)4028789164589696814L, (long)l), (Object)ez_0.c("\u00ca", (Object)b, (long)4029123221996227235L, (long)l), (long)4029056133307761779L, (long)l);
                            Object[] objectArray = new Object[1];
                            objectArray[0] = l3;
                            ez_0.c("\u00d4", (Object)this.c, (Object)objectArray, (long)4028581211271131868L, (long)l);
                            Object[] objectArray2 = new Object[1];
                            objectArray2[0] = l2;
                            ez_0.c("\u00d4", (Object)this.a, (Object)objectArray2, (long)4028992570933506343L, (long)l);
                            return;
                        }
                        catch (MatchException matchException) {
                            throw ez_0.c("p", (Object)matchException, (long)4029188546220253386L, (long)l);
                        }
                    }
                    ++var14_10;
                }
                if (callSite2 == null) continue;
            }
            callSite = ez_0.c("\u00d4", (Object)((Boolean)((Object)ez_0.c("\u00d4", (Object)this.d, (long)4030434297472076802L, (long)l))), (long)4030271563155071318L, (long)l);
        }
        try {
            if (callSite == false) return;
            ez_0.c("\u00d4", (Object)ez_0.c("\u00ca", (Object)b, (long)4029123221996227235L, (long)l), (long)4028895205391325666L, (long)l);
            return;
        }
        catch (MatchException matchException) {
            throw ez_0.c("p", (Object)matchException, (long)4029188546220253386L, (long)l);
        }
    }

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (p[n3] != null) {
            return n3;
        }
        Object object = o[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 30;
            case 1 -> 8;
            case 2 -> 51;
            case 3 -> 50;
            case 4 -> 32;
            case 5 -> 16;
            case 6 -> 55;
            case 7 -> 46;
            case 8 -> 45;
            case 9 -> 0;
            case 10 -> 56;
            case 11 -> 17;
            case 12 -> 31;
            case 13 -> 38;
            case 14 -> 54;
            case 15 -> 37;
            case 16 -> 58;
            case 17 -> 5;
            case 18 -> 61;
            case 19 -> 57;
            case 20 -> 6;
            case 21 -> 23;
            case 22 -> 48;
            case 23 -> 39;
            case 24 -> 26;
            case 25 -> 22;
            case 26 -> 35;
            case 27 -> 3;
            case 28 -> 63;
            case 29 -> 27;
            case 30 -> 34;
            case 31 -> 9;
            case 32 -> 11;
            case 33 -> 12;
            case 34 -> 62;
            case 35 -> 24;
            case 36 -> 47;
            case 37 -> 25;
            case 38 -> 53;
            case 39 -> 33;
            case 40 -> 19;
            case 41 -> 14;
            case 42 -> 20;
            case 43 -> 41;
            case 44 -> 36;
            case 45 -> 28;
            case 46 -> 7;
            case 47 -> 1;
            case 48 -> 60;
            case 49 -> 52;
            case 50 -> 15;
            case 51 -> 18;
            case 52 -> 42;
            case 53 -> 10;
            case 54 -> 59;
            case 55 -> 49;
            case 56 -> 13;
            case 57 -> 29;
            case 58 -> 43;
            case 59 -> 4;
            case 60 -> 21;
            case 61 -> 40;
            case 62 -> 2;
            default -> 44;
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
        ez_0.p[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = ez_0.m(l, l2);
        Object object = o[n];
        if (object instanceof String) {
            String string = p[n];
            int n2 = string.indexOf(8);
            Class clazz = ez_0.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ez_0.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ez_0.g(clazz3, string2, clazz2)) != null) {
                    ez_0.o[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ez_0.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ez_0.o[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ez_0.n(92419609523651L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = ez_0.m(l, l2);
        Object object = o[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = p[n];
                int n3 = string2.indexOf(8);
                clazz3 = ez_0.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ez_0.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ez_0.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        ez_0.o[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ez_0.n(92419609523651L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ez_0.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ez_0.o[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ez_0.n(92419609523651L, 0L);
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

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ez_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(ez_0.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


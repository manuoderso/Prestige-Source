/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1657
 *  net.minecraft.class_310
 *  net.minecraft.class_3966
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.aL;
import dev.zprestige.prestige.bG;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.dM;
import dev.zprestige.prestige.dO;
import dev.zprestige.prestige.dV;
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
import net.minecraft.class_1657;
import net.minecraft.class_310;
import net.minecraft.class_3966;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class fD
extends dV {
    private dM d;
    private dO a;
    private dO c;
    private dM e;
    private dM f;
    private f5 g;
    private f5 h;
    private int i;
    private int j;
    private static final long k = hc.a(4439809856667221959L, -1753502052949671064L, MethodHandles.lookup().lookupClass()).a(153333843725800L);
    private static final long[] l;
    private static final Integer[] m;
    private static final Map n;
    private static final Object[] o;
    private static final String[] p;

    public fD() {
        long l = k ^ 0x668D9CB8D77AL;
        long l2 = l ^ 0x549DF2736EDDL;
        this.g = new f5(l2);
        this.h = new f5(l2);
        this.i = -1;
        this.j = 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        o = new Object[65];
        p = new String[65];
        fD.f();
        n = new HashMap(13);
        long l = k ^ 0x1D67DBAB5164L;
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
        String string = "\u009cu\u0010\u00eb\u00a1\u00b0\u00ab\u0090\u00a3c\u00ac\u00cdh_\u00843\u00e8\u0017^\u00fa\u00e5\u0015\u0084\u00ed";
        int n2 = "\u009cu\u0010\u00eb\u00a1\u00b0\u00ab\u0090\u00a3c\u00ac\u00cdh_\u00843\u00e8\u0017^\u00fa\u00e5\u0015\u0084\u00ed".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        fD.l = lArray;
        m = new Integer[3];
    }

    @Override
    public void e(Object[] objectArray) {
        long l = (Long)objectArray[0];
        this.i = -1;
        this.j = 0;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = fD.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x26F8;
        if (m[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = fD.l[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])fD.n.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    fD.n.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/fD", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            fD.m[n2] = n3;
        }
        return m[n2];
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/fD" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/fD" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = fD.m(l, l2);
            object = o[n];
            try {
                if (!(object instanceof String)) break block2;
                fD.o[n] = clazz = Class.forName(p[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = fD.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = fD.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = fD.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = fD.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = o;
        o[0] = "\u001a5Tx~;\f5Q\"m,\u001b~R$a8\n9E3**6";
        objectArray[1] = "}MU,,\u0015\bm^#=ZuuM$4\u0013\u001d";
        objectArray[2] = "I6\u0006w\u001b:I6\u0011+\u00175S}\u00115\u0017 T\fAhF";
        objectArray[3] = "\u0000 \u0015||F\u0000 \u0002 pI\u001ak\u0002>p\\\u001d\u001aVf'";
        objectArray[4] = "Yiy\u0002\u007f\u0014Oi|Xl\u0003X\"\u007f^`\u0017IehI+\u0002y";
        objectArray[5] = "\tZ=f\u001c4\u0002U,)\u007f9\u0017X#BJ;\u0006K?n]6";
        objectArray[6] = "\u0006jCA\u000e\u0015\u0010jF\u001b\u001d\u0002\u0007!E\u001d\u0011\u0016\u0016fR\nZ\u0006\u0010";
        objectArray[7] = "~\u0006\u0003\u0001\b4\u000b&\b\u000e\u0019{j(\u0003\u0005\u001d!\u001e";
        objectArray[8] = Boolean.TYPE;
        fD.p[8] = "java/lang/Boolean";
        objectArray[9] = "t\u007f)=\u0015Tt\u007f>a\u0019[n4>\u007f\u0019NiEl%N\f";
        objectArray[10] = Integer.TYPE;
        fD.p[10] = "java/lang/Integer";
        objectArray[11] = "\u001bq`y\u0007\u0019\u001bqw%\u000b\u0016\u0001:w;\u000b\u0003\u0006K%`SI";
        objectArray[12] = "\u0005.p\u0016N_\u0005.gJBP\u001fegTBE\u0018\u00147\u0001\u0015\u0000";
        objectArray[13] = "\nc?H)Z\nc(\u0014%U\u0010((\n%@\u0017YzT}\u0004";
        objectArray[14] = "yq\u0017~nk\fQ\u001cq\u007f$m_\u0017z{~\u0019";
        objectArray[15] = "ID\t\u000eb\u0012ID\u001eRn\u001dS\u000f\u001eLn\bT~O\u00136";
        objectArray[16] = "]GAT*\u000b(gJ[;DIiAP?\u001e=";
        objectArray[17] = "\u0013-(!?\u0019f\r#..V\u0007\u0003(%*\fs";
        objectArray[18] = Void.TYPE;
        fD.p[18] = "java/lang/Void";
        objectArray[19] = "~,nrG4~,y.K;dgy0K.c\u0016,o\u0012";
        objectArray[20] = "\t*s\rPb\u001f*vWCu\bauQOa\u0019&bF\u0004t\\";
        objectArray[21] = ":\u0002y-8\tO\"r\")F.,y)-\u001cZ";
        objectArray[22] = "\u0007\u0012Ym^S\u0007\u0012N1R\\\u001dYN/RI\u001a(\u001ct\n\b";
        objectArray[23] = "\u001d\u001b1HF\u0007\u0016\u0014 \u0007*\u0004\u0018\u0016\"H\u0006";
        objectArray[24] = "OI9\u00159sOI.I5|U\u0002.W5iRsy\bc";
        objectArray[25] = "\u0017?T%b9b\u001f_*sv\u0003\u0011T!w,w";
        objectArray[26] = ">xSx\u0014/KXXw\u0005`*VS|\u0001:^";
        objectArray[27] = "yNrUGLoNw\u000fT[x\u0005t\tXOiBc\u001e\u0013XV";
        objectArray[28] = "m]2~~LfR#1\u001fBmY'k";
        objectArray[29] = "U^\u0001\rR3 ~\n\u0002C|Ap\u0001\tG&5";
        objectArray[30] = "zX)cE$lX,9V3{\u0013/?Z'jT8(\u00112+";
        objectArray[31] = ":v\u0010S_}OV\u001b\\N2.X\u0010WJhZ";
        objectArray[32] = "j|_RA\u0019j|H\u000eM\u0016p7H\u0010M\u0003wF\u001aD\u001cB";
        objectArray[33] = "zG)\u0012*(\u000fg\"\u001d;gni)\u0016?=\u001a";
        objectArray[34] = "L;j\u007f(vZ;o%;aMpl#7u\\7{4|eG";
        objectArray[35] = "Y\u0007LoQq,'G`@>M)LkDd9";
        objectArray[36] = "A\u001a`}J]J\u0015q2\"]D\u001ab";
        objectArray[37] = Float.TYPE;
        fD.p[37] = "java/lang/Float";
        objectArray[38] = "\u000fcY\u0006\u0016\t\n3YmE7\fd\u0004\u001dD\u0006^&\u0007Q/";
        objectArray[39] = "\u00138\u000f\b}SG9E@\u0006FK-\u001a\u0014Q\u0011\u0015zBx<OU:\u0003\u0016c\u0015G,";
        objectArray[40] = "\u001f\u0013\t2\f]K\u0012CzwHG\u0006\u001c. \u001f\u0019UEB\u001eKT\u000f\u0013!\u001a\u001c\u001d\u0000";
        objectArray[41] = "\u0014es\u0007A\u0013Q&6V0\u0003.\u007fw\u0010IW\u001fh5\u0015Vo\u0010hy\u000b\n\u0012V(z\u00040";
        objectArray[42] = "\u0012\u0014gy{lG@'<\u0000cvL }y2G[bxf\nKHf}=h\u0019Y&y\u0000";
        objectArray[43] = "\tN\r9Wt\f\u001e\rR\u0007JT\u000f\u0015+V{CM\u00104n!QB\bl\n0H\fRR";
        objectArray[44] = "\u0004wSr.\tPv\u0019:U\u001c\\bFn\u0002K\u0003?\u001d\u00029\u0012Q~\u001dy<\b@o";
        objectArray[45] = "\"\u000fnQXL|[qSdP\u007fH~O\bb-\u0005&\u0019d[xItX\u001a\bjPw(";
        objectArray[46] = "^\bCaK\u0002\n\t\t)0\u0017\u0006\u001dV}g@XM\u000f\u0011_\u0000W\fWk\nD\u001a\u0017";
        objectArray[47] = "\n9siH\u0004Uca\u007f5\u000f]\"ltY=\u000ef0,5Z\u000b.u/L\u0004_1w\u0013";
        objectArray[48] = "I~#\"r\u0010\u0016$14\u000f\u001b\u001ee<?c)H ad?~Mbm>s\u0005\t!2%\u000f";
        objectArray[49] = "q+0\u001d\"#$\u007fpXY,\u0015sw\u0019 }$d5\u001c?E~v:\u0004g!oot^Y";
        objectArray[50] = "[f/_g.\u000fge\u0017\u001c0\u000fb>Hp\u0002[#`\u001e\u001ch\u0001$#\u0012~:\u0010d'/";
        objectArray[51] = " _\thE77\u0005\u001c7/!$T\u0003`x\u007f\u007f\tW\fA%8S\u0017r\u00127!P";
        objectArray[52] = "|\u001b\u00069\u0005\u001d}\\\u0005t{\u0002!\u0019\u0006c\u00170uZY4Ag}^\u0005:\u0012\u001d%\n\u0017`{";
        objectArray[53] = "\u0019kl[\u0019J\\()\nh_#qhL\u0011\u000e\u0012f*I\u000e6\u001dffWRK[&eXh";
        objectArray[54] = "\u000f\u001e'e\u0010\u0003J]b4a\u00165X 1\u0010\r[[`q\u001f\u007f\u000e\u001ca~\u0013\u0011\r\\!qa";
        objectArray[55] = "P?RQacCq\u0005B\u001f2=gDQf`\fp\u0006TyX\u0000c\u0002Q\":RrBU\u001f";
        objectArray[56] = ":j\u000e%n\u0019kf\u001fq\n\u001321\u0003wc\u001f\u000b?\u0003ggyh5]g7\u001b:$\u001dc\n";
        objectArray[57] = "Gt\u0004\u00003N\u000bd\u0014\u0007CX{|\u0007\u0007:\tJkE\u0002%1\u0010yJ\u001a}U\u0001`\u0004@C";
        objectArray[58] = "\u0014\u007f\f \u000b Xo\u001c'{5(w\u000f'\u0002g\u0019`M\"\u001d_\u0015sI'F=Gb\t#{";
        objectArray[59] = "SXG\u000eHt\u0005[LEy 5GB\u0003\u0000q\u0004P\u0000\u0006\u001fI^B\u000f\u001eG-O[ADy";
        objectArray[60] = "\u0013\b4ic\u0016WKkr\u001f\b@\u000fehs:\u0010O>?\u001fS]\u0001c5b\u0015\u001d\u0002l\u000f/V]\n9vq\u0002B\b\u0005";
        objectArray[61] = "^;\u001d;:\u0005\u0012+\r<J\u0013b3\u001e<3BS$\\9,z\\$\u0010'p\u0007\u001ad\u0013(J";
        objectArray[62] = "\u000bdUw>]\u00156P,]Wi=Z&&A\faE}7>";
        objectArray[63] = "O{J9\u001a\fG$M,gRS%D\"9US?@^\u001fZ\u0007:\u0017'\u0000\u0001\u0007.-";
        Object[] objectArray2 = objectArray;
        objectArray[64] = "\u0001ftQv]MvdV\u0006K=nwV\u007f\u001a\fy5S`\"\u0000j1V;@R{qR\u0006";
    }

    @Override
    public void d(Object[] objectArray) {
        long l = (Long)objectArray[0];
        this.i = -1;
        this.j = 0;
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = fD.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00ef' || c == 'y' || c == '\u00cd' || c == '\u00ee') {
                field = fD.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00ef' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'y' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00cd' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = fD.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00cc' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00f3' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private int d(Object[] objectArray) {
        Object object;
        block5: {
            long l = (Long)objectArray[0];
            long l2 = (l = k ^ l) ^ 0x6AFF5A1036F0L;
            CallSite callSite = fD.c("\u00f3", (long)2491825855041879241L, (long)l);
            for (int i = 0; i <= fD.b("z", (int)32171, (long)(0x2AA4C5FD90DFF9CEL ^ l)); ++i) {
                int n;
                block6: {
                    try {
                        try {
                            Object[] objectArray2 = new Object[2];
                            objectArray2[1] = l2;
                            objectArray2[0] = fD.c("\u00cc", (Object)fD.c("\u00cc", (Object)fD.c("\u00ef", (Object)b, (long)2491865568905150417L, (long)l), (long)2490786006193596824L, (long)l), (int)i, (long)2491105111945803806L, (long)l);
                            object = fD.c("\u00f3", (Object)objectArray2, (long)2491482347076950858L, (long)l);
                            if (callSite != null) break block5;
                            if (callSite != null) break block6;
                        }
                        catch (MatchException matchException) {
                            throw fD.c("\u00f3", (Object)matchException, (long)2490663259168511973L, (long)l);
                        }
                        if (object == 0) continue;
                    }
                    catch (MatchException matchException) {
                        throw fD.c("\u00f3", (Object)matchException, (long)2490663259168511973L, (long)l);
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
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @bP
    public void a(bG var1_1) {
        block44: {
            block48: {
                block46: {
                    block47: {
                        block45: {
                            block40: {
                                block42: {
                                    block43: {
                                        block41: {
                                            block39: {
                                                block38: {
                                                    v0 = var2_2 = fD.k ^ 105554553301670L;
                                                    var4_3 = v0 ^ 98350492030394L;
                                                    var6_4 = v0 ^ 18601250666241L;
                                                    var8_5 = v0 ^ 114331628401387L;
                                                    var10_6 = v0 ^ 78884216704912L;
                                                    var12_7 = fD.c("\u00f3", (long)2924515590839645896L, (long)var2_2);
                                                    try {
                                                        if (this.j == 0) {
                                                            return;
                                                        }
                                                    }
                                                    catch (MatchException v1) {
                                                        throw fD.c("\u00f3", (Object)v1, (long)2923350794401619428L, (long)var2_2);
                                                    }
                                                    try {
                                                        try {
                                                            v2 = fD.b;
                                                            if (var12_7 != null) break block38;
                                                            if (fD.c("\u00ef", (Object)v2, (long)2924432161994913232L, (long)var2_2) != null) {
                                                            }
                                                            ** GOTO lbl30
                                                        }
                                                        catch (MatchException v3) {
                                                            throw fD.c("\u00f3", (Object)v3, (long)2923350794401619428L, (long)var2_2);
                                                        }
                                                        v2 = fD.b;
                                                    }
                                                    catch (MatchException v4) {
                                                        throw fD.c("\u00f3", (Object)v4, (long)2923350794401619428L, (long)var2_2);
                                                    }
                                                }
                                                try {
                                                    if (fD.c("\u00ef", (Object)v2, (long)2924901945735294518L, (long)var2_2) != null) break block39;
lbl30:
                                                    // 2 sources

                                                    this.j = 0;
                                                    this.i = -1;
                                                    return;
                                                }
                                                catch (MatchException v5) {
                                                    throw fD.c("\u00f3", (Object)v5, (long)2923350794401619428L, (long)var2_2);
                                                }
                                            }
                                            try {
                                                try {
                                                    try {
                                                        v6 /* !! */  = this.j;
                                                        v7 = 1;
                                                        if (var12_7 != null) break block40;
                                                        if (v6 /* !! */  == v7) {
                                                        }
                                                        ** GOTO lbl93
                                                    }
                                                    catch (MatchException v8) {
                                                        throw fD.c("\u00f3", (Object)v8, (long)2923350794401619428L, (long)var2_2);
                                                    }
                                                    v9 = new Object[2];
                                                    v9[1] = var10_6;
                                                    v9[0] = Float.valueOf((float)fD.c("\u00cc", (Object)((Float)fD.c("\u00cc", (Object)this.a, (long)2923910660300926320L, (long)var2_2)), (long)2923864405633691091L, (long)var2_2));
                                                    if (fD.c("\u00cc", (Object)this.g, (Object)v9, (long)2924786500502286101L, (long)var2_2) != false) break block41;
                                                }
                                                catch (MatchException v10) {
                                                    throw fD.c("\u00f3", (Object)v10, (long)2923350794401619428L, (long)var2_2);
                                                }
                                                return;
                                            }
                                            catch (MatchException v11) {
                                                throw fD.c("\u00f3", (Object)v11, (long)2923350794401619428L, (long)var2_2);
                                            }
                                        }
                                        var14_8 = fD.c("\u00ef", (Object)fD.b, (long)2924639871343225261L, (long)var2_2);
                                        try {
                                            if (var12_7 != null) break block42;
                                            if (!(var14_8 instanceof class_3966)) break block43;
                                        }
                                        catch (MatchException v12) {
                                            throw fD.c("\u00f3", (Object)v12, (long)2923350794401619428L, (long)var2_2);
                                        }
                                        var13_9 = (class_3966)var14_8;
                                        var14_8 = fD.c("\u00cc", (Object)var13_9, (long)2923239546265198994L, (long)var2_2);
                                        try {
                                            try {
                                                if (var12_7 != null) break block42;
                                                if (var14_8 == null) break block43;
                                            }
                                            catch (MatchException v13) {
                                                throw fD.c("\u00f3", (Object)v13, (long)2923350794401619428L, (long)var2_2);
                                            }
                                            v14 = new Object[2];
                                            v14[1] = var4_3;
                                            v14[0] = var14_8;
                                            fD.c("\u00f3", (Object)v14, (long)2923582992428068544L, (long)var2_2);
                                        }
                                        catch (MatchException v15) {
                                            throw fD.c("\u00f3", (Object)v15, (long)2923350794401619428L, (long)var2_2);
                                        }
                                    }
                                    this.j = (int)fD.b("z", (int)29819, (long)(3899904459702336029L ^ var2_2));
                                    v16 = new Object[1];
                                    v16[0] = var6_4;
                                    fD.c("\u00cc", (Object)this.h, (Object)v16, (long)2922871871621290748L, (long)var2_2);
                                }
                                try {
                                    try {
                                        if (var12_7 == null) break block44;
lbl93:
                                        // 2 sources

                                        v6 /* !! */  = this.j;
                                        if (var12_7 != null) break block45;
                                    }
                                    catch (MatchException v17) {
                                        throw fD.c("\u00f3", (Object)v17, (long)2923350794401619428L, (long)var2_2);
                                    }
                                    v7 = 2;
                                }
                                catch (MatchException v18) {
                                    throw fD.c("\u00f3", (Object)v18, (long)2923350794401619428L, (long)var2_2);
                                }
                            }
                            try {
                                if (v6 /* !! */  != v7) break block44;
                                v19 = new Object[2];
                                v19[1] = var10_6;
                                v19[0] = Float.valueOf((float)fD.c("\u00cc", (Object)((Float)fD.c("\u00cc", (Object)this.c, (long)2923910660300926320L, (long)var2_2)), (long)2923864405633691091L, (long)var2_2));
                                v6 /* !! */  = (int)fD.c("\u00cc", (Object)this.h, (Object)v19, (long)2924786500502286101L, (long)var2_2);
                            }
                            catch (MatchException v20) {
                                throw fD.c("\u00f3", (Object)v20, (long)2923350794401619428L, (long)var2_2);
                            }
                        }
                        try {
                            if (var12_7 != null) break block46;
                            if (v6 /* !! */  != 0) break block47;
                        }
                        catch (MatchException v21) {
                            throw fD.c("\u00f3", (Object)v21, (long)2923350794401619428L, (long)var2_2);
                        }
                        return;
                    }
                    try {
                        v22 = this;
                        if (var12_7 != null) break block48;
                        v6 /* !! */  = v22.i;
                    }
                    catch (MatchException v23) {
                        throw fD.c("\u00f3", (Object)v23, (long)2923350794401619428L, (long)var2_2);
                    }
                }
                try {
                    if (v6 /* !! */  != -1) {
                        v24 = new Object[2];
                        v24[1] = var8_5;
                        v24[0] = this.i;
                        fD.c("\u00f3", (Object)v24, (long)2923413479321703039L, (long)var2_2);
                        this.i = -1;
                    }
                }
                catch (MatchException v25) {
                    throw fD.c("\u00f3", (Object)v25, (long)2923350794401619428L, (long)var2_2);
                }
                v22 = this;
            }
            v22.j = 0;
        }
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @bP
    public void a(aL aL2) {
        CallSite callSite;
        long l;
        long l2;
        long l3;
        long l4;
        block78: {
            CallSite callSite2;
            block79: {
                CallSite callSite3;
                block80: {
                    CallSite callSite4;
                    CallSite callSite5;
                    block73: {
                        long l5;
                        block74: {
                            CallSite callSite6;
                            block76: {
                                CallSite callSite7;
                                block77: {
                                    CallSite callSite8;
                                    block75: {
                                        CallSite callSite9;
                                        long l6;
                                        long l7;
                                        block72: {
                                            CallSite callSite10;
                                            CallSite callSite11;
                                            block71: {
                                                class_310 class_3102;
                                                block70: {
                                                    block69: {
                                                        CallSite callSite12;
                                                        block67: {
                                                            block68: {
                                                                class_310 class_3103;
                                                                long l8;
                                                                block65: {
                                                                    block66: {
                                                                        block64: {
                                                                            block62: {
                                                                                block63: {
                                                                                    block61: {
                                                                                        long l9 = l4 = k ^ 0x590F81DDB290L;
                                                                                        l8 = l9 ^ 0x8D602682895L;
                                                                                        l5 = l9 ^ 0x22F827F20E39L;
                                                                                        l7 = l9 ^ 0x4DFE956CCD1AL;
                                                                                        l3 = l9 ^ 0x29E5248AEF37L;
                                                                                        l6 = l9 ^ 0x55F08B04900DL;
                                                                                        l2 = l9 ^ 0x5EF43C622ADDL;
                                                                                        l = l9 ^ 0x6D86870970EL;
                                                                                        callSite5 = fD.c("\u00f3", (long)-1106814168730931458L, (long)l4);
                                                                                        try {
                                                                                            try {
                                                                                                class_3103 = b;
                                                                                                if (callSite5 != null) break block61;
                                                                                                if (fD.c("\u00ef", (Object)class_3103, (long)-1106879999361290778L, (long)l4) == null) return;
                                                                                            }
                                                                                            catch (MatchException matchException) {
                                                                                                throw fD.c("\u00f3", (Object)matchException, (long)-1105654595980311086L, (long)l4);
                                                                                            }
                                                                                            class_3103 = b;
                                                                                        }
                                                                                        catch (MatchException matchException) {
                                                                                            throw fD.c("\u00f3", (Object)matchException, (long)-1105654595980311086L, (long)l4);
                                                                                        }
                                                                                    }
                                                                                    try {
                                                                                        try {
                                                                                            if (callSite5 != null) break block62;
                                                                                            if (fD.c("\u00ef", (Object)class_3103, (long)-1107481036463507968L, (long)l4) != null) break block63;
                                                                                            return;
                                                                                        }
                                                                                        catch (MatchException matchException) {
                                                                                            throw fD.c("\u00f3", (Object)matchException, (long)-1105654595980311086L, (long)l4);
                                                                                        }
                                                                                    }
                                                                                    catch (MatchException matchException) {
                                                                                        throw fD.c("\u00f3", (Object)matchException, (long)-1105654595980311086L, (long)l4);
                                                                                    }
                                                                                }
                                                                                class_3103 = b;
                                                                            }
                                                                            try {
                                                                                try {
                                                                                    if (callSite5 != null) break block64;
                                                                                    if (fD.c("\u00cc", (Object)class_3103, (long)-1105920661121129253L, (long)l4) == false) return;
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw fD.c("\u00f3", (Object)matchException, (long)-1105654595980311086L, (long)l4);
                                                                                }
                                                                                class_3103 = b;
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw fD.c("\u00f3", (Object)matchException, (long)-1105654595980311086L, (long)l4);
                                                                            }
                                                                        }
                                                                        try {
                                                                            try {
                                                                                if (callSite5 != null) break block65;
                                                                                if (fD.c("\u00ef", (Object)class_3103, (long)-1107387980884206151L, (long)l4) == null) break block66;
                                                                                return;
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw fD.c("\u00f3", (Object)matchException, (long)-1105654595980311086L, (long)l4);
                                                                            }
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw fD.c("\u00f3", (Object)matchException, (long)-1105654595980311086L, (long)l4);
                                                                        }
                                                                    }
                                                                    class_3103 = b;
                                                                }
                                                                try {
                                                                    Object[] objectArray = new Object[2];
                                                                    objectArray[1] = l8;
                                                                    objectArray[0] = fD.c("\u00cc", (Object)fD.c("\u00ef", (Object)class_3103, (long)-1106879999361290778L, (long)l4), (long)-1107445764134403552L, (long)l4);
                                                                    callSite12 = fD.c("\u00f3", (Object)objectArray, (long)-1100451646984831842L, (long)l4);
                                                                    if (callSite5 != null) break block67;
                                                                    if (callSite12 == false) break block68;
                                                                    return;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw fD.c("\u00f3", (Object)matchException, (long)-1105654595980311086L, (long)l4);
                                                                }
                                                            }
                                                            callSite12 = fD.c("\u00cc", (Object)((Boolean)((Object)fD.c("\u00cc", (Object)this.d, (long)-1106222708216285882L, (long)l4))), (long)-1106641099432790319L, (long)l4);
                                                        }
                                                        try {
                                                            try {
                                                                try {
                                                                    if (callSite12 == false) break block69;
                                                                    class_3102 = b;
                                                                    if (callSite5 != null) break block70;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw fD.c("\u00f3", (Object)matchException, (long)-1105654595980311086L, (long)l4);
                                                                }
                                                                if (fD.c("\u00cc", (Object)fD.c("\u00cc", (Object)fD.c("\u00ef", (Object)class_3102, (long)-1106879999361290778L, (long)l4), (long)-1107445764134403552L, (long)l4), (long)-1107562924939087105L, (long)l4) == fD.c("\u00cd", (long)-1106026727161502621L, (long)l4)) break block69;
                                                                return;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw fD.c("\u00f3", (Object)matchException, (long)-1105654595980311086L, (long)l4);
                                                            }
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw fD.c("\u00f3", (Object)matchException, (long)-1105654595980311086L, (long)l4);
                                                        }
                                                    }
                                                    class_3102 = b;
                                                }
                                                callSite11 = fD.c("\u00ef", (Object)class_3102, (long)-1107795930764955237L, (long)l4);
                                                try {
                                                    try {
                                                        callSite10 = callSite11;
                                                        if (callSite5 != null) break block71;
                                                        if (!(callSite10 instanceof class_3966)) return;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw fD.c("\u00f3", (Object)matchException, (long)-1105654595980311086L, (long)l4);
                                                    }
                                                    callSite10 = callSite11;
                                                }
                                                catch (MatchException matchException) {
                                                    throw fD.c("\u00f3", (Object)matchException, (long)-1105654595980311086L, (long)l4);
                                                }
                                            }
                                            class_3966 class_39662 = (class_3966)callSite10;
                                            try {
                                                if (callSite5 != null) {
                                                    return;
                                                }
                                            }
                                            catch (MatchException matchException) {
                                                throw fD.c("\u00f3", (Object)matchException, (long)-1105654595980311086L, (long)l4);
                                            }
                                            callSite11 = fD.c("\u00cc", (Object)class_39662, (long)-1105818500410623580L, (long)l4);
                                            try {
                                                try {
                                                    callSite9 = callSite11;
                                                    if (callSite5 != null) break block72;
                                                    if (!(callSite9 instanceof class_1657)) return;
                                                }
                                                catch (MatchException matchException) {
                                                    throw fD.c("\u00f3", (Object)matchException, (long)-1105654595980311086L, (long)l4);
                                                }
                                                callSite9 = callSite11;
                                            }
                                            catch (MatchException matchException) {
                                                throw fD.c("\u00f3", (Object)matchException, (long)-1105654595980311086L, (long)l4);
                                            }
                                        }
                                        class_1657 class_16572 = (class_1657)callSite9;
                                        try {
                                            if (callSite5 != null) {
                                                return;
                                            }
                                        }
                                        catch (MatchException matchException) {
                                            throw fD.c("\u00f3", (Object)matchException, (long)-1105654595980311086L, (long)l4);
                                        }
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                callSite4 = fD.c("\u00cc", (Object)((Boolean)((Object)fD.c("\u00cc", (Object)this.e, (long)-1106222708216285882L, (long)l4))), (long)-1106641099432790319L, (long)l4);
                                                                if (callSite5 != null) break block73;
                                                                if (callSite4 == false) break block74;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw fD.c("\u00f3", (Object)matchException, (long)-1105654595980311086L, (long)l4);
                                                            }
                                                            Object[] objectArray = new Object[2];
                                                            objectArray[1] = l7;
                                                            objectArray[0] = class_16572;
                                                            callSite4 = fD.c("\u00f3", (Object)objectArray, (long)-1105714112431660214L, (long)l4);
                                                            if (callSite5 != null) break block73;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw fD.c("\u00f3", (Object)matchException, (long)-1105654595980311086L, (long)l4);
                                                        }
                                                        if (callSite4 == false) break block74;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw fD.c("\u00f3", (Object)matchException, (long)-1105654595980311086L, (long)l4);
                                                    }
                                                    callSite8 = fD.c("\u00cc", (Object)((Boolean)((Object)fD.c("\u00cc", (Object)this.f, (long)-1106222708216285882L, (long)l4))), (long)-1106641099432790319L, (long)l4);
                                                    if (callSite5 != null) break block75;
                                                }
                                                catch (MatchException matchException) {
                                                    throw fD.c("\u00f3", (Object)matchException, (long)-1105654595980311086L, (long)l4);
                                                }
                                                if (callSite8 == false) return;
                                            }
                                            catch (MatchException matchException) {
                                                throw fD.c("\u00f3", (Object)matchException, (long)-1105654595980311086L, (long)l4);
                                            }
                                            Object[] objectArray = new Object[1];
                                            objectArray[0] = l6;
                                            callSite8 = fD.c("\u00cc", (Object)this, (Object)objectArray, (long)-1107874894233162047L, (long)l4);
                                        }
                                        catch (MatchException matchException) {
                                            throw fD.c("\u00f3", (Object)matchException, (long)-1105654595980311086L, (long)l4);
                                        }
                                    }
                                    callSite7 = callSite8;
                                    try {
                                        try {
                                            callSite6 = callSite7;
                                            if (callSite5 != null) break block76;
                                            if (callSite6 != -1) break block77;
                                            return;
                                        }
                                        catch (MatchException matchException) {
                                            throw fD.c("\u00f3", (Object)matchException, (long)-1105654595980311086L, (long)l4);
                                        }
                                    }
                                    catch (MatchException matchException) {
                                        throw fD.c("\u00f3", (Object)matchException, (long)-1105654595980311086L, (long)l4);
                                    }
                                }
                                callSite6 = callSite7;
                            }
                            callSite = callSite6;
                            try {
                                if (callSite5 != null) {
                                    return;
                                }
                                break block78;
                            }
                            catch (MatchException matchException) {
                                throw fD.c("\u00f3", (Object)matchException, (long)-1105654595980311086L, (long)l4);
                            }
                        }
                        Object[] objectArray = new Object[1];
                        objectArray[0] = l5;
                        callSite4 = fD.c("\u00cc", (Object)this, (Object)objectArray, (long)-1105860841728473876L, (long)l4);
                    }
                    callSite3 = callSite4;
                    try {
                        try {
                            callSite2 = callSite3;
                            if (callSite5 != null) break block79;
                            if (callSite2 != -1) break block80;
                            return;
                        }
                        catch (MatchException matchException) {
                            throw fD.c("\u00f3", (Object)matchException, (long)-1105654595980311086L, (long)l4);
                        }
                    }
                    catch (MatchException matchException) {
                        throw fD.c("\u00f3", (Object)matchException, (long)-1105654595980311086L, (long)l4);
                    }
                }
                callSite2 = callSite3;
            }
            callSite = callSite2;
        }
        fD.c("\u00cc", (Object)aL2, (Object)new Object[0], (long)-1107711478838873993L, (long)l4);
        Object[] objectArray = new Object[1];
        objectArray[0] = l;
        this.i = (int)fD.c("\u00f3", (Object)objectArray, (long)-1106420587669092682L, (long)l4);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = (int)callSite;
        fD.c("\u00f3", (Object)objectArray2, (long)-1106702305594062263L, (long)l4);
        this.j = 1;
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l3;
        fD.c("\u00cc", (Object)this.g, (Object)objectArray3, (long)-1106168668245654838L, (long)l4);
    }

    private int a(Object[] objectArray) {
        Object object;
        block5: {
            long l = (Long)objectArray[0];
            long l2 = (l = k ^ l) ^ 0xFD7AD156496L;
            CallSite callSite = fD.c("\u00f3", (long)-4854658979335167235L, (long)l);
            for (int i = 0; i <= fD.b("z", (int)31928, (long)(0x6E1DC3DD8223E6E8L ^ l)); ++i) {
                int n;
                block6: {
                    try {
                        try {
                            Object[] objectArray2 = new Object[2];
                            objectArray2[1] = l2;
                            objectArray2[0] = fD.c("\u00cc", (Object)fD.c("\u00cc", (Object)fD.c("\u00ef", (Object)b, (long)-4854716017518534171L, (long)l), (long)-4853337071964096596L, (long)l), (int)i, (long)-4853092668847757782L, (long)l);
                            object = fD.c("\u00f3", (Object)objectArray2, (long)-4847722512789475171L, (long)l);
                            if (callSite != null) break block5;
                            if (callSite != null) break block6;
                        }
                        catch (MatchException matchException) {
                            throw fD.c("\u00f3", (Object)matchException, (long)-4853497206550984239L, (long)l);
                        }
                        if (object == 0) continue;
                    }
                    catch (MatchException matchException) {
                        throw fD.c("\u00f3", (Object)matchException, (long)-4853497206550984239L, (long)l);
                    }
                    n = i;
                }
                return n;
            }
            object = -1;
        }
        return object;
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
            case 0 -> 15;
            case 1 -> 51;
            case 2 -> 6;
            case 3 -> 50;
            case 4 -> 48;
            case 5 -> 10;
            case 6 -> 33;
            case 7 -> 17;
            case 8 -> 30;
            case 9 -> 63;
            case 10 -> 31;
            case 11 -> 3;
            case 12 -> 11;
            case 13 -> 47;
            case 14 -> 55;
            case 15 -> 58;
            case 16 -> 22;
            case 17 -> 14;
            case 18 -> 42;
            case 19 -> 8;
            case 20 -> 25;
            case 21 -> 60;
            case 22 -> 24;
            case 23 -> 46;
            case 24 -> 12;
            case 25 -> 19;
            case 26 -> 49;
            case 27 -> 5;
            case 28 -> 61;
            case 29 -> 4;
            case 30 -> 56;
            case 31 -> 23;
            case 32 -> 39;
            case 33 -> 20;
            case 34 -> 0;
            case 35 -> 41;
            case 36 -> 1;
            case 37 -> 54;
            case 38 -> 13;
            case 39 -> 57;
            case 40 -> 26;
            case 41 -> 32;
            case 42 -> 7;
            case 43 -> 18;
            case 44 -> 21;
            case 45 -> 62;
            case 46 -> 34;
            case 47 -> 45;
            case 48 -> 29;
            case 49 -> 9;
            case 50 -> 16;
            case 51 -> 35;
            case 52 -> 37;
            case 53 -> 59;
            case 54 -> 36;
            case 55 -> 28;
            case 56 -> 27;
            case 57 -> 2;
            case 58 -> 52;
            case 59 -> 44;
            case 60 -> 40;
            case 61 -> 43;
            case 62 -> 38;
            default -> 53;
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
        fD.p[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = fD.m(l, l2);
        Object object = o[n];
        if (object instanceof String) {
            String string = p[n];
            int n2 = string.indexOf(8);
            Class clazz = fD.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = fD.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = fD.g(clazz3, string2, clazz2)) != null) {
                    fD.o[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = fD.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        fD.o[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = fD.n(2023739095690667L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = fD.m(l, l2);
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
                clazz3 = fD.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = fD.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = fD.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        fD.o[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = fD.n(2023739095690667L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = fD.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        fD.o[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = fD.n(2023739095690667L, 0L);
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

    private boolean lambda$new$0(Boolean bl) {
        long l = k ^ 0x65448EB24787L;
        return (boolean)fD.c("\u00cc", (Object)((Boolean)((Object)fD.c("\u00cc", (Object)this.e, (long)410623637694169169L, (long)l))), (long)410768213473362886L, (long)l);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(fD.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(fD.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


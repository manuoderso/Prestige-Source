/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_310
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.aK;
import dev.zprestige.prestige.bG;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.dQ;
import dev.zprestige.prestige.dV;
import dev.zprestige.prestige.fN;
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
import net.minecraft.class_310;

public class e4
extends dV {
    private dQ a;
    private boolean i = 0;
    private int c = -1;
    private static final long k = hc.a(6673551960568415586L, -8519681630760439254L, MethodHandles.lookup().lookupClass()).a(238945347436066L);
    private static final long[] l;
    private static final Integer[] m;
    private static final Map n;
    private static final Object[] o;
    private static final String[] p;

    /*
     * Enabled aggressive block sorting
     */
    static {
        o = new Object[68];
        p = new String[68];
        e4.f();
        n = new HashMap(13);
        long l = k ^ 0x732765E18429L;
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
        long[] lArray = new long[2];
        int n = 0;
        String string = "i\u00c1+|Z\u00ce\u00a2\u00c5TIW?\u00aa\u00bc\u00d12";
        int n2 = "i\u00c1+|Z\u00ce\u00a2\u00c5TIW?\u00aa\u00bc\u00d12".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        e4.l = lArray;
        m = new Integer[2];
    }

    private boolean e(Object[] objectArray) {
        Object object;
        block18: {
            long l = (Long)objectArray[0];
            l = k ^ l;
            CallSite callSite = e4.c("T", (Object)e4.c("T", (Object)e4.c("\u00d3", (long)-8411261626429863747L, (long)l), (long)-8404270672449320699L, (long)l), (long)-8404155593183131732L, (long)l);
            CallSite callSite2 = e4.c("D", (long)-8410629249475262243L, (long)l);
            while (e4.c("T", (Object)callSite, (long)-8411089125879891601L, (long)l) != false) {
                block20: {
                    Object object2;
                    block22: {
                        block24: {
                            block23: {
                                dV dV2;
                                block21: {
                                    CallSite callSite3;
                                    dV dV3;
                                    block19: {
                                        dV3 = (dV)((Object)e4.c("T", (Object)callSite, (long)-8412695869135810751L, (long)l));
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        object = e4.c("T", dV3.getClass(), fN.class, (long)-8411663006905728193L, (long)l);
                                                        if (callSite2 != null) break block18;
                                                        if (callSite2 != null) break block19;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw e4.c("D", (Object)matchException, (long)-8412007548706567567L, (long)l);
                                                    }
                                                    if (!object) break block20;
                                                }
                                                catch (MatchException matchException) {
                                                    throw e4.c("D", (Object)matchException, (long)-8412007548706567567L, (long)l);
                                                }
                                                dV2 = dV3;
                                                if (callSite2 != null) break block21;
                                            }
                                            catch (MatchException matchException) {
                                                throw e4.c("D", (Object)matchException, (long)-8412007548706567567L, (long)l);
                                            }
                                            callSite3 = e4.c("T", (Object)dV2, (long)-8411129455091321169L, (long)l);
                                        }
                                        catch (MatchException matchException) {
                                            throw e4.c("D", (Object)matchException, (long)-8412007548706567567L, (long)l);
                                        }
                                    }
                                    try {
                                        if (callSite3 == false) {
                                            return false;
                                        }
                                    }
                                    catch (MatchException matchException) {
                                        throw e4.c("D", (Object)matchException, (long)-8412007548706567567L, (long)l);
                                    }
                                    dV2 = dV3;
                                }
                                fN fN2 = (fN)dV2;
                                try {
                                    try {
                                        try {
                                            object2 = e4.c("T", (Object)fN2, (Object)new Object[0], (long)-8412245192804534822L, (long)l);
                                            if (callSite2 != null) break block22;
                                            if (object2 != false) break block23;
                                        }
                                        catch (MatchException matchException) {
                                            throw e4.c("D", (Object)matchException, (long)-8412007548706567567L, (long)l);
                                        }
                                        object2 = e4.c("T", (Object)fN2, (Object)new Object[0], (long)-8412494271491101788L, (long)l);
                                        if (callSite2 != null) break block22;
                                    }
                                    catch (MatchException matchException) {
                                        throw e4.c("D", (Object)matchException, (long)-8412007548706567567L, (long)l);
                                    }
                                    if (object2 == false) break block24;
                                }
                                catch (MatchException matchException) {
                                    throw e4.c("D", (Object)matchException, (long)-8412007548706567567L, (long)l);
                                }
                            }
                            object2 = 1;
                            break block22;
                        }
                        object2 = 0;
                    }
                    return (boolean)object2;
                }
                if (callSite2 == null) continue;
            }
            object = false;
        }
        return object;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4DBB;
        if (m[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = e4.l[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])e4.n.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    e4.n.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/e4", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            e4.m[n2] = n3;
        }
        return m[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = e4.b(n, l);
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
            throw new RuntimeException("dev/zprestige/prestige/e4" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/e4" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = e4.m(l, l2);
            object = o[n];
            try {
                if (!(object instanceof String)) break block2;
                e4.o[n] = clazz = Class.forName(p[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = e4.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = e4.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = e4.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = e4.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = o;
        o[0] = "It6uXF_t3/KQH?0)GEYx'>\fWe";
        objectArray[1] = "*K\u0000\u0018Qs_k\u000b\u0017@<\"s\u0018\u0010IuJ";
        objectArray[2] = "\u0000\u001f\b\u0006|:\u0016\u001f\r\\o-\u0001T\u000eZc9\u0010\u0013\u0019M(+/";
        objectArray[3] = "{F+Ydn\u000ef Vu!oh+]q{\u001b";
        objectArray[4] = "5nC\u0000c.5nT\\o!/%TBo4(T\u0006\u001c7p";
        objectArray[5] = "Z#\u0007\u0010CKZ#\u0010LOD@h\u0010ROQG\u0019D\n\u0018";
        objectArray[6] = Boolean.TYPE;
        e4.p[6] = "java/lang/Boolean";
        objectArray[7] = "J\u0007er\u007fsJ\u0007r.s|PLr0siW=\"m\"";
        objectArray[8] = "mzK|j!{zN&y6l1M u\"}vZ7>4=";
        objectArray[9] = "\u0006[\u0006.u&\rT\u0017a\u0016+\u0018Y\u0018\n#)\tJ\u0004&4$";
        objectArray[10] = "nNq\u0017((\u001bnz\u00189gz`q\u0013==\u000e";
        objectArray[11] = "j9l\u001f\u001b\u001ej9{C\u0017\u0011pr{]\u0017\u0004w\u0003)\u0006FE";
        objectArray[12] = Integer.TYPE;
        e4.p[12] = "java/lang/Integer";
        objectArray[13] = "S\b\u0004MnmS\b\u0013\u0011bbIC\u0013\u000fbwN2CR6";
        objectArray[14] = "'\u0018\\9\u0011`'\u0018Ke\u001do=SK{\u001dz:\"\u001b'H";
        objectArray[15] = "(UE5\f+]uN:\u001dd<{E1\u0019>H";
        objectArray[16] = Void.TYPE;
        e4.p[16] = "java/lang/Void";
        objectArray[17] = "\\*zB  W%k\rC-B#";
        objectArray[18] = Float.TYPE;
        e4.p[18] = "java/lang/Float";
        objectArray[19] = "G&d\u0013\u000f)Q&aI\u001c>FmbO\u0010*W*uX[=r";
        objectArray[20] = "\u000bsM\u0017\u000bn\u001dsHM\u0018y\n8KK\u0014m\u001b\u007f\\\\_z\u0001";
        objectArray[21] = "jN\u00134B\u001d\u001fn\u0018;SR~`\u00130W\b\n";
        objectArray[22] = "\u00011)\u0000?\u000f\n>8O^\u0001\u00015<\u0015";
        objectArray[23] = "1J,r5=/B6=R<>Y;gt:";
        objectArray[24] = "3\u00040;Dz%\u00045aWm2O6g[y#\b!p\u0010i;\b#{J$\u0007\u0013#fJc0\u0004";
        objectArray[25] = "V\"s\u001eG\u0007@\"vDT\u0010WiuBX\u0004F.bU\u0013\u0014x";
        objectArray[26] = "5`U\u0001@c#`P[St4+S]_`%lDJ\u0014w\u0007";
        objectArray[27] = "\u0011b,0bd\u0007b)jqs\u0010)*l}g\u0001n={6r;";
        objectArray[28] = "fm\u0003r8'\u0013M\b})hrC\u0003v-2\u0006";
        objectArray[29] = "\n$1~'E\u007f\u0004:q6\n\u001e\n1z2Pj";
        objectArray[30] = "Em)#9\u0006[e3l[\u001a\\x";
        objectArray[31] = "\u001a&\u001co\u0004u\u001a&\u000b3\bz\u0000m\u000b-\bo\u0007\u001cYq]-";
        objectArray[32] = "2\u0015d\u0010\f/7\u0000o\u0010\u00074;\u0010-y,\u001e\n";
        objectArray[33] = Long.TYPE;
        e4.p[33] = "java/lang/Long";
        objectArray[34] = "\u001ar@*\u0014X_)^#-RK6F)A`\u001bu\u001fs-\u000bL/\u001b.PS\u001e;\u0019N";
        objectArray[35] = "]\\|\u00131%\u0006Y-\tM\"\rWu\u0014\u001au\\\u0001+x$'\u000fSw\b<5\t\u0007";
        objectArray[36] = "r'T$UB3qQpiK\"gK(\u0005yu!\u0015\u007fR.+|\u0011q\u0017H4jR\"i";
        objectArray[37] = "I\b]\u0012\u0005\u0003\u0010B\\\"\b~ZIWPY\fN\u0006I\"";
        objectArray[38] = "\u0013\u001e7J\u0019+R\u0007.\u0015vs*\u00015\r\u000bkO_;\u0004\u0016\u001a\u0011^fKJxV\u000b,\u001fv";
        objectArray[39] = "y5|SP\t<nbZi\u0003(qzP\u00051x3 \u000biZ/h'W\u0014\u0002}|%7";
        objectArray[40] = "XZ\u0010luw\u0019\f\u00158Iu\u0004\u000b\u000bk\u001e\"Z\\S\u0007u#\u0003\u0002Vh0x\u001d\u000b";
        objectArray[41] = "7\u0015>Pn^(\u0003}\u0003\u0010]>\u000ed\t|ooN5V\u0010]!Lo\u0002w\t/\u001bcn";
        objectArray[42] = "\u0001\u0001\u001a\u001c\u0018\u0001\u0002\r\u001bS\"\u0005<\u0005\t\u001a_\u0019Y[\u0007\u0013Bh\u0000\f\u0007^B\u0015X^\u0013\\\"";
        objectArray[43] = "\\=[\u001f#ED/]KEPX*X\u0011)b\fj\u0003JE\t_3\u0005\u00168Q\r'\u0007v";
        objectArray[44] = "Hz\u007fSV-D8qHh('afI\u0003 \u001ee}\u001eW";
        objectArray[45] = ";6\u000buUn9%\bl/\u007f7%Vy/n-5A)M4n6\\\u0015\u001f~/%\u000evL`7;0";
        objectArray[46] = ":\u007f(\u001c\\?%y}\rg4[x/\u0014Z=& }\u0000X]";
        objectArray[47] = "2pEN k=~Z\u0012Li45rO<u]r^Gqi *\fSs\t";
        objectArray[48] = "%2]\u0011u9r*\u0003@\u0005nI9G\u0013t;+c\u0004\u0010i\u0007";
        objectArray[49] = "T)jRRL\u0011rt[kF\u0005mlQ\u0007tV(5\u000bk\u001f\u0002t1V\u0016GP`36";
        objectArray[50] = "|`\u007f\fZD\u007fl~C`DA9z\u0015_]${aB\\-\u007fzaL\u0010H=a6O`";
        objectArray[51] = "e$_%2A$rZq\u000eC9uD\"Y\u0014f)\u0018N?K5s\\'dNdi";
        objectArray[52] = "\"E]'}]!I\\hGX\u001fAN!:Ez\u001f@('4#H@e'I{\u001aTgG";
        objectArray[53] = "r)b\u0015&C7r|\u001c\u001fB/|`\u001dH\u0011\u007f.:q#F+,d\f{\u0014?.";
        objectArray[54] = "W\u001f<Kx;\u0003\u0003{^C1\u0005\u0006 S/\u0003WGp\nCd\u0013\u0005=\n 7\r\u001d#4";
        objectArray[55] = "i\u001d]\u001c\u001a!g\u0006\u0017\u000fc)~\u0007\u0004\t\u0018Di\u001d]\u001c\u001a!g\u0006\u0017\u000fcxm\u001fP\r\u001e ?\u000bRm";
        objectArray[56] = "\u001d'WV\u0006\u0003\u0012)H\nj\u0007\u001fiZ:\u0004\u0006Bh__\n\u001d\b{&";
        objectArray[57] = "K/\u0007_z,H,\u0006\\D}J8Gn)nm;I!!`\u0010=TFunG18\u0011?mSh[B!uMV\bZ;o\u00105[D#q.";
        objectArray[58] = "1\r\u0004|\fltV\u001au5f`I\u0002\u007fYT0\nX(5?gP_xHg5D]\u0018_cv\u000bZiKl=Xb";
        objectArray[59] = "y}2@P&{\"+B(,\u001b#0FU0~}>OHA'*>\u0002H<\u007fx*\u0000(";
        objectArray[60] = "\u0015X0*8HP\u0003.#\u0001BD\u001c6)mp\u0016[jr\u0001\u0018L\u001c)unLP[<N";
        objectArray[61] = "_7HxU4\b/\u0016)%`3<RzT6Qf\u0011yI\n";
        objectArray[62] = "6E_A\u0002f4\u001aFCzmT\u001b]G\u0007p1ESN\u001a\u0001h\u0012S\u0003\u001a|0@G\u0001z";
        objectArray[63] = "B^?\u0005\u0015x\u0019[n\u001fi\u007f\u0012U6\u0002>(C\tnn\u0000z\u0010Q4\u001e\u0018h\u0016\u0005";
        objectArray[64] = "\u0003'0Q=)\u0007<g\u0005Yyc/'\u0001d{\u0013|g\u0001(\u0010";
        objectArray[65] = "sN\u001dP\u001f= \u000e\u001d\u001ct,lR\\\u0004\b*j?IS\u0005!|]F]\u001a}\u0010";
        objectArray[66] = "\t\u0015\u0002ql\u0013\u0011\u0007\u0004%\n\u0006\r\u0002\u0001\u007ff4ZE](3c\\\u0014\u0004%j\u001e\u0004F\u0010'\n\t\u0000\u0005_ {\u001d\u000fN\f\u0018";
        Object[] objectArray2 = objectArray;
        objectArray[67] = "u\u0003d\u0011w{c\t.TJo\u0018Q7W7w}\u000f9^*\u0006(I#Ste{W;MJ";
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00e1' || c == '\u00cb' || c == '\u00d3' || c == '\u00f2') {
                field = e4.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e1' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00cb' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00d3' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = e4.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'T' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'D' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = e4.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private boolean d(Object[] objectArray) {
        Object object;
        block4: {
            block5: {
                long l = (Long)objectArray[0];
                l = k ^ l;
                CallSite callSite = e4.c("D", (long)-7983975951529323863L, (long)l);
                try {
                    try {
                        object = e4.c("D", (long)e4.c("T", (Object)e4.c("T", (Object)b, (long)-7983924383249716477L, (long)l), (long)-7984857461437445903L, (long)l), (int)e4.b("v", (int)3624, (long)(0x73B48675C6AD2A9L ^ l)), (long)-7983700400324898065L, (long)l);
                        if (callSite != null) break block4;
                        if (object != 1) break block5;
                    }
                    catch (MatchException matchException) {
                        throw e4.c("D", (Object)matchException, (long)-7982979047822864379L, (long)l);
                    }
                    object = 1;
                    break block4;
                }
                catch (MatchException matchException) {
                    throw e4.c("D", (Object)matchException, (long)-7982979047822864379L, (long)l);
                }
            }
            object = 0;
        }
        return (boolean)object;
    }

    @bP
    public void a(bG bG2) {
        CallSite callSite;
        block71: {
            CallSite callSite2;
            CallSite callSite3;
            long l;
            long l2;
            block69: {
                CallSite callSite4;
                CallSite callSite5;
                block70: {
                    CallSite callSite6;
                    CallSite callSite7;
                    block67: {
                        block68: {
                            block65: {
                                block66: {
                                    block63: {
                                        block64: {
                                            block61: {
                                                block62: {
                                                    block59: {
                                                        long l3;
                                                        block60: {
                                                            block58: {
                                                                block57: {
                                                                    class_310 class_3102;
                                                                    block55: {
                                                                        block56: {
                                                                            block54: {
                                                                                e4 e42;
                                                                                Object object;
                                                                                block51: {
                                                                                    block53: {
                                                                                        block52: {
                                                                                            block49: {
                                                                                                block50: {
                                                                                                    block47: {
                                                                                                        block48: {
                                                                                                            long l4 = l2 = k ^ 0x733F52FE277CL;
                                                                                                            long l5 = l4 ^ 0x7F91C4ABAC32L;
                                                                                                            l = l4 ^ 0x81B1949A3BL;
                                                                                                            l3 = l4 ^ 0x36FFC2FAB646L;
                                                                                                            callSite7 = e4.c("D", (long)-573323491476620399L, (long)l2);
                                                                                                            try {
                                                                                                                try {
                                                                                                                    Object[] objectArray = new Object[1];
                                                                                                                    objectArray[0] = l5;
                                                                                                                    object = e4.c("T", (Object)this, (Object)objectArray, (long)-573945151689357292L, (long)l2);
                                                                                                                    if (callSite7 != null) break block47;
                                                                                                                    if (object == false) break block48;
                                                                                                                }
                                                                                                                catch (MatchException matchException) {
                                                                                                                    throw e4.c("D", (Object)matchException, (long)-572274206191732419L, (long)l2);
                                                                                                                }
                                                                                                                this.i = 0;
                                                                                                                this.c = -1;
                                                                                                                return;
                                                                                                            }
                                                                                                            catch (MatchException matchException) {
                                                                                                                throw e4.c("D", (Object)matchException, (long)-572274206191732419L, (long)l2);
                                                                                                            }
                                                                                                        }
                                                                                                        object = this.c;
                                                                                                    }
                                                                                                    try {
                                                                                                        try {
                                                                                                            if (callSite7 != null) break block49;
                                                                                                            if (object <= 0) break block50;
                                                                                                        }
                                                                                                        catch (MatchException matchException) {
                                                                                                            throw e4.c("D", (Object)matchException, (long)-572274206191732419L, (long)l2);
                                                                                                        }
                                                                                                        --this.c;
                                                                                                        return;
                                                                                                    }
                                                                                                    catch (MatchException matchException) {
                                                                                                        throw e4.c("D", (Object)matchException, (long)-572274206191732419L, (long)l2);
                                                                                                    }
                                                                                                }
                                                                                                object = this.c;
                                                                                            }
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        try {
                                                                                                            try {
                                                                                                                try {
                                                                                                                    if (callSite7 != null) break block51;
                                                                                                                    if (object != false) break block52;
                                                                                                                }
                                                                                                                catch (MatchException matchException) {
                                                                                                                    throw e4.c("D", (Object)matchException, (long)-572274206191732419L, (long)l2);
                                                                                                                }
                                                                                                                e42 = this;
                                                                                                                if (callSite7 != null) break block53;
                                                                                                            }
                                                                                                            catch (MatchException matchException) {
                                                                                                                throw e4.c("D", (Object)matchException, (long)-572274206191732419L, (long)l2);
                                                                                                            }
                                                                                                            e42.c = -1;
                                                                                                            if (e4.c("\u00e1", (Object)b, (long)-574125218120168517L, (long)l2) == null) break block52;
                                                                                                        }
                                                                                                        catch (MatchException matchException) {
                                                                                                            throw e4.c("D", (Object)matchException, (long)-572274206191732419L, (long)l2);
                                                                                                        }
                                                                                                        Object[] objectArray = new Object[1];
                                                                                                        objectArray[0] = l3;
                                                                                                        object = e4.c("T", (Object)this, (Object)objectArray, (long)-572122538251888952L, (long)l2);
                                                                                                        if (callSite7 != null) break block51;
                                                                                                    }
                                                                                                    catch (MatchException matchException) {
                                                                                                        throw e4.c("D", (Object)matchException, (long)-572274206191732419L, (long)l2);
                                                                                                    }
                                                                                                    if (object == false) break block52;
                                                                                                }
                                                                                                catch (MatchException matchException) {
                                                                                                    throw e4.c("D", (Object)matchException, (long)-572274206191732419L, (long)l2);
                                                                                                }
                                                                                                e4.c("T", (Object)e4.c("\u00e1", (Object)e4.c("\u00e1", (Object)b, (long)-572322412730848703L, (long)l2), (long)-572607572793178187L, (long)l2), (boolean)true, (long)-571175188067926538L, (long)l2);
                                                                                                e4.c("T", (Object)e4.c("\u00e1", (Object)b, (long)-574125218120168517L, (long)l2), (boolean)true, (long)-572844916213553527L, (long)l2);
                                                                                            }
                                                                                            catch (MatchException matchException) {
                                                                                                throw e4.c("D", (Object)matchException, (long)-572274206191732419L, (long)l2);
                                                                                            }
                                                                                        }
                                                                                        e42 = this;
                                                                                    }
                                                                                    try {
                                                                                        if (callSite7 != null) break block54;
                                                                                        object = e42.i;
                                                                                    }
                                                                                    catch (MatchException matchException) {
                                                                                        throw e4.c("D", (Object)matchException, (long)-572274206191732419L, (long)l2);
                                                                                    }
                                                                                }
                                                                                if (object == false) {
                                                                                    return;
                                                                                }
                                                                                e42 = this;
                                                                            }
                                                                            try {
                                                                                try {
                                                                                    e42.i = 0;
                                                                                    class_3102 = b;
                                                                                    if (callSite7 != null) break block55;
                                                                                    if (e4.c("\u00e1", (Object)class_3102, (long)-574125218120168517L, (long)l2) != null) break block56;
                                                                                }
                                                                                catch (MatchException matchException) {
                                                                                    throw e4.c("D", (Object)matchException, (long)-572274206191732419L, (long)l2);
                                                                                }
                                                                                return;
                                                                            }
                                                                            catch (MatchException matchException) {
                                                                                throw e4.c("D", (Object)matchException, (long)-572274206191732419L, (long)l2);
                                                                            }
                                                                        }
                                                                        class_3102 = b;
                                                                    }
                                                                    try {
                                                                        try {
                                                                            callSite6 = e4.c("T", (Object)e4.c("\u00e1", (Object)e4.c("\u00e1", (Object)class_3102, (long)-572322412730848703L, (long)l2), (long)-573486625507340949L, (long)l2), (long)-574039278616555809L, (long)l2);
                                                                            if (callSite7 != null) break block57;
                                                                            if (callSite6 != false) break block58;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw e4.c("D", (Object)matchException, (long)-572274206191732419L, (long)l2);
                                                                        }
                                                                        callSite6 = e4.c("T", (Object)e4.c("\u00e1", (Object)b, (long)-574125218120168517L, (long)l2), (long)-573386615473878791L, (long)l2);
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw e4.c("D", (Object)matchException, (long)-572274206191732419L, (long)l2);
                                                                    }
                                                                }
                                                                try {
                                                                    if (callSite7 != null) break block59;
                                                                    if (callSite6 == false) break block60;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw e4.c("D", (Object)matchException, (long)-572274206191732419L, (long)l2);
                                                                }
                                                            }
                                                            return;
                                                        }
                                                        Object[] objectArray = new Object[1];
                                                        objectArray[0] = l3;
                                                        callSite6 = e4.c("T", (Object)this, (Object)objectArray, (long)-572122538251888952L, (long)l2);
                                                    }
                                                    try {
                                                        if (callSite7 != null) break block61;
                                                        if (callSite6 != false) break block62;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw e4.c("D", (Object)matchException, (long)-572274206191732419L, (long)l2);
                                                    }
                                                    return;
                                                }
                                                callSite6 = e4.c("\u00e1", (Object)e4.c("\u00e1", (Object)b, (long)-574125218120168517L, (long)l2), (long)-572207920868973110L, (long)l2);
                                            }
                                            try {
                                                if (callSite7 != null) break block63;
                                                if (callSite6 == false) break block64;
                                            }
                                            catch (MatchException matchException) {
                                                throw e4.c("D", (Object)matchException, (long)-572274206191732419L, (long)l2);
                                            }
                                            return;
                                        }
                                        callSite6 = e4.c("T", (Object)e4.c("\u00e1", (Object)b, (long)-574125218120168517L, (long)l2), (long)-572519887708343714L, (long)l2);
                                    }
                                    try {
                                        if (callSite7 != null) break block65;
                                        if (callSite6 == false) break block66;
                                    }
                                    catch (MatchException matchException) {
                                        throw e4.c("D", (Object)matchException, (long)-572274206191732419L, (long)l2);
                                    }
                                    return;
                                }
                                callSite6 = e4.c("T", (Object)e4.c("T", (Object)e4.c("\u00e1", (Object)b, (long)-574125218120168517L, (long)l2), (long)-572702290854077586L, (long)l2), (long)-571966493340266143L, (long)l2);
                            }
                            try {
                                try {
                                    if (callSite7 != null) break block67;
                                    if (callSite6 > e4.b("v", (int)22836, (long)(0x41BCEBFB11DEC8CL ^ l2))) break block68;
                                }
                                catch (MatchException matchException) {
                                    throw e4.c("D", (Object)matchException, (long)-572274206191732419L, (long)l2);
                                }
                                return;
                            }
                            catch (MatchException matchException) {
                                throw e4.c("D", (Object)matchException, (long)-572274206191732419L, (long)l2);
                            }
                        }
                        e4.c("T", (Object)e4.c("\u00e1", (Object)e4.c("\u00e1", (Object)b, (long)-572322412730848703L, (long)l2), (long)-572607572793178187L, (long)l2), (boolean)false, (long)-571175188067926538L, (long)l2);
                        callSite6 = e4.c("D", (float)e4.c("T", (Object)this.a, (long)-572385857179899872L, (long)l2), (long)-573882403410111553L, (long)l2);
                    }
                    callSite5 = callSite6;
                    callSite4 = e4.c("D", (float)e4.c("T", (Object)this.a, (long)-572762036153051726L, (long)l2), (long)-573882403410111553L, (long)l2);
                    try {
                        try {
                            e4 e43 = this;
                            callSite3 = callSite5;
                            callSite2 = callSite4;
                            if (callSite7 != null) break block69;
                            if (callSite3 != callSite2) break block70;
                        }
                        catch (MatchException matchException) {
                            throw e4.c("D", (Object)matchException, (long)-572274206191732419L, (long)l2);
                        }
                        callSite = callSite5;
                        break block71;
                    }
                    catch (MatchException matchException) {
                        throw e4.c("D", (Object)matchException, (long)-572274206191732419L, (long)l2);
                    }
                }
                callSite3 = callSite5;
                callSite2 = callSite4;
            }
            Object[] objectArray = new Object[3];
            objectArray[2] = l;
            objectArray[1] = (int)callSite2;
            objectArray[0] = (int)callSite3;
            callSite = e4.c("D", (Object)objectArray, (long)-571234690526803023L, (long)l2);
        }
        e43.c = (int)callSite;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    @bP
    public void a(aK aK2) {
        block18: {
            block19: {
                e4 e42;
                CallSite callSite;
                block17: {
                    CallSite callSite2;
                    CallSite callSite3;
                    long l;
                    long l2;
                    block15: {
                        block16: {
                            l2 = k ^ 0x7E411101ADEEL;
                            l = l2 ^ 0x3B8181053CD4L;
                            callSite3 = e4.c("D", (long)8257675562124423427L, (long)l2);
                            try {
                                callSite2 = e4.c("\u00e1", (Object)b, (long)8257984720175169833L, (long)l2);
                                if (callSite3 != null) break block15;
                                if (callSite2 != null) break block16;
                            }
                            catch (MatchException matchException) {
                                throw e4.c("D", (Object)matchException, (long)8258707652485133231L, (long)l2);
                            }
                            return;
                        }
                        callSite2 = e4.c("T", (Object)aK2, (Object)new Object[0], (long)8257858726217051328L, (long)l2);
                    }
                    CallSite callSite4 = callSite2;
                    try {
                        if (callSite4 == null) {
                            return;
                        }
                    }
                    catch (MatchException matchException) {
                        throw e4.c("D", (Object)matchException, (long)8258707652485133231L, (long)l2);
                    }
                    try {
                        try {
                            try {
                                callSite = e4.c("T", (Object)e4.c("\u00e1", (Object)b, (long)8257984720175169833L, (long)l2), (long)8257822582870769333L, (long)l2);
                                if (callSite3 != null) break block17;
                                if (callSite == false) break block18;
                            }
                            catch (MatchException matchException) {
                                throw e4.c("D", (Object)matchException, (long)8258707652485133231L, (long)l2);
                            }
                            e42 = this;
                            if (callSite3 != null) break block19;
                        }
                        catch (MatchException matchException) {
                            throw e4.c("D", (Object)matchException, (long)8258707652485133231L, (long)l2);
                        }
                        Object[] objectArray = new Object[1];
                        objectArray[0] = l;
                        callSite = e4.c("T", (Object)e42, (Object)objectArray, (long)8258868253900659802L, (long)l2);
                    }
                    catch (MatchException matchException) {
                        throw e4.c("D", (Object)matchException, (long)8258707652485133231L, (long)l2);
                    }
                }
                if (callSite == false) break block18;
                e42 = this;
            }
            e42.i = 1;
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
            case 0 -> 61;
            case 1 -> 51;
            case 2 -> 34;
            case 3 -> 31;
            case 4 -> 50;
            case 5 -> 38;
            case 6 -> 42;
            case 7 -> 17;
            case 8 -> 19;
            case 9 -> 25;
            case 10 -> 8;
            case 11 -> 44;
            case 12 -> 14;
            case 13 -> 4;
            case 14 -> 56;
            case 15 -> 39;
            case 16 -> 36;
            case 17 -> 5;
            case 18 -> 13;
            case 19 -> 35;
            case 20 -> 27;
            case 21 -> 6;
            case 22 -> 49;
            case 23 -> 23;
            case 24 -> 45;
            case 25 -> 57;
            case 26 -> 20;
            case 27 -> 10;
            case 28 -> 48;
            case 29 -> 59;
            case 30 -> 46;
            case 31 -> 29;
            case 32 -> 0;
            case 33 -> 26;
            case 34 -> 24;
            case 35 -> 43;
            case 36 -> 63;
            case 37 -> 40;
            case 38 -> 62;
            case 39 -> 9;
            case 40 -> 3;
            case 41 -> 12;
            case 42 -> 2;
            case 43 -> 7;
            case 44 -> 60;
            case 45 -> 54;
            case 46 -> 52;
            case 47 -> 11;
            case 48 -> 32;
            case 49 -> 16;
            case 50 -> 37;
            case 51 -> 1;
            case 52 -> 58;
            case 53 -> 28;
            case 54 -> 41;
            case 55 -> 33;
            case 56 -> 53;
            case 57 -> 22;
            case 58 -> 30;
            case 59 -> 15;
            case 60 -> 18;
            case 61 -> 47;
            case 62 -> 55;
            default -> 21;
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
        e4.p[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = e4.m(l, l2);
        Object object = o[n];
        if (object instanceof String) {
            String string = p[n];
            int n2 = string.indexOf(8);
            Class clazz = e4.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = e4.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = e4.g(clazz3, string2, clazz2)) != null) {
                    e4.o[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = e4.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        e4.o[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = e4.n(1591808521621231L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = e4.m(l, l2);
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
                clazz3 = e4.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = e4.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = e4.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        e4.o[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = e4.n(1591808521621231L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = e4.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        e4.o[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = e4.n(1591808521621231L, 0L);
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

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(e4.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(e4.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


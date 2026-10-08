/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1707
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
import net.minecraft.class_1707;

public class eA
extends dV {
    private dQ a;
    private dM d;
    private dL f;
    private f5 c;
    private static final long k = hc.a(4884749093902113071L, 4385359442149585882L, MethodHandles.lookup().lookupClass()).a(268080158837785L);
    private static final long[] l;
    private static final Integer[] m;
    private static final Map n;
    private static final Object[] o;
    private static final String[] p;

    public eA() {
        long l = k ^ 0x115DDCE0DDBAL;
        long l2 = l ^ 0x4C95DAAE76AL;
        this.c = new f5(l2);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        o = new Object[53];
        p = new String[53];
        eA.f();
        n = new HashMap(13);
        long l = k ^ 0x70309C854EC7L;
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
        String string = "\tzw`\u00b1=\u00adK\u00d1\u008a\u00c6\u00a9\u00b07\u00d7\u00edE\u00be\u0090\u00d6\u000b\n\u00d6A";
        int n2 = "\tzw`\u00b1=\u00adK\u00d1\u008a\u00c6\u00a9\u00b07\u00d7\u00edE\u00be\u0090\u00d6\u000b\n\u00d6A".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        eA.l = lArray;
        m = new Integer[3];
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5325;
        if (m[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = eA.l[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])eA.n.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    eA.n.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/eA", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            eA.m[n2] = n3;
        }
        return m[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = eA.b(n, l);
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
            throw new RuntimeException("dev/zprestige/prestige/eA" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/eA" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = eA.m(l, l2);
            object = o[n];
            try {
                if (!(object instanceof String)) break block2;
                eA.o[n] = clazz = Class.forName(p[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = eA.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = eA.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = eA.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = eA.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = o;
        o[0] = "vSZ\u0016_!`S_LL6w\u0018\\J@\"f_K]\u000b0Z";
        objectArray[1] = "\b`HUp-}@CZab\u0000XP]h+h";
        objectArray[2] = "`'DK\u0014:`'S\u0017\u00185zlS\t\u0018 }\u001d\u0001RId";
        objectArray[3] = "\bp11Su\bp&m_z\u0012;&s_o\u0015Jt-\b/";
        objectArray[4] = "R&\u001a\u00167%R&\rJ;*Hm\rT;?O\u001c_\u000fiy";
        objectArray[5] = Boolean.TYPE;
        eA.p[5] = "java/lang/Boolean";
        objectArray[6] = Integer.TYPE;
        eA.p[6] = "java/lang/Integer";
        objectArray[7] = "aB{<m\u001awB~f~\r`\t}`r\u0019qNjw9\u000fD";
        objectArray[8] = "y\u0015K_37r\u001aZ\u0010P:g\u0017U{e8v\u0004IWr5";
        objectArray[9] = "\\w}\u0007\u001cR\\wj[\u0010]F<jE\u0010HAM:\u0018A";
        objectArray[10] = "~]w\r!F~]`Q-Id\u0016`O-\\cg2\u0013x\u001e";
        objectArray[11] = "}[Th\r\u001dxN_h\u0006\u0006t^\u001d\u0001-,E";
        objectArray[12] = Long.TYPE;
        eA.p[12] = "java/lang/Long";
        objectArray[13] = "B]\u0004\u001cG%B]\u0013@K*X\u0016\u0013^K?_gG\u0006\u001c";
        objectArray[14] = "\"&W:v@\"&@fzO8m@xzZ?\u001c\u0012#+\u001a";
        objectArray[15] = "F Y?\u0015uP \\e\u0006bGk_c\nvV,HtAc\u0017";
        objectArray[16] = ";\u00060bHQN&;mY\u001e/(0f]D[";
        objectArray[17] = "}\u001c/c\u000e\u001d\b<$l\u001fRi2/g\u001b\b\u001d";
        objectArray[18] = "J\bDc&HA\u0007U,AJT\fUgz";
        objectArray[19] = " `T\u0005 \u0007 `CY,\b:+CG,\u001d=Z\u0011\u001c|]";
        objectArray[20] = "rITp/gyFE?CdwDGpo";
        objectArray[21] = "9R}\u00168m/RxL+z8\u0019{J'n)^l]ly\f";
        objectArray[22] = "h@/\u0010;r\u001d`$\u001f*=|n/\u0014.g\b";
        objectArray[23] = Void.TYPE;
        eA.p[23] = "java/lang/Void";
        objectArray[24] = "7;)\rnd!;,W}s6p/Qqg'78F:p\u0018";
        objectArray[25] = ",?\u000b\u0014e\u0002'0\u001a[\u0004\f,;\u001e\u0001";
        objectArray[26] = "`d:b\u0016@kk+-~@ed8";
        objectArray[27] = Float.TYPE;
        eA.p[27] = "java/lang/Float";
        objectArray[28] = ",\u0011/\u0005#hY1$\n2'8?/\u00016}L";
        objectArray[29] = "v,r[IB`,w\u0001ZUwgt\u0007VAf c\u0010\u001dQ`";
        objectArray[30] = "Ep}\u0005\u007f\f0Pv\nnCQ^}\u0001j\u0019%";
        objectArray[31] = "\u001b\u00002Xx\u001dC\u0011iQ\tAH\u001c6Nes\u001fZh\u00192$\u001a\\<CfV\u0018\u0012'S\t";
        objectArray[32] = ":\u007fJ/\u0001\u0019`j\u0001D\u0007e&dP?\f\u0004'}LD";
        objectArray[33] = "\u0003\u0018O5-WYQ\u001dr\u0014CX\u000f\u000fEyP\u007f\f\u0001\n$]D\u000e\u001e;-EUXp6sJ\u0003\u0011N:fAWaLmr\u0013L_@xyG<";
        objectArray[34] = "gd\u007ft\u00175:&=s|i3ddn\u0010[a&>8|69tay\u001f2f};\t";
        objectArray[35] = "cJ\u0019r8\u001d4Z\u001blC\u00113N\u001b\u007f\u0014@o\u001aE\u0013r\u0005,\\\u0013.~E1\u0013";
        objectArray[36] = "=\\D'Pb?\u0012_7?uo\u001cN*SG>\\\u001fu? s\u0018A#\u000e)k\t\u0017M";
        objectArray[37] = ":\u001b|\u0014\u007f!b\n'\u001d\u000eve\u0016|\tY!;A$e?qb\u001ac\u0007ha`\u0004";
        objectArray[38] = "\u0000Iiz\tS\u0012\tae3CiPaf\rF\u0019K1bP*RQ4uPR\u000e\u0005ty3";
        objectArray[39] = "A#k.we\u0019!w+\u001a<\u0016\"gtv\u000eD`7*\u001ab\u001edipb>J$e\u0013";
        objectArray[40] = "o\u0000\u000f\\$\\0N\f\u0002IVS\u001b\u0003\u001fwS#\u0000S\u001b*?h\u001aV\f*G4N\u0016\u0000I";
        objectArray[41] = "Fs9\\&)]kbP@(Ku\rI$4@\toG&v]7cR-\"-";
        objectArray[42] = "^\u000e\u0006\u0014I-L\rX\u001028S\u001fZ\u0016ei\rC\u0002z^*\n\u001cE\u0001L)T\u0018";
        objectArray[43] = "\n!bI\u0000<\u000e~k\u0013p:]:nK\u001c\b\rz5\u001dpcW 1\\NoB+e,";
        objectArray[44] = "(WgGq6z_c\u0000L`#@;V%l\u001aN;F!\n\u007fBeU/r#\u0016%YL";
        objectArray[45] = "~f\u0015[\u001d\twj\u0001[d\f\u0010?\u001e\u0019Z\n`$N\u001d\u0007f\u007f4\u0017\u000b\t\u0017p;\u0018\u0000d";
        objectArray[46] = "$/.M3\u0019ymlJXEp/5W4w\"ml\tX\u001cz5j@f\u0010o>>0b]qn8\f:_mkU";
        objectArray[47] = ".Y \u0016`{q\u0017#H\rq\u0012\u0018yIc!{L>Xj\u0018,\u001c\"F4qx[3O\r";
        objectArray[48] = "dol;28x<`+O2\u00041`*$%9hkt/[";
        objectArray[49] = "5Wi~\u0018\u00190]=\u007fs\u00190\u00018f-\u001e0\u001b<\u001a\u0011Hi\u001c?dB\u001a8\u0004Q";
        objectArray[50] = "<Wf\\yHkGdB\u0002O`B`Zn}2\u0005<\u0003\u0002EbXoPsJmWd=";
        objectArray[51] = "\u000fxO\u0004,c\u001d8G\u001b\u0016sfaG\u0018(v\u0016z\u0017\u001cu\u001a\tjN\n{k\u0006eA\u0001\u0016";
        Object[] objectArray2 = objectArray;
        objectArray[52] = "^o^6c\u0001F2_y\u0001\t=kJv?\nMp\u001arbf\u0006j\u001feb\u001eZ>_i\u0001";
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00fe' || c == 'W' || c == '\u00da' || c == '\u00d5') {
                field = eA.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00fe' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'W' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00da' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = eA.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00f9' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'j' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = eA.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    @bP
    public void a(bl_0 bl_02) {
        block36: {
            CallSite callSite;
            long l;
            block40: {
                CallSite callSite2;
                block38: {
                    CallSite callSite3;
                    long l2;
                    long l3;
                    long l4;
                    long l5;
                    block35: {
                        Object object;
                        block33: {
                            block34: {
                                block32: {
                                    long l6;
                                    block41: {
                                        block31: {
                                            int n;
                                            block30: {
                                                long l7 = l = k ^ 0x393E291C816AL;
                                                l5 = l7 ^ 0x6E5063CA5FBAL;
                                                l4 = l7 ^ 0x5CEC68249D00L;
                                                l6 = l7 ^ 0x39043A8D672BL;
                                                l3 = l7 ^ 0x8A9F6CE0EC6L;
                                                l2 = l7 ^ 0x49F77B8D12CFL;
                                                callSite2 = eA.c("j", (long)4624926250362811209L, (long)l);
                                                try {
                                                    try {
                                                        try {
                                                            object = eA.c("\u00f9", (Object)((Integer)((Object)eA.c("\u00f9", (Object)this.f, (long)4623840617643801127L, (long)l))), (long)4624425042323252961L, (long)l);
                                                            n = -1;
                                                            if (callSite2 != null) break block30;
                                                            if (object == n) break block31;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw eA.c("j", (Object)matchException, (long)4624345171746658332L, (long)l);
                                                        }
                                                        object = eA.c("j", (long)eA.c("\u00f9", (Object)eA.c("\u00f9", (Object)b, (long)4620920567249977864L, (long)l), (long)4624680376376583944L, (long)l), (int)eA.c("\u00f9", (Object)((Integer)((Object)eA.c("\u00f9", (Object)this.f, (long)4623840617643801127L, (long)l))), (long)4624425042323252961L, (long)l), (long)4625034302061374329L, (long)l);
                                                        if (callSite2 != null) break block32;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw eA.c("j", (Object)matchException, (long)4624345171746658332L, (long)l);
                                                    }
                                                    n = 1;
                                                }
                                                catch (MatchException matchException) {
                                                    throw eA.c("j", (Object)matchException, (long)4624345171746658332L, (long)l);
                                                }
                                            }
                                            if (object == n) break block41;
                                        }
                                        return;
                                    }
                                    Object[] objectArray = new Object[2];
                                    objectArray[1] = l6;
                                    objectArray[0] = Float.valueOf((float)eA.c("\u00f9", (Object)((Float)((Object)eA.c("\u00f9", (Object)this.a, (long)4623840617643801127L, (long)l))), (long)4623927655638990502L, (long)l));
                                    object = eA.c("\u00f9", (Object)this.c, (Object)objectArray, (long)4624814005144483444L, (long)l);
                                }
                                try {
                                    if (callSite2 != null) break block33;
                                    if (object != false) break block34;
                                }
                                catch (MatchException matchException) {
                                    throw eA.c("j", (Object)matchException, (long)4624345171746658332L, (long)l);
                                }
                                return;
                            }
                            try {
                                callSite3 = eA.c("\u00fe", (Object)eA.c("\u00fe", (Object)b, (long)4624773729145685045L, (long)l), (long)4625152909841575328L, (long)l);
                                if (callSite2 != null) break block35;
                                object = callSite3 instanceof class_1707;
                            }
                            catch (MatchException matchException) {
                                throw eA.c("j", (Object)matchException, (long)4624345171746658332L, (long)l);
                            }
                        }
                        try {
                            if (object == false) break block36;
                            callSite3 = eA.c("\u00fe", (Object)eA.c("\u00fe", (Object)b, (long)4624773729145685045L, (long)l), (long)4625152909841575328L, (long)l);
                        }
                        catch (MatchException matchException) {
                            throw eA.c("j", (Object)matchException, (long)4624345171746658332L, (long)l);
                        }
                    }
                    class_1707 class_17072 = (class_1707)callSite3;
                    int n = 0;
                    while (n < eA.c("\u00f9", (Object)eA.c("\u00f9", (Object)class_17072, (long)4625064805976398308L, (long)l), (long)4624625470026125733L, (long)l)) {
                        block37: {
                            block39: {
                                CallSite callSite4 = eA.c("\u00f9", (Object)class_17072, (int)n, (long)4624218127097366464L, (long)l);
                                try {
                                    try {
                                        try {
                                            if (callSite2 != null) break block37;
                                            callSite = eA.c("\u00f9", (Object)callSite4, (long)4624904844732392099L, (long)l);
                                            if (callSite2 != null) break block38;
                                        }
                                        catch (MatchException matchException) {
                                            throw eA.c("j", (Object)matchException, (long)4624345171746658332L, (long)l);
                                        }
                                        if (callSite == false) break block39;
                                    }
                                    catch (MatchException matchException) {
                                        throw eA.c("j", (Object)matchException, (long)4624345171746658332L, (long)l);
                                    }
                                    Object[] objectArray = new Object[4];
                                    objectArray[3] = l4;
                                    objectArray[2] = eA.c("\u00da", (long)4624515162290402474L, (long)l);
                                    objectArray[1] = 0;
                                    objectArray[0] = n;
                                    eA.c("j", (Object)objectArray, (long)4623566033045529229L, (long)l);
                                    Object[] objectArray2 = new Object[1];
                                    objectArray2[0] = l5;
                                    eA.c("\u00f9", (Object)this.c, (Object)objectArray2, (long)4624027703992719109L, (long)l);
                                    Object[] objectArray3 = new Object[1];
                                    objectArray3[0] = l3;
                                    eA.c("\u00f9", (Object)this.a, (Object)objectArray3, (long)4624170650267207987L, (long)l);
                                    return;
                                }
                                catch (MatchException matchException) {
                                    throw eA.c("j", (Object)matchException, (long)4624345171746658332L, (long)l);
                                }
                            }
                            ++n;
                        }
                        if (callSite2 == null) continue;
                    }
                    Object[] objectArray = new Object[2];
                    objectArray[1] = l2;
                    objectArray[0] = class_17072;
                    callSite = eA.c("\u00f9", (Object)this, (Object)objectArray, (long)4624392232245258988L, (long)l);
                }
                try {
                    try {
                        if (callSite2 != null) break block40;
                        if (callSite == false) break block36;
                    }
                    catch (MatchException matchException) {
                        throw eA.c("j", (Object)matchException, (long)4624345171746658332L, (long)l);
                    }
                    callSite = eA.c("\u00f9", (Object)((Boolean)((Object)eA.c("\u00f9", (Object)this.d, (long)4623840617643801127L, (long)l))), (long)4624077483910490026L, (long)l);
                }
                catch (MatchException matchException) {
                    throw eA.c("j", (Object)matchException, (long)4624345171746658332L, (long)l);
                }
            }
            try {
                if (callSite != false) {
                    eA.c("\u00f9", (Object)eA.c("\u00fe", (Object)b, (long)4624773729145685045L, (long)l), (long)4623995260416936332L, (long)l);
                }
            }
            catch (MatchException matchException) {
                throw eA.c("j", (Object)matchException, (long)4624345171746658332L, (long)l);
            }
        }
    }

    private boolean a(Object[] objectArray) {
        Object object;
        block11: {
            CallSite callSite;
            CallSite callSite2;
            long l;
            class_1707 class_17072;
            block9: {
                block10: {
                    class_17072 = (class_1707)objectArray[0];
                    l = (Long)objectArray[1];
                    l = k ^ l;
                    callSite2 = eA.c("j", (long)-7805509592002928437L, (long)l);
                    try {
                        try {
                            callSite = eA.c("\u00f9", (Object)eA.c("\u00f9", (Object)class_17072, (long)-7805357842115753370L, (long)l), (long)-7804821894206438873L, (long)l);
                            if (callSite2 != null) break block9;
                            if (callSite != eA.b("m", (int)30623, (long)(0x393C1572DAC4B71FL ^ l))) break block10;
                        }
                        catch (MatchException matchException) {
                            throw eA.c("j", (Object)matchException, (long)-7805104408437240930L, (long)l);
                        }
                        callSite = eA.b("m", (int)23711, (long)(0x14C6EB579D9E1C1DL ^ l));
                        break block9;
                    }
                    catch (MatchException matchException) {
                        throw eA.c("j", (Object)matchException, (long)-7805104408437240930L, (long)l);
                    }
                }
                callSite = eA.b("m", (int)24944, (long)(0x6216BF35104021F1L ^ l));
            }
            Object object2 = callSite;
            for (int i = 0; i < object2; ++i) {
                int n;
                block12: {
                    try {
                        try {
                            object = eA.c("\u00f9", (Object)eA.c("\u00f9", (Object)class_17072, (int)i, (long)-7805074154070453182L, (long)l), (long)-7805655173593681631L, (long)l);
                            if (callSite2 != null) break block11;
                            if (callSite2 != null) break block12;
                        }
                        catch (MatchException matchException) {
                            throw eA.c("j", (Object)matchException, (long)-7805104408437240930L, (long)l);
                        }
                        if (!object) continue;
                    }
                    catch (MatchException matchException) {
                        throw eA.c("j", (Object)matchException, (long)-7805104408437240930L, (long)l);
                    }
                    n = 0;
                }
                return n != 0;
            }
            object = true;
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
            case 0 -> 41;
            case 1 -> 24;
            case 2 -> 7;
            case 3 -> 60;
            case 4 -> 23;
            case 5 -> 45;
            case 6 -> 28;
            case 7 -> 20;
            case 8 -> 29;
            case 9 -> 8;
            case 10 -> 55;
            case 11 -> 37;
            case 12 -> 1;
            case 13 -> 48;
            case 14 -> 19;
            case 15 -> 11;
            case 16 -> 34;
            case 17 -> 2;
            case 18 -> 14;
            case 19 -> 31;
            case 20 -> 22;
            case 21 -> 58;
            case 22 -> 40;
            case 23 -> 26;
            case 24 -> 38;
            case 25 -> 13;
            case 26 -> 61;
            case 27 -> 53;
            case 28 -> 57;
            case 29 -> 30;
            case 30 -> 5;
            case 31 -> 56;
            case 32 -> 9;
            case 33 -> 15;
            case 34 -> 44;
            case 35 -> 35;
            case 36 -> 36;
            case 37 -> 46;
            case 38 -> 49;
            case 39 -> 33;
            case 40 -> 59;
            case 41 -> 6;
            case 42 -> 12;
            case 43 -> 47;
            case 44 -> 0;
            case 45 -> 18;
            case 46 -> 17;
            case 47 -> 63;
            case 48 -> 43;
            case 49 -> 27;
            case 50 -> 39;
            case 51 -> 51;
            case 52 -> 32;
            case 53 -> 52;
            case 54 -> 4;
            case 55 -> 21;
            case 56 -> 16;
            case 57 -> 54;
            case 58 -> 42;
            case 59 -> 62;
            case 60 -> 10;
            case 61 -> 3;
            case 62 -> 25;
            default -> 50;
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
        eA.p[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = eA.m(l, l2);
        Object object = o[n];
        if (object instanceof String) {
            String string = p[n];
            int n2 = string.indexOf(8);
            Class clazz = eA.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = eA.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = eA.g(clazz3, string2, clazz2)) != null) {
                    eA.o[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = eA.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        eA.o[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = eA.n(1775916691043597L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = eA.m(l, l2);
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
                clazz3 = eA.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = eA.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = eA.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        eA.o[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = eA.n(1775916691043597L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = eA.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        eA.o[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = eA.n(1775916691043597L, 0L);
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
            return MethodHandles.lookup().findStatic(eA.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(eA.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


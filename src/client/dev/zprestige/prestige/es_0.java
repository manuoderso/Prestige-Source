/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2189
 *  net.minecraft.class_2338
 *  net.minecraft.class_2378
 *  net.minecraft.class_3965
 *  net.minecraft.class_6880
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.bd_0;
import dev.zprestige.prestige.dV;
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
import net.minecraft.class_2189;
import net.minecraft.class_2338;
import net.minecraft.class_2378;
import net.minecraft.class_3965;
import net.minecraft.class_6880;

/*
 * Renamed from dev.zprestige.prestige.es
 */
public class es_0
extends dV {
    private int a = -1;
    private static final long k = hc.a(-834776346482784670L, -2453666929113454174L, MethodHandles.lookup().lookupClass()).a(153539353955548L);
    private static final long[] l;
    private static final Integer[] m;
    private static final Map n;
    private static final Object[] o;
    private static final String[] p;

    /*
     * Enabled aggressive block sorting
     */
    static {
        o = new Object[62];
        p = new String[62];
        es_0.f();
        n = new HashMap(13);
        long l = k ^ 0x2FB9C30326CL;
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
        String string = "x\f\u0002\u0000\u00dd\u00b7\u00c3z9PQn\u007f^\u00f5\u00ba";
        int n2 = "x\f\u0002\u0000\u00dd\u00b7\u00c3z9PQn\u007f^\u00f5\u00ba".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        es_0.l = lArray;
        m = new Integer[2];
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x837;
        if (m[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = es_0.l[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])es_0.n.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    es_0.n.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/es", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            es_0.m[n2] = n3;
        }
        return m[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = es_0.b(n, l);
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
            throw new RuntimeException("dev/zprestige/prestige/es" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/es" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = es_0.m(l, l2);
            object = o[n];
            try {
                if (!(object instanceof String)) break block2;
                es_0.o[n] = clazz = Class.forName(p[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = es_0.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = es_0.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = es_0.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = es_0.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = o;
        o[0] = "'Zl\u0004\u0004\u0019'Z{X\b\u0016=\u0011{F\b\u0003:`.\u0019Q";
        objectArray[1] = "H\u0016\u0005=Z\u0011H\u0016\u0012aV\u001eR]\u0012\u007fV\u000bU,C \u0004@";
        objectArray[2] = "\fQH8g \fQ_dk/\u0016\u001a_zk:\u0011k\u000e 2y";
        objectArray[3] = "\u0015.\u0013'nA\u0003.\u0016}}V\u0014e\u0015{qB\u0005\"\u0002l:P9";
        objectArray[4] = "\tk\nx}N|K\u0001wl\u0001\u0001S\u0012peHi";
        objectArray[5] = "wD@\"\u0000LwDW~\fCm\u000fW`\fVj~\u0007=]";
        objectArray[6] = "/\u007f.OF`/\u007f9\u0013Jo549\rJz2EhR\u0012";
        objectArray[7] = "H\rp\u001a#8H\rgF/7RFgX/\"U77\u0004z";
        objectArray[8] = Boolean.TYPE;
        es_0.p[8] = "java/lang/Boolean";
        objectArray[9] = "M\fS4\u000e\u0015M\fDh\u0002\u001aWGDv\u0002\u000fP6\u0014+V";
        objectArray[10] = "rS4\u0018\u0018+dS1B\u000b<s\u00182D\u0007(b_%SL8d";
        objectArray[11] = "\u001eKE\u0004\u00107kkN\u000b\u0001x\neE\u0000\u0005\"~";
        objectArray[12] = Void.TYPE;
        es_0.p[12] = "java/lang/Void";
        objectArray[13] = "^Y29dT+y96u\u001bJw2=qA>";
        objectArray[14] = Integer.TYPE;
        es_0.p[14] = "java/lang/Integer";
        objectArray[15] = "vE[N_W`E^\u0014L@w\u000e]\u0012@TfIJ\u0005\u000bBa";
        objectArray[16] = "\u0017\u0016qxXFb6zwI\t\u00038q|MSw";
        objectArray[17] = "\u001eq\u001dk\t+\u001eq\n7\u0005$\u0004:\n)\u00051\u0003KZ|Rw";
        objectArray[18] = "g\u0004BT\u007fQl\u000bS\u001b\u001c\\y\u0006\\p)^h\u0015@\\>S";
        objectArray[19] = "E\u001b@\fA-E\u001bWPM\"_PWNM7X!\u0001\u0011\u001eu";
        objectArray[20] = "\u001dB{\u0013Xs\u001dBlOT|\u0007\tlQTi\u0000x=\u0004\u0003*";
        objectArray[21] = "\u0019'5r@j\u0019'\".Le\u0003l\"0Lp\u0004\u001dth\u00186";
        objectArray[22] = ".,eiA]0$\u007f& X0$|f\u000eD";
        objectArray[23] = "\f\tsT\t\u0012\f\td\b\u0005\u001d\u0016Bd\u0016\u0005\b\u001130NR";
        objectArray[24] = "1#\u001f9d?1#\beh0+h\b{h%,\u0019Z 0o";
        objectArray[25] = Float.TYPE;
        es_0.p[25] = "java/lang/Float";
        objectArray[26] = "R\u0007\u0014Ef[R\u0007\u0003\u0019jTHL\u0003\u0007jAO=RX<\n";
        objectArray[27] = "{\u001a# C@{\u001a4|OOaQ4bOZf f6\u0017\u0019";
        objectArray[28] = "N9@N\u001c3N9W\u0012\u0010<TrW\f\u0010)S\u0003\u0002XIj";
        objectArray[29] = "}wyB\u00000}wn\u001e\f?g<n\u0000\f*`M<Z[h";
        objectArray[30] = "0q6\u000bbD;~'D\u0003J0u#\u001e";
        objectArray[31] = "]9N2oQ]9Ync^GrYpcK@\u0003\u000b$;\u000b";
        objectArray[32] = "\u0004+\u000fIkc\u0004+\u0018\u0015gl\u001e`\u0018\u000bgy\u0019\u0011IU22";
        objectArray[33] = "yW\u0003UaVq]D\u0014\fJxH\u001cL`x/\u0005E\u00143/yJ\u0016J=\u001ek[\u0004\u0014\f";
        objectArray[34] = "bZ&\u001c-o1@oAD{X\u000bt\u0019%m;[yN:\u0011";
        objectArray[35] = "W\u007f\u0019\u001a~P\u000fvB\f\u0011^\riB\u0007F\tS:\u001bk-Z\u0012}@\u0007}\u0000\u0005y";
        objectArray[36] = "?\u001f^D\u0010Z9\b\u0017]rR?\u0018\u0006^\u001e`nZY\u0004C7>\u0007\u0019G\u001fN6\r^\u0006rY>\u000bYT\u0011K \u001f[9";
        objectArray[37] = "R\f}\n+.\n\u0005&\u001cD \b\u001a&\u0017\u0013wVM~{+.\u0014\u0005:E?2T\u001c";
        objectArray[38] = "\\DJ\rRR\u0004M\u0011\u001b=\\\u0006R\u0011\u0010j\u000bY\u000fJ|ZK\u0019\u0003\fFVO\u001a";
        objectArray[39] = "\u001e7W~hXB>\nl\rFN&\u000ezat\u001afU!\r\u001d\u0018'\u000e\u007flN\u00198R\u001d";
        objectArray[40] = "\u0016}\u000bb?8H*]#B6\u001b1Q~.\u0004I|\u000f!BmM0Q{#>L/\r\u0019";
        objectArray[41] = ",[\u0001aH\f4\u0001\u0003g8\u0013 L\u0001mT!t\b[0\u0003v!N\u000bk\tG3_\u001958\u0018!_^g[\n?K\\\n";
        objectArray[42] = "VO,I\u0011NBSlPi\u0015TS1\\\u0005'\u0002\u0016l\u0007YpZ@6^\u0013L\\] Yi";
        objectArray[43] = "iK*Xh31BqN\u0007=3]qEPjl\u0001-)9+oVo[a77\u0001";
        objectArray[44] = "\u0006\\V2BR\u0015[Uj-@oU\u001d=\u001d\u0017\u0004\u0003\u0014xM)\u0004NS3\u0013BRG\u0016c-";
        objectArray[45] = "\u000b98,Ui\u0007=;\u0010I>\u0010 !|{cWz~\u0010\u0015n\np!!U7V$F)R9\u0005>6.M?]@";
        objectArray[46] = "yp?v@T''i7=Zt<ejQh&q<<=V +t=\f^d.a\r";
        objectArray[47] = "Z \u0013W\u0011\u001f\u0002<K\u0000k\u0003\u00055J]<TTh\u00101V\u0000];KJ\n\t\u0000)";
        objectArray[48] = "\u0018-\u001a\u001eU!FzL_(/\u0015a@\u0002D\u001dG,\u001aY(s\u0006wI\u001bXt\u0019q\u0011eH8\u0013\"D\u0019K \u001d- ";
        objectArray[49] = "X\u001f\u0007\u0003(t\u001c\u0003\u001e\u000eL{g\u0019A\u0002w~\u0019\t\u000f\u001ft\u0012W\u0010\u0007\u0014-x\rL\u0019UL";
        objectArray[50] = "\u007fE\u0017\u0019\u0019FsA\u0014%\u0005\u0011d\\\u000eI7G \u0007U\u0014`\u0011c\u0004\u0014G\r\u0017tM\r%";
        objectArray[51] = "dZ ~Bq:\u0015y=zpk\u001b\"'\u0016B6]x}zwy\f&\u007fAic\u0016\"@\u001a%<\u001c?+Drj]B)C~wWs!\u0007{bg";
        objectArray[52] = "\u000fQ]^K\nKMDS/\u00050W\u001b_\u0014\u0000NGUB\u0017lY\u0004OH\u001f]Q@J]/";
        objectArray[53] = "\u0015\u0002]X>W\u0013\u001fK_D\u000e\u001b\u0011ZZ(<KQ\u0001\rD\u0002O\u0006K\ru\n\u000b\u0003^=$[L\u0016GVz\f\u001aW:";
        objectArray[54] = "+\u001b0.}IuLfo\u0000G&Wj2lut\u001a1k\u0000Kr@{e1C6EnU";
        objectArray[55] = "6`b;\"J$~v9OF5p\r`vH\"7jf)R)\f";
        objectArray[56] = "dak!@Kc~my>^0ca/Rlg!;q\u0003;c$|(\\Z0%ct>";
        objectArray[57] = "xK\n.}hpAMo\u0010tyT\u00157|F)\u0018Oo+\u0011xK\n.}hpAMo\u0010";
        objectArray[58] = "#a\u0002\u0016\u000f\r0f\u0001N`\u001fJi\u0006A[\u001a4yH\\Xv#:RVPG+~WC`";
        objectArray[59] = "`\u0017fc<\u001dkCd5R\u0014fU:>>&2\u0016efmq2\u0014<i5@rM`=R";
        objectArray[60] = "\u0002R3\u007ff(\r\u0002:k\n$\u0007^gw]{_\b:\u001bf)\u0019Mnbn#^\f";
        Object[] objectArray2 = objectArray;
        objectArray[61] = "y\u001f~\bwv~\u0000xP\tc-\u001dt\u0006eQz_.Y5\u0006%\u001do\u000bx\u007f\u007f\u0018eQ\t";
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00c7' || c == '\u00c1' || c == 'k' || c == 'x') {
                field = es_0.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c7' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00c1' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'k' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = es_0.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00f9' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'S' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = es_0.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    @bP
    public void a(bd_0 bd_02) {
        block22: {
            Object object;
            long l;
            long l2;
            block20: {
                CallSite callSite;
                CallSite callSite2;
                long l3;
                block18: {
                    CallSite callSite3;
                    long l4;
                    block19: {
                        CallSite callSite4;
                        block16: {
                            block17: {
                                long l5 = l2 = k ^ 0x49AA840EB5ADL;
                                l = l5 ^ 0x64589D12358BL;
                                l3 = l5 ^ 0x3C74C9008858L;
                                l4 = l5 ^ 0x12C519B972F1L;
                                callSite2 = es_0.c("S", (long)-1156086965867209656L, (long)l2);
                                try {
                                    try {
                                        callSite4 = es_0.c("\u00c7", (Object)b, (long)-1156155784870759771L, (long)l2);
                                        if (callSite2 != null) break block16;
                                        if (callSite4 instanceof class_3965) break block17;
                                    }
                                    catch (MatchException matchException) {
                                        throw es_0.c("S", (Object)matchException, (long)-1155368058203682634L, (long)l2);
                                    }
                                    return;
                                }
                                catch (MatchException matchException) {
                                    throw es_0.c("S", (Object)matchException, (long)-1155368058203682634L, (long)l2);
                                }
                            }
                            callSite4 = es_0.c("\u00c7", (Object)b, (long)-1156155784870759771L, (long)l2);
                        }
                        class_3965 class_39652 = (class_3965)callSite4;
                        callSite3 = es_0.c("\u00f9", (Object)class_39652, (long)-1156682457569832608L, (long)l2);
                        try {
                            callSite = es_0.c("\u00f9", (Object)es_0.c("\u00f9", (Object)es_0.c("\u00c7", (Object)b, (long)-1155752134860533831L, (long)l2), (Object)callSite3, (long)-1155400699263420263L, (long)l2), (long)-1156784715223622632L, (long)l2);
                            if (callSite2 != null) break block18;
                            if (callSite == false) break block19;
                        }
                        catch (MatchException matchException) {
                            throw es_0.c("S", (Object)matchException, (long)-1155368058203682634L, (long)l2);
                        }
                        return;
                    }
                    Object[] objectArray = new Object[2];
                    objectArray[1] = l4;
                    objectArray[0] = callSite3;
                    callSite = es_0.c("\u00f9", (Object)this, (Object)objectArray, (long)-1156598048962619787L, (long)l2);
                }
                CallSite callSite5 = callSite;
                try {
                    block21: {
                        try {
                            try {
                                try {
                                    try {
                                        object = callSite5;
                                        if (callSite2 != null) break block20;
                                        if (object == -1) break block21;
                                    }
                                    catch (MatchException matchException) {
                                        throw es_0.c("S", (Object)matchException, (long)-1155368058203682634L, (long)l2);
                                    }
                                    object = es_0.c("\u00f9", (Object)es_0.c("\u00c7", (Object)es_0.c("\u00c7", (Object)b, (long)-1155555139700250847L, (long)l2), (long)-1155258801634103687L, (long)l2), (long)-1155849583627929686L, (long)l2);
                                    if (callSite2 != null) break block20;
                                }
                                catch (MatchException matchException) {
                                    throw es_0.c("S", (Object)matchException, (long)-1155368058203682634L, (long)l2);
                                }
                                if (object == false) break block21;
                            }
                            catch (MatchException matchException) {
                                throw es_0.c("S", (Object)matchException, (long)-1155368058203682634L, (long)l2);
                            }
                            Object[] objectArray = new Object[1];
                            objectArray[0] = l3;
                            this.a = (int)es_0.c("S", (Object)objectArray, (long)-1157015952769764344L, (long)l2);
                            Object[] objectArray2 = new Object[2];
                            objectArray2[1] = l;
                            objectArray2[0] = (int)callSite5;
                            es_0.c("S", (Object)objectArray2, (long)-1157392141847196829L, (long)l2);
                            if (callSite2 == null) break block22;
                        }
                        catch (MatchException matchException) {
                            throw es_0.c("S", (Object)matchException, (long)-1155368058203682634L, (long)l2);
                        }
                    }
                    object = this.a;
                }
                catch (MatchException matchException) {
                    throw es_0.c("S", (Object)matchException, (long)-1155368058203682634L, (long)l2);
                }
            }
            Object[] objectArray = new Object[2];
            objectArray[1] = l;
            objectArray[0] = (int)object;
            es_0.c("S", (Object)objectArray, (long)-1157392141847196829L, (long)l2);
        }
    }

    private int a(Object[] objectArray) {
        Object object;
        block20: {
            class_2338 class_23382 = (class_2338)objectArray[0];
            long l = (Long)objectArray[1];
            l = k ^ l;
            int n = -1;
            CallSite callSite = es_0.c("S", (long)-4083396851933137688L, (long)l);
            float f = 1.0f;
            int n2 = 0;
            while (n2 <= es_0.b("w", (int)24259, (long)(0x3504619145E991A8L ^ l))) {
                block19: {
                    block21: {
                        int n3;
                        block26: {
                            CallSite callSite2;
                            float f10;
                            block24: {
                                block25: {
                                    CallSite callSite3;
                                    CallSite callSite4;
                                    block22: {
                                        callSite4 = es_0.c("\u00f9", (Object)es_0.c("\u00f9", (Object)es_0.c("\u00c7", (Object)b, (long)-4083290628625635195L, (long)l), (long)-4082825076017411475L, (long)l), (int)n2, (long)-4084467790308688815L, (long)l);
                                        try {
                                            block23: {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    if (callSite != null) break block19;
                                                                    object = es_0.c("\u00f9", (Object)callSite4, (long)-4082935365325870799L, (long)l);
                                                                    if (callSite != null) break block20;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw es_0.c("S", (Object)matchException, (long)-4082702270880620522L, (long)l);
                                                                }
                                                                if (object != 0) break block21;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw es_0.c("S", (Object)matchException, (long)-4082702270880620522L, (long)l);
                                                            }
                                                            callSite3 = es_0.c("\u00f9", (Object)callSite4, (long)-4084270165069574677L, (long)l) - es_0.c("\u00f9", (Object)callSite4, (long)-4082527624908395641L, (long)l);
                                                            if (callSite != null) break block22;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw es_0.c("S", (Object)matchException, (long)-4082702270880620522L, (long)l);
                                                        }
                                                        if (callSite3 > es_0.b("w", (int)27793, (long)(0x5BE65C442F9923FBL ^ l))) break block23;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw es_0.c("S", (Object)matchException, (long)-4082702270880620522L, (long)l);
                                                    }
                                                    if (callSite == null) break block21;
                                                }
                                                catch (MatchException matchException) {
                                                    throw es_0.c("S", (Object)matchException, (long)-4082702270880620522L, (long)l);
                                                }
                                            }
                                            callSite3 = es_0.c("S", (Object)((class_6880)es_0.c("\u00f9", (Object)es_0.c("\u00f9", (Object)((class_2378)es_0.c("\u00f9", (Object)es_0.c("\u00f9", (Object)es_0.c("\u00f9", (Object)es_0.c("\u00c7", (Object)b, (long)-4083097196073310439L, (long)l), (long)-4084520549753698605L, (long)l), (Object)es_0.c("\u00f9", (Object)es_0.c("k", (long)-4083786018746704987L, (long)l), (long)-4084183174872702187L, (long)l), (long)-4083273277600806728L, (long)l), (long)-4084316237490965150L, (long)l)), (Object)es_0.c("\u00f9", (Object)es_0.c("k", (long)-4083786018746704987L, (long)l), (long)-4083596240949294692L, (long)l), (long)-4083065240878343983L, (long)l), (long)-4084316237490965150L, (long)l)), (Object)callSite4, (long)-4084573412231623071L, (long)l);
                                        }
                                        catch (MatchException matchException) {
                                            throw es_0.c("S", (Object)matchException, (long)-4082702270880620522L, (long)l);
                                        }
                                    }
                                    f10 = (float)callSite3;
                                    callSite2 = es_0.c("\u00f9", (Object)callSite4, (Object)es_0.c("\u00f9", (Object)es_0.c("\u00c7", (Object)b, (long)-4083097196073310439L, (long)l), (Object)class_23382, (long)-4082746043941302215L, (long)l), (long)-4084663029769629684L, (long)l);
                                    try {
                                        try {
                                            n3 = es_0.c("\u00f9", (Object)es_0.c("\u00f9", (Object)es_0.c("\u00c7", (Object)b, (long)-4083097196073310439L, (long)l), (Object)class_23382, (long)-4082746043941302215L, (long)l), (long)-4083887552523959350L, (long)l) instanceof class_2189;
                                            if (callSite != null) break block24;
                                            if (n3 == 0) break block25;
                                        }
                                        catch (MatchException matchException) {
                                            throw es_0.c("S", (Object)matchException, (long)-4082702270880620522L, (long)l);
                                        }
                                        return -1;
                                    }
                                    catch (MatchException matchException) {
                                        throw es_0.c("S", (Object)matchException, (long)-4082702270880620522L, (long)l);
                                    }
                                }
                                float f11 = f10 + callSite2 - f;
                                n3 = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
                            }
                            try {
                                if (callSite != null) break block26;
                                if (n3 <= 0) break block21;
                            }
                            catch (MatchException matchException) {
                                throw es_0.c("S", (Object)matchException, (long)-4082702270880620522L, (long)l);
                            }
                            f = f10 + callSite2;
                            n3 = n2;
                        }
                        n = n3;
                    }
                    ++n2;
                }
                if (callSite == null) continue;
            }
            object = n;
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
            case 0 -> 49;
            case 1 -> 14;
            case 2 -> 41;
            case 3 -> 59;
            case 4 -> 4;
            case 5 -> 37;
            case 6 -> 54;
            case 7 -> 60;
            case 8 -> 55;
            case 9 -> 18;
            case 10 -> 39;
            case 11 -> 31;
            case 12 -> 16;
            case 13 -> 0;
            case 14 -> 28;
            case 15 -> 38;
            case 16 -> 6;
            case 17 -> 8;
            case 18 -> 48;
            case 19 -> 47;
            case 20 -> 15;
            case 21 -> 42;
            case 22 -> 5;
            case 23 -> 23;
            case 24 -> 50;
            case 25 -> 19;
            case 26 -> 53;
            case 27 -> 45;
            case 28 -> 63;
            case 29 -> 10;
            case 30 -> 51;
            case 31 -> 25;
            case 32 -> 40;
            case 33 -> 27;
            case 34 -> 7;
            case 35 -> 61;
            case 36 -> 1;
            case 37 -> 26;
            case 38 -> 13;
            case 39 -> 24;
            case 40 -> 22;
            case 41 -> 12;
            case 42 -> 36;
            case 43 -> 52;
            case 44 -> 56;
            case 45 -> 11;
            case 46 -> 58;
            case 47 -> 57;
            case 48 -> 29;
            case 49 -> 33;
            case 50 -> 62;
            case 51 -> 3;
            case 52 -> 44;
            case 53 -> 46;
            case 54 -> 30;
            case 55 -> 43;
            case 56 -> 2;
            case 57 -> 35;
            case 58 -> 17;
            case 59 -> 20;
            case 60 -> 21;
            case 61 -> 32;
            case 62 -> 34;
            default -> 9;
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
        es_0.p[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = es_0.m(l, l2);
        Object object = o[n];
        if (object instanceof String) {
            String string = p[n];
            int n2 = string.indexOf(8);
            Class clazz = es_0.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = es_0.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = es_0.g(clazz3, string2, clazz2)) != null) {
                    es_0.o[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = es_0.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        es_0.o[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = es_0.n(2137049750647618L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = es_0.m(l, l2);
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
                clazz3 = es_0.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = es_0.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = es_0.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        es_0.o[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = es_0.n(2137049750647618L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = es_0.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        es_0.o[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = es_0.n(2137049750647618L, 0L);
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
            return MethodHandles.lookup().findStatic(es_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(es_0.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


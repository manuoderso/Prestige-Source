/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1657
 *  net.minecraft.class_310
 *  net.minecraft.class_3966
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.bG;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.dV;
import dev.zprestige.prestige.hc;
import dev.zprestige.prestige.x_0;
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
 * Renamed from dev.zprestige.prestige.fa
 */
public class fa_0
extends dV {
    private boolean i = 0;
    private static final long k = hc.a(-4759490190599688464L, 9085348287606910916L, MethodHandles.lookup().lookupClass()).a(91570358737831L);
    private static final String[] l;
    private static final String[] m;
    private static final Map n;
    private static final Object[] o;
    private static final String[] p;

    /*
     * Enabled aggressive block sorting
     */
    static {
        o = new Object[35];
        p = new String[35];
        fa_0.f();
        n = new HashMap(13);
        long l = k ^ 0x1CFC32550CC9L;
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
        String string = "\u0013\u00d5\u0018\u00bf\u00af\u00dd]Z\u00ec\u0099\u00ec\u0089\u0011\u0007\u00fb\u00c3\u00c2\u00cb&\u0095\u00acgu\u00fa8\u00f1\u008d\u00bd\u0013\u00fa1\u001f\f\u0003\u0084\u00d4\u0019Z\u00cc\u00f4 1\u00da\u0091|\u00f4\u0090\u0095\u001dk\u00af\u00f3\u0017\u007f\u00bc~\u00b2\u00b4\u0091\u00ed\u00b8x\u00b2\u001aj\u001bI}7\u00fe^\u0095?";
        int n2 = "\u0013\u00d5\u0018\u00bf\u00af\u00dd]Z\u00ec\u0099\u00ec\u0089\u0011\u0007\u00fb\u00c3\u00c2\u00cb&\u0095\u00acgu\u00fa8\u00f1\u008d\u00bd\u0013\u00fa1\u001f\f\u0003\u0084\u00d4\u0019Z\u00cc\u00f4 1\u00da\u0091|\u00f4\u0090\u0095\u001dk\u00af\u00f3\u0017\u007f\u00bc~\u00b2\u00b4\u0091\u00ed\u00b8x\u00b2\u001aj\u001bI}7\u00fe^\u0095?".length();
        int n3 = 40;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = fa_0.b(byArray3).intern();
            if ((n4 += n3) >= n2) {
                fa_0.l = stringArray;
                m = new String[2];
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = fa_0.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5CD6;
        if (m[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])fa_0.n.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    fa_0.n.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/fa", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = fa_0.l[n2].getBytes("ISO-8859-1");
            fa_0.m[n2] = fa_0.b(((Cipher)objectArray[0]).doFinal(byArray2));
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
            throw new RuntimeException("dev/zprestige/prestige/fa" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/fa" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = fa_0.m(l, l2);
            object = o[n];
            try {
                if (!(object instanceof String)) break block2;
                fa_0.o[n] = clazz = Class.forName(p[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = fa_0.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = fa_0.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = fa_0.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = fa_0.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = o;
        o[0] = "<g6^\tv<g!\u0002\u0005y&,!\u001c\u0005l!]qIR)";
        objectArray[1] = "~iFsfQ~iQ/j^d\"Q1jKcS\u0003o2\u000f";
        objectArray[2] = "\u0014\u0018\u0011\u0012\u0016\u0004\u0002\u0018\u0014H\u0005\u0013\u0015S\u0017N\t\u0007\u0004\u0014\u0000YB\u0017\u0012";
        objectArray[3] = "f=\u0018z\u00198\u0013\u001d\u0013u\bwr\u0013\u0018~\f-\u0006";
        objectArray[4] = Void.TYPE;
        fa_0.p[4] = "java/lang/Void";
        objectArray[5] = "]>4\u0010T\fK>1JG\u001b\\u2LK\u000fM2%[\u0000\u001dq";
        objectArray[6] = "~J?)^\u0002\u000bj4&OMvr'!F\u0004\u001e";
        objectArray[7] = "\u0001\u0010\u0000\u001e\u0014\t\u0001\u0010\u0017B\u0018\u0006\u001b[\u0017\\\u0018\u0013\u001c*E\u0006LW";
        objectArray[8] = "Rh4ED|Rh#\u0019HsH##\u0007HfORr^\u001f$";
        objectArray[9] = "zJn%TDzJyyXK`\u0001ygX^gp):\u000b";
        objectArray[10] = Boolean.TYPE;
        fa_0.p[10] = "java/lang/Boolean";
        objectArray[11] = "|J9\n[v|J.VWyf\u0001.HWlap~\u0015\u0006";
        objectArray[12] = "\u0002ZY\\T+\u0002ZN\u0000X$\u0018\u0011N\u001eX1\u001f`\u001fA\u0000";
        objectArray[13] = "+\b<O\u0001W=\b9\u0015\u0012@*C:\u0013\u001eT;\u0004-\u0004UA\u0019";
        objectArray[14] = "r_]U\rpyPL\u001aphjWES";
        objectArray[15] = "iJP;Z%\u007fJUaI2h\u0001VgE&yFAp\u000e6aFC{T{]]CfT<jJ";
        objectArray[16] = "&t\u001bEb&ST\u0010Jsi2Z\u001bAw3F";
        objectArray[17] = "\u0017\u0012;Kt0\u0017\u0012,\u0017x?\rY,\tx*\n({V.";
        objectArray[18] = "\u0002~EW=\u000f\u0014~@\r.\u0018\u00035C\u000b\"\f\u0012rT\u001ci\u0019\u0007";
        objectArray[19] = "74 Ei^<;1\n\nS)6>a?Q8%\"M(\\";
        objectArray[20] = "\u0010\u0014,\"7r\u001b\u001b=mV|\u0010\u001097";
        objectArray[21] = "}p\"\u0007\u0016a/*(>\u00130?*%R!d|ur\u0004v-$.$ZH`3sB";
        objectArray[22] = "\t>\ngudJ8\u0012vKu0.\u0016zrmJ9\u000bg\"\u000e\n;\u001a\"r|Uz\u0014|K";
        objectArray[23] = "[w\u001eb\u001f\u007f\u0007?\u001f7bm`;\u0017z\\:Z=\u0015m\f\u0007";
        objectArray[24] = "e)\u001b\u0010\u001fy;z\u0011\u000efr59\u0015\u000f\n@eyJWf**5I\u0004[}a<\u0005h";
        objectArray[25] = "\u0016\u0016|A_\u000eL\u00198Q/[EZcKCi\u0013\u001b<\u0014\u0010>\u0017OmR\u0011DIWg\\/";
        objectArray[26] = ":5z<e%5jr \u001f:kgq2Hm54(^/,nth1aksk";
        objectArray[27] = "\u001ct&v\u0007D\u0013+.j}[M&-x*\f\u0013qx\u0014C\u0005S&9$\u0019\n\u00176";
        objectArray[28] = "\ffq_\u0010\u000fO65\u0010hT=1p\u0011\nSC>6D\u0010>\u0007',\u0015QLXf\"Kh";
        objectArray[29] = "='{\u001bdy~w?T\u001c!\fpzU~%r\u007f<\u0000dH6f&Q%:i'(\u000f\u001c";
        objectArray[30] = "\u000f#90\u0015$\u0014 o8{/e*`h\n8Ti0,E";
        objectArray[31] = "7QQ\b0%`\u001aXD\\wg_zH&ylL!]a'hN_R'rr#";
        objectArray[32] = "#Bz)EH`\u0012>f=\u0010\u0012\u0016+;\u0004\u001ah\u00016&Ty-\u0015(&\u0003\u0003s\r\"(=";
        objectArray[33] = "FQEu\u001d6I\u000eMig)\u0017\u0003N{0~IS\u0017\u0017\f}\tSDgV!\u000fT";
        Object[] objectArray2 = objectArray;
        objectArray[34] = "oZKO\t\u0002bC\u0012\u0015v\f\u0004JO\u000f\u0014_9\u001dKB\u0015ehD\\\u001cLX?@\u0011\u001dv";
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '$' || c == 'N' || c == '\u00c2' || c == 'j') {
                field = fa_0.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '$' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'N' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00c2' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = fa_0.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00d1' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00a5' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = fa_0.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    @bP
    public void a(bG bG2) {
        block35: {
            block38: {
                CallSite callSite;
                CallSite callSite2;
                CallSite callSite3;
                long l;
                long l2;
                block39: {
                    CallSite callSite4;
                    CallSite callSite5;
                    long l3;
                    block37: {
                        CallSite callSite6;
                        block36: {
                            Object object;
                            block34: {
                                block32: {
                                    block33: {
                                        block30: {
                                            block31: {
                                                class_310 class_3102;
                                                block28: {
                                                    block29: {
                                                        long l4 = l2 = k ^ 0x35B8B6ACF499L;
                                                        l3 = l4 ^ 0x5CE6756ACCD5L;
                                                        l = l4 ^ 0x2F6C7A39375BL;
                                                        callSite5 = fa_0.c("\u00a5", (long)-5955260447010854034L, (long)l2);
                                                        try {
                                                            try {
                                                                class_3102 = b;
                                                                if (callSite5 != null) break block28;
                                                                if (fa_0.c("$", (Object)class_3102, (long)-5956245081760617677L, (long)l2) == null) break block29;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw fa_0.c("\u00a5", (Object)matchException, (long)-5956011524746681647L, (long)l2);
                                                            }
                                                            return;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw fa_0.c("\u00a5", (Object)matchException, (long)-5956011524746681647L, (long)l2);
                                                        }
                                                    }
                                                    class_3102 = b;
                                                }
                                                try {
                                                    try {
                                                        object = fa_0.c("\u00d1", (Object)fa_0.c("$", (Object)class_3102, (long)-5955535920716420341L, (long)l2), (long)-5955707638517073560L, (long)l2);
                                                        if (callSite5 != null) break block30;
                                                        if (object != false) break block31;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw fa_0.c("\u00a5", (Object)matchException, (long)-5956011524746681647L, (long)l2);
                                                    }
                                                    this.i = 0;
                                                }
                                                catch (MatchException matchException) {
                                                    throw fa_0.c("\u00a5", (Object)matchException, (long)-5956011524746681647L, (long)l2);
                                                }
                                            }
                                            object = this.i;
                                        }
                                        try {
                                            if (callSite5 != null) break block32;
                                            if (object == false) break block33;
                                        }
                                        catch (MatchException matchException) {
                                            throw fa_0.c("\u00a5", (Object)matchException, (long)-5956011524746681647L, (long)l2);
                                        }
                                        return;
                                    }
                                    object = fa_0.c("\u00d1", (Object)fa_0.c("$", (Object)b, (long)-5955535920716420341L, (long)l2), (long)-5955707638517073560L, (long)l2);
                                }
                                try {
                                    try {
                                        try {
                                            if (callSite5 != null) break block34;
                                            if (object == false) break block35;
                                        }
                                        catch (MatchException matchException) {
                                            throw fa_0.c("\u00a5", (Object)matchException, (long)-5956011524746681647L, (long)l2);
                                        }
                                        callSite6 = fa_0.c("$", (Object)b, (long)-5955496736401362082L, (long)l2);
                                        if (callSite5 != null) break block36;
                                    }
                                    catch (MatchException matchException) {
                                        throw fa_0.c("\u00a5", (Object)matchException, (long)-5956011524746681647L, (long)l2);
                                    }
                                    object = callSite6 instanceof class_3966;
                                }
                                catch (MatchException matchException) {
                                    throw fa_0.c("\u00a5", (Object)matchException, (long)-5956011524746681647L, (long)l2);
                                }
                            }
                            try {
                                if (object == false) break block35;
                                callSite6 = fa_0.c("$", (Object)b, (long)-5955496736401362082L, (long)l2);
                            }
                            catch (MatchException matchException) {
                                throw fa_0.c("\u00a5", (Object)matchException, (long)-5956011524746681647L, (long)l2);
                            }
                        }
                        class_3966 class_39662 = (class_3966)callSite6;
                        try {
                            try {
                                callSite4 = fa_0.c("\u00d1", (Object)class_39662, (long)-5955402227867295571L, (long)l2);
                                if (callSite5 != null) break block37;
                                if (!(callSite4 instanceof class_1657)) break block38;
                            }
                            catch (MatchException matchException) {
                                throw fa_0.c("\u00a5", (Object)matchException, (long)-5956011524746681647L, (long)l2);
                            }
                            callSite4 = fa_0.c("\u00d1", (Object)class_39662, (long)-5955402227867295571L, (long)l2);
                        }
                        catch (MatchException matchException) {
                            throw fa_0.c("\u00a5", (Object)matchException, (long)-5956011524746681647L, (long)l2);
                        }
                    }
                    class_1657 class_16572 = (class_1657)callSite4;
                    callSite3 = fa_0.c("\u00d1", (Object)fa_0.c("\u00d1", (Object)class_16572, (long)-5955590904318238315L, (long)l2), (long)-5955869283294878576L, (long)l2);
                    try {
                        block40: {
                            try {
                                try {
                                    callSite2 = fa_0.c("\u00c2", (long)-5955731176962529482L, (long)l2);
                                    callSite = callSite3;
                                    if (callSite5 != null) break block39;
                                    Object[] objectArray = new Object[2];
                                    objectArray[1] = l3;
                                    objectArray[0] = callSite;
                                    if (fa_0.c("\u00d1", (Object)callSite2, (Object)objectArray, (long)-5956186570782930220L, (long)l2) == false) break block40;
                                }
                                catch (MatchException matchException) {
                                    throw fa_0.c("\u00a5", (Object)matchException, (long)-5956011524746681647L, (long)l2);
                                }
                                fa_0.c("\u00d1", (Object)fa_0.c("\u00c2", (long)-5955731176962529482L, (long)l2), (Object)callSite3, (long)-5955934843276415735L, (long)l2);
                                Object[] objectArray = new Object[4];
                                objectArray[3] = l;
                                objectArray[2] = x_0.INFO;
                                objectArray[1] = (String)((Object)fa_0.b("i", (int)13068, (long)(0x6AD7511149BD4285L ^ l2))) + (String)((Object)callSite3);
                                objectArray[0] = this;
                                fa_0.c("\u00a5", (Object)objectArray, (long)-5955169719045709960L, (long)l2);
                                if (callSite5 == null) break block38;
                            }
                            catch (MatchException matchException) {
                                throw fa_0.c("\u00a5", (Object)matchException, (long)-5956011524746681647L, (long)l2);
                            }
                        }
                        callSite2 = fa_0.c("\u00c2", (long)-5955731176962529482L, (long)l2);
                        callSite = callSite3;
                    }
                    catch (MatchException matchException) {
                        throw fa_0.c("\u00a5", (Object)matchException, (long)-5956011524746681647L, (long)l2);
                    }
                }
                fa_0.c("\u00d1", (Object)callSite2, (Object)callSite, (long)-5955985062144970568L, (long)l2);
                Object[] objectArray = new Object[4];
                objectArray[3] = l;
                objectArray[2] = x_0.INFO;
                objectArray[1] = (String)((Object)fa_0.b("i", (int)12898, (long)(0x5F0BCA547D2E43EAL ^ l2))) + (String)((Object)callSite3);
                objectArray[0] = this;
                fa_0.c("\u00a5", (Object)objectArray, (long)-5955169719045709960L, (long)l2);
            }
            this.i = 1;
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
            case 0 -> 15;
            case 1 -> 12;
            case 2 -> 52;
            case 3 -> 32;
            case 4 -> 18;
            case 5 -> 26;
            case 6 -> 6;
            case 7 -> 47;
            case 8 -> 31;
            case 9 -> 40;
            case 10 -> 4;
            case 11 -> 60;
            case 12 -> 53;
            case 13 -> 43;
            case 14 -> 16;
            case 15 -> 7;
            case 16 -> 13;
            case 17 -> 35;
            case 18 -> 59;
            case 19 -> 19;
            case 20 -> 45;
            case 21 -> 61;
            case 22 -> 1;
            case 23 -> 39;
            case 24 -> 29;
            case 25 -> 25;
            case 26 -> 36;
            case 27 -> 51;
            case 28 -> 3;
            case 29 -> 50;
            case 30 -> 54;
            case 31 -> 22;
            case 32 -> 46;
            case 33 -> 8;
            case 34 -> 11;
            case 35 -> 0;
            case 36 -> 10;
            case 37 -> 21;
            case 38 -> 37;
            case 39 -> 58;
            case 40 -> 41;
            case 41 -> 20;
            case 42 -> 9;
            case 43 -> 56;
            case 44 -> 17;
            case 45 -> 33;
            case 46 -> 62;
            case 47 -> 42;
            case 48 -> 14;
            case 49 -> 24;
            case 50 -> 63;
            case 51 -> 38;
            case 52 -> 57;
            case 53 -> 30;
            case 54 -> 2;
            case 55 -> 49;
            case 56 -> 34;
            case 57 -> 23;
            case 58 -> 55;
            case 59 -> 28;
            case 60 -> 27;
            case 61 -> 48;
            case 62 -> 44;
            default -> 5;
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
        fa_0.p[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = fa_0.m(l, l2);
        Object object = o[n];
        if (object instanceof String) {
            String string = p[n];
            int n2 = string.indexOf(8);
            Class clazz = fa_0.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = fa_0.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = fa_0.g(clazz3, string2, clazz2)) != null) {
                    fa_0.o[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = fa_0.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        fa_0.o[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = fa_0.n(1425381493396912L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = fa_0.m(l, l2);
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
                clazz3 = fa_0.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = fa_0.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = fa_0.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        fa_0.o[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = fa_0.n(1425381493396912L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = fa_0.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        fa_0.o[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = fa_0.n(1425381493396912L, 0L);
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
            return MethodHandles.lookup().findStatic(fa_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(fa_0.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


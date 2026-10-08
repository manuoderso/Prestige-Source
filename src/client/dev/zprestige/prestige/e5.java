/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_310
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.bG;
import dev.zprestige.prestige.bP;
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
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_310;

public class e5
extends dV {
    private dQ a;
    private f5 c;
    private int d;
    private boolean i;
    private static final long k = hc.a(1962307134049143651L, -5751871103818772708L, MethodHandles.lookup().lookupClass()).a(24408716236470L);
    private static final long l;
    private static final Object[] m;
    private static final String[] n;

    public e5() {
        long l = k ^ 0x53AABE2965B6L;
        long l2 = l ^ 0x5CD252175B37L;
        this.c = new f5(l2);
        this.d = 0;
        this.i = 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        m = new Object[55];
        n = new String[55];
        e5.f();
        long l = k ^ 0x6A4FA474C266L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = -5509271318556389263L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                e5.l = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/e5" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @Override
    public boolean b(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return false;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = e5.m(l, l2);
            object = m[n];
            try {
                if (!(object instanceof String)) break block2;
                e5.m[n] = clazz = Class.forName(e5.n[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = e5.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = e5.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = e5.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = e5.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = m;
        m[0] = "S\u0001N< \u0011E\u0001Kf3\u0006RJH`?\u0012C\r_wt\u0000\u007f";
        objectArray[1] = "jfhQiE\u001fFc^x\nb^pYqC\n";
        objectArray[2] = "\u001b6\u00079>\u001f\u001b6\u0010e2\u0010\u0001}\u0010{2\u0005\u0006\f@&c";
        objectArray[3] = "\u0010\u0002Fujw\u0010\u0002Q)fx\nIQ7fm\r8\u0005o1";
        objectArray[4] = "\u0001)`L5`\u0017)e\u0016&w\u0000bf\u0010*c\u0011%q\u0007auP";
        objectArray[5] = "%]LCI>.R]\f*3;_Rg\u001f1*LNK\b<";
        objectArray[6] = "@;&\u000b[\u0013@;1WW\u001cZp1IW\t]\u0001c\u0012\u000fC";
        objectArray[7] = "|IZ8\u0015T|IMd\u0019[f\u0002Mz\u0019Nas\u001f!A\u000f";
        objectArray[8] = "a!c\u0002}\u0013a!t^q\u001c{jt@q\t|\u001b&\u0014 H";
        objectArray[9] = "hH\u0004l\u0001@hH\u00130\rOr\u0003\u0013.\rZurAtZ\u0018";
        objectArray[10] = Integer.TYPE;
        e5.n[10] = "java/lang/Integer";
        objectArray[11] = ".-\u00101l}[\r\u001b>}2:\u0003\u00105yhN";
        objectArray[12] = Void.TYPE;
        e5.n[12] = "java/lang/Void";
        objectArray[13] = "\r&8\n@V\u001b&=PSA\fm>V_U\u001d*)A\u0014@\\";
        objectArray[14] = "\rv|*\u0001ixVw%\u0010&\u0019X|.\u0014|m";
        objectArray[15] = Boolean.TYPE;
        e5.n[15] = "java/lang/Boolean";
        objectArray[16] = "O4\u000eYb0Y4\u000b\u0003q'N\u007f\b\u0005}3_8\u001f\u00126#D";
        objectArray[17] = "*\u001f\u0015\".N_?\u001e-?\u0001>1\u0015&;[J";
        objectArray[18] = "^7^\u0006i\u001d^7IZe\u0012D|IDe\u0007C\r\u001e\u001b3";
        objectArray[19] = "gm\u0016zb5qm\u0013 q\"f&\u0010&}6wa\u000716&q";
        objectArray[20] = "7;\u0014yhbB\u001b\u001fvy-#\u0015\u0014}}wW";
        objectArray[21] = "Fx=\u0017>xPx8M-oG3;K!{Vt,\\jlt";
        objectArray[22] = "h.U'Ym\u001d\u000e^(H\"|\u0000U#Lx\b";
        objectArray[23] = "oKjd\"=oK}8.2u\u0000}&.'rq/xyl";
        objectArray[24] = "@\u0012hk)k52cd8$T<ho<~ ";
        objectArray[25] = "_wbd\u0003,Iwg>\u0010;^<d8\u001c/O{s/W8p";
        objectArray[26] = "|R5!|\u001cw]$n\u001d\u0012|V 4";
        objectArray[27] = "IeE\u001d\u0019BBjTRqBLeG";
        objectArray[28] = Float.TYPE;
        e5.n[28] = "java/lang/Float";
        objectArray[29] = "}}>\rcn\b]5\u0002r!iS>\tv{\u001d";
        objectArray[30] = "oK|>\u0005KyKyd\u0016\\n\u0000zb\u001aH\u007fGmuQ_Z";
        objectArray[31] = "7[[>p\u0003B{P1aL#u[:e\u0016W";
        objectArray[32] = "L<AL\u0007>9\u001cJC\u0016qX\u0012AH\u0012+,";
        objectArray[33] = "'\u0001)U$M!H,NDW\u001d\u0014eU4W\"H1\u001d#5-\u001e=X{\u0005,\f)]D";
        objectArray[34] = "1iYB@.8gQ?\u0012V8+\u0001SAis)COx";
        objectArray[35] = "0C\u0015if'p@\u00025\u0004/hN\u001c:Sx6\u0019DV>}lX\u001b9>9lI";
        objectArray[36] = "\u000bZ\u0017%[8H[\t1a):\\^>\u0011\"\u0005\u0000\nv\u0006@SAU&\u00028]\u0004\u0017&a";
        objectArray[37] = "\b\u001b\u0011H\u0018\u0011\u000eR\u0014Sx\u00002P\u0015\u0003G\u0000R\u001b\u0014J\u0012i\t\u0012U\u0005\u0011\tB\u0013\u001cPx";
        objectArray[38] = "M$\t#I\u0005L)]c7\u000f'-\u0007*G\u0006\u0018qSbPdN0\f2T\u001c@uN27";
        objectArray[39] = "\u0005fr)\u0017f\\1a)m?T+o)\u0001\r\u0006f7\u007fmg\u000092\"\f>\u00072~N";
        objectArray[40] = "#*Sc\"&c)D?@.{'Z0\u0017y%w\u0003\\+:tuO 11!%";
        objectArray[41] = "u-25xF{n+>\u001fF\u0011pj7oN.,>\u007fx,!z2: \u001c h&?\u001f";
        objectArray[42] = "XA\n3\u000fXY]PijU4B\u0004&\u001a^\u000b\u001ePn\r<\u0004H\\+U\f\u0005ZH.j";
        objectArray[43] = "{W\u0007\u001a\u0010\no\u0003\u0001\u001bj\u001a\u0015\t\\\u000b\u001a\u0011*U\bC\rs%\u0003\u0004\u0006UC$\u0011\u0010\u0003j";
        objectArray[44] = "V_3l&5\u0013X;gA;\nTfm\u0016eU\u0002>\u0001|l\u0005\u0004n`%k\u000eH";
        objectArray[45] = "zN\n!t&s\u0017Z&\nxt\u001c\u000fq]+%I[\u001de)tM\u0015-lp$J";
        objectArray[46] = "io\r>[\u000bi+\r/8\u0001>/\b\"T3mkTz8Xb.\u000f?\u0004\u00015=\u000fE";
        objectArray[47] = "m;\u000f1\u00052+6\u000b0;5>%\u000b:W\u0007nePm;o8$\u0017a\u0002jk+W]\u0007a.>\u0011a^6=>k";
        objectArray[48] = "7}r4$a6a(nAl[~|!1gd\"(i&\u0005dp0/}<a#?oA";
        objectArray[49] = "$Rh0\u001a\u007f$\u0016h!yus\u0012m,\u0015G%W0wI\u0010 \fi'Grf\u0001m&y";
        objectArray[50] = "B\u001dO*0l[\u0012\u0002#V5\"\u0018\r27=\u001b\u000b\t9.\\";
        objectArray[51] = "W$\u001bV\tK]b\u001fFf\u001bR>\tU8\u001cR$\r)\u0004\nP8\u0006EW\u0019\r7`";
        objectArray[52] = "_d\u000e\u000e\u0018=Y-\u000b\u0015x,eqB\u000e\b'Z-\u0016F\u001fEZ\u007f\u000e\u0000D|_,\u0001@x";
        objectArray[53] = "\u0010\r\u001dewdS\f\u0003qMu!\u000bT~=~\u001eW\u00006*\u001c\u0011\u0001\fsr,\u0010\u0013\u0018vM";
        Object[] objectArray2 = objectArray;
        objectArray[54] = "h\r%Wp\u0010(\u000e2\u000b\u0012\u0013<\u0011(\u000f~!hPvY\u0012\u001f)W\"\u000bj\u0011l\u0015\"h";
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = e5.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    @Override
    public void d(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x56EA4F8BC436L;
        this.i = 0;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        e5.b("\u00a4", (Object)this, (Object)objectArray2, (long)3246568472299767744L, (long)l);
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00cb' || c == 'n' || c == 'g' || c == '\u00fa') {
                field = e5.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00cb' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'n' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'g' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = e5.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00a4' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00ce' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    @bP
    public void a(bG bG2) {
        CallSite callSite;
        long l;
        long l2;
        long l3;
        long l4;
        long l5;
        long l6;
        long l7;
        block24: {
            Object object;
            block23: {
                block21: {
                    block22: {
                        block19: {
                            long l8;
                            block20: {
                                block18: {
                                    class_310 class_3102;
                                    block17: {
                                        long l9 = l7 = k ^ 0x6829E0748399L;
                                        l6 = l9 ^ 0x181770E01129L;
                                        l5 = l9 ^ 0x6F656CE56498L;
                                        l4 = l9 ^ 0x52BADF3E9CF2L;
                                        l3 = l9 ^ 0x5A719B42AFB5L;
                                        l2 = l9 ^ 0x62BA362261A7L;
                                        l8 = l9 ^ 0x72FF9E916189L;
                                        l = l9 ^ 0xA968B2C2121L;
                                        callSite = e5.b("\u00ce", (long)5083980576566024085L, (long)l7);
                                        try {
                                            try {
                                                class_3102 = b;
                                                if (callSite != null) break block17;
                                                if (e5.b("\u00cb", (Object)class_3102, (long)5084372653063858651L, (long)l7) != null) break block18;
                                            }
                                            catch (MatchException matchException) {
                                                throw e5.b("\u00ce", (Object)matchException, (long)5083449277810524924L, (long)l7);
                                            }
                                            class_3102 = b;
                                        }
                                        catch (MatchException matchException) {
                                            throw e5.b("\u00ce", (Object)matchException, (long)5083449277810524924L, (long)l7);
                                        }
                                    }
                                    try {
                                        object = e5.b("\u00a4", (Object)class_3102, (long)5082528344779301932L, (long)l7);
                                        if (callSite != null) break block19;
                                        if (object != false) break block20;
                                    }
                                    catch (MatchException matchException) {
                                        throw e5.b("\u00ce", (Object)matchException, (long)5083449277810524924L, (long)l7);
                                    }
                                }
                                return;
                            }
                            Object[] objectArray = new Object[2];
                            objectArray[1] = l8;
                            objectArray[0] = Float.valueOf((float)e5.b("\u00a4", (Object)((Float)((Object)e5.b("\u00a4", (Object)this.a, (long)5082816760589466097L, (long)l7))), (long)5082737609764322188L, (long)l7));
                            object = e5.b("\u00a4", (Object)this.c, (Object)objectArray, (long)5083519878255939572L, (long)l7);
                        }
                        try {
                            if (callSite != null) break block21;
                            if (object != false) break block22;
                        }
                        catch (MatchException matchException) {
                            throw e5.b("\u00ce", (Object)matchException, (long)5083449277810524924L, (long)l7);
                        }
                        return;
                    }
                    object = this.i;
                }
                try {
                    try {
                        if (callSite != null) break block23;
                        if (object == false) break block24;
                    }
                    catch (MatchException matchException) {
                        throw e5.b("\u00ce", (Object)matchException, (long)5083449277810524924L, (long)l7);
                    }
                    object = this.d;
                }
                catch (MatchException matchException) {
                    throw e5.b("\u00ce", (Object)matchException, (long)5083449277810524924L, (long)l7);
                }
            }
            Object[] objectArray = new Object[2];
            objectArray[1] = l4;
            objectArray[0] = (int)object;
            e5.b("\u00ce", (Object)objectArray, (long)5084508264680994608L, (long)l7);
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l6;
            e5.b("\u00a4", (Object)this, (Object)objectArray2, (long)5084465958895373871L, (long)l7);
            return;
        }
        if (e5.b("\u00a4", (Object)e5.b("\u00a4", (Object)e5.b("\u00cb", (Object)b, (long)5083867706313745165L, (long)l7), (long)5084241958310240768L, (long)l7), (long)5083607680081415941L, (long)l7) != e5.b("g", (long)5084140886788124014L, (long)l7)) {
            CallSite callSite2;
            block25: {
                CallSite callSite3;
                block26: {
                    Object[] objectArray = new Object[1];
                    objectArray[0] = l5;
                    callSite3 = e5.b("\u00a4", (Object)this, (Object)objectArray, (long)5082415181326455815L, (long)l7);
                    try {
                        try {
                            callSite2 = callSite3;
                            if (callSite != null) break block25;
                            if (callSite2 != -1) break block26;
                        }
                        catch (MatchException matchException) {
                            throw e5.b("\u00ce", (Object)matchException, (long)5083449277810524924L, (long)l7);
                        }
                        Object[] objectArray3 = new Object[1];
                        objectArray3[0] = l6;
                        e5.b("\u00a4", (Object)this, (Object)objectArray3, (long)5084465958895373871L, (long)l7);
                        return;
                    }
                    catch (MatchException matchException) {
                        throw e5.b("\u00ce", (Object)matchException, (long)5083449277810524924L, (long)l7);
                    }
                }
                Object[] objectArray = new Object[1];
                objectArray[0] = l;
                this.d = (int)e5.b("\u00ce", (Object)objectArray, (long)5082676509346332595L, (long)l7);
                callSite2 = callSite3;
            }
            Object[] objectArray = new Object[2];
            objectArray[1] = l4;
            objectArray[0] = (int)callSite2;
            e5.b("\u00ce", (Object)objectArray, (long)5084508264680994608L, (long)l7);
            Object[] objectArray4 = new Object[1];
            objectArray4[0] = l3;
            e5.b("\u00a4", (Object)this, (Object)objectArray4, (long)5083768245452827715L, (long)l7);
            return;
        }
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = e5.b("g", (long)5084008387614610887L, (long)l7);
        e5.b("\u00ce", (Object)objectArray, (long)5083663741237208808L, (long)l7);
        this.i = 1;
        Object[] objectArray5 = new Object[1];
        objectArray5[0] = l3;
        e5.b("\u00a4", (Object)this, (Object)objectArray5, (long)5083768245452827715L, (long)l7);
    }

    private int a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = k ^ l;
        CallSite callSite = e5.b("\u00ce", (long)-1798736626152917487L, (long)l);
        for (int i = 0; i <= (int)e5.l; ++i) {
            try {
                if (e5.b("\u00a4", (Object)e5.b("\u00a4", (Object)e5.b("\u00a4", (Object)e5.b("\u00cb", (Object)b, (long)-1798641275332296055L, (long)l), (long)-1797667786090369857L, (long)l), (int)i, (long)-1798374665938070641L, (long)l), (long)-1798926692271722879L, (long)l) != e5.b("g", (long)-1798615448249168662L, (long)l)) continue;
                return i;
            }
            catch (MatchException matchException) {
                throw e5.b("\u00ce", (Object)matchException, (long)-1799049670727343240L, (long)l);
            }
        }
        return -1;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (e5.n[n3] != null) {
            return n3;
        }
        Object object = m[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 37;
            case 1 -> 7;
            case 2 -> 33;
            case 3 -> 14;
            case 4 -> 17;
            case 5 -> 34;
            case 6 -> 19;
            case 7 -> 58;
            case 8 -> 22;
            case 9 -> 0;
            case 10 -> 48;
            case 11 -> 53;
            case 12 -> 30;
            case 13 -> 28;
            case 14 -> 41;
            case 15 -> 4;
            case 16 -> 60;
            case 17 -> 11;
            case 18 -> 56;
            case 19 -> 57;
            case 20 -> 23;
            case 21 -> 45;
            case 22 -> 15;
            case 23 -> 9;
            case 24 -> 38;
            case 25 -> 49;
            case 26 -> 20;
            case 27 -> 51;
            case 28 -> 31;
            case 29 -> 36;
            case 30 -> 24;
            case 31 -> 62;
            case 32 -> 3;
            case 33 -> 2;
            case 34 -> 42;
            case 35 -> 10;
            case 36 -> 61;
            case 37 -> 5;
            case 38 -> 40;
            case 39 -> 50;
            case 40 -> 39;
            case 41 -> 27;
            case 42 -> 25;
            case 43 -> 59;
            case 44 -> 26;
            case 45 -> 43;
            case 46 -> 32;
            case 47 -> 1;
            case 48 -> 52;
            case 49 -> 21;
            case 50 -> 55;
            case 51 -> 18;
            case 52 -> 29;
            case 53 -> 47;
            case 54 -> 35;
            case 55 -> 16;
            case 56 -> 6;
            case 57 -> 54;
            case 58 -> 46;
            case 59 -> 8;
            case 60 -> 12;
            case 61 -> 63;
            case 62 -> 13;
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
        e5.n[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = e5.m(l, l2);
        Object object = m[n];
        if (object instanceof String) {
            String string = e5.n[n];
            int n2 = string.indexOf(8);
            Class clazz = e5.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = e5.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = e5.g(clazz3, string2, clazz2)) != null) {
                    e5.m[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = e5.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        e5.m[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = e5.n(1850061459769261L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = e5.m(l, l2);
        Object object = m[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = e5.n[n];
                int n3 = string2.indexOf(8);
                clazz3 = e5.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = e5.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = e5.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        e5.m[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = e5.n(1850061459769261L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = e5.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        e5.m[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = e5.n(1850061459769261L, 0L);
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
        long l2 = l = k ^ l;
        long l3 = l2 ^ 0x674B56EE33B1L;
        long l4 = l2 ^ 0x1B2C3EA62CDL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l4;
        e5.b("\u00a4", (Object)this.a, (Object)objectArray2, (long)3181330463126878612L, (long)l);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l3;
        e5.b("\u00a4", (Object)this.c, (Object)objectArray3, (long)3179924765552660587L, (long)l);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(e5.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


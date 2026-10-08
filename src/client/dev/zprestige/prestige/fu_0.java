/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1309
 *  net.minecraft.class_1657
 *  net.minecraft.class_1819
 *  net.minecraft.class_243
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.bG;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.by_0;
import dev.zprestige.prestige.bz_0;
import dev.zprestige.prestige.dM;
import dev.zprestige.prestige.dN;
import dev.zprestige.prestige.dO;
import dev.zprestige.prestige.dR;
import dev.zprestige.prestige.dV;
import dev.zprestige.prestige.hc;
import java.awt.Color;
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
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1819;
import net.minecraft.class_243;

/*
 * Renamed from dev.zprestige.prestige.fu
 */
public class fu_0
extends dV {
    private dM d;
    private dM a;
    private dR c;
    private dO e;
    private dO f;
    private dO g;
    private dO h;
    private dO i;
    private dO j;
    private dN k;
    private dN l;
    private static final Map m;
    private static final Map n;
    private static final long o;
    private static final long p;
    private static final Object[] q;
    private static final String[] r;

    /*
     * Enabled aggressive block sorting
     */
    static {
        o = hc.a(5996474281715721559L, -8206465569239404589L, MethodHandles.lookup().lookupClass()).a(86919654242612L);
        q = new Object[55];
        r = new String[55];
        fu_0.f();
        long l = o ^ 0x4D3C2B91205L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = 4545961039359382448L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                p = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                m = new HashMap();
                fu_0.n = new HashMap();
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
            throw new RuntimeException("dev/zprestige/prestige/fu" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = fu_0.m(l, l2);
            object = q[n];
            try {
                if (!(object instanceof String)) break block2;
                fu_0.q[n] = clazz = Class.forName(r[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = fu_0.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = fu_0.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = fu_0.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = fu_0.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = q;
        q[0] = "N\u0013\u000b`BNX\u0013\u000e:QYOX\r<]M^\u001f\u001a+\u0016Z|";
        objectArray[1] = Boolean.TYPE;
        fu_0.r[1] = "java/lang/Boolean";
        objectArray[2] = "<79'r%78(h\u001e&9:*'2";
        objectArray[3] = "h\nf\b>!~\ncR-6iA`T!\"x\u0006wCj5G";
        objectArray[4] = "\nTh0\u0013y\u0001[y\u007frw\nP}%";
        objectArray[5] = "*?Op\u0001p!0^?|h27Wv";
        objectArray[6] = "bp\u0003guqi\u007f\u0012(\u001dqgp\u0001";
        objectArray[7] = Float.TYPE;
        fu_0.r[7] = "java/lang/Float";
        objectArray[8] = "gyl\u001du9qyiGf.f2jAj:wu}V!/v";
        objectArray[9] = "}J\u0012n\u001ewvE\u0003!}zcH\fJHxr[\u0010f_u";
        objectArray[10] = "\u001fKp%\u0018\u0007\u0001Cjj\u007f\u0006\u0010Xg0Y\u0000";
        objectArray[11] = "_\u0000j@K_A\bp\u000f(KE";
        objectArray[12] = "\u0003\u001c\u0018/-I\u0015\u001c\u001du>^\u0002W\u001es2J\u0013\u0010\tdyX/";
        objectArray[13] = "V|v_42#\\}P%}^DnW,46";
        objectArray[14] = "\u0005\u001eVU\tp\u0005\u001eA\t\u0005\u007f\u001fUA\u0017\u0005j\u0018$\u0014H\\";
        objectArray[15] = "\u0007M'\b+G\u0019E=GI[\u001eX";
        objectArray[16] = "!0\u001et\b%!0\t(\u0004*;{\t6\u0004?<\nYkU";
        objectArray[17] = "i/,Qg\u001bi/;\rk\u0014sd;\u0013k\u0001t\u0015iI?E";
        objectArray[18] = "pK;x\u0007|nC!7zln";
        objectArray[19] = "$.\u0002\ba;:&\u0018G); ,\u0000\u0000  `\r\u001d/: -;\u001d\u0006!";
        objectArray[20] = Void.TYPE;
        fu_0.r[20] = "java/lang/Void";
        objectArray[21] = "pQa'WgpQv{[hj\u001ave[}mk$;\f6";
        objectArray[22] = "\u000b\u0019\u0018s\\1\u0000\u0016\t<;3\u0015\u001d\tw\u0000";
        objectArray[23] = Integer.TYPE;
        fu_0.r[23] = "java/lang/Integer";
        objectArray[24] = ",/*0\b<,/=l\u000436d=r\u0004&1\u0015o)\\l";
        objectArray[25] = "[\u0001\u0011--\b[\u0001\u0006q!\u0007AJ\u0006o!\u0012F;T4yS";
        objectArray[26] = "[-\u0014'>yE%\u000ehEYx\b";
        objectArray[27] = "\u0019eqCNb\u0007mk\f\u0006b\u001dgsK\u000fy]TuG\u0004~\u0010esG";
        objectArray[28] = "\f]\u0007kny\u0012U\u001d$\rm\u0016\u00184d4~\u001f";
        objectArray[29] = "ipo\";s:iswDuT<p5?-efz%+\u001cjem4u-0o} D";
        objectArray[30] = "S\u0003o9\u007f\u0005\f\u0016#8\u0019\ncC~9x\u0018_\u0002$;s`";
        objectArray[31] = "\u0012Th\nG\u001dL\u001b%\u001ex\u0005NVu\u0004\u00147\u001a\u001a)^F`JZ\u007f\u0007\u0007\u001b\u001eU\u007f\u001ex";
        objectArray[32] = "\t\n2kf\u0006\u0004P2t\u001eX\u0002Z'fI\u000f]\u0007|\n/H\u001e^|wq\u0007SJ";
        objectArray[33] = "o{Zsg\u001a`{\u0017\u007fV\u000fi7\u0006r:=:r_(VS;/^$)\u0007x+\u0000\u0015";
        objectArray[34] = "]oe\u0000sxA=je \t\u0002ih]xvV*l\u0003I";
        objectArray[35] = "0JR;W*?J\u001f7f?6\u0006\u000e:\n\reBSmf7*\u0000_-\u000b&!\u001c\u0003]";
        objectArray[36] = "\u000f\u00069_n\u0012\u001d\u0017s\u000e\r\u0012\b\u001ftYJ\u0002a\u0014c\nc\u0016\u000f\u0014`Hll\u000f\u00069_n\u0012\u001d\u0017s\u000e\r";
        objectArray[37] = "L>bVFY\u0003:aC,\u001a\u0001zY\u0003Q\u001fCa!\\K[\u0017\u0006cDQ]\u001b~<^\u0015\t|<$D\u0013\u0005\u0004c>\u0000Gb";
        objectArray[38] = "~Y\r\t\u0002/d[QAx2s\u001bR\u0017\u0014\u0000!V\nAx7z\u001c\u0002L\u001b%\"\u0015\u000ep";
        objectArray[39] = "Xc:\u001fE\\\t:dM?L\u000e(\u001bBOPgjbK\u0007\u001d\u0018>!OY,";
        objectArray[40] = "\r<b^#=\u0002</R\u0012(\u000bp>_~\u001a[=o\b\u0012 \u0017voH\u007f1\u001cj38rsYu$@hq\u0005=^";
        objectArray[41] = "dP@_Y^#LR@bG8i\\H\u0003]02\u001bP\u0002VdW\\L\u0010I_";
        objectArray[42] = "\u0006cW?2%Qt\\7M8\u0000vPy \u0003\u0003\u0013Vw/|PvJ`#>m*\bcus\u0012~Kg+B";
        objectArray[43] = "io\\n\u0000586\u0002<z#;/G^@8+`\\&\u001f\"o4;";
        objectArray[44] = "J*ab!1\u0005.bwKp\u0017w=s&\n@o'2,r\u001fucfK0\u0007oej3o\u001d+1\r";
        objectArray[45] = "a.Z\u0002IC.*Y\u0017#\u00157j\u001b\u001cx\u0015-\u0016\n\u001dC@.q]\nHHQ";
        objectArray[46] = "\u001f?j\u0001\"\u001aP;i\u0014H[B\u007f5\u0007#Lfc5n$ZTn(\f&\u0019B|Q\u0003%GL\u007f1\b)\u0011\u0011\u0007";
        objectArray[47] = "[\b]b'\u0012I\u0019\u00173D\rS\t3` \u0011Xu\u0002cz\u0002O\u001b\u0002`8\r5";
        objectArray[48] = "\u001fT\u007f\u00029dDS&C\u0001{\u0010PG\u0016ei\u0010,#\u0002|+\u001aT|\u00188\u007f}";
        objectArray[49] = "{$\u0017*\u0007>t$Z&6+}hK+Z\u0019-*\u0015s6/|nBpY4\u007fiTL";
        objectArray[50] = "9\u007fbaQ\u000e8=fe \u0014ggcuI\u0018^iceM~9?c \u0011\u0001m|g~ ";
        objectArray[51] = "g\u0007W3>L3XGpCU]\rCv|[%RY2(<";
        objectArray[52] = "0i\u007f8ijdf\u007f!\u0016p%to5jv#\u0019*lq!#i{5/sY";
        objectArray[53] = "VhZE2s\u00178\u001a\u001bUc\u000eaHW\u000bd\u000e{L+hdT;^S'qU{!";
        Object[] objectArray2 = objectArray;
        objectArray[54] = "|.zN3&3*y[Yr!j\u0006[\u0015p\"\u007f<E%\u001dvk<\u001e>e)qxJY'1k~F!x+/*!c`1)&Y<zu}A";
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = fu_0.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'R' || c == '\u00f4' || c == '\u00fc' || c == '\u00a2') {
                field = fu_0.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'R' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00f4' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00fc' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = fu_0.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'N' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00da' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @bP
    public void a(by_0 by_02) {
        class_1309 class_13092;
        CallSite callSite;
        long l;
        block7: {
            l = o ^ 0x4E699355FD9CL;
            class_1309 class_13093 = by_02.a;
            callSite = fu_0.b("\u00da", (long)-4442000746130266629L, (long)l);
            try {
                try {
                    class_13092 = class_13093;
                    if (callSite != null) break block7;
                    if (!(class_13092 instanceof class_1657)) return;
                }
                catch (MatchException matchException) {
                    throw fu_0.b("\u00da", (Object)matchException, (long)-4442227491504608957L, (long)l);
                }
                class_13092 = class_13093;
            }
            catch (MatchException matchException) {
                throw fu_0.b("\u00da", (Object)matchException, (long)-4442227491504608957L, (long)l);
            }
        }
        class_1657 class_16572 = (class_1657)class_13092;
        try {
            if (callSite != null) {
                return;
            }
        }
        catch (MatchException matchException) {
            throw fu_0.b("\u00da", (Object)matchException, (long)-4442227491504608957L, (long)l);
        }
        fu_0.b("N", (Object)n, (Object)fu_0.b("N", (Object)class_16572, (long)-4444754744442377854L, (long)l), (Object)fu_0.b("\u00da", (int)((int)p), (long)-4443788533152366407L, (long)l), (long)-4443875134707895558L, (long)l);
    }

    @bP
    public void a(bz_0 bz_02) {
        long l = o ^ 0x35C7340F851FL;
        bz_02.b = fu_0.b("N", (Object)this, (long)-4983651619707497405L, (long)l);
        bz_02.a = fu_0.b("N", (Object)((Boolean)((Object)fu_0.b("N", (Object)this.d, (long)-4984708241892194288L, (long)l))), (long)-4984776405896700605L, (long)l);
        bz_02.d = new class_243((double)fu_0.b("N", (Object)((Float)((Object)fu_0.b("N", (Object)this.e, (long)-4984708241892194288L, (long)l))), (long)-4984562551722702852L, (long)l), (double)fu_0.b("N", (Object)((Float)((Object)fu_0.b("N", (Object)this.f, (long)-4984708241892194288L, (long)l))), (long)-4984562551722702852L, (long)l), (double)fu_0.b("N", (Object)((Float)((Object)fu_0.b("N", (Object)this.g, (long)-4984708241892194288L, (long)l))), (long)-4984562551722702852L, (long)l));
        bz_02.e = new class_243((double)fu_0.b("N", (Object)((Float)((Object)fu_0.b("N", (Object)this.h, (long)-4984708241892194288L, (long)l))), (long)-4984562551722702852L, (long)l), (double)fu_0.b("N", (Object)((Float)((Object)fu_0.b("N", (Object)this.i, (long)-4984708241892194288L, (long)l))), (long)-4984562551722702852L, (long)l), (double)fu_0.b("N", (Object)((Float)((Object)fu_0.b("N", (Object)this.j, (long)-4984708241892194288L, (long)l))), (long)-4984562551722702852L, (long)l));
        bz_02.c = fu_0.b("N", (Object)((Boolean)((Object)fu_0.b("N", (Object)this.a, (long)-4984708241892194288L, (long)l))), (long)-4984776405896700605L, (long)l);
        bz_02.f = fu_0.b("N", (String)((Object)fu_0.b("N", (Object)this.c, (long)-4984708241892194288L, (long)l)), (long)-4984245912016374907L, (long)l);
        bz_02.g = (Color)((Object)fu_0.b("N", (Object)this.k, (long)-4984708241892194288L, (long)l));
        bz_02.h = (Color)((Object)fu_0.b("N", (Object)this.l, (long)-4984708241892194288L, (long)l));
    }

    public static boolean a(Object[] objectArray) {
        Object object;
        block2: {
            block3: {
                class_1657 class_16572 = (class_1657)objectArray[0];
                long l = (Long)objectArray[1];
                l = o ^ l;
                CallSite callSite = fu_0.b("\u00da", (long)-3583193113939498524L, (long)l);
                try {
                    object = fu_0.b("N", (Object)((Integer)((Object)fu_0.b("N", (Object)n, (Object)fu_0.b("N", (Object)class_16572, (long)-3580880569377512035L, (long)l), (Object)fu_0.b("\u00da", (int)0, (long)-3581669176485360474L, (long)l), (long)-3580428428976866069L, (long)l))), (long)-3582144627427193887L, (long)l);
                    if (callSite != null) break block2;
                    if (object == false) break block3;
                }
                catch (MatchException matchException) {
                    throw fu_0.b("\u00da", (Object)matchException, (long)-3583406654151678628L, (long)l);
                }
                object = 1;
                break block2;
            }
            object = 0;
        }
        return (boolean)object;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    @bP
    public void a(bG bG2) {
        long l;
        block14: {
            CallSite callSite;
            l = o ^ 0x2E9FA2E0C03AL;
            CallSite callSite2 = fu_0.b("N", (Object)fu_0.b("N", (Object)fu_0.b("R", (Object)b, (long)-3630712554769864L, (long)l), (long)-852215572876043L, (long)l), (long)-2778673017786650L, (long)l);
            CallSite callSite3 = fu_0.b("\u00da", (long)-924495546705827L, (long)l);
            while (fu_0.b("N", (Object)callSite2, (long)-3704906216400051L, (long)l) != false) {
                block13: {
                    class_1657 class_16572 = (class_1657)fu_0.b("N", (Object)callSite2, (long)-3951615568187520L, (long)l);
                    CallSite callSite4 = fu_0.b("N", (Object)class_16572, (long)-2410207763065820L, (long)l);
                    try {
                        Object object;
                        block15: {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                object = class_16572;
                                                if (callSite3 != null) break block13;
                                                callSite = fu_0.b("N", (Object)object, (long)-3536805424512000L, (long)l);
                                                if (callSite3 != null) break block14;
                                            }
                                            catch (MatchException matchException) {
                                                throw fu_0.b("\u00da", (Object)matchException, (long)-1010073953266459L, (long)l);
                                            }
                                            if (callSite == false) break block15;
                                        }
                                        catch (MatchException matchException) {
                                            throw fu_0.b("\u00da", (Object)matchException, (long)-1010073953266459L, (long)l);
                                        }
                                        object = fu_0.b("N", (Object)fu_0.b("N", (Object)class_16572, (Object)fu_0.b("N", (Object)class_16572, (long)-3420519168853097L, (long)l), (long)-4190140647214402L, (long)l), (long)-3778338069040269L, (long)l);
                                        if (callSite3 != null) break block13;
                                    }
                                    catch (MatchException matchException) {
                                        throw fu_0.b("\u00da", (Object)matchException, (long)-1010073953266459L, (long)l);
                                    }
                                    if (!(object instanceof class_1819)) break block15;
                                }
                                catch (MatchException matchException) {
                                    throw fu_0.b("\u00da", (Object)matchException, (long)-1010073953266459L, (long)l);
                                }
                                fu_0.b("N", (Object)m, (Object)callSite4, (Object)fu_0.b("\u00da", (int)(fu_0.b("N", (Object)((Integer)((Object)fu_0.b("N", (Object)m, (Object)callSite4, (Object)fu_0.b("\u00da", (int)0, (long)-3908585028649697L, (long)l), (long)-2668902437188270L, (long)l))), (long)-4242442707142056L, (long)l) + 1), (long)-3908585028649697L, (long)l), (long)-3852782692053156L, (long)l);
                                if (callSite3 == null) break block13;
                            }
                            catch (MatchException matchException) {
                                throw fu_0.b("\u00da", (Object)matchException, (long)-1010073953266459L, (long)l);
                            }
                        }
                        object = fu_0.b("N", (Object)m, (Object)callSite4, (long)-4448090706651672L, (long)l);
                    }
                    catch (MatchException matchException) {
                        throw fu_0.b("\u00da", (Object)matchException, (long)-1010073953266459L, (long)l);
                    }
                }
                if (callSite3 == null) continue;
            }
            callSite = fu_0.b("N", (Object)fu_0.b("N", (Object)n, (long)-4404461267021221L, (long)l), fu_0::lambda$onTick$0, (long)-4026493579356371L, (long)l);
        }
        fu_0.b("N", (Object)n, fu_0::lambda$onTick$1, (long)-4335940490931778L, (long)l);
    }

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (r[n3] != null) {
            return n3;
        }
        Object object = q[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 60;
            case 1 -> 27;
            case 2 -> 5;
            case 3 -> 0;
            case 4 -> 14;
            case 5 -> 59;
            case 6 -> 16;
            case 7 -> 52;
            case 8 -> 17;
            case 9 -> 9;
            case 10 -> 43;
            case 11 -> 13;
            case 12 -> 4;
            case 13 -> 32;
            case 14 -> 57;
            case 15 -> 42;
            case 16 -> 58;
            case 17 -> 35;
            case 18 -> 48;
            case 19 -> 29;
            case 20 -> 23;
            case 21 -> 22;
            case 22 -> 15;
            case 23 -> 61;
            case 24 -> 3;
            case 25 -> 44;
            case 26 -> 33;
            case 27 -> 40;
            case 28 -> 21;
            case 29 -> 24;
            case 30 -> 10;
            case 31 -> 25;
            case 32 -> 41;
            case 33 -> 19;
            case 34 -> 28;
            case 35 -> 39;
            case 36 -> 53;
            case 37 -> 20;
            case 38 -> 55;
            case 39 -> 37;
            case 40 -> 12;
            case 41 -> 62;
            case 42 -> 47;
            case 43 -> 36;
            case 44 -> 45;
            case 45 -> 1;
            case 46 -> 8;
            case 47 -> 31;
            case 48 -> 2;
            case 49 -> 18;
            case 50 -> 26;
            case 51 -> 51;
            case 52 -> 11;
            case 53 -> 34;
            case 54 -> 50;
            case 55 -> 30;
            case 56 -> 49;
            case 57 -> 46;
            case 58 -> 38;
            case 59 -> 54;
            case 60 -> 56;
            case 61 -> 7;
            case 62 -> 6;
            default -> 63;
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
        fu_0.r[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = fu_0.m(l, l2);
        Object object = q[n];
        if (object instanceof String) {
            String string = r[n];
            int n2 = string.indexOf(8);
            Class clazz = fu_0.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = fu_0.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = fu_0.g(clazz3, string2, clazz2)) != null) {
                    fu_0.q[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = fu_0.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        fu_0.q[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = fu_0.n(290120867195952L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = fu_0.m(l, l2);
        Object object = q[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = r[n];
                int n3 = string2.indexOf(8);
                clazz3 = fu_0.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = fu_0.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = fu_0.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        fu_0.q[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = fu_0.n(290120867195952L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = fu_0.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        fu_0.q[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = fu_0.n(290120867195952L, 0L);
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

    private static boolean lambda$onTick$0(Map.Entry entry) {
        Object object;
        block4: {
            block5: {
                long l = o ^ 0x85EFC5631E9L;
                CallSite callSite = fu_0.b("\u00da", (long)1022196084407101838L, (long)l);
                try {
                    try {
                        object = fu_0.b("N", (Object)((Integer)((Object)fu_0.b("N", (Object)entry, (long)1018985501899215096L, (long)l))), (long)1018881433831410571L, (long)l);
                        if (callSite != null) break block4;
                        if (object > 1) break block5;
                    }
                    catch (MatchException matchException) {
                        throw fu_0.b("\u00da", (Object)matchException, (long)1022123148422112566L, (long)l);
                    }
                    object = 1;
                    break block4;
                }
                catch (MatchException matchException) {
                    throw fu_0.b("\u00da", (Object)matchException, (long)1022123148422112566L, (long)l);
                }
            }
            object = 0;
        }
        return (boolean)object;
    }

    private static Integer lambda$onTick$1(UUID uUID, Integer n) {
        reference v2;
        long l;
        block6: {
            Integer n2;
            block4: {
                block5: {
                    l = o ^ 0x3CD5A047822CL;
                    CallSite callSite = fu_0.b("\u00da", (long)-4761811793755448757L, (long)l);
                    try {
                        try {
                            n2 = n;
                            if (callSite != null) break block4;
                            if (fu_0.b("N", (Object)n2, (long)-4762838289900980146L, (long)l) <= 1) break block5;
                        }
                        catch (MatchException matchException) {
                            throw fu_0.b("\u00da", (Object)matchException, (long)-4761858287908497677L, (long)l);
                        }
                        v2 = fu_0.b("N", (Object)n, (long)-4762838289900980146L, (long)l) - 1;
                        break block6;
                    }
                    catch (MatchException matchException) {
                        throw fu_0.b("\u00da", (Object)matchException, (long)-4761858287908497677L, (long)l);
                    }
                }
                n2 = n;
            }
            v2 = fu_0.b("N", (Object)n2, (long)-4762838289900980146L, (long)l);
        }
        return fu_0.b("\u00da", (int)v2, (long)-4763665585233084663L, (long)l);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(fu_0.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


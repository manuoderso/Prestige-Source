/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1657
 *  net.minecraft.class_310
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.aK;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.bl_0;
import dev.zprestige.prestige.dO;
import dev.zprestige.prestige.dQ;
import dev.zprestige.prestige.dV;
import dev.zprestige.prestige.dn_0;
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
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1657;
import net.minecraft.class_310;

public class fN
extends dV {
    private dO a;
    private dQ c;
    private dQ d;
    private f5 e;
    private f5 f;
    private boolean i;
    private boolean g;
    private static final long k = hc.a(-4313977028848056780L, -7459042029394228205L, MethodHandles.lookup().lookupClass()).a(157737877220540L);
    private static final long l;
    private static final Object[] m;
    private static final String[] n;

    public fN() {
        long l = k ^ 0x43264F9610E2L;
        long l2 = l ^ 0x350774CAD78L;
        this.e = new f5(l2);
        this.f = new f5(l2);
        this.i = 0;
        this.g = 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        m = new Object[49];
        n = new String[49];
        fN.f();
        long l = k ^ 0x3962DE118654L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = 1733890115033905664L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                fN.l = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    public boolean e(Object[] objectArray) {
        return this.g;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/fN" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = fN.m(l, l2);
            object = m[n];
            try {
                if (!(object instanceof String)) break block2;
                fN.m[n] = clazz = Class.forName(fN.n[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = fN.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = fN.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = fN.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = fN.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = m;
        m[0] = "X\u0004UQ\u0016YF\fO\u001ekIF";
        objectArray[1] = "Z\nhM\u0002EQ\u0005y\u0002cKZ\u000e}X";
        objectArray[2] = "\u0018#nB7N\u000e#k\u0018$Y\u0019hh\u001e(M\b/\u007f\tc_4";
        objectArray[3] = "~K][S\u0017\u000bkVTBXvsESK\u0011\u001e";
        objectArray[4] = "kL5c3\"}L09 5j\u00073?,!{@$(g3D";
        objectArray[5] = "d\ts}(\f\u0011)xr9Cp'sy=\u0019\u0004";
        objectArray[6] = "\u000e\u001a;f.,\u000e\u001a,:\"#\u0014Q,$\"6\u0013 ~zzr";
        objectArray[7] = "*0O4Pv*0Xh\\y0{Xv\\l7\n\f.\u000b";
        objectArray[8] = Boolean.TYPE;
        fN.n[8] = "java/lang/Boolean";
        objectArray[9] = ",P\u0010\u0018tN,P\u0007DxA6\u001b\u0007ZxT1jW\u0007)";
        objectArray[10] = "\u007f\u0018I\u000eu5\u007f\u0018^Ry:eS^Ly/b\"\u000e\u0010,";
        objectArray[11] = "h&GECRh&P\u0019O]rmP\u0007OHu\u001c\u0000Z\u001b";
        objectArray[12] = "\u000b\u0014B2gI\u001d\u0014Ght^\n_DnxJ\u001b\u0018Sy3]>";
        objectArray[13] = "F\u0014|78234w8)}R:|3-'&";
        objectArray[14] = Void.TYPE;
        fN.n[14] = "java/lang/Void";
        objectArray[15] = ")_3f)B7W))UV-Z*j";
        objectArray[16] = Float.TYPE;
        fN.n[16] = "java/lang/Float";
        objectArray[17] = "uT!YAGcT$\u0003RPt\u001f'\u0005^DeX0\u0012\u0015SZ";
        objectArray[18] = "&\u00187y{\\-\u0017&6\u0013\\#\u00185";
        objectArray[19] = "\t\r \u0011&\\\u001f\r%K5K\bF&M9_\u0019\u00011ZrJX";
        objectArray[20] = "BCIO[u7cB@J:VmIKN`\"";
        objectArray[21] = "eC\t\u0016\r\u000bsC\fL\u001e\u001cd\b\u000fJ\u0012\buO\u0018]Y\u001dO";
        objectArray[22] = "c$\t=l5h+\u0018r\u000f8}&\u0017\u0019::l5\u000b5-7";
        objectArray[23] = " B\u0004O%\u001f B\u0013\u0013)\u0010:\t\u0013\r)\u0005=xAQ|G";
        objectArray[24] = "u ;ir\u0016p50iy\r|%r\u0000R'M";
        objectArray[25] = Long.TYPE;
        fN.n[25] = "java/lang/Long";
        objectArray[26] = Integer.TYPE;
        fN.n[26] = "java/lang/Integer";
        objectArray[27] = "yO\bgi,\fo\u0003hxcma\bc|9\u0019";
        objectArray[28] = "\u007f\u0007%&}/\u007f\u00072zq eL2dq5b=e;'";
        objectArray[29] = "c4`_Zv15e\u000edo03bS\b]gu<\u0004_\n3=iY\u0019w1vxUd";
        objectArray[30] = "\b\u00131U\u0018@Q\u0002 \u0014fR1E*\t\u001d\bU\u001cy\u0002^8";
        objectArray[31] = "k7\u0017\u0011+\b7aP\u0014R\u0019oe\u00110?\nHf\u001f\u007f2\u0006;7\u0005\u0005n\u001cu7n\u001en\tfk\u0010\u00122\u0014k\u000b\u000fC-\u001bku\u0003\u001f0\u0016\u000b";
        objectArray[32] = "/hM`e|.lVa\u0006)\u0015vGo|+tnH d@))J=i%xw\u0005$\u0006";
        objectArray[33] = "?Y\u0002\u0014\u0010tb\\\u000f\u0010pqn[\u0006L\u001cC>\u0019\\\u0017p*:C[H\u001cdoZ\f+";
        objectArray[34] = ")\u000f\u001ek\n\u000e{\u000e\u001b:4\u001cv\u0019\u0018lcK(N@\u0000\b\fsK\u001c`U\t~O";
        objectArray[35] = "\u001f\"326/\u001di\">K7\u001c,88'\u0005MligK2\u0001`d41n\u001b.d_";
        objectArray[36] = "MK\u0010\u00133I\\TM\u001cMG!N\u0004S7E@V\u000b\u001c/.\u001f\u0016\u0012_.BQC\u000b\bM";
        objectArray[37] = "jvwr-`3!v&A|87m$-Nlw6\u007fA'l/0 -i96gC";
        objectArray[38] = ".5>J<T/u\u007f\u0010_Wp!aM\b\u0000!}9!`\u0004k}iX9Sj)";
        objectArray[39] = "t\\v\u0005,{/\u0006$\u0005@|DY;I:}%A4\u0006\"\u0016uJ.D+,*@6\u0005@";
        objectArray[40] = "0C%dh8bB 5V*oU#c\u0001}1\u0005z\u000f4>aCx41&`_";
        objectArray[41] = "T\u0004\u0012 9\u0010B\u0014\tf\u0003OP\b\u000eTgNT\u0004rpz\u0014\u0004\u0000\ne?L[x";
        objectArray[42] = "9\r$\u0001\u001c\u00108F4\u001by\u0000S\r$\u0006\u001f\u0007.\u00038\u0004y";
        objectArray[43] = "u* ,<\u001f)7f\u0016=\u000b\u001465l<\u000bi8)nZ\u0015x<?x'\u001bd>Yw6\u001c. #++Z\u0014";
        objectArray[44] = "J\"F@0\u0013X9\u0004VU\u0017E?TM\u000b\u0010E%P1?\u0000\u001caEI*ED>=";
        objectArray[45] = "\u00151W\u00022VG0RS\fDJ'Q\u0005[\u0013\u0015{\ri3S\u0010!V\u00042\u0013Q{";
        objectArray[46] = "btOHnqsk\u0012G\u0010\u007f\u000eq[\bj}oiTGr\u0016?bN\u0005{,`hVD\u0010";
        objectArray[47] = "V\u0004\u0011vI\u0014\u000fS\u0010\"%\b\u0004E\u000b I:S\u0002Ww\u001cmW\u0000\u000fzF\u0001\u0019U\u0016-%\\\u001b^W,\u001f\u0003\u0011F\u0016G";
        Object[] objectArray2 = objectArray;
        objectArray[48] = "N8\u001a^EX\u001f-E\u0019:\u000f#/T\bFXD*\u0016\t@fM>G\u0018\u0004\u0001H|F\u001e:";
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00fc' || c == '\u00ee' || c == 'c' || c == 'C') {
                field = fN.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00fc' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ee' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'c' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = fN.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'f' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00fd' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = fN.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public boolean d(Object[] objectArray) {
        return this.i;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    @bP
    public void a(bl_0 bl_02) {
        block27: {
            block29: {
                class_310 class_3102;
                long l;
                block28: {
                    Object object;
                    CallSite callSite;
                    block26: {
                        long l2;
                        block24: {
                            block25: {
                                long l3;
                                long l4;
                                block22: {
                                    block23: {
                                        long l5 = l = k ^ 0x26311A093462L;
                                        l4 = l5 ^ 0x24BDE94F6DF8L;
                                        l2 = l5 ^ 0x73E9B0085569L;
                                        l3 = l5 ^ 0x42447C4B3C84L;
                                        callSite = fN.b("\u00fd", (long)8242404495090726447L, (long)l);
                                        try {
                                            try {
                                                object = fN.b("\u00fd", (long)fN.b("f", (Object)fN.b("f", (Object)b, (long)8242174326087574099L, (long)l), (long)8245423095854549602L, (long)l), (int)((int)fN.l), (long)8242353420374061133L, (long)l);
                                                if (callSite != null) break block22;
                                                if (object == 1) break block23;
                                            }
                                            catch (MatchException matchException) {
                                                throw fN.b("\u00fd", (Object)matchException, (long)8244244027858800741L, (long)l);
                                            }
                                            this.g = 0;
                                            this.i = 0;
                                            return;
                                        }
                                        catch (MatchException matchException) {
                                            throw fN.b("\u00fd", (Object)matchException, (long)8244244027858800741L, (long)l);
                                        }
                                    }
                                    object = this.i;
                                }
                                try {
                                    try {
                                        try {
                                            try {
                                                if (callSite != null) break block24;
                                                if (object == false) break block25;
                                            }
                                            catch (MatchException matchException) {
                                                throw fN.b("\u00fd", (Object)matchException, (long)8244244027858800741L, (long)l);
                                            }
                                            Object[] objectArray = new Object[2];
                                            objectArray[1] = l2;
                                            objectArray[0] = Float.valueOf((float)fN.b("f", (Object)((Float)((Object)fN.b("f", (Object)this.d, (long)8246057677803676662L, (long)l))), (long)8245651598066681318L, (long)l));
                                            object = fN.b("f", (Object)this.e, (Object)objectArray, (long)8245100404578436267L, (long)l);
                                            if (callSite != null) break block24;
                                        }
                                        catch (MatchException matchException) {
                                            throw fN.b("\u00fd", (Object)matchException, (long)8244244027858800741L, (long)l);
                                        }
                                        if (object == false) break block25;
                                    }
                                    catch (MatchException matchException) {
                                        throw fN.b("\u00fd", (Object)matchException, (long)8244244027858800741L, (long)l);
                                    }
                                    fN.b("f", (Object)fN.b("\u00fc", (Object)fN.b("\u00fc", (Object)b, (long)8245537532170678343L, (long)l), (long)8245188463957113359L, (long)l), (boolean)false, (long)8245679165985757932L, (long)l);
                                    Object[] objectArray = new Object[1];
                                    objectArray[0] = l4;
                                    fN.b("f", (Object)this.f, (Object)objectArray, (long)8245753560415445837L, (long)l);
                                    Object[] objectArray2 = new Object[1];
                                    objectArray2[0] = l3;
                                    fN.b("f", (Object)this.c, (Object)objectArray2, (long)8245148096692290258L, (long)l);
                                    this.g = 1;
                                    this.i = 0;
                                }
                                catch (MatchException matchException) {
                                    throw fN.b("\u00fd", (Object)matchException, (long)8244244027858800741L, (long)l);
                                }
                            }
                            object = this.g;
                        }
                        try {
                            try {
                                if (callSite != null) break block26;
                                if (object == false) break block27;
                            }
                            catch (MatchException matchException) {
                                throw fN.b("\u00fd", (Object)matchException, (long)8244244027858800741L, (long)l);
                            }
                            Object[] objectArray = new Object[2];
                            objectArray[1] = l2;
                            objectArray[0] = Float.valueOf((float)fN.b("f", (Object)((Float)((Object)fN.b("f", (Object)this.c, (long)8246057677803676662L, (long)l))), (long)8245651598066681318L, (long)l));
                            object = fN.b("f", (Object)this.f, (Object)objectArray, (long)8245100404578436267L, (long)l);
                        }
                        catch (MatchException matchException) {
                            throw fN.b("\u00fd", (Object)matchException, (long)8244244027858800741L, (long)l);
                        }
                    }
                    try {
                        try {
                            try {
                                if (object == false) break block27;
                                class_3102 = b;
                                if (callSite != null) break block28;
                            }
                            catch (MatchException matchException) {
                                throw fN.b("\u00fd", (Object)matchException, (long)8244244027858800741L, (long)l);
                            }
                            if (fN.b("\u00fc", (Object)class_3102, (long)8245916587544038276L, (long)l) != null) break block29;
                        }
                        catch (MatchException matchException) {
                            throw fN.b("\u00fd", (Object)matchException, (long)8244244027858800741L, (long)l);
                        }
                        class_3102 = b;
                    }
                    catch (MatchException matchException) {
                        throw fN.b("\u00fd", (Object)matchException, (long)8244244027858800741L, (long)l);
                    }
                }
                fN.b("f", (Object)fN.b("\u00fc", (Object)fN.b("\u00fc", (Object)class_3102, (long)8245537532170678343L, (long)l), (long)8245188463957113359L, (long)l), (boolean)true, (long)8245679165985757932L, (long)l);
            }
            this.g = 0;
        }
    }

    @Override
    public Set a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return fN.b("\u00fd", (Object)((Object)q_0.Sword), (Object)((Object)q_0.UHC), (long)-2446887509186993516L, (long)l);
    }

    @bP
    public void a(aK aK2) {
        block30: {
            Object object;
            long l;
            long l2;
            long l3;
            block31: {
                CallSite callSite;
                block29: {
                    block27: {
                        block28: {
                            CallSite callSite2;
                            block25: {
                                CallSite callSite3;
                                block26: {
                                    block32: {
                                        block24: {
                                            boolean bl;
                                            block23: {
                                                long l4 = l3 = k ^ 0x108C8D2F695DL;
                                                l2 = l4 ^ 0x12007E6930C7L;
                                                l = l4 ^ 0x74F9EB6D61BBL;
                                                callSite = fN.b("\u00fd", (long)3413114484591520528L, (long)l3);
                                                try {
                                                    try {
                                                        bl = this.i;
                                                        if (callSite != null) break block23;
                                                        if (bl) break block24;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw fN.b("\u00fd", (Object)matchException, (long)3410991828358303066L, (long)l3);
                                                    }
                                                    bl = this.g;
                                                }
                                                catch (MatchException matchException) {
                                                    throw fN.b("\u00fd", (Object)matchException, (long)3410991828358303066L, (long)l3);
                                                }
                                            }
                                            if (!bl) break block32;
                                        }
                                        return;
                                    }
                                    callSite3 = fN.b("f", (Object)aK2, (Object)new Object[0], (long)3409895443863522265L, (long)l3);
                                    try {
                                        callSite2 = callSite3;
                                        if (callSite != null) break block25;
                                        if (callSite2 != null) break block26;
                                    }
                                    catch (MatchException matchException) {
                                        throw fN.b("\u00fd", (Object)matchException, (long)3410991828358303066L, (long)l3);
                                    }
                                    return;
                                }
                                callSite2 = callSite3;
                            }
                            try {
                                object = callSite2 instanceof class_1657;
                                if (callSite != null) break block27;
                                if (object != 0) break block28;
                            }
                            catch (MatchException matchException) {
                                throw fN.b("\u00fd", (Object)matchException, (long)3410991828358303066L, (long)l3);
                            }
                            return;
                        }
                        object = fN.b("f", (Object)fN.b("\u00fc", (Object)fN.b("\u00fc", (Object)b, (long)3409574628988382584L, (long)l3), (long)3410348088566064944L, (long)l3), (long)3410091841786708858L, (long)l3);
                    }
                    try {
                        try {
                            if (callSite != null) break block29;
                            if (object == 0) break block30;
                        }
                        catch (MatchException matchException) {
                            throw fN.b("\u00fd", (Object)matchException, (long)3410991828358303066L, (long)l3);
                        }
                        object = fN.b("f", (Object)fN.b("\u00fc", (Object)b, (long)3410027254166492778L, (long)l3), (long)3409835100974889879L, (long)l3);
                    }
                    catch (MatchException matchException) {
                        throw fN.b("\u00fd", (Object)matchException, (long)3410991828358303066L, (long)l3);
                    }
                }
                try {
                    try {
                        if (callSite != null) break block31;
                        if (object == 0) break block30;
                    }
                    catch (MatchException matchException) {
                        throw fN.b("\u00fd", (Object)matchException, (long)3410991828358303066L, (long)l3);
                    }
                    reference cfr_temp_0 = fN.b("f", (Object)dn_0.a, (long)3409248233729909354L, (long)l3) * 100.0f - fN.b("f", (Object)((Float)((Object)fN.b("f", (Object)this.a, (long)3409461833381756617L, (long)l3))), (long)3409584241246460121L, (long)l3);
                    object = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                }
                catch (MatchException matchException) {
                    throw fN.b("\u00fd", (Object)matchException, (long)3410991828358303066L, (long)l3);
                }
            }
            try {
                if (object <= 0) {
                    Object[] objectArray = new Object[1];
                    objectArray[0] = l;
                    fN.b("f", (Object)this.d, (Object)objectArray, (long)3410227946478329837L, (long)l3);
                    Object[] objectArray2 = new Object[1];
                    objectArray2[0] = l2;
                    fN.b("f", (Object)this.e, (Object)objectArray2, (long)3409782995079396978L, (long)l3);
                    this.i = 1;
                }
            }
            catch (MatchException matchException) {
                throw fN.b("\u00fd", (Object)matchException, (long)3410991828358303066L, (long)l3);
            }
        }
    }

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (fN.n[n3] != null) {
            return n3;
        }
        Object object = m[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 18;
            case 1 -> 16;
            case 2 -> 40;
            case 3 -> 5;
            case 4 -> 21;
            case 5 -> 53;
            case 6 -> 61;
            case 7 -> 28;
            case 8 -> 30;
            case 9 -> 59;
            case 10 -> 41;
            case 11 -> 51;
            case 12 -> 19;
            case 13 -> 1;
            case 14 -> 23;
            case 15 -> 22;
            case 16 -> 63;
            case 17 -> 7;
            case 18 -> 27;
            case 19 -> 37;
            case 20 -> 15;
            case 21 -> 4;
            case 22 -> 32;
            case 23 -> 55;
            case 24 -> 62;
            case 25 -> 52;
            case 26 -> 60;
            case 27 -> 49;
            case 28 -> 43;
            case 29 -> 14;
            case 30 -> 0;
            case 31 -> 35;
            case 32 -> 6;
            case 33 -> 3;
            case 34 -> 8;
            case 35 -> 17;
            case 36 -> 50;
            case 37 -> 26;
            case 38 -> 44;
            case 39 -> 54;
            case 40 -> 58;
            case 41 -> 13;
            case 42 -> 11;
            case 43 -> 24;
            case 44 -> 48;
            case 45 -> 9;
            case 46 -> 57;
            case 47 -> 10;
            case 48 -> 12;
            case 49 -> 56;
            case 50 -> 42;
            case 51 -> 46;
            case 52 -> 45;
            case 53 -> 25;
            case 54 -> 2;
            case 55 -> 29;
            case 56 -> 47;
            case 57 -> 38;
            case 58 -> 31;
            case 59 -> 33;
            case 60 -> 34;
            case 61 -> 39;
            case 62 -> 36;
            default -> 20;
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
        fN.n[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = fN.m(l, l2);
        Object object = m[n];
        if (object instanceof String) {
            String string = fN.n[n];
            int n2 = string.indexOf(8);
            Class clazz = fN.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = fN.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = fN.g(clazz3, string2, clazz2)) != null) {
                    fN.m[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = fN.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        fN.m[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = fN.n(94175551559725L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = fN.m(l, l2);
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
                String string2 = fN.n[n];
                int n3 = string2.indexOf(8);
                clazz3 = fN.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = fN.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = fN.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        fN.m[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = fN.n(94175551559725L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = fN.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        fN.m[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = fN.n(94175551559725L, 0L);
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
            return MethodHandles.lookup().findStatic(fN.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


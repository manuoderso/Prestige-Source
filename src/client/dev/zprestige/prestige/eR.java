/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1657
 *  net.minecraft.class_3966
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.aK;
import dev.zprestige.prestige.bD;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.bc_0;
import dev.zprestige.prestige.bu_0;
import dev.zprestige.prestige.dM;
import dev.zprestige.prestige.dV;
import dev.zprestige.prestige.hc;
import dev.zprestige.prestige.y_0;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.minecraft.class_1657;
import net.minecraft.class_3966;

public class eR
extends dV {
    private dM d;
    private dM a;
    private static final long k = hc.a(-4043796637148319039L, -6717732448416354002L, MethodHandles.lookup().lookupClass()).a(234046532387370L);
    private static final Object[] l = new Object[61];
    private static final String[] m = new String[61];

    static {
        eR.f();
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/eR" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = eR.m(l, l2);
            object = eR.l[n];
            try {
                if (!(object instanceof String)) break block2;
                eR.l[n] = clazz = Class.forName(m[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = eR.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = eR.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = eR.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = eR.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = l;
        l[0] = "x\u0005\\X\fVx\u0005K\u0004\u0000YbNK\u001a\u0000Le?\u001bOW\t";
        objectArray[1] = "$+\u000f\u001f(c$+\u0018C$l>`\u0018]$y9\u0011J\u0003|=";
        objectArray[2] = "Usg[g\u0007Csb\u0001t\u0010T8a\u0007x\u0004E\u007fv\u00103\u0016y";
        objectArray[3] = "\u0007>.=G&r\u001e%2Vi\u000f\u000665_ g";
        objectArray[4] = "%W\ri9R%W\u001a55]?\u001c\u001a+5H8mKrb\n";
        objectArray[5] = ",E\u000e\r\u0017%,E\u0019Q\u001b*6\u000e\u0019O\u001b?1\u007fI\u0012J";
        objectArray[6] = "2\u001c\\\u0014;Y2\u001cKH7V(WKV7C/&\u001a\to";
        objectArray[7] = "&4E/@^S\u0014N Q\u00112\u001aE+UKF";
        objectArray[8] = Void.TYPE;
        eR.m[8] = "java/lang/Void";
        objectArray[9] = "C\u000bqB&|U\u000bt\u00185kB@w\u001e9\u007fS\u0007`\troK\u0007b\u0002(\"w\u001cb\u001f(e@\u000b";
        objectArray[10] = "\u0001%ADV+\u0017%D\u001eE<\u0000nG\u0018I(\u0011)P\u000f\u0002=3";
        objectArray[11] = ".\u0011\u0003G8A%\u001e\u0012\bEY6\u0019\u001bA";
        objectArray[12] = "\u0007\u0004\"<\u007fg\u0007\u00045`sh\u001dO5~s}\u001a>d!+*\n\r7aaQ[Uf";
        objectArray[13] = "\u0018&wH\u0010\"m\u0006|G\u0001m\f\bwL\u00057x";
        objectArray[14] = Boolean.TYPE;
        eR.m[14] = "java/lang/Boolean";
        objectArray[15] = "\rA9?0c\u001bA<e#t\f\n?c/`\u001dM(tdv;";
        objectArray[16] = "\f>l\u0002\u001a\u000f\u00071}My\u0002\u0012<r&L\u0000\u0003/n\n[\r";
        objectArray[17] = "U\u0014@}1K^\u001bQ2]HP\u0019S}q";
        objectArray[18] = "psf\u0011\u000ePfscK\u001dGq8`M\u0011S`\u007fwZZD_";
        objectArray[19] = "%l{UO%.cj\u001a.+%hn@";
        objectArray[20] = "&\u00194F\n\u00100\u00191\u001c\u0019\u0007'R2\u001a\u0015\u00136\u0015%\r^\u0001\t";
        objectArray[21] = "V\u001bf\u001buY#;m\u0014d\u0016B5f\u001f`L6";
        objectArray[22] = "\u0017sE$'[\t{_kEG\u000ef";
        objectArray[23] = "o[;:^5qS!u94`H,/\u001f2";
        objectArray[24] = "\u001c\u0012Th\u0004\u0019\u001c\u0012C4\b\u0016\u0006YC*\b\u0003\u0001(\u0011t]";
        objectArray[25] = "@L/<f\u007fVL*fuhA\u0007)`y|P@>w2mG";
        objectArray[26] = "J\nCqS\\?*H~B\u0013^$CuFI*";
        objectArray[27] = "ohF\u0017\bWdgWXeSd{c\u0013WN`gS\u0013";
        objectArray[28] = "\u0002A\u0003#uOwa\b,d\u0000\u0016o\u0003'`Zb";
        objectArray[29] = "BG\u0000S5f7g\u000b\\$)Vi\u0000W s\"";
        objectArray[30] = "N\"_\r\fjN\"HQ\u0000eTiHO\u0000pS\u0018\u001c\u0017W";
        objectArray[31] = "O\u0001k^\u0017y:!`Q\u00066[/kZ\u0002l/";
        objectArray[32] = "_jyr)\u001dIj|(:\n^!\u007f.6\u001eOfh9}\u0014";
        objectArray[33] = "\u0010N$/9jR\u001bd+Zr/\u001c|\u007fgaS\u000bsha\u001b";
        objectArray[34] = "BCJ^\u000f\u001b\u0014\u0003\u0018ErI{\u0003\u0019^\u0003\u001f\u001f@E]J#";
        objectArray[35] = "7\u000bAy\u000e5p\b\u000exk*cK\u001c$\u0007\u00183\u000bC|kt3H\u0002:\u001a$w\r\u0013C";
        objectArray[36] = "1gV-\\\u00117kO,3\u0018k{IqdO5(\u0010\u001d\u000f\u0019w,Lv\u000bMzr";
        objectArray[37] = "n[2\u0001n!?@pQTy\u0002O-X6lnFt\u0003i\u0010;\u0017u\u00021j|\u0014:\u0003T";
        objectArray[38] = "?>!Z-\u0012928[B\u001be\">\u0006\u0015L;ufj&\u001a}(j\u0010#K5,";
        objectArray[39] = "hRDU\u001e\u0004>\u0012\u0016NcUQL\u001fK\u0001@=EF\u0010^<lP\u0006R\tC6E\u0004@c";
        objectArray[40] = "\u0019z_t\u000b\"\\j\\ur+':\r7I'VxXwM";
        objectArray[41] = "\u000e\u001fGx\u001as^[\u0002icmX^cz\u0019cSM86]>KMQ<R;_\"";
        objectArray[42] = "2+tG\u0005ia }\u001bu{['u\u0010\u0015lb$~\u000b\t\u001214g\u001b\u000b+2?|\u0007u";
        objectArray[43] = "'l'ijc-c\"}\u0005ap4g~dllRzocwfnbgg;\u0017cjkx7ec`l{\n";
        objectArray[44] = "6\u0019{?Um<Dood<0]Yc\u0014 Y\u0017nr\u0019a+\u0017du\u001a\\";
        objectArray[45] = "J|&v\u0004#C?.k;9*d*tY.Fms/\u0006R\u0017x3mQ-Mm1\u007f;";
        objectArray[46] = "\u0016(YaH&D A\u000f\u0010'T0\\c\"s\u0017o\u000b5us\u0014m\u0001j\u000f4\u0017\"\u0000\u000f";
        objectArray[47] = "\u0001\u001dshXh\u000b@g8i?\u0003RkY\u00056\u0016Dhb\u0011&\f\u0019\u0017";
        objectArray[48] = "Cr?8B\u001eJih<y\u0002Mb=+.U\u00140dG\u0016\u0011Jpb5\u001f\n\u001dt";
        objectArray[49] = "4Q\u0002wcz=\u0012\nj\\aTI\u000eu>w8@W.a\u000bd\u0013Wk3bn\u001cR\u007f\\";
        objectArray[50] = "\bt\u000f_fZF{\u0000F\u001c\u000bYw\u0019AK\\\u0003!D-,\u000bJh\u0007\u0012b\u0004Eq";
        objectArray[51] = "\u0000b\r\u0007l\u001fB7M\u0003\u000f\u0007?:S\\m\u0012S3\n\u00072n\u000e/JA2\u001c\u000e%MB\u000f";
        objectArray[52] = "ru6\u001aP\nt:5D4\\\u007fm<O]PFc<_Y6){$_\tD)q#\\4";
        objectArray[53] = "K\n+za9N[c~Q-N\b6q\u0006}\u0015Xh\u001d`2S\u0018oo`8T\u001b";
        objectArray[54] = "\u0013R!\u007f#U\u001a\u0011)b\u001cNsJ-}~X\u001fCt&!$NV4dv[\u0014C6v\u001c";
        objectArray[55] = "_\u0006W\u000f\u0012XI\u0013\r\nr\u00014\u0010S\b\u0014\u0017\u000f\u0004C\u0012Ih";
        objectArray[56] = "pA=\u0017Q:zN8\u0003>-)\u001b|\u0004y=@\u0013n\u0011X,{\u0007~\u000b\u0005SpA=\u0017Q:zN8\u0003>";
        objectArray[57] = "\u0014\u000ft\u000e\u0001'\u0003\u0000c\b{:\u0006\u0001eZ\u0007<\u0000lp\f\u001fjK]zQ\u000b:z";
        objectArray[58] = "\u0018\r\u00138\u0006\u0000\u001cY\u001efg\u000eI\u001e\u000ee\u000b<\u001d]Q2\\k\u0014\f\u001cp\u001dTZ\u0003\u0013ig";
        objectArray[59] = "\u001e9J/&GHy\u00184[\u0016''\u001119\u0003K.Hjf\u007fB8\u000b.:\u0003Z8\u0016?[";
        Object[] objectArray2 = objectArray;
        objectArray[60] = "K25j=|B)bn\u0006`E\"7yQ7\u001cpk\u0015isB0hg`h\u00154";
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = eR.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'y' || c == 'i' || c == '\u00c9' || c == '\u00fc') {
                field = eR.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'y' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'i' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00c9' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = eR.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00d6' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d8' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
    public void a(aK aK2) {
        block11: {
            Object object;
            long l;
            block10: {
                l = k ^ 0x61CAF576C3CBL;
                long l2 = l ^ 0x4C42F7371587L;
                CallSite callSite = eR.b("\u00d8", (long)8360364188461281971L, (long)l);
                try {
                    if (eR.b("\u00d6", (Object)((Boolean)((Object)eR.b("\u00d6", (Object)this.d, (long)8358875267895178474L, (long)l))), (long)8358807913581387732L, (long)l) == false) {
                        return;
                    }
                }
                catch (MatchException matchException) {
                    throw eR.b("\u00d8", (Object)matchException, (long)8360887168012725725L, (long)l);
                }
                CallSite callSite2 = eR.b("\u00d6", (Object)aK2, (Object)new Object[0], (long)8359875119316602016L, (long)l);
                try {
                    try {
                        object = callSite2 instanceof class_1657;
                        if (callSite != null) break block10;
                        if (!object) break block11;
                    }
                    catch (MatchException matchException) {
                        throw eR.b("\u00d8", (Object)matchException, (long)8360887168012725725L, (long)l);
                    }
                    Object[] objectArray = new Object[2];
                    objectArray[1] = l2;
                    objectArray[0] = eR.b("\u00d6", (Object)eR.b("\u00d6", (Object)callSite2, (long)8360240323782855769L, (long)l), (long)8360691642051218589L, (long)l);
                    object = eR.b("\u00d6", (Object)eR.b("\u00c9", (long)8360773804222122972L, (long)l), (Object)objectArray, (long)8359144540211620624L, (long)l);
                }
                catch (MatchException matchException) {
                    throw eR.b("\u00d8", (Object)matchException, (long)8360887168012725725L, (long)l);
                }
            }
            try {
                if (object) {
                    eR.b("\u00d6", (Object)aK2, (Object)new Object[0], (long)8359981348722244458L, (long)l);
                }
            }
            catch (MatchException matchException) {
                throw eR.b("\u00d8", (Object)matchException, (long)8360887168012725725L, (long)l);
            }
        }
    }

    @bP
    public void a(bu_0 bu_02) {
        block19: {
            Object object;
            long l;
            block20: {
                CallSite callSite;
                CallSite callSite2;
                long l2;
                block18: {
                    CallSite callSite3;
                    block16: {
                        block17: {
                            l = k ^ 0x63263569256L;
                            l2 = l ^ 0x2BBA6117441AL;
                            callSite2 = eR.b("\u00d8", (long)2709087901060293422L, (long)l);
                            try {
                                if (eR.b("\u00d6", (Object)((Boolean)((Object)eR.b("\u00d6", (Object)this.d, (long)2710559204763034999L, (long)l))), (long)2710345065579826761L, (long)l) == false) {
                                    return;
                                }
                            }
                            catch (MatchException matchException) {
                                throw eR.b("\u00d8", (Object)matchException, (long)2709673204550827072L, (long)l);
                            }
                            callSite3 = eR.b("y", (Object)b, (long)2709198545174823839L, (long)l);
                            try {
                                callSite = callSite3;
                                if (callSite2 != null) break block16;
                                if (callSite != null) break block17;
                            }
                            catch (MatchException matchException) {
                                throw eR.b("\u00d8", (Object)matchException, (long)2709673204550827072L, (long)l);
                            }
                            return;
                        }
                        callSite = callSite3;
                    }
                    try {
                        try {
                            if (callSite2 != null) break block18;
                            if (eR.b("\u00d6", (Object)callSite, (long)2710790950656914955L, (long)l) != eR.b("\u00c9", (long)2710224002444823612L, (long)l)) break block19;
                        }
                        catch (MatchException matchException) {
                            throw eR.b("\u00d8", (Object)matchException, (long)2709673204550827072L, (long)l);
                        }
                        callSite = callSite3;
                    }
                    catch (MatchException matchException) {
                        throw eR.b("\u00d8", (Object)matchException, (long)2709673204550827072L, (long)l);
                    }
                }
                CallSite callSite4 = eR.b("\u00d6", (Object)((class_3966)callSite), (long)2709952851573995886L, (long)l);
                try {
                    try {
                        object = callSite4 instanceof class_1657;
                        if (callSite2 != null) break block20;
                        if (!object) break block19;
                    }
                    catch (MatchException matchException) {
                        throw eR.b("\u00d8", (Object)matchException, (long)2709673204550827072L, (long)l);
                    }
                    Object[] objectArray = new Object[2];
                    objectArray[1] = l2;
                    objectArray[0] = eR.b("\u00d6", (Object)eR.b("\u00d6", (Object)callSite4, (long)2709176581428420036L, (long)l), (long)2709552037894954240L, (long)l);
                    object = eR.b("\u00d6", (Object)eR.b("\u00c9", (long)2709487483983059521L, (long)l), (Object)objectArray, (long)2710254738168216205L, (long)l);
                }
                catch (MatchException matchException) {
                    throw eR.b("\u00d8", (Object)matchException, (long)2709673204550827072L, (long)l);
                }
            }
            try {
                if (object) {
                    eR.b("\u00d6", (Object)bu_02, (Object)new Object[0], (long)2709470733328362231L, (long)l);
                }
            }
            catch (MatchException matchException) {
                throw eR.b("\u00d8", (Object)matchException, (long)2709673204550827072L, (long)l);
            }
        }
    }

    @bP
    public void a(bD bD2) {
        block25: {
            Object object;
            long l;
            block26: {
                CallSite callSite;
                CallSite callSite2;
                long l2;
                block24: {
                    CallSite callSite3;
                    block22: {
                        block23: {
                            CallSite callSite4;
                            block20: {
                                block21: {
                                    l = k ^ 0x5CDABBDAC674L;
                                    l2 = l ^ 0x7152B99B1038L;
                                    callSite2 = eR.b("\u00d8", (long)8195082371604526860L, (long)l);
                                    try {
                                        try {
                                            callSite4 = eR.b("\u00d6", (Object)bD2, (Object)new Object[0], (long)8195598509716327854L, (long)l);
                                            if (callSite2 != null) break block20;
                                            if (callSite4 == y_0.PRE) break block21;
                                        }
                                        catch (MatchException matchException) {
                                            throw eR.b("\u00d8", (Object)matchException, (long)8194558476688107618L, (long)l);
                                        }
                                        return;
                                    }
                                    catch (MatchException matchException) {
                                        throw eR.b("\u00d8", (Object)matchException, (long)8194558476688107618L, (long)l);
                                    }
                                }
                                callSite4 = eR.b("\u00d6", (Object)this.d, (long)8196425791028638037L, (long)l);
                            }
                            try {
                                if (eR.b("\u00d6", (Object)((Boolean)((Object)callSite4)), (long)8196356240038828651L, (long)l) == false) {
                                    return;
                                }
                            }
                            catch (MatchException matchException) {
                                throw eR.b("\u00d8", (Object)matchException, (long)8194558476688107618L, (long)l);
                            }
                            callSite3 = eR.b("y", (Object)b, (long)8195244353999525821L, (long)l);
                            try {
                                callSite = callSite3;
                                if (callSite2 != null) break block22;
                                if (callSite != null) break block23;
                            }
                            catch (MatchException matchException) {
                                throw eR.b("\u00d8", (Object)matchException, (long)8194558476688107618L, (long)l);
                            }
                            return;
                        }
                        callSite = callSite3;
                    }
                    try {
                        try {
                            if (callSite2 != null) break block24;
                            if (eR.b("\u00d6", (Object)callSite, (long)8195690305470849577L, (long)l) != eR.b("\u00c9", (long)8196266231414282270L, (long)l)) break block25;
                        }
                        catch (MatchException matchException) {
                            throw eR.b("\u00d8", (Object)matchException, (long)8194558476688107618L, (long)l);
                        }
                        callSite = callSite3;
                    }
                    catch (MatchException matchException) {
                        throw eR.b("\u00d8", (Object)matchException, (long)8194558476688107618L, (long)l);
                    }
                }
                CallSite callSite5 = eR.b("\u00d6", (Object)((class_3966)callSite), (long)8194850559536377164L, (long)l);
                try {
                    try {
                        object = callSite5 instanceof class_1657;
                        if (callSite2 != null) break block26;
                        if (!object) break block25;
                    }
                    catch (MatchException matchException) {
                        throw eR.b("\u00d8", (Object)matchException, (long)8194558476688107618L, (long)l);
                    }
                    Object[] objectArray = new Object[2];
                    objectArray[1] = l2;
                    objectArray[0] = eR.b("\u00d6", (Object)eR.b("\u00d6", (Object)callSite5, (long)8195064060024539622L, (long)l), (long)8194327903809718562L, (long)l);
                    object = eR.b("\u00d6", (Object)eR.b("\u00c9", (long)8194390137331846755L, (long)l), (Object)objectArray, (long)8196156305079643823L, (long)l);
                }
                catch (MatchException matchException) {
                    throw eR.b("\u00d8", (Object)matchException, (long)8194558476688107618L, (long)l);
                }
            }
            try {
                if (object) {
                    eR.b("i", (Object)eR.b("y", (Object)b, (long)8195357963792385068L, (long)l), (boolean)false, (long)8196310986208309962L, (long)l);
                    eR.b("\u00d6", (Object)bD2, (Object)new Object[0], (long)8195323915016797909L, (long)l);
                }
            }
            catch (MatchException matchException) {
                throw eR.b("\u00d8", (Object)matchException, (long)8194558476688107618L, (long)l);
            }
        }
    }

    @bP
    public void a(bc_0 bc_02) {
        long l = k ^ 0x28E9D3A74F5L;
        CallSite callSite = eR.b("\u00d8", (long)-4378737251787668083L, (long)l);
        try {
            if (eR.b("\u00d6", (Object)((Boolean)((Object)eR.b("\u00d6", (Object)this.a, (long)-4377829238078962732L, (long)l))), (long)-4378043341494638358L, (long)l) == false) {
                return;
            }
        }
        catch (MatchException matchException) {
            throw eR.b("\u00d8", (Object)matchException, (long)-4379269254717269277L, (long)l);
        }
        CallSite callSite2 = eR.b("\u00d6", (Object)eR.b("\u00d6", (Object)eR.b("\u00c9", (long)-4379455701672411934L, (long)l), (long)-4378826219376089052L, (long)l), (long)-4378265911913365526L, (long)l);
        while (eR.b("\u00d6", (Object)callSite2, (long)-4379740145036948042L, (long)l) != false) {
            block9: {
                bc_0 bc_03;
                block8: {
                    String string = (String)((Object)eR.b("\u00d6", (Object)callSite2, (long)-4379475638332606744L, (long)l));
                    try {
                        try {
                            bc_03 = bc_02;
                            if (callSite != null) break block8;
                            if (eR.b("\u00d6", (Object)eR.b("\u00d6", (Object)bc_03, (Object)new Object[0], (long)-4377672367498972114L, (long)l), (Object)string, (long)-4379240500466508157L, (long)l) == false) break block9;
                        }
                        catch (MatchException matchException) {
                            throw eR.b("\u00d8", (Object)matchException, (long)-4379269254717269277L, (long)l);
                        }
                        eR.b("\u00d6", (Object)bc_02, (Object)new Object[]{string}, (long)-4377906328546467997L, (long)l);
                        eR.b("\u00d6", (Object)bc_02, (Object)new Object[]{(String)((Object)eR.b("\u00d8", (Object)eR.b("\u00c9", (long)-4377775680459652538L, (long)l), (long)-4378295573753651112L, (long)l)) + string + (String)((Object)eR.b("\u00d8", (Object)eR.b("\u00c9", (long)-4378580231197783003L, (long)l), (long)-4378295573753651112L, (long)l))}, (long)-4379623317431980367L, (long)l);
                        bc_03 = bc_02;
                    }
                    catch (MatchException matchException) {
                        throw eR.b("\u00d8", (Object)matchException, (long)-4379269254717269277L, (long)l);
                    }
                }
                eR.b("\u00d6", (Object)bc_03, (Object)new Object[0], (long)-4378908436621538220L, (long)l);
            }
            if (callSite == null) continue;
        }
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (m[n3] != null) {
            return n3;
        }
        Object object = eR.l[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 20;
            case 1 -> 42;
            case 2 -> 22;
            case 3 -> 0;
            case 4 -> 16;
            case 5 -> 32;
            case 6 -> 28;
            case 7 -> 12;
            case 8 -> 47;
            case 9 -> 61;
            case 10 -> 27;
            case 11 -> 34;
            case 12 -> 49;
            case 13 -> 5;
            case 14 -> 14;
            case 15 -> 17;
            case 16 -> 45;
            case 17 -> 50;
            case 18 -> 40;
            case 19 -> 35;
            case 20 -> 52;
            case 21 -> 29;
            case 22 -> 26;
            case 23 -> 41;
            case 24 -> 58;
            case 25 -> 21;
            case 26 -> 15;
            case 27 -> 9;
            case 28 -> 4;
            case 29 -> 8;
            case 30 -> 3;
            case 31 -> 6;
            case 32 -> 11;
            case 33 -> 62;
            case 34 -> 23;
            case 35 -> 54;
            case 36 -> 60;
            case 37 -> 56;
            case 38 -> 63;
            case 39 -> 57;
            case 40 -> 19;
            case 41 -> 33;
            case 42 -> 44;
            case 43 -> 39;
            case 44 -> 59;
            case 45 -> 36;
            case 46 -> 2;
            case 47 -> 53;
            case 48 -> 10;
            case 49 -> 51;
            case 50 -> 43;
            case 51 -> 25;
            case 52 -> 13;
            case 53 -> 31;
            case 54 -> 38;
            case 55 -> 1;
            case 56 -> 48;
            case 57 -> 24;
            case 58 -> 7;
            case 59 -> 30;
            case 60 -> 18;
            case 61 -> 46;
            case 62 -> 37;
            default -> 55;
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
        eR.m[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = eR.m(l, l2);
        Object object = eR.l[n];
        if (object instanceof String) {
            String string = m[n];
            int n2 = string.indexOf(8);
            Class clazz = eR.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = eR.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = eR.g(clazz3, string2, clazz2)) != null) {
                    eR.l[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = eR.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        eR.l[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = eR.n(1367428306469871L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = eR.m(l, l2);
        Object object = eR.l[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = m[n];
                int n3 = string2.indexOf(8);
                clazz3 = eR.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = eR.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = eR.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        eR.l[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = eR.n(1367428306469871L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = eR.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        eR.l[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = eR.n(1367428306469871L, 0L);
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
            return MethodHandles.lookup().findStatic(eR.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


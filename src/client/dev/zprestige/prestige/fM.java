/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_243
 *  net.minecraft.class_2664
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.a5;
import dev.zprestige.prestige.bG;
import dev.zprestige.prestige.bL;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.bg_0;
import dev.zprestige.prestige.dM;
import dev.zprestige.prestige.dO;
import dev.zprestige.prestige.dQ;
import dev.zprestige.prestige.dV;
import dev.zprestige.prestige.dn_0;
import dev.zprestige.prestige.hc;
import dev.zprestige.prestige.q_0;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Set;
import net.minecraft.class_243;
import net.minecraft.class_2664;

public class fM
extends dV {
    private dO a;
    private dM d;
    private dQ c;
    private dQ e;
    private ArrayList f = new ArrayList();
    private static final long k = hc.a(-4690117757454062719L, 4426508341998097825L, MethodHandles.lookup().lookupClass()).a(48727154941822L);
    private static final Object[] l = new Object[61];
    private static final String[] m = new String[61];

    static {
        fM.f();
    }

    @Override
    public void e(Object[] objectArray) {
        long l = (Long)objectArray[0];
        fM.b("\u00db", (Object)this.f, (long)3992874880289180665L, (long)l);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/fM" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = fM.m(l, l2);
            object = fM.l[n];
            try {
                if (!(object instanceof String)) break block2;
                fM.l[n] = clazz = Class.forName(m[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = fM.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = fM.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = fM.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = fM.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = l;
        l[0] = "$\\\f.0p:T\u0016a_w<\\\u0003\u0003wv:";
        objectArray[1] = "\tlY]rc\u0017dC\u0012:c\rn[U3xMN@R/c\u000eh]";
        objectArray[2] = Void.TYPE;
        fM.m[2] = "java/lang/Void";
        objectArray[3] = "\n\r,\"?x\u001c\r)x,o\u000bF*~ {\u001a\u0001=ikn#";
        objectArray[4] = "\u001b&f\u0012vA\u0010)w]\u0015L\u0005$x6 N\u00147d\u001a7C";
        objectArray[5] = "?T\u0003\"qy)T\u0006xbn>\u001f\u0005~nz/X\u0012i%h\u0013";
        objectArray[6] = ":^~(~nO~u'o!2ff fhZ";
        objectArray[7] = "Y8n6l\fY8yj`\u0003Csyt`\u0016D\u0002(,2";
        objectArray[8] = Double.TYPE;
        fM.m[8] = "java/lang/Double";
        objectArray[9] = ":=\u0016d-Y,=\u0013>>N;v\u001082Z*1\u0007/yK9";
        objectArray[10] = "6\t2\u0019lgC)9\u0016}(\"'2\u001dyrV";
        objectArray[11] = "\u0011D\u0003_\u0015\u0004\u0011D\u0014\u0003\u0019\u000b\u000b\u000f\u0014\u001d\u0019\u001e\f~EDA[";
        objectArray[12] = "JK[\u001fXuJKLCTzP\u0000L]ToWq\u001d\u0007\u0003(";
        objectArray[13] = "$\u0002\u007f^k9:\ne\u0011\n<:\nfQ$ ";
        objectArray[14] = "\u0018\u0015|(\u0011:\u0013\u001amgp4\u0018\u0011i=";
        objectArray[15] = Boolean.TYPE;
        fM.m[15] = "java/lang/Boolean";
        objectArray[16] = "ZA\u0019d/vZA\u000e8#y@\n\u000e&#lG{^{r";
        objectArray[17] = "M<`\u0012&bM<wN*mWwwP*xP\u0006#\b}";
        objectArray[18] = "c\u001c9oX{}\u0014# %k}";
        objectArray[19] = "\u001c(\u0015bUL\n(\u00108F[\u001dc\u0013>JO\f$\u0004)\u0001^4";
        objectArray[20] = "i\r\u0017\\04\u001c-\u001cS!{}#\u0017X%!\t";
        objectArray[21] = "Y\u001a\u0019la\u001b,:\u0012cpTM4\u0019ht\u000e9";
        objectArray[22] = "\u001bI#\u0019=\u0019ni(\u0016,V\u000fg#\u001d(\f{";
        objectArray[23] = ">\u001fN\u0001ieK?E\u000ex**1N\u0005|p^";
        objectArray[24] = "\u0013R\u001e+\u000fP\u0018]\u000fdcS\u0016_\r+O";
        objectArray[25] = "<^8K;!\"V\"\u0004G58[!G";
        objectArray[26] = Float.TYPE;
        fM.m[26] = "java/lang/Float";
        objectArray[27] = "\u0011a\u001bi|5dA\u0010fmz\u0005O\u001bmi q";
        objectArray[28] = "a^\t)\u000eWw^\fs\u001d@`\u0015\u000fu\u0011TqR\u0018bZCT";
        objectArray[29] = "==/>\u0015\u001aH\u001d$1\u0004U)\u0013/:\u0000\u000f]";
        objectArray[30] = "#+i\b:[5+lR)L\"`oT%X3'xCnO\f";
        objectArray[31] = "\u001d\u00062m\u001a~h&9b\u000b1\t(2i\u000fk}";
        objectArray[32] = "aUTE_\u0007jZE\n7\u0007dUV";
        objectArray[33] = "@E>\\%i5e5S4&Tk>X0| ";
        objectArray[34] = "5n)\u0004eX)4-]_EY6 \u0000.Mh({\\?)`/,\u000b/\u0017;)&\b_";
        objectArray[35] = "twb@}ah-f\u0019G{\u0018/kD6t)10\u0018'\u0010!6gO7.z0mLG";
        objectArray[36] = "ek_\u001aX{,sZO&!^/\u0018C\u001bq&mC\u0012ZK";
        objectArray[37] = "\u0014S#'+H\u000e\u001bd [V\u001fG~6\f\u0001A\u0010&Z0\u0005N@ >0R\u0017C";
        objectArray[38] = "+Fd\u0013#Ab^aF]\u0018\u0010Xv\u001b,\u0015!F-G=q)Az\u0010-OrGp\u0013]";
        objectArray[39] = "Qs\n\u0000\u00044\bv[\u0007t0\\l\u00187\u00101X`d\u0018\u0018l\rs\t\u0016\tn\t\u001c";
        objectArray[40] = "K\u0006\u001eK\"%\u000e\u0005\u0016'2o?[\u0003[\"\u0014\u001bDK\u001d9(\u0013]\u0012MS";
        objectArray[41] = "l\u007fUKZ[ew\u001dNc\\;`T'Y\u0007l9,A^\u000fmzT\u001a][2\u0005";
        objectArray[42] = "\u000fE\ri\u000f\u0000\u0014[Uui_\n4Zc\u0012A\u0005V\u001b.\r\u0003d\u0005\u001ai\u0010Y\u0006DWvR8\u000fE\ri\u000f\u0000\u0014[Uui";
        objectArray[43] = "\u0000#@\u0017\u0005\u0006[ \u0014Hz\u001fJF\u0002K\u0001\u0013WbxO\u0000N\u000btDG\u0019\u0017[\u001e";
        objectArray[44] = "\u0007\u0002SH\u000et\u0006\nDH7&=\\\u0019ZG%VXMPFO\u0006][R]$\u0002\tQS7";
        objectArray[45] = "\u007fb'*\u0016o\u007flj1vh/\u007f:5\u001aZ{;`mv0;~;7Oa:\u007f'R";
        objectArray[46] = "\u0007p\u0007o\u0011c\u001b*\u00036+yk(\u000ekZvZ6U7K\u0012V7\u0019gN+\u00076\u0018{+";
        objectArray[47] = "{C\n%m^xJ\u0018$U\u000fs]\u0000-<\u0003JS\u0000=8e}@Tz?YuY\r*U";
        objectArray[48] = "'(l~~\u0015 9'p\u0001\u000e\u0019/?bp\u0003(1d>ag)x%sq\u0003\"//7\u0001";
        objectArray[49] = "\u0000(\\L#e\u001crX\u0015\u0019~lpUHhp]n\u000e\u0014y\u0014UiYCi*\u000eoS@\u0019";
        objectArray[50] = "2\u0011Vl.Cw\u0012^\u00004\u0016f@I\u0000f\rmOC>=\u000bgL3";
        objectArray[51] = "eJj\n=OxL)K\u0006\u0018\u0006\u0016>\u0017w\u00127\beKfvg\u001cnFi\u001bi\rlB\u0006";
        objectArray[52] = "F(\tR8S\u001d+]\rGD\u001ai1R6P\u000etS\u0013{OL\u0015";
        objectArray[53] = "\"T\u000b{\\\u000fgW\u0003\u0017WS~\u000b\u0010z-\u000fj\u0017\u0017vON'\bU\u0017DD+V\u0004+L]r\u0006n";
        objectArray[54] = ",J\u0010 )I,\u001dI#\u0013H*\u000b@-\u007fz}K\u0010p#-.\r\u0010py\u0011&\u0014I \u0013";
        objectArray[55] = "\nG_`<#^H\u001f\"L8n\u001d\u0014%50\f\\Y:wQ";
        objectArray[56] = "'\u0006NESzb\u0005F)L,dsBBBKe\u0007K\u0018I!gXO)\u001b4xX[\u0017@2r[+";
        objectArray[57] = "\u0019{>\u001cM\u007f\u0005!:Ewgu#7\u0018\u0006jD=lD\u0017\u000eH< \u0014\u00127\u0019=!\bw";
        objectArray[58] = "d\u0019nZ'V8\nh\bV\u0000e\u00178\u0017\b\u0007e\r<k7\u0002;L>\u00069\u00139HQ";
        objectArray[59] = "LxU\u001b)|P\"QB\u0013g  \\\u001fbi\u0011>\u0007Cs\r\u001d?K\u0013v4L>J\u000f\u0013";
        Object[] objectArray2 = objectArray;
        objectArray[60] = "DJF\u0018H!\u0001INtP|\u0011r\u0012\u0005Bi\u001c\u0010SH]+}\u001bYD\u0003zA\u0013@\u001dS\u0010";
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = fM.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'i' || c == 'G' || c == 'I' || c == 'x') {
                field = fM.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'i' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'G' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'I' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = fM.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00db' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'T' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
    public void a(bg_0 bg_02) {
        block13: {
            reference v3;
            class_2664 class_26642;
            CallSite callSite;
            long l;
            block14: {
                CallSite callSite2;
                block12: {
                    l = k ^ 0x77EBE60107D8L;
                    CallSite callSite3 = fM.b("\u00db", (Object)bg_02, (Object)new Object[0], (long)-4961150850538870617L, (long)l);
                    callSite = fM.b("T", (long)-4962029653033767698L, (long)l);
                    try {
                        try {
                            callSite2 = callSite3;
                            if (callSite != null) break block12;
                            if (!(callSite2 instanceof class_2664)) break block13;
                        }
                        catch (MatchException matchException) {
                            throw fM.b("T", (Object)matchException, (long)-4962568825999487521L, (long)l);
                        }
                        callSite2 = callSite3;
                    }
                    catch (MatchException matchException) {
                        throw fM.b("T", (Object)matchException, (long)-4962568825999487521L, (long)l);
                    }
                }
                class_26642 = (class_2664)callSite2;
                try {
                    try {
                        v3 = fM.b("\u00db", (Object)fM.b("\u00db", (Object)class_26642, (long)-4962941811971429796L, (long)l), (long)-4962812855964585936L, (long)l);
                        if (callSite != null) break block14;
                        if (v3 == false) break block13;
                    }
                    catch (MatchException matchException) {
                        throw fM.b("T", (Object)matchException, (long)-4962568825999487521L, (long)l);
                    }
                    reference v3 = fM.b("\u00db", (Object)((class_243)fM.b("\u00db", (Object)fM.b("\u00db", (Object)class_26642, (long)-4962941811971429796L, (long)l), (long)-4960896641227452158L, (long)l)), (long)-4962679782007725283L, (long)l) - 0.0;
                    v3 = v3 == 0 ? 0 : (v3 > 0 ? 1 : -1);
                }
                catch (MatchException matchException) {
                    throw fM.b("T", (Object)matchException, (long)-4962568825999487521L, (long)l);
                }
            }
            try {
                try {
                    if (callSite != null || v3 <= 0) break block13;
                }
                catch (MatchException matchException) {
                    throw fM.b("T", (Object)matchException, (long)-4962568825999487521L, (long)l);
                }
                v3 = fM.b("\u00db", (Object)this.f, (Object)class_26642, (long)-4961461299207086025L, (long)l);
            }
            catch (MatchException matchException) {
                throw fM.b("T", (Object)matchException, (long)-4962568825999487521L, (long)l);
            }
        }
    }

    @Override
    public Set a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return fM.b("T", (Object)((Object)q_0.Sword), (Object)((Object)q_0.UHC), (long)-2446946991587991598L, (long)l);
    }

    @bP
    public void a(a5 a52) {
        long l = k ^ 0x449DF37FC743L;
        fM.b("\u00db", (Object)this.f, (long)8916499105597736749L, (long)l);
    }

    @bP
    public void a(bL bL2) {
        block14: {
            Object object;
            reference v4;
            long l;
            long l2;
            block15: {
                reference v0;
                block12: {
                    l2 = k ^ 0x2D16021A4874L;
                    l = l2 ^ 0xDA7CCCF53BL;
                    CallSite callSite = fM.b("T", (long)-824424058078829758L, (long)l2);
                    try {
                        try {
                            block13: {
                                try {
                                    try {
                                        try {
                                            v0 = fM.b("\u00db", (Object)this.f, (long)-825262495452362962L, (long)l2);
                                            if (callSite != null) break block12;
                                            if (v0 != false) break block13;
                                        }
                                        catch (MatchException matchException) {
                                            throw fM.b("T", (Object)matchException, (long)-824947013114871181L, (long)l2);
                                        }
                                        v0 = fM.b("\u00db", (Object)((Boolean)((Object)fM.b("\u00db", (Object)this.d, (long)-825311409221181713L, (long)l2))), (long)-824738254128413450L, (long)l2);
                                        if (callSite != null) break block12;
                                    }
                                    catch (MatchException matchException) {
                                        throw fM.b("T", (Object)matchException, (long)-824947013114871181L, (long)l2);
                                    }
                                    if (v0 != false) break block14;
                                }
                                catch (MatchException matchException) {
                                    throw fM.b("T", (Object)matchException, (long)-824947013114871181L, (long)l2);
                                }
                            }
                            v4 = fM.b("\u00db", (Object)dn_0.a, (long)-824212515040467709L, (long)l2) * 100.0f;
                            object = fM.b("\u00db", (Object)((Float)((Object)fM.b("\u00db", (Object)this.a, (long)-825311409221181713L, (long)l2))), (long)-826233827752329097L, (long)l2);
                            if (callSite != null) break block15;
                        }
                        catch (MatchException matchException) {
                            throw fM.b("T", (Object)matchException, (long)-824947013114871181L, (long)l2);
                        }
                        reference v0 = v4 - object;
                        v0 = v0 == 0 ? 0 : (v0 < 0 ? -1 : 1);
                    }
                    catch (MatchException matchException) {
                        throw fM.b("T", (Object)matchException, (long)-824947013114871181L, (long)l2);
                    }
                }
                try {
                    if (v0 > 0) break block14;
                    Object[] objectArray = new Object[1];
                    objectArray[0] = l;
                    v4 = fM.b("\u00db", (Object)this.c, (Object)objectArray, (long)-825626965784625280L, (long)l2);
                    object = 100.0f;
                }
                catch (MatchException matchException) {
                    throw fM.b("T", (Object)matchException, (long)-824947013114871181L, (long)l2);
                }
            }
            reference var7_5 = v4 / object;
            Object[] objectArray = new Object[1];
            objectArray[0] = l;
            reference var8_6 = fM.b("\u00db", (Object)this.e, (Object)objectArray, (long)-825626965784625280L, (long)l2) / 100.0f;
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = (double)(fM.b("\u00db", (Object)bL2, (Object)new Object[0], (long)-826338141324645945L, (long)l2) * (double)var8_6);
            fM.b("\u00db", (Object)bL2, (Object)objectArray2, (long)-825767300655738020L, (long)l2);
            Object[] objectArray3 = new Object[1];
            objectArray3[0] = (double)(fM.b("\u00db", (Object)bL2, (Object)new Object[0], (long)-826157833896566509L, (long)l2) * (double)var7_5);
            fM.b("\u00db", (Object)bL2, (Object)objectArray3, (long)-824500874308444378L, (long)l2);
            Object[] objectArray4 = new Object[1];
            objectArray4[0] = (double)(fM.b("\u00db", (Object)bL2, (Object)new Object[0], (long)-824858176095786954L, (long)l2) * (double)var8_6);
            fM.b("\u00db", (Object)bL2, (Object)objectArray4, (long)-824511466378051150L, (long)l2);
            fM.b("\u00db", (Object)bL2, (Object)new Object[0], (long)-824240094994445531L, (long)l2);
        }
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    @bP
    public void a(bG bG2) {
        long l = k ^ 0x6EF700D83E2BL;
        fM.b("\u00db", new ArrayList(this.f), this::lambda$onTick$0, (long)-9018627607777531849L, (long)l);
    }

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (m[n3] != null) {
            return n3;
        }
        Object object = fM.l[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 5;
            case 1 -> 63;
            case 2 -> 61;
            case 3 -> 1;
            case 4 -> 53;
            case 5 -> 12;
            case 6 -> 58;
            case 7 -> 17;
            case 8 -> 56;
            case 9 -> 43;
            case 10 -> 30;
            case 11 -> 41;
            case 12 -> 46;
            case 13 -> 28;
            case 14 -> 40;
            case 15 -> 26;
            case 16 -> 59;
            case 17 -> 27;
            case 18 -> 62;
            case 19 -> 55;
            case 20 -> 44;
            case 21 -> 7;
            case 22 -> 51;
            case 23 -> 50;
            case 24 -> 23;
            case 25 -> 32;
            case 26 -> 29;
            case 27 -> 48;
            case 28 -> 38;
            case 29 -> 35;
            case 30 -> 25;
            case 31 -> 37;
            case 32 -> 22;
            case 33 -> 4;
            case 34 -> 6;
            case 35 -> 0;
            case 36 -> 21;
            case 37 -> 47;
            case 38 -> 33;
            case 39 -> 57;
            case 40 -> 11;
            case 41 -> 18;
            case 42 -> 49;
            case 43 -> 34;
            case 44 -> 14;
            case 45 -> 42;
            case 46 -> 9;
            case 47 -> 19;
            case 48 -> 60;
            case 49 -> 31;
            case 50 -> 8;
            case 51 -> 39;
            case 52 -> 10;
            case 53 -> 36;
            case 54 -> 52;
            case 55 -> 13;
            case 56 -> 20;
            case 57 -> 16;
            case 58 -> 45;
            case 59 -> 24;
            case 60 -> 3;
            case 61 -> 2;
            case 62 -> 54;
            default -> 15;
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
        fM.m[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = fM.m(l, l2);
        Object object = fM.l[n];
        if (object instanceof String) {
            String string = m[n];
            int n2 = string.indexOf(8);
            Class clazz = fM.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = fM.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = fM.g(clazz3, string2, clazz2)) != null) {
                    fM.l[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = fM.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        fM.l[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = fM.n(1012209261654135L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = fM.m(l, l2);
        Object object = fM.l[n];
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
                clazz3 = fM.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = fM.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = fM.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        fM.l[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = fM.n(1012209261654135L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = fM.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        fM.l[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = fM.n(1012209261654135L, 0L);
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

    private void lambda$onTick$0(class_2664 class_26642) {
        block9: {
            CallSite callSite;
            CallSite callSite2;
            long l;
            block8: {
                l = k ^ 0x607CD3A5B252L;
                callSite2 = fM.b("T", (long)1056450101927680356L, (long)l);
                try {
                    try {
                        callSite = fM.b("i", (Object)b, (long)1056406821026312572L, (long)l);
                        if (callSite2 != null) break block8;
                        if (callSite == null) break block9;
                    }
                    catch (MatchException matchException) {
                        throw fM.b("T", (Object)matchException, (long)1057077510434142293L, (long)l);
                    }
                    callSite = fM.b("i", (Object)b, (long)1056406821026312572L, (long)l);
                }
                catch (MatchException matchException) {
                    throw fM.b("T", (Object)matchException, (long)1057077510434142293L, (long)l);
                }
            }
            try {
                CallSite callSite3;
                try {
                    callSite3 = fM.b("\u00db", (Object)callSite, (long)1057741791269317620L, (long)l);
                    if (callSite2 != null || callSite3 == false) break block9;
                }
                catch (MatchException matchException) {
                    throw fM.b("T", (Object)matchException, (long)1057077510434142293L, (long)l);
                }
                callSite3 = fM.b("\u00db", (Object)this.f, (Object)class_26642, (long)1057529706576124061L, (long)l);
            }
            catch (MatchException matchException) {
                throw fM.b("T", (Object)matchException, (long)1057077510434142293L, (long)l);
            }
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(fM.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


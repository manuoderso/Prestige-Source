/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1657
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.aK;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.bl_0;
import dev.zprestige.prestige.dO;
import dev.zprestige.prestige.dV;
import dev.zprestige.prestige.ed_0;
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
import java.util.Set;
import net.minecraft.class_1657;

/*
 * Renamed from dev.zprestige.prestige.em
 */
public class em_0
extends dV {
    private dO a;
    private dO c;
    private f5 d;
    private boolean i;
    private class_1657 e;
    private static final long k = hc.a(-3410643442264355291L, -8053344187424584568L, MethodHandles.lookup().lookupClass()).a(147784889053530L);
    private static final Object[] l = new Object[56];
    private static final String[] m = new String[56];

    public em_0() {
        long l = k ^ 0x36DA04E45A6DL;
        long l2 = l ^ 0x34032B400CE4L;
        this.d = new f5(l2);
    }

    static {
        em_0.f();
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/em" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = em_0.m(l, l2);
            object = em_0.l[n];
            try {
                if (!(object instanceof String)) break block2;
                em_0.l[n] = clazz = Class.forName(m[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = em_0.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = em_0.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = em_0.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = em_0.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = l;
        l[0] = "?A\u001aN[#?A\r\u0012W,%\n\r\fW9\"{YT\u0000";
        objectArray[1] = "Ex\t|UFEx\u001e YI_3\u001e>Y\\XBL`\u0001\u0018";
        objectArray[2] = Float.TYPE;
        em_0.m[2] = "java/lang/Float";
        objectArray[3] = "\u0006&R\u000fR,\u0010&WUA;\u0007mTSM/\u0016*CD\u0006=*";
        objectArray[4] = "cnXK]C\u0016NSDL\fkV@CEE\u0003";
        objectArray[5] = ".yV\t=q.yAU1~42AK1k3C\u0011\u0016`";
        objectArray[6] = ";\u0011\nC+D-\u0011\u000f\u00198S:Z\f\u001f4G+\u001d\u001b\b\u007fRj";
        objectArray[7] = "m$'u\u0002R\u0018\u0004,z\u0013\u001dy\n'q\u0017G\r";
        objectArray[8] = Boolean.TYPE;
        em_0.m[8] = "java/lang/Boolean";
        objectArray[9] = "X:\u00049THN:\u0001cG_Yq\u0002eKKH6\u0015r\u0000\\j";
        objectArray[10] = "\u0000p\u000bfW5\u0000p\u001c:[:\u001a;\u001c$[/\u001dJN~\u000fk";
        objectArray[11] = "\u0015 KY@\u0013`\u0000@VQ\\\u0001\u000eK]U\u0006u";
        objectArray[12] = Void.TYPE;
        em_0.m[12] = "java/lang/Void";
        objectArray[13] = "\u001a~ia_]\f~l;LJ\u001b5o=@^\nrx*\u000bNF";
        objectArray[14] = "QJ\u0002Yo\u001d$j\tV~REd\u0002]z\b1";
        objectArray[15] = "N \u0011Te-N \u0006\bi\"Tk\u0006\u0016i7S\u001aWN;";
        objectArray[16] = "\u0003u/P\b\u001e\u0015u*\n\u001b\t\u0002>)\f\u0017\u001d\u0013y>\u001b\\\n,";
        objectArray[17] = "\u0017\n:u-6\u001c\u0005+:L8\u0017\u000e/`";
        objectArray[18] = ".9X&\t{89]|\u001al/r^z\u0016x>5Im]o\r";
        objectArray[19] = "V\u0014\u000e.?U#4\u0005!.\u001aB:\u000e**@6";
        objectArray[20] = "/\t\u007fl%\u00189\tz66\u000f.By0:\u001b?\u0005n'q\f\b";
        objectArray[21] = "L\u000e~`\u0010GG\u0001o/xGI\u000e|";
        objectArray[22] = ",$\u0002zkTY\u0004\tuz\u001b8\n\u0002~~AL";
        objectArray[23] = Double.TYPE;
        em_0.m[23] = "java/lang/Double";
        objectArray[24] = "{R0HZ~mR5\u0012Iiz\u00196\u0014E}k^!\u0003\u000ekr";
        objectArray[25] = ";P\u000f+\u000700_\u001edd=%R\u0011\u000fQ?4A\r#F2";
        objectArray[26] = "PA-=\"P%a&23\u001fDo-97E0";
        objectArray[27] = ",8\u001bGI\u0001:8\u001e\u001dZ\u0016-s\u001d\u001bV\u0002<4\n\f\u001d\u0010\u0003";
        objectArray[28] = "=V`rR(Hvk}Cg)x`vG=]";
        objectArray[29] = "|4T|j\u0004|4C f\u000bf\u007fC>f\u001ea\u000e\u0011e>T";
        objectArray[30] = "j<\"&\u001b=|<'|\b*kw$z\u0004>z03mO.|";
        objectArray[31] = "h\u0004_\t\u0014\u0018\u001d$T\u0006\u0005W|*_\r\u0001\r\b";
        objectArray[32] = "\u001exO\r`#kXD\u0002ql\nVO\tu6~";
        objectArray[33] = "Y3R%UVG;Hj(FG";
        objectArray[34] = "\u001fV}{OI\u000fI~\u0004L\u001e\u000fMhh~NL\u0016>\u0004VJ\u0018Ov~Y\b\u001a-6k\u0017N\rO3uY\u001ds";
        objectArray[35] = "\u000fdwr\u001e\u007f\neq>x*5`09\u001f>P4p;\u0000@";
        objectArray[36] = "#A'\u0005\u0013\u001bo\r-\r)\u0007~\u0011*Q~P Fr=E\u0012m\u0003(\u0007U\rn";
        objectArray[37] = ">4H\"].#*Q?6!_-I6P'8qO\"MH qE2O2/3GP";
        objectArray[38] = "9\\lG=\u001dk^nW^\u0005\u0005U6^8\u0003b\t0J%l8J<\u0001:\u0001h@+@^";
        objectArray[39] = "nn+,R\u001e5ch#/\u001bP4-%\u0016\u0016=d'2Wr";
        objectArray[40] = "\bRh{J\u001aF\u0001l>6\u0002ZDo$Z0\n\b7~6ZMU6'[\nGBwC";
        objectArray[41] = ")GdYJ\u0010rJ'V7\u0015\u0017E\u007f[Q\u0013p\u0019yOL|'L`MV\u001dq\u0010%A7";
        objectArray[42] = "\u000b\f\u0010D\u000b\u0006\u001b\u0013\u0013;\bQ\u001b\u0017\u0005W:\u0002_K];\u000eP\u0000J\\DTC\u000eNb";
        objectArray[43] = "#T0=\u001bi \u0001'5igG\r%5\u000fo Q#!\u0012\u0000z\u0012/j\rm*\u00188+i";
        objectArray[44] = ",\u000b\\%C.m\u0016[\"1)\u001d\u000eV}W/zRPiJ@wQ\\\"\u000b* \u0012\u000ew1";
        objectArray[45] = "\fTY$$\"\u001cKZ['u\u001cOL7\u0015\"\\\u001f\u0011kB%\u001aB\u0012?/u\u0010US[";
        objectArray[46] = "\nwN\u0006N\u0017QeZ\u0016w\u0011`\u007fH\u0004\u0006\u0017\u0003i\u001aFJx";
        objectArray[47] = "RX\r!7\u0003\u0001PV1MU9\\\t%+S^\u0000\u000f16<UI\u001f,!\r^_^*M";
        objectArray[48] = "`t$\u000b9\u0019qs6AIHin!G\u0017Oit%;pI346YuW}gH";
        objectArray[49] = "\u0006\u0006\u001c6+~\u001bQ\u00193\u0013b\u000ej\u0010ejt\u000f\t\u00067(8`\f\u0017i+=\u001b\u0011@l.\u0005";
        objectArray[50] = ">jdK9:p9`\u000eE\"l|c\u0014)\u0010:;>L|Gk:nJ\u007f-<y<\u001fE";
        objectArray[51] = "X/LrHG\n-Nb+_d&\u0016kMY\u0003z\u0010\u007fP6T/\t}JW\u0002sLq+";
        objectArray[52] = "\\q\u0013F\f#\u001dl\u0014A~$mt\u0019\u001e\u0018\"\n(\u001f\n\u0005M\u0002zN\u0002\u001dw\tc\u0018\u001f~";
        objectArray[53] = "B?F\u0004O\u0018\u0015|\u0014Qu\u0017EyKZ\u0019%\u0011=\u0010\u0004u\u001dC5Q^O\u0016ZcL=\u001a\u0019\u0018\u007fH\u0007\u0011\u0000Nb+R\u001eBRf\u0011Y\u0007\u0014O\u0005A\u0007\u0018K\u0012o\u0016DJ\u001e(";
        objectArray[54] = "\u001cx\u0014\u007fr\u0006\u00159\u000fyI\u0003sd\u00159w\u001a\u0010}\t9uj\u0013\u007fP99\t\ncP;I";
        Object[] objectArray2 = objectArray;
        objectArray[55] = "!q?\u001fY5ryd\u000f#aJu;\u001bEe-)=\u000fX\nwj1DGg'`&\u0005#";
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00a2' || c == 'A' || c == 'o' || c == '\u00df') {
                field = em_0.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00a2' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'A' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'o' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = em_0.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'E' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'V' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = em_0.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    @bP
    public void a(aK aK2) {
        block9: {
            long l;
            long l2;
            block10: {
                CallSite callSite;
                CallSite callSite2;
                long l3;
                block8: {
                    long l4 = l2 = k ^ 0x719DC4889528L;
                    l = l4 ^ 0x31BE20B027A1L;
                    l3 = l4 ^ 0x1DD446E21100L;
                    CallSite callSite3 = em_0.b("E", (Object)aK2, (Object)new Object[0], (long)4050176911781861752L, (long)l2);
                    callSite2 = em_0.b("V", (long)4050044705544584034L, (long)l2);
                    try {
                        try {
                            callSite = callSite3;
                            if (callSite2 != null) break block8;
                            if (!(callSite instanceof class_1657)) break block9;
                        }
                        catch (MatchException matchException) {
                            throw em_0.b("V", (Object)matchException, (long)4049261592098357422L, (long)l2);
                        }
                        callSite = callSite3;
                    }
                    catch (MatchException matchException) {
                        throw em_0.b("V", (Object)matchException, (long)4049261592098357422L, (long)l2);
                    }
                }
                class_1657 class_16572 = (class_1657)callSite;
                try {
                    try {
                        if (callSite2 != null) break block10;
                        Object[] objectArray = new Object[2];
                        objectArray[1] = l3;
                        objectArray[0] = em_0.b("E", (Object)em_0.b("\u00a2", (Object)b, (long)4050267702453659587L, (long)l2), (long)4050662854443892706L, (long)l2);
                        if (em_0.b("V", (Object)objectArray, (long)4050635461474500111L, (long)l2) == false) break block9;
                    }
                    catch (MatchException matchException) {
                        throw em_0.b("V", (Object)matchException, (long)4049261592098357422L, (long)l2);
                    }
                    this.e = class_16572;
                    this.i = 1;
                }
                catch (MatchException matchException) {
                    throw em_0.b("V", (Object)matchException, (long)4049261592098357422L, (long)l2);
                }
            }
            Object[] objectArray = new Object[1];
            objectArray[0] = l;
            em_0.b("E", (Object)this.d, (Object)objectArray, (long)4048928963470106993L, (long)l2);
        }
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @bP
    public void a(bl_0 var1_1) {
        block57: {
            block58: {
                block53: {
                    block54: {
                        block56: {
                            block55: {
                                block51: {
                                    block52: {
                                        block48: {
                                            block49: {
                                                block50: {
                                                    block46: {
                                                        block47: {
                                                            block44: {
                                                                block45: {
                                                                    block42: {
                                                                        block43: {
                                                                            v0 = var2_2 = em_0.k ^ 56798977120888L;
                                                                            var4_3 = v0 ^ 86001784725696L;
                                                                            var6_4 = v0 ^ 29701346335232L;
                                                                            var8_5 = v0 ^ 40541129887840L;
                                                                            var10_6 = v0 ^ 38896581773763L;
                                                                            var12_7 = v0 ^ 2547868411123L;
                                                                            var14_8 = v0 ^ 74360929657196L;
                                                                            var16_9 = em_0.b("V", (long)8603251906099147826L, (long)var2_2);
                                                                            try {
                                                                                try {
                                                                                    v1 = this;
                                                                                    if (var16_9 != null) break block42;
                                                                                    if (v1.i) break block43;
                                                                                }
                                                                                catch (MatchException v2) {
                                                                                    throw em_0.b("V", (Object)v2, (long)8602332425302151166L, (long)var2_2);
                                                                                }
                                                                                return;
                                                                            }
                                                                            catch (MatchException v3) {
                                                                                throw em_0.b("V", (Object)v3, (long)8602332425302151166L, (long)var2_2);
                                                                            }
                                                                        }
                                                                        v1 = this;
                                                                    }
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        if (var16_9 != null) break block44;
                                                                                        if (v1.e == null) break block45;
                                                                                    }
                                                                                    catch (MatchException v4) {
                                                                                        throw em_0.b("V", (Object)v4, (long)8602332425302151166L, (long)var2_2);
                                                                                    }
                                                                                    v1 = this;
                                                                                    if (var16_9 != null) break block44;
                                                                                }
                                                                                catch (MatchException v5) {
                                                                                    throw em_0.b("V", (Object)v5, (long)8602332425302151166L, (long)var2_2);
                                                                                }
                                                                                if (em_0.b("E", (Object)v1.e, (long)8603600518188961613L, (long)var2_2) == false) break block45;
                                                                            }
                                                                            catch (MatchException v6) {
                                                                                throw em_0.b("V", (Object)v6, (long)8602332425302151166L, (long)var2_2);
                                                                            }
                                                                            cfr_temp_0 = em_0.b("E", (Object)em_0.b("\u00a2", (Object)em_0.b, (long)8603338950581332115L, (long)var2_2), (Object)this.e, (long)8603180432551009247L, (long)var2_2) - 100.0f;
                                                                            v7 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 > 0 ? 1 : -1);
                                                                            if (var16_9 != null) break block46;
                                                                        }
                                                                        catch (MatchException v8) {
                                                                            throw em_0.b("V", (Object)v8, (long)8602332425302151166L, (long)var2_2);
                                                                        }
                                                                        if (v7 <= 0) break block47;
                                                                    }
                                                                    catch (MatchException v9) {
                                                                        throw em_0.b("V", (Object)v9, (long)8602332425302151166L, (long)var2_2);
                                                                    }
                                                                }
                                                                v1 = this;
                                                            }
                                                            v1.i = 0;
                                                            return;
                                                        }
                                                        v10 = new Object[2];
                                                        v10[1] = var8_5;
                                                        v10[0] = Float.valueOf(1000.0f);
                                                        v7 = em_0.b("E", (Object)this.d, (Object)v10, (long)8603479776990983550L, (long)var2_2);
                                                    }
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    if (var16_9 != null) break block48;
                                                                    if (v7 == false) break block49;
                                                                }
                                                                catch (MatchException v11) {
                                                                    throw em_0.b("V", (Object)v11, (long)8602332425302151166L, (long)var2_2);
                                                                }
                                                                v7 = em_0.b("E", (Object)em_0.b("\u00a2", (Object)em_0.b, (long)8603338950581332115L, (long)var2_2), (long)8603939290732453105L, (long)var2_2);
                                                                if (var16_9 != null) break block50;
                                                            }
                                                            catch (MatchException v12) {
                                                                throw em_0.b("V", (Object)v12, (long)8602332425302151166L, (long)var2_2);
                                                            }
                                                            if (v7 == false) {
                                                            }
                                                            ** GOTO lbl100
                                                        }
                                                        catch (MatchException v13) {
                                                            throw em_0.b("V", (Object)v13, (long)8602332425302151166L, (long)var2_2);
                                                        }
                                                        v14 = new Object[2];
                                                        v14[1] = var8_5;
                                                        v14[0] = Float.valueOf(5000.0f);
                                                        v7 = em_0.b("E", (Object)this.d, (Object)v14, (long)8603479776990983550L, (long)var2_2);
                                                    }
                                                    catch (MatchException v15) {
                                                        throw em_0.b("V", (Object)v15, (long)8602332425302151166L, (long)var2_2);
                                                    }
                                                }
                                                try {
                                                    try {
                                                        if (var16_9 != null) break block48;
                                                        if (v7 == false) break block49;
                                                    }
                                                    catch (MatchException v16) {
                                                        throw em_0.b("V", (Object)v16, (long)8602332425302151166L, (long)var2_2);
                                                    }
lbl100:
                                                    // 2 sources

                                                    this.i = 0;
                                                    return;
                                                }
                                                catch (MatchException v17) {
                                                    throw em_0.b("V", (Object)v17, (long)8602332425302151166L, (long)var2_2);
                                                }
                                            }
                                            v18 = new Object[2];
                                            v18[1] = var8_5;
                                            v18[0] = Float.valueOf(100.0f);
                                            v7 = em_0.b("E", (Object)this.d, (Object)v18, (long)8603479776990983550L, (long)var2_2);
                                        }
                                        try {
                                            if (var16_9 != null) break block51;
                                            if (v7 != false) break block52;
                                        }
                                        catch (MatchException v19) {
                                            throw em_0.b("V", (Object)v19, (long)8602332425302151166L, (long)var2_2);
                                        }
                                        return;
                                    }
                                    v20 = new Object[2];
                                    v20[1] = var8_5;
                                    v20[0] = Float.valueOf(600.0f);
                                    v7 = em_0.b("E", (Object)this.d, (Object)v20, (long)8603479776990983550L, (long)var2_2);
                                }
                                try {
                                    try {
                                        try {
                                            try {
                                                if (var16_9 != null) break block53;
                                                if (v7 != false) break block54;
                                            }
                                            catch (MatchException v21) {
                                                throw em_0.b("V", (Object)v21, (long)8602332425302151166L, (long)var2_2);
                                            }
                                            v22 = ed_0.v;
                                            if (var16_9 != null) break block55;
                                        }
                                        catch (MatchException v23) {
                                            throw em_0.b("V", (Object)v23, (long)8602332425302151166L, (long)var2_2);
                                        }
                                        if (em_0.b("E", (Object)v22, (long)8603517212988412791L, (long)var2_2) != false) break block56;
                                    }
                                    catch (MatchException v24) {
                                        throw em_0.b("V", (Object)v24, (long)8602332425302151166L, (long)var2_2);
                                    }
                                    v22 = ed_0.v;
                                }
                                catch (MatchException v25) {
                                    throw em_0.b("V", (Object)v25, (long)8602332425302151166L, (long)var2_2);
                                }
                            }
                            v26 = new Object[1];
                            v26[0] = var4_3;
                            em_0.b("E", (Object)v22, (Object)v26, (long)8603674494537681729L, (long)var2_2);
                        }
                        v27 = new Object[2];
                        v27[1] = var6_4;
                        v27[0] = this.e;
                        v28 = new Object[2];
                        v28[1] = var10_6;
                        v28[0] = em_0.b("E", (Object)em_0.b("V", (Object)v27, (long)8603857986258212994L, (long)var2_2), (double)0.0, (double)((double)em_0.b("E", (Object)((Float)em_0.b("E", (Object)this.c, (long)8604044736476820628L, (long)var2_2)), (long)8601936770433368635L, (long)var2_2)), (double)0.0, (long)8602287891909868409L, (long)var2_2);
                        var17_10 = em_0.b("V", (Object)v28, (long)8604066749296997663L, (long)var2_2);
                        v29 = new Object[5];
                        v29[4] = var12_7;
                        v29[3] = Float.valueOf(0.5f);
                        v29[2] = Float.valueOf(0.0f);
                        v29[1] = Float.valueOf((float)(em_0.b("E", (Object)((Float)em_0.b("E", (Object)this.a, (long)8604044736476820628L, (long)var2_2)), (long)8601936770433368635L, (long)var2_2) / 2.0f));
                        v29[0] = var17_10;
                        em_0.b("V", (Object)v29, (long)8602427021063954118L, (long)var2_2);
                        return;
                    }
                    v30 = new Object[2];
                    v30[1] = var8_5;
                    v30[0] = Float.valueOf(1400.0f);
                    v7 = em_0.b("E", (Object)this.d, (Object)v30, (long)8603479776990983550L, (long)var2_2);
                }
                try {
                    if (var16_9 != null) break block57;
                    if (v7 != false) break block58;
                }
                catch (MatchException v31) {
                    throw em_0.b("V", (Object)v31, (long)8602332425302151166L, (long)var2_2);
                }
                v32 = new Object[2];
                v32[1] = var10_6;
                v32[0] = em_0.b("E", (Object)this.e, (long)8602045727168990357L, (long)var2_2);
                var17_11 = em_0.b("V", (Object)v32, (long)8604066749296997663L, (long)var2_2);
                v33 = new Object[5];
                v33[4] = var12_7;
                v33[3] = Float.valueOf(0.5f);
                v33[2] = Float.valueOf(0.0f);
                v33[1] = Float.valueOf((float)(em_0.b("E", (Object)((Float)em_0.b("E", (Object)this.a, (long)8604044736476820628L, (long)var2_2)), (long)8601936770433368635L, (long)var2_2) / 2.0f));
                v33[0] = var17_11;
                em_0.b("V", (Object)v33, (long)8602427021063954118L, (long)var2_2);
                return;
            }
            v34 = new Object[2];
            v34[1] = var14_8;
            v34[0] = em_0.b("\u00a2", (Object)em_0.b, (long)8603338950581332115L, (long)var2_2);
            cfr_temp_1 = em_0.b("V", (Object)v34, (long)8602163991977491981L, (long)var2_2) - 1.0;
            v7 = cfr_temp_1 == 0 ? 0 : (cfr_temp_1 < 0 ? -1 : 1);
        }
        try {
            if (v7 < 0) {
                this.i = 0;
            }
        }
        catch (MatchException v35) {
            throw em_0.b("V", (Object)v35, (long)8602332425302151166L, (long)var2_2);
        }
    }

    @Override
    public Set a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return em_0.b("V", (Object)((Object)q_0.Mace), (long)-2446463255602020556L, (long)l);
    }

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (m[n3] != null) {
            return n3;
        }
        Object object = em_0.l[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 36;
            case 1 -> 50;
            case 2 -> 9;
            case 3 -> 26;
            case 4 -> 41;
            case 5 -> 30;
            case 6 -> 19;
            case 7 -> 1;
            case 8 -> 28;
            case 9 -> 14;
            case 10 -> 11;
            case 11 -> 38;
            case 12 -> 35;
            case 13 -> 10;
            case 14 -> 54;
            case 15 -> 12;
            case 16 -> 57;
            case 17 -> 21;
            case 18 -> 51;
            case 19 -> 7;
            case 20 -> 27;
            case 21 -> 3;
            case 22 -> 60;
            case 23 -> 59;
            case 24 -> 20;
            case 25 -> 24;
            case 26 -> 0;
            case 27 -> 62;
            case 28 -> 13;
            case 29 -> 39;
            case 30 -> 4;
            case 31 -> 32;
            case 32 -> 17;
            case 33 -> 56;
            case 34 -> 61;
            case 35 -> 52;
            case 36 -> 8;
            case 37 -> 46;
            case 38 -> 25;
            case 39 -> 31;
            case 40 -> 2;
            case 41 -> 34;
            case 42 -> 29;
            case 43 -> 23;
            case 44 -> 55;
            case 45 -> 16;
            case 46 -> 48;
            case 47 -> 42;
            case 48 -> 22;
            case 49 -> 45;
            case 50 -> 15;
            case 51 -> 58;
            case 52 -> 40;
            case 53 -> 53;
            case 54 -> 43;
            case 55 -> 18;
            case 56 -> 5;
            case 57 -> 44;
            case 58 -> 6;
            case 59 -> 63;
            case 60 -> 33;
            case 61 -> 47;
            case 62 -> 49;
            default -> 37;
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
        em_0.m[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = em_0.m(l, l2);
        Object object = em_0.l[n];
        if (object instanceof String) {
            String string = m[n];
            int n2 = string.indexOf(8);
            Class clazz = em_0.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = em_0.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = em_0.g(clazz3, string2, clazz2)) != null) {
                    em_0.l[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = em_0.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        em_0.l[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = em_0.n(1254685280228609L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = em_0.m(l, l2);
        Object object = em_0.l[n];
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
                clazz3 = em_0.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = em_0.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = em_0.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        em_0.l[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = em_0.n(1254685280228609L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = em_0.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        em_0.l[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = em_0.n(1254685280228609L, 0L);
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
            return MethodHandles.lookup().findStatic(em_0.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


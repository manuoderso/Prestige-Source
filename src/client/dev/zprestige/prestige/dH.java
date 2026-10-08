/*
 * Decompiled with CFR 0.152.
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.aX;
import dev.zprestige.prestige.bG;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.cz_0;
import dev.zprestige.prestige.hc;
import dev.zprestige.prestige.y_0;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class dH
implements cz_0 {
    private static final float a = 0.4f;
    private static final float c = 0.5f;
    private boolean d;
    private float e;
    private float f;
    private float g;
    private float h;
    private boolean i;
    private float j;
    private float k;
    private float l;
    private float m;
    private float n;
    private float o;
    private float p;
    private float q;
    private static final long r = hc.a(7186782396353467671L, 6963275258725884204L, MethodHandles.lookup().lookupClass()).a(12719109727870L);
    private static final Object[] s = new Object[44];
    private static final String[] t = new String[44];

    public dH(long l) {
        long l2 = (l = r ^ l) ^ 0xD5A512BD525L;
        this.d = 0;
        this.i = 0;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = this;
        dH.a("J", (Object)dH.a("u", (long)2028476638110958909L, (long)l), (Object)objectArray, (long)2028136440619049002L, (long)l);
    }

    static {
        dH.a();
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (t[n3] != null) {
            return n3;
        }
        Object object = s[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 50;
            case 1 -> 35;
            case 2 -> 13;
            case 3 -> 18;
            case 4 -> 58;
            case 5 -> 23;
            case 6 -> 15;
            case 7 -> 20;
            case 8 -> 7;
            case 9 -> 63;
            case 10 -> 49;
            case 11 -> 12;
            case 12 -> 3;
            case 13 -> 30;
            case 14 -> 31;
            case 15 -> 22;
            case 16 -> 61;
            case 17 -> 41;
            case 18 -> 32;
            case 19 -> 33;
            case 20 -> 44;
            case 21 -> 43;
            case 22 -> 24;
            case 23 -> 38;
            case 24 -> 26;
            case 25 -> 48;
            case 26 -> 54;
            case 27 -> 27;
            case 28 -> 57;
            case 29 -> 17;
            case 30 -> 51;
            case 31 -> 8;
            case 32 -> 25;
            case 33 -> 9;
            case 34 -> 46;
            case 35 -> 56;
            case 36 -> 10;
            case 37 -> 1;
            case 38 -> 0;
            case 39 -> 39;
            case 40 -> 59;
            case 41 -> 11;
            case 42 -> 45;
            case 43 -> 6;
            case 44 -> 4;
            case 45 -> 2;
            case 46 -> 5;
            case 47 -> 47;
            case 48 -> 14;
            case 49 -> 28;
            case 50 -> 42;
            case 51 -> 34;
            case 52 -> 37;
            case 53 -> 16;
            case 54 -> 29;
            case 55 -> 40;
            case 56 -> 52;
            case 57 -> 62;
            case 58 -> 60;
            case 59 -> 19;
            case 60 -> 36;
            case 61 -> 53;
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
        dH.t[n3] = new String(cArray);
        return n3;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00d8' || c == '\u00ca' || c == 'u' || c == 'b') {
                field = dH.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00d8' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ca' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'u' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = dH.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'J' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'n' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = dH.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Method c(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Method h(long l, long l2) {
        int n = dH.e(l, l2);
        Object object = s[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = t[n];
                int n3 = string2.indexOf(8);
                clazz3 = dH.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = dH.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = dH.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        dH.s[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = dH.f(1445852460288664L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = dH.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        dH.s[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = dH.f(1445852460288664L, 0L);
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

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = dH.e(l, l2);
            object = s[n];
            try {
                if (!(object instanceof String)) break block2;
                dH.s[n] = clazz = Class.forName(t[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = dH.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = dH.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = dH.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = dH.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/dH" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @bP
    public void a(bG bG2) {
        CallSite callSite;
        CallSite callSite2;
        long l;
        block16: {
            block17: {
                CallSite callSite3;
                block15: {
                    block14: {
                        block13: {
                            block12: {
                                l = r ^ 0x1E09AF7C2FD4L;
                                callSite3 = dH.a("n", (long)-8570193144787248556L, (long)l);
                                try {
                                    try {
                                        if (callSite3 != null) break block12;
                                        if (dH.a("\u00d8", (Object)b, (long)-8569369779407648278L, (long)l) != null) break block13;
                                    }
                                    catch (MatchException matchException) {
                                        throw dH.a("n", (Object)matchException, (long)-8566792127725904783L, (long)l);
                                    }
                                    this.d = 0;
                                }
                                catch (MatchException matchException) {
                                    throw dH.a("n", (Object)matchException, (long)-8566792127725904783L, (long)l);
                                }
                            }
                            return;
                        }
                        try {
                            dH dH2;
                            try {
                                dH2 = this;
                                if (callSite3 != null) break block14;
                                if (dH2.d) break block15;
                            }
                            catch (MatchException matchException) {
                                throw dH.a("n", (Object)matchException, (long)-8566792127725904783L, (long)l);
                            }
                            this.e = (float)dH.a("J", (Object)dH.a("\u00d8", (Object)b, (long)-8569369779407648278L, (long)l), (long)-8565928183256615913L, (long)l);
                            this.f = (float)dH.a("J", (Object)dH.a("\u00d8", (Object)b, (long)-8569369779407648278L, (long)l), (long)-8569529239081980000L, (long)l);
                            this.g = this.e;
                            this.h = this.f;
                            dH2 = this;
                        }
                        catch (MatchException matchException) {
                            throw dH.a("n", (Object)matchException, (long)-8566792127725904783L, (long)l);
                        }
                    }
                    dH2.d = 1;
                    return;
                }
                callSite2 = dH.a("J", (Object)dH.a("u", (long)-8566595879793394900L, (long)l), (Object)new Object[0], (long)-8570258683299973848L, (long)l);
                try {
                    try {
                        callSite = callSite2;
                        if (callSite3 != null) break block16;
                        if (callSite != null) break block17;
                    }
                    catch (MatchException matchException) {
                        throw dH.a("n", (Object)matchException, (long)-8566792127725904783L, (long)l);
                    }
                    this.e = (float)dH.a("J", (Object)dH.a("\u00d8", (Object)b, (long)-8569369779407648278L, (long)l), (long)-8565928183256615913L, (long)l);
                    this.f = (float)dH.a("J", (Object)dH.a("\u00d8", (Object)b, (long)-8569369779407648278L, (long)l), (long)-8569529239081980000L, (long)l);
                    this.g = this.e;
                    this.h = this.f;
                    return;
                }
                catch (MatchException matchException) {
                    throw dH.a("n", (Object)matchException, (long)-8566792127725904783L, (long)l);
                }
            }
            this.g = this.e;
            this.h = this.f;
            callSite = callSite2;
        }
        CallSite callSite4 = dH.a("n", (float)(dH.a("J", (Object)callSite, (Object)new Object[0], (long)-8566539885462641036L, (long)l) - this.e), (long)-8565905202306839321L, (long)l);
        reference var7_6 = dH.a("J", (Object)callSite2, (Object)new Object[0], (long)-8569675033436037478L, (long)l) - this.f;
        this.e = (float)dH.a("n", (float)(this.e + callSite4 * 0.4f), (long)-8565905202306839321L, (long)l);
        this.f = (float)dH.a("n", (float)(this.f + var7_6 * 0.4f), (float)-90.0f, (float)90.0f, (long)-8566436358810868364L, (long)l);
    }

    /*
     * Unable to fully structure code
     */
    @bP
    public void a(aX var1_1) {
        block33: {
            block34: {
                block29: {
                    block31: {
                        block32: {
                            block30: {
                                block28: {
                                    var2_2 = dH.r ^ 26821491512113L;
                                    var4_3 = dH.a("n", (long)-723521735261772111L, (long)var2_2);
                                    try {
                                        try {
                                            if (var1_1.a == dH.a("\u00d8", (Object)dH.b, (long)-723252168870202097L, (long)var2_2) && this.d) break block28;
                                        }
                                        catch (MatchException v0) {
                                            throw dH.a("n", (Object)v0, (long)-722364160074211180L, (long)var2_2);
                                        }
                                        return;
                                    }
                                    catch (MatchException v1) {
                                        throw dH.a("n", (Object)v1, (long)-722364160074211180L, (long)var2_2);
                                    }
                                }
                                try {
                                    try {
                                        try {
                                            v2 = dH.a("J", (Object)var1_1, (Object)new Object[0], (long)-722311956132477039L, (long)var2_2);
                                            v3 = y_0.PRE;
                                            if (var4_3 != null) break block29;
                                            if (v2 == v3) {
                                            }
                                            ** GOTO lbl76
                                        }
                                        catch (MatchException v4) {
                                            throw dH.a("n", (Object)v4, (long)-722364160074211180L, (long)var2_2);
                                        }
                                        if (!this.i) break block30;
                                    }
                                    catch (MatchException v5) {
                                        throw dH.a("n", (Object)v5, (long)-722364160074211180L, (long)var2_2);
                                    }
                                    return;
                                }
                                catch (MatchException v6) {
                                    throw dH.a("n", (Object)v6, (long)-722364160074211180L, (long)var2_2);
                                }
                            }
                            try {
                                if (dH.a("J", (Object)dH.a("u", (long)-722739770394703927L, (long)var2_2), (Object)new Object[0], (long)-723578367085393459L, (long)var2_2) == null) {
                                    return;
                                }
                            }
                            catch (MatchException v7) {
                                throw dH.a("n", (Object)v7, (long)-722364160074211180L, (long)var2_2);
                            }
                            var5_4 = dH.a("n", (float)dH.a("n", (float)(this.e - dH.a("J", (Object)dH.a("\u00d8", (Object)dH.b, (long)-723252168870202097L, (long)var2_2), (long)-722067020224526094L, (long)var2_2)), (long)-722039428090826750L, (long)var2_2), (long)-722530388251041329L, (long)var2_2);
                            var6_5 = dH.a("n", (float)(this.f - dH.a("J", (Object)dH.a("\u00d8", (Object)dH.b, (long)-723252168870202097L, (long)var2_2), (long)-722848759658802363L, (long)var2_2)), (long)-722530388251041329L, (long)var2_2);
                            try {
                                try {
                                    try {
                                        if (var4_3 != null) break block31;
                                        if (!(var5_4 < 0.5f)) break block32;
                                    }
                                    catch (MatchException v8) {
                                        throw dH.a("n", (Object)v8, (long)-722364160074211180L, (long)var2_2);
                                    }
                                    if (!(var6_5 < 0.5f)) break block32;
                                }
                                catch (MatchException v9) {
                                    throw dH.a("n", (Object)v9, (long)-722364160074211180L, (long)var2_2);
                                }
                                return;
                            }
                            catch (MatchException v10) {
                                throw dH.a("n", (Object)v10, (long)-722364160074211180L, (long)var2_2);
                            }
                        }
                        this.j = (float)dH.a("J", (Object)dH.a("\u00d8", (Object)dH.b, (long)-723252168870202097L, (long)var2_2), (long)-722067020224526094L, (long)var2_2);
                        this.k = (float)dH.a("J", (Object)dH.a("\u00d8", (Object)dH.b, (long)-723252168870202097L, (long)var2_2), (long)-722848759658802363L, (long)var2_2);
                        this.l = (float)dH.a("\u00d8", (Object)dH.a("\u00d8", (Object)dH.b, (long)-723252168870202097L, (long)var2_2), (long)-722228294446531244L, (long)var2_2);
                        this.m = (float)dH.a("\u00d8", (Object)dH.a("\u00d8", (Object)dH.b, (long)-723252168870202097L, (long)var2_2), (long)-723226954611267387L, (long)var2_2);
                        this.n = (float)dH.a("\u00d8", (Object)dH.a("\u00d8", (Object)dH.b, (long)-723252168870202097L, (long)var2_2), (long)-723152558358728257L, (long)var2_2);
                        this.o = (float)dH.a("\u00d8", (Object)dH.a("\u00d8", (Object)dH.b, (long)-723252168870202097L, (long)var2_2), (long)-723108200943397431L, (long)var2_2);
                        this.p = (float)dH.a("\u00d8", (Object)dH.a("\u00d8", (Object)dH.b, (long)-723252168870202097L, (long)var2_2), (long)-722911805902307041L, (long)var2_2);
                        this.q = (float)dH.a("\u00d8", (Object)dH.a("\u00d8", (Object)dH.b, (long)-723252168870202097L, (long)var2_2), (long)-722800958322564822L, (long)var2_2);
                        dH.a("J", (Object)dH.a("\u00d8", (Object)dH.b, (long)-723252168870202097L, (long)var2_2), (float)this.e, (long)-722473346509190923L, (long)var2_2);
                        dH.a("J", (Object)dH.a("\u00d8", (Object)dH.b, (long)-723252168870202097L, (long)var2_2), (float)this.f, (long)-722156238020282657L, (long)var2_2);
                        dH.a("\u00ca", (Object)dH.a("\u00d8", (Object)dH.b, (long)-723252168870202097L, (long)var2_2), (float)this.e, (long)-722228294446531244L, (long)var2_2);
                        dH.a("\u00ca", (Object)dH.a("\u00d8", (Object)dH.b, (long)-723252168870202097L, (long)var2_2), (float)this.e, (long)-723226954611267387L, (long)var2_2);
                        dH.a("\u00ca", (Object)dH.a("\u00d8", (Object)dH.b, (long)-723252168870202097L, (long)var2_2), (float)this.g, (long)-723152558358728257L, (long)var2_2);
                        dH.a("\u00ca", (Object)dH.a("\u00d8", (Object)dH.b, (long)-723252168870202097L, (long)var2_2), (float)this.h, (long)-723108200943397431L, (long)var2_2);
                        dH.a("\u00ca", (Object)dH.a("\u00d8", (Object)dH.b, (long)-723252168870202097L, (long)var2_2), (float)this.g, (long)-722911805902307041L, (long)var2_2);
                        dH.a("\u00ca", (Object)dH.a("\u00d8", (Object)dH.b, (long)-723252168870202097L, (long)var2_2), (float)this.g, (long)-722800958322564822L, (long)var2_2);
                        this.i = 1;
                    }
                    try {
                        if (var4_3 == null) break block33;
lbl76:
                        // 2 sources

                        v2 = dH.a("J", (Object)var1_1, (Object)new Object[0], (long)-722311956132477039L, (long)var2_2);
                        v3 = y_0.POST;
                    }
                    catch (MatchException v11) {
                        throw dH.a("n", (Object)v11, (long)-722364160074211180L, (long)var2_2);
                    }
                }
                try {
                    try {
                        try {
                            if (v2 != v3) break block33;
                            v12 = this;
                            if (var4_3 != null) break block34;
                        }
                        catch (MatchException v13) {
                            throw dH.a("n", (Object)v13, (long)-722364160074211180L, (long)var2_2);
                        }
                        if (!v12.i) break block33;
                    }
                    catch (MatchException v14) {
                        throw dH.a("n", (Object)v14, (long)-722364160074211180L, (long)var2_2);
                    }
                    dH.a("J", (Object)dH.a("\u00d8", (Object)dH.b, (long)-723252168870202097L, (long)var2_2), (float)this.j, (long)-722473346509190923L, (long)var2_2);
                    dH.a("J", (Object)dH.a("\u00d8", (Object)dH.b, (long)-723252168870202097L, (long)var2_2), (float)this.k, (long)-722156238020282657L, (long)var2_2);
                    dH.a("\u00ca", (Object)dH.a("\u00d8", (Object)dH.b, (long)-723252168870202097L, (long)var2_2), (float)this.l, (long)-722228294446531244L, (long)var2_2);
                    dH.a("\u00ca", (Object)dH.a("\u00d8", (Object)dH.b, (long)-723252168870202097L, (long)var2_2), (float)this.m, (long)-723226954611267387L, (long)var2_2);
                    dH.a("\u00ca", (Object)dH.a("\u00d8", (Object)dH.b, (long)-723252168870202097L, (long)var2_2), (float)this.n, (long)-723152558358728257L, (long)var2_2);
                    dH.a("\u00ca", (Object)dH.a("\u00d8", (Object)dH.b, (long)-723252168870202097L, (long)var2_2), (float)this.o, (long)-723108200943397431L, (long)var2_2);
                    dH.a("\u00ca", (Object)dH.a("\u00d8", (Object)dH.b, (long)-723252168870202097L, (long)var2_2), (float)this.p, (long)-722911805902307041L, (long)var2_2);
                    dH.a("\u00ca", (Object)dH.a("\u00d8", (Object)dH.b, (long)-723252168870202097L, (long)var2_2), (float)this.q, (long)-722800958322564822L, (long)var2_2);
                    v12 = this;
                }
                catch (MatchException v15) {
                    throw dH.a("n", (Object)v15, (long)-722364160074211180L, (long)var2_2);
                }
            }
            v12.i = 0;
        }
    }

    private static void a() {
        Object[] objectArray = s;
        s[0] = ";w\u0017Z<>-w\u0012\u0000/):<\u0011\u0006#=+{\u0006\u0011h*\u001b";
        objectArray[1] = "Eo\u0019C~@0O\u0012Lo\u000fQA\u0019GkU%";
        objectArray[2] = "1\u0005\u0004KJ/'\u0005\u0001\u0011Y80N\u0002\u0017U,!\t\u0015\u0000\u001e;\u0016";
        objectArray[3] = "\u001f{JV\u001f\u001a\t{O\f\f\r\u001e0L\n\u0000\u0019\u000fw[\u001dK\u000b3";
        objectArray[4] = "uU3~\u0006D\u0000u8q\u0017\u000b}m+v\u001eB\u0015";
        objectArray[5] = "C\u0016\u0000rt1C\u0016\u0017.x>Y]\u00170x+^,Gm)";
        objectArray[6] = "\u0010<7S7\u0011\u0010< \u000f;\u001e\nw \u0011;\u000b\r\u0006tIl";
        objectArray[7] = Float.TYPE;
        dH.t[7] = "java/lang/Float";
        objectArray[8] = "&8\u0003\u007f\u0001\t08\u0006%\u0012\u001e's\u0005#\u001e\n64\u00124U\u001a.4\u0010?\u000fW\u0012/\u0010\"\u000f\u0010%8";
        objectArray[9] = "\n\u0004S--g\u0001\u000bBbNj\u0014\r";
        objectArray[10] = Void.TYPE;
        dH.t[10] = "java/lang/Void";
        objectArray[11] = "Q{.\u001c\u0003vG{+F\u0010aP0(@\u001cuAw?WWb}";
        objectArray[12] = "w|\u000e\u0002Z\f|s\u001fM9\u0001i~\u0010&\f\u0003xm\f\n\u001b\u000e";
        objectArray[13] = ";H@4kPNhK;z\u001f/f@0~E[";
        objectArray[14] = ":/N(_S,/KrLD;dHt@P*#_c\u000bZ";
        objectArray[15] = "m\u0018\u0012\u0000\u001eKm\u0018\u0005\\\u0012DwS\u0005B\u0012Qp\"U\u001b@\u0010";
        objectArray[16] = "\u0017%Nsp<\u0001%K)c+\u0016nH/o?\u0007)_8$.<";
        objectArray[17] = " i\u0017\u001do\u0012UI\u001c\u0012~]4G\u0017\u0019z\u0007@";
        objectArray[18] = "\u0014plR^\u0019aPg]OV\u0000^lVK\ft";
        objectArray[19] = "3Y[\u0016M\u001fFyP\u0019\\P'w[\u0012X\nS";
        objectArray[20] = "2\u0004}D }9\u000bl\u000bAs2\u0000hQ";
        objectArray[21] = "kYF2<}v]@]'\u0002jMGe7{xLH3M;h\u0004@`/9<\u000b_]";
        objectArray[22] = "Ui&vuO\u000b<wh\u0013To84s\"S\u001ei$#y>";
        objectArray[23] = "rwi\u0010{L%7`E\u0006\u0018OmgE{I(iuA=";
        objectArray[24] = "i~BLX\u0013mlF\nc\u001d\u0003x\u0003R[\u000ezj\u0002]\rt<x\u0019M\u0005\u000e;uJ\bc";
        objectArray[25] = "\u0018\rT &:\u001a\u0007S:]5B\u0011I0\nb\u001cF\u0011\\ajI\u0011\u00162g:J\u0001";
        objectArray[26] = "D\tv\u0014\u0006VBYu\u0004=V\u0019Ux\u0015j\u0006B\u0004%y\u0000Y\u001aRc\u001bG\u0002A\u0006";
        objectArray[27] = "q\u001d\u001b\n`|wM\u0018\u001a[|,A\u0015\u000b\f/|\u001cKgfs/F\u000e\u0005!(t\u0012";
        objectArray[28] = "]h`M\u0007K[8c]<K\u00004nLk\u001bYa6 \u0001D\u00033uBF\u001fXg";
        objectArray[29] = "Ka\u001dD;\u0004I5\u0012[\u0006\frcTC>\u001c\u000bqULhfOnOJy\u0004\b5\u0014\u001e\u0006";
        objectArray[30] = "F3{Lq.@cx\\J.\u001bouM\u001d~@8)!w!\u0018hnC0zC<";
        objectArray[31] = "R\bo\u0012\fATXl\u00027J\u0003Ee\u0018[xU\u00079B\n/SXg\u0015HM\u0014\u0003<A7";
        objectArray[32] = "q>th8Zwnwx\u0003Z,bziT\nw2/\u0005>U/eagy\u000et1";
        objectArray[33] = "UNJt)\u0007\u0002\u000eC!T^hSC{;H\u0017NG}";
        objectArray[34] = "b YI\u0016L`tVV+G[\"\u0010N\u0013T\"0\u0011AE.f/\u000bGTL!tP\u0013+";
        objectArray[35] = "R\u0007lK\u0002QI\u001bcI>RV\u0016`\u0016R`\u0002W;O\u00057\u0006\u000bb\u001bAUAP9O>\nZ\bj\u000e\\M\u0001S>q\u0003VY\u0000\u007f\u0013D\r\u0002T\u0000L_UQ\u0015b\u000b\u0004\u000e\u0005j";
        objectArray[36] = ")v0O\u0016\u0001ihnN)Y}}\r\u0011HR}yoV\u0013\t)\u00060MKZhdw\u0016\u0010\u000e\u0017";
        objectArray[37] = "3P\u000ePl\f5\u0000\r@W\u0007b\u001d\u0004Z;54_X\u0000ib2\u0000\u0006W(\u0000u[]\u0003W]c\u0002\u0018[-ZnQ]=";
        objectArray[38] = "\u001aFTG\u000f[\u0014PRPtW%\u000fK[\u0019OHTRZK>\u0015FRV\u0005SN_S\u0004t";
        objectArray[39] = "&`8)CSx5i7%K\u001cg!&\u001dXeu )K\"-y >Z^\"p77%";
        objectArray[40] = "\bAh\\Lt\u000e\u0011kLwtU\u001df] $\u000e@91J{V\u001a}S\r \rN";
        objectArray[41] = "*#*\u0002Vh,s)\u0012mc{n \b\u0001Q-,|RR\u0006+s\"\u0005\u0012dl(yQm9zq<\t\u0017>w\"yo";
        objectArray[42] = "Xs(m`=^#+}[6\t>\"g7\u0004_|~=gSY# j$1\u001ex{>[";
        Object[] objectArray2 = objectArray;
        objectArray[43] = "#]\fncP8A\u0003l_S'L\u000033as\r[ed6wQ\u0002> T0\nYj_\u000b+R\n+=Lp\t^T";
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    public boolean a(Object[] objectArray) {
        return this.i;
    }

    private static Field g(long l, long l2) {
        int n = dH.e(l, l2);
        Object object = s[n];
        if (object instanceof String) {
            String string = t[n];
            int n2 = string.indexOf(8);
            Class clazz = dH.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = dH.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = dH.c(clazz3, string2, clazz2)) != null) {
                    dH.s[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = dH.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        dH.s[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = dH.f(1445852460288664L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(dH.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


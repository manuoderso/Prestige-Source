/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_312
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.Q;
import dev.zprestige.prestige.at_0;
import dev.zprestige.prestige.cz_0;
import dev.zprestige.prestige.hc;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.minecraft.class_312;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from dev.zprestige.prestige.au
 */
public class au_0
implements cz_0 {
    private at_0 a = null;
    private static final long c = hc.a(-3586157639734831828L, 4836911634528942032L, MethodHandles.lookup().lookupClass()).a(12419935679986L);
    private static final Object[] d = new Object[39];
    private static final String[] e = new String[39];

    static {
        au_0.a();
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (e[n3] != null) {
            return n3;
        }
        Object object = d[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 6;
            case 1 -> 56;
            case 2 -> 39;
            case 3 -> 10;
            case 4 -> 17;
            case 5 -> 58;
            case 6 -> 54;
            case 7 -> 36;
            case 8 -> 32;
            case 9 -> 50;
            case 10 -> 23;
            case 11 -> 61;
            case 12 -> 7;
            case 13 -> 35;
            case 14 -> 30;
            case 15 -> 9;
            case 16 -> 53;
            case 17 -> 41;
            case 18 -> 4;
            case 19 -> 42;
            case 20 -> 40;
            case 21 -> 60;
            case 22 -> 1;
            case 23 -> 15;
            case 24 -> 26;
            case 25 -> 12;
            case 26 -> 27;
            case 27 -> 25;
            case 28 -> 22;
            case 29 -> 3;
            case 30 -> 57;
            case 31 -> 18;
            case 32 -> 5;
            case 33 -> 33;
            case 34 -> 46;
            case 35 -> 52;
            case 36 -> 24;
            case 37 -> 21;
            case 38 -> 34;
            case 39 -> 16;
            case 40 -> 63;
            case 41 -> 44;
            case 42 -> 49;
            case 43 -> 59;
            case 44 -> 43;
            case 45 -> 28;
            case 46 -> 19;
            case 47 -> 2;
            case 48 -> 11;
            case 49 -> 38;
            case 50 -> 0;
            case 51 -> 14;
            case 52 -> 48;
            case 53 -> 31;
            case 54 -> 45;
            case 55 -> 51;
            case 56 -> 29;
            case 57 -> 20;
            case 58 -> 37;
            case 59 -> 62;
            case 60 -> 55;
            case 61 -> 8;
            case 62 -> 13;
            default -> 47;
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
        au_0.e[n3] = new String(cArray);
        return n3;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'P' || c == '\u00fc' || c == '\u00d3' || c == 'C') {
                field = au_0.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'P' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00fc' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00d3' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = au_0.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'Z' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c2' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = au_0.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
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

    private static Method h(long l, long l2) {
        int n = au_0.e(l, l2);
        Object object = d[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = e[n];
                int n3 = string2.indexOf(8);
                clazz3 = au_0.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = au_0.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = au_0.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        au_0.d[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = au_0.f(1697270712315221L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = au_0.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        au_0.d[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = au_0.f(1697270712315221L, 0L);
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
            int n = au_0.e(l, l2);
            object = d[n];
            try {
                if (!(object instanceof String)) break block2;
                au_0.d[n] = clazz = Class.forName(e[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = au_0.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = au_0.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = au_0.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = au_0.d(classArray[i], string, clazz2);
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
            throw new RuntimeException("dev/zprestige/prestige/au" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public boolean a(Object[] objectArray) {
        block18: {
            float f;
            block21: {
                block22: {
                    CallSite callSite;
                    long l;
                    long l2;
                    block19: {
                        float f10;
                        block20: {
                            l2 = (Long)objectArray[0];
                            l = (l2 = c ^ l2) ^ 0x7452141E9C71L;
                            callSite = au_0.a("\u00c2", (long)-7376991755717438389L, (long)l2);
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                if (this.a == null) break block18;
                                                float f11 = (float)(au_0.a("\u00c2", (long)-7381367104687127783L, (long)l2) - au_0.a("Z", (Object)this.a, (Object)new Object[0], (long)-7381290433924349265L, (long)l2)) - au_0.a("Z", (Object)this.a, (Object)new Object[0], (long)-7380928053505071907L, (long)l2);
                                                f = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
                                                if (callSite != null) break block19;
                                            }
                                            catch (MatchException matchException) {
                                                throw au_0.a("\u00c2", (Object)matchException, (long)-7381104562843385043L, (long)l2);
                                            }
                                            if (f <= 0) break block20;
                                        }
                                        catch (MatchException matchException) {
                                            throw au_0.a("\u00c2", (Object)matchException, (long)-7381104562843385043L, (long)l2);
                                        }
                                        f = (float)au_0.a("Z", (Object)this.a, (Object)new Object[0], (long)-7377215660855706268L, (long)l2);
                                        if (callSite != null) break block19;
                                    }
                                    catch (MatchException matchException) {
                                        throw au_0.a("\u00c2", (Object)matchException, (long)-7381104562843385043L, (long)l2);
                                    }
                                    if (f != false) break block20;
                                }
                                catch (MatchException matchException) {
                                    throw au_0.a("\u00c2", (Object)matchException, (long)-7381104562843385043L, (long)l2);
                                }
                                Object[] objectArray2 = new Object[5];
                                objectArray2[4] = l;
                                objectArray2[3] = 0;
                                objectArray2[2] = 1;
                                objectArray2[1] = (int)au_0.a("Z", (Object)this.a, (Object)new Object[0], (long)-7377277541005433626L, (long)l2);
                                objectArray2[0] = (long)au_0.a("Z", (Object)au_0.a("Z", (Object)b, (long)-7377063525006719880L, (long)l2), (long)-7377401258610043516L, (long)l2);
                                au_0.a("Z", (Object)new Q((class_312)au_0.a("P", (Object)b, (long)-7377353966114026788L, (long)l2)), (Object)objectArray2, (long)-7376904930430579781L, (long)l2);
                                au_0.a("Z", (Object)this.a, (Object)new Object[]{true}, (long)-7380869148250521938L, (long)l2);
                            }
                            catch (MatchException matchException) {
                                throw au_0.a("\u00c2", (Object)matchException, (long)-7381104562843385043L, (long)l2);
                            }
                        }
                        f = (f10 = (float)(au_0.a("\u00c2", (long)-7381367104687127783L, (long)l2) - au_0.a("Z", (Object)this.a, (Object)new Object[0], (long)-7381290433924349265L, (long)l2)) - au_0.a("Z", (Object)this.a, (Object)new Object[0], (long)-7380928053505071907L, (long)l2)) == 0.0f ? 0 : (f10 > 0.0f ? 1 : -1);
                    }
                    try {
                        try {
                            try {
                                try {
                                    if (callSite != null) break block21;
                                    if (f <= 0) break block22;
                                }
                                catch (MatchException matchException) {
                                    throw au_0.a("\u00c2", (Object)matchException, (long)-7381104562843385043L, (long)l2);
                                }
                                float f12 = (float)(au_0.a("\u00c2", (long)-7381367104687127783L, (long)l2) - au_0.a("Z", (Object)this.a, (Object)new Object[0], (long)-7381290433924349265L, (long)l2)) - (au_0.a("Z", (Object)this.a, (Object)new Object[0], (long)-7380928053505071907L, (long)l2) + au_0.a("Z", (Object)this.a, (Object)new Object[0], (long)-7381197339928690886L, (long)l2));
                                f = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
                                if (callSite != null) break block21;
                            }
                            catch (MatchException matchException) {
                                throw au_0.a("\u00c2", (Object)matchException, (long)-7381104562843385043L, (long)l2);
                            }
                            if (f <= 0) break block22;
                        }
                        catch (MatchException matchException) {
                            throw au_0.a("\u00c2", (Object)matchException, (long)-7381104562843385043L, (long)l2);
                        }
                        Object[] objectArray3 = new Object[5];
                        objectArray3[4] = l;
                        objectArray3[3] = 0;
                        objectArray3[2] = 0;
                        objectArray3[1] = (int)au_0.a("Z", (Object)this.a, (Object)new Object[0], (long)-7377277541005433626L, (long)l2);
                        objectArray3[0] = (long)au_0.a("Z", (Object)au_0.a("Z", (Object)b, (long)-7377063525006719880L, (long)l2), (long)-7377401258610043516L, (long)l2);
                        au_0.a("Z", (Object)new Q((class_312)au_0.a("P", (Object)b, (long)-7377353966114026788L, (long)l2)), (Object)objectArray3, (long)-7376904930430579781L, (long)l2);
                        this.a = null;
                    }
                    catch (MatchException matchException) {
                        throw au_0.a("\u00c2", (Object)matchException, (long)-7381104562843385043L, (long)l2);
                    }
                }
                f = 1;
            }
            return (boolean)f;
        }
        return false;
    }

    public void a(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        long l = (Long)objectArray[2];
        long l2 = (l = c ^ l) ^ 0x1384CCE98626L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l2;
        objectArray2[1] = Float.valueOf(15.0f);
        objectArray2[0] = Float.valueOf(5.0f);
        Object[] objectArray3 = new Object[3];
        objectArray3[2] = l2;
        objectArray3[1] = Float.valueOf(55.0f);
        objectArray3[0] = Float.valueOf(35.0f);
        Object[] objectArray4 = new Object[3];
        objectArray4[2] = l2;
        objectArray4[1] = Float.valueOf((float)au_0.a("\u00c2", (Object)objectArray3, (long)-2349925271743183939L, (long)l));
        objectArray4[0] = Float.valueOf((float)au_0.a("\u00c2", (Object)objectArray2, (long)-2349925271743183939L, (long)l));
        this.a = new at_0(n, (long)au_0.a("\u00c2", (long)-2350315292429810197L, (long)l), f, (float)au_0.a("\u00c2", (Object)objectArray4, (long)-2349925271743183939L, (long)l), false);
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static void a() {
        Object[] objectArray = d;
        d[0] = "{P\u0011pP\u001b{P\u0006,\\\u0014a\u001b\u00062\\\u0001fjVo\r";
        objectArray[1] = "<\u001a\f-i8<\u001a\u001bqe7&Q\u001boe\"! I30`";
        objectArray[2] = "f\u0001\u001eob|p\u0001\u001b5qkgJ\u00183}\u007fv\r\u000f$6mJ";
        objectArray[3] = "Pb}Bp[%BvMa\u0014XZeJh]0";
        objectArray[4] = "4RA%HY\"RD\u007f[N5\u0019GyWZ$^Pn\u001cx";
        objectArray[5] = "1OD\u007f\u0003\u0004DoOp\u0012K%aD{\u0016\u0011Q";
        objectArray[6] = Void.TYPE;
        au_0.e[6] = "java/lang/Void";
        objectArray[7] = Long.TYPE;
        au_0.e[7] = "java/lang/Long";
        objectArray[8] = "\u0004c\u001cRu~\u0004c\u000b\u000eyq\u001e(\u000b\u0010yd\u0019Y[M*";
        objectArray[9] = "4?eU`\u0011\"?`\u000fs\u00065tc\t\u007f\u0012$3t\u001e4\u0000$";
        objectArray[10] = "uR\u0000\u0007\b|\u0000r\u000b\b\u00193a|\u0000\u0003\u001di\u0015";
        objectArray[11] = Integer.TYPE;
        au_0.e[11] = "java/lang/Integer";
        objectArray[12] = "!q\\Oi\"TQW@xm5_\\K|7A";
        objectArray[13] = Boolean.TYPE;
        au_0.e[13] = "java/lang/Boolean";
        objectArray[14] = "(t\u0013 1\u001f>t\u0016z\"\b)?\u0015|.\u001c8x\u0002ke\u000e9";
        objectArray[15] = "D\u0007i;\u0011$O\bxtr)Z\u0005w\u001fG+K\u0016k3P&";
        objectArray[16] = "ocI,l\u007f\u001aCB#}0{MI(yj\u000f";
        objectArray[17] = Float.TYPE;
        au_0.e[17] = "java/lang/Float";
        objectArray[18] = "\n\u0007\r oo\u007f'\u0006/~ \u001e)\r$zzj";
        objectArray[19] = "Z8W\u001ao\u0002Q7FU\u0012\u0017C-D\u0016";
        objectArray[20] = "/\u0014V\u001e\u00164Z4]\u0011\u0007{;:V\u001a\u0003!O";
        objectArray[21] = "0^\\\u00035{E~W\f$4$p\\\u0007 nP";
        objectArray[22] = "\u000e|O}\u0017x\u0018|J'\u0004o\u000f7I!\b{\u001ep^6Cl\u0004";
        objectArray[23] = "\u0012wm]A^gWfRP\u0011\u0006YmYTKr";
        objectArray[24] = "W3!=\fq\\<0rm\u007fW74(";
        objectArray[25] = "9<GMP'.xK/H.)`ACzyo>\u0016\u0014-8m=X\u0011\u0015|<q&";
        objectArray[26] = "\u0017G+\u000bq'\u0012\u0006\u007fS\u00112.\u0005uA}cDSlOwX";
        objectArray[27] = "~S\\\u0013\t\u000f{W\tMn\u0005E\u0005\b\b\u000e\t\u007f\f\u001e\n\u0010ly\u000fRO\u0014\u0007(\u0013\bMn";
        objectArray[28] = "\r:zYNMIk6'\u0015\u0018\nb K'IJ3\u007f'MIHk#F\u0011\u0016\u0010hG";
        objectArray[29] = "\u001e$a\u0015W-\t`mwD(\u001f|l \u0013vH)\u0000JI6\u0002#z\u0018C \u0016";
        objectArray[30] = "2:MM5=c>\u0005UG5\f,VR'96%@P9\\39PJ*#63\u0006OG";
        objectArray[31] = "\u0012\bVG3\u0014C\f\u001e_A\u001c,\u001eMX!\u0010\u0016\u0017[Z?u\u001dHK\u001bq\u0007GNOOA";
        objectArray[32] = "\u0005\n\u001c=\fL\rCR w\u001flZN!\u0011O\u001cWM%\u0012v\u0005QO$N\u0006\bRK'w";
        objectArray[33] = "MP*\u0014y\rC\u00028\u0011\u0016Z#S=WvV\u0019Z+Uh3HUlHl\fNUh\u0015\u0016";
        objectArray[34] = ".C\f}\u001dX\u007fGDeoP\u0010U\u0017b\u000f\\*\\\u0001`\u00119{SF}\u0015\u0006}SB o";
        objectArray[35] = "gCP?<F6G\u0018'NNYUK .Bc\\]\"0'e_\u0011g4L4CKeN";
        objectArray[36] = "r;\u001976?/%];\u0006:c9\u001cg`-B\"\u0003gC0z'\u0007q\u0006l\"}\u000fng0}%\f\n";
        objectArray[37] = "WG\ruIZ\u0006CEm;RiQ\u0016j[^SX\u0000hE;T\u0002C}_Z\b]\u001b~;";
        Object[] objectArray2 = objectArray;
        objectArray[38] = "eA!\u0003h\u00014Ei\u001b\u001a\n[W:\u001cz\u0005a^,\u001ed`0Qk\u0003`_6Qo^\u001a";
    }

    private static Field g(long l, long l2) {
        int n = au_0.e(l, l2);
        Object object = d[n];
        if (object instanceof String) {
            String string = e[n];
            int n2 = string.indexOf(8);
            Class clazz = au_0.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = au_0.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = au_0.c(clazz3, string2, clazz2)) != null) {
                    au_0.d[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = au_0.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        au_0.d[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = au_0.f(1697270712315221L, 0L);
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
            return MethodHandles.lookup().findStatic(au_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


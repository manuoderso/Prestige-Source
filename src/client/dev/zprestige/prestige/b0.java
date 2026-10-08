/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_243
 *  net.minecraft.class_2680
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.b1;
import dev.zprestige.prestige.cz_0;
import dev.zprestige.prestige.f5;
import dev.zprestige.prestige.hc;
import dev.zprestige.prestige.s_0;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.minecraft.class_243;
import net.minecraft.class_2680;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class b0
implements cz_0 {
    private final f5 a;
    public class_243 b;
    public class_243 c;
    public class_243 d;
    public class_243 e;
    public final b1 f;
    public final s_0 g;
    private static final long h = hc.a(1177911024528357670L, 4687494942449982638L, MethodHandles.lookup().lookupClass()).a(142496626447990L);
    private static final Object[] i = new Object[33];
    private static final String[] j = new String[33];

    public b0(class_243 class_2432, class_243 class_2433, s_0 s_02, long l) {
        long l2 = l = h ^ l;
        long l3 = l2 ^ 0x4108525D9DAEL;
        long l4 = l2 ^ 0x3F299C179AEL;
        long l5 = l2 ^ 0x68777F560161L;
        this.a = new f5(l3);
        this.b = class_2432;
        this.c = class_2433;
        this.e = class_2433;
        this.d = new class_243((double)((b0.a("o", (long)7365134765976251211L, (long)l) * 0.5 - 0.25) * 0.01), (double)(b0.a("o", (long)7365134765976251211L, (long)l) * 0.25 * 0.01), (double)((b0.a("o", (long)7365134765976251211L, (long)l) * 0.5 - 0.25) * 0.01));
        this.g = s_02;
        Object[] objectArray = new Object[1];
        objectArray[0] = l5;
        this.f = b0.a("\u00c4", (Object)this, (Object)objectArray, (long)7364711921507337812L, (long)l);
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l4;
        b0.a("\u00c4", (Object)this.a, (Object)objectArray2, (long)7364727345224623556L, (long)l);
    }

    static {
        b0.a();
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (j[n3] != null) {
            return n3;
        }
        Object object = i[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 36;
            case 1 -> 27;
            case 2 -> 49;
            case 3 -> 29;
            case 4 -> 37;
            case 5 -> 60;
            case 6 -> 26;
            case 7 -> 8;
            case 8 -> 48;
            case 9 -> 53;
            case 10 -> 0;
            case 11 -> 39;
            case 12 -> 11;
            case 13 -> 12;
            case 14 -> 15;
            case 15 -> 52;
            case 16 -> 14;
            case 17 -> 55;
            case 18 -> 63;
            case 19 -> 23;
            case 20 -> 44;
            case 21 -> 58;
            case 22 -> 9;
            case 23 -> 45;
            case 24 -> 13;
            case 25 -> 41;
            case 26 -> 18;
            case 27 -> 46;
            case 28 -> 61;
            case 29 -> 57;
            case 30 -> 42;
            case 31 -> 31;
            case 32 -> 43;
            case 33 -> 2;
            case 34 -> 6;
            case 35 -> 4;
            case 36 -> 62;
            case 37 -> 19;
            case 38 -> 7;
            case 39 -> 22;
            case 40 -> 25;
            case 41 -> 47;
            case 42 -> 32;
            case 43 -> 5;
            case 44 -> 34;
            case 45 -> 3;
            case 46 -> 56;
            case 47 -> 50;
            case 48 -> 24;
            case 49 -> 59;
            case 50 -> 38;
            case 51 -> 21;
            case 52 -> 1;
            case 53 -> 20;
            case 54 -> 51;
            case 55 -> 28;
            case 56 -> 30;
            case 57 -> 54;
            case 58 -> 16;
            case 59 -> 17;
            case 60 -> 35;
            case 61 -> 40;
            case 62 -> 10;
            default -> 33;
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
        b0.j[n3] = new String(cArray);
        return n3;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'y' || c == '\u00aa' || c == '\u00b5' || c == '\u00de') {
                field = b0.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'y' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00aa' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00b5' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = b0.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00c4' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'o' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = b0.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public class_243 b(Object[] objectArray) {
        return this.c;
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

    public class_243 c(Object[] objectArray) {
        return this.d;
    }

    private static Method h(long l, long l2) {
        int n = b0.e(l, l2);
        Object object = i[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = j[n];
                int n3 = string2.indexOf(8);
                clazz3 = b0.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = b0.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = b0.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        b0.i[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = b0.f(1371753693255388L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = b0.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        b0.i[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = b0.f(1371753693255388L, 0L);
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
            int n = b0.e(l, l2);
            object = i[n];
            try {
                if (!(object instanceof String)) break block2;
                b0.i[n] = clazz = Class.forName(j[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = b0.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = b0.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = b0.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = b0.d(classArray[i], string, clazz2);
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
            throw new RuntimeException("dev/zprestige/prestige/b0" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static boolean a(Object[] objectArray) {
        Object object;
        block10: {
            block12: {
                block11: {
                    class_2680 class_26802 = (class_2680)objectArray[0];
                    long l = (Long)objectArray[1];
                    l = h ^ l;
                    CallSite callSite = b0.a("o", (long)3923130273820082232L, (long)l);
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        object = b0.a("\u00c4", (Object)class_26802, (long)3923560565961951426L, (long)l);
                                        if (callSite != null) break block10;
                                        if (object != false) break block11;
                                    }
                                    catch (MatchException matchException) {
                                        throw b0.a("o", (Object)matchException, (long)3923426611092558067L, (long)l);
                                    }
                                    object = b0.a("\u00c4", (Object)class_26802, (long)3923369755651938509L, (long)l);
                                    if (callSite != null) break block10;
                                }
                                catch (MatchException matchException) {
                                    throw b0.a("o", (Object)matchException, (long)3923426611092558067L, (long)l);
                                }
                                if (object != false) break block11;
                            }
                            catch (MatchException matchException) {
                                throw b0.a("o", (Object)matchException, (long)3923426611092558067L, (long)l);
                            }
                            object = b0.a("\u00c4", (Object)b0.a("\u00c4", (Object)class_26802, (long)3923003482090653070L, (long)l), (long)3923283553248393738L, (long)l);
                            if (callSite != null) break block10;
                        }
                        catch (MatchException matchException) {
                            throw b0.a("o", (Object)matchException, (long)3923426611092558067L, (long)l);
                        }
                        if (object != false) break block12;
                    }
                    catch (MatchException matchException) {
                        throw b0.a("o", (Object)matchException, (long)3923426611092558067L, (long)l);
                    }
                }
                object = 1;
                break block10;
            }
            object = 0;
        }
        return (boolean)object;
    }

    public s_0 a(Object[] objectArray) {
        return this.g;
    }

    public f5 a(Object[] objectArray) {
        return this.a;
    }

    public class_243 a(Object[] objectArray) {
        return this.e;
    }

    public float a(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        long l = (Long)objectArray[1];
        long l2 = (l = h ^ l) ^ 0x28D45F78285AL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        return (float)b0.a("o", (float)1.0f, (float)(b0.a("\u00c4", (Object)this.a, (Object)objectArray2, (long)-5283179971968841517L, (long)l) / f), (long)-5287174275619890354L, (long)l);
    }

    private static void a() {
        Object[] objectArray = i;
        i[0] = "i\u0014{F9\u0002\u007f\u0014~\u001c*\u0015h_}\u001a&\u0001y\u0018j\rm\u0001";
        objectArray[1] = Integer.TYPE;
        b0.j[1] = "java/lang/Integer";
        objectArray[2] = "n\u0015OJS\u0018x\u0015J\u0010@\u000fo^I\u0016L\u001b~\u0019^\u0001\u0007\n:";
        objectArray[3] = "S\u0018?T\u007f:X\u0017.\u001b\u001c7M\u001a!p)5\\\t=\\>8";
        objectArray[4] = "cI\u0010Y3;cI\u0007\u0005?4y\u0002\u0007\u001b?!~sVAfb";
        objectArray[5] = "Xc%\u0004e\u001aXc2Xi\u0015B(2Fi\u0000EYb\u001c9C";
        objectArray[6] = "_ju\u000b\u0012mIjpQ\u0001z^!sW\rnOfd@F|s";
        objectArray[7] = "\u000fPv'\\czp}(M,\u0007hn/Deo";
        objectArray[8] = Boolean.TYPE;
        b0.j[8] = "java/lang/Boolean";
        objectArray[9] = "\f&33\u001d\u0004\u001a&6i\u000e\u0013\rm5o\u0002\u0007\u001c*\"xI\u0012]";
        objectArray[10] = "\u0005@}e=\u000ep`vj,A\u0011n}a(\u001be";
        objectArray[11] = Float.TYPE;
        b0.j[11] = "java/lang/Float";
        objectArray[12] = ";\u0001k\u001d}\u00150\u000ezR\u001e\u0018%\b";
        objectArray[13] = "\u0012R\u0001umX\u0004R\u0004/~O\u0013\u0019\u0007)r[\u0002^\u0010>9JG";
        objectArray[14] = "``Y=~'\u0015@R2ohtNY9k2\u0000";
        objectArray[15] = Void.TYPE;
        b0.j[15] = "java/lang/Void";
        objectArray[16] = Double.TYPE;
        b0.j[16] = "java/lang/Double";
        objectArray[17] = "%[!Jx$P{*Eik1u!Nm1E";
        objectArray[18] = "EI{V+\u00140ipY:[Qg{R>\u0001%";
        objectArray[19] = "=i61?,6f'~^\"=m#$";
        objectArray[20] = "T\u001cNs\u0015BV\u000fY1o\u0017\u0002\tU.\u0003%UK\u000fsPrT\u0005\u000b0\bOP\u0011Y9o";
        objectArray[21] = "\b5(\u001bjZ[\"b\u001d\u0005\u0019Q\">\u0006`cR)\"\u0002\u007f^\u0006|7\f\u0005";
        objectArray[22] = "zveyJe4)>(5\u007fF+6iVp:ly(^\u0015";
        objectArray[23] = "$);o:Poky\u000b%Uy4#b&/d5?4%P{0u\u000b";
        objectArray[24] = ";6Z;wK?\"\b2\u0010\u0013m:\u0004%|!9{[|!v=>^-oOk(T<\u0010";
        objectArray[25] = "\u0010\u0011' ;\"QLm3G/.\u0017+=&4I\u0012')<F\u001eA)v6*AF9-G";
        objectArray[26] = "\u001f@{-^\u001eC\u0000&s%\u0006%@\"-X\u0014E\u0015}+\u0015o\u001f\u001b|o^\u000fJDz\"%";
        objectArray[27] = "\u0002\u000e,`!\u0017\u0000\u001d;\"[BT\u001b7=7p\u0005Zkeg'\u0004\u001fm5$\u001eR\tg$[";
        objectArray[28] = "PV\u001b\u0001$7RE\fC^b\u0006C\u0000\\2PQ\u0001Z\u0002c\u0007VGZT!>\u0000QPE^";
        objectArray[29] = "wbRzT:;b]bn8F1Fn\u000f#!4Jz\u0015Q,`Zo^ 9`H.n";
        objectArray[30] = "89e#=Uyd/0AX\u0006?i> Ca:e*:1lnu?q@yng~A";
        objectArray[31] = "G_&jQ0\u001b\u001f{4*(}\u000e`$K3\u001a\u000bl0QAL]t0\u0010*\u0000]{(*";
        Object[] objectArray2 = objectArray;
        objectArray[32] = "\u001b<C<S\u000eH+\t:<RJ+9v\u0001K\u0011<U)\u0006[JM\t{@\rZ!V|PV+}\u0004:\u0006FG\"\u0003*]7";
    }

    /*
     * Exception decompiling
     */
    private b1 a(Object[] var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 1[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    public void a(Object[] objectArray) {
        boolean bl = (Boolean)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = (l = h ^ l) ^ 0x43835833CD27L;
        this.e = this.c;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l2;
        objectArray2[1] = bl;
        objectArray2[0] = this;
        b0.a("\u00c4", (Object)this.f, (Object)objectArray2, (long)-5734669642730719249L, (long)l);
    }

    private static Field g(long l, long l2) {
        int n = b0.e(l, l2);
        Object object = i[n];
        if (object instanceof String) {
            String string = j[n];
            int n2 = string.indexOf(8);
            Class clazz = b0.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = b0.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = b0.c(clazz3, string2, clazz2)) != null) {
                    b0.i[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = b0.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        b0.i[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = b0.f(1371753693255388L, 0L);
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
            return MethodHandles.lookup().findStatic(b0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


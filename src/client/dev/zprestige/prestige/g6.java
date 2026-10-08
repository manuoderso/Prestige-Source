/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1299
 *  net.minecraft.class_1309
 *  net.minecraft.class_1665
 *  net.minecraft.class_1799
 *  net.minecraft.class_1937
 *  net.minecraft.class_243
 *  net.minecraft.class_3965
 *  net.minecraft.class_3966
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.hc;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.minecraft.class_1297;
import net.minecraft.class_1299;
import net.minecraft.class_1309;
import net.minecraft.class_1665;
import net.minecraft.class_1799;
import net.minecraft.class_1937;
import net.minecraft.class_243;
import net.minecraft.class_3965;
import net.minecraft.class_3966;

final class g6
extends class_1665 {
    public boolean a;
    private static final long b = hc.a(3135032185919111743L, -6462406868818591335L, MethodHandles.lookup().lookupClass()).a(53352406182906L);
    private static final Object[] c = new Object[49];
    private static final String[] d = new String[49];

    public g6(class_1937 class_19372, class_1309 class_13092, class_1799 class_17992, long l) {
        l = b ^ l;
        super((class_1299)g6.a("\u00d6", (long)5239772267451468485L, (long)l), class_13092, class_19372, class_17992, class_17992);
    }

    static {
        g6.a();
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = g6.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = g6.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = g6.a(l, l2);
            object = c[n];
            try {
                if (!(object instanceof String)) break block2;
                g6.c[n] = clazz = Class.forName(d[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = g6.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = g6.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l, long l2) {
        int n = g6.a(l, l2);
        Object object = c[n];
        if (object instanceof String) {
            String string = d[n];
            int n2 = string.indexOf(8);
            Class clazz = g6.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = g6.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = g6.a(clazz3, string2, clazz2)) != null) {
                    g6.c[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = g6.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        g6.c[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = g6.b(1134725188954668L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = g6.a(l, l2);
        Object object = c[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = d[n];
                int n3 = string2.indexOf(8);
                clazz3 = g6.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = g6.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = g6.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        g6.c[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = g6.b(1134725188954668L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = g6.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        g6.c[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = g6.b(1134725188954668L, 0L);
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

    private static Method a(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/g6" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = g6.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00f8' || c == '\u00cf' || c == '\u00d6' || c == '\u00dc') {
                field = g6.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00f8' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00cf' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00d6' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = g6.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'U' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c2' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (d[n3] != null) {
            return n3;
        }
        Object object = c[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 39;
            case 1 -> 5;
            case 2 -> 24;
            case 3 -> 59;
            case 4 -> 7;
            case 5 -> 17;
            case 6 -> 15;
            case 7 -> 1;
            case 8 -> 2;
            case 9 -> 14;
            case 10 -> 32;
            case 11 -> 47;
            case 12 -> 0;
            case 13 -> 20;
            case 14 -> 63;
            case 15 -> 9;
            case 16 -> 44;
            case 17 -> 52;
            case 18 -> 61;
            case 19 -> 54;
            case 20 -> 4;
            case 21 -> 16;
            case 22 -> 22;
            case 23 -> 40;
            case 24 -> 58;
            case 25 -> 51;
            case 26 -> 45;
            case 27 -> 46;
            case 28 -> 25;
            case 29 -> 11;
            case 30 -> 38;
            case 31 -> 13;
            case 32 -> 26;
            case 33 -> 21;
            case 34 -> 36;
            case 35 -> 62;
            case 36 -> 57;
            case 37 -> 50;
            case 38 -> 6;
            case 39 -> 23;
            case 40 -> 41;
            case 41 -> 8;
            case 42 -> 30;
            case 43 -> 33;
            case 44 -> 18;
            case 45 -> 10;
            case 46 -> 49;
            case 47 -> 56;
            case 48 -> 12;
            case 49 -> 35;
            case 50 -> 53;
            case 51 -> 37;
            case 52 -> 31;
            case 53 -> 3;
            case 54 -> 55;
            case 55 -> 34;
            case 56 -> 27;
            case 57 -> 60;
            case 58 -> 28;
            case 59 -> 42;
            case 60 -> 43;
            case 61 -> 29;
            case 62 -> 19;
            default -> 48;
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
        g6.d[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = c;
        c[0] = "f~[bLTp~^8_Cg5]>SWvrJ)\u0018C4";
        objectArray[1] = ".f|QW .fk\r[/4-k\u0013[:3\\9M\u0003~";
        objectArray[2] = Boolean.TYPE;
        g6.d[2] = "java/lang/Boolean";
        objectArray[3] = "\u007fOpP3\u0005\u007fOg\f?\ne\u0004g\u0012?\u001fbu5LgU";
        objectArray[4] = "\t~\u0019-L\b\t~\u000eq@\u0007\u00135\u000eo@\u0012\u0014D_7\u0012";
        objectArray[5] = Double.TYPE;
        g6.d[5] = "java/lang/Double";
        objectArray[6] = Float.TYPE;
        g6.d[6] = "java/lang/Float";
        objectArray[7] = Void.TYPE;
        g6.d[7] = "java/lang/Void";
        objectArray[8] = "\u0006\u00018\u001e~y\u0006\u0001/Brv\u001cJ/\\rc\u001b;\u007f\u0005 \"";
        objectArray[9] = ")xR\u0011Cy?xWKPn(3TM\\z9tCZ\u0017h\u0005";
        objectArray[10] = "\u000b`fMG\u001b~@mBVT\u0003X~E_\u001dk";
        objectArray[11] = "HY\u007fk^pHYh7R\u007fR\u0012h)RjUc9v\n=EPj6@F\u0014\b;";
        objectArray[12] = "i \u0001eg\u0002b/\u0010*\u0004\u000fw\"\u001fA1\rf1\u0003m&\u0000";
        objectArray[13] = "\u007f/@&Hm\u007f/WzDbedWdDwb\u0015\u0005>\u00121";
        objectArray[14] = "\u000e</z\u0010\u000b\u0010455X\u000b\n>-rQ\u0010J\r+~Z\u0017\u0007<-~";
        objectArray[15] = "{E\u00103nm{E\u0007obba\u000e\u0007qbwf\u007fV.:";
        objectArray[16] = "\u000250A\u0012x\t:!\u000esv\u00021%T";
        objectArray[17] = "{$aOwL;ni\u0000\u0006O,\"p\u0018j}xf*F\u0006\u0016|5h\u0006>\u0010%#,\u007f<P0na\u0019|\u001a8!\u0010";
        objectArray[18] = ")_\u0017\u0002\u0006\u000bq\\\u0013k\f_0Z\u0012\u0007>\tr\u0006HTi\u000e/DL\t\u0004Y#B\u0004kTRsK\u0012\u0011\u001b^uXu";
        objectArray[19] = "\u0001U$\".'\u0007R\u007f0M*?\u0006x* 9EPt4(@";
        objectArray[20] = "l\"\u0011e)E4!\u0015\f#\u0011u'\u0014`\u0011F2|J3F@4,\u000bu~Fm:O\f";
        objectArray[21] = "\u0007-dN\u0003p\u0005('SfnY%r_19\u0003s-3YeJ5sC[`\t(";
        objectArray[22] = ">0\u0014)RWf3\u0010@Tnk%\u0007*Q\u00142j\u0010y=^+$\u001c,G\u0007d3O@";
        objectArray[23] = "^6DMDb\u00065@$N6G3AH|e\u0002o\u001e\u0015+f[lWCQ)WjD$";
        objectArray[24] = "6#S\u0001\bAn Wh\u0002\u0015/&V\u00040Bmw\fXgAl(HU[\u00118vWh^\u0014,?O\u0013\u0018E4}1";
        objectArray[25] = "\u0018hE\u0001o\r@kAheY\u0001m@\u0004W\tB<\u0016h9X\u0002tY\u0013\u007f\t\u001a6'";
        objectArray[26] = "UN\f:\u0016'\rM\bS\u001csLK\t?.'\u0000\u0014_cy$JZ^\"\u001fd\u0000R\u0011S";
        objectArray[27] = " LNiWYxOJ\u0000]\r9IKlo]u\u0010\u0010\u0000\u0004].QU8\u0002\u00048\u0015,<\u0005\u000b=P\u0014:\\\u001dy)\u0010=S\u0018<\u0011\u0016dE\\E\u0014L?I\u0007?[@9Z`";
        objectArray[28] = "*\\\u0000\u0016\"kr_\u0004\u007f(?3Y\u0005\u0013\u001aiq\u0005_BMn,G[\u001d 9 A\u0013\u007f";
        objectArray[29] = "EbQ,.\t\u001daUE$]\\gT)\u0016\n\u001b<\t|A\f\u001dlK<y\nDz\u000fE";
        objectArray[30] = "dQ?\u001e\u0014><R;w\u0015flP1 F61\u000e]K\u0018y8V0\u001c\u0014\u007fp";
        objectArray[31] = "\u000e\u001e\u0004->\u0007V\u001d\u0000D4S\u0017\u001b\u0001(\u0006\u0003TG^DhR\u0014\u0002\u0018?.\u0003\f@f";
        objectArray[32] = "\u0012eXR\u0011?\u001e9_\u001bp\"Nx\u0007\r\u001c\u0010\u001f5V[OG\u001a;\t\u0013M{JoW\fpvQzZ\u0005L(\u0013m\u001cj\u00197Eh_\r\u000e&Ljg";
        objectArray[33] = "\u0014q\u0006\n)B\u0013uU\u000bV\u001fDp\nW:-\u00101Q\fgz\u00151\u0001H/B\u0013h\u0017\fVF\u0014g\u0012In@MqV0jGBt\u0013\bl\u001eT0j";
        objectArray[34] = "}\u001eG\u0013S`=TO\\\"h&\tROu?|Y\u000f#\u001e;,\u001cO\u001b\u0018b:X";
        objectArray[35] = "m,z~,,-fr1]/:*k)1\u001dli1pbJkk`6$rm2vr]";
        objectArray[36] = "&Q;'[7~R?NQc?T>\"c1\u007f\u0004iN]~%Xa)Jo,ZYsT12S#<X7!4";
        objectArray[37] = "#\u0012MPRv{\u0011I9X\":\u0017HUjtxK\u0012\u0005=s%\t\u0016[P$)\u000f^9";
        objectArray[38] = "\nwtI uRtp *!\u0013rqL\u0018wQ.+\u001eOp\fl/B\"'\u0000jg r,PcqZ= Vp\u0016";
        objectArray[39] = "R#>~\u001f=\u0012i61n5\t4+\"9bSdwNRf\u0003!6vT?\u0015e";
        objectArray[40] = "\u0001i{(\u001aUYj\u007fA\u0010\u0001\u0018l~-\"VZ='{uQ\u00043h&\u000f\u001e\b5{A";
        objectArray[41] = "53/TT-uy'\u001b%.b5>\u0003I\u001c6qdU%qu8n\u0015C1?0!d";
        objectArray[42] = "*\u0015KEa\nr\u0016O,k^3\u0010N@Y\n\u007fO\u0018\u001d\u000e\t5\u0001\u0019]hI\u007f\tV,3Sp\u0001NV|_v\u0012)";
        objectArray[43] = "\u001eQNd)\u0000FRJ\r#T\u0007TKa\u0011\u0000K\u0004\u00145F\u0005F_Tt~\u0003\u001fI\u0010\rz\u0004\u0010LU5|]\u0006\b,1{R\u0003M\u00147\"DG4\u0011myH\u001cN^a\u007f[{";
        objectArray[44] = "\u0001C\u00025\u0005$Y@\u0006\\\u0004|\tB\f\u000bT%\\\u001a``\tc]D\r7\u0005e\u0015";
        objectArray[45] = "_T5;<)\u0000\u0006%?V5\u0004T=:\u0001e\\\u0003cVl6\tT3$3d\u0019P";
        objectArray[46] = "\u001fQ(:MP\b@!8uR\u001b].1\u0019`O\u001eqfN7ID<+\u0010GKA\u007f6u";
        objectArray[47] = "\u0002N\u000fb3\u0013B\u0004\u0007-B\u001bYY\u001a>\u0015L\u0003\tDR~HSL\u0007jx\u0011E\b";
        Object[] objectArray2 = objectArray;
        objectArray[48] = "\u001d\r\u001cG\u001aTE\u000e\u0018.\u0010\u0000\u0004\b\u0019B\"WCSG\u001euQE\u0003\u0006WMW\u001c\u0015B.";
    }

    public void method_5773() {
        g6 g62;
        reference var10_7;
        reference var8_6;
        reference var6_5;
        long l;
        block10: {
            block11: {
                float f;
                CallSite callSite;
                block8: {
                    block9: {
                        l = b ^ 0x4033952633BEL;
                        CallSite callSite2 = g6.a("\u00c2", (Object)((Object)this), arg_0 -> g6.lambda$tick$0(this, arg_0), (long)-3934063475325713152L, (long)l);
                        callSite = g6.a("\u00c2", (long)-3932839482694258404L, (long)l);
                        try {
                            try {
                                if (callSite != null) break block8;
                                if (g6.a("U", (Object)callSite2, (long)-3934803215182243444L, (long)l) == g6.a("\u00d6", (long)-3933323448528282454L, (long)l)) break block9;
                            }
                            catch (MatchException matchException) {
                                throw g6.a("\u00c2", (Object)matchException, (long)-3933076471141736213L, (long)l);
                            }
                            g6.a("U", (Object)((Object)this), (Object)callSite2, (long)-3934336080768280985L, (long)l);
                        }
                        catch (MatchException matchException) {
                            throw g6.a("\u00c2", (Object)matchException, (long)-3933076471141736213L, (long)l);
                        }
                    }
                    g6.a("U", (Object)((Object)this), (long)-3933143035840960800L, (long)l);
                }
                CallSite callSite3 = g6.a("U", (Object)((Object)this), (long)-3933358872271417637L, (long)l);
                var6_5 = g6.a("U", (Object)((Object)this), (long)-3933198385966090137L, (long)l) + g6.a("\u00f8", (Object)callSite3, (long)-3934815478173517067L, (long)l);
                var8_6 = g6.a("U", (Object)((Object)this), (long)-3935205197645443301L, (long)l) + g6.a("\u00f8", (Object)callSite3, (long)-3933912385306566440L, (long)l);
                var10_7 = g6.a("U", (Object)((Object)this), (long)-3933866203041716825L, (long)l) + g6.a("\u00f8", (Object)callSite3, (long)-3934264153586824831L, (long)l);
                try {
                    g6.a("U", (Object)((Object)this), (long)-3934633289403610364L, (long)l);
                    f = g6.a("U", (Object)((Object)this), (long)-3933611572779657699L, (long)l) != false ? 0.8f : 0.99f;
                }
                catch (MatchException matchException) {
                    throw g6.a("\u00c2", (Object)matchException, (long)-3933076471141736213L, (long)l);
                }
                float f10 = f;
                try {
                    g6.a("U", (Object)((Object)this), (Object)g6.a("U", (Object)callSite3, (double)f10, (long)-3933024866399380649L, (long)l), (long)-3934497302029642494L, (long)l);
                    g62 = this;
                    if (callSite != null) break block10;
                    if (g6.a("U", (Object)((Object)g62), (long)-3933753504291375564L, (long)l) != false) break block11;
                }
                catch (MatchException matchException) {
                    throw g6.a("\u00c2", (Object)matchException, (long)-3933076471141736213L, (long)l);
                }
                CallSite callSite4 = g6.a("U", (Object)((Object)this), (long)-3933358872271417637L, (long)l);
                g6.a("U", (Object)((Object)this), (double)g6.a("\u00f8", (Object)callSite4, (long)-3934815478173517067L, (long)l), (double)(g6.a("\u00f8", (Object)callSite4, (long)-3933912385306566440L, (long)l) - 0.03), (double)g6.a("\u00f8", (Object)callSite4, (long)-3934264153586824831L, (long)l), (long)-3934562054052760268L, (long)l);
            }
            g62 = this;
        }
        g6.a("U", (Object)((Object)g62), (double)var6_5, (double)var8_6, (double)var10_7, (long)-3933420359841796884L, (long)l);
    }

    protected void method_7454(class_3966 class_39662) {
        this.a = 1;
    }

    protected class_1799 method_57314() {
        return null;
    }

    protected class_1799 method_7445() {
        return null;
    }

    protected void method_24920(class_3965 class_39652) {
        this.a = 1;
    }

    public void method_7485(double d, double d10, double d11, float f, float f10) {
        long l = b ^ 0x2E808172E5BL;
        CallSite callSite = g6.a("U", (Object)g6.a("U", (Object)new class_243(d, d10, d11), (long)-3134401153956918195L, (long)l), (double)f, (long)-3130471905651489102L, (long)l);
        g6.a("U", (Object)((Object)this), (Object)callSite, (long)-3134336740970772249L, (long)l);
        g6.a("U", (Object)((Object)this), (float)((float)(g6.a("\u00c2", (double)g6.a("\u00f8", (Object)callSite, (long)-3133950155662612720L, (long)l), (double)g6.a("\u00f8", (Object)callSite, (long)-3133400042395233180L, (long)l), (long)-3133814930621357707L, (long)l) * 57.2957763671875)), (long)-3133496025398545856L, (long)l);
        g6.a("U", (Object)((Object)this), (float)((float)(g6.a("\u00c2", (double)g6.a("\u00f8", (Object)callSite, (long)-3133751776331956931L, (long)l), (double)g6.a("U", (Object)callSite, (long)-3133668087416082987L, (long)l), (long)-3133814930621357707L, (long)l) * 57.2957763671875)), (long)-3130417524363028908L, (long)l);
        g6.a("\u00cf", (Object)((Object)this), (float)g6.a("U", (Object)((Object)this), (long)-3133522772230376470L, (long)l), (long)-3130680269972985825L, (long)l);
        g6.a("\u00cf", (Object)((Object)this), (float)g6.a("U", (Object)((Object)this), (long)-3130809695193305469L, (long)l), (long)-3134195868950352596L, (long)l);
    }

    private static boolean lambda$tick$0(g6 g62, class_1297 class_12972) {
        long l = b ^ 0x1B2E9732E6DFL;
        return (boolean)g6.a("U", (Object)((Object)g62), (Object)class_12972, (long)2019905698813651966L, (long)l);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(g6.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


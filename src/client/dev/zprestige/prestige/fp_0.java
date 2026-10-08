/*
 * Decompiled with CFR 0.152.
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.a0;
import dev.zprestige.prestige.a4;
import dev.zprestige.prestige.aM;
import dev.zprestige.prestige.bF;
import dev.zprestige.prestige.bH;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.bi_0;
import dev.zprestige.prestige.bj_0;
import dev.zprestige.prestige.bl_0;
import dev.zprestige.prestige.br_0;
import dev.zprestige.prestige.bx_0;
import dev.zprestige.prestige.dM;
import dev.zprestige.prestige.dV;
import dev.zprestige.prestige.hc;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
 * Renamed from dev.zprestige.prestige.fp
 */
public class fp_0
extends dV {
    private dM d;
    private dM a;
    private dM c;
    private dM e;
    private dM f;
    private dM g;
    private dM h;
    private dM i;
    private dM j;
    private dM k;
    private static final long l = hc.a(-3722564609427564698L, -2515507805238668968L, MethodHandles.lookup().lookupClass()).a(130699422139222L);
    private static final Object[] m = new Object[19];
    private static final String[] n = new String[19];

    static {
        fp_0.f();
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/fp" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = fp_0.m(l, l2);
            object = m[n];
            try {
                if (!(object instanceof String)) break block2;
                fp_0.m[n] = clazz = Class.forName(fp_0.n[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = fp_0.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = fp_0.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = fp_0.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = fp_0.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = m;
        m[0] = "*LJ@uv<LO\u001afa+\u0007L\u001cju:@[\u000b!`>";
        objectArray[1] = "3\u001cM\f\u0001\u000e8\u0013\\Cb\u0003-\u001eS(W\u0001<\rO\u0004@\f";
        objectArray[2] = "{Ma}vamMd'evz\u0006g!ibkAp6\"pW";
        objectArray[3] = "\f8:-n1y\u00181\"\u007f~\u0018\u0016:){$l";
        objectArray[4] = Void.TYPE;
        fp_0.n[4] = "java/lang/Void";
        objectArray[5] = "RZd@\u0006aRZs\u001c\nnH\u0011s\u0002\n{O`#_[";
        objectArray[6] = "!\u000f\u0015\u00102 !\u000f\u0002L>/;D\u0002R>:<5W\rg";
        objectArray[7] = "|P(67}w_9y[~y];6w";
        objectArray[8] = Boolean.TYPE;
        fp_0.n[8] = "java/lang/Boolean";
        objectArray[9] = "\\f\u0003\u00037\u0001Jf\u0006Y$\u0016]-\u0005_(\u0002Lj\u0012Hc\u0015s";
        objectArray[10] = "&'\\\u000e\u0006\u0006-(MAg\b&#I\u001b";
        objectArray[11] = "9=\u0012ZTM9=\u0005\u0006XB#v\u0005\u0018XW$\u0007UF\u0000";
        objectArray[12] = "13%/z32;0;\u0011)c>>7}\u001b5~fh*L5(\"3 6|{>)\u0011";
        objectArray[13] = "\u0018\u0016\u0011C\"d\u0015Q\u0014.t\u0019\u0010\u001e\u001cAgfRTPJ\u001d \u0018\u001eBTbbRRI.";
        objectArray[14] = "B$Zo+\\H=Kq\u0014Y\u0018,AgC\u000eFy\u0018\u000b+F\u0002>Nt(N\u0017*";
        objectArray[15] = "\u000flZcDpRfNb-(65GxHyPi\u0016xFA\reT}\u001c;D6Hg-";
        objectArray[16] = "\u0019/d\u001c,-\u00136u\u0002\u0013(C'\u007f\u0014D\u007f\u001cz$x/+@$+\u0017hyN'";
        objectArray[17] = "+\u007f\t\u001d!q$|\u001bXCr\u0015?U[s#$o\u0010\u0010=\u001b";
        Object[] objectArray2 = objectArray;
        objectArray[18] = " 0\u0002vh%}=\u0012gV-z<\u001ck?!C2\u001c{;G *\u00168i!c0\u001avV";
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00e3' || c == '\u00f3' || c == '\u00ef' || c == '\u00e9') {
                field = fp_0.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e3' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00f3' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00ef' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = fp_0.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00ba' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d1' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = fp_0.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    @bP
    public void a(bi_0 bi_02) {
        long l = fp_0.l ^ 0x5BAF2B48676AL;
        try {
            if (fp_0.b("\u00ba", (Object)((Boolean)((Object)fp_0.b("\u00ba", (Object)this.c, (long)-6369370598569639412L, (long)l))), (long)-6369331140668533173L, (long)l) != false) {
                fp_0.b("\u00ba", (Object)bi_02, (Object)new Object[0], (long)-6368990942845122403L, (long)l);
            }
        }
        catch (MatchException matchException) {
            throw fp_0.b("\u00d1", (Object)matchException, (long)-6369121582579841246L, (long)l);
        }
    }

    @bP
    public void a(bH bH2) {
        long l = fp_0.l ^ 0x5A24C0F7EE3FL;
        try {
            if (fp_0.b("\u00ba", (Object)((Boolean)((Object)fp_0.b("\u00ba", (Object)this.d, (long)3372759220566821721L, (long)l))), (long)3372798755695877918L, (long)l) != false) {
                fp_0.b("\u00ba", (Object)bH2, (Object)new Object[0], (long)3371452229720916424L, (long)l);
            }
        }
        catch (MatchException matchException) {
            throw fp_0.b("\u00d1", (Object)matchException, (long)3371318298933300855L, (long)l);
        }
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    @bP
    public void a(bx_0 bx_02) {
        long l = fp_0.l ^ 0x2C7ACE056A11L;
        try {
            if (fp_0.b("\u00ba", (Object)((Boolean)((Object)fp_0.b("\u00ba", (Object)this.i, (long)-6133897219746721929L, (long)l))), (long)-6133655546188571856L, (long)l) != false) {
                fp_0.b("\u00ba", (Object)bx_02, (Object)new Object[0], (long)-6131726008434014746L, (long)l);
            }
        }
        catch (MatchException matchException) {
            throw fp_0.b("\u00d1", (Object)matchException, (long)-6131894436398691751L, (long)l);
        }
    }

    @bP
    public void a(aM aM2) {
        block4: {
            long l = fp_0.l ^ 0x6F2542320A47L;
            try {
                try {
                    if (fp_0.b("\u00ba", (Object)((Boolean)((Object)fp_0.b("\u00ba", (Object)this.e, (long)-3839802855270977759L, (long)l))), (long)-3839701755988001946L, (long)l) == false || fp_0.b("\u00e3", (Object)b, (long)-3839818194524462415L, (long)l) == null) break block4;
                }
                catch (MatchException matchException) {
                    throw fp_0.b("\u00d1", (Object)matchException, (long)-3841182217062290929L, (long)l);
                }
                fp_0.b("\u00ba", (Object)aM2, (Object)new Object[0], (long)-3841015292336331344L, (long)l);
            }
            catch (MatchException matchException) {
                throw fp_0.b("\u00d1", (Object)matchException, (long)-3841182217062290929L, (long)l);
            }
        }
    }

    @bP
    public void a(bF bF2) {
        long l = fp_0.l ^ 0x6F3BB7BBA342L;
        try {
            if (fp_0.b("\u00ba", (Object)((Boolean)((Object)fp_0.b("\u00ba", (Object)this.h, (long)7184164700169651748L, (long)l))), (long)7184265627638272611L, (long)l) != false) {
                fp_0.b("\u00ba", (Object)bF2, (Object)new Object[0], (long)7184641014281964725L, (long)l);
            }
        }
        catch (MatchException matchException) {
            throw fp_0.b("\u00d1", (Object)matchException, (long)7184474228639253258L, (long)l);
        }
    }

    @bP
    public void a(bj_0 bj_02) {
        long l = fp_0.l ^ 0x7B1A26625683L;
        try {
            if (fp_0.b("\u00ba", (Object)((Boolean)((Object)fp_0.b("\u00ba", (Object)this.g, (long)-7605924896289672219L, (long)l))), (long)-7605814889252886622L, (long)l) != false) {
                fp_0.b("\u00ba", (Object)bj_02, (Object)new Object[0], (long)-7604912024775853708L, (long)l);
            }
        }
        catch (MatchException matchException) {
            throw fp_0.b("\u00d1", (Object)matchException, (long)-7605043618027129141L, (long)l);
        }
    }

    @bP
    public void a(a4 a42) {
        long l = fp_0.l ^ 0x52E2C29606D4L;
        try {
            if (fp_0.b("\u00ba", (Object)((Boolean)((Object)fp_0.b("\u00ba", (Object)this.f, (long)-4168791317852265550L, (long)l))), (long)-4168751748292265995L, (long)l) != false) {
                fp_0.b("\u00ba", (Object)a42, (Object)new Object[0], (long)-4169553466255529693L, (long)l);
            }
        }
        catch (MatchException matchException) {
            throw fp_0.b("\u00d1", (Object)matchException, (long)-4169668155589761380L, (long)l);
        }
    }

    @bP
    public void a(a0 a02) {
        long l = fp_0.l ^ 0x78F53F82FE05L;
        try {
            if (fp_0.b("\u00ba", (Object)((Boolean)((Object)fp_0.b("\u00ba", (Object)this.a, (long)4536339191494744931L, (long)l))), (long)4536448949410909988L, (long)l) != false) {
                fp_0.b("\u00ba", (Object)a02, (Object)new Object[0], (long)4536232176026636786L, (long)l);
            }
        }
        catch (MatchException matchException) {
            throw fp_0.b("\u00d1", (Object)matchException, (long)4536100025000042061L, (long)l);
        }
    }

    @bP
    public void a(bl_0 bl_02) {
        long l = fp_0.l ^ 0x85C32B1DE3CL;
        try {
            if (fp_0.b("\u00ba", (Object)((Boolean)((Object)fp_0.b("\u00ba", (Object)this.j, (long)2219466323925744474L, (long)l))), (long)2219646665338908445L, (long)l) != false) {
                fp_0.b("\u00ba", (Object)fp_0.b("\u00e3", (Object)b, (long)2218858659248048903L, (long)l), (long)2218684668956490559L, (long)l);
            }
        }
        catch (MatchException matchException) {
            throw fp_0.b("\u00d1", (Object)matchException, (long)2218592747684085364L, (long)l);
        }
    }

    @bP
    public void a(br_0 br_02) {
        long l = fp_0.l ^ 0x270FE75CD82DL;
        try {
            if (fp_0.b("\u00ba", (Object)((Boolean)((Object)fp_0.b("\u00ba", (Object)this.k, (long)1791323858933136715L, (long)l))), (long)1791565901851191564L, (long)l) != false) {
                fp_0.b("\u00ba", (Object)br_02, (Object)new Object[0], (long)1791219733972776922L, (long)l);
            }
        }
        catch (MatchException matchException) {
            throw fp_0.b("\u00d1", (Object)matchException, (long)1791070402539862117L, (long)l);
        }
    }

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (fp_0.n[n3] != null) {
            return n3;
        }
        Object object = m[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 53;
            case 1 -> 50;
            case 2 -> 38;
            case 3 -> 21;
            case 4 -> 10;
            case 5 -> 23;
            case 6 -> 25;
            case 7 -> 30;
            case 8 -> 16;
            case 9 -> 41;
            case 10 -> 7;
            case 11 -> 14;
            case 12 -> 26;
            case 13 -> 31;
            case 14 -> 35;
            case 15 -> 17;
            case 16 -> 22;
            case 17 -> 2;
            case 18 -> 20;
            case 19 -> 63;
            case 20 -> 19;
            case 21 -> 55;
            case 22 -> 44;
            case 23 -> 62;
            case 24 -> 29;
            case 25 -> 52;
            case 26 -> 1;
            case 27 -> 58;
            case 28 -> 28;
            case 29 -> 43;
            case 30 -> 48;
            case 31 -> 0;
            case 32 -> 34;
            case 33 -> 4;
            case 34 -> 32;
            case 35 -> 33;
            case 36 -> 40;
            case 37 -> 9;
            case 38 -> 5;
            case 39 -> 59;
            case 40 -> 6;
            case 41 -> 15;
            case 42 -> 46;
            case 43 -> 8;
            case 44 -> 51;
            case 45 -> 45;
            case 46 -> 37;
            case 47 -> 47;
            case 48 -> 57;
            case 49 -> 11;
            case 50 -> 54;
            case 51 -> 39;
            case 52 -> 27;
            case 53 -> 3;
            case 54 -> 42;
            case 55 -> 36;
            case 56 -> 24;
            case 57 -> 60;
            case 58 -> 18;
            case 59 -> 61;
            case 60 -> 13;
            case 61 -> 56;
            case 62 -> 49;
            default -> 12;
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
        fp_0.n[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = fp_0.m(l, l2);
        Object object = m[n];
        if (object instanceof String) {
            String string = fp_0.n[n];
            int n2 = string.indexOf(8);
            Class clazz = fp_0.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = fp_0.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = fp_0.g(clazz3, string2, clazz2)) != null) {
                    fp_0.m[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = fp_0.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        fp_0.m[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = fp_0.n(732879092782831L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = fp_0.m(l, l2);
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
                String string2 = fp_0.n[n];
                int n3 = string2.indexOf(8);
                clazz3 = fp_0.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = fp_0.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = fp_0.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        fp_0.m[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = fp_0.n(732879092782831L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = fp_0.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        fp_0.m[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = fp_0.n(732879092782831L, 0L);
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
            return MethodHandles.lookup().findStatic(fp_0.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


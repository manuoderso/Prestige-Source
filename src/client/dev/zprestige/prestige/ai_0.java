/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1657
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.a5;
import dev.zprestige.prestige.aI;
import dev.zprestige.prestige.aJ;
import dev.zprestige.prestige.bG;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.cz_0;
import dev.zprestige.prestige.hc;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;
import net.minecraft.class_1297;
import net.minecraft.class_1657;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from dev.zprestige.prestige.ai
 */
public class ai_0
implements cz_0 {
    private final Set a;
    private final Map c;
    private static final long d = hc.a(-9116454308433920823L, -9051299646168308201L, MethodHandles.lookup().lookupClass()).a(192890772643981L);
    private static final Object[] e = new Object[39];
    private static final String[] f = new String[39];

    public ai_0(long l) {
        long l2 = (l = d ^ l) ^ 0x60E91FF504D7L;
        this.a = new HashSet();
        this.c = new IdentityHashMap();
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = this;
        ai_0.a("w", (Object)ai_0.a("\u00c1", (long)-3615170396352804554L, (long)l), (Object)objectArray, (long)-3615090210145189726L, (long)l);
    }

    static {
        ai_0.a();
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (f[n3] != null) {
            return n3;
        }
        Object object = e[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 12;
            case 1 -> 19;
            case 2 -> 47;
            case 3 -> 52;
            case 4 -> 34;
            case 5 -> 15;
            case 6 -> 46;
            case 7 -> 33;
            case 8 -> 18;
            case 9 -> 62;
            case 10 -> 30;
            case 11 -> 44;
            case 12 -> 26;
            case 13 -> 17;
            case 14 -> 59;
            case 15 -> 42;
            case 16 -> 1;
            case 17 -> 27;
            case 18 -> 61;
            case 19 -> 11;
            case 20 -> 56;
            case 21 -> 6;
            case 22 -> 5;
            case 23 -> 53;
            case 24 -> 43;
            case 25 -> 60;
            case 26 -> 48;
            case 27 -> 25;
            case 28 -> 35;
            case 29 -> 9;
            case 30 -> 36;
            case 31 -> 55;
            case 32 -> 13;
            case 33 -> 49;
            case 34 -> 40;
            case 35 -> 38;
            case 36 -> 24;
            case 37 -> 50;
            case 38 -> 20;
            case 39 -> 29;
            case 40 -> 39;
            case 41 -> 7;
            case 42 -> 21;
            case 43 -> 58;
            case 44 -> 51;
            case 45 -> 3;
            case 46 -> 4;
            case 47 -> 14;
            case 48 -> 2;
            case 49 -> 63;
            case 50 -> 54;
            case 51 -> 28;
            case 52 -> 32;
            case 53 -> 37;
            case 54 -> 57;
            case 55 -> 10;
            case 56 -> 0;
            case 57 -> 45;
            case 58 -> 31;
            case 59 -> 23;
            case 60 -> 22;
            case 61 -> 16;
            case 62 -> 41;
            default -> 8;
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
        ai_0.f[n3] = new String(cArray);
        return n3;
    }

    private boolean b(Object[] objectArray) {
        Object object;
        block35: {
            block34: {
                CallSite callSite;
                long l;
                block33: {
                    class_1297 class_12972;
                    block31: {
                        block32: {
                            long l2;
                            block29: {
                                long l3;
                                block30: {
                                    block27: {
                                        block28: {
                                            block25: {
                                                block26: {
                                                    class_12972 = (class_1297)objectArray[0];
                                                    l = (Long)objectArray[1];
                                                    long l4 = l = d ^ l;
                                                    l2 = l4 ^ 0x5AA6858FDD06L;
                                                    l3 = l4 ^ 0x4E64E6828A25L;
                                                    callSite = ai_0.a("Z", (long)6452278781204538598L, (long)l);
                                                    try {
                                                        try {
                                                            object = class_12972 instanceof class_1657;
                                                            if (callSite != null) break block25;
                                                            if (object != 0) break block26;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw ai_0.a("Z", (Object)matchException, (long)6451499725508708121L, (long)l);
                                                        }
                                                        return true;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw ai_0.a("Z", (Object)matchException, (long)6451499725508708121L, (long)l);
                                                    }
                                                }
                                                Object[] objectArray2 = new Object[2];
                                                objectArray2[1] = l3;
                                                objectArray2[0] = aJ.class;
                                                object = ai_0.a("w", (Object)ai_0.a("\u00c1", (long)6452363366599466345L, (long)l), (Object)objectArray2, (long)6451572507999447090L, (long)l);
                                            }
                                            try {
                                                try {
                                                    if (callSite != null) break block27;
                                                    if (object != 0) break block28;
                                                }
                                                catch (MatchException matchException) {
                                                    throw ai_0.a("Z", (Object)matchException, (long)6451499725508708121L, (long)l);
                                                }
                                                return true;
                                            }
                                            catch (MatchException matchException) {
                                                throw ai_0.a("Z", (Object)matchException, (long)6451499725508708121L, (long)l);
                                            }
                                        }
                                        Object[] objectArray3 = new Object[1];
                                        objectArray3[0] = l2;
                                        object = ai_0.a("w", (Object)new aJ(), (Object)objectArray3, (long)6451442512750495039L, (long)l);
                                    }
                                    try {
                                        try {
                                            if (callSite != null) break block29;
                                            if (object != 0) break block30;
                                        }
                                        catch (MatchException matchException) {
                                            throw ai_0.a("Z", (Object)matchException, (long)6451499725508708121L, (long)l);
                                        }
                                        return true;
                                    }
                                    catch (MatchException matchException) {
                                        throw ai_0.a("Z", (Object)matchException, (long)6451499725508708121L, (long)l);
                                    }
                                }
                                Object[] objectArray4 = new Object[2];
                                objectArray4[1] = l3;
                                objectArray4[0] = aI.class;
                                object = ai_0.a("w", (Object)ai_0.a("\u00c1", (long)6452363366599466345L, (long)l), (Object)objectArray4, (long)6451572507999447090L, (long)l);
                            }
                            try {
                                try {
                                    if (callSite != null) break block31;
                                    if (object == 0) break block32;
                                }
                                catch (MatchException matchException) {
                                    throw ai_0.a("Z", (Object)matchException, (long)6451499725508708121L, (long)l);
                                }
                                Object[] objectArray5 = new Object[1];
                                objectArray5[0] = l2;
                                object = ai_0.a("w", (Object)new aI((class_1657)class_12972), (Object)objectArray5, (long)6451442512750495039L, (long)l);
                                if (callSite != null) break block31;
                            }
                            catch (MatchException matchException) {
                                throw ai_0.a("Z", (Object)matchException, (long)6451499725508708121L, (long)l);
                            }
                            try {
                                if (object != 0) {
                                    return false;
                                }
                            }
                            catch (MatchException matchException) {
                                throw ai_0.a("Z", (Object)matchException, (long)6451499725508708121L, (long)l);
                            }
                        }
                        object = ai_0.a("w", (Object)this.a, (Object)class_12972, (long)6451123100324082091L, (long)l);
                    }
                    try {
                        try {
                            if (callSite != null) break block33;
                            if (object == 0) break block34;
                        }
                        catch (MatchException matchException) {
                            throw ai_0.a("Z", (Object)matchException, (long)6451499725508708121L, (long)l);
                        }
                        object = ai_0.a("w", (Object)class_12972, (long)6450897471231248305L, (long)l);
                    }
                    catch (MatchException matchException) {
                        throw ai_0.a("Z", (Object)matchException, (long)6451499725508708121L, (long)l);
                    }
                }
                try {
                    if (callSite != null) break block35;
                    if (object == false) break block34;
                }
                catch (MatchException matchException) {
                    throw ai_0.a("Z", (Object)matchException, (long)6451499725508708121L, (long)l);
                }
                object = 1;
                break block35;
            }
            object = 0;
        }
        return (boolean)object;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'g' || c == 'J' || c == '\u00c1' || c == '\u00d8') {
                field = ai_0.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'g' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'J' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00c1' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ai_0.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'w' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'Z' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = ai_0.b(lookup, mutableCallSite, string, methodType, l, l2);
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
        int n = ai_0.e(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = f[n];
                int n3 = string2.indexOf(8);
                clazz3 = ai_0.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ai_0.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ai_0.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        ai_0.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ai_0.f(799909227904672L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ai_0.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ai_0.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ai_0.f(799909227904672L, 0L);
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
            int n = ai_0.e(l, l2);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                ai_0.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = ai_0.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ai_0.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ai_0.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ai_0.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
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
            throw new RuntimeException("dev/zprestige/prestige/ai" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public boolean a(Object[] objectArray) {
        long l;
        long l2;
        class_1297 class_12972;
        block9: {
            Boolean bl;
            block8: {
                Object object;
                CallSite callSite;
                block6: {
                    block7: {
                        class_12972 = (class_1297)objectArray[0];
                        l2 = (Long)objectArray[1];
                        l = (l2 = d ^ l2) ^ 0x4BEBBAA2DB1L;
                        callSite = ai_0.a("Z", (long)-5653030419804697375L, (long)l2);
                        try {
                            try {
                                object = class_12972;
                                if (callSite != null) break block6;
                                if (object != ai_0.a("g", (Object)b, (long)-5652992311990342537L, (long)l2)) break block7;
                            }
                            catch (MatchException matchException) {
                                throw ai_0.a("Z", (Object)matchException, (long)-5652251432156991714L, (long)l2);
                            }
                            return false;
                        }
                        catch (MatchException matchException) {
                            throw ai_0.a("Z", (Object)matchException, (long)-5652251432156991714L, (long)l2);
                        }
                    }
                    object = ai_0.a("w", (Object)this.c, (Object)class_12972, (long)-5652351954874876801L, (long)l2);
                }
                Boolean bl2 = (Boolean)object;
                try {
                    bl = bl2;
                    if (callSite != null) break block8;
                    if (bl == null) break block9;
                }
                catch (MatchException matchException) {
                    throw ai_0.a("Z", (Object)matchException, (long)-5652251432156991714L, (long)l2);
                }
                bl = bl2;
            }
            return (boolean)ai_0.a("w", (Object)bl, (long)-5652412876435116488L, (long)l2);
        }
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l;
        objectArray2[0] = class_12972;
        CallSite callSite = ai_0.a("w", (Object)this, (Object)objectArray2, (long)-5656211477865080203L, (long)l2);
        ai_0.a("w", (Object)this.c, (Object)class_12972, (Object)ai_0.a("Z", (boolean)callSite, (long)-5656306263462520200L, (long)l2), (long)-5652522261032760763L, (long)l2);
        return (boolean)callSite;
    }

    public Set a(Object[] objectArray) {
        return this.a;
    }

    public void a(Object[] objectArray) {
        class_1657 class_16572 = (class_1657)objectArray[0];
        long l = (Long)objectArray[1];
        l = d ^ l;
        ai_0.a("w", (Object)this.a, (Object)class_16572, (long)-2410207097957504231L, (long)l);
    }

    @bP
    public void a(a5 a52) {
        long l = d ^ 0x1989D137FFF0L;
        ai_0.a("w", (Object)this.a, (long)4201523121802065363L, (long)l);
    }

    @bP
    public void a(bG bG2) {
        block4: {
            long l = d ^ 0xE9239F7BFE8L;
            CallSite callSite = ai_0.a("Z", (long)8816738738781062966L, (long)l);
            ai_0.a("w", (Object)this.c, (long)8816004310673946362L, (long)l);
            CallSite callSite2 = callSite;
            try {
                CallSite callSite3;
                try {
                    callSite3 = ai_0.a("w", (Object)this.a, (long)8816175783956389601L, (long)l);
                    if (callSite2 != null || callSite3 != false) break block4;
                }
                catch (MatchException matchException) {
                    throw ai_0.a("Z", (Object)matchException, (long)8815818979353175241L, (long)l);
                }
                callSite3 = ai_0.a("w", (Object)this.a, ai_0::lambda$onTick$0, (long)8815569151357608765L, (long)l);
            }
            catch (MatchException matchException) {
                throw ai_0.a("Z", (Object)matchException, (long)8815818979353175241L, (long)l);
            }
        }
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = "bv\u0018bL@tv\u001d8_Wc=\u001e>SCrz\t)\u0018QN";
        objectArray[1] = "\u0017\u0003\u0010=(/b#\u001b29`\u001f;\b50)w";
        objectArray[2] = "x\u0019xrc8n\u0019}(p/yR~.|;h\u0015i97)u";
        objectArray[3] = "d\r}b\u0016Io\u0002l-uDz\u000fcF@Fk\u001c\u007fjWK";
        objectArray[4] = "e\u0017L)\b\u0004{\u001fVfk\u0010\u007f";
        objectArray[5] = Void.TYPE;
        ai_0.f[5] = "java/lang/Void";
        objectArray[6] = "&h\u00076rR8`\u001dy\u000fB8";
        objectArray[7] = Boolean.TYPE;
        ai_0.f[7] = "java/lang/Boolean";
        objectArray[8] = "\b\u0004X'\u0015J\u0016\fBh]J\f\u0006Z/TQL5\\#_V\u0001\u0004Z#";
        objectArray[9] = "[paQqy[pv\r}vA;v\u0013}cFJ&N,";
        objectArray[10] = "yo6SW(yo!\u000f['c$!\u0011[2dUuI\f";
        objectArray[11] = "!p\u0010\u0000v\u0017*\u007f\u0001O\u0017\u0019!t\u0005\u0015";
        objectArray[12] = "WB-\u0000l-\\M<O\u0000.RO>\u0000,";
        objectArray[13] = "(\n#\u0015=S]*(\u001a,\u001c<$#\u0011(FH";
        objectArray[14] = "\n\u0007d67\u0014\u001c\u0007al$\u0003\u000bLbj(\u0017\u001a\u000bu}c\u0007\u0002\u000bwv9J>\u0010wk9\r\t\u0007";
        objectArray[15] = "+\u0006\t\u0010(]=\u0006\fJ;J*M\u000fL7^;\n\u0018[|O\u0000";
        objectArray[16] = ";DwZ%tNd|U4;/jw^0a[";
        objectArray[17] = "\trcPe2|Rh_t}\u001d\\cTp'i";
        objectArray[18] = "gI\u0005(gWgI\u0012tkX}\u0002\u0012jkMzs@43\t";
        objectArray[19] = "k\u0004\t-+?\u001e$\u0002\":p\u007f*\t)>*\u000b";
        objectArray[20] = "\u0003\u000bQ\u001a<M\u0011\u0016\u0013s,4\u0010E^\n<M\rL\u001fs";
        objectArray[21] = "Y&;\u007fc\u0018\u0000w,zYM0q(&7L\tf:d'";
        objectArray[22] = "cq2\u0006entcp\u0016\u000e>\nsv\u001ac%2{f\u001a\u007fW1mp\u0005`ixv2\u0012\u000e";
        objectArray[23] = "UB[*M\u001bZ\u0006Rc1\u001a\nT\u000e4fMT\u0003VX\u000eH[I\u0005`[\u0018\tE";
        objectArray[24] = "t\u001f\u0013FXSf\u0002Q/H*u\u0018^BP\u0012}\b^^\"\u0017p\u0019^^NL|_\u001d/";
        objectArray[25] = "IF\u001dyyU\u001dV\u001eh\u001a\rp\r\u001bh$\u0000\fJ\u0015~|dJS\r$~\u0018\r]\u001b|\u001a";
        objectArray[26] = "SE:r_$DWxb4w:G~nYo\u0002OnnE\u001d\u0007B\u007fnEq\\N9-4";
        objectArray[27] = "i=\u001aWWYj:\n]k\r7,\n\\k]!>\u000eHU\u0014:|\u0019&";
        objectArray[28] = "Re?hyg\u0002<g`\u0015z\u0015J8}ijn:4}gj\u0002a8;$\u001b";
        objectArray[29] = ",\u0013\u00158t\"/\u0014\u00052Hek\u0013lv6\u007fr_Qxp,moS7*y&R]qyf\u0016P\u0012+,-+^Tx3\u001d";
        objectArray[30] = "M\u0001+\u0002^rN\u0006;\bb\"\u001a\u0001RL\u001c/\u0013MoBZ|\f}m\r\u0000)G@cKS6w";
        objectArray[31] = "\u001eCR\b~~EP\u0019C\u0017sIVG\u0015~\u007fpXG\u0005z\u0019\u0013X[\nfuHT\u001dI\u0017";
        objectArray[32] = "lsk\u001d\u0011Nr+`H!Am7e\u001eMs={=D!\u0019i3w\bMBeu4y";
        objectArray[33] = "v\u000b\u00120t}\"\u001b\u0011!\u0017&O\u0016\t!z>w\u001e\u0019!fLr\u0013\b!f )\u001fNb\u0017";
        objectArray[34] = "NX\u0013\u0017\u0001/\u001e\u0001K\u001fm8\u0016W\u0018\u0000mh\u0000E\u001c\u0014S!\u001b\u0007\u000bz";
        objectArray[35] = "\u000f8\u0010B~\u001b_aHJ\u0012\fT<\u000eFs\u0001HZMQp\u0003\u0003gC\u0017#\u001c3g\u001bW`\u0016_<\u0017\u0011#g";
        objectArray[36] = "p \"<Y\u001b yz45\u000e .@nK\u0005(r}`\rV7B}8M\u0015=.&4\u000bVL";
        objectArray[37] = "K#H:s<\u001bz\u00102\u001f:\u001a$M)r\u0001\u0019A\u0017/by\u0018/Z2pyw|C/m1\u001b'Oi.@";
        Object[] objectArray2 = objectArray;
        objectArray[38] = "F\b`\tN&\u001d\u001b+B'?\u001f\u001el\u0014`/vGx\u0001U0\u001a\u001ctG\u0016AF\b`\tN&\u001d\u001b+B'";
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static Field g(long l, long l2) {
        int n = ai_0.e(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = ai_0.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ai_0.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ai_0.c(clazz3, string2, clazz2)) != null) {
                    ai_0.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ai_0.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ai_0.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ai_0.f(799909227904672L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static boolean lambda$onTick$0(class_1297 class_12972) {
        Object object;
        block2: {
            block3: {
                long l = d ^ 0x315AE2856A02L;
                CallSite callSite = ai_0.a("Z", (long)-5786730918348959012L, (long)l);
                try {
                    object = ai_0.a("w", (Object)class_12972, (long)-5783661319345229429L, (long)l);
                    if (callSite != null) break block2;
                    if (object != false) break block3;
                }
                catch (MatchException matchException) {
                    throw ai_0.a("Z", (Object)matchException, (long)-5786514812942094045L, (long)l);
                }
                object = 1;
                break block2;
            }
            object = 0;
        }
        return (boolean)object;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ai_0.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


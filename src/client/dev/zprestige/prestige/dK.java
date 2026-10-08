/*
 * Decompiled with CFR 0.152.
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.cP;
import dev.zprestige.prestige.hc;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.function.Predicate;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class dK {
    private String a;
    private Object b;
    private String c;
    private Predicate d;
    private static int[] e;
    private static final long g;
    private static final Object[] k;
    private static final String[] l;

    public dK(String string, Object object) {
        this.a = string;
        this.b = object;
    }

    static {
        g = hc.a(9079498804213215737L, 1026195064180430032L, MethodHandles.lookup().lookupClass()).a(23399175985422L);
        long l = g ^ 0x2A02EE059C1BL;
        k = new Object[16];
        dK.l = new String[16];
        dK.e();
        if (dK.b("\u00f3", (long)3104621755214122154L, (long)l) != null) {
            dK.b("\u00f3", (Object)new int[3], (long)3104524471103481006L, (long)l);
        }
    }

    private static void e() {
        Object[] objectArray = k;
        k[0] = "TI\"\u0014\\jBI'NO}U\u0002$HCiDE3_\b~{";
        objectArray[1] = "%'";
        objectArray[2] = Void.TYPE;
        dK.l[2] = "java/lang/Void";
        objectArray[3] = "MG";
        objectArray[4] = "\u000bF2YT?\u001dF7\u0003G(\n\r4\u0005K<\u001bJ#\u0012\u0000.'";
        objectArray[5] = "k\bG7\u0018p\u001e(L8\t?c0_?\u0000v\u000b";
        objectArray[6] = " \u0006.\u0013Ns+\t?\\/} \u0002;\u0006";
        objectArray[7] = "@Q\u0001.~\u0005^Y\u001ba6\u0005DS\u0003&?\u001e\u0004`\u0005*4\u0019IQ\u0003*";
        objectArray[8] = Boolean.TYPE;
        dK.l[8] = "java/lang/Boolean";
        objectArray[9] = "=P{~G\b6_j1$\u0005#ReZ\u0011\u00072Ayv\u0006\n";
        objectArray[10] = "\u00026%\u0014\u0006\u001eF2`\u000eaK8vb\bXDB={\u0004\u001c!";
        objectArray[11] = "i\u0016&7njw\u001f\"Lm\u0013:\u0011<q?x|Cbt\u0004";
        objectArray[12] = "jxO\u001aq]tqKaq$?.S\u0018j\u001envA\u0006\u001b\u001d`$\n\u001b\"[uh\ba";
        objectArray[13] = "^L\u0015\u000enzRHH\u000b\u0004l\u000e\t\t38z\u0005ONX~([Ju\u000e}y\u001f\u0002\f\u0003zu\u0013r";
        objectArray[14] = "}+\u000e\u0007\"\\c\"\n|\"%(}\u0012\u00059\u001fy%\u0000\u001bH";
        Object[] objectArray2 = objectArray;
        objectArray[15] = "tFX3BwjO\\HA\u000e%V\u001a7T~\u007fLO)(0f\u0015[4Xj|@EH";
    }

    public static void b(int[] nArray) {
        e = nArray;
    }

    public static int[] b() {
        return e;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = dK.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = dK.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/dK" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = dK.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = dK.b(classArray[i], string, clazz2);
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
            int n = dK.a(l, l2);
            object = k[n];
            try {
                if (!(object instanceof String)) break block2;
                dK.k[n] = clazz = Class.forName(dK.l[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    @cP
    public String b() {
        return this.c;
    }

    private static Field c(long l, long l2) {
        int n = dK.a(l, l2);
        Object object = k[n];
        if (object instanceof String) {
            String string = dK.l[n];
            int n2 = string.indexOf(8);
            Class clazz = dK.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = dK.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = dK.a(clazz3, string2, clazz2)) != null) {
                    dK.k[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = dK.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        dK.k[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = dK.b(439085498155200L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = dK.a(l, l2);
        Object object = k[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = dK.l[n];
                int n3 = string2.indexOf(8);
                clazz3 = dK.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = dK.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = dK.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        dK.k[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = dK.b(439085498155200L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = dK.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        dK.k[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = dK.b(439085498155200L, 0L);
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

    public void a(Object[] objectArray) {
        String string = (String)objectArray[0];
        this.a = string;
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

    @cP
    public String a() {
        return this.a;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'e' || c == '\u00d0' || c == '\u00e0' || c == 'u') {
                field = dK.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'e' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00d0' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00e0' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = dK.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00ba' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00f3' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = dK.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    @cP
    public boolean a() {
        int n;
        block8: {
            block9: {
                block7: {
                    Predicate predicate;
                    CallSite callSite;
                    long l;
                    block6: {
                        l = g ^ 0x7E1BB12EFBBL;
                        callSite = dK.b("\u00f3", (long)6392013902014368339L, (long)l);
                        try {
                            try {
                                predicate = this.d;
                                if (callSite != null) break block6;
                                if (predicate == null) break block7;
                            }
                            catch (MatchException matchException) {
                                throw dK.b("\u00f3", (Object)matchException, (long)6392222208463435920L, (long)l);
                            }
                            predicate = this.d;
                        }
                        catch (MatchException matchException) {
                            throw dK.b("\u00f3", (Object)matchException, (long)6392222208463435920L, (long)l);
                        }
                    }
                    try {
                        n = dK.b("\u00ba", (Object)predicate, (Object)dK.b("\u00ba", (Object)this, (long)6391906290466868099L, (long)l), (long)6392047359623414025L, (long)l);
                        if (callSite != null) break block8;
                        if (n == false) break block9;
                    }
                    catch (MatchException matchException) {
                        throw dK.b("\u00f3", (Object)matchException, (long)6392222208463435920L, (long)l);
                    }
                }
                n = true;
                break block8;
            }
            n = 0;
        }
        return n != 0;
    }

    public dK a(Object[] objectArray) {
        Predicate predicate = (Predicate)objectArray[0];
        long l = (Long)objectArray[1];
        this.d = predicate;
        return this;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (dK.l[n3] != null) {
            return n3;
        }
        Object object = k[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 46;
            case 1 -> 14;
            case 2 -> 62;
            case 3 -> 1;
            case 4 -> 4;
            case 5 -> 35;
            case 6 -> 63;
            case 7 -> 57;
            case 8 -> 11;
            case 9 -> 51;
            case 10 -> 19;
            case 11 -> 12;
            case 12 -> 42;
            case 13 -> 54;
            case 14 -> 45;
            case 15 -> 56;
            case 16 -> 61;
            case 17 -> 18;
            case 18 -> 24;
            case 19 -> 48;
            case 20 -> 10;
            case 21 -> 13;
            case 22 -> 16;
            case 23 -> 25;
            case 24 -> 39;
            case 25 -> 7;
            case 26 -> 37;
            case 27 -> 3;
            case 28 -> 28;
            case 29 -> 30;
            case 30 -> 6;
            case 31 -> 23;
            case 32 -> 60;
            case 33 -> 15;
            case 34 -> 21;
            case 35 -> 33;
            case 36 -> 49;
            case 37 -> 55;
            case 38 -> 20;
            case 39 -> 47;
            case 40 -> 31;
            case 41 -> 34;
            case 42 -> 29;
            case 43 -> 59;
            case 44 -> 9;
            case 45 -> 2;
            case 46 -> 58;
            case 47 -> 8;
            case 48 -> 32;
            case 49 -> 44;
            case 50 -> 40;
            case 51 -> 0;
            case 52 -> 22;
            case 53 -> 53;
            case 54 -> 17;
            case 55 -> 36;
            case 56 -> 26;
            case 57 -> 41;
            case 58 -> 5;
            case 59 -> 43;
            case 60 -> 50;
            case 61 -> 52;
            case 62 -> 27;
            default -> 38;
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
        dK.l[n3] = new String(cArray);
        return n3;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    @cP
    public Object a() {
        return this.b;
    }

    @cP
    public void a(Object object) {
        this.b = object;
    }

    @cP
    public dK setDescription(String string) {
        this.c = string;
        return this;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(dK.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


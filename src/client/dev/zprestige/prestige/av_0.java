/*
 * Decompiled with CFR 0.152.
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.eB;
import dev.zprestige.prestige.hc;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
 * Renamed from dev.zprestige.prestige.av
 */
class av_0
implements Runnable {
    eB a;
    private static final long b = hc.a(3112562732384385259L, 8740135536137229267L, MethodHandles.lookup().lookupClass()).a(88759648713815L);
    private static final Object[] c = new Object[14];
    private static final String[] d = new String[14];

    av_0(eB eB2) {
        this.a = eB2;
    }

    static {
        av_0.a();
    }

    @Override
    public void run() {
        block9: {
            eB eB2;
            long l;
            long l2;
            block8: {
                boolean bl;
                block6: {
                    CallSite callSite;
                    long l3;
                    block7: {
                        long l4 = l2 = b ^ 0x6BCE232786C5L;
                        l = l4 ^ 0x2887EC005135L;
                        l3 = l4 ^ 0x24578179783L;
                        this.a.F = 0;
                        callSite = av_0.a("\u00e2", (long)-5792318155594823394L, (long)l2);
                        try {
                            bl = this.a.E;
                            if (callSite != null) break block6;
                            if (bl) break block7;
                        }
                        catch (MatchException matchException) {
                            throw av_0.a("\u00e2", (Object)matchException, (long)-5792255904429723369L, (long)l2);
                        }
                        return;
                    }
                    try {
                        Object[] objectArray = new Object[1];
                        objectArray[0] = l3;
                        av_0.a("\u00ec", (Object)this.a, (Object)objectArray, (long)-5792736503297769296L, (long)l2);
                        eB2 = this.a;
                        if (callSite != null) break block8;
                        bl = eB2.E;
                    }
                    catch (MatchException matchException) {
                        throw av_0.a("\u00e2", (Object)matchException, (long)-5792255904429723369L, (long)l2);
                    }
                }
                try {
                    if (!bl) break block9;
                    eB2 = this.a;
                }
                catch (MatchException matchException) {
                    throw av_0.a("\u00e2", (Object)matchException, (long)-5792255904429723369L, (long)l2);
                }
            }
            Object[] objectArray = new Object[1];
            objectArray[0] = l;
            av_0.a("\u00ec", (Object)eB2, (Object)objectArray, (long)-5792680678181376612L, (long)l2);
        }
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = av_0.a(l, l2);
            object = c[n];
            try {
                if (!(object instanceof String)) break block2;
                av_0.c[n] = clazz = Class.forName(d[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = av_0.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = av_0.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = av_0.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = av_0.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l, long l2) {
        int n = av_0.a(l, l2);
        Object object = c[n];
        if (object instanceof String) {
            String string = d[n];
            int n2 = string.indexOf(8);
            Class clazz = av_0.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = av_0.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = av_0.a(clazz3, string2, clazz2)) != null) {
                    av_0.c[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = av_0.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        av_0.c[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = av_0.b(647238725606764L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = av_0.a(l, l2);
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
                clazz3 = av_0.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = av_0.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = av_0.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        av_0.c[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = av_0.b(647238725606764L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = av_0.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        av_0.c[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = av_0.b(647238725606764L, 0L);
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

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/av" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'x' || c == '\u00c3' || c == '\u00cc' || c == 'i') {
                field = av_0.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'x' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00c3' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00cc' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = av_0.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00ec' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00e2' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = av_0.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static void a() {
        Object[] objectArray = c;
        c[0] = "\u000bAhh\u000fI\u001dAm2\u001c^\n\nn4\u0010J\u001bMy#[X'";
        objectArray[1] = "|c0f:g\tC;i+(t[(n\"a\u001c";
        objectArray[2] = "\u000f\u0001k)PZ\u0019\u0001nsCM\u000eJmuOY\u001f\rzb\u0004O)";
        objectArray[3] = "<#'\u001d\u0010bI\u0003,\u0012\u0001-(\r'\u0019\u0005w\\";
        objectArray[4] = Boolean.TYPE;
        av_0.d[4] = "java/lang/Boolean";
        objectArray[5] = "\u007fqbh$u\nQig5:k_bl1`\u001f";
        objectArray[6] = Void.TYPE;
        av_0.d[6] = "java/lang/Void";
        objectArray[7] = "CqO |/UqJzo8B:I|c,S}^k(>Q";
        objectArray[8] = "@PW\u001b]yK_FT>t^RI?\u000bvOAU\u0013\u001c{";
        objectArray[9] = "5;*w*Z>4;8KT5??b";
        objectArray[10] = "$aL`B004O\u001eA_qa\u0016zTa4aW$+";
        objectArray[11] = "aH_\u001bf8/_R\u001c\u001c>]\u0007\u0000C}%,]\u0001\u0017bWc\t\b\u001an&9\b\\\u0005\u001c";
        objectArray[12] = "\nxuNFi\fs\u007fA7t3%wN\u000f~Y%c^\\\u0018\brw\fZ\"I\"`T7";
        Object[] objectArray2 = objectArray;
        objectArray[13] = "\u0015o#I\f\r\u0013d)F}\u001b,2!IE\u001aF25Y\u0016|\u0010p+Q\u0018\u0010M7wH}";
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
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
            case 0 -> 16;
            case 1 -> 32;
            case 2 -> 19;
            case 3 -> 25;
            case 4 -> 38;
            case 5 -> 28;
            case 6 -> 35;
            case 7 -> 48;
            case 8 -> 63;
            case 9 -> 52;
            case 10 -> 23;
            case 11 -> 7;
            case 12 -> 27;
            case 13 -> 61;
            case 14 -> 31;
            case 15 -> 46;
            case 16 -> 8;
            case 17 -> 2;
            case 18 -> 24;
            case 19 -> 54;
            case 20 -> 40;
            case 21 -> 5;
            case 22 -> 62;
            case 23 -> 60;
            case 24 -> 47;
            case 25 -> 1;
            case 26 -> 15;
            case 27 -> 13;
            case 28 -> 30;
            case 29 -> 0;
            case 30 -> 44;
            case 31 -> 17;
            case 32 -> 59;
            case 33 -> 10;
            case 34 -> 45;
            case 35 -> 36;
            case 36 -> 50;
            case 37 -> 18;
            case 38 -> 51;
            case 39 -> 14;
            case 40 -> 53;
            case 41 -> 42;
            case 42 -> 56;
            case 43 -> 58;
            case 44 -> 39;
            case 45 -> 20;
            case 46 -> 22;
            case 47 -> 6;
            case 48 -> 29;
            case 49 -> 43;
            case 50 -> 21;
            case 51 -> 37;
            case 52 -> 55;
            case 53 -> 9;
            case 54 -> 26;
            case 55 -> 57;
            case 56 -> 33;
            case 57 -> 3;
            case 58 -> 12;
            case 59 -> 41;
            case 60 -> 11;
            case 61 -> 34;
            case 62 -> 4;
            default -> 49;
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
        av_0.d[n3] = new String(cArray);
        return n3;
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

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(av_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


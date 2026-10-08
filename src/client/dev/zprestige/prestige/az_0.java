/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector4f
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.cF;
import dev.zprestige.prestige.dq_0;
import dev.zprestige.prestige.dt_0;
import dev.zprestige.prestige.gL;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.function.BiConsumer;
import org.joml.Vector4f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from dev.zprestige.prestige.az
 */
public final class az_0
implements dq_0 {
    private final BiConsumer a;
    private final gL b;
    private static final Object[] c = new Object[7];
    private static final String[] d = new String[7];

    public az_0(dt_0 dt_02, Vector4f vector4f, BiConsumer biConsumer) {
        this.a = biConsumer;
        this.b = new gL(vector4f, dt_02);
    }

    public az_0(dt_0 dt_02, BiConsumer biConsumer) {
        this(dt_02, null, biConsumer);
    }

    static {
        az_0.a();
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = az_0.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = az_0.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = az_0.a(l, l2);
            object = c[n];
            try {
                if (!(object instanceof String)) break block2;
                az_0.c[n] = clazz = Class.forName(d[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = az_0.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = az_0.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field c(long l, long l2) {
        int n = az_0.a(l, l2);
        Object object = c[n];
        if (object instanceof String) {
            String string = d[n];
            int n2 = string.indexOf(8);
            Class clazz = az_0.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = az_0.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = az_0.a(clazz3, string2, clazz2)) != null) {
                    az_0.c[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = az_0.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        az_0.c[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = az_0.b(231255955778665L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = az_0.a(l, l2);
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
                clazz3 = az_0.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = az_0.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = az_0.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        az_0.c[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = az_0.b(231255955778665L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = az_0.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        az_0.c[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = az_0.b(231255955778665L, 0L);
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

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/az" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = az_0.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00e4' || c == 'i' || c == 'q' || c == 't') {
                field = az_0.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e4' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'i' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'q' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = az_0.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00c1' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00de' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    @Override
    public void a(Object[] objectArray) {
        cF cF2 = (cF)objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        long l = (Long)objectArray[2];
        az_0.a("\u00c1", (Object)this.a, (Object)az_0.a("\u00de", (float)f, (long)-938693103126644837L, (long)l), (Object)cF2, (long)-938473390217314176L, (long)l);
    }

    @Override
    public gL a(Object[] objectArray) {
        return this.b;
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
            case 0 -> 52;
            case 1 -> 17;
            case 2 -> 14;
            case 3 -> 4;
            case 4 -> 47;
            case 5 -> 22;
            case 6 -> 41;
            case 7 -> 2;
            case 8 -> 44;
            case 9 -> 55;
            case 10 -> 43;
            case 11 -> 26;
            case 12 -> 49;
            case 13 -> 27;
            case 14 -> 12;
            case 15 -> 61;
            case 16 -> 23;
            case 17 -> 28;
            case 18 -> 30;
            case 19 -> 25;
            case 20 -> 8;
            case 21 -> 51;
            case 22 -> 3;
            case 23 -> 50;
            case 24 -> 60;
            case 25 -> 46;
            case 26 -> 34;
            case 27 -> 1;
            case 28 -> 42;
            case 29 -> 31;
            case 30 -> 39;
            case 31 -> 58;
            case 32 -> 38;
            case 33 -> 53;
            case 34 -> 59;
            case 35 -> 35;
            case 36 -> 37;
            case 37 -> 13;
            case 38 -> 16;
            case 39 -> 32;
            case 40 -> 19;
            case 41 -> 45;
            case 42 -> 36;
            case 43 -> 57;
            case 44 -> 21;
            case 45 -> 56;
            case 46 -> 48;
            case 47 -> 5;
            case 48 -> 40;
            case 49 -> 63;
            case 50 -> 54;
            case 51 -> 0;
            case 52 -> 9;
            case 53 -> 7;
            case 54 -> 10;
            case 55 -> 29;
            case 56 -> 62;
            case 57 -> 33;
            case 58 -> 24;
            case 59 -> 20;
            case 60 -> 6;
            case 61 -> 11;
            case 62 -> 15;
            default -> 18;
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
        az_0.d[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = c;
        c[0] = "\u0002{uZWE\ttd\u0015?E\u0007{w";
        objectArray[1] = Float.TYPE;
        az_0.d[1] = "java/lang/Float";
        objectArray[2] = "P\u001e#\r{gN\u00169B3gT\u001c!\u0005:|\u0014=</:|I\n8\t'";
        objectArray[3] = "+OI8a\f @Xw\u0000\u0002+K\\-";
        objectArray[4] = Void.TYPE;
        az_0.d[4] = "java/lang/Void";
        objectArray[5] = "$i~chB oc\n*T-yaM:=pon{/Rut`zTP$ve6+T\"k\f";
        Object[] objectArray2 = objectArray;
        objectArray[6] = "\t7YFL\u000eM(\u0004\u0019#^[!Q__7\n{N\u001eBO\u000f4^K#\r\u00018\u0005F[\bN(P'\u0018\u000eApA\u0016\u001a\n^5<";
    }

    private static Field a(Class clazz, String string, Class clazz2) {
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
            return MethodHandles.lookup().findStatic(az_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


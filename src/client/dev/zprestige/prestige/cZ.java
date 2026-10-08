/*
 * Decompiled with CFR 0.152.
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
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class cZ
implements Iterable {
    private final Set a;
    private final Set b;
    private static final long c = hc.a(647733351790209687L, -1379091143787204390L, MethodHandles.lookup().lookupClass()).a(280919188952181L);
    private static final Object[] d = new Object[27];
    private static final String[] e = new String[27];

    @SafeVarargs
    public cZ(Object[] objectArray, long l) {
        l = c ^ l;
        this.a = cZ.a("\u00b5", (long)8171779539112000693L, (long)l);
        this.b = cZ.a("\u00b5", (Object)this.a, (long)8170850793525005920L, (long)l);
        cZ.a("\u00b5", (Object)this.a, (Object)objectArray, (long)8171264414682090356L, (long)l);
    }

    static {
        cZ.a();
    }

    public boolean e(Object[] objectArray) {
        Object object = objectArray[0];
        long l = (Long)objectArray[1];
        l = c ^ l;
        return (boolean)cZ.a("\u00f3", (Object)this.a, (Object)object, (long)1343693252172222047L, (long)l);
    }

    public Iterator iterator() {
        long l = c ^ 0x166FDC26E1ABL;
        return cZ.a("\u00f3", (Object)this.b, (long)-1269784329172123086L, (long)l);
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = cZ.a(l, l2);
            object = d[n];
            try {
                if (!(object instanceof String)) break block2;
                cZ.d[n] = clazz = Class.forName(e[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = cZ.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = cZ.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = cZ.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = cZ.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public boolean b(Object[] objectArray) {
        Object object = objectArray[0];
        long l = (Long)objectArray[1];
        l = c ^ l;
        return (boolean)cZ.a("\u00f3", (Object)this.a, (Object)object, (long)-5977389318574444331L, (long)l);
    }

    public boolean c(Object[] objectArray) {
        int n;
        block2: {
            Collection collection = (Collection)objectArray[0];
            long l = (Long)objectArray[1];
            l = c ^ l;
            int n2 = 0;
            CallSite callSite = cZ.a("\u00b5", (long)-7673920542003819572L, (long)l);
            CallSite callSite2 = cZ.a("\u00f3", (Object)collection, (long)-7672614649730070841L, (long)l);
            while (cZ.a("\u00f3", (Object)callSite2, (long)-7672418718544831024L, (long)l) != false) {
                CallSite callSite3 = cZ.a("\u00f3", (Object)callSite2, (long)-7673971134232185979L, (long)l);
                n = n2 | cZ.a("\u00f3", (Object)this.a, (Object)callSite3, (long)-7672685982119446677L, (long)l);
                if (callSite == null) {
                    n2 = n;
                    if (callSite == null) continue;
                }
                break block2;
            }
            n = n2;
        }
        return n != 0;
    }

    private static Field c(long l, long l2) {
        int n = cZ.a(l, l2);
        Object object = d[n];
        if (object instanceof String) {
            String string = e[n];
            int n2 = string.indexOf(8);
            Class clazz = cZ.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = cZ.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = cZ.a(clazz3, string2, clazz2)) != null) {
                    cZ.d[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = cZ.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        cZ.d[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = cZ.b(70895674830919L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public boolean f(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = c ^ l;
        return (boolean)cZ.a("\u00f3", (Object)this.a, (long)-1345765270219890837L, (long)l);
    }

    public boolean d(Object[] objectArray) {
        int n;
        block2: {
            Collection collection = (Collection)objectArray[0];
            long l = (Long)objectArray[1];
            l = c ^ l;
            int n2 = 0;
            CallSite callSite = cZ.a("\u00b5", (long)-774104798271935731L, (long)l);
            CallSite callSite2 = cZ.a("\u00f3", (Object)collection, (long)-773361819342805498L, (long)l);
            while (cZ.a("\u00f3", (Object)callSite2, (long)-772642256241115887L, (long)l) != false) {
                CallSite callSite3 = cZ.a("\u00f3", (Object)callSite2, (long)-774194947151342780L, (long)l);
                n = n2 | cZ.a("\u00f3", (Object)this.a, (Object)callSite3, (long)-772801744926365537L, (long)l);
                if (callSite == null) {
                    n2 = n;
                    if (callSite == null) continue;
                }
                break block2;
            }
            n = n2;
        }
        return n != 0;
    }

    private static Method d(long l, long l2) {
        int n = cZ.a(l, l2);
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
                clazz3 = cZ.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = cZ.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = cZ.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        cZ.d[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = cZ.b(70895674830919L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = cZ.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        cZ.d[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = cZ.b(70895674830919L, 0L);
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

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = cZ.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00e3' || c == '\u00ee' || c == 'N' || c == 'p') {
                field = cZ.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e3' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ee' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'N' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = cZ.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00f3' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00b5' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/cZ" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
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

    public Set a(Object[] objectArray) {
        return this.b;
    }

    public int a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = c ^ l;
        return (int)cZ.a("\u00f3", (Object)this.a, (long)2326239022729536271L, (long)l);
    }

    public void a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = c ^ l;
        cZ.a("\u00f3", (Object)this.a, (long)3192344759063819801L, (long)l);
    }

    public boolean a(Object[] objectArray) {
        Object object = objectArray[0];
        long l = (Long)objectArray[1];
        l = c ^ l;
        return (boolean)cZ.a("\u00f3", (Object)this.a, (Object)object, (long)7725715426955577817L, (long)l);
    }

    private static int a(long l, long l2) {
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
            case 0 -> 35;
            case 1 -> 16;
            case 2 -> 22;
            case 3 -> 38;
            case 4 -> 55;
            case 5 -> 27;
            case 6 -> 7;
            case 7 -> 58;
            case 8 -> 20;
            case 9 -> 46;
            case 10 -> 23;
            case 11 -> 18;
            case 12 -> 48;
            case 13 -> 31;
            case 14 -> 43;
            case 15 -> 12;
            case 16 -> 61;
            case 17 -> 33;
            case 18 -> 10;
            case 19 -> 1;
            case 20 -> 0;
            case 21 -> 62;
            case 22 -> 39;
            case 23 -> 42;
            case 24 -> 13;
            case 25 -> 63;
            case 26 -> 56;
            case 27 -> 8;
            case 28 -> 49;
            case 29 -> 9;
            case 30 -> 30;
            case 31 -> 34;
            case 32 -> 60;
            case 33 -> 36;
            case 34 -> 11;
            case 35 -> 52;
            case 36 -> 54;
            case 37 -> 51;
            case 38 -> 50;
            case 39 -> 57;
            case 40 -> 53;
            case 41 -> 19;
            case 42 -> 44;
            case 43 -> 17;
            case 44 -> 21;
            case 45 -> 24;
            case 46 -> 14;
            case 47 -> 47;
            case 48 -> 37;
            case 49 -> 6;
            case 50 -> 45;
            case 51 -> 29;
            case 52 -> 26;
            case 53 -> 25;
            case 54 -> 28;
            case 55 -> 3;
            case 56 -> 5;
            case 57 -> 40;
            case 58 -> 4;
            case 59 -> 59;
            case 60 -> 41;
            case 61 -> 15;
            case 62 -> 2;
            default -> 32;
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
        cZ.e[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = d;
        d[0] = "\u0002\\C?k\n\u001cTYp\f\u000b\rOT**\r";
        objectArray[1] = "8\fI0\rf3\u0003X\u007flh8\b\\%";
        objectArray[2] = "\u0006\u001c\u001a\u001drc\u0010\u001c\u001fGat\u0007W\u001cAm`\u0016\u0010\u000bV&r*";
        objectArray[3] = "JZ\u000b\u0007\u0012\u0018?z\u0000\b\u0003WBb\u0013\u000f\n\u001e*";
        objectArray[4] = "\u0001oShgg\u001fgI'\u001aw\u001f";
        objectArray[5] = Boolean.TYPE;
        cZ.e[5] = "java/lang/Boolean";
        objectArray[6] = "A\u0001$ymd_\t>6\u0000~G\f7{7xD\u000e";
        objectArray[7] = Void.TYPE;
        cZ.e[7] = "java/lang/Void";
        objectArray[8] = "\u0007lKq\rP\u0019dQ>`J\u0001aXsWL\u0002cN";
        objectArray[9] = "*ms>\u0015\t_Mx1\u0004F>Cs:\u0000\u001cJ";
        objectArray[10] = "?\u0007rb\u0019\n!\u000fh-T\u0010;\u0005qqE\u001a;\u0012*@X\u00116\u0013vqR\u0011!.ep_24\u0016";
        objectArray[11] = "L?VEsTR7L\n>NH=UV/DH*\u000eg2OE+RV8OR\u0016AW5lG.\u0004o8Xu;Tr4DQ";
        objectArray[12] = Integer.TYPE;
        cZ.e[12] = "java/lang/Integer";
        objectArray[13] = "0oP\u001d\u0011U5yCOvOjtR FLzxTQJMe8?";
        objectArray[14] = "Jg-\u0006p=Egliy4\u0005f\u001d\u0011#!Mgw\rz'u";
        objectArray[15] = "x\u0007,GgRx\u0004u\u0012\u001bDAA*J+\u0013%\u0006!Xc.";
        objectArray[16] = "iJpbN/9N%c5>8[ShQWh\tj7\r67\\ap5i6Nb0H17Ow\f\u000e,m\u000b#iR=iZ\u001a";
        objectArray[17] = "k\"0\u0002\u0012vn4#Pum=.8A\u0018\u0017(w'\u0007\b}4.!?NliwfZ\u0012}m&_";
        objectArray[18] = "X8}[Wx].n\t0x\u0018\u001cw\u001eLhcji_\f \u00066x[]\u0019";
        objectArray[19] = "4\u000eh'rr1\u0018{u\u0015rs\n}situg8g%|`\u00037gd\u0013";
        objectArray[20] = "0L3\u0018\u0005I?Lrw\nDtwn\u0007\u0016-4J:KSHh[>\u001aj";
        objectArray[21] = "V|x1C Sjkc$*\tx~v$|Pwx1X\u007f\u0001~j\f";
        objectArray[22] = "CU<O\u0012*FC/\u001du \u001fZ/\u001b\u0014-\u0003<+N\rs\u0005V7\u0017\u000bKCGjNL.\u001fVn\u001fu";
        objectArray[23] = "j\u0015\r`,i,\u0011\t!\u001d?8\u0003w3l\u00028\u00004n\"0*L\no\"&m|";
        objectArray[24] = "\u000fV.hE$\n@=:\",XSA-\u001e=\fB+1G;4\u0004:l\u001e|QX+hOE";
        objectArray[25] = "\t,L\u0015XoVyGR`oI\u007fFG\u001ciO\u0012\u0003SPaZv\fS\u0011\u000e";
        Object[] objectArray2 = objectArray;
        objectArray[26] = "?\u001d\u000f\u0019\u0000\u0007o\u0019Z\u0018{\u0002d\u0005\u0002\u001b\u001a\u0011c\t\u000f\u0013\u0016$o\u001ceL\u0012\u0010?\u0007\u0004I\u0004\u0003m`^\u001e\u0014Be\u0001[\b\u0007\u0010\u0002";
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
            return MethodHandles.lookup().findStatic(cZ.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


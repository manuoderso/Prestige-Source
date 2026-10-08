/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1735
 *  net.minecraft.class_465
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
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1735;
import net.minecraft.class_465;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class J {
    private final class_465 a;
    private static final long b = hc.a(2049891224100206598L, 6547979808893712550L, MethodHandles.lookup().lookupClass()).a(88557605913127L);
    private static final String c;
    private static final Object[] d;
    private static final String[] e;

    public J(class_465 class_4652) {
        this.a = class_4652;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        d = new Object[12];
        e = new String[12];
        J.a();
        long l = b ^ 0x4BF4EE6F6121L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u00f8w\u00fb\u00f7\u0001 (>w}\u00a8}Oo)\u0003".getBytes("ISO-8859-1"));
                c = J.a(byArray3).intern();
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = J.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = J.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public int b(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l = b ^ l;
        long l3 = l2 ^ 0x484C9C86A8E4L;
        long l4 = l2 ^ 0x3DC4577D4512L;
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = l4;
        objectArray2[3] = J.a("\u00c9", (long)-164969026017911761L, (long)l);
        objectArray2[2] = class_465.class;
        objectArray2[1] = "y";
        objectArray2[0] = this.a;
        CallSite callSite = J.a("\u00fe", (Object)objectArray2, (long)-165095228745026863L, (long)l);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l3;
        return (int)J.a("\u00f2", (Object)((Integer)((Object)J.a("\u00f2", (Object)callSite, (Object)objectArray3, (long)-165184603262622028L, (long)l))), (long)-165076268615952059L, (long)l);
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = J.a(l, l2);
            object = d[n];
            try {
                if (!(object instanceof String)) break block2;
                J.d[n] = clazz = Class.forName(e[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = J.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = J.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field c(long l, long l2) {
        int n = J.a(l, l2);
        Object object = d[n];
        if (object instanceof String) {
            String string = e[n];
            int n2 = string.indexOf(8);
            Class clazz = J.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = J.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = J.a(clazz3, string2, clazz2)) != null) {
                    J.d[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = J.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        J.d[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = J.b(169767679190696L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = J.a(l, l2);
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
                clazz3 = J.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = J.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = J.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        J.d[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = J.b(169767679190696L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = J.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        J.d[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = J.b(169767679190696L, 0L);
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

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'o' || c == 'd' || c == '\u00c9' || c == '\u00c6') {
                field = J.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'o' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'd' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00c9' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = J.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00f2' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00fe' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
            throw new RuntimeException("dev/zprestige/prestige/J" + " : " + string + " : " + methodType.toString(), exception);
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

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = J.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public class_1735 a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l = b ^ l;
        long l3 = l2 ^ 0x790AC54FE7ECL;
        long l4 = l2 ^ 0xC820EB40A1AL;
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = l4;
        objectArray2[3] = class_1735.class;
        objectArray2[2] = class_465.class;
        objectArray2[1] = c;
        objectArray2[0] = this.a;
        CallSite callSite = J.a("\u00fe", (Object)objectArray2, (long)-5567214923621909031L, (long)l);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l3;
        return (class_1735)J.a("\u00f2", (Object)callSite, (Object)objectArray3, (long)-5567271312773895748L, (long)l);
    }

    public int a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l = b ^ l;
        long l3 = l2 ^ 0x2E5F5A9C56B7L;
        long l4 = l2 ^ 0x5BD79167BB41L;
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = l4;
        objectArray2[3] = J.a("\u00c9", (long)281069912898167420L, (long)l);
        objectArray2[2] = class_465.class;
        objectArray2[1] = "x";
        objectArray2[0] = this.a;
        CallSite callSite = J.a("\u00fe", (Object)objectArray2, (long)280930514017225858L, (long)l);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l3;
        return (int)J.a("\u00f2", (Object)((Integer)((Object)J.a("\u00f2", (Object)callSite, (Object)objectArray3, (long)280986146185418983L, (long)l))), (long)281173787403511574L, (long)l);
    }

    private static String a(byte[] byArray) {
        int n = 0;
        int n2 = byArray.length;
        char[] cArray = new char[n2];
        for (int i = 0; i < n2; ++i) {
            char c;
            int n3 = 0xFF & byArray[i];
            if (n3 < 192) {
                cArray[n++] = (char)n3;
                continue;
            }
            if (n3 < 224) {
                c = (char)((char)(n3 & 0x1F) << 6);
                n3 = byArray[++i];
                c = (char)(c | (char)(n3 & 0x3F));
                cArray[n++] = c;
                continue;
            }
            if (i >= n2 - 2) continue;
            c = (char)((char)(n3 & 0xF) << 12);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F) << 6);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F));
            cArray[n++] = c;
        }
        return new String(cArray, 0, n);
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
            case 0 -> 57;
            case 1 -> 25;
            case 2 -> 15;
            case 3 -> 23;
            case 4 -> 17;
            case 5 -> 63;
            case 6 -> 35;
            case 7 -> 52;
            case 8 -> 59;
            case 9 -> 5;
            case 10 -> 22;
            case 11 -> 53;
            case 12 -> 33;
            case 13 -> 60;
            case 14 -> 19;
            case 15 -> 51;
            case 16 -> 18;
            case 17 -> 38;
            case 18 -> 61;
            case 19 -> 24;
            case 20 -> 14;
            case 21 -> 34;
            case 22 -> 13;
            case 23 -> 29;
            case 24 -> 48;
            case 25 -> 28;
            case 26 -> 46;
            case 27 -> 40;
            case 28 -> 16;
            case 29 -> 45;
            case 30 -> 62;
            case 31 -> 4;
            case 32 -> 6;
            case 33 -> 55;
            case 34 -> 2;
            case 35 -> 12;
            case 36 -> 3;
            case 37 -> 54;
            case 38 -> 56;
            case 39 -> 58;
            case 40 -> 30;
            case 41 -> 0;
            case 42 -> 43;
            case 43 -> 49;
            case 44 -> 36;
            case 45 -> 31;
            case 46 -> 32;
            case 47 -> 41;
            case 48 -> 20;
            case 49 -> 50;
            case 50 -> 9;
            case 51 -> 26;
            case 52 -> 39;
            case 53 -> 7;
            case 54 -> 27;
            case 55 -> 47;
            case 56 -> 44;
            case 57 -> 42;
            case 58 -> 8;
            case 59 -> 1;
            case 60 -> 37;
            case 61 -> 11;
            case 62 -> 21;
            default -> 10;
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
        J.e[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = d;
        d[0] = "\b\u0018}\u001f\bg\u001e\u0018xE\u001bp\tS{C\u0017d\u0018\u0014lT\\u=";
        objectArray[1] = "\u0006F{\u0010C~sfp\u001fR1\u0012h{\u0014Vkf";
        objectArray[2] = "~XO@;\u001cuW^\u000fZ\u0012~\\ZU";
        objectArray[3] = "t]X0q+\u007fRI\u007f\u0016)jYI4-";
        objectArray[4] = Integer.TYPE;
        J.e[4] = "java/lang/Integer";
        objectArray[5] = "\b5\u0018O\u0003}\u0003:\t\u0000n}\u0003'\u001d";
        objectArray[6] = "h0(p\nb~0-*\u0019ui{.,\u0015ax<9;^qZ";
        objectArray[7] = "+\\~\u0000~\u001c^|u\u000foS?r~\u0004k\tK";
        objectArray[8] = "SX\tKv%\fT\u0003pcGW\r\u0015\u00115&\u0005\u0004\t\u000e\n~\r\u0003\tO27PRTp";
        objectArray[9] = "}\u0010<.q~+\u000e~o\u000e,AV5ooy \u0004<spFx\u000eh%r$'\u0002b\u001e";
        objectArray[10] = "'\u0007H%Vv QGy-'{K)pI;p7LpP<x\u000b\u0010%Bw\u001d";
        Object[] objectArray2 = objectArray;
        objectArray[11] = "Sw\u0013RoIT!\u001c\u000e\u0014%8\u001fan(A\u0015!SSnB\u0002~";
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
            return MethodHandles.lookup().findStatic(J.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


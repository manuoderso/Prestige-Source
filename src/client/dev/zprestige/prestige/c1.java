/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.textures.GpuTexture
 *  com.mojang.blaze3d.textures.GpuTextureView
 *  net.minecraft.class_1044
 *  net.minecraft.class_10868
 *  net.minecraft.class_11391
 *  net.minecraft.class_12247$class_12337
 *  net.minecraft.class_1921
 *  net.minecraft.class_2960
 *  net.minecraft.class_4588
 */
package dev.zprestige.prestige;

import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.GpuTextureView;
import dev.zprestige.prestige.Z;
import dev.zprestige.prestige.cF;
import dev.zprestige.prestige.dp_0;
import dev.zprestige.prestige.gF;
import dev.zprestige.prestige.hc;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import java.util.Optional;
import net.minecraft.class_1044;
import net.minecraft.class_10868;
import net.minecraft.class_11391;
import net.minecraft.class_12247;
import net.minecraft.class_1921;
import net.minecraft.class_2960;
import net.minecraft.class_4588;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class c1 {
    private static final long a = hc.a(4547278647526299323L, -4308860883589342473L, MethodHandles.lookup().lookupClass()).a(115756030443385L);
    private static final Object[] b = new Object[61];
    private static final String[] c = new String[61];

    static {
        c1.a();
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = c1.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = c1.b(classArray2[i], string, clazz2, n, classArray);
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
            int n = c1.a(l, l2);
            object = b[n];
            try {
                if (!(object instanceof String)) break block2;
                c1.b[n] = clazz = Class.forName(c[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = c1.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = c1.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static Optional b(Object[] objectArray) {
        class_2960 class_29602 = (class_2960)objectArray[0];
        long l = (Long)objectArray[1];
        l = a ^ l;
        CallSite callSite = c1.a("\u00ec", (Object)c1.a("\u00f9", (long)8729136348361332820L, (long)l), (long)8730113097959736254L, (long)l);
        CallSite callSite2 = c1.a("\u00f9", (Object)c1.a("\u00ec", (Object)callSite, (Object)class_29602, (long)8729665652270697564L, (long)l), (long)8728282044117196372L, (long)l);
        return c1.a("\u00ec", (Object)c1.a("\u00ec", (Object)c1.a("\u00ec", (Object)c1.a("\u00ec", (Object)callSite2, class_1044::method_71659, (long)8728096146241207014L, (long)l), GpuTextureView::texture, (long)8728096146241207014L, (long)l), c1::lambda$resolveTextureId$0, (long)8728823377415279628L, (long)l), c1::lambda$resolveTextureId$1, (long)8728096146241207014L, (long)l);
    }

    private static Field c(long l, long l2) {
        int n = c1.a(l, l2);
        Object object = b[n];
        if (object instanceof String) {
            String string = c[n];
            int n2 = string.indexOf(8);
            Class clazz = c1.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = c1.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = c1.a(clazz3, string2, clazz2)) != null) {
                    c1.b[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = c1.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        c1.b[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = c1.b(83448404124424L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = c1.a(l, l2);
        Object object = b[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = c[n];
                int n3 = string2.indexOf(8);
                clazz3 = c1.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = c1.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = c1.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        c1.b[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = c1.b(83448404124424L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = c1.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        c1.b[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = c1.b(83448404124424L, 0L);
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

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/c1" + " : " + string + " : " + methodType.toString(), exception);
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

    public static Optional a(Object[] objectArray) {
        Object object;
        long l;
        block19: {
            Object object2;
            ArrayList arrayList;
            block17: {
                CallSite callSite;
                CallSite callSite2;
                block14: {
                    CallSite callSite3;
                    block15: {
                        class_1921 class_19212 = (class_1921)objectArray[0];
                        l = (Long)objectArray[1];
                        long l2 = (l = a ^ l) ^ 0x139D0B00EFC1L;
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l2;
                        callSite3 = c1.a("\u00ec", (Object)new Z(class_19212), (Object)objectArray2, (long)854179574892628452L, (long)l);
                        callSite2 = c1.a("\u00f9", (long)854275716013087235L, (long)l);
                        try {
                            try {
                                callSite = callSite3;
                                if (callSite2 != null) break block14;
                                if (callSite != null) break block15;
                            }
                            catch (MatchException matchException) {
                                throw c1.a("\u00f9", (Object)matchException, (long)853866652539563052L, (long)l);
                            }
                            return c1.a("\u00f9", (long)855264361677362888L, (long)l);
                        }
                        catch (MatchException matchException) {
                            throw c1.a("\u00f9", (Object)matchException, (long)853866652539563052L, (long)l);
                        }
                    }
                    callSite = callSite3;
                }
                CallSite callSite4 = c1.a("\u00ec", (Object)callSite, (long)853718772468546390L, (long)l);
                arrayList = new ArrayList();
                CallSite callSite5 = c1.a("\u00ec", (Object)c1.a("\u00ec", (Object)callSite4, (long)855489532731533375L, (long)l), (long)854499116137378542L, (long)l);
                while (c1.a("\u00ec", (Object)callSite5, (long)853434314437584987L, (long)l) != false) {
                    block18: {
                        CallSite callSite6;
                        block16: {
                            Map.Entry entry = (Map.Entry)((Object)c1.a("\u00ec", (Object)callSite5, (long)855369195481351419L, (long)l));
                            CallSite callSite7 = c1.a("\u00ec", (Object)((class_12247.class_12337)c1.a("\u00ec", (Object)entry, (long)855680943213022183L, (long)l)), (long)854779920552267857L, (long)l);
                            try {
                                try {
                                    callSite6 = callSite7;
                                    if (callSite2 != null) break block16;
                                    object2 = callSite6 instanceof class_11391;
                                    if (callSite2 != null) break block17;
                                }
                                catch (MatchException matchException) {
                                    throw c1.a("\u00f9", (Object)matchException, (long)853866652539563052L, (long)l);
                                }
                                if (object2 == false) break block18;
                            }
                            catch (MatchException matchException) {
                                throw c1.a("\u00f9", (Object)matchException, (long)853866652539563052L, (long)l);
                            }
                            callSite6 = callSite7;
                        }
                        class_11391 class_113912 = (class_11391)callSite6;
                        c1.a("\u00ec", arrayList, (Object)c1.a("\u00f9", (int)c1.a("\u00ec", (Object)c1.a("\u00ec", (Object)class_113912, (long)855168529090739856L, (long)l), (long)854322146767082773L, (long)l), (long)854469209487386192L, (long)l), (long)854618577847169314L, (long)l);
                    }
                    if (callSite2 == null) continue;
                }
                try {
                    object = arrayList;
                    if (callSite2 != null) break block19;
                    object2 = c1.a("\u00ec", object, (long)853927873319182004L, (long)l);
                }
                catch (MatchException matchException) {
                    throw c1.a("\u00f9", (Object)matchException, (long)853866652539563052L, (long)l);
                }
            }
            try {
                if (object2 != false) {
                    return c1.a("\u00f9", (long)855264361677362888L, (long)l);
                }
            }
            catch (MatchException matchException) {
                throw c1.a("\u00f9", (Object)matchException, (long)853866652539563052L, (long)l);
            }
            object = c1.a("\u00ec", arrayList, (int)0, (long)854890499230340830L, (long)l);
        }
        return c1.a("\u00f9", (Object)((Integer)object), (long)855560458220373821L, (long)l);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00ce' || c == '\u00dc' || c == 'c' || c == '\u00a2') {
                field = c1.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00ce' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00dc' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'c' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = c1.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00ec' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00f9' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = c1.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (c[n3] != null) {
            return n3;
        }
        Object object = b[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 35;
            case 1 -> 47;
            case 2 -> 37;
            case 3 -> 30;
            case 4 -> 55;
            case 5 -> 53;
            case 6 -> 22;
            case 7 -> 20;
            case 8 -> 14;
            case 9 -> 58;
            case 10 -> 46;
            case 11 -> 31;
            case 12 -> 0;
            case 13 -> 36;
            case 14 -> 25;
            case 15 -> 60;
            case 16 -> 61;
            case 17 -> 32;
            case 18 -> 10;
            case 19 -> 33;
            case 20 -> 18;
            case 21 -> 63;
            case 22 -> 50;
            case 23 -> 59;
            case 24 -> 19;
            case 25 -> 26;
            case 26 -> 29;
            case 27 -> 12;
            case 28 -> 23;
            case 29 -> 52;
            case 30 -> 1;
            case 31 -> 21;
            case 32 -> 7;
            case 33 -> 57;
            case 34 -> 43;
            case 35 -> 54;
            case 36 -> 13;
            case 37 -> 48;
            case 38 -> 8;
            case 39 -> 27;
            case 40 -> 51;
            case 41 -> 45;
            case 42 -> 2;
            case 43 -> 9;
            case 44 -> 41;
            case 45 -> 28;
            case 46 -> 6;
            case 47 -> 44;
            case 48 -> 62;
            case 49 -> 4;
            case 50 -> 34;
            case 51 -> 56;
            case 52 -> 42;
            case 53 -> 11;
            case 54 -> 16;
            case 55 -> 40;
            case 56 -> 24;
            case 57 -> 3;
            case 58 -> 39;
            case 59 -> 38;
            case 60 -> 49;
            case 61 -> 5;
            case 62 -> 15;
            default -> 17;
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
        c1.c[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = b;
        b[0] = "*1\u000e\u0016q\u001b49\u0014Y\u0010\u001e49\u0017\u0019>\u0002";
        objectArray[1] = "\u0018*O\u0007\u0012\u0012\u0013%^Hs\u001c\u0018.Z\u0012";
        objectArray[2] = "l{R%>,rsHjv,hyP-\u007f7(\\Q*s-ouJ";
        objectArray[3] = ",\u0014.\bt\u0007,\u00149Tx\b6_9Jx\u001d1.i\u0017)";
        objectArray[4] = "6\u0006Q\f\u000bc6\u0006FP\u0007l,MFN\u0007y+<\u0014\u0012P:";
        objectArray[5] = "k6h\u0000Lgu>rO\u0004go4j\b\r|/\u0007l\u0004\u0006{b6j\u0004";
        objectArray[6] = "\bod|:H\bos 6G\u0012$s>6R\u0015U\"ka\u0011";
        objectArray[7] = "]u\\\u001bl\u001f]uKG`\u0010G>KY`\u0005@O\u0019\u00055B";
        objectArray[8] = "DE5\u001d6\nRE0G%\u001dE\u000e3A)\tTI$Vb\u001bg";
        objectArray[9] = "cD]\u00179\t\u0016dV\u0018(Fwj]\u0013,\u001c\u0003";
        objectArray[10] = "F\r\u0010v \u007fP\r\u0015,3hGF\u0016*?|V\u0001\u0001=tkG";
        objectArray[11] = "Y\u0004d$&FY\u0004sx*ICOsf*\\D>$=y\u001f";
        objectArray[12] = "3*l\u000b\u0014v3*{W\u0018y)a{I\u0018l.\u0010,\u0010A'";
        objectArray[13] = "#!t+TKV\u0001\u007f$E\u00047\u000ft/A^C";
        objectArray[14] = "\"\u0006sp\u0011f4\u0006v*\u0002q#Mu,\u000ee2\nb;Et\u0012";
        objectArray[15] = "M \u0014t!u[ \u0011.2bLk\u0012(>v],\u0005?u_";
        objectArray[16] = "uy?\u0015\u0019@\u0000Y4\u001a\b\u000faW?\u0011\fU\u0015";
        objectArray[17] = "Z\u0004qjG\u0002Z\u0004f6K\r@Of(K\u0018G>4v\u0018_\u0003";
        objectArray[18] = "\u001c\u0013\u0014\u0013 r\u0002\u001b\u000e\\Gs\u0013\u0000\u0003\u0006au";
        objectArray[19] = "X_$bRDN_!8ASY\u0014\">MGHS5)\u0006Ut";
        objectArray[20] = "<@\r\u0017\u0000\u0001I`\u0006\u0018\u0011N4x\u0015\u001f\u0018\u0007\\";
        objectArray[21] = "g?\u0017f\u007f'g?\u0000:s(}t\u0000$s=z\u0005Rx*x1";
        objectArray[22] = Integer.TYPE;
        c1.c[22] = "java/lang/Integer";
        objectArray[23] = "mE%6\t\u0005sM?yj\u0011w";
        objectArray[24] = "\u0015{>KjY\u000bs$\u0004\u0017I\u000b";
        objectArray[25] = "\u001b#+S\u0013#\u0010,:\u001ct!\u0005':WO";
        objectArray[26] = "\\Jj\u0004\u0010$BBpKs0F\u000fY\u000bJ#O";
        objectArray[27] = "X4\u001f\u0011w\u0001F<\u0005^\u0015\u001dA!";
        objectArray[28] = Boolean.TYPE;
        c1.c[28] = "java/lang/Boolean";
        objectArray[29] = "b$x7{bt$}mhuco~kdar(i|/q7";
        objectArray[30] = "\u00069\nnE0\r6\u001b!&=\u0018;\u0014J\u0013?\t(\bf\u00042";
        objectArray[31] = "_\u0019|I\u0019\n_\u0019k\u0015\u0015\u0005ERk\u000b\u0015\u0010B#9UFW\u0006Xk\u000b\u0015\u0010B#9UGP\u0006";
        objectArray[32] = "1$|\u000fc78*\u007fF :>*kD=<|?tYz- .b\u000fI('\u001ftYz- .GHk/";
        objectArray[33] = "`\u000bm\u001a@/`\u000bzFL z@zXL5}1(\u0005\u001e\u007f?";
        objectArray[34] = "lhSp&\u007f9m\u00117_h\u0005c\u0007r/>`c\rr6\u0001ne\u000f2cy|v\u0006+_";
        objectArray[35] = "w7,?{3d=%%\u001a\"\u001bjr:+1`e-2~H";
        objectArray[36] = "Z\u001b\u0016AjtH\f@F\u0007tZ\u001e\u001b\u001dkF\tRG@8\u0011Y\u0004\u001f\bzmI^\u0017\u0003\u0007";
        objectArray[37] = "%\u0015W(X\u0001}\u0016Qi%\tr\u0003T7I;&B\ti%Vu\u001cL-H\u000ev\u001a\rP";
        objectArray[38] = "s\u000b:e`\bl\u0002fbZ\u000fz\b{b\u001d\u001f\u0013\u0002`k(\fo\u0012:c#qs\u000b:e`\bl\u0002fbZ";
        objectArray[39] = "\u000bRI\u0013gl\u0016\t\u0003\u0007Xs\u0018Y\t\u0014$u\u001e4\u0018\u00037+\t_\u0012\u001b(md";
        objectArray[40] = ":uT;A\u00050mK},\u000e8p}o\\\u0012Qi[{]\u0014<5\u00069\u0010n";
        objectArray[41] = "e\bu43-'\r%#L9X\u0007$t<o=\u0007.t%PgVq5)4e\n/?L";
        objectArray[42] = "\u001dp\fgd\u0005\u0010y[9\u000f\u001b@=V`c)\u0017}\u000e<0~\u001d+]>l\u001bV\"Mf\u000fNG*\u000fdj\u0005N:W\u0007?\u0014FxUbt\u001dV 6";
        objectArray[43] = "\u0000qZ\u001c\u0005kXr\\]xcWgY\u0003\u0014Q\u0003&\u0002]x<HbPT\u001dwBkSd";
        objectArray[44] = "EN#W\u0006%W]*N:8C^ KV\n\u0011\u001fq\u0016\u0004]AN=^@;@[\"F:";
        objectArray[45] = "\ff\u000b7o3Gl\u00024_3[h\u001293\u0001\n*Ko_jYpCc$+QiN^c)K/\t`'m_er";
        objectArray[46] = "\u0011+V@]`O/\n\f,2ruE\tC*\u000frIM\u0013[\u0011hC\u001e]&\u0016d\u0007N,";
        objectArray[47] = "\b[\r\u0003\u001b\u001bQCRCdA\u0012h\u0007@\u0018QiG\u0002A\u0015Z\u0004\u001b_\u0003X ";
        objectArray[48] = "\u0018Z\u001ct_d\u0014\\If4y\u0013\u001bMbXKA^\u0013>\u0004\u001c\u0013\u001e@>Yy\u0001\t\u001694";
        objectArray[49] = "ln-\\jt\"o;?u#\u0016x9[{'4h]Cq37<mG{\"P96Oq5iw7Y\u0012";
        objectArray[50] = "<jJTC\"rk\\7V~x}K7\u0007ppbB\u000eIqf\u0001";
        objectArray[51] = "\u0000&3Tcr\n>,\u0012\u000e\u007f\u0006( mrz\u0015?e]vp\u0004X";
        objectArray[52] = "p\u001cZR\u0019\u001c>\u001dL1\u0004L4w\u0013Q\u0005Z0GZI\u0011JLKAA\u0002]u\u0005@Wa";
        objectArray[53] = "c@'\u001dT\"bU8\u0005.)jP \u001eu)p,5\t\u0014*3R(R^>\f";
        objectArray[54] = "K\u001aa+\u0013\b\u0005\u001bwH\f_w\rr6\f\bG\tx'k\r\u001c\u0001r0RC\u001d\u0017\u0011";
        objectArray[55] = "0c\u0013A\u001dK25\u0005\u0017gC<$\"D\u0003Q<X\u0000N\u0019Khh\u0004D\b,";
        objectArray[56] = "\u0014'TU&\u007fM?\u000b\u0015Y-\u00195;\u0012::\u0012`\u000b\u00160+u;[\u0017(>\u0018g\u0006UeD";
        objectArray[57] = "0>\u0013s7?~?\u0005\u0010!gh)\u000ejO=m2\u001ems=t/\u0006\u0010sm|6\u001b)=ljU";
        objectArray[58] = "}EH3)M\u007f\u0019\u00169L@B\u0014\u001dr<\u0016'\u0014\u0017r%)+C\u00110+\u0014 \u0004\u0018\"L";
        objectArray[59] = "4\n\u0013Yd\u0004`\u000b\u0015\u0005\u001d\u00027\u0017\u00107 SjLh\u0005vY/\u000b\u0003\u0004l\r!r";
        Object[] objectArray2 = objectArray;
        objectArray[60] = "\u0019)jjl^@15*\u0013\n\u0015+\u0005?u\u0001\n*y//\t\u0001Wy2m\u0002Ag}8|e";
    }

    public static class_4588 a(Object[] objectArray) {
        class_4588 class_45882 = (class_4588)objectArray[0];
        int n = (Integer)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = (l = a ^ l) ^ 0x44893ADB5C69L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l2;
        objectArray2[1] = n;
        objectArray2[0] = dp_0.b;
        return c1.a("\u00f9", (Object)class_45882, (Object)new gF((cF)((Object)c1.a("\u00ec", (Object)c1.a("\u00f9", (Object)new Object[0], (long)5406109520721358854L, (long)l), (Object)objectArray2, (long)5405058479259349208L, (long)l))), (long)5406190308749037871L, (long)l);
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Integer lambda$resolveTextureId$1(GpuTexture gpuTexture) {
        long l = a ^ 0x28694EA20912L;
        return c1.a("\u00f9", (int)c1.a("\u00ec", (Object)((class_10868)gpuTexture), (long)8520578810835527921L, (long)l), (long)8520717068748610484L, (long)l);
    }

    private static boolean lambda$resolveTextureId$0(GpuTexture gpuTexture) {
        return gpuTexture instanceof class_10868;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(c1.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.dy_0;
import dev.zprestige.prestige.fW;
import dev.zprestige.prestige.hc;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public record gR(boolean bU, boolean bV, int bW, int bX, int bY, int bZ) implements fW
{
    private static final long b = hc.a(-5333462856590223881L, 1256612175843347634L, MethodHandles.lookup().lookupClass()).a(4470989406904L);
    private static final long[] c;
    private static final Integer[] d;
    private static final Map e;
    private static final Object[] f;
    private static final String[] g;

    /*
     * Enabled aggressive block sorting
     */
    static {
        f = new Object[13];
        g = new String[13];
        gR.b();
        e = new HashMap(13);
        long l = b ^ 0x68EEEF17CEFAL;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[2];
        int n = 0;
        String string = "\u009c${\u000f\u00e5\u00c7\u00cf\u00a8m\r\u0088a\u00a6\u00a3\u00b2e";
        int n2 = "\u009c${\u000f\u00e5\u00c7\u00cf\u00a8m\r\u0088a\u00a6\u00a3\u00b2e".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        c = lArray;
        d = new Integer[2];
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = gR.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = gR.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
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
            throw new RuntimeException("dev/zprestige/prestige/gR" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static void b() {
        Object[] objectArray = f;
        f[0] = "J\\6LCq\\\\3\u0016PfK\u00170\u0010\\rZP'\u0007\u0017`f";
        objectArray[1] = "\u0013Tc\u001b\u001b)fth\u0014\nf\u001bl{\u0013\u0003/s";
        objectArray[2] = ">X\rV#h;M\u0006V o4D\r\u0014aX\u001d\u001b[";
        objectArray[3] = Integer.TYPE;
        gR.g[3] = "java/lang/Integer";
        objectArray[4] = Void.TYPE;
        gR.g[4] = "java/lang/Void";
        objectArray[5] = "bl\u0011\"]=tl\u0014xN*c'\u0017~B>r`\u0000i\t*T";
        objectArray[6] = "<M\n\u0019D_7B\u001bV'R\"O\u0014=\u0012P3\\\b\u0011\u0005]";
        objectArray[7] = "2JWwo\u001d9EF8\u000e\u00132NBb";
        objectArray[8] = "\u001aM=Ikc\u001bAfA\u00055G~aPo>N3=U91B_nVx$#\bkU|f]JlRaZ";
        objectArray[9] = "H^r\u001dT\u0012\u0000P|eY\u007f\u0006\u0014(\u0017P\u0016\u001fKse";
        objectArray[10] = "t+;}nuu'`u\u0000#)\u0019`vi&)8\u00017lp&4mdo13U:al5q+xfk(M";
        objectArray[11] = "\u0012B%D=]\u0013N~LS\u000bOgtU(\u001fLF\u001f\u000e?X@]s]<\u0019U<%Xo\u000fJPv[.\u001a+\u0006s\b8\u0005GUpI-d\u0011P#_2\bBSbJS_GPf\b-\u001d@W{4";
        Object[] objectArray2 = objectArray;
        objectArray[12] = "C_2m%\u0001\u0017D+\u007f\u0019\u0005x\u0002<<!\u0000\u001eF0d~lDUj9u\n\u0000Y2f\u0019";
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = gR.a(l, l2);
            object = f[n];
            try {
                if (!(object instanceof String)) break block2;
                gR.f[n] = clazz = Class.forName(g[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = gR.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = gR.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l, long l2) {
        int n = gR.a(l, l2);
        Object object = f[n];
        if (object instanceof String) {
            String string = g[n];
            int n2 = string.indexOf(8);
            Class clazz = gR.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = gR.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = gR.a(clazz3, string2, clazz2)) != null) {
                    gR.f[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = gR.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        gR.f[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = gR.b(531147153483259L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = gR.a(l, l2);
        Object object = f[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = g[n];
                int n3 = string2.indexOf(8);
                clazz3 = gR.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = gR.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = gR.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        gR.f[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = gR.b(531147153483259L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = gR.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        gR.f[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = gR.b(531147153483259L, 0L);
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

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    @Override
    public void a() {
        block11: {
            Object object;
            long l;
            block12: {
                CallSite callSite;
                block10: {
                    l = b ^ 0x26E465AC87E8L;
                    callSite = gR.b("z", (long)-992117343254554817L, (long)l);
                    try {
                        try {
                            object = this.bV;
                            if (callSite != null) break block10;
                            if (object == this.bU) break block11;
                        }
                        catch (MatchException matchException) {
                            throw gR.b("z", (Object)matchException, (long)-992452834073566257L, (long)l);
                        }
                        object = this.bV;
                    }
                    catch (MatchException matchException) {
                        throw gR.b("z", (Object)matchException, (long)-992452834073566257L, (long)l);
                    }
                }
                try {
                    block13: {
                        try {
                            try {
                                if (callSite != null) break block12;
                                if (object == 0) break block13;
                            }
                            catch (MatchException matchException) {
                                throw gR.b("z", (Object)matchException, (long)-992452834073566257L, (long)l);
                            }
                            gR.b("z", (int)gR.a("o", (int)16416, (long)(0x1C1D3057270D3736L ^ l)), (long)-992167889666530593L, (long)l);
                            if (callSite == null) break block11;
                        }
                        catch (MatchException matchException) {
                            throw gR.b("z", (Object)matchException, (long)-992452834073566257L, (long)l);
                        }
                    }
                    object = gR.a("o", (int)16416, (long)(0x1C1D3057270D3736L ^ l));
                }
                catch (MatchException matchException) {
                    throw gR.b("z", (Object)matchException, (long)-992452834073566257L, (long)l);
                }
            }
            gR.b("z", (int)object, (long)-992006998891599672L, (long)l);
        }
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x52E;
        if (d[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = c[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])e.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    e.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/gR", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            gR.d[n2] = n3;
        }
        return d[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = gR.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'Y' || c == '\u00f8' || c == '\u00ca' || c == '\u00cb') {
                field = gR.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'Y' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00f8' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00ca' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = gR.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00de' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'z' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
    public void a(dy_0 dy_02) {
        block8: {
            Object object;
            long l;
            block6: {
                l = b ^ 0x447DD32AFE7CL;
                CallSite callSite = gR.b("z", (long)-8381436324455338325L, (long)l);
                try {
                    block7: {
                        try {
                            try {
                                object = this.bU;
                                if (callSite != null) break block6;
                                if (object == 0) break block7;
                            }
                            catch (MatchException matchException) {
                                throw gR.b("z", (Object)matchException, (long)-8381625523789276581L, (long)l);
                            }
                            gR.b("z", (int)gR.a("o", (int)5898, (long)(0x66F1F55427159989L ^ l)), (long)-8381341748216538293L, (long)l);
                            gR.b("z", (int)this.bW, (int)this.bX, (int)this.bY, (int)this.bZ, (long)-8381271787166594503L, (long)l);
                            if (callSite == null) break block8;
                        }
                        catch (MatchException matchException) {
                            throw gR.b("z", (Object)matchException, (long)-8381625523789276581L, (long)l);
                        }
                    }
                    object = gR.a("o", (int)16416, (long)(0x1C1D52CE918B4EA2L ^ l));
                }
                catch (MatchException matchException) {
                    throw gR.b("z", (Object)matchException, (long)-8381625523789276581L, (long)l);
                }
            }
            gR.b("z", (int)object, (long)-8381255555966365348L, (long)l);
        }
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

    @Override
    public boolean a() {
        return true;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = gR.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/gR" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (g[n3] != null) {
            return n3;
        }
        Object object = f[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 23;
            case 1 -> 1;
            case 2 -> 30;
            case 3 -> 53;
            case 4 -> 36;
            case 5 -> 51;
            case 6 -> 27;
            case 7 -> 29;
            case 8 -> 18;
            case 9 -> 20;
            case 10 -> 46;
            case 11 -> 14;
            case 12 -> 3;
            case 13 -> 49;
            case 14 -> 11;
            case 15 -> 48;
            case 16 -> 0;
            case 17 -> 22;
            case 18 -> 33;
            case 19 -> 41;
            case 20 -> 59;
            case 21 -> 32;
            case 22 -> 4;
            case 23 -> 54;
            case 24 -> 7;
            case 25 -> 19;
            case 26 -> 52;
            case 27 -> 24;
            case 28 -> 15;
            case 29 -> 9;
            case 30 -> 62;
            case 31 -> 42;
            case 32 -> 38;
            case 33 -> 12;
            case 34 -> 37;
            case 35 -> 58;
            case 36 -> 61;
            case 37 -> 45;
            case 38 -> 16;
            case 39 -> 56;
            case 40 -> 39;
            case 41 -> 6;
            case 42 -> 43;
            case 43 -> 50;
            case 44 -> 8;
            case 45 -> 60;
            case 46 -> 31;
            case 47 -> 2;
            case 48 -> 21;
            case 49 -> 25;
            case 50 -> 34;
            case 51 -> 28;
            case 52 -> 44;
            case 53 -> 57;
            case 54 -> 26;
            case 55 -> 63;
            case 56 -> 10;
            case 57 -> 40;
            case 58 -> 13;
            case 59 -> 17;
            case 60 -> 5;
            case 61 -> 47;
            case 62 -> 35;
            default -> 55;
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
        gR.g[n3] = new String(cArray);
        return n3;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(gR.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_1() {
        try {
            return MethodHandles.lookup().findStatic(gR.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


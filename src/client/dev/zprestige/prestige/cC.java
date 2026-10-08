/*
 * Decompiled with CFR 0.152.
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.cA;
import dev.zprestige.prestige.hc;
import java.io.IOException;
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
public class cC {
    private static volatile cC a;
    private final Map b = new HashMap();
    private cA c;
    private static final long d;
    private static final String[] e;
    private static final String[] f;
    private static final Map g;
    private static final Object[] h;
    private static final String[] i;

    /*
     * Enabled aggressive block sorting
     */
    static {
        d = hc.a(2615989741557781965L, -2375990882347217387L, MethodHandles.lookup().lookupClass()).a(270341163856750L);
        h = new Object[21];
        i = new String[21];
        cC.a();
        g = new HashMap(13);
        long l = d ^ 0x81627457DL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        String[] stringArray = new String[2];
        int n = 0;
        String string = "\u0083\u0098\u00e4\u00e5a\u00b2\u001d\u000f\u001f\u00caj_\"\u00e8T2'=\u00d7\u00c2\u00de\b\u00f5<\u00da7\u00b4)\u00f7\u0094\u00feu\u00a72B\u00d1\u0089;d\u00c88D\u00f1\u00b3B\u00bab\u001d\u00e1\u00cfb\u0089\u00a4\u0097\u001a.\u0010{~\u00db@\u009a\u008c\bg>\u00c4y\t\u00ba1\u0017\u001c";
        int n2 = "\u0083\u0098\u00e4\u00e5a\u00b2\u001d\u000f\u001f\u00caj_\"\u00e8T2'=\u00d7\u00c2\u00de\b\u00f5<\u00da7\u00b4)\u00f7\u0094\u00feu\u00a72B\u00d1\u0089;d\u00c88D\u00f1\u00b3B\u00bab\u001d\u00e1\u00cfb\u0089\u00a4\u0097\u001a.\u0010{~\u00db@\u009a\u008c\bg>\u00c4y\t\u00ba1\u0017\u001c".length();
        int n3 = 56;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = cC.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                e = stringArray;
                f = new String[2];
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = cC.a(l, l2);
            object = h[n];
            try {
                if (!(object instanceof String)) break block2;
                cC.h[n] = clazz = Class.forName(i[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/cC" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = cC.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = cC.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = cC.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = cC.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public cA b(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l = (Long)objectArray[1];
        l = d ^ l;
        return (cA)((Object)cC.b("\u00a3", (Object)this.b, (Object)string, arg_0 -> cC.lambda$getFont$0(string, arg_0), (long)-9029185247962529550L, (long)l));
    }

    public void b(Object[] objectArray) {
        block3: {
            cA cA2;
            long l;
            block2: {
                String string = (String)objectArray[0];
                l = (Long)objectArray[1];
                l = d ^ l;
                cA cA3 = (cA)((Object)cC.b("\u00a3", (Object)this.b, (Object)string, (long)-941735009391971366L, (long)l));
                CallSite callSite = cC.b("D", (long)-941792646629248444L, (long)l);
                try {
                    cA2 = cA3;
                    if (callSite != null) break block2;
                    if (cA2 == null) break block3;
                }
                catch (RuntimeException runtimeException) {
                    throw cC.b("D", (Object)runtimeException, (long)-943090797881921462L, (long)l);
                }
                cA2 = cA3;
            }
            cC.b("\u00a3", (Object)cA2, (long)-941536374946659036L, (long)l);
        }
    }

    private static Field c(long l, long l2) {
        int n = cC.a(l, l2);
        Object object = h[n];
        if (object instanceof String) {
            String string = i[n];
            int n2 = string.indexOf(8);
            Class clazz = cC.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = cC.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = cC.a(clazz3, string2, clazz2)) != null) {
                    cC.h[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = cC.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        cC.h[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = cC.b(129548483394259L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = cC.a(l, l2);
        Object object = h[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = i[n];
                int n3 = string2.indexOf(8);
                clazz3 = cC.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = cC.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = cC.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        cC.h[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = cC.b(129548483394259L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = cC.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        cC.h[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = cC.b(129548483394259L, 0L);
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

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (i[n3] != null) {
            return n3;
        }
        Object object = h[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 59;
            case 1 -> 1;
            case 2 -> 18;
            case 3 -> 48;
            case 4 -> 12;
            case 5 -> 24;
            case 6 -> 25;
            case 7 -> 7;
            case 8 -> 10;
            case 9 -> 51;
            case 10 -> 32;
            case 11 -> 8;
            case 12 -> 14;
            case 13 -> 45;
            case 14 -> 17;
            case 15 -> 46;
            case 16 -> 21;
            case 17 -> 52;
            case 18 -> 58;
            case 19 -> 40;
            case 20 -> 47;
            case 21 -> 16;
            case 22 -> 55;
            case 23 -> 15;
            case 24 -> 61;
            case 25 -> 23;
            case 26 -> 34;
            case 27 -> 39;
            case 28 -> 43;
            case 29 -> 5;
            case 30 -> 19;
            case 31 -> 20;
            case 32 -> 57;
            case 33 -> 28;
            case 34 -> 29;
            case 35 -> 26;
            case 36 -> 41;
            case 37 -> 50;
            case 38 -> 31;
            case 39 -> 0;
            case 40 -> 38;
            case 41 -> 22;
            case 42 -> 35;
            case 43 -> 49;
            case 44 -> 62;
            case 45 -> 27;
            case 46 -> 2;
            case 47 -> 54;
            case 48 -> 42;
            case 49 -> 63;
            case 50 -> 60;
            case 51 -> 33;
            case 52 -> 6;
            case 53 -> 3;
            case 54 -> 30;
            case 55 -> 13;
            case 56 -> 36;
            case 57 -> 53;
            case 58 -> 9;
            case 59 -> 11;
            case 60 -> 56;
            case 61 -> 4;
            case 62 -> 44;
            default -> 37;
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
        cC.i[n3] = new String(cArray);
        return n3;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = cC.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'G' || c == '\u00dc' || c == 'p' || c == '\u00ef') {
                field = cC.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'G' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00dc' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'p' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = cC.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00a3' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'D' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public cA a(Object[] objectArray) {
        cA cA2;
        block2: {
            Object object;
            block3: {
                long l = (Long)objectArray[0];
                long l2 = (l = d ^ l) ^ 0x64A392B77F3L;
                object = this.c;
                CallSite callSite = cC.b("D", (long)-4026139513957414774L, (long)l);
                try {
                    cA2 = object;
                    if (callSite != null) break block2;
                    if (cA2 != null) break block3;
                }
                catch (RuntimeException runtimeException) {
                    throw cC.b("D", (Object)runtimeException, (long)-4024208121449690492L, (long)l);
                }
                Object[] objectArray2 = new Object[2];
                objectArray2[1] = l2;
                objectArray2[0] = cC.a("f", (int)11449, (long)(0x226F79F38FF43E25L ^ l));
                this.c = object = cC.b("\u00a3", (Object)this, (Object)objectArray2, (long)-4024042314273276896L, (long)l);
            }
            cA2 = object;
        }
        return cA2;
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

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5ABE;
        if (f[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])g.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    g.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/cC", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = e[n2].getBytes("ISO-8859-1");
            cC.f[n2] = cC.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return f[n2];
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

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public void a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = d ^ l;
        cC.b("\u00a3", (Object)cC.b("\u00a3", (Object)this.b, (long)-5482247398550117328L, (long)l), cA::a, (long)-5482350888938803359L, (long)l);
        cC.b("\u00a3", (Object)this.b, (long)-5482498098727540620L, (long)l);
        this.c = null;
    }

    private static void a() {
        Object[] objectArray = h;
        h[0] = "/_T>Qr1WNq2f5";
        objectArray[1] = "_I#1^\"TF2~?,_M6$";
        objectArray[2] = "y\u0010\u0001\u001aQso\u0010\u0004@Bdx[\u0007FNpi\u001c\u0010Q\u0005bU";
        objectArray[3] = "\u0003N\u0016vOKvn\u001dy^\u0004\u000bv\u000e~WMc";
        objectArray[4] = "\u0013Wi'K_\u0005Wl}XH\u0012\u001co{T\\\u0003[xl\u001fL4";
        objectArray[5] = "p=h|N\u0015{2y32\ft(wp\u0005<b?{m\u0014\u0010u2";
        objectArray[6] = "/)O\bsX9)JR`O.bITl[?%^C'K\n";
        objectArray[7] = Void.TYPE;
        cC.i[7] = "java/lang/Void";
        objectArray[8] = "\u0010er\u0013f6\u000emh\\.6\u0014gp\u001b'-TBq\u001c+7\u0013kj";
        objectArray[9] = "^mMT&{+MF[74JCMP3n>";
        objectArray[10] = "C\u0000\t)A8]\b\u0013f,\"E\r\u001a+\u001b$F\u000f";
        objectArray[11] = "G8T8LHY0Nw\u0004HC:V0\rS\u0003\u001aM7\u0011H@<P";
        objectArray[12] = "j\u0014#0Z,x\u00150\u0001\u001b{`\u000f la/4\u0018c{[(9\f \u0001X'uU$;_*a\u0016^";
        objectArray[13] = "Fa\b\r,\f\u0007~EBE\u0017\u007f8FZ.\u0013D9\u001aB=}";
        objectArray[14] = "h L9In4%_'6yT~S\u007fU.5>KsR\u0010";
        objectArray[15] = ";L\u001dh|9)M\u000eY,d1H\u001d%*B:y\n\"*e(0Yh7>.\n^e#}T\r\u0018$693]\u00123%\u0003m\u0001\u0010d=9j\f\u0004'G";
        objectArray[16] = "\"\u0013 43Lw\u000f{9Z\u0015\u0019F?gd\u0010\"\u0018( =|\"\u0007\u007fc6G|\u00108:Z";
        objectArray[17] = "\u0017\u001bhm&J\u0005\u001a{\\v\u0014\u0015\u000eo\\ \u0011E\u0004+=`\tI\u0003\u0015";
        objectArray[18] = ".\u0010bn\u00079{\f9cnc\u0015@c}\u001cks\u000ea7Q\t)\u001dy|\u0011wu\u0018jbn";
        objectArray[19] = "S13E\u001f}\u0017/$\u0010&b\u000b'\u000fEMllm+VY}\u001d:;\u0015[\fQ<\u007fO\u0018m\u0011$sH&";
        Object[] objectArray2 = objectArray;
        objectArray[20] = "\u0004@r\u0012L\u001c\u0016Aa#\tO\u000fAbXw\u0019\u0007Mf\u001a\u0006]\u0019Z3#";
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/cC" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = cC.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static cA lambda$getFont$0(String string, String string2) {
        long l = d ^ 0x3DC6D87C06E5L;
        long l2 = l ^ 0x66B86866B61EL;
        try {
            return new cA(string, l2);
        }
        catch (IOException iOException) {
            throw new RuntimeException((String)((Object)cC.a("f", (int)30666, (long)(0x64D28C9E6E3D16F3L ^ l))) + string, iOException);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(cC.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(cC.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


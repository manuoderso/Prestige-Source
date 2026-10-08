/*
 * Decompiled with CFR 0.152.
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.bS;
import dev.zprestige.prestige.fW;
import dev.zprestige.prestige.gC;
import dev.zprestige.prestige.gK;
import dev.zprestige.prestige.gd_0;
import dev.zprestige.prestige.ge_0;
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
import java.util.HashSet;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from dev.zprestige.prestige.dt
 */
public class dt_0 {
    ge_0 a;
    int b;
    boolean c;
    fW[] d;
    static final boolean e;
    private static final long f;
    private static final String[] g;
    private static final String[] h;
    private static final Map i;
    private static final Object[] j;
    private static final String[] k;

    public dt_0(ge_0 ge_02, int n, boolean bl, fW[] fWArray, long l) {
        long l2 = (l = f ^ l) ^ 0x610D10413CA7L;
        this.a = ge_02;
        this.b = n;
        this.c = bl;
        this.d = fWArray;
        if (!e) {
            try {
                Object[] objectArray = new Object[2];
                objectArray[1] = l2;
                objectArray[0] = fWArray;
                if (dt_0.b("J", (Object)objectArray, (long)972210797452982365L, (long)l) == false) {
                    throw new AssertionError(dt_0.a("y", (int)28608, (long)(0x2D2CEAE1E0826FABL ^ l)));
                }
            }
            catch (MatchException matchException) {
                throw dt_0.b("J", (Object)matchException, (long)968740727900519730L, (long)l);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n;
        f = hc.a(-3196022489742584504L, -5363656098933441594L, MethodHandles.lookup().lookupClass()).a(27548798368047L);
        long l = f ^ 0x3EA45F60AA26L;
        j = new Object[40];
        k = new String[40];
        dt_0.a();
        i = new HashMap(13);
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
        int n2 = 0;
        String string = "\u00de/\u009f\u00e3\u00e7G&U\u00c7!\u00a6P\u00fc\u0088MdeI}=A\u00e6(S\u00ab\u00e1\f\u0088\u00c1\u00f5\t JTG\u0098\u00a6\u000fr\u00b7H\u00b9q\u00d9\u009f\u00c5\u009ey0\u00ea~\u00a1s\u00df\u00e3c#\u008b@\u00ff\u00a9\u0011\u00dbB/\u00c1\u00dd\u00d7\u00ff\u00e6D\u00bci\u008f\u0002\u008c\u00edp{A+}\u00baa\u00efL\u00eeZ\u00d0i\u00f2\u000fP\u000bC\u0087-{\u0017\u007fE\u0016a|\u000b\u00f3\u00f6\u00d1Q\u00a7\u008b\u00bd\u007f";
        int n3 = "\u00de/\u009f\u00e3\u00e7G&U\u00c7!\u00a6P\u00fc\u0088MdeI}=A\u00e6(S\u00ab\u00e1\f\u0088\u00c1\u00f5\t JTG\u0098\u00a6\u000fr\u00b7H\u00b9q\u00d9\u009f\u00c5\u009ey0\u00ea~\u00a1s\u00df\u00e3c#\u008b@\u00ff\u00a9\u0011\u00dbB/\u00c1\u00dd\u00d7\u00ff\u00e6D\u00bci\u008f\u0002\u008c\u00edp{A+}\u00baa\u00efL\u00eeZ\u00d0i\u00f2\u000fP\u000bC\u0087-{\u0017\u007fE\u0016a|\u000b\u00f3\u00f6\u00d1Q\u00a7\u008b\u00bd\u007f".length();
        int n4 = 40;
        int n5 = -1;
        while (true) {
            int n6 = ++n5;
            byte[] byArray3 = cipher.doFinal(string.substring(n6, n6 + n4).getBytes("ISO-8859-1"));
            stringArray[n2++] = dt_0.a(byArray3).intern();
            if ((n5 += n4) >= n3) break;
            n4 = string.charAt(n5);
        }
        g = stringArray;
        h = new String[2];
        try {
            n = dt_0.b("P", dt_0.class, (long)-4386589183450358376L, (long)l) == false ? 1 : 0;
        }
        catch (MatchException matchException) {
            throw dt_0.b("J", (Object)matchException, (long)-4386809849039850659L, (long)l);
        }
        e = n;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = dt_0.a(l, l2);
            object = j[n];
            try {
                if (!(object instanceof String)) break block2;
                dt_0.j[n] = clazz = Class.forName(k[n]);
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
            throw new RuntimeException("dev/zprestige/prestige/dt" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = dt_0.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = dt_0.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = dt_0.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = dt_0.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public boolean b(Object[] objectArray) {
        return this.c;
    }

    private static Field c(long l, long l2) {
        int n = dt_0.a(l, l2);
        Object object = j[n];
        if (object instanceof String) {
            String string = k[n];
            int n2 = string.indexOf(8);
            Class clazz = dt_0.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = dt_0.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = dt_0.a(clazz3, string2, clazz2)) != null) {
                    dt_0.j[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = dt_0.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        dt_0.j[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = dt_0.b(245882638368565L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = dt_0.a(l, l2);
        Object object = j[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = k[n];
                int n3 = string2.indexOf(8);
                clazz3 = dt_0.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = dt_0.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = dt_0.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        dt_0.j[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = dt_0.b(245882638368565L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = dt_0.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        dt_0.j[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = dt_0.b(245882638368565L, 0L);
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

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public fW[] a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = f ^ l;
        fW[] fWArray = new fW[this.d.length];
        dt_0.b("J", (Object)this.d, (int)0, (Object)fWArray, (int)0, (int)fWArray.length, (long)3612879324148092067L, (long)l);
        return fWArray;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/dt" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = dt_0.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00ed' || c == '\u00f3' || c == 'c' || c == '\u00d1') {
                field = dt_0.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00ed' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00f3' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'c' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = dt_0.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'P' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'J' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public int a(Object[] objectArray) {
        return this.b;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = dt_0.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0xD12;
        if (h[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])i.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    i.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/dt", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = g[n2].getBytes("ISO-8859-1");
            dt_0.h[n2] = dt_0.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return h[n2];
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

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    public ge_0 a(Object[] objectArray) {
        return this.a;
    }

    private static boolean a(Object[] objectArray) {
        fW[] fWArray = (fW[])objectArray[0];
        long l = (Long)objectArray[1];
        l = f ^ l;
        HashSet hashSet = new HashSet(fWArray.length);
        for (fW fW2 : fWArray) {
            try {
                try {
                    if (dt_0.b("P", (Object)fW2, (long)6406453644857350103L, (long)l) != false || dt_0.b("P", hashSet, fW2.getClass(), (long)6406109638877273890L, (long)l) != false) continue;
                }
                catch (MatchException matchException) {
                    throw dt_0.b("J", (Object)matchException, (long)6406250934165235876L, (long)l);
                }
                return false;
            }
            catch (MatchException matchException) {
                throw dt_0.b("J", (Object)matchException, (long)6406250934165235876L, (long)l);
            }
        }
        return true;
    }

    private static void a() {
        Object[] objectArray = j;
        j[0] = "\u0002\u0010Y#5\u0019\u0014\u0010\\y&\u000e\u0003[_\u007f*\u001a\u0012\u001cHha\u000f1";
        objectArray[1] = Boolean.TYPE;
        dt_0.k[1] = "java/lang/Boolean";
        objectArray[2] = ">4^\u0011\u0002e <D^\u007fu ";
        objectArray[3] = "\n\u001dpNDM\u0001\u0012a\u0001%C\n\u0019e[";
        objectArray[4] = "Q|h\f21G|mV!&P7nP-2ApyGf%A";
        objectArray[5] = "Ix9\r\u000b1Bw(Bh<Wz')]>Fi;\u0005J3";
        objectArray[6] = "\u001a!5i[\u007fo\u0001>fJ0\u000e\u000f5mNjz";
        objectArray[7] = ",\u0017EgK>'\u0018T(6+5\u0002Vk";
        objectArray[8] = Integer.TYPE;
        dt_0.k[8] = "java/lang/Integer";
        objectArray[9] = Void.TYPE;
        dt_0.k[9] = "java/lang/Void";
        objectArray[10] = "IrH)$\u000f_rMs7\u0018H9Nu;\fY~Ybp\u001bW";
        objectArray[11] = "Akx ^Q4Ks/O\u001eUEx$KD!";
        objectArray[12] = "#JH\f\r\u001f5JMV\u001e\b\"\u0001NP\u0012\u001c3FYGY\u000b>";
        objectArray[13] = "k<\\PIK}<Y\nZ\\jwZ\fVH{0M\u001b\u001dZG";
        objectArray[14] = "@1g e\u001a5\u0011l/tUH\t\u007f(}\u001c ";
        objectArray[15] = "V$%/I\u001d@$ uZ\nWo#sV\u001eF(4d\u001d\nq";
        objectArray[16] = "N%\u001d=AoX%\u0018gRxOn\u001ba^l^)\fv\u0015xO";
        objectArray[17] = "@j\u0014<|m5J\u001f3m\"TD\u00148ix ";
        objectArray[18] = "\u001bM[&/\u0011nmP)>^\u000fc[\":\u0004{";
        objectArray[19] = "\u00020M\u0017R<w\u0010F\u0018Cs\u0016\u001eM\u0013G)b";
        objectArray[20] = ")\u0003(&;E\\##)*\n=-(\".PI";
        objectArray[21] = "=SmEXA6\\|\n5A6Ah";
        objectArray[22] = "\u0010\u001b9\"BHNLd&yJ/\u001at,HGL\u0017>!F#\u001f\u00104o\u0002CEK\u007fmy";
        objectArray[23] = "f/^6.I;=D.K\u001f\\2Qaz\u0012??\u001bltvedM67Fg/N4K";
        objectArray[24] = "\r8[Ba\b^e\u0007YZ\u0003<4T\u0002<\u001b\\mD\u000f'i";
        objectArray[25] = "%AH\u0013\u0015~zC\u0013q\u001d\u001fr\u0015\u001e\u0017\b/p^\u001d\u0015t";
        objectArray[26] = "\u0004#S+F\n^rI{z\u001aC7Gc\u0011\u0014A<.(\u0014N^=G~\u0001\u001dAM\u0013i\u0016\u0016P|O/F\u00159w@/\u001d\u0003P!U|\u0002s\u00046Bw\u0013BXp\u0012tzNB!K{K\u0012\u0004qH\u0012D\rU-Lv\nKX5.";
        objectArray[27] = "!\b?d\u001a\u00111\u0016k\u007fsJ&tnz\bDq\u0013ft\u0001NH";
        objectArray[28] = "\u0016.\\VjTI,\u00074b5G-[\u000b0^\u0019z\u0006\u000f\u000b\u000b\u0006,\u0007VoE@!\u001f4";
        objectArray[29] = "+3p\u0007BU;-$\u001c+\u000e\"Ov\u0002G\u0001+~*D\u0017\u0002B";
        objectArray[30] = "'\u0002Vc[\u0002x\u0000\r\u0001Scy\n\\sA\u0003#Q\u0017q:]7\u0000\rc^\u0013q\r\u0015\u0001";
        objectArray[31] = " \u0014\u0017p\u00048zO\\r\u007f1\u0010\u001eW3N<s\u0013\u001d>@X/\u001f\u001a=D3qHG9\u007f";
        objectArray[32] = "\u0004./qA>^uds:44$o2\u000b:W)%?\u0005^\n6rcX:Dp\u007f{:";
        objectArray[33] = "H\u000f5vhv\u0017\rn\u0014`\u0017\u0018\u001fbtksVYol\t";
        objectArray[34] = "'krm6\u0013}09oM\u001a\u0017a2.|\u0017tlx#rs)s/\u007f/\u0017g5\"gM";
        objectArray[35] = "\u0001$L\tA\u0017W7\u0002\u0016(\u0016\u0001\"S\rE\u0016%\"I\u001aR\u0006\r>T,T\u0013\u0010$Iw\u0011@\u0001?NG\u0013\u000b\u0002=2";
        objectArray[36] = "?2)1:e|9b*\\pj$Xw2$a81!'w~Haw1\u007fzxc<2}\u0006";
        objectArray[37] = "\u0011+Wn4w\u0019%^d\r}\u00026Env\u0010A%\u0011m}y\u00170Br\r)A&Jv=+\n%H\n";
        objectArray[38] = "Jlq$\r}\u0017~k<h+p&k3R9\u001eyp:\u001aBKy~x\u0013,\u0014bw0h";
        Object[] objectArray2 = objectArray;
        objectArray[39] = "\u0000 $BkYZ{o@\u0010U0*d\u0001!]S'.\f/9\u000e8yPr]@~tH\u0010";
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (k[n3] != null) {
            return n3;
        }
        Object object = j[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 1;
            case 1 -> 6;
            case 2 -> 35;
            case 3 -> 59;
            case 4 -> 18;
            case 5 -> 60;
            case 6 -> 47;
            case 7 -> 14;
            case 8 -> 30;
            case 9 -> 12;
            case 10 -> 43;
            case 11 -> 33;
            case 12 -> 31;
            case 13 -> 51;
            case 14 -> 49;
            case 15 -> 2;
            case 16 -> 17;
            case 17 -> 45;
            case 18 -> 5;
            case 19 -> 10;
            case 20 -> 27;
            case 21 -> 34;
            case 22 -> 42;
            case 23 -> 53;
            case 24 -> 16;
            case 25 -> 37;
            case 26 -> 15;
            case 27 -> 28;
            case 28 -> 4;
            case 29 -> 13;
            case 30 -> 24;
            case 31 -> 50;
            case 32 -> 52;
            case 33 -> 11;
            case 34 -> 56;
            case 35 -> 0;
            case 36 -> 7;
            case 37 -> 57;
            case 38 -> 36;
            case 39 -> 32;
            case 40 -> 46;
            case 41 -> 48;
            case 42 -> 44;
            case 43 -> 23;
            case 44 -> 63;
            case 45 -> 26;
            case 46 -> 21;
            case 47 -> 19;
            case 48 -> 54;
            case 49 -> 58;
            case 50 -> 55;
            case 51 -> 38;
            case 52 -> 29;
            case 53 -> 61;
            case 54 -> 39;
            case 55 -> 20;
            case 56 -> 3;
            case 57 -> 25;
            case 58 -> 41;
            case 59 -> 9;
            case 60 -> 40;
            case 61 -> 8;
            case 62 -> 22;
            default -> 62;
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
        dt_0.k[n3] = new String(cArray);
        return n3;
    }

    public void a(Object[] objectArray) {
        fW fW2;
        int n;
        int n2;
        fW[] fWArray;
        CallSite callSite;
        long l;
        block15: {
            long l2;
            long l3;
            long l4;
            long l5;
            long l6;
            gC gC2;
            bS bS2;
            gd_0 gd_02;
            gK gK2;
            block14: {
                Object object;
                block13: {
                    gK2 = (gK)objectArray[0];
                    gd_02 = (gd_0)objectArray[1];
                    bS2 = (bS)objectArray[2];
                    gC2 = (gC)objectArray[3];
                    l = (Long)objectArray[4];
                    long l7 = l = f ^ l;
                    l6 = l7 ^ 0x53DE6C0DBF3FL;
                    l5 = l7 ^ 0x19F12AA56E02L;
                    l4 = l7 ^ 0x173D198101F1L;
                    l3 = l7 ^ 0x3A4F052D9FF6L;
                    l2 = l7 ^ 0x5D0AD9DA2680L;
                    callSite = dt_0.b("J", (long)666949046499108128L, (long)l);
                    try {
                        try {
                            object = e;
                            if (callSite != null) break block13;
                            if (object) break block14;
                        }
                        catch (MatchException matchException) {
                            throw dt_0.b("J", (Object)matchException, (long)670737874884278541L, (long)l);
                        }
                        object = dt_0.b("P", (Object)dt_0.b("P", (Object)gC2, (long)667017187529135013L, (long)l), (Object)this.a, (long)670476028075774605L, (long)l);
                    }
                    catch (MatchException matchException) {
                        throw dt_0.b("J", (Object)matchException, (long)670737874884278541L, (long)l);
                    }
                }
                try {
                    if (!object) {
                        throw new AssertionError(dt_0.a("y", (int)1242, (long)(0x3B31179B841008FL ^ l)));
                    }
                }
                catch (MatchException matchException) {
                    throw dt_0.b("J", (Object)matchException, (long)670737874884278541L, (long)l);
                }
            }
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l6;
            CallSite callSite2 = dt_0.b("J", (Object)objectArray2, (long)666688086769305279L, (long)l);
            for (fW n3 : this.d) {
                dt_0.b("P", (Object)n3, (Object)callSite2, (long)666614477093458487L, (long)l);
                if (callSite == null) continue;
            }
            Object[] objectArray3 = new Object[1];
            objectArray3[0] = l3;
            CallSite callSite3 = dt_0.b("P", (Object)callSite2, (Object)objectArray3, (long)667343581337305484L, (long)l);
            Object[] objectArray4 = new Object[1];
            objectArray4[0] = l4;
            dt_0.b("P", (Object)callSite3, (Object)objectArray4, (long)671033947599205864L, (long)l);
            Object[] objectArray5 = new Object[2];
            objectArray5[1] = l2;
            objectArray5[0] = gK2;
            dt_0.b("P", (Object)callSite3, (Object)objectArray5, (long)670840182713917874L, (long)l);
            fWArray = this.d;
            n2 = fWArray.length;
            for (n = 0; n < n2; ++n) {
                fW2 = fWArray[n];
                try {
                    dt_0.b("P", (Object)fW2, (Object)callSite3, (long)666774857853172062L, (long)l);
                    if (callSite == null) {
                        if (callSite == null) continue;
                        break;
                    }
                    break block15;
                }
                catch (MatchException matchException) {
                    throw dt_0.b("J", (Object)matchException, (long)670737874884278541L, (long)l);
                }
            }
            Object[] objectArray6 = new Object[5];
            objectArray6[4] = l5;
            objectArray6[3] = (int)dt_0.b("P", (Object)gC2, (long)666550870870152911L, (long)l);
            objectArray6[2] = this.b;
            objectArray6[1] = bS2;
            objectArray6[0] = gd_02;
            dt_0.b("P", (Object)callSite3, (Object)objectArray6, (long)670627657295735070L, (long)l);
            fWArray = this.d;
            n2 = fWArray.length;
        }
        for (n = 0; n < n2; ++n) {
            fW2 = fWArray[n];
            dt_0.b("P", (Object)fW2, (long)670790412879155731L, (long)l);
            if (callSite == null) continue;
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(dt_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(dt_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


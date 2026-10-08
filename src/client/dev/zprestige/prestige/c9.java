/*
 * Decompiled with CFR 0.152.
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.bS;
import dev.zprestige.prestige.bT;
import dev.zprestige.prestige.dy_0;
import dev.zprestige.prestige.fT;
import dev.zprestige.prestige.gI;
import dev.zprestige.prestige.gd_0;
import dev.zprestige.prestige.gf_0;
import dev.zprestige.prestige.hc;
import dev.zprestige.prestige.m_0;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.IntSupplier;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class c9 {
    private static final bS a;
    private static final bS b;
    private static final gd_0 c;
    private final List d = new ArrayList();
    private static final long e;
    private static final long[] f;
    private static final Integer[] g;
    private static final Map h;
    private static final Object[] i;
    private static final String[] j;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        long l;
        e = hc.a(-3312226806052184115L, 8508363514483222659L, MethodHandles.lookup().lookupClass()).a(190456909114825L);
        long l2 = l = e ^ 0x9119C56F4AEL;
        long l3 = l2 ^ 0x18E98F4F091CL;
        long l4 = l2 ^ 0x2A57DC749B3AL;
        long l5 = l2 ^ 0x4638EEF7E633L;
        long l6 = l2 ^ 0x357D3337ABDEL;
        long l7 = l2 ^ 0x6DD04556BE36L;
        long l8 = l2 ^ 0x7CA56D4D2F88L;
        long l9 = l2 ^ 0x76D91EF4206EL;
        i = new Object[51];
        j = new String[51];
        c9.a();
        h = new HashMap(13);
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
        long[] lArray = new long[3];
        int n = 0;
        String string = "U\u0013\u00dd\u00f8\u00ccs\u00dc\u000fd@}\t]\u0006p\u00fdSy\u0011\u001f\u00fa\u00c5E\u00f1";
        int n2 = "U\u0013\u00dd\u00f8\u00ccs\u00dc\u000fd@}\t]\u0006p\u00fdSy\u0011\u001f\u00fa\u00c5E\u00f1".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l10 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l10 >>> 56), (byte)(l10 >>> 48), (byte)(l10 >>> 40), (byte)(l10 >>> 32), (byte)(l10 >>> 24), (byte)(l10 >>> 16), (byte)(l10 >>> 8), (byte)l10});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        f = lArray;
        g = new Integer[3];
        Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
        byte[] byArray5 = new byte[8];
        byte[] byArray6 = byArray5;
        byArray5[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray6 = byArray6;
            byArray6[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher2.init(2, (Key)secretKeyFactory2.generateSecret(new DESKeySpec(byArray6)), new IvParameterSpec(new byte[8]));
        long[] lArray2 = new long[2];
        int n5 = 0;
        String string2 = "q\u00b2|\u00b6\u00f5\t\u008f\u0085\u00f8\u001e\u00a0<\u008a\u008c)\u00db";
        int n6 = "q\u00b2|\u00b6\u00f5\t\u008f\u0085\u00f8\u001e\u00a0<\u008a\u008c)\u00db".length();
        int n7 = 0;
        do {
            byte[] byArray7 = string2.substring(n7, n7 += 8).getBytes("ISO-8859-1");
            int n8 = n5++;
            long l11 = ((long)byArray7[0] & 0xFFL) << 56 | ((long)byArray7[1] & 0xFFL) << 48 | ((long)byArray7[2] & 0xFFL) << 40 | ((long)byArray7[3] & 0xFFL) << 32 | ((long)byArray7[4] & 0xFFL) << 24 | ((long)byArray7[5] & 0xFFL) << 16 | ((long)byArray7[6] & 0xFFL) << 8 | (long)byArray7[7] & 0xFFL;
            byte[] byArray8 = cipher2.doFinal(new byte[]{(byte)(l11 >>> 56), (byte)(l11 >>> 48), (byte)(l11 >>> 40), (byte)(l11 >>> 32), (byte)(l11 >>> 24), (byte)(l11 >>> 16), (byte)(l11 >>> 8), (byte)l11});
            lArray2[n8] = ((long)byArray8[0] & 0xFFL) << 56 | ((long)byArray8[1] & 0xFFL) << 48 | ((long)byArray8[2] & 0xFFL) << 40 | ((long)byArray8[3] & 0xFFL) << 32 | ((long)byArray8[4] & 0xFFL) << 24 | ((long)byArray8[5] & 0xFFL) << 16 | ((long)byArray8[6] & 0xFFL) << 8 | (long)byArray8[7] & 0xFFL;
        } while (n7 < n6);
        Object[] objectArray = new Object[2];
        objectArray[1] = l3;
        objectArray[0] = bS::a;
        a = (bS)((Object)c9.b("\u00ca", (Object)objectArray, (long)1875019713137301000L, (long)l));
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l3;
        objectArray2[0] = bS::a;
        b = (bS)((Object)c9.b("\u00ca", (Object)objectArray2, (long)1875019713137301000L, (long)l));
        Object[] objectArray3 = new Object[3];
        objectArray3[2] = l6;
        objectArray3[1] = gf_0.f;
        objectArray3[0] = a;
        c = c9.b("\u00ca", (Object)objectArray3, (long)1875099762435360015L, (long)l);
        Object[] objectArray4 = new Object[3];
        objectArray4[2] = l8;
        objectArray4[1] = lArray2[0] * (long)gf_0.f.b;
        objectArray4[0] = (int)c9.a("r", (int)1915, (long)(0x282B85BA39952648L ^ l));
        c9.b("\u00fe", (Object)a, (Object)objectArray4, (long)1873528967627115226L, (long)l);
        Object[] objectArray5 = new Object[3];
        objectArray5[2] = l8;
        objectArray5[1] = lArray2[1];
        objectArray5[0] = (int)c9.a("r", (int)9276, (long)(0x66117B82B796850CL ^ l));
        c9.b("\u00fe", (Object)b, (Object)objectArray5, (long)1873528967627115226L, (long)l);
        bT bT2 = new bT(gf_0.f, a, b, l7);
        try {
            Object[] objectArray6 = new Object[4];
            objectArray6[3] = l9;
            objectArray6[2] = Float.valueOf(1.0f);
            objectArray6[1] = Float.valueOf(1.0f);
            objectArray6[0] = Float.valueOf(-1.0f);
            Object[] objectArray7 = new Object[2];
            objectArray7[1] = l4;
            objectArray7[0] = new float[]{0.0f, 1.0f};
            Object[] objectArray8 = new Object[4];
            objectArray8[3] = l9;
            objectArray8[2] = Float.valueOf(1.0f);
            objectArray8[1] = Float.valueOf(-1.0f);
            objectArray8[0] = Float.valueOf(-1.0f);
            Object[] objectArray9 = new Object[2];
            objectArray9[1] = l4;
            objectArray9[0] = new float[]{0.0f, 0.0f};
            Object[] objectArray10 = new Object[4];
            objectArray10[3] = l9;
            objectArray10[2] = Float.valueOf(1.0f);
            objectArray10[1] = Float.valueOf(-1.0f);
            objectArray10[0] = Float.valueOf(1.0f);
            Object[] objectArray11 = new Object[2];
            objectArray11[1] = l4;
            objectArray11[0] = new float[]{1.0f, 0.0f};
            Object[] objectArray12 = new Object[4];
            objectArray12[3] = l9;
            objectArray12[2] = Float.valueOf(1.0f);
            objectArray12[1] = Float.valueOf(1.0f);
            objectArray12[0] = Float.valueOf(1.0f);
            Object[] objectArray13 = new Object[2];
            objectArray13[1] = l4;
            objectArray13[0] = new float[]{1.0f, 1.0f};
            c9.b("\u00fe", (Object)c9.b("\u00fe", (Object)c9.b("\u00fe", (Object)c9.b("\u00fe", (Object)c9.b("\u00fe", (Object)c9.b("\u00fe", (Object)c9.b("\u00fe", (Object)c9.b("\u00fe", (Object)bT2, (Object)objectArray6, (long)1874967574339058606L, (long)l), (Object)objectArray7, (long)1874775310871582919L, (long)l), (Object)objectArray8, (long)1874967574339058606L, (long)l), (Object)objectArray9, (long)1874775310871582919L, (long)l), (Object)objectArray10, (long)1874967574339058606L, (long)l), (Object)objectArray11, (long)1874775310871582919L, (long)l), (Object)objectArray12, (long)1874967574339058606L, (long)l), (Object)objectArray13, (long)1874775310871582919L, (long)l);
            Object[] objectArray14 = new Object[2];
            objectArray14[1] = l5;
            objectArray14[0] = m_0.QUADS;
            c9.b("\u00fe", (Object)bT2, (Object)objectArray14, (long)1875160728374546275L, (long)l);
        }
        catch (Throwable throwable) {
            try {
                c9.b("\u00fe", (Object)bT2, (long)1873580388631703954L, (long)l);
                throw throwable;
            }
            catch (Throwable throwable2) {
                c9.b("\u00fe", (Object)throwable, (Object)throwable2, (long)1874900245749932946L, (long)l);
            }
            throw throwable;
        }
        c9.b("\u00fe", (Object)bT2, (long)1873580388631703954L, (long)l);
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = c9.a(l, l2);
            object = i[n];
            try {
                if (!(object instanceof String)) break block2;
                c9.i[n] = clazz = Class.forName(j[n]);
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
            throw new RuntimeException("dev/zprestige/prestige/c9" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = c9.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = c9.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = c9.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = c9.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public c9 b(Object[] objectArray) {
        fT fT2 = (fT)objectArray[0];
        Consumer consumer = (Consumer)objectArray[1];
        IntSupplier intSupplier = (IntSupplier)objectArray[2];
        long l = (Long)objectArray[3];
        long l2 = l = e ^ l;
        long l3 = l2 ^ 0x55F10A0790D0L;
        long l4 = l2 ^ 0x3C606327B019L;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l4;
        c9.b("\u00fe", (Object)this.d, (Object)new gI((dy_0)((Object)c9.b("\u00fe", (Object)c9.b("\u00fe", (Object)c9.b("\u00fe", (Object)c9.b("\u00ca", (Object)objectArray2, (long)2783923672760647557L, (long)l), (Object)new Object[]{intSupplier}, (long)2784007166808454366L, (long)l), (Object)new Object[]{fT2}, (long)2784070051803744151L, (long)l), (Object)objectArray3, (long)2787671483464459936L, (long)l)), consumer), (long)2783849821936502474L, (long)l);
        return this;
    }

    private static Field c(long l, long l2) {
        int n = c9.a(l, l2);
        Object object = i[n];
        if (object instanceof String) {
            String string = j[n];
            int n2 = string.indexOf(8);
            Class clazz = c9.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = c9.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = c9.a(clazz3, string2, clazz2)) != null) {
                    c9.i[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = c9.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        c9.i[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = c9.b(405410869505215L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = c9.a(l, l2);
        Object object = i[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = j[n];
                int n3 = string2.indexOf(8);
                clazz3 = c9.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = c9.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = c9.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        c9.i[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = c9.b(405410869505215L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = c9.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        c9.i[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = c9.b(405410869505215L, 0L);
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

    public c9 a(Object[] objectArray) {
        fT fT2 = (fT)objectArray[0];
        Consumer consumer = (Consumer)objectArray[1];
        int n = (Integer)objectArray[2];
        long l = (Long)objectArray[3];
        long l2 = (l = e ^ l) ^ 0x14895251D273L;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = l2;
        objectArray2[2] = () -> c9.lambda$addPass$0(n);
        objectArray2[1] = consumer;
        objectArray2[0] = fT2;
        return c9.b("\u00fe", (Object)this, (Object)objectArray2, (long)1905396991939959887L, (long)l);
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
        MethodHandle methodHandle = c9.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static void a() {
        Object[] objectArray = i;
        i[0] = "<u'tZK*u\".I\\=>!(EH,y6?\u000e_\"";
        objectArray[1] = "#\u0012ZftJV2Qie\u00057<Zba_C";
        objectArray[2] = "^O$L5FHO!\u0016&Q_\u0004\"\u0010*ENC5\u0007aRC";
        objectArray[3] = "F\u001fAX\u0019`3?JW\b/R1A\\\fu&";
        objectArray[4] = "2F\rJyn,N\u0017\u0005\u001br+S";
        objectArray[5] = "\u00023\u0011'\u0004|\t<\u0000her\u00027\u00042";
        objectArray[6] = Boolean.TYPE;
        c9.j[6] = "java/lang/Boolean";
        objectArray[7] = "R%#>b\u0018'\u0005(1sWF\u000b#:w\r2";
        objectArray[8] = "Op\u0003s\u0004^:P\b|\u0015\u0011[^\u0003w\u0011K/";
        objectArray[9] = "H\"]h#V^\"X20AIi[4<UX.L#wE\u0015";
        objectArray[10] = "yKe\u0013@U\fkn\u001cQ\u001amee\u0017U@\u0019";
        objectArray[11] = ";M,i#8%E6&D94^;|b?";
        objectArray[12] = "\u0016_\u0018@cB\u0000_\u001d\u001apU\u0017\u0014\u001e\u001c|A\u0006S\t\u000b7S:";
        objectArray[13] = "B`L\u0000h\u00187@G\u000fyWJXT\bp\u001e\"";
        objectArray[14] = "R iE'3'\u0000bJ6|F\u000eiA2&2";
        objectArray[15] = Void.TYPE;
        c9.j[15] = "java/lang/Void";
        objectArray[16] = "T#\u0017\u00176BJ+\rX~BP!\u0015\u001fwY\u0010\u0001\u000e\u0018kBS'\u0013";
        objectArray[17] = "X_Jc?\u0014-\u007fAl.[LqJg*\u00018";
        objectArray[18] = "}oY {sv`Ho\u0001weaX 7sr";
        objectArray[19] = "*:\u0005m\u00019<:\u00007\u0012.+q\u00031\u001e::6\u0014&U+\u001a";
        objectArray[20] = "/ef\u0015\u000bKZEm\u001a\u001a\u0004;Kf\u0011\u001e^O";
        objectArray[21] = "e\u0006^%\u0000:s\u0006[\u007f\u0013-dMXy\u001f9u\nOnT.q";
        objectArray[22] = "\u007fV5=\r\u0016\nv>2\u001cYkx59\u0018\u0003\u001f";
        objectArray[23] = "!-P`\u0013\u0019T\r[o\u0002V5\u0003Pd\u0006\fA";
        objectArray[24] = "\u001e\u0010KBi\u0012\b\u0010N\u0018z\u0005\u001f[M\u001ev\u0011\u000e\u001cZ\t=\u0001<";
        objectArray[25] = "\u001a\u001a#ouoo:(`d \u000e4#k`zz";
        objectArray[26] = "\u0001H\u0018aY\u000f\u0017H\u001d;J\u0018\u0000\u0003\u001e=F\f\u0011D\t*\r\u0018\u0001";
        objectArray[27] = "%\r3$\u001e,P-8+\u000fc1#3 \u000b9E";
        objectArray[28] = "cW\u0002$]\u000buW\u0007~N\u001cb\u001c\u0004xB\bs[\u0013o\t\u0019T";
        objectArray[29] = "Q\u0017'\"q[$7,-`\u0014E9'&dN1";
        objectArray[30] = "Pi\\\u0019!%\u000e{O$#B\u000fgB\u0015,-]>\u001eMJ{\u001ebDGq<\u0013>J$";
        objectArray[31] = "\nC0n!\u0014\u000e\u001e`-J\u0011XTvUq\u0005MJ46#\u0005\nF\n";
        objectArray[32] = "\u0014$u V[_\u007frd.[$u3\"\u0012KI6wa\u00161";
        objectArray[33] = "[Rf\u0013\u001c/[\u0017fIdteNvDUx\n\u001c/\u0018\r\u001e[Rf\u0013\u001c/[\u0017fId";
        objectArray[34] = "TP\u001c\u0017)\u0004M\u0000]EK\u000fS\\9[3\u001eE]\u0019]&\n?[\u0002Xz\u0004]BR\u0019(fVW]L)WQ]\u0010\u0018K";
        objectArray[35] = "/\u0001+\u0011\u001dA2TuJ}YC\u0006zNLU,T#\u0012\u00143/\u0001+\u0011\u001dA2TuJ}";
        objectArray[36] = "\u001e)#3u\u001aK>nd\t\fs01i8\u0003\u001cbh5`eH!)`7\u0006\u001a!nl\t";
        objectArray[37] = "rm\rrr\u0003o8S)\u0012\u001a\u001ej\\-#\u0017q8\u0005q{qrm\rrr\u0003o8S)\u0012";
        objectArray[38] = "*J\u0013(\u0005\u00009\u0001\u00065e[E[\u001a0T\\*\tCl\f:*J\u0013(\u0005\u00009\u0001\u00065e";
        objectArray[39] = "k-6c4;:yc!\u00040\ntf=5?e&?amYk-6c4;:yc!\u0004";
        objectArray[40] = "&#s\u0005\u0018]a./\u000b{\u000f\u001f2v\u0003J\u0000p`/_\u0012f#?oY\u0010\u0001}-|d";
        objectArray[41] = "\u0015]H~N6ET]/%.BX!yW?@\nB+WxL4\u001ds\u001f<LL\u0010'B<.";
        objectArray[42] = "\u0010\u000e\u0017\f\u0017)N\u001c\u00041\u0016NO\u0000\t\u0000\u001a!\u001dYUX|rB\u0019SZ\u001b,P\nn";
        objectArray[43] = "\"d^wA\b&9\u000e4*\u000btx\"!Z\u0017\u001d?UvQ\te2\u0001+Qk";
        objectArray[44] = "\u0016\u001aaD&\u0010Q\u0017=JEB/\u000bdBtM@Y=\u001e,+F\u000f;O'\u001aA\u0005v\u001bE";
        objectArray[45] = ".}}>IHpon\u0003O/qsc2D@#*?j\"\u0013|j9hEMny\u0004";
        objectArray[46] = "jT\u001f \u000e\u0000d\u0003\b\"o\u0007k\u0003\u00173\u0013n;\u001a\u0002%Q\ri\u001aE)o\u0007gW\u0010)^\u0000m\u001aDK";
        objectArray[47] = "(6Jo\u001dXx?_>vHo2Y:\nNi_\u001c4L\u0012x<\u0018i\u001cQ\u0013";
        objectArray[48] = "&[`AA\n;\u000e>\u001a!\u0013.X*\u0014!\u0011-\u0000;\u001b\u0010\u0016'Moy";
        objectArray[49] = "8\u0010Ay\rG0\u001b\u0007vcAZ\u0013_\u007fRN5A\u0006#\n(3\u0017\u0000r\u0001\u00194\u001dM&c";
        Object[] objectArray2 = objectArray;
        objectArray[50] = "M\"\u0003_\nF\n/_Qi\u0011t3\u0006YX\u001b\u001ba_\u0005\u0000}\u001d7YT\u000bL\u001a=\u0014\u0000i";
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'b' || c == 'V' || c == 'X' || c == '\u00cc') {
                field = c9.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'b' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'V' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'X' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = c9.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00fe' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00ca' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/c9" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (j[n3] != null) {
            return n3;
        }
        Object object = i[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 63;
            case 1 -> 9;
            case 2 -> 20;
            case 3 -> 46;
            case 4 -> 40;
            case 5 -> 8;
            case 6 -> 28;
            case 7 -> 59;
            case 8 -> 21;
            case 9 -> 33;
            case 10 -> 42;
            case 11 -> 23;
            case 12 -> 58;
            case 13 -> 15;
            case 14 -> 57;
            case 15 -> 51;
            case 16 -> 19;
            case 17 -> 7;
            case 18 -> 34;
            case 19 -> 53;
            case 20 -> 39;
            case 21 -> 29;
            case 22 -> 54;
            case 23 -> 55;
            case 24 -> 2;
            case 25 -> 12;
            case 26 -> 18;
            case 27 -> 10;
            case 28 -> 47;
            case 29 -> 32;
            case 30 -> 24;
            case 31 -> 41;
            case 32 -> 49;
            case 33 -> 37;
            case 34 -> 13;
            case 35 -> 14;
            case 36 -> 52;
            case 37 -> 60;
            case 38 -> 17;
            case 39 -> 31;
            case 40 -> 1;
            case 41 -> 3;
            case 42 -> 6;
            case 43 -> 61;
            case 44 -> 30;
            case 45 -> 62;
            case 46 -> 35;
            case 47 -> 48;
            case 48 -> 45;
            case 49 -> 56;
            case 50 -> 44;
            case 51 -> 16;
            case 52 -> 25;
            case 53 -> 38;
            case 54 -> 4;
            case 55 -> 22;
            case 56 -> 43;
            case 57 -> 27;
            case 58 -> 36;
            case 59 -> 11;
            case 60 -> 26;
            case 61 -> 50;
            case 62 -> 5;
            default -> 0;
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
        c9.j[n3] = new String(cArray);
        return n3;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = c9.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3B3E;
        if (g[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = f[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])h.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    h.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/c9", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            c9.g[n2] = n3;
        }
        return g[n2];
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
        long l2 = l = e ^ l;
        long l3 = l2 ^ 0x70F6F4CE00F7L;
        long l4 = l2 ^ 0x7E3AC7EA6F04L;
        CallSite callSite = c9.b("\u00fe", (Object)this.d, (long)7474216448267204085L, (long)l);
        CallSite callSite2 = c9.b("\u00ca", (long)7474331278049479518L, (long)l);
        while (c9.b("\u00fe", (Object)callSite, (long)7473981851206973137L, (long)l) != false) {
            gI gI2 = (gI)((Object)c9.b("\u00fe", (Object)callSite, (long)7473151899441774904L, (long)l));
            dy_0 dy_02 = gI2.bx;
            Object[] objectArray2 = new Object[1];
            objectArray2[0] = l4;
            c9.b("\u00fe", (Object)dy_02, (Object)objectArray2, (long)7474046030714020975L, (long)l);
            c9.b("\u00fe", (Object)gI2.by, (Object)dy_02, (long)7474161748800199621L, (long)l);
            Object[] objectArray3 = new Object[5];
            objectArray3[4] = l3;
            objectArray3[3] = (int)c9.a("r", (int)28388, (long)(0x6B25593A068AB268L ^ l));
            objectArray3[2] = 4;
            objectArray3[1] = b;
            objectArray3[0] = c;
            c9.b("\u00fe", (Object)dy_02, (Object)objectArray3, (long)7475592325295794177L, (long)l);
            if (callSite2 == null) continue;
        }
    }

    private static int lambda$addPass$0(int n) {
        return n;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(c9.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(c9.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


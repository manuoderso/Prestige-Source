/*
 * Decompiled with CFR 0.152.
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.bS;
import dev.zprestige.prestige.g0;
import dev.zprestige.prestige.gZ;
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
 * Renamed from dev.zprestige.prestige.ge
 */
public class ge_0 {
    public final g0[] a;
    public final int b;
    private final int[] c;
    private static final long d = hc.a(655243498468074368L, 5976474487935241839L, MethodHandles.lookup().lookupClass()).a(23835472979140L);
    private static final String e;
    private static final long[] f;
    private static final Integer[] g;
    private static final Map h;
    private static final Object[] i;
    private static final String[] j;

    public ge_0(g0[] g0Array, long l) {
        l = d ^ l;
        this.a = g0Array;
        int n = 0;
        this.c = new int[g0Array.length];
        for (int i = 0; i < g0Array.length; ++i) {
            g0 g02 = g0Array[i];
            this.c[i] = n;
            n += ge_0.b("i", (Object)g02, (long)8572030259306928383L, (long)l) * ge_0.b("i", (Object)g02, (long)8571857010585021430L, (long)l);
        }
        this.b = n;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        i = new Object[28];
        j = new String[28];
        ge_0.a();
        long l = d ^ 0x38BF29E667E4L;
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
        byte[] byArray3 = cipher.doFinal("\u00ecM\u0001\u00a4X\u00b4\u00b4<\u00e3\u00b9nod\u009az\u009c\u0098\u00e5\u00c3\rvag\u00a1".getBytes("ISO-8859-1"));
        e = ge_0.a(byArray3).intern();
        h = new HashMap(13);
        Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
        byte[] byArray4 = new byte[8];
        byte[] byArray5 = byArray4;
        byArray4[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray5 = byArray5;
            byArray5[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher2.init(2, (Key)secretKeyFactory2.generateSecret(new DESKeySpec(byArray5)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[2];
        int n = 0;
        String string = "au`\u009b\u00c4\u0007*\u00d7\u00e5*v\u00b3p\u009c\u00b5\u00ed";
        int n2 = "au`\u009b\u00c4\u0007*\u00d7\u00e5*v\u00b3p\u009c\u00b5\u00ed".length();
        int n3 = 0;
        do {
            byte[] byArray6 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray6[0] & 0xFFL) << 56 | ((long)byArray6[1] & 0xFFL) << 48 | ((long)byArray6[2] & 0xFFL) << 40 | ((long)byArray6[3] & 0xFFL) << 32 | ((long)byArray6[4] & 0xFFL) << 24 | ((long)byArray6[5] & 0xFFL) << 16 | ((long)byArray6[6] & 0xFFL) << 8 | (long)byArray6[7] & 0xFFL;
            byte[] byArray7 = cipher2.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray7[0] & 0xFFL) << 56 | ((long)byArray7[1] & 0xFFL) << 48 | ((long)byArray7[2] & 0xFFL) << 40 | ((long)byArray7[3] & 0xFFL) << 32 | ((long)byArray7[4] & 0xFFL) << 24 | ((long)byArray7[5] & 0xFFL) << 16 | ((long)byArray7[6] & 0xFFL) << 8 | (long)byArray7[7] & 0xFFL;
        } while (n3 < n2);
        f = lArray;
        g = new Integer[2];
    }

    public boolean equals(Object object) {
        Object object2;
        block28: {
            block26: {
                CallSite callSite;
                long l;
                block27: {
                    ge_0 ge_02;
                    block25: {
                        Object object3;
                        block23: {
                            block24: {
                                Object object4;
                                block20: {
                                    block21: {
                                        l = d ^ 0x459E2DE59362L;
                                        callSite = ge_0.b("A", (long)2486432872202658796L, (long)l);
                                        try {
                                            try {
                                                object4 = this;
                                                if (callSite != null) break block20;
                                                if (object4 != object) break block21;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw ge_0.b("A", (Object)illegalArgumentException, (long)2486975238019666975L, (long)l);
                                            }
                                            return true;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw ge_0.b("A", (Object)illegalArgumentException, (long)2486975238019666975L, (long)l);
                                        }
                                    }
                                    object4 = object;
                                }
                                try {
                                    block22: {
                                        try {
                                            try {
                                                if (object4 == null) break block22;
                                                object3 = this.getClass();
                                                if (callSite != null) break block23;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw ge_0.b("A", (Object)illegalArgumentException, (long)2486975238019666975L, (long)l);
                                            }
                                            if (object3 == object.getClass()) break block24;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw ge_0.b("A", (Object)illegalArgumentException, (long)2486975238019666975L, (long)l);
                                        }
                                    }
                                    return false;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw ge_0.b("A", (Object)illegalArgumentException, (long)2486975238019666975L, (long)l);
                                }
                            }
                            object3 = object;
                        }
                        ge_02 = (ge_0)object3;
                        try {
                            try {
                                object2 = this.b;
                                if (callSite != null) break block25;
                                if (object2 != ge_02.b) break block26;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw ge_0.b("A", (Object)illegalArgumentException, (long)2486975238019666975L, (long)l);
                            }
                            object2 = ge_0.b("A", (Object)this.a, (Object)ge_02.a, (long)2486186273626322627L, (long)l);
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw ge_0.b("A", (Object)illegalArgumentException, (long)2486975238019666975L, (long)l);
                        }
                    }
                    try {
                        try {
                            if (callSite != null) break block27;
                            if (object2 == 0) break block26;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw ge_0.b("A", (Object)illegalArgumentException, (long)2486975238019666975L, (long)l);
                        }
                        object2 = ge_0.b("A", (Object)this.c, (Object)ge_02.c, (long)2486896710990178494L, (long)l);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw ge_0.b("A", (Object)illegalArgumentException, (long)2486975238019666975L, (long)l);
                    }
                }
                try {
                    if (callSite != null) break block28;
                    if (object2 == 0) break block26;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw ge_0.b("A", (Object)illegalArgumentException, (long)2486975238019666975L, (long)l);
                }
                object2 = 1;
                break block28;
            }
            object2 = 0;
        }
        return (boolean)object2;
    }

    public int hashCode() {
        long l = d ^ 0x759EE15923CCL;
        CallSite callSite = ge_0.b("A", (Object)new Object[]{ge_0.b("A", (int)this.b, (long)-7913544057718313207L, (long)l)}, (long)-7913323332900450440L, (long)l);
        reference var3_4 = ge_0.a("k", (int)2302, (long)(0x1F40412D8F496679L ^ l)) * callSite + ge_0.b("A", (Object)this.a, (long)-7912827657607245245L, (long)l);
        var3_4 = ge_0.a("k", (int)1518, (long)(0x6AF11474840BEB68L ^ l)) * var3_4 + ge_0.b("A", (Object)this.c, (long)-7913443514061422653L, (long)l);
        return (int)var3_4;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ge_0.a(l, l2);
            object = i[n];
            try {
                if (!(object instanceof String)) break block2;
                ge_0.i[n] = clazz = Class.forName(j[n]);
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
            throw new RuntimeException("dev/zprestige/prestige/ge" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = ge_0.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ge_0.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ge_0.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ge_0.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l, long l2) {
        int n = ge_0.a(l, l2);
        Object object = i[n];
        if (object instanceof String) {
            String string = j[n];
            int n2 = string.indexOf(8);
            Class clazz = ge_0.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ge_0.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ge_0.a(clazz3, string2, clazz2)) != null) {
                    ge_0.i[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ge_0.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ge_0.i[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ge_0.b(1242013221410284L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = ge_0.a(l, l2);
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
                clazz3 = ge_0.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ge_0.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ge_0.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        ge_0.i[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ge_0.b(1242013221410284L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ge_0.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ge_0.i[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ge_0.b(1242013221410284L, 0L);
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

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ge_0.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
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

    public gZ a(Object[] objectArray) {
        int n;
        bS bS2;
        block4: {
            bS2 = (bS)objectArray[0];
            n = (Integer)objectArray[1];
            long l = (Long)objectArray[2];
            l = d ^ l;
            try {
                try {
                    if (n >= 0 && n < this.a.length) break block4;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw ge_0.b("A", (Object)illegalArgumentException, (long)-1409697429643322637L, (long)l);
                }
                throw new IllegalArgumentException(e + n);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw ge_0.b("A", (Object)illegalArgumentException, (long)-1409697429643322637L, (long)l);
            }
        }
        g0 g02 = this.a[n];
        int n2 = this.c[n];
        return new gZ(bS2, g02, this.b, n2);
    }

    private static void a() {
        Object[] objectArray = i;
        i[0] = "w~6y\u0017Na~3#\u0004Yv50%\bMgr'2C_[";
        objectArray[1] = "rCf\u000b|.\u0007cm\u0004maz{~\u0003d(\u0012";
        objectArray[2] = "iu\u000fvfNw}\u00159\tIqu\u0000d";
        objectArray[3] = "Jk\u0014\u00039/?K\u001f\f(`^E\u0014\u0007,:*";
        objectArray[4] = "\t/\u001bwhl|\u000f\u0010xy#\u001d\u0001\u001bs}yi";
        objectArray[5] = Boolean.TYPE;
        ge_0.j[5] = "java/lang/Boolean";
        objectArray[6] = "\fR";
        objectArray[7] = "\u0014`";
        objectArray[8] = "\u000ep|G\u001cW\u0018py\u001d\u000f@\u000f;z\u001b\u0003T\u001e|m\fH@\u000f";
        objectArray[9] = "<l2?\u001eB7c#pyB:h#?\\o$j13U@\"H<=U^\"d+0";
        objectArray[10] = "L\t[\u001e\u0010qG\u0006JQwsR\rJ\u001aL";
        objectArray[11] = Integer.TYPE;
        ge_0.j[11] = "java/lang/Integer";
        objectArray[12] = "\u0014\u0000";
        objectArray[13] = "E-?\u001e9\t0\r4\u0011(FQ\u0003?\u001a,\u001c%";
        objectArray[14] = "]&M\u001az(C.WU\u001b?]\"X\u000f'";
        objectArray[15] = "\u0001Y\u0001,\u000b>ty\n#\u001aq\u0015w\u0001(\u001e+a";
        objectArray[16] = "ioK\u007fQS\u007foN%BDh$M#NPycZ4\u0005D=";
        objectArray[17] = "FE)\u0013\n\tMJ8\\k\u0007FA<\u0006";
        objectArray[18] = "\u007f\u0000\u0003P\t0,\u0017_\u0002{3/\u0016\u0000r\u001c?+m\tE\u00075+\u001c_W\u00189F]\tA\u0007hv\u000e\u0003I\u000bS";
        objectArray[19] = "Hg\fYZ<\u001d{\u0013b\u0001B\u001e?\u0016\u0001\u0013&^eS\u000bk";
        objectArray[20] = "v\"\u0004r#_ry\u0005e\u0012\u0005}G\u000erj\u0012'w]xb\u001e\u001c";
        objectArray[21] = "u#\u0005\t|Pl1\u0017J\u0011Zu4\nwxF`)\u0007\u0006.T\u007f%jGxB`tZ\u0014rJlO";
        objectArray[22] = ",PiV}N(\u000bhAL\u0014)5cV4\u0003}\u00050\\<\u000fF";
        objectArray[23] = "\u001ea)p\u0004wMvu\"vy^q#}\r\u0014Np6\u007f\u001be\u0018b)sv}[p,t\u0007+Io \u0019J/Xr:}H+\u001auJ";
        objectArray[24] = "'_/\u001e\\\u000b{\u0006#I5\u0013q_2\u0015r\u0003\u0018\u000b&\u0000IV(X,\bEm'_/\u001e\\\u000b{\u0006#I5";
        objectArray[25] = "2#l \u007fGa40r\rIr3f-v$;?l,=\u001eavs\"\r\u0014z-jy7N32dI1\u001ft0\u007f-3\u001b67\u000f";
        objectArray[26] = "v\u001b\f\u00049;%\fPVK8&\r\u000f&,4\"v_\u001c(=\u007fL\u0005U73OF\u0006\u00157c\u007f\u0015\f\u001d;X";
        Object[] objectArray2 = objectArray;
        objectArray[27] = "N\u0000U\u000bs\u0005\u0013\u0001\r\u001dI\u000fsG\u0002\b \t\u0002\u001eP\u0006%fM\u0016\u0002\u000e&\u0017\u0014D\f\u000bI";
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00c7' || c == 'E' || c == '\u00cb' || c == 'S') {
                field = ge_0.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c7' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'E' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00cb' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ge_0.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'i' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'A' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = ge_0.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/ge" + " : " + string + " : " + methodType.toString(), exception);
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
            case 0 -> 25;
            case 1 -> 38;
            case 2 -> 20;
            case 3 -> 46;
            case 4 -> 40;
            case 5 -> 12;
            case 6 -> 47;
            case 7 -> 59;
            case 8 -> 18;
            case 9 -> 17;
            case 10 -> 61;
            case 11 -> 26;
            case 12 -> 8;
            case 13 -> 32;
            case 14 -> 37;
            case 15 -> 3;
            case 16 -> 23;
            case 17 -> 34;
            case 18 -> 45;
            case 19 -> 60;
            case 20 -> 15;
            case 21 -> 55;
            case 22 -> 4;
            case 23 -> 49;
            case 24 -> 33;
            case 25 -> 35;
            case 26 -> 7;
            case 27 -> 0;
            case 28 -> 56;
            case 29 -> 1;
            case 30 -> 62;
            case 31 -> 27;
            case 32 -> 52;
            case 33 -> 30;
            case 34 -> 41;
            case 35 -> 39;
            case 36 -> 5;
            case 37 -> 24;
            case 38 -> 29;
            case 39 -> 50;
            case 40 -> 57;
            case 41 -> 13;
            case 42 -> 28;
            case 43 -> 11;
            case 44 -> 21;
            case 45 -> 58;
            case 46 -> 19;
            case 47 -> 16;
            case 48 -> 53;
            case 49 -> 48;
            case 50 -> 36;
            case 51 -> 9;
            case 52 -> 51;
            case 53 -> 10;
            case 54 -> 14;
            case 55 -> 42;
            case 56 -> 2;
            case 57 -> 54;
            case 58 -> 44;
            case 59 -> 63;
            case 60 -> 6;
            case 61 -> 22;
            case 62 -> 43;
            default -> 31;
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
        ge_0.j[n3] = new String(cArray);
        return n3;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7CAC;
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
                throw new RuntimeException("dev/zprestige/prestige/ge", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ge_0.g[n2] = n3;
        }
        return g[n2];
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

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ge_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(ge_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


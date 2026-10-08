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
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

record gD(Class bi, String bj, Class bk, Class[] bl, Class bm) {
    private static final long a = hc.a(1243696713190232857L, -6215998829119537367L, MethodHandles.lookup().lookupClass()).a(33118459020329L);
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;
    private static final Object[] e;
    private static final String[] f;

    /*
     * Enabled aggressive block sorting
     */
    static {
        e = new Object[16];
        f = new String[16];
        gD.a();
        d = new HashMap(13);
        long l = a ^ 0x3E16B68291L;
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
        String string = "\u00062\u009e_\u001d\u00e6\u00eb=\r\u00d7\u00c2=\rD\u0084\u001f";
        int n2 = "\u00062\u009e_\u001d\u00e6\u00eb=\r\u00d7\u00c2=\rD\u0084\u001f".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        b = lArray;
        c = new Integer[2];
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean equals(Object object) {
        Object object2;
        block50: {
            void var6_6;
            gD gD2;
            CallSite callSite;
            long l;
            block48: {
                Object object3;
                Object object4;
                block49: {
                    block46: {
                        block47: {
                            block44: {
                                block45: {
                                    block42: {
                                        block43: {
                                            block40: {
                                                block41: {
                                                    Object object5;
                                                    block38: {
                                                        block39: {
                                                            Object object6;
                                                            block35: {
                                                                block36: {
                                                                    l = a ^ 0xE1AED3522DEL;
                                                                    callSite = gD.b("\u00fe", (long)8765154988196464715L, (long)l);
                                                                    try {
                                                                        try {
                                                                            object6 = this;
                                                                            if (callSite != null) break block35;
                                                                            if (object6 != object) break block36;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw gD.b("\u00fe", (Object)matchException, (long)8765381347125381791L, (long)l);
                                                                        }
                                                                        return true;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw gD.b("\u00fe", (Object)matchException, (long)8765381347125381791L, (long)l);
                                                                    }
                                                                }
                                                                object6 = object;
                                                            }
                                                            try {
                                                                block37: {
                                                                    try {
                                                                        try {
                                                                            if (object6 == null) break block37;
                                                                            object5 = this.getClass();
                                                                            if (callSite != null) break block38;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw gD.b("\u00fe", (Object)matchException, (long)8765381347125381791L, (long)l);
                                                                        }
                                                                        if (object5 == object.getClass()) break block39;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw gD.b("\u00fe", (Object)matchException, (long)8765381347125381791L, (long)l);
                                                                    }
                                                                }
                                                                return false;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw gD.b("\u00fe", (Object)matchException, (long)8765381347125381791L, (long)l);
                                                            }
                                                        }
                                                        object5 = object;
                                                    }
                                                    gD2 = (gD)object5;
                                                    try {
                                                        try {
                                                            object4 = gD.b("I", (Object)this.bi, (Object)gD2.bi, (long)8765638680596892074L, (long)l);
                                                            if (callSite != null) break block40;
                                                            if (object4 != false) break block41;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw gD.b("\u00fe", (Object)matchException, (long)8765381347125381791L, (long)l);
                                                        }
                                                        return false;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw gD.b("\u00fe", (Object)matchException, (long)8765381347125381791L, (long)l);
                                                    }
                                                }
                                                object4 = gD.b("I", (Object)this.bm, (Object)gD2.bm, (long)8765638680596892074L, (long)l);
                                            }
                                            try {
                                                try {
                                                    if (callSite != null) break block42;
                                                    if (object4 != false) break block43;
                                                }
                                                catch (MatchException matchException) {
                                                    throw gD.b("\u00fe", (Object)matchException, (long)8765381347125381791L, (long)l);
                                                }
                                                return false;
                                            }
                                            catch (MatchException matchException) {
                                                throw gD.b("\u00fe", (Object)matchException, (long)8765381347125381791L, (long)l);
                                            }
                                        }
                                        object4 = gD.b("I", this.bj, (Object)gD2.bj, (long)8765337485611078661L, (long)l);
                                    }
                                    try {
                                        try {
                                            if (callSite != null) break block44;
                                            if (object4 != false) break block45;
                                        }
                                        catch (MatchException matchException) {
                                            throw gD.b("\u00fe", (Object)matchException, (long)8765381347125381791L, (long)l);
                                        }
                                        return false;
                                    }
                                    catch (MatchException matchException) {
                                        throw gD.b("\u00fe", (Object)matchException, (long)8765381347125381791L, (long)l);
                                    }
                                }
                                object4 = gD.b("I", (Object)this.bk, (Object)gD2.bk, (long)8765638680596892074L, (long)l);
                            }
                            try {
                                try {
                                    if (callSite != null) break block46;
                                    if (object4 != false) break block47;
                                }
                                catch (MatchException matchException) {
                                    throw gD.b("\u00fe", (Object)matchException, (long)8765381347125381791L, (long)l);
                                }
                                return false;
                            }
                            catch (MatchException matchException) {
                                throw gD.b("\u00fe", (Object)matchException, (long)8765381347125381791L, (long)l);
                            }
                        }
                        object4 = this.bl.length;
                    }
                    try {
                        try {
                            if (callSite != null) break block48;
                            if (object4 == gD2.bl.length) break block49;
                        }
                        catch (MatchException matchException) {
                            throw gD.b("\u00fe", (Object)matchException, (long)8765381347125381791L, (long)l);
                        }
                        return false;
                    }
                    catch (MatchException matchException) {
                        throw gD.b("\u00fe", (Object)matchException, (long)8765381347125381791L, (long)l);
                    }
                }
                object4 = object3 = (Object)0;
            }
            while (var6_6 < this.bl.length) {
                block52: {
                    int n;
                    block51: {
                        try {
                            try {
                                object2 = gD.b("I", (Object)this.bl[var6_6], (Object)gD2.bl[var6_6], (long)8765638680596892074L, (long)l);
                                if (callSite != null) break block50;
                                if (callSite != null) break block51;
                            }
                            catch (MatchException matchException) {
                                throw gD.b("\u00fe", (Object)matchException, (long)8765381347125381791L, (long)l);
                            }
                            if (object2) break block52;
                        }
                        catch (MatchException matchException) {
                            throw gD.b("\u00fe", (Object)matchException, (long)8765381347125381791L, (long)l);
                        }
                        n = 0;
                    }
                    return n != 0;
                }
                ++var6_6;
                if (callSite == null) continue;
            }
            object2 = true;
        }
        return object2;
    }

    @Override
    public int hashCode() {
        long l = a ^ 0x11AA1081D1F9L;
        Object object = this.bi.hashCode();
        object = gD.a("h", (int)12807, (long)(0xAB1C4DC79032983L ^ l)) * object + gD.b("I", this.bj, (long)-8465815018664940311L, (long)l);
        object = gD.a("h", (int)18352, (long)(0x7DF67FF3BDAE5C35L ^ l)) * object + this.bk.hashCode();
        object = gD.a("h", (int)18352, (long)(0x7DF67FF3BDAE5C35L ^ l)) * object + this.bm.hashCode();
        object = gD.a("h", (int)18352, (long)(0x7DF67FF3BDAE5C35L ^ l)) * object + gD.b("\u00fe", (Object)this.bl, (long)-8466005031968609788L, (long)l);
        return object;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = gD.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = gD.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
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
            throw new RuntimeException("dev/zprestige/prestige/gD" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = gD.a(l, l2);
            object = e[n];
            try {
                if (!(object instanceof String)) break block2;
                gD.e[n] = clazz = Class.forName(f[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = gD.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = gD.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Field c(long l, long l2) {
        int n = gD.a(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            String string = f[n];
            int n2 = string.indexOf(8);
            Class clazz = gD.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = gD.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = gD.a(clazz3, string2, clazz2)) != null) {
                    gD.e[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = gD.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        gD.e[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = gD.b(325045092377887L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = gD.a(l, l2);
        Object object = e[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = f[n];
                int n3 = string2.indexOf(8);
                clazz3 = gD.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = gD.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = gD.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        gD.e[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = gD.b(325045092377887L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = gD.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        gD.e[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = gD.b(325045092377887L, 0L);
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
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/gD" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static void a() {
        Object[] objectArray = e;
        e[0] = ":-*6\u0017\u000b$%0yx\f\"-%$";
        objectArray[1] = "f5\b`5[\u0013\u0015\u0003o$\u0014r\u001b\bd N\u0006";
        objectArray[2] = Integer.TYPE;
        gD.f[2] = "java/lang/Integer";
        objectArray[3] = "34ce)\r8;r*T\u0015+<{c";
        objectArray[4] = "*2\u0000<8\u0007!=\u0011sY\t*6\u0015)";
        objectArray[5] = Boolean.TYPE;
        gD.f[5] = "java/lang/Boolean";
        objectArray[6] = "E$LY\r`S$I\u0003\u001ewDoJ\u0005\u0012cU(]\u0012Yqi";
        objectArray[7] = "9\u0000yJ\u0005iL rE\u0014&18aB\u001doY";
        objectArray[8] = ":B/+J>,B*qY);\t)wU=*N>`\u001e)\u001a";
        objectArray[9] = "c(0-\u0014Qh'!bw\\}*.\tB^l92%US";
        objectArray[10] = ")s,iU\nn$j\u0003Q\u001dk(\u001dd]\u0019\u0010qjmO\u001bjp9dUt))??C\u0015vs<a1";
        objectArray[11] = "\u000e\u0006<u3`Q\u0002z4UoLDjo.\u0002\u000e\u0006<u3`Q\u0002z4U9GDdyos\b[=\u000b";
        objectArray[12] = "\u0005\u000f|8>kE\u0002)z^=9Ty),6CX&} W";
        objectArray[13] = "\u0015q&+\u001b1C!n  -Ff6\rG!B\u001do'Iq]|0}J//";
        objectArray[14] = "erp\t\u0007\u000f3\"8\u0002<\u001e&ci\u0000Gsd!?\u001aZ\u0011;%y[<H-cg\u0016\u0006\u0002b|>d";
        Object[] objectArray2 = objectArray;
        objectArray[15] = "Y\u001cR|'R\u0015\u0013N;XCdRB(<Z\u001c\bBv *Z\u0000@\"(R\u0000\u0000\u001e>X";
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

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00c8' || c == '\u00c6' || c == '\u00f6' || c == 'i') {
                field = gD.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c8' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00c6' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00f6' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = gD.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'I' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00fe' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = gD.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1105;
        if (c[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = b[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])d.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    d.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/gD", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            gD.c[n2] = n3;
        }
        return c[n2];
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (f[n3] != null) {
            return n3;
        }
        Object object = e[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 10;
            case 1 -> 23;
            case 2 -> 13;
            case 3 -> 60;
            case 4 -> 26;
            case 5 -> 51;
            case 6 -> 11;
            case 7 -> 4;
            case 8 -> 58;
            case 9 -> 52;
            case 10 -> 6;
            case 11 -> 45;
            case 12 -> 19;
            case 13 -> 2;
            case 14 -> 28;
            case 15 -> 33;
            case 16 -> 55;
            case 17 -> 14;
            case 18 -> 17;
            case 19 -> 12;
            case 20 -> 63;
            case 21 -> 7;
            case 22 -> 20;
            case 23 -> 32;
            case 24 -> 36;
            case 25 -> 59;
            case 26 -> 1;
            case 27 -> 21;
            case 28 -> 56;
            case 29 -> 42;
            case 30 -> 46;
            case 31 -> 25;
            case 32 -> 15;
            case 33 -> 27;
            case 34 -> 62;
            case 35 -> 31;
            case 36 -> 49;
            case 37 -> 44;
            case 38 -> 16;
            case 39 -> 53;
            case 40 -> 39;
            case 41 -> 5;
            case 42 -> 61;
            case 43 -> 0;
            case 44 -> 37;
            case 45 -> 8;
            case 46 -> 57;
            case 47 -> 9;
            case 48 -> 41;
            case 49 -> 40;
            case 50 -> 48;
            case 51 -> 47;
            case 52 -> 3;
            case 53 -> 35;
            case 54 -> 30;
            case 55 -> 54;
            case 56 -> 24;
            case 57 -> 38;
            case 58 -> 34;
            case 59 -> 43;
            case 60 -> 18;
            case 61 -> 50;
            case 62 -> 29;
            default -> 22;
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
        gD.f[n3] = new String(cArray);
        return n3;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = gD.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(gD.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(gD.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


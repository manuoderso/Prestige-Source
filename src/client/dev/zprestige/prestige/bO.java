/*
 * Decompiled with CFR 0.152.
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.aH;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.cy_0;
import dev.zprestige.prestige.hc;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class bO {
    private volatile Map a = new HashMap();
    private final Object b = new Object();
    private static final MethodType c;
    private static final Set d;
    public final CopyOnWriteArrayList e = new CopyOnWriteArrayList();
    private static final long f;
    private static final String g;
    private static final Object[] h;
    private static final String[] i;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        MethodType methodType;
        f = hc.a(2012278036912819117L, 5718148003641147428L, MethodHandles.lookup().lookupClass()).a(93343085176823L);
        long l = f ^ 0x69E8424EFA02L;
        h = new Object[81];
        i = new String[81];
        bO.a();
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
        byte[] byArray3 = cipher.doFinal("\u00ffi0\u00e06@\u0001\u00a8\u00ca\u00d4\u00e1P\"\u0080\u00e3h\u00c5\u0003'+b1\u009a\n\u0085\u00ef%s\u00a4\u001b9~A\u0087\u0093\u00df\u00ef\u00f1\u00f2\u00a5@\u00efw\u00fe\u00ef\u00f6.\u00da,\u009a\u00d5y\u00ad-\u009d:a\u00c6\u00f7\u00fd\u00bd\u00d5\u00dd\u008f".getBytes("ISO-8859-1"));
        g = bO.a(byArray3).intern();
        try {
            methodType = (MethodType)bO.d(-8393804259218710198L, l).invoke(null, bO.a(bO.a("Y", (long)-8387506988623906704L, (long)l), aH.class));
        }
        catch (InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
        c = methodType;
        d = bO.a("c", (long)-8393235406609986097L, (long)l);
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = bO.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = bO.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = bO.a(l, l2);
            object = h[n];
            try {
                if (!(object instanceof String)) break block2;
                bO.h[n] = clazz = Class.forName(i[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Object[] b() {
        return new Object[0];
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = bO.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = bO.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public boolean b(Object[] objectArray) {
        int n;
        block6: {
            block5: {
                cy_0[] cy_0Array;
                CallSite callSite;
                long l;
                block4: {
                    Class clazz = (Class)objectArray[0];
                    l = (Long)objectArray[1];
                    l = f ^ l;
                    cy_0[] cy_0Array2 = (cy_0[])bO.a("\u00e3", (Object)this.a, (Object)clazz, (long)-6758249215061492405L, (long)l);
                    callSite = bO.a("c", (long)-6757707914155848111L, (long)l);
                    try {
                        cy_0Array = cy_0Array2;
                        if (callSite != null) break block4;
                        if (cy_0Array == null) break block5;
                    }
                    catch (MatchException matchException) {
                        throw bO.a("c", (Object)matchException, (long)-6759010178046194274L, (long)l);
                    }
                    cy_0Array = cy_0Array2;
                }
                try {
                    n = cy_0Array.length;
                    if (callSite != null) break block6;
                    if (n <= 0) break block5;
                }
                catch (MatchException matchException) {
                    throw bO.a("c", (Object)matchException, (long)-6759010178046194274L, (long)l);
                }
                n = 1;
                break block6;
            }
            n = 0;
        }
        return n != 0;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     */
    public void b(Object[] objectArray) {
        Object object;
        CallSite callSite;
        long l;
        Object object2;
        block32: {
            block33: {
                object2 = objectArray[0];
                l = (Long)objectArray[1];
                l = f ^ l;
                callSite = bO.a("c", (long)-4270558601551714083L, (long)l);
                try {
                    object = object2;
                    if (callSite != null) break block32;
                    if (object != null) break block33;
                }
                catch (MatchException matchException) {
                    throw bO.a("c", (Object)matchException, (long)-4269678608107246830L, (long)l);
                }
                return;
            }
            object = this.b;
        }
        Object object3 = object;
        synchronized (object) {
            block35: {
                Object object4;
                int n;
                HashMap hashMap;
                block34: {
                    hashMap = new HashMap(this.a);
                    int n2 = 0;
                    CallSite callSite2 = bO.a("\u00e3", new ArrayList(bO.a("\u00e3", hashMap, (long)-4277835607626073148L, (long)l)), (long)-4278254534370463811L, (long)l);
                    while (bO.a("\u00e3", (Object)callSite2, (long)-4269830976822559979L, (long)l) != false) {
                        block41: {
                            CallSite callSite3;
                            int n3;
                            int n4;
                            cy_0[] cy_0Array;
                            cy_0[] cy_0Array2;
                            Map.Entry entry;
                            block39: {
                                int n5;
                                block40: {
                                    block37: {
                                        block38: {
                                            entry = (Map.Entry)((Object)bO.a("\u00e3", (Object)callSite2, (long)-4270296324390242194L, (long)l));
                                            cy_0Array2 = (cy_0[])bO.a("\u00e3", (Object)entry, (long)-4277695800568717254L, (long)l);
                                            n5 = 0;
                                            cy_0Array = cy_0Array2;
                                            n4 = cy_0Array.length;
                                            n = 0;
                                            if (callSite != null) break block34;
                                            int n6 = n;
                                            while (n6 < n4) {
                                                block43: {
                                                    block36: {
                                                        block44: {
                                                            cy_0 cy_02 = cy_0Array[n6];
                                                            if (callSite != null) break block43;
                                                            object4 = bO.a("\u00e3", (Object)cy_02, (Object)new Object[0], (long)-4270531249527256821L, (long)l);
                                                            if (callSite != null) break block35;
                                                            break block44;
                                                            catch (MatchException matchException) {
                                                                throw bO.a("c", (Object)matchException, (long)-4269678608107246830L, (long)l);
                                                            }
                                                        }
                                                        try {
                                                            block45: {
                                                                if (object4 == object2) break block36;
                                                                break block45;
                                                                catch (MatchException matchException) {
                                                                    throw bO.a("c", (Object)matchException, (long)-4269678608107246830L, (long)l);
                                                                }
                                                            }
                                                            ++n5;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw bO.a("c", (Object)matchException, (long)-4269678608107246830L, (long)l);
                                                        }
                                                    }
                                                    ++n6;
                                                }
                                                if (callSite == null) continue;
                                            }
                                            n3 = n5;
                                            if (callSite != null) break block37;
                                            try {
                                                if (n3 == cy_0Array2.length) {
                                                    continue;
                                                }
                                                break block38;
                                                catch (MatchException matchException) {
                                                    throw bO.a("c", (Object)matchException, (long)-4269678608107246830L, (long)l);
                                                }
                                            }
                                            catch (MatchException matchException) {
                                                throw bO.a("c", (Object)matchException, (long)-4269678608107246830L, (long)l);
                                            }
                                        }
                                        n2 = 1;
                                        n3 = n5;
                                    }
                                    if (callSite != null) break block39;
                                    try {
                                        block46: {
                                            if (n3 != 0) break block40;
                                            break block46;
                                            catch (MatchException matchException) {
                                                throw bO.a("c", (Object)matchException, (long)-4269678608107246830L, (long)l);
                                            }
                                        }
                                        bO.a("\u00e3", hashMap, (Object)bO.a("\u00e3", (Object)entry, (long)-4278095124416762900L, (long)l), (long)-4270251505974785629L, (long)l);
                                        if (callSite == null) continue;
                                    }
                                    catch (MatchException matchException) {
                                        throw bO.a("c", (Object)matchException, (long)-4269678608107246830L, (long)l);
                                    }
                                }
                                cy_0Array = new cy_0[n5];
                                n3 = 0;
                            }
                            n4 = n3;
                            cy_0[] cy_0Array3 = cy_0Array2;
                            int n7 = cy_0Array3.length;
                            int n8 = 0;
                            while (n8 < n7) {
                                block47: {
                                    block42: {
                                        cy_0 cy_03;
                                        block48: {
                                            cy_03 = cy_0Array3[n8];
                                            if (callSite != null) break block47;
                                            callSite3 = bO.a("\u00e3", (Object)cy_03, (Object)new Object[0], (long)-4270531249527256821L, (long)l);
                                            if (callSite != null) break block41;
                                            break block48;
                                            catch (MatchException matchException) {
                                                throw bO.a("c", (Object)matchException, (long)-4269678608107246830L, (long)l);
                                            }
                                        }
                                        try {
                                            block49: {
                                                if (callSite3 == object2) break block42;
                                                break block49;
                                                catch (MatchException matchException) {
                                                    throw bO.a("c", (Object)matchException, (long)-4269678608107246830L, (long)l);
                                                }
                                            }
                                            cy_0Array[n4++] = cy_03;
                                        }
                                        catch (MatchException matchException) {
                                            throw bO.a("c", (Object)matchException, (long)-4269678608107246830L, (long)l);
                                        }
                                    }
                                    ++n8;
                                }
                                if (callSite == null) continue;
                            }
                            callSite3 = bO.a("\u00e3", hashMap, (Object)((Class)((Object)bO.a("\u00e3", (Object)entry, (long)-4278095124416762900L, (long)l))), (Object)cy_0Array, (long)-4271201457483999625L, (long)l);
                        }
                        if (callSite == null) continue;
                    }
                    n = n2;
                }
                try {
                    if (n != 0) {
                        this.a = hashMap;
                    }
                }
                catch (MatchException matchException) {
                    throw bO.a("c", (Object)matchException, (long)-4269678608107246830L, (long)l);
                }
                object4 = object3;
            }
            // ** MonitorExit[v3] (shouldn't be in output)
            return;
        }
    }

    private static Field c(long l, long l2) {
        int n = bO.a(l, l2);
        Object object = h[n];
        if (object instanceof String) {
            String string = i[n];
            int n2 = string.indexOf(8);
            Class clazz = bO.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = bO.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = bO.a(clazz3, string2, clazz2)) != null) {
                    bO.h[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = bO.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        bO.h[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = bO.b(951641855768759L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public boolean c(Object[] objectArray) {
        Object object;
        block14: {
            cy_0[] cy_0Array;
            CallSite callSite;
            long l;
            Class clazz;
            block11: {
                cy_0[] cy_0Array2;
                block12: {
                    Class clazz2 = (Class)objectArray[0];
                    clazz = (Class)objectArray[1];
                    l = (Long)objectArray[2];
                    l = f ^ l;
                    cy_0Array2 = (cy_0[])bO.a("\u00e3", (Object)this.a, (Object)clazz2, (long)557261074621126853L, (long)l);
                    callSite = bO.a("c", (long)556728570343762911L, (long)l);
                    try {
                        try {
                            cy_0Array = cy_0Array2;
                            if (callSite != null) break block11;
                            if (cy_0Array != null) break block12;
                        }
                        catch (MatchException matchException) {
                            throw bO.a("c", (Object)matchException, (long)557608346334341136L, (long)l);
                        }
                        return false;
                    }
                    catch (MatchException matchException) {
                        throw bO.a("c", (Object)matchException, (long)557608346334341136L, (long)l);
                    }
                }
                cy_0Array = cy_0Array2;
            }
            cy_0[] cy_0Array3 = cy_0Array;
            int n = cy_0Array3.length;
            int n2 = 0;
            while (n2 < n) {
                block13: {
                    block15: {
                        cy_0 cy_02 = cy_0Array3[n2];
                        try {
                            try {
                                try {
                                    if (callSite != null) break block13;
                                    object = bO.a("\u00e3", (Object)clazz, (Object)bO.a("\u00e3", (Object)cy_02, (Object)new Object[0], (long)557899137247005193L, (long)l), (long)556758997936616018L, (long)l);
                                    if (callSite != null) break block14;
                                }
                                catch (MatchException matchException) {
                                    throw bO.a("c", (Object)matchException, (long)557608346334341136L, (long)l);
                                }
                                if (!object) break block15;
                            }
                            catch (MatchException matchException) {
                                throw bO.a("c", (Object)matchException, (long)557608346334341136L, (long)l);
                            }
                            return true;
                        }
                        catch (MatchException matchException) {
                            throw bO.a("c", (Object)matchException, (long)557608346334341136L, (long)l);
                        }
                    }
                    ++n2;
                }
                if (callSite == null) continue;
            }
            object = false;
        }
        return object;
    }

    private static void c(Object[] objectArray) {
        block5: {
            long l;
            Throwable throwable;
            block4: {
                cy_0 cy_02 = (cy_0)objectArray[0];
                throwable = (Throwable)objectArray[1];
                l = (Long)objectArray[2];
                l = f ^ l;
                String string = (String)((Object)bO.a("\u00e3", bO.a("\u00e3", (Object)cy_02, (Object)new Object[0], (long)3362808711757947676L, (long)l).getClass(), (long)3363249164204643974L, (long)l)) + "#" + (String)((Object)bO.a("\u00e3", (Object)bO.a("\u00e3", (Object)cy_02, (Object)new Object[0], (long)3362775969015687480L, (long)l), (long)3366279825747028265L, (long)l));
                CallSite callSite = bO.a("c", (long)3363330566800245450L, (long)l);
                try {
                    try {
                        if (callSite != null) break block4;
                        if (bO.a("\u00e3", (Object)d, (Object)(string + ":" + (String)((Object)bO.a("\u00e3", throwable.getClass(), (long)3363249164204643974L, (long)l))), (long)3366079527727184349L, (long)l) == false) break block5;
                    }
                    catch (MatchException matchException) {
                        throw bO.a("c", (Object)matchException, (long)3361958209064272133L, (long)l);
                    }
                    bO.a("\u00e3", (Object)bO.a("Y", (long)3362636567579688278L, (long)l), (Object)(g + string), (long)3362041864878500061L, (long)l);
                }
                catch (MatchException matchException) {
                    throw bO.a("c", (Object)matchException, (long)3361958209064272133L, (long)l);
                }
            }
            bO.a("\u00e3", (Object)throwable, (long)3364002510555654810L, (long)l);
        }
    }

    private static Method d(long l, long l2) {
        int n = bO.a(l, l2);
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
                clazz3 = bO.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = bO.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = bO.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        bO.h[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = bO.b(951641855768759L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = bO.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        bO.h[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = bO.b(951641855768759L, 0L);
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

    private static boolean d(Object[] objectArray) {
        int n;
        block8: {
            Map map = (Map)objectArray[0];
            Object object = objectArray[1];
            long l = (Long)objectArray[2];
            l = f ^ l;
            CallSite callSite = bO.a("\u00e3", (Object)bO.a("\u00e3", (Object)map, (long)-7440945402063500805L, (long)l), (long)-7440548127187993962L, (long)l);
            CallSite callSite2 = bO.a("c", (long)-7441764813028510497L, (long)l);
            while (bO.a("\u00e3", (Object)callSite, (long)-7440821134299076841L, (long)l) != false) {
                CallSite callSite3 = bO.a("\u00e3", (Object)callSite, (long)-7440302969788406676L, (long)l);
                block5: while (true) {
                    cy_0[] cy_0Array;
                    cy_0[] cy_0Array2 = cy_0Array = (cy_0[])callSite3;
                    int n2 = cy_0Array2.length;
                    n = 0;
                    if (callSite2 != null) break block8;
                    int n3 = n;
                    while (n3 < n2) {
                        block9: {
                            cy_0 cy_02 = cy_0Array2[n3];
                            try {
                                if (callSite2 != null) break block9;
                                callSite3 = bO.a("\u00e3", (Object)cy_02, (Object)new Object[0], (long)-7440402105177516791L, (long)l);
                                if (callSite2 != null) continue block5;
                            }
                            catch (MatchException matchException) {
                                throw bO.a("c", (Object)matchException, (long)-7440674264186570992L, (long)l);
                            }
                            try {
                                if (callSite3 == object) {
                                    return true;
                                }
                            }
                            catch (MatchException matchException) {
                                throw bO.a("c", (Object)matchException, (long)-7440674264186570992L, (long)l);
                            }
                            ++n3;
                        }
                        if (callSite2 == null) continue;
                    }
                    break;
                }
                if (callSite2 == null) continue;
            }
            n = 0;
        }
        return n != 0;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/bO" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = bO.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00f0' || c == '\u00c6' || c == 'Y' || c == '\u00c0') {
                field = bO.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00f0' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00c6' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'Y' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = bO.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e3' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'c' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    public void a(Object[] var1_1) {
        block52: {
            block50: {
                block56: {
                    block48: {
                        var4_2 = var1_1[0];
                        var2_3 = (Long)var1_1[1];
                        var5_4 = (var2_3 = bO.f ^ var2_3) ^ 56241223455158L;
                        var7_5 = bO.a("c", (long)-5144569692025318148L, (long)var2_3);
                        try {
                            if (var4_2 == null) {
                                return;
                            }
                        }
                        catch (Throwable v0) {
                            throw bO.a("c", (Object)v0, (long)-5143619409310607565L, (long)var2_3);
                        }
                        v1 = this.e;
                        if (var7_5 != null) break block56;
                        try {
                            block57: {
                                if (bO.a("\u00e3", (Object)v1, (long)-5151473799688366831L, (long)var2_3) != false) break block48;
                                break block57;
                                catch (Throwable v2) {
                                    throw bO.a("c", (Object)v2, (long)-5143619409310607565L, (long)var2_3);
                                }
                            }
                            return;
                        }
                        catch (Throwable v3) {
                            throw bO.a("c", (Object)v3, (long)-5143619409310607565L, (long)var2_3);
                        }
                    }
                    v1 = var4_2;
                }
                var8_6 = v1.getClass();
                var9_7 = new ArrayList<E>();
                var10_8 = bO.a("\u00e3", var8_6, (long)-5151546881803787639L, (long)var2_3);
                var11_9 = var10_8.length;
                for (var12_11 = 0; var12_11 < var11_9; ++var12_11) {
                    block51: {
                        block49: {
                            var13_13 = var10_8[var12_11];
                            v4 = var13_13;
                            if (var7_5 != null) break block49;
                            try {
                                block58: {
                                    v5 = bO.a("\u00e3", (Object)v4, bP.class, (long)-5145339415714451845L, (long)var2_3);
                                    if (var7_5 != null) break block50;
                                    break block58;
                                    catch (Throwable v6) {
                                        throw bO.a("c", (Object)v6, (long)-5143619409310607565L, (long)var2_3);
                                    }
                                }
                                if (v5 == false) {
                                    continue;
                                }
                            }
                            catch (Throwable v7) {
                                throw bO.a("c", (Object)v7, (long)-5143619409310607565L, (long)var2_3);
                            }
                            v4 = var13_13;
                        }
                        var14_14 = bO.a("\u00e3", (Object)v4, (long)-5143276162549236342L, (long)var2_3);
                        if (var7_5 != null) ** GOTO lbl65
                        try {
                            if (var14_14.length != 1) {
                                continue;
                            }
                            break block51;
                            catch (Throwable v8) {
                                throw bO.a("c", (Object)v8, (long)-5143619409310607565L, (long)var2_3);
                            }
                        }
                        catch (Throwable v9) {
                            throw bO.a("c", (Object)v9, (long)-5143619409310607565L, (long)var2_3);
                        }
                    }
                    try {
                        bO.a("\u00e3", (Object)var13_13, (boolean)true, (long)-5143446752073079487L, (long)var2_3);
lbl65:
                        // 2 sources

                        try {
                            v10 = bO.d(-5145262826114188782L, var2_3).invoke(null, bO.b());
                        }
                        catch (InvocationTargetException v11) {
                            throw v11.getTargetException();
                        }
                        try {
                            v12 = bO.d(-5151365940416489230L, var2_3).invoke(v10, bO.a(var13_13));
                        }
                        catch (InvocationTargetException v13) {
                            throw v13.getTargetException();
                        }
                        try {
                            v14 = bO.d(-5144917523165871645L, var2_3).invoke(v12, bO.a(var4_2));
                        }
                        catch (InvocationTargetException v15) {
                            throw v15.getTargetException();
                        }
                        try {
                            v16 = (cy_0[])bO.d(-5151193557108927647L, var2_3).invoke(v14, bO.a(bO.c));
                        }
                        catch (InvocationTargetException v17) {
                            throw v17.getTargetException();
                        }
                        var15_15 = v16;
                        bO.a("\u00e3", var9_7, (Object)new cy_0((Method)var13_13, var4_2, (Class)var14_14[0], (MethodHandle)var15_15), (long)-5151053730615678777L, (long)var2_3);
                        continue;
                    }
                    catch (Throwable var15_16) {
                        // empty catch block
                    }
                    if (var7_5 == null) continue;
                }
                v5 = bO.a("\u00e3", var9_7, (long)-5143835661054297273L, (long)var2_3);
            }
            try {
                if (var7_5 == null) {
                    if (v5 == false) break block52;
                }
                ** GOTO lbl114
            }
            catch (Throwable v18) {
                throw bO.a("c", (Object)v18, (long)-5143619409310607565L, (long)var2_3);
            }
            return;
        }
        var10_8 = this.b;
        synchronized (var10_8) {
            block53: {
                block60: {
                    block59: {
                        v19 = this.a;
                        if (var7_5 != null) break block59;
                        v20 = new Object[3];
                        v20[2] = var5_4;
                        v20[1] = var4_2;
                        v20[0] = v19;
                        v5 = bO.a("c", (Object)v20, (long)-5151878732684474004L, (long)var2_3);
lbl114:
                        // 2 sources

                        if (v5 == false) break block60;
                        v19 = var10_8;
                    }
                    // ** MonitorExit[v19] (shouldn't be in output)
                    return;
                }
                var11_10 = new HashMap<K, V>(this.a);
                var12_12 = bO.a("\u00e3", var9_7, (long)-5151610072080679716L, (long)var2_3);
                while (bO.a("\u00e3", (Object)var12_12, (long)-5143181340281518284L, (long)var2_3) != false) {
                    block55: {
                        block54: {
                            var13_13 = (cy_0)bO.a("\u00e3", (Object)var12_12, (long)-5143708266928126897L, (long)var2_3);
                            var14_14 = (cy_0[])bO.a("\u00e3", var11_10, (Object)bO.a("\u00e3", (Object)var13_13, (Object)new Object[0], (long)-5143161643989135594L, (long)var2_3), (long)-5145084059721898010L, (long)var2_3);
                            v21 = var14_14;
                            if (var7_5 != null) break block53;
                            try {
                                block61: {
                                    if (var7_5 != null) break block54;
                                    break block61;
                                    catch (Throwable v22) {
                                        throw bO.a("c", (Object)v22, (long)-5143619409310607565L, (long)var2_3);
                                    }
                                }
                                if (v21 == null) {
                                }
                                ** GOTO lbl142
                            }
                            catch (Throwable v23) {
                                throw bO.a("c", (Object)v23, (long)-5143619409310607565L, (long)var2_3);
                            }
                            var15_15 = new cy_0[]{var13_13};
                            try {
                                if (var7_5 == null) break block55;
lbl142:
                                // 2 sources

                                v24 = new cy_0[var14_14.length + 1];
                            }
                            catch (Throwable v25) {
                                throw bO.a("c", (Object)v25, (long)-5143619409310607565L, (long)var2_3);
                            }
                        }
                        var15_15 = v24;
                        bO.a("c", (Object)var14_14, (int)0, (Object)var15_15, (int)0, (int)var14_14.length, (long)-5144042604971478817L, (long)var2_3);
                        var15_15[var14_14.length] = var13_13;
                    }
                    bO.a("\u00e3", var11_10, (Object)bO.a("\u00e3", (Object)var13_13, (Object)new Object[0], (long)-5143161643989135594L, (long)var2_3), (Object)var15_15, (long)-5145194983705580970L, (long)var2_3);
                    if (var7_5 == null) continue;
                }
                this.a = var11_10;
                v21 = var10_8;
            }
            // ** MonitorExit[v21] (shouldn't be in output)
            return;
        }
    }

    private static Object[] a(Object object, Object object2) {
        return new Object[]{object, object2};
    }

    private static Object[] a(Object object) {
        return new Object[]{object};
    }

    private static void a() {
        Object[] objectArray = h;
        h[0] = "5R\u001e^Hk>]\u000f\u0011%k>@\u001b";
        objectArray[1] = "\u000bVN\u00153k\u0000Y_ZNs\u0013^V\u0013";
        objectArray[2] = "[w1:~WMw4`m@Z<7faTK{ q*Fw";
        objectArray[3] = "\u001a\n-xKio*&wZ&\u001225pSoz";
        objectArray[4] = ",V[{k\u0018'YJ4\u0016\r5CHw";
        objectArray[5] = "(OM,\u001eU-\u0000k?YR6}O?U]/";
        objectArray[6] = "G\u0005\u0016\r3|L\n\u0007BIx_\u000b\u0017\r\u007f|H";
        objectArray[7] = Void.TYPE;
        bO.i[7] = "java/lang/Void";
        objectArray[8] = "F~K~2]P~N$!JG5M\"-^VrZ5fN[";
        objectArray[9] = "mc|m\u0013Z\u0018Cwb\u0002\u0015yM|i\u0006O\r";
        objectArray[10] = "\u007fK/jEStD>%\u0019ZsF<h\u001f\u0011XO-c\u0004[";
        objectArray[11] = "::\u0001|eT,:\u0004&vC;q\u0007 zW*6\u001071F\u0011";
        objectArray[12] = " \u0018z\bg.>\u0010`G\u001a>>";
        objectArray[13] = "GRel@XL]t#!VGVpy";
        objectArray[14] = Boolean.TYPE;
        bO.i[14] = "java/lang/Boolean";
        objectArray[15] = "\u0016>$?H<c\u001e/0Ys\u0002\u0010$;])v";
        objectArray[16] = "|{h\u0018LwbsrW+vsh\u007f\r\rp";
        objectArray[17] = "PDBVO.[KS\u0019\b,LJ_RO\u000f_Q\\X\u0005\n[KP[\u0004";
        objectArray[18] = Integer.TYPE;
        bO.i[18] = "java/lang/Integer";
        objectArray[19] = "\u001a'UR\u0011v\u0011(D\u001dVt\u0006)HV\u0011W\u00152K\\[R\u0011(G_Zi";
        objectArray[20] = "|\u0010\bR+\u0014w\u001f\u0019\u001dl\u0016`\u001e\u0015V+5s\u0005\u0016\\a0w\u001f\u001a_`\u000b2=\u0011\\n\rf";
        objectArray[21] = "~*[\n\u0002\fu%JEE\u000eb$F\u000e\u0002-q?E\u0004H4m;H";
        objectArray[22] = ");\u001cL@Z73\u0006\u0003#N3";
        objectArray[23] = "\u000f03\u000fu \u00118)@\u0017<\u0016%";
        objectArray[24] = "\u001aJg;_Rojl4N\u001d\u0002jl)Z\b";
        objectArray[25] = "h\u0014;\u0016Ro\u001d40\u0019C A=7\u001bAmGv\u001c\u0012Pf\\<j";
        objectArray[26] = "~\u0017MeOW`\u001fW*\u0002Mz\u0015Nv\u0013Gz\u0002\u0015G\u000eRm9US\u0013K`\u0013zv\u0013Cm:Rw\u0015";
        objectArray[27] = "\u00023!KR\rw\u0013*DCB\u0016\u001d!OG\u0018b";
        objectArray[28] = "&5X\fI\u0018S\u0015S\u0003XW2\u001bX\b\\\rF";
        objectArray[29] = "Z|Ze,KQsK*THYy";
        objectArray[30] = "z\f\u0003\u0015D#d\u0004\u0019Z\t9~\u000e\u0000\u0006\u00183~\u0019[7\u00058s\u0018\u0007\u0006\u000f8d%\u0014\u0007\u0002\u001bq\u001d";
        objectArray[31] = "\u0005Vd\rMG\u001b^~B\u0000]\u0001Tg\u001e\u0011W\u0001C</\f\\\fB`\u001e\u0006\\\u001b\u007fs\u001f\u000b\u007f\u000eG6'\u0006K<Rf:\nW\u0018";
        objectArray[32] = "\u0004[;M\u001dN\u001aS!\u0002pT\u0002V(OGR\u0001T";
        objectArray[33] = "*M#^@\u000f4E9\u0011#\u001b0\b\u0010Q\u001a\b9";
        objectArray[34] = "=d _OU#l:\u0010 R%d/r\bS#";
        objectArray[35] = "\u0014;uj~\u007fa\u001b~eo0\u0000\u0015unkjt";
        objectArray[36] = "]\u0018YGTi(8RHE&I6YCA|=";
        objectArray[37] = "\rV\u0019nEZxv\u0012aT\u0015\u0019x\u0019jPOm";
        objectArray[38] = "p\nEW?mmR\u00021>ijr\u0012T<\u0004mZ\u0011O<\u007f)\u000e\u00111";
        objectArray[39] = "['\u007fK'\r\u0011&~\u0005C\u0000a'$\u0002 \u0013\nx.S!j";
        objectArray[40] = "7m`u:2*5'\u00135 \u00105%o==:>^\"81,c3\"8g7Some:3:%-&&Q";
        objectArray[41] = "(\u001d\u0000\u001aflj\u0014\u0018\u001dZyn\u0016\u0007\u001a\u0001}}\u001c\u0002: h\u007f\u001aaZ'}r\n\u000b\u0014 0sw";
        objectArray[42] = "K\u000f\u000b#$8Y\bXuE)A\u0007W\u0019\"C\u0011\rQ8u.\u0011\r\u0007#E(NQ]$>:I\u0002\u000bE";
        objectArray[43] = ".F{\u0004<tdGzJXz\u0014\u0005tJcco\u0012%\u0018:\u0013%\u0002z\u0017:zoB9\u000bX";
        objectArray[44] = "`W}jt}n\\e=\u0005!$wr4b<6Bu5c\u0018%So?c<_X*lc.6Er+\u0005q!\u000fu0l;aLiR";
        objectArray[45] = "\u001e)\u0002cN\u0013\u0013.\u0010uu\u0015\u0015'\u0018l\rq\u001f!\u001di\n\u001f\u0017!\u0001tu";
        objectArray[46] = "J\u0003AW\u000e,E\u000eJ\fqiY\u001d,Z\u001d{YQAZ\u001d-Ba\u001d\u0007\u001bl\u0014\f\u001d\u0007Mw$P@\u0001\f!IP@W\u0017\u0011";
        objectArray[47] = "\u000f@&d\\W\u0000M-?#\u0005\f^KiO\u0000\u001c\u0012&iOV\u0007\"z4I\u0017QOz4\u001f\fa";
        objectArray[48] = "u\r\u0018N\u0010%z\u0000\u0013\u0015ofr\u000b\b\u001f\u0014\u0018~\u0017\u001b\u000eP %P\rNo";
        objectArray[49] = "\u001e\u0000\u001f\u00025n\u0010\u000b\u0007UD<L\u0015.S>:D\u0004\nW>\u000fP\u0011\u001bAD3\u001aRGY{-J\u0002F:";
        objectArray[50] = "e%`\u00139\u0005w:b\u0015_\u0017f<\u001e\u0006/\u000b\u000fv&Z>\u0015f<f\u0019\"w";
        objectArray[51] = "`\u007fLeQ\u0000dk\u0018oj\u0019]xH=Q\u0000&o\u0019o\bp;?Ig\u0004\u0019&g\u000e\u0001";
        objectArray[52] = "XYwgb&\u001dYrr]wg\u001f%o!\"\n],w&\u001e[I.ras\u0019@6u]";
        objectArray[53] = "cK4;\u0019<g\u000f<0`$\"R<|\u0004:XH4j\u001e1#\f`j``%O<}\n.\"\u0002=\u0000";
        objectArray[54] = "\u0006)B 8A]nT`\u0007\u0018\u001f<V5{\u001e\u0019QF>?\u0001\u0005#T!=\u0007c";
        objectArray[55] = "=H\u000ftTq3C\u0017#%7o]/'N!yZ\u0007&A!\u0002\u0010\u0018}D.kZX>XL>\\\u001a*X&p[W+%";
        objectArray[56] = "m\u0004\u0004qZ\u007fi\u0010P{afP\u0003\u0000)Z\u007f+\u0014Q{\u0003\u000fa\u0016UhQba\u0016\u0003sa";
        objectArray[57] = "X4\u001ev<#L7\u0011q\f8L\u0014\u0006kp(7h\u001d\"m;^\"]aqY";
        objectArray[58] = "U:\rRPX\fdVP3og\u0006\"nU\r\b8\u0001\u0007HUO";
        objectArray[59] = "U\u001b<+\u00076G\u0004>-a\"R\txSP(U\u00044>P(\u0003\u001f\u0004";
        objectArray[60] = "@.Uf\u001fjO#^=`-C)_$\rW\u001f R'P:\u001f \u0004<`fB&Ej\rfBp^Z";
        objectArray[61] = "%J_\u001a\u0013\u0019\"C\b\u0019-\u0014d_b\u0018U\u0017%\\\u0002\u001c\u0011\u001f.";
        objectArray[62] = "\u0007V],IS\u0000_\n/wZFC\td\u001cTDH`$\u001bYA\t\r$\u001b\u000fZ9\f)JQG\u0006\u0001q\n\f<\b\f\u007f\n\u0003Q\b\f)\u00113P\u0005]w\f\f]]\u001d*w_\u0000\u0004\u0002nHRXD_\u0015KN@_\u001d\u007f\u0005I\r^`";
        objectArray[63] = "?s\r.k\u001e;gY$P\u0007\u0002t\tvk\u001eycX$2n=d_r!S3oG%P";
        objectArray[64] = "d\ty@(bk\u0004r\u001bW2l\u0017n\r\f2vk$\u001c9g7\u0000iA'?\n";
        objectArray[65] = "|Vc\t@7nQ0_!%ld\"\u0017LLy\u0005h\u0001\u001c<z\u0004\"\t!'y\b5\u000eZ5~[co";
        objectArray[66] = "hQQK)\u0014q\u0018Z\u0002H\u0018`_t\u001a,\n`#\u001b\u001f\"\n=N\u001b\u001ft\u0011\r";
        objectArray[67] = "l\u0016eb;Ex\u0015je\u000bVo\u0017\u00186gU~Ku6g\u0003e{)y:^a\u0012c9yB\u0003";
        objectArray[68] = "\\\u0010MrKrAH\n\u0014JvFb\u001e\u007fAr@C\u001fQHgZI\u001fo%{WD\u0002}\u001d#\u0004M\u0018\u0014";
        objectArray[69] = ")JT>D5t\u0016\u001a=%=36\r\u007fY-HJ\u00166D>!\u0000VuX\\";
        objectArray[70] = "C%Y!K;K%E<4(H>R7P8E8?f]<\u00165\u0002hV$ADT7\u00043O?F0We.";
        objectArray[71] = "E<?HnC\u0000<:]Q\u0010z?8\u001dj\u000b\u0001(iO3{F;{G,\u0011\b<6FQ";
        objectArray[72] = "J}\u0014!g8DhX&\n Dr+\"{\u001dDqh+i'Vd\u0004w:$[\r";
        objectArray[73] = "<Bx.\b[2I`yy\tnWW\u007f\u001c\u000b\u0003P\u007f|\u0007\u000bx\u0014+|y";
        objectArray[74] = "\u0012v\u0010^7o\u001e;XPZb\t+\u0013U&d\u000fF\u0003^b{\u00134\u0011A`}u";
        objectArray[75] = "=|q B3)\u007f~'r(.|v,\u000e.(\u0011f'J14ct8H7R";
        objectArray[76] = "\u0018\u001a,UZX\u0001S'\u001c;T\u0010\u0014\u0014\u0000J;L\u0004=\u0010\u000bVL\u0004k\u000b;";
        objectArray[77] = ":'I]%\u0004>3\u001dW\u001e\u001d\u0007 M\u0005%\u0004|7\u001cW|tl7B_\u007f\u000f~0\u0011\t\u001e";
        objectArray[78] = "v\u001c\"}<0;A<%\u00012*\u0010Ltm1;L!tmg |};0:$\u00157{s&F";
        objectArray[79] = "\u0007wL\u0017\u001bxBwI\u0002$,8tKB\u001f0Cc\u001a\u0010F@\tsE\u001fF)C3\u0006\u0003$";
        Object[] objectArray2 = objectArray;
        objectArray[80] = "KBQ\b\u0016SHC\u001b\u0000+FH\u0003\n\u0001G\u007fT\u0007\u0007fM\u001d\u001b\u0019\u0004\u000fPE\\\u007f\fX\u0015EK\u0016\u0011\u0000R#KBQ\b\u0016SHC\u001b\u0000+";
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    /*
     * Loose catch block
     */
    public boolean a(Object[] objectArray) {
        cy_0[] cy_0Array;
        CallSite callSite;
        long l;
        long l2;
        aH aH2;
        block7: {
            cy_0[] cy_0Array2;
            block8: {
                aH2 = (aH)objectArray[0];
                l2 = (Long)objectArray[1];
                l = (l2 = f ^ l2) ^ 0x2F53A4B34FA4L;
                cy_0Array2 = (cy_0[])bO.a("\u00e3", (Object)this.a, aH2.getClass(), (long)1197843407950499809L, (long)l2);
                callSite = bO.a("c", (long)1197311444840463611L, (long)l2);
                cy_0Array = cy_0Array2;
                if (callSite != null) break block7;
                try {
                    block9: {
                        if (cy_0Array != null) break block8;
                        break block9;
                        catch (Throwable throwable) {
                            throw bO.a("c", (Object)throwable, (long)1196079617355693876L, (long)l2);
                        }
                    }
                    return (boolean)bO.a("\u00e3", (Object)aH2, (Object)new Object[0], (long)1197577484496823586L, (long)l2);
                }
                catch (Throwable throwable) {
                    throw bO.a("c", (Object)throwable, (long)1196079617355693876L, (long)l2);
                }
            }
            cy_0Array = cy_0Array2;
        }
        for (cy_0 cy_02 : cy_0Array) {
            try {
                bO.a("\u00e3", (Object)cy_02, (Object)new Object[0], (long)1190985864033524970L, (long)l2).invokeExact(aH2);
                continue;
            }
            catch (Throwable throwable) {
                Object[] objectArray2 = new Object[3];
                objectArray2[2] = l;
                objectArray2[1] = throwable;
                objectArray2[0] = cy_02;
                bO.a("c", (Object)objectArray2, (long)1190529159084451474L, (long)l2);
            }
            if (callSite == null) continue;
        }
        return (boolean)bO.a("\u00e3", (Object)aH2, (Object)new Object[0], (long)1197577484496823586L, (long)l2);
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
            case 0 -> 24;
            case 1 -> 45;
            case 2 -> 7;
            case 3 -> 42;
            case 4 -> 6;
            case 5 -> 43;
            case 6 -> 32;
            case 7 -> 18;
            case 8 -> 31;
            case 9 -> 59;
            case 10 -> 5;
            case 11 -> 28;
            case 12 -> 61;
            case 13 -> 50;
            case 14 -> 15;
            case 15 -> 10;
            case 16 -> 30;
            case 17 -> 46;
            case 18 -> 60;
            case 19 -> 56;
            case 20 -> 2;
            case 21 -> 8;
            case 22 -> 20;
            case 23 -> 38;
            case 24 -> 3;
            case 25 -> 62;
            case 26 -> 11;
            case 27 -> 35;
            case 28 -> 36;
            case 29 -> 63;
            case 30 -> 54;
            case 31 -> 51;
            case 32 -> 49;
            case 33 -> 23;
            case 34 -> 53;
            case 35 -> 52;
            case 36 -> 21;
            case 37 -> 44;
            case 38 -> 37;
            case 39 -> 34;
            case 40 -> 9;
            case 41 -> 4;
            case 42 -> 58;
            case 43 -> 33;
            case 44 -> 40;
            case 45 -> 1;
            case 46 -> 48;
            case 47 -> 17;
            case 48 -> 14;
            case 49 -> 22;
            case 50 -> 29;
            case 51 -> 27;
            case 52 -> 25;
            case 53 -> 55;
            case 54 -> 41;
            case 55 -> 13;
            case 56 -> 39;
            case 57 -> 0;
            case 58 -> 26;
            case 59 -> 16;
            case 60 -> 19;
            case 61 -> 57;
            case 62 -> 12;
            default -> 47;
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
        bO.i[n3] = new String(cArray);
        return n3;
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

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(bO.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


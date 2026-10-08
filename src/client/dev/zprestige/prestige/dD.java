/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_243
 *  net.minecraft.class_2886
 *  net.minecraft.class_310
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.U;
import dev.zprestige.prestige.a5;
import dev.zprestige.prestige.a6;
import dev.zprestige.prestige.bG;
import dev.zprestige.prestige.bI;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.bd_0;
import dev.zprestige.prestige.bf_0;
import dev.zprestige.prestige.bh_0;
import dev.zprestige.prestige.cz_0;
import dev.zprestige.prestige.dC;
import dev.zprestige.prestige.dE;
import dev.zprestige.prestige.dF;
import dev.zprestige.prestige.dV;
import dev.zprestige.prestige.eQ;
import dev.zprestige.prestige.hc;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import net.minecraft.class_243;
import net.minecraft.class_2886;
import net.minecraft.class_310;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class dD
implements cz_0 {
    private final CopyOnWriteArrayList a;
    private dC c;
    private dC d;
    private dC e;
    private static float f;
    private static float g;
    private dC h;
    private boolean i;
    private Object j;
    private dC k;
    private Object l;
    private final List m;
    private static final long n;
    private static final Object[] o;
    private static final String[] p;

    public dD(long l) {
        long l2 = (l = n ^ l) ^ 0x6BBAFC657D0AL;
        this.a = new CopyOnWriteArrayList();
        this.h = null;
        this.m = new CopyOnWriteArrayList();
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = this;
        dD.a("k", (Object)dD.a("\u00f8", (long)-5476333131099432936L, (long)l), (Object)objectArray, (long)-5467811635432022993L, (long)l);
    }

    static {
        n = hc.a(-3085609967894908122L, -5110817775030412142L, MethodHandles.lookup().lookupClass()).a(60737145149942L);
        o = new Object[91];
        p = new String[91];
        dD.a();
        f = 300.0f;
        g = 90.0f;
    }

    public void e(Object[] objectArray) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        long l;
        block4: {
            block5: {
                dF dF2 = (dF)objectArray[0];
                l = (Long)objectArray[1];
                l = n ^ l;
                CallSite callSite = dD.a("s", (long)-3805353912348999183L, (long)l);
                try {
                    try {
                        copyOnWriteArrayList = this.a;
                        if (callSite != null) break block4;
                        if (dD.a("k", (Object)copyOnWriteArrayList, (Object)dF2, (long)-3803984747911823705L, (long)l) != false) break block5;
                    }
                    catch (MatchException matchException) {
                        throw dD.a("s", (Object)matchException, (long)-3803878455548298685L, (long)l);
                    }
                    return;
                }
                catch (MatchException matchException) {
                    throw dD.a("s", (Object)matchException, (long)-3803878455548298685L, (long)l);
                }
            }
            copyOnWriteArrayList = this.a;
        }
        dD.a("k", (Object)copyOnWriteArrayList, (Object)dD.a("k", (Object)dD.a("s", dF::a, (long)-3803368428889839845L, (long)l), (long)-3803717761757351386L, (long)l), (long)-3806106408338326101L, (long)l);
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (p[n3] != null) {
            return n3;
        }
        Object object = o[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 51;
            case 1 -> 57;
            case 2 -> 48;
            case 3 -> 45;
            case 4 -> 5;
            case 5 -> 39;
            case 6 -> 30;
            case 7 -> 60;
            case 8 -> 41;
            case 9 -> 37;
            case 10 -> 20;
            case 11 -> 14;
            case 12 -> 6;
            case 13 -> 59;
            case 14 -> 0;
            case 15 -> 3;
            case 16 -> 31;
            case 17 -> 18;
            case 18 -> 42;
            case 19 -> 7;
            case 20 -> 50;
            case 21 -> 54;
            case 22 -> 53;
            case 23 -> 56;
            case 24 -> 11;
            case 25 -> 28;
            case 26 -> 62;
            case 27 -> 12;
            case 28 -> 2;
            case 29 -> 38;
            case 30 -> 35;
            case 31 -> 17;
            case 32 -> 55;
            case 33 -> 44;
            case 34 -> 26;
            case 35 -> 43;
            case 36 -> 19;
            case 37 -> 25;
            case 38 -> 32;
            case 39 -> 23;
            case 40 -> 61;
            case 41 -> 8;
            case 42 -> 22;
            case 43 -> 29;
            case 44 -> 4;
            case 45 -> 58;
            case 46 -> 9;
            case 47 -> 36;
            case 48 -> 46;
            case 49 -> 16;
            case 50 -> 33;
            case 51 -> 49;
            case 52 -> 15;
            case 53 -> 63;
            case 54 -> 21;
            case 55 -> 24;
            case 56 -> 27;
            case 57 -> 13;
            case 58 -> 47;
            case 59 -> 10;
            case 60 -> 34;
            case 61 -> 52;
            case 62 -> 40;
            default -> 1;
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
        dD.p[n3] = new String(cArray);
        return n3;
    }

    public void i(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        l = dD.n ^ l;
        dD.a("k", (Object)this.m, (Object)new dE(this, n), (long)-1575329030456709027L, (long)l);
    }

    public synchronized boolean b(Object[] objectArray) {
        int n;
        block29: {
            block28: {
                dD dD2;
                long l;
                block27: {
                    Object object;
                    Object object2;
                    block25: {
                        CallSite callSite;
                        block26: {
                            dD dD3;
                            block23: {
                                Object object3;
                                long l2;
                                block21: {
                                    block22: {
                                        object2 = objectArray[0];
                                        l = (Long)objectArray[1];
                                        l2 = (l = dD.n ^ l) ^ 0x6E0B8382592BL;
                                        callSite = dD.a("s", (long)1900388198996463774L, (long)l);
                                        try {
                                            block20: {
                                                try {
                                                    try {
                                                        if (object2 == null) break block20;
                                                        object3 = this.k;
                                                        if (callSite != null) break block21;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw dD.a("s", (Object)matchException, (long)1899052886961482540L, (long)l);
                                                    }
                                                    if (object3 != null) break block22;
                                                }
                                                catch (MatchException matchException) {
                                                    throw dD.a("s", (Object)matchException, (long)1899052886961482540L, (long)l);
                                                }
                                            }
                                            return false;
                                        }
                                        catch (MatchException matchException) {
                                            throw dD.a("s", (Object)matchException, (long)1899052886961482540L, (long)l);
                                        }
                                    }
                                    try {
                                        dD3 = this;
                                        if (callSite != null) break block23;
                                        object3 = dD3.l;
                                    }
                                    catch (MatchException matchException) {
                                        throw dD.a("s", (Object)matchException, (long)1899052886961482540L, (long)l);
                                    }
                                }
                                try {
                                    block24: {
                                        try {
                                            try {
                                                if (object3 != dD.a("P", (Object)b, (long)1898549995495762222L, (long)l)) break block24;
                                                object = this;
                                                if (callSite != null) break block25;
                                            }
                                            catch (MatchException matchException) {
                                                throw dD.a("s", (Object)matchException, (long)1899052886961482540L, (long)l);
                                            }
                                            Object[] objectArray2 = new Object[1];
                                            objectArray2[0] = l2;
                                            if (dD.a("k", (Object)object, (Object)objectArray2, (long)1893424413467256728L, (long)l) != false) break block26;
                                        }
                                        catch (MatchException matchException) {
                                            throw dD.a("s", (Object)matchException, (long)1899052886961482540L, (long)l);
                                        }
                                    }
                                    dD3 = this;
                                }
                                catch (MatchException matchException) {
                                    throw dD.a("s", (Object)matchException, (long)1899052886961482540L, (long)l);
                                }
                            }
                            dD.a("k", (Object)dD3, (Object)new Object[0], (long)1892686298311610489L, (long)l);
                        }
                        try {
                            dD2 = this;
                            if (callSite != null) break block27;
                            object = dD2.j;
                        }
                        catch (MatchException matchException) {
                            throw dD.a("s", (Object)matchException, (long)1899052886961482540L, (long)l);
                        }
                    }
                    try {
                        if (object != object2) break block28;
                        dD2 = this;
                    }
                    catch (MatchException matchException) {
                        throw dD.a("s", (Object)matchException, (long)1899052886961482540L, (long)l);
                    }
                }
                try {
                    if (dD2.k == null) break block28;
                    n = 1;
                    break block29;
                }
                catch (MatchException matchException) {
                    throw dD.a("s", (Object)matchException, (long)1899052886961482540L, (long)l);
                }
            }
            n = 0;
        }
        return n != 0;
    }

    public dC b(Object[] objectArray) {
        return this.d;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = dD.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'P' || c == '\u00ce' || c == '\u00f8' || c == '\u00f2') {
                field = dD.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'P' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ce' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00f8' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = dD.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'k' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 's' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public void b(Object[] objectArray) {
        this.c = null;
        this.h = null;
    }

    public synchronized void c(Object[] objectArray) {
        block9: {
            dD dD2;
            long l;
            block10: {
                Object object;
                Object object2;
                block8: {
                    object2 = objectArray[0];
                    l = (Long)objectArray[1];
                    l = n ^ l;
                    CallSite callSite = dD.a("s", (long)5665408361290269790L, (long)l);
                    try {
                        try {
                            try {
                                object = object2;
                                if (callSite != null) break block8;
                                if (object == null) break block9;
                            }
                            catch (MatchException matchException) {
                                throw dD.a("s", (Object)matchException, (long)5664068827319615468L, (long)l);
                            }
                            dD2 = this;
                            if (callSite != null) break block10;
                        }
                        catch (MatchException matchException) {
                            throw dD.a("s", (Object)matchException, (long)5664068827319615468L, (long)l);
                        }
                        object = dD2.j;
                    }
                    catch (MatchException matchException) {
                        throw dD.a("s", (Object)matchException, (long)5664068827319615468L, (long)l);
                    }
                }
                try {
                    if (object != object2) break block9;
                    dD2 = this;
                }
                catch (MatchException matchException) {
                    throw dD.a("s", (Object)matchException, (long)5664068827319615468L, (long)l);
                }
            }
            dD.a("k", (Object)dD2, (Object)new Object[0], (long)5657706636645991609L, (long)l);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean c(Object[] objectArray) {
        CallSite callSite;
        CallSite callSite2;
        long l;
        block33: {
            block34: {
                CallSite callSite3;
                block32: {
                    block31: {
                        class_310 class_3102;
                        block30: {
                            block29: {
                                l = (Long)objectArray[0];
                                l = n ^ l;
                                callSite2 = dD.a("s", (long)-1813668870202282987L, (long)l);
                                try {
                                    try {
                                        class_3102 = b;
                                        if (callSite2 != null) break block29;
                                        if (dD.a("P", (Object)class_3102, (long)-1813846013260086495L, (long)l) == null) return false;
                                    }
                                    catch (MatchException matchException) {
                                        throw dD.a("s", (Object)matchException, (long)-1814440819983444057L, (long)l);
                                    }
                                    class_3102 = b;
                                }
                                catch (MatchException matchException) {
                                    throw dD.a("s", (Object)matchException, (long)-1814440819983444057L, (long)l);
                                }
                            }
                            try {
                                try {
                                    if (callSite2 != null) break block30;
                                    if (dD.a("P", (Object)class_3102, (long)-1814383218242628187L, (long)l) == null) return false;
                                }
                                catch (MatchException matchException) {
                                    throw dD.a("s", (Object)matchException, (long)-1814440819983444057L, (long)l);
                                }
                                class_3102 = b;
                            }
                            catch (MatchException matchException) {
                                throw dD.a("s", (Object)matchException, (long)-1814440819983444057L, (long)l);
                            }
                        }
                        try {
                            try {
                                try {
                                    Object object = dD.a("k", (Object)dD.a("P", (Object)class_3102, (long)-1813846013260086495L, (long)l), (long)-1814725232971599957L, (long)l);
                                    if (callSite2 != null) return object;
                                    if (object) return false;
                                }
                                catch (MatchException matchException) {
                                    throw dD.a("s", (Object)matchException, (long)-1814440819983444057L, (long)l);
                                }
                                if (dD.a("k", (Object)b, (long)-1815141954745360752L, (long)l) == dD.a("P", (Object)b, (long)-1813846013260086495L, (long)l)) break block31;
                                return false;
                            }
                            catch (MatchException matchException) {
                                throw dD.a("s", (Object)matchException, (long)-1814440819983444057L, (long)l);
                            }
                        }
                        catch (MatchException matchException) {
                            throw dD.a("s", (Object)matchException, (long)-1814440819983444057L, (long)l);
                        }
                    }
                    try {
                        callSite3 = dD.a("\u00f8", (long)-1814569339012402926L, (long)l);
                        if (callSite2 != null) break block32;
                        if (callSite3 == null) return true;
                    }
                    catch (MatchException matchException) {
                        throw dD.a("s", (Object)matchException, (long)-1814440819983444057L, (long)l);
                    }
                    callSite3 = dD.a("\u00f8", (long)-1814569339012402926L, (long)l);
                }
                try {
                    try {
                        callSite = dD.a("k", (Object)callSite3, (long)-1816125242092567771L, (long)l);
                        if (callSite2 != null) break block33;
                        if (callSite != null) break block34;
                        return true;
                    }
                    catch (MatchException matchException) {
                        throw dD.a("s", (Object)matchException, (long)-1814440819983444057L, (long)l);
                    }
                }
                catch (MatchException matchException) {
                    throw dD.a("s", (Object)matchException, (long)-1814440819983444057L, (long)l);
                }
            }
            callSite = dD.a("k", (Object)dD.a("\u00f8", (long)-1814569339012402926L, (long)l), (long)-1816125242092567771L, (long)l);
        }
        CallSite callSite4 = dD.a("k", (Object)callSite, (long)-1816448580105441392L, (long)l);
        do {
            Object object;
            block35: {
                if (dD.a("k", (Object)callSite4, (long)-1814908570469901985L, (long)l) == false) return true;
                dV dV2 = (dV)((Object)dD.a("k", (Object)callSite4, (long)-1815352053115028257L, (long)l));
                try {
                    try {
                        boolean bl;
                        try {
                            bl = dV2 instanceof eQ;
                            if (callSite2 != null) return bl;
                            if (callSite2 != null) break block35;
                        }
                        catch (MatchException matchException) {
                            throw dD.a("s", (Object)matchException, (long)-1814440819983444057L, (long)l);
                        }
                        if (!bl) continue;
                    }
                    catch (MatchException matchException) {
                        throw dD.a("s", (Object)matchException, (long)-1814440819983444057L, (long)l);
                    }
                    object = dD.a("k", (Object)dV2, (long)-1814653543408023367L, (long)l);
                }
                catch (MatchException matchException) {
                    throw dD.a("s", (Object)matchException, (long)-1814440819983444057L, (long)l);
                }
            }
            try {
                if (callSite2 != null) return (boolean)object;
                if (object == false) continue;
                return 0 != 0;
            }
            catch (MatchException matchException) {
                throw dD.a("s", (Object)matchException, (long)-1814440819983444057L, (long)l);
            }
        } while (callSite2 == null);
        return true;
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public dC c(Object[] objectArray) {
        return this.c;
    }

    private static Method c(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    public void h(Object[] objectArray) {
        Runnable runnable = (Runnable)objectArray[0];
        long l = (Long)objectArray[1];
        l = n ^ l;
        try {
            if (runnable != null) {
                dD.a("k", (Object)this.m, (Object)runnable, (long)4100048836885783192L, (long)l);
            }
        }
        catch (MatchException matchException) {
            throw dD.a("s", (Object)matchException, (long)4106342386964875658L, (long)l);
        }
    }

    private static Method h(long l, long l2) {
        int n = dD.e(l, l2);
        Object object = o[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = p[n];
                int n3 = string2.indexOf(8);
                clazz3 = dD.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = dD.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = dD.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        dD.o[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = dD.f(1331631434392671L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = dD.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        dD.o[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = dD.f(1331631434392671L, 0L);
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

    public void f(Object[] objectArray) {
        dF dF2 = (dF)objectArray[0];
        long l = (Long)objectArray[1];
        l = n ^ l;
        dD.a("k", (Object)this.a, (Object)dF2, (long)5746906651306364909L, (long)l);
    }

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = dD.e(l, l2);
            object = o[n];
            try {
                if (!(object instanceof String)) break block2;
                dD.o[n] = clazz = Class.forName(p[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = dD.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = dD.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public boolean d(Object[] objectArray) {
        return this.i;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = dD.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = dD.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private void d(Object[] objectArray) {
        this.j = null;
        this.k = null;
        this.l = null;
    }

    public synchronized dC d(Object[] objectArray) {
        dC dC2;
        dD dD2;
        long l;
        block18: {
            block19: {
                dD dD3;
                block16: {
                    Object object;
                    CallSite callSite;
                    long l2;
                    block14: {
                        block15: {
                            l = (Long)objectArray[0];
                            l2 = (l = n ^ l) ^ 0x210F7C30DF84L;
                            callSite = dD.a("s", (long)-7137985526665718223L, (long)l);
                            try {
                                try {
                                    object = this.k;
                                    if (callSite != null) break block14;
                                    if (object != null) break block15;
                                }
                                catch (MatchException matchException) {
                                    throw dD.a("s", (Object)matchException, (long)-7136651185293464189L, (long)l);
                                }
                                return null;
                            }
                            catch (MatchException matchException) {
                                throw dD.a("s", (Object)matchException, (long)-7136651185293464189L, (long)l);
                            }
                        }
                        try {
                            dD3 = this;
                            if (callSite != null) break block16;
                            object = dD3.l;
                        }
                        catch (MatchException matchException) {
                            throw dD.a("s", (Object)matchException, (long)-7136651185293464189L, (long)l);
                        }
                    }
                    try {
                        block17: {
                            try {
                                try {
                                    if (object != dD.a("P", (Object)b, (long)-7136430602019229823L, (long)l)) break block17;
                                    dD2 = this;
                                    if (callSite != null) break block18;
                                }
                                catch (MatchException matchException) {
                                    throw dD.a("s", (Object)matchException, (long)-7136651185293464189L, (long)l);
                                }
                                Object[] objectArray2 = new Object[1];
                                objectArray2[0] = l2;
                                if (dD.a("k", (Object)dD2, (Object)objectArray2, (long)-7140030065664450249L, (long)l) != false) break block19;
                            }
                            catch (MatchException matchException) {
                                throw dD.a("s", (Object)matchException, (long)-7136651185293464189L, (long)l);
                            }
                        }
                        dD3 = this;
                    }
                    catch (MatchException matchException) {
                        throw dD.a("s", (Object)matchException, (long)-7136651185293464189L, (long)l);
                    }
                }
                dD.a("k", (Object)dD3, (Object)new Object[0], (long)-7139503735353485610L, (long)l);
            }
            dD2 = this;
        }
        try {
            dC2 = dD2.k == null ? null : new dC((float)dD.a("k", (Object)this.k, (Object)new Object[0], (long)-7138241801245644322L, (long)l), (float)dD.a("k", (Object)this.k, (Object)new Object[0], (long)-7140436556621224378L, (long)l));
        }
        catch (MatchException matchException) {
            throw dD.a("s", (Object)matchException, (long)-7136651185293464189L, (long)l);
        }
        return dC2;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/dD" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static void a() {
        Object[] objectArray = o;
        o[0] = "0\u0013n[\t=&\u0013k\u0001\u001a*1Xh\u0007\u0016> \u001f\u007f\u0010],\u001c";
        objectArray[1] = "9\u0012.k\u001a:L2%d\u000bu1*6c\u0002<Y";
        objectArray[2] = "P5zm:,F5\u007f7);Q~|1%/@9k&n8p";
        objectArray[3] = "M\u0001\u0014\u0019;pF\u000e\u0005VAtU\u000f\u0015\u0019wpB";
        objectArray[4] = "Y\u0014\u0006\u0003\b*,4\r\f\u0019eM:\u0006\u0007\u001d?9";
        objectArray[5] = Void.TYPE;
        dD.p[5] = "java/lang/Void";
        objectArray[6] = "\u001eQ\b>(\u0007kq\u000319H\n\u007f\b:=\u0012~";
        objectArray[7] = Boolean.TYPE;
        dD.p[7] = "java/lang/Boolean";
        objectArray[8] = "5/R\nx\u00175/EVt\u0018/dEHt\r(\u0015\u0015\u0015%";
        objectArray[9] = "K9\u000ew \u001aK9\u0019+,\u0015Qr\u00195,\u0000V\u0003Lju";
        objectArray[10] = "\u000ba@\u0000E\u0015\u001daEZV\u0002\n*F\\Z\u0016\u001bmQK\u0011\u0001,";
        objectArray[11] = "$\u0003\u0007\u0006#4Q#\f\t2{0-\u0007\u00026!D";
        objectArray[12] = Float.TYPE;
        dD.p[12] = "java/lang/Float";
        objectArray[13] = "y\u0004<WCV\f$7XR\u0019m*<SVC\u0019";
        objectArray[14] = "\u0002|K\u00077Rw\\@\b&\u001d\u0016RK\u0003\"Gb";
        objectArray[15] = "YF_kN{OFZ1]lX\rY7QxIJN \u001ai[";
        objectArray[16] = "k:!QOn\u001e\u001a*^^!\u007f\u0014!UZ{\u000b";
        objectArray[17] = "Hh|`U5V`f/7)Q}";
        objectArray[18] = "0!=\u0011\u0011:;.,^p40%(\u0004";
        objectArray[19] = "$o\u0014\u001cv\u0013:g\u000eS;\t m\u0017\u000f*\u0003 zL>7\u00167A\f**\u000f:k#\u000f*\u00077B\u000b\u000e,";
        objectArray[20] = "\u001b0rvt&\r0w,g1\u001a{t*k%\u000b<c= 5\u0013<a6zx/'a+z?\u00180";
        objectArray[21] = "\u0012zR\u0002\u0002Y\u0004zWX\u0011N\u00131T^\u001dZ\u0002vCIVK9";
        objectArray[22] = "h\u0011RU-M\u001d1YZ<\u0002|?RQ8X\b";
        objectArray[23] = "c\u0011E&zr}\u0019_i\u001dsl\u0002R3;u";
        objectArray[24] = "2Pm\u0019Dc2PzEHl(\u001bz[Hy/j.\u0003\u001f";
        objectArray[25] = "~5Aga\u007fh5D=rh\u007f~G;~|n9P,5lP";
        objectArray[26] = "\u0014\u0005y,;(\u0002\u0005|v(?\u0015N\u007fp$+\u0004\thgo<&";
        objectArray[27] = "\u00056C\"s{\u00056T~\u007ft\u001f}T`\u007fa\u0018\f\u0006>'%";
        objectArray[28] = "qO\u000ehsQz@\u001f'\u0010\\oF";
        objectArray[29] = Double.TYPE;
        dD.p[29] = "java/lang/Double";
        objectArray[30] = "\u000b\u001c\u0018^{M\u001d\u001c\u001d\u0004hZ\nW\u001e\u0002dN\u001b\u0010\t\u0015/Y)";
        objectArray[31] = "^(~g'\u001c+\buh6SJ\u0006~c2\t>";
        objectArray[32] = "BF/dmNII>+\u0011WFI8g/G";
        objectArray[33] = "p~^]G#\u0005^URVldP^YR6\u0010";
        objectArray[34] = "mXj\u0001/O{Xo[<Xl\u0013l]0L}T{J{]a";
        objectArray[35] = "8h,\u007f~\u0019MH'poV,F,{k\fX";
        objectArray[36] = "D\u001dbp&jD\u001du,*e^Vu2*pY'$kr5";
        objectArray[37] = "^\u0014w36AH\u0014ri%V__qo)BN\u0018fxbd";
        objectArray[38] = "5\\\u001a>Dx@|\u00111U7!r\u001a:QmU";
        objectArray[39] = "\u0011\u0017m\u0006FId7f\tW\u0006\u00059m\u0002S\\q";
        objectArray[40] = "m)\rt\u0018Q{)\b.\u000bFlb\u000b(\u0007R}%\u001c?LEN";
        objectArray[41] = "\u007fA.Mfu\na%Bw:ko.Is`\u001f";
        objectArray[42] = "\u0015:\u0004u`t\u000b2\u001e:\rn\u0012+\u0013f/u\u0010)";
        objectArray[43] = "f\u00126i(\u001ex\u001a,&`\u001eb\u00104ai\u0005\"'/Ah\u001fJ\u0006.kr\u0002c\u001d";
        objectArray[44] = "9o74]\u0005/o2nN\u00128$1hB\u0006)c&\u007f\t\u00179";
        objectArray[45] = "V\u0012(9.\r#2#6?BB<(=;\u00186";
        objectArray[46] = "B\u007fc\n]{7_h\u0005L4VQc\u000eHn\"";
        objectArray[47] = "e\u0011\u00029c/&\u0014\u0007CiHgCG&cy>IX{\u0003";
        objectArray[48] = "l`A(\u0002\u0003pkQ~;\r\u0001lN-K\\|k\u0016;E";
        objectArray[49] = "26&p~\u000e*u;pE\u00041$$< \u007f`:9y#\u001a;,s;EO!0z' \u00147z8A";
        objectArray[50] = "\u0014hMnGdQ4\n)(5K5\u00129\u007fb\u0015bJUG&J:\u000b1MeL<";
        objectArray[51] = "],\fI1(\u0018<\u001f^_|F#\rJ%vG)4E#\u0017]:\u001cJ&o\u001b7NO_kK?\u001fM`.[,\b#";
        objectArray[52] = "\u0014,6s\t-Q<%dgh\u00058\"c\u001c\u007f\u0004F3s\u001ex\u0006yvc\roh";
        objectArray[53] = "\b{}?-iM':xB8W&\"h\u0015o\b{y\u0004|/\u0006; f)hI5";
        objectArray[54] = "\u0001jFp3\u0004BoC\n:cEe\u0007ek\u0004_)CwS_\u0002i\u0010g1\tA4C\n";
        objectArray[55] = "l\u0004CW\u0007\u0014wC\u001e\u0004{\u0005\u0016\u0005IC\u0014Vq\u001f\u0005\u0007\u0006n)\u0011\b\u0007\u0017\u0000)\u0006\u0017B{";
        objectArray[56] = "dL\u0004v\u001e!xG\u0014 ')\tM\u0016(\u001a~sU\u001dy_";
        objectArray[57] = "{\"1\u00162,a j\u0016X;\u001a'v\u0005=oske\u001a!R";
        objectArray[58] = " <\u001e\b4b!(\u0017NM:\u0019y\u0019J48c&\u0018P-S#}[O&)||AVM";
        objectArray[59] = "c\u001e'\u0002L\u00182\u0004*\u001c2\nc\u0019[\u0014{\tt\u0018|\u00062\u000f3MdC[\t}N!z\u000e\u001cr\u0010'\u0013B\u000fm\f\u001a";
        objectArray[60] = "_\u000f9]GH\nG}\u001c!^6\u00010PN\fQ\u001b|\u0014\\4\nF<GLV\\\u0005a\u0014!";
        objectArray[61] = "\u0019H/}\u0000^\u0013Mrwe\u0006\u001fXQq\u0015\u001av\u001fha\u0000[\u001fS{~\u001cf";
        objectArray[62] = "<O@(\u0000;6\fF.}:>N@-\u0011\bn\r\u001ew}c,OEw\u0014/?PYJ";
        objectArray[63] = "\u0013bV\u0000W2\u00187E\u00120#j&\u0016\r_q\r<ZIMIVa\u001a\u001a]+\u0000\"GI0";
        objectArray[64] = "$\u007f14\r~a#vsb$w3jh\u000e\u0016#r47b#ssdw\u0013#ts4\u000f";
        objectArray[65] = "aX\u001b'\u001b:`L\u0012abgXX\u0013d\r3?B_ \u001f\u000bd\u001f\u001fs\u000fi2\\B b";
        objectArray[66] = "-\"Uz:Bl<\tz\u0007MP&\beh\u001e7<D!z&la\u0004rjD:\"Y!\u0007";
        objectArray[67] = "j\u001b$xFat\u001f#&vy\u000e\nqe\u0019(i\u0010=!\u000b\u00101\u001e0!\u001a~1\t/dv";
        objectArray[68] = ">\u007f_U(Yk}E[X\u001f&b>\u0006`X1i\\P#\u0005b\u0004";
        objectArray[69] = "Z{rvX`P8tp%aXzrsIS\u000e8.)\u0019\u0004\u0005wi,Ca^a#n%";
        objectArray[70] = ".4\u0017%N\u0000&,W)2\u0006?\u0004B<N\u0016DuX9WZ-9K&Kg";
        objectArray[71] = "\u0004u\u0013I\u007fn\u000epNC\u001a0\u0006nW(vjS`\u0012Ap$P%+";
        objectArray[72] = "l}whI:t>jhr1gf\u007f>\u0017Kma.)\u00023r;n0r";
        objectArray[73] = ">D.9vm9\u001c87MyS]u4\"(4G9p0\u0010o\u001ay# r9Y$pM";
        objectArray[74] = "B^|\u000b/\u0016CJuMVL{^tH9\u001f\u001cD8\f+'G^8PkN\u000bM'LV";
        objectArray[75] = "\u001b\u00196~\u0000j\u0013\u0001vr|f\u0015\toe|1IYlr\u001eg\n\u0004?\u001f";
        objectArray[76] = "ql*0\u0011[q{5u}_Nxkt\u0012\r)b'0\u00005~v!1\u001bP%`ks}";
        objectArray[77] = "+\u00075e\u0013V*\u0013<#j\u000b\u0012\u0007=&\u0005_u\u001dqb\u0017g-\u0013|b\u0006\t-\u0004c'j";
        objectArray[78] = "uSNx\u0010_\u007f\u0010H~m^wRN}\u0001l!\u0010\u0012'P;*_U\"\u000b^qI\u001f`m";
        objectArray[79] = "\u0010\u0013\u001fgB\u000bMM\rt#Yv\tGcL\b\u0011\u0013\u000b'^0\u000eJ\r~MQ\n\u001a\u0012\"#";
        objectArray[80] = "l\u0013*^c\u001c-\rv^^\u0012\u0011\u0017wA1@v\r;\u0005#x-P{V3\u001a{\u0013&\u0005^";
        objectArray[81] = "`\f%\u0015~/h\u0014e\u0019\u0002!f\u001d\u0015\u0018>ptH|\u001eps1q)\u000b\u007f-7\u0018e\u0018`1\n";
        objectArray[82] = "Bq\u0015\u0001t\u0004ZzDDO\u0017\"`Y\f.\u0002EhAL\"~";
        objectArray[83] = "8UJ]R\u00178BU\u0018>\u0010\u0007A\u000b\u0019QA`[G]Cy7OA\\X\u001clY\u000b\u001e>";
        objectArray[84] = "Q[#\u001f\u0004X\u0000A.\u0001zYPUy\u0019\u0017#Q\f&\u0019CJWB%\\z\u001fBM{Z\u0013SQRgg";
        objectArray[85] = "\u0014\u001d->R\u0000E\u0007  ,\u001a\u0003;u>P\nxJo;IF\u0011\u0006|$U{";
        objectArray[86] = "qjoAo#i)rAT;yl\u000b@%)+qn\u001b3ci\u0017;\u0001/jur`\u0017e(\u0013";
        objectArray[87] = "YPBx\u0015qQH\u0002tiwO@\bp\u0015qI-\u001drQwV\u0015\u0017w\f}3";
        objectArray[88] = "9yH:y&2,[(\u001e4@=\b7qe''Dsc]|z\u0004 s?*9Ys\u001e";
        objectArray[89] = "\ndP$iy[~]:\u0017c\u001ab\u00175ke\u001c\u000f\u00027/c\u00037\b2rif";
        Object[] objectArray2 = objectArray;
        objectArray[90] = "\u000f\r\u000f+\u0012t^\u0017\u00025lt\u0004\u001cNS\u0010e\u001a\f\\lUu\t\u001b2oT2\t\u000bP9\u0017oZf";
    }

    @bP
    public void a(bd_0 bd_02) {
        long l;
        block14: {
            dD dD2;
            block13: {
                dC dC2;
                block11: {
                    l = n ^ 0x35F86BBAE0D0L;
                    CallSite callSite = dD.a("s", (long)5006790895983529914L, (long)l);
                    try {
                        try {
                            block12: {
                                try {
                                    try {
                                        dC2 = this.c;
                                        if (callSite != null) break block11;
                                        if (dC2 == null) break block12;
                                    }
                                    catch (MatchException matchException) {
                                        throw dD.a("s", (Object)matchException, (long)5007707838995346440L, (long)l);
                                    }
                                    dD.a("k", (Object)bd_02, (Object)new Object[]{Float.valueOf((float)dD.a("k", (Object)this.c, (Object)new Object[0], (long)5000307128852770901L, (long)l))}, (long)5000253043946909812L, (long)l);
                                    dD.a("k", (Object)bd_02, (Object)new Object[]{Float.valueOf((float)dD.a("k", (Object)this.c, (Object)new Object[0], (long)4999951032216141773L, (long)l))}, (long)4999227403488827433L, (long)l);
                                    if (callSite == null) break block13;
                                }
                                catch (MatchException matchException) {
                                    throw dD.a("s", (Object)matchException, (long)5007707838995346440L, (long)l);
                                }
                            }
                            dD2 = this;
                            if (callSite != null) break block14;
                        }
                        catch (MatchException matchException) {
                            throw dD.a("s", (Object)matchException, (long)5007707838995346440L, (long)l);
                        }
                        dC2 = dD2.h;
                    }
                    catch (MatchException matchException) {
                        throw dD.a("s", (Object)matchException, (long)5007707838995346440L, (long)l);
                    }
                }
                try {
                    if (dC2 != null) {
                        dD.a("k", (Object)bd_02, (Object)new Object[]{Float.valueOf((float)dD.a("k", (Object)this.h, (Object)new Object[0], (long)5000307128852770901L, (long)l))}, (long)5000253043946909812L, (long)l);
                        dD.a("k", (Object)bd_02, (Object)new Object[]{Float.valueOf((float)dD.a("k", (Object)this.h, (Object)new Object[0], (long)4999951032216141773L, (long)l))}, (long)4999227403488827433L, (long)l);
                        this.h = null;
                    }
                }
                catch (MatchException matchException) {
                    throw dD.a("s", (Object)matchException, (long)5007707838995346440L, (long)l);
                }
            }
            dD2 = this;
        }
        dD2.e = this.c;
        dD.a("k", (Object)bd_02, (Object)new Object[0], (long)5007427254831119857L, (long)l);
    }

    public void a(Object[] objectArray) {
        dC dC2 = (dC)objectArray[0];
        this.c = dC2;
    }

    @bP
    public void a(bh_0 bh_02) {
        block14: {
            CallSite callSite;
            class_2886 class_28862;
            Object object;
            long l;
            long l2;
            long l3;
            block15: {
                block16: {
                    dC dC2;
                    block19: {
                        dD dD2;
                        block17: {
                            block18: {
                                CallSite callSite2;
                                CallSite callSite3;
                                long l4;
                                block13: {
                                    long l5 = l3 = n ^ 0x78FCE5B86312L;
                                    l2 = l5 ^ 0x469F7A3E5B4BL;
                                    l4 = l5 ^ 0x50049298FFE9L;
                                    l = l5 ^ 0x3DAE0D1A8482L;
                                    object = dD.a("k", (Object)bh_02, (Object)new Object[0], (long)-4133794851347077278L, (long)l3);
                                    callSite3 = dD.a("s", (long)-4126989619705115528L, (long)l3);
                                    try {
                                        try {
                                            callSite2 = object;
                                            if (callSite3 != null) break block13;
                                            if (!(callSite2 instanceof class_2886)) break block14;
                                        }
                                        catch (MatchException matchException) {
                                            throw dD.a("s", (Object)matchException, (long)-4126213444246226998L, (long)l3);
                                        }
                                        callSite2 = object;
                                    }
                                    catch (MatchException matchException) {
                                        throw dD.a("s", (Object)matchException, (long)-4126213444246226998L, (long)l3);
                                    }
                                }
                                class_28862 = (class_2886)callSite2;
                                Object[] objectArray = new Object[1];
                                objectArray[0] = l4;
                                object = dD.a("k", (Object)this, (Object)objectArray, (long)-4133896664402202552L, (long)l3);
                                try {
                                    try {
                                        try {
                                            try {
                                                callSite = object;
                                                if (callSite3 != null) break block15;
                                                if (callSite != null) break block16;
                                            }
                                            catch (MatchException matchException) {
                                                throw dD.a("s", (Object)matchException, (long)-4126213444246226998L, (long)l3);
                                            }
                                            dD2 = this;
                                            if (callSite3 != null) break block17;
                                        }
                                        catch (MatchException matchException) {
                                            throw dD.a("s", (Object)matchException, (long)-4126213444246226998L, (long)l3);
                                        }
                                        if (dD2.c == null) break block18;
                                    }
                                    catch (MatchException matchException) {
                                        throw dD.a("s", (Object)matchException, (long)-4126213444246226998L, (long)l3);
                                    }
                                    dC2 = this.c;
                                    break block19;
                                }
                                catch (MatchException matchException) {
                                    throw dD.a("s", (Object)matchException, (long)-4126213444246226998L, (long)l3);
                                }
                            }
                            dD2 = this;
                        }
                        dC2 = dD2.h;
                    }
                    object = dC2;
                }
                callSite = object;
            }
            if (callSite != null) {
                U u = new U(class_28862);
                Object[] objectArray = new Object[2];
                objectArray[1] = l;
                objectArray[0] = Float.valueOf((float)dD.a("k", (Object)object, (Object)new Object[0], (long)-4132362910290807913L, (long)l3));
                dD.a("k", (Object)u, (Object)objectArray, (long)-4133160885415271878L, (long)l3);
                Object[] objectArray2 = new Object[2];
                objectArray2[1] = l2;
                objectArray2[0] = Float.valueOf((float)dD.a("k", (Object)object, (Object)new Object[0], (long)-4133976813668549617L, (long)l3));
                dD.a("k", (Object)u, (Object)objectArray2, (long)-4125896126196895168L, (long)l3);
            }
        }
    }

    @bP
    public void a(bI bI2) {
        block4: {
            long l;
            block5: {
                l = n ^ 0x4A74C262B66BL;
                CallSite callSite = dD.a("s", (long)1423364283803785473L, (long)l);
                try {
                    try {
                        if (callSite != null) break block4;
                        if (this.c == null) break block5;
                    }
                    catch (MatchException matchException) {
                        throw dD.a("s", (Object)matchException, (long)1424699011219710643L, (long)l);
                    }
                    bI2.a = (float)dD.a("k", (Object)this.c, (Object)new Object[0], (long)1432099996375131886L, (long)l);
                    bI2.b = (float)dD.a("k", (Object)this.c, (Object)new Object[0], (long)1429923074107468150L, (long)l);
                }
                catch (MatchException matchException) {
                    throw dD.a("s", (Object)matchException, (long)1424699011219710643L, (long)l);
                }
            }
            dD.a("k", (Object)bI2, (Object)new Object[0], (long)1424979174477081418L, (long)l);
        }
    }

    @bP
    public void a(bf_0 bf_02) {
        block4: {
            long l;
            block5: {
                l = n ^ 0x6485C4F5207BL;
                CallSite callSite = dD.a("s", (long)-8804290193372885231L, (long)l);
                try {
                    try {
                        if (callSite != null) break block4;
                        if (this.c == null) break block5;
                    }
                    catch (MatchException matchException) {
                        throw dD.a("s", (Object)matchException, (long)-8802950939078134621L, (long)l);
                    }
                    dD.a("k", (Object)bf_02, (Object)new Object[]{Float.valueOf((float)dD.a("k", (Object)this.c, (Object)new Object[0], (long)-8804544234048671490L, (long)l))}, (long)-8803362384500806466L, (long)l);
                }
                catch (MatchException matchException) {
                    throw dD.a("s", (Object)matchException, (long)-8802950939078134621L, (long)l);
                }
            }
            dD.a("k", (Object)bf_02, (Object)new Object[0], (long)-8802665956848517798L, (long)l);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @bP
    public void a(bG var1_1) {
        block88: {
            block89: {
                block86: {
                    block87: {
                        block85: {
                            block84: {
                                block78: {
                                    block80: {
                                        block81: {
                                            block83: {
                                                block82: {
                                                    block90: {
                                                        block76: {
                                                            block75: {
                                                                block74: {
                                                                    block73: {
                                                                        block71: {
                                                                            block72: {
                                                                                var2_2 = dD.n ^ 40007746218522L;
                                                                                var4_3 = var2_2 ^ 927856795651L;
                                                                                this.i = 0;
                                                                                var6_4 = dD.a("s", (long)-3480824764544023184L, (long)var2_2);
                                                                                try {
                                                                                    v0 = dD.a("k", (Object)this.m, (long)-3482456564385258827L, (long)var2_2);
                                                                                    if (var6_4 != null) break block71;
                                                                                    if (v0 != false) break block72;
                                                                                }
                                                                                catch (Throwable v1) {
                                                                                    throw dD.a("s", (Object)v1, (long)-3479907967560892734L, (long)var2_2);
                                                                                }
                                                                                var7_5 = new ArrayList<E>(this.m);
                                                                                dD.a("k", (Object)this.m, (long)-3483323710702386019L, (long)var2_2);
                                                                                var8_7 = dD.a("k", var7_5, (long)-3481423009420589323L, (long)var2_2);
                                                                                while (dD.a("k", (Object)var8_7, (long)-3479862143425941446L, (long)var2_2) != false) {
                                                                                    var9_9 = (Runnable)dD.a("k", (Object)var8_7, (long)-3482479360171223622L, (long)var2_2);
                                                                                    try {
                                                                                        dD.a("k", (Object)var9_9, (long)-3482560375304394793L, (long)var2_2);
                                                                                        if (var6_4 != null) break block73;
                                                                                    }
                                                                                    catch (Throwable var10_12) {
                                                                                        // empty catch block
                                                                                    }
                                                                                    if (var6_4 == null) continue;
                                                                                }
                                                                            }
                                                                            try {
                                                                                v2 = this;
                                                                                if (var6_4 != null) break block74;
                                                                                v0 = dD.a("k", (Object)v2.a, (long)-3481562978353374656L, (long)var2_2);
                                                                            }
                                                                            catch (Throwable v3) {
                                                                                throw dD.a("s", (Object)v3, (long)-3479907967560892734L, (long)var2_2);
                                                                            }
                                                                        }
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            if (v0 == false) break block73;
                                                                                            v4 = this.c;
                                                                                            if (var6_4 != null) break block75;
                                                                                        }
                                                                                        catch (Throwable v5) {
                                                                                            throw dD.a("s", (Object)v5, (long)-3479907967560892734L, (long)var2_2);
                                                                                        }
                                                                                        if (v4 != null) break block73;
                                                                                    }
                                                                                    catch (Throwable v6) {
                                                                                        throw dD.a("s", (Object)v6, (long)-3479907967560892734L, (long)var2_2);
                                                                                    }
                                                                                    v4 = this.h;
                                                                                    if (var6_4 != null) break block75;
                                                                                }
                                                                                catch (Throwable v7) {
                                                                                    throw dD.a("s", (Object)v7, (long)-3479907967560892734L, (long)var2_2);
                                                                                }
                                                                                if (v4 != null) break block73;
                                                                            }
                                                                            catch (Throwable v8) {
                                                                                throw dD.a("s", (Object)v8, (long)-3479907967560892734L, (long)var2_2);
                                                                            }
                                                                            this.d = null;
                                                                            this.e = null;
                                                                            return;
                                                                        }
                                                                        catch (Throwable v9) {
                                                                            throw dD.a("s", (Object)v9, (long)-3479907967560892734L, (long)var2_2);
                                                                        }
                                                                    }
                                                                    v2 = this;
                                                                }
                                                                try {
                                                                    if (var6_4 != null) break block76;
                                                                    v4 = v2.d;
                                                                }
                                                                catch (Throwable v10) {
                                                                    throw dD.a("s", (Object)v10, (long)-3479907967560892734L, (long)var2_2);
                                                                }
                                                            }
                                                            if (v4 != null) break block90;
                                                            v2 = this;
                                                        }
                                                        v2.d = new dC((float)dD.a("k", (Object)dD.a("P", (Object)dD.b, (long)-3479381193507476924L, (long)var2_2), (long)-3482688289855171159L, (long)var2_2), (float)dD.a("k", (Object)dD.a("P", (Object)dD.b, (long)-3479381193507476924L, (long)var2_2), (long)-3482985766355711123L, (long)var2_2));
                                                    }
                                                    var7_6 = 0;
                                                    try {
                                                        v11 = this.c != null ? 1 : 0;
                                                    }
                                                    catch (Throwable v12) {
                                                        throw dD.a("s", (Object)v12, (long)-3479907967560892734L, (long)var2_2);
                                                    }
                                                    var8_8 = v11;
                                                    var9_9 = dD.a("k", (Object)this.a, (long)-3482354900712253535L, (long)var2_2);
                                                    while (dD.a("k", (Object)var9_9, (long)-3479862143425941446L, (long)var2_2) != false) {
                                                        block79: {
                                                            block77: {
                                                                var10_13 = (dF)dD.a("k", (Object)var9_9, (long)-3482479360171223622L, (long)var2_2);
                                                                v13 = new Object[1];
                                                                v13[0] = var4_3;
                                                                var11_16 = dD.a("k", (Object)var10_13, (Object)v13, (long)-3482782476986054113L, (long)var2_2);
                                                                try {
                                                                    try {
                                                                        try {
                                                                            if (var6_4 != null) break block77;
                                                                            v14 = var11_16;
                                                                            if (var6_4 != null) break block78;
                                                                        }
                                                                        catch (Throwable v15) {
                                                                            throw dD.a("s", (Object)v15, (long)-3479907967560892734L, (long)var2_2);
                                                                        }
                                                                        if (v14 == null) break block79;
                                                                    }
                                                                    catch (Throwable v16) {
                                                                        throw dD.a("s", (Object)v16, (long)-3479907967560892734L, (long)var2_2);
                                                                    }
                                                                    this.c = var11_16;
                                                                }
                                                                catch (Throwable v17) {
                                                                    throw dD.a("s", (Object)v17, (long)-3479907967560892734L, (long)var2_2);
                                                                }
                                                            }
                                                            var7_6 = 1;
                                                        }
                                                        if (var6_4 == null) continue;
                                                    }
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    v18 = var7_6;
                                                                    if (var6_4 != null) break block80;
                                                                    if (v18 != 0) break block81;
                                                                }
                                                                catch (Throwable v19) {
                                                                    throw dD.a("s", (Object)v19, (long)-3479907967560892734L, (long)var2_2);
                                                                }
                                                                v20 = this.c;
                                                                if (var6_4 != null) break block82;
                                                            }
                                                            catch (Throwable v21) {
                                                                throw dD.a("s", (Object)v21, (long)-3479907967560892734L, (long)var2_2);
                                                            }
                                                            if (v20 == null) break block81;
                                                        }
                                                        catch (Throwable v22) {
                                                            throw dD.a("s", (Object)v22, (long)-3479907967560892734L, (long)var2_2);
                                                        }
                                                        v20 = this.c;
                                                    }
                                                    catch (Throwable v23) {
                                                        throw dD.a("s", (Object)v23, (long)-3479907967560892734L, (long)var2_2);
                                                    }
                                                }
                                                var9_10 = dD.a("s", (float)(dD.a("k", (Object)v20, (Object)new Object[0], (long)-3481641725118252385L, (long)var2_2) - dD.a("k", (Object)dD.a("P", (Object)dD.b, (long)-3479381193507476924L, (long)var2_2), (long)-3482688289855171159L, (long)var2_2)), (long)-3481323258238094007L, (long)var2_2);
                                                try {
                                                    try {
                                                        v24 = var9_10;
                                                        v25 = dD.f;
                                                        if (var6_4 != null) break block83;
                                                        if (v24 > v25) {
                                                        }
                                                        ** GOTO lbl157
                                                    }
                                                    catch (Throwable v26) {
                                                        throw dD.a("s", (Object)v26, (long)-3479907967560892734L, (long)var2_2);
                                                    }
                                                    v24 = dD.a("k", (Object)this.c, (Object)new Object[0], (long)-3481641725118252385L, (long)var2_2);
                                                    v25 = dD.f * dD.a("s", (float)(dD.a("k", (Object)this.c, (Object)new Object[0], (long)-3481641725118252385L, (long)var2_2) - dD.a("k", (Object)dD.a("P", (Object)dD.b, (long)-3479381193507476924L, (long)var2_2), (long)-3482688289855171159L, (long)var2_2)), (long)-3479531384635771353L, (long)var2_2);
                                                }
                                                catch (Throwable v27) {
                                                    throw dD.a("s", (Object)v27, (long)-3479907967560892734L, (long)var2_2);
                                                }
                                            }
                                            var10_14 = v24 - v25;
                                            try {
                                                this.c = new dC((float)var10_14, (float)dD.a("k", (Object)this.c, (Object)new Object[0], (long)-3483123770918587129L, (long)var2_2));
                                                if (var6_4 == null) break block81;
lbl157:
                                                // 2 sources

                                                this.c = null;
                                            }
                                            catch (Throwable v28) {
                                                throw dD.a("s", (Object)v28, (long)-3479907967560892734L, (long)var2_2);
                                            }
                                        }
                                        v18 = var8_8;
                                    }
                                    try {
                                        try {
                                            if (v18 != 0) {
                                                v14 = this.c;
                                                if (var6_4 != null) break block78;
                                            }
                                            ** GOTO lbl184
                                        }
                                        catch (Throwable v29) {
                                            throw dD.a("s", (Object)v29, (long)-3479907967560892734L, (long)var2_2);
                                        }
                                        if (v14 == null) {
                                        }
                                        ** GOTO lbl184
                                    }
                                    catch (Throwable v30) {
                                        throw dD.a("s", (Object)v30, (long)-3479907967560892734L, (long)var2_2);
                                    }
                                    var9_11 = dD.a("k", (Object)dD.a("P", (Object)dD.b, (long)-3479381193507476924L, (long)var2_2), (long)-3482688289855171159L, (long)var2_2) + (float)(dD.a("s", (long)-3483403048903396615L, (long)var2_2) * 0.06 - 0.03);
                                    var10_15 = dD.a("k", (Object)dD.a("P", (Object)dD.b, (long)-3479381193507476924L, (long)var2_2), (long)-3482985766355711123L, (long)var2_2) + (float)(dD.a("s", (long)-3483403048903396615L, (long)var2_2) * 0.06 - 0.03);
                                    try {
                                        try {
                                            this.h = new dC((float)var9_11, (float)var10_15);
                                            if (var6_4 == null) break block84;
lbl184:
                                            // 3 sources

                                            v31 = this;
                                            if (var6_4 != null) break block85;
                                        }
                                        catch (Throwable v32) {
                                            throw dD.a("s", (Object)v32, (long)-3479907967560892734L, (long)var2_2);
                                        }
                                        v14 = v31.c;
                                    }
                                    catch (Throwable v33) {
                                        throw dD.a("s", (Object)v33, (long)-3479907967560892734L, (long)var2_2);
                                    }
                                }
                                try {
                                    if (v14 != null) {
                                        this.h = null;
                                    }
                                }
                                catch (Throwable v34) {
                                    throw dD.a("s", (Object)v34, (long)-3479907967560892734L, (long)var2_2);
                                }
                            }
                            v31 = this;
                        }
                        try {
                            try {
                                v35 = this.c;
                                if (var6_4 != null) break block86;
                                if (v35 == null) break block87;
                            }
                            catch (Throwable v36) {
                                throw dD.a("s", (Object)v36, (long)-3479907967560892734L, (long)var2_2);
                            }
                            v35 = this.c;
                            break block88;
                        }
                        catch (Throwable v37) {
                            throw dD.a("s", (Object)v37, (long)-3479907967560892734L, (long)var2_2);
                        }
                    }
                    v35 = this.h;
                }
                try {
                    try {
                        if (var6_4 != null) break block88;
                        if (v35 == null) break block89;
                    }
                    catch (Throwable v38) {
                        throw dD.a("s", (Object)v38, (long)-3479907967560892734L, (long)var2_2);
                    }
                    v35 = this.h;
                    break block88;
                }
                catch (Throwable v39) {
                    throw dD.a("s", (Object)v39, (long)-3479907967560892734L, (long)var2_2);
                }
            }
            v35 = null;
        }
        v31.d = v35;
    }

    public dC a(Object[] objectArray) {
        dC dC2;
        long l;
        long l2;
        class_243 class_2432;
        block4: {
            block5: {
                class_2432 = (class_243)objectArray[0];
                l2 = (Long)objectArray[1];
                l = (l2 = n ^ l2) ^ 0x2EC8533B9A2BL;
                CallSite callSite = dD.a("s", (long)-2623462085175635626L, (long)l2);
                try {
                    try {
                        dC2 = this.d;
                        if (callSite != null) break block4;
                        if (dC2 == null) break block5;
                    }
                    catch (MatchException matchException) {
                        throw dD.a("s", (Object)matchException, (long)-2624801060834432284L, (long)l2);
                    }
                    dC2 = this.d;
                    break block4;
                }
                catch (MatchException matchException) {
                    throw dD.a("s", (Object)matchException, (long)-2624801060834432284L, (long)l2);
                }
            }
            dC2 = new dC((float)dD.a("k", (Object)dD.a("P", (Object)b, (long)-2625327764830290334L, (long)l2), (long)-2626383632593649265L, (long)l2), (float)dD.a("k", (Object)dD.a("P", (Object)b, (long)-2625327764830290334L, (long)l2), (long)-2625662811136696501L, (long)l2));
        }
        dC dC3 = dC2;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = l;
        objectArray2[2] = Float.valueOf(g);
        objectArray2[1] = class_2432;
        objectArray2[0] = dC3;
        return dD.a("s", (Object)objectArray2, (long)-2625171017733103109L, (long)l2);
    }

    @bP
    public synchronized void a(a5 a52) {
        long l = n ^ 0x1D8241E0565BL;
        dD.a("k", (Object)this, (Object)new Object[0], (long)-870534593143162410L, (long)l);
    }

    public synchronized boolean a(Object[] objectArray) {
        long l;
        block25: {
            dD dD2;
            dC dC2;
            Object object;
            block26: {
                Object object2;
                CallSite callSite;
                block23: {
                    block24: {
                        block21: {
                            block22: {
                                long l2;
                                block20: {
                                    object = objectArray[0];
                                    dC2 = (dC)objectArray[1];
                                    l = (Long)objectArray[2];
                                    l2 = (l = n ^ l) ^ 0x491D9F6BFE7AL;
                                    callSite = dD.a("s", (long)-4823724733248899121L, (long)l);
                                    try {
                                        try {
                                            if (object != null && dC2 != null) break block20;
                                        }
                                        catch (MatchException matchException) {
                                            throw dD.a("s", (Object)matchException, (long)-4824501321024582531L, (long)l);
                                        }
                                        return false;
                                    }
                                    catch (MatchException matchException) {
                                        throw dD.a("s", (Object)matchException, (long)-4824501321024582531L, (long)l);
                                    }
                                }
                                try {
                                    try {
                                        object2 = this;
                                        if (callSite != null) break block21;
                                        Object[] objectArray2 = new Object[1];
                                        objectArray2[0] = l2;
                                        if (dD.a("k", (Object)object2, (Object)objectArray2, (long)-4821124914705792823L, (long)l) != false) break block22;
                                    }
                                    catch (MatchException matchException) {
                                        throw dD.a("s", (Object)matchException, (long)-4824501321024582531L, (long)l);
                                    }
                                    dD.a("k", (Object)this, (Object)new Object[0], (long)-4821935460568434904L, (long)l);
                                    return false;
                                }
                                catch (MatchException matchException) {
                                    throw dD.a("s", (Object)matchException, (long)-4824501321024582531L, (long)l);
                                }
                            }
                            object2 = this.l;
                        }
                        try {
                            try {
                                if (callSite != null) break block23;
                                if (object2 == dD.a("P", (Object)b, (long)-4825564946937835905L, (long)l)) break block24;
                            }
                            catch (MatchException matchException) {
                                throw dD.a("s", (Object)matchException, (long)-4824501321024582531L, (long)l);
                            }
                            dD.a("k", (Object)this, (Object)new Object[0], (long)-4821935460568434904L, (long)l);
                        }
                        catch (MatchException matchException) {
                            throw dD.a("s", (Object)matchException, (long)-4824501321024582531L, (long)l);
                        }
                    }
                    try {
                        dD2 = this;
                        if (callSite != null) break block25;
                        object2 = dD2.j;
                    }
                    catch (MatchException matchException) {
                        throw dD.a("s", (Object)matchException, (long)-4824501321024582531L, (long)l);
                    }
                }
                try {
                    try {
                        try {
                            if (object2 == null) break block26;
                            dD2 = this;
                            if (callSite != null) break block25;
                        }
                        catch (MatchException matchException) {
                            throw dD.a("s", (Object)matchException, (long)-4824501321024582531L, (long)l);
                        }
                        if (dD2.j == object) break block26;
                    }
                    catch (MatchException matchException) {
                        throw dD.a("s", (Object)matchException, (long)-4824501321024582531L, (long)l);
                    }
                    return false;
                }
                catch (MatchException matchException) {
                    throw dD.a("s", (Object)matchException, (long)-4824501321024582531L, (long)l);
                }
            }
            this.j = object;
            this.k = new dC((float)dD.a("k", (Object)dC2, (Object)new Object[0], (long)-4822872565897525216L, (long)l), (float)dD.a("k", (Object)dC2, (Object)new Object[0], (long)-4821531272482666568L, (long)l));
            dD2 = this;
        }
        dD2.l = dD.a("P", (Object)b, (long)-4825564946937835905L, (long)l);
        return true;
    }

    @bP
    public synchronized void a(a6 a62) {
        block9: {
            dD dD2;
            long l;
            block10: {
                Object object;
                block8: {
                    l = n ^ 0x624CBDE4DFC1L;
                    CallSite callSite = dD.a("s", (long)8821116249629798571L, (long)l);
                    try {
                        try {
                            try {
                                object = this.l;
                                if (callSite != null) break block8;
                                if (object == null) break block9;
                            }
                            catch (MatchException matchException) {
                                throw dD.a("s", (Object)matchException, (long)8822450565215652633L, (long)l);
                            }
                            dD2 = this;
                            if (callSite != null) break block10;
                        }
                        catch (MatchException matchException) {
                            throw dD.a("s", (Object)matchException, (long)8822450565215652633L, (long)l);
                        }
                        object = dD2.l;
                    }
                    catch (MatchException matchException) {
                        throw dD.a("s", (Object)matchException, (long)8822450565215652633L, (long)l);
                    }
                }
                try {
                    if (object == dD.a("P", (Object)b, (long)8821548540691171611L, (long)l)) break block9;
                    dD2 = this;
                }
                catch (MatchException matchException) {
                    throw dD.a("s", (Object)matchException, (long)8822450565215652633L, (long)l);
                }
            }
            dD.a("k", (Object)dD2, (Object)new Object[0], (long)8822906437119750220L, (long)l);
        }
    }

    public void g(Object[] objectArray) {
        boolean bl = (Boolean)objectArray[0];
        this.i = bl;
    }

    private static Field g(long l, long l2) {
        int n = dD.e(l, l2);
        Object object = o[n];
        if (object instanceof String) {
            String string = p[n];
            int n2 = string.indexOf(8);
            Class clazz = dD.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = dD.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = dD.c(clazz3, string2, clazz2)) != null) {
                    dD.o[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = dD.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        dD.o[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = dD.f(1331631434392671L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(dD.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


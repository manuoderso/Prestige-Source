/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2596
 *  net.minecraft.class_2848
 *  net.minecraft.class_2851
 *  net.minecraft.class_310
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.a5;
import dev.zprestige.prestige.bG;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.bZ;
import dev.zprestige.prestige.cz_0;
import dev.zprestige.prestige.hc;
import dev.zprestige.prestige.r_0;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_2596;
import net.minecraft.class_2848;
import net.minecraft.class_2851;
import net.minecraft.class_310;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class bY
implements cz_0 {
    public static boolean a;
    private static final int c;
    private final ArrayDeque d;
    private final List e;
    private volatile boolean f;
    private volatile boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private int k;
    private static final long l;
    private static final Object[] m;
    private static final String[] n;

    public bY(long l) {
        long l2 = (l = bY.l ^ l) ^ 0x1C601EBE1B8FL;
        this.d = new ArrayDeque();
        this.e = new ArrayList();
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = this;
        bY.a("\u00f2", (Object)bY.a("b", (long)-3278117439556900304L, (long)l), (Object)objectArray, (long)-3277471574060701672L, (long)l);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        l = hc.a(-4201240910560064610L, 5769936193256784498L, MethodHandles.lookup().lookupClass()).a(153080583082572L);
        m = new Object[67];
        n = new String[67];
        bY.a();
        long l = bY.l ^ 0x1C2867389428L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = -2209562220008392437L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                long l3 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                c = (int)l3;
                a = 1;
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (bY.n[n3] != null) {
            return n3;
        }
        Object object = m[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 12;
            case 1 -> 11;
            case 2 -> 54;
            case 3 -> 9;
            case 4 -> 0;
            case 5 -> 51;
            case 6 -> 6;
            case 7 -> 18;
            case 8 -> 13;
            case 9 -> 58;
            case 10 -> 28;
            case 11 -> 32;
            case 12 -> 17;
            case 13 -> 1;
            case 14 -> 14;
            case 15 -> 25;
            case 16 -> 41;
            case 17 -> 3;
            case 18 -> 8;
            case 19 -> 34;
            case 20 -> 57;
            case 21 -> 35;
            case 22 -> 61;
            case 23 -> 56;
            case 24 -> 47;
            case 25 -> 39;
            case 26 -> 45;
            case 27 -> 49;
            case 28 -> 55;
            case 29 -> 15;
            case 30 -> 19;
            case 31 -> 2;
            case 32 -> 59;
            case 33 -> 31;
            case 34 -> 26;
            case 35 -> 4;
            case 36 -> 27;
            case 37 -> 38;
            case 38 -> 62;
            case 39 -> 20;
            case 40 -> 21;
            case 41 -> 29;
            case 42 -> 30;
            case 43 -> 48;
            case 44 -> 52;
            case 45 -> 5;
            case 46 -> 16;
            case 47 -> 42;
            case 48 -> 22;
            case 49 -> 33;
            case 50 -> 37;
            case 51 -> 50;
            case 52 -> 44;
            case 53 -> 43;
            case 54 -> 24;
            case 55 -> 60;
            case 56 -> 46;
            case 57 -> 23;
            case 58 -> 36;
            case 59 -> 10;
            case 60 -> 63;
            case 61 -> 7;
            case 62 -> 40;
            default -> 53;
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
        bY.n[n3] = new String(cArray);
        return n3;
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'Y' || c == '\u00cb' || c == 'b' || c == 'd') {
                field = bY.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'Y' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00cb' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'b' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = bY.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00f2' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'a' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean b(Object[] var1_1) {
        block34: {
            block33: {
                block30: {
                    block31: {
                        block32: {
                            block29: {
                                block27: {
                                    block28: {
                                        block35: {
                                            var2_2 = (Long)var1_1[0];
                                            var2_2 = bY.l ^ var2_2;
                                            var4_3 = bY.a("a", (long)-2622940136109778667L, (long)var2_2);
                                            v0 /* !! */  = bY.a("b", (long)-2621349055963835697L, (long)var2_2);
                                            if (var4_3 != null) break block27;
                                            if (v0 /* !! */  != false) break block28;
                                            break block35;
                                            catch (MatchException v1) {
                                                throw bY.a("a", (Object)v1, (long)-2621448926012045561L, (long)var2_2);
                                            }
                                        }
                                        try {
                                            block36: {
                                                v0 /* !! */  = (CallSite)bY.a;
                                                if (var4_3 != null) break block27;
                                                break block36;
                                                catch (MatchException v2) {
                                                    throw bY.a("a", (Object)v2, (long)-2621448926012045561L, (long)var2_2);
                                                }
                                            }
                                            if (v0 /* !! */  != false) break block29;
                                        }
                                        catch (MatchException v3) {
                                            throw bY.a("a", (Object)v3, (long)-2621448926012045561L, (long)var2_2);
                                        }
                                    }
                                    v0 /* !! */  = (CallSite)0;
                                }
                                return (boolean)v0 /* !! */ ;
                            }
                            var6_4 = this;
                            synchronized (var6_4) {
                                v4 = bY.a("\u00f2", (Object)this.d, (long)-2622300288810711424L, (long)var2_2);
                                if (var4_3 == null) {
                                    v4 = v4 == false ? (Object)1 : (Object)0;
                                }
                                var5_5 = v4;
                            }
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                v5 /* !! */  = var5_5;
                                                if (var4_3 != null) break block30;
                                                if (v5 /* !! */  != false) {
                                                }
                                                ** GOTO lbl75
                                            }
                                            catch (MatchException v6) {
                                                throw bY.a("a", (Object)v6, (long)-2621448926012045561L, (long)var2_2);
                                            }
                                            v7 = this;
                                            if (var4_3 != null) break block31;
                                        }
                                        catch (MatchException v8) {
                                            throw bY.a("a", (Object)v8, (long)-2621448926012045561L, (long)var2_2);
                                        }
                                        if (v7.i) break block32;
                                    }
                                    catch (MatchException v9) {
                                        throw bY.a("a", (Object)v9, (long)-2621448926012045561L, (long)var2_2);
                                    }
                                    if (bY.a("Y", (Object)bY.b, (long)-2622792164872084663L, (long)var2_2) == null) break block32;
                                }
                                catch (MatchException v10) {
                                    throw bY.a("a", (Object)v10, (long)-2621448926012045561L, (long)var2_2);
                                }
                                this.h = bY.a("\u00f2", (Object)bY.a("Y", (Object)bY.b, (long)-2622792164872084663L, (long)var2_2), (long)-2623247151439595671L, (long)var2_2);
                            }
                            catch (MatchException v11) {
                                throw bY.a("a", (Object)v11, (long)-2621448926012045561L, (long)var2_2);
                            }
                        }
                        v7 = this;
                    }
                    try {
                        v7.i = 1;
                        if (var4_3 == null) break block33;
lbl75:
                        // 2 sources

                        v5 /* !! */  = (CallSite)this.i;
                    }
                    catch (MatchException v12) {
                        throw bY.a("a", (Object)v12, (long)-2621448926012045561L, (long)var2_2);
                    }
                }
                try {
                    try {
                        if (var4_3 != null) break block34;
                        if (v5 /* !! */  == false) break block33;
                    }
                    catch (MatchException v13) {
                        throw bY.a("a", (Object)v13, (long)-2621448926012045561L, (long)var2_2);
                    }
                    this.i = 0;
                    this.h = 0;
                }
                catch (MatchException v14) {
                    throw bY.a("a", (Object)v14, (long)-2621448926012045561L, (long)var2_2);
                }
            }
            v5 /* !! */  = var5_5;
        }
        return (boolean)v5 /* !! */ ;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     */
    private void b(Object[] objectArray) {
        block21: {
            block22: {
                ArrayList arrayList;
                CallSite callSite;
                long l = (Long)objectArray[0];
                long l2 = (l = bY.l ^ l) ^ 0x3C2D5E28578EL;
                Object object = this;
                synchronized (object) {
                    block19: {
                        block18: {
                            callSite = bY.a("a", (long)8401773514343282197L, (long)l);
                            bY bY2 = this;
                            if (callSite != null) break block18;
                            try {
                                block23: {
                                    if (bY.a("\u00f2", (Object)bY2.d, (long)8402554098426063232L, (long)l) == false) break block19;
                                    break block23;
                                    catch (MatchException matchException) {
                                        throw bY.a("a", (Object)matchException, (long)8403391173103822855L, (long)l);
                                    }
                                }
                                bY2 = object;
                            }
                            catch (MatchException matchException) {
                                throw bY.a("a", (Object)matchException, (long)8403391173103822855L, (long)l);
                            }
                        }
                        // ** MonitorExit[v0] (shouldn't be in output)
                        return;
                    }
                    arrayList = new ArrayList(this.d);
                    bY.a("\u00f2", (Object)this.d, (long)8395069196913510779L, (long)l);
                    this.k = 0;
                }
                object = bY.a("\u00f2", arrayList, (long)8395004351344808462L, (long)l);
                while (bY.a("\u00f2", (Object)object, (long)8402311673707600515L, (long)l) != false) {
                    block20: {
                        bZ bZ2 = (bZ)((Object)bY.a("\u00f2", (Object)object, (long)8402727523286043519L, (long)l));
                        try {
                            CallSite callSite2;
                            try {
                                try {
                                    Object[] objectArray2 = new Object[4];
                                    objectArray2[3] = l2;
                                    objectArray2[2] = bY.a("b", (long)8402507562755560756L, (long)l);
                                    objectArray2[1] = bZ2.c;
                                    objectArray2[0] = bZ2.b;
                                    callSite2 = bY.a("a", (Object)objectArray2, (long)8402973537234531167L, (long)l);
                                    if (callSite != null) break block20;
                                    if (callSite != null) break block21;
                                }
                                catch (MatchException matchException) {
                                    throw bY.a("a", (Object)matchException, (long)8403391173103822855L, (long)l);
                                }
                                if (bZ2.d == null) break block20;
                            }
                            catch (MatchException matchException) {
                                throw bY.a("a", (Object)matchException, (long)8403391173103822855L, (long)l);
                            }
                            callSite2 = bY.a("\u00f2", (Object)this.e, (Object)bZ2.d, (long)8403268054367832539L, (long)l);
                        }
                        catch (MatchException matchException) {
                            throw bY.a("a", (Object)matchException, (long)8403391173103822855L, (long)l);
                        }
                    }
                    if (callSite == null) continue;
                }
                try {
                    bY bY3;
                    try {
                        bY3 = this;
                        if (callSite != null) break block22;
                        if (!bY3.h) break block21;
                    }
                    catch (MatchException matchException) {
                        throw bY.a("a", (Object)matchException, (long)8403391173103822855L, (long)l);
                    }
                    bY3 = this;
                }
                catch (MatchException matchException) {
                    throw bY.a("a", (Object)matchException, (long)8403391173103822855L, (long)l);
                }
            }
            bY3.j = 1;
        }
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = bY.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public r_0 b(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        int n2 = (Integer)objectArray[1];
        Runnable runnable = (Runnable)objectArray[2];
        long l = (Long)objectArray[3];
        long l2 = (l = bY.l ^ l) ^ 0x40DCF2D717F7L;
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = l2;
        objectArray2[3] = runnable;
        objectArray2[2] = n2;
        objectArray2[1] = n;
        objectArray2[0] = null;
        return bY.a("\u00f2", (Object)this, (Object)objectArray2, (long)5633385721516336771L, (long)l);
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public r_0 c(Object[] objectArray) {
        Object object = objectArray[0];
        int n = (Integer)objectArray[1];
        int n2 = (Integer)objectArray[2];
        long l = (Long)objectArray[3];
        long l2 = (l = bY.l ^ l) ^ 0x5DFC0156DE45L;
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = l2;
        objectArray2[3] = null;
        objectArray2[2] = n2;
        objectArray2[1] = n;
        objectArray2[0] = object;
        return bY.a("\u00f2", (Object)this, (Object)objectArray2, (long)-8673981984290312399L, (long)l);
    }

    public boolean c(Object[] objectArray) {
        int n;
        block8: {
            block9: {
                Object object;
                block6: {
                    block7: {
                        long l = (Long)objectArray[0];
                        l = bY.l ^ l;
                        CallSite callSite = bY.a("a", (long)2702845458556135182L, (long)l);
                        try {
                            try {
                                try {
                                    object = bY.a("b", (long)2703292977890176212L, (long)l);
                                    if (callSite != null) break block6;
                                    if (object != false) break block7;
                                }
                                catch (MatchException matchException) {
                                    throw bY.a("a", (Object)matchException, (long)2703743482399488284L, (long)l);
                                }
                                n = this.j;
                                if (callSite != null) break block8;
                            }
                            catch (MatchException matchException) {
                                throw bY.a("a", (Object)matchException, (long)2703743482399488284L, (long)l);
                            }
                            if (n != 0) break block9;
                        }
                        catch (MatchException matchException) {
                            throw bY.a("a", (Object)matchException, (long)2703743482399488284L, (long)l);
                        }
                    }
                    object = 0;
                }
                return (boolean)object;
            }
            this.j = 0;
            n = 1;
        }
        return n != 0;
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

    private static Method h(long l, long l2) {
        int n = bY.e(l, l2);
        Object object = m[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = bY.n[n];
                int n3 = string2.indexOf(8);
                clazz3 = bY.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = bY.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = bY.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        bY.m[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = bY.f(932645484137861L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = bY.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        bY.m[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = bY.f(932645484137861L, 0L);
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

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = bY.e(l, l2);
            object = m[n];
            try {
                if (!(object instanceof String)) break block2;
                bY.m[n] = clazz = Class.forName(bY.n[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public r_0 d(Object[] objectArray) {
        bY bY2;
        long l;
        Runnable runnable;
        int n;
        int n2;
        Object object;
        block35: {
            block34: {
                Object object2;
                long l2;
                block33: {
                    CallSite callSite;
                    long l3;
                    block40: {
                        block31: {
                            block32: {
                                class_310 class_3102;
                                block30: {
                                    block29: {
                                        block36: {
                                            object = objectArray[0];
                                            n2 = (Integer)objectArray[1];
                                            n = (Integer)objectArray[2];
                                            runnable = (Runnable)objectArray[3];
                                            l = (Long)objectArray[4];
                                            long l4 = l = bY.l ^ l;
                                            l3 = l4 ^ 0x19EEE147C8BFL;
                                            l2 = l4 ^ 0x4251F52748CBL;
                                            callSite = bY.a("a", (long)7772199222265801040L, (long)l);
                                            if (bY.a("b", (long)7771540841521209994L, (long)l) != false) return r_0.REJECTED;
                                            class_3102 = b;
                                            if (callSite != null) break block29;
                                            break block36;
                                            catch (MatchException matchException) {
                                                throw bY.a("a", (Object)matchException, (long)7771992237454309186L, (long)l);
                                            }
                                        }
                                        try {
                                            block37: {
                                                if (bY.a("Y", (Object)class_3102, (long)7772350631756993292L, (long)l) == null) return r_0.REJECTED;
                                                break block37;
                                                catch (MatchException matchException) {
                                                    throw bY.a("a", (Object)matchException, (long)7771992237454309186L, (long)l);
                                                }
                                            }
                                            class_3102 = b;
                                        }
                                        catch (MatchException matchException) {
                                            throw bY.a("a", (Object)matchException, (long)7771992237454309186L, (long)l);
                                        }
                                    }
                                    if (callSite != null) break block30;
                                    try {
                                        block38: {
                                            if (bY.a("Y", (Object)class_3102, (long)7772520792150616263L, (long)l) == null) return r_0.REJECTED;
                                            break block38;
                                            catch (MatchException matchException) {
                                                throw bY.a("a", (Object)matchException, (long)7771992237454309186L, (long)l);
                                            }
                                        }
                                        class_3102 = b;
                                    }
                                    catch (MatchException matchException) {
                                        throw bY.a("a", (Object)matchException, (long)7771992237454309186L, (long)l);
                                    }
                                }
                                try {
                                    if (bY.a("Y", (Object)class_3102, (long)7772057305036053748L, (long)l) == null) {
                                        return r_0.REJECTED;
                                    }
                                }
                                catch (MatchException matchException) {
                                    throw bY.a("a", (Object)matchException, (long)7771992237454309186L, (long)l);
                                }
                                object2 = a;
                                if (callSite != null) break block31;
                                try {
                                    block39: {
                                        if (object2) break block32;
                                        break block39;
                                        catch (MatchException matchException) {
                                            throw bY.a("a", (Object)matchException, (long)7771992237454309186L, (long)l);
                                        }
                                    }
                                    Object[] objectArray2 = new Object[4];
                                    objectArray2[3] = l2;
                                    objectArray2[2] = bY.a("b", (long)7772872522963028593L, (long)l);
                                    objectArray2[1] = n;
                                    objectArray2[0] = n2;
                                    bY.a("a", (Object)objectArray2, (long)7771002482881211418L, (long)l);
                                    return r_0.IMMEDIATE;
                                }
                                catch (MatchException matchException) {
                                    throw bY.a("a", (Object)matchException, (long)7771992237454309186L, (long)l);
                                }
                            }
                            object2 = bY.a("\u00f2", (Object)b, (long)7773121172865515564L, (long)l);
                        }
                        if (callSite != null) break block33;
                        if (!object2) break block34;
                        break block40;
                        catch (MatchException matchException) {
                            throw bY.a("a", (Object)matchException, (long)7771992237454309186L, (long)l);
                        }
                    }
                    try {
                        block41: {
                            bY2 = this;
                            if (callSite != null) break block35;
                            break block41;
                            catch (MatchException matchException) {
                                throw bY.a("a", (Object)matchException, (long)7771992237454309186L, (long)l);
                            }
                        }
                        Object[] objectArray3 = new Object[1];
                        objectArray3[0] = l3;
                        object2 = bY.a("\u00f2", (Object)bY2, (Object)objectArray3, (long)7772590707005688760L, (long)l);
                    }
                    catch (MatchException matchException) {
                        throw bY.a("a", (Object)matchException, (long)7771992237454309186L, (long)l);
                    }
                }
                try {
                    if (object2) {
                        Object[] objectArray4 = new Object[4];
                        objectArray4[3] = l2;
                        objectArray4[2] = bY.a("b", (long)7772872522963028593L, (long)l);
                        objectArray4[1] = n;
                        objectArray4[0] = n2;
                        bY.a("a", (Object)objectArray4, (long)7771002482881211418L, (long)l);
                        return r_0.IMMEDIATE;
                    }
                }
                catch (MatchException matchException) {
                    throw bY.a("a", (Object)matchException, (long)7771992237454309186L, (long)l);
                }
            }
            bY2 = this;
        }
        bY bY3 = bY2;
        synchronized (bY2) {
            bY.a("\u00f2", (Object)this.d, (Object)new bZ(object, n2, n, runnable), (long)7765534655096352273L, (long)l);
            this.k = 0;
            // ** MonitorExit[var13_10] (shouldn't be in output)
            return r_0.QUEUED;
        }
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = bY.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = bY.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = bY.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = bY.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private boolean d(Object[] objectArray) {
        int n;
        block8: {
            block7: {
                CallSite callSite;
                long l;
                block6: {
                    l = (Long)objectArray[0];
                    l = bY.l ^ l;
                    callSite = bY.a("a", (long)-7971008394374507539L, (long)l);
                    try {
                        try {
                            n = this.f;
                            if (callSite != null) break block6;
                            if (n != 0) break block7;
                        }
                        catch (MatchException matchException) {
                            throw bY.a("a", (Object)matchException, (long)-7969535325954355713L, (long)l);
                        }
                        n = this.g;
                    }
                    catch (MatchException matchException) {
                        throw bY.a("a", (Object)matchException, (long)-7969535325954355713L, (long)l);
                    }
                }
                try {
                    if (callSite != null) break block8;
                    if (n != 0) break block7;
                }
                catch (MatchException matchException) {
                    throw bY.a("a", (Object)matchException, (long)-7969535325954355713L, (long)l);
                }
                n = 1;
                break block8;
            }
            n = 0;
        }
        return n != 0;
    }

    private static void a() {
        Object[] objectArray = m;
        m[0] = "\u001f$iS\u0015$\t$l\t\u00063\u001eoo\u000f\n'\u000f(x\u0018A53";
        objectArray[1] = "7X\u0015?PhBx\u001e0A'?`\r7HnW";
        objectArray[2] = "8\u000bI\b\u0014i.\u000bLR\u0007~9@OT\u000bj(\u0007XC@z0\u0007ZH\u001a7\f\u001cZU\u001ap;\u000b";
        objectArray[3] = Boolean.TYPE;
        bY.n[3] = "java/lang/Boolean";
        objectArray[4] = "p\u001b0p\u00058f\u001b5*\u0016/qP6,\u001a;`\u0017!;Q*M";
        objectArray[5] = "I\u001a\u0005S&SB\u0015\u0014\u001c\\WQ\u0014\u0004SjSF";
        objectArray[6] = "Bm\"\t}cBm5UqlX&5Kqy_We\u0016 ";
        objectArray[7] = "\u0015(jaP/\u0015(}=\\ \u000fc}#\\5\b\u0012){\u000b";
        objectArray[8] = "\u0001P\\\tL\b\u0001PKU@\u0007\u001b\u001bKK@\u0012\u001cj\u001e\u0014\u0019";
        objectArray[9] = "++A<Cm^\u000bJ3R\"?\u0005A8VxK";
        objectArray[10] = "o<GR\u000f!o<P\u000e\u0003.uwP\u0010\u0003;r\u0006\u0005OT";
        objectArray[11] = "\u00009{\u0001\u001e\u0010\u00009l]\u0012\u001f\u001arlC\u0012\n\u001d\u0003>\u0018BJ";
        objectArray[12] = "RE<_4\u0005LM&\u0010[\u0002JE3z\u007f\u0001MA";
        objectArray[13] = "$o+\bL /`:G-.$k>\u001d";
        objectArray[14] = "=\u0003wY\u0014\u001b+\u0003r\u0003\u0007\f<Hq\u0005\u000b\u0018-\u000ff\u0012@\b+";
        objectArray[15] = "\u001fG\rr\u000e`jg\u0006}\u001f/\u000bi\rv\u001bu\u007f";
        objectArray[16] = "XA3~T}XA$\"XrB\n$<XgE{v`\b,\u0003";
        objectArray[17] = "\u0018^ocD9\u0018^x?H6\u0002\u0015x!H#\u0005d)u\u001ca";
        objectArray[18] = "<\n8ql\u0016<\n/-`\u0019&A/3`\f!0~g5G";
        objectArray[19] = "\u0001\u0003G\u00144E\u0001\u0003PH8J\u001bHPV8_\u001c9\u0001\u0002m\u0014K\u0005_[*_0T\u000b\u000e`";
        objectArray[20] = "\u0006<OxzA\u00184U7\u001d@\t/Xm;F";
        objectArray[21] = "*A+lZ<4I1#8 3T";
        objectArray[22] = Void.TYPE;
        bY.n[22] = "java/lang/Void";
        objectArray[23] = Integer.TYPE;
        bY.n[23] = "java/lang/Integer";
        objectArray[24] = "3g\"\u001f\u0007S-o8POS7e \u0017FHwV&\u001bMO:g \u001b";
        objectArray[25] = "Ob \t7=:B+\u0006&r[L \r\"(/";
        objectArray[26] = "KZ9\\\u000b@@U(\u0013wYOU._II";
        objectArray[27] = "N&p^G\u0001;\u0006{QVNZ\bpZR\u0014.";
        objectArray[28] = "W)J2\u000eLA)Oh\u001d[VbLn\u0011OG%[yZN";
        objectArray[29] = "3\u0016! </%\u0016$z/82]'|#,#\u001a0kh=\u0018";
        objectArray[30] = ";\u0006\u0018x\u0016hN&\u0013w\u0007'/(\u0018|\u0003}[";
        objectArray[31] = "Y\u001d}z\u001d;\u001b]=!p1\b\u0016j@\u001f(R\u0002m-\u0001u\u0019X\u0007";
        objectArray[32] = "Zb\u0010\u0015\u001dyW}EOr,Wh\u0005xI~\r<}\u0015\u0017~\u00005\u0002\u0017\u000e{Q\r";
        objectArray[33] = "%P\br)xuVP\t,E>SMc!\u007f&T_\t";
        objectArray[34] = "\u0000L-\u0016E7\u0006B4\b5g9]%\u001c\b2\u0000\u0002/\u001aJ";
        objectArray[35] = "8^=2|Dh^,<AVe\\37\u0016\u0001;\u000bk[|U<H%k*\u00068U";
        objectArray[36] = "9w_\u000fM\b?}__u]?oQT\u0019ok)\n\rH8>y\t_\u0018\t2t\u000eBu";
        objectArray[37] = "\u0018R\u007f?f\u0003N\u0001{\"\u0014VHC'!xd\u0018\u0001}z\u0014\t@\u0006w~k\u000bY\u0003&F";
        objectArray[38] = "LS\u001fJG\u000b\u001cS\u000eDz\u0019\u0011Q\u0011O-NN\fJ#G\u0005\u0019\u0007\u0012\u001e\u0019\u0013\u0012\u0005";
        objectArray[39] = "v\u000b,(r\u00004T+1\fTMW,2=@.Or<t8wV{c4GuO~2\f";
        objectArray[40] = "F8E|SgK'\u0010&<2K2P\u0011\u0007`\u0012l(|Y`\u001coW~@eMW";
        objectArray[41] = "`BJj\u001c\th\u0003Hq'\rd\u0003bcW\u0011\rBA7\u0017Ur@X2Fm";
        objectArray[42] = "\u0004(`\u0012PuFh I=eO\u001c\u007fPAu4k\u007f\u0011\r<Kif\u0014\\\u0004";
        objectArray[43] = "k\t\u0002Kb\b+HR\u0001\u000f\u000f:T\u0006\u001dX^d\b[q?Q;\u0003\u000f\u0018\u007f\u0010kI";
        objectArray[44] = "\u0003(\fO^\u0019AhL\u00143\u0012^4\u0011\u000b^)]Q\u0019\bW\u0004Q>\u0018\u0013\nU3k\u0013L\u0003PLi\nIRh";
        objectArray[45] = "*=\u0001KE\u0003'\"T\u0011*V'7\u0014&\u0011\u0004~klKO\u0004pj\u0013IV\u0001!R";
        objectArray[46] = "wL-\u0016r\u001c'L<\u0018O\u0005&_'\u0018#7r\u0013wBs`qF~Ow\u001fs_{\u001eO";
        objectArray[47] = "wiX6}\u0016\u007foZ9\u001e\bk34>\u007f\u001b}<L!\u007fKnU";
        objectArray[48] = "\u0001IF|G\n\u0011LB|vXhFMaGM\u000b^\u0013o\u000e5RG\u001a0NJP^\u001fav";
        objectArray[49] = "\u001dcac\u001d4A-g1!:\u000bQ;%]*p&;d\u0011c\u000f$\"a@[";
        objectArray[50] = "Kd\u0015\u0016WB\t;\u0012\u000f)\u0016p8\u0015\f\u0018\u0002\u0013 K\u0002Qz\u00128\u0012\u0004YF\u001ff\u0007])";
        objectArray[51] = "P\u001aAlLa\\\u0017Fq!>]\u001d\u001dlvi\u0006AI9!<VH\u0015m\u00100[O\b";
        objectArray[52] = "33?\u000f\u007fW;r=\u0014DU3y-ku\r:g?V~\u0002>iQ";
        objectArray[53] = "r&p:sQ-,vxL\u0001\u0011!{f}\u0010r9%h4h\u007f$|l%\u0010`$,\u007fL";
        objectArray[54] = "\n\u0013\u0006cVw\u001dY^/3z\u0006M\u001fD\b(Z\u0019gy\\|[GYtC)\u0001(";
        objectArray[55] = "$G_qGyx\tY#{}-U\t5{x(Q\u000b&\u0003g(\u0001\u0018O";
        objectArray[56] = "/ 1\u0007tj).(\u0019\u0004/\u0016h?Q4hij&Te";
        objectArray[57] = "I5J<|1D*\u001ff\u0013dD?_Q(6\u001d`'<v6\u0013bX>o3BZ";
        objectArray[58] = "w2_GX*z-\n\u001d7\u007fz8J*\f-#e2GR--eMEK(|]";
        objectArray[59] = ",\u001c\u0005]0O \u0011\u0002@]\u0010!\u001bY]\nGzG\r\f]\u0012*NQ\\l\u001e'IL";
        objectArray[60] = "\u000e\u001f+4E&RQ-fy \u000f\f\u0014;G-\r\u000e)0H)\u0003`.o@y[\u001f,vE(c";
        objectArray[61] = "h\u0018~y]9*Gy`#kSD~c\u0012y0\\ m[\u0001=AyiJy\"A)z#";
        objectArray[62] = "b\u001abJy\\ EeS\u0007\rY\u0019wH|\u0006%P6PidbYuJe\u0018+\u0018m_\u0007";
        objectArray[63] = "*N\u0002d\u001a\u0015zN\u0013j'\u0007wL\fapP)\u001fQ\r\u0018S(E\u0001jD\u0016kB";
        objectArray[64] = "\n4\u0006]>3HtF\u0006S)^ \u0015\u001dS,[$\u0017\u000e+3[t\u0004g";
        objectArray[65] = "! *p*\u0017}n,\"\u0016\u001902o'j\u001f6_xtx\u001cw;p5z\u0007L";
        Object[] objectArray2 = objectArray;
        objectArray[66] = "\u001fEX\u0018>l]\u0005\u0018CStCP\"\u0013myAR\u001f\u0018b}O<\u0018Gj-\u0017C\u001a^o|/";
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @bP
    public void a(a5 a52) {
        long l = bY.l ^ 0x46728D4E724DL;
        bY bY2 = this;
        synchronized (bY2) {
            bY.a("\u00f2", (Object)this.d, (long)4638528470145875365L, (long)l);
            this.k = 0;
        }
        bY.a("\u00f2", (Object)this.e, (long)4630440297523548037L, (long)l);
        this.f = 0;
        this.g = 0;
        this.h = 0;
        this.i = 0;
        this.j = 0;
    }

    public void a(Object[] objectArray) {
        block42: {
            Object object;
            block39: {
                block41: {
                    block40: {
                        class_2596 class_25962;
                        class_2851 class_28512;
                        CallSite callSite;
                        long l;
                        block38: {
                            boolean bl;
                            class_2596 class_25963;
                            block33: {
                                block37: {
                                    block34: {
                                        CallSite callSite2;
                                        CallSite callSite3;
                                        block35: {
                                            class_25963 = (class_2596)objectArray[0];
                                            l = (Long)objectArray[1];
                                            l = bY.l ^ l;
                                            callSite = bY.a("a", (long)7843691039574617686L, (long)l);
                                            try {
                                                bl = class_25963 instanceof class_2848;
                                                if (callSite != null) break block33;
                                                if (!bl) break block34;
                                            }
                                            catch (MatchException matchException) {
                                                throw bY.a("a", (Object)matchException, (long)7844616005479608388L, (long)l);
                                            }
                                            class_28512 = (class_2848)class_25963;
                                            try {
                                                try {
                                                    block36: {
                                                        try {
                                                            try {
                                                                callSite3 = bY.a("\u00f2", (Object)class_28512, (long)7843872447083064676L, (long)l);
                                                                callSite2 = bY.a("b", (long)7844954956518758597L, (long)l);
                                                                if (callSite != null) break block35;
                                                                if (callSite3 != callSite2) break block36;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw bY.a("a", (Object)matchException, (long)7844616005479608388L, (long)l);
                                                            }
                                                            this.f = 1;
                                                            if (callSite == null) break block34;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw bY.a("a", (Object)matchException, (long)7844616005479608388L, (long)l);
                                                        }
                                                    }
                                                    class_25962 = class_28512;
                                                    if (callSite != null) break block37;
                                                }
                                                catch (MatchException matchException) {
                                                    throw bY.a("a", (Object)matchException, (long)7844616005479608388L, (long)l);
                                                }
                                                callSite3 = bY.a("\u00f2", (Object)class_25962, (long)7843872447083064676L, (long)l);
                                                callSite2 = bY.a("b", (long)7844382174399418825L, (long)l);
                                            }
                                            catch (MatchException matchException) {
                                                throw bY.a("a", (Object)matchException, (long)7844616005479608388L, (long)l);
                                            }
                                        }
                                        try {
                                            if (callSite3 == callSite2) {
                                                this.f = 0;
                                            }
                                        }
                                        catch (MatchException matchException) {
                                            throw bY.a("a", (Object)matchException, (long)7844616005479608388L, (long)l);
                                        }
                                    }
                                    class_25962 = class_25963;
                                }
                                try {
                                    if (callSite != null) break block38;
                                    bl = class_25962 instanceof class_2851;
                                }
                                catch (MatchException matchException) {
                                    throw bY.a("a", (Object)matchException, (long)7844616005479608388L, (long)l);
                                }
                            }
                            if (!bl) break block42;
                            class_25962 = class_25963;
                        }
                        class_28512 = (class_2851)class_25962;
                        CallSite callSite4 = bY.a("\u00f2", (Object)class_28512, (long)7845155305932636650L, (long)l);
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            bY bY2 = this;
                                                            object = bY.a("\u00f2", (Object)callSite4, (long)7843605295424138760L, (long)l);
                                                            if (callSite != null) break block39;
                                                            if (object != false) break block40;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw bY.a("a", (Object)matchException, (long)7844616005479608388L, (long)l);
                                                        }
                                                        object = bY.a("\u00f2", (Object)callSite4, (long)7844296339539137032L, (long)l);
                                                        if (callSite != null) break block39;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw bY.a("a", (Object)matchException, (long)7844616005479608388L, (long)l);
                                                    }
                                                    if (object != false) break block40;
                                                }
                                                catch (MatchException matchException) {
                                                    throw bY.a("a", (Object)matchException, (long)7844616005479608388L, (long)l);
                                                }
                                                object = bY.a("\u00f2", (Object)callSite4, (long)7843382989861012256L, (long)l);
                                                if (callSite != null) break block39;
                                            }
                                            catch (MatchException matchException) {
                                                throw bY.a("a", (Object)matchException, (long)7844616005479608388L, (long)l);
                                            }
                                            if (object != false) break block40;
                                        }
                                        catch (MatchException matchException) {
                                            throw bY.a("a", (Object)matchException, (long)7844616005479608388L, (long)l);
                                        }
                                        object = bY.a("\u00f2", (Object)callSite4, (long)7844224006897959062L, (long)l);
                                        if (callSite != null) break block39;
                                    }
                                    catch (MatchException matchException) {
                                        throw bY.a("a", (Object)matchException, (long)7844616005479608388L, (long)l);
                                    }
                                    if (object != false) break block40;
                                }
                                catch (MatchException matchException) {
                                    throw bY.a("a", (Object)matchException, (long)7844616005479608388L, (long)l);
                                }
                                object = bY.a("\u00f2", (Object)callSite4, (long)7843069891360164408L, (long)l);
                                if (callSite != null) break block39;
                            }
                            catch (MatchException matchException) {
                                throw bY.a("a", (Object)matchException, (long)7844616005479608388L, (long)l);
                            }
                            if (object == false) break block41;
                        }
                        catch (MatchException matchException) {
                            throw bY.a("a", (Object)matchException, (long)7844616005479608388L, (long)l);
                        }
                    }
                    object = 1;
                    break block39;
                }
                object = 0;
            }
            bY2.g = object;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = bY.l ^ l;
        bY bY2 = this;
        synchronized (bY2) {
            Object object;
            block5: {
                block6: {
                    CallSite callSite = bY.a("a", (long)-7644838093922527388L, (long)l);
                    try {
                        object = bY.a("\u00f2", (Object)this.d, (long)-7644066168795772687L, (long)l);
                        if (callSite != null) break block5;
                        if (object != false) break block6;
                    }
                    catch (MatchException matchException) {
                        throw bY.a("a", (Object)matchException, (long)-7642648693674784394L, (long)l);
                    }
                    object = 1;
                    break block5;
                }
                object = 0;
            }
            return (boolean)object;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     */
    public int a(Object[] objectArray) {
        Object object = objectArray[0];
        long l = (Long)objectArray[1];
        l = bY.l ^ l;
        CallSite callSite = bY.a("a", (long)-8526605767795766489L, (long)l);
        try {
            if (object == null) {
                return 0;
            }
        }
        catch (MatchException matchException) {
            throw bY.a("a", (Object)matchException, (long)-8526256399724161739L, (long)l);
        }
        bY bY2 = this;
        synchronized (bY2) {
            Object object2;
            block22: {
                CallSite callSite2;
                block23: {
                    block29: {
                        block28: {
                            block27: {
                                block26: {
                                    block25: {
                                        block24: {
                                            CallSite callSite3 = bY.a("\u00f2", (Object)this.d, (long)-8528470454331008051L, (long)l);
                                            bY.a("\u00f2", (Object)this.d, arg_0 -> bY.lambda$cancelQueued$0(object, arg_0), (long)-8527500605115060786L, (long)l);
                                            callSite2 = callSite3 - bY.a("\u00f2", (Object)this.d, (long)-8528470454331008051L, (long)l);
                                            object2 = callSite2;
                                            if (callSite != null) break block22;
                                            if (object2 <= 0) break block23;
                                            break block24;
                                            catch (MatchException matchException) {
                                                throw bY.a("a", (Object)matchException, (long)-8526256399724161739L, (long)l);
                                            }
                                        }
                                        object2 = bY.a("\u00f2", (Object)this.d, (long)-8527091820872870734L, (long)l);
                                        if (callSite != null) break block22;
                                        break block25;
                                        catch (MatchException matchException) {
                                            throw bY.a("a", (Object)matchException, (long)-8526256399724161739L, (long)l);
                                        }
                                    }
                                    if (object2 == false) break block23;
                                    break block26;
                                    catch (MatchException matchException) {
                                        throw bY.a("a", (Object)matchException, (long)-8526256399724161739L, (long)l);
                                    }
                                }
                                this.k = 0;
                                object2 = this.i;
                                if (callSite != null) break block22;
                                break block27;
                                catch (MatchException matchException) {
                                    throw bY.a("a", (Object)matchException, (long)-8526256399724161739L, (long)l);
                                }
                            }
                            if (object2 == false) break block23;
                            break block28;
                            catch (MatchException matchException) {
                                throw bY.a("a", (Object)matchException, (long)-8526256399724161739L, (long)l);
                            }
                        }
                        object2 = this.h;
                        if (callSite != null) break block22;
                        break block29;
                        catch (MatchException matchException) {
                            throw bY.a("a", (Object)matchException, (long)-8526256399724161739L, (long)l);
                        }
                    }
                    try {
                        block30: {
                            if (object2 == false) break block23;
                            break block30;
                            catch (MatchException matchException) {
                                throw bY.a("a", (Object)matchException, (long)-8526256399724161739L, (long)l);
                            }
                        }
                        this.j = 1;
                    }
                    catch (MatchException matchException) {
                        throw bY.a("a", (Object)matchException, (long)-8526256399724161739L, (long)l);
                    }
                }
                object2 = callSite2;
            }
            return (int)object2;
        }
    }

    public r_0 a(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        int n2 = (Integer)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = (l = bY.l ^ l) ^ 0x311373B9F8ECL;
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = l2;
        objectArray2[3] = null;
        objectArray2[2] = n2;
        objectArray2[1] = n;
        objectArray2[0] = null;
        return bY.a("\u00f2", (Object)this, (Object)objectArray2, (long)-6830060983624152680L, (long)l);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/bY" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @bP
    public void a(bG var1_1) {
        block40: {
            block38: {
                block39: {
                    v0 = var2_2 = bY.l ^ 57730660309725L;
                    var4_3 = v0 ^ 15961671895988L;
                    var6_4 = v0 ^ 102132306505292L;
                    var8_5 = bY.a("a", (long)2942945578272107099L, (long)var2_2);
                    try {
                        v1 = bY.a("b", (long)2941158776088076673L, (long)var2_2);
                        if (var8_5 != null) break block38;
                        if (v1 == false) break block39;
                    }
                    catch (Throwable v2) {
                        throw bY.a("a", (Object)v2, (long)2941060192449721417L, (long)var2_2);
                    }
                    return;
                }
                try {
                    v3 = this;
                    if (var8_5 != null) break block40;
                    v1 = bY.a("\u00f2", (Object)v3.e, (long)2941806647940874405L, (long)var2_2);
                }
                catch (Throwable v4) {
                    throw bY.a("a", (Object)v4, (long)2941060192449721417L, (long)var2_2);
                }
            }
            if (v1 == false) {
                var9_6 = new ArrayList<E>(this.e);
                bY.a("\u00f2", (Object)this.e, (long)2941644512067708693L, (long)var2_2);
                var10_8 = bY.a("\u00f2", var9_6, (long)2940677849834868288L, (long)var2_2);
                while (bY.a("\u00f2", (Object)var10_8, (long)2942373265336026829L, (long)var2_2) != false) {
                    var11_9 = (Runnable)bY.a("\u00f2", (Object)var10_8, (long)2941436869744564017L, (long)var2_2);
                    try {
                        bY.a("\u00f2", (Object)var11_9, (long)2942208610213038585L, (long)var2_2);
                    }
                    catch (Throwable var12_10) {
                        // empty catch block
                    }
                    if (var8_5 == null) continue;
                }
            }
            v3 = this;
        }
        var10_8 = v3;
        synchronized (v3) {
            block45: {
                block44: {
                    block43: {
                        block47: {
                            block42: {
                                v5 = bY.a("\u00f2", (Object)this.d, (long)2942459661962474958L, (long)var2_2);
                                if (var8_5 == null) {
                                    v5 = v5 == false ? (Object)1 : (Object)0;
                                }
                                var9_7 = v5;
                                if (var8_5 != null) break;
                                try {
                                    block46: {
                                        if (var9_7 != false) break block42;
                                        break block46;
                                        catch (Throwable v6) {
                                            throw bY.a("a", (Object)v6, (long)2941060192449721417L, (long)var2_2);
                                        }
                                    }
                                    this.k = 0;
                                }
                                catch (Throwable v7) {
                                    throw bY.a("a", (Object)v7, (long)2941060192449721417L, (long)var2_2);
                                }
                            }
                            // ** MonitorExit[var10_8] (shouldn't be in output)
                            if (var9_7 == false) ** GOTO lbl85
                            v8 = bY.b;
                            if (var8_5 != null) break block43;
                            break block47;
                            catch (Throwable v9) {
                                throw bY.a("a", (Object)v9, (long)2941060192449721417L, (long)var2_2);
                            }
                        }
                        try {
                            block48: {
                                if (bY.a("Y", (Object)v8, (long)2943094466483310599L, (long)var2_2) == null) ** GOTO lbl85
                                break block48;
                                catch (Throwable v10) {
                                    throw bY.a("a", (Object)v10, (long)2941060192449721417L, (long)var2_2);
                                }
                            }
                            v8 = bY.b;
                        }
                        catch (Throwable v11) {
                            throw bY.a("a", (Object)v11, (long)2941060192449721417L, (long)var2_2);
                        }
                    }
                    try {
                        if (bY.a("Y", (Object)v8, (long)2942712100288916428L, (long)var2_2) != null) break block44;
lbl85:
                        // 3 sources

                        return;
                    }
                    catch (Throwable v12) {
                        throw bY.a("a", (Object)v12, (long)2941060192449721417L, (long)var2_2);
                    }
                }
                v13 = new Object[1];
                v13[0] = var4_3;
                v14 /* !! */  = bY.a("\u00f2", (Object)this, (Object)v13, (long)2942782929419159731L, (long)var2_2);
                if (var8_5 != null) ** GOTO lbl116
                try {
                    block49: {
                        if (v14 /* !! */  == false) break block45;
                        break block49;
                        catch (Throwable v15) {
                            throw bY.a("a", (Object)v15, (long)2941060192449721417L, (long)var2_2);
                        }
                    }
                    v16 = new Object[1];
                    v16[0] = var6_4;
                    bY.a("\u00f2", (Object)this, (Object)v16, (long)2940962019936125423L, (long)var2_2);
                    return;
                }
                catch (Throwable v17) {
                    throw bY.a("a", (Object)v17, (long)2941060192449721417L, (long)var2_2);
                }
            }
            var10_8 = this;
            synchronized (var10_8) {
                block50: {
                    ++this.k;
                    v18 = this;
                    if (var8_5 != null) break block50;
                    v14 /* !! */  = (CallSite)v18.k;
lbl116:
                    // 2 sources

                    try {
                        if (v14 /* !! */  > 5) {
                            bY.a("\u00f2", (Object)this.d, (long)2940621732447966517L, (long)var2_2);
                            this.k = 0;
                        }
                    }
                    catch (Throwable v19) {
                        throw bY.a("a", (Object)v19, (long)2941060192449721417L, (long)var2_2);
                    }
                    v18 = var10_8;
                }
                // ** MonitorExit[v18] (shouldn't be in output)
                return;
            }
        }
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    private static Field g(long l, long l2) {
        int n = bY.e(l, l2);
        Object object = m[n];
        if (object instanceof String) {
            String string = bY.n[n];
            int n2 = string.indexOf(8);
            Class clazz = bY.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = bY.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = bY.c(clazz3, string2, clazz2)) != null) {
                    bY.m[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = bY.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        bY.m[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = bY.f(932645484137861L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static boolean lambda$cancelQueued$0(Object object, bZ bZ2) {
        boolean bl;
        try {
            bl = bZ2.a == object;
        }
        catch (MatchException matchException) {
            throw bY.a(matchException);
        }
        return bl;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(bY.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.cP;
import dev.zprestige.prestige.cQ;
import dev.zprestige.prestige.cz_0;
import dev.zprestige.prestige.dK;
import dev.zprestige.prestige.dL;
import dev.zprestige.prestige.dM;
import dev.zprestige.prestige.dU;
import dev.zprestige.prestige.hc;
import dev.zprestige.prestige.i_0;
import dev.zprestige.prestige.q_0;
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
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class dV
extends dU
implements cz_0 {
    private final List c;
    private final dM d;
    private String e;
    private final dL f;
    private i_0 g;
    private String h;
    private boolean i;
    private volatile List j;
    private static final long cb = hc.a(4277466749375548578L, -8772244131286752704L, MethodHandles.lookup().lookupClass()).a(102709529679391L);
    private static final String[] eb;
    private static final String[] fb;
    private static final Map gb;
    private static final Object[] ub;
    private static final String[] vb;

    public dV() {
        long l = cb ^ 0x280D95460D3BL;
        this.c = new ArrayList();
        this.d = new dM((String)((Object)dV.a("g", (int)32696, (long)(0x7086103BFB6DFBF8L ^ l))), false);
        this.f = dV.g("g", (Object)new dL((String)((Object)dV.a("g", (int)23233, (long)(0x365C028C2F1CDE83L ^ l))), -1), (Object)((String)((Object)dV.a("g", (int)16136, (long)(0x25D7EE1BDFB0BB49L ^ l))) + this.e), (long)-1880189377811364368L, (long)l);
        dV.g("g", (Object)this.c, (Object)this.d, (long)-1879233853156380959L, (long)l);
        dV.g("g", (Object)this.c, (Object)this.f, (long)-1879233853156380959L, (long)l);
    }

    public dV(String string, String string2, int n) {
        long l = cb ^ 0x474C8548982EL;
        this();
        this.e = string;
        this.h = string2;
        CallSite callSite = dV.g("U", (long)8135392033842036709L, (long)l);
        CallSite callSite2 = dV.g("U", (long)8134890427121085985L, (long)l);
        int n2 = ((CallSite)callSite2).length;
        int n3 = 0;
        while (n3 < n2) {
            block7: {
                CallSite callSite3 = callSite2[n3];
                try {
                    block8: {
                        try {
                            try {
                                if (callSite != null) break block7;
                                if (dV.g("g", (Object)callSite3, (long)8141646592271424022L, (long)l) != n) break block8;
                            }
                            catch (MatchException matchException) {
                                throw dV.g("U", (Object)matchException, (long)8141958620807303356L, (long)l);
                            }
                            this.g = callSite3;
                            if (callSite == null) break;
                        }
                        catch (MatchException matchException) {
                            throw dV.g("U", (Object)matchException, (long)8141958620807303356L, (long)l);
                        }
                    }
                    ++n3;
                }
                catch (MatchException matchException) {
                    throw dV.g("U", (Object)matchException, (long)8141958620807303356L, (long)l);
                }
            }
            if (callSite == null) continue;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        ub = new Object[97];
        vb = new String[97];
        dV.g();
        gb = new HashMap(13);
        long l = cb ^ 0x7D325C72E6FAL;
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
        String[] stringArray = new String[3];
        int n = 0;
        String string = "\u00a2\u00a8\u000e\u009c\u000f>\u00ecl\u0089\u00aa\u008e\u00bf\u00fb\u00c4\u00db<\u0018}\u00c3\u00ef\u00ea\u0087\u00e2\u0098\tA\u00a0\u0010+\u000b\u008d\u008a\u00ed\u009f\u00e9\u00d9A\u00d9\u00ff\u00c5\u00d7\u0010fo\u00a8\u00fe2?\u0099\u00a5=\u00b9\u00b4~\u0083\u00afo\u00ec";
        int n2 = "\u00a2\u00a8\u000e\u009c\u000f>\u00ecl\u0089\u00aa\u008e\u00bf\u00fb\u00c4\u00db<\u0018}\u00c3\u00ef\u00ea\u0087\u00e2\u0098\tA\u00a0\u0010+\u000b\u008d\u008a\u00ed\u009f\u00e9\u00d9A\u00d9\u00ff\u00c5\u00d7\u0010fo\u00a8\u00fe2?\u0099\u00a5=\u00b9\u00b4~\u0083\u00afo\u00ec".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = dV.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                eb = stringArray;
                fb = new String[3];
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    public void e(Object[] objectArray) {
        long l = (Long)objectArray[0];
    }

    private static Field e(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static Method e(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    private static int i(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (vb[n3] != null) {
            return n3;
        }
        Object object = ub[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 27;
            case 1 -> 8;
            case 2 -> 21;
            case 3 -> 20;
            case 4 -> 3;
            case 5 -> 62;
            case 6 -> 30;
            case 7 -> 23;
            case 8 -> 12;
            case 9 -> 33;
            case 10 -> 32;
            case 11 -> 34;
            case 12 -> 47;
            case 13 -> 58;
            case 14 -> 7;
            case 15 -> 10;
            case 16 -> 0;
            case 17 -> 9;
            case 18 -> 54;
            case 19 -> 52;
            case 20 -> 48;
            case 21 -> 60;
            case 22 -> 61;
            case 23 -> 25;
            case 24 -> 39;
            case 25 -> 38;
            case 26 -> 18;
            case 27 -> 29;
            case 28 -> 4;
            case 29 -> 56;
            case 30 -> 57;
            case 31 -> 44;
            case 32 -> 50;
            case 33 -> 15;
            case 34 -> 26;
            case 35 -> 36;
            case 36 -> 45;
            case 37 -> 22;
            case 38 -> 6;
            case 39 -> 1;
            case 40 -> 49;
            case 41 -> 24;
            case 42 -> 5;
            case 43 -> 37;
            case 44 -> 41;
            case 45 -> 16;
            case 46 -> 13;
            case 47 -> 31;
            case 48 -> 55;
            case 49 -> 40;
            case 50 -> 46;
            case 51 -> 53;
            case 52 -> 19;
            case 53 -> 42;
            case 54 -> 2;
            case 55 -> 14;
            case 56 -> 28;
            case 57 -> 59;
            case 58 -> 51;
            case 59 -> 43;
            case 60 -> 11;
            case 61 -> 63;
            case 62 -> 35;
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
        dV.vb[n3] = new String(cArray);
        return n3;
    }

    public void i(Object[] objectArray) {
        boolean bl = (Boolean)objectArray[0];
        this.i = bl;
    }

    public dL b(Object[] objectArray) {
        return this.f;
    }

    public int b(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = cb ^ l;
        return (int)dV.g("g", (Object)((Integer)((Object)dV.g("g", (Object)this.f, (long)6390338853813405246L, (long)l))), (long)6388857927868493062L, (long)l);
    }

    @cP
    public String b() {
        return this.e;
    }

    public boolean b(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return true;
    }

    /*
     * Unable to fully structure code
     */
    public void b(Object[] var1_1) {
        block27: {
            block28: {
                block24: {
                    block25: {
                        var2_2 = (Long)var1_1[0];
                        v0 = var2_2 = dV.cb ^ var2_2;
                        var4_3 = v0 ^ 120644081699938L;
                        var6_4 = v0 ^ 89278968246339L;
                        var8_5 = v0 ^ 83365083665475L;
                        var10_6 = v0 ^ 139299437470884L;
                        var12_7 = v0 ^ 28865644895877L;
                        var14_8 = v0 ^ 17947047808544L;
                        var16_9 = v0 ^ 27105383311484L;
                        var18_10 = dV.g("U", (long)-483626515587926454L, (long)var2_2);
                        try {
                            block26: {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    if (var18_10 != null) break block24;
                                                    if (dV.g("g", (Object)this, (long)-483185658693234070L, (long)var2_2) != false) {
                                                    }
                                                    ** GOTO lbl62
                                                }
                                                catch (MatchException v1) {
                                                    throw dV.g("U", (Object)v1, (long)-481484977574274797L, (long)var2_2);
                                                }
                                                v2 = new Object[2];
                                                v2[1] = var6_4;
                                                v2[0] = this;
                                                dV.g("g", (Object)dV.g("F", (long)-484114404816779751L, (long)var2_2), (Object)v2, (long)-480062932292224882L, (long)var2_2);
                                                if (var18_10 != null) break block25;
                                            }
                                            catch (MatchException v3) {
                                                throw dV.g("U", (Object)v3, (long)-481484977574274797L, (long)var2_2);
                                            }
                                            if (dV.g("\u00d2", (Object)dV.b, (long)-483884593546354544L, (long)var2_2) == null) break block26;
                                        }
                                        catch (MatchException v4) {
                                            throw dV.g("U", (Object)v4, (long)-481484977574274797L, (long)var2_2);
                                        }
                                        if (dV.g("\u00d2", (Object)dV.b, (long)-484060990284390852L, (long)var2_2) == null) break block26;
                                    }
                                    catch (MatchException v5) {
                                        throw dV.g("U", (Object)v5, (long)-481484977574274797L, (long)var2_2);
                                    }
                                    v6 = new Object[1];
                                    v6[0] = var8_5;
                                    dV.g("g", (Object)this, (Object)v6, (long)-480737666032115702L, (long)var2_2);
                                    if (var18_10 == null) break block27;
                                }
                                catch (MatchException v7) {
                                    throw dV.g("U", (Object)v7, (long)-481484977574274797L, (long)var2_2);
                                }
                            }
                            v8 = new Object[2];
                            v8[1] = var12_7;
                            v8[0] = this;
                            dV.g("g", (Object)dV.g("F", (long)-483241929962364492L, (long)var2_2), (Object)v8, (long)-479993605768294541L, (long)var2_2);
                        }
                        catch (MatchException v9) {
                            throw dV.g("U", (Object)v9, (long)-481484977574274797L, (long)var2_2);
                        }
                    }
                    try {
                        if (var18_10 == null) break block27;
lbl62:
                        // 2 sources

                        v10 = new Object[2];
                        v10[1] = var4_3;
                        v10[0] = this;
                        dV.g("g", (Object)dV.g("F", (long)-484114404816779751L, (long)var2_2), (Object)v10, (long)-480136838235382186L, (long)var2_2);
                    }
                    catch (MatchException v11) {
                        throw dV.g("U", (Object)v11, (long)-481484977574274797L, (long)var2_2);
                    }
                }
                try {
                    try {
                        v12 = dV.b;
                        if (var18_10 != null) break block28;
                        if (dV.g("\u00d2", (Object)v12, (long)-483884593546354544L, (long)var2_2) != null) {
                        }
                        ** GOTO lbl96
                    }
                    catch (MatchException v13) {
                        throw dV.g("U", (Object)v13, (long)-481484977574274797L, (long)var2_2);
                    }
                    v12 = dV.b;
                }
                catch (MatchException v14) {
                    throw dV.g("U", (Object)v14, (long)-481484977574274797L, (long)var2_2);
                }
            }
            try {
                block29: {
                    try {
                        if (dV.g("\u00d2", (Object)v12, (long)-484060990284390852L, (long)var2_2) == null) break block29;
                        v15 = new Object[1];
                        v15[0] = var14_8;
                        dV.g("g", (Object)this, (Object)v15, (long)-480674173790865581L, (long)var2_2);
                        if (var18_10 == null) break block27;
                    }
                    catch (MatchException v16) {
                        throw dV.g("U", (Object)v16, (long)-481484977574274797L, (long)var2_2);
                    }
                }
                v17 = new Object[2];
                v17[1] = var16_9;
                v17[0] = this;
                dV.g("g", (Object)dV.g("F", (long)-483241929962364492L, (long)var2_2), (Object)v17, (long)-481758287178172768L, (long)var2_2);
            }
            catch (MatchException v18) {
                throw dV.g("U", (Object)v18, (long)-481484977574274797L, (long)var2_2);
            }
        }
        v19 = new Object[2];
        v19[1] = var10_6;
        v19[0] = this;
        dV.g("U", (Object)v19, (long)-480784506895619482L, (long)var2_2);
    }

    private static MatchException b(MatchException matchException) {
        return matchException;
    }

    @cP
    public List b() {
        List list;
        block2: {
            Object object;
            block3: {
                long l = cb ^ 0x2B6FB7FE3CD7L;
                object = this.j;
                CallSite callSite = dV.g("U", (long)-3161566724054787300L, (long)l);
                try {
                    list = object;
                    if (callSite != null) break block2;
                    if (list != null) break block3;
                }
                catch (MatchException matchException) {
                    throw dV.g("U", (Object)matchException, (long)-3168458150268324795L, (long)l);
                }
                ArrayList arrayList = new ArrayList((int)(dV.g("g", (Object)this.c, (long)-3169495394750993050L, (long)l) + dV.g("g", (Object)this.a, (long)-3162381274270592325L, (long)l)));
                dV.g("g", arrayList, (Object)this.c, (long)-3162110905310806978L, (long)l);
                dV.g("g", arrayList, (Object)this.a, (long)-3162110905310806978L, (long)l);
                this.j = object = dV.g("U", arrayList, (long)-3167389200736209320L, (long)l);
            }
            list = object;
        }
        return list;
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = dV.c(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public boolean c(Object[] objectArray) {
        return this.i;
    }

    public void c(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = cb ^ l;
        this.e = null;
        this.h = null;
        ArrayList arrayList = new ArrayList();
        CallSite callSite = dV.g("U", (long)2790187023637096891L, (long)l);
        dV.g("g", arrayList, (Object)this.a, (long)2790887049541068295L, (long)l);
        dV.g("g", arrayList, (Object)this.c, (long)2790887049541068295L, (long)l);
        CallSite callSite2 = dV.g("g", arrayList, (long)2783786590009079574L, (long)l);
        while (dV.g("g", (Object)callSite2, (long)2784441707254128543L, (long)l) != false) {
            dK dK2 = (dK)((Object)dV.g("g", (Object)callSite2, (long)2785068811792172934L, (long)l));
            dV.g("g", (Object)dK2, (Object)new Object[]{null}, (long)2783926158082183536L, (long)l);
            dV.g("g", (Object)dK2, null, (long)2790256801855891270L, (long)l);
            dV.g("g", (Object)dK2, null, (long)2785146072895073310L, (long)l);
            if (callSite == null) continue;
        }
    }

    @cP
    public int c() {
        long l = cb ^ 0x79E44B5C157CL;
        long l2 = l ^ 0x704F9FB823B8L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        CallSite callSite = dV.g("g", (Object)this, (Object)objectArray, (long)-168860342433077396L, (long)l);
        int n = 0;
        CallSite callSite2 = dV.g("g", (Object)callSite, (long)-164426606121630281L, (long)l);
        CallSite callSite3 = dV.g("U", (long)-165356260967386441L, (long)l);
        while (dV.g("g", (Object)callSite2, (long)-168770700809091949L, (long)l) != false) {
            block6: {
                q_0 q_02 = (q_0)((Object)dV.g("g", (Object)callSite2, (long)-168119314110899062L, (long)l));
                try {
                    try {
                        if (callSite3 != null) break block6;
                        if (q_02 == q_0.Any) {
                            continue;
                        }
                    }
                    catch (MatchException matchException) {
                        throw dV.g("U", (Object)matchException, (long)-167703481204695570L, (long)l);
                    }
                }
                catch (MatchException matchException) {
                    throw dV.g("U", (Object)matchException, (long)-167703481204695570L, (long)l);
                }
                n |= 1 << dV.g("g", (Object)((Object)q_02), (long)-164562481377319350L, (long)l);
            }
            if (callSite3 == null) continue;
        }
        return n;
    }

    @cP
    public String c() {
        return this.h;
    }

    private static MethodHandle c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00d2' || c == 'B' || c == 'F' || c == '\u00c5') {
                field = dV.k(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00d2' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'B' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'F' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = dV.l(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'g' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'U' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public void h(Object[] objectArray) {
        i_0 i_02 = (i_0)((Object)objectArray[0]);
        this.g = i_02;
    }

    private static Method f(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = dV.e(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = dV.f(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public void f(Object[] objectArray) {
        String string = (String)objectArray[0];
        this.e = string;
    }

    private static Field f(Class clazz, String string, Class clazz2) {
        Field field = dV.e(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = dV.f(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method l(long l, long l2) {
        int n = dV.i(l, l2);
        Object object = ub[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = vb[n];
                int n3 = string2.indexOf(8);
                clazz3 = dV.j(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = dV.j(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = dV.e(clazz, string, clazz2, n2, classArray2)) != null) {
                        dV.ub[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = dV.j(229580150190806L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = dV.f(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        dV.ub[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = dV.j(229580150190806L, 0L);
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

    public void d(Object[] objectArray) {
        long l = (Long)objectArray[0];
    }

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x61BF;
        if (fb[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])gb.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    gb.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/dV", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = eb[n2].getBytes("ISO-8859-1");
            dV.fb[n2] = dV.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return fb[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = dV.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/dV" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    @cP
    public boolean a() {
        long l = cb ^ 0x25C98C0AB0C0L;
        return (boolean)dV.g("g", (Object)((Boolean)((Object)dV.g("g", (Object)this.d, (long)6345894342669878912L, (long)l))), (long)6345610551509016186L, (long)l);
    }

    @cP
    public i_0 a() {
        return this.g;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void a(Object[] var1_1) {
        block31: {
            block32: {
                block28: {
                    block29: {
                        block26: {
                            block27: {
                                var2_2 = (Long)var1_1[0];
                                v0 = var2_2;
                                var4_3 = v0 ^ 55958956532363L;
                                var6_4 = v0 ^ 15872977247914L;
                                var8_5 = v0 ^ 22594282158762L;
                                var10_6 = v0 ^ 37299566365261L;
                                var12_7 = v0 ^ 75993416544364L;
                                var14_8 = v0 ^ 86929222885577L;
                                var16_9 = v0 ^ 79146057582229L;
                                var18_10 = dV.g("U", (long)6314204329724106915L, (long)var2_2);
                                try {
                                    v1 = this.d;
                                    v2 /* !! */  = dV.g("g", (Object)this, (long)6314678249345350787L, (long)var2_2);
                                    if (var18_10 != null) break block26;
                                    if (v2 /* !! */  != false) break block27;
                                }
                                catch (MatchException v3) {
                                    throw dV.g("U", (Object)v3, (long)6320859988556527610L, (long)var2_2);
                                }
                                v2 /* !! */  = (CallSite)1;
                                break block26;
                            }
                            v2 /* !! */  = (CallSite)0;
                        }
                        try {
                            block30: {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    dV.g("g", (Object)v1, (Object)dV.g("U", (boolean)v2 /* !! */ , (long)6322625418166019619L, (long)var2_2), (long)6322737948475743494L, (long)var2_2);
                                                    dV.g("g", (Object)this, (Object)new Object[]{(boolean)dV.g("g", (Object)this, (long)6314678249345350787L, (long)var2_2)}, (long)6314049015012359154L, (long)var2_2);
                                                    if (var18_10 != null) break block28;
                                                    if (dV.g("g", (Object)this, (long)6314678249345350787L, (long)var2_2) != false) {
                                                    }
                                                    ** GOTO lbl77
                                                }
                                                catch (MatchException v4) {
                                                    throw dV.g("U", (Object)v4, (long)6320859988556527610L, (long)var2_2);
                                                }
                                                v5 = new Object[2];
                                                v5[1] = var6_4;
                                                v5[0] = this;
                                                dV.g("g", (Object)dV.g("F", (long)6314411572897032432L, (long)var2_2), (Object)v5, (long)6322814265652156007L, (long)var2_2);
                                                if (var18_10 != null) break block29;
                                            }
                                            catch (MatchException v6) {
                                                throw dV.g("U", (Object)v6, (long)6320859988556527610L, (long)var2_2);
                                            }
                                            if (dV.g("\u00d2", (Object)dV.b, (long)6314533606462656121L, (long)var2_2) == null) break block30;
                                        }
                                        catch (MatchException v7) {
                                            throw dV.g("U", (Object)v7, (long)6320859988556527610L, (long)var2_2);
                                        }
                                        if (dV.g("\u00d2", (Object)dV.b, (long)6314357037386051797L, (long)var2_2) == null) break block30;
                                    }
                                    catch (MatchException v8) {
                                        throw dV.g("U", (Object)v8, (long)6320859988556527610L, (long)var2_2);
                                    }
                                    v9 = new Object[1];
                                    v9[0] = var8_5;
                                    dV.g("g", (Object)this, (Object)v9, (long)6322294108322451171L, (long)var2_2);
                                    if (var18_10 == null) break block31;
                                }
                                catch (MatchException v10) {
                                    throw dV.g("U", (Object)v10, (long)6320859988556527610L, (long)var2_2);
                                }
                            }
                            v11 = new Object[2];
                            v11[1] = var12_7;
                            v11[0] = this;
                            dV.g("g", (Object)dV.g("F", (long)6314734264225058653L, (long)var2_2), (Object)v11, (long)6323026417082917274L, (long)var2_2);
                        }
                        catch (MatchException v12) {
                            throw dV.g("U", (Object)v12, (long)6320859988556527610L, (long)var2_2);
                        }
                    }
                    try {
                        if (var18_10 == null) break block31;
lbl77:
                        // 2 sources

                        v13 = new Object[2];
                        v13[1] = var4_3;
                        v13[0] = this;
                        dV.g("g", (Object)dV.g("F", (long)6314411572897032432L, (long)var2_2), (Object)v13, (long)6322888175907582143L, (long)var2_2);
                    }
                    catch (MatchException v14) {
                        throw dV.g("U", (Object)v14, (long)6320859988556527610L, (long)var2_2);
                    }
                }
                try {
                    try {
                        v15 = dV.b;
                        if (var18_10 != null) break block32;
                        if (dV.g("\u00d2", (Object)v15, (long)6314533606462656121L, (long)var2_2) != null) {
                        }
                        ** GOTO lbl111
                    }
                    catch (MatchException v16) {
                        throw dV.g("U", (Object)v16, (long)6320859988556527610L, (long)var2_2);
                    }
                    v15 = dV.b;
                }
                catch (MatchException v17) {
                    throw dV.g("U", (Object)v17, (long)6320859988556527610L, (long)var2_2);
                }
            }
            try {
                block33: {
                    try {
                        if (dV.g("\u00d2", (Object)v15, (long)6314357037386051797L, (long)var2_2) == null) break block33;
                        v18 = new Object[1];
                        v18[0] = var14_8;
                        dV.g("g", (Object)this, (Object)v18, (long)6322229517656398266L, (long)var2_2);
                        if (var18_10 == null) break block31;
                    }
                    catch (MatchException v19) {
                        throw dV.g("U", (Object)v19, (long)6320859988556527610L, (long)var2_2);
                    }
                }
                v20 = new Object[2];
                v20[1] = var16_9;
                v20[0] = this;
                dV.g("g", (Object)dV.g("F", (long)6314734264225058653L, (long)var2_2), (Object)v20, (long)6321132199999395913L, (long)var2_2);
            }
            catch (MatchException v21) {
                throw dV.g("U", (Object)v21, (long)6320859988556527610L, (long)var2_2);
            }
        }
        v22 = new Object[2];
        v22[1] = var10_6;
        v22[0] = this;
        dV.g("U", (Object)v22, (long)6321565501459924111L, (long)var2_2);
    }

    public List a(Object[] objectArray) {
        return this.c;
    }

    public String a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return "";
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

    public Set a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return dV.g("U", (Object)((Object)q_0.Any), (long)-2443686988111294497L, (long)l);
    }

    public float a(Object[] objectArray) {
        Object object;
        CallSite callSite;
        block3: {
            block2: {
                long l = (Long)objectArray[0];
                long l2 = l = cb ^ l;
                long l3 = l2 ^ 0xD98E0C78DCFL;
                long l4 = l2 ^ 0x27002864619DL;
                long l5 = l2 ^ 0x717E72A46073L;
                Object[] objectArray2 = new Object[1];
                objectArray2[0] = l5;
                String string = this.e + " " + (String)((Object)dV.g("g", (Object)this, (Object)objectArray2, (long)-7724846826148492190L, (long)l));
                try {
                    Object[] objectArray3 = new Object[1];
                    objectArray3[0] = l4;
                    Object[] objectArray4 = new Object[2];
                    objectArray4[1] = l3;
                    objectArray4[0] = string;
                    callSite = dV.g("g", (Object)dV.g("g", (Object)dV.g("F", (long)-7724537097345372790L, (long)l), (Object)objectArray3, (long)-7724147309575605888L, (long)l), (Object)objectArray4, (long)-7725658241668933739L, (long)l);
                    Object[] objectArray5 = new Object[1];
                    objectArray5[0] = l5;
                    if (dV.g("g", (Object)dV.g("g", (Object)this, (Object)objectArray5, (long)-7724846826148492190L, (long)l), (long)-7724295190770082178L, (long)l) != false) break block2;
                    Object[] objectArray6 = new Object[1];
                    objectArray6[0] = l4;
                    Object[] objectArray7 = new Object[2];
                    objectArray7[1] = l3;
                    objectArray7[0] = " ";
                    object = dV.g("g", (Object)dV.g("g", (Object)dV.g("F", (long)-7724537097345372790L, (long)l), (Object)objectArray6, (long)-7724147309575605888L, (long)l), (Object)objectArray7, (long)-7725658241668933739L, (long)l);
                    break block3;
                }
                catch (MatchException matchException) {
                    throw dV.g("U", (Object)matchException, (long)-7725790901030882166L, (long)l);
                }
            }
            object = 0.0f;
        }
        return (float)(callSite + object);
    }

    @cQ
    public void a(Object object, String string, String string2, int n) {
        block8: {
            long l;
            block6: {
                l = cb ^ 0x2992B5AD7F38L;
                CallSite callSite = dV.g("U", (long)-7498254589366920973L, (long)l);
                try {
                    block7: {
                        try {
                            try {
                                if (callSite != null) break block6;
                                if (object == null) break block7;
                            }
                            catch (MatchException matchException) {
                                throw dV.g("U", (Object)matchException, (long)-7500636445950609494L, (long)l);
                            }
                            dV.g("g", (Object)this.a, (Object)((dK)object), (long)-7499745414115567786L, (long)l);
                            this.j = null;
                            if (callSite == null) break block8;
                        }
                        catch (MatchException matchException) {
                            throw dV.g("U", (Object)matchException, (long)-7500636445950609494L, (long)l);
                        }
                    }
                    this.e = string;
                    this.h = string2;
                }
                catch (MatchException matchException) {
                    throw dV.g("U", (Object)matchException, (long)-7500636445950609494L, (long)l);
                }
            }
            this.g = (i_0)((Object)dV.g("g", (Object)dV.g("g", (Object)dV.g("g", (Object)dV.g("U", (Object)dV.g("U", (long)-7497788180240611017L, (long)l), (long)-7498034436492100119L, (long)l), arg_0 -> dV.lambda$set$0(n, arg_0), (long)-7499170698731260032L, (long)l), (long)-7500229708915476666L, (long)l), (Object)((Object)this.g), (long)-7499816542891893178L, (long)l));
        }
    }

    private static Field k(long l, long l2) {
        int n = dV.i(l, l2);
        Object object = ub[n];
        if (object instanceof String) {
            String string = vb[n];
            int n2 = string.indexOf(8);
            Class clazz = dV.j(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = dV.j(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = dV.e(clazz3, string2, clazz2)) != null) {
                    dV.ub[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = dV.f(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        dV.ub[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = dV.j(229580150190806L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static CallSite g(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/dV" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static void g() {
        Object[] objectArray = ub;
        ub[0] = "G<\u007fu#KL3n:OHB1luc";
        objectArray[1] = Boolean.TYPE;
        dV.vb[1] = "java/lang/Boolean";
        objectArray[2] = "\u0001<\"ta\u0000\u0017<'.r\u0017\u0000w$(~\u0003\u001103?5\u0014.";
        objectArray[3] = "l 1~|/g/ 1\u001d!l$$k";
        objectArray[4] = "D\u0007U\u001cePO\bDS\u0018H\\\u000fM\u001a";
        objectArray[5] = "\u0016N\u000ej<d\bF\u0014%[e\u0019]\u0019\u007f}c";
        objectArray[6] = "r3s\u0003'\u0016d3vY4\u0001sxu_8\u0015b?bHs\u0007^";
        objectArray[7] = "vx\u0011L\\\u0001\u0003X\u001aCMN~@\tDD\u0007\u0016";
        objectArray[8] = "\u001dJ@4h\u0003\u0003BZ{\n\u001f\u0004_";
        objectArray[9] = "Db\u000f=5+Zj\u0015rX1Bo\u001c?o7Am";
        objectArray[10] = "/XQ*O\tZxZ%^F;vQ.Z\u001cO";
        objectArray[11] = Void.TYPE;
        dV.vb[11] = "java/lang/Void";
        objectArray[12] = "5-B\u0005\u0001F#-G_\u0012Q4fDY\u001eE%!SNUT\u001e";
        objectArray[13] = "@\n\u00148\u0015.5*\u001f7\u0004aT$\u0014<\u0000; ";
        objectArray[14] = "\"Wl\u0001Kc4Wi[Xt#\u001cj]T`2[}J\u001fp*[\u007fAE=\u0016@\u007f\\Ez!W";
        objectArray[15] = "I;h+}r<\u001bc$l=]\u0015h/hg)";
        objectArray[16] = "'\u000fZ/m\u001a1\u000f_u~\r&D\\sr\u00197\u0003Kd9\t\t";
        objectArray[17] = ",\u0001Q6\u0007bY!Z9\u0016-8/Q2\u0012wL";
        objectArray[18] = "H_$X\u0019gH_3\u0004\u0015hR\u00143\u001a\u0015}UecGD";
        objectArray[19] = "6\u007f\u001c8-Q6\u007f\u000bd!^,4\u000bz!K+E_\"v";
        objectArray[20] = "+\"(\u001d+S+\"?A'\\1i?_'I6\u0018j\u0000~";
        objectArray[21] = "D1\u000f#X<R1\nyK+Ez\t\u007fG?T=\u001eh\f(v";
        objectArray[22] = "Kz\u0004hV&@u\u0015'5+Ux\u001aL\u0000)Dk\u0006`\u0017$";
        objectArray[23] = "\b+\u001d\u00179h}\u000b\u0016\u0018('\u001c\u0005\u001d\u0013,}h";
        objectArray[24] = "\n)f}TD\u007f\tmrE\u000b\u001e\u0007fyAQj";
        objectArray[25] = "*FD)\u000bV<FAs\u0018A+\rBu\u0014U:JUb_E,";
        objectArray[26] = "QYN\u000f\u0014^$yE\u0000\u0005\u0011EwN\u000b\u0001K1";
        objectArray[27] = "?\u0000\u001c\u001e \u007fJ \u0017\u001110+.\u001c\u001a5j_";
        objectArray[28] = "\\DYPZ6JD\\\nI!]\u000f_\fE5LHH\u001b\u000e/";
        objectArray[29] = "5\u001cy\\3!\u0014 o\\6{\u00077x\u00175}\u000b#iP\"j@9&";
        objectArray[30] = Integer.TYPE;
        dV.vb[30] = "java/lang/Integer";
        objectArray[31] = "&k]pnu0kX*}b' [,qv6gL;:t";
        objectArray[32] = "\u0017\u00072.\u00073\t\u000f(az#\t";
        objectArray[33] = "uJ\u0006b2Q\u0000j\rm#\u001ead\u0006f'D\u0015";
        objectArray[34] = "\u0006O]|wL\u0010OX&d[\u0007\u0004[ hO\u0016CL7#X.";
        objectArray[35] = "-\f\r+\u000e6&\u0003\u001cdi43\b\u001c/R";
        objectArray[36] = "F\u001d\u00009R(3=\u000b6CgR3\u0000=G=&";
        objectArray[37] = "9\u0001u M\u0000'\too\"\u0007!\u0001z2";
        objectArray[38] = "+s\\\u001c\u000fw^SW\u0013\u001e8?]\\\u0018\u001abK";
        objectArray[39] = "\u000b}\u007ffW`\u0015ue)\na\u0013yhjWF\u0015nlf\u0014";
        objectArray[40] = "$\u0006+\u001a\u0005k:\u000e1Udn:\u000e2\u0015Jr";
        objectArray[41] = "&\u001c\trnK8\u0014\u0013=\u0001L>\u001c\u0006_)M8";
        objectArray[42] = " F4$zT>N.k2T$D6,;Odw0 0H)F6 ";
        objectArray[43] = "s\u0007\u001f\u001eFde\u0007\u001aDUsrL\u0019BYgc\u000b\u000eU\u0012wV";
        objectArray[44] = "\u0006~.>\u001bQs^%1\n\u001e\u0012P.:\u000eDf";
        objectArray[45] = Float.TYPE;
        dV.vb[45] = "java/lang/Float";
        objectArray[46] = "l\u0015HC\u001a-z\u0015M\u0019\t:m^N\u001f\u0005.|\u0019Y\bN>K";
        objectArray[47] = "xnq\u001e\u001fM\rNz\u0011\u000e\u0002l@q\u001a\nX\u0018";
        objectArray[48] = "!\u0004G(cpT$L'r?5*G,veA";
        objectArray[49] = "Z\u001d\u0015+5~Q\u0007\u0001:N%7\u0010\u001f4~6M\fM`!D\b\u001c\u0006:/#O]C?N";
        objectArray[50] = "k\u000ezA706\u0002x\u001dZ2?\u0000R\u0013!\"(\u001df\u0002;.4|%B+.-\u0005c\u0017#qREl\u001ae$+\u0018`\u00189I";
        objectArray[51] = "\nG)\u000e\u0011&O\u0012*Zk66\u0017{Y\u000bgNN}JP\\";
        objectArray[52] = "[z>(\u0018&\u0016~!fz2j0,p\n'\u0007c&sE";
        objectArray[53] = ":CW\u001e+\u0000k_\u0006EB\u00130L\fI\u0015Dn\u001bT%.\u0011+\u001f\u0001Nr\u0018i\u001b";
        objectArray[54] = "\u00016P65dH`@7[g\u0004tC1>\u001c\bm@h)f\u0014?\u00147[f\u0017h\u0013b!bIu\u001eX";
        objectArray[55] = "XYnyA7\tE?\"($RV5.\u007fs\r\u000bnBEpKW`!D7\u0002X";
        objectArray[56] = "\u0019^}\u0011y%TZb_\u001b7(N<Mk<\u0012\u001c\u007f\u0011%";
        objectArray[57] = "yDriiAr^fx\u0012\u0012\u0014\u0000p'{A~Tf(.{";
        objectArray[58] = ";\u0007p{pUiQ`>\u0016Z0\u0004qkm$:\u0003j~r@0\u001dg}\u0016";
        objectArray[59] = "\u007f\rX(_\u007f~Y[:5{h\u000ft/Q\u0012:\u0005_7T+x\u000f\u0006{5+o\\Tq_\u007fyS\u0001K";
        objectArray[60] = "l&)\\\u0019\u0001`r9\nuWsr7T\u001cT\t}&C\u0011\tmr&\u0003\u00150";
        objectArray[61] = "p\u001b9L.?q\u000b=BRm!\u000bMY6\u0004s\u0001fA3=1\u000b?\rR=&Xm\u00078i0W8=";
        objectArray[62] = "\u0011%\u0019c\tvN!\u0019pkk\bw\u001fp\u0017m\u000e\u001a^e\u000ej\u001f~]&\u0016et";
        objectArray[63] = "]\u0005A*=\u001f\\QB8W\tG\u0019II4\u0002W\u000f\u001d-;\u0002\u0017\u000b$";
        objectArray[64] = "$\u0010\u001f\u000f>z'S\u0007\u0000U~v\u0017<\u0002%b\u001fU\u0011P<$u\u0001\u0007_i\u001e";
        objectArray[65] = "\u0003N2S\u000f)\bT&BtznC8LDa\u0014_j\u0018\u001b\u0013\u000b\f'X\u0016oT\b'Kt";
        objectArray[66] = "E5\u00003:bD%\u0004=F\"\u0019;PB%)\t-\u0004&*)I)=";
        objectArray[67] = "Y+Y\u0018.^\u0014/FVLKh.O\u001a>Q\f.BYr";
        objectArray[68] = "\f\u001awHb\u001c\u0007\u0000cY\u0019Ja\u0017}W)T\u001b\u000b/\u0003v&^\u001bdYxA\u0019Z!\\\u0019";
        objectArray[69] = "|;\u001a\u0011\u0010ow!\u000e\u0000k8\u00116\u0010\u000e['k*BZ\u0004U.:\t\u0000\n2i{L\u0005k";
        objectArray[70] = "lJ\u0017}\t\u0005h\u0014\np3\u0011wA\r-I\u007fjE\u0014x\n\u000fh_\u0016z3\u0005yCLzI\u0001'^A@";
        objectArray[71] = "Q\u001cED\u001d\u0006\u0017IM\u001bb\u001e\u0011mQ[\u001e\u000ej\u0019_\u001c\u000bE\u0000MI\u0013^\u007f";
        objectArray[72] = "o'<W\u0012j,;8.\u0016m0*2i\u0006\u0004m<`GRn9*o\u0012h?$4&T\u0006|80_";
        objectArray[73] = "REj'kHRH)k\u001aE-_4;*^WCfou,QR(7$\u001dDM6i\u001a";
        objectArray[74] = "W:K=\u001ea\n6Iasqnr\u001en\u0015~\u001e5\u001fnI\u0018Q4Ub\u0012\u007f\u0016u\u0010gs";
        objectArray[75] = "\u001c\u0018^s{d\u001f[F|\u0010fJ\u0014G\u0013*1K\u0002]cm0K^;";
        objectArray[76] = "\u0019A~JD\u001dJK}\u0005;\u001a)_zT\u000b\u0002SC(\u0000Tp\u0016ScZZ\u0017Q\u0012&_;";
        objectArray[77] = "\u001bq\u0013]8rH{\u0010\u0012Gv+o\u0017CwmQsE\u0017(\u001f\u0014c\u000eM&xS\"KHG";
        objectArray[78] = "3X-h' a\u001bq&@sY\u0015-vph#\t\u007f\"/\u001af\u00194x!}!Xq}@";
        objectArray[79] = "\u0000\u0010\rWxs\u0016Q\u0018KI{\u0001\u0010?R-g\nl\u0002K8~^\b\rKxzg";
        objectArray[80] = "\u001c\u001a0|{\u001d_\u00064\u0005k\u0014@\u000e>lg-N\u000e.h\u0001JLU:?k\u001eZZo\u0005";
        objectArray[81] = "\u0002R6iT\u000f\tH\"x/_oA8dC\u0005^V=}\u00105\u0001H#t\u001f\u0004\u0016M:'/";
        objectArray[82] = "3v^E\u0011^2fZKm\fbfc\u000e\\\thl\u0013I]\t4\nZ_R\f4`\u000eI]Y\u000e";
        objectArray[83] = "\u0005\\orj&\u0010Cq,T~yQs~de\u0003M!*;\u0017\u0007E,)9hC\u001a!\u007fT";
        objectArray[84] = "q\t:?\u001a7,\u00058cw'HAol\u0011(8\u0006nlMN";
        objectArray[85] = "k<NCyn9\u007f\u0012\r\u001e>\u0001qN].&{m\u001c\tqT>}WS\u007f3y<\u0012V\u001e";
        objectArray[86] = "Jc@w\u007f9KsDy\u0003c\u000br\u0007o\u007fe\r\u001fFzfb\u001c{E9~mw";
        objectArray[87] = "a8\u0017O<uef\nB\u0006az1\u001d<gu`+q\bxj\u007f0KJbh!W";
        objectArray[88] = "!x4d+R|t68FB\u0018z35vYbfaa)+'v*;'L`7o>F";
        objectArray[89] = "\u001fyF5\fV@}F&nM\u0014F\u0000~\u0002L\u001c6G\u007f\u0002\u0010z#\u00053\u0014H\u0006|\u00013\u0007*";
        objectArray[90] = "2]D[J2`\u000bT\u001e,$*VY@E'PYHWHz4VH\u0017LC";
        objectArray[91] = "9Q\u0011P-#'L\u0013T\u0010gYZ\u0019E o#FK\u0011\u007f\u001dfV\u0000Kqz!\u0017EN\u0010";
        objectArray[92] = "?B\u0011%_~>\u0017]&0t5\u0006-+Kd\"\u001b\u0019:Qh>zZzAh'\u0003\u001c/I7X\u001dY6S`)\u001c\fzP\u000f";
        objectArray[93] = "8\u0005\u0015\u001c`\u0004z\u001f\u0017B\u0007Y86\u0014\u0003j>xJ\u001c\u001eaN?K\u001cB\u0007\u0004s\u0017\u0016\u001ewCr\u0017Jx";
        objectArray[94] = "8)J\u007f:d9}ImP`/+/&ae%!_a`eyG\u0016wo`y-Ba`5C";
        objectArray[95] = ",k\u0004\\U\u0001'q\u0010M.RAf\u000eC\u001eI;z\\\u0017A;z*\u001cJQB<\u007f\u0014\u0015.";
        Object[] objectArray2 = objectArray;
        objectArray[96] = "2}\u0013C5{3m\u0017MI+hy_u'@1gLN(ysm\u0015\u0002I}s<_Nr|c8Q2";
    }

    public void g(Object[] objectArray) {
        String string = (String)objectArray[0];
        this.h = string;
    }

    private static Class j(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = dV.i(l, l2);
            object = ub[n];
            try {
                if (!(object instanceof String)) break block2;
                dV.ub[n] = clazz = Class.forName(vb[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static boolean lambda$set$0(int n, i_0 i_02) {
        Object object;
        block4: {
            block5: {
                long l = cb ^ 0x7BE693BC7520L;
                CallSite callSite = dV.g("U", (long)-7068246398452985109L, (long)l);
                try {
                    try {
                        object = dV.g("g", (Object)((Object)i_02), (long)-7065359626871539944L, (long)l);
                        if (callSite != null) break block4;
                        if (object != n) break block5;
                    }
                    catch (MatchException matchException) {
                        throw dV.g("U", (Object)matchException, (long)-7066094418703221326L, (long)l);
                    }
                    object = 1;
                    break block4;
                }
                catch (MatchException matchException) {
                    throw dV.g("U", (Object)matchException, (long)-7066094418703221326L, (long)l);
                }
            }
            object = 0;
        }
        return (boolean)object;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(dV.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(dV.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


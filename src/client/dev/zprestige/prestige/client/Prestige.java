/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.ModInitializer
 *  net.minecraft.class_310
 *  net.minecraft.class_408
 */
package dev.zprestige.prestige.client;

import dev.zprestige.prestige.aA;
import dev.zprestige.prestige.aG;
import dev.zprestige.prestige.ai_0;
import dev.zprestige.prestige.aq_0;
import dev.zprestige.prestige.au_0;
import dev.zprestige.prestige.aw_0;
import dev.zprestige.prestige.bO;
import dev.zprestige.prestige.bY;
import dev.zprestige.prestige.bl_0;
import dev.zprestige.prestige.bo_0;
import dev.zprestige.prestige.bt_0;
import dev.zprestige.prestige.cC;
import dev.zprestige.prestige.cJ;
import dev.zprestige.prestige.cM;
import dev.zprestige.prestige.cR;
import dev.zprestige.prestige.cm_0;
import dev.zprestige.prestige.cq_0;
import dev.zprestige.prestige.cw_0;
import dev.zprestige.prestige.cz_0;
import dev.zprestige.prestige.dD;
import dev.zprestige.prestige.dH;
import dev.zprestige.prestige.dK;
import dev.zprestige.prestige.dV;
import dev.zprestige.prestige.dp_0;
import dev.zprestige.prestige.dr_0;
import dev.zprestige.prestige.dx_0;
import dev.zprestige.prestige.f0;
import dev.zprestige.prestige.f6;
import dev.zprestige.prestige.fV;
import dev.zprestige.prestige.g8;
import dev.zprestige.prestige.g9;
import dev.zprestige.prestige.gK;
import dev.zprestige.prestige.hc;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import net.fabricmc.api.ModInitializer;
import net.minecraft.class_310;
import net.minecraft.class_408;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class Prestige
implements ModInitializer {
    private static final AtomicBoolean a;
    public static bO b;
    public static cC c;
    public static cJ d;
    public static aw_0 e;
    public static aA f;
    public static fV g;
    public static dx_0 h;
    public static ai_0 i;
    public static au_0 j;
    public static g9 k;
    public static g8 l;
    public static cm_0 m;
    public static f0 n;
    public static dD o;
    public static dH p;
    public static cM q;
    public static f6 r;
    public static cw_0 s;
    public static cq_0 t;
    public static bY u;
    public static cR v;
    public static boolean w;
    private static dK[] x;
    private static final long y;
    private static final Object[] z;
    private static final String[] A;

    static {
        y = hc.a(-4237517889012258601L, -4492925127993095055L, MethodHandles.lookup().lookupClass()).a(14346322195684L);
        long l = y ^ 0x3D334868E1A1L;
        z = new Object[96];
        A = new String[96];
        Prestige.a();
        a = new AtomicBoolean(false);
        Prestige.a("\u00e2", (boolean)false, (long)-6076365999010867641L, (long)l);
        Prestige.a("\u00c7", null, (long)-6073543193978313559L, (long)l);
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = Prestige.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = Prestige.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = Prestige.a(l, l2);
            object = z[n];
            try {
                if (!(object instanceof String)) break block2;
                Prestige.z[n] = clazz = Class.forName(A[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = Prestige.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = Prestige.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static dK[] b() {
        return x;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static boolean b(Object[] var0) {
        block26: {
            block30: {
                block27: {
                    block29: {
                        block28: {
                            var1_1 = (Long)var0[0];
                            v0 = var1_1 = Prestige.y ^ var1_1;
                            var3_2 = v0 ^ 11198839193506L;
                            var5_3 = v0 ^ 39355797438358L;
                            var7_4 = v0 ^ 65000825783606L;
                            var9_5 = v0 ^ 20328730886810L;
                            var11_6 = v0 ^ 20640679731384L;
                            var13_7 = Prestige.a("\u00c7", (long)6236947257733547071L, (long)var1_1);
                            try {
                                if (Prestige.a("\u00cf", (long)6237626060016226868L, (long)var1_1) == null) {
                                    return false;
                                }
                            }
                            catch (MatchException v1) {
                                throw Prestige.a("\u00c7", (Object)v1, (long)6237930704914324893L, (long)var1_1);
                            }
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        v2 = new Object[1];
                                                        v2[0] = var5_3;
                                                        v3 /* !! */  = Prestige.a("\u00c7", (Object)v2, (long)6235942989680082088L, (long)var1_1);
                                                        if (var13_7 != null) break block26;
                                                        if (v3 /* !! */  != false) break block27;
                                                    }
                                                    catch (MatchException v4) {
                                                        throw Prestige.a("\u00c7", (Object)v4, (long)6237930704914324893L, (long)var1_1);
                                                    }
                                                    v5 = new Object[2];
                                                    v5[1] = var7_4;
                                                    v5[0] = bo_0.class;
                                                    v3 /* !! */  = Prestige.a("\u00cc", (Object)Prestige.a("\u00cf", (long)6237626060016226868L, (long)var1_1), (Object)v5, (long)6238243570253702550L, (long)var1_1);
                                                    if (var13_7 != null) break block26;
                                                }
                                                catch (MatchException v6) {
                                                    throw Prestige.a("\u00c7", (Object)v6, (long)6237930704914324893L, (long)var1_1);
                                                }
                                                if (v3 /* !! */  != false) break block27;
                                            }
                                            catch (MatchException v7) {
                                                throw Prestige.a("\u00c7", (Object)v7, (long)6237930704914324893L, (long)var1_1);
                                            }
                                            v8 = new Object[3];
                                            v8[2] = var11_6;
                                            v8[1] = dV.class;
                                            v8[0] = bl_0.class;
                                            v3 /* !! */  = Prestige.a("\u00cc", (Object)Prestige.a("\u00cf", (long)6237626060016226868L, (long)var1_1), (Object)v8, (long)6237406395483779205L, (long)var1_1);
                                            if (var13_7 != null) break block26;
                                        }
                                        catch (MatchException v9) {
                                            throw Prestige.a("\u00c7", (Object)v9, (long)6237930704914324893L, (long)var1_1);
                                        }
                                        if (v3 /* !! */  != false) break block27;
                                    }
                                    catch (MatchException v10) {
                                        throw Prestige.a("\u00c7", (Object)v10, (long)6237930704914324893L, (long)var1_1);
                                    }
                                    v11 = Prestige.a("\u00cf", (long)6235266605095274679L, (long)var1_1);
                                    if (var13_7 != null) break block28;
                                }
                                catch (MatchException v12) {
                                    throw Prestige.a("\u00c7", (Object)v12, (long)6237930704914324893L, (long)var1_1);
                                }
                                if (v11 != null) {
                                }
                                ** GOTO lbl84
                            }
                            catch (MatchException v13) {
                                throw Prestige.a("\u00c7", (Object)v13, (long)6237930704914324893L, (long)var1_1);
                            }
                            v11 = Prestige.a("\u00cf", (long)6235266605095274679L, (long)var1_1);
                        }
                        try {
                            try {
                                try {
                                    v14 = new Object[1];
                                    v14[0] = var3_2;
                                    v3 /* !! */  = Prestige.a("\u00cc", (Object)v11, (Object)v14, (long)6236020651330454034L, (long)var1_1);
                                    if (var13_7 != null) break block26;
                                    if (v3 /* !! */  != false) break block27;
                                }
                                catch (MatchException v15) {
                                    throw Prestige.a("\u00c7", (Object)v15, (long)6237930704914324893L, (long)var1_1);
                                }
lbl84:
                                // 2 sources

                                v16 = Prestige.a("\u00cf", (long)6235729701720206614L, (long)var1_1);
                                if (var13_7 != null) break block29;
                            }
                            catch (MatchException v17) {
                                throw Prestige.a("\u00c7", (Object)v17, (long)6237930704914324893L, (long)var1_1);
                            }
                            if (v16 == null) break block30;
                        }
                        catch (MatchException v18) {
                            throw Prestige.a("\u00c7", (Object)v18, (long)6237930704914324893L, (long)var1_1);
                        }
                        v16 = Prestige.a("\u00cf", (long)6235729701720206614L, (long)var1_1);
                    }
                    try {
                        v19 = new Object[1];
                        v19[0] = var9_5;
                        v3 /* !! */  = Prestige.a("\u00cc", (Object)v16, (Object)v19, (long)6237494413210465901L, (long)var1_1);
                        if (var13_7 != null) break block26;
                        if (v3 /* !! */  == false) break block30;
                    }
                    catch (MatchException v20) {
                        throw Prestige.a("\u00c7", (Object)v20, (long)6237930704914324893L, (long)var1_1);
                    }
                }
                v3 /* !! */  = (CallSite)1;
                break block26;
            }
            v3 /* !! */  = (CallSite)0;
        }
        return (boolean)v3 /* !! */ ;
    }

    public static void b(dK[] dKArray) {
        x = dKArray;
    }

    private static Field c(long l, long l2) {
        int n = Prestige.a(l, l2);
        Object object = z[n];
        if (object instanceof String) {
            String string = A[n];
            int n2 = string.indexOf(8);
            Class clazz = Prestige.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = Prestige.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = Prestige.a(clazz3, string2, clazz2)) != null) {
                    Prestige.z[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = Prestige.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        Prestige.z[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = Prestige.b(3502001202407886L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = Prestige.a(l, l2);
        Object object = z[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = A[n];
                int n3 = string2.indexOf(8);
                clazz3 = Prestige.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = Prestige.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = Prestige.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        Prestige.z[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = Prestige.b(3502001202407886L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = Prestige.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        Prestige.z[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = Prestige.b(3502001202407886L, 0L);
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

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00c1' || c == 'k' || c == '\u00cf' || c == '\u00e2') {
                field = Prestige.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c1' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'k' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00cf' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = Prestige.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00cc' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c7' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/client/Prestige" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = Prestige.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
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

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void a(Object[] objectArray) {
        class_310 class_3102;
        long l;
        long l2;
        block11: {
            l2 = (Long)objectArray[0];
            l = (l2 = y ^ l2) ^ 0x1FA779B14BE9L;
            CallSite callSite = Prestige.a("\u00c7", (long)-3498692147906634301L, (long)l2);
            try {
                try {
                    try {
                        try {
                            if (Prestige.a("\u00cf", (long)-3497841091761442146L, (long)l2) != false || Prestige.a("\u00cf", (long)-3500335255965856824L, (long)l2) == null) return;
                        }
                        catch (MatchException matchException) {
                            throw Prestige.a("\u00c7", (Object)matchException, (long)-3499960370666797983L, (long)l2);
                        }
                        class_3102 = cz_0.b;
                        if (callSite != null) break block11;
                    }
                    catch (MatchException matchException) {
                        throw Prestige.a("\u00c7", (Object)matchException, (long)-3499960370666797983L, (long)l2);
                    }
                    if (Prestige.a("\u00c1", (Object)class_3102, (long)-3499731643476983900L, (long)l2) == null) return;
                }
                catch (MatchException matchException) {
                    throw Prestige.a("\u00c7", (Object)matchException, (long)-3499960370666797983L, (long)l2);
                }
                class_3102 = cz_0.b;
            }
            catch (MatchException matchException) {
                throw Prestige.a("\u00c7", (Object)matchException, (long)-3499960370666797983L, (long)l2);
            }
        }
        try {
            if (Prestige.a("\u00c1", (Object)class_3102, (long)-3500142884295385108L, (long)l2) == null) {
                return;
            }
        }
        catch (MatchException matchException) {
            throw Prestige.a("\u00c7", (Object)matchException, (long)-3499960370666797983L, (long)l2);
        }
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l;
        Prestige.a("\u00cc", (Object)new bl_0(dp_0.b, null), (Object)objectArray2, (long)-3499477325734663272L, (long)l2);
    }

    public static boolean a(Object[] objectArray) {
        Object object;
        block8: {
            block11: {
                block9: {
                    CallSite callSite;
                    CallSite callSite2;
                    long l;
                    long l2;
                    block10: {
                        l2 = (Long)objectArray[0];
                        l = (l2 = y ^ l2) ^ 0x1076F768B0B9L;
                        callSite2 = Prestige.a("\u00c7", (long)7134050443730563504L, (long)l2);
                        try {
                            try {
                                try {
                                    object = aG.e;
                                    if (callSite2 != null) break block8;
                                    if (object != 0) break block9;
                                }
                                catch (MatchException matchException) {
                                    throw Prestige.a("\u00c7", (Object)matchException, (long)7142356640491284498L, (long)l2);
                                }
                                callSite = Prestige.a("\u00cf", (long)7142520660545611707L, (long)l2);
                                if (callSite2 != null) break block10;
                            }
                            catch (MatchException matchException) {
                                throw Prestige.a("\u00c7", (Object)matchException, (long)7142356640491284498L, (long)l2);
                            }
                            if (callSite == null) break block11;
                        }
                        catch (MatchException matchException) {
                            throw Prestige.a("\u00c7", (Object)matchException, (long)7142356640491284498L, (long)l2);
                        }
                        callSite = Prestige.a("\u00cf", (long)7142520660545611707L, (long)l2);
                    }
                    try {
                        Object[] objectArray2 = new Object[2];
                        objectArray2[1] = l;
                        objectArray2[0] = bt_0.class;
                        object = Prestige.a("\u00cc", (Object)callSite, (Object)objectArray2, (long)7142033983547576345L, (long)l2);
                        if (callSite2 != null) break block8;
                        if (object == 0) break block11;
                    }
                    catch (MatchException matchException) {
                        throw Prestige.a("\u00c7", (Object)matchException, (long)7142356640491284498L, (long)l2);
                    }
                }
                object = 1;
                break block8;
            }
            object = 0;
        }
        return (boolean)object;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (A[n3] != null) {
            return n3;
        }
        Object object = z[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 56;
            case 1 -> 2;
            case 2 -> 47;
            case 3 -> 31;
            case 4 -> 3;
            case 5 -> 37;
            case 6 -> 16;
            case 7 -> 52;
            case 8 -> 33;
            case 9 -> 21;
            case 10 -> 58;
            case 11 -> 54;
            case 12 -> 20;
            case 13 -> 41;
            case 14 -> 13;
            case 15 -> 6;
            case 16 -> 43;
            case 17 -> 1;
            case 18 -> 40;
            case 19 -> 19;
            case 20 -> 49;
            case 21 -> 50;
            case 22 -> 27;
            case 23 -> 62;
            case 24 -> 51;
            case 25 -> 55;
            case 26 -> 5;
            case 27 -> 46;
            case 28 -> 24;
            case 29 -> 48;
            case 30 -> 26;
            case 31 -> 32;
            case 32 -> 30;
            case 33 -> 35;
            case 34 -> 34;
            case 35 -> 23;
            case 36 -> 10;
            case 37 -> 57;
            case 38 -> 28;
            case 39 -> 60;
            case 40 -> 53;
            case 41 -> 61;
            case 42 -> 22;
            case 43 -> 0;
            case 44 -> 42;
            case 45 -> 11;
            case 46 -> 39;
            case 47 -> 12;
            case 48 -> 15;
            case 49 -> 4;
            case 50 -> 8;
            case 51 -> 7;
            case 52 -> 45;
            case 53 -> 63;
            case 54 -> 59;
            case 55 -> 38;
            case 56 -> 29;
            case 57 -> 18;
            case 58 -> 9;
            case 59 -> 25;
            case 60 -> 17;
            case 61 -> 36;
            case 62 -> 14;
            default -> 44;
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
        Prestige.A[n3] = new String(cArray);
        return n3;
    }

    private static void a() {
        Object[] objectArray = z;
        z[0] = "E=K7'ZS=Nm4MDvMk8YU1Z|sIM1Xw)\u0004q*Xj)CF=";
        objectArray[1] = "s^m\u0003z\u001bRb{\u0003\u007fAAulH|GMa}\u000fkP\u0006vB]";
        objectArray[2] = "h\u001d`tJ\u0003c\u0012q;0\u0007p\u0013at\u0006\u0003g";
        objectArray[3] = "\u000b\u0010\u007fgmM\u001d\u0010z=~Z\n[y;rN\u001b\u001cn,9_ ";
        objectArray[4] = "zy[\nQZzyLV]U`2LH]@gC\u001c\u0015\f";
        objectArray[5] = "N\u0012\u0006\u0017pyN\u0012\u0011K|vTY\u0011U|cS(E\r+";
        objectArray[6] = "\f,\u0011I\u001bR\u001a,\u0014\u0013\bE\rg\u0017\u0015\u0004Q\u001c \u0000\u0002OC ";
        objectArray[7] = "Q$\u000fO\u0012:$\u0004\u0004@\u0003uE\n\u000fK\u0007/1";
        objectArray[8] = Boolean.TYPE;
        Prestige.A[8] = "java/lang/Boolean";
        objectArray[9] = "U\u001f\u000f\u0012\u001e<U\u001f\u0018N\u00123OT\u0018P\u0012&H%M\u000fK";
        objectArray[10] = "{2\f\u000et-\u000e\u0012\u0007\u0001ebo\u001c\f\na8\u001b";
        objectArray[11] = "\u0017z#O$\u0005\u0017z4\u0013(\n\r14\r(\u001f\n@cR~";
        objectArray[12] = "33h6V~%3mlEi2xnjI}#?y}\u0002j\u0016";
        objectArray[13] = "p.\u0004p,P\u0005\u000e\u000f\u007f=\u001fd\u0000\u0004t9E\u0010";
        objectArray[14] = Void.TYPE;
        Prestige.A[14] = "java/lang/Void";
        objectArray[15] = "_4jgY2~\b|g\\hm\u001fk,_na\u000bzkHy*\u001cE9";
        objectArray[16] = "UW\u0015g\u0004\u0019CW\u0010=\u0017\u000eT\u001c\u0013;\u001b\u001aE[\u0004,P\rs";
        objectArray[17] = "!\u001ak4:\u0011T:`;+^54k0/\u0004A";
        objectArray[18] = "5\u001bwpG\u0013#\u001br*T\u00044Pq,X\u0010%\u0017f;\u0013\u0000\u0003";
        objectArray[19] = "<7\u0015x5fI\u0017\u001ew$)(\u0019\u0015| s\\";
        objectArray[20] = "lC.\f\u00199zC+V\n.m\b(P\u0006:|O?GM.0";
        objectArray[21] = "W\u001f\b\u001d?6\"?\u0003\u0012.yC1\b\u0019*#7";
        objectArray[22] = "\u0007\u0011.^\u001c8r1%Q\rw\u0013?.Z\t-g";
        objectArray[23] = "L\u0000\u000e\u0002\u001bm9 \u0005\r\n\"X.\u000e\u0006\u000ex,";
        objectArray[24] = "Cfi{L=Ufl!_*B-o'S>Sjx0\u0018.J";
        objectArray[25] = "\u001d\u001e'K^]\u000b\u001e\"\u0011MJ\u001cU!\u0017A^\r\u00126\u0000\nO ";
        objectArray[26] = "\u000f*eP\u0017Q\u0019*`\n\u0004F\u000eac\f\bR\u001f&t\u001bCo\n;z\b\b";
        objectArray[27] = "}\u0004zW0Qc\f`\u0018RMd\u0011";
        objectArray[28] = "D\u0004l\u000f\u0003AR\u0004iU\u0010VEOjS\u001cBT\b}DWRj";
        objectArray[29] = "=\u001c\\\u0002;\u0017+\u001cYX(\u0000<WZ^$\u0014-\u0010MIo\u0004.";
        objectArray[30] = "\u001f%;7Q\u0004\t%>mB\u0013\u001en=kN\u0007\u000f)*|\u0005\u0012-";
        objectArray[31] = "\u000fnh\u000e:\u0007\u0019nmT)\u0010\u000e%nR%\u0004\u001fbyEn\u0013#";
        objectArray[32] = "L.<s}-Z.9)n:Me:/b.\\\"-8)9P";
        objectArray[33] = "\u0010l<VAj\u0006l9\fR}\u0011':\n^i\u0000`-\u001d\u0015{\u0003";
        objectArray[34] = "5\u0004\u0019eLd#\u0004\u001c?_s4O\u001f9Sg%\b\b.\u0018u8";
        objectArray[35] = "- n\b\"5; kR1\",khT=6=,\u007fCv$\b";
        objectArray[36] = "6Gu{ \u0017 Gp!3\u00007\fs'?\u0014&Kd0t\u0004#";
        objectArray[37] = "'\u0003\u0004\u001cv\u00101\u0003\u0001Fe\u0007&H\u0002@i\u00137\u000f\u0015W\"\u0003\u0000";
        objectArray[38] = ">Xi\r4n5WxBNj&\\~\b";
        objectArray[39] = "\u0003\u0001\u0007AQ\u0014\u001d\t\u001d\u000e\u001c\u000e\u0007\u0003\u0004R\r\u0004\u0007\u0014_A\u000b\u000e\u0004\t\u0012\u000e>\u0015\u0006\r\u0018C=\u000e\u0006\f\u0014A\u0011";
        objectArray[40] = "@\u007f2<\u001a-V\u007f7f\t:A44`\u0005.Ps#wN9T";
        objectArray[41] = "7>.ltTB\u001e%ce\u001b#\u0010.haAW";
        objectArray[42] = "\u000fQ3 d2\u0019Q6zw%\u000e\u001a5|{1\u001f]\"k0$[";
        objectArray[43] = "oo\u001d \u000fHyo\u0018z\u001c_n$\u001b|\u0010K\u007fc\fk[_2";
        objectArray[44] = "\u001cxQ0\u000eR\nxTj\u001dE\u001d3Wl\u0011Q\ft@{ZF<";
        objectArray[45] = "2gY8(\u0012$g\\b;\u00053,_d7\u0011\"kHs|\u0004`";
        objectArray[46] = "kj\bVr\u0014}j\r\fa\u0003j!\u000e\nm\u0017{f\u0019\u001d&\u0005z";
        objectArray[47] = "K?4z$_]?1 7HJt2&;\\[3%1pLb";
        objectArray[48] = "BpTJW\u0010NgI\u0007\\\u0012\u0002sA\u0006C\u0018O;A\u0014X_IcE\nE_icE\nE";
        objectArray[49] = "cZ\u0003y\u0015ZhU\u00126tTc^\u0016l";
        objectArray[50] = "\u0004|tg\u0014)\u0005ypV\tJU`.6\u0001 Ze-f";
        objectArray[51] = "z \u0000\u0001'*{%\u000406I}<\u0003N3r? T[_p? \u001a\\d2#w\u000f0";
        objectArray[52] = "Q\u001c\u0001\u001csHP\u0019\u0005-a+U\u0016]\u0017qG\u0001\u0006\\S";
        objectArray[53] = "\t5\u0007D,)[mVB\u0011)et\u0014\u0016v,\u001bcSW\u007f@XtPN}%\u001es\u000bK\u0011";
        objectArray[54] = "\u0007aG8r\u0013\u0003sU4\u0002\u0010]gX;UG\u00030\u0000W9\u0001Fs_kg\u0017\u0002v";
        objectArray[55] = "hAb21RiDf\u0003416V`n*\u000b<Ffa";
        objectArray[56] = "\u001eTiVa\t\u001cG)\u0015\u0007]\"EiT`[\\R.\u0015i7\u001fE-\fkRYBv\t\u0007";
        objectArray[57] = "\u0013,\u001fKm{\u0012)\u001bz\u007f\u0018D0\u0014\u0011otB2C\u0017\u0015)]w\u0004@o~N!\u001ez";
        objectArray[58] = "!\u0000g\u0004\u0012+c\u001c0\u0011~hb\u001af\u0006%lq\u0010c&\u0004ys\u0016\u0000K\u000e,gAz\u001c\u001dz}{";
        objectArray[59] = "=_<dL&9M.h<.kH'lP\u001c?\tz2<pmO({Qt\u007f]$\u000b";
        objectArray[60] = ";|c:'&?nq6W%az|9\u0000r>''Ui5kle'5r8i";
        objectArray[61] = "\u0010iD?\u001c\f\fg\u0019*p\u000fq;Gl\b\u0005\u001d)A7Nf@)G+J\u001c\u0017:\u00111p";
        objectArray[62] = "\u0012UHle]\u0013PL]q>NPRc|O\u001c\\Ra";
        objectArray[63] = "\u001aV\rB'\u001eNF\f\u0006]\u0018 @JE:\u001e^W\r\u00043r\u001d@\u000e\u001d1\u0017[GU\u0018]";
        objectArray[64] = "\u0012r*U>$\u0013w.d=GOs7\u0019$\"Cp+\u001a";
        objectArray[65] = "\u00149\u0010~~\u0017\u0015<\u0014OitI \u000f!i\u0017Q7J2";
        objectArray[66] = "\u0014\\\u000b\u00004I\u0015Y\u000f14*O\u0002\u0017_2LD\u0003^W";
        objectArray[67] = "\u007f\t\u0011SE'~\f\u0015b]D$\u000b\u0007\u000bP6+\u001f\u0005\u0000";
        objectArray[68] = "z\u0010LPf_~\u0002^\\\u0016\\ \u0016SSA\u000b~F\n?&\u000b3\u000bX\u0007y[\"F";
        objectArray[69] = "~\bXTb,\u007f\r\\ewO&TQ\u0004eqq\fZ\n";
        objectArray[70] = "L]+pZ+MX/ACH\u0014Dr&H.\b]4>";
        objectArray[71] = "q0O\u001bImp5K*_\u000e(8[\u0016^4#nNQ";
        objectArray[72] = "<\u0013\u0001\\\r2=\u0016\u0005m\tQzKZ\u001f\r)2\u0016_\u000e";
        objectArray[73] = "\u0014Y3Jp=TXfJ\rk$B#JjmZUd\u000bc\u0001\u0015I`\b7{BZ6\u0012\r";
        objectArray[74] = "4W6}E>5R2LV]s\u000e+5]&zU##";
        objectArray[75] = "4P\u0002dLn`@\u0003 6i\u000eFEcQnpQ\u0002\"X\u00023F\u0001;ZguAZ>6";
        objectArray[76] = "\nD\u001fjZ\u0015BC\u000e85\u001a\u000e^\u0018hS\r/D\u0018h\\\u001ds]\u0002xZ\u001e\u0017\u0015\u0005i\bq";
        objectArray[77] = "\u0011\tn\u0016\u0003\u001b\u0010\fj'\u0011xF\u0015eL\u0001\u0014@\u00172J{";
        objectArray[78] = "]g@\r\nF\\bD<\u001b%\u0019i@\\\u001d\\\u0005|\u001fC";
        objectArray[79] = "$\u0000tr}\u00058\u0015+m\u0012\u00073\u0015\u0010/iG;\u0005uin\u001c>i!b.\u0003d\u0013vqx\u0019^";
        objectArray[80] = "5(\u0014\\\u000bc <J\u0001ljN?\r^\u000bi0(J\u001f\u0002\u0005\u007f4N\u001cV\u007f('\u0018\u0006l";
        objectArray[81] = "l\u000e\f}M*m\u000b\bLJIo\u0012S)Y,)\u0015\b,";
        objectArray[82] = "b/E\f)\u0006c*A=/e0rMRl\fb*\u001cT";
        objectArray[83] = "Gi`.\u0015\u0017Fld\u001f\u000bt\u0005o9c\u0006H\u0014|5u";
        objectArray[84] = "},&\u001e\\B/ &\u001c=Z\u001f,d\u0018EPs>bC\u00033";
        objectArray[85] = "\\~\u001e\u001f\u000e\u0007]{\u001a.\u0012d\u000f!C\u0012\u0013\u0005Rf\u001d\u001e";
        objectArray[86] = "A\u0007,\u00077\u0018@\u0002(6,{\u0003\u0010(\f(\u0006\u001a\t4\\";
        objectArray[87] = "m\\9\u0017V\u001dlY=&I~.Za\u001c\u001e\u000e4C`C";
        objectArray[88] = "\fi'Z{8\u001ew/\u0003\t1fr*\u0004n4\u0018emEgXWyiF3\"\u0000j?\\\t";
        objectArray[89] = "jY\u00114\u0019lvLN+v~wU\r=\fxYV\u0019\u000f\u001bi\u0010\r\u000eo\u0013yuK\t4\u0016\u0015-KN1\u001apkL\u00154v(k\u000b\u00108\u0013nlP\u0015T";
        objectArray[90] = "\r'ochS\f\"kRj0M&6/uV\n9o0";
        objectArray[91] = "NpCE\u0013\u0017OuGt\tt\u000eiV\u0016\u0017L\n+J\u001d";
        objectArray[92] = "\u0005\u0012[N\u0003S\u0004\u0017_\u007f\u00020D\u0007\u0001\u001aELX\f^\u0007";
        objectArray[93] = "WNz\u001e\u0005pKL&Ow6JF'\u000e\u000b!])7\u0015\u001c0\u001a\u00156JO1'\u00186I\bv]O%\u001f\u0012L";
        objectArray[94] = "Z,O~j\u0004\u0007k\u0011r\u000f\u000e7o\t\u007fh\tIxN>ae\noM'c\u0000Lh\u0016\"\u000f";
        Object[] objectArray2 = objectArray;
        objectArray[95] = "\u0007ug; Z\u0006pc\n19Bm>m4GU*\u007fdX\u0004B)ff=BErc\n";
    }

    public void init() {
        Object object;
        long l;
        long l2;
        long l3;
        long l4;
        long l5;
        long l6;
        long l7;
        long l8;
        long l9;
        long l10;
        long l11;
        long l12;
        long l13;
        long l14;
        long l15;
        long l16;
        block7: {
            block8: {
                long l17 = l16 = y ^ 0xF19CAD9C176L;
                l15 = l17 ^ 0x7AB8CD358308L;
                l14 = l17 ^ 0x5B057A01318DL;
                l13 = l17 ^ 0x33A5410839C5L;
                l12 = l17 ^ 0x37E2E5B2F9ABL;
                l11 = l17 ^ 0x48EF8DE16BE4L;
                l10 = l17 ^ 0x623A0BCC6CC3L;
                l9 = l17 ^ 0x6D2C15EFEDF7L;
                l8 = l17 ^ 0x56618B089845L;
                l7 = l17 ^ 0x4D6221BD8B86L;
                l6 = l17 ^ 0x61F17F0E9AC3L;
                l5 = l17 ^ 0x3594B85EF0BDL;
                l4 = l17 ^ 0x22512ADFFAB2L;
                l3 = l17 ^ 0x7921B16D9F57L;
                l2 = l17 ^ 0x7957E1C36748L;
                l = l17 ^ 0x69D2ADF9BBD7L;
                CallSite callSite = Prestige.a("\u00c7", (long)-8395746048137766451L, (long)l16);
                try {
                    object = Prestige.a("\u00cc", (Object)Prestige.a("\u00cf", (long)-8395652287749825395L, (long)l16), (boolean)false, (boolean)true, (long)-8396597675921226785L, (long)l16);
                    if (callSite != null) break block7;
                    if (object != false) break block8;
                }
                catch (Throwable throwable) {
                    throw Prestige.a("\u00c7", (Object)throwable, (long)-8402639508708900753L, (long)l16);
                }
                return;
            }
            object = 0;
        }
        Object object2 = object;
        try {
            Prestige.a("\u00e2", (bO)new bO(), (long)-8403091464276848698L, (long)l16);
            Prestige.a("\u00e2", (cJ)new cJ(l), (long)-8403569915212115269L, (long)l16);
            Prestige.a("\u00c7", (Object)Prestige.a("\u00cc", (Object)Prestige.a("\u00cf", (long)-8403569915212115269L, (long)l16), (long)-8396387506690301643L, (long)l16), (long)-8403585836234407063L, (long)l16);
            Prestige.a("\u00e2", (cC)new cC(), (long)-8395356398335005937L, (long)l16);
            Prestige.a("\u00e2", (aw_0)new aw_0(), (long)-8395172013810293910L, (long)l16);
            Prestige.a("\u00e2", (aA)new aA(l4), (long)-8395050776094184606L, (long)l16);
            Prestige.a("\u00e2", (fV)new fV(), (long)-8394917894001947502L, (long)l16);
            Prestige.a("\u00e2", (dx_0)new dx_0(l10), (long)-8394774037596870348L, (long)l16);
            Prestige.a("\u00e2", (ai_0)new ai_0(l15), (long)-8395089293263231846L, (long)l16);
            Prestige.a("\u00e2", (au_0)new au_0(), (long)-8396412444856317745L, (long)l16);
            Prestige.a("\u00e2", (g9)new g9(), (long)-8396240833298579462L, (long)l16);
            object2 = 1;
            Prestige.a("\u00e2", (g8)new g8(l8), (long)-8396298504672471739L, (long)l16);
            Prestige.a("\u00e2", (cm_0)new cm_0(l12), (long)-8402695702573655152L, (long)l16);
            Prestige.a("\u00e2", (f0)new f0(l2), (long)-8395866788179873567L, (long)l16);
            Prestige.a("\u00e2", (dD)new dD(l6), (long)-8396161077165595956L, (long)l16);
            Prestige.a("\u00e2", (dH)new dH(l14), (long)-8394831317772061260L, (long)l16);
            Prestige.a("\u00e2", (cM)new cM(l3), (long)-8396912227714605667L, (long)l16);
            Prestige.a("\u00e2", (f6)new f6(l13), (long)-8396499444165481086L, (long)l16);
            Prestige.a("\u00e2", (cq_0)new cq_0(l9), (long)-8395547905156132354L, (long)l16);
            Prestige.a("\u00e2", (bY)new bY(l11), (long)-8402912477023569744L, (long)l16);
            Prestige.a("\u00e2", (cw_0)new cw_0(l7), (long)-8394985272918767512L, (long)l16);
            Prestige.a("\u00e2", (cR)new cR(l5), (long)-8395971739578306332L, (long)l16);
            Prestige.a("\u00c7", (Object)new Object[]{Prestige.a("\u00c7", (long)-8395765263690813847L, (long)l16)}, (long)-8396092930481702657L, (long)l16);
            Prestige.a("\u00cc", (Object)dr_0.a, Prestige::lambda$init$0, (long)-8396823028712454223L, (long)l16);
            Prestige.a("\u00cc", (Object)dr_0.b, Prestige::lambda$init$1, (long)-8396823028712454223L, (long)l16);
        }
        catch (Throwable throwable) {
            try {
                if (object2 == false) {
                    Prestige.a("\u00cc", (Object)Prestige.a("\u00cf", (long)-8395652287749825395L, (long)l16), (boolean)false, (long)-8395571265233218441L, (long)l16);
                }
            }
            catch (Throwable throwable2) {
                throw Prestige.a("\u00c7", (Object)throwable2, (long)-8402639508708900753L, (long)l16);
            }
            Prestige.a("\u00cc", (Object)throwable, (long)-8403260766894947749L, (long)l16);
        }
    }

    private static void lambda$init$1(aq_0 aq_02, gK gK2) {
        block11: {
            CallSite callSite;
            long l;
            long l2;
            long l3;
            block10: {
                long l4 = l3 = y ^ 0x7C0462041570L;
                l2 = l4 ^ 0x1BCE38A4DBE1L;
                l = l4 ^ 0x79B535F30E10L;
                CallSite callSite2 = Prestige.a("\u00c7", (long)6879849236612386251L, (long)l3);
                try {
                    if (Prestige.a("\u00cf", (long)6880700226221302422L, (long)l3) != false) {
                        return;
                    }
                }
                catch (MatchException matchException) {
                    throw Prestige.a("\u00c7", (Object)matchException, (long)6874077424995505257L, (long)l3);
                }
                try {
                    try {
                        callSite = Prestige.a("\u00c7", (long)6874623487252315196L, (long)l3);
                        if (callSite2 != null) break block10;
                        if (Prestige.a("\u00c1", (Object)callSite, (long)6874306081284796332L, (long)l3) == null) break block11;
                    }
                    catch (MatchException matchException) {
                        throw Prestige.a("\u00c7", (Object)matchException, (long)6874077424995505257L, (long)l3);
                    }
                    callSite = Prestige.a("\u00c7", (long)6874623487252315196L, (long)l3);
                }
                catch (MatchException matchException) {
                    throw Prestige.a("\u00c7", (Object)matchException, (long)6874077424995505257L, (long)l3);
                }
            }
            try {
                if (Prestige.a("\u00c1", (Object)callSite, (long)6873894900629491684L, (long)l3) != null) {
                    Object[] objectArray = new Object[1];
                    objectArray[0] = l;
                    Prestige.a("\u00c7", (Object)objectArray, (long)6881301253284142271L, (long)l3);
                    Object[] objectArray2 = new Object[1];
                    objectArray2[0] = l2;
                    Prestige.a("\u00cc", (Object)new bt_0(aq_02, gK2), (Object)objectArray2, (long)6874568361932012432L, (long)l3);
                }
            }
            catch (MatchException matchException) {
                throw Prestige.a("\u00c7", (Object)matchException, (long)6874077424995505257L, (long)l3);
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private static void lambda$init$0(aq_0 var0, gK var1_1) {
        block25: {
            block28: {
                block29: {
                    block27: {
                        block26: {
                            block24: {
                                v0 = var2_2 = Prestige.y ^ 93296096584995L;
                                var4_3 = v0 ^ 56145592118194L;
                                var6_4 = v0 ^ 43783049690257L;
                                var8_5 = v0 ^ 10211691233167L;
                                var10_6 = Prestige.a("\u00c7", (long)8009945164664552856L, (long)var2_2);
                                try {
                                    if (Prestige.a("\u00cf", (long)8011341578073854661L, (long)var2_2) != false) {
                                        return;
                                    }
                                }
                                catch (MatchException v1) {
                                    throw Prestige.a("\u00c7", (Object)v1, (long)8013742263103759418L, (long)var2_2);
                                }
                                try {
                                    try {
                                        v2 = Prestige.a("\u00c7", (long)8013233584469773423L, (long)var2_2);
                                        if (var10_6 != null) break block24;
                                        if (Prestige.a("\u00c1", (Object)v2, (long)8013408057021145087L, (long)var2_2) == null) break block25;
                                    }
                                    catch (MatchException v3) {
                                        throw Prestige.a("\u00c7", (Object)v3, (long)8013742263103759418L, (long)var2_2);
                                    }
                                    v2 = Prestige.a("\u00c7", (long)8013233584469773423L, (long)var2_2);
                                }
                                catch (MatchException v4) {
                                    throw Prestige.a("\u00c7", (Object)v4, (long)8013742263103759418L, (long)var2_2);
                                }
                            }
                            try {
                                try {
                                    if (var10_6 != null) break block26;
                                    if (Prestige.a("\u00c1", (Object)v2, (long)8014105098115743671L, (long)var2_2) == null) break block25;
                                }
                                catch (MatchException v5) {
                                    throw Prestige.a("\u00c7", (Object)v5, (long)8013742263103759418L, (long)var2_2);
                                }
                                v2 = cz_0.b;
                            }
                            catch (MatchException v6) {
                                throw Prestige.a("\u00c7", (Object)v6, (long)8013742263103759418L, (long)var2_2);
                            }
                        }
                        try {
                            try {
                                v7 = Prestige.a("\u00c1", (Object)v2, (long)8010631092618622709L, (long)var2_2);
                                if (var10_6 != null) break block27;
                                if (v7 != null) {
                                }
                                ** GOTO lbl62
                            }
                            catch (MatchException v8) {
                                throw Prestige.a("\u00c7", (Object)v8, (long)8013742263103759418L, (long)var2_2);
                            }
                            v7 = Prestige.a("\u00c1", (Object)cz_0.b, (long)8010631092618622709L, (long)var2_2);
                        }
                        catch (MatchException v9) {
                            throw Prestige.a("\u00c7", (Object)v9, (long)8013742263103759418L, (long)var2_2);
                        }
                    }
                    try {
                        try {
                            try {
                                try {
                                    v10 /* !! */  = v7 instanceof class_408;
                                    if (var10_6 != null) break block28;
                                    if (!v10 /* !! */ ) break block29;
                                }
                                catch (MatchException v11) {
                                    throw Prestige.a("\u00c7", (Object)v11, (long)8013742263103759418L, (long)var2_2);
                                }
lbl62:
                                // 2 sources

                                v12 = new Object[2];
                                v12[1] = var6_4;
                                v12[0] = bo_0.class;
                                v10 /* !! */  = Prestige.a("\u00cc", (Object)Prestige.a("\u00cf", (long)8013983009323789203L, (long)var2_2), (Object)v12, (long)8013502107517197361L, (long)var2_2);
                                if (var10_6 != null) break block28;
                            }
                            catch (MatchException v13) {
                                throw Prestige.a("\u00c7", (Object)v13, (long)8013742263103759418L, (long)var2_2);
                            }
                            if (!v10 /* !! */ ) break block29;
                        }
                        catch (MatchException v14) {
                            throw Prestige.a("\u00c7", (Object)v14, (long)8013742263103759418L, (long)var2_2);
                        }
                        v15 = new Object[1];
                        v15[0] = var4_3;
                        Prestige.a("\u00cc", (Object)new bo_0(var0, var1_1), (Object)v15, (long)8013160886362344387L, (long)var2_2);
                    }
                    catch (MatchException v16) {
                        throw Prestige.a("\u00c7", (Object)v16, (long)8013742263103759418L, (long)var2_2);
                    }
                }
                v17 = new Object[1];
                v17[0] = var4_3;
                v10 /* !! */  = Prestige.a("\u00cc", (Object)new bl_0(var0, var1_1), (Object)v17, (long)8013160886362344387L, (long)var2_2);
            }
            v18 = new Object[1];
            v18[0] = var8_5;
            Prestige.a("\u00c7", (Object)v18, (long)8009685764898223886L, (long)var2_2);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(Prestige.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


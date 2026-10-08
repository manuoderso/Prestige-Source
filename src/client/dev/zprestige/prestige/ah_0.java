/*
 * Decompiled with CFR 0.152.
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.hc;
import dev.zprestige.prestige.n_0;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from dev.zprestige.prestige.ah
 */
public class ah_0 {
    private final Supplier a;
    private final boolean b;
    private final Supplier c;
    private long d;
    private boolean e;
    private static final long f = hc.a(8049972644658965394L, 2174184448718479780L, MethodHandles.lookup().lookupClass()).a(128539298451904L);
    private static final long g;
    private static final Object[] h;
    private static final String[] i;

    public ah_0(float f, boolean bl, Supplier supplier, long l) {
        long l2 = (l = ah_0.f ^ l) ^ 0x454692AB74EAL;
        this(() -> ah_0.lambda$new$3(f), bl, supplier, l2);
    }

    public ah_0(Supplier supplier, boolean bl, n_0 n_02, long l) {
        long l2 = (l = f ^ l) ^ 0x5AE2DA22A42CL;
        this(supplier, bl, () -> ah_0.lambda$new$2(n_02), l2);
    }

    public ah_0(float f, boolean bl, n_0 n_02, long l) {
        long l2 = (l = ah_0.f ^ l) ^ 0x3AE3718FA4EEL;
        this(() -> ah_0.lambda$new$0(f), bl, () -> ah_0.lambda$new$1(n_02), l2);
    }

    public ah_0(Supplier supplier, boolean bl, Supplier supplier2, long l) {
        l = f ^ l;
        this.d = g;
        this.a = supplier;
        this.b = bl;
        this.c = supplier2;
        this.e = bl;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        h = new Object[25];
        i = new String[25];
        ah_0.a();
        long l = f ^ 0x8706D00F61BL;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = 5060884734556612103L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                g = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = ah_0.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ah_0.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ah_0.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ah_0.b(classArray2[i], string, clazz2, n, classArray);
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
            int n = ah_0.a(l, l2);
            object = h[n];
            try {
                if (!(object instanceof String)) break block2;
                ah_0.h[n] = clazz = Class.forName(i[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public void b(Object[] objectArray) {
        block8: {
            long l;
            long l2;
            block6: {
                l2 = (Long)objectArray[0];
                l = (l2 = f ^ l2) ^ 0x52E4E750A43AL;
                this.e = this.b;
                CallSite callSite = ah_0.a("r", (long)4381278067919697499L, (long)l2);
                try {
                    ah_0 ah_02;
                    block7: {
                        try {
                            try {
                                ah_02 = this;
                                if (callSite != null) break block6;
                                if (!ah_02.b) break block7;
                            }
                            catch (MatchException matchException) {
                                throw ah_0.a("r", (Object)matchException, (long)4381750148565128768L, (long)l2);
                            }
                            Object[] objectArray2 = new Object[1];
                            objectArray2[0] = l;
                            this.d = (long)(ah_0.a("r", (long)4381104701370901020L, (long)l2) - (long)((1.0 - ah_0.a("X", (Object)this, (Object)objectArray2, (long)4380555523802596734L, (long)l2)) * (double)ah_0.a("X", (Object)((Float)((Object)ah_0.a("X", (Object)this.a, (long)4380896311256063501L, (long)l2))), (long)4380999316980242352L, (long)l2)));
                            if (callSite == null) break block8;
                        }
                        catch (MatchException matchException) {
                            throw ah_0.a("r", (Object)matchException, (long)4381750148565128768L, (long)l2);
                        }
                    }
                    ah_02 = this;
                }
                catch (MatchException matchException) {
                    throw ah_0.a("r", (Object)matchException, (long)4381750148565128768L, (long)l2);
                }
            }
            Object[] objectArray3 = new Object[1];
            objectArray3[0] = l;
            ah_02.d = (long)(ah_0.a("r", (long)4381104701370901020L, (long)l2) - (long)(ah_0.a("X", (Object)this, (Object)objectArray3, (long)4380555523802596734L, (long)l2) * (double)ah_0.a("X", (Object)((Float)((Object)ah_0.a("X", (Object)this.a, (long)4380896311256063501L, (long)l2))), (long)4380999316980242352L, (long)l2)));
        }
    }

    private static Field c(long l, long l2) {
        int n = ah_0.a(l, l2);
        Object object = h[n];
        if (object instanceof String) {
            String string = i[n];
            int n2 = string.indexOf(8);
            Class clazz = ah_0.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ah_0.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ah_0.a(clazz3, string2, clazz2)) != null) {
                    ah_0.h[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ah_0.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ah_0.h[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ah_0.b(634904725938822L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = ah_0.a(l, l2);
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
                clazz3 = ah_0.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ah_0.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ah_0.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        ah_0.h[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ah_0.b(634904725938822L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ah_0.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ah_0.h[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ah_0.b(634904725938822L, 0L);
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

    private static void a() {
        Object[] objectArray = h;
        h[0] = "/t\u0007Lcs9t\u0002\u0016pd.?\u0001\u0010|p?x\u0016\u00077b\u0003";
        objectArray[1] = "\u0018CaPCDmcj_R\u000b\u0010{yX[Bx";
        objectArray[2] = "\u001efA\fnB\bfDV}U\u001f-GPqA\u000ejPG:\\";
        objectArray[3] = "\u001d\"\u0017e\u0019%h\u0002\u001cj\bj\t\f\u0017a\f0}";
        objectArray[4] = Double.TYPE;
        ah_0.i[4] = "java/lang/Double";
        objectArray[5] = "\u00108{(\u0013L\u001b7jgpA\u000e1";
        objectArray[6] = "\u0001pU7=>\u0017pPm.)\u0000;Sk\"=\u0011|D|i/\r";
        objectArray[7] = "V<hgY*]3y(:'H>vC\u000f%Y-jo\u0018(";
        objectArray[8] = "\u000b|\u001eFBz\u0015t\u0004\t\nz\u000f~\u001cN\u0003aON\u001dW\u001cc\bx\u001a";
        objectArray[9] = "Hi_r\u0017\u0016CfN=v\u0018HmJg";
        objectArray[10] = "a\u0011,]\njj\u001e=\u0012bjd\u0011.";
        objectArray[11] = Float.TYPE;
        ah_0.i[11] = "java/lang/Float";
        objectArray[12] = "1`yWP[:oh\u0018-N(uj[";
        objectArray[13] = Long.TYPE;
        ah_0.i[13] = "java/lang/Long";
        objectArray[14] = "dt7`W\u007f\u0011T<oF0pZ7dBj\u0004";
        objectArray[15] = "];7.[o\u000b`|:5`ah>nOk\u00133 f\b\tZd43S5\b#<o5";
        objectArray[16] = "\u0002,i.\b\u0006\u0003;n9u\u0007T!}:2\u0017=zqiO\u001eW>qj\u001cy\u0002,i.\b\u0006\u0003;n9u";
        objectArray[17] = "CB\u001d!=jEM\u0016Lk\u000e\\W\u0002%e7CSCL";
        objectArray[18] = "X\u00116ew1\u001eRm5\u00131\u0005KRo.%\u0001Kn=i-]-iib1\u0002\u0011;.jmd\u0016o%v2XD(-*T";
        objectArray[19] = "^O\u001b\u0007Qf\u001c\u0013O]:~g\u001d\n]@u\u0015F\u0014U\u0007\u0017\\\u0011\u0000\u0000\\+\u000eV\b\\:";
        objectArray[20] = "*aFV!*khG\u0010K%zm!Vzse.MR*&v\u0011";
        objectArray[21] = "h\u001d)M?\u001ai\n.ZB\u000b3\u0013)H\u001c\f3\t-4}\u0014iN'^9\u0014j\u001d@";
        objectArray[22] = "~I\u000b=\u000b%8\nPmo%+\u0005o7R1'\u0013Se\u00159{uT1\u001e%$I\u0006v\u0016yBNR}\n&~\u001c\u0015uV@";
        objectArray[23] = "eb{`Nt>fgs$'(~s`B0\tel`a-1`hv$}9ojj\u001f*?hn\r";
        Object[] objectArray2 = objectArray;
        objectArray[24] = "\u007fey\u00117k)>2\u0005YdC:iR(|,:3\u00159\r~e0\u0018(b~?w\tY";
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/ah" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ah_0.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'y' || c == '\u00d1' || c == 'H' || c == '\u00df') {
                field = ah_0.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'y' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00d1' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'H' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ah_0.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'X' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'r' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
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

    public float a(Object[] objectArray) {
        Object object;
        long l;
        long l2;
        block4: {
            block5: {
                l2 = (Long)objectArray[0];
                l = (l2 = f ^ l2) ^ 0x2980BCD31750L;
                CallSite callSite = ah_0.a("r", (long)7664611789862363336L, (long)l2);
                try {
                    try {
                        object = this;
                        if (callSite != null) break block4;
                        if (!((ah_0)object).e) break block5;
                    }
                    catch (MatchException matchException) {
                        throw ah_0.a("r", (Object)matchException, (long)7664102283112153299L, (long)l2);
                    }
                    Object[] objectArray2 = new Object[2];
                    objectArray2[1] = l;
                    objectArray2[0] = (double)ah_0.a("r", (double)1.0, (double)ah_0.a("r", (double)0.0, (double)((double)(ah_0.a("r", (long)7664996151142511759L, (long)l2) - this.d) / (double)ah_0.a("X", (Object)((Float)((Object)ah_0.a("X", (Object)this.a, (long)7664940864797984926L, (long)l2))), (long)7664890489170182435L, (long)l2)), (long)7665083112100044561L, (long)l2), (long)7664795330586675295L, (long)l2);
                    return (float)ah_0.a("X", (Object)((Object)((n_0)((Object)ah_0.a("X", (Object)this.c, (long)7664940864797984926L, (long)l2)))), (Object)objectArray2, (long)7664773929060949120L, (long)l2);
                }
                catch (MatchException matchException) {
                    throw ah_0.a("r", (Object)matchException, (long)7664102283112153299L, (long)l2);
                }
            }
            object = ah_0.a("X", (Object)this.c, (long)7664940864797984926L, (long)l2);
        }
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l;
        objectArray3[0] = (double)ah_0.a("r", (double)1.0, (double)ah_0.a("r", (double)0.0, (double)(1.0 - (double)(ah_0.a("r", (long)7664996151142511759L, (long)l2) - this.d) / (double)ah_0.a("X", (Object)((Float)((Object)ah_0.a("X", (Object)this.a, (long)7664940864797984926L, (long)l2))), (long)7664890489170182435L, (long)l2)), (long)7665083112100044561L, (long)l2), (long)7664795330586675295L, (long)l2);
        return (float)ah_0.a("X", (Object)((Object)((n_0)((Object)object))), (Object)objectArray3, (long)7664773929060949120L, (long)l2);
    }

    private double a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = f ^ l;
        try {
            if (!this.e) {
                return (double)ah_0.a("r", (double)1.0, (double)ah_0.a("r", (double)0.0, (double)(1.0 - (double)(ah_0.a("r", (long)-4607822360309702947L, (long)l) - this.d) / (double)ah_0.a("X", (Object)((Float)((Object)ah_0.a("X", (Object)this.a, (long)-4607913033965083956L, (long)l))), (long)-4607998448200520847L, (long)l)), (long)-4607770778339429053L, (long)l), (long)-4608059660710731251L, (long)l);
            }
        }
        catch (MatchException matchException) {
            throw ah_0.a("r", (Object)matchException, (long)-4607625578305049983L, (long)l);
        }
        return (double)ah_0.a("r", (double)1.0, (double)ah_0.a("r", (double)0.0, (double)((double)(ah_0.a("r", (long)-4607822360309702947L, (long)l) - this.d) / (double)ah_0.a("X", (Object)((Float)((Object)ah_0.a("X", (Object)this.a, (long)-4607913033965083956L, (long)l))), (long)-4607998448200520847L, (long)l)), (long)-4607770778339429053L, (long)l), (long)-4608059660710731251L, (long)l);
    }

    /*
     * Unable to fully structure code
     */
    public void a(Object[] var1_1) {
        block9: {
            block8: {
                var4_2 = (Boolean)var1_1[0];
                var2_3 = (Long)var1_1[1];
                var5_4 = (var2_3 = ah_0.f ^ var2_3) ^ 36133467499546L;
                var7_5 = ah_0.a("r", (long)3813738580983823995L, (long)var2_3);
                try {
                    try {
                        if (var7_5 != null) break block8;
                        if (!var4_2) {
                        }
                        ** GOTO lbl25
                    }
                    catch (MatchException v0) {
                        throw ah_0.a("r", (Object)v0, (long)3814382529403903584L, (long)var2_3);
                    }
                    v1 = new Object[1];
                    v1[0] = var5_4;
                    this.d = (long)(ah_0.a("r", (long)3813631597818653244L, (long)var2_3) - (long)((1.0 - ah_0.a("X", (Object)this, (Object)v1, (long)3813051565201100126L, (long)var2_3)) * (double)ah_0.a("X", (Object)((Float)ah_0.a("X", (Object)this.a, (long)3813532677723821613L, (long)var2_3)), (long)3813455500817211280L, (long)var2_3)));
                }
                catch (MatchException v2) {
                    throw ah_0.a("r", (Object)v2, (long)3814382529403903584L, (long)var2_3);
                }
            }
            try {
                if (var7_5 == null) break block9;
lbl25:
                // 2 sources

                v3 = new Object[1];
                v3[0] = var5_4;
                this.d = (long)(ah_0.a("r", (long)3813631597818653244L, (long)var2_3) - (long)(ah_0.a("X", (Object)this, (Object)v3, (long)3813051565201100126L, (long)var2_3) * (double)ah_0.a("X", (Object)((Float)ah_0.a("X", (Object)this.a, (long)3813532677723821613L, (long)var2_3)), (long)3813455500817211280L, (long)var2_3)));
            }
            catch (MatchException v4) {
                throw ah_0.a("r", (Object)v4, (long)3814382529403903584L, (long)var2_3);
            }
        }
        this.e = var4_2;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
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
            case 0 -> 63;
            case 1 -> 14;
            case 2 -> 24;
            case 3 -> 30;
            case 4 -> 47;
            case 5 -> 53;
            case 6 -> 25;
            case 7 -> 49;
            case 8 -> 52;
            case 9 -> 38;
            case 10 -> 60;
            case 11 -> 9;
            case 12 -> 36;
            case 13 -> 4;
            case 14 -> 27;
            case 15 -> 2;
            case 16 -> 12;
            case 17 -> 7;
            case 18 -> 20;
            case 19 -> 42;
            case 20 -> 57;
            case 21 -> 56;
            case 22 -> 34;
            case 23 -> 58;
            case 24 -> 26;
            case 25 -> 40;
            case 26 -> 44;
            case 27 -> 45;
            case 28 -> 29;
            case 29 -> 61;
            case 30 -> 23;
            case 31 -> 46;
            case 32 -> 1;
            case 33 -> 39;
            case 34 -> 15;
            case 35 -> 18;
            case 36 -> 22;
            case 37 -> 33;
            case 38 -> 35;
            case 39 -> 37;
            case 40 -> 21;
            case 41 -> 51;
            case 42 -> 43;
            case 43 -> 8;
            case 44 -> 3;
            case 45 -> 28;
            case 46 -> 41;
            case 47 -> 50;
            case 48 -> 0;
            case 49 -> 32;
            case 50 -> 55;
            case 51 -> 16;
            case 52 -> 48;
            case 53 -> 59;
            case 54 -> 10;
            case 55 -> 62;
            case 56 -> 17;
            case 57 -> 13;
            case 58 -> 6;
            case 59 -> 5;
            case 60 -> 54;
            case 61 -> 11;
            case 62 -> 19;
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
        ah_0.i[n3] = new String(cArray);
        return n3;
    }

    public boolean a(Object[] objectArray) {
        return this.e;
    }

    private static Float lambda$new$0(float f) {
        long l = ah_0.f ^ 0x6683F3FF44CCL;
        return ah_0.a("r", (float)f, (long)2032099607371439298L, (long)l);
    }

    private static n_0 lambda$new$2(n_0 n_02) {
        return n_02;
    }

    private static n_0 lambda$new$1(n_0 n_02) {
        return n_02;
    }

    private static Float lambda$new$3(float f) {
        long l = ah_0.f ^ 0x5D8F3FA261F5L;
        return ah_0.a("r", (float)f, (long)4110182131694107131L, (long)l);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ah_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


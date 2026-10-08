/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_310
 *  net.minecraft.class_8143
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.bg_0;
import dev.zprestige.prestige.dC;
import dev.zprestige.prestige.dF;
import dev.zprestige.prestige.dQ;
import dev.zprestige.prestige.dV;
import dev.zprestige.prestige.dn_0;
import dev.zprestige.prestige.f5;
import dev.zprestige.prestige.hc;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_310;
import net.minecraft.class_8143;

/*
 * Renamed from dev.zprestige.prestige.eq
 */
public class eq_0
extends dV
implements dF {
    private dQ a;
    private f5 c;
    private boolean i;
    private static final long k = hc.a(-485366304157136633L, 3972991697217793973L, MethodHandles.lookup().lookupClass()).a(179550430532674L);
    private static final String l;
    private static final Object[] m;
    private static final String[] n;

    public eq_0() {
        long l = k ^ 0xE732E552F9AL;
        long l2 = l ^ 0x2EA521C9A093L;
        this.c = new f5(l2);
        this.i = 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        m = new Object[70];
        n = new String[70];
        eq_0.f();
        long l = k ^ 0x5C43A1F1507FL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u00b5\u0081\u0006\u00e5\u00e8\bc\u009c".getBytes("ISO-8859-1"));
                eq_0.l = eq_0.b(byArray3).intern();
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    @Override
    public void e(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x7FAB131DDD11L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = this;
        eq_0.b("\u00a5", (Object)eq_0.b("\u00f9", (long)3993277244517786862L, (long)l), (Object)objectArray2, (long)3992522882340320890L, (long)l);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/eq" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static String b(byte[] byArray) {
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

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = eq_0.m(l, l2);
            object = m[n];
            try {
                if (!(object instanceof String)) break block2;
                eq_0.m[n] = clazz = Class.forName(eq_0.n[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = eq_0.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = eq_0.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = eq_0.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = eq_0.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = m;
        m[0] = "Q\u0013|x70G\u0013y\"$'PXz$(3A\u001fm3c$q";
        objectArray[1] = "\u0015}\u0015oZ\u0019`]\u001e`KV\u0001S\u0015kO\fu";
        objectArray[2] = Void.TYPE;
        eq_0.n[2] = "java/lang/Void";
        objectArray[3] = "\u001f\r2\u0002S2\t\r7X@%\u001eF4^L1\u000f\u0001#I\u0007!\u0017\u0001!B]l+\u001a!_]+\u001c\r";
        objectArray[4] = ":\u0011:\u0019N\u0006:\u0011-EB\t Z-[B\u001c'+}\u0006\u0013";
        objectArray[5] = "\u0007wW\u0003&\n\u0007w@_*\u0005\u001d<@A*\u0010\u001aM\u0014\u0019}";
        objectArray[6] = "J8cU5w\\8f\u000f&`Kse\t*tZ4r\u001eadA";
        objectArray[7] = "W\u0007\u001d\u0003\rE\"'\u0016\f\u001c\nC)\u001d\u0007\u0018P7";
        objectArray[8] = Boolean.TYPE;
        eq_0.n[8] = "java/lang/Boolean";
        objectArray[9] = Float.TYPE;
        eq_0.n[9] = "java/lang/Float";
        objectArray[10] = "!{(\u000e\u0016L!{?R\u001aC;0?L\u001aV<Am\u0012M\u001d";
        objectArray[11] = "\u0016XR_X,\u0000XW\u0005K;\u0017\u0013T\u0003G/\u0006TC\u0014\f?\u0000";
        objectArray[12] = "\u001aZ i\u0014\\oz+f\u0005\u0013\u000et m\u0001Iz";
        objectArray[13] = "Zgl\u001a>[Lgi@-L[,jF!XJk}QjJv";
        objectArray[14] = "\u007fT4<DS\nt?3U\u001cwl,4\\U\u001f";
        objectArray[15] = "\u001b-Xf\u000bB\r-]<\u0018U\u001af^:\u0014A\u000b!I-_TJ";
        objectArray[16] = "B\u001d:A\u0018I7=1N\t\u0006V3:E\r\\\"";
        objectArray[17] = "Y\u0000\u0010\u001b|\u0001Y\u0000\u0007Gp\u000eCK\u0007Yp\u001bD:P\u0006&";
        objectArray[18] = "`\u0015\"ie\u0000~\u001d8&\u0019\u0014d\u0010;e";
        objectArray[19] = "Jja<q8Jjv`}7P!v~}\"WP$*,c";
        objectArray[20] = "\u00028\"M\u001d\u001b\u000285\u0011\u0011\u0014\u0018s5\u000f\u0011\u0001\u001f\u0002gTI@";
        objectArray[21] = "7J\u0014:Sq!J\u0011`@f6\u0001\u0012fLr'F\u0005q\u0007e\u0018";
        objectArray[22] = ")<E}\r~\"3T2lp)8Ph";
        objectArray[23] = "3\u0006G\u0018\u007f98\tVW\u001796\u0006E";
        objectArray[24] = "?r\u000bb\u0011x)r\u000e8\u0002o>9\r>\u000e{/~\u001a)Em*";
        objectArray[25] = "s\u000bS+]\u0016x\u0004Bd>\u001bm\tM\u000f\u000b\u0019|\u001aQ#\u001c\u0014";
        objectArray[26] = "\u000bq\u0010^\u001c\u0007\u000bq\u0007\u0002\u0010\b\u0011:\u0007\u001c\u0010\u001d\u0016K\\AE]";
        objectArray[27] = Integer.TYPE;
        eq_0.n[27] = "java/lang/Integer";
        objectArray[28] = "@^}K}W@^j\u0017qXZ\u0015j\tqM]d?V(";
        objectArray[29] = "\r\u0014\u00035'\u007f\u001b\u0014\u0006o4h\f_\u0005i8|\u001d\u0018\u0012~sk8";
        objectArray[30] = "\u0014\u007fY\u0011\nwa_R\u001e\u001b8\u0000QY\u0015\u001fbt";
        objectArray[31] = ")\u0012.Wrl)\u00129\u000b~c3Y9\u0015~v4(k@,2";
        objectArray[32] = "1s,M3H1s;\u0011?G+8;\u000f?R,IiQf\u0013";
        objectArray[33] = "\n0pS\u0015*\u001c0u\t\u0006=\u000b{v\u000f\n)\u001a<a\u0018A8\t";
        objectArray[34] = "h_N\u0003\u0015b\u001d\u007fE\f\u0004-|qN\u0007\u0000w\b";
        objectArray[35] = "y\u0007%\bPny\u00072T\\acL2J\\td=c\u0013\u00041";
        objectArray[36] = "\u0001bn03.\u0001byl?!\u001b)yr?4\u001cX+,gp";
        objectArray[37] = "4|fd\u000b!4|q8\u0007..7q&\u0007;)F*{Wx";
        objectArray[38] = "\u0019\t7\u0001Og\u0012\u0006&N2\u007f\u0001\u0001/\u0007";
        objectArray[39] = "K\u0018\u0006\fok>8\r\u0003~$_6\u0006\bz~+";
        objectArray[40] = "o\u001bMA}h\u001a;FNl'{5MEh}\u000f";
        objectArray[41] = "2d5\u001aUQn#`F?\u000e\ra \u0004\\Vpd?CCl0e8\u0015\u0003\\uu5@?";
        objectArray[42] = "U\"2W]d\u000eun\u001c??d'dZC3\u001d\u007f6L\u0000U";
        objectArray[43] = "+K\"/b\u0018m\u0013w6\u0005\u001dq\u001b+\"RJ/LsN>\u0003hK?>~\u001fo\r";
        objectArray[44] = "%VoXi7-\u0017kJ\u0019:LV+Uzi1S4\u0012eSqR3D%c4B>\u0011\u0019";
        objectArray[45] = ":&\\F&!|~\t_A$`vUK\u0016s?+\u000e'#+n%_E 6zb";
        objectArray[46] = "f.&Vkw')p\\\u0014uZ.`\u001bw$'+\u007f\\h\u001eg*x\n(.\":u_\u0014";
        objectArray[47] = "A)bU~\u000f\u0007q7L\u0019\n\u001bykXN]E)24r^\u0016~c\fs\u000e\u0001k";
        objectArray[48] = "h\nc\u000b+\u001fmUl\u0018M\u0019\u000b\u0013z\u0017.Iv\u0016eP1s2\u00138\u000eqL7\u0017v\u000fM";
        objectArray[49] = "b\u007f\u000f:[\u0016y3\u0018$2\u001eds\u000f\u0012V\u001f`\u007fsbM\u001af{\u00029\u000f\n{\u0003";
        objectArray[50] = "^1r\u000e5p\\ol\u0010V|\u00008j\u0007\u0001/Qm>kiv\u001d0m\tk(\u0003.";
        objectArray[51] = "3]\u001cS\u0010MfMS\u0014iI>RHB>\u0017a\u0004\u0010.\u0004E$P@\u0016\u0019\u0016cM";
        objectArray[52] = "]Y\u00128\\e\u0003S\u001dl5bQH\u00121YP\u0000\u0005Ji\f\u0007XD\u000b<_}VMN35bPHB$L|\u0004Q\bV";
        objectArray[53] = "!\u0012s4\nJ!VuQ\u0004wk\u001652P\nn\tr-jNkT,mUKo\u001a-Q";
        objectArray[54] = "4k<9P|7v(~>{;v3`RIf6m6>\u007f)k8y\u0003q.w<\u0007Ft&3#6\u0006\"2vS";
        objectArray[55] = "*=Lm-v\"|H\u007f]{C=\b`>(>8\u0017'!\u0012z=Jya-\u007f9\u0004x]";
        objectArray[56] = "\u0014Y`@}6R\u00015Y\u001a8B\u0018mFv\n\u0016Y3\u0010\u001a`Q\u0000a\u001d*%A\r4!";
        objectArray[57] = "ouV__d/iQ\u0019/q9yN\u0005CCo;\u0012_\u0013\u0014jzL\rWe18\\\u0010/";
        objectArray[58] = "/Y\tV<i$Q\u0019@D~O\u0001\u0006S%'$\n\u0006L-\u0017/\u0005\u0000Pt|$\u0005\u001fXD";
        objectArray[59] = "L1\u001aIS^\u000f'J\u001eh\u000eS&]$Q_\by%\n\t\u0003\u0004%\u001e\u001dPZ\u0005C";
        objectArray[60] = "7\u001d\\\u0002\u0007ki\u0017SVnb1\u0015D;W3hO<\r\u0011h=\u000e\u0001\u0003\u0016t9p";
        objectArray[61] = "\u001f\u001d@\n-Y\u001fYFo dU\u0019\u0006\fw\u0019P\u0006A\u0013M]U[\u001fSrXQ\u0015\u001eo";
        objectArray[62] = "&\u0003iHG.f\u001fn\u000e7;p\u000fq\u0012[\t&M-H\n^#\fs\u001aO/xNc\u00077";
        objectArray[63] = "\fK(K\u000e#WL/\u000fb!6\u0002(\f\u0007&\u000b\u0002l\n";
        objectArray[64] = ")/D&]\u001c|&Ew1\u0011L$\u00034RB1!\u001csMx+%\u0012t\u0001\u0019)&\u0003s1";
        objectArray[65] = "h\u0002'c\rYz\u0002'#i\\\u0006T;=R\u000e;\u0004>8\u00185";
        objectArray[66] = "6vCsR\u0006 t\f!1\u000e=}\u001abo\t=g\u001e\u001e\u000f\u001f;u\u000boT]+hs";
        objectArray[67] = "\u007foujTwa;l &kw\u007fi=JY&36k\u001c\u000ebq6`\u001d5!gf7&";
        objectArray[68] = "?\u0017INAU(N\u0010O'\u0003?\u000bF\u001a\\n(\bLE\u001cSx\rI\u000f'S8\u0012CB\u0017\u0016(\u001f\u0016~";
        Object[] objectArray2 = objectArray;
        objectArray[69] = "].E\u0005\b<\u001d2BCx)\u000b\"]_\u0014\u001b]`\u0001\u0005GLX!_W\u0000=\u0003cOJxu\u001c`Y\u0004Gp\u0018.X8";
    }

    @Override
    public void d(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x52D6E774439DL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = this;
        eq_0.b("\u00a5", (Object)eq_0.b("\u00f9", (long)3245305310507187853L, (long)l), (Object)objectArray2, (long)3245157496028546300L, (long)l);
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00e3' || c == 'H' || c == '\u00f9' || c == 'h') {
                field = eq_0.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e3' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'H' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00f9' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = eq_0.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00a5' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00aa' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = eq_0.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public dC a(Object[] objectArray) {
        class_310 class_3102;
        long l;
        long l2;
        block15: {
            Object object;
            block14: {
                CallSite callSite;
                block13: {
                    l2 = (Long)objectArray[0];
                    long l3 = l2;
                    l = l3 ^ 0x27FCB0ED41D5L;
                    long l4 = l3 ^ 0x4DCDFBE1C8B5L;
                    callSite = eq_0.b("\u00aa", (long)-1174380339407577552L, (long)l2);
                    try {
                        try {
                            object = this.i;
                            if (callSite != null) break block13;
                            if (!object) return null;
                        }
                        catch (MatchException matchException) {
                            throw eq_0.b("\u00aa", (Object)matchException, (long)-1173248883451113365L, (long)l2);
                        }
                        Object[] objectArray2 = new Object[2];
                        objectArray2[1] = l4;
                        objectArray2[0] = Float.valueOf((float)eq_0.b("\u00a5", (Object)((Float)((Object)eq_0.b("\u00a5", (Object)this.a, (long)-1177397621731861128L, (long)l2))), (long)-1177140020157985459L, (long)l2));
                        object = eq_0.b("\u00a5", (Object)this.c, (Object)objectArray2, (long)-1174755639221263780L, (long)l2);
                    }
                    catch (MatchException matchException) {
                        throw eq_0.b("\u00aa", (Object)matchException, (long)-1173248883451113365L, (long)l2);
                    }
                }
                try {
                    try {
                        try {
                            if (callSite != null) break block14;
                            if (!object) return null;
                        }
                        catch (MatchException matchException) {
                            throw eq_0.b("\u00aa", (Object)matchException, (long)-1173248883451113365L, (long)l2);
                        }
                        class_3102 = b;
                        if (callSite != null) break block15;
                    }
                    catch (MatchException matchException) {
                        throw eq_0.b("\u00aa", (Object)matchException, (long)-1173248883451113365L, (long)l2);
                    }
                    object = eq_0.b("\u00a5", (Object)class_3102, (long)-1173397692831092282L, (long)l2);
                }
                catch (MatchException matchException) {
                    throw eq_0.b("\u00aa", (Object)matchException, (long)-1173248883451113365L, (long)l2);
                }
            }
            if (!object) return null;
            class_3102 = b;
        }
        try {
            if (eq_0.b("\u00e3", (Object)class_3102, (long)-1174684063724095820L, (long)l2) != null) {
                return null;
            }
        }
        catch (MatchException matchException) {
            throw eq_0.b("\u00aa", (Object)matchException, (long)-1173248883451113365L, (long)l2);
        }
        float f = 89.0f + eq_0.b("\u00a5", (Object)dn_0.a, (long)-1174028482007185997L, (long)l2) * 2.0f;
        Object[] objectArray3 = new Object[4];
        objectArray3[3] = l;
        objectArray3[2] = true;
        objectArray3[1] = () -> eq_0.lambda$calculate$0(f);
        objectArray3[0] = eq_0.b("\u00f9", (long)-1173859784092051577L, (long)l2);
        eq_0.b("\u00aa", (Object)objectArray3, (long)-1174579280683247200L, (long)l2);
        this.i = 0;
        return new dC((float)eq_0.b("\u00a5", (Object)eq_0.b("\u00e3", (Object)b, (long)-1174385950157456989L, (long)l2), (long)-1173433545386079227L, (long)l2), f);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @bP
    public void a(bg_0 bg_02) {
        long l;
        long l2;
        block15: {
            CallSite callSite;
            class_8143 class_81432;
            CallSite callSite2;
            long l3;
            block14: {
                CallSite callSite3;
                CallSite callSite4;
                block13: {
                    long l4 = l2 = k ^ 0x2CF8CED1587BL;
                    l3 = l4 ^ 0x4ED40AD13372L;
                    l = l4 ^ 0x282D9FD5620EL;
                    callSite4 = eq_0.b("\u00a5", (Object)bg_02, (Object)new Object[0], (long)3242351391076616686L, (long)l2);
                    callSite2 = eq_0.b("\u00aa", (long)3235157933694082406L, (long)l2);
                    try {
                        try {
                            callSite3 = callSite4;
                            if (callSite2 != null) break block13;
                            if (!(callSite3 instanceof class_8143)) return;
                        }
                        catch (MatchException matchException) {
                            throw eq_0.b("\u00aa", (Object)matchException, (long)3234037629568815933L, (long)l2);
                        }
                        callSite3 = callSite4;
                    }
                    catch (MatchException matchException) {
                        throw eq_0.b("\u00aa", (Object)matchException, (long)3234037629568815933L, (long)l2);
                    }
                }
                class_81432 = (class_8143)callSite3;
                callSite4 = eq_0.b("\u00a5", (Object)eq_0.b("\u00e3", (Object)b, (long)3234788762881377079L, (long)l2), (int)eq_0.b("\u00a5", (Object)class_81432, (long)3233641422442489693L, (long)l2), (long)3234305595062714454L, (long)l2);
                try {
                    callSite = callSite4;
                    if (callSite2 != null) break block14;
                    if (callSite == null) return;
                }
                catch (MatchException matchException) {
                    throw eq_0.b("\u00aa", (Object)matchException, (long)3234037629568815933L, (long)l2);
                }
                callSite = callSite4;
            }
            try {
                if (callSite != eq_0.b("\u00e3", (Object)b, (long)3235249738447092469L, (long)l2)) {
                    return;
                }
            }
            catch (MatchException matchException) {
                throw eq_0.b("\u00aa", (Object)matchException, (long)3234037629568815933L, (long)l2);
            }
            CallSite callSite5 = eq_0.b("\u00a5", (Object)eq_0.b("\u00a5", (Object)eq_0.b("\u00a5", (Object)class_81432, (Object)eq_0.b("\u00e3", (Object)b, (long)3234788762881377079L, (long)l2), (long)3234205345837258280L, (long)l2), (long)3242577849959185256L, (long)l2), (long)3234132277731924993L, (long)l2);
            try {
                try {
                    if (callSite2 != null) break block15;
                    if (eq_0.b("\u00a5", eq_0.l, (Object)callSite5, (long)3242063504607648077L, (long)l2) == false) return;
                }
                catch (MatchException matchException) {
                    throw eq_0.b("\u00aa", (Object)matchException, (long)3234037629568815933L, (long)l2);
                }
                this.i = 1;
                Object[] objectArray = new Object[1];
                objectArray[0] = l3;
                eq_0.b("\u00a5", (Object)this.c, (Object)objectArray, (long)3234413161174829044L, (long)l2);
            }
            catch (MatchException matchException) {
                throw eq_0.b("\u00aa", (Object)matchException, (long)3234037629568815933L, (long)l2);
            }
        }
        Object[] objectArray = new Object[1];
        objectArray[0] = l;
        eq_0.b("\u00a5", (Object)this.a, (Object)objectArray, (long)3234468030135339374L, (long)l2);
    }

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (eq_0.n[n3] != null) {
            return n3;
        }
        Object object = m[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 27;
            case 1 -> 60;
            case 2 -> 28;
            case 3 -> 42;
            case 4 -> 18;
            case 5 -> 21;
            case 6 -> 48;
            case 7 -> 55;
            case 8 -> 10;
            case 9 -> 43;
            case 10 -> 49;
            case 11 -> 56;
            case 12 -> 29;
            case 13 -> 41;
            case 14 -> 6;
            case 15 -> 17;
            case 16 -> 53;
            case 17 -> 4;
            case 18 -> 37;
            case 19 -> 26;
            case 20 -> 11;
            case 21 -> 7;
            case 22 -> 24;
            case 23 -> 22;
            case 24 -> 14;
            case 25 -> 19;
            case 26 -> 9;
            case 27 -> 32;
            case 28 -> 5;
            case 29 -> 52;
            case 30 -> 30;
            case 31 -> 2;
            case 32 -> 25;
            case 33 -> 51;
            case 34 -> 50;
            case 35 -> 44;
            case 36 -> 58;
            case 37 -> 35;
            case 38 -> 39;
            case 39 -> 54;
            case 40 -> 20;
            case 41 -> 62;
            case 42 -> 13;
            case 43 -> 40;
            case 44 -> 45;
            case 45 -> 47;
            case 46 -> 12;
            case 47 -> 3;
            case 48 -> 38;
            case 49 -> 0;
            case 50 -> 8;
            case 51 -> 23;
            case 52 -> 15;
            case 53 -> 16;
            case 54 -> 59;
            case 55 -> 61;
            case 56 -> 33;
            case 57 -> 34;
            case 58 -> 1;
            case 59 -> 63;
            case 60 -> 31;
            case 61 -> 57;
            case 62 -> 36;
            default -> 46;
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
        eq_0.n[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = eq_0.m(l, l2);
        Object object = m[n];
        if (object instanceof String) {
            String string = eq_0.n[n];
            int n2 = string.indexOf(8);
            Class clazz = eq_0.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = eq_0.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = eq_0.g(clazz3, string2, clazz2)) != null) {
                    eq_0.m[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = eq_0.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        eq_0.m[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = eq_0.n(1612427760899998L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = eq_0.m(l, l2);
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
                String string2 = eq_0.n[n];
                int n3 = string2.indexOf(8);
                clazz3 = eq_0.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = eq_0.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = eq_0.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        eq_0.m[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = eq_0.n(1612427760899998L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = eq_0.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        eq_0.m[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = eq_0.n(1612427760899998L, 0L);
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

    private static Method g(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    private static Field g(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static void lambda$calculate$0(float f) {
        long l = k ^ 0x56DABD797E59L;
        long l2 = l ^ 0x73E7888D2DEFL;
        CallSite callSite = eq_0.b("\u00a5", (Object)eq_0.b("\u00e3", (Object)b, (long)776748187845680343L, (long)l), (long)775425227032177556L, (long)l);
        eq_0.b("\u00a5", (Object)eq_0.b("\u00e3", (Object)b, (long)776748187845680343L, (long)l), (float)f, (long)782542701819867269L, (long)l);
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = eq_0.b("\u00f9", (long)775130777959862026L, (long)l);
        eq_0.b("\u00aa", (Object)objectArray, (long)776543203624382216L, (long)l);
        eq_0.b("\u00a5", (Object)eq_0.b("\u00e3", (Object)b, (long)776748187845680343L, (long)l), (float)callSite, (long)782542701819867269L, (long)l);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(eq_0.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


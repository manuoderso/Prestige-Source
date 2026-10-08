/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1657
 *  net.minecraft.class_1743
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.bD;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.bu_0;
import dev.zprestige.prestige.dM;
import dev.zprestige.prestige.dO;
import dev.zprestige.prestige.dP;
import dev.zprestige.prestige.dV;
import dev.zprestige.prestige.hc;
import dev.zprestige.prestige.q_0;
import dev.zprestige.prestige.y_0;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_1657;
import net.minecraft.class_1743;

/*
 * Renamed from dev.zprestige.prestige.ff
 */
public class ff_0
extends dV {
    private dP a;
    private dM d;
    private dO c;
    private boolean i;
    private static final long k = hc.a(2204962019879941899L, -6123508037719075743L, MethodHandles.lookup().lookupClass()).a(253980680099277L);
    private static final long l;
    private static final Object[] m;
    private static final String[] n;

    public ff_0() {
        long l = k ^ 0x73FB61441DB4L;
        long l2 = l ^ 0x4F1E97F52651L;
        this.i = 0;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = this::lambda$new$0;
        ff_0.b("\u00e0", (Object)this.c, (Object)objectArray, (long)-3889646780791991732L, (long)l);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        m = new Object[76];
        n = new String[76];
        ff_0.f();
        long l = k ^ 0x15E41D757D19L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = -8072987702666804856L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                ff_0.l = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/ff" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ff_0.m(l, l2);
            object = m[n];
            try {
                if (!(object instanceof String)) break block2;
                ff_0.m[n] = clazz = Class.forName(ff_0.n[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = ff_0.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ff_0.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ff_0.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ff_0.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = m;
        m[0] = "K3j0h@@<{\u007f\u0004CN>y0(";
        objectArray[1] = Boolean.TYPE;
        ff_0.n[1] = "java/lang/Boolean";
        objectArray[2] = "XUlXskNUi\u0002`|Y\u001ej\u0004lhHY}\u0013'\u007fw";
        objectArray[3] = "%Ok<wL.@zs\u0016B%K~)";
        objectArray[4] = "\u00143Efd\"\u00023@<w5\u0015xC:{!\u0004?T-038";
        objectArray[5] = "\u0001t@\t2[tTK\u0006#\u0014\tLX\u0001*]a";
        objectArray[6] = "\u001fJz\u0000H\u001f\u001fJm\\D\u0010\u0005\u0001mBD\u0005\u0002p=\u001f\u0015";
        objectArray[7] = "jH\u0003E\u001c\u000bjH\u0014\u0019\u0010\u0004p\u0003\u0014\u0007\u0010\u0011wrEXH";
        objectArray[8] = "AC\u001eO6\bAC\t\u0013:\u0007[\b\t\r:\u0012\\y]Um";
        objectArray[9] = "d8\u000f\u0002\u007fhd8\u0018^sg~s\u0018@sry\u0002I\u001f+%i1\u001a_a^8iK";
        objectArray[10] = "Pg\u00164\u00149%G\u001d;\u0005vDI\u00160\u0001,0";
        objectArray[11] = Void.TYPE;
        ff_0.n[11] = "java/lang/Void";
        objectArray[12] = "\u0015Z%\u0013d\u000e\u0015Z2Oh\u0001\u000f\u00112Qh\u0014\b``\n0^";
        objectArray[13] = "S:fJ.lS:q\u0016\"cIqq\b\"vN\u0000#Sz7";
        objectArray[14] = "XXto=\u001aNXq5.\rY\u0013r3\"\u0019HTe$i\tN";
        objectArray[15] = "\u0002#Jb\nDw\u0003Am\u001b\u000b\u0016\rJf\u001fQb";
        objectArray[16] = ")\ny\u000b:7\\*r\u0004+x=$y\u000f/\"I";
        objectArray[17] = "-\u000f41s%;\u000f1k`2,D2ml&=\u0003%z',";
        objectArray[18] = "}}q\u0015dvk}tOwa|6wI{umq`^0`\u007f";
        objectArray[19] = "Cf%M~\u001bHi4\u0002\u001d\u0016]d;i(\u0014Lw'E?\u0019";
        objectArray[20] = "tb\u0011\r &jj\u000bBG'{q\u0006\u0018a!";
        objectArray[21] = "c\u0005mkT@c\u0005z7XOyNz)XZ~?(s\f\u001e";
        objectArray[22] = "3tJ\u0000 w3t]\\,x)?]B,m.N\f\u001b{/";
        objectArray[23] = "`\u001b;>\u000fc`\u001b,b\u0003lzP,|\u0003y}!y#Z";
        objectArray[24] = "\tV \\\u000fJ\u0017^:\u0013mV\u0010C";
        objectArray[25] = "QB\u000fr\u000bCGB\n(\u0018TP\t\t.\u0014@AN\u001e9_PYN\u001c2\u0005\u001deU\u001c/\u0005ZRB";
        objectArray[26] = "U\"C\u000b<6C\"FQ/!TiEW#5E.R@h g";
        objectArray[27] = "2\\brzt9Ss=\u0007l*Tzt";
        objectArray[28] = "i\u0019*@kb\u001c9!Oz-}7*D~w\t";
        objectArray[29] = "d<\u001e\u0018pQd<\tD|^~w\tZ|Ky\u0006[\u0004$\u000f";
        objectArray[30] = Double.TYPE;
        ff_0.n[30] = "java/lang/Double";
        objectArray[31] = "\u000e-MrU%\u0018-H(F2\u000ffK.J&\u001e!\\9\u00014\u0003";
        objectArray[32] = "dpRN;%\u0011PYA*jp^RJ.0\u0004";
        objectArray[33] = "\u0001\u0002ZJVe\n\rK\u0005>e\u0004\u0002X";
        objectArray[34] = Float.TYPE;
        ff_0.n[34] = "java/lang/Float";
        objectArray[35] = "\b.@roX\u0016&Z=\u0012H\u0016";
        objectArray[36] = "\u0017\u001eaz\n^\u001c\u0011p5m\\\t\u001ap~V";
        objectArray[37] = Integer.TYPE;
        ff_0.n[37] = "java/lang/Integer";
        objectArray[38] = "Ppk\u0000|?%P`\u000fmpD^k\u0004i*0";
        objectArray[39] = "9X\u001e\u0017JC/X\u001bMYT8\u0013\u0018KU@)T\u000f\\\u001eW3";
        objectArray[40] = "w\u0001\nwc0\u0002!\u0001xr\u007fc/\nsv%\u0017";
        objectArray[41] = "Z1`VB\u0017L1e\fQ\u0000[zf\n]\u0014J=q\u001d\u0016\u0003q";
        objectArray[42] = "GIl\u001f:02ig\u0010+\u007fSgl\u001b/%'";
        objectArray[43] = ")Bq/+qjRpnYf\u0013\u0007z\u007f2t|B'l;\f";
        objectArray[44] = ".;vO\u0019~+d+Hkksg\"\u001d<<-4{qWt*q+\r\u0004fbk";
        objectArray[45] = "N&\u001bH\u0013'KyFOa2\u0013zO\u001a6eM-\u0017v\\?Nf\u0014\u000fZ \u0011-";
        objectArray[46] = "o\u0000tP7]kA{\u000b[Z0\u0011.Z\f\rjGq6eHo\u001a&_a\t`A";
        objectArray[47] = "e%\u001a}p4d}T:\u001a/geKbv\u001d3)\u00178$Jj)Pi (r%\u00104\u001a";
        objectArray[48] = "^D\u0002zb\u0019\u001dT\u0003;\u0010\rdFS5s\u0007\u0019\u0003\u00006-d[BP)!\u000f]B\u0002v\u0010";
        objectArray[49] = "V ;?MAS\u007ff8?T\u000b|omh\u0003T!4\u0001P\u0006[ia\u007fQ^\u0015.";
        objectArray[50] = "\u0000I]\u0001HQ\u001dO\u000e\b,\u0007`M\t\u0007\u0011\u0011\u0019\u0010\u000eR^";
        objectArray[51] = "\f65\u0011i\u0015[:o\u0019P\u0016\u000f#\u0004]*\u0018\u00040_@(\u0019\u00016=@?\u0012\r_";
        objectArray[52] = "0<Y\u0011\u0015\u0010z#^\u0014+Em1CLGw?|\u001b\u001a+\u0011<#\u0018P\u0014^|'\u001b+";
        objectArray[53] = "u\"\b?J}}#\u001d=t\"u&\u0004&\u0018\u0010%j\\|t~!0\u0016#\b*|:]A";
        objectArray[54] = "nU$\u0017R\u0019cS3Uc\u001bkQ\u0013\u0005\u0013\u0007\u0002\u0013l\u0002\u0011\u0019~G1\bZ{";
        objectArray[55] = "\u0002s\u0007>/=\u0004lXu\u0010!Rl[(|\u0013\u0001(\u0007p\u0010tNj\u0001q >Qm\u0004O";
        objectArray[56] = "t\u00010\u0010'3i\u0007c\u0019Ck\u0014\u0001cQxer\\6F-";
        objectArray[57] = "\u001b|#\u00017@\u000ei-PP\u0018\u0012\u0003~\u0018a\u0012\u0003l\"\b.\u0018|9=P=\u0000\u0013e-\u001f7\u007f\u001b|#\u00017@\u000ei-PP";
        objectArray[58] = "}X`\u0011\u0003$p\u001ds\u0016f}\u0011\fj\u0011X}w\u001brO\u001f\u0014}\u0000jO\u000frj\u00184\bf";
        objectArray[59] = "E0\u0010'pDH6\u0007eA@D?\u001dX{_\u0018\"\u001e7'OW(a";
        objectArray[60] = "CC\bNG|KB\u001dLy#CG\u0004W\u0015\u0011\u0013\u0007[\u000fy(GQT\t\u0015\u007fK\u000b\\0";
        objectArray[61] = "3\u000fD\u0013\u0017\u0000n\b\u0011\\n\u0010RMGP\r\u001a/\b\u0014SSyk\b\u0010\\\f\u0005?U\u001a\u0017n";
        objectArray[62] = "R(8X)\u0004\u0013;i\u0013\u0012^L7\b\u0001vBGK/Q}]K m\njE*";
        objectArray[63] = "0_S\u0004R_iI\u001b`@Ej_\u000e\tL|d_\u001e\r*\u001b4Q\u0011\u0002VOi[Z`";
        objectArray[64] = ".^ObnB#\u001b\\e\u000b\u001eB\u001a\u0018|h\u0011?_K\u007f6r{_Opi\u000e/\u0002E;\u000b";
        objectArray[65] = "bt\u001e'FF!f\u0018<vF\u0019k^ \u0015Ld.\r#K/bt\u001e'FF!f\u0018<v";
        objectArray[66] = "\n8\u0014Y\u007fv\f'K\u0012@aV6LD\u00171\rf\u0012(y6])JT-kWb";
        objectArray[67] = "\u007f4>\r\u0000\u001cy+aF?\u0000/+b\u001bS2\u007fg?L?\u00068=f\u0005T\b!oy|[\b>k?\u0011O\u000b&4\u0002";
        objectArray[68] = "N{W0;2\u0013.@eT=+>\u0013u77V{@viT\u0012{Dy6(F&N2T";
        objectArray[69] = "YQ\u0014x8\u001b\u0007G\u0017x@\u0000`\fVu-\u0016\u000fPF:'i";
        objectArray[70] = "\u001dZ#Ft\u0004\u0005Vc\u001bN\u0007\u0001\u0007\"C2\u0001\u0007j4U?\u0019L\b9S([}";
        objectArray[71] = "\u0017\n!@\u0006\u0005\u0012\t-C<R\u0016\u001c!XbU\u0016\u0006%$ZA\u0003@uK\fN\u0002\u0014H";
        objectArray[72] = "Q#6Z%g\u00021~@H~\u0000.nF$LTm1\u0011s\u001bS.0G$rWo?\u001cH";
        objectArray[73] = "K^-3ww\u0000X<&\nezXm)io\u0007\u001d>*7\fC\u001d:%hp\u0017@0n\n";
        objectArray[74] = "x\u0018CP\u001d\u001c;\bB\u0011o\bB\u001a\u0012\u001f\f\u0002?_A\u001cRa(\u0019E\u001c\n\u001e;\u000fI\u000eo";
        Object[] objectArray2 = objectArray;
        objectArray[75] = "D\t\u001b:\u0019$_CL9u=>EM\u007f\u00167C\u0000\u001e|HTG\u0000\u001fc\u0014?\u0005[\b{u";
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'O' || c == '\u00f8' || c == 'i' || c == 'X') {
                field = ff_0.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'O' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00f8' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'i' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ff_0.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e0' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'C' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private boolean d(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l = k ^ l;
        long l3 = l2 ^ 0x305AD97232D8L;
        long l4 = l2 ^ 0x17B2C115276DL;
        CallSite callSite = ff_0.b("\u00e0", (Object)((Float)((Object)ff_0.b("\u00e0", (Object)this.c, (long)5999769616003769812L, (long)l))), (long)5999862331030432288L, (long)l);
        reference var10_6 = callSite * callSite;
        CallSite callSite2 = ff_0.b("\u00e0", (Object)ff_0.b("\u00e0", (Object)ff_0.b("O", (Object)b, (long)6007358835206026267L, (long)l), (long)6006072882683850788L, (long)l), (long)5999808845501325662L, (long)l);
        CallSite callSite3 = ff_0.b("C", (long)6005831129066840897L, (long)l);
        while (ff_0.b("\u00e0", (Object)callSite2, (long)6007714899546603902L, (long)l) != false) {
            block23: {
                CallSite callSite4;
                block22: {
                    block21: {
                        class_1657 class_16572;
                        block20: {
                            block19: {
                                class_1657 class_16573;
                                block17: {
                                    class_16572 = (class_1657)ff_0.b("\u00e0", (Object)callSite2, (long)6006918668713535497L, (long)l);
                                    try {
                                        try {
                                            class_16573 = class_16572;
                                            if (callSite3 != null) break block17;
                                            if (class_16573 == ff_0.b("O", (Object)b, (long)6005918063269915957L, (long)l)) {
                                                continue;
                                            }
                                        }
                                        catch (MatchException matchException) {
                                            throw ff_0.b("C", (Object)matchException, (long)6006846956218848616L, (long)l);
                                        }
                                    }
                                    catch (MatchException matchException) {
                                        throw ff_0.b("C", (Object)matchException, (long)6006846956218848616L, (long)l);
                                    }
                                    class_16573 = class_16572;
                                }
                                try {
                                    callSite4 = ff_0.b("\u00e0", (Object)class_16573, (long)6007612262407346485L, (long)l);
                                    if (callSite3 != null) break block19;
                                    if (callSite4 == false) {
                                        continue;
                                    }
                                }
                                catch (MatchException matchException) {
                                    throw ff_0.b("C", (Object)matchException, (long)6006846956218848616L, (long)l);
                                }
                                Object[] objectArray2 = new Object[2];
                                objectArray2[1] = l4;
                                objectArray2[0] = class_16572;
                                callSite4 = ff_0.b("\u00e0", (Object)ff_0.b("i", (long)6006717980336076113L, (long)l), (Object)objectArray2, (long)5999669495688896822L, (long)l);
                            }
                            try {
                                if (callSite3 != null) break block20;
                                if (callSite4 == false) {
                                    continue;
                                }
                            }
                            catch (MatchException matchException) {
                                throw ff_0.b("C", (Object)matchException, (long)6006846956218848616L, (long)l);
                            }
                            Object[] objectArray3 = new Object[2];
                            objectArray3[1] = l3;
                            objectArray3[0] = ff_0.b("\u00e0", (Object)ff_0.b("\u00e0", (Object)class_16572, (long)6006987924990226308L, (long)l), (long)6007467625659226620L, (long)l);
                            callSite4 = ff_0.b("\u00e0", (Object)ff_0.b("i", (long)6007430397901895873L, (long)l), (Object)objectArray3, (long)6007061510243719408L, (long)l);
                        }
                        try {
                            if (callSite3 != null) break block21;
                            if (callSite4 != false) {
                                continue;
                            }
                        }
                        catch (MatchException matchException) {
                            throw ff_0.b("C", (Object)matchException, (long)6006846956218848616L, (long)l);
                        }
                        reference cfr_temp_0 = ff_0.b("\u00e0", (Object)ff_0.b("O", (Object)b, (long)6005918063269915957L, (long)l), (Object)class_16572, (long)5999613924490830031L, (long)l) - (double)var10_6;
                        callSite4 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                    }
                    try {
                        if (callSite3 != null) break block22;
                        if (callSite4 > 0) break block23;
                    }
                    catch (MatchException matchException) {
                        throw ff_0.b("C", (Object)matchException, (long)6006846956218848616L, (long)l);
                    }
                    callSite4 = (CallSite)1;
                }
                return (boolean)callSite4;
            }
            if (callSite3 == null) continue;
        }
        return false;
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ff_0.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @bP
    public void a(bD var1_1) {
        block18: {
            block17: {
                var2_2 = ff_0.k ^ 109201895419306L;
                var4_3 = var2_2 ^ 57498955768372L;
                var6_4 = ff_0.b("C", (long)-5043581608672179688L, (long)var2_2);
                try {
                    if (ff_0.b("\u00e0", (Object)var1_1, (Object)new Object[0], (long)-5036741800787407001L, (long)var2_2) != y_0.POST) {
                        return;
                    }
                }
                catch (MatchException v0) {
                    throw ff_0.b("C", (Object)v0, (long)-5042345121133462479L, (long)var2_2);
                }
                var7_5 = ff_0.b("O", (Object)ff_0.b, (long)-5043928088702504137L, (long)var2_2);
                try {
                    if (var7_5 == null) {
                        return;
                    }
                }
                catch (MatchException v1) {
                    throw ff_0.b("C", (Object)v1, (long)-5042345121133462479L, (long)var2_2);
                }
                try {
                    try {
                        v2 = new Object[2];
                        v2[1] = var4_3;
                        v2[0] = ff_0.b("\u00e0", (Object)ff_0.b("O", (Object)ff_0.b, (long)-5043987599351626644L, (long)var2_2), (long)-5042185128909840777L, (long)var2_2);
                        v3 /* !! */  = ff_0.b("C", (Object)v2, (long)-5036950450971922276L, (long)var2_2);
                        if (var6_4 != null) break block17;
                        if (v3 /* !! */  == false) {
                        }
                        ** GOTO lbl40
                    }
                    catch (MatchException v4) {
                        throw ff_0.b("C", (Object)v4, (long)-5042345121133462479L, (long)var2_2);
                    }
                    v3 /* !! */  = (CallSite)(ff_0.b("\u00e0", (Object)ff_0.b("\u00e0", (Object)ff_0.b("O", (Object)ff_0.b, (long)-5043987599351626644L, (long)var2_2), (long)-5042185128909840777L, (long)var2_2), (long)-5042232506850023263L, (long)var2_2) instanceof class_1743);
                }
                catch (MatchException v5) {
                    throw ff_0.b("C", (Object)v5, (long)-5042345121133462479L, (long)var2_2);
                }
            }
            try {
                try {
                    try {
                        if (v3 /* !! */  == false) break block18;
lbl40:
                        // 2 sources

                        if (ff_0.b("\u00e0", (Object)var7_5, (long)-5036877002003211887L, (long)var2_2) != ff_0.b("i", (long)-5043771232737952388L, (long)var2_2)) break block18;
                    }
                    catch (MatchException v6) {
                        throw ff_0.b("C", (Object)v6, (long)-5042345121133462479L, (long)var2_2);
                    }
                    if (this.i) break block18;
                }
                catch (MatchException v7) {
                    throw ff_0.b("C", (Object)v7, (long)-5042345121133462479L, (long)var2_2);
                }
                ff_0.b("\u00f8", (Object)ff_0.b("O", (Object)ff_0.b, (long)-5043987599351626644L, (long)var2_2), (boolean)false, (long)-5036156066874700887L, (long)var2_2);
                ff_0.b("\u00e0", (Object)var1_1, (Object)new Object[0], (long)-5041969032209779462L, (long)var2_2);
            }
            catch (MatchException v8) {
                throw ff_0.b("C", (Object)v8, (long)-5042345121133462479L, (long)var2_2);
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @bP
    public void a(bu_0 var1_1) {
        block30: {
            block34: {
                block35: {
                    block32: {
                        block33: {
                            block31: {
                                block29: {
                                    v0 = var2_2 = ff_0.k ^ 104116774863803L;
                                    var4_3 = v0 ^ 10632654720037L;
                                    var6_4 = v0 ^ 41457402656291L;
                                    var8_5 = v0 ^ 132434560274665L;
                                    var11_6 = ff_0.b("O", (Object)ff_0.b, (long)6057732652474785062L, (long)var2_2);
                                    var10_7 = ff_0.b("C", (long)6057522779252073481L, (long)var2_2);
                                    try {
                                        if (var11_6 == null) {
                                            return;
                                        }
                                    }
                                    catch (MatchException v1) {
                                        throw ff_0.b("C", (Object)v1, (long)6058678728100450848L, (long)var2_2);
                                    }
                                    try {
                                        try {
                                            v2 = new Object[2];
                                            v2[1] = var4_3;
                                            v2[0] = ff_0.b("\u00e0", (Object)ff_0.b("O", (Object)ff_0.b, (long)6057647028666968701L, (long)var2_2), (long)6059508323183276134L, (long)var2_2);
                                            v3 /* !! */  = ff_0.b("C", (Object)v2, (long)6055113477781839501L, (long)var2_2);
                                            if (var10_7 != null) break block29;
                                            if (v3 /* !! */  == false) {
                                            }
                                            ** GOTO lbl37
                                        }
                                        catch (MatchException v4) {
                                            throw ff_0.b("C", (Object)v4, (long)6058678728100450848L, (long)var2_2);
                                        }
                                        v3 /* !! */  = (CallSite)(ff_0.b("\u00e0", (Object)ff_0.b("\u00e0", (Object)ff_0.b("O", (Object)ff_0.b, (long)6057647028666968701L, (long)var2_2), (long)6059508323183276134L, (long)var2_2), (long)6059410641805379248L, (long)var2_2) instanceof class_1743);
                                    }
                                    catch (MatchException v5) {
                                        throw ff_0.b("C", (Object)v5, (long)6058678728100450848L, (long)var2_2);
                                    }
                                }
                                try {
                                    try {
                                        try {
                                            try {
                                                if (v3 /* !! */  == false) break block30;
lbl37:
                                                // 2 sources

                                                v6 = ff_0.b("\u00e0", (Object)var11_6, (long)6055185277072013184L, (long)var2_2);
                                                if (var10_7 != null) break block31;
                                            }
                                            catch (MatchException v7) {
                                                throw ff_0.b("C", (Object)v7, (long)6058678728100450848L, (long)var2_2);
                                            }
                                            if (v6 != ff_0.b("i", (long)6057852949678199661L, (long)var2_2)) break block30;
                                        }
                                        catch (MatchException v8) {
                                            throw ff_0.b("C", (Object)v8, (long)6058678728100450848L, (long)var2_2);
                                        }
                                        v9 = this;
                                        if (var10_7 != null) break block32;
                                    }
                                    catch (MatchException v10) {
                                        throw ff_0.b("C", (Object)v10, (long)6058678728100450848L, (long)var2_2);
                                    }
                                    v6 = ff_0.b("\u00e0", (Object)v9.d, (long)6055984588339880604L, (long)var2_2);
                                }
                                catch (MatchException v11) {
                                    throw ff_0.b("C", (Object)v11, (long)6058678728100450848L, (long)var2_2);
                                }
                            }
                            try {
                                try {
                                    try {
                                        if (ff_0.b("\u00e0", (Object)((Boolean)v6), (long)6058922390620651562L, (long)var2_2) == false) break block33;
                                        v9 = this;
                                        if (var10_7 != null) break block32;
                                    }
                                    catch (MatchException v12) {
                                        throw ff_0.b("C", (Object)v12, (long)6058678728100450848L, (long)var2_2);
                                    }
                                    v13 = new Object[1];
                                    v13[0] = var8_5;
                                    if (ff_0.b("\u00e0", (Object)v9, (Object)v13, (long)6055760685821791539L, (long)var2_2) != false) break block33;
                                }
                                catch (MatchException v14) {
                                    throw ff_0.b("C", (Object)v14, (long)6058678728100450848L, (long)var2_2);
                                }
                                this.i = 1;
                                return;
                            }
                            catch (MatchException v15) {
                                throw ff_0.b("C", (Object)v15, (long)6058678728100450848L, (long)var2_2);
                            }
                        }
                        v9 = this;
                    }
                    try {
                        try {
                            v16 = new Object[3];
                            v16[2] = var6_4;
                            v16[1] = (int)ff_0.l;
                            v16[0] = 1;
                            v17 /* !! */  = ff_0.b("C", (Object)v16, (long)6055237679749841171L, (long)var2_2);
                            if (var10_7 != null) break block34;
                            if (v17 /* !! */  > ff_0.b("\u00e0", (Object)((Integer)ff_0.b("\u00e0", (Object)this.a, (long)6055984588339880604L, (long)var2_2)), (long)6059029995423124035L, (long)var2_2)) break block35;
                        }
                        catch (MatchException v18) {
                            throw ff_0.b("C", (Object)v18, (long)6058678728100450848L, (long)var2_2);
                        }
                        v17 /* !! */  = (CallSite)1;
                        break block34;
                    }
                    catch (MatchException v19) {
                        throw ff_0.b("C", (Object)v19, (long)6058678728100450848L, (long)var2_2);
                    }
                }
                v17 /* !! */  = (CallSite)0;
            }
            try {
                v9.i = v17 /* !! */ ;
                if (!this.i) {
                    ff_0.b("\u00e0", (Object)var1_1, (Object)new Object[0], (long)6059151298942687979L, (long)var2_2);
                }
            }
            catch (MatchException v20) {
                throw ff_0.b("C", (Object)v20, (long)6058678728100450848L, (long)var2_2);
            }
        }
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    @Override
    public Set a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return ff_0.b("C", (Object)((Object)q_0.Sword), (Object)((Object)q_0.UHC), (long)-2445914011921539295L, (long)l);
    }

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (ff_0.n[n3] != null) {
            return n3;
        }
        Object object = m[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 1;
            case 1 -> 14;
            case 2 -> 55;
            case 3 -> 41;
            case 4 -> 5;
            case 5 -> 10;
            case 6 -> 63;
            case 7 -> 47;
            case 8 -> 53;
            case 9 -> 2;
            case 10 -> 7;
            case 11 -> 43;
            case 12 -> 33;
            case 13 -> 12;
            case 14 -> 54;
            case 15 -> 8;
            case 16 -> 42;
            case 17 -> 46;
            case 18 -> 23;
            case 19 -> 60;
            case 20 -> 37;
            case 21 -> 0;
            case 22 -> 58;
            case 23 -> 44;
            case 24 -> 50;
            case 25 -> 39;
            case 26 -> 19;
            case 27 -> 32;
            case 28 -> 35;
            case 29 -> 24;
            case 30 -> 49;
            case 31 -> 36;
            case 32 -> 34;
            case 33 -> 28;
            case 34 -> 51;
            case 35 -> 29;
            case 36 -> 56;
            case 37 -> 57;
            case 38 -> 9;
            case 39 -> 16;
            case 40 -> 18;
            case 41 -> 3;
            case 42 -> 25;
            case 43 -> 59;
            case 44 -> 26;
            case 45 -> 4;
            case 46 -> 27;
            case 47 -> 30;
            case 48 -> 40;
            case 49 -> 17;
            case 50 -> 20;
            case 51 -> 48;
            case 52 -> 13;
            case 53 -> 21;
            case 54 -> 15;
            case 55 -> 11;
            case 56 -> 6;
            case 57 -> 31;
            case 58 -> 61;
            case 59 -> 62;
            case 60 -> 22;
            case 61 -> 38;
            case 62 -> 45;
            default -> 52;
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
        ff_0.n[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = ff_0.m(l, l2);
        Object object = m[n];
        if (object instanceof String) {
            String string = ff_0.n[n];
            int n2 = string.indexOf(8);
            Class clazz = ff_0.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ff_0.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ff_0.g(clazz3, string2, clazz2)) != null) {
                    ff_0.m[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ff_0.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ff_0.m[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ff_0.n(277206486238932L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = ff_0.m(l, l2);
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
                String string2 = ff_0.n[n];
                int n3 = string2.indexOf(8);
                clazz3 = ff_0.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ff_0.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ff_0.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        ff_0.m[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ff_0.n(277206486238932L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ff_0.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ff_0.m[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ff_0.n(277206486238932L, 0L);
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

    private boolean lambda$new$0(Float f) {
        long l = k ^ 0x1995FEEBF9BDL;
        return (boolean)ff_0.b("\u00e0", (Object)((Boolean)((Object)ff_0.b("\u00e0", (Object)this.d, (long)3318425880903506074L, (long)l))), (long)3320238093471103532L, (long)l);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ff_0.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1306
 *  net.minecraft.class_4587
 *  net.minecraft.class_759
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.M;
import dev.zprestige.prestige.bE;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.bs_0;
import dev.zprestige.prestige.bt_0;
import dev.zprestige.prestige.dM;
import dev.zprestige.prestige.dP;
import dev.zprestige.prestige.dV;
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
import net.minecraft.class_1306;
import net.minecraft.class_4587;
import net.minecraft.class_759;

public class d2
extends dV {
    private dP a;
    private dM d;
    private static final long k = hc.a(4702012426892944776L, -3280600857807050984L, MethodHandles.lookup().lookupClass()).a(231014948512149L);
    private static final long l;
    private static final Object[] m;
    private static final String[] n;

    /*
     * Enabled aggressive block sorting
     */
    static {
        m = new Object[70];
        n = new String[70];
        d2.f();
        long l = k ^ 0x426AE85D92CAL;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = -7375545553523602391L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                d2.l = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
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
            throw new RuntimeException("dev/zprestige/prestige/d2" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = d2.m(l, l2);
            object = m[n];
            try {
                if (!(object instanceof String)) break block2;
                d2.m[n] = clazz = Class.forName(d2.n[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = d2.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = d2.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = d2.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = d2.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = m;
        m[0] = "\u0002E8\u007f;0\u0014E=%('\u0003\u000e>#$3\u0012I)4o$T";
        objectArray[1] = "5\u0010ur2E>\u001fd=QH+\u0012kVdJ:\u0001wzsG";
        objectArray[2] = "\u001d\t\u001fe3\u000e\u000b\t\u001a? \u0019\u001cB\u00199,\r\r\u0005\u000e.g\u001f1";
        objectArray[3] = "*/!!u\u0014_\u000f*.d[\"\u00179)m\u0012J";
        objectArray[4] = ":x3;'F:x$g+I 3$y+\\'Bt$z";
        objectArray[5] = "\u0005pR? \t\u0005pEc,\u0006\u001f;E},\u0013\u0018J\u0011%{";
        objectArray[6] = "\u0014\u0011kN*]\u0014\u0011|\u0012&R\u000eZ|\f&G\t+(Xt\u0007";
        objectArray[7] = "b\nAgQ\u0019b\nV;]\u0016xAV%]\u0003\u007f0\u0001|\u0004G";
        objectArray[8] = Float.TYPE;
        d2.n[8] = "java/lang/Float";
        objectArray[9] = Void.TYPE;
        d2.n[9] = "java/lang/Void";
        objectArray[10] = "7nH\u0000\u00127BNC\u000f\u0003x#@H\u0004\u0007\"W";
        objectArray[11] = "!\u00067 {\u00037\u00062zh\u0014 M1|d\u00001\n&k/\u00116";
        objectArray[12] = "\u001bkM,\u001fQnKF#\u000e\u001e\u000fEM(\nD{";
        objectArray[13] = "\u0018Q:8/c\u0013^+wHa\u0006U+<s";
        objectArray[14] = Integer.TYPE;
        d2.n[14] = "java/lang/Integer";
        objectArray[15] = "iny\u001biMinnGeBs%nYeWtT<\u0002=\u001d";
        objectArray[16] = "\u0007vM\u0006`\u001frVF\tqP\u0013XM\u0002u\ng";
        objectArray[17] = "\u001a^L\n!=\f^IP2*\u001b\u0015JV>>\nR]Au)5";
        objectArray[18] = "X\u0012>|9_S\u001d/3XQX\u0016+i";
        objectArray[19] = "ajk(#\u001d\u0014J`'2RuDk,6\b\u0001";
        objectArray[20] = "\u001a{&tj)\u001a{1(f&\u0000016f3\u0007Aci7v";
        objectArray[21] = "zR3O\u0018\f\u000fr8@\tCn|3K\r\u0019\u001a";
        objectArray[22] = "*JJ@B/<JO\u001aQ8+\u0001L\u001c],:F[\u000b\u0016<<";
        objectArray[23] = "b)E\u0018d{\u0017\tN\u0017u4v\u0007E\u001cqn\u0002";
        objectArray[24] = Boolean.TYPE;
        d2.n[24] = "java/lang/Boolean";
        objectArray[25] = "DQbw+\u0002FO+\b4\f_Fw7(\u0002EEf";
        objectArray[26] = "_Q\u0013\u0018I\u0010]OZgV\u001eDF\u0006XJ\u0010^E";
        objectArray[27] = "\u001f\b\u0001qt%\u001f\b\u0016-x*\u0005C\u00163x?\u00022Fj*~";
        objectArray[28] = Double.TYPE;
        d2.n[28] = "java/lang/Double";
        objectArray[29] = "\u001b&KHqO\r&N\u0012bX\u001amM\u0014nL\u000b*Z\u0003%r";
        objectArray[30] = "iZ\u0014\u0002q0\u001cz\u001f\r`\u007f}t\u0014\u0006d%\t";
        objectArray[31] = "\u001b\u0010%\b%qn0.\u00074>\u000f>%\f0d{";
        objectArray[32] = "\u0016uQ<t\"\u0016uF`x-\f>F~x8\u000bO\u001d+!";
        objectArray[33] = "-\u0014d;KA-\u0014sgGN7_syG[0.' \u001f";
        objectArray[34] = "\"h\u0018 ~\u000fWH\u0013/o@6F\u0018$k\u001aB";
        objectArray[35] = "L\u0000u\u0007o\u00149 ~\b~[X.u\u0003z\u0001,";
        objectArray[36] = "hkV\u0006xN\u001dK]\ti\u0001|EV\u0002m[\b";
        objectArray[37] = "h+22J1\u001d\u000b9=[~|\u000526_$\b";
        objectArray[38] = "d4\u0003`i\u001ao;\u0012/\u0005\u0019a9\u0010`)";
        objectArray[39] = "]Gn8 Z\u0000V,^w X^w=}A\u0007Kv=\u001e\u0019\bSp=\u007fF\u001dRp^";
        objectArray[40] = "[}U\u0003\u0000\u000f\n\u007fX\u0010lUa\u007f]\bRZ\u000b&PH\u0007?";
        objectArray[41] = "Yh[*J+\u001cx_3)5\u0003n\u0001\"~b]9YN\u0012$\u001a\u007f\u000e)\u00192\u0010j";
        objectArray[42] = "\\\u00025.Hu[Bp&pw\u0001\u0014o+'%XF2wp%\u001bGb\u007f\u001c\"[\u0002j";
        objectArray[43] = "\u0010\u00020#W\u0018JA3!gE@D!{\u000bw\u0011\u0006}%Y \u0010Gp}\u001a@\\U!zg\u001dR\t a\u0007Q@X'\u001cZ_\u001cY<|\u0016MM^A\"\u000b_J\t=a\u001cEH8";
        objectArray[44] = ".v\u001a\u0005\n@\u007ft\u0017\u0016f\u0019\u00146\u0006\u001e\u000f\u0014.2\u001f\u0011\u0016p*\"\t\u0012W\fi5\u0013\u0010f";
        objectArray[45] = "<\u0006eC=S\"@x_A]_@tI(SeDmF17aT{EpK\"CaGA";
        objectArray[46] = "5\tO\u000b\u0005k+OR\u0017yfVO^\u0001\u0010klKG\u000e\t\u000fkH\u001f\u000b\u0004o'ZN\fy";
        objectArray[47] = "Bc\t$UAZx\n<%HJeP\"Iz\u001b\"\u000b~\u001b-A \u00009WPVg\u000e$%";
        objectArray[48] = "Pq\u001a\u0012O\u0001\u001esT\u0018\u007fX`6\u001b\u001e\u0016UZ2\u0002\u0011\u000f1]1Z\u0014\u0002Q\u0011#\u000b\u0013\u007f";
        objectArray[49] = "\u000b}m\u000f\u0005q\u0015;p\u0013yyh;|\u0005\u0010qR?e\n\t\u0015V/s\tHi\u00158i\u000by";
        objectArray[50] = ">; GN~{+$^-kh,~DAY<m \u001a-k\u007fi\u007fSAsdjg#";
        objectArray[51] = "\\:\u0011~\u007fZW,\u001bk\u0014X\n9\texjY}U=\u0014T\u0017)\f=r[Y$\u0017\u0002";
        objectArray[52] = "x(G'\u0012-6*\t-\"tHoF+Kyrk_$R\u001d%yQ}P#*w\n&\"";
        objectArray[53] = "Dm \u001eWH\u0019|bx\u000b2\u0000m6\u0011\r\b\u0004t9\bi\f\u0014b:I\u0015O\u0003x8x";
        objectArray[54] = "\u001b\u0003I&jT\u0005ET:\u0016[xEX,\u007fTBAA#f0FQW 'L\u0005FM\"\u0016";
        objectArray[55] = "O(v{\u0016\u0014\u0015kuy&I\u001fng#J{H(6|\u0019,\u0012nl<\u001cT\u0010(f/&\u0012\u001em`uZQ\twbD";
        objectArray[56] = "j\u001d\u0003\u0015\n`m]F\u001d2v1\u001aT\u0000Sk0*P\u0013Ha;\u001d=AM=7\u001b]\r_l0f\\\u0011Yg.\u001fD\u0012H4V";
        objectArray[57] = "|{{JZRp!x\u0014=Qs7uLQc'v.\u0016\u00004#4$J@To&uM=\taztV]Es+s+";
        objectArray[58] = "I>\u0005eMZEd\u0006;*YFr\u000bcFk\u00123P;\u0016<Ij\u001baT\\Zi\u0004{*\u0001T?\nyJMFn\r\u0004";
        objectArray[59] = "O\u0007,bz&HGijB$\u0012\u0011vg\u0015vKC+7Bv\bB{3.qH\u0007s";
        objectArray[60] = "Cf\f8\u0014 Iq\u00055$p\u0014\u007fb?@l\u001f\u0003UnMj\u00029W&\u001atr";
        objectArray[61] = "CjN\u001fN(W<\f\u000bp)]k\u0013\u000b\u0019%de\u0013\u001b\u001dCUwO\u0006\u001frZj\u0012\rp";
        objectArray[62] = "b\t\u0007vF)i\u001f\rc-+4\n\u001fmA\u0019gN@;-')\u001a\u001a5K(g\u0017\u0001\n";
        objectArray[63] = "\u0004,\u0001\u0013\u000e=\u001aj\u001c\u000fr3gj\u0010\u0019\u001b=]n\t\u0016\u0002YZmQ\u0013\u000f9\u0016\u007f\u0000\u0014r";
        objectArray[64] = "\\C?8&\u0015\u0012Aq2\u0016Ll\u0004>4\u007fAV\u0000';f%QF?`&\u001d\u000b\u0005<b\u0016";
        objectArray[65] = "hO\u0001l5Ho\u000fDd\rJ5Y[iZ\u0018l\u000b\u0006;\r\u0018/\nV=a\u001foO^";
        objectArray[66] = "&\u000f6\\\u000e\u0015=\u0019p\u00183MM\rw\u001bJX(\r4\u0013]$";
        objectArray[67] = "1\rb4\u007fL>\u00039o\r\u001c=\u000eaeZLeS>\t`\u001c;^w7o\u0012`\u0005";
        objectArray[68] = "FL\u0012v~)T\tU2D,(I\u001bd-!\u0012M\u0002k4EGJSo+tHW\u000edD";
        Object[] objectArray2 = objectArray;
        objectArray[69] = ".s\u0019\u001cV\u000505\u0004\u0000*\bM5\b\u0016C\u0005w1\u0011\u0019Zas!\u0007\u001a\u001b\u001d06\u001d\u0018*";
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = d2.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'h' || c == 'y' || c == 'N' || c == '\u00fa') {
                field = d2.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'h' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'y' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'N' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = d2.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'S' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00ff' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
     * Exception decompiling
     */
    @bP
    public void a(bs_0 var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous, and can't clone.
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:611)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:94)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    @bP
    public void a(bE bE2) {
        block5: {
            long l;
            block4: {
                l = k ^ 0x52D259D489ACL;
                CallSite callSite = d2.b("\u00ff", (long)3557647797007446016L, (long)l);
                try {
                    try {
                        if (callSite != null) break block4;
                        if (d2.b("S", (Object)((Boolean)((Object)d2.b("S", (Object)this.d, (long)3550520424944013537L, (long)l))), (long)3556215326831387950L, (long)l) == false) break block5;
                    }
                    catch (MatchException matchException) {
                        throw d2.b("\u00ff", (Object)matchException, (long)3556926616945387498L, (long)l);
                    }
                    bE2.a = (int)d2.l;
                }
                catch (MatchException matchException) {
                    throw d2.b("\u00ff", (Object)matchException, (long)3556926616945387498L, (long)l);
                }
            }
            d2.b("S", (Object)bE2, (Object)new Object[0], (long)3557351887052279762L, (long)l);
        }
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    @bP
    public void a(bt_0 bt_02) {
        block11: {
            M m;
            long l;
            long l2;
            block10: {
                reference v2;
                M m2;
                long l3;
                block8: {
                    CallSite callSite;
                    long l4;
                    block9: {
                        long l5 = l2 = k ^ 0x52854C7F01CAL;
                        long l6 = l5 ^ 0x21B02FEB0FAAL;
                        long l7 = l5 ^ 0x7E0EFA4F460BL;
                        l3 = l5 ^ 0x63D19582B054L;
                        l = l5 ^ 0x564B1F0BC8AAL;
                        long l8 = l5 ^ 0x2F0F59DAC622L;
                        l4 = l5 ^ 0x3CF1BD9C7012L;
                        m2 = new M((class_759)d2.b("S", (Object)d2.b("S", (Object)b, (long)-5098110088212395785L, (long)l2), (long)-5100168583639570812L, (long)l2));
                        callSite = d2.b("\u00ff", (long)-5099959867561478042L, (long)l2);
                        try {
                            try {
                                Object[] objectArray = new Object[1];
                                objectArray[0] = l7;
                                reference v2 = d2.b("S", (Object)m2, (Object)objectArray, (long)-5100104275262686296L, (long)l2) - 1.0f;
                                v2 = v2 == 0 ? 0 : (v2 < 0 ? -1 : 1);
                                if (callSite != null) break block8;
                                if (v2 > 0) break block9;
                            }
                            catch (MatchException matchException) {
                                throw d2.b("\u00ff", (Object)matchException, (long)-5099555001307304052L, (long)l2);
                            }
                            Object[] objectArray = new Object[2];
                            objectArray[1] = l8;
                            objectArray[0] = Float.valueOf(1.0f);
                            d2.b("S", (Object)m2, (Object)objectArray, (long)-5106503203213322964L, (long)l2);
                            Object[] objectArray2 = new Object[2];
                            objectArray2[1] = l6;
                            objectArray2[0] = d2.b("S", (Object)d2.b("h", (Object)b, (long)-5099977204578428341L, (long)l2), (long)-5098161376726915099L, (long)l2);
                            d2.b("S", (Object)m2, (Object)objectArray2, (long)-5098407388809766317L, (long)l2);
                        }
                        catch (MatchException matchException) {
                            throw d2.b("\u00ff", (Object)matchException, (long)-5099555001307304052L, (long)l2);
                        }
                    }
                    try {
                        m = m2;
                        if (callSite != null) break block10;
                        Object[] objectArray = new Object[1];
                        objectArray[0] = l4;
                        reference v2 = d2.b("S", (Object)m, (Object)objectArray, (long)-5099052508265380766L, (long)l2) - 1.0f;
                        v2 = v2 == 0 ? 0 : (v2 < 0 ? -1 : 1);
                    }
                    catch (MatchException matchException) {
                        throw d2.b("\u00ff", (Object)matchException, (long)-5099555001307304052L, (long)l2);
                    }
                }
                try {
                    if (v2 > 0) break block11;
                    Object[] objectArray = new Object[2];
                    objectArray[1] = l3;
                    objectArray[0] = Float.valueOf(1.0f);
                    d2.b("S", (Object)m2, (Object)objectArray, (long)-5100271230052888874L, (long)l2);
                    m = m2;
                }
                catch (MatchException matchException) {
                    throw d2.b("\u00ff", (Object)matchException, (long)-5099555001307304052L, (long)l2);
                }
            }
            Object[] objectArray = new Object[2];
            objectArray[1] = l;
            objectArray[0] = d2.b("S", (Object)d2.b("h", (Object)b, (long)-5099977204578428341L, (long)l2), (long)-5098987884450130872L, (long)l2);
            d2.b("S", (Object)m, (Object)objectArray, (long)-5098301772546788624L, (long)l2);
        }
    }

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (d2.n[n3] != null) {
            return n3;
        }
        Object object = m[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 52;
            case 1 -> 27;
            case 2 -> 12;
            case 3 -> 47;
            case 4 -> 24;
            case 5 -> 5;
            case 6 -> 60;
            case 7 -> 42;
            case 8 -> 2;
            case 9 -> 15;
            case 10 -> 30;
            case 11 -> 51;
            case 12 -> 10;
            case 13 -> 55;
            case 14 -> 16;
            case 15 -> 58;
            case 16 -> 22;
            case 17 -> 29;
            case 18 -> 3;
            case 19 -> 50;
            case 20 -> 48;
            case 21 -> 38;
            case 22 -> 37;
            case 23 -> 13;
            case 24 -> 49;
            case 25 -> 1;
            case 26 -> 54;
            case 27 -> 7;
            case 28 -> 46;
            case 29 -> 19;
            case 30 -> 25;
            case 31 -> 26;
            case 32 -> 34;
            case 33 -> 44;
            case 34 -> 11;
            case 35 -> 56;
            case 36 -> 17;
            case 37 -> 9;
            case 38 -> 45;
            case 39 -> 8;
            case 40 -> 61;
            case 41 -> 53;
            case 42 -> 6;
            case 43 -> 20;
            case 44 -> 36;
            case 45 -> 40;
            case 46 -> 62;
            case 47 -> 63;
            case 48 -> 57;
            case 49 -> 21;
            case 50 -> 32;
            case 51 -> 4;
            case 52 -> 41;
            case 53 -> 33;
            case 54 -> 23;
            case 55 -> 31;
            case 56 -> 0;
            case 57 -> 43;
            case 58 -> 18;
            case 59 -> 14;
            case 60 -> 35;
            case 61 -> 39;
            case 62 -> 59;
            default -> 28;
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
        d2.n[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = d2.m(l, l2);
        Object object = m[n];
        if (object instanceof String) {
            String string = d2.n[n];
            int n2 = string.indexOf(8);
            Class clazz = d2.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = d2.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = d2.g(clazz3, string2, clazz2)) != null) {
                    d2.m[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = d2.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        d2.m[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = d2.n(1322375292411351L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = d2.m(l, l2);
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
                String string2 = d2.n[n];
                int n3 = string2.indexOf(8);
                clazz3 = d2.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = d2.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = d2.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        d2.m[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = d2.n(1322375292411351L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = d2.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        d2.m[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = d2.n(1322375292411351L, 0L);
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

    private void j(Object[] objectArray) {
        int n;
        class_4587 class_45872 = (class_4587)objectArray[0];
        class_1306 class_13062 = (class_1306)objectArray[1];
        float f = ((Float)objectArray[2]).floatValue();
        long l = (Long)objectArray[3];
        l = k ^ l;
        try {
            n = class_13062 == d2.b("N", (long)-1014178044542850599L, (long)l) ? 1 : -1;
        }
        catch (MatchException matchException) {
            throw d2.b("\u00ff", (Object)matchException, (long)-1011667739215550653L, (long)l);
        }
        int n2 = n;
        d2.b("S", (Object)class_45872, (float)((float)n2 * 0.56f), (float)(-0.52f + f * -0.6f), (float)-0.72f, (long)-1011339809181714249L, (long)l);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(d2.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


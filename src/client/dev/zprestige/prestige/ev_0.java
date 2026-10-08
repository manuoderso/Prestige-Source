/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2378
 *  net.minecraft.class_6880
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.aL;
import dev.zprestige.prestige.aS;
import dev.zprestige.prestige.bG;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.dO;
import dev.zprestige.prestige.dV;
import dev.zprestige.prestige.dn_0;
import dev.zprestige.prestige.hc;
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
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_2378;
import net.minecraft.class_6880;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from dev.zprestige.prestige.ev
 */
public class ev_0
extends dV {
    private dO a;
    private int c = -1;
    private int d = 0;
    private static final long k = hc.a(-541952338132407043L, -6623541065619471529L, MethodHandles.lookup().lookupClass()).a(45862353954533L);
    private static final long l;
    private static final Object[] m;
    private static final String[] n;

    /*
     * Enabled aggressive block sorting
     */
    static {
        m = new Object[69];
        n = new String[69];
        ev_0.f();
        long l = k ^ 0x2E84396FEB05L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = 4235203958147288406L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                ev_0.l = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
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
            throw new RuntimeException("dev/zprestige/prestige/ev" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public int c(Object[] objectArray) {
        block5: {
            CallSite callSite;
            CallSite callSite2;
            long l;
            block4: {
                int n = (Integer)objectArray[0];
                l = (Long)objectArray[1];
                l = k ^ l;
                callSite2 = ev_0.b("\u00d6", (Object)ev_0.b("\u00d6", (Object)ev_0.b("n", (Object)b, (long)-2099330464005550314L, (long)l), (long)-2100928646342991526L, (long)l), (int)n, (long)-2100107666583662387L, (long)l);
                CallSite callSite3 = ev_0.b("\u00a3", (long)-2099300266768449507L, (long)l);
                try {
                    try {
                        callSite = callSite2;
                        if (callSite3 != null) break block4;
                        if (callSite == null) break block5;
                    }
                    catch (MatchException matchException) {
                        throw ev_0.b("\u00a3", (Object)matchException, (long)-2106277354071830162L, (long)l);
                    }
                    callSite = ev_0.b("\u00d6", (Object)ev_0.b("\u00d6", (Object)((class_2378)ev_0.b("\u00d6", (Object)ev_0.b("\u00d6", (Object)ev_0.b("\u00d6", (Object)ev_0.b("n", (Object)b, (long)-2099204604907312047L, (long)l), (long)-2100486847685537757L, (long)l), (Object)ev_0.b("\u00d6", (Object)ev_0.b("\u00a4", (long)-2100805398488851163L, (long)l), (long)-2106538832692824202L, (long)l), (long)-2099164494937740218L, (long)l), (long)-2100068567862681059L, (long)l)), (Object)ev_0.b("\u00d6", (Object)ev_0.b("\u00a4", (long)-2100805398488851163L, (long)l), (long)-2099460679676838171L, (long)l), (long)-2098885575427986325L, (long)l), (long)-2100068567862681059L, (long)l);
                }
                catch (MatchException matchException) {
                    throw ev_0.b("\u00a3", (Object)matchException, (long)-2106277354071830162L, (long)l);
                }
            }
            float f = (float)ev_0.b("\u00a3", (Object)((class_6880)callSite), (Object)callSite2, (long)-2100228596138363599L, (long)l);
            return (int)f;
        }
        return 0;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ev_0.m(l, l2);
            object = m[n];
            try {
                if (!(object instanceof String)) break block2;
                ev_0.m[n] = clazz = Class.forName(ev_0.n[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = ev_0.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ev_0.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ev_0.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ev_0.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = m;
        m[0] = "t9Fg\u0000+j1\\(};j";
        objectArray[1] = "`kTM7NkdE\u0002V@`oAX";
        objectArray[2] = "q[ka\u0015Ng[n;\u0006Yp\u0010m=\nMaWz*A_]";
        objectArray[3] = "\u001b \u0014\u0007$=n\u0000\u001f\b5r\u0013\u0018\f\u000f<;{";
        objectArray[4] = "Ts\u00072Y\u0016Ts\u0010nU\u0019N8\u0010pU\fII@-\u0004";
        objectArray[5] = "\b\u0018d\u001dNx\b\u0018sABw\u0012Ss_Bb\u0015\"'\u0007\u0015";
        objectArray[6] = "\u0015^,o^5\u0003^)5M\"\u0014\u0015*3A6\u0005R=$\n&\u0003";
        objectArray[7] = "r\u000b\f\u000e&_\u0007+\u0007\u00017\u0010f%\f\n3J\u0012";
        objectArray[8] = Void.TYPE;
        ev_0.n[8] = "java/lang/Void";
        objectArray[9] = "B\u001f>C\b\u0013\\\u0017$\ft\u0007F\u001a'O";
        objectArray[10] = Float.TYPE;
        ev_0.n[10] = "java/lang/Float";
        objectArray[11] = "o]_\u0019U\u0005o]HEY\nu\u0016H[Y\u001frg\u001a\u0000\u0001U";
        objectArray[12] = "\u0003\u0007\nuxSv'\u0001zi\u001c\u0017)\nqmFc";
        objectArray[13] = Integer.TYPE;
        ev_0.n[13] = "java/lang/Integer";
        objectArray[14] = ".Z\u0001S%e8Z\u0004\t6r/\u0011\u0007\u000f:f>V\u0010\u0018qp<";
        objectArray[15] = "rNr\u001b\u0005p\u0007ny\u0014\u0014?f`r\u001f\u0010e\u0012";
        objectArray[16] = "S81YJ\u007fE84\u0003YhRs7\u0005U|C4 \u0012\u001ek|";
        objectArray[17] = "(_Tb\u001d}#PE-u}-_V";
        objectArray[18] = "8f~.XJ3ioa;G&d`\n\u000eE7w|&\u0019H";
        objectArray[19] = "vG>;#&\u0003g542ibi>?63\u0016";
        objectArray[20] = Boolean.TYPE;
        ev_0.n[20] = "java/lang/Boolean";
        objectArray[21] = Double.TYPE;
        ev_0.n[21] = "java/lang/Double";
        objectArray[22] = "\u001eHb\u007f+\u000f\u001eHu#'\u0000\u0004\u0003u='\u0015\u0003r#btW";
        objectArray[23] = "8L\u0017C\u0002(8L\u0000\u001f\u000e'\"\u0007\u0000\u0001\u000e2%vQTYq";
        objectArray[24] = "\u0001WS}\u001b\u001c\u0001WD!\u0017\u0013\u001b\u001cD?\u0017\u0006\u001cm\u0012gC@";
        objectArray[25] = "SQ\r\u0006ZkMY\u0017I;nMY\u0014\t\u0015r";
        objectArray[26] = "\rl)AR\u001c\rl>\u001d^\u0013\u0017'>\u0003^\u0006\u0010Vk\\\u0007";
        objectArray[27] = "\tW[_^\n\tWL\u0003R\u0005\u0013\u001cL\u001dR\u0010\u0014m\u001dB\u0004[";
        objectArray[28] = "Y26)\u0019\u0012Y2!u\u0015\u001dCy!k\u0015\bD\bs?MK";
        objectArray[29] = "fp0&fYfp'zjV|;'djC{Jr03\u0000";
        objectArray[30] = "9-:\\\u0018\u00029--\u0000\u0014\r#f-\u001e\u0014\u0018$\u0017\u007fJLX";
        objectArray[31] = "4\u0003Zkl:4\u0003M7`5.HM)` )9\u001fs7b";
        objectArray[32] = "83\u001c\fSc&;\u0006C4b7 \u000b\u0019\u0012d";
        objectArray[33] = "_\u0002Y\u0014<KT\rH[[IA\u0006H\u0010`";
        objectArray[34] = "DO{\u0011=T1op\u001e,\u001bPa{\u0015(A$";
        objectArray[35] = "]2[\u00061&C:AIS:D'";
        objectArray[36] = "y.W\fdE\f\u000e\\\u0003u\nm\u0000W\bqP\u0019";
        objectArray[37] = "1\u0015ToFO0\u001f\u0001u#I2\b\nyO{eES!\u001c,0NRwLN$\u0013\u0001e#";
        objectArray[38] = "?;X\u0015U\u000e>~Y\r;U\u0006z\u0004\u0014T\u0000tx\u0001\u0017[?";
        objectArray[39] = "\u0010\b5\u0013J\"WK\"]#tK\u0018:Ct#\u0015Ob/\u001f [\u00128\u0015\u001exE\t";
        objectArray[40] = "\u0010/?\u007fT;@%%!l4\u0012+/#\u0000\u0006Cipy]Q\u00116q5\t2\u0010<$/l1\u0007;u%\u00128\u0005(1D";
        objectArray[41] = "R|?d\u001dT\u0015?(*t\u0002\tl04#UV1kX\u0015\u000f\u0014oj\"\u000f\u000b\f\u007f";
        objectArray[42] = ",\fRc\n\u0000/\u001a]6n\u0014#\u0005_2)\u0004JP\u001a5\u0001\u000fp\\R0\u0016j,\fRc\n\u0000/\u001a]6n";
        objectArray[43] = "K\u0002\u0006|q9\u0015NN;\n4z\bFz;1E\u0002\u001f\u007f3_KH\u0015koeG\u0000\u0010|\n";
        objectArray[44] = "f\u0005\u0006}\tm6\u0019\u0011%nej\u0005\u0014|\u0002W>AN!U\u0000hCLr\u0001b|\u001e\u001f`n`\u007f\u0015Nz\u0010i}\u0006\n\u001b";
        objectArray[45] = "\u0003C?2\b8MF?!rbPX9\u0010\u0016cTTEa\u00109@L\"0\fzT(";
        objectArray[46] = "?WtuY!d\u0003d##p3@](SlZVzy^{:Fw'\u0012\u0010";
        objectArray[47] = ">_w,Cd?\u0007i7%;o\u0019f,I\t<]:t%n=\f>!T/m\u000fgK";
        objectArray[48] = "\u0000B\u001bc\b0\b@\u001b3o?\u0002S\u0012b8l[\u0007K>o?\u0002\u0000\u0007k\f>\bU\u001d";
        objectArray[49] = "@v\u007f\"\u00150A.a9so\u00110n\"\u001f]Gu3yC\n\u0018(k}\u000bjA 4{s";
        objectArray[50] = "\u0011e\u001dE\u0014\u0006Vw\u001dMs\u0004-\u007fYKB\r\u0012u\u0000NJc@f\\H\u0018\u0003Pk\u0002\u0004s";
        objectArray[51] = "\u0007H\u0005,h\u0019\\\u001c\u0015z\u0012N\u000fT\u0016\u001c+\u0013\u001f[\u0001$#\u0013\u001cGj";
        objectArray[52] = "'\u0015(3B*$\u0003'f&!'\u0004\u0006fB=,xi7L/$Be\u007fI8A";
        objectArray[53] = "\u0010h+VBG\u001cz)Y{N\u001b}\u0013^@Z\bz+V@Y\u0014\u0011~\u0006GZ\u001cqn\u000b\u0019\u0016w";
        objectArray[54] = "q/;DFc6=;L!oM5\u007fJ\u0010hr?&O\u0018\u0006p.8\u000eCmvw\u007f]!";
        objectArray[55] = "VRcs|.LV{cB1ZM\u007fz.\u0003\f\t$!sTXIo&z>\bCuxB";
        objectArray[56] = "prwBx?sbrR\u001a%\u007fq{Iv\u0017\"7!\u0013\u001a#\"rj\u0014q+q=u.*\u007f{5q_k/xl\u001b\u001f\"*}h!\u0013j/j\r";
        objectArray[57] = "R.%gC\t\u0015<%o$\u0005n4ai\u0015\u0002Q>8l\u001dl_t2xAVS<7o$";
        objectArray[58] = "\u000f<;%!nV4d#Yk\u0006$>z5YVde-Y?S21xc3\u001b7&\u001di1\u0002`4l(a\u00019^";
        objectArray[59] = "\u007fKwz%\u0002!\u0007?=^\rNA7|o\nqKnygd\u007f\u0001dm;^sIaz^";
        objectArray[60] = ":\u00020N\u0004i5\u00028\u000e5iPP;LJkhX;OV\u0000";
        objectArray[61] = "d.<^,{m,/\u001aMji*P]vx{=hUv{gV";
        objectArray[62] = "Q\u0014\u0006\u0005R\u0001]\u0006\u0004\nk\u0000J\u0000D]\u0017\u0006Lm[X\u0004QL\\\u0000\f\u0014\u00076";
        objectArray[63] = "?LS^d\u0005#\u001cY5gUR\u0018\u000bH\u007fPj\u0010\u000bKc;?LS^d\u0005#\u001cY5";
        objectArray[64] = "\"\u0014D\tY\u001f#\u0003N\u001a3\u001e-\u001d@\nm\u0019-\u0007Dv\f\u0012t\u0007M\u0011]\u000e7\u0013)";
        objectArray[65] = "rtfP\u0000\u000fs~3Je\tqi8F\t;!%b\u001e^lrtfP\u0000\u000fs~3Je";
        objectArray[66] = "\u0004J\u0010\u001fKeZ\u0006XX0j5S\u000e\u0002B:UY\u000f\bW\u0003^_\f\u0015\tcT^\u0006\u00000";
        objectArray[67] = "G&H\u0000Ha\u00004H\b/m{<\f\u000e\u001ejD6U\u000b\u0016\u0004\u0016%\t\rDd\u0006(WA/";
        Object[] objectArray2 = objectArray;
        objectArray[68] = "\u001f>uIUA\u001efkR3\u0015Bi`BdE\u001b=;.^\u0018\u001eezUK\u001d\u001a\u007f";
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'n' || c == '\u00db' || c == '\u00a4' || c == '\u00eb') {
                field = ev_0.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'n' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00db' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00a4' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ev_0.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00d6' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00a3' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = ev_0.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    @bP
    public void a(aS aS2) {
        block27: {
            CallSite callSite;
            long l;
            long l2;
            block29: {
                CallSite callSite2;
                CallSite callSite3;
                block28: {
                    long l3;
                    long l4;
                    block26: {
                        long l5;
                        block24: {
                            block25: {
                                block22: {
                                    block23: {
                                        block20: {
                                            block21: {
                                                long l6 = l2 = k ^ 0x5ABFDF47557DL;
                                                l5 = l6 ^ 0x46303422A2FAL;
                                                l = l6 ^ 0x10120A28A0B2L;
                                                l4 = l6 ^ 0x483E5E3A1D61L;
                                                l3 = l6 ^ 0x3068768BCAFCL;
                                                callSite3 = ev_0.b("\u00a3", (long)8848604690773235724L, (long)l2);
                                                try {
                                                    try {
                                                        reference cfr_temp_0 = ev_0.b("\u00d6", (Object)dn_0.a, (long)8849148537638561294L, (long)l2) * 100.0f - ev_0.b("\u00d6", (Object)((Float)((Object)ev_0.b("\u00d6", (Object)this.a, (long)8847907328051520589L, (long)l2))), (long)8851026594328100983L, (long)l2);
                                                        callSite2 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 > 0 ? 1 : -1);
                                                        if (callSite3 != null) break block20;
                                                        if (callSite2 <= 0) break block21;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw ev_0.b("\u00a3", (Object)matchException, (long)8851184558270302591L, (long)l2);
                                                    }
                                                    this.d = 1;
                                                }
                                                catch (MatchException matchException) {
                                                    throw ev_0.b("\u00a3", (Object)matchException, (long)8851184558270302591L, (long)l2);
                                                }
                                            }
                                            callSite2 = (CallSite)this.d;
                                        }
                                        try {
                                            if (callSite3 != null) break block22;
                                            if (callSite2 <= 0) break block23;
                                        }
                                        catch (MatchException matchException) {
                                            throw ev_0.b("\u00a3", (Object)matchException, (long)8851184558270302591L, (long)l2);
                                        }
                                        return;
                                    }
                                    reference cfr_temp_1 = ev_0.b("n", (Object)ev_0.b("n", (Object)b, (long)8848703016942802695L, (long)l2), (long)8850739903165612910L, (long)l2) - 1.5;
                                    callSite2 = cfr_temp_1 == 0 ? 0 : (cfr_temp_1 > 0 ? 1 : -1);
                                }
                                try {
                                    if (callSite3 != null) break block24;
                                    if (callSite2 <= 0) break block25;
                                }
                                catch (MatchException matchException) {
                                    throw ev_0.b("\u00a3", (Object)matchException, (long)8851184558270302591L, (long)l2);
                                }
                                return;
                            }
                            callSite2 = (CallSite)this.c;
                        }
                        try {
                            try {
                                if (callSite3 != null) break block26;
                                if (callSite2 != -1) break block27;
                            }
                            catch (MatchException matchException) {
                                throw ev_0.b("\u00a3", (Object)matchException, (long)8851184558270302591L, (long)l2);
                            }
                            Object[] objectArray = new Object[2];
                            objectArray[1] = l5;
                            objectArray[0] = ev_0.b("\u00d6", (Object)ev_0.b("n", (Object)b, (long)8848703016942802695L, (long)l2), (long)8849243389450111692L, (long)l2);
                            callSite2 = ev_0.b("\u00a3", (Object)objectArray, (long)8851255405785424850L, (long)l2);
                        }
                        catch (MatchException matchException) {
                            throw ev_0.b("\u00a3", (Object)matchException, (long)8851184558270302591L, (long)l2);
                        }
                    }
                    try {
                        try {
                            if (callSite3 != null) break block28;
                            if (callSite2 == false) break block27;
                        }
                        catch (MatchException matchException) {
                            throw ev_0.b("\u00a3", (Object)matchException, (long)8851184558270302591L, (long)l2);
                        }
                        Object[] objectArray = new Object[1];
                        objectArray[0] = l4;
                        this.c = (int)ev_0.b("\u00a3", (Object)objectArray, (long)8848256806337401936L, (long)l2);
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l3;
                        callSite2 = ev_0.b("\u00d6", (Object)this, (Object)objectArray2, (long)8848396646329302618L, (long)l2);
                    }
                    catch (MatchException matchException) {
                        throw ev_0.b("\u00a3", (Object)matchException, (long)8851184558270302591L, (long)l2);
                    }
                }
                CallSite callSite4 = callSite2;
                try {
                    try {
                        callSite = callSite4;
                        if (callSite3 != null) break block29;
                        if (callSite == -1) break block27;
                    }
                    catch (MatchException matchException) {
                        throw ev_0.b("\u00a3", (Object)matchException, (long)8851184558270302591L, (long)l2);
                    }
                    callSite = callSite4;
                }
                catch (MatchException matchException) {
                    throw ev_0.b("\u00a3", (Object)matchException, (long)8851184558270302591L, (long)l2);
                }
            }
            Object[] objectArray = new Object[2];
            objectArray[1] = l;
            objectArray[0] = (int)callSite;
            ev_0.b("\u00a3", (Object)objectArray, (long)8847485424626456687L, (long)l2);
            this.d = 1;
        }
    }

    @bP
    public void a(aL aL2) {
        block27: {
            CallSite callSite;
            long l;
            long l2;
            block29: {
                CallSite callSite2;
                CallSite callSite3;
                block28: {
                    long l3;
                    long l4;
                    block26: {
                        long l5;
                        block24: {
                            block25: {
                                block22: {
                                    block23: {
                                        block20: {
                                            block21: {
                                                long l6 = l2 = k ^ 0x10D8A865F931L;
                                                l5 = l6 ^ 0xC5743000EB6L;
                                                l = l6 ^ 0x5A757D0A0CFEL;
                                                l4 = l6 ^ 0x2592918B12DL;
                                                l3 = l6 ^ 0x7A0F01A966B0L;
                                                callSite3 = ev_0.b("\u00a3", (long)-2990173055394352064L, (long)l2);
                                                try {
                                                    try {
                                                        reference cfr_temp_0 = ev_0.b("\u00d6", (Object)dn_0.a, (long)-2989765824421590462L, (long)l2) * 100.0f - ev_0.b("\u00d6", (Object)((Float)((Object)ev_0.b("\u00d6", (Object)this.a, (long)-2988597186914908159L, (long)l2))), (long)-2983243681272370117L, (long)l2);
                                                        callSite2 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 > 0 ? 1 : -1);
                                                        if (callSite3 != null) break block20;
                                                        if (callSite2 <= 0) break block21;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw ev_0.b("\u00a3", (Object)matchException, (long)-2983086016396696269L, (long)l2);
                                                    }
                                                    this.d = 1;
                                                }
                                                catch (MatchException matchException) {
                                                    throw ev_0.b("\u00a3", (Object)matchException, (long)-2983086016396696269L, (long)l2);
                                                }
                                            }
                                            callSite2 = (CallSite)this.d;
                                        }
                                        try {
                                            if (callSite3 != null) break block22;
                                            if (callSite2 <= 0) break block23;
                                        }
                                        catch (MatchException matchException) {
                                            throw ev_0.b("\u00a3", (Object)matchException, (long)-2983086016396696269L, (long)l2);
                                        }
                                        return;
                                    }
                                    reference cfr_temp_1 = ev_0.b("n", (Object)ev_0.b("n", (Object)b, (long)-2990211045576983733L, (long)l2), (long)-2983512247769403614L, (long)l2) - 1.5;
                                    callSite2 = cfr_temp_1 == 0 ? 0 : (cfr_temp_1 > 0 ? 1 : -1);
                                }
                                try {
                                    if (callSite3 != null) break block24;
                                    if (callSite2 <= 0) break block25;
                                }
                                catch (MatchException matchException) {
                                    throw ev_0.b("\u00a3", (Object)matchException, (long)-2983086016396696269L, (long)l2);
                                }
                                return;
                            }
                            callSite2 = (CallSite)this.c;
                        }
                        try {
                            try {
                                if (callSite3 != null) break block26;
                                if (callSite2 != -1) break block27;
                            }
                            catch (MatchException matchException) {
                                throw ev_0.b("\u00a3", (Object)matchException, (long)-2983086016396696269L, (long)l2);
                            }
                            Object[] objectArray = new Object[2];
                            objectArray[1] = l5;
                            objectArray[0] = ev_0.b("\u00d6", (Object)ev_0.b("n", (Object)b, (long)-2990211045576983733L, (long)l2), (long)-2989658301957446016L, (long)l2);
                            callSite2 = ev_0.b("\u00a3", (Object)objectArray, (long)-2983155906403233890L, (long)l2);
                        }
                        catch (MatchException matchException) {
                            throw ev_0.b("\u00a3", (Object)matchException, (long)-2983086016396696269L, (long)l2);
                        }
                    }
                    try {
                        try {
                            if (callSite3 != null) break block28;
                            if (callSite2 == false) break block27;
                        }
                        catch (MatchException matchException) {
                            throw ev_0.b("\u00a3", (Object)matchException, (long)-2983086016396696269L, (long)l2);
                        }
                        Object[] objectArray = new Object[1];
                        objectArray[0] = l4;
                        this.c = (int)ev_0.b("\u00a3", (Object)objectArray, (long)-2988392580060874724L, (long)l2);
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l3;
                        callSite2 = ev_0.b("\u00d6", (Object)this, (Object)objectArray2, (long)-2988248608612707818L, (long)l2);
                    }
                    catch (MatchException matchException) {
                        throw ev_0.b("\u00a3", (Object)matchException, (long)-2983086016396696269L, (long)l2);
                    }
                }
                CallSite callSite4 = callSite2;
                try {
                    try {
                        callSite = callSite4;
                        if (callSite3 != null) break block29;
                        if (callSite == -1) break block27;
                    }
                    catch (MatchException matchException) {
                        throw ev_0.b("\u00a3", (Object)matchException, (long)-2983086016396696269L, (long)l2);
                    }
                    callSite = callSite4;
                }
                catch (MatchException matchException) {
                    throw ev_0.b("\u00a3", (Object)matchException, (long)-2983086016396696269L, (long)l2);
                }
            }
            Object[] objectArray = new Object[2];
            objectArray[1] = l;
            objectArray[0] = (int)callSite;
            ev_0.b("\u00a3", (Object)objectArray, (long)-2989018540449926109L, (long)l2);
            this.d = 1;
        }
    }

    public int a(Object[] objectArray) {
        int n;
        block13: {
            Object object;
            Object object2;
            CallSite callSite;
            ArrayList arrayList;
            long l;
            long l2;
            block12: {
                l2 = (Long)objectArray[0];
                long l3 = l2 = k ^ l2;
                l = l3 ^ 0x76FA4B8D52EDL;
                long l4 = l3 ^ 0x13AEE246B6BDL;
                arrayList = new ArrayList();
                callSite = ev_0.b("\u00a3", (long)-6951068727874929336L, (long)l2);
                for (object2 = 0; object2 <= (int)ev_0.l; ++object2) {
                    try {
                        try {
                            try {
                                Object[] objectArray2 = new Object[2];
                                objectArray2[1] = l4;
                                objectArray2[0] = ev_0.b("\u00d6", (Object)ev_0.b("\u00d6", (Object)ev_0.b("n", (Object)b, (long)-6951112212415417789L, (long)l2), (long)-6949864759791789041L, (long)l2), (int)object2, (long)-6949065900550607464L, (long)l2);
                                object = ev_0.b("\u00a3", (Object)objectArray2, (long)-6949651859880047973L, (long)l2);
                                if (callSite != null) break block12;
                                if (callSite != null) continue;
                            }
                            catch (MatchException matchException) {
                                throw ev_0.b("\u00a3", (Object)matchException, (long)-6948524593895494597L, (long)l2);
                            }
                            if (object == 0) continue;
                        }
                        catch (MatchException matchException) {
                            throw ev_0.b("\u00a3", (Object)matchException, (long)-6948524593895494597L, (long)l2);
                        }
                        ev_0.b("\u00d6", arrayList, (Object)ev_0.b("\u00a3", (int)object2, (long)-6950232277119145495L, (long)l2), (long)-6950114481719767075L, (long)l2);
                        continue;
                    }
                    catch (MatchException matchException) {
                        throw ev_0.b("\u00a3", (Object)matchException, (long)-6948524593895494597L, (long)l2);
                    }
                }
                object2 = -1;
                object = -1;
            }
            Object object3 = object;
            CallSite callSite2 = ev_0.b("\u00d6", arrayList, (long)-6949392841536004092L, (long)l2);
            while (ev_0.b("\u00d6", (Object)callSite2, (long)-6950499727415280841L, (long)l2) != false) {
                block14: {
                    CallSite callSite3 = ev_0.b("\u00d6", (Object)((Integer)((Object)ev_0.b("\u00d6", (Object)callSite2, (long)-6949699584811218384L, (long)l2))), (long)-6950059319777067807L, (long)l2);
                    Object[] objectArray3 = new Object[2];
                    objectArray3[1] = l;
                    objectArray3[0] = (int)callSite3;
                    CallSite callSite4 = ev_0.b("\u00d6", (Object)this, (Object)objectArray3, (long)-6950307680694876917L, (long)l2);
                    try {
                        try {
                            n = (int)callSite4;
                            if (callSite != null) break block13;
                            if (callSite != null) break block14;
                        }
                        catch (MatchException matchException) {
                            throw ev_0.b("\u00a3", (Object)matchException, (long)-6948524593895494597L, (long)l2);
                        }
                        if (n <= object2) break block14;
                    }
                    catch (MatchException matchException) {
                        throw ev_0.b("\u00a3", (Object)matchException, (long)-6948524593895494597L, (long)l2);
                    }
                    object2 = callSite4;
                    object3 = callSite3;
                    Object object4 = object3;
                }
                if (callSite == null) continue;
            }
            n = object3;
        }
        return n;
    }

    /*
     * Unable to fully structure code
     */
    @bP
    public void a(bG var1_1) {
        block13: {
            block11: {
                block12: {
                    var2_2 = ev_0.k ^ 101692737888380L;
                    var4_3 = var2_2 ^ 25086818735539L;
                    var6_4 = ev_0.b("\u00a3", (long)-8084654197810189043L, (long)var2_2);
                    try {
                        try {
                            try {
                                try {
                                    v0 = this;
                                    if (var6_4 != null) break block11;
                                    if (v0.d == 0) {
                                    }
                                    ** GOTO lbl38
                                }
                                catch (MatchException v1) {
                                    throw ev_0.b("\u00a3", (Object)v1, (long)-8082624637485433730L, (long)var2_2);
                                }
                                v2 = this.c;
                                if (var6_4 != null) break block12;
                            }
                            catch (MatchException v3) {
                                throw ev_0.b("\u00a3", (Object)v3, (long)-8082624637485433730L, (long)var2_2);
                            }
                            if (v2 == -1) break block13;
                        }
                        catch (MatchException v4) {
                            throw ev_0.b("\u00a3", (Object)v4, (long)-8082624637485433730L, (long)var2_2);
                        }
                        v2 = this.c;
                    }
                    catch (MatchException v5) {
                        throw ev_0.b("\u00a3", (Object)v5, (long)-8082624637485433730L, (long)var2_2);
                    }
                }
                try {
                    v6 = new Object[2];
                    v6[1] = var4_3;
                    v6[0] = v2;
                    ev_0.b("\u00a3", (Object)v6, (long)-8085769079332426386L, (long)var2_2);
                    this.c = -1;
                    if (var6_4 == null) break block13;
lbl38:
                    // 2 sources

                    v0 = this;
                }
                catch (MatchException v7) {
                    throw ev_0.b("\u00a3", (Object)v7, (long)-8082624637485433730L, (long)var2_2);
                }
            }
            --v0.d;
        }
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    @Override
    public Set a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return ev_0.b("\u00a3", (Object)((Object)q_0.Mace), (long)-2445523305332780348L, (long)l);
    }

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (ev_0.n[n3] != null) {
            return n3;
        }
        Object object = m[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 61;
            case 1 -> 24;
            case 2 -> 29;
            case 3 -> 43;
            case 4 -> 1;
            case 5 -> 56;
            case 6 -> 58;
            case 7 -> 46;
            case 8 -> 25;
            case 9 -> 0;
            case 10 -> 26;
            case 11 -> 10;
            case 12 -> 57;
            case 13 -> 55;
            case 14 -> 40;
            case 15 -> 38;
            case 16 -> 13;
            case 17 -> 37;
            case 18 -> 54;
            case 19 -> 63;
            case 20 -> 45;
            case 21 -> 33;
            case 22 -> 3;
            case 23 -> 31;
            case 24 -> 49;
            case 25 -> 62;
            case 26 -> 8;
            case 27 -> 14;
            case 28 -> 35;
            case 29 -> 12;
            case 30 -> 60;
            case 31 -> 23;
            case 32 -> 2;
            case 33 -> 52;
            case 34 -> 47;
            case 35 -> 4;
            case 36 -> 34;
            case 37 -> 16;
            case 38 -> 22;
            case 39 -> 19;
            case 40 -> 21;
            case 41 -> 28;
            case 42 -> 39;
            case 43 -> 44;
            case 44 -> 7;
            case 45 -> 30;
            case 46 -> 6;
            case 47 -> 18;
            case 48 -> 5;
            case 49 -> 53;
            case 50 -> 11;
            case 51 -> 42;
            case 52 -> 9;
            case 53 -> 36;
            case 54 -> 48;
            case 55 -> 17;
            case 56 -> 51;
            case 57 -> 27;
            case 58 -> 59;
            case 59 -> 20;
            case 60 -> 41;
            case 61 -> 50;
            case 62 -> 15;
            default -> 32;
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
        ev_0.n[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = ev_0.m(l, l2);
        Object object = m[n];
        if (object instanceof String) {
            String string = ev_0.n[n];
            int n2 = string.indexOf(8);
            Class clazz = ev_0.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ev_0.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ev_0.g(clazz3, string2, clazz2)) != null) {
                    ev_0.m[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ev_0.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ev_0.m[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ev_0.n(112444594367456L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = ev_0.m(l, l2);
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
                String string2 = ev_0.n[n];
                int n3 = string2.indexOf(8);
                clazz3 = ev_0.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ev_0.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ev_0.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        ev_0.m[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ev_0.n(112444594367456L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ev_0.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ev_0.m[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ev_0.n(112444594367456L, 0L);
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

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ev_0.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


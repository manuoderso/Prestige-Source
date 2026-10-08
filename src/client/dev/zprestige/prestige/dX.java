/*
 * Decompiled with CFR 0.152.
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.a2;
import dev.zprestige.prestige.bB;
import dev.zprestige.prestige.bM;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.dM;
import dev.zprestige.prestige.dN;
import dev.zprestige.prestige.dO;
import dev.zprestige.prestige.dP;
import dev.zprestige.prestige.dV;
import dev.zprestige.prestige.hc;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class dX
extends dV {
    private dM d;
    private dO a;
    private dO b;
    private dN c;
    private dM e;
    private dM f;
    private dN g;
    private dM h;
    private dP i;
    private static final long k = hc.a(7146646251312627403L, 4210895803134519566L, MethodHandles.lookup().lookupClass()).a(199032657272947L);
    private static final Object[] l = new Object[54];
    private static final String[] m = new String[54];

    public dX() {
        long l;
        long l2 = l = k ^ 0x5EABEDA36C2AL;
        long l3 = l2 ^ 0x23CADF29B7FEL;
        long l4 = l2 ^ 0x510A139AAC18L;
        long l5 = l2 ^ 0x654A795E757AL;
        long l6 = l2 ^ 0x7E8765F8CB15L;
        Object[] objectArray = new Object[2];
        objectArray[1] = l4;
        objectArray[0] = this::lambda$new$4;
        dX.b("t", (Object)this.g, (Object)objectArray, (long)6607580399342356847L, (long)l);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l4;
        objectArray2[0] = this::lambda$new$2;
        dX.b("t", (Object)this.c, (Object)objectArray2, (long)6607580399342356847L, (long)l);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l5;
        objectArray3[0] = this::lambda$new$5;
        dX.b("t", (Object)this.i, (Object)objectArray3, (long)6607020193785948102L, (long)l);
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = l6;
        objectArray4[0] = this::lambda$new$3;
        dX.b("t", (Object)this.e, (Object)objectArray4, (long)6607195873697077830L, (long)l);
        Object[] objectArray5 = new Object[2];
        objectArray5[1] = l3;
        objectArray5[0] = this::lambda$new$0;
        dX.b("t", (Object)this.a, (Object)objectArray5, (long)6606925784163326979L, (long)l);
        Object[] objectArray6 = new Object[2];
        objectArray6[1] = l3;
        objectArray6[0] = this::lambda$new$1;
        dX.b("t", (Object)this.b, (Object)objectArray6, (long)6606925784163326979L, (long)l);
    }

    static {
        dX.f();
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/dX" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = dX.m(l, l2);
            object = dX.l[n];
            try {
                if (!(object instanceof String)) break block2;
                dX.l[n] = clazz = Class.forName(m[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = dX.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = dX.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = dX.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = dX.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = l;
        l[0] = "MmSQ\u001dY[mV\u000b\u000eNL&U\r\u0002Z]aB\u001aIHa";
        objectArray[1] = "\fk|v=nyKwy,!\u0004Sd~%hl";
        objectArray[2] = "D\u001d`/&\u001d1=k 7RP3`+3\b$";
        objectArray[3] = Void.TYPE;
        dX.m[3] = "java/lang/Void";
        objectArray[4] = "[\\<'9\u0016PS-h^\u0014EX-#e";
        objectArray[5] = Integer.TYPE;
        dX.m[5] = "java/lang/Integer";
        objectArray[6] = "ApZj1\u0019Wp_0\"\u000e@;\\6.\u001aQ|K!e\r}";
        objectArray[7] = "+\n'~ge \u000561\u0004h5\b9Z1j$\u001b%v&g";
        objectArray[8] = "3>P\u00002k81AO^h63C\u0000r";
        objectArray[9] = Boolean.TYPE;
        dX.m[9] = "java/lang/Boolean";
        objectArray[10] = "\u0006\u0004B\u001b\u0006\u0014\u0010\u0004GA\u0015\u0003\u0007ODG\u0019\u0017\u0016\bSPR\u0006/";
        objectArray[11] = "\u0012,i\u0002E\u0004g\fb\rTK\u0006\u0002i\u0006P\u0011r";
        objectArray[12] = "w\b}\u007f8.a\bx%+9vC{#'-g\u0004l4l:X";
        objectArray[13] = "\u0016P\u001fj}A\u001d_\u000e%\u001cO\u0016T\n\u007f";
        objectArray[14] = "Rn=m3~Dn87 iS%;1,}Bb,&glt";
        objectArray[15] = "4U\u0015qq\u001dAu\u001e~`R {\u0015ud\bT";
        objectArray[16] = ";xz2\u0014INXq=\u0005\u0006/Vz6\u0001\\[";
        objectArray[17] = "3wWicB%wR3pU2<Q5|A#{F\"7V\u0019";
        objectArray[18] = "\u0003K\u0007\u0011\u000bbvk\f\u001e\u001a-\u0017e\u0007\u0015\u001ewc";
        objectArray[19] = "\u0006lh\u000e\u001b;\u0010lmT\b,\u0007'nR\u00048\u0016`yEO/-";
        objectArray[20] = ")z/bMk\\Z$m\\$=T/fX~I";
        objectArray[21] = "mf[4J\u007f{f^nYhl-]hU|}jJ\u007f\u001ekY";
        objectArray[22] = "U\n3>?N *81.\u0001A$3:*[5";
        objectArray[23] = "5j,!;d#j){(s4!*}$g%f=jop\u001c";
        objectArray[24] = "U_|6g\u0016 \u007fw9vYAq|2r\u00035";
        objectArray[25] = "\u0015\u001aD8`8\u001e\u0015Uw\b8\u0010\u001aF";
        objectArray[26] = Float.TYPE;
        dX.m[26] = "java/lang/Float";
        objectArray[27] = "\u0017\u0012^\u000e\u0014\u007f\u0001\u0012[T\u0007h\u0016YXR\u000b|\u0007\u001eOE@nA";
        objectArray[28] = "u`x_P\u0015\u0000@sPAZaNx[E\u0000\u0015";
        objectArray[29] = "b'%}}|\u0017\u0007.rl3v\t%yhi\u0002";
        objectArray[30] = "j\u001csj&z\u001f<xe75~2sn3o\n";
        objectArray[31] = "df\u0018[P+\u0011F\u0013TAdpH\u0018_E>\u0004";
        objectArray[32] = ">[\u0007\u001aP\u001d5T\u0016U3\u0010 R";
        objectArray[33] = "OTyZ\u0001\u001dHO\"\u0002d\\FQ=\u0006#L/Tz\u0007\u0003\u0013@Tz\u0005\u001c\"OTyZ\u0001\u001dHO\"\u0002d";
        objectArray[34] = "-:@\u007f9?%fG\u00036^z3\bc><r7\\8\\";
        objectArray[35] = "2]ng}R3V~a\u0005\\Y\u0003x+5\r>\n~<=52]ng}R3V~a\u0005";
        objectArray[36] = "T[\u007f\u0007LP\rHlO%_5NhM\u0015\rRGnZ\u001d5\u000fF7Y]\nHR`B%";
        objectArray[37] = "\u001cQ<z<c\u0014\r;\u00060\u0002\u0016\u000656ae\u001f\u0000\">Y8\u001eY!~f\u007f\n\u000e:\u0006";
        objectArray[38] = "{u&RW\u001e\"5s\u0016<\u000f'vC\u0002X\u0013,\n!R\u0004\n{` \u0019\f\u0011A";
        objectArray[39] = "AWXrsWB\u001fE\u007fN\u0001}\u0012U7>RLP\u0005w$h@AB>tY\u0002\u0011\u0002$N";
        objectArray[40] = "X7t}\u0018\u001c\u0012>c)&Oi+mg\u0016\u001c\u000e\"kp\u001e$S#2s^\u001b\u00147eh&";
        objectArray[41] = "\u0001\u001b\u000e8V\u0003P\u0006\u001a>?\u0014[\u001b\u00039V\u0018b\u0015\u0003)R~\u0002\u0013W(\u0007DEA\u0017*?";
        objectArray[42] = "\bY'tMJ\u001bO(rvIdG?:F\u0018\u0003N9-N \bY'tMJ\u001bO(rv";
        objectArray[43] = "WcIN\u0007\u001fA\u007fKAy\u0014:|\u0015XIE]u\u0013OA}WcIN\u0007\u001fA\u007fKAy";
        objectArray[44] = "+2\f\u000fo%}s\u0001VQ1\u0014kVOacsbPXi[.c\t[)diw^@Q";
        objectArray[45] = "sC7)\u000f/c\u0005>-i;\u001c\u001c67Yj{\u00150 QRsC7)\u000f/c\u0005>-i";
        objectArray[46] = "\u0012\u0004H\u001bM\u0005K\u0017[S$\u000bs\u0011_Q\u0014X\u0014\u0018YF\u001c`I\u0019\u0000E\\_\u000e\rW^$";
        objectArray[47] = "y\u001dq[\u0013\u0014q\u0010y\fj\u0019I@yD\u0004\u0010'\u0000c^Qp";
        objectArray[48] = "]|\u0011\u000fdP\u0017u\u0006[Z\u0002l`\b\u0015jP\u000bi\u000e\u0002bhVhW\u0001\"W\u0011|\u0000\u001aZ";
        objectArray[49] = "#7h\bqFz${@\u0018OB\"\u007fB(\u001b%+yU #x* V`\u001c?>wM\u0018";
        objectArray[50] = "}O}\\d\u0018$\\n\u0014\r\u0010\u001cZj\u0016=E{Sl\u00015}&R5\u0002uBaFb\u0019\r";
        objectArray[51] = "\u0011\u001cM\u0016\n\u0010\u0016\u0007\u0016NoA\u0015\u001a\u001d[1F\u0015\u0000\u0019'\u000e\u0015\u001d\u001aEH\u000e\u0015\u001f\u0005t";
        objectArray[52] = "d! C!|0((IZah2MZ`hfs\"Z`jyB,\u00016c0-,\u00014|\u0001#wW=5n#wU\"\u0004";
        Object[] objectArray2 = objectArray;
        objectArray[53] = "[f+@$c\u000fo#J_~_cFYewY4)YeuF\u0005'\u00023|\u000fj'\u00021c>d|T8*Qd|V'\u001b";
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00ce' || c == '\u00f0' || c == 'V' || c == '\u00e7') {
                field = dX.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00ce' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00f0' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'V' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = dX.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 't' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00f3' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = dX.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    @bP
    public void a(a2 a22) {
        block9: {
            a2 a23;
            long l;
            block10: {
                block11: {
                    Object object;
                    CallSite callSite;
                    block8: {
                        l = k ^ 0x2EFF5D1305L;
                        callSite = dX.b("\u00f3", (long)2638517368722952318L, (long)l);
                        try {
                            try {
                                object = (Boolean)((Object)dX.b("t", (Object)this.d, (long)2638723420500808593L, (long)l));
                                if (callSite != null) break block8;
                                if (dX.b("t", (Object)object, (long)2638850178651949577L, (long)l) == false) break block9;
                            }
                            catch (MatchException matchException) {
                                throw dX.b("\u00f3", (Object)matchException, (long)2638184787208463374L, (long)l);
                            }
                            object = dX.b("t", (Object)this.a, (long)2638723420500808593L, (long)l);
                        }
                        catch (MatchException matchException) {
                            throw dX.b("\u00f3", (Object)matchException, (long)2638184787208463374L, (long)l);
                        }
                    }
                    CallSite callSite2 = dX.b("\u00f3", (float)dX.b("t", (Object)((Float)object), (long)2637290896415513386L, (long)l), (float)dX.b("t", (Object)((Float)((Object)dX.b("t", (Object)this.b, (long)2638723420500808593L, (long)l))), (long)2637290896415513386L, (long)l), (long)2636870854443834424L, (long)l);
                    CallSite callSite3 = dX.b("\u00f3", (float)dX.b("t", (Object)((Float)((Object)dX.b("t", (Object)this.a, (long)2638723420500808593L, (long)l))), (long)2637290896415513386L, (long)l), (float)dX.b("t", (Object)((Float)((Object)dX.b("t", (Object)this.b, (long)2638723420500808593L, (long)l))), (long)2637290896415513386L, (long)l), (long)2636946267411475679L, (long)l);
                    try {
                        try {
                            dX.b("t", (Object)a22, (Object)new Object[]{Float.valueOf((float)callSite2)}, (long)2638760632963020896L, (long)l);
                            dX.b("t", (Object)a22, (Object)new Object[]{Float.valueOf((float)callSite3)}, (long)2637144827893872963L, (long)l);
                            a23 = a22;
                            if (callSite != null) break block10;
                            dX.b("t", (Object)a23, (Object)new Object[]{(Color)((Object)dX.b("t", (Object)this.c, (long)2638723420500808593L, (long)l))}, (long)2638115956178764360L, (long)l);
                            if (dX.b("t", (Object)((Boolean)((Object)dX.b("t", (Object)this.e, (long)2638723420500808593L, (long)l))), (long)2638850178651949577L, (long)l) == false) break block11;
                        }
                        catch (MatchException matchException) {
                            throw dX.b("\u00f3", (Object)matchException, (long)2638184787208463374L, (long)l);
                        }
                        dX.b("t", (Object)a22, (Object)new Object[]{dX.b("\u00f3", (float)callSite3, (long)2638327553284435655L, (long)l)}, (long)2637396495939807074L, (long)l);
                    }
                    catch (MatchException matchException) {
                        throw dX.b("\u00f3", (Object)matchException, (long)2638184787208463374L, (long)l);
                    }
                }
                a23 = a22;
            }
            dX.b("t", (Object)a23, (Object)new Object[0], (long)2638012103737201078L, (long)l);
        }
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    @bP
    public void a(bM bM2) {
        block5: {
            long l;
            block4: {
                l = k ^ 0x34421FA40924L;
                CallSite callSite = dX.b("\u00f3", (long)4520719013224319583L, (long)l);
                try {
                    try {
                        if (callSite != null) break block4;
                        if (dX.b("t", (Object)((Boolean)((Object)dX.b("t", (Object)this.h, (long)4521495916620630448L, (long)l))), (long)4521086455635742760L, (long)l) == false) break block5;
                    }
                    catch (MatchException matchException) {
                        throw dX.b("\u00f3", (Object)matchException, (long)4520914165079965231L, (long)l);
                    }
                    Object[] objectArray = new Object[1];
                    objectArray[0] = (long)dX.b("t", (Object)((Integer)((Object)dX.b("t", (Object)this.i, (long)4521495916620630448L, (long)l))), (long)4521007767813006685L, (long)l);
                    dX.b("t", (Object)bM2, (Object)objectArray, (long)4521456008767436601L, (long)l);
                }
                catch (MatchException matchException) {
                    throw dX.b("\u00f3", (Object)matchException, (long)4520914165079965231L, (long)l);
                }
            }
            dX.b("t", (Object)bM2, (Object)new Object[0], (long)4520820612084976535L, (long)l);
        }
    }

    @bP
    public void a(bB bB2) {
        Object object;
        long l;
        block4: {
            block5: {
                l = k ^ 0x5D3E5172284DL;
                CallSite callSite = dX.b("\u00f3", (long)2293942453402676022L, (long)l);
                try {
                    try {
                        object = (Boolean)((Object)dX.b("t", (Object)this.f, (long)2294300236377188569L, (long)l));
                        if (callSite != null) break block4;
                        if (dX.b("t", (Object)object, (long)2294383148284883265L, (long)l) != false) break block5;
                    }
                    catch (MatchException matchException) {
                        throw dX.b("\u00f3", (Object)matchException, (long)2293715424871276358L, (long)l);
                    }
                    return;
                }
                catch (MatchException matchException) {
                    throw dX.b("\u00f3", (Object)matchException, (long)2293715424871276358L, (long)l);
                }
            }
            object = dX.b("t", (Object)this.g, (long)2294300236377188569L, (long)l);
        }
        Color color = (Color)object;
        dX.b("t", (Object)bB2, (Object)new Object[]{color}, (long)2292626108585188424L, (long)l);
        dX.b("t", (Object)bB2, (Object)new Object[]{color}, (long)2294332602105949115L, (long)l);
        dX.b("t", (Object)bB2, (Object)new Object[0], (long)2293536281768028926L, (long)l);
    }

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (m[n3] != null) {
            return n3;
        }
        Object object = dX.l[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 29;
            case 1 -> 19;
            case 2 -> 48;
            case 3 -> 44;
            case 4 -> 52;
            case 5 -> 57;
            case 6 -> 32;
            case 7 -> 15;
            case 8 -> 33;
            case 9 -> 58;
            case 10 -> 11;
            case 11 -> 27;
            case 12 -> 62;
            case 13 -> 53;
            case 14 -> 1;
            case 15 -> 4;
            case 16 -> 10;
            case 17 -> 34;
            case 18 -> 9;
            case 19 -> 8;
            case 20 -> 18;
            case 21 -> 31;
            case 22 -> 40;
            case 23 -> 28;
            case 24 -> 55;
            case 25 -> 43;
            case 26 -> 42;
            case 27 -> 26;
            case 28 -> 46;
            case 29 -> 38;
            case 30 -> 25;
            case 31 -> 56;
            case 32 -> 0;
            case 33 -> 21;
            case 34 -> 2;
            case 35 -> 3;
            case 36 -> 22;
            case 37 -> 50;
            case 38 -> 37;
            case 39 -> 47;
            case 40 -> 13;
            case 41 -> 51;
            case 42 -> 61;
            case 43 -> 5;
            case 44 -> 60;
            case 45 -> 63;
            case 46 -> 36;
            case 47 -> 17;
            case 48 -> 12;
            case 49 -> 39;
            case 50 -> 49;
            case 51 -> 23;
            case 52 -> 54;
            case 53 -> 59;
            case 54 -> 20;
            case 55 -> 35;
            case 56 -> 16;
            case 57 -> 7;
            case 58 -> 24;
            case 59 -> 14;
            case 60 -> 45;
            case 61 -> 6;
            case 62 -> 41;
            default -> 30;
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
        dX.m[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = dX.m(l, l2);
        Object object = dX.l[n];
        if (object instanceof String) {
            String string = m[n];
            int n2 = string.indexOf(8);
            Class clazz = dX.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = dX.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = dX.g(clazz3, string2, clazz2)) != null) {
                    dX.l[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = dX.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        dX.l[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = dX.n(973159896218835L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = dX.m(l, l2);
        Object object = dX.l[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = m[n];
                int n3 = string2.indexOf(8);
                clazz3 = dX.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = dX.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = dX.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        dX.l[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = dX.n(973159896218835L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = dX.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        dX.l[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = dX.n(973159896218835L, 0L);
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
        long l = k ^ 0x388F8A5426A4L;
        return (boolean)dX.b("t", (Object)((Boolean)((Object)dX.b("t", (Object)this.d, (long)1242879530708592176L, (long)l))), (long)1242479891795918760L, (long)l);
    }

    private boolean lambda$new$2(Color color) {
        long l = k ^ 0x19A981EEF254L;
        return (boolean)dX.b("t", (Object)((Boolean)((Object)dX.b("t", (Object)this.d, (long)-4192928772581248320L, (long)l))), (long)-4193399055143572648L, (long)l);
    }

    private boolean lambda$new$1(Float f) {
        long l = k ^ 0x71C05DDC3E92L;
        return (boolean)dX.b("t", (Object)((Boolean)((Object)dX.b("t", (Object)this.d, (long)651281516939542022L, (long)l))), (long)650881949397133214L, (long)l);
    }

    private boolean lambda$new$3(Boolean bl) {
        long l = k ^ 0x4B67153432B4L;
        return (boolean)dX.b("t", (Object)((Boolean)((Object)dX.b("t", (Object)this.d, (long)373776441702969888L, (long)l))), (long)373340308969073592L, (long)l);
    }

    private boolean lambda$new$4(Color color) {
        long l = k ^ 0x79097A32AAFEL;
        return (boolean)dX.b("t", (Object)((Boolean)((Object)dX.b("t", (Object)this.f, (long)-7105033281311348118L, (long)l))), (long)-7105434026702720014L, (long)l);
    }

    private boolean lambda$new$5(Integer n) {
        long l = k ^ 0x6D0EA95081F9L;
        return (boolean)dX.b("t", (Object)((Boolean)((Object)dX.b("t", (Object)this.h, (long)-5304451082461003411L, (long)l))), (long)-5304262475170244363L, (long)l);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(dX.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


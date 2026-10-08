/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_634
 *  net.minecraft.class_640
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.cP;
import dev.zprestige.prestige.hc;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import net.minecraft.class_634;
import net.minecraft.class_640;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class fV {
    private final Set a = new LinkedHashSet();
    private final Set b = new LinkedHashSet();
    private static final long c = hc.a(-8438056130050606451L, -402263423532643705L, MethodHandles.lookup().lookupClass()).a(72219145146985L);
    private static final Object[] d = new Object[50];
    private static final String[] e = new String[50];

    static {
        fV.b();
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = fV.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = fV.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public List b(Object[] objectArray) {
        return new ArrayList(this.b);
    }

    private static void b() {
        Object[] objectArray = d;
        d[0] = "\u0001y#[r\u0007\u001fq9\u0014\u000f\u0017\u001f";
        objectArray[1] = ":\fX%$w1\u0003IjEy:\bM0";
        objectArray[2] = Boolean.TYPE;
        fV.e[2] = "java/lang/Boolean";
        objectArray[3] = "\u00164G|<1\b<]3]&\u00160Ria";
        objectArray[4] = "$\\l\u0010'O:Tv_@N+O{\u0005fH";
        objectArray[5] = "I![4X\u0002_!^nK\u0015Hj]hG\u0001Y-J\u007f\f\u0013e";
        objectArray[6] = "\u0012EGD\n\u0001geLK\u001bN\u001a}_L\u0012\u0007r";
        objectArray[7] = "ci/?D\u0002ci8cH\ry\"8}H\u0018~Sh \u0019";
        objectArray[8] = "%\"}\u0014;=%\"jH72?ijV7'8\u0018>\u000e`";
        objectArray[9] = "u\u0006.+uDu\u00069wyKoM9iy^h<l1(";
        objectArray[10] = "W\u0010\u00030'-^\u001e\u0000yd#A\u000b\u0006r# \u001a8\u000fs/\u0012F\u0010\bw&'";
        objectArray[11] = "8\u0003'\"Tz.\u0003\"xGm9H!~Ky(\u000f6i\u0000l\n";
        objectArray[12] = "\u0010\u000b\u0007 WQe+\f/F\u001e\u0004%\u0007$BDp";
        objectArray[13] = "fHB\u000b\u0007Tx@XD|tEm";
        objectArray[14] = "EUf.\u001aw[]|axk\\@";
        objectArray[15] = "$&y\u0003*D/)hLII:$g'|K+7{\u000bkF";
        objectArray[16] = "/rw-\u001d%/r`q\u0011*59`o\u0011?2H50D";
        objectArray[17] = "f!7g\u0001Ox)-(lU`,$e[Sc.";
        objectArray[18] = "&L\u001e+}k0L\u001bqn|'\u0007\u0018wbh6@\u000f`)xz";
        objectArray[19] = "0h(r,vEH#}=9$F(v9cP";
        objectArray[20] = "3\"+2?}8-:}Be+*34";
        objectArray[21] = "O]\u000e=\u0003+Y]\u000bg\u0010<N\u0016\ba\u001c(_Q\u001fvW=m";
        objectArray[22] = "`\u0001x\u0011Z{\u0015!s\u001eK4t/x\u0015On\u0000";
        objectArray[23] = "\u0012\u00000<Lpg ;3]?\u0006.08Yer";
        objectArray[24] = "Ny>u@QSlfW\u0001\\Kj";
        objectArray[25] = "\u0000J9qEHJ_!u;KWT5+A\\|J.\fFU^-5/\u000b_P]#2\\1GHx$QAQU/J";
        objectArray[26] = "&&M;]1a-\u0010ba1\u001dc\u0018#\u0018;c3\u00142\n[";
        objectArray[27] = "I]:\u0000\t.\u0007\u001c7\u0016`z\u0014A<\n7-J\u0016df]i\u001a\u0012g\u001f\u001df\u0019\u0017";
        objectArray[28] = "S)\u0011tc7\u001dh\u001cb\nh\u0002$\u0013ufZVeN+\n1\u001e:\u0015{0\u007f_7\u0003\u0012";
        objectArray[29] = "k,9Qy6\"$j3<`?!$^Fp?v4Y6f\"!Z\n(n9=aU'm?F";
        objectArray[30] = "\u001fs\u0005$L*ZrPj*=LdT|F\u000f\u001b)\n%*gH`Sy\u001bi\u0010qS\u001b";
        objectArray[31] = "s0? ;/r18%\\8Cd>%?k\"v3vcRze0)'i%j3/\\";
        objectArray[32] = "P\u0018&;xp\u001a\u0007jgFo\u0002\r]16skOu?%tP\u0010z<#\u000f";
        objectArray[33] = "C~\u0018[2B\r?\u0015M[\u001d\u0012s\u001aZ7/F2D\u0007[\u0012\u0015p\u001d[;FE\u007f\u0003=";
        objectArray[34] = "_rc@cwP\"m\u0007\\uH&{P sNK:Was\n4pH-/4";
        objectArray[35] = "#lwyi@q{f\u007f\u001by\u001d^Q\u001dtI,seo&^=u";
        objectArray[36] = ";\u0004\u00145\u0004coT\u001b+bf<\u0012\u000b5\u000eTk^[jbhh\f\u0012m\u0001g8\u0002UR";
        objectArray[37] = "\u0011\u0019!\u0010A@[\u0006mL\u007fYG\u0007`w\u0002Z\u001a\u0019v\u0007\u0014GMw";
        objectArray[38] = "l/a-bqm.f(\u0005e\\{`(f5=im{:\fezn$~7:um\"\u0005";
        objectArray[39] = "pr&~m\n\"e7x\u001f'_H\u001aW\u001f\u0017di\"hmEsx$";
        objectArray[40] = "wY\\\u0003 Qc\u0003\u0004\u000eIH\u001aS\t\u000e*\u0018{A\u0004]v!#R\u0007\u00022\u001a|]\u0004\u0004I";
        objectArray[41] = "\u00039\u0007u@TJmI4:TKz\u0011jA9ObH`PIY\u007f\u001f\u000e\u0003WQd\u00035\\XRbx";
        objectArray[42] = "is0WnRg0\"\n\t\u0007l#[Jl^n%+\\q\t\u0000v5Tj\u0015;):Wln";
        objectArray[43] = "\u000bj(\u007fU4\nk/z2 ;8;~\n+\u0001#5/\fIR./-PsI ~+2";
        objectArray[44] = ",\u000f<=\u001bQ~\u0018-;iy\u000e8\\6\u0012C'\u0006.d\u0005R!";
        objectArray[45] = "-\u0002'>sk#Z6>\u0011;~kngn!h\u0006'3 `\u0012";
        objectArray[46] = "c\u007fZ\u000b&\u0002*w\tir^4iP\b\u007fBRh\\YwS\"~A\u000e\u0019\u0000<vZ\u0012\"_3u\\i";
        objectArray[47] = "$Zt\u0000UfdUw\u0005jzt[{Y\u0006H$\u0019%\u0001j.'X`D\u0007gs\u0016!>";
        objectArray[48] = "CzxY`\u000b\nr+;6\\\u001e\u0010f^o^\u0018`pC80K~xX$\u000b\u0014q{^_";
        Object[] objectArray2 = objectArray;
        objectArray[49] = "H||\u001d\u0011k]= \u0015(l#o}\u000bK<B}pX\u0017\u0005Ork\u0016NgZltT(";
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = fV.a(l, l2);
            object = d[n];
            try {
                if (!(object instanceof String)) break block2;
                fV.d[n] = clazz = Class.forName(e[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = fV.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = fV.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public boolean b(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l = (Long)objectArray[1];
        l = c ^ l;
        return (boolean)fV.a("\u00d4", (Object)this.b, (Object)string, (long)-6077464522805196224L, (long)l);
    }

    @cP
    public void b(String string) {
        long l = c ^ 0x6D696204FF93L;
        fV.a("\u00d4", (Object)this.a, (Object)string, (long)2187469169030065021L, (long)l);
    }

    private static Field c(long l, long l2) {
        int n = fV.a(l, l2);
        Object object = d[n];
        if (object instanceof String) {
            String string = e[n];
            int n2 = string.indexOf(8);
            Class clazz = fV.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = fV.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = fV.a(clazz3, string2, clazz2)) != null) {
                    fV.d[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = fV.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        fV.d[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = fV.b(86375650117020L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public void c(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l = (Long)objectArray[1];
        l = c ^ l;
        fV.a("\u00d4", (Object)this.b, (Object)string, (long)3803043045013501868L, (long)l);
    }

    @cP
    public List c() {
        long l;
        long l2 = l = c ^ 0x41F73535A8C5L;
        long l3 = l2 ^ 0xAEFFB3B2880L;
        long l4 = l2 ^ 0x1EB2973AA40AL;
        CallSite callSite = fV.a("y", (long)5263787081712108404L, (long)l);
        try {
            if (fV.a("\u00d4", (Object)fV.a("y", (long)5263876425481995037L, (long)l), (long)5260907703731823358L, (long)l) == null) {
                return new ArrayList();
            }
        }
        catch (MatchException matchException) {
            throw fV.a("y", (Object)matchException, (long)5260441028532875645L, (long)l);
        }
        ArrayList arrayList = new ArrayList();
        CallSite callSite2 = fV.a("\u00d4", (Object)fV.a("\u00d4", (Object)((class_634)fV.a("y", (Object)fV.a("\u00d4", (Object)fV.a("y", (long)5263876425481995037L, (long)l), (long)5260907703731823358L, (long)l), (long)5263703575528793839L, (long)l)), (long)5261048823265920714L, (long)l), (long)5260950050840525090L, (long)l);
        while (fV.a("\u00d4", (Object)callSite2, (long)5260793663673017502L, (long)l) != false) {
            block26: {
                CallSite callSite3;
                block25: {
                    CallSite callSite4;
                    class_640 class_6402;
                    block23: {
                        block24: {
                            CallSite callSite5;
                            block22: {
                                CallSite callSite6;
                                block21: {
                                    class_6402 = (class_640)fV.a("\u00d4", (Object)callSite2, (long)5261165331616942668L, (long)l);
                                    try {
                                        callSite6 = fV.a("\u00d4", (Object)class_6402, (long)5264051187896951560L, (long)l);
                                        if (callSite != null) break block21;
                                        if (callSite6 == null) continue;
                                    }
                                    catch (MatchException matchException) {
                                        throw fV.a("y", (Object)matchException, (long)5260441028532875645L, (long)l);
                                    }
                                    callSite6 = fV.a("\u00d4", (Object)class_6402, (long)5264051187896951560L, (long)l);
                                }
                                Object[] objectArray = new Object[2];
                                objectArray[1] = l4;
                                objectArray[0] = callSite6;
                                if (fV.a("y", (Object)objectArray, (long)5261979490697024424L, (long)l) == null) continue;
                                try {
                                    callSite5 = fV.a("\u00e7", (Object)fV.a("y", (long)5263876425481995037L, (long)l), (long)5263806798543962027L, (long)l);
                                    if (callSite != null) break block22;
                                    if (callSite5 == null) continue;
                                }
                                catch (MatchException matchException) {
                                    throw fV.a("y", (Object)matchException, (long)5260441028532875645L, (long)l);
                                }
                                callSite5 = fV.a("\u00e7", (Object)fV.a("y", (long)5263876425481995037L, (long)l), (long)5263806798543962027L, (long)l);
                            }
                            try {
                                try {
                                    callSite4 = fV.a("\u00d4", (Object)callSite5, (long)5260755538843563303L, (long)l);
                                    if (callSite != null) break block23;
                                    if (callSite4 != null) break block24;
                                }
                                catch (MatchException matchException) {
                                    throw fV.a("y", (Object)matchException, (long)5260441028532875645L, (long)l);
                                }
                                if (callSite == null) continue;
                            }
                            catch (MatchException matchException) {
                                throw fV.a("y", (Object)matchException, (long)5260441028532875645L, (long)l);
                            }
                        }
                        try {
                            callSite3 = fV.a("\u00d4", (Object)class_6402, (long)5264051187896951560L, (long)l);
                            if (callSite != null) break block25;
                            callSite4 = fV.a("\u00d4", (Object)callSite3, (long)5260566108904759276L, (long)l);
                        }
                        catch (MatchException matchException) {
                            throw fV.a("y", (Object)matchException, (long)5260441028532875645L, (long)l);
                        }
                    }
                    try {
                        if (fV.a("\u00d4", (Object)callSite4, (Object)fV.a("\u00d4", (Object)fV.a("\u00e7", (Object)fV.a("y", (long)5263876425481995037L, (long)l), (long)5263806798543962027L, (long)l), (long)5260755538843563303L, (long)l), (long)5260290178809178828L, (long)l) != false) {
                            continue;
                        }
                    }
                    catch (MatchException matchException) {
                        throw fV.a("y", (Object)matchException, (long)5260441028532875645L, (long)l);
                    }
                    callSite3 = fV.a("\u00d4", (Object)class_6402, (long)5264051187896951560L, (long)l);
                }
                Object[] objectArray = new Object[2];
                objectArray[1] = l4;
                objectArray[0] = callSite3;
                CallSite callSite7 = fV.a("y", (Object)objectArray, (long)5261979490697024424L, (long)l);
                try {
                    CallSite callSite8;
                    try {
                        Object[] objectArray2 = new Object[2];
                        objectArray2[1] = l3;
                        objectArray2[0] = callSite7;
                        callSite8 = fV.a("\u00d4", (Object)this, (Object)objectArray2, (long)5261220097000722733L, (long)l);
                        if (callSite != null || callSite8 != false) break block26;
                    }
                    catch (MatchException matchException) {
                        throw fV.a("y", (Object)matchException, (long)5260441028532875645L, (long)l);
                    }
                    callSite8 = fV.a("\u00d4", arrayList, (Object)callSite7, (long)5260377614408717200L, (long)l);
                }
                catch (MatchException matchException) {
                    throw fV.a("y", (Object)matchException, (long)5260441028532875645L, (long)l);
                }
            }
            if (callSite == null) continue;
        }
        return arrayList;
    }

    public void d(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l = (Long)objectArray[1];
        l = c ^ l;
        fV.a("\u00d4", (Object)this.b, (Object)string, (long)-8719145746981293095L, (long)l);
    }

    private static Method d(long l, long l2) {
        int n = fV.a(l, l2);
        Object object = d[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = e[n];
                int n3 = string2.indexOf(8);
                clazz3 = fV.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = fV.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = fV.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        fV.d[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = fV.b(86375650117020L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = fV.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        fV.d[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = fV.b(86375650117020L, 0L);
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

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/fV" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
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

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00e7' || c == '\u00fc' || c == 'N' || c == '\u00ba') {
                field = fV.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e7' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00fc' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'N' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = fV.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00d4' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'y' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = fV.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public Color a(Object[] objectArray) {
        CallSite callSite;
        long l;
        block7: {
            long l2;
            String string;
            block8: {
                string = (String)objectArray[0];
                l = (Long)objectArray[1];
                long l3 = l = c ^ l;
                long l4 = l3 ^ 0x1DE7107E438CL;
                l2 = l3 ^ 0x60AC7D3C686AL;
                CallSite callSite2 = fV.a("y", (long)2450148956684478584L, (long)l);
                try {
                    try {
                        Object[] objectArray2 = new Object[2];
                        objectArray2[1] = l4;
                        objectArray2[0] = string;
                        callSite = fV.a("\u00d4", (Object)this, (Object)objectArray2, (long)2454335101783947809L, (long)l);
                        if (callSite2 != null) break block7;
                        if (callSite == false) break block8;
                    }
                    catch (MatchException matchException) {
                        throw fV.a("y", (Object)matchException, (long)2453547237197929073L, (long)l);
                    }
                    return fV.a("N", (long)2454167243503271908L, (long)l);
                }
                catch (MatchException matchException) {
                    throw fV.a("y", (Object)matchException, (long)2453547237197929073L, (long)l);
                }
            }
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = l2;
            objectArray3[0] = string;
            callSite = fV.a("\u00d4", (Object)this, (Object)objectArray3, (long)2450513548694456666L, (long)l);
        }
        try {
            if (callSite != false) {
                return fV.a("N", (long)2453652933869100995L, (long)l);
            }
        }
        catch (MatchException matchException) {
            throw fV.a("y", (Object)matchException, (long)2453547237197929073L, (long)l);
        }
        return fV.a("N", (long)2454434957431418096L, (long)l);
    }

    public int a(Object[] objectArray) {
        Object object;
        block10: {
            block11: {
                CallSite callSite;
                long l;
                block8: {
                    long l2;
                    String string;
                    block9: {
                        string = (String)objectArray[0];
                        l = (Long)objectArray[1];
                        long l3 = l = c ^ l;
                        long l4 = l3 ^ 0x4ED9353FF18FL;
                        l2 = l3 ^ 0x3392587DDA69L;
                        callSite = fV.a("y", (long)-8069326554259694981L, (long)l);
                        try {
                            try {
                                Object[] objectArray2 = new Object[2];
                                objectArray2[1] = l4;
                                objectArray2[0] = string;
                                object = fV.a("\u00d4", (Object)this, (Object)objectArray2, (long)-8066826561906866142L, (long)l);
                                if (callSite != null) break block8;
                                if (object == false) break block9;
                            }
                            catch (MatchException matchException) {
                                throw fV.a("y", (Object)matchException, (long)-8066066743458305934L, (long)l);
                            }
                            return 1;
                        }
                        catch (MatchException matchException) {
                            throw fV.a("y", (Object)matchException, (long)-8066066743458305934L, (long)l);
                        }
                    }
                    Object[] objectArray3 = new Object[2];
                    objectArray3[1] = l2;
                    objectArray3[0] = string;
                    object = fV.a("\u00d4", (Object)this, (Object)objectArray3, (long)-8069700489384117415L, (long)l);
                }
                try {
                    try {
                        if (callSite != null) break block10;
                        if (object == false) break block11;
                    }
                    catch (MatchException matchException) {
                        throw fV.a("y", (Object)matchException, (long)-8066066743458305934L, (long)l);
                    }
                    return -1;
                }
                catch (MatchException matchException) {
                    throw fV.a("y", (Object)matchException, (long)-8066066743458305934L, (long)l);
                }
            }
            object = 0;
        }
        return (int)object;
    }

    public boolean a(Object[] objectArray) {
        CallSite callSite;
        block4: {
            long l;
            String string;
            block5: {
                string = (String)objectArray[0];
                l = (Long)objectArray[1];
                long l2 = (l = c ^ l) ^ 0x64D857F68EBEL;
                CallSite callSite2 = fV.a("y", (long)-9204252522197267909L, (long)l);
                try {
                    try {
                        Object[] objectArray2 = new Object[2];
                        objectArray2[1] = l2;
                        objectArray2[0] = string;
                        callSite = fV.a("y", (Object)objectArray2, (long)-9201000558577815154L, (long)l);
                        if (callSite2 != null) break block4;
                        if (callSite == false) break block5;
                    }
                    catch (MatchException matchException) {
                        throw fV.a("y", (Object)matchException, (long)-9200994431562778574L, (long)l);
                    }
                    return true;
                }
                catch (MatchException matchException) {
                    throw fV.a("y", (Object)matchException, (long)-9200994431562778574L, (long)l);
                }
            }
            callSite = fV.a("\u00d4", (Object)this.a, (Object)string, (long)-9201136079784484442L, (long)l);
        }
        return (boolean)callSite;
    }

    @cP
    public void a(String string) {
        long l = c ^ 0x1937B2A11415L;
        fV.a("\u00d4", (Object)this.a, (Object)string, (long)-732320946738727235L, (long)l);
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (e[n3] != null) {
            return n3;
        }
        Object object = d[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 47;
            case 1 -> 37;
            case 2 -> 13;
            case 3 -> 59;
            case 4 -> 48;
            case 5 -> 18;
            case 6 -> 51;
            case 7 -> 53;
            case 8 -> 16;
            case 9 -> 36;
            case 10 -> 26;
            case 11 -> 7;
            case 12 -> 34;
            case 13 -> 32;
            case 14 -> 49;
            case 15 -> 62;
            case 16 -> 28;
            case 17 -> 9;
            case 18 -> 25;
            case 19 -> 1;
            case 20 -> 21;
            case 21 -> 20;
            case 22 -> 0;
            case 23 -> 10;
            case 24 -> 4;
            case 25 -> 61;
            case 26 -> 30;
            case 27 -> 31;
            case 28 -> 44;
            case 29 -> 15;
            case 30 -> 29;
            case 31 -> 42;
            case 32 -> 52;
            case 33 -> 35;
            case 34 -> 56;
            case 35 -> 39;
            case 36 -> 3;
            case 37 -> 17;
            case 38 -> 45;
            case 39 -> 55;
            case 40 -> 14;
            case 41 -> 43;
            case 42 -> 23;
            case 43 -> 11;
            case 44 -> 57;
            case 45 -> 50;
            case 46 -> 12;
            case 47 -> 41;
            case 48 -> 8;
            case 49 -> 46;
            case 50 -> 54;
            case 51 -> 19;
            case 52 -> 5;
            case 53 -> 63;
            case 54 -> 38;
            case 55 -> 33;
            case 56 -> 24;
            case 57 -> 60;
            case 58 -> 22;
            case 59 -> 6;
            case 60 -> 2;
            case 61 -> 58;
            case 62 -> 27;
            default -> 40;
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
        fV.e[n3] = new String(cArray);
        return n3;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    @cP
    public List a() {
        return new ArrayList(this.a);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(fV.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


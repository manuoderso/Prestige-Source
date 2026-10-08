/*
 * Decompiled with CFR 0.152.
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.bS;
import dev.zprestige.prestige.dp_0;
import dev.zprestige.prestige.g0;
import dev.zprestige.prestige.gZ;
import dev.zprestige.prestige.ge_0;
import dev.zprestige.prestige.hc;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.ref.Cleaner;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from dev.zprestige.prestige.gd
 */
public final class gd_0
implements AutoCloseable {
    private final int a;
    private final gZ[] b;
    private final Cleaner.Cleanable c;
    private int d;
    static final boolean e;
    private static final long f;
    private static final String g;
    private static final long[] h;
    private static final Integer[] i;
    private static final Map j;
    private static final Object[] k;
    private static final String[] l;

    private gd_0(int n, gZ[] gZArray, long l) {
        int n2;
        l = f ^ l;
        this.a = n;
        this.b = new gZ[gd_0.a("b", (int)20913, (long)(0x75B5C7F638A8485DL ^ l))];
        if (gZArray != null) {
            gd_0.b("\u00d4", (Object)gZArray, (int)0, (Object)this.b, (int)0, (int)gZArray.length, (long)-8303322562264394469L, (long)l);
        }
        try {
            gd_0 gd_02 = this;
            n2 = gZArray == null ? 0 : gZArray.length;
        }
        catch (MatchException matchException) {
            throw gd_0.b("\u00d4", (Object)matchException, (long)-8303683747489707162L, (long)l);
        }
        gd_02.d = n2;
        this.c = gd_0.b("\u00e7", (Object)dp_0.a, (Object)this, () -> gd_0.lambda$new$1(n), (long)-8302689362506736427L, (long)l);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n;
        f = hc.a(170800146414641837L, -3270956938205366627L, MethodHandles.lookup().lookupClass()).a(31131857636818L);
        long l = f ^ 0x244CF7E3507CL;
        k = new Object[61];
        gd_0.l = new String[61];
        gd_0.a();
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
        byte[] byArray3 = cipher.doFinal("\u001bdQ\u00ac\u001d\"\u00e0\u00a8\u00ee\u00b3_z\u00c9\u00f7^\u009da[\u0002\u00e5:h\u009b\u008d".getBytes("ISO-8859-1"));
        g = gd_0.a(byArray3).intern();
        j = new HashMap(13);
        Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
        byte[] byArray4 = new byte[8];
        byte[] byArray5 = byArray4;
        byArray4[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray5 = byArray5;
            byArray5[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher2.init(2, (Key)secretKeyFactory2.generateSecret(new DESKeySpec(byArray5)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[3];
        int n2 = 0;
        String string = "\u00ac\u001e\u001b\u0000\u000b\u0098|\u00056\u0081r\u0093;\u00dd\u0086\u00b8g\u0096\u001a\u001ey\u0000\n\u00a0";
        int n3 = "\u00ac\u001e\u001b\u0000\u000b\u0098|\u00056\u0081r\u0093;\u00dd\u0086\u00b8g\u0096\u001a\u001ey\u0000\n\u00a0".length();
        int n4 = 0;
        do {
            byte[] byArray6 = string.substring(n4, n4 += 8).getBytes("ISO-8859-1");
            int n5 = n2++;
            long l2 = ((long)byArray6[0] & 0xFFL) << 56 | ((long)byArray6[1] & 0xFFL) << 48 | ((long)byArray6[2] & 0xFFL) << 40 | ((long)byArray6[3] & 0xFFL) << 32 | ((long)byArray6[4] & 0xFFL) << 24 | ((long)byArray6[5] & 0xFFL) << 16 | ((long)byArray6[6] & 0xFFL) << 8 | (long)byArray6[7] & 0xFFL;
            byte[] byArray7 = cipher2.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n5] = ((long)byArray7[0] & 0xFFL) << 56 | ((long)byArray7[1] & 0xFFL) << 48 | ((long)byArray7[2] & 0xFFL) << 40 | ((long)byArray7[3] & 0xFFL) << 32 | ((long)byArray7[4] & 0xFFL) << 24 | ((long)byArray7[5] & 0xFFL) << 16 | ((long)byArray7[6] & 0xFFL) << 8 | (long)byArray7[7] & 0xFFL;
        } while (n4 < n3);
        h = lArray;
        i = new Integer[3];
        try {
            n = gd_0.b("\u00e7", gd_0.class, (long)-6698818191823027976L, (long)l) == false ? 1 : 0;
        }
        catch (MatchException matchException) {
            throw gd_0.b("\u00d4", (Object)matchException, (long)-6699080572243991379L, (long)l);
        }
        e = n;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = gd_0.a(l, l2);
            object = k[n];
            try {
                if (!(object instanceof String)) break block2;
                gd_0.k[n] = clazz = Class.forName(gd_0.l[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/gd" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = gd_0.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = gd_0.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = gd_0.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = gd_0.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static gd_0 b(Object[] objectArray) {
        List list = (List)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = l = f ^ l;
        long l3 = l2 ^ 0x33FFBBEB3E9FL;
        long l4 = l2 ^ 0xEC020E51474L;
        CallSite callSite = gd_0.b("\u00d4", (long)4693410788318491584L, (long)l);
        gd_0 gd_02 = new gd_0((int)callSite, null, l3);
        try {
            if (list != null) {
                Object[] objectArray2 = new Object[2];
                objectArray2[1] = l4;
                objectArray2[0] = list;
                gd_0.b("\u00e7", (Object)gd_02, (Object)objectArray2, (long)4692849086863984984L, (long)l);
            }
        }
        catch (MatchException matchException) {
            throw gd_0.b("\u00d4", (Object)matchException, (long)4693969046758737537L, (long)l);
        }
        return gd_02;
    }

    private static Field c(long l, long l2) {
        int n = gd_0.a(l, l2);
        Object object = k[n];
        if (object instanceof String) {
            String string = gd_0.l[n];
            int n2 = string.indexOf(8);
            Class clazz = gd_0.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = gd_0.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = gd_0.a(clazz3, string2, clazz2)) != null) {
                    gd_0.k[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = gd_0.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        gd_0.k[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = gd_0.b(341120671478965L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = gd_0.a(l, l2);
        Object object = k[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = gd_0.l[n];
                int n3 = string2.indexOf(8);
                clazz3 = gd_0.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = gd_0.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = gd_0.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        gd_0.k[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = gd_0.b(341120671478965L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = gd_0.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        gd_0.k[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = gd_0.b(341120671478965L, 0L);
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

    public static List a(Object[] objectArray) {
        bS bS2 = (bS)objectArray[0];
        ge_0 ge_02 = (ge_0)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = (l = f ^ l) ^ 0x73965221F957L;
        ArrayList arrayList = new ArrayList(ge_02.a.length);
        try {
            for (int i = 0; i < ge_02.a.length; ++i) {
                Object[] objectArray2 = new Object[3];
                objectArray2[2] = l2;
                objectArray2[1] = i;
                objectArray2[0] = bS2;
                gd_0.b("\u00e7", arrayList, (Object)gd_0.b("\u00e7", (Object)ge_02, (Object)objectArray2, (long)-6570724579357735815L, (long)l), (long)-6569085094971965962L, (long)l);
            }
        }
        catch (MatchException matchException) {
            throw gd_0.b("\u00d4", (Object)matchException, (long)-6569281594179902608L, (long)l);
        }
        return arrayList;
    }

    private static void a() {
        Object[] objectArray = k;
        k[0] = "yFXZ\u0007AoF]\u0000\u0014Vx\r^\u0006\u0018BiJI\u0011SUm";
        objectArray[1] = "r~Ie.\u0013\u0007^Bj?\\fPIa;\u0006\u0012";
        objectArray[2] = Void.TYPE;
        gd_0.l[2] = "java/lang/Void";
        objectArray[3] = "\u0015\u0002\u000fy9\u0001\u001e\r\u001e6D\u0014\f\u0017\u001cu";
        objectArray[4] = "`Ypo\u0002\u0014kVa c\u001a`]ez";
        objectArray[5] = Integer.TYPE;
        gd_0.l[5] = "java/lang/Integer";
        objectArray[6] = "zs#C\"\u001bls&\u00191\f{8%\u001f=\u0018j\u007f2\bv\fz";
        objectArray[7] = "XO]r\u001avS@L=y{FMCVLyW^_z[t";
        objectArray[8] = "\u0013Da?KP\u0018Kpp\u0017Y\u001f\u000bT2\u0000]\u0017@e";
        objectArray[9] = "Z\u007f6W_vQp'\u0018#o^p!T\u001d\u007f";
        objectArray[10] = "\u0002Q\u000ebko\t^\u001f-7f\u000e\u001e;o b\u0006U\n'\u0006o\rQ\u0016b'o\r";
        objectArray[11] = "wF*UNIrS!UMN}Z*\u0017\fyT\u0007}";
        objectArray[12] = "A{\u001d8M\u00064[\u00167\\IUU\u001d<X\u0013!";
        objectArray[13] = "G\u0010\"u\u001csL\u001f3:qsL\u0002'";
        objectArray[14] = Boolean.TYPE;
        gd_0.l[14] = "java/lang/Boolean";
        objectArray[15] = "\u0004+ i\\q\u0012+%3Of\u0005`&5Cr\u0014'1\"\bf\u0005";
        objectArray[16] = "\b!#\u0013\u0007\u001d}\u0001(\u001c\u0016R\u001c\u000f#\u0017\u0012\bh";
        objectArray[17] = "u\u0010sCl5c\u0010v\u0019\u007f\"t[u\u001fs6e\u001cb\b8\"K";
        objectArray[18] = "<z<\u000b\u000e\u000b\"r&Dl\u0017%o";
        objectArray[19] = "Ac\u0006g\"\u00194C\rh3VUM\u0006c7\f!";
        objectArray[20] = "bm\u0017}\u0014\b\u0017M\u001cr\u0005GvC\u0017y\u0001\u001d\u0002";
        objectArray[21] = "\u0012.\u0001!dC\u0004.\u0004{wT\u0013e\u0007}{@\u0002\"\u0010j0TF";
        objectArray[22] = "\u0011|Mg4e\u001as\\(Wh\u000fu";
        objectArray[23] = "\t:Znd!\u00172@!\u000b&\u0011:U|";
        objectArray[24] = "\u0001:\u000e\u000fy7t\u001a\u0005\u0000hx\u0015\u0014\u000e\u000bl\"a";
        objectArray[25] = "\u0015}6*\u007fk\u000bu,e7k\u0011\u007f4\">pQU.?\u0017k\u0011\u007f4\">p";
        objectArray[26] = "\u0014\u0016nP\u0013\u0003a6e_\u0002L\u00008nT\u0006\u0016t";
        objectArray[27] = "\f\r'\u0006)4\u001a\r\"\\:#\rF!Z67\u001c\u00016M}&;";
        objectArray[28] = "\bfotgW}Fd{v\u0018\u001cHoprBh";
        objectArray[29] = Long.TYPE;
        gd_0.l[29] = "java/lang/Long";
        objectArray[30] = "r)RlG\u0015\u0007\tYcVZf\u0007RhR\u0000\u0012";
        objectArray[31] = "o:H6>G\u001a\u001aC9/\b{\u0014H2+R\u000f";
        objectArray[32] = "\"V\t\u00158\f#U\u0007\u0003\u0006\u000f\u001eS\n\u0015{\u0017a\u000bPM<f'NVIg\\y\\WH\u0006";
        objectArray[33] = "\u000f\t\",\u0017\u0017\u0003\u0003*5k\b\b\u001dIi\u0011\f\b\u000b'?\u0014\t^mr(\n\u0004\u0007\u0003$-\u000fRaV33\u0002\u000b\u000f\u000066Tm";
        objectArray[34] = "w^\u000bs\u001f6$L\b*p:yX\u000b\u0014\u00140\u007fA\u001ekLj'\u0006o/\u001b$ [_~\u0016,!<VmHoy\u0006\b\u007fIn\u0018";
        objectArray[35] = "pNCg!AqMMq\u001fALK@gbZ3\u0013\u001a?%+pNCg!AqMMq\u001f";
        objectArray[36] = "9JJ<W~nWJf-ePNM0P}/\u0016\u0017h\u0017\f;C\u0013j\u0017~i\u0016\u0017%-";
        objectArray[37] = "v\fTb\u0015\rw\u0011\u0004=.@z#GvGM\u001d\n\\3\u0012]~\u0011L3^<y\u000eZq_C!T\u00026.";
        objectArray[38] = "\u0011GrZ|\u0005L\u0001t\n\r\rAT.\u0018q\u001aV;t\b}OK\u000b%\u0005uN,\u0005-ZdJS\u00031Yow\u0013T#\u001f}\u0019\u0016K%\u0002\r";
        objectArray[39] = "r_V(t#sB\u0006wOixKRFthxPY(\"m}\u0006?";
        objectArray[40] = "\u0006I\u000ba\u0004\u0012]T\bhk\u0001]\u007f\u0006k5\u0003CL\u0006}\"\u0014CY\u001avkUCQ\u0002k\u0005\u0003FTT\r";
        objectArray[41] = "v6B\u0005L|-+A\f#o-\u0005C\u000fO^$5^\u0004SI35K\u0018#;3.K\u000fMm6+\u001di\u001ayqtCSDkpu\"";
        objectArray[42] = "a*aa\u001fv28b8pyw5lb\u000b\u0014j,b{\u0001k2v:<p/t)l`\u001eyq,:\u0006Kno!ch\u001dkjw\u0005b\u0014ss9z:N+4H>|\u0011}h&hy\u0014+\u000es\u007fg\u0019r`%zbO\u0014gpyy\u0013qqv{vp";
        objectArray[43] = "\u001b2->6l@/.7Y\u007f@\u0006+;3tI\u0015 (%}T\u00021.#qN\u00027(0a$p730vJ&26f\u0010\u001d2ui8*C thY";
        objectArray[44] = "Y\u00111{B\u001a\\Ld\u0016C|Q\u0017nk\\\u0003\tM6,-ELK2w\u0017\u001b^J3\u0016";
        objectArray[45] = "g| \u0014`9<a#\u001d\u000f*<I!\u0003f/<h\u001e\u0015u95u\t\u0004s?9o\t\u0002u,)\u0005{\u0002n,>k-\u0007kzX<9@4$bb+A5E";
        objectArray[46] = "\u001d8]+B3LeRv/5\u0010^Y7N7\u00160\u000f2Kap";
        objectArray[47] = "=?\b$4\u00127:\\%\u000eF}&Q*eH\u007f-8`e_?;\b1hW>\\\u0003!oFa2U$j\u0010\u0007gS+6H76^#7/<&Y2hAj#\\d\u000e\u0014}=Q=`Bx8\u0007[7V?gYaiD>f8";
        objectArray[48] = " Sahn\u0010!Po~P\u0013\u001c\u000f=o9\u0011w\\yf7z!\tff;\u0011rMohP";
        objectArray[49] = "\u0003\u0004,(}hX\u0019/!\u0012{X7-\"~^A\u0013\")h\u0014\u0007\u0007--tzQ\u0002({\u0012/F\u001c%\"|yC\u0019sD+m\u0004F-~u\u007f\u0005GL";
        objectArray[50] = "@\t&Z=\u0004E\u0016 GM\u0001\u001b\u000b#@MS\u0006^qGw\r\u0014_p&";
        objectArray[51] = "dVqB\u001a\u001feK!\u001d!Gc\\\u0018\u0017J^7W(FGV60q\u0014]QlUg\u0012_^\u000f";
        objectArray[52] = "\u0004TLpxzZZLq\u0006'X\u0010Cjk'|\u0010Y}|7T\fDKz\"I\u0016Y\u0010osI\u0014AuyuK\u001b\"";
        objectArray[53] = "\u0012tI\u0015r\u0018C)FH\u001f\u001e\u001d\u0012\u001fKc\n\u001cw\tMa\u0005\u007f";
        objectArray[54] = "\u0003:0UZ\u007fX'3\\5lX\u000f=]X\u007fQ\u001d=CInL\n*C\\rGCkCTjZ-=FQ<<z)\u0001\u000eb\u0006$;\u0000\u000f\u0003";
        objectArray[55] = "\"2M\u001f\u001bQsoBBvW TI\u0003\u0017U):\u001f\u0006\u0012\u0003O";
        objectArray[56] = "\nBk\u000ee0RH0\u0018\u001d(k]e\u0000`0\u0014\u0005?X'APC`\u000e{/\u0006FeX\u001d";
        objectArray[57] = "/z-#Mztg.*\"it] 5^k`J13Xgz[*.Dz}yMtXgye#\"]b/\u0003v5Covm 0F9\u001087.K`~n2+\u001d\u0006y;10Aco=3?\"=jb$)LkogrOAg\u007f?$/\u001c7sfMv[>+bw(I?*\u0003";
        objectArray[58] = "7O\u0002dWm6RR;l31Uk1\u0016=5O\u0005g\u00138c)Pa\u001cd;\u0019\u0001l\u0014e\\";
        objectArray[59] = "O\u0011 \u001f}HC\u001b(\u0006\u0001W@\u0013KZ{SH\u0013%\f~V\u001eup\u001b`[G\u001b&\u001ee\r!N1\u0000hTO\u00184\u0005>2";
        Object[] objectArray2 = objectArray;
        objectArray[60] = "\u000fOj,\f\u0002\u000eLd:2\u00013Ji,O\u0019L\u00123t\bhXHd%\tYYU4z2";
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = gd_0.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = gd_0.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'p' || c == 'I' || c == 'A' || c == 'c') {
                field = gd_0.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'p' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'I' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'A' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = gd_0.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00e7' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d4' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public static gd_0 a(Object[] objectArray) {
        bS bS2 = (bS)objectArray[0];
        ge_0 ge_02 = (ge_0)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = l = f ^ l;
        long l3 = l2 ^ 0x7AF9BC9D150BL;
        long l4 = l2 ^ 0x1031DB43F0FAL;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l3;
        objectArray2[1] = ge_02;
        objectArray2[0] = bS2;
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l4;
        objectArray3[0] = gd_0.b("\u00d4", (Object)objectArray2, (long)4802347446682892726L, (long)l);
        return gd_0.b("\u00d4", (Object)objectArray3, (long)4801591005444333945L, (long)l);
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

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    /*
     * WARNING - void declaration
     */
    public void a(Object[] objectArray) {
        void var9_11;
        gZ[] gZArray;
        CallSite callSite;
        long l;
        List list;
        block16: {
            block15: {
                list = (List)objectArray[0];
                l = (Long)objectArray[1];
                l = f ^ l;
                callSite = gd_0.b("\u00e7", (Object)list, (long)-6472332045981645378L, (long)l);
                try {
                    try {
                        if (!e && callSite > gd_0.a("b", (int)24678, (long)(0x5FD2A282BDB9D360L ^ l))) {
                        }
                        break block15;
                    }
                    catch (MatchException matchException) {
                        throw gd_0.b("\u00d4", (Object)matchException, (long)-6473820424051416691L, (long)l);
                    }
                    throw new AssertionError((Object)(g + (int)callSite + ")"));
                }
                catch (MatchException matchException) {
                    throw gd_0.b("\u00d4", (Object)matchException, (long)-6473820424051416691L, (long)l);
                }
            }
            gZArray = (gZ[])gd_0.b("\u00e7", (Object)list, gd_0::lambda$rebind$2, (long)-6472471291057768209L, (long)l);
            try {
                try {
                    if (this.d != callSite || gd_0.b("\u00d4", (Object)this.b, (int)0, (int)this.d, (Object)gZArray, (int)0, (int)gZArray.length, (long)-6471978814462432357L, (long)l) == false) break block16;
                }
                catch (MatchException matchException) {
                    throw gd_0.b("\u00d4", (Object)matchException, (long)-6473820424051416691L, (long)l);
                }
                return;
            }
            catch (MatchException matchException) {
                throw gd_0.b("\u00d4", (Object)matchException, (long)-6473820424051416691L, (long)l);
            }
        }
        CallSite callSite2 = gd_0.b("\u00d4", (int)this.d, (int)callSite, (long)-6472768362399572394L, (long)l);
        CallSite callSite3 = gd_0.b("\u00d4", (int)this.d, (int)callSite, (long)-6473209256153350708L, (long)l);
        gd_0.b("\u00d4", (int)this.a, (long)-6472218435579130730L, (long)l);
        CallSite callSite4 = callSite3;
        while (true) {
            void var9_9;
            block18: {
                block17: {
                    try {
                        try {
                            if (var9_9 >= callSite2) break;
                            if (var9_9 < this.d) break block17;
                        }
                        catch (MatchException matchException) {
                            throw gd_0.b("\u00d4", (Object)matchException, (long)-6473820424051416691L, (long)l);
                        }
                        gd_0.b("\u00d4", (int)var9_9, (long)-6472080119123391739L, (long)l);
                        break block18;
                    }
                    catch (MatchException matchException) {
                        throw gd_0.b("\u00d4", (Object)matchException, (long)-6473820424051416691L, (long)l);
                    }
                }
                gd_0.b("\u00d4", (int)var9_9, (long)-6471953087713429337L, (long)l);
            }
            ++var9_9;
        }
        int n = 0;
        while (var9_11 < callSite) {
            gZ gZ2 = (gZ)((Object)gd_0.b("\u00e7", (Object)list, (int)var9_11, (long)-6473090921497701377L, (long)l));
            gd_0.b("\u00d4", (int)gd_0.a("b", (int)32697, (long)(0x6E9425C8A1484CBDL ^ l)), (int)gd_0.b("\u00e7", (Object)gZ2.cc, (Object)new Object[0], (long)-6473264843579396625L, (long)l), (long)-6473901274117687802L, (long)l);
            g0 g02 = gZ2.cd;
            gd_0.b("\u00d4", (int)var9_11, (int)gd_0.b("\u00e7", (Object)g02, (long)-6473480947618073659L, (long)l), (int)gd_0.b("\u00e7", (Object)g02, (long)-6471720707290626485L, (long)l), (boolean)gd_0.b("\u00e7", (Object)g02, (long)-6473584146538331638L, (long)l), (int)gZ2.ce, (long)gZ2.cf, (long)-6473311778912924015L, (long)l);
            ++var9_11;
        }
        gd_0.b("\u00d4", (int)0, (long)-6472218435579130730L, (long)l);
        gd_0.b("\u00d4", (Object)this.b, null, (long)-6472563766962819375L, (long)l);
        gd_0.b("\u00d4", (Object)gZArray, (int)0, (Object)this.b, (int)0, (int)callSite, (long)-6471794569532882960L, (long)l);
        this.d = (int)callSite;
    }

    public int a(Object[] objectArray) {
        return this.a;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (gd_0.l[n3] != null) {
            return n3;
        }
        Object object = k[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 11;
            case 1 -> 40;
            case 2 -> 63;
            case 3 -> 37;
            case 4 -> 28;
            case 5 -> 50;
            case 6 -> 26;
            case 7 -> 3;
            case 8 -> 57;
            case 9 -> 10;
            case 10 -> 20;
            case 11 -> 60;
            case 12 -> 55;
            case 13 -> 61;
            case 14 -> 2;
            case 15 -> 30;
            case 16 -> 39;
            case 17 -> 23;
            case 18 -> 32;
            case 19 -> 29;
            case 20 -> 31;
            case 21 -> 18;
            case 22 -> 49;
            case 23 -> 53;
            case 24 -> 42;
            case 25 -> 24;
            case 26 -> 41;
            case 27 -> 54;
            case 28 -> 58;
            case 29 -> 13;
            case 30 -> 6;
            case 31 -> 33;
            case 32 -> 44;
            case 33 -> 35;
            case 34 -> 62;
            case 35 -> 4;
            case 36 -> 47;
            case 37 -> 14;
            case 38 -> 7;
            case 39 -> 36;
            case 40 -> 15;
            case 41 -> 59;
            case 42 -> 17;
            case 43 -> 16;
            case 44 -> 43;
            case 45 -> 51;
            case 46 -> 25;
            case 47 -> 27;
            case 48 -> 52;
            case 49 -> 0;
            case 50 -> 56;
            case 51 -> 8;
            case 52 -> 19;
            case 53 -> 38;
            case 54 -> 5;
            case 55 -> 48;
            case 56 -> 9;
            case 57 -> 46;
            case 58 -> 21;
            case 59 -> 22;
            case 60 -> 1;
            case 61 -> 12;
            case 62 -> 34;
            default -> 45;
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
        gd_0.l[n3] = new String(cArray);
        return n3;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/gd" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1522;
        if (i[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = h[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])j.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    j.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/gd", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            gd_0.i[n2] = n3;
        }
        return i[n2];
    }

    @Override
    public void close() {
        long l = f ^ 0x1B205A9F13A7L;
        gd_0.b("\u00e7", (Object)this.c, (long)-2246275842721247324L, (long)l);
    }

    private static void lambda$new$0(int n) {
        long l = f ^ 0x527CF61B31E5L;
        gd_0.b("\u00d4", (int)n, (long)-4426767262312956197L, (long)l);
    }

    private static void lambda$new$1(int n) {
        long l = f ^ 0x5A6BD5D0F8E6L;
        long l2 = l ^ 0x45254B4885DBL;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = () -> gd_0.lambda$new$0(n);
        gd_0.b("\u00d4", (Object)objectArray, (long)834659843452510264L, (long)l);
    }

    private static gZ[] lambda$rebind$2(int n) {
        return new gZ[n];
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(gd_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(gd_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2338
 *  net.minecraft.class_238
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.bt_0;
import dev.zprestige.prestige.cz_0;
import dev.zprestige.prestige.eb_0;
import dev.zprestige.prestige.hc;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_2338;
import net.minecraft.class_238;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from dev.zprestige.prestige.ak
 */
public class ak_0 {
    private eb_0 a;
    private class_2338 b;
    private class_238 c;
    private float d;
    public long e;
    public long f;
    private static final long g = hc.a(5078698517812525866L, -8292803385231474768L, MethodHandles.lookup().lookupClass()).a(133570644526515L);
    private static final long[] h;
    private static final Long[] i;
    private static final Map j;
    private static final Object[] k;
    private static final String[] l;

    public ak_0(eb_0 eb_02, long l) {
        l = g ^ l;
        this.d = 0.0f;
        this.e = (long)ak_0.a("e", (int)1640, (long)(0x3551901508F76FB2L ^ l));
        this.a = eb_02;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        k = new Object[60];
        l = new String[60];
        ak_0.a();
        j = new HashMap(13);
        long l = g ^ 0x34438F43D71FL;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[2];
        int n = 0;
        String string = "\n\f\u00ba\u00f5\u00c0\u00a9\u00bb\u009a\u00b3\u0019\u0018j\u0004\u00f9\u0007\u008c";
        int n2 = "\n\f\u00ba\u00f5\u00c0\u00a9\u00bb\u009a\u00b3\u0019\u0018j\u0004\u00f9\u0007\u008c".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        h = lArray;
        i = new Long[2];
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ak_0.a(l, l2);
            object = k[n];
            try {
                if (!(object instanceof String)) break block2;
                ak_0.k[n] = clazz = Class.forName(ak_0.l[n]);
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
            throw new RuntimeException("dev/zprestige/prestige/ak" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ak_0.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ak_0.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = ak_0.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ak_0.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private void b(Object[] objectArray) {
        long l = (Long)objectArray[0];
        l = g ^ l;
        this.b = null;
        this.c = null;
        this.d = 0.0f;
        this.e = (long)ak_0.a("e", (int)11273, (long)(0x7A9C0D4140A84B7DL ^ l));
        this.f = (long)ak_0.b("T", (long)-239693725252097247L, (long)l);
    }

    private static Field c(long l, long l2) {
        int n = ak_0.a(l, l2);
        Object object = k[n];
        if (object instanceof String) {
            String string = ak_0.l[n];
            int n2 = string.indexOf(8);
            Class clazz = ak_0.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ak_0.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ak_0.a(clazz3, string2, clazz2)) != null) {
                    ak_0.k[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ak_0.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ak_0.k[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ak_0.b(2075225873579687L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = ak_0.a(l, l2);
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
                String string2 = ak_0.l[n];
                int n3 = string2.indexOf(8);
                clazz3 = ak_0.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ak_0.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ak_0.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        ak_0.k[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ak_0.b(2075225873579687L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ak_0.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ak_0.k[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ak_0.b(2075225873579687L, 0L);
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

    public void a(Object[] objectArray) {
        class_2338 class_23382 = (class_2338)objectArray[0];
        this.b = class_23382;
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

    private static void a() {
        Object[] objectArray = k;
        k[0] = "f]\u0000KR{mR\u0011\u0004/n\u007fH\u0013G";
        objectArray[1] = Long.TYPE;
        ak_0.l[1] = "java/lang/Long";
        objectArray[2] = "%2?U\u000f28'gwN? !";
        objectArray[3] = Integer.TYPE;
        ak_0.l[3] = "java/lang/Integer";
        objectArray[4] = "_\fFVjl_\fQ\nfcEGQ\u0014fvB6\u0000K?";
        objectArray[5] = Double.TYPE;
        ak_0.l[5] = "java/lang/Double";
        objectArray[6] = "4DRGF+\"DW\u001dU<5\u000fT\u001bY($HC\f\u0012:\u0018";
        objectArray[7] = "\u00114:\u0014\t\rd\u00141\u001b\u0018B\u0019\f\"\u001c\u0011\u000bq";
        objectArray[8] = "i\b 8\u0012\u0016i\b7d\u001e\u0019sC7z\u001e\ft2g'O";
        objectArray[9] = "\\P6\u0012\u0019\u0003\\P!N\u0015\fF\u001b!P\u0015\u0019Ajp\u000fM";
        objectArray[10] = "B\u0013\u0000#\u001f.B\u0013\u0017\u007f\u0013!XX\u0017a\u00134_)C9D";
        objectArray[11] = "\u001f$B|sH\t$G&`_\u001eoD lK\u000f(S7'\\-";
        objectArray[12] = Boolean.TYPE;
        ak_0.l[12] = "java/lang/Boolean";
        objectArray[13] = "~\u001ei9\"\u0010h\u001elc1\u0007\u007fUoe=\u0013n\u0012xrv\u0001q";
        objectArray[14] = "\b^\u0004\u0001p\t\u0003Q\u0015N\u0013\u0004\u0016\\\u001a%&\u0006\u0007O\u0006\t1\u000b";
        objectArray[15] = "$OP\u0000\u000bF2OUZ\u0018Q%\u0004V\\\u0014E4CAK_R\u0001";
        objectArray[16] = "\t\u0001\u001e5&b|!\u0015:7-\u001d/\u001e13wi";
        objectArray[17] = Void.TYPE;
        ak_0.l[17] = "java/lang/Void";
        objectArray[18] = "\n\u00121XL*\n\u0012&\u0004@%\u0010Y&\u001a@0\u0017(tA\u0018z";
        objectArray[19] = "b%\u0012G\u000fob%\u0005\u001b\u0003`xn\u0005\u0005\u0003u\u007f\u001fTZQ>";
        objectArray[20] = "2VK\u0002uA2V\\^yN(\u001d\\@y[/l\u000e\u0014(\u001a";
        objectArray[21] = "\u00111;\u0015Xk\u00111,ITd\u000bz,WTq\f\u000b~\f\f0";
        objectArray[22] = "11]\"YWD\u0011V-H\u0018%\u001f]&LBQ";
        objectArray[23] = "FD#\u0018%GFD4D)H\\\u000f4Z)][~e\u0005q\nKM6E;q\u001a\u0015g";
        objectArray[24] = "}Q4Q}\u0000v^%\u001e\u0011\u0003x\\'Q=";
        objectArray[25] = "!iC{\u0005$7iF!\u00163 \"E'\u001a'1eR0Q5\u0000";
        objectArray[26] = ":Kk\u0000T\u001fOk`\u000fEP.ek\u0004A\nZ";
        objectArray[27] = Float.TYPE;
        ak_0.l[27] = "java/lang/Float";
        objectArray[28] = "\u0014x<u\u001f^\u0002x9/\fI\u00153:)\u0000]\u0004t->KJ;";
        objectArray[29] = "$\u0002?\u0019pd/\r.V\u0011j$\u0006*\f";
        objectArray[30] = "17k\u0000$c63qB\u001clfsY\u0001qnm\u000f,Dr=us\u007f\u0015a`\u000b";
        objectArray[31] = "+;0QA\u0001`j|]|Qq8&_+\u0006+o\u007f3GDyi{B\u0002Qa$";
        objectArray[32] = "[:;N@a\u0001ayQ~ugf0\u000f\fo\u001b>>R\u0018\u001f";
        objectArray[33] = "{*X>uC68\r!NG'<\u0006.\u0019\u0010yo_BpH6-\u0002) W%1";
        objectArray[34] = "k2L\u0005\u0014z& \u0019\u001a/~7$\u0012\u0015x)isJy\u0010t0'K\u0004Ea63";
        objectArray[35] = "Io<QY~\u0002>p]d.\u0013l*_3yI;t3_;\u001b=wB\u001a.\u0003p";
        objectArray[36] = "\u0007o;]VM\u0000k!\u001fnBP+\u001cK\u0002-\u0007h(\u0018\u0010QT9;En";
        objectArray[37] = "JT`?\u000e\u0016\u000bRj0|\u0004u\u0019jzL\u0007\u001f\u0019e(\u001em";
        objectArray[38] = "\u0013Lb.v6\u0018\u0019kb\f>\"@lsk+_N6 fWKBjyp*E\u00189t\f";
        objectArray[39] = "\u001c30r\u0019xWb|~$(F0&|s\u007f\u001cgz\u0010\u001f=Na{aZ(V,";
        objectArray[40] = "Uy\u000f\u0018IXA#\u0003K;Q<y\u000b\u000bR\nX\"\u000e\n_1Vi\u0015\u0005G\\BeW\u0006;";
        objectArray[41] = "PC38t8\u0005V5,I \u0002[51%\u0012Q\u001fiiI.\u0010L9.y(WL.V";
        objectArray[42] = "'\u0016\b!.KlGD-\u0013\u001b}\u0015\u001e/DL'BCC(\u000euDC2m\u001bm\t";
        objectArray[43] = "E\"Q\u00078K\u0017gU\u000eJ\u001eD'K\u0002&,\u0010c\u0011[r{\u0013dE[4\u0007@5V\u0006J";
        objectArray[44] = "^_W^\u0015EY[M\u001c-J\t\u001bcAUE\rg\u0010\u001aC\u001b\u001a\u001bCKPFd";
        objectArray[45] = "}\u001f{^E\u0019-\u0017~\u001e/\u0007p\u0003uMxY*V(!ASw\rnPV\u0003k\u000e";
        objectArray[46] = "hP7\u001e\u001f\u0005|\n;Mm\u0003\u0001P3\r\u0004We\u000b6\f\tlk@-\u0003\u0011\u0001\u007fLo\u0000m";
        objectArray[47] = "J-\u0015?:8Nm\u0010cB4D{L2\u0015c\u001e-\u0012^-a\u0018wP<)!\u001d+";
        objectArray[48] = "L\r\u001fNM]\u001eH\u001bG?\bM\b\u0005KS:\u0019L_\u0012\u0004m\u001aK\u000b\u0012A\u0011I\u001a\u0018O?";
        objectArray[49] = "0+b8]T5?x*!G7%d>HK\u000e+d.L-`-;cKG`\"i1!";
        objectArray[50] = ";6%$$4pgi(\u0019om$7!u]1hfF\"qidn7gdq)W}bc<a&8w{qXl=p69))(h{\u0000c94{7>(hxw\n";
        objectArray[51] = "IPc\u001bb^\u0002\u0001/\u0017_\u000e\u0013Su\u0015\bYI\u0004*yd\u001b\u001b\u0002(\b!\u000e\u0003O";
        objectArray[52] = "YW#\u0015@\u0001^S9Wx\u000e\u000e\u0013\u0014\n\u0005\fcUa\u0000F\u001f\u001f\u00060\u0013\u001ba";
        objectArray[53] = "@Q\\Ea\u001d\u0011\u0016\u0016D\u001bG N\u000eKr\u0016D\u0015\u000bJ\u007f-BFSTvVP]\u001dK\u001b";
        objectArray[54] = "[RG\u0015:3D\u0010\u0003\u0007Y 9HR\n%-BGBU3I";
        objectArray[55] = "Th.y~h\u001f9buC8\u000ek8w\u0014oT<`\u001bx-\u0006:ej=8\u001ew";
        objectArray[56] = "\f`\u00123LG\\\u007f\u0001/,I_}\u0002(@{\u000b>]\u007f\u0017,]:_.TNYzZr,";
        objectArray[57] = "g\u0003c|@Jy\u0018>GG\rs\u0003j!P,h\u001cj\u0002M\u0014m\u0018|GR\u001dcAn+K\u001e8y";
        objectArray[58] = "?,:`j\u0012mi>i\u0018G>) etujmz<$\"ij.<f^:;=a\u0018";
        Object[] objectArray2 = objectArray;
        objectArray[59] = "!bHs5\u0017'%HdMB'aCx!pq$\u001e q'$'E|2V3wY\u007fM\u0017%&\u0013u'\u0017*tA\u001f";
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ak_0.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00d6' || c == '\u00dd' || c == 'Q' || c == 'h') {
                field = ak_0.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00d6' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00dd' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'Q' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ak_0.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00f6' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'T' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
     * Unable to fully structure code
     */
    @bP
    public void a(bt_0 var1_1) {
        block41: {
            block49: {
                block50: {
                    block47: {
                        block48: {
                            block46: {
                                block42: {
                                    block44: {
                                        block43: {
                                            block40: {
                                                block38: {
                                                    block39: {
                                                        v0 = var2_2 = ak_0.g ^ 76222610552583L;
                                                        var4_3 = v0 ^ 50097631896774L;
                                                        var6_4 = v0 ^ 38733740629585L;
                                                        var8_5 = v0 ^ 66648685300786L;
                                                        var10_6 = ak_0.b("T", (long)-6640709055822759026L, (long)var2_2);
                                                        try {
                                                            try {
                                                                v1 = this;
                                                                if (var10_6 != null) break block38;
                                                                if (ak_0.b("\u00f6", (Object)((Boolean)ak_0.b("\u00f6", (Object)v1.a.i, (long)-6641971759454167629L, (long)var2_2)), (long)-6641932066272166925L, (long)var2_2) != false) break block39;
                                                            }
                                                            catch (MatchException v2) {
                                                                throw ak_0.b("T", (Object)v2, (long)-6640903793998894043L, (long)var2_2);
                                                            }
                                                            return;
                                                        }
                                                        catch (MatchException v3) {
                                                            throw ak_0.b("T", (Object)v3, (long)-6640903793998894043L, (long)var2_2);
                                                        }
                                                    }
                                                    this.e = (long)(ak_0.b("T", (long)-6642458280067320740L, (long)var2_2) - this.f);
                                                    this.f = (long)ak_0.b("T", (long)-6642458280067320740L, (long)var2_2);
                                                    v1 = this;
                                                }
                                                var11_7 = (float)v1.e * 0.005f;
                                                try {
                                                    if (var11_7 > 1.0f) {
                                                        return;
                                                    }
                                                }
                                                catch (MatchException v4) {
                                                    throw ak_0.b("T", (Object)v4, (long)-6640903793998894043L, (long)var2_2);
                                                }
                                                try {
                                                    try {
                                                        v5 = this;
                                                        if (var10_6 != null) break block40;
                                                        if (v5.b == null) break block41;
                                                    }
                                                    catch (MatchException v6) {
                                                        throw ak_0.b("T", (Object)v6, (long)-6640903793998894043L, (long)var2_2);
                                                    }
                                                    v5 = this;
                                                }
                                                catch (MatchException v7) {
                                                    throw ak_0.b("T", (Object)v7, (long)-6640903793998894043L, (long)var2_2);
                                                }
                                            }
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            if (var10_6 != null) break block42;
                                                            if (ak_0.b("\u00f6", (Object)v5.a, (long)-6641074247599460910L, (long)var2_2) != false) {
                                                            }
                                                            ** GOTO lbl96
                                                        }
                                                        catch (MatchException v8) {
                                                            throw ak_0.b("T", (Object)v8, (long)-6640903793998894043L, (long)var2_2);
                                                        }
                                                        v9 = cz_0.b;
                                                        if (var10_6 != null) break block43;
                                                    }
                                                    catch (MatchException v10) {
                                                        throw ak_0.b("T", (Object)v10, (long)-6640903793998894043L, (long)var2_2);
                                                    }
                                                    if (ak_0.b("\u00f6", (Object)ak_0.b("\u00f6", (Object)ak_0.b("\u00d6", (Object)v9, (long)-6640622757073026324L, (long)var2_2), (long)-6641384575038678948L, (long)var2_2), (Object)ak_0.b("Q", (long)-6641662914732719905L, (long)var2_2), (long)-6642328009788978025L, (long)var2_2) != false) {
                                                    }
                                                    ** GOTO lbl96
                                                }
                                                catch (MatchException v11) {
                                                    throw ak_0.b("T", (Object)v11, (long)-6640903793998894043L, (long)var2_2);
                                                }
                                                v9 = cz_0.b;
                                            }
                                            catch (MatchException v12) {
                                                throw ak_0.b("T", (Object)v12, (long)-6640903793998894043L, (long)var2_2);
                                            }
                                        }
                                        try {
                                            try {
                                                v13 = ak_0.b("\u00d6", (Object)v9, (long)-6640812446154779676L, (long)var2_2);
                                                if (var10_6 != null) break block44;
                                                if (v13 != null) {
                                                }
                                                ** GOTO lbl96
                                            }
                                            catch (MatchException v14) {
                                                throw ak_0.b("T", (Object)v14, (long)-6640903793998894043L, (long)var2_2);
                                            }
                                            v13 = ak_0.b("\u00d6", (Object)cz_0.b, (long)-6640812446154779676L, (long)var2_2);
                                        }
                                        catch (MatchException v15) {
                                            throw ak_0.b("T", (Object)v15, (long)-6640903793998894043L, (long)var2_2);
                                        }
                                    }
                                    try {
                                        block45: {
                                            try {
                                                if (ak_0.b("\u00f6", (Object)v13, (long)-6642423674880609926L, (long)var2_2) != ak_0.b("Q", (long)-6641514532778108509L, (long)var2_2)) break block45;
                                                v16 = new Object[4];
                                                v16[3] = var8_5;
                                                v16[2] = Float.valueOf(var11_7);
                                                v16[1] = Float.valueOf((float)ak_0.b("\u00f6", (Object)((Color)ak_0.b("\u00f6", (Object)this.a.j, (long)-6641971759454167629L, (long)var2_2)), (long)-6641600444198140404L, (long)var2_2) / 255.0f);
                                                v16[0] = Float.valueOf(this.d);
                                                this.d = (float)ak_0.b("T", (Object)v16, (long)-6642205439062706025L, (long)var2_2);
                                                if (var10_6 == null) break block46;
                                            }
                                            catch (MatchException v17) {
                                                throw ak_0.b("T", (Object)v17, (long)-6640903793998894043L, (long)var2_2);
                                            }
                                        }
                                        v5 = this;
                                    }
                                    catch (MatchException v18) {
                                        throw ak_0.b("T", (Object)v18, (long)-6640903793998894043L, (long)var2_2);
                                    }
                                }
                                v19 = new Object[4];
                                v19[3] = var8_5;
                                v19[2] = Float.valueOf(var11_7);
                                v19[1] = Float.valueOf(0.0f);
                                v19[0] = Float.valueOf(this.d);
                                v5.d = (float)ak_0.b("T", (Object)v19, (long)-6642205439062706025L, (long)var2_2);
                            }
                            try {
                                try {
                                    v20 = this;
                                    if (var10_6 != null) break block47;
                                    if (!(v20.d <= 0.01f)) break block48;
                                }
                                catch (MatchException v21) {
                                    throw ak_0.b("T", (Object)v21, (long)-6640903793998894043L, (long)var2_2);
                                }
                                this.b = null;
                                return;
                            }
                            catch (MatchException v22) {
                                throw ak_0.b("T", (Object)v22, (long)-6640903793998894043L, (long)var2_2);
                            }
                        }
                        v20 = this;
                    }
                    try {
                        try {
                            if (var10_6 != null) break block49;
                            if (v20.c != null) break block50;
                        }
                        catch (MatchException v23) {
                            throw ak_0.b("T", (Object)v23, (long)-6640903793998894043L, (long)var2_2);
                        }
                        this.c = new class_238(this.b);
                    }
                    catch (MatchException v24) {
                        throw ak_0.b("T", (Object)v24, (long)-6640903793998894043L, (long)var2_2);
                    }
                }
                v20 = this;
            }
            v20.c = ak_0.b("\u00f6", (Object)this.c, (double)(((double)ak_0.b("\u00f6", (Object)this.b, (long)-6641878829872660938L, (long)var2_2) - ak_0.b("\u00d6", (Object)this.c, (long)-6641758448502546603L, (long)var2_2)) * 0.05000000074505806), (double)(((double)ak_0.b("\u00f6", (Object)this.b, (long)-6642259375443628825L, (long)var2_2) - ak_0.b("\u00d6", (Object)this.c, (long)-6640681733027276659L, (long)var2_2)) * 0.05000000074505806), (double)(((double)ak_0.b("\u00f6", (Object)this.b, (long)-6641258304390852779L, (long)var2_2) - ak_0.b("\u00d6", (Object)this.c, (long)-6641142679174401575L, (long)var2_2)) * 0.05000000074505806), (long)-6641742078125210771L, (long)var2_2);
            var12_8 = new Color((int)ak_0.b("\u00f6", (Object)((Color)ak_0.b("\u00f6", (Object)this.a.j, (long)-6641971759454167629L, (long)var2_2)), (long)-6641045124651290309L, (long)var2_2), (int)ak_0.b("\u00f6", (Object)((Color)ak_0.b("\u00f6", (Object)this.a.j, (long)-6641971759454167629L, (long)var2_2)), (long)-6640298827463676597L, (long)var2_2), (int)ak_0.b("\u00f6", (Object)((Color)ak_0.b("\u00f6", (Object)this.a.j, (long)-6641971759454167629L, (long)var2_2)), (long)-6642105979172311864L, (long)var2_2), (int)(this.d / 4.0f * 255.0f));
            var13_9 = new Color((int)ak_0.b("\u00f6", (Object)((Color)ak_0.b("\u00f6", (Object)this.a.j, (long)-6641971759454167629L, (long)var2_2)), (long)-6641045124651290309L, (long)var2_2), (int)ak_0.b("\u00f6", (Object)((Color)ak_0.b("\u00f6", (Object)this.a.j, (long)-6641971759454167629L, (long)var2_2)), (long)-6640298827463676597L, (long)var2_2), (int)ak_0.b("\u00f6", (Object)((Color)ak_0.b("\u00f6", (Object)this.a.j, (long)-6641971759454167629L, (long)var2_2)), (long)-6642105979172311864L, (long)var2_2), (int)(this.d * 255.0f));
            v25 = new Object[10];
            v25[9] = var4_3;
            v25[8] = var12_8;
            v25[7] = Float.valueOf((float)ak_0.b("\u00d6", (Object)this.c, (long)-6642097169126187826L, (long)var2_2));
            v25[6] = Float.valueOf((float)ak_0.b("\u00d6", (Object)this.c, (long)-6640374148419981436L, (long)var2_2));
            v25[5] = Float.valueOf((float)ak_0.b("\u00d6", (Object)this.c, (long)-6640963606355494777L, (long)var2_2));
            v25[4] = Float.valueOf((float)ak_0.b("\u00d6", (Object)this.c, (long)-6641142679174401575L, (long)var2_2));
            v25[3] = Float.valueOf((float)ak_0.b("\u00d6", (Object)this.c, (long)-6640681733027276659L, (long)var2_2));
            v25[2] = Float.valueOf((float)ak_0.b("\u00d6", (Object)this.c, (long)-6641758448502546603L, (long)var2_2));
            v25[1] = var1_1.a;
            v25[0] = var1_1.b;
            ak_0.b("T", (Object)v25, (long)-6641310929915724258L, (long)var2_2);
            v26 = new Object[10];
            v26[9] = var6_4;
            v26[8] = var13_9;
            v26[7] = Float.valueOf((float)ak_0.b("\u00d6", (Object)this.c, (long)-6642097169126187826L, (long)var2_2));
            v26[6] = Float.valueOf((float)ak_0.b("\u00d6", (Object)this.c, (long)-6640374148419981436L, (long)var2_2));
            v26[5] = Float.valueOf((float)ak_0.b("\u00d6", (Object)this.c, (long)-6640963606355494777L, (long)var2_2));
            v26[4] = Float.valueOf((float)ak_0.b("\u00d6", (Object)this.c, (long)-6641142679174401575L, (long)var2_2));
            v26[3] = Float.valueOf((float)ak_0.b("\u00d6", (Object)this.c, (long)-6640681733027276659L, (long)var2_2));
            v26[2] = Float.valueOf((float)ak_0.b("\u00d6", (Object)this.c, (long)-6641758448502546603L, (long)var2_2));
            v26[1] = var1_1.a;
            v26[0] = var1_1.b;
            ak_0.b("T", (Object)v26, (long)-6641437362202566873L, (long)var2_2);
        }
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/ak" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static long a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = ak_0.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Long.TYPE, l2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return l2;
    }

    private static long a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1BD7;
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
                throw new RuntimeException("dev/zprestige/prestige/ak", exception);
            }
            long l4 = ((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL;
            ak_0.i[n2] = l4;
        }
        return i[n2];
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (ak_0.l[n3] != null) {
            return n3;
        }
        Object object = k[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 4;
            case 1 -> 38;
            case 2 -> 63;
            case 3 -> 56;
            case 4 -> 1;
            case 5 -> 53;
            case 6 -> 59;
            case 7 -> 8;
            case 8 -> 55;
            case 9 -> 50;
            case 10 -> 2;
            case 11 -> 28;
            case 12 -> 46;
            case 13 -> 12;
            case 14 -> 58;
            case 15 -> 18;
            case 16 -> 54;
            case 17 -> 29;
            case 18 -> 49;
            case 19 -> 60;
            case 20 -> 7;
            case 21 -> 26;
            case 22 -> 39;
            case 23 -> 31;
            case 24 -> 57;
            case 25 -> 40;
            case 26 -> 35;
            case 27 -> 33;
            case 28 -> 11;
            case 29 -> 30;
            case 30 -> 17;
            case 31 -> 22;
            case 32 -> 0;
            case 33 -> 48;
            case 34 -> 27;
            case 35 -> 15;
            case 36 -> 20;
            case 37 -> 41;
            case 38 -> 19;
            case 39 -> 16;
            case 40 -> 45;
            case 41 -> 9;
            case 42 -> 6;
            case 43 -> 5;
            case 44 -> 3;
            case 45 -> 43;
            case 46 -> 14;
            case 47 -> 24;
            case 48 -> 10;
            case 49 -> 62;
            case 50 -> 51;
            case 51 -> 23;
            case 52 -> 44;
            case 53 -> 42;
            case 54 -> 13;
            case 55 -> 47;
            case 56 -> 61;
            case 57 -> 21;
            case 58 -> 36;
            case 59 -> 37;
            case 60 -> 52;
            case 61 -> 34;
            case 62 -> 25;
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
        ak_0.l[n3] = new String(cArray);
        return n3;
    }

    public class_2338 a(Object[] objectArray) {
        return this.b;
    }

    private static Field a(Class clazz, String string, Class clazz2) {
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
            return MethodHandles.lookup().findStatic(ak_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(ak_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)J", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


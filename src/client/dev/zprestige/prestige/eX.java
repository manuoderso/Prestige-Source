/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1657
 *  net.minecraft.class_243
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.aR;
import dev.zprestige.prestige.bD;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.bt_0;
import dev.zprestige.prestige.dC;
import dev.zprestige.prestige.dF;
import dev.zprestige.prestige.dM;
import dev.zprestige.prestige.dO;
import dev.zprestige.prestige.dR;
import dev.zprestige.prestige.dV;
import dev.zprestige.prestige.hc;
import dev.zprestige.prestige.y_0;
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
import net.minecraft.class_1657;
import net.minecraft.class_243;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class eX
extends dV
implements dF {
    private dM d;
    private dO a;
    private dM c;
    private dO e;
    private dR f;
    private dM g;
    private dM h;
    private boolean i;
    private boolean j;
    private static final long k = hc.a(4677001439150108292L, 1860550778819003500L, MethodHandles.lookup().lookupClass()).a(54836460880418L);
    private static final String[] l;
    private static final String[] m;
    private static final Map n;
    private static final Object[] o;
    private static final String[] p;

    public eX() {
        long l = k ^ 0x1A2D776E1BFL;
        long l2 = l ^ 0x2F00FC7144E0L;
        this.i = 0;
        this.j = 0;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = this::lambda$new$0;
        eX.c("\u00cc", (Object)this.g, (Object)objectArray, (long)-3147075118870761755L, (long)l);
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = this::lambda$new$1;
        eX.c("\u00cc", (Object)this.h, (Object)objectArray2, (long)-3147075118870761755L, (long)l);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        o = new Object[118];
        p = new String[118];
        eX.f();
        n = new HashMap(13);
        long l = k ^ 0x5A1D3CF73EB1L;
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
        String[] stringArray = new String[3];
        int n = 0;
        String string = "A\u00e0\u001e\u00d0\b\u00a4>VI\u00ee\u00bf\u00a7\u00dc\u00f3\u009fc|5'h\u00f2\u00fd\u0098\"jcu\u009b8\u0002\u00f4Z\u0010j\u0097D)\u00a9\n7\u00af\u0000Y\u00eb\u00dc\u0011\u0017\u00d1\u00fe \u00acg\\\u00ed\u00ad\u00ffA$Z\u009a\u0085\u00db\u000b{0\u00dc`\u00d6\u00b3\u00b0:\u00d6\u00da\u00ae|8\u00d1TK\u00cb\u000e\u00fe";
        int n2 = "A\u00e0\u001e\u00d0\b\u00a4>VI\u00ee\u00bf\u00a7\u00dc\u00f3\u009fc|5'h\u00f2\u00fd\u0098\"jcu\u009b8\u0002\u00f4Z\u0010j\u0097D)\u00a9\n7\u00af\u0000Y\u00eb\u00dc\u0011\u0017\u00d1\u00fe \u00acg\\\u00ed\u00ad\u00ffA$Z\u009a\u0085\u00db\u000b{0\u00dc`\u00d6\u00b3\u00b0:\u00d6\u00da\u00ae|8\u00d1TK\u00cb\u000e\u00fe".length();
        int n3 = 32;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = eX.b(byArray3).intern();
            if ((n4 += n3) >= n2) {
                eX.l = stringArray;
                m = new String[3];
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    @Override
    public void e(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x7FAB131DDD11L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = this;
        eX.c("\u00cc", (Object)eX.c("\u00ed", (long)3998646789597194349L, (long)l), (Object)objectArray2, (long)3998396056044823203L, (long)l);
    }

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6745;
        if (m[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])eX.n.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    eX.n.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/eX", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = eX.l[n2].getBytes("ISO-8859-1");
            eX.m[n2] = eX.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return m[n2];
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/eX" + " : " + string + " : " + methodType.toString(), exception);
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

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = eX.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/eX" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = eX.m(l, l2);
            object = o[n];
            try {
                if (!(object instanceof String)) break block2;
                eX.o[n] = clazz = Class.forName(p[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = eX.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = eX.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = eX.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = eX.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = o;
        o[0] = "B\u0003\u007f\u0013N*T\u0003zI]=CHyOQ)R\u000fnX\u001a9J\u000flS@tv\u0014lN@3A\u0003";
        objectArray[1] = ".g\u0006Y(G8g\u0003\u0003;P/,\u0000\u00057D>k\u0017\u0012|S\u000e";
        objectArray[2] = "*]B$O\u000b_}I+^D>sB Z\u001eJ";
        objectArray[3] = Void.TYPE;
        eX.p[3] = "java/lang/Void";
        objectArray[4] = "u\u0011Qb?\u001au\u0011F>3\u0015oZF 3\u0000h+\u0012xd";
        objectArray[5] = "J\u000b4>`\u001fJ\u000b#bl\u0010P@#|l\u0005W1q\"4A";
        objectArray[6] = Float.TYPE;
        eX.p[6] = "java/lang/Float";
        objectArray[7] = ",\u000fJ,hS:\u000fOv{D-DLpwP<\u0003[g<B\u0000";
        objectArray[8] = "\u001c\u0011qH\u001d\u0010i1zG\f_\u0014)i@\u0005\u0016|";
        objectArray[9] = "\u0002JmAh=\u0002Jz\u001dd2\u0018\u0001z\u0003d'\u001fp*^5";
        objectArray[10] = "}@Hx`\u0006\b`CwqIinH|u\u0013\u001d";
        objectArray[11] = "u\u0013VG\u0019\u001bc\u0013S\u001d\n\ftXP\u001b\u0006\u0018e\u001fG\fM\nC";
        objectArray[12] = "\u0010Bh\u001d^Eebc\u0012O\n\u0004lh\u0019KPp";
        objectArray[13] = "xp!7\u0010|np$m\u0003ky;'k\u000f\u007fh|0|DiD";
        objectArray[14] = "x8bA6\ts7s\u000eU\u0004f:|e`\u0006w)`Iw\u000b";
        objectArray[15] = "%,\u001frn6P\f\u0014}\u007fy1\u0002\u001fv{#E";
        objectArray[16] = "0[\u007f\u0007$|;TnHH\u007f5Vl\u0007d";
        objectArray[17] = Boolean.TYPE;
        eX.p[17] = "java/lang/Boolean";
        objectArray[18] = "\u001820$L\u0013\u000e25~_\u0004\u0019y6xS\u0010\b>!o\u0018\u0002\u0015";
        objectArray[19] = "\u0016@g\rxq\u001dOvB\u0019\u007f\u0016Dr\u0018";
        objectArray[20] = ".\u001d}\u000b:f[=v\u0004+):3}\u000f/sN";
        objectArray[21] = "C&\u0019;\u001b\bU&\u001ca\b\u001fBm\u001fg\u0004\u000bS*\bpO\u001cl";
        objectArray[22] = "5J\b]rf>E\u0019\u0012\u001af0J\n";
        objectArray[23] = "'1\u0015v\u007f\u0013'1\u0002*s\u001c=z\u00024s\t:\u000bSk*";
        objectArray[24] = Double.TYPE;
        eX.p[24] = "java/lang/Double";
        objectArray[25] = "\u001a!ks\u007fh\u0011.z<\u0002p\u0002)su";
        objectArray[26] = "KOUK7+>o^D&d_aUO\">+";
        objectArray[27] = "\u007f\u0001j(\u001c6\u007f\u0001}t\u00109eJ}j\u0010,b;(5I";
        objectArray[28] = "B \r*\b{\\(\u0017ejg[5";
        objectArray[29] = "BIk`yzBI|<uuX\u0002|\"u`_s.x!$";
        objectArray[30] = "H\u0017+\u000eivV\u001f1A\u000ewG\u0004<\u001b(q";
        objectArray[31] = "|<*\f\u0002~a)r.Csy/";
        objectArray[32] = "@\u0013\u007fK[\u0001V\u0013z\u0011H\u0016AXy\u0017D\u0002P\u001fn\u0000\u000f\u0015e";
        objectArray[33] = "2#L\u000f\\3G\u0003G\u0000M|&\rL\u000bI&R";
        objectArray[34] = "(nl49?>nin*()%jh&<8b}\u007fm)}";
        objectArray[35] = "wm@z\u0017R\u0002MKu\u0006\u001dcC@~\u0002G\u0017";
        objectArray[36] = "mW;8\"\u001a\u0018w073Uyy;<7\u000f\r";
        objectArray[37] = "5xN<,\u00145xY` \u001b/3Y~ \u000e(B\b&r";
        objectArray[38] = "9\u007fcp:E'wy?[@'wz\u007fu\\";
        objectArray[39] = "\r<\u0010u\u0012\u0010\r<\u0007)\u001e\u001f\u0017w\u00077\u001e\n\u0010\u0006VhF";
        objectArray[40] = "\u001ch\u007fe\u001e\u001biHtj\u000fT\bF\u007fa\u000b\u000e|";
        objectArray[41] = "\u000e\bdQ}\u0003\u000e\bs\rq\f\u0014Cs\u0013q\u0019\u00132\"L)N\u0003\u0001q\fc5RY ";
        objectArray[42] = "\u0019\r\u0011\u00033<\u000f\r\u0014Y +\u0018F\u0017_,?\t\u0001\u0000Hg.9";
        objectArray[43] = "\u0010iIlWheIBcF'\u0004GIhB}p";
        objectArray[44] = ",*i&;UY\nb)*\u001a8\u0004i\".@L";
        objectArray[45] = "\u0012P2|m\u0001\u0004P7&~\u0016\u0013\u001b4 r\u0002\u0002\\#79\b";
        objectArray[46] = "?\u0007^+i<)\u0007[qz+>LXwv?/\u000bO`=(\u0016";
        objectArray[47] = "\u000b$U+i*~\u0004^$xe\u001f\nU/|?k";
        objectArray[48] = "\u0013#\u0014\u001dx<\u0005#\u0011Gk+\u0012h\u0012Ag?\u0003/\u0005V,(0";
        objectArray[49] = "Dma$\t]1Mj+\u0018\u0012PCa \u001cH$";
        objectArray[50] = "j&Vi\"||&S31kkmP5=\u007fz*G\"vhM";
        objectArray[51] = "2fF\u00143%GFM\u001b\"j&HF\u0010&0R";
        objectArray[52] = "Ro%Zu4Ro2\u0006y;H$2\u0018y.OUbA+o";
        objectArray[53] = ")|2N\u0000k?|7\u0014\u0013|(74\u0012\u001fh9p#\u0005Tx\"";
        objectArray[54] = "\u0003+\fPiYv\u000b\u0007_x\u0016\u0017\u0005\fT|Lc";
        objectArray[55] = "2\u00009H\u0018\u0002G 2G\tM&.9L\r\u0017R";
        objectArray[56] = "*\u0006\u0016qyd*\u0006\u0001-uk0M\u00013u~7<Sh-4";
        objectArray[57] = "#&DeQ:#&S9]59mS'] >\u001c\u0001|\u0005a";
        objectArray[58] = "z\u0001Ca\n|z\u0001T=\u0006s`JT#\u0006fg;\u0006wW'";
        objectArray[59] = "rT\u000fX:OxL\u0006]\u0006\u001f\u0002\rLZ{\u0018bD\u0004SzI\u0002E\rAvJlVH\b8s";
        objectArray[60] = "<\u0007i[[r>\u0014t\u0006;}c\bm\u000el*=_5b\u0000*`\u0014c\u000eD)n[";
        objectArray[61] = "zSu.}q Gk|\u001dxK\u000e!#`z+Gi*a+K]iqv!5Fy-{\u0011";
        objectArray[62] = ";2yz~g>\"q?\u0015h\u0007v; hjg?s)i;\u0007u>.(jd~c,)\u0001";
        objectArray[63] = "7o\u0012\u001c\u0002f$y\u0018E\u007fh9y\nD\u0013Zj<S\u001e\u007fg&5\u0001\u0013\u0001|6i\f#";
        objectArray[64] = "\u0018.7hP\u0001\\-9':\bNk5~V:\u001d/h&:VS/npB\u0016\u0018{j\u0019P\u001f\u0013|egK\u000fOqU";
        objectArray[65] = "L: 8@\u0018\u0018=19;DA{\u0006?KX(j2bP\u0014Vq\">]$";
        objectArray[66] = "c\u0017H5sg`\u0014YQm\u001cm\u0013\\:}-c\u0000O>";
        objectArray[67] = ">z8\u000ea)5>:\u0010\u0005*0,$\u001dR}j{yqey>'$\u001bb  /";
        objectArray[68] = "\u0002[\u007f\u0001\"\u000e\u0015E=\u0007@\t\u001bHg\u000f\u0017^A\u0018:c Z\u0015Cg\t'\u0003\u000bK";
        objectArray[69] = "F$\u0014uzyU2\u001e,\u0007wH2\f-kE\u001bvWr\u0007+\u001e.\u00078htF<R6\u0007";
        objectArray[70] = "q$N+QX%\"\u0012-Ad&y\u001c%Q3x\"L|=]sd\u0000qB\u0016*&\u0013>";
        objectArray[71] = "\u0000-\u0004<Y%\u0004+\u0016od6?s\\2\u00194_:\u0014;\u0018e?q\u0016h_6G1]<[_";
        objectArray[72] = "y:\u0013N^\u0019#.\r\u001c>\u0010H7\u0017KGEu!\u0018@\u0004y!4\u0017X\u0002D7;\u001c\u001b>";
        objectArray[73] = "Z\ta@v'\u0003^'R3\u001f\u0006\\&\\ks4\bg\u00071'cQgSj{\tV>Mb\u001f\u0003\f5Zhu\u0004U+R\f\u007f^^<Xfx\u0007@4<l\"\fW>Vk{\u0012_Z";
        objectArray[74] = "h\u0015\u001f`X\u00129\r\u0004y5Ce\b\u0005k\\O\\\u0006\u0005{X)h\u001dQm\u0005Ws\r\r`5";
        objectArray[75] = "1=evWyk)%%%\u001f\u0018\u0017\u001e|C>;)\"&W~h";
        objectArray[76] = "\u007f\b1\f|\ftL3\u0012\u0018\u000fq^-\u001fOX+\trsx\\\u007fU-\u0019\u007f\u0005a]";
        objectArray[77] = "\rna\u001a.\rY%w\u0006S\u001bc;c^0\t\f0w\u0007or";
        objectArray[78] = "8gFFif3#DX\re61ZUZ2lf\u00029m68:ZSjo&2";
        objectArray[79] = "Ze`\u0018_9I )Vf>+'#\n\u001b<Knk\u0003\u001am+tkX\rgUo{\u0004\u0000W";
        objectArray[80] = "r\u0012\u0016<ua\"@\u0002h\u0011bk\u0005\u00051j\u000f~\u001dW6j`u\t\u000ei\u0011e`H\u0007eo~p\u0014\nU";
        objectArray[81] = "\\HX:W\u0013\u0003\u0010JoY|\u0000\u001eD1B\u00102H\u0001l\u001a@eJ\u0003-TL\u001a\u0001ZoG\u0003e\u0019JaNL\u001b\u0002Z=C|";
        objectArray[82] = "u\u0001\b\u001a \t1\u0002\u0006UJ\u0000#D\n\f&2s\u0007QZJ^>\u0000Q\u00022\u001euTUkvZ>\tVQ'\u0000*Ej";
        objectArray[83] = "4}a?]d?9c!9g:+},n0`|$@Y44 }*^m*(";
        objectArray[84] = "I}>*\u0012L\r~0exE\u001f8<<\u0014wI\u007fadA \n: 9\u001aI\u001d$b?x";
        objectArray[85] = "\u00168cy\u001bA\u0013(k<pM*xj%N]\u0016*x/\u000f'";
        objectArray[86] = "5k`{&Q>/beBY7,xc.kka\"\u0004:B&2zm-\\d4\u0018|<@82qk\"\u0002>Pah&S nsi9FZ";
        objectArray[87] = "\u001c]TjiX\u000e\\K\u007f\u0013\u0007\u001e|U}o\u0017e[B5xV\u001b@Riuf";
        objectArray[88] = "N3\\\u000eG\u0000L AS'\u000f\u0011<X[pXOo\u00017]\u0003\u001bm\\JDX\u00103";
        objectArray[89] = "duocBbo1m}&aj#spq60t-\u001cF2d(svAkz ";
        objectArray[90] = "C'^\u001elcLpBK\u0002kL2[@nY\u0018~\u0007\u001a<\u000eBt_Jmu\u0018~EN\u0002";
        objectArray[91] = "r6\u00150c\u0007v6U5\u0000\u0014h%\t7WC2sV[{\u0004q#\u000e&\u007f\u00041&";
        objectArray[92] = "\u0007%\u001d\u0004Zm\u00143\u0017]'c\t3\u0005\\KQY\u007f_\n'i_7\u001a_Jb\u001b5\u0004;";
        objectArray[93] = "Es\u001d\u0019\u001cnG`\u0000D|a\u001a|\u0019L+6E!B \u001ef\u001e(\u0013M\u00111\u0002}";
        objectArray[94] = "'h]pa$l=\u0001*^/\u001enWw#-~'\u001f~\"|\u001e&\u0016l.\u007fp5S%`F";
        objectArray[95] = "lU\u0015B\u001cIg\u0011\u0017\\xJb\u0003\tQ/\u001d8TU=\u0018\u0019l\b\tW\u001f@r\u0000";
        objectArray[96] = "\r\u000e\u0012>DdF[Nd{h4\b\u00189\u0006mTAP0\u0007<4\u000b\u001d7FmW\u0000@5G\u0006";
        objectArray[97] = ">\u00066CyL~MbG\u0010Y|\u000bg\u001ck4i\u00135\u001bk[b\u0007lD\u0010^wFeHnEg\u001ahx";
        objectArray[98] = "Cj6>fpXi:*\n%??g$w$_v/-vu?<b*7$\\7?(6O";
        objectArray[99] = "\u000b~)P\r\\Qji\u0003\u007f/5U\u001fx\u007f\u0004\tc<LC^\u001d#o";
        objectArray[100] = "c=\u0001+_Thy\u00035;\\az\u00193Wn5>@h;Y1i\u001f0Q^hw\u0017TT\u0002ty\u001d9_Fvgy";
        objectArray[101] = "T\u001e~P\u0018hP\u0018l\u0003%{k@&^Xy\u000b\tnWY(k\u0016'DZv\u0006\u001dcFD\u0012";
        objectArray[102] = "\u0018eA\u001c|:LbP\u001d\u0007`\u0011/]vkcG<Z\u0019`w\u001ec!";
        objectArray[103] = "F]P4%*GDS\u007fE'#\u0007\u0011-8#CNY$9r#\u0004\u0014#x#@\u000fI!yH";
        objectArray[104] = "\u001e^W8O8\t@\u0015>-?\u0007MO6zh]\u001d\u0013ZMl\tFO0J5\u0017N";
        objectArray[105] = "-*YY\u0002\u0004f\u007f\u0005\u0003=\u000b\u0014,S^@\rte\u001bWA\\\u0014/VP\u0000\rw$\u000bR\u0001f";
        objectArray[106] = "!G\n^}q%A\u0018\r@a\u001e\u0019RP=`~P\u001aY<1\u001e\u001aW^}`}\u0011\n\\|\u000b";
        objectArray[107] = "}Wo7o3d\fdi\u000f+jIdlc\u0019>\n;;3N\u007fKxim'hU:o\u000f";
        objectArray[108] = "2rDJP\u00021qU.Hyn5\u001eK\u0010\u001b%`B\u0011";
        objectArray[109] = "\u0005Q\u001aQ\u0016dQ\tW\u0014\f\u000fUiR\u0012\u0004rW\t\u001bZ\rs\u0006iQ\u0017\n2W\nZJ\b3<";
        objectArray[110] = "\u001f\u0014a\u000fP+\u0000\t&\u000b :yW'\b]8\u0019\u001eo\u0001\\iy\rw\u0012\u001f.\u0012\u001ea\u0018FS";
        objectArray[111] = "v~^=(\u000fxmM9YW\u001d;\u001a4$U}rR=%\u0004\u001dhRf2\u000ecsB:?>";
        objectArray[112] = "P\u000b\u001f $`\u0012\u0010^\"[i/[_x&kO\u0012\u0017q':/\u001d\f`a\u007fO_\u0017!c\u0000";
        objectArray[113] = "]h\u0013\u0006=o\u0007b\t\u0002RuB?\r\u0002.sDR\u0013Q2~EnGV#\u007f>";
        objectArray[114] = "m8\u001f5y%? \u000e8\u001f\"g'\u000e6A%g=\nJ#ssq[pr)g=g";
        objectArray[115] = "\u001fV\u000f\u001fo\u0007\u0006\r\u0004A\u000f\u001f\bH\u0004Dc-\\\u000b[\u00134z\u001eJ\u001cHl\u0007\u001aJ\\M\u000f";
        objectArray[116] = "\u0019\u0005Z\u0002v=\u001c\u0015RG\u001d2%A\u0018X`0E\bPQaa%\u0006\u001cBwaZI\u001f\u0001|[";
        Object[] objectArray2 = objectArray;
        objectArray[117] = "D/`\u007f?sS1\"y]t]<xq\n#\u0007l&\u001d='S7xw:~M?";
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00c2' || c == '\u00e8' || c == '\u00ed' || c == '\u00c4') {
                field = eX.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c2' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00e8' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00ed' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = eX.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00cc' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d2' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = eX.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    @Override
    public void d(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x52D6E774439DL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = this;
        eX.c("\u00cc", (Object)eX.c("\u00ed", (long)3250850793450402318L, (long)l), (Object)objectArray2, (long)3250487467017056756L, (long)l);
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private boolean a(Object[] objectArray) {
        Object object;
        block11: {
            block9: {
                CallSite callSite;
                long l;
                block10: {
                    class_1657 class_16572;
                    class_1657 class_16573;
                    block8: {
                        class_16573 = (class_1657)objectArray[0];
                        l = (Long)objectArray[1];
                        l = k ^ l;
                        callSite = eX.c("\u00d2", (long)4056107430110378977L, (long)l);
                        try {
                            class_16572 = class_16573;
                            if (callSite != null) break block8;
                            if (class_16572 == null) break block9;
                        }
                        catch (MatchException matchException) {
                            throw eX.c("\u00d2", (Object)matchException, (long)4057021866434762915L, (long)l);
                        }
                        class_16572 = class_16573;
                    }
                    try {
                        try {
                            object = eX.c("\u00cc", (Object)class_16572, (long)4057921137788366183L, (long)l);
                            if (callSite != null) break block10;
                            if (object == false) break block9;
                        }
                        catch (MatchException matchException) {
                            throw eX.c("\u00d2", (Object)matchException, (long)4057021866434762915L, (long)l);
                        }
                        object = eX.c("\u00cc", (Object)eX.c("\u00cc", (Object)class_16573, (long)4057228677604994410L, (long)l), (Object)eX.c("\u00ed", (long)4057424604793523137L, (long)l), (long)4056394510695487227L, (long)l);
                    }
                    catch (MatchException matchException) {
                        throw eX.c("\u00d2", (Object)matchException, (long)4057021866434762915L, (long)l);
                    }
                }
                try {
                    if (callSite != null) break block11;
                    if (object == false) break block9;
                }
                catch (MatchException matchException) {
                    throw eX.c("\u00d2", (Object)matchException, (long)4057021866434762915L, (long)l);
                }
                object = 1;
                break block11;
            }
            object = false;
        }
        return (boolean)object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public dC a(Object[] var1_1) {
        block59: {
            block60: {
                block57: {
                    block58: {
                        block56: {
                            block54: {
                                block55: {
                                    block52: {
                                        block53: {
                                            block51: {
                                                block49: {
                                                    block47: {
                                                        block48: {
                                                            var2_2 = (Long)var1_1[0];
                                                            v0 = var2_2;
                                                            var4_3 = v0 ^ 7477342050734L;
                                                            var6_4 = v0 ^ 91260814807711L;
                                                            var8_5 = v0 ^ 116550396994070L;
                                                            var10_6 = v0 ^ 101816702374277L;
                                                            var12_7 = v0 ^ 71343916077473L;
                                                            var14_8 = eX.c("\u00d2", (long)-1176505997696898041L, (long)var2_2);
                                                            try {
                                                                try {
                                                                    v1 /* !! */  = eX.c("\u00cc", (String)eX.c("\u00cc", (Object)this.f, (long)-1177124592215823982L, (long)var2_2), (Object)eX.b("c", (int)9543, (long)(637152528759434683L ^ var2_2)), (long)-1176207187660502004L, (long)var2_2);
                                                                    if (var14_8 != null) break block47;
                                                                    if (v1 /* !! */  != false) break block48;
                                                                }
                                                                catch (MatchException v2) {
                                                                    throw eX.c("\u00d2", (Object)v2, (long)-1176730515698102459L, (long)var2_2);
                                                                }
                                                                return null;
                                                            }
                                                            catch (MatchException v3) {
                                                                throw eX.c("\u00d2", (Object)v3, (long)-1176730515698102459L, (long)var2_2);
                                                            }
                                                        }
                                                        v1 /* !! */  = (CallSite)this.i;
                                                    }
                                                    try {
                                                        if (v1 /* !! */  == false) {
                                                            return null;
                                                        }
                                                    }
                                                    catch (MatchException v4) {
                                                        throw eX.c("\u00d2", (Object)v4, (long)-1176730515698102459L, (long)var2_2);
                                                    }
                                                    var15_9 = eX.c("\u00c2", (Object)eX.b, (long)-1175597986102997182L, (long)var2_2);
                                                    try {
                                                        block50: {
                                                            try {
                                                                try {
                                                                    if (var14_8 != null) break block49;
                                                                    if (var15_9 == null) break block50;
                                                                }
                                                                catch (MatchException v5) {
                                                                    throw eX.c("\u00d2", (Object)v5, (long)-1176730515698102459L, (long)var2_2);
                                                                }
                                                                if (eX.c("\u00cc", (Object)var15_9, (long)-1178390356237768891L, (long)var2_2) == eX.c("\u00ed", (long)-1175545508382659891L, (long)var2_2)) break block51;
                                                            }
                                                            catch (MatchException v6) {
                                                                throw eX.c("\u00d2", (Object)v6, (long)-1176730515698102459L, (long)var2_2);
                                                            }
                                                        }
                                                        this.i = 0;
                                                    }
                                                    catch (MatchException v7) {
                                                        throw eX.c("\u00d2", (Object)v7, (long)-1176730515698102459L, (long)var2_2);
                                                    }
                                                }
                                                return null;
                                            }
                                            v8 = new Object[1];
                                            v8[0] = var12_7;
                                            var16_10 = eX.c("\u00d2", (Object)v8, (long)-1179133464584898723L, (long)var2_2);
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            if (var14_8 != null) break block52;
                                                            if (var16_10 != null) {
                                                            }
                                                            ** GOTO lbl100
                                                        }
                                                        catch (MatchException v9) {
                                                            throw eX.c("\u00d2", (Object)v9, (long)-1176730515698102459L, (long)var2_2);
                                                        }
                                                        cfr_temp_0 = eX.c("\u00cc", (Object)eX.c("\u00c2", (Object)eX.b, (long)-1173624643435738614L, (long)var2_2), (Object)var16_10, (long)-1176066491938288311L, (long)var2_2) - 3.0f;
                                                        v10 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 > 0 ? 1 : -1);
                                                        if (var14_8 != null) break block53;
                                                    }
                                                    catch (MatchException v11) {
                                                        throw eX.c("\u00d2", (Object)v11, (long)-1176730515698102459L, (long)var2_2);
                                                    }
                                                    if (v10 <= 0) {
                                                    }
                                                    ** GOTO lbl100
                                                }
                                                catch (MatchException v12) {
                                                    throw eX.c("\u00d2", (Object)v12, (long)-1176730515698102459L, (long)var2_2);
                                                }
                                                v10 = eX.c("\u00cc", (Object)((Boolean)eX.c("\u00cc", (Object)this.g, (long)-1177124592215823982L, (long)var2_2)), (long)-1176584153157460225L, (long)var2_2);
                                            }
                                            catch (MatchException v13) {
                                                throw eX.c("\u00d2", (Object)v13, (long)-1176730515698102459L, (long)var2_2);
                                            }
                                        }
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        if (var14_8 != null) break block54;
                                                        if (v10 != false) break block55;
                                                    }
                                                    catch (MatchException v14) {
                                                        throw eX.c("\u00d2", (Object)v14, (long)-1176730515698102459L, (long)var2_2);
                                                    }
                                                    v10 = eX.c("\u00cc", (Object)eX.c("\u00c2", (Object)eX.b, (long)-1173624643435738614L, (long)var2_2), (Object)var16_10, (long)-1177288462230483506L, (long)var2_2);
                                                    if (var14_8 != null) break block54;
                                                }
                                                catch (MatchException v15) {
                                                    throw eX.c("\u00d2", (Object)v15, (long)-1176730515698102459L, (long)var2_2);
                                                }
                                                if (v10 != false) break block55;
                                            }
                                            catch (MatchException v16) {
                                                throw eX.c("\u00d2", (Object)v16, (long)-1176730515698102459L, (long)var2_2);
                                            }
lbl100:
                                            // 3 sources

                                            this.i = 0;
                                        }
                                        catch (MatchException v17) {
                                            throw eX.c("\u00d2", (Object)v17, (long)-1176730515698102459L, (long)var2_2);
                                        }
                                    }
                                    return null;
                                }
                                v10 = eX.c("\u00cc", (Object)((Boolean)eX.c("\u00cc", (Object)this.h, (long)-1177124592215823982L, (long)var2_2)), (long)-1176584153157460225L, (long)var2_2);
                            }
                            try {
                                try {
                                    try {
                                        if (var14_8 != null) break block56;
                                        if (v10 == false) break block57;
                                    }
                                    catch (MatchException v18) {
                                        throw eX.c("\u00d2", (Object)v18, (long)-1176730515698102459L, (long)var2_2);
                                    }
                                    v19 = this;
                                    if (var14_8 != null) break block58;
                                }
                                catch (MatchException v20) {
                                    throw eX.c("\u00d2", (Object)v20, (long)-1176730515698102459L, (long)var2_2);
                                }
                                v21 = new Object[2];
                                v21[1] = var8_5;
                                v21[0] = var16_10;
                                v10 = eX.c("\u00cc", (Object)v19, (Object)v21, (long)-1173682797809917148L, (long)var2_2);
                            }
                            catch (MatchException v22) {
                                throw eX.c("\u00d2", (Object)v22, (long)-1176730515698102459L, (long)var2_2);
                            }
                        }
                        if (v10 == false) break block57;
                        v19 = this;
                    }
                    v19.i = 0;
                    return null;
                }
                var17_11 = eX.c("\u00cc", (Object)eX.c("\u00cc", (Object)var16_10, (long)-1175894093972693381L, (long)var2_2), (double)((double)eX.c("\u00cc", (Object)((Float)eX.c("\u00cc", (Object)this.a, (long)-1177124592215823982L, (long)var2_2)), (long)-1178273990605065776L, (long)var2_2) / 5.0), (long)-1179829505345058063L, (long)var2_2);
                var18_12 = eX.c("\u00cc", (Object)var15_9, (long)-1178949938466412695L, (long)var2_2);
                var19_13 = new class_243((double)eX.c("\u00d2", (double)eX.c("\u00c2", (Object)var18_12, (long)-1178780040889591009L, (long)var2_2), (double)eX.c("\u00c2", (Object)var17_11, (long)-1177046453691435850L, (long)var2_2), (double)eX.c("\u00c2", (Object)var17_11, (long)-1175836196101779071L, (long)var2_2), (long)-1176815752459671779L, (long)var2_2), (double)eX.c("\u00d2", (double)eX.c("\u00c2", (Object)var18_12, (long)-1177555685039417567L, (long)var2_2), (double)eX.c("\u00c2", (Object)var17_11, (long)-1175650926080756046L, (long)var2_2), (double)eX.c("\u00c2", (Object)var17_11, (long)-1176077482428638194L, (long)var2_2), (long)-1176815752459671779L, (long)var2_2), (double)eX.c("\u00d2", (double)eX.c("\u00c2", (Object)var18_12, (long)-1178962164417234330L, (long)var2_2), (double)eX.c("\u00c2", (Object)var17_11, (long)-1177268659203492023L, (long)var2_2), (double)eX.c("\u00c2", (Object)var17_11, (long)-1176881171455252299L, (long)var2_2), (long)-1176815752459671779L, (long)var2_2));
                v23 = new Object[2];
                v23[1] = var10_6;
                v23[0] = var19_13;
                var20_14 = eX.c("\u00cc", (Object)eX.c("\u00ed", (long)-1179269947435405135L, (long)var2_2), (Object)v23, (long)-1175730509289471382L, (long)var2_2);
                v24 = new Object[3];
                v24[2] = var4_3;
                v24[1] = var19_13;
                v24[0] = var20_14;
                var20_14 = eX.c("\u00d2", (Object)v24, (long)-1173302885124808002L, (long)var2_2);
                try {
                    try {
                        v25 = var20_14;
                        if (var14_8 != null) break block59;
                        if (eX.c("\u00cc", (Object)v25, (Object)new Object[0], (long)-1176937237693274946L, (long)var2_2) == false) break block60;
                    }
                    catch (MatchException v26) {
                        throw eX.c("\u00d2", (Object)v26, (long)-1176730515698102459L, (long)var2_2);
                    }
                    return var20_14;
                }
                catch (MatchException v27) {
                    throw eX.c("\u00d2", (Object)v27, (long)-1176730515698102459L, (long)var2_2);
                }
            }
            this.i = 0;
            this.j = 1;
            v28 = new Object[2];
            v28[1] = var6_4;
            v28[0] = var16_10;
            eX.c("\u00d2", (Object)v28, (long)-1179351373669017410L, (long)var2_2);
            this.j = 0;
            v25 = var20_14;
        }
        return v25;
    }

    @bP
    public void a(bt_0 bt_02) {
        double d;
        long l;
        long l2 = l = k ^ 0x4CF9E1A93C74L;
        long l3 = l2 ^ 0x11B805917DBBL;
        long l4 = l2 ^ 0x4CF715BD740AL;
        long l5 = l2 ^ 0x2FA006B6B79CL;
        CallSite callSite = eX.c("\u00d2", (long)689430367653333562L, (long)l);
        try {
            if (eX.c("\u00cc", (Object)((Boolean)((Object)eX.c("\u00cc", (Object)this.c, (long)691139989075496879L, (long)l))), (long)690882191210772674L, (long)l) == false) {
                return;
            }
        }
        catch (MatchException matchException) {
            throw eX.c("\u00d2", (Object)matchException, (long)690746840957790584L, (long)l);
        }
        Object[] objectArray = new Object[1];
        objectArray[0] = l5;
        CallSite callSite2 = eX.c("\u00d2", (Object)objectArray, (long)693430232938762592L, (long)l);
        CallSite callSite3 = eX.c("\u00cc", (Object)((Float)((Object)eX.c("\u00cc", (Object)this.e, (long)691139989075496879L, (long)l))), (long)691444720573339629L, (long)l);
        CallSite callSite4 = eX.c("\u00cc", (String)((Object)eX.c("\u00cc", (Object)this.f, (long)691139989075496879L, (long)l)), (Object)eX.b("c", (int)30065, (long)(0x28BBABA1E9849BB2L ^ l)), (long)689097508324698673L, (long)l);
        try {
            d = callSite4 != false ? (double)eX.c("\u00cc", (Object)((Float)((Object)eX.c("\u00cc", (Object)this.a, (long)691139989075496879L, (long)l))), (long)691444720573339629L, (long)l) / 5.0 : 0.0;
        }
        catch (MatchException matchException) {
            throw eX.c("\u00d2", (Object)matchException, (long)690746840957790584L, (long)l);
        }
        double d10 = d;
        CallSite callSite5 = eX.c("\u00cc", (Object)eX.c("\u00cc", (Object)eX.c("\u00c2", (Object)b, (long)689979775890034079L, (long)l), (long)689780605442304313L, (long)l), (long)691388989343792820L, (long)l);
        while (eX.c("\u00cc", (Object)callSite5, (long)690271900364962269L, (long)l) != false) {
            CallSite callSite6;
            CallSite callSite7;
            block28: {
                block27: {
                    CallSite callSite8;
                    class_1657 class_16572;
                    block26: {
                        CallSite callSite9;
                        CallSite callSite10;
                        reference var18_13;
                        block24: {
                            block25: {
                                block22: {
                                    block23: {
                                        class_16572 = (class_1657)eX.c("\u00cc", (Object)callSite5, (long)692898432935674005L, (long)l);
                                        var18_13 = eX.c("\u00cc", (Object)eX.c("\u00c2", (Object)b, (long)687676189542624311L, (long)l), (Object)class_16572, (long)689238221425978228L, (long)l);
                                        try {
                                            try {
                                                callSite10 = var18_13 == callSite3 ? 0 : (var18_13 > callSite3 ? 1 : -1);
                                                if (callSite != null) break block22;
                                                if (callSite10 <= 0) break block23;
                                            }
                                            catch (MatchException matchException) {
                                                throw eX.c("\u00d2", (Object)matchException, (long)690746840957790584L, (long)l);
                                            }
                                            if (callSite == null) continue;
                                        }
                                        catch (MatchException matchException) {
                                            throw eX.c("\u00d2", (Object)matchException, (long)690746840957790584L, (long)l);
                                        }
                                    }
                                    Object[] objectArray2 = new Object[2];
                                    objectArray2[1] = l3;
                                    objectArray2[0] = class_16572;
                                    callSite10 = eX.c("\u00cc", (Object)eX.c("\u00ed", (long)690348952695376657L, (long)l), (Object)objectArray2, (long)693512861443985270L, (long)l);
                                }
                                try {
                                    try {
                                        if (callSite != null) break block24;
                                        if (callSite10 != false) break block25;
                                    }
                                    catch (MatchException matchException) {
                                        throw eX.c("\u00d2", (Object)matchException, (long)690746840957790584L, (long)l);
                                    }
                                    if (callSite == null) continue;
                                }
                                catch (MatchException matchException) {
                                    throw eX.c("\u00d2", (Object)matchException, (long)690746840957790584L, (long)l);
                                }
                            }
                            callSite10 = callSite4;
                        }
                        try {
                            callSite9 = callSite10 != false ? eX.c("\u00cc", (Object)eX.c("\u00cc", (Object)class_16572, (long)689910347157993542L, (long)l), (double)d10, (long)692718798940335308L, (long)l) : eX.c("\u00cc", (Object)class_16572, (long)689910347157993542L, (long)l);
                        }
                        catch (MatchException matchException) {
                            throw eX.c("\u00d2", (Object)matchException, (long)690746840957790584L, (long)l);
                        }
                        callSite7 = callSite9;
                        try {
                            reference cfr_temp_0 = var18_13 - 3.0f;
                            callSite8 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                            if (callSite != null) break block26;
                            if (callSite8 > 0) break block27;
                        }
                        catch (MatchException matchException) {
                            throw eX.c("\u00d2", (Object)matchException, (long)690746840957790584L, (long)l);
                        }
                        callSite8 = callSite4;
                    }
                    try {
                        try {
                            if (callSite8 == false || callSite2 != class_16572) break block27;
                        }
                        catch (MatchException matchException) {
                            throw eX.c("\u00d2", (Object)matchException, (long)690746840957790584L, (long)l);
                        }
                        callSite6 = eX.c("\u00ed", (long)692696176717215086L, (long)l);
                        break block28;
                    }
                    catch (MatchException matchException) {
                        throw eX.c("\u00d2", (Object)matchException, (long)690746840957790584L, (long)l);
                    }
                }
                callSite6 = eX.c("\u00ed", (long)690999932060115317L, (long)l);
            }
            CallSite callSite11 = callSite6;
            Object[] objectArray3 = new Object[10];
            objectArray3[9] = l4;
            objectArray3[8] = callSite11;
            objectArray3[7] = Float.valueOf((float)eX.c("\u00c2", (Object)callSite7, (long)691178900673302152L, (long)l));
            objectArray3[6] = Float.valueOf((float)eX.c("\u00c2", (Object)callSite7, (long)689284396958726707L, (long)l));
            objectArray3[5] = Float.valueOf((float)eX.c("\u00c2", (Object)callSite7, (long)690168356480645052L, (long)l));
            objectArray3[4] = Float.valueOf((float)eX.c("\u00c2", (Object)callSite7, (long)690439595162685812L, (long)l));
            objectArray3[3] = Float.valueOf((float)eX.c("\u00c2", (Object)callSite7, (long)689702706698784911L, (long)l));
            objectArray3[2] = Float.valueOf((float)eX.c("\u00c2", (Object)callSite7, (long)691062022919836299L, (long)l));
            objectArray3[1] = bt_02.a;
            objectArray3[0] = bt_02.b;
            eX.c("\u00d2", (Object)objectArray3, (long)692923585537635180L, (long)l);
            if (callSite == null) continue;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @bP
    public void a(bD bD2) {
        long l;
        block45: {
            CallSite callSite;
            CallSite callSite2;
            CallSite callSite3;
            block44: {
                CallSite callSite4;
                block43: {
                    long l2;
                    block41: {
                        block42: {
                            block40: {
                                CallSite callSite5;
                                long l3;
                                block39: {
                                    Object object;
                                    block37: {
                                        block38: {
                                            CallSite callSite6;
                                            block35: {
                                                block36: {
                                                    long l4 = l = k ^ 0x4E7EDE00B730L;
                                                    l2 = l4 ^ 0x7C4B4DB8F6FL;
                                                    l3 = l4 ^ 0x2D27391F3CD8L;
                                                    callSite3 = eX.c("\u00d2", (long)-9019201783533043330L, (long)l);
                                                    try {
                                                        try {
                                                            callSite6 = eX.c("\u00cc", (Object)bD2, (Object)new Object[0], (long)-9017042593732046178L, (long)l);
                                                            if (callSite3 != null) break block35;
                                                            if (callSite6 == y_0.PRE) break block36;
                                                            return;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw eX.c("\u00d2", (Object)matchException, (long)-9020142634040384964L, (long)l);
                                                        }
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw eX.c("\u00d2", (Object)matchException, (long)-9020142634040384964L, (long)l);
                                                    }
                                                }
                                                callSite6 = eX.c("\u00cc", (Object)this.f, (long)-9019743927619549973L, (long)l);
                                            }
                                            try {
                                                object = eX.c("\u00cc", (String)((Object)callSite6), (Object)eX.b("c", (int)9543, (long)(0x8D7F31D55ABC0C2L ^ l)), (long)-9019540107335212683L, (long)l);
                                                if (callSite3 != null) break block37;
                                                if (object != false) break block38;
                                                return;
                                            }
                                            catch (MatchException matchException) {
                                                throw eX.c("\u00d2", (Object)matchException, (long)-9020142634040384964L, (long)l);
                                            }
                                        }
                                        object = this.j;
                                    }
                                    try {
                                        if (object != false) {
                                            eX.c("\u00cc", (Object)bD2, (Object)new Object[]{true}, (long)-9018316771043880660L, (long)l);
                                            return;
                                        }
                                    }
                                    catch (MatchException matchException) {
                                        throw eX.c("\u00d2", (Object)matchException, (long)-9020142634040384964L, (long)l);
                                    }
                                    callSite2 = eX.c("\u00c2", (Object)b, (long)-9019018901619219909L, (long)l);
                                    try {
                                        callSite5 = callSite2;
                                        if (callSite3 != null) break block39;
                                        if (callSite5 == null) return;
                                    }
                                    catch (MatchException matchException) {
                                        throw eX.c("\u00d2", (Object)matchException, (long)-9020142634040384964L, (long)l);
                                    }
                                    callSite5 = callSite2;
                                }
                                try {
                                    if (eX.c("\u00cc", (Object)callSite5, (long)-9017075124747449796L, (long)l) != eX.c("\u00ed", (long)-9018754767239592012L, (long)l)) {
                                        return;
                                    }
                                }
                                catch (MatchException matchException) {
                                    throw eX.c("\u00d2", (Object)matchException, (long)-9020142634040384964L, (long)l);
                                }
                                Object[] objectArray = new Object[1];
                                objectArray[0] = l3;
                                callSite = eX.c("\u00d2", (Object)objectArray, (long)-9017458143671789020L, (long)l);
                                try {
                                    try {
                                        try {
                                            if (callSite == null) return;
                                            reference cfr_temp_0 = eX.c("\u00cc", (Object)eX.c("\u00c2", (Object)b, (long)-9020957036094478477L, (long)l), (Object)callSite, (long)-9019399412037836752L, (long)l) - 3.0f;
                                            callSite4 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 > 0 ? 1 : -1);
                                            if (callSite3 != null) break block40;
                                        }
                                        catch (MatchException matchException) {
                                            throw eX.c("\u00d2", (Object)matchException, (long)-9020142634040384964L, (long)l);
                                        }
                                        if (callSite4 > 0) return;
                                    }
                                    catch (MatchException matchException) {
                                        throw eX.c("\u00d2", (Object)matchException, (long)-9020142634040384964L, (long)l);
                                    }
                                    callSite4 = eX.c("\u00cc", (Object)((Boolean)((Object)eX.c("\u00cc", (Object)this.g, (long)-9019743927619549973L, (long)l))), (long)-9020002833647570042L, (long)l);
                                }
                                catch (MatchException matchException) {
                                    throw eX.c("\u00d2", (Object)matchException, (long)-9020142634040384964L, (long)l);
                                }
                            }
                            try {
                                try {
                                    try {
                                        if (callSite3 != null) break block41;
                                        if (callSite4 != false) break block42;
                                    }
                                    catch (MatchException matchException) {
                                        throw eX.c("\u00d2", (Object)matchException, (long)-9020142634040384964L, (long)l);
                                    }
                                    callSite4 = eX.c("\u00cc", (Object)eX.c("\u00c2", (Object)b, (long)-9020957036094478477L, (long)l), (Object)callSite, (long)-9020706043611619145L, (long)l);
                                    if (callSite3 != null) break block41;
                                }
                                catch (MatchException matchException) {
                                    throw eX.c("\u00d2", (Object)matchException, (long)-9020142634040384964L, (long)l);
                                }
                                if (callSite4 != false) break block42;
                                return;
                            }
                            catch (MatchException matchException) {
                                throw eX.c("\u00d2", (Object)matchException, (long)-9020142634040384964L, (long)l);
                            }
                        }
                        callSite4 = eX.c("\u00cc", (Object)((Boolean)((Object)eX.c("\u00cc", (Object)this.h, (long)-9019743927619549973L, (long)l))), (long)-9020002833647570042L, (long)l);
                    }
                    try {
                        try {
                            if (callSite3 != null) break block43;
                            if (callSite4 == false) break block44;
                        }
                        catch (MatchException matchException) {
                            throw eX.c("\u00d2", (Object)matchException, (long)-9020142634040384964L, (long)l);
                        }
                        Object[] objectArray = new Object[2];
                        objectArray[1] = l2;
                        objectArray[0] = callSite;
                        callSite4 = eX.c("\u00cc", (Object)this, (Object)objectArray, (long)-9020903075756061091L, (long)l);
                    }
                    catch (MatchException matchException) {
                        throw eX.c("\u00d2", (Object)matchException, (long)-9020142634040384964L, (long)l);
                    }
                }
                if (callSite4 != false) {
                    return;
                }
            }
            CallSite callSite7 = eX.c("\u00cc", (Object)eX.c("\u00cc", (Object)callSite, (long)-9018722922333834494L, (long)l), (double)((double)eX.c("\u00cc", (Object)((Float)((Object)eX.c("\u00cc", (Object)this.a, (long)-9019743927619549973L, (long)l))), (long)-9017187457136960343L, (long)l) / 5.0), (long)-9018165144106342520L, (long)l);
            try {
                try {
                    if (callSite3 != null) return;
                    if (eX.c("\u00cc", (Object)eX.c("\u00cc", (Object)callSite7, (Object)eX.c("\u00cc", (Object)eX.c("\u00c2", (Object)b, (long)-9020957036094478477L, (long)l), (long)-9019233924551031418L, (long)l), (Object)eX.c("\u00cc", (Object)callSite2, (long)-9017637456427300336L, (long)l), (long)-9019134507549989511L, (long)l), (long)-9019076648529471940L, (long)l) == false) break block45;
                    return;
                }
                catch (MatchException matchException) {
                    throw eX.c("\u00d2", (Object)matchException, (long)-9020142634040384964L, (long)l);
                }
            }
            catch (MatchException matchException) {
                throw eX.c("\u00d2", (Object)matchException, (long)-9020142634040384964L, (long)l);
            }
        }
        this.i = 1;
        eX.c("\u00cc", (Object)bD2, (Object)new Object[0], (long)-9020834797845261870L, (long)l);
    }

    @bP
    public void a(aR aR2) {
        CallSite callSite;
        long l;
        block23: {
            CallSite callSite2;
            block24: {
                CallSite callSite3;
                long l2;
                block21: {
                    block22: {
                        block19: {
                            block20: {
                                block17: {
                                    block18: {
                                        l = k ^ 0x2EC177D7D758L;
                                        l2 = l ^ 0x738093EF9697L;
                                        callSite3 = eX.c("\u00d2", (long)-2108463643167891178L, (long)l);
                                        try {
                                            callSite = eX.c("\u00cc", (String)((Object)eX.c("\u00cc", (Object)this.f, (long)-2109076538265213821L, (long)l)), (Object)eX.b("c", (int)30340, (long)(0x385154D38962F368L ^ l)), (long)-2108730600718204643L, (long)l);
                                            if (callSite3 != null) break block17;
                                            if (callSite != false) break block18;
                                        }
                                        catch (MatchException matchException) {
                                            throw eX.c("\u00d2", (Object)matchException, (long)-2109262772629028268L, (long)l);
                                        }
                                        return;
                                    }
                                    callSite = eX.c("\u00cc", (Object)eX.c("\u00cc", (Object)aR2, (Object)new Object[0], (long)-2109500815056049453L, (long)l), (Object)eX.c("\u00c2", (Object)b, (long)-2114580894603786469L, (long)l), (long)-2112135482229787400L, (long)l);
                                }
                                try {
                                    if (callSite3 != null) break block19;
                                    if (callSite == false) break block20;
                                }
                                catch (MatchException matchException) {
                                    throw eX.c("\u00d2", (Object)matchException, (long)-2109262772629028268L, (long)l);
                                }
                                return;
                            }
                            callSite = eX.c("\u00cc", (Object)((Boolean)((Object)eX.c("\u00cc", (Object)this.d, (long)-2109076538265213821L, (long)l))), (long)-2109123294384090130L, (long)l);
                        }
                        try {
                            try {
                                try {
                                    if (callSite3 != null) break block21;
                                    if (callSite == false) break block22;
                                }
                                catch (MatchException matchException) {
                                    throw eX.c("\u00d2", (Object)matchException, (long)-2109262772629028268L, (long)l);
                                }
                                callSite = (CallSite)(eX.c("\u00cc", (Object)aR2, (Object)new Object[0], (long)-2109500815056049453L, (long)l) instanceof class_1657);
                                if (callSite3 != null) break block21;
                            }
                            catch (MatchException matchException) {
                                throw eX.c("\u00d2", (Object)matchException, (long)-2109262772629028268L, (long)l);
                            }
                            if (callSite != false) break block22;
                        }
                        catch (MatchException matchException) {
                            throw eX.c("\u00d2", (Object)matchException, (long)-2109262772629028268L, (long)l);
                        }
                        return;
                    }
                    callSite = (CallSite)(eX.c("\u00cc", (Object)aR2, (Object)new Object[0], (long)-2109500815056049453L, (long)l) instanceof class_1657);
                }
                try {
                    try {
                        try {
                            if (callSite3 != null) break block23;
                            if (callSite == false) break block24;
                        }
                        catch (MatchException matchException) {
                            throw eX.c("\u00d2", (Object)matchException, (long)-2109262772629028268L, (long)l);
                        }
                        Object[] objectArray = new Object[2];
                        objectArray[1] = l2;
                        objectArray[0] = (class_1657)eX.c("\u00cc", (Object)aR2, (Object)new Object[0], (long)-2109500815056049453L, (long)l);
                        callSite = eX.c("\u00cc", (Object)eX.c("\u00ed", (long)-2109656532772298691L, (long)l), (Object)objectArray, (long)-2111140951149353894L, (long)l);
                        if (callSite3 != null) break block23;
                    }
                    catch (MatchException matchException) {
                        throw eX.c("\u00d2", (Object)matchException, (long)-2109262772629028268L, (long)l);
                    }
                    if (callSite != false) break block24;
                }
                catch (MatchException matchException) {
                    throw eX.c("\u00d2", (Object)matchException, (long)-2109262772629028268L, (long)l);
                }
                return;
            }
            callSite = (callSite2 = eX.c("\u00cc", (Object)eX.c("\u00c2", (Object)b, (long)-2114580894603786469L, (long)l), (Object)eX.c("\u00cc", (Object)aR2, (Object)new Object[0], (long)-2109500815056049453L, (long)l), (long)-2108589823525044136L, (long)l) - eX.c("\u00cc", (Object)((Float)((Object)eX.c("\u00cc", (Object)this.e, (long)-2109076538265213821L, (long)l))), (long)-2110812221836018495L, (long)l)) == 0 ? 0 : (callSite2 > 0 ? 1 : -1);
        }
        if (callSite > 0) {
            return;
        }
        eX.c("\u00cc", (Object)aR2, (Object)new Object[]{eX.c("\u00cc", (Object)eX.c("\u00cc", (Object)aR2, (Object)new Object[0], (long)-2111879015942700264L, (long)l), (double)((double)eX.c("\u00cc", (Object)((Float)((Object)eX.c("\u00cc", (Object)this.a, (long)-2109076538265213821L, (long)l))), (long)-2110812221836018495L, (long)l) / 5.0), (long)-2111790016229537824L, (long)l)}, (long)-2111382768539917804L, (long)l);
        eX.c("\u00cc", (Object)aR2, (Object)new Object[0], (long)-2114459592633863750L, (long)l);
    }

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (p[n3] != null) {
            return n3;
        }
        Object object = o[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 61;
            case 1 -> 38;
            case 2 -> 46;
            case 3 -> 56;
            case 4 -> 31;
            case 5 -> 62;
            case 6 -> 7;
            case 7 -> 30;
            case 8 -> 18;
            case 9 -> 11;
            case 10 -> 23;
            case 11 -> 52;
            case 12 -> 6;
            case 13 -> 41;
            case 14 -> 34;
            case 15 -> 24;
            case 16 -> 29;
            case 17 -> 8;
            case 18 -> 42;
            case 19 -> 49;
            case 20 -> 13;
            case 21 -> 0;
            case 22 -> 22;
            case 23 -> 25;
            case 24 -> 27;
            case 25 -> 44;
            case 26 -> 21;
            case 27 -> 20;
            case 28 -> 4;
            case 29 -> 45;
            case 30 -> 15;
            case 31 -> 48;
            case 32 -> 28;
            case 33 -> 59;
            case 34 -> 3;
            case 35 -> 58;
            case 36 -> 47;
            case 37 -> 50;
            case 38 -> 33;
            case 39 -> 57;
            case 40 -> 37;
            case 41 -> 16;
            case 42 -> 17;
            case 43 -> 9;
            case 44 -> 39;
            case 45 -> 55;
            case 46 -> 5;
            case 47 -> 1;
            case 48 -> 63;
            case 49 -> 32;
            case 50 -> 10;
            case 51 -> 36;
            case 52 -> 2;
            case 53 -> 35;
            case 54 -> 12;
            case 55 -> 43;
            case 56 -> 40;
            case 57 -> 26;
            case 58 -> 51;
            case 59 -> 14;
            case 60 -> 53;
            case 61 -> 54;
            case 62 -> 60;
            default -> 19;
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
        eX.p[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = eX.m(l, l2);
        Object object = o[n];
        if (object instanceof String) {
            String string = p[n];
            int n2 = string.indexOf(8);
            Class clazz = eX.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = eX.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = eX.g(clazz3, string2, clazz2)) != null) {
                    eX.o[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = eX.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        eX.o[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = eX.n(1382624203883728L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = eX.m(l, l2);
        Object object = o[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = p[n];
                int n3 = string2.indexOf(8);
                clazz3 = eX.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = eX.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = eX.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        eX.o[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = eX.n(1382624203883728L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = eX.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        eX.o[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = eX.n(1382624203883728L, 0L);
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

    private static Field g(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
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

    private boolean lambda$new$0(Boolean bl) {
        long l = k ^ 0x4A230168A2A9L;
        return (boolean)eX.c("\u00cc", (String)((Object)eX.c("\u00cc", (Object)this.f, (long)-7545100636444421774L, (long)l)), (Object)eX.b("c", (int)9543, (long)(0x8D7F7408AC3D55BL ^ l)), (long)-7544325067802577684L, (long)l);
    }

    private boolean lambda$new$1(Boolean bl) {
        long l = k ^ 0x213832DB1706L;
        return (boolean)eX.c("\u00cc", (String)((Object)eX.c("\u00cc", (Object)this.f, (long)2514418068564452573L, (long)l)), (Object)eX.b("c", (int)9543, (long)(0x8D79C5BB97060F4L ^ l)), (long)2513649923908354371L, (long)l);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(eX.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(eX.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


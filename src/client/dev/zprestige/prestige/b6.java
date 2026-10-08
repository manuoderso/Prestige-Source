/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1753
 *  net.minecraft.class_1764
 *  net.minecraft.class_1799
 *  net.minecraft.class_1835
 *  net.minecraft.class_4061
 *  org.joml.Matrix4f
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.aq_0;
import dev.zprestige.prestige.ay_0;
import dev.zprestige.prestige.b4;
import dev.zprestige.prestige.cn_0;
import dev.zprestige.prestige.g8;
import dev.zprestige.prestige.gK;
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
import net.minecraft.class_1753;
import net.minecraft.class_1764;
import net.minecraft.class_1799;
import net.minecraft.class_1835;
import net.minecraft.class_4061;
import org.joml.Matrix4f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class b6
extends b4 {
    private static final float m = 28.0f;
    private static final float a = 3.0f;
    private static final float c = 0.5f;
    private static final float d = 220.0f;
    private static final float g = 350.0f;
    private static final float h = 16.0f;
    private static final float i = 280.0f;
    private class_4061 j;
    private boolean n;
    private long k;
    private long l;
    private boolean q;
    private float o;
    private float p;
    private float t;
    private float u;
    private long r;
    private static final long v = hc.a(-846202581480150478L, 2714933526411549131L, MethodHandles.lookup().lookupClass()).a(51664654202775L);
    private static final String[] w;
    private static final String[] x;
    private static final Map y;
    private static final long[] B;
    private static final Integer[] C;
    private static final Map D;
    private static final long[] H;
    private static final Long[] I;
    private static final Map J;
    private static final Object[] K;
    private static final String[] L;

    public b6(long l) {
        long l2 = (l = v ^ l) ^ 0x74F9FAAF61BL;
        super((String)((Object)b6.a("l", (int)7690, (long)(0x632CEA4DF7A9D879L ^ l))), (String)((Object)b6.a("l", (int)9919, (long)(0x111372B18C4060CDL ^ l))), l2);
        this.j = null;
        this.n = 0;
        this.k = (long)b6.d("u", (int)8981, (long)(0x7E608C0231225B74L ^ l));
        this.l = (long)b6.d("u", (int)8981, (long)(0x7E608C0231225B74L ^ l));
        this.q = 0;
        this.o = 0.0f;
        this.p = 0.0f;
        this.t = 0.0f;
        this.u = 0.0f;
        this.r = (long)b6.d("u", (int)2713, (long)(0x736471B69C5C72F9L ^ l));
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        K = new Object[114];
        L = new String[114];
        b6.b();
        y = new HashMap(13);
        long l = v ^ 0x583F2AC1E644L;
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
        String[] stringArray = new String[2];
        int n = 0;
        String string = "\u00bf\u0010\u00b8\u00b4\u00ff\u00eb\u00d5-\u00bfe\u00f9\u0000\u009d\u00cb\u00f7\u0095\u0015\u00d0\u0099\u00f2R\u00fd\u00c0\u00ab\u00d3\u00f0\u0003\u00cd2\u00d4\u0002\u00f8R\r\u0084;\u001a\u0015>^\u00c0\u00ab\u001dN\u00ba\f\u008e\u00e0e\u0089\u009b_H/\u0006\u00d9Z\u00f8M\u001f-\u00baV,\u00c3\u00e5\u00d2\u00bd[xD\u00e6\u00b4\u008f\u0007\u000b\u0085\u001a\u0018\u00f7\u00af\u00ee\u001d\u00ae \u00db\u00ef\u00ba\u00df.\u00edy.\u0011\u00c1|\"\u00a0%~\u0093I\u00d1\u009b\u00bf\u0006\u0082aQ\u00d0\u0006\u00c3z\u00e6\u00b4\u00a4W$\u009c\u00840\u0092\u00df\u00e8\u0010H\u00e4d\u00c0>\u0083X`-Xu(\u0085\u0091\u0004\u00ff7\u00c0\u00f1\rP\u009a\u00ab\u00ff\u0002\b\u00d1\u0001\u00dd\u0083\u008f\u0088\u00a4\u00a0\u008cb\u00bbc\u00c3'{9d\"\u00e0\u00b7z?\u00d26\bZ";
        int n2 = "\u00bf\u0010\u00b8\u00b4\u00ff\u00eb\u00d5-\u00bfe\u00f9\u0000\u009d\u00cb\u00f7\u0095\u0015\u00d0\u0099\u00f2R\u00fd\u00c0\u00ab\u00d3\u00f0\u0003\u00cd2\u00d4\u0002\u00f8R\r\u0084;\u001a\u0015>^\u00c0\u00ab\u001dN\u00ba\f\u008e\u00e0e\u0089\u009b_H/\u0006\u00d9Z\u00f8M\u001f-\u00baV,\u00c3\u00e5\u00d2\u00bd[xD\u00e6\u00b4\u008f\u0007\u000b\u0085\u001a\u0018\u00f7\u00af\u00ee\u001d\u00ae \u00db\u00ef\u00ba\u00df.\u00edy.\u0011\u00c1|\"\u00a0%~\u0093I\u00d1\u009b\u00bf\u0006\u0082aQ\u00d0\u0006\u00c3z\u00e6\u00b4\u00a4W$\u009c\u00840\u0092\u00df\u00e8\u0010H\u00e4d\u00c0>\u0083X`-Xu(\u0085\u0091\u0004\u00ff7\u00c0\u00f1\rP\u009a\u00ab\u00ff\u0002\b\u00d1\u0001\u00dd\u0083\u008f\u0088\u00a4\u00a0\u008cb\u00bbc\u00c3'{9d\"\u00e0\u00b7z?\u00d26\bZ".length();
        int n3 = 136;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = b6.b(byArray3).intern();
            if ((n4 += n3) >= n2) break;
            n3 = string.charAt(n4);
        }
        w = stringArray;
        x = new String[2];
        D = new HashMap(13);
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
        long[] lArray = new long[2];
        int n6 = 0;
        String string2 = "\u00da\u00cc\u00e1\u0017\u00bc\u001b\u00d4\u00c4IV\u00c7\u00ee\u00d6\u00f9i\u0018";
        int n7 = "\u00da\u00cc\u00e1\u0017\u00bc\u001b\u00d4\u00c4IV\u00c7\u00ee\u00d6\u00f9i\u0018".length();
        int n8 = 0;
        do {
            byte[] byArray6 = string2.substring(n8, n8 += 8).getBytes("ISO-8859-1");
            int n9 = n6++;
            long l2 = ((long)byArray6[0] & 0xFFL) << 56 | ((long)byArray6[1] & 0xFFL) << 48 | ((long)byArray6[2] & 0xFFL) << 40 | ((long)byArray6[3] & 0xFFL) << 32 | ((long)byArray6[4] & 0xFFL) << 24 | ((long)byArray6[5] & 0xFFL) << 16 | ((long)byArray6[6] & 0xFFL) << 8 | (long)byArray6[7] & 0xFFL;
            byte[] byArray7 = cipher2.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n9] = ((long)byArray7[0] & 0xFFL) << 56 | ((long)byArray7[1] & 0xFFL) << 48 | ((long)byArray7[2] & 0xFFL) << 40 | ((long)byArray7[3] & 0xFFL) << 32 | ((long)byArray7[4] & 0xFFL) << 24 | ((long)byArray7[5] & 0xFFL) << 16 | ((long)byArray7[6] & 0xFFL) << 8 | (long)byArray7[7] & 0xFFL;
        } while (n8 < n7);
        B = lArray;
        C = new Integer[2];
        J = new HashMap(13);
        Cipher cipher3 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory3 = SecretKeyFactory.getInstance("DES");
        byte[] byArray8 = new byte[8];
        byte[] byArray9 = byArray8;
        byArray8[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray9 = byArray9;
            byArray9[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher3.init(2, (Key)secretKeyFactory3.generateSecret(new DESKeySpec(byArray9)), new IvParameterSpec(new byte[8]));
        long[] lArray2 = new long[3];
        int n10 = 0;
        String string3 = "\u00a8\u00b7\u00fez\u00f0!k\u00ff\u00c6\u0086\u00ca/\u00b0_b2\u00c3DLH\u00e3*aK";
        int n11 = "\u00a8\u00b7\u00fez\u00f0!k\u00ff\u00c6\u0086\u00ca/\u00b0_b2\u00c3DLH\u00e3*aK".length();
        int n12 = 0;
        do {
            byte[] byArray10 = string3.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            long l3 = ((long)byArray10[0] & 0xFFL) << 56 | ((long)byArray10[1] & 0xFFL) << 48 | ((long)byArray10[2] & 0xFFL) << 40 | ((long)byArray10[3] & 0xFFL) << 32 | ((long)byArray10[4] & 0xFFL) << 24 | ((long)byArray10[5] & 0xFFL) << 16 | ((long)byArray10[6] & 0xFFL) << 8 | (long)byArray10[7] & 0xFFL;
            byte[] byArray11 = cipher3.doFinal(new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3});
            lArray2[n13] = ((long)byArray11[0] & 0xFFL) << 56 | ((long)byArray11[1] & 0xFFL) << 48 | ((long)byArray11[2] & 0xFFL) << 40 | ((long)byArray11[3] & 0xFFL) << 32 | ((long)byArray11[4] & 0xFFL) << 24 | ((long)byArray11[5] & 0xFFL) << 16 | ((long)byArray11[6] & 0xFFL) << 8 | (long)byArray11[7] & 0xFFL;
        } while (n12 < n11);
        H = lArray2;
        I = new Long[3];
    }

    private static Field e(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static float e(Object[] objectArray) {
        float f;
        block8: {
            float f10;
            float f11;
            block6: {
                CallSite callSite;
                long l;
                block7: {
                    f11 = ((Float)objectArray[0]).floatValue();
                    l = (Long)objectArray[1];
                    l = v ^ l;
                    callSite = b6.g("\u00e6", (long)-1721679205873890345L, (long)l);
                    try {
                        try {
                            float f12 = f11 - 0.0f;
                            f10 = f12 == 0.0f ? 0 : (f12 < 0.0f ? -1 : 1);
                            if (callSite != null) break block6;
                            if (f10 >= 0) break block7;
                        }
                        catch (MatchException matchException) {
                            throw b6.g("\u00e6", (Object)matchException, (long)-1722695341230640758L, (long)l);
                        }
                        f = 0.0f;
                        break block8;
                    }
                    catch (MatchException matchException) {
                        throw b6.g("\u00e6", (Object)matchException, (long)-1722695341230640758L, (long)l);
                    }
                }
                try {
                    f = f11;
                    if (callSite != null) break block8;
                    float f13 = f - 1.0f;
                    f10 = f13 == 0.0f ? 0 : (f13 > 0.0f ? 1 : -1);
                }
                catch (MatchException matchException) {
                    throw b6.g("\u00e6", (Object)matchException, (long)-1722695341230640758L, (long)l);
                }
            }
            f = f10 > 0 ? 1.0f : f11;
        }
        return f;
    }

    private static Method e(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    private static int i(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (L[n3] != null) {
            return n3;
        }
        Object object = K[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 13;
            case 1 -> 0;
            case 2 -> 41;
            case 3 -> 8;
            case 4 -> 46;
            case 5 -> 35;
            case 6 -> 53;
            case 7 -> 12;
            case 8 -> 11;
            case 9 -> 52;
            case 10 -> 20;
            case 11 -> 50;
            case 12 -> 9;
            case 13 -> 56;
            case 14 -> 15;
            case 15 -> 54;
            case 16 -> 21;
            case 17 -> 31;
            case 18 -> 33;
            case 19 -> 25;
            case 20 -> 10;
            case 21 -> 63;
            case 22 -> 36;
            case 23 -> 61;
            case 24 -> 45;
            case 25 -> 19;
            case 26 -> 7;
            case 27 -> 47;
            case 28 -> 32;
            case 29 -> 42;
            case 30 -> 24;
            case 31 -> 18;
            case 32 -> 62;
            case 33 -> 3;
            case 34 -> 22;
            case 35 -> 29;
            case 36 -> 38;
            case 37 -> 44;
            case 38 -> 37;
            case 39 -> 40;
            case 40 -> 57;
            case 41 -> 26;
            case 42 -> 4;
            case 43 -> 49;
            case 44 -> 27;
            case 45 -> 34;
            case 46 -> 30;
            case 47 -> 43;
            case 48 -> 14;
            case 49 -> 16;
            case 50 -> 58;
            case 51 -> 6;
            case 52 -> 28;
            case 53 -> 23;
            case 54 -> 59;
            case 55 -> 39;
            case 56 -> 48;
            case 57 -> 1;
            case 58 -> 17;
            case 59 -> 2;
            case 60 -> 60;
            case 61 -> 51;
            case 62 -> 5;
            default -> 55;
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
        b6.L[n3] = new String(cArray);
        return n3;
    }

    private static Color b(Object[] objectArray) {
        Color color = (Color)objectArray[0];
        Color color2 = (Color)objectArray[1];
        Object object = ((Float)objectArray[2]).floatValue();
        long l = (Long)objectArray[3];
        long l2 = (l = v ^ l) ^ 0x5F41A0E04760L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = Float.valueOf(object);
        object = b6.g("\u00e6", (Object)objectArray2, (long)-147411923338481683L, (long)l);
        return new Color((int)((float)b6.g("\u00ff", (Object)color, (long)-148747371690683499L, (long)l) + (float)(b6.g("\u00ff", (Object)color2, (long)-148747371690683499L, (long)l) - b6.g("\u00ff", (Object)color, (long)-148747371690683499L, (long)l)) * object), (int)((float)b6.g("\u00ff", (Object)color, (long)-147349708100026025L, (long)l) + (float)(b6.g("\u00ff", (Object)color2, (long)-147349708100026025L, (long)l) - b6.g("\u00ff", (Object)color, (long)-147349708100026025L, (long)l)) * object), (int)((float)b6.g("\u00ff", (Object)color, (long)-152563801710966658L, (long)l) + (float)(b6.g("\u00ff", (Object)color2, (long)-152563801710966658L, (long)l) - b6.g("\u00ff", (Object)color, (long)-152563801710966658L, (long)l)) * object));
    }

    private static void b() {
        Object[] objectArray = K;
        K[0] = "p\u0014g]eBf\u0014b\u0007vUq_a\u0001zA`\u0018v\u00161P\"";
        objectArray[1] = "#\u001aAhUtV:JgD;74Al@aC";
        objectArray[2] = Float.TYPE;
        b6.L[2] = "java/lang/Float";
        objectArray[3] = "D~c\tN~D~tUBq^5tKBdYD$\u0016\u0013";
        objectArray[4] = "`\u0011A\u0019,\u007f`\u0011VE pzZV[ e}+\u0004\u0007u'";
        objectArray[5] = "nnJ6ujxnOlf}o%Ljji~b[}!{B";
        objectArray[6] = "\u001eOlhc\\koggr\u0013\u0016wt`{Z~";
        objectArray[7] = "\u0005\u0019\u0011H9\f\u0013\u0019\u0014\u0012*\u001b\u0004R\u0017\u0014&\u000f\u0015\u0015\u0000\u0003m\u001eU";
        objectArray[8] = "KtZ94\n>TQ6%E_ZZ=!\u001f+";
        objectArray[9] = Void.TYPE;
        b6.L[9] = "java/lang/Void";
        objectArray[10] = "yS\f{W yS\u001b'[/c\u0018\u001b9[:diOa\f";
        objectArray[11] = "\u0013$\u0017\b0\u000e\u0013$\u0000T<\u0001\to\u0000J<\u0014\u000e\u001eU\u0015e";
        objectArray[12] = "x\u0000\u0012oeF\r \u0019`t\tl.\u0012kpS\u0018";
        objectArray[13] = "3+B&\\sF\u000bI)M<'\u0005B\"IfS";
        objectArray[14] = "\u001b}nco\u000e\r}k9|\u0019\u001a6h?p\r\u000bq\u007f(;\u0019G";
        objectArray[15] = "\u001c\u0007Z\\RCi'QSC\f\b)ZXGV|";
        objectArray[16] = "2<b\u0007#a2<u[/n(wuE/{/\u0006\"\u001ay";
        objectArray[17] = "&\u0006N\u0004\u0013~S&E\u000b\u000212(N\u0000\u0006kF";
        objectArray[18] = "z[\u0014DGDqT\u0005\u000b$IdR";
        objectArray[19] = Double.TYPE;
        b6.L[19] = "java/lang/Double";
        objectArray[20] = "J,/-2bA#>bOwS9<!";
        objectArray[21] = Long.TYPE;
        b6.L[21] = "java/lang/Long";
        objectArray[22] = "LiG\u0007A\u001b9IL\bPTXGG\u0003T\u000e,";
        objectArray[23] = "ECSXF\u001eNLB\u0017<\u001a]MRX\n\u001eJ";
        objectArray[24] = Integer.TYPE;
        b6.L[24] = "java/lang/Integer";
        objectArray[25] = "@S\u0017k R5s\u001cd1\u001dT}\u0017o5G ";
        objectArray[26] = "@t7kjDVt21ySA?17uGPx& >U]";
        objectArray[27] = "\u001bz4BA:nZ?MPu\u000fT4FT/{";
        objectArray[28] = "\u0017.B\u001c\u0012\"b\u000eI\u0013\u0003m\u0003\u0000B\u0018\u00077w";
        objectArray[29] = Boolean.TYPE;
        b6.L[29] = "java/lang/Boolean";
        objectArray[30] = "eW\u0012\u0014p*xBJ61'`D";
        objectArray[31] = "}E\u0006'\fe}E\u0011{\u0000jg\u000e\u0011e\u0000\u007f`\u007fC>X5";
        objectArray[32] = "VU\b\u001797VU\u001fK58L\u001e\u001fU5-KoM\u000eml";
        objectArray[33] = "\u0000,iQ]F\u0016,l\u000bNQ\u0001go\rBE\u0010 x\u001a\tU\u0016";
        objectArray[34] = "'\u0005\u0018j\u0018\u0007R%\u0013e\tH3+\u0018n\r\u0012G";
        objectArray[35] = "uik/\u0012n\u0000I` \u0003!aGk+\u0007{\u0015";
        objectArray[36] = "\u001f^\u001c\u001dh\u0007j~\u0017\u0012yH\u000bp\u001c\u0019}\u0012\u007f";
        objectArray[37] = "0\u001bb;\u0013\u00140\u001bug\u001f\u001b*Puy\u001f\u000e-!'\"HI";
        objectArray[38] = "CP\u001ek\n.CP\t7\u0006!Y\u001b\t)\u00064^j[vW~";
        objectArray[39] = "m\u000f\f+`\u000e\u0018/\u0007$qAy!\f/u\u001b\r";
        objectArray[40] = "Q+]\u00008\u001fG+XZ+\bP`[\\'\u001cA'LKl\u000bw";
        objectArray[41] = "\u0015^{\u0007r\u000b`~p\bcD\u0001p{\u0003g\u001eu";
        objectArray[42] = "!R\u0018Ua;Tr\u0013Zpt5|\u0018Qt.A";
        objectArray[43] = "_-\u000f>\bj_-\u0018b\u0004eEf\u0018|\u0004pB\u0017J'\\5";
        objectArray[44] = "~\u000b4Mp\t\u000b+?BaFj%4Ie\u001c\u001e";
        objectArray[45] = "\r\"KA\u0000\u0001\u001b\"N\u001b\u0013\u0016\fiM\u001d\u001f\u0002\u001d.Z\nT\u0010,";
        objectArray[46] = "\u0018Q\u0005J@\u0000mq\u000eEQO\f\u007f\u0005NU\u0015x";
        objectArray[47] = "Y\u0000-j\\0Y\u0000:6P?CK:(P*D:nu\u0006k";
        objectArray[48] = "Z.\u0014;G2Q!\u0005t&<Z*\u0001.";
        objectArray[49] = "vU\u000bVX>vU\u001c\nT1l\u001e\u001c\u0014T$koLI\u0000";
        objectArray[50] = "1k[q9~DKP~(1%E[u,kQ";
        objectArray[51] = "\n@ZWG2\u001c@_\rT%\u000b\u000b\\\u000bX1\u001aLK\u001c\u0013&\u0005";
        objectArray[52] = "xs#\u0003r9\rS(\fcvl]#\u0007g,\u0018";
        objectArray[53] = "\u00042\u0003:\r\u000e\u00122\u0006`\u001e\u0019\u0005y\u0005f\u0012\r\u0014>\u0012qY\u001a\u0004";
        objectArray[54] = "\u0017?\\\u0007c\u0001b\u001fW\brN\u0003\u0011\\\u0003v\u0014w";
        objectArray[55] = "KcT^~\u001d>C_QoR_MTZk\b+";
        objectArray[56] = "\u001dA;/gW\u001dA,skX\u0007\n,mkM\u0000{{1<\u000f";
        objectArray[57] = "SX\u001eo\u001a\u0018E\t@\u0000\u0012b\r\u000bL1\u0005\u0004XR\u0019`Ab\u000e\t\u000bn@SQL\u0002n\u007f";
        objectArray[58] = "}/a\u0011\u0010Mako\u0014}Ns/\u001f\u0002\u0010LxS?\u0006\u0012Cn( \u001bAB\u001e";
        objectArray[59] = "\tP> 9z\u000fV:/I.^I%*%\u001c\t\u000f{}rK\tN~4w4L\f(7I";
        objectArray[60] = "U2BG{~H9BV\t&G4FAe\u0014\u0016q\u0019\u001a9CZ5ZZ{{E9X_\t}L+A\u001fl$\u001asC&";
        objectArray[61] = "?V{AUQ9P\u007fN%\u000ed^d@rY:\t<,\u001aZ\u007f\u000e\u007fVHP;^";
        objectArray[62] = "U\nz\u0015#\u0010\u0018Ks\u001eRMh\f)EcV\u000eYp\u00102\u0012h\u000bu\u001a5\u0015\rR#B7,";
        objectArray[63] = "\u0007/\u0000\u0006\n.ToXZd&6m^\u0005U6P8\u0007P\u0004r6n\\B\ns\u00071\u0019K\nL";
        objectArray[64] = "u~m\u0015Yksxi\u001a)4.vr\u0014~cp&+xC:%cxB\u0013%?|";
        objectArray[65] = "GK\u0001\u00025\u0019\u0015AERJ\u0006\u0015\r\u001bX&4FIG\u000fJ\f\u0006\u001e\u0019O1\u0013\u001bM\u0018?";
        objectArray[66] = "\u000fA\fIPE]KH\u0019/Z]\u0007\u0016\u0013Ch\u000eBOI/\\T\n\r\u0018WAS\u0015\u001bt";
        objectArray[67] = "Mo_\u0002kI[>\u0001mb3\u0013<\r\\tUFeX\r03\u0010>J\u00031\u0002O{C\u0003\u000e";
        objectArray[68] = "deLEG*`bDXz$\u001f7\u001b\u0001K7ybBT\u001as\u001f4\u0019F\u0014r.k\\O\u0014M";
        objectArray[69] = "5n]+.f#?\u0003D%\u001ck=\u000fu1z>dZ$u\u001c1cB?'d,d])K";
        objectArray[70] = ".\u0006'\u001e<}cG.\u0015M(\u0013\u0000tN|;uU-\u001b-\u007f\u0013\u0007(\u0011*xv^~I(A";
        objectArray[71] = "p\"3\u0003\u0014gfsml\n\u001d.qa]\u000b{{(4\fO\u001d)->\u000bHxp{f\tq";
        objectArray[72] = "toB\u0005i.b>\u001cjfT*<\u0010[v2\u007feE\n2Tpz\u001d\u0003a8l>\u0013\u0006\f";
        objectArray[73] = "Zg@-FwGhK(x\u007f?!\u0003lIoYtZ9\u0018+?{]!\u0003yGfZ>\u0015\u0015";
        objectArray[74] = "\u0016.exG5\u0000\u007f;\u0017XOH}7&X)\u001d$bw\u001cOO!hp\u001b*\u0016w0r\"";
        objectArray[75] = "`[\u001d\u007f\u0005cu^Egia\u0012\u0003\u0018<XptVAi\t4\u0012\u0004Dc\u000e3w]\u0012;\f\n";
        objectArray[76] = ">RSw4F5M\u001ek\rJ\"A\u0002}axs\u0007_$0/0G\u0006{\u007f\u0012-L\u0006j\r";
        objectArray[77] = "\u0004}\nC(iRo\nZHk\u0014e\u0019\\.|5~\u0006\\\ra\r{\u0002JHm\u0010/]V:8\u001b&S1";
        objectArray[78] = "(]\u001b\u0016B\u001b5R\u0010\u0013|\u0010M\u001bXWM\u0003+N\u0001\u0002\u001cGMA\u0006\u001a\u0007\u00155\\\u0001\u0005\u0011y";
        objectArray[79] = "I\u0000&g*\u0004\u001b\nb7U\u001b\u001bF<=9)I\u0000bcUDNA2ed\u001b\u000bH2ZoF\rTck0\u0003\u0004T\\";
        objectArray[80] = ".W8yw\u00168\u0006f\u0016ylp\u0004j'h\n%]?v,l*Bg\u007f\u007f\u00006\u0006iz\u0012";
        objectArray[81] = "d\u0017n\ti])Vg\u0002\u0018\fY\u0011=Y)\u001b?Dd\fx_YKc\u0014c\r!Vd\u000bua";
        objectArray[82] = "4\u0015i1-(>W(`T19KYe*;:]\"z7h;-6t;6(V)ih7XB'e6$#]:67T";
        objectArray[83] = "\u0012\b\u0005\u0005(\u0014WJS\u0006\u0016\u000eE\u000f^\u001bz<\u0014O\u000eM\u0016\u0004V\u001c\\\fm\u001bKO]|";
        objectArray[84] = "\u00132zaXzJ{\u007fh4,(wp{\n&E:cjEF";
        objectArray[85] = "=~-\u0011H\u0017+/s~Dmc-\u007fOW\u000b6t*\u001e\u0013m9kr\u0017@\u0001%/|\u0012-";
        objectArray[86] = "h sEFRtd}@+Qf \u0018AG>d\"-N[E{?~O+";
        objectArray[87] = "m\\3d\u007fu?Vw4\u0000j?\u001a)>lXl^ra\u0000k(\u0005\">ii>\u0004#Y";
        objectArray[88] = "\u0005\u001c\"\u0005R\u0018\u0003\u001a&\n\"G^\u0014=\u0004u\u0010\u0001Ifh\u0012\u0010NH8\u000bBYR\u0006";
        objectArray[89] = "@3|H)\u000bJq=\u0019P\u0012E{L\u001c.\u0018N{7\u00033KO\u000b#\r?\u0015\\p<\u0010l\u0014,d2\u001c2\u0007W{/O3w";
        objectArray[90] = "$Upx$\u0016%\r&qN\u00174\u0016 &\"%f[x|N\u0016#\t+&'\u00145\b*AtJ\"\u0004\u007fp+\u000f+\u0004@{v\t7Uq$3\u00007j";
        objectArray[91] = "\u0011c\u0002/Rv\u00072\\@K\fO0PqMj\u001ai\u0005 \t\fHl\u000f'\u000ei\u0011:W%7";
        objectArray[92] = "Ox8 dVMn9!\u0003ZF~;,oh\u00143cz\u0003ZKr* sDZ\u007f:K";
        objectArray[93] = "\u0019A|=Z:\bR`$`gg\u00164`Qq\u0001Cm5\u00005gLrm\tf\u000bP6c\f\u000b";
        objectArray[94] = "\u00057S\u001bV+\u0007!R\u001a1'\f1P\u0017]\u0015^|\u000eH1!\u0005<K\u001cI<\u0002#]p";
        objectArray[95] = "m;^\u0019]Zjs\u001a_\"Cx6\u0003\u0002Nq*u\\X\"Bo)\b\u0002K@y(\te[Wq1\f\u0006\u001e\u001a\u007f2c\n\\Iw:\u0018\u0015A\u001avJ";
        objectArray[96] = "z\u0003R`YslR\f\u000fW\t$P\u0000>Foq\tUo\u0002\t'RGa\u00038x\u0017Na<";
        objectArray[97] = "5}4j\b\n??u;q\u001b)=\u0004=\t\u00073$di\f\u000faEh)\u0000\u001c8%<,\bNY";
        objectArray[98] = "\bqp@\b1Z{4\u0010w.Z7j\u001a\u001b\u001c\ts6Bw/M(a\u001a\u001e-[)`}";
        objectArray[99] = "SuW\u007f']Vp\nej<\u0004/WcvkS~\u0003:#<SuW\u007f']Vp\nej";
        objectArray[100] = "K0V\u001fRDV?]\u001alA.v\u0015^]\\H#L\u000b\f\u0018.,K\u0013\u0017JV1L\f\u0001&";
        objectArray[101] = "_\u0011\u000f|3&Y\u0017\u000bsCy\u0004\u0019\u0010}\u0014.[EL\u00112xT\u0019Mx9g\u0019\u0005";
        objectArray[102] = "\u0019;9\u0017e+\u000fjgxiQ\u0011?m\u0003~o\u001d,kC\u0000>\u0013h,\u0006>2\u0000nlx";
        objectArray[103] = "\u000bmu?c}\u001d<+Po\u0007U>'a|a\u0000gr08\u0007\r=b0b>\f;k-\u0006";
        objectArray[104] = "\u0007R6\u001ddBB\u0010`\u001eZXPUm\u00036j\u0001\u00145ZZRCFo\u0014!M^\u0015nd";
        objectArray[105] = "m2W\u0018gUgp\u0016I\u001eL`lg\u0019&Ro5VFc[o\n]\u001beG>;\u0002^lG\u00010_Xp\u00160o\u001aQp)";
        objectArray[106] = "Y\u0006\u001bq==EB\u0015tP>W\u0006c|(1SzEf?3J\u0001Z{l2:";
        objectArray[107] = "n\u0015\n/=\u001erQ\u0004*P-M(g\u000bP\u0011qXR+<\r5VW";
        objectArray[108] = "cDP2ky1N\u0014b\u0014f1\u0002JhxTcE\u00170\u0014~cN\u0013ep\u007f;\u0018\u001a\u000f";
        objectArray[109] = "s\f&3!?n\u0007&\"Sga\n\"5?U0O}oh\u0002|\u000b>.!:c\u0007<+S";
        objectArray[110] = "uP+G1$'Zo\u0017N;'\u00161\u001d\"\ttRnKN:0\t:\u001d'8&\b;z";
        objectArray[111] = "-`p\u00121\t1$~\u0017\\\n#`\u000b\u001f!\bNs?\u0014>\u00155l\"G?e";
        objectArray[112] = "}\u001d\u000f4\u0016E'\u0014\u0012$D')%D`F\u0016>C\u00119\u0013Gz%C<\u0019@}@\u001ajABD";
        Object[] objectArray2 = objectArray;
        objectArray[113] = "Iu3,\u00023C7r}{*L=\u0003-C4Kr2r\u0006=KM9/\u0000!\u001a|fj\t!%w;l\u0015p\u0014(~e\u0015O";
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

    /*
     * Loose catch block
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void s(Object[] objectArray) {
        b6 b62;
        long l;
        block11: {
            block12: {
                l = (Long)objectArray[0];
                l = v ^ l;
                CallSite callSite = b6.g("\u00e6", (long)8975412108429713219L, (long)l);
                if (b6.g("\u00b5", (Object)b, (long)8972123900853917235L, (long)l) == null) return;
                b62 = this;
                if (callSite != null) break block11;
                break block12;
                catch (Throwable throwable) {
                    throw b6.g("\u00e6", (Object)throwable, (long)8972170562176460062L, (long)l);
                }
            }
            try {
                block13: {
                    if (!b62.n) return;
                    break block13;
                    catch (Throwable throwable) {
                        throw b6.g("\u00e6", (Object)throwable, (long)8972170562176460062L, (long)l);
                    }
                }
                b62 = this;
            }
            catch (Throwable throwable) {
                throw b6.g("\u00e6", (Object)throwable, (long)8972170562176460062L, (long)l);
            }
        }
        try {
            if (b62.j == null) {
                return;
            }
        }
        catch (Throwable throwable) {
            throw b6.g("\u00e6", (Object)throwable, (long)8972170562176460062L, (long)l);
        }
        try {
            b6.g("\u00ff", (Object)b6.g("\u00ff", (Object)b6.g("\u00b5", (Object)b, (long)8972123900853917235L, (long)l), (long)8973758959502472622L, (long)l), (Object)this.j, (long)8977097211059988251L, (long)l);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        this.n = 0;
        this.j = null;
    }

    private static Color c(Object[] objectArray) {
        Color color = (Color)objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        long l = (Long)objectArray[2];
        l = v ^ l;
        CallSite callSite = b6.g("\u00e6", (int)0, (int)b6.g("\u00e6", (int)b6.c("q", (int)32350, (long)(0x78239F37944CCE84L ^ l)), (int)((int)((float)b6.g("\u00ff", (Object)color, (long)-5087169468709619331L, (long)l) * f)), (long)-5086618729522022274L, (long)l), (long)-5086166960979494190L, (long)l);
        return new Color((int)b6.g("\u00ff", (Object)color, (long)-5086392040856430829L, (long)l), (int)b6.g("\u00ff", (Object)color, (long)-5083851124595063343L, (long)l), (int)b6.g("\u00ff", (Object)color, (long)-5086826322520109832L, (long)l), (int)callSite);
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x9A6;
        if (C[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = B[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])D.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    D.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/b6", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            b6.C[n2] = n3;
        }
        return C[n2];
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = b6.c(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00b5' || c == 's' || c == '\u00aa' || c == '\u00d3') {
                field = b6.k(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00b5' ? lookup.findGetter(clazz, string2, clazz2) : (c == 's' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00aa' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = b6.l(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00ff' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00e6' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private float c(Object[] objectArray) {
        class_1799 class_17992;
        long l;
        float f;
        class_1799 class_17993;
        block7: {
            class_17993 = (class_1799)objectArray[0];
            f = ((Float)objectArray[1]).floatValue();
            l = (Long)objectArray[2];
            l = v ^ l;
            CallSite callSite = b6.g("\u00e6", (long)8184743093661291098L, (long)l);
            try {
                class_17992 = class_17993;
                if (callSite != null) break block7;
                if (class_17992 == null) return 0.0f;
            }
            catch (Throwable throwable) {
                throw b6.g("\u00e6", (Object)throwable, (long)8186013800320509959L, (long)l);
            }
            class_17992 = class_17993;
        }
        try {
            if (b6.g("\u00ff", (Object)class_17992, (long)8184339047467883494L, (long)l) != false) {
                return 0.0f;
            }
        }
        catch (Throwable throwable) {
            throw b6.g("\u00e6", (Object)throwable, (long)8186013800320509959L, (long)l);
        }
        try {
            return (float)b6.g("\u00ff", (Object)b6.g("\u00ff", (Object)b6.g("\u00b5", (Object)b, (long)8182033590471889150L, (long)l), (long)8185356781067759149L, (long)l), (Object)class_17993, (float)f, (long)8184638509656290235L, (long)l);
        }
        catch (Throwable throwable) {
            return 0.0f;
        }
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/b6" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = b6.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static Method f(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = b6.e(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = b6.f(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field f(Class clazz, String string, Class clazz2) {
        Field field = b6.e(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = b6.f(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean f(Object[] objectArray) {
        Object object;
        block24: {
            block23: {
                CallSite callSite;
                long l;
                long l2;
                long l3;
                class_1799 class_17992;
                block21: {
                    long l4;
                    block22: {
                        class_1799 class_17993;
                        block20: {
                            class_17992 = (class_1799)objectArray[0];
                            l3 = (Long)objectArray[1];
                            long l5 = l3 = v ^ l3;
                            l4 = l5 ^ 0x733CE8E4BBB1L;
                            l2 = l5 ^ 0x611CB31777E3L;
                            l = l5 ^ 0x7E65A8544AB2L;
                            callSite = b6.g("\u00e6", (long)7177372487592132695L, (long)l3);
                            try {
                                class_17993 = class_17992;
                                if (callSite != null) break block20;
                                if (class_17993 == null) return false;
                            }
                            catch (MatchException matchException) {
                                throw b6.g("\u00e6", (Object)matchException, (long)7176409129296640522L, (long)l3);
                            }
                            class_17993 = class_17992;
                        }
                        try {
                            try {
                                object = b6.g("\u00ff", (Object)class_17993, (long)7176968944848898539L, (long)l3);
                                if (callSite != null) break block21;
                                if (object == false) break block22;
                                return false;
                            }
                            catch (MatchException matchException) {
                                throw b6.g("\u00e6", (Object)matchException, (long)7176409129296640522L, (long)l3);
                            }
                        }
                        catch (MatchException matchException) {
                            throw b6.g("\u00e6", (Object)matchException, (long)7176409129296640522L, (long)l3);
                        }
                    }
                    Object[] objectArray2 = new Object[2];
                    objectArray2[1] = l4;
                    objectArray2[0] = class_17992;
                    object = b6.g("\u00e6", (Object)objectArray2, (long)7178096351345765394L, (long)l3);
                }
                try {
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            if (callSite != null) return (boolean)object;
                                            if (object != false) break block23;
                                        }
                                        catch (MatchException matchException) {
                                            throw b6.g("\u00e6", (Object)matchException, (long)7176409129296640522L, (long)l3);
                                        }
                                        Object[] objectArray3 = new Object[2];
                                        objectArray3[1] = l2;
                                        objectArray3[0] = class_17992;
                                        object = b6.g("\u00e6", (Object)objectArray3, (long)7177697530480700208L, (long)l3);
                                        if (callSite != null) return (boolean)object;
                                    }
                                    catch (MatchException matchException) {
                                        throw b6.g("\u00e6", (Object)matchException, (long)7176409129296640522L, (long)l3);
                                    }
                                    if (object != false) break block23;
                                }
                                catch (MatchException matchException) {
                                    throw b6.g("\u00e6", (Object)matchException, (long)7176409129296640522L, (long)l3);
                                }
                                Object[] objectArray4 = new Object[2];
                                objectArray4[1] = l;
                                objectArray4[0] = class_17992;
                                object = b6.g("\u00e6", (Object)objectArray4, (long)7176268282385034986L, (long)l3);
                                if (callSite != null) return (boolean)object;
                            }
                            catch (MatchException matchException) {
                                throw b6.g("\u00e6", (Object)matchException, (long)7176409129296640522L, (long)l3);
                            }
                            if (object != false) break block23;
                        }
                        catch (MatchException matchException) {
                            throw b6.g("\u00e6", (Object)matchException, (long)7176409129296640522L, (long)l3);
                        }
                        object = b6.g("\u00ff", (Object)class_17992, (long)7176778776027376177L, (long)l3) instanceof class_1835;
                        if (callSite != null) return (boolean)object;
                    }
                    catch (MatchException matchException) {
                        throw b6.g("\u00e6", (Object)matchException, (long)7176409129296640522L, (long)l3);
                    }
                    if (object == false) break block24;
                }
                catch (MatchException matchException) {
                    throw b6.g("\u00e6", (Object)matchException, (long)7176409129296640522L, (long)l3);
                }
            }
            object = 1;
            return (boolean)object;
        }
        object = 0;
        return (boolean)object;
    }

    private static Method l(long l, long l2) {
        int n = b6.i(l, l2);
        Object object = K[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = L[n];
                int n3 = string2.indexOf(8);
                clazz3 = b6.j(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = b6.j(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = b6.e(clazz, string, clazz2, n2, classArray2)) != null) {
                        b6.K[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = b6.j(3438449671835798L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = b6.f(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        b6.K[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = b6.j(3438449671835798L, 0L);
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

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void l(Object[] var1_1) {
        block80: {
            block77: {
                block75: {
                    block76: {
                        block79: {
                            block78: {
                                block72: {
                                    block73: {
                                        block74: {
                                            block71: {
                                                block70: {
                                                    block69: {
                                                        block68: {
                                                            block66: {
                                                                block67: {
                                                                    block65: {
                                                                        block64: {
                                                                            block63: {
                                                                                block62: {
                                                                                    block61: {
                                                                                        var5_2 = (aq_0)var1_1[0];
                                                                                        var6_3 = (gK)var1_1[1];
                                                                                        var2_4 = (Matrix4f)var1_1[2];
                                                                                        var3_5 = (Long)var1_1[3];
                                                                                        v0 = var3_5;
                                                                                        var7_6 = v0 ^ 48964852101235L;
                                                                                        var9_7 = v0 ^ 36129254667080L;
                                                                                        var11_8 = v0 ^ 85560644009094L;
                                                                                        var13_9 = v0 ^ 3632026424044L;
                                                                                        var15_10 = v0 ^ 5982008433205L;
                                                                                        var17_11 = v0 ^ 85350127870851L;
                                                                                        var19_12 = v0 ^ 53304382926758L;
                                                                                        var21_13 = b6.g("\u00e6", (long)-6313105781161882705L, (long)var3_5);
                                                                                        try {
                                                                                            try {
                                                                                                v1 = this;
                                                                                                if (var21_13 != null) break block61;
                                                                                                if (v1.n) break block62;
                                                                                            }
                                                                                            catch (MatchException v2) {
                                                                                                throw b6.g("\u00e6", (Object)v2, (long)-6309600350505635342L, (long)var3_5);
                                                                                            }
                                                                                            v1 = this;
                                                                                        }
                                                                                        catch (MatchException v3) {
                                                                                            throw b6.g("\u00e6", (Object)v3, (long)-6309600350505635342L, (long)var3_5);
                                                                                        }
                                                                                    }
                                                                                    v4 = new Object[1];
                                                                                    v4[0] = var11_8;
                                                                                    b6.g("\u00ff", (Object)v1, (Object)v4, (long)-6312667760252305381L, (long)var3_5);
                                                                                }
                                                                                try {
                                                                                    try {
                                                                                        v5 = b6.g("\u00ff", (Object)b6.b, (long)-6307140137684331508L, (long)var3_5);
                                                                                        if (var21_13 != null) break block63;
                                                                                        if (v5 != null) {
                                                                                        }
                                                                                        ** GOTO lbl64
                                                                                    }
                                                                                    catch (MatchException v6) {
                                                                                        throw b6.g("\u00e6", (Object)v6, (long)-6309600350505635342L, (long)var3_5);
                                                                                    }
                                                                                    v5 = b6.g("\u00ff", (Object)b6.b, (long)-6307140137684331508L, (long)var3_5);
                                                                                }
                                                                                catch (MatchException v7) {
                                                                                    throw b6.g("\u00e6", (Object)v7, (long)-6309600350505635342L, (long)var3_5);
                                                                                }
                                                                            }
                                                                            v8 = new Object[1];
                                                                            v8[0] = var7_6;
                                                                            var22_14 = (float)b6.g("\u00ff", (Object)v5, (long)-6313308451467821182L, (long)var3_5) / b6.g("\u00e6", (Object)v8, (long)-6306845350406593022L, (long)var3_5);
                                                                            v9 = new Object[1];
                                                                            v9[0] = var7_6;
                                                                            var23_16 = (float)b6.g("\u00ff", (Object)b6.g("\u00ff", (Object)b6.b, (long)-6307140137684331508L, (long)var3_5), (long)-6310579177753892065L, (long)var3_5) / b6.g("\u00e6", (Object)v9, (long)-6306845350406593022L, (long)var3_5);
                                                                            try {
                                                                                v10 = new Object[3];
                                                                                v10[2] = var9_7;
                                                                                v10[1] = Float.valueOf(var23_16 / 2.0f + 14.0f);
                                                                                v10[0] = Float.valueOf(var22_14 / 2.0f - 14.0f);
                                                                                b6.g("\u00ff", (Object)this, (Object)v10, (long)-6311800214050219760L, (long)var3_5);
                                                                                if (var21_13 == null) break block64;
lbl64:
                                                                                // 2 sources

                                                                                v11 = new Object[3];
                                                                                v11[2] = var9_7;
                                                                                v11[1] = Float.valueOf(110.0f);
                                                                                v11[0] = Float.valueOf(150.0f);
                                                                                b6.g("\u00ff", (Object)this, (Object)v11, (long)-6311800214050219760L, (long)var3_5);
                                                                            }
                                                                            catch (MatchException v12) {
                                                                                throw b6.g("\u00e6", (Object)v12, (long)-6309600350505635342L, (long)var3_5);
                                                                            }
                                                                        }
                                                                        v13 = new Object[2];
                                                                        v13[1] = Float.valueOf(3.0f);
                                                                        v13[0] = Float.valueOf(28.0f);
                                                                        b6.g("\u00ff", (Object)this, (Object)v13, (long)-6306743732549613871L, (long)var3_5);
                                                                        var22_15 = b6.g("\u00b5", (Object)b6.b, (long)-6312233753289377628L, (long)var3_5) instanceof g8;
                                                                        try {
                                                                            try {
                                                                                v14 = b6.b;
                                                                                if (var21_13 != null) break block65;
                                                                                if (b6.g("\u00b5", (Object)v14, (long)-6306948280374343413L, (long)var3_5) != null) {
                                                                                }
                                                                                ** GOTO lbl96
                                                                            }
                                                                            catch (MatchException v15) {
                                                                                throw b6.g("\u00e6", (Object)v15, (long)-6309600350505635342L, (long)var3_5);
                                                                            }
                                                                            v14 = b6.b;
                                                                        }
                                                                        catch (MatchException v16) {
                                                                            throw b6.g("\u00e6", (Object)v16, (long)-6309600350505635342L, (long)var3_5);
                                                                        }
                                                                    }
                                                                    try {
                                                                        try {
                                                                            if (b6.g("\u00b5", (Object)v14, (long)-6313918281473068072L, (long)var3_5) != null) break block66;
lbl96:
                                                                            // 2 sources

                                                                            if (var22_15 == 0) break block67;
                                                                        }
                                                                        catch (MatchException v17) {
                                                                            throw b6.g("\u00e6", (Object)v17, (long)-6309600350505635342L, (long)var3_5);
                                                                        }
                                                                        v18 = new Object[7];
                                                                        v18[6] = var17_11;
                                                                        v18[5] = Float.valueOf(0.0f);
                                                                        v18[4] = Float.valueOf(0.5f);
                                                                        v18[3] = Float.valueOf(1.0f);
                                                                        v18[2] = var2_4;
                                                                        v18[1] = var6_3;
                                                                        v18[0] = var5_2;
                                                                        b6.g("\u00ff", (Object)this, (Object)v18, (long)-6313872300313755549L, (long)var3_5);
                                                                    }
                                                                    catch (MatchException v19) {
                                                                        throw b6.g("\u00e6", (Object)v19, (long)-6309600350505635342L, (long)var3_5);
                                                                    }
                                                                }
                                                                return;
                                                            }
                                                            var23_17 = b6.g("\u00e6", (long)-6312593036677933389L, (long)var3_5);
                                                            try {
                                                                v20 /* !! */  = this.k == b6.d("u", (int)20499, (long)(5941370472885501198L ^ var3_5)) ? 0.0f : (float)b6.g("\u00e6", (float)0.1f, (float)((float)(var23_17 - this.k) / 1000.0f), (long)-6310665148300408771L, (long)var3_5);
                                                            }
                                                            catch (MatchException v21) {
                                                                throw b6.g("\u00e6", (Object)v21, (long)-6309600350505635342L, (long)var3_5);
                                                            }
                                                            var25_18 = v20 /* !! */ ;
                                                            this.k = (long)var23_17;
                                                            v22 = new Object[1];
                                                            v22[0] = var15_10;
                                                            var26_19 = b6.g("\u00ff", (Object)this, (Object)v22, (long)-6309668798295186974L, (long)var3_5);
                                                            try {
                                                                v23 = var26_19;
                                                                if (var21_13 != null) break block68;
                                                                if (v23 == null) break block69;
                                                            }
                                                            catch (MatchException v24) {
                                                                throw b6.g("\u00e6", (Object)v24, (long)-6309600350505635342L, (long)var3_5);
                                                            }
                                                            v23 = var26_19;
                                                        }
                                                        try {
                                                            cfr_temp_0 = v23.a - 0.999f;
                                                            v25 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1);
                                                            if (var21_13 != null) break block70;
                                                            if (v25 >= 0) break block69;
                                                        }
                                                        catch (MatchException v26) {
                                                            throw b6.g("\u00e6", (Object)v26, (long)-6309600350505635342L, (long)var3_5);
                                                        }
                                                        v25 = 1;
                                                        break block70;
                                                    }
                                                    v25 = var27_20 = 0;
                                                }
                                                if (var26_19 != null) {
                                                    var28_21 = 1.0f - (float)b6.g("\u00e6", (double)(-var25_18 * 16.0f), (long)-6310082840326751395L, (long)var3_5);
                                                    this.t += (var26_19.a - this.t) * var28_21;
                                                }
                                                try {
                                                    try {
                                                        try {
                                                            v27 = var27_20;
                                                            if (var21_13 != null) break block71;
                                                            if (v27 == this.q) break block72;
                                                        }
                                                        catch (MatchException v28) {
                                                            throw b6.g("\u00e6", (Object)v28, (long)-6309600350505635342L, (long)var3_5);
                                                        }
                                                        this.o = this.p;
                                                        v29 = this;
                                                        if (var21_13 != null) break block73;
                                                    }
                                                    catch (MatchException v30) {
                                                        throw b6.g("\u00e6", (Object)v30, (long)-6309600350505635342L, (long)var3_5);
                                                    }
                                                    v29.l = (long)var23_17;
                                                    v27 = var27_20;
                                                }
                                                catch (MatchException v31) {
                                                    throw b6.g("\u00e6", (Object)v31, (long)-6309600350505635342L, (long)var3_5);
                                                }
                                            }
                                            try {
                                                try {
                                                    try {
                                                        if (v27 != 0) break block74;
                                                        v29 = this;
                                                        if (var21_13 != null) break block73;
                                                    }
                                                    catch (MatchException v32) {
                                                        throw b6.g("\u00e6", (Object)v32, (long)-6309600350505635342L, (long)var3_5);
                                                    }
                                                    if (!(v29.u > 0.8f)) break block74;
                                                }
                                                catch (MatchException v33) {
                                                    throw b6.g("\u00e6", (Object)v33, (long)-6309600350505635342L, (long)var3_5);
                                                }
                                                this.r = (long)var23_17;
                                            }
                                            catch (MatchException v34) {
                                                throw b6.g("\u00e6", (Object)v34, (long)-6309600350505635342L, (long)var3_5);
                                            }
                                        }
                                        v29 = this;
                                    }
                                    v29.q = var27_20;
                                }
                                try {
                                    if (var26_19 != null) {
                                        this.u = var26_19.a;
                                    }
                                }
                                catch (MatchException v35) {
                                    throw b6.g("\u00e6", (Object)v35, (long)-6309600350505635342L, (long)var3_5);
                                }
                                var28_22 = var23_17 - this.l;
                                if (var27_20 == 0) break block78;
                                var30_23 = b6.g("\u00e6", (float)1.0f, (float)((float)var28_22 / 220.0f), (long)-6310665148300408771L, (long)var3_5);
                                v36 = new Object[2];
                                v36[1] = var19_12;
                                v36[0] = Float.valueOf((float)var30_23);
                                this.p = this.o + (1.0f - this.o) * b6.g("\u00e6", (Object)v36, (long)-6312194607999487203L, (long)var3_5);
                                if (var21_13 == null) break block79;
                            }
                            var30_23 = b6.g("\u00e6", (float)1.0f, (float)((float)var28_22 / 350.0f), (long)-6310665148300408771L, (long)var3_5);
                            v37 = new Object[2];
                            v37[1] = var19_12;
                            v37[0] = Float.valueOf((float)var30_23);
                            this.p = this.o * (1.0f - b6.g("\u00e6", (Object)v37, (long)-6312194607999487203L, (long)var3_5));
                        }
                        try {
                            try {
                                v38 = new Object[2];
                                v38[1] = var13_9;
                                v38[0] = Float.valueOf(this.p);
                                this.p = (float)b6.g("\u00e6", (Object)v38, (long)-6307267436693030303L, (long)var3_5);
                                v39 = var22_15;
                                if (var21_13 != null) break block75;
                                if (v39 == 0) break block76;
                            }
                            catch (MatchException v40) {
                                throw b6.g("\u00e6", (Object)v40, (long)-6309600350505635342L, (long)var3_5);
                            }
                            v41 = new Object[7];
                            v41[6] = var17_11;
                            v41[5] = Float.valueOf(0.0f);
                            v41[4] = Float.valueOf((float)b6.g("\u00e6", (float)this.t, (float)0.5f, (long)-6311219712591861073L, (long)var3_5));
                            v41[3] = Float.valueOf(1.0f);
                            v41[2] = var2_4;
                            v41[1] = var6_3;
                            v41[0] = var5_2;
                            b6.g("\u00ff", (Object)this, (Object)v41, (long)-6313872300313755549L, (long)var3_5);
                            return;
                        }
                        catch (MatchException v42) {
                            throw b6.g("\u00e6", (Object)v42, (long)-6309600350505635342L, (long)var3_5);
                        }
                    }
                    v43 = new Object[2];
                    v43[1] = var13_9;
                    v43[0] = Float.valueOf((float)(var23_17 - this.r) / 280.0f);
                    v44 = new Object[2];
                    v44[1] = var19_12;
                    v44[0] = Float.valueOf(1.0f - b6.g("\u00e6", (Object)v43, (long)-6307267436693030303L, (long)var3_5));
                    var30_23 = b6.g("\u00e6", (Object)v44, (long)-6312194607999487203L, (long)var3_5);
                    try {
                        v45 = this;
                        if (var21_13 != null) break block77;
                        cfr_temp_1 = v45.p - 0.01f;
                        v39 = cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 > 0.0f ? 1 : -1);
                    }
                    catch (MatchException v46) {
                        throw b6.g("\u00e6", (Object)v46, (long)-6309600350505635342L, (long)var3_5);
                    }
                }
                if (v39 <= 0) break block80;
                v45 = this;
            }
            v47 = new Object[7];
            v47[6] = var17_11;
            v47[5] = Float.valueOf((float)var30_23);
            v47[4] = Float.valueOf(this.t);
            v47[3] = Float.valueOf(this.p);
            v47[2] = var2_4;
            v47[1] = var6_3;
            v47[0] = var5_2;
            b6.g("\u00ff", (Object)v45, (Object)v47, (long)-6313872300313755549L, (long)var3_5);
        }
    }

    private static long d(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4569;
        if (I[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = H[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])J.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    J.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/b6", exception);
            }
            long l4 = ((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL;
            b6.I[n2] = l4;
        }
        return I[n2];
    }

    private static long d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = b6.d(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Long.TYPE, l2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return l2;
    }

    private static float d(Object[] objectArray) {
        float f;
        float f10;
        block11: {
            float f11;
            long l;
            float f12;
            block9: {
                CallSite callSite;
                block10: {
                    f12 = ((Float)objectArray[0]).floatValue();
                    l = (Long)objectArray[1];
                    l = v ^ l;
                    callSite = b6.g("\u00e6", (long)-3075555209043249507L, (long)l);
                    try {
                        try {
                            float f13 = f12 - 0.0f;
                            f11 = f13 == 0.0f ? 0 : (f13 < 0.0f ? -1 : 1);
                            if (callSite != null) break block9;
                            if (f11 > 0) break block10;
                        }
                        catch (MatchException matchException) {
                            throw b6.g("\u00e6", (Object)matchException, (long)-3072032732234117952L, (long)l);
                        }
                        return 0.0f;
                    }
                    catch (MatchException matchException) {
                        throw b6.g("\u00e6", (Object)matchException, (long)-3072032732234117952L, (long)l);
                    }
                }
                try {
                    f10 = f12;
                    f = 1.0f;
                    if (callSite != null) break block11;
                    float f14 = f10 - f;
                    f11 = f14 == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1);
                }
                catch (MatchException matchException) {
                    throw b6.g("\u00e6", (Object)matchException, (long)-3072032732234117952L, (long)l);
                }
            }
            try {
                if (f11 >= 0) {
                    return 1.0f;
                }
            }
            catch (MatchException matchException) {
                throw b6.g("\u00e6", (Object)matchException, (long)-3072032732234117952L, (long)l);
            }
            f10 = f12 * f12 * f12;
            f = f12 * (f12 * 6.0f - 15.0f) + 10.0f;
        }
        return f10 * f;
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/b6" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private ay_0 a(Object[] objectArray) {
        CallSite callSite;
        CallSite callSite2;
        CallSite callSite3;
        long l;
        block26: {
            long l2;
            block27: {
                CallSite callSite4;
                long l3;
                block19: {
                    Object object;
                    block24: {
                        CallSite callSite5;
                        block25: {
                            block22: {
                                block23: {
                                    block21: {
                                        CallSite callSite6;
                                        block20: {
                                            CallSite callSite7;
                                            block18: {
                                                l = (Long)objectArray[0];
                                                long l4 = l = v ^ l;
                                                l3 = l4 ^ 0x5EB7EC9E03C0L;
                                                long l5 = l4 ^ 0x7A0FFB71B6D4L;
                                                l2 = l4 ^ 0x748D488A11CDL;
                                                Object[] objectArray2 = new Object[1];
                                                objectArray2[0] = l5;
                                                callSite3 = b6.g("\u00e6", (Object)objectArray2, (long)2361658081293278489L, (long)l);
                                                callSite4 = b6.g("\u00e6", (long)2360550169011553038L, (long)l);
                                                try {
                                                    try {
                                                        callSite7 = b6.g("\u00b5", (Object)b, (long)2366707123331219882L, (long)l);
                                                        if (callSite4 != null) break block18;
                                                        if (b6.g("\u00ff", (Object)callSite7, (long)2362067854010057218L, (long)l) == false) break block19;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw b6.g("\u00e6", (Object)matchException, (long)2364046256636164435L, (long)l);
                                                    }
                                                    callSite7 = b6.g("\u00b5", (Object)b, (long)2366707123331219882L, (long)l);
                                                }
                                                catch (MatchException matchException) {
                                                    throw b6.g("\u00e6", (Object)matchException, (long)2364046256636164435L, (long)l);
                                                }
                                            }
                                            callSite5 = b6.g("\u00ff", (Object)callSite7, (long)2360653406559988674L, (long)l);
                                            try {
                                                callSite6 = callSite5;
                                                if (callSite4 != null) break block20;
                                                if (callSite6 == null) break block19;
                                            }
                                            catch (MatchException matchException) {
                                                throw b6.g("\u00e6", (Object)matchException, (long)2364046256636164435L, (long)l);
                                            }
                                            callSite6 = callSite5;
                                        }
                                        try {
                                            try {
                                                object = b6.g("\u00ff", (Object)callSite6, (long)2360109018321636018L, (long)l);
                                                if (callSite4 != null) break block21;
                                                if (object != false) break block19;
                                            }
                                            catch (MatchException matchException) {
                                                throw b6.g("\u00e6", (Object)matchException, (long)2364046256636164435L, (long)l);
                                            }
                                            object = b6.g("\u00ff", (Object)callSite5, (long)2360017987044895080L, (long)l) instanceof class_1753;
                                        }
                                        catch (MatchException matchException) {
                                            throw b6.g("\u00e6", (Object)matchException, (long)2364046256636164435L, (long)l);
                                        }
                                    }
                                    try {
                                        if (callSite4 != null) break block22;
                                        if (object == false) break block23;
                                    }
                                    catch (MatchException matchException) {
                                        throw b6.g("\u00e6", (Object)matchException, (long)2364046256636164435L, (long)l);
                                    }
                                    ay_0 ay_02 = new ay_0();
                                    ay_02.a = (float)b6.g("\u00e6", (float)1.0f, (float)(((float)b6.g("\u00ff", (Object)b6.g("\u00b5", (Object)b, (long)2366707123331219882L, (long)l), (long)2361925774592741469L, (long)l) + callSite3) / 20.0f), (long)2363561979975581852L, (long)l);
                                    return ay_02;
                                }
                                object = b6.g("\u00ff", (Object)callSite5, (long)2360017987044895080L, (long)l) instanceof class_1764;
                            }
                            try {
                                if (callSite4 != null) break block24;
                                if (object == false) break block25;
                            }
                            catch (MatchException matchException) {
                                throw b6.g("\u00e6", (Object)matchException, (long)2364046256636164435L, (long)l);
                            }
                            ay_0 ay_03 = new ay_0();
                            CallSite callSite8 = b6.g("\u00e6", (int)1, (int)b6.g("\u00e6", (Object)callSite5, (Object)b6.g("\u00b5", (Object)b, (long)2366707123331219882L, (long)l), (long)2360062418843800126L, (long)l), (long)2360189777062372217L, (long)l);
                            ay_03.a = (float)b6.g("\u00e6", (float)1.0f, (float)(((float)b6.g("\u00ff", (Object)b6.g("\u00b5", (Object)b, (long)2366707123331219882L, (long)l), (long)2361925774592741469L, (long)l) + callSite3) / (float)callSite8), (long)2363561979975581852L, (long)l);
                            return ay_03;
                        }
                        object = b6.g("\u00ff", (Object)callSite5, (long)2360017987044895080L, (long)l) instanceof class_1835;
                    }
                    if (object != false) {
                        ay_0 ay_04 = new ay_0();
                        ay_04.a = (float)b6.g("\u00e6", (float)1.0f, (float)(((float)b6.g("\u00ff", (Object)b6.g("\u00b5", (Object)b, (long)2366707123331219882L, (long)l), (long)2361925774592741469L, (long)l) + callSite3) / 10.0f), (long)2363561979975581852L, (long)l);
                        return ay_04;
                    }
                }
                Object[] objectArray3 = new Object[3];
                objectArray3[2] = l3;
                objectArray3[1] = Float.valueOf((float)callSite3);
                objectArray3[0] = b6.g("\u00ff", (Object)b6.g("\u00b5", (Object)b, (long)2366707123331219882L, (long)l), (long)2364350557187402762L, (long)l);
                CallSite callSite9 = b6.g("\u00ff", (Object)this, (Object)objectArray3, (long)2364235268854713981L, (long)l);
                Object[] objectArray4 = new Object[3];
                objectArray4[2] = l3;
                objectArray4[1] = Float.valueOf((float)callSite3);
                objectArray4[0] = b6.g("\u00ff", (Object)b6.g("\u00b5", (Object)b, (long)2366707123331219882L, (long)l), (long)2363490006862927023L, (long)l);
                CallSite callSite10 = b6.g("\u00ff", (Object)this, (Object)objectArray4, (long)2364235268854713981L, (long)l);
                reference var14_15 = b6.g("\u00e6", (float)callSite9, (float)callSite10, (long)2362990670144692750L, (long)l);
                try {
                    reference cfr_temp_0 = var14_15 - 0.001f;
                    callSite2 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 > 0 ? 1 : -1);
                    if (callSite4 != null) break block26;
                    if (callSite2 <= 0) break block27;
                }
                catch (MatchException matchException) {
                    throw b6.g("\u00e6", (Object)matchException, (long)2364046256636164435L, (long)l);
                }
                ay_0 ay_05 = new ay_0();
                ay_05.a = 1.0f - var14_15;
                return ay_05;
            }
            Object[] objectArray5 = new Object[2];
            objectArray5[1] = l2;
            objectArray5[0] = b6.g("\u00ff", (Object)b6.g("\u00b5", (Object)b, (long)2366707123331219882L, (long)l), (long)2364350557187402762L, (long)l);
            callSite2 = b6.g("\u00ff", (Object)this, (Object)objectArray5, (long)2361629312215306978L, (long)l);
        }
        if (callSite2 != false && (callSite = b6.g("\u00ff", (Object)b6.g("\u00b5", (Object)b, (long)2366707123331219882L, (long)l), (float)callSite3, (long)2361183585490544241L, (long)l)) < 1.0f) {
            ay_0 ay_06 = new ay_0();
            ay_06.a = (float)callSite;
            return ay_06;
        }
        return null;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    private static Color a(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        long l = (Long)objectArray[1];
        long l2 = l = v ^ l;
        long l3 = l2 ^ 0x704A17E06853L;
        long l4 = l2 ^ 0x6A4DD4E8E6FFL;
        long l5 = l2 ^ 0x597A9582DBB5L;
        long l6 = l2 ^ 0x3C1E0179F30BL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        CallSite callSite = b6.g("\u00e6", (Object)objectArray2, (long)6661500988639042686L, (long)l);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l4;
        objectArray3[0] = Float.valueOf(f / 0.75f);
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = l5;
        objectArray4[0] = Float.valueOf((float)b6.g("\u00e6", (Object)objectArray3, (long)6659553567034576498L, (long)l));
        float f10 = 0.55f + 0.45f * b6.g("\u00e6", (Object)objectArray4, (long)6662509894064670478L, (long)l);
        Color color = new Color((int)((float)b6.g("\u00ff", (Object)callSite, (long)6661032763624403466L, (long)l) * f10), (int)((float)b6.g("\u00ff", (Object)callSite, (long)6659617911905738952L, (long)l) * f10), (int)((float)b6.g("\u00ff", (Object)callSite, (long)6664985550546004449L, (long)l) * f10));
        Object[] objectArray5 = new Object[2];
        objectArray5[1] = l4;
        objectArray5[0] = Float.valueOf((f - 0.88f) / 0.12f);
        Object[] objectArray6 = new Object[2];
        objectArray6[1] = l5;
        objectArray6[0] = Float.valueOf((float)b6.g("\u00e6", (Object)objectArray5, (long)6659553567034576498L, (long)l));
        CallSite callSite2 = b6.g("\u00e6", (Object)objectArray6, (long)6662509894064670478L, (long)l);
        Object[] objectArray7 = new Object[4];
        objectArray7[3] = l6;
        objectArray7[2] = Float.valueOf((float)(callSite2 * 0.65f));
        objectArray7[1] = b6.g("\u00aa", (long)6665291713999957869L, (long)l);
        objectArray7[0] = color;
        return b6.g("\u00e6", (Object)objectArray7, (long)6662815032042052097L, (long)l);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/b6" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = b6.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7B7B;
        if (x[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])y.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    y.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/b6", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = w[n2].getBytes("ISO-8859-1");
            b6.x[n2] = b6.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return x[n2];
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void m(Object[] var1_1) {
        block9: {
            block8: {
                var2_2 = (Long)var1_1[0];
                v0 = var2_2;
                var4_3 = v0 ^ 111341298698524L;
                var6_4 = v0 ^ 115520954206759L;
                var8_5 = b6.g("\u00e6", (long)-3383295725047450944L, (long)var2_2);
                try {
                    try {
                        v1 = b6.g("\u00ff", (Object)b6.b, (long)-3380021077091226269L, (long)var2_2);
                        if (var8_5 != null) break block8;
                        if (v1 != null) {
                        }
                        ** GOTO lbl38
                    }
                    catch (MatchException v2) {
                        throw b6.g("\u00e6", (Object)v2, (long)-3386563836713826147L, (long)var2_2);
                    }
                    v1 = b6.g("\u00ff", (Object)b6.b, (long)-3380021077091226269L, (long)var2_2);
                }
                catch (MatchException v3) {
                    throw b6.g("\u00e6", (Object)v3, (long)-3386563836713826147L, (long)var2_2);
                }
            }
            v4 = new Object[1];
            v4[0] = var4_3;
            var9_6 = (float)b6.g("\u00ff", (Object)v1, (long)-3382811751549860115L, (long)var2_2) / b6.g("\u00e6", (Object)v4, (long)-3380272188813500563L, (long)var2_2);
            v5 = new Object[1];
            v5[0] = var4_3;
            var10_7 = (float)b6.g("\u00ff", (Object)b6.g("\u00ff", (Object)b6.b, (long)-3380021077091226269L, (long)var2_2), (long)-3385835663771053456L, (long)var2_2) / b6.g("\u00e6", (Object)v5, (long)-3380272188813500563L, (long)var2_2);
            try {
                v6 = new Object[3];
                v6[2] = var6_4;
                v6[1] = Float.valueOf(var10_7 / 2.0f + 14.0f);
                v6[0] = Float.valueOf(var9_6 / 2.0f - 14.0f);
                b6.g("\u00ff", (Object)this, (Object)v6, (long)-3384258381972889473L, (long)var2_2);
                if (var8_5 == null) break block9;
lbl38:
                // 2 sources

                v7 = new Object[3];
                v7[2] = var6_4;
                v7[1] = Float.valueOf(110.0f);
                v7[0] = Float.valueOf(150.0f);
                b6.g("\u00ff", (Object)this, (Object)v7, (long)-3384258381972889473L, (long)var2_2);
            }
            catch (MatchException v8) {
                throw b6.g("\u00e6", (Object)v8, (long)-3386563836713826147L, (long)var2_2);
            }
        }
    }

    private static Field k(long l, long l2) {
        int n = b6.i(l, l2);
        Object object = K[n];
        if (object instanceof String) {
            String string = L[n];
            int n2 = string.indexOf(8);
            Class clazz = b6.j(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = b6.j(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = b6.e(clazz3, string2, clazz2)) != null) {
                    b6.K[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = b6.f(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        b6.K[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = b6.j(3438449671835798L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private void t(Object[] objectArray) {
        block38: {
            float f;
            float f10;
            float f11;
            float f12;
            long l;
            long l2;
            Matrix4f matrix4f;
            gK gK2;
            aq_0 aq_02;
            block37: {
                CallSite callSite;
                float f13;
                float f14;
                block35: {
                    float f15;
                    block36: {
                        float f16;
                        float f17;
                        long l3;
                        long l4;
                        long l5;
                        float f18;
                        block33: {
                            CallSite callSite2;
                            block34: {
                                float f19;
                                float f20;
                                long l6;
                                block31: {
                                    block32: {
                                        aq_02 = (aq_0)objectArray[0];
                                        gK2 = (gK)objectArray[1];
                                        matrix4f = (Matrix4f)objectArray[2];
                                        f14 = ((Float)objectArray[3]).floatValue();
                                        f18 = ((Float)objectArray[4]).floatValue();
                                        f13 = ((Float)objectArray[5]).floatValue();
                                        l2 = (Long)objectArray[6];
                                        long l7 = l2 = v ^ l2;
                                        l = l7 ^ 0x3CC4032485B8L;
                                        l6 = l7 ^ 0x1206ED770803L;
                                        l5 = l7 ^ 0x24A051405790L;
                                        l4 = l7 ^ 0x1BC2D032B289L;
                                        l3 = l7 ^ 0x11AC2548F60FL;
                                        f12 = 1.5f;
                                        callSite = b6.g("\u00e6", (long)6445797925327829688L, (long)l2);
                                        f11 = 28.0f * f14;
                                        try {
                                            try {
                                                float f19 = f11;
                                                f19 = 0.5f;
                                                if (callSite != null) break block31;
                                                if (!(f20 < f19)) break block32;
                                            }
                                            catch (MatchException matchException) {
                                                throw b6.g("\u00e6", (Object)matchException, (long)6447060489264595173L, (long)l2);
                                            }
                                            return;
                                        }
                                        catch (MatchException matchException) {
                                            throw b6.g("\u00e6", (Object)matchException, (long)6447060489264595173L, (long)l2);
                                        }
                                    }
                                    float f19 = this.e;
                                    f19 = (28.0f - f11) * 0.5f;
                                }
                                f10 = f20 + f19;
                                Object[] objectArray2 = new Object[3];
                                objectArray2[2] = l4;
                                objectArray2[1] = Float.valueOf(f14);
                                objectArray2[0] = cn_0.r;
                                callSite2 = b6.g("\u00e6", (Object)objectArray2, (long)6446085927748554265L, (long)l2);
                                try {
                                    try {
                                        float f16 = f14;
                                        f16 = 0.7f;
                                        if (callSite != null) break block33;
                                        if (!(f17 > f16)) break block34;
                                    }
                                    catch (MatchException matchException) {
                                        throw b6.g("\u00e6", (Object)matchException, (long)6447060489264595173L, (long)l2);
                                    }
                                    Object[] objectArray3 = new Object[10];
                                    objectArray3[9] = l6;
                                    objectArray3[8] = Float.valueOf(f12);
                                    objectArray3[7] = 5;
                                    objectArray3[6] = Float.valueOf(3.0f);
                                    objectArray3[5] = Float.valueOf(f11);
                                    objectArray3[4] = Float.valueOf(this.f);
                                    objectArray3[3] = Float.valueOf(f10);
                                    objectArray3[2] = matrix4f;
                                    objectArray3[1] = gK2;
                                    objectArray3[0] = aq_02;
                                    b6.g("\u00e6", (Object)objectArray3, (long)6448338103528446498L, (long)l2);
                                }
                                catch (MatchException matchException) {
                                    throw b6.g("\u00e6", (Object)matchException, (long)6447060489264595173L, (long)l2);
                                }
                            }
                            Object[] objectArray4 = new Object[10];
                            objectArray4[9] = l;
                            objectArray4[8] = Float.valueOf(f12);
                            objectArray4[7] = callSite2;
                            objectArray4[6] = Float.valueOf(3.0f);
                            objectArray4[5] = Float.valueOf(f11);
                            objectArray4[4] = Float.valueOf(this.f);
                            objectArray4[3] = Float.valueOf(f10);
                            objectArray4[2] = matrix4f;
                            objectArray4[1] = gK2;
                            objectArray4[0] = aq_02;
                            b6.g("\u00e6", (Object)objectArray4, (long)6445718315686373990L, (long)l2);
                            float f16 = f11;
                            f16 = 1.0f;
                        }
                        float f21 = f17 - f16;
                        float f22 = 2.0f;
                        float f23 = f22 * 0.5f;
                        try {
                            try {
                                try {
                                    float f = f18 - 0.001f;
                                    f = f == 0.0f ? 0 : (f > 0.0f ? 1 : -1);
                                    if (callSite != null) break block35;
                                    if (f <= 0) break block36;
                                }
                                catch (MatchException matchException) {
                                    throw b6.g("\u00e6", (Object)matchException, (long)6447060489264595173L, (long)l2);
                                }
                                float f = f21 - 1.0f;
                                f = f == 0.0f ? 0 : (f > 0.0f ? 1 : -1);
                                if (callSite != null) break block35;
                            }
                            catch (MatchException matchException) {
                                throw b6.g("\u00e6", (Object)matchException, (long)6447060489264595173L, (long)l2);
                            }
                            if (f <= 0) break block36;
                        }
                        catch (MatchException matchException) {
                            throw b6.g("\u00e6", (Object)matchException, (long)6447060489264595173L, (long)l2);
                        }
                        reference var28_22 = b6.g("\u00e6", (float)1.0f, (float)f18, (long)6447826224258562346L, (long)l2);
                        Object[] objectArray5 = new Object[2];
                        objectArray5[1] = l5;
                        objectArray5[0] = Float.valueOf((float)var28_22);
                        CallSite callSite3 = b6.g("\u00e6", (Object)objectArray5, (long)6445862110893589142L, (long)l2);
                        float f26 = f21 * var28_22;
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            f = f26 == f22 ? 0 : (f26 > f22 ? 1 : -1);
                                            if (callSite != null) break block35;
                                            if (f <= 0) break block36;
                                        }
                                        catch (MatchException matchException) {
                                            throw b6.g("\u00e6", (Object)matchException, (long)6447060489264595173L, (long)l2);
                                        }
                                        Object[] objectArray6 = new Object[3];
                                        objectArray6[2] = l4;
                                        objectArray6[1] = Float.valueOf(f14);
                                        objectArray6[0] = callSite3;
                                        Object[] objectArray7 = new Object[10];
                                        objectArray7[9] = l;
                                        objectArray7[8] = Float.valueOf(f23);
                                        objectArray7[7] = b6.g("\u00e6", (Object)objectArray6, (long)6446085927748554265L, (long)l2);
                                        objectArray7[6] = Float.valueOf(f22);
                                        objectArray7[5] = Float.valueOf(f26);
                                        objectArray7[4] = Float.valueOf(this.f + 0.5f);
                                        objectArray7[3] = Float.valueOf(f10 + 0.5f);
                                        objectArray7[2] = matrix4f;
                                        objectArray7[1] = gK2;
                                        objectArray7[0] = aq_02;
                                        b6.g("\u00e6", (Object)objectArray7, (long)6445718315686373990L, (long)l2);
                                        reference cfr_temp_2 = var28_22 - 0.995f;
                                        f = cfr_temp_2 == 0 ? 0 : (cfr_temp_2 < 0 ? -1 : 1);
                                        if (callSite != null) break block35;
                                    }
                                    catch (MatchException matchException) {
                                        throw b6.g("\u00e6", (Object)matchException, (long)6447060489264595173L, (long)l2);
                                    }
                                    if (f >= 0) break block36;
                                }
                                catch (MatchException matchException) {
                                    throw b6.g("\u00e6", (Object)matchException, (long)6447060489264595173L, (long)l2);
                                }
                                float f = f26 - 3.0f;
                                f = f == 0.0f ? 0 : (f > 0.0f ? 1 : -1);
                                if (callSite != null) break block35;
                            }
                            catch (MatchException matchException) {
                                throw b6.g("\u00e6", (Object)matchException, (long)6447060489264595173L, (long)l2);
                            }
                            if (f <= 0) break block36;
                        }
                        catch (MatchException matchException) {
                            throw b6.g("\u00e6", (Object)matchException, (long)6447060489264595173L, (long)l2);
                        }
                        Object[] objectArray8 = new Object[4];
                        objectArray8[3] = l3;
                        objectArray8[2] = Float.valueOf(0.75f);
                        objectArray8[1] = b6.g("\u00aa", (long)6448014257239059049L, (long)l2);
                        objectArray8[0] = callSite3;
                        Object[] objectArray9 = new Object[3];
                        objectArray9[2] = l4;
                        objectArray9[1] = Float.valueOf(f14 * 0.9f);
                        objectArray9[0] = b6.g("\u00e6", (Object)objectArray8, (long)6445565080113176325L, (long)l2);
                        CallSite callSite4 = b6.g("\u00e6", (Object)objectArray9, (long)6446085927748554265L, (long)l2);
                        Object[] objectArray10 = new Object[10];
                        objectArray10[9] = l;
                        objectArray10[8] = Float.valueOf(f23);
                        objectArray10[7] = callSite4;
                        objectArray10[6] = Float.valueOf(f22);
                        objectArray10[5] = Float.valueOf(1.5f);
                        objectArray10[4] = Float.valueOf(this.f + 0.5f);
                        objectArray10[3] = Float.valueOf(f10 + 0.5f + f26 - 1.5f);
                        objectArray10[2] = matrix4f;
                        objectArray10[1] = gK2;
                        objectArray10[0] = aq_02;
                        b6.g("\u00e6", (Object)objectArray10, (long)6445718315686373990L, (long)l2);
                    }
                    f = (f15 = f13 - 0.01f) == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1);
                }
                try {
                    try {
                        if (callSite != null) break block37;
                        if (f <= 0) break block38;
                    }
                    catch (MatchException matchException) {
                        throw b6.g("\u00e6", (Object)matchException, (long)6447060489264595173L, (long)l2);
                    }
                    f = (float)b6.g("\u00e6", (int)b6.c("q", (int)4432, (long)(0x69106039193FC196L ^ l2)), (int)((int)(170.0f * f13 * f14)), (long)6446236457504757859L, (long)l2);
                }
                catch (MatchException matchException) {
                    throw b6.g("\u00e6", (Object)matchException, (long)6447060489264595173L, (long)l2);
                }
            }
            float f28 = f;
            try {
                if (f28 > 2) {
                    Object[] objectArray11 = new Object[10];
                    objectArray11[9] = l;
                    objectArray11[8] = Float.valueOf(f12);
                    objectArray11[7] = new Color((int)b6.c("q", (int)32350, (long)(0x78238DE7310F2E99L ^ l2)), (int)b6.c("q", (int)32350, (long)(0x78238DE7310F2E99L ^ l2)), (int)b6.c("q", (int)32350, (long)(0x78238DE7310F2E99L ^ l2)), (int)f28);
                    objectArray11[6] = Float.valueOf(3.0f);
                    objectArray11[5] = Float.valueOf(f11);
                    objectArray11[4] = Float.valueOf(this.f);
                    objectArray11[3] = Float.valueOf(f10);
                    objectArray11[2] = matrix4f;
                    objectArray11[1] = gK2;
                    objectArray11[0] = aq_02;
                    b6.g("\u00e6", (Object)objectArray11, (long)6445718315686373990L, (long)l2);
                }
            }
            catch (MatchException matchException) {
                throw b6.g("\u00e6", (Object)matchException, (long)6447060489264595173L, (long)l2);
            }
        }
    }

    private static CallSite g(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_3().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/b6" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class j(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = b6.i(l, l2);
            object = K[n];
            try {
                if (!(object instanceof String)) break block2;
                b6.K[n] = clazz = Class.forName(L[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    @Override
    public void j(Object[] objectArray) {
        block8: {
            b6 b62;
            long l;
            long l2;
            block6: {
                l2 = (Long)objectArray[0];
                long l3 = l2;
                l = l3 ^ 0x67410BEAD87L;
                long l4 = l3 ^ 0x4C881D5D779L;
                long l5 = l3 ^ 0L;
                long l6 = l3 ^ 0x3233ED122206L;
                CallSite callSite = b6.g("\u00e6", (long)-8963255468004827056L, (long)l2);
                Object[] objectArray2 = new Object[1];
                objectArray2[0] = l5;
                super.j(objectArray2);
                CallSite callSite2 = callSite;
                try {
                    block7: {
                        try {
                            try {
                                b62 = this;
                                if (callSite2 != null) break block6;
                                Object[] objectArray3 = new Object[1];
                                objectArray3[0] = l6;
                                if (b6.g("\u00ff", (Object)b62, (Object)objectArray3, (long)-8962897369237300860L, (long)l2) == false) break block7;
                            }
                            catch (MatchException matchException) {
                                throw b6.g("\u00e6", (Object)matchException, (long)-8966522888317216243L, (long)l2);
                            }
                            Object[] objectArray4 = new Object[1];
                            objectArray4[0] = l4;
                            b6.g("\u00ff", (Object)this, (Object)objectArray4, (long)-8963378186217395228L, (long)l2);
                            if (callSite2 == null) break block8;
                        }
                        catch (MatchException matchException) {
                            throw b6.g("\u00e6", (Object)matchException, (long)-8966522888317216243L, (long)l2);
                        }
                    }
                    b62 = this;
                }
                catch (MatchException matchException) {
                    throw b6.g("\u00e6", (Object)matchException, (long)-8966522888317216243L, (long)l2);
                }
            }
            Object[] objectArray5 = new Object[1];
            objectArray5[0] = l;
            b6.g("\u00ff", (Object)b62, (Object)objectArray5, (long)-8964171482320955572L, (long)l2);
        }
    }

    /*
     * Unable to fully structure code
     */
    private void r(Object[] var1_1) {
        block8: {
            block9: {
                var2_2 = (Long)var1_1[0];
                var2_2 = b6.v ^ var2_2;
                var4_3 = b6.g("\u00e6", (long)464173672020190653L, (long)var2_2);
                if (b6.g("\u00b5", (Object)b6.b, (long)467637251818122445L, (long)var2_2) == null) ** GOTO lbl19
                v0 = this;
                if (var4_3 != null) ** GOTO lbl28
                break block9;
                catch (Throwable v1) {
                    throw b6.g("\u00e6", (Object)v1, (long)467687348609867744L, (long)var2_2);
                }
            }
            try {
                block10: {
                    if (!v0.n) break block8;
                    break block10;
                    catch (Throwable v2) {
                        throw b6.g("\u00e6", (Object)v2, (long)467687348609867744L, (long)var2_2);
                    }
                }
                return;
            }
            catch (Throwable v3) {
                throw b6.g("\u00e6", (Object)v3, (long)467687348609867744L, (long)var2_2);
            }
        }
        try {
            this.j = (class_4061)b6.g("\u00ff", (Object)b6.g("\u00ff", (Object)b6.g("\u00b5", (Object)b6.b, (long)467637251818122445L, (long)var2_2), (long)465894438950195024L, (long)var2_2), (long)468171298280965328L, (long)var2_2);
            b6.g("\u00ff", (Object)b6.g("\u00ff", (Object)b6.g("\u00b5", (Object)b6.b, (long)467637251818122445L, (long)var2_2), (long)465894438950195024L, (long)var2_2), (Object)b6.g("\u00aa", (long)467524173460234250L, (long)var2_2), (long)462477565933264357L, (long)var2_2);
            v0 = this;
lbl28:
            // 2 sources

            v0.n = 1;
        }
        catch (Throwable var5_4) {
            // empty catch block
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(b6.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(b6.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)J", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_2() {
        try {
            return MethodHandles.lookup().findStatic(b6.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_3() {
        try {
            return MethodHandles.lookup().findStatic(b6.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix4f
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.aq_0;
import dev.zprestige.prestige.b4;
import dev.zprestige.prestige.cn_0;
import dev.zprestige.prestige.dV;
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.joml.Matrix4f;

/*
 * Renamed from dev.zprestige.prestige.ca
 */
public class ca_0
extends b4 {
    private final Map a;
    private final Map c;
    private final Map d;
    private static long i;
    private static float m;
    private static final float j = 500.0f;
    private static final float k = 1.0f;
    private float l;
    private float o;
    private static final long v;
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

    public ca_0(long l) {
        long l2 = (l = v ^ l) ^ 0x463F6456D545L;
        super((String)((Object)ca_0.a("f", (int)11144, (long)(0x581488C21AF7888L ^ l))), (String)((Object)ca_0.a("f", (int)19165, (long)(0xADF71E886CA19DCL ^ l))), l2);
        this.a = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.l = 0.0f;
        this.o = 0.0f;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        v = hc.a(-4159935644235832373L, 199137829490751926L, MethodHandles.lookup().lookupClass()).a(263233705673171L);
        long l = v ^ 0x5F14D2AA2E44L;
        K = new Object[109];
        L = new String[109];
        ca_0.b();
        y = new HashMap(13);
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
        String string = "\u00a4\u0010\u0088\u00f0\u00cf\u0090\u009b\u00bd\u009b\u009c0o\u0087\r\u00af5\u0012\u0012&.[S\u00d5\u0019\u001d\u00a3 \u00b0}9\u0086^Ik\u00dbb\u0011\u008cw\u00a8\u00e0\u008ar\u00f5zQI/\u00cb\u00c99\u00c3K\u00fc`\u00f7\u008e$ns:\u00b91\u00cd 3\u00d8\u001aq\u000f\u00bc\u009b\u00e2\u000e\u00f0\u0007\u0081piCA\u00a78\u00eaMd|\u00f1\u00d4\u001e\u00c5\u00f6\u008e\u0016N\u00a5/";
        int n2 = "\u00a4\u0010\u0088\u00f0\u00cf\u0090\u009b\u00bd\u009b\u009c0o\u0087\r\u00af5\u0012\u0012&.[S\u00d5\u0019\u001d\u00a3 \u00b0}9\u0086^Ik\u00dbb\u0011\u008cw\u00a8\u00e0\u008ar\u00f5zQI/\u00cb\u00c99\u00c3K\u00fc`\u00f7\u008e$ns:\u00b91\u00cd 3\u00d8\u001aq\u000f\u00bc\u009b\u00e2\u000e\u00f0\u0007\u0081piCA\u00a78\u00eaMd|\u00f1\u00d4\u001e\u00c5\u00f6\u008e\u0016N\u00a5/".length();
        int n3 = 64;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = ca_0.b(byArray3).intern();
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
        long[] lArray = new long[3];
        int n6 = 0;
        String string2 = "z\u00c5\u00e2M\u00a5:\u0086<\u000f\u009f\u007f\u00ee\u00cc\u00eb7+\u00d4\u00f9\u0006\u00bd\u00fa6\u00f3-";
        int n7 = "z\u00c5\u00e2M\u00a5:\u0086<\u000f\u009f\u007f\u00ee\u00cc\u00eb7+\u00d4\u00f9\u0006\u00bd\u00fa6\u00f3-".length();
        int n8 = 0;
        do {
            byte[] byArray6 = string2.substring(n8, n8 += 8).getBytes("ISO-8859-1");
            int n9 = n6++;
            long l2 = ((long)byArray6[0] & 0xFFL) << 56 | ((long)byArray6[1] & 0xFFL) << 48 | ((long)byArray6[2] & 0xFFL) << 40 | ((long)byArray6[3] & 0xFFL) << 32 | ((long)byArray6[4] & 0xFFL) << 24 | ((long)byArray6[5] & 0xFFL) << 16 | ((long)byArray6[6] & 0xFFL) << 8 | (long)byArray6[7] & 0xFFL;
            byte[] byArray7 = cipher2.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n9] = ((long)byArray7[0] & 0xFFL) << 56 | ((long)byArray7[1] & 0xFFL) << 48 | ((long)byArray7[2] & 0xFFL) << 40 | ((long)byArray7[3] & 0xFFL) << 32 | ((long)byArray7[4] & 0xFFL) << 24 | ((long)byArray7[5] & 0xFFL) << 16 | ((long)byArray7[6] & 0xFFL) << 8 | (long)byArray7[7] & 0xFFL;
        } while (n8 < n7);
        B = lArray;
        C = new Integer[3];
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
        long[] lArray2 = new long[2];
        int n10 = 0;
        String string3 = "\u00d8\u00e5\u00d7O\u00a1\u001bbk\u00860]X\u00aeH\u00fa\u0000";
        int n11 = "\u00d8\u00e5\u00d7O\u00a1\u001bbk\u00860]X\u00aeH\u00fa\u0000".length();
        int n12 = 0;
        do {
            byte[] byArray10 = string3.substring(n12, n12 += 8).getBytes("ISO-8859-1");
            int n13 = n10++;
            long l3 = ((long)byArray10[0] & 0xFFL) << 56 | ((long)byArray10[1] & 0xFFL) << 48 | ((long)byArray10[2] & 0xFFL) << 40 | ((long)byArray10[3] & 0xFFL) << 32 | ((long)byArray10[4] & 0xFFL) << 24 | ((long)byArray10[5] & 0xFFL) << 16 | ((long)byArray10[6] & 0xFFL) << 8 | (long)byArray10[7] & 0xFFL;
            byte[] byArray11 = cipher3.doFinal(new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3});
            lArray2[n13] = ((long)byArray11[0] & 0xFFL) << 56 | ((long)byArray11[1] & 0xFFL) << 48 | ((long)byArray11[2] & 0xFFL) << 40 | ((long)byArray11[3] & 0xFFL) << 32 | ((long)byArray11[4] & 0xFFL) << 24 | ((long)byArray11[5] & 0xFFL) << 16 | ((long)byArray11[6] & 0xFFL) << 8 | (long)byArray11[7] & 0xFFL;
        } while (n12 < n11);
        H = lArray2;
        I = new Long[2];
        i = (long)ca_0.d("x", (int)16628, (long)(0x728635013CAFF72DL ^ l));
        m = 0.0f;
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

    private static Field e(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
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
            case 0 -> 37;
            case 1 -> 41;
            case 2 -> 2;
            case 3 -> 48;
            case 4 -> 61;
            case 5 -> 52;
            case 6 -> 53;
            case 7 -> 6;
            case 8 -> 57;
            case 9 -> 1;
            case 10 -> 28;
            case 11 -> 26;
            case 12 -> 38;
            case 13 -> 22;
            case 14 -> 4;
            case 15 -> 14;
            case 16 -> 42;
            case 17 -> 32;
            case 18 -> 29;
            case 19 -> 19;
            case 20 -> 13;
            case 21 -> 18;
            case 22 -> 60;
            case 23 -> 49;
            case 24 -> 33;
            case 25 -> 34;
            case 26 -> 36;
            case 27 -> 15;
            case 28 -> 46;
            case 29 -> 55;
            case 30 -> 25;
            case 31 -> 54;
            case 32 -> 56;
            case 33 -> 35;
            case 34 -> 0;
            case 35 -> 43;
            case 36 -> 10;
            case 37 -> 44;
            case 38 -> 30;
            case 39 -> 8;
            case 40 -> 40;
            case 41 -> 31;
            case 42 -> 62;
            case 43 -> 24;
            case 44 -> 7;
            case 45 -> 47;
            case 46 -> 17;
            case 47 -> 39;
            case 48 -> 23;
            case 49 -> 20;
            case 50 -> 3;
            case 51 -> 51;
            case 52 -> 9;
            case 53 -> 27;
            case 54 -> 45;
            case 55 -> 5;
            case 56 -> 12;
            case 57 -> 63;
            case 58 -> 50;
            case 59 -> 59;
            case 60 -> 21;
            case 61 -> 11;
            case 62 -> 58;
            default -> 16;
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
        ca_0.L[n3] = new String(cArray);
        return n3;
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

    private static void b() {
        Object[] objectArray = K;
        K[0] = ",\u0014~*U\u000e:\u0014{pF\u0019-_xvJ\r<\u0018oa\u0001\u001d)";
        objectArray[1] = "\nI\u000ehem\u007fi\u0005gt\"\u001eg\u000elpxj";
        objectArray[2] = Integer.TYPE;
        ca_0.L[2] = "java/lang/Integer";
        objectArray[3] = "!!T_9}<4\f}xp$2";
        objectArray[4] = "\u0001\u0004C+rx\u0001\u0004Tw~w\u001bOTi~b\u001c>\u00044/";
        objectArray[5] = "z\u001f)&\fez\u001f>z\u0000j`T>d\u0000\u007fg%l8U=";
        objectArray[6] = "Zu\u001c9dVLu\u0019cwA[>\u001ae{UJy\rr0ERy\u000fyj\bnb\u000fdjOYu";
        objectArray[7] = "h\u0007C3{\u0015~\u0007Fih\u0002iLEod\u0016x\u000bRx/\u0006F";
        objectArray[8] = "]\u0010:P24K\u0010?\n!#\\[<\f-7M\u001c+\u001bf&\r";
        objectArray[9] = "q/\u000bJ\u000b`\u0004\u000f\u0000E\u001a/e\u0001\u000bN\u001eu\u0011";
        objectArray[10] = Void.TYPE;
        ca_0.L[10] = "java/lang/Void";
        objectArray[11] = "'*(X2\u00159\"2\u0017Q\u0001=";
        objectArray[12] = "4Iwb+1?Ff-J?4Mbw";
        objectArray[13] = "(75\u001d[R(7\"AW]2|\"_WH5\ru\u0000\u0001";
        objectArray[14] = "X(\u0005u%,F \u001f:B-W;\u0012`d+";
        objectArray[15] = Boolean.TYPE;
        ca_0.L[15] = "java/lang/Boolean";
        objectArray[16] = "UT\\B\u001b\u0016K\\F\ry\nLA";
        objectArray[17] = "f\t\t\u001a&\u0015p\t\f@5\u0002gB\u000fF9\u0016v\u0005\u0018Qr\u0006A";
        objectArray[18] = "LGgr\b\u0003ZGb(\u001b\u0014M\fa.\u0017\u0000\\Kv9\\\u0010i";
        objectArray[19] = "/GpWS3Zg{XB|;ipSF&O";
        objectArray[20] = "\u007f7\u000fm//\n\u0017\u0004b>`k\u0019\u000fi::\u001f";
        objectArray[21] = "\u0002Ba=\u0011(\u0014Bdg\u0002?\u0003\tga\u000e+\u0012NpvE<$";
        objectArray[22] = "B\u0007l.4O7'g!%\u0000V)l*!Z\"";
        objectArray[23] = "\b)\u0015'\f\f\u0003&\u0004h`\u000f\r$\u0006'L";
        objectArray[24] = "u\"\u00144#\u000fc\"\u0011n0\u0018ti\u0012h<\fe.\u0005\u007fw\u001bG";
        objectArray[25] = "k0LB1b`?]\rLzs8TD";
        objectArray[26] = "]~P\u00075\u0002K~U]&\u0015\\5V[*\u0001MrALa\u0016R";
        objectArray[27] = "h\u000bSl=I\u001d+Xc,\u0006|%Sh(\\\b";
        objectArray[28] = "AV\u0014) b4v\u001f&1-Ux\u0014-5w!";
        objectArray[29] = "/\u0000P'\u001az$\u000fAhgo6\u0015C+";
        objectArray[30] = Long.TYPE;
        ca_0.L[30] = "java/lang/Long";
        objectArray[31] = "Ap+r\u0000uWp.(\u0013b@;-.\u001fvQ|:9Tdm";
        objectArray[32] = "\u0015QKJ5\u001f`q@E$P\u001diSB-\u0019u";
        objectArray[33] = "\u0017\u0002*7\u001b!\u0001\u0002/m\b6\u0016I,k\u0004\"\u0007\u000e;|O2\u001d";
        objectArray[34] = "!6n\bgeT\u0016e\u0007v*5\u0018n\frpA";
        objectArray[35] = Float.TYPE;
        ca_0.L[35] = "java/lang/Float";
        objectArray[36] = "\u000e6*\u0017\r?{\u0016!\u0018\u001cp\u001a\u0018*\u0013\u0018*n";
        objectArray[37] = "g+Uu$zq+P/7mf`S);yw'D>pkF";
        objectArray[38] = "\rl@D{nxLKKj!\u0019B@@n{m";
        objectArray[39] = "3Gn5\r1-Otzp!-";
        objectArray[40] = "+YQx \u000f V@7B\f/_";
        objectArray[41] = "~&o\"nSu)~m\r^`$q\u00068\\q7m*/Q";
        objectArray[42] = "p:\fmq\u007f\u0005\u001a\u0007b`0d\u0014\fidj\u0010";
        objectArray[43] = "'K2Q3E,D#\u001e[E\"K0";
        objectArray[44] = "i3fOa=\u001c\u0013m@pr}\u001dfKt(\t";
        objectArray[45] = " \b`-Fp>\u0000zb+j'\u0019w>\tq%\u001b";
        objectArray[46] = "plL1FzndV~%nj)\u007f>\u001c}c";
        objectArray[47] = "\reP\u0006E+xE[\tTd\u0019KP\u0002P>m";
        objectArray[48] = "D\u0013Q\u0011\u0018!R\u0013TK\u000b6EXWM\u0007\"T\u001f@ZL5D";
        objectArray[49] = "\u0002]3:*bw}85;-\u0016s3>?wb";
        objectArray[50] = "\u0014BCkQ9abHd@v\u0000lCoD,t";
        objectArray[51] = "59\u0014\u0005l\\>6\u0005J\u000fQ+0";
        objectArray[52] = "w\u0005nRn\u0005\u0002%e]\u007fJc+nV{\u0010\u0017";
        objectArray[53] = "8m2w\u001bn8g=;c0ok\u0017}\u000e2d\u0017av\\gx.\"i\u0018n\u0002";
        objectArray[54] = "!\u0012Mr03~\u0012\\{P.wWNu<\u001c \u0011\u0010\"kK!T\\k*%$T\u0017yP";
        objectArray[55] = "r3\u001ep.\u0006qe\u0018iGQNe[n X$)\ne7";
        objectArray[56] = "*\u001eczb\u0007(\u0019o{\u0006]\u0014\u0019gd8\u0006zJ2ui]\u0014\u001fomxL-]`&d<";
        objectArray[57] = "\u0005PY#[7GUB48&H\u00120|D.H\r\u000f<_nSn\u00000H#VQ@+\b85^L<E=\n\u001eW|^^";
        objectArray[58] = "QhNO26\u000eh_FR \u000b<IC\u0005wUl\u0010/c\u007f\f8CV,5\u0011n";
        objectArray[59] = "\u0017\u001cC\u0013,u\u0013JX\u001bEu\u0017W`\u00155i~E@\u0007<i\u0002\u0012\u001a\u0006=\u0015";
        objectArray[60] = "\u000eXEj%\n\u0018A\u0010i]O\u0005NCTdE[\u0004Tm'Z\u001f\r.";
        objectArray[61] = "\u001f\u0010hj)(\u001cFns@x#\u0010(%#s\u001c\u001aw(0";
        objectArray[62] = "DTmN\u0014a\u0014PhZs}/\fhHM9A_=Y\u001cb/\n`A\rs\u0016Ho\n\u0011\u0003";
        objectArray[63] = "e\u0018\u0007m\u0015jg\u001f\u000blq=[\u001f\u0003sOk5LVb\u001e0[O]t\b-'\u0018\u0007u\tQ";
        objectArray[64] = "BB`\u0011Si\\\u001do[9s,A5Y\u0007#B\u0012`HVx,BwKIa\u001dB}D\u0005\u0019";
        objectArray[65] = "RSGR\u0016oRY@[x(T\u0006DZ?8=\u000b_H\u0001*A\\\u0005I\u0000VRSGR\u0016oRY@[x";
        objectArray[66] = "(`  z\n*g,!\u001eX\u0016g$> \u000bx4q/qP\u0016a,7`A/##||1";
        objectArray[67] = "\b8K\u0010Cm\u00179\b\\x\u007f\u0012c\u000f\b\u0002yua\u0014X\u0019u\u0014vM]\u0006\u0014\u0012eN\u0000\u0019u\u0005<K\u001fx-\u00049O\u001bAn\u001b}Fa";
        objectArray[68] = "r\\:\u0017\u00041q\u0014:\u001a`>\u001dL)MY$pM=\u0012_T";
        objectArray[69] = "\"I\u0018~j@!\\\u001d\u0010f\"r\u000f\u0007.5L!Z\u0016\u007fn\"rF@(u\u001b1Y\u0004!\u000f";
        objectArray[70] = "=$Uxx*6 C7\u0001:\\\"\t0?k2q\\!n0\\$\u00019\u007f!ef\u000ercQ";
        objectArray[71] = "<JCE\u001a=>MOD~m\u0002MG[@<l\u001e\u0012J\u0011g\u0002\u001d\u0019\\\u0007z~JC]\u0006\u0006";
        objectArray[72] = "\u0019\u0002\u0013c)\u0007AU\u0012z\u0016\u0013\u0007D\u0011pp\u0004&_\u000epS\u0019\u001eZ\nf\u0016\u001b\b^\u0014ls\u0019\u0004LW\u001d";
        objectArray[73] = ".\u001c[sXGl\u0019@d;As^ufwCpKOxG..^BaX\u0011nE\u0002z;\u001ebRO\u007f\u0004^y\u0012T\u001c\u000bRn_Q#KI.D2";
        objectArray[74] = "\n>OBv\u0017B<FX\u001d\u0016\u0019<*\u0019lL@ \u0013Zs\bIZ\u0013Q\"K\u0002cPNfBxc[\u001f%\tA D[,s";
        objectArray[75] = "B\u001e8?*.KD84Zu&\u00194l's\u0016M9e'\u001f";
        objectArray[76] = "E|J\u00144XEvEXL\u0006\u0012zz\t iFw\u001f\\6P\u0005h[UL";
        objectArray[77] = "ishn\u0012Gj;hcvK\u0006jsp\u000f^z=)q\u000e\"";
        objectArray[78] = "BCr[8IBIuRV\u001dT\u000feZ-p\u001d\u000e|C5O]\u0015<XV\u0019K\ruB*N\u0011\ft>";
        objectArray[79] = "*:\u0016Ih8>:\u0019^T7L2@\\jd\"a\u0015M;?Ll\u001b\u001d5?-{B\u0018*^";
        objectArray[80] = "1\u000f\nG>J2\u001a\u000f)1(aI\u0015\u0017aF2\u001c\u0004F:(a\u0000R\u0011!\u0011\"\u001f\u0016\u0018[";
        objectArray[81] = "\u0018J#U\u001d\nPYaZz\u0017`\u0003\"GDA\u000ePwV\u0015\u001a`\u0000`U\n\u0003Q\u0000jZF{";
        objectArray[82] = "a\u001e4\u0010q.d\u001e\u007f\u0002\u000b%7\u001d&\u000eg\u0017f]vW\u000by+^~\u00132:4\u001awi";
        objectArray[83] = "|\u0019?6Yao\u0004-~dkz\u0011;n\u0018m||(7\u0001ao\u001c,a\u001ai\u0006";
        objectArray[84] = "v8*S1ggkjPN>jo=v'>pdRK<:rx7I0(1\t";
        objectArray[85] = "m\u000es\f.In\u001bvb\"+\u007f\u0001+\u0007-B4\u000et\u001aKPuOq\u0004\"\u001bz\u0010lb";
        objectArray[86] = "rFw(m@wF<:\u0017K$Ee6{yu\u0004=k\u0017\u00178\u0006=+.T'B4Q";
        objectArray[87] = "{l\u0018Jn_q3\u0015Y\u000e\t\u0010o\u001dQ0Z~<H@a\u0001\u0010=D\u0014p\u0007rm@\u0011d`";
        objectArray[88] = "@]^B\u001asVD\u000bAb,QtP\u0004\u001e<*PS\u0003\u001b1V\u0007\t\u0002\u001aM";
        objectArray[89] = "Z}R\u0002[)Zw]N#w\r{q\u0016[x\t\u0007\u0001\u0003\u001c \u001a>B\u001cX)`";
        objectArray[90] = ".\u0002h`^&1\u0003+,e!:X)|\"1S[7(\u0004>2Ln-\u001b_.\u0002h`^&1\u0003+,e";
        objectArray[91] = "3\u0013,0v\u000e7E78\u001f\b7S5[/\u0012*^*do\tjEI";
        objectArray[92] = "\u0014\u001a%vNE\u0005Ieu1\u0006\u0006O `v\u0016oH/mN\t\nJ#\u007f\rx\u0014\u001a%vNE\u0005Ieu1";
        objectArray[93] = "4\u000exaLlv\u000bcv/hbLk\u007fthx0kkQ49[xvC|\u0004";
        objectArray[94] = "9\u0019|g9\bi\u001dys^\u0001RAya`P<\u0012,p1\u000bR\u001f\" ?\u000b3\b{% j";
        objectArray[95] = "!?0z^~7&ey&;,!'DX<+&c9T  &[{\u001615+b9\u0019z)[";
        objectArray[96] = "\u001f\u0006b\nbv\u0002Qi\u0003\u000ep\rBL\u0003jb\r>\"\u0016~b\u0003\u0001b\r>y`";
        objectArray[97] = "w5H\u0012?ra,\u001d\u0011G%q=#\u001c;<`2\u001c\\ |{QJJ85a-\u001d\u001094\u001d";
        objectArray[98] = "Q{v'r\u001e\u001d*}0\u0017\u001dl.~+)\fR8g~*t";
        objectArray[99] = "E\u0006\u001d\u001b\u001b;\u0015\u0002\u0018\u000f|0.^\u0018\u001dBc@\rM\f\u00138.\u0000C\\\u001d8O\u0017\u001aY\u0002Y";
        objectArray[100] = "2W\f/\u0011w2]\u000b&\u007f\u0000\u0014\")\u0007\u007f!l\u0018\u0017$F!f\u001f\u001e";
        objectArray[101] = "\u001e\"/@Q\u0010P)lP1\u000fn`jF\u000fX\u00003?W^\u0003nfbOO\u0012W$m\u0004Sb";
        objectArray[102] = " \\O\nw( V@F\u000fvwZo\u001ert\u001a\u001fTE7c#\\K\u0001>\u0019";
        objectArray[103] = "CFmRu\u0015\u000bU/]\u0012\u000e;\u000fl@,^U\\9Q}\u0005;Q7\u0001s\u0005ZFn\u0004ld";
        objectArray[104] = "e\u0017u\u0010\u00197s\u000e \u0013ahs\u001edG\u001dnusw\u001e\u0004bf\u0013sH\u001fj\u000f";
        objectArray[105] = "z$|\u001fKjgsw\u0016'lh`O\u0012V\u00035`|\u0002D<u{<\u0019'";
        objectArray[106] = "vN*jv\u0015iOi&M\u0002o\u0017\u007fg\u0013\u0005o\r{\u001b*\u000f2\u0011wz=V7\u000e\u0016";
        objectArray[107] = "\"\u0007\u007f\u001d}\u00174\u001e*\u001e\u0005F%\u001f\u0014\u001at\u0016p\u0019-YkRyc$_uT+\\dD5OH";
        Object[] objectArray2 = objectArray;
        objectArray[108] = "h}4is2 \u007f=s\u00183siQl{o{x0{\"jd\u00196h!7{x!1$(\u001a~22y7{ik7fV";
    }

    private static int b(Object[] objectArray) {
        int n = (Integer)objectArray[0];
        int n2 = (Integer)objectArray[1];
        float f = ((Float)objectArray[2]).floatValue();
        long l = (Long)objectArray[3];
        long l2 = (l = v ^ l) ^ 0x15B61ACE66C4L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = (int)((float)n + (float)(n2 - n) * f);
        return (int)ca_0.g("c", (Object)objectArray2, (long)-9094404773241105008L, (long)l);
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/ca" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = ca_0.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2439;
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
                throw new RuntimeException("dev/zprestige/prestige/ca", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            ca_0.C[n2] = n3;
        }
        return C[n2];
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = ca_0.c(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00ed' || c == '\u00f8' || c == 'r' || c == '$') {
                field = ca_0.k(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00ed' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00f8' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'r' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = ca_0.l(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00d1' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'c' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Field f(Class clazz, String string, Class clazz2) {
        Field field = ca_0.e(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = ca_0.f(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method f(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = ca_0.e(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = ca_0.f(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    @Override
    public void l(Object[] objectArray) {
        float f;
        CallSite callSite;
        CallSite callSite2;
        Object object;
        CallSite callSite3;
        Object object2;
        CallSite callSite4;
        Object object3;
        CallSite callSite5;
        long l;
        long l2;
        long l3;
        long l4;
        long l5;
        long l6;
        long l7;
        long l8;
        long l9;
        long l10;
        Matrix4f matrix4f;
        gK gK2;
        aq_0 aq_02;
        block80: {
            ca_0 ca_02;
            block85: {
                block81: {
                    Object object4;
                    block84: {
                        block82: {
                            block83: {
                                reference v24;
                                block78: {
                                    Object object5;
                                    long l11;
                                    block76: {
                                        reference v9;
                                        block74: {
                                            Object object6;
                                            aq_02 = (aq_0)objectArray[0];
                                            gK2 = (gK)objectArray[1];
                                            matrix4f = (Matrix4f)objectArray[2];
                                            l10 = (Long)objectArray[3];
                                            long l12 = l10;
                                            l9 = l12 ^ 0x7876565874AFL;
                                            l8 = l12 ^ 0x194A66AD9C40L;
                                            l7 = l12 ^ 0x56B4B80BF914L;
                                            l6 = l12 ^ 0x5D6649FEB165L;
                                            l5 = l12 ^ 0x2F7B86B04F69L;
                                            l4 = l12 ^ 0x10B5D2E55E99L;
                                            long l13 = l12 ^ 0x5784D74479BL;
                                            l3 = l12 ^ 0x77FE815D5D37L;
                                            l2 = l12 ^ 0x29CA0C560F0CL;
                                            l11 = l12 ^ 0x31240AA31D80L;
                                            l = l12 ^ 0x57D19E355E96L;
                                            callSite5 = ca_0.g("c", (long)-6312821252813523844L, (long)l10);
                                            m = (float)(callSite5 - i) * 0.005f;
                                            i = (long)callSite5;
                                            object3 = ca_0.g("\u00d1", (Object)ca_0.g("\u00d1", (Object)ca_0.g("r", (long)-6306296944085039181L, (long)l10), (long)-6309857096293315106L, (long)l10), (long)-6310567924952684051L, (long)l10);
                                            callSite4 = ca_0.g("c", (long)-6312767871796405935L, (long)l10);
                                            while (ca_0.g("\u00d1", (Object)object3, (long)-6307133616105051231L, (long)l10) != false) {
                                                float f10;
                                                CallSite callSite6;
                                                block72: {
                                                    CallSite callSite7;
                                                    block73: {
                                                        object6 = (dV)((Object)ca_0.g("\u00d1", (Object)object3, (long)-6313895001439831168L, (long)l10));
                                                        callSite7 = ca_0.g("\u00d1", (Object)object6, (long)-6312569226416511567L, (long)l10);
                                                        Boolean bl = (Boolean)((Object)ca_0.g("\u00d1", (Object)this.c, (Object)object6, (Object)ca_0.g("c", (boolean)callSite7, (long)-6312339850417610378L, (long)l10), (long)-6307245579192379151L, (long)l10));
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        callSite6 = callSite7;
                                                                        if (callSite4 != null) break block72;
                                                                        if (callSite6 == false) break block73;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw ca_0.g("c", (Object)matchException, (long)-6313141421797957957L, (long)l10);
                                                                    }
                                                                    callSite6 = ca_0.g("\u00d1", (Object)ca_0.g("r", (long)-6309740791128844868L, (long)l10), (Object)bl, (long)-6312380327945364618L, (long)l10);
                                                                    if (callSite4 != null) break block72;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw ca_0.g("c", (Object)matchException, (long)-6313141421797957957L, (long)l10);
                                                                }
                                                                if (callSite6 == false) break block73;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw ca_0.g("c", (Object)matchException, (long)-6313141421797957957L, (long)l10);
                                                            }
                                                            ca_0.g("\u00d1", (Object)this.d, (Object)object6, (Object)ca_0.g("c", (long)callSite5, (long)-6313668563116289697L, (long)l10), (long)-6307245579192379151L, (long)l10);
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw ca_0.g("c", (Object)matchException, (long)-6313141421797957957L, (long)l10);
                                                        }
                                                    }
                                                    callSite6 = callSite7;
                                                }
                                                try {
                                                    f10 = callSite6 != false ? 1.0f : 0.0f;
                                                }
                                                catch (MatchException matchException) {
                                                    throw ca_0.g("c", (Object)matchException, (long)-6313141421797957957L, (long)l10);
                                                }
                                                object2 = f10;
                                                CallSite callSite8 = ca_0.g("\u00d1", (Object)((Float)((Object)ca_0.g("\u00d1", (Object)this.a, (Object)object6, (Object)ca_0.g("c", (float)0.0f, (long)-6313832584973736336L, (long)l10), (long)-6312915533826615134L, (long)l10))), (long)-6310418722298834714L, (long)l10);
                                                Object[] objectArray2 = new Object[4];
                                                objectArray2[3] = l13;
                                                objectArray2[2] = Float.valueOf(m);
                                                objectArray2[1] = Float.valueOf(object2);
                                                objectArray2[0] = Float.valueOf((float)callSite8);
                                                callSite8 = ca_0.g("c", (Object)objectArray2, (long)-6309664613922028323L, (long)l10);
                                                ca_0.g("\u00d1", (Object)this.a, (Object)object6, (Object)ca_0.g("c", (float)callSite8, (long)-6313832584973736336L, (long)l10), (long)-6307245579192379151L, (long)l10);
                                                if (callSite4 == null) continue;
                                            }
                                            object3 = new ArrayList();
                                            object6 = ca_0.g("\u00d1", (Object)ca_0.g("\u00d1", (Object)this.a, (long)-6313747831761975216L, (long)l10), (long)-6313300801835068675L, (long)l10);
                                            while (ca_0.g("\u00d1", (Object)object6, (long)-6307133616105051231L, (long)l10) != false) {
                                                block75: {
                                                    Map.Entry entry = (Map.Entry)((Object)ca_0.g("\u00d1", (Object)object6, (long)-6313895001439831168L, (long)l10));
                                                    try {
                                                        try {
                                                            try {
                                                                reference v9 = ca_0.g("\u00d1", (Object)((Float)((Object)ca_0.g("\u00d1", (Object)entry, (long)-6310020803871036051L, (long)l10))), (long)-6310418722298834714L, (long)l10) - 0.005f;
                                                                v9 = v9 == 0 ? 0 : (v9 > 0 ? 1 : -1);
                                                                if (callSite4 != null) break block74;
                                                                if (callSite4 != null) break block75;
                                                            }
                                                            catch (MatchException matchException) {
                                                                throw ca_0.g("c", (Object)matchException, (long)-6313141421797957957L, (long)l10);
                                                            }
                                                            if (v9 <= 0) break block75;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw ca_0.g("c", (Object)matchException, (long)-6313141421797957957L, (long)l10);
                                                        }
                                                        ca_0.g("\u00d1", (Object)object3, (Object)entry, (long)-6310040436637083359L, (long)l10);
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw ca_0.g("c", (Object)matchException, (long)-6313141421797957957L, (long)l10);
                                                    }
                                                }
                                                if (callSite4 == null) continue;
                                            }
                                            try {
                                                object5 = object3;
                                                if (callSite4 != null) break block76;
                                                v9 = ca_0.g("\u00d1", (Object)object5, (long)-6313927522054379636L, (long)l10);
                                            }
                                            catch (MatchException matchException) {
                                                throw ca_0.g("c", (Object)matchException, (long)-6313141421797957957L, (long)l10);
                                            }
                                        }
                                        try {
                                            if (v9 != false) {
                                                Object[] objectArray3 = new Object[2];
                                                objectArray3[1] = Float.valueOf(0.0f);
                                                objectArray3[0] = Float.valueOf(0.0f);
                                                ca_0.g("\u00d1", (Object)this, (Object)objectArray3, (long)-6307162713660919377L, (long)l10);
                                                this.l = 0.0f;
                                                this.o = 0.0f;
                                                return;
                                            }
                                        }
                                        catch (MatchException matchException) {
                                            throw ca_0.g("c", (Object)matchException, (long)-6313141421797957957L, (long)l10);
                                        }
                                        object5 = object3;
                                    }
                                    ca_0.g("\u00d1", (Object)object5, ca_0::lambda$renderNew$0, (long)-6313557583693385539L, (long)l10);
                                    Object[] objectArray4 = new Object[1];
                                    objectArray4[0] = l3;
                                    Object[] objectArray5 = new Object[1];
                                    objectArray5[0] = l11;
                                    CallSite callSite9 = ca_0.g("\u00d1", (Object)ca_0.g("\u00d1", (Object)ca_0.g("r", (long)-6306998894035658969L, (long)l10), (Object)objectArray4, (long)-6312999150145391379L, (long)l10), (Object)objectArray5, (long)-6313489461960791813L, (long)l10);
                                    Object[] objectArray6 = new Object[2];
                                    objectArray6[1] = Float.valueOf(1.0f);
                                    objectArray6[0] = Float.valueOf((float)callSite9);
                                    callSite3 = ca_0.g("c", (Object)objectArray6, (long)-6312435506418323457L, (long)l10);
                                    object = 0.0f;
                                    object2 = 0.0f;
                                    CallSite callSite10 = ca_0.g("\u00d1", (Object)object3, (long)-6310567924952684051L, (long)l10);
                                    while (ca_0.g("\u00d1", (Object)callSite10, (long)-6307133616105051231L, (long)l10) != false) {
                                        Object object6;
                                        reference v22;
                                        block77: {
                                            Map.Entry entry;
                                            block79: {
                                                entry = (Map.Entry)((Object)ca_0.g("\u00d1", (Object)callSite10, (long)-6313895001439831168L, (long)l10));
                                                Object[] objectArray7 = new Object[1];
                                                objectArray7[0] = l3;
                                                Object[] objectArray8 = new Object[2];
                                                objectArray8[1] = l6;
                                                objectArray8[0] = ca_0.g("\u00d1", (Object)((dV)((Object)ca_0.g("\u00d1", (Object)entry, (long)-6310626975454480786L, (long)l10))), (long)-6311998021953278092L, (long)l10);
                                                reference var39_33 = ca_0.g("\u00d1", (Object)ca_0.g("\u00d1", (Object)ca_0.g("r", (long)-6306998894035658969L, (long)l10), (Object)objectArray7, (long)-6312999150145391379L, (long)l10), (Object)objectArray8, (long)-6309895272691100766L, (long)l10) + 11.0f;
                                                try {
                                                    try {
                                                        v22 = var39_33;
                                                        object6 = object;
                                                        if (callSite4 != null) break block77;
                                                        reference v24 = v22 - object6;
                                                        v24 = v24 == 0 ? 0 : (v24 > 0 ? 1 : -1);
                                                        if (callSite4 != null) break block78;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw ca_0.g("c", (Object)matchException, (long)-6313141421797957957L, (long)l10);
                                                    }
                                                    if (v24 <= 0) break block79;
                                                }
                                                catch (MatchException matchException) {
                                                    throw ca_0.g("c", (Object)matchException, (long)-6313141421797957957L, (long)l10);
                                                }
                                                object = var39_33;
                                            }
                                            v22 = (reference)object2;
                                            object6 = (callSite3 + 1.0f) * ca_0.g("\u00d1", (Object)((Float)((Object)ca_0.g("\u00d1", (Object)entry, (long)-6310020803871036051L, (long)l10))), (long)-6310418722298834714L, (long)l10);
                                        }
                                        object2 = v22 + object6;
                                        if (callSite4 == null) continue;
                                    }
                                    v24 = ca_0.g("\u00d1", (Object)ca_0.g("\u00d1", (Object)b, (long)-6306228961902803012L, (long)l10), (long)-6313269421912837887L, (long)l10);
                                }
                                float f11 = (float)v24;
                                float f12 = (float)ca_0.g("\u00d1", (Object)ca_0.g("\u00d1", (Object)b, (long)-6306228961902803012L, (long)l10), (long)-6312936427886245569L, (long)l10);
                                callSite2 = ca_0.g("\u00d1", (Object)this, (Object)new Object[0], (long)-6306868984198518254L, (long)l10);
                                callSite = ca_0.g("\u00d1", (Object)this, (Object)new Object[0], (long)-6311880569315168940L, (long)l10);
                                boolean bl = ca_0.g("\u00ed", (Object)b, (long)-6307020590039473912L, (long)l10) instanceof g8;
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        if (callSite4 != null) break block80;
                                                        if (bl) break block81;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw ca_0.g("c", (Object)matchException, (long)-6313141421797957957L, (long)l10);
                                                    }
                                                    object4 = callSite2;
                                                    if (callSite4 != null) break block82;
                                                }
                                                catch (MatchException matchException) {
                                                    throw ca_0.g("c", (Object)matchException, (long)-6313141421797957957L, (long)l10);
                                                }
                                                if (object4 == false) break block83;
                                            }
                                            catch (MatchException matchException) {
                                                throw ca_0.g("c", (Object)matchException, (long)-6313141421797957957L, (long)l10);
                                            }
                                            float f13 = this.l - 0.0f;
                                            object4 = f13 == 0.0f ? 0 : (f13 > 0.0f ? 1 : -1);
                                            if (callSite4 != null) break block82;
                                        }
                                        catch (MatchException matchException) {
                                            throw ca_0.g("c", (Object)matchException, (long)-6313141421797957957L, (long)l10);
                                        }
                                        if (object4 <= 0) break block83;
                                    }
                                    catch (MatchException matchException) {
                                        throw ca_0.g("c", (Object)matchException, (long)-6313141421797957957L, (long)l10);
                                    }
                                    this.f -= object2 - this.l;
                                }
                                catch (MatchException matchException) {
                                    throw ca_0.g("c", (Object)matchException, (long)-6313141421797957957L, (long)l10);
                                }
                            }
                            object4 = callSite;
                        }
                        try {
                            try {
                                try {
                                    if (callSite4 != null) break block84;
                                    if (object4 == false) break block81;
                                }
                                catch (MatchException matchException) {
                                    throw ca_0.g("c", (Object)matchException, (long)-6313141421797957957L, (long)l10);
                                }
                                ca_02 = this;
                                if (callSite4 != null) break block85;
                            }
                            catch (MatchException matchException) {
                                throw ca_0.g("c", (Object)matchException, (long)-6313141421797957957L, (long)l10);
                            }
                            float f14 = ca_02.o - 0.0f;
                            object4 = f14 == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1);
                        }
                        catch (MatchException matchException) {
                            throw ca_0.g("c", (Object)matchException, (long)-6313141421797957957L, (long)l10);
                        }
                    }
                    try {
                        if (object4 > 0) {
                            this.e -= object - this.o;
                        }
                    }
                    catch (MatchException matchException) {
                        throw ca_0.g("c", (Object)matchException, (long)-6313141421797957957L, (long)l10);
                    }
                }
                this.l = object2;
                this.o = object;
                ca_02 = this;
            }
            Object[] objectArray9 = new Object[2];
            objectArray9[1] = Float.valueOf(object2);
            objectArray9[0] = Float.valueOf(object);
            ca_0.g("\u00d1", (Object)ca_02, (Object)objectArray9, (long)-6307162713660919377L, (long)l10);
        }
        Object[] objectArray10 = new Object[1];
        objectArray10[0] = l8;
        CallSite callSite11 = ca_0.g("c", (Object)objectArray10, (long)-6313450175218162847L, (long)l10);
        CallSite callSite12 = ca_0.g("\u00d1", (Object)object3, (long)-6306929309987497540L, (long)l10);
        try {
            f = callSite2 != false ? this.f + object2 - callSite3 : this.f;
        }
        catch (MatchException matchException) {
            throw ca_0.g("c", (Object)matchException, (long)-6313141421797957957L, (long)l10);
        }
        float f15 = f;
        for (int i = 0; i < ca_0.g("\u00d1", (Object)object3, (long)-6306929309987497540L, (long)l10); ++i) {
            reference var48_43;
            block93: {
                block90: {
                    CallSite callSite7;
                    block88: {
                        Color color;
                        Color color2;
                        float f16;
                        reference var50_45;
                        CallSite callSite14;
                        block89: {
                            Object object7;
                            CallSite callSite15;
                            dV dV2;
                            block92: {
                                float f17;
                                block91: {
                                    reference v45;
                                    block86: {
                                        block87: {
                                            Map.Entry entry = (Map.Entry)((Object)ca_0.g("\u00d1", (Object)object3, (int)i, (long)-6310465050492598238L, (long)l10));
                                            dV2 = (dV)((Object)ca_0.g("\u00d1", (Object)entry, (long)-6310626975454480786L, (long)l10));
                                            var48_43 = ca_0.g("\u00d1", (Object)((Float)((Object)ca_0.g("\u00d1", (Object)entry, (long)-6310020803871036051L, (long)l10))), (long)-6310418722298834714L, (long)l10);
                                            callSite14 = ca_0.g("\u00d1", (Object)dV2, (long)-6311998021953278092L, (long)l10);
                                            Object[] objectArray11 = new Object[1];
                                            objectArray11[0] = l3;
                                            Object[] objectArray12 = new Object[2];
                                            objectArray12[1] = l6;
                                            objectArray12[0] = callSite14;
                                            var50_45 = ca_0.g("\u00d1", (Object)ca_0.g("\u00d1", (Object)ca_0.g("r", (long)-6306998894035658969L, (long)l10), (Object)objectArray11, (long)-6312999150145391379L, (long)l10), (Object)objectArray12, (long)-6309895272691100766L, (long)l10) + 11.0f;
                                            f17 = (1.0f - var48_43) * 6.0f;
                                            try {
                                                try {
                                                    v45 = callSite;
                                                    if (callSite4 != null) break block86;
                                                    if (v45 == false) break block87;
                                                }
                                                catch (MatchException matchException) {
                                                    throw ca_0.g("c", (Object)matchException, (long)-6313141421797957957L, (long)l10);
                                                }
                                                v45 = callSite12 - true - i;
                                                break block86;
                                            }
                                            catch (MatchException matchException) {
                                                throw ca_0.g("c", (Object)matchException, (long)-6313141421797957957L, (long)l10);
                                            }
                                        }
                                        v45 = (reference)i;
                                    }
                                    Object object9 = v45;
                                    Object[] objectArray13 = new Object[4];
                                    objectArray13[3] = l2;
                                    objectArray13[2] = (int)(ca_0.c("i", (int)32338, (long)(0x717E365F50F3721CL ^ l10)) + object9);
                                    objectArray13[1] = (int)ca_0.c("i", (int)7921, (long)(0x6D7A3A64FC4992BCL ^ l10));
                                    objectArray13[0] = callSite11;
                                    callSite15 = ca_0.g("c", (Object)objectArray13, (long)-6312229561912589504L, (long)l10);
                                    if (callSite == false) break block91;
                                    f16 = this.e + object - var50_45 - f17;
                                    if (callSite4 == null) break block92;
                                }
                                f16 = this.e + f17;
                            }
                            CallSite callSite16 = ca_0.g("\u00d1", (Object)((Long)((Object)ca_0.g("\u00d1", (Object)this.d, (Object)dV2, (Object)ca_0.g("c", (long)ca_0.d("x", (int)5348, (long)(0x8DEFC9FBB71523AL ^ l10)), (long)-6313668563116289697L, (long)l10), (long)-6312915533826615134L, (long)l10))), (long)-6313084909369881042L, (long)l10);
                            try {
                                object7 = callSite16 == ca_0.d("x", (int)5348, (long)(0x8DEFC9FBB71523AL ^ l10)) ? 0.0f : (Object)ca_0.g("c", (float)0.0f, (float)(1.0f - (float)(callSite5 - callSite16) / 500.0f), (long)-6310296826261430103L, (long)l10);
                            }
                            catch (MatchException matchException) {
                                throw ca_0.g("c", (Object)matchException, (long)-6313141421797957957L, (long)l10);
                            }
                            float f18 = object7;
                            f18 *= f18;
                            Object[] objectArray14 = new Object[2];
                            objectArray14[1] = l5;
                            objectArray14[0] = (int)((float)ca_0.g("\u00d1", (Object)cn_0.r, (long)-6313983750794643627L, (long)l10) * var48_43);
                            CallSite callSite17 = ca_0.g("c", (Object)objectArray14, (long)-6312052406630286275L, (long)l10);
                            float f19 = f18 * 0.35f;
                            Object[] objectArray15 = new Object[4];
                            objectArray15[3] = l4;
                            objectArray15[2] = Float.valueOf(f19);
                            objectArray15[1] = (int)ca_0.g("\u00d1", (Object)callSite15, (long)-6312511887752962308L, (long)l10);
                            objectArray15[0] = (int)ca_0.g("\u00d1", (Object)cn_0.r, (long)-6312511887752962308L, (long)l10);
                            Object[] objectArray16 = new Object[4];
                            objectArray16[3] = l4;
                            objectArray16[2] = Float.valueOf(f19);
                            objectArray16[1] = (int)ca_0.g("\u00d1", (Object)callSite15, (long)-6306418078870727408L, (long)l10);
                            objectArray16[0] = (int)ca_0.g("\u00d1", (Object)cn_0.r, (long)-6306418078870727408L, (long)l10);
                            Object[] objectArray17 = new Object[4];
                            objectArray17[3] = l4;
                            objectArray17[2] = Float.valueOf(f19);
                            objectArray17[1] = (int)ca_0.g("\u00d1", (Object)callSite15, (long)-6309592084702758074L, (long)l10);
                            objectArray17[0] = (int)ca_0.g("\u00d1", (Object)cn_0.r, (long)-6309592084702758074L, (long)l10);
                            color2 = new Color((int)ca_0.g("c", (Object)objectArray15, (long)-6313361907256579037L, (long)l10), (int)ca_0.g("c", (Object)objectArray16, (long)-6313361907256579037L, (long)l10), (int)ca_0.g("c", (Object)objectArray17, (long)-6313361907256579037L, (long)l10), (int)callSite17);
                            Object[] objectArray18 = new Object[2];
                            objectArray18[1] = l5;
                            objectArray18[0] = (int)(255.0f * var48_43);
                            color = new Color((int)ca_0.g("\u00d1", (Object)callSite15, (long)-6312511887752962308L, (long)l10), (int)ca_0.g("\u00d1", (Object)callSite15, (long)-6306418078870727408L, (long)l10), (int)ca_0.g("\u00d1", (Object)callSite15, (long)-6309592084702758074L, (long)l10), (int)ca_0.g("c", (Object)objectArray18, (long)-6312052406630286275L, (long)l10));
                            try {
                                try {
                                    reference cfr_temp_4 = var48_43 - 0.7f;
                                    callSite7 = cfr_temp_4 == 0 ? 0 : (cfr_temp_4 > 0 ? 1 : -1);
                                    if (callSite4 != null) break block88;
                                    if (callSite7 <= 0) break block89;
                                }
                                catch (MatchException matchException) {
                                    throw ca_0.g("c", (Object)matchException, (long)-6313141421797957957L, (long)l10);
                                }
                                Object[] objectArray19 = new Object[10];
                                objectArray19[9] = l7;
                                objectArray19[8] = Float.valueOf(4.0f);
                                objectArray19[7] = 5;
                                objectArray19[6] = Float.valueOf((float)callSite3);
                                objectArray19[5] = Float.valueOf((float)var50_45);
                                objectArray19[4] = Float.valueOf(f15);
                                objectArray19[3] = Float.valueOf(f16);
                                objectArray19[2] = matrix4f;
                                objectArray19[1] = gK2;
                                objectArray19[0] = aq_02;
                                ca_0.g("c", (Object)objectArray19, (long)-6309822311451865001L, (long)l10);
                            }
                            catch (MatchException matchException) {
                                throw ca_0.g("c", (Object)matchException, (long)-6313141421797957957L, (long)l10);
                            }
                        }
                        try {
                            Object[] objectArray20 = new Object[10];
                            objectArray20[9] = l9;
                            objectArray20[8] = Float.valueOf(4.0f);
                            objectArray20[7] = color2;
                            objectArray20[6] = Float.valueOf((float)callSite3);
                            objectArray20[5] = Float.valueOf((float)var50_45);
                            objectArray20[4] = Float.valueOf(f15);
                            objectArray20[3] = Float.valueOf(f16);
                            objectArray20[2] = matrix4f;
                            objectArray20[1] = gK2;
                            objectArray20[0] = aq_02;
                            ca_0.g("c", (Object)objectArray20, (long)-6311846029557793778L, (long)l10);
                            Object[] objectArray21 = new Object[1];
                            objectArray21[0] = l3;
                            Object[] objectArray22 = new Object[6];
                            objectArray22[5] = l;
                            objectArray22[4] = color;
                            objectArray22[3] = Float.valueOf(f15 + 3.0f);
                            objectArray22[2] = Float.valueOf(f16 + 5.5f);
                            objectArray22[1] = callSite14;
                            objectArray22[0] = matrix4f;
                            ca_0.g("\u00d1", (Object)ca_0.g("\u00d1", (Object)ca_0.g("r", (long)-6306998894035658969L, (long)l10), (Object)objectArray21, (long)-6312999150145391379L, (long)l10), (Object)objectArray22, (long)-6306728488247847427L, (long)l10);
                            if (callSite4 != null) break block90;
                            callSite7 = callSite2;
                        }
                        catch (MatchException matchException) {
                            throw ca_0.g("c", (Object)matchException, (long)-6313141421797957957L, (long)l10);
                        }
                    }
                    if (callSite7 == false) break block93;
                    f15 -= (callSite3 + 1.0f) * var48_43;
                }
                if (callSite4 == null) continue;
            }
            f15 += (callSite3 + 1.0f) * var48_43;
            if (callSite4 == null) continue;
        }
    }

    private static Method l(long l, long l2) {
        int n = ca_0.i(l, l2);
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
                clazz3 = ca_0.j(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = ca_0.j(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = ca_0.e(clazz, string, clazz2, n2, classArray2)) != null) {
                        ca_0.K[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = ca_0.j(896944384200695L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = ca_0.f(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        ca_0.K[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = ca_0.j(896944384200695L, 0L);
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

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/ca" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static long d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = ca_0.d(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Long.TYPE, l2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return l2;
    }

    private static long d(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6EA9;
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
                throw new RuntimeException("dev/zprestige/prestige/ca", exception);
            }
            long l4 = ((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL;
            ca_0.I[n2] = l4;
        }
        return I[n2];
    }

    private static int a(Object[] objectArray) {
        Object object;
        block6: {
            int n;
            long l;
            block4: {
                int n2;
                block5: {
                    n2 = (Integer)objectArray[0];
                    l = (Long)objectArray[1];
                    l = v ^ l;
                    CallSite callSite = ca_0.g("c", (long)-8054250246785949428L, (long)l);
                    try {
                        try {
                            n = n2;
                            if (callSite != null) break block4;
                            if (n >= 0) break block5;
                        }
                        catch (MatchException matchException) {
                            throw ca_0.g("c", (Object)matchException, (long)-8052943762352593178L, (long)l);
                        }
                        object = 0;
                        break block6;
                    }
                    catch (MatchException matchException) {
                        throw ca_0.g("c", (Object)matchException, (long)-8052943762352593178L, (long)l);
                    }
                }
                n = n2;
            }
            object = ca_0.g("c", (int)n, (int)ca_0.c("i", (int)25750, (long)(0x33535FB74AC15084L ^ l)), (long)-8054194943294939607L, (long)l);
        }
        return object;
    }

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4D56;
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
                throw new RuntimeException("dev/zprestige/prestige/ca", exception);
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
            ca_0.x[n2] = ca_0.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return x[n2];
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/ca" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = ca_0.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    @Override
    public void m(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x6910D1708A27L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l2;
        objectArray2[1] = Float.valueOf(135.0f);
        objectArray2[0] = Float.valueOf(2.0f);
        ca_0.g("\u00d1", (Object)this, (Object)objectArray2, (long)-3384017481637126183L, (long)l);
    }

    private static Field k(long l, long l2) {
        int n = ca_0.i(l, l2);
        Object object = K[n];
        if (object instanceof String) {
            String string = L[n];
            int n2 = string.indexOf(8);
            Class clazz = ca_0.j(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = ca_0.j(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = ca_0.e(clazz3, string2, clazz2)) != null) {
                    ca_0.K[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = ca_0.f(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        ca_0.K[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = ca_0.j(896944384200695L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static CallSite g(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_3().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/ca" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class j(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = ca_0.i(l, l2);
            object = K[n];
            try {
                if (!(object instanceof String)) break block2;
                ca_0.K[n] = clazz = Class.forName(L[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    @Override
    public void q(Object[] objectArray) {
        ca_0 ca_02;
        long l;
        Matrix4f matrix4f;
        block10: {
            block11: {
                block9: {
                    float f;
                    block8: {
                        matrix4f = (Matrix4f)objectArray[0];
                        long l2 = (Long)objectArray[1];
                        l = l2 ^ 0L;
                        CallSite callSite = ca_0.g("c", (long)-3302318118949690594L, (long)l2);
                        try {
                            try {
                                try {
                                    float f10 = this.g - 0.0f;
                                    f = f10 == 0.0f ? 0 : (f10 < 0.0f ? -1 : 1);
                                    if (callSite != null) break block8;
                                    if (f <= 0) break block9;
                                }
                                catch (MatchException matchException) {
                                    throw ca_0.g("c", (Object)matchException, (long)-3302137533230160652L, (long)l2);
                                }
                                ca_02 = this;
                                if (callSite != null) break block10;
                            }
                            catch (MatchException matchException) {
                                throw ca_0.g("c", (Object)matchException, (long)-3302137533230160652L, (long)l2);
                            }
                            float f11 = ca_02.h - 0.0f;
                            f = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
                        }
                        catch (MatchException matchException) {
                            throw ca_0.g("c", (Object)matchException, (long)-3302137533230160652L, (long)l2);
                        }
                    }
                    if (f > 0) break block11;
                }
                return;
            }
            ca_02 = this;
        }
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l;
        objectArray2[0] = matrix4f;
        super.q(objectArray2);
    }

    private static int lambda$renderNew$0(Map.Entry entry, Map.Entry entry2) {
        long l;
        long l2 = l = v ^ 0x1A5A247AA724L;
        long l3 = l2 ^ 0x1BA54337C903L;
        long l4 = l2 ^ 0x313D8B942551L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l4;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l3;
        objectArray2[0] = ca_0.g("\u00d1", (Object)((dV)((Object)ca_0.g("\u00d1", (Object)entry2, (long)-3455843178119115256L, (long)l))), (long)-3458480845117401326L, (long)l);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l4;
        Object[] objectArray4 = new Object[2];
        objectArray4[1] = l3;
        objectArray4[0] = ca_0.g("\u00d1", (Object)((dV)((Object)ca_0.g("\u00d1", (Object)entry, (long)-3455843178119115256L, (long)l))), (long)-3458480845117401326L, (long)l);
        return (int)ca_0.g("c", (float)ca_0.g("\u00d1", (Object)ca_0.g("\u00d1", (Object)ca_0.g("r", (long)-3449951752282935487L, (long)l), (Object)objectArray, (long)-3457077332706800501L, (long)l), (Object)objectArray2, (long)-3456238466124354620L, (long)l), (float)ca_0.g("\u00d1", (Object)ca_0.g("\u00d1", (Object)ca_0.g("r", (long)-3449951752282935487L, (long)l), (Object)objectArray3, (long)-3457077332706800501L, (long)l), (Object)objectArray4, (long)-3456238466124354620L, (long)l), (long)-3458504808515081551L, (long)l);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ca_0.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(ca_0.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)J", null));
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
            return MethodHandles.lookup().findStatic(ca_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(ca_0.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


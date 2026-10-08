/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_310
 *  org.joml.Matrix4f
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.aq_0;
import dev.zprestige.prestige.b4;
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
import net.minecraft.class_310;
import org.joml.Matrix4f;

/*
 * Renamed from dev.zprestige.prestige.cc
 */
public class cc_0
extends b4 {
    private static final float m = 16.0f;
    private static final float a = 9.0f;
    private static final float c = 5.0f;
    private static final float d = 4.5f;
    private static final float e = 45.0f;
    private static final float f = 45.0f;
    private static final float g = 5.0f;
    private static final float h = 10.0f;
    private static final float i = 28.0f;
    private static final float j = 0.18f;
    private float k;
    private float l;
    private boolean n;
    private long o;
    private static final long v = hc.a(7387862229271862453L, 1122314110311358852L, MethodHandles.lookup().lookupClass()).a(160197280282490L);
    private static final String[] w;
    private static final String[] x;
    private static final Map y;
    private static final long[] B;
    private static final Long[] C;
    private static final Map D;
    private static final Object[] H;
    private static final String[] I;

    public cc_0(long l) {
        long l2 = (l = v ^ l) ^ 0x5E759F10B297L;
        super((String)((Object)cc_0.a("b", (int)822, (long)(0x788ACD65F77A9505L ^ l))), (String)((Object)cc_0.a("b", (int)26606, (long)(0x71EB798BE8E8F1DCL ^ l))), l2);
        this.k = 0.0f;
        this.l = 0.0f;
        this.n = 0;
        this.o = (long)cc_0.c("o", (int)793, (long)(0x2DBDFAF5C7A3053BL ^ l));
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        H = new Object[73];
        I = new String[73];
        cc_0.b();
        y = new HashMap(13);
        long l = v ^ 0x2A53E4AABB2L;
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
        String string = "\u00c0\u00c4\u008e\u009d\u0014\u009c\u00f5\u00dc(\u00e0\u00fa\u00ed\u00ec7\u00f1\u0098\u00f7kM-\u0002\u00a8\u0016\u00fb\u00c8\b\u0097\u00b0\u00b4\u00ae\u009eq\u0014\u00f9\u00bf\u00052x\u008f#\u007f\u000bU\u00a2:\u00df\u00b7\u00dd\u00fe\u00d0-k\n\u00ed!\u0016\u00eeo\u00fc\u00d8\r\u0081\u0006\u00ecg\u009f\u0096\u0088\u00fb\u001a\u00e1r\u00b6'u\u0093\u0007\u0010\u00b5\u00fd\u0016\u00acPx\f\u00d4\u00c6\u00db \f\u00ec\u00ec\u0080;\u0098W$\u00b6\u00ec[\u009b9H\u00d2\"\u0095\u001e\u00c6~}\u0093\u00bf\u009dp<pR\u0014\u0001\u00c9\u00fc";
        int n2 = "\u00c0\u00c4\u008e\u009d\u0014\u009c\u00f5\u00dc(\u00e0\u00fa\u00ed\u00ec7\u00f1\u0098\u00f7kM-\u0002\u00a8\u0016\u00fb\u00c8\b\u0097\u00b0\u00b4\u00ae\u009eq\u0014\u00f9\u00bf\u00052x\u008f#\u007f\u000bU\u00a2:\u00df\u00b7\u00dd\u00fe\u00d0-k\n\u00ed!\u0016\u00eeo\u00fc\u00d8\r\u0081\u0006\u00ecg\u009f\u0096\u0088\u00fb\u001a\u00e1r\u00b6'u\u0093\u0007\u0010\u00b5\u00fd\u0016\u00acPx\f\u00d4\u00c6\u00db \f\u00ec\u00ec\u0080;\u0098W$\u00b6\u00ec[\u009b9H\u00d2\"\u0095\u001e\u00c6~}\u0093\u00bf\u009dp<pR\u0014\u0001\u00c9\u00fc".length();
        int n3 = 88;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = cc_0.b(byArray3).intern();
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
        String string2 = "\u00ca\u009d\u00a5\u00e1kcs\u00f8\b2.\u00e0\u00f0\u00fe^\u00d3";
        int n7 = "\u00ca\u009d\u00a5\u00e1kcs\u00f8\b2.\u00e0\u00f0\u00fe^\u00d3".length();
        int n8 = 0;
        do {
            byte[] byArray6 = string2.substring(n8, n8 += 8).getBytes("ISO-8859-1");
            int n9 = n6++;
            long l2 = ((long)byArray6[0] & 0xFFL) << 56 | ((long)byArray6[1] & 0xFFL) << 48 | ((long)byArray6[2] & 0xFFL) << 40 | ((long)byArray6[3] & 0xFFL) << 32 | ((long)byArray6[4] & 0xFFL) << 24 | ((long)byArray6[5] & 0xFFL) << 16 | ((long)byArray6[6] & 0xFFL) << 8 | (long)byArray6[7] & 0xFFL;
            byte[] byArray7 = cipher2.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n9] = ((long)byArray7[0] & 0xFFL) << 56 | ((long)byArray7[1] & 0xFFL) << 48 | ((long)byArray7[2] & 0xFFL) << 40 | ((long)byArray7[3] & 0xFFL) << 32 | ((long)byArray7[4] & 0xFFL) << 24 | ((long)byArray7[5] & 0xFFL) << 16 | ((long)byArray7[6] & 0xFFL) << 8 | (long)byArray7[7] & 0xFFL;
        } while (n8 < n7);
        B = lArray;
        C = new Long[2];
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
        if (I[n3] != null) {
            return n3;
        }
        Object object = H[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 40;
            case 1 -> 54;
            case 2 -> 13;
            case 3 -> 7;
            case 4 -> 56;
            case 5 -> 15;
            case 6 -> 41;
            case 7 -> 57;
            case 8 -> 26;
            case 9 -> 44;
            case 10 -> 31;
            case 11 -> 21;
            case 12 -> 34;
            case 13 -> 10;
            case 14 -> 2;
            case 15 -> 16;
            case 16 -> 19;
            case 17 -> 37;
            case 18 -> 11;
            case 19 -> 25;
            case 20 -> 60;
            case 21 -> 22;
            case 22 -> 18;
            case 23 -> 5;
            case 24 -> 1;
            case 25 -> 0;
            case 26 -> 52;
            case 27 -> 62;
            case 28 -> 55;
            case 29 -> 59;
            case 30 -> 58;
            case 31 -> 8;
            case 32 -> 51;
            case 33 -> 47;
            case 34 -> 14;
            case 35 -> 28;
            case 36 -> 4;
            case 37 -> 36;
            case 38 -> 6;
            case 39 -> 9;
            case 40 -> 45;
            case 41 -> 29;
            case 42 -> 43;
            case 43 -> 12;
            case 44 -> 20;
            case 45 -> 17;
            case 46 -> 35;
            case 47 -> 42;
            case 48 -> 24;
            case 49 -> 61;
            case 50 -> 3;
            case 51 -> 30;
            case 52 -> 46;
            case 53 -> 23;
            case 54 -> 38;
            case 55 -> 39;
            case 56 -> 27;
            case 57 -> 49;
            case 58 -> 53;
            case 59 -> 50;
            case 60 -> 63;
            case 61 -> 48;
            case 62 -> 33;
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
        cc_0.I[n3] = new String(cArray);
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
        Object[] objectArray = H;
        H[0] = "Cq<\f\u0007\fUq9V\u0014\u001bB::P\u0018\u000fS}-GS\u0018f";
        objectArray[1] = "=ni\br0HNb\u0007c\u007f)@i\fg%]";
        objectArray[2] = Void.TYPE;
        cc_0.I[2] = "java/lang/Void";
        objectArray[3] = "\u0000\u0002d#\u001dw\u001d\u0017<\u0001\\z\u0005\u0011";
        objectArray[4] = Integer.TYPE;
        cc_0.I[4] = "java/lang/Integer";
        objectArray[5] = "hY=Ry,cV,\u001d\u001a!vP";
        objectArray[6] = Float.TYPE;
        cc_0.I[6] = "java/lang/Float";
        objectArray[7] = "?Q\u0012B\"t)Q\u0017\u00181c>\u001a\u0014\u001e=w/]\u0003\tvg8";
        objectArray[8] = "\u001bfWe\u000emnF\\j\u001f\"\u000fHWa\u001bx{";
        objectArray[9] = "%\u0018TfA<%\u0018C:M3?SC$M&8\"\u0013y\u001c";
        objectArray[10] = "f\u0013Bm\u007f-f\u0013U1s\"|XU/s7{)\u0007s&u";
        objectArray[11] = "r'<3q\u0011p9uPz\no<#)}";
        objectArray[12] = "g9\u001f`V\tg9\b<Z\u0006}r\b\"Z\u0013z\u0003\\z\r";
        objectArray[13] = "ZN&E:kZN1\u00196d@\u00051\u00076qGt`_d";
        objectArray[14] = ",P5_\u0005q:P0\u0005\u0016f-\u001b3\u0003\u001ar<\\$\u0014Q`\u0000";
        objectArray[15] = "C\u0004oQq\u00056$d^`JK<wYi\u0003#";
        objectArray[16] = Double.TYPE;
        cc_0.I[16] = "java/lang/Double";
        objectArray[17] = "]7TZ\u0010S]7C\u0006\u001c\\G|C\u0018\u001cI@\r\u0016GE";
        objectArray[18] = "\u0010Z\ff.n\u0006Z\t<=y\u0011\u0011\n:1m\u0000V\u001d-z|@";
        objectArray[19] = "CD\u0016\u0002Q\u00196d\u001d\r@VWj\u0016\u0006D\f#";
        objectArray[20] = "n\u0005\\7Ctx\u0005YmPcoNZk\\w~\tM|\u0017eO";
        objectArray[21] = "\"\u0007\u0018|EcW'\u0013sT,6)\u0018xPvB";
        objectArray[22] = ";p>\u001d\nk;p)A\u0006d!;)_\u0006q&J{\u0005R5";
        objectArray[23] = "f)tb \u0007m&e-C\nx+jFv\bi8vja\u0005";
        objectArray[24] = "as\u000bLFy\u0014S\u0000CW6u]\u000bHSl\u0001";
        objectArray[25] = "W_L3\u0002K\"\u007fG<\u0013\u0004CqL7\u0017^7";
        objectArray[26] = " M\u001e&\u007fK M\tzsD:\u0006\tdsQ=wY=!\u0010";
        objectArray[27] = "<#7\u0013_=*#2IL*=h1O@>,/&X\u000b+i";
        objectArray[28] = "\u000b$;\u0000}\u0004~\u00040\u000flK\u001f\n;\u0004h\u0011k";
        objectArray[29] = "rPc9]py_rv ekEp5";
        objectArray[30] = Long.TYPE;
        cc_0.I[30] = "java/lang/Long";
        objectArray[31] = "n`~#hLeool\tBndk6";
        objectArray[32] = "/<pqPTi4c)-[x.Sj@YsR'*\u0014\rxc!-\u0013]\u0015";
        objectArray[33] = "_L1~a=Y[l:] \f]< 1\u0012[\u001bbwfE_Pa>e}_F'x]";
        objectArray[34] = "JtqpaN\u001035x\u001aQM5H&s\u0004\u0004k5vw\fD\f";
        objectArray[35] = "\u0011_}YG^KT%\u000e7]LGtT[o\u001a\u0000)\f\u000e8\u0010Rt\u0002TSETiH7";
        objectArray[36] = "fd/H\u0010Si!2Pm\u0004Wr;Q\u0003\fn&y\u0010\u0017n";
        objectArray[37] = "u:9+*\txnq)J]#x@%+[,82%8^4\u0003*.%Qrq*= II";
        objectArray[38] = "JA\u001dQM\nLV@\u0015q\u001c\u0015A\u0014\u0004&KK\u0016LhA\u0016\u001dF\u0000\u000e\u001b\u001dE\u0011";
        objectArray[39] = "j[\u000fM\u0012\u001b,S\u001c\u0015o\u0014=I9A\u0003{k\u000fZ\u0015\u0002Jm\b]Eo";
        objectArray[40] = "gv\u0018=UlaaEyiz8v\u0011h>-g+J\u0004\u0002\u007f`{\tnSj4*";
        objectArray[41] = "\u0013Y&$;\u001d\u001e\rn&[ZH\u001d9,[\u001cFP.'&LBXn@`\u001a\u0016Y2qf\u001d\u0011\t_";
        objectArray[42] = "xe@0\u0017\u0017\"\"\u00048l\b\u007f'yf\u0005]6z\u00046\u0001Uv\u001d";
        objectArray[43] = "qTt\u0015H!$\u001b>\u00118/\u001aDlR\u0003tcVe\u0005[N#Xj\u001e\u0005**L7\\8";
        objectArray[44] = "\nfa\u000e\u001f\u0014\u0019bxPo\u0019g;yTTO\u001e)p\u0003\fu]7v\u000b\u0012\u0015\u001b?eSo";
        objectArray[45] = "\"\u0000C ${\"\u0016\u0005f\u001c&q\r\u001e>p\u0014 MNg\u001cx&HG4-~!O\u0017Y";
        objectArray[46] = "Sr\u0004xxm^&Lz\u00189\u0013\"\u001b&\u0018:\u000e$\u0018'j:\u001d!\u0000\u001cr1\u0000.Fnr\"\u00056}vy?\np\u000fvj:\u0012K";
        objectArray[47] = "_RaS%_\fV)OOYb^:\u000et\b\u001bL3Y,2^UiA(O\u000eQa\u0001O";
        objectArray[48] = ":\u000e\u001a\u0011m$7ZR\u0013\rtvOc\u001flvc\f\u0011\u001f\u007fs{7\t\u0014b|=E\t\u0007gd\u0006";
        objectArray[49] = "mhl\u0002\u0010K`<$\u0000p\u001d6*\u0015\f\u0011\u00194jg\f\u0002\u001c,Q\u007f\u0007\u001f\u0013j#\u007f\u0014\u001a\u000bQ";
        objectArray[50] = "\fu\u0004m|\n\u000b\"\u001ck@Q\u000fd\u0018e,cY#E=y4Sq\u00183#_\u0006w\u0005y@";
        objectArray[51] = "x9\u0019\n\u000fE-?\u0004@l@(=\u001dW;\u0017rm@;\u0006O&5BI\u0006\\#-";
        objectArray[52] = "bi\u0006qa\u00138.By\u001a\fe)?'sY,vBwwQl\u0011";
        objectArray[53] = "o j4\\\u00135+2c,\u001028c9@\"dz?c\u0010uc-3/K\b3);o,";
        objectArray[54] = "\u001d{\t_IQ\u001dmO\u0019q\fNvTA\u001d>\u001f7\f\u001cqR\u00193\rK@T\u001e4]&";
        objectArray[55] = "^\u0016\u0006fj+\r\u0012Nz\u0000/c\u0017\u0007=m;\u001b\u001a\u000f}yF\fA\u0006h}>\u0001IF|\u0000";
        objectArray[56] = "B(Tp\u0016.O|\u001crvv\u001fw-(\u001f#\u000fvPx\u001b+O\u0011\u0011}Fb\u0019lAyN\"~-D$\u0007t\u0003}@,G\u0013";
        objectArray[57] = "\u0014\u001ev\u0019F\u0002V@}h\u001fgF\u0012%SF\u001eT\u001br\u000b|^Z\u0014iU\u0018WNI+h";
        objectArray[58] = "7mTeLMdi\u001cy&I\na\u000f8\u001d\u001ass\u0006oE 19U?K\u00117>Ro&";
        objectArray[59] = "/0\u0001\u0014v>\"dI\u0016\u0016\u007ftS\u0011\u001cwjurx\u001awlv2\n\u001adin\t\u0012\u0011yf({\u0012\u0002|~\u0013";
        objectArray[60] = "BC18\u000e}O\u0017y:n<\u00196%3\u0014-\u0013\u0001H6\u000f/\u001bA:6\u001c*\u0003z\"=\u0001%E\b\".\u0004=~";
        objectArray[61] = "h\r\f?,J=\u000b\u0011uOO8\t\bb\u0018\u0018bYT\u000e%@6\u0001W|%S3\u0019";
        objectArray[62] = "m\u0013Q\u000b*%7\u0018\t\\Z&0\u000bX\u00066\u0014fI\u0004\\gCa\u001e\b\u0010=>1\u001a\u0000PZ";
        objectArray[63] = "($\u0003{o}{ Kg\u0005j\u0015(X&>*l:Qqf\u0010,4^j8t% \u0003(\u0005";
        objectArray[64] = "$n\u007fsE;):7q%}a-z\u0017Ogw2=eOtr*\u0006}Di}lt}WleW";
        objectArray[65] = "\u0007\u001b\"\u0014\rQ\u0016H|\u000fjD\u000bY#\u0019\u0006v_\u0018xEZ!\fD,\u001bQS\fW)\u0003jK\u0007J&E\u0018K\u0014O>~";
        objectArray[66] = "Q\\\u0014M\u0012\"\u0017T\u0007\u0015o-\u0006N\"c%BP\bA\u0015\u0002sV\u000fFEo";
        objectArray[67] = "*n{Y\nAlfh\u0001wN}|]\\\nL\u0010;-\u0001NL!=*\u0006\u001e!";
        objectArray[68] = "O\u0006OI?W\u0013\u001cL\u001eT\u0000.\u001dQ\u0011oSW\u000fXF7i@\u0012N@hWGEVFT";
        objectArray[69] = "\u0011[\nqAe\u001c\u000fBs!#L\u0004s\u007f@7HY\u0001\u007fS2Pb\u0019tN=\u0016\u0010\u0019gK%-";
        objectArray[70] = "\u0007=S@1\u0004R;N\nR\u0001W9W\u001d\u0005V\ri\tq8\u000eY1\b\u00038\u001d\\)";
        objectArray[71] = "[@\u0000\u0016-%\\J\u0000\rV!E\\C\u001e06dG\\\u001e\u0013+\\BX\bV.T\u001eAL-+Z\u001cTs";
        Object[] objectArray2 = objectArray;
        objectArray[72] = "j\u0017\u0000\t}({D^\u0012\u001a=fU\u0001\u0004v\u000f2\u0014ZR!X7@Q\u0012}%gDYR\u001adb\u0019\u0010\u0004g4f\u0011Pc";
    }

    private static long c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7FA7;
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
                throw new RuntimeException("dev/zprestige/prestige/cc", exception);
            }
            long l4 = ((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL;
            cc_0.C[n2] = l4;
        }
        return C[n2];
    }

    private static long c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = cc_0.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Long.TYPE, l2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return l2;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/cc" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = cc_0.c(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00d6' || c == 'n' || c == '\u00c5' || c == '\u00c3') {
                field = cc_0.k(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00d6' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'n' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00c5' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = cc_0.l(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'B' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'A' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static float c(Object[] objectArray) {
        Object object;
        block6: {
            float f;
            float f10;
            long l;
            block4: {
                float f11;
                block5: {
                    f11 = ((Float)objectArray[0]).floatValue();
                    l = (Long)objectArray[1];
                    l = v ^ l;
                    CallSite callSite = cc_0.d("A", (long)6746421305113514678L, (long)l);
                    try {
                        try {
                            f10 = f11;
                            f = 0.0f;
                            if (callSite != null) break block4;
                            if (!(f10 < f)) break block5;
                        }
                        catch (MatchException matchException) {
                            throw cc_0.d("A", (Object)matchException, (long)6747762385751149277L, (long)l);
                        }
                        object = 0.0f;
                        break block6;
                    }
                    catch (MatchException matchException) {
                        throw cc_0.d("A", (Object)matchException, (long)6747762385751149277L, (long)l);
                    }
                }
                f10 = f11;
                f = 1.0f;
            }
            object = cc_0.d("A", (float)f10, (float)f, (long)6748378717639546881L, (long)l);
        }
        return (float)object;
    }

    private static Field f(Class clazz, String string, Class clazz2) {
        Field field = cc_0.e(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = cc_0.f(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method f(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = cc_0.e(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = cc_0.f(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void l(Object[] objectArray) {
        Object object;
        Object object2;
        CallSite callSite;
        CallSite callSite2;
        CallSite callSite3;
        long l;
        long l2;
        long l3;
        long l4;
        Matrix4f matrix4f;
        block47: {
            block48: {
                float f;
                float f10;
                Object object3;
                float f11;
                Object object4;
                CallSite callSite4;
                block46: {
                    boolean bl;
                    block45: {
                        block39: {
                            Object object5;
                            CallSite callSite5;
                            block43: {
                                block44: {
                                    reference v15;
                                    block42: {
                                        block41: {
                                            block40: {
                                                CallSite callSite6;
                                                block38: {
                                                    float f12;
                                                    long l5;
                                                    block37: {
                                                        Object object6;
                                                        Object object7;
                                                        block35: {
                                                            block36: {
                                                                class_310 class_3102;
                                                                block34: {
                                                                    aq_0 aq_02 = (aq_0)objectArray[0];
                                                                    gK gK2 = (gK)objectArray[1];
                                                                    matrix4f = (Matrix4f)objectArray[2];
                                                                    l4 = (Long)objectArray[3];
                                                                    long l6 = l4;
                                                                    l3 = l6 ^ 0x194A66AD9C40L;
                                                                    l2 = l6 ^ 0x158F6E24EE7EL;
                                                                    l = l6 ^ 0x20BE2F08284AL;
                                                                    l5 = l6 ^ 0x7988E390166EL;
                                                                    CallSite callSite7 = cc_0.d("A", (long)-6305204243452139671L, (long)l4);
                                                                    Object[] objectArray2 = new Object[2];
                                                                    objectArray2[1] = Float.valueOf(0.0f);
                                                                    objectArray2[0] = Float.valueOf(0.0f);
                                                                    cc_0.d("B", (Object)this, (Object)objectArray2, (long)-6306007608689311599L, (long)l4);
                                                                    callSite4 = callSite7;
                                                                    try {
                                                                        try {
                                                                            class_3102 = b;
                                                                            if (callSite4 != null) break block34;
                                                                            if (cc_0.d("\u00d6", (Object)class_3102, (long)-6305058222362257418L, (long)l4) == null) return;
                                                                        }
                                                                        catch (MatchException matchException) {
                                                                            throw cc_0.d("A", (Object)matchException, (long)-6306255091307086078L, (long)l4);
                                                                        }
                                                                        class_3102 = b;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw cc_0.d("A", (Object)matchException, (long)-6306255091307086078L, (long)l4);
                                                                    }
                                                                }
                                                                try {
                                                                    if (cc_0.d("\u00d6", (Object)class_3102, (long)-6306066611654569145L, (long)l4) == null) {
                                                                        return;
                                                                    }
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw cc_0.d("A", (Object)matchException, (long)-6306255091307086078L, (long)l4);
                                                                }
                                                                callSite3 = cc_0.d("A", (long)-6311873399797918186L, (long)l4);
                                                                try {
                                                                    try {
                                                                        Object object6 = this.o;
                                                                        object6 = cc_0.c("o", (int)9589, (long)(0x544EB523BEEBF2A5L ^ l4));
                                                                        if (callSite4 != null) break block35;
                                                                        if (object7 != object6) break block36;
                                                                    }
                                                                    catch (MatchException matchException) {
                                                                        throw cc_0.d("A", (Object)matchException, (long)-6306255091307086078L, (long)l4);
                                                                    }
                                                                    f12 = 0.016f;
                                                                    break block37;
                                                                }
                                                                catch (MatchException matchException) {
                                                                    throw cc_0.d("A", (Object)matchException, (long)-6306255091307086078L, (long)l4);
                                                                }
                                                            }
                                                            Object object6 = callSite3;
                                                            object6 = this.o;
                                                        }
                                                        f12 = (float)(object7 - object6) / 1000.0f;
                                                    }
                                                    object4 = f12;
                                                    this.o = (long)callSite3;
                                                    object4 = cc_0.d("A", (float)object4, (float)0.05f, (long)-6307151661523341858L, (long)l4);
                                                    Object[] objectArray3 = new Object[1];
                                                    objectArray3[0] = l5;
                                                    CallSite callSite8 = cc_0.d("A", (Object)objectArray3, (long)-6311953191357390495L, (long)l4);
                                                    boolean bl2 = false;
                                                    f11 = 0.0f;
                                                    try {
                                                        callSite6 = callSite8;
                                                        if (callSite4 != null) break block38;
                                                        if (callSite6 == null) break block39;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw cc_0.d("A", (Object)matchException, (long)-6306255091307086078L, (long)l4);
                                                    }
                                                    callSite6 = callSite8;
                                                }
                                                CallSite callSite9 = cc_0.d("B", (Object)callSite6, (long)-6306450011883404484L, (long)l4);
                                                CallSite callSite10 = cc_0.d("B", (Object)cc_0.d("\u00d6", (Object)b, (long)-6305058222362257418L, (long)l4), (long)-6305443861676978153L, (long)l4);
                                                reference var24_21 = cc_0.d("\u00d6", (Object)callSite9, (long)-6311806518767145236L, (long)l4) - cc_0.d("\u00d6", (Object)callSite10, (long)-6311806518767145236L, (long)l4);
                                                reference var26_23 = cc_0.d("\u00d6", (Object)callSite9, (long)-6306525889159173838L, (long)l4) - cc_0.d("\u00d6", (Object)callSite10, (long)-6306525889159173838L, (long)l4);
                                                reference var28_25 = cc_0.d("\u00d6", (Object)callSite9, (long)-6306972585931340087L, (long)l4) - cc_0.d("\u00d6", (Object)callSite10, (long)-6306972585931340087L, (long)l4);
                                                callSite2 = cc_0.d("A", (double)(var24_21 * var24_21 + var28_25 * var28_25), (long)-6312274369722485016L, (long)l4);
                                                CallSite callSite11 = cc_0.d("A", (double)cc_0.d("A", (double)(-var24_21), (double)var28_25, (long)-6305639298349173259L, (long)l4), (long)-6306927540402285778L, (long)l4);
                                                CallSite callSite12 = cc_0.d("A", (double)(-cc_0.d("A", (double)var26_23, (double)callSite2, (long)-6305639298349173259L, (long)l4)), (long)-6306927540402285778L, (long)l4);
                                                callSite5 = cc_0.d("A", (double)(callSite11 - (double)cc_0.d("B", (Object)cc_0.d("\u00d6", (Object)b, (long)-6305058222362257418L, (long)l4), (long)-6306378734703149058L, (long)l4)), (long)-6312290573174120766L, (long)l4);
                                                reference var38_34 = callSite12 - (double)cc_0.d("B", (Object)cc_0.d("\u00d6", (Object)b, (long)-6305058222362257418L, (long)l4), (long)-6306796702312031830L, (long)l4);
                                                try {
                                                    try {
                                                        reference v15 = cc_0.d("A", (double)callSite5, (long)-6305319832304216447L, (long)l4) - 45.0;
                                                        v15 = v15 == 0 ? 0 : (v15 < 0 ? -1 : 1);
                                                        if (callSite4 != null) break block40;
                                                        if (v15 >= 0) break block41;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw cc_0.d("A", (Object)matchException, (long)-6306255091307086078L, (long)l4);
                                                    }
                                                    reference v15 = cc_0.d("A", (double)var38_34, (long)-6305319832304216447L, (long)l4) - 45.0;
                                                    v15 = v15 == 0 ? 0 : (v15 < 0 ? -1 : 1);
                                                }
                                                catch (MatchException matchException) {
                                                    throw cc_0.d("A", (Object)matchException, (long)-6306255091307086078L, (long)l4);
                                                }
                                            }
                                            try {
                                                if (callSite4 != null) break block42;
                                                if (v15 >= 0) break block41;
                                            }
                                            catch (MatchException matchException) {
                                                throw cc_0.d("A", (Object)matchException, (long)-6306255091307086078L, (long)l4);
                                            }
                                            v15 = (reference)true;
                                            break block42;
                                        }
                                        v15 = (reference)false;
                                    }
                                    callSite = v15;
                                    try {
                                        object5 = callSite;
                                        if (callSite4 != null) break block43;
                                        if (object5 != false) break block44;
                                    }
                                    catch (MatchException matchException) {
                                        throw cc_0.d("A", (Object)matchException, (long)-6306255091307086078L, (long)l4);
                                    }
                                    object5 = true;
                                    break block43;
                                }
                                object5 = false;
                            }
                            object3 = object5;
                            f11 = (float)callSite5;
                        }
                        try {
                            bl = this.n;
                            if (callSite4 != null) break block45;
                            if (bl) break block46;
                        }
                        catch (MatchException matchException) {
                            throw cc_0.d("A", (Object)matchException, (long)-6306255091307086078L, (long)l4);
                        }
                        bl = object3;
                    }
                    try {
                        if (bl) {
                            this.k = f11;
                            this.n = true;
                        }
                    }
                    catch (MatchException matchException) {
                        throw cc_0.d("A", (Object)matchException, (long)-6306255091307086078L, (long)l4);
                    }
                }
                float f13 = 1.0f - (float)cc_0.d("A", (double)(-5.0f * object4), (long)-6306636828954660661L, (long)l4);
                try {
                    f10 = object3 != false ? 10.0f : 28.0f;
                }
                catch (MatchException matchException) {
                    throw cc_0.d("A", (Object)matchException, (long)-6306255091307086078L, (long)l4);
                }
                float f14 = f10;
                float f15 = 1.0f - (float)cc_0.d("A", (double)(-f14 * object4), (long)-6306636828954660661L, (long)l4);
                CallSite callSite13 = cc_0.d("A", (float)(f11 - this.k), (long)-6312841830508793340L, (long)l4);
                try {
                    this.k = (float)cc_0.d("A", (float)(this.k + callSite13 * f13), (long)-6312841830508793340L, (long)l4);
                    f = object3 != false ? 1.0f : 0.0f;
                }
                catch (MatchException matchException) {
                    throw cc_0.d("A", (Object)matchException, (long)-6306255091307086078L, (long)l4);
                }
                float f16 = f;
                try {
                    try {
                        this.l += (f16 - this.l) * f15;
                        Object object = this.l;
                        object = 0.01f;
                        if (callSite4 != null) break block47;
                        if (!(object2 < object)) break block48;
                    }
                    catch (MatchException matchException) {
                        throw cc_0.d("A", (Object)matchException, (long)-6306255091307086078L, (long)l4);
                    }
                    this.n = false;
                    return;
                }
                catch (MatchException matchException) {
                    throw cc_0.d("A", (Object)matchException, (long)-6306255091307086078L, (long)l4);
                }
            }
            Object object = cc_0.d("B", (Object)matrix4f, (long)-6306326914962835972L, (long)l4) * cc_0.d("B", (Object)matrix4f, (long)-6306326914962835972L, (long)l4) + cc_0.d("B", (Object)matrix4f, (long)-6305378284441455088L, (long)l4) * cc_0.d("B", (Object)matrix4f, (long)-6305378284441455088L, (long)l4);
            object = cc_0.d("B", (Object)matrix4f, (long)-6305952197516438912L, (long)l4) * cc_0.d("B", (Object)matrix4f, (long)-6305952197516438912L, (long)l4);
        }
        float f = (float)cc_0.d("A", (double)(object2 + object), (long)-6312274369722485016L, (long)l4);
        float f17 = (float)cc_0.d("B", (Object)cc_0.d("B", (Object)b, (long)-6305593737921089934L, (long)l4), (long)-6305870080598454413L, (long)l4) / 2.0f / f;
        float f18 = (float)cc_0.d("B", (Object)cc_0.d("B", (Object)b, (long)-6305593737921089934L, (long)l4), (long)-6306199896672426253L, (long)l4) / 2.0f / f;
        callSite2 = cc_0.d("A", (double)this.k, (long)-6307089548062182571L, (long)l4);
        float f19 = (float)cc_0.d("A", (double)callSite2, (long)-6312063041984964100L, (long)l4);
        float f20 = -((float)cc_0.d("A", (double)callSite2, (long)-6306660402646816257L, (long)l4));
        float f21 = -f20;
        float f22 = f19;
        Object[] objectArray4 = new Object[1];
        objectArray4[0] = l3;
        CallSite callSite14 = cc_0.d("A", (Object)objectArray4, (long)-6305753752998891565L, (long)l4);
        float f23 = 1.0f + 0.18f * (float)cc_0.d("A", (double)((double)callSite3 * 0.012), (long)-6312063041984964100L, (long)l4);
        Object[] objectArray5 = new Object[3];
        objectArray5[2] = l2;
        objectArray5[1] = Float.valueOf(0.1f * this.l * f23);
        objectArray5[0] = callSite14;
        CallSite callSite15 = cc_0.d("A", (Object)objectArray5, (long)-6307023638280812895L, (long)l4);
        Object[] objectArray6 = new Object[3];
        objectArray6[2] = l2;
        objectArray6[1] = Float.valueOf(0.22f * this.l * f23);
        objectArray6[0] = callSite14;
        CallSite callSite16 = cc_0.d("A", (Object)objectArray6, (long)-6307023638280812895L, (long)l4);
        Object[] objectArray7 = new Object[13];
        objectArray7[12] = l;
        objectArray7[11] = (int)callSite15;
        objectArray7[10] = Float.valueOf(6.9f);
        objectArray7[9] = Float.valueOf(7.4f);
        objectArray7[8] = Float.valueOf(13.8f);
        objectArray7[7] = Float.valueOf(18.4f);
        objectArray7[6] = Float.valueOf(f22);
        objectArray7[5] = Float.valueOf(f21);
        objectArray7[4] = Float.valueOf(f20);
        objectArray7[3] = Float.valueOf(f19);
        objectArray7[2] = Float.valueOf(f18);
        objectArray7[1] = Float.valueOf(f17);
        objectArray7[0] = matrix4f;
        cc_0.d("A", (Object)objectArray7, (long)-6306830286518650279L, (long)l4);
        Object[] objectArray8 = new Object[13];
        objectArray8[12] = l;
        objectArray8[11] = (int)callSite16;
        objectArray8[10] = Float.valueOf(5.7f);
        objectArray8[9] = Float.valueOf(6.2f);
        objectArray8[8] = Float.valueOf(11.4f);
        objectArray8[7] = Float.valueOf(17.2f);
        objectArray8[6] = Float.valueOf(f22);
        objectArray8[5] = Float.valueOf(f21);
        objectArray8[4] = Float.valueOf(f20);
        objectArray8[3] = Float.valueOf(f19);
        objectArray8[2] = Float.valueOf(f18);
        objectArray8[1] = Float.valueOf(f17);
        objectArray8[0] = matrix4f;
        cc_0.d("A", (Object)objectArray8, (long)-6306830286518650279L, (long)l4);
        Object[] objectArray9 = new Object[3];
        objectArray9[2] = l2;
        objectArray9[1] = Float.valueOf(this.l);
        objectArray9[0] = callSite14;
        callSite = cc_0.d("A", (Object)objectArray9, (long)-6307023638280812895L, (long)l4);
        Object[] objectArray10 = new Object[13];
        objectArray10[12] = l;
        objectArray10[11] = (int)callSite;
        objectArray10[10] = Float.valueOf(4.5f);
        objectArray10[9] = Float.valueOf(5.0f);
        objectArray10[8] = Float.valueOf(9.0f);
        objectArray10[7] = Float.valueOf(16.0f);
        objectArray10[6] = Float.valueOf(f22);
        objectArray10[5] = Float.valueOf(f21);
        objectArray10[4] = Float.valueOf(f20);
        objectArray10[3] = Float.valueOf(f19);
        objectArray10[2] = Float.valueOf(f18);
        objectArray10[1] = Float.valueOf(f17);
        objectArray10[0] = matrix4f;
        cc_0.d("A", (Object)objectArray10, (long)-6306830286518650279L, (long)l4);
    }

    private static Method l(long l, long l2) {
        int n = cc_0.i(l, l2);
        Object object = H[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = I[n];
                int n3 = string2.indexOf(8);
                clazz3 = cc_0.j(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = cc_0.j(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = cc_0.e(clazz, string, clazz2, n2, classArray2)) != null) {
                        cc_0.H[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = cc_0.j(2209273024755270L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = cc_0.f(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        cc_0.H[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = cc_0.j(2209273024755270L, 0L);
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
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/cc" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/cc" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(Object[] objectArray) {
        Color color = (Color)objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        long l = (Long)objectArray[2];
        long l2 = (l = v ^ l) ^ 0x65C41AF01BA1L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = Float.valueOf(f);
        CallSite callSite = cc_0.d("A", (float)(255.0f * cc_0.d("A", (Object)objectArray2, (long)-2223705639807086467L, (long)l)), (long)-2224089051101426427L, (long)l);
        return (int)cc_0.d("B", (Object)new Color((int)cc_0.d("B", (Object)color, (long)-2224254939777602933L, (long)l), (int)cc_0.d("B", (Object)color, (long)-2224711123125088292L, (long)l), (int)cc_0.d("B", (Object)color, (long)-2217796083604378516L, (long)l), (int)callSite), (long)-2217828442014246533L, (long)l);
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = cc_0.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6FB7;
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
                throw new RuntimeException("dev/zprestige/prestige/cc", exception);
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
            cc_0.x[n2] = cc_0.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return x[n2];
    }

    private static Field k(long l, long l2) {
        int n = cc_0.i(l, l2);
        Object object = H[n];
        if (object instanceof String) {
            String string = I[n];
            int n2 = string.indexOf(8);
            Class clazz = cc_0.j(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = cc_0.j(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = cc_0.e(clazz3, string2, clazz2)) != null) {
                    cc_0.H[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = cc_0.f(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        cc_0.H[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = cc_0.j(2209273024755270L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Class j(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = cc_0.i(l, l2);
            object = H[n];
            try {
                if (!(object instanceof String)) break block2;
                cc_0.H[n] = clazz = Class.forName(I[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static void r(Object[] objectArray) {
        Matrix4f matrix4f = (Matrix4f)objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        float f10 = ((Float)objectArray[2]).floatValue();
        float f11 = ((Float)objectArray[3]).floatValue();
        float f12 = ((Float)objectArray[4]).floatValue();
        float f13 = ((Float)objectArray[5]).floatValue();
        float f14 = ((Float)objectArray[6]).floatValue();
        float f15 = ((Float)objectArray[7]).floatValue();
        float f16 = ((Float)objectArray[8]).floatValue();
        float f17 = ((Float)objectArray[9]).floatValue();
        float f18 = ((Float)objectArray[10]).floatValue();
        int n = (Integer)objectArray[11];
        long l = (Long)objectArray[12];
        long l2 = (l = v ^ l) ^ 0x76C2F26D3C81L;
        float f19 = f + f11 * f15;
        float f20 = f10 + f12 * f15;
        float f21 = -f11 * f16;
        float f22 = -f12 * f16;
        float f23 = f13 * f17;
        float f24 = f14 * f17;
        float f25 = f19 + f21 + f23;
        float f26 = f20 + f22 + f24;
        float f27 = f19 + f21 - f23;
        float f28 = f20 + f22 - f24;
        float f29 = f19 - f11 * f18;
        float f30 = f20 - f12 * f18;
        Object[] objectArray2 = new Object[9];
        objectArray2[8] = l2;
        objectArray2[7] = n;
        objectArray2[6] = Float.valueOf(f26);
        objectArray2[5] = Float.valueOf(f25);
        objectArray2[4] = Float.valueOf(f30);
        objectArray2[3] = Float.valueOf(f29);
        objectArray2[2] = Float.valueOf(f20);
        objectArray2[1] = Float.valueOf(f19);
        objectArray2[0] = matrix4f;
        cc_0.d("A", (Object)objectArray2, (long)2815404137203030246L, (long)l);
        Object[] objectArray3 = new Object[9];
        objectArray3[8] = l2;
        objectArray3[7] = n;
        objectArray3[6] = Float.valueOf(f30);
        objectArray3[5] = Float.valueOf(f29);
        objectArray3[4] = Float.valueOf(f28);
        objectArray3[3] = Float.valueOf(f27);
        objectArray3[2] = Float.valueOf(f20);
        objectArray3[1] = Float.valueOf(f19);
        objectArray3[0] = matrix4f;
        cc_0.d("A", (Object)objectArray3, (long)2815404137203030246L, (long)l);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(cc_0.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)J", null));
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
            return MethodHandles.lookup().findStatic(cc_0.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(cc_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


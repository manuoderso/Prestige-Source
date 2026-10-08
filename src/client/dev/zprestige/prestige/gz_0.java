/*
 * Decompiled with CFR 0.152.
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.hc;
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

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from dev.zprestige.prestige.gz
 */
public record gz_0(boolean aR, boolean aS, boolean aT, boolean aU, int aV, int aW, int aX, int aY, int aZ, int[] a0, int a1, int a2, int a3, int a4, int a5, int a6, int[] a7, int a8, int a9) {
    private static final int a;
    private static final long b;
    private static final long[] c;
    private static final Integer[] d;
    private static final Map e;
    private static final Object[] f;
    private static final String[] g;

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                gz_0.b = hc.a(-3884833738930918174L, 7069100185193358716L, MethodHandles.lookup().lookupClass()).a(138693870577501L);
                gz_0.f = new Object[26];
                gz_0.g = new String[26];
                gz_0.b();
                gz_0.e = new HashMap<K, V>(13);
                var0 = gz_0.b ^ 13929271383080L;
                var2_1 = Cipher.getInstance("DES/CBC/NoPadding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var8_3 = new long[33];
                var5_4 = 0;
                var6_5 = "KD\u00b62\u000b\u0017~\u00c4um\u0097\u009f\u00ed:\u00bb2\u00b1KgR\u0016= \u00e5\fBE\u0018R*V\u001b\u00df\u00ba\u0099\u00f9\u009e20\u0082N\u00b0$v\u00b1\u0091\u00a8\u00cb\u00dfv\u00b2\r\u00e5)7j\u0019\u00abr\u00ba\u00ab\u00ee\u00cfO\u00cfE\u001b\u00ec\u0000\u00e2\u00deA\u0083\u00117G}\u0016\u00bd\u007f\u001b\u001f\u00a7\u000e\u00aasr15v\u0002\u0089\u00bc\u00b4Lk\u00ae\u00e6.\u00b53\u00c22\u0000\u0007Q.\u0095\u009e@\u001d1\u00b4\u00fc_\u0010*S\u0019?\u00f3\u00d2%8H\u00c4\u00be\u00f6\u0001\u0006\u00f2\u00dd\u001f\u00f1\u001b\u00c0\u00e6E?0<;l\u000fG[\u00fff\u00b9\u00c1O\u00ff\u00af\u00c7\u008ba\u000b\u0007\u008d\u00caE\tk\u0007!V Xi\u00d5\u00e4/\r=\u00ab\u00a4\u00d6\u00a1S\u00d2\u00ae\u00da\u0096-6\u00a7r\u00b0V\u00fcM\u00e3v0U=s%\nh\u00e9\u00eb'\u00f2\u00b0\u00c1\u00c4\u0094_`\u00e0\u00b1\bhTT\u00f8{\u00b3\u0002b\u0098\u0088Bb\u0018\u00b7\u00c2\u00e4\u0011\u00e6\u00b4i\u00b0[z\u00c1@\u00ee\u00e0\u0002\u00faE\u00a7\u009a\u009f\u001d\u0091";
                var7_6 = "KD\u00b62\u000b\u0017~\u00c4um\u0097\u009f\u00ed:\u00bb2\u00b1KgR\u0016= \u00e5\fBE\u0018R*V\u001b\u00df\u00ba\u0099\u00f9\u009e20\u0082N\u00b0$v\u00b1\u0091\u00a8\u00cb\u00dfv\u00b2\r\u00e5)7j\u0019\u00abr\u00ba\u00ab\u00ee\u00cfO\u00cfE\u001b\u00ec\u0000\u00e2\u00deA\u0083\u00117G}\u0016\u00bd\u007f\u001b\u001f\u00a7\u000e\u00aasr15v\u0002\u0089\u00bc\u00b4Lk\u00ae\u00e6.\u00b53\u00c22\u0000\u0007Q.\u0095\u009e@\u001d1\u00b4\u00fc_\u0010*S\u0019?\u00f3\u00d2%8H\u00c4\u00be\u00f6\u0001\u0006\u00f2\u00dd\u001f\u00f1\u001b\u00c0\u00e6E?0<;l\u000fG[\u00fff\u00b9\u00c1O\u00ff\u00af\u00c7\u008ba\u000b\u0007\u008d\u00caE\tk\u0007!V Xi\u00d5\u00e4/\r=\u00ab\u00a4\u00d6\u00a1S\u00d2\u00ae\u00da\u0096-6\u00a7r\u00b0V\u00fcM\u00e3v0U=s%\nh\u00e9\u00eb'\u00f2\u00b0\u00c1\u00c4\u0094_`\u00e0\u00b1\bhTT\u00f8{\u00b3\u0002b\u0098\u0088Bb\u0018\u00b7\u00c2\u00e4\u0011\u00e6\u00b4i\u00b0[z\u00c1@\u00ee\u00e0\u0002\u00faE\u00a7\u009a\u009f\u001d\u0091".length();
                var4_7 = 0;
                while (true) {
                    var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                    v3 = var8_3;
                    v4 = var5_4++;
                    v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                    v6 = -1;
                    break block8;
                    break;
                }
lbl41:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    var6_5 = "\u0000:X4:\u00d1\u00dc+\u00ec&\u00aaz\u00d9$]\u0005";
                    var7_6 = "\u0000:X4:\u00d1\u00dc+\u00ec&\u00aaz\u00d9$]\u0005".length();
                    var4_7 = 0;
                    while (true) {
                        var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                        v3 = var8_3;
                        v4 = var5_4++;
                        v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                        v6 = 0;
                        break block8;
                        break;
                    }
                    break;
                }
lbl60:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    break block9;
                    break;
                }
            }
            var10_9 = v5;
            var12_10 = var2_1.doFinal(new byte[]{(byte)(var10_9 >>> 56), (byte)(var10_9 >>> 48), (byte)(var10_9 >>> 40), (byte)(var10_9 >>> 32), (byte)(var10_9 >>> 24), (byte)(var10_9 >>> 16), (byte)(var10_9 >>> 8), (byte)var10_9});
            v7 = ((long)var12_10[0] & 255L) << 56 | ((long)var12_10[1] & 255L) << 48 | ((long)var12_10[2] & 255L) << 40 | ((long)var12_10[3] & 255L) << 32 | ((long)var12_10[4] & 255L) << 24 | ((long)var12_10[5] & 255L) << 16 | ((long)var12_10[6] & 255L) << 8 | (long)var12_10[7] & 255L;
            switch (v6) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl73:
                // 1 sources

                ** continue;
            }
        }
        gz_0.c = var8_3;
        gz_0.d = new Integer[33];
        gz_0.a = (int)gz_0.a("r", (int)3914, (long)(var0 ^ 7762544638831753113L));
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = gz_0.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = gz_0.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/gz" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static void b() {
        Object[] objectArray = f;
        f[0] = "|$e^vAy1n^uFv8e\u001c4q_e23";
        objectArray[1] = Integer.TYPE;
        gz_0.g[1] = "java/lang/Integer";
        objectArray[2] = "J\u001e";
        objectArray[3] = Void.TYPE;
        gz_0.g[3] = "java/lang/Void";
        objectArray[4] = "gZ\"1obqZ'k|uf\u0011$mpawV3z;sK";
        objectArray[5] = "??0\u0017UfJ\u001f;\u0018D)7\u0007(\u001fM`_";
        objectArray[6] = "\\\u0007r\u0003W=J\u0007wYD*]Lt_H>L\u000bcH\u0003*B";
        objectArray[7] = "\u0018\u0001[c'\f\u0013\u000eJ,D\u0001\u0006\u0003EGq\u0003\u0017\u0010Ykf\u000e";
        objectArray[8] = Boolean.TYPE;
        gz_0.g[8] = "java/lang/Boolean";
        objectArray[9] = "\u0007)\u0014/\"\u0019\f&\u0005`C\u0017\u0007-\u0001:";
        objectArray[10] = "J\bF]f\u000e\u0000\u001e\u0014b2\u0014>\u001eQ#;\f\u001c\u001c@\u0018#pHM\u0015\u001al\u0002\f\u001c\\\u0019]I\u0000\u001d\u0017\b=\u0013H\fRbg\u001eM\f]^b\u0016\u001b\u0012-";
        objectArray[11] = "rC@um;8U\u0012J9!\u0005YP#<!$8\u0012tn=xJV%'>I\u0002Ev)5u\u0007M 7E";
        objectArray[12] = ")\u001b$\u0000\u001b-,T=\\b-\u0012\u001f>X\u0003-kE*\u0019\u0018G";
        objectArray[13] = "xHMv6L2^\u001fIbV\tR@%GO-]K3\r\u000b}\u000b^x\u007fO,B]I4\f{K\u0017;p]2H&sc\u000e<C\u001avkX\"3";
        objectArray[14] = "KPG\u0004D\n\u0001F\u0015;\u0010\u0010-PAc\u0005\u0013\u001fQE^\u007fMN\u0013T\n\r\t\u001fZW;E\u001aLT\\\u0007@\u0012\u001aJ,";
        objectArray[15] = "r\u0005,-g\u00018\u0013~\u00123\u001b\u0003\u001f!~\u0000\u00129\u0002:h1\u007fp@\u007fjm\r4\u00116i\\FwF?#.\u0002&\u000f<\u0012f\u0011u\u00017.c\u0019#\u001fG";
        objectArray[16] = "\f\nC\u0003'HF\u001c\u0011<sR}\u0015EZpxJ\u0017CgqN^\u000bA@q6\u000eO\u0010D-DJ\u001eYG\u001c\u000f\tIP\rnKX\u0000S<%\b\u000f\t\u0019NaYF\n(\u0005\"\u000eO@ZAsGLq\u0012R IGM\u0017ZvW7";
        objectArray[17] = ".0{\u0015\u0002nd&)*VtN qQBwoK)\u0014\u0001h$9mEHk\u0015r.\u0012A!g6\u007f[B\u0010,u(R\bbh$aQ9)+sh\u001bKmz:k*\u0003~)4`\u0016\u0006v\u007f*\u0010";
        objectArray[18] = "x\rDm\"J2\u001b\u0016RvP\u000e\u0010F8}YCO\u0011ja\u00051\u000b@#b4y\u0018\u0013-i\b|\u0010E3\u0019";
        objectArray[19] = "\taN\u0004f8SqH\u0003Z:5!@Y%.R'D\u00005S\b}CD'4\u000ey\u001aTZ";
        objectArray[20] = "<?\rO\u001dtv)_pInF?+\u0016O`c)\np\u001f4?<W\u0002[ev?fN\u001bo|$\\\u0000H7;D";
        objectArray[21] = "D.S\u00128x\u000e8\u0001-lb54^A]k\u0005)U]J|\u0005<I-:8G-\t_~i\u000e.8\u0017m:\u0000%\u0004\u0012el\u001eU";
        objectArray[22] = "_\trXs'\u0015\u001f g'=.\u0016t\u0001$\u0014\u001d\u000fp\u001b)>\u0002)t\u001f!#\r\u000etgqg\\\n(\u001556\u0015\t\u0019^va\u001cCk\u001a'(\u001fr#\tt&\u0014N&\u0001\"8d";
        objectArray[23] = "5<\rgPh\u007f*_X\u0004rD&\u00004%lg\"\u000b2\u0016x`*\u001cXR(6?W*\u0016y\u007f<faU.vv\u0014%\u0004guG\\6Wi~{Y>\u0001w\u000e";
        objectArray[24] = ",,\f^jyf:^a>c^<\u001b\u0000/jK:\u0017\u001d,}zW^_i\u007f&%\u001a\u000e |\u0017m\t].w+h\u0001\u000b0\u0007";
        Object[] objectArray2 = objectArray;
        objectArray[25] = "\u0018\u0010\u0016\u0013d]R\u0006D,0Gl\u0006\u0001m9_N\u0004\u0010V_\u001a\u001dS\u0005\u001d-^L\u001a\u0006,f\u001d\u001b\u0013L^\"LR\u0010}";
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = gz_0.a(l, l2);
            object = f[n];
            try {
                if (!(object instanceof String)) break block2;
                gz_0.f[n] = clazz = Class.forName(g[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = gz_0.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = gz_0.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l, long l2) {
        int n = gz_0.a(l, l2);
        Object object = f[n];
        if (object instanceof String) {
            String string = g[n];
            int n2 = string.indexOf(8);
            Class clazz = gz_0.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = gz_0.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = gz_0.a(clazz3, string2, clazz2)) != null) {
                    gz_0.f[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = gz_0.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        gz_0.f[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = gz_0.b(663575613163512L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method d(long l, long l2) {
        int n = gz_0.a(l, l2);
        Object object = f[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = g[n];
                int n3 = string2.indexOf(8);
                clazz3 = gz_0.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = gz_0.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = gz_0.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        gz_0.f[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = gz_0.b(663575613163512L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = gz_0.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        gz_0.f[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = gz_0.b(663575613163512L, 0L);
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

    public void a() {
        block40: {
            CallSite callSite;
            long l;
            block39: {
                Object object;
                block37: {
                    block36: {
                        Object object2;
                        block34: {
                            block33: {
                                Object object3;
                                block31: {
                                    block30: {
                                        Object object4;
                                        block28: {
                                            l = b ^ 0x4E0CD3E7EB90L;
                                            callSite = gz_0.b("\u00a5", (long)6281474814946302254L, (long)l);
                                            try {
                                                block29: {
                                                    try {
                                                        try {
                                                            object4 = this.aR;
                                                            if (callSite != null) break block28;
                                                            if (object4 == 0) break block29;
                                                        }
                                                        catch (MatchException matchException) {
                                                            throw gz_0.b("\u00a5", (Object)matchException, (long)6281304077965681371L, (long)l);
                                                        }
                                                        gz_0.b("\u00a5", (int)gz_0.a("r", (int)893, (long)(0x3D2EBCC9D8A2C415L ^ l)), (long)6281343445178156642L, (long)l);
                                                        if (callSite == null) break block30;
                                                    }
                                                    catch (MatchException matchException) {
                                                        throw gz_0.b("\u00a5", (Object)matchException, (long)6281304077965681371L, (long)l);
                                                    }
                                                }
                                                object4 = gz_0.a("r", (int)24218, (long)(0x657320B4E02019F6L ^ l));
                                            }
                                            catch (MatchException matchException) {
                                                throw gz_0.b("\u00a5", (Object)matchException, (long)6281304077965681371L, (long)l);
                                            }
                                        }
                                        gz_0.b("\u00a5", (int)object4, (long)6281866863724899529L, (long)l);
                                    }
                                    try {
                                        block32: {
                                            try {
                                                try {
                                                    object3 = this.aS;
                                                    if (callSite != null) break block31;
                                                    if (object3 == 0) break block32;
                                                }
                                                catch (MatchException matchException) {
                                                    throw gz_0.b("\u00a5", (Object)matchException, (long)6281304077965681371L, (long)l);
                                                }
                                                gz_0.b("\u00a5", (int)gz_0.a("r", (int)27892, (long)(0x2FEDBC55B032B87L ^ l)), (long)6281343445178156642L, (long)l);
                                                if (callSite == null) break block33;
                                            }
                                            catch (MatchException matchException) {
                                                throw gz_0.b("\u00a5", (Object)matchException, (long)6281304077965681371L, (long)l);
                                            }
                                        }
                                        object3 = gz_0.a("r", (int)20406, (long)(0x2215BE3078CC88D7L ^ l));
                                    }
                                    catch (MatchException matchException) {
                                        throw gz_0.b("\u00a5", (Object)matchException, (long)6281304077965681371L, (long)l);
                                    }
                                }
                                gz_0.b("\u00a5", (int)object3, (long)6281866863724899529L, (long)l);
                            }
                            try {
                                block35: {
                                    try {
                                        try {
                                            object2 = this.aT;
                                            if (callSite != null) break block34;
                                            if (object2 == 0) break block35;
                                        }
                                        catch (MatchException matchException) {
                                            throw gz_0.b("\u00a5", (Object)matchException, (long)6281304077965681371L, (long)l);
                                        }
                                        gz_0.b("\u00a5", (int)gz_0.a("r", (int)20145, (long)(0x28995C11898E09DFL ^ l)), (long)6281343445178156642L, (long)l);
                                        if (callSite == null) break block36;
                                    }
                                    catch (MatchException matchException) {
                                        throw gz_0.b("\u00a5", (Object)matchException, (long)6281304077965681371L, (long)l);
                                    }
                                }
                                object2 = gz_0.a("r", (int)3271, (long)(0x7184B3C0FF6F4BAAL ^ l));
                            }
                            catch (MatchException matchException) {
                                throw gz_0.b("\u00a5", (Object)matchException, (long)6281304077965681371L, (long)l);
                            }
                        }
                        gz_0.b("\u00a5", (int)object2, (long)6281866863724899529L, (long)l);
                    }
                    try {
                        block38: {
                            try {
                                try {
                                    object = this.aU;
                                    if (callSite != null) break block37;
                                    if (object == 0) break block38;
                                }
                                catch (MatchException matchException) {
                                    throw gz_0.b("\u00a5", (Object)matchException, (long)6281304077965681371L, (long)l);
                                }
                                gz_0.b("\u00a5", (int)gz_0.a("r", (int)25622, (long)(0x7C2BE662374DA363L ^ l)), (long)6281343445178156642L, (long)l);
                                if (callSite == null) break block39;
                            }
                            catch (MatchException matchException) {
                                throw gz_0.b("\u00a5", (Object)matchException, (long)6281304077965681371L, (long)l);
                            }
                        }
                        object = gz_0.a("r", (int)7963, (long)(0x7E4ED2FD67945855L ^ l));
                    }
                    catch (MatchException matchException) {
                        throw gz_0.b("\u00a5", (Object)matchException, (long)6281304077965681371L, (long)l);
                    }
                }
                gz_0.b("\u00a5", (int)object, (long)6281866863724899529L, (long)l);
            }
            gz_0.b("\u00a5", (int)this.aV, (long)6281617234276493999L, (long)l);
            gz_0.b("\u00a5", (int)gz_0.a("r", (int)10084, (long)(0x37B1D5CF4A8EE013L ^ l)), (int)this.aX, (long)6281463419928563272L, (long)l);
            gz_0.b("\u00a5", (int)gz_0.a("r", (int)2247, (long)(0x5AF5C254C3704FA5L ^ l)), (int)this.aY, (long)6281463419928563272L, (long)l);
            gz_0.b("\u00a5", (int)this.aW, (long)6280861678167137461L, (long)l);
            for (int i = 0; i < this.a0.length; ++i) {
                try {
                    gz_0.b("\u00a5", (int)(gz_0.a("r", (int)27634, (long)(0x195154E033BEAC97L ^ l)) + i), (long)6280669022704166455L, (long)l);
                    gz_0.b("\u00a5", (int)gz_0.a("r", (int)3634, (long)(0x7A14BCA4C36C944L ^ l)), (int)this.a0[i], (long)6281581830777253303L, (long)l);
                    if (callSite == null) {
                        if (callSite == null) continue;
                        break;
                    }
                    break block40;
                }
                catch (MatchException matchException) {
                    throw gz_0.b("\u00a5", (Object)matchException, (long)6281304077965681371L, (long)l);
                }
            }
            gz_0.b("\u00a5", (int)this.aZ, (long)6280669022704166455L, (long)l);
            gz_0.b("\u00a5", (int)this.a1, (int)this.a2, (long)6281072585191684545L, (long)l);
            gz_0.b("\u00a5", (int)this.a3, (int)this.a4, (int)this.a5, (int)this.a6, (long)6281195465255023711L, (long)l);
            gz_0.b("\u00a5", (int)this.a7[0], (int)this.a7[1], (int)this.a7[2], (int)this.a7[3], (long)6281178536753549239L, (long)l);
            gz_0.b("\u00a5", (int)gz_0.a("r", (int)23794, (long)(0x2B0E5D0D88CA1B8FL ^ l)), (int)this.a8, (long)6281020967539184912L, (long)l);
            gz_0.b("\u00a5", (int)gz_0.a("r", (int)12022, (long)(0x39064E6EE40AE98AL ^ l)), (int)this.a9, (long)6281020967539184912L, (long)l);
        }
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

    public static gz_0 a() {
        Object object;
        int[] nArray;
        CallSite callSite;
        CallSite callSite2;
        CallSite callSite3;
        CallSite callSite4;
        CallSite callSite5;
        CallSite callSite6;
        CallSite callSite7;
        CallSite callSite8;
        CallSite callSite9;
        long l;
        block4: {
            l = b ^ 0x2F110AEF8C8AL;
            callSite9 = gz_0.b("\u00a5", (int)gz_0.a("r", (int)24218, (long)(0x657341A939287EECL ^ l)), (long)3472303929357080085L, (long)l);
            callSite8 = gz_0.b("\u00a5", (int)gz_0.a("r", (int)20406, (long)(0x2215DF2DA1C4EFCDL ^ l)), (long)3472303929357080085L, (long)l);
            callSite7 = gz_0.b("\u00a5", (int)gz_0.a("r", (int)3271, (long)(0x7184D2DD26672CB0L ^ l)), (long)3472303929357080085L, (long)l);
            callSite6 = gz_0.b("\u00a5", (int)gz_0.a("r", (int)7963, (long)(0x7E4EB3E0BE9C3F4FL ^ l)), (long)3472303929357080085L, (long)l);
            CallSite callSite10 = gz_0.b("\u00a5", (long)3474009300981497396L, (long)l);
            callSite5 = gz_0.b("\u00a5", (int)gz_0.a("r", (int)14580, (long)(0x20EB3C7CCD939896L ^ l)), (long)3473254799391850882L, (long)l);
            callSite4 = gz_0.b("\u00a5", (int)gz_0.a("r", (int)5855, (long)(0x810C99F47D636A1L ^ l)), (long)3473254799391850882L, (long)l);
            callSite3 = gz_0.b("\u00a5", (int)gz_0.a("r", (int)19017, (long)(0x34846165D186A22L ^ l)), (long)3473254799391850882L, (long)l);
            callSite2 = gz_0.b("\u00a5", (int)gz_0.a("r", (int)26829, (long)(0x2C0D3DD8321648BDL ^ l)), (long)3473254799391850882L, (long)l);
            callSite = gz_0.b("\u00a5", (int)gz_0.a("r", (int)536, (long)(0x10D1529DE7D82278L ^ l)), (long)3473254799391850882L, (long)l);
            nArray = new int[gz_0.a("r", (int)10468, (long)(0x3934B26D150E088EL ^ l))];
            for (object = 0; object < gz_0.a("r", (int)5885, (long)(0x1025882E4489B693L ^ l)); ++object) {
                try {
                    gz_0.b("\u00a5", (int)(gz_0.a("r", (int)14466, (long)(0x4B842BFFFACE18E7L ^ l)) + object), (long)3473130934530507053L, (long)l);
                    nArray[object] = (int)gz_0.b("\u00a5", (int)gz_0.a("r", (int)30425, (long)(0x6189A120F9D856ACL ^ l)), (long)3473254799391850882L, (long)l);
                    if (callSite10 == null) {
                        if (callSite10 == null) continue;
                        break;
                    }
                    break block4;
                }
                catch (MatchException matchException) {
                    throw gz_0.b("\u00a5", (Object)matchException, (long)3472783126757049793L, (long)l);
                }
            }
            gz_0.b("\u00a5", (int)callSite, (long)3473130934530507053L, (long)l);
            object = gz_0.b("\u00a5", (int)gz_0.a("r", (int)12044, (long)(0x2C5CA53A9F940F6DL ^ l)), (long)3473254799391850882L, (long)l);
        }
        CallSite callSite11 = gz_0.b("\u00a5", (int)gz_0.a("r", (int)19635, (long)(0x28D9689720C36CCEL ^ l)), (long)3473254799391850882L, (long)l);
        CallSite callSite12 = gz_0.b("\u00a5", (int)gz_0.a("r", (int)5255, (long)(0x1D91B0AA9BBA34FBL ^ l)), (long)3473254799391850882L, (long)l);
        CallSite callSite13 = gz_0.b("\u00a5", (int)gz_0.a("r", (int)16190, (long)(0x7FFAD27C00ED1F56L ^ l)), (long)3473254799391850882L, (long)l);
        CallSite callSite14 = gz_0.b("\u00a5", (int)gz_0.a("r", (int)19817, (long)(0x33F968E1E47EED10L ^ l)), (long)3473254799391850882L, (long)l);
        CallSite callSite15 = gz_0.b("\u00a5", (int)gz_0.a("r", (int)2260, (long)(0x223794566CCE28B7L ^ l)), (long)3473254799391850882L, (long)l);
        int[] nArray2 = new int[4];
        gz_0.b("\u00a5", (int)gz_0.a("r", (int)8712, (long)(0x3F45636AAAE50272L ^ l)), (Object)nArray2, (long)3474426780752468812L, (long)l);
        CallSite callSite16 = gz_0.b("\u00a5", (int)gz_0.a("r", (int)29089, (long)(0x1928F90C842C51C5L ^ l)), (long)3473254799391850882L, (long)l);
        CallSite callSite17 = gz_0.b("\u00a5", (int)gz_0.a("r", (int)15140, (long)(0xF8DB0BCC86A9B57L ^ l)), (long)3473254799391850882L, (long)l);
        return new gz_0((boolean)callSite9, (boolean)callSite8, (boolean)callSite7, (boolean)callSite6, (int)callSite5, (int)callSite4, (int)callSite3, (int)callSite2, (int)callSite, nArray, (int)object, (int)callSite11, (int)callSite12, (int)callSite13, (int)callSite14, (int)callSite15, nArray2, (int)callSite17, (int)callSite16);
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (g[n3] != null) {
            return n3;
        }
        Object object = f[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 34;
            case 1 -> 30;
            case 2 -> 35;
            case 3 -> 41;
            case 4 -> 51;
            case 5 -> 9;
            case 6 -> 13;
            case 7 -> 14;
            case 8 -> 32;
            case 9 -> 56;
            case 10 -> 18;
            case 11 -> 19;
            case 12 -> 23;
            case 13 -> 50;
            case 14 -> 44;
            case 15 -> 37;
            case 16 -> 45;
            case 17 -> 0;
            case 18 -> 58;
            case 19 -> 61;
            case 20 -> 54;
            case 21 -> 28;
            case 22 -> 3;
            case 23 -> 26;
            case 24 -> 6;
            case 25 -> 12;
            case 26 -> 48;
            case 27 -> 52;
            case 28 -> 57;
            case 29 -> 24;
            case 30 -> 42;
            case 31 -> 53;
            case 32 -> 22;
            case 33 -> 2;
            case 34 -> 47;
            case 35 -> 27;
            case 36 -> 31;
            case 37 -> 11;
            case 38 -> 49;
            case 39 -> 38;
            case 40 -> 20;
            case 41 -> 29;
            case 42 -> 15;
            case 43 -> 17;
            case 44 -> 63;
            case 45 -> 4;
            case 46 -> 1;
            case 47 -> 59;
            case 48 -> 62;
            case 49 -> 40;
            case 50 -> 7;
            case 51 -> 10;
            case 52 -> 25;
            case 53 -> 33;
            case 54 -> 43;
            case 55 -> 21;
            case 56 -> 46;
            case 57 -> 39;
            case 58 -> 55;
            case 59 -> 16;
            case 60 -> 8;
            case 61 -> 5;
            case 62 -> 36;
            default -> 60;
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
        gz_0.g[n3] = new String(cArray);
        return n3;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/gz" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = gz_0.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1041;
        if (d[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = c[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])e.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    e.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/gz", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            gz_0.d[n2] = n3;
        }
        return d[n2];
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00a2' || c == 'j' || c == 'J' || c == 'g') {
                field = gz_0.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00a2' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'j' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'J' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = gz_0.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'e' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00a5' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = gz_0.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(gz_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(gz_0.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


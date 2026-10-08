/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_4184
 *  net.minecraft.class_4587
 *  net.minecraft.class_4599
 *  net.minecraft.class_4603
 *  net.minecraft.class_757
 *  net.minecraft.class_759
 *  net.minecraft.class_765
 *  net.minecraft.class_9920
 *  org.joml.Matrix4f
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
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_4599;
import net.minecraft.class_4603;
import net.minecraft.class_757;
import net.minecraft.class_759;
import net.minecraft.class_765;
import net.minecraft.class_9920;
import org.joml.Matrix4f;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class H {
    private final class_757 a;
    private static final long b;
    private static final String[] c;
    private static final String[] d;
    private static final Map e;
    private static final Object[] f;
    private static final String[] g;

    public H(class_757 class_7572) {
        this.a = class_7572;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                H.b = hc.a(-6384230885601424915L, 7087790305764720363L, MethodHandles.lookup().lookupClass()).a(107453876227534L);
                H.f = new Object[26];
                H.g = new String[26];
                H.a();
                H.e = new HashMap<K, V>(13);
                var0 = H.b ^ 47436926299525L;
                var2_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var9_3 = new String[11];
                var7_4 = 0;
                var6_5 = "\u00ea\u00a2\u00a3-\u00dd\u0087\u00cf\u001c\u0086\u0002\u00f9\u0089\u00c8\u00a5\u00df\u001c(j\u00d9\u0003\u00fbB\u00db\u00fco;\u0082\n\u00c5\u0098\u00ca\u0084\u00f7\u00891X\u0080Yi1\u00ecI\u00c2\u0002)\u00b9\u00e7\u0088\u00b6w\u00dd\u008be\u00ff\u00f8.\u00f6\u0018\u00a8\u0086\u00bb\u001bG\u00a5\u0088\u00bb\u00cb\u0080O\u0087\u00c8bA\u0005:\u00fc\u00a2K\u0002\u0013%]\u0010jvnss\u00a0\u00c0\u00e5\u00e6\u00e7wC\u00ff\u00cf\u00f3j(\u00d4\u0013\u00db\u0007^\u0097\u0014;\u001d\u00c5E\u00b2\u009brdx\u00ba\u00c0%\u00ae\n\u0090\u00b1\u00adS\u001e\u009fR\u00c2p\u00d4\u00f9\u00bc\u009e$rI\u0083\u00d2$\u0010r\r\u00ca\u0014\u00c6\u00cb\u00f7A\u00a6.\u00b8c%\u00a4\u00e3?0\u0087\u009aO\u00fc\u0081\u008cp\u00ad\u0088\u00f3\u00e2F\u00df\u0005d\u00f9\u00cc[\u00d1x \u0018\u00fb\u0000\u0013N\u0012\u00f6\u0010\u00c2\u0084bNq\u00f4s\u00f2P\u00cf\u0005\u0000_\u00ee\u0080\t\u0010g\u0084(\u00b0_\u00db\u008d\u009f\u009b\u00a1\u00e7\u00ab\u001d\u00a4\u00b4\u00dfK\u00cf\u0096\u0093f\u0005_\u0005\u00f5Ti\u0087+\u00cb\u0001\u0098\u0017\u00a6e\u00b0\u00d5\u00c3\u00a9\u00fa\u00ff\u00a4\u00e3\u0010\u00c4\u0087\u00c3\u00cb\u00b7<pO\u00c1\u00a7#\u00ef.\u00d9\u00f6\u0095";
                var8_6 = "\u00ea\u00a2\u00a3-\u00dd\u0087\u00cf\u001c\u0086\u0002\u00f9\u0089\u00c8\u00a5\u00df\u001c(j\u00d9\u0003\u00fbB\u00db\u00fco;\u0082\n\u00c5\u0098\u00ca\u0084\u00f7\u00891X\u0080Yi1\u00ecI\u00c2\u0002)\u00b9\u00e7\u0088\u00b6w\u00dd\u008be\u00ff\u00f8.\u00f6\u0018\u00a8\u0086\u00bb\u001bG\u00a5\u0088\u00bb\u00cb\u0080O\u0087\u00c8bA\u0005:\u00fc\u00a2K\u0002\u0013%]\u0010jvnss\u00a0\u00c0\u00e5\u00e6\u00e7wC\u00ff\u00cf\u00f3j(\u00d4\u0013\u00db\u0007^\u0097\u0014;\u001d\u00c5E\u00b2\u009brdx\u00ba\u00c0%\u00ae\n\u0090\u00b1\u00adS\u001e\u009fR\u00c2p\u00d4\u00f9\u00bc\u009e$rI\u0083\u00d2$\u0010r\r\u00ca\u0014\u00c6\u00cb\u00f7A\u00a6.\u00b8c%\u00a4\u00e3?0\u0087\u009aO\u00fc\u0081\u008cp\u00ad\u0088\u00f3\u00e2F\u00df\u0005d\u00f9\u00cc[\u00d1x \u0018\u00fb\u0000\u0013N\u0012\u00f6\u0010\u00c2\u0084bNq\u00f4s\u00f2P\u00cf\u0005\u0000_\u00ee\u0080\t\u0010g\u0084(\u00b0_\u00db\u008d\u009f\u009b\u00a1\u00e7\u00ab\u001d\u00a4\u00b4\u00dfK\u00cf\u0096\u0093f\u0005_\u0005\u00f5Ti\u0087+\u00cb\u0001\u0098\u0017\u00a6e\u00b0\u00d5\u00c3\u00a9\u00fa\u00ff\u00a4\u00e3\u0010\u00c4\u0087\u00c3\u00cb\u00b7<pO\u00c1\u00a7#\u00ef.\u00d9\u00f6\u0095".length();
                var5_7 = 16;
                var4_8 = -1;
lbl32:
                // 2 sources

                while (true) {
                    v3 = ++var4_8;
                    v4 = var6_5.substring(v3, v3 + var5_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl37:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = H.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u008d\u00eb\u00e7\u0093lqg\u00ae\u00bel\"c\u0007b\u00ef\u0014<\u00ad\u0090\u0015w\u008b\u00f6Dp\u00d6/&\u00da&H\u00c70\u00dc\u00e6\u0016jM\u0089\u00b6\u0096\u0089_\u00afv\u0083\u0091\u009a\u0098\u0004)$w \u00a2\u00d0\u00a0\u00f4+\u00a9\u00b3\u00b1\u001b\u00c4\u00d94tz\u00dc\\\u00a5S\u001b\u001d\u001e[)?\u00a4Y\u009b";
                    var8_6 = "\u008d\u00eb\u00e7\u0093lqg\u00ae\u00bel\"c\u0007b\u00ef\u0014<\u00ad\u0090\u0015w\u008b\u00f6Dp\u00d6/&\u00da&H\u00c70\u00dc\u00e6\u0016jM\u0089\u00b6\u0096\u0089_\u00afv\u0083\u0091\u009a\u0098\u0004)$w \u00a2\u00d0\u00a0\u00f4+\u00a9\u00b3\u00b1\u001b\u00c4\u00d94tz\u00dc\\\u00a5S\u001b\u001d\u001e[)?\u00a4Y\u009b".length();
                    var5_7 = 32;
                    var4_8 = -1;
lbl46:
                    // 2 sources

                    while (true) {
                        v6 = ++var4_8;
                        v4 = var6_5.substring(v6, v6 + var5_7);
                        v5 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl51:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = H.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    break block11;
                    break;
                }
            }
            var10_9 = var2_1.doFinal(v4.getBytes("ISO-8859-1"));
            switch (v5) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl63:
                // 1 sources

                ** continue;
            }
        }
        H.c = var9_3;
        H.d = new String[11];
    }

    public void b(Object[] objectArray) {
        class_4587 class_45872 = (class_4587)objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        long l = (Long)objectArray[2];
        long l2 = l = b ^ l;
        long l3 = l2 ^ 0x2161CF51C63L;
        long l4 = l2 ^ 0x4A78996BFDB6L;
        Object[] objectArray2 = new Object[6];
        objectArray2[5] = l4;
        objectArray2[4] = new Class[]{class_4587.class, H.b("\u00d0", (long)-2888654382806939194L, (long)l)};
        objectArray2[3] = H.b("\u00d0", (long)-2887183004536722774L, (long)l);
        objectArray2[2] = class_757.class;
        objectArray2[1] = H.a("q", (int)17257, (long)(0x165EF8C3893FA22CL ^ l));
        objectArray2[0] = this.a;
        CallSite callSite = H.b("z", (Object)objectArray2, (long)-2888969585381057068L, (long)l);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l3;
        objectArray3[0] = new Object[]{class_45872, H.b("z", (float)f, (long)-2888739628544902035L, (long)l)};
        H.b("\u00d5", (Object)callSite, (Object)objectArray3, (long)-2888549668081926177L, (long)l);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/H" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = H.a(l, l2);
            object = f[n];
            try {
                if (!(object instanceof String)) break block2;
                H.f[n] = clazz = Class.forName(g[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = H.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = H.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = H.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = H.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field c(long l, long l2) {
        int n = H.a(l, l2);
        Object object = f[n];
        if (object instanceof String) {
            String string = g[n];
            int n2 = string.indexOf(8);
            Class clazz = H.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = H.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = H.a(clazz3, string2, clazz2)) != null) {
                    H.f[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = H.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        H.f[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = H.b(143924879746194L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public void c(Object[] objectArray) {
        class_4587 class_45872 = (class_4587)objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        long l = (Long)objectArray[2];
        long l2 = l = b ^ l;
        long l3 = l2 ^ 0x4FFE62BA1F82L;
        long l4 = l2 ^ 0x790E724FE57L;
        Object[] objectArray2 = new Object[6];
        objectArray2[5] = l4;
        objectArray2[4] = new Class[]{class_4587.class, H.b("\u00d0", (long)-3168214388257207769L, (long)l)};
        objectArray2[3] = H.b("\u00d0", (long)-3166057257917732533L, (long)l);
        objectArray2[2] = class_757.class;
        objectArray2[1] = H.a("q", (int)8397, (long)(0x62AE813FCD264260L ^ l));
        objectArray2[0] = this.a;
        CallSite callSite = H.b("z", (Object)objectArray2, (long)-3167969391266800075L, (long)l);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l3;
        objectArray3[0] = new Object[]{class_45872, H.b("z", (float)f, (long)-3168159791403778164L, (long)l)};
        H.b("\u00d5", (Object)callSite, (Object)objectArray3, (long)-3168138808845108162L, (long)l);
    }

    private static Method d(long l, long l2) {
        int n = H.a(l, l2);
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
                clazz3 = H.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = H.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = H.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        H.f[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = H.b(143924879746194L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = H.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        H.f[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = H.b(143924879746194L, 0L);
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

    private static void a() {
        Object[] objectArray = f;
        f[0] = "1z+r5,'z.(&;01-.*/!v:9a>\u0004";
        objectArray[1] = "vN#\u000bV\u007f\u0003n(\u0004G0b`#\u000fCj\u0016";
        objectArray[2] = ".(\u0014Z\u001f\u0016%'\u0005\u0015~\u0018.,\u0001O";
        objectArray[3] = "- t]Q\u001a; q\u0007B\r,kr\u0001N\u0019=,e\u0016\u0005\t\u001f";
        objectArray[4] = "|gAys`\tGJvb/hIA}fu\u001c";
        objectArray[5] = "E\u0005FUc7N\nW\u001a\u001b4F\u0000";
        objectArray[6] = "8Q2c\u001f\u001f3^#,r\u001f3C7";
        objectArray[7] = "Q<\t\u0000NtZ3\u0018O&tT<\u000b";
        objectArray[8] = Float.TYPE;
        H.g[8] = "java/lang/Float";
        objectArray[9] = "\u0015d\u0007\r[a\u0003d\u0002WHv\u0014/\u0001QDb\u0005h\u0016F\u000fr9";
        objectArray[10] = "Oq)lH':Q\"cYh[_)h]2/";
        objectArray[11] = "4GrF7-\"Gw\u001c$:5\ft\u001a(.$Kc\rc>\u0007";
        objectArray[12] = "8R\"`\u0013~Mr)o\u00021,|\"d\u0006kX";
        objectArray[13] = "D\u0014\u0012\u0016i.O\u001b\u0003Y\u0005-A\u0019\u0001\u0016)";
        objectArray[14] = Boolean.TYPE;
        H.g[14] = "java/lang/Boolean";
        objectArray[15] = "0&&eXZ0;y2dmZ\u0004VUXL1;vi\u0003Hv ";
        objectArray[16] = "cI\u000f\f[W/N\u001fP<w\u000f-;l\u0000Vd\u0012\u001bP[R#\t";
        objectArray[17] = "\u007f|F\u001ew53{VB\u00107+$B\u0013W'B~\u0006\u0003 (-\"\u0003\u0007*I\u007f|F\u001ew53{VB\u0010";
        objectArray[18] = "\u001c7?=|A\u0018u.:LG\"}#6*VG\"o\"%.\u001b#j#rBN&8xL";
        objectArray[19] = "\u0002=U\u0015\u0016q\t4_\u0011p\\b\u000br*L}\t4R\u0016\u0017yN/";
        objectArray[20] = "\u000fJ'+4\u000fY\u0013 o_\u001d?A4!9\fZ\u001ex56t\u0001\u000b(*o\u001b\u0005I9-_";
        objectArray[21] = "8?b-O^1(n\u0015G\"9$usVGfha|.\u001bgm`+BNb?;\u0015";
        objectArray[22] = "o\u0011/fNZ#\u0016?:)H6J?zwO6P;\u0006\u0017\u001f/\u001d7iK\u001a+\u0017V";
        objectArray[23] = "\u001bjdy6Z[hn|YW!f{b?ED97v0=\u0010<m*8A\u0019+a\u0012";
        objectArray[24] = "\u001a\u0005\u0007#f\u0011\u0011\f\r'\u0000\u001eB\u000f\u0010qG\u000e+Z\u001da;\u0005\u001aV\u0015%q`\u001a\u0005\u0007#f\u0011\u0011\f\r'\u0000";
        Object[] objectArray2 = objectArray;
        objectArray[25] = "_\u0006ks3\u0006T\u000fawU\u001d\t\u000fe!<\u00110\u0001e18w_\u0018|w0FS\u00108=U";
    }

    public class_4603 a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l = b ^ l;
        long l3 = l2 ^ 0x740F372D3341L;
        long l4 = l2 ^ 0x187FCD6DEB7L;
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = l4;
        objectArray2[3] = class_4603.class;
        objectArray2[2] = class_757.class;
        objectArray2[1] = H.a("q", (int)13904, (long)(0x51A28FB35136E6E2L ^ l));
        objectArray2[0] = this.a;
        CallSite callSite = H.b("z", (Object)objectArray2, (long)7356595190496270164L, (long)l);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l3;
        return (class_4603)H.b("\u00d5", (Object)callSite, (Object)objectArray3, (long)7356450632827126209L, (long)l);
    }

    public class_9920 a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l = b ^ l;
        long l3 = l2 ^ 0x7B350BE4BE34L;
        long l4 = l2 ^ 0xEBDC01F53C2L;
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = l4;
        objectArray2[3] = class_9920.class;
        objectArray2[2] = class_757.class;
        objectArray2[1] = H.a("q", (int)20867, (long)(0x5FE3DE52DE3B0C48L ^ l));
        objectArray2[0] = this.a;
        CallSite callSite = H.b("z", (Object)objectArray2, (long)-1485361716699522527L, (long)l);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l3;
        return (class_9920)H.b("\u00d5", (Object)callSite, (Object)objectArray3, (long)-1485532680214655820L, (long)l);
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x36A9;
        if (d[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])e.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    e.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/H", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = c[n2].getBytes("ISO-8859-1");
            H.d[n2] = H.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = H.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'M' || c == 'W' || c == '\u00d0' || c == '\u00c6') {
                field = H.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'M' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'W' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00d0' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = H.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00d5' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'z' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public void a(Object[] objectArray) {
        class_4184 class_41842 = (class_4184)objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        Matrix4f matrix4f = (Matrix4f)objectArray[2];
        long l = (Long)objectArray[3];
        long l2 = l = b ^ l;
        long l3 = l2 ^ 0x6D0E0EEC55CCL;
        long l4 = l2 ^ 0x25608B72B419L;
        Object[] objectArray2 = new Object[6];
        objectArray2[5] = l4;
        objectArray2[4] = new Class[]{class_4184.class, H.b("\u00d0", (long)-7041906621232742295L, (long)l), Matrix4f.class};
        objectArray2[3] = H.b("\u00d0", (long)-7043131452169231611L, (long)l);
        objectArray2[2] = class_757.class;
        objectArray2[1] = H.a("q", (int)14397, (long)(0x63FC8495928110D4L ^ l));
        objectArray2[0] = this.a;
        CallSite callSite = H.b("z", (Object)objectArray2, (long)-7041590842109389701L, (long)l);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l3;
        objectArray3[0] = new Object[]{class_41842, H.b("z", (float)f, (long)-7041855733756463678L, (long)l), matrix4f};
        H.b("\u00d5", (Object)callSite, (Object)objectArray3, (long)-7041764523111467408L, (long)l);
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

    public boolean a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l = b ^ l;
        long l3 = l2 ^ 0x4A56440097EL;
        long l4 = l2 ^ 0x712DAFBBE488L;
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = l4;
        objectArray2[3] = H.b("\u00d0", (long)6640987132566488681L, (long)l);
        objectArray2[2] = class_757.class;
        objectArray2[1] = H.a("q", (int)16021, (long)(0xA21B55544CD415L ^ l));
        objectArray2[0] = this.a;
        CallSite callSite = H.b("z", (Object)objectArray2, (long)6640717024421850475L, (long)l);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l3;
        return (boolean)H.b("\u00d5", (Object)((Boolean)((Object)H.b("\u00d5", (Object)callSite, (Object)objectArray3, (long)6640606533899451390L, (long)l))), (long)6641451955002285829L, (long)l);
    }

    public class_759 a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l = b ^ l;
        long l3 = l2 ^ 0x5518A320F2DDL;
        long l4 = l2 ^ 0x209068DB1F2BL;
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = l4;
        objectArray2[3] = class_759.class;
        objectArray2[2] = class_757.class;
        objectArray2[1] = H.a("q", (int)27237, (long)(0x66F6D27DF46A7B44L ^ l));
        objectArray2[0] = this.a;
        CallSite callSite = H.b("z", (Object)objectArray2, (long)-6373788303204985144L, (long)l);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l3;
        return (class_759)H.b("\u00d5", (Object)callSite, (Object)objectArray3, (long)-6373862548368392099L, (long)l);
    }

    public class_765 a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l = b ^ l;
        long l3 = l2 ^ 0x7D1DD40D9CE2L;
        long l4 = l2 ^ 0x8951FF67114L;
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = l4;
        objectArray2[3] = class_765.class;
        objectArray2[2] = class_757.class;
        objectArray2[1] = H.a("q", (int)29131, (long)(0x73827019B55C0ED4L ^ l));
        objectArray2[0] = this.a;
        CallSite callSite = H.b("z", (Object)objectArray2, (long)-3912245665014466313L, (long)l);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l3;
        return (class_765)H.b("\u00d5", (Object)callSite, (Object)objectArray3, (long)-3912407836340294046L, (long)l);
    }

    public float a(Object[] objectArray) {
        class_4184 class_41842 = (class_4184)objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        boolean bl = (Boolean)objectArray[2];
        long l = (Long)objectArray[3];
        long l2 = l = b ^ l;
        long l3 = l2 ^ 0x384DFCE11A05L;
        long l4 = l2 ^ 0x7023797FFBD0L;
        Object[] objectArray2 = new Object[6];
        objectArray2[5] = l4;
        objectArray2[4] = new Class[]{class_4184.class, H.b("\u00d0", (long)-3346374088221339744L, (long)l), H.b("\u00d0", (long)-3346245759206798385L, (long)l)};
        objectArray2[3] = H.b("\u00d0", (long)-3346374088221339744L, (long)l);
        objectArray2[2] = class_757.class;
        objectArray2[1] = H.a("q", (int)10380, (long)(0x6DB5ADBA785ECFAEL ^ l));
        objectArray2[0] = this.a;
        CallSite callSite = H.b("z", (Object)objectArray2, (long)-3346619636092216398L, (long)l);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l3;
        objectArray3[0] = new Object[]{class_41842, H.b("z", (float)f, (long)-3346428754868520437L, (long)l), H.b("z", (boolean)bl, (long)-3346898894904631305L, (long)l)};
        return (float)H.b("\u00d5", (Object)((Float)((Object)H.b("\u00d5", (Object)callSite, (Object)objectArray3, (long)-3346186366811407943L, (long)l))), (long)-3346509750972166835L, (long)l);
    }

    public Matrix4f a(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        long l = (Long)objectArray[1];
        long l2 = l = b ^ l;
        long l3 = l2 ^ 0x4993AADC5292L;
        long l4 = l2 ^ 0x1FD2F42B347L;
        Object[] objectArray2 = new Object[6];
        objectArray2[5] = l4;
        objectArray2[4] = new Class[]{H.b("\u00d0", (long)-7415111221780445385L, (long)l)};
        objectArray2[3] = Matrix4f.class;
        objectArray2[2] = class_757.class;
        objectArray2[1] = H.a("q", (int)6429, (long)(0x27D082272A1636A2L ^ l));
        objectArray2[0] = this.a;
        CallSite callSite = H.b("z", (Object)objectArray2, (long)-7414865683623898331L, (long)l);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l3;
        objectArray3[0] = new Object[]{H.b("z", (float)f, (long)-7415061228863229284L, (long)l)};
        return (Matrix4f)H.b("\u00d5", (Object)callSite, (Object)objectArray3, (long)-7415030670674742994L, (long)l);
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
            case 0 -> 36;
            case 1 -> 8;
            case 2 -> 29;
            case 3 -> 51;
            case 4 -> 19;
            case 5 -> 40;
            case 6 -> 38;
            case 7 -> 33;
            case 8 -> 20;
            case 9 -> 61;
            case 10 -> 55;
            case 11 -> 44;
            case 12 -> 54;
            case 13 -> 28;
            case 14 -> 7;
            case 15 -> 47;
            case 16 -> 9;
            case 17 -> 3;
            case 18 -> 50;
            case 19 -> 25;
            case 20 -> 56;
            case 21 -> 63;
            case 22 -> 41;
            case 23 -> 27;
            case 24 -> 42;
            case 25 -> 37;
            case 26 -> 5;
            case 27 -> 13;
            case 28 -> 32;
            case 29 -> 59;
            case 30 -> 58;
            case 31 -> 18;
            case 32 -> 24;
            case 33 -> 52;
            case 34 -> 48;
            case 35 -> 26;
            case 36 -> 43;
            case 37 -> 35;
            case 38 -> 39;
            case 39 -> 15;
            case 40 -> 46;
            case 41 -> 31;
            case 42 -> 10;
            case 43 -> 53;
            case 44 -> 45;
            case 45 -> 21;
            case 46 -> 12;
            case 47 -> 2;
            case 48 -> 62;
            case 49 -> 57;
            case 50 -> 0;
            case 51 -> 11;
            case 52 -> 1;
            case 53 -> 34;
            case 54 -> 4;
            case 55 -> 14;
            case 56 -> 16;
            case 57 -> 17;
            case 58 -> 6;
            case 59 -> 49;
            case 60 -> 60;
            case 61 -> 23;
            case 62 -> 22;
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
        H.g[n3] = new String(cArray);
        return n3;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/H" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = H.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    public class_4599 a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l = b ^ l;
        long l3 = l2 ^ 0x1206251EDF9BL;
        long l4 = l2 ^ 0x678EEEE5326DL;
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = l4;
        objectArray2[3] = class_4599.class;
        objectArray2[2] = class_757.class;
        objectArray2[1] = H.a("q", (int)25862, (long)(0xAC4352C8165964L ^ l));
        objectArray2[0] = this.a;
        CallSite callSite = H.b("z", (Object)objectArray2, (long)-8444946046486611058L, (long)l);
        Object[] objectArray3 = new Object[1];
        objectArray3[0] = l3;
        return (class_4599)H.b("\u00d5", (Object)callSite, (Object)objectArray3, (long)-8445029032039797477L, (long)l);
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

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(H.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(H.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


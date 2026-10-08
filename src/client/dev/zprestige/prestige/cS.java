/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  net.minecraft.class_10185
 *  net.minecraft.class_1041
 *  net.minecraft.class_11228
 *  net.minecraft.class_11278
 *  net.minecraft.class_1297
 *  net.minecraft.class_1306
 *  net.minecraft.class_1309
 *  net.minecraft.class_1657
 *  net.minecraft.class_1921
 *  net.minecraft.class_2248
 *  net.minecraft.class_2338
 *  net.minecraft.class_238
 *  net.minecraft.class_243
 *  net.minecraft.class_2561
 *  net.minecraft.class_2596
 *  net.minecraft.class_2680
 *  net.minecraft.class_2818
 *  net.minecraft.class_2960
 *  net.minecraft.class_3298
 *  net.minecraft.class_4184
 *  net.minecraft.class_4587
 *  net.minecraft.class_4588
 *  net.minecraft.class_4603
 *  net.minecraft.class_4604
 *  net.minecraft.class_583
 *  net.minecraft.class_757
 *  net.minecraft.class_8685
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.joml.Vector4f
 */
package dev.zprestige.prestige;

import com.mojang.authlib.GameProfile;
import dev.zprestige.prestige.C;
import dev.zprestige.prestige.H;
import dev.zprestige.prestige.I;
import dev.zprestige.prestige.K;
import dev.zprestige.prestige.W;
import dev.zprestige.prestige.a0;
import dev.zprestige.prestige.a1;
import dev.zprestige.prestige.a2;
import dev.zprestige.prestige.a3;
import dev.zprestige.prestige.a4;
import dev.zprestige.prestige.a5;
import dev.zprestige.prestige.a6;
import dev.zprestige.prestige.a9;
import dev.zprestige.prestige.aK;
import dev.zprestige.prestige.aL;
import dev.zprestige.prestige.aM;
import dev.zprestige.prestige.aO;
import dev.zprestige.prestige.aP;
import dev.zprestige.prestige.aQ;
import dev.zprestige.prestige.aR;
import dev.zprestige.prestige.aT;
import dev.zprestige.prestige.aU;
import dev.zprestige.prestige.aV;
import dev.zprestige.prestige.aW;
import dev.zprestige.prestige.aX;
import dev.zprestige.prestige.aY;
import dev.zprestige.prestige.a_;
import dev.zprestige.prestige.bA;
import dev.zprestige.prestige.bB;
import dev.zprestige.prestige.bC;
import dev.zprestige.prestige.bD;
import dev.zprestige.prestige.bE;
import dev.zprestige.prestige.bG;
import dev.zprestige.prestige.bH;
import dev.zprestige.prestige.bI;
import dev.zprestige.prestige.bJ;
import dev.zprestige.prestige.bK;
import dev.zprestige.prestige.bL;
import dev.zprestige.prestige.bM;
import dev.zprestige.prestige.bN;
import dev.zprestige.prestige.bO;
import dev.zprestige.prestige.bY;
import dev.zprestige.prestige.ba_0;
import dev.zprestige.prestige.bb_0;
import dev.zprestige.prestige.bc_0;
import dev.zprestige.prestige.bd_0;
import dev.zprestige.prestige.be_0;
import dev.zprestige.prestige.bf_0;
import dev.zprestige.prestige.bg_0;
import dev.zprestige.prestige.bh_0;
import dev.zprestige.prestige.bi_0;
import dev.zprestige.prestige.bj_0;
import dev.zprestige.prestige.bk_0;
import dev.zprestige.prestige.bn_0;
import dev.zprestige.prestige.bq_0;
import dev.zprestige.prestige.br_0;
import dev.zprestige.prestige.bs_0;
import dev.zprestige.prestige.bu_0;
import dev.zprestige.prestige.bv_0;
import dev.zprestige.prestige.bw_0;
import dev.zprestige.prestige.bx_0;
import dev.zprestige.prestige.by_0;
import dev.zprestige.prestige.dC;
import dev.zprestige.prestige.dD;
import dev.zprestige.prestige.dH;
import dev.zprestige.prestige.de_0;
import dev.zprestige.prestige.gK;
import dev.zprestige.prestige.gz_0;
import dev.zprestige.prestige.hc;
import dev.zprestige.prestige.y_0;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import net.minecraft.class_10185;
import net.minecraft.class_1041;
import net.minecraft.class_11228;
import net.minecraft.class_11278;
import net.minecraft.class_1297;
import net.minecraft.class_1306;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1921;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2561;
import net.minecraft.class_2596;
import net.minecraft.class_2680;
import net.minecraft.class_2818;
import net.minecraft.class_2960;
import net.minecraft.class_3298;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_4603;
import net.minecraft.class_4604;
import net.minecraft.class_583;
import net.minecraft.class_757;
import net.minecraft.class_8685;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Vector4f;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class cS {
    private static final long a = hc.a(8798382831043092011L, -2897073394984607208L, MethodHandles.lookup().lookupClass()).a(251880120978975L);
    private static final Object[] b = new Object[194];
    private static final String[] c = new String[194];

    public static float ap(dC dC2) {
        long l = a ^ 0x4632133D93EBL;
        return (float)cS.a("v", (Object)dC2, (Object)new Object[0], (long)-6341448761058142101L, (long)l);
    }

    public static float O(a3 a32) {
        long l = a ^ 0x7B8E4D03DCE2L;
        return (float)cS.a("v", (Object)a32, (Object)new Object[0], (long)-1659151350534317590L, (long)l);
    }

    public static class_3298 dP(String string) {
        long l = a ^ 0x5DFACBC5F524L;
        return cS.a("\u00da", (Object)new Object[]{string}, (long)-4524027396982148978L, (long)l);
    }

    public static class_3298 dQ(String string) {
        long l = a ^ 0xDFD5B4E1EAL;
        return cS.a("\u00da", (Object)new Object[]{string}, (long)-3028336324482472896L, (long)l);
    }

    public static void aa(bY bY2, class_2596 class_25962) {
        long l = a ^ 0x675C8C31B5AFL;
        long l2 = l ^ 0x7AFB26D4DF49L;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = class_25962;
        cS.a("v", (Object)bY2, (Object)objectArray, (long)-9099218103475091148L, (long)l);
    }

    public static a5 ab() {
        return new a5();
    }

    public static boolean ai(bD bD2) {
        long l = a ^ 0x5A9DE90A2AF3L;
        return (boolean)cS.a("v", (Object)bD2, (Object)new Object[0], (long)2227382177388044413L, (long)l);
    }

    static {
        cS.a();
    }

    public static aQ cs() {
        return new aQ();
    }

    public static boolean B(bN bN2) {
        long l = a ^ 0x819FB35F301L;
        long l2 = l ^ 0x5C4EFF1F43BFL;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (boolean)cS.a("v", (Object)bN2, (Object)objectArray, (long)-4100778297538196906L, (long)l);
    }

    public static boolean C(bN bN2) {
        long l = a ^ 0x7A1E47ACB9F2L;
        return (boolean)cS.a("v", (Object)bN2, (Object)new Object[0], (long)-8221302733802242328L, (long)l);
    }

    public static boolean D(bO bO2, Class clazz) {
        long l = a ^ 0x77BC49606854L;
        long l2 = l ^ 0x37292E478FC9L;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = clazz;
        return (boolean)cS.a("v", (Object)bO2, (Object)objectArray, (long)6648600554316651721L, (long)l);
    }

    public static boolean F(aT aT2) {
        long l = a ^ 0x6F9D0F352C1AL;
        long l2 = l ^ 0x3BCA0B1F9CA4L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (boolean)cS.a("v", (Object)aT2, (Object)objectArray, (long)1732896680280986957L, (long)l);
    }

    public static double I(aT aT2) {
        long l = a ^ 0x65F31024D294L;
        return (double)cS.a("v", (Object)aT2, (Object)new Object[0], (long)-1834233752454312155L, (long)l);
    }

    public static double J(aT aT2) {
        long l = a ^ 0x37F68D3D036CL;
        return (double)cS.a("v", (Object)aT2, (Object)new Object[0], (long)3997097089104514332L, (long)l);
    }

    public static bN S(class_2248 class_22482) {
        return new bN(class_22482);
    }

    public static boolean Z(bh_0 bh_02) {
        long l = a ^ 0x18F9E483A2E8L;
        long l2 = l ^ 0x4CAEE0A91256L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (boolean)cS.a("v", (Object)bh_02, (Object)objectArray, (long)-7566597964644443201L, (long)l);
    }

    public static bg_0 V(class_2596 class_25962) {
        return new bg_0(class_25962);
    }

    public static bA e(class_8685 class_86852, String string) {
        return new bA(class_86852, string);
    }

    public static a2 i(float f, float f10, Color color) {
        return new a2(f, f10, color);
    }

    public static boolean dp(class_583 class_5832) {
        long l = a ^ 0x520E701FFE0CL;
        long l2 = l ^ 0x6DB5B73FE423L;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = class_5832;
        return (boolean)cS.a("\u00da", (Object)objectArray, (long)-3886568242739283985L, (long)l);
    }

    public static bN b(class_2248 class_22482) {
        return new bN(class_22482);
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = cS.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = cS.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = cS.a(l, l2);
            object = b[n];
            try {
                if (!(object instanceof String)) break block2;
                cS.b[n] = clazz = Class.forName(c[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = cS.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = cS.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    public static void bs() {
        long l = a ^ 0x6127AB5E9F02L;
        long l2 = l ^ 0x227432DF2E4CL;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        cS.a("\u00da", (Object)objectArray, (long)-6117214063076461004L, (long)l);
    }

    public static boolean en(bc_0 bc_02) {
        long l = a ^ 0x2D64D971242L;
        long l2 = l ^ 0x568149BDA2FCL;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (boolean)cS.a("v", (Object)bc_02, (Object)objectArray, (long)2761851241401690901L, (long)l);
    }

    public static void ca(K k, int n) {
        long l = a ^ 0x709EED119CECL;
        long l2 = l ^ 0x2CF446F0CE65L;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = n;
        cS.a("v", (Object)k, (Object)objectArray, (long)-6270531905409087799L, (long)l);
    }

    public static aU ad(class_2818 class_28182) {
        return new aU(class_28182);
    }

    public static Color x(a2 a22) {
        long l = a ^ 0x58CF2E1A1CC9L;
        return cS.a("v", (Object)a22, (Object)new Object[0], (long)2940864192988880891L, (long)l);
    }

    public static boolean cd(bs_0 bs_02) {
        long l = a ^ 0x783DDEFCF518L;
        long l2 = l ^ 0x2C6ADAD645A6L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (boolean)cS.a("v", (Object)bs_02, (Object)objectArray, (long)-4535569054750749617L, (long)l);
    }

    public static boolean ba(aX aX2) {
        long l = a ^ 0x7F7AEDE16CAFL;
        long l2 = l ^ 0x2B2DE9CBDC11L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (boolean)cS.a("v", (Object)aX2, (Object)objectArray, (long)6393260711850431992L, (long)l);
    }

    public static boolean ae(aU aU2) {
        long l = a ^ 0x7F75FF2E2EEFL;
        long l2 = l ^ 0x2B22FB049E51L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (boolean)cS.a("v", (Object)aU2, (Object)objectArray, (long)1943704223875143608L, (long)l);
    }

    public static boolean cr(bO bO2, Class clazz) {
        long l = a ^ 0x23C31FA29E42L;
        long l2 = l ^ 0x6356788579DFL;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = clazz;
        return (boolean)cS.a("v", (Object)bO2, (Object)objectArray, (long)-6173653864047138081L, (long)l);
    }

    public static bC ce() {
        return new bC();
    }

    public static boolean bb(bO bO2, Class clazz) {
        long l = a ^ 0x557B614D5BF1L;
        long l2 = l ^ 0x15EE066ABC6CL;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = clazz;
        return (boolean)cS.a("v", (Object)bO2, (Object)objectArray, (long)8061918585581170540L, (long)l);
    }

    public static boolean cb(bO bO2, Class clazz) {
        long l = a ^ 0x3CFA2955CBEBL;
        long l2 = l ^ 0x7C6F4E722C76L;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = clazz;
        return (boolean)cS.a("v", (Object)bO2, (Object)objectArray, (long)-1167973042094218L, (long)l);
    }

    public static float s(a2 a22) {
        long l = a ^ 0x199B980DD645L;
        return (float)cS.a("v", (Object)a22, (Object)new Object[0], (long)-2135220850927113155L, (long)l);
    }

    private static Field c(long l, long l2) {
        int n = cS.a(l, l2);
        Object object = b[n];
        if (object instanceof String) {
            String string = c[n];
            int n2 = string.indexOf(8);
            Class clazz = cS.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = cS.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = cS.a(clazz3, string2, clazz2)) != null) {
                    cS.b[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = cS.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        cS.b[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = cS.b(8800769887378036L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public static boolean c(bN bN2) {
        long l = a ^ 0x41CE6D5FA31CL;
        long l2 = l ^ 0x1599697513A2L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (boolean)cS.a("v", (Object)bN2, (Object)objectArray, (long)-7563142420927309237L, (long)l);
    }

    public static bG da() {
        return new bG();
    }

    public static Color n(a2 a22) {
        long l = a ^ 0x70DB6D18C2BAL;
        return cS.a("v", (Object)a22, (Object)new Object[0], (long)-674655444164787832L, (long)l);
    }

    public static boolean h(bO bO2, Class clazz) {
        long l = a ^ 0x1B2CF8A4FEB5L;
        long l2 = l ^ 0x5BB99F831928L;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = clazz;
        return (boolean)cS.a("v", (Object)bO2, (Object)objectArray, (long)-3844386972377888216L, (long)l);
    }

    public static aV ch() {
        return new aV();
    }

    public static boolean el(bO bO2, Class clazz) {
        long l = a ^ 0x173908FC852AL;
        long l2 = l ^ 0x57AC6FDB62B7L;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = clazz;
        return (boolean)cS.a("v", (Object)bO2, (Object)objectArray, (long)-5675957752197893705L, (long)l);
    }

    public static boolean f(bA bA2) {
        long l = a ^ 0x1A8BF16BA362L;
        long l2 = l ^ 0x4EDCF54113DCL;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (boolean)cS.a("v", (Object)bA2, (Object)objectArray, (long)-7533386039448790475L, (long)l);
    }

    public static Color l(a2 a22) {
        long l = a ^ 0x5908B439A86DL;
        return cS.a("v", (Object)a22, (Object)new Object[0], (long)-7173093319576704161L, (long)l);
    }

    private static Method d(long l, long l2) {
        int n = cS.a(l, l2);
        Object object = b[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = c[n];
                int n3 = string2.indexOf(8);
                clazz3 = cS.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = cS.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = cS.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        cS.b[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = cS.b(8800769887378036L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = cS.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        cS.b[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = cS.b(8800769887378036L, 0L);
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

    public static boolean d(bO bO2, Class clazz) {
        long l = a ^ 0x20542FCF73BFL;
        long l2 = l ^ 0x60C148E89422L;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = clazz;
        return (boolean)cS.a("v", (Object)bO2, (Object)objectArray, (long)5165563979039065890L, (long)l);
    }

    private static void a() {
        Object[] objectArray = b;
        b[0] = "\u001f4R5/\f\t4Wo<\u001b\u001e\u007fTi0\u000f\u000f8C~{\u001e4";
        objectArray[1] = "pCD\u001ed#\u0005cO\u0011uldmD\u001aq6\u0010";
        objectArray[2] = Boolean.TYPE;
        cS.c[2] = "java/lang/Boolean";
        objectArray[3] = "Z1\f@mdL1\t\u001a~s[z\n\u001crgJ=\u001d\u000b9uv";
        objectArray[4] = "\t\u0001'jDW|!,eU\u0018\u001d/'nQBi";
        objectArray[5] = "7V\t\u000e\u000e\t!V\fT\u001d\u001e6\u001d\u000fR\u0011\n'Z\u0018EZ\u001ab";
        objectArray[6] = "\u000b\u001f,[R\u001c~?'TCS\u001f1,_G\tk";
        objectArray[7] = "]>\u000e\u001c#\u0006]>\u0019@/\tGu\u0019^/\u001c@\u0004N\u0007vW";
        objectArray[8] = "\u0005=j\u001dp>\u0013=oGc)\u0004vlAo=\u00151{V$*%";
        objectArray[9] = "-O\n\u0003d\u0016Xo\u0001\fuY9a\n\u0007q\u0003M";
        objectArray[10] = "\u0007k\u001f\u001e6Z\u0011k\u001aD%M\u0006 \u0019B)Y\u0017g\u000eUbN ";
        objectArray[11] = "oT6\u0015?\tyT3O,\u001en\u001f0I \n\u007fX'^k\u00189";
        objectArray[12] = "ulQ=PA\u0000LZ2A\u000eaBQ9ET\u0015";
        objectArray[13] = "J-\u00058\u0011\u0006A\"\u0014wy\u0006O-\u0007";
        objectArray[14] = "\u001bOCz\u0012T\rOF \u0001C\u001a\u0004E&\rW\u000bCR1F@\u001e";
        objectArray[15] = "6-E2P\u0005C\rN=AJ\"\u0003E6E\u0010V";
        objectArray[16] = "D\u0012\f!|2D\u0012\u001b}p=^Y\u001bcp(Y(K=(c";
        objectArray[17] = "v\t\u0000/'[`\t\u0005u4LwB\u0006s8Xf\u0005\u0011dsIq";
        objectArray[18] = "\u0014\u0007Y\u0013@\u001ea'R\u001cQQ\u0000)Y\u0017U\u000bt";
        objectArray[19] = "\u007flO\u0007kgtc^H\u0016\u007fgdW\u0001";
        objectArray[20] = "Z\"I{DN/\u0002BtU\u0001N\fI\u007fQ[:";
        objectArray[21] = Float.TYPE;
        cS.c[21] = "java/lang/Float";
        objectArray[22] = "A!(\fu\u0001W!-Vf\u0016@j.Pj\u0002Q-9G!\u0012I-;L{_u6;Q{\u0018B!";
        objectArray[23] = ":<H<\u000fVO\u001cC3\u001e\u0019.\u0012H8\u001aCZ";
        objectArray[24] = Void.TYPE;
        cS.c[24] = "java/lang/Void";
        objectArray[25] = "k\u0006\u0011\u0007h\u0001}\u0006\u0014]{\u0016jM\u0017[w\u0002{\n\u0000L<\u0015\u007f";
        objectArray[26] = "TvJC8B!VAL)\r@XJG-W4";
        objectArray[27] = "P^j\u0005\"\u0002F^o_1\u0015Q\u0015lY=\u0001@R{Nv\u0013s";
        objectArray[28] = "Y\u000b\u00188\u0004\u001b,+\u00137\u0015TM%\u0018<\u0011\u000e9";
        objectArray[29] = "N\u001b_R\u0018{X\u001bZ\b\u000blOPY\u000e\u0007x^\u0017N\u0019LoO";
        objectArray[30] = "UQrc\t} qyl\u00182A\u007frg\u001ch5";
        objectArray[31] = ")CJu\u001f\t?CO/\f\u001e(\bL)\u0000\n9O[>K\u001b\u0001";
        objectArray[32] = "\bie\u0012ZA}In\u001dK\u000e\u001cGe\u0016OTh";
        objectArray[33] = Double.TYPE;
        cS.c[33] = "java/lang/Double";
        objectArray[34] = "':+\u0016G\u00061:.LT\u0011&q-JX\u000576:]\u0013\u00119";
        objectArray[35] = "H\ftMo>=,\u007fB~q\\\"tIz+(";
        objectArray[36] = "\u0017B}Hqt\u0001Bx\u0012bc\u0016\t{\u0014nw\u0007Nl\u0003%e@";
        objectArray[37] = "^2P\u007f3>+\u0012[p\"qJ\u001cP{&+>";
        objectArray[38] = "-~\u0005\u007f\u001cRX^\u000ep\r\u001d9P\u0005{\tGM";
        objectArray[39] = "5G2\twQ#G7SdF4\f4UhR%K#B#C7";
        objectArray[40] = "\u001d]\u001b\u0000Q\u000fh}\u0010\u000f@@\ts\u001b\u0004D\u001a}";
        objectArray[41] = "\u0006\u001510@B\u0006\u0015&lLM\u001c^&rLX\u001b/w*\u001e";
        objectArray[42] = "@*!S'5V*$\t4\"Aa'\u000f86P&0\u0018s'f";
        objectArray[43] = "\u0007EA\u001efKreJ\u0011w\u0004\u0013kA\u001as^g";
        objectArray[44] = "z\u000eZ#\u0019gg\u001b\u0002\u0001Xj\u007f\u001d";
        objectArray[45] = "\u001b*ps6Pn\n{|'\u001f\u000f\u0004pw#E{";
        objectArray[46] = " /UJUf6/P\u0010Fq!dS\u0016Je0#D\u0001\u0001_";
        objectArray[47] = "0>^=&ME\u001eU27\u0002$\u0010^93XP";
        objectArray[48] = "\u001e\u00019;M6\u001e\u0001.gA9\u0004J.yA,\u0003;|$\u0012hH";
        objectArray[49] = "?#HAG\u001b)#M\u001bT\f>hN\u001dX\u0018//Y\n\u0013\t9";
        objectArray[50] = "y\u0012;VH\u001b\f20YYTm<;R]\u000e\u0019";
        objectArray[51] = "\u0019NHg35\u0019N_;?:\u0003\u0005_%?/\u0004t\u000e|hm";
        objectArray[52] = "_LqS\u0010bILt\t\u0003u^\u0007w\u000f\u000faO@`\u0018Dso";
        objectArray[53] = "'*xHt3R\nsGe|3\u0004xLa&G";
        objectArray[54] = "WIU4\"%\"i^;3jCgU0707";
        objectArray[55] = "thwF\u0000 \u0001H|I\u0011o`FwB\u00155\u0014";
        objectArray[56] = "\u0006:o(@*s\u001ad'Qe\u0012\u0014o,U?f";
        objectArray[57] = "E|\"H\u001aZ0\\)G\u000b\u0015QR\"L\u000fO%";
        objectArray[58] = "UW\u000boXc w\u0000`I,Ay\u000bkMv5";
        objectArray[59] = "\u00135\"oX\b\u00055'5K\u001f\u0012~$3G\u000b\u000393$\f\u001b\u0018";
        objectArray[60] = "3\u0014[(Q\u0004F4P'@K':[,D\u0011S";
        objectArray[61] = ":b<b\u0016GOB7m\u0007\b.L<f\u0003RZ";
        objectArray[62] = "\u0019\u001d\fliFl=\u0007cx\t\r3\fh|Sy";
        objectArray[63] = "T_<]\u001d#!\u007f7R\fl@q<Y\b64";
        objectArray[64] = "\u0012tK#1\u0017gT@, X\u0006ZK'$\u0002r";
        objectArray[65] = "I6@\u000bcIW>ZD\u0002LW>Y\u0004,P";
        objectArray[66] = "!c\u00153$\u000b7c\u0010i7\u001c (\u0013o;\b1o\u0004xp8";
        objectArray[67] = "\u001fb\u0002\u0003\n]jB\t\f\u001b\u0012\u000bL\u0002\u0007\u001fH\u007f";
        objectArray[68] = "hO+\u001eE]~O.DVJi\u0004-BZ^xC:U\u0011Og";
        objectArray[69] = "1^\u0001\u001cs\u007fD~\n\u0013b0%p\u0001\u0018fjQ";
        objectArray[70] = "s\u0002\u0015\u0013\t@m\n\u000f\\A@w\u0000\u0017\u001bH[73\u0011\u0017C\\z\u0002\u0017\u0017";
        objectArray[71] = "*\u001c0\u001bG;_<;\u0014Vt>20\u001fR.J";
        objectArray[72] = "(1JUsQ>1O\u000f`F)zL\tlR8=[\u001e'E\u0004";
        objectArray[73] = "yf\r~@(\fF\u0006qQgmH\rzU=\u0019";
        objectArray[74] = "\t2)whz|\u0012\"xy5\u001d\u001c)s}oi";
        objectArray[75] = "\u0016q!<?\u0013\u0000q$f,\u0004\u0017:'` \u0010\u0006}0wk\u00013";
        objectArray[76] = ":;\u001fcu\u0018O\u001b\u0014ldW.\u0015\u001fg`\rZ";
        objectArray[77] = "\u0004q3@k\u001a\u0004q$\u001cg\u0015\u001e:$\u0002g\u0000\u0019K\u007fX>F";
        objectArray[78] = "bF?-\bAtF:w\u001bVc\r9q\u0017BrJ.f\\y";
        objectArray[79] = "\u000fEa3\u0000xzej<\u00117\u001bka7\u0015mo";
        objectArray[80] = "^t\u0019\u001et\u000b^t\u000eBx\u0004D?\u000e\\x\u0011CNY\u0006)Q";
        objectArray[81] = "%s\u0010t5X3s\u0015.&O$8\u0016(*[5\u007f\u0001?aL\u0003";
        objectArray[82] = "2m\u00146x7GM\u001f9ix&C\u00142m\"R";
        objectArray[83] = "V`\bj>\t#@\u0003e/FBN\bn+\u001c6";
        objectArray[84] = "XZ\u0017\u00020M-z\u001c\r!\u0002Lt\u0017\u0006%X8";
        objectArray[85] = "\u0003W1..{vw:!?4\u0017y1*;nc";
        objectArray[86] = "U)uedq \t~ju>A\u0007uaqd5";
        objectArray[87] = "\u0004?{o~r\u0012?~5me\u0005t}3aq\u00143j$*`9";
        objectArray[88] = "Bbu0I\u00077B~?XHVLu4\\\u0012\"";
        objectArray[89] = "*\u0012Vq\u0013\u000f<\u0012S+\u0000\u0018+YP-\f\f:\u001eG:G\u001e\u001c";
        objectArray[90] = ";6B\u0013m:N\u0016I\u001c|u/\u0018B\u0017x/[";
        objectArray[91] = "b\u0012\u001b\u001c\u000f b\u0012\f@\u0003/xY\f^\u0003:\u007f(]\u0001Z";
        objectArray[92] = ">:-\u007f\u0015\u0011K\u001a&p\u0004^*\u0014-{\u0000\u0004^";
        objectArray[93] = "\u0012qkQwc\u0004qn\u000bdt\u0013:m\rh`\u0002}z\u001a#X";
        objectArray[94] = "g`X\u000b,&\u0012@S\u0004=isNX\u000f93\u0007";
        objectArray[95] = "?.mmR\\J\u000efbC\u0013+\u0000miGI_";
        objectArray[96] = "VH.h\fT#h%g\u001d\u001bBf.l\u0019A6";
        objectArray[97] = "\u0013{ Q_\u0012f[+^N]\u0007U UJ\u0007s";
        objectArray[98] = "\u0012H_cK~\u0004HZ9Xi\u0013\u0003Y?T}\u0002DN(\u001fl\u0018";
        objectArray[99] = "V\tb/\u0016=#)i \u0007rB'b+\u0003(6";
        objectArray[100] = "@w\b\u0001+\u0013Vw\r[8\u0004A<\u000e]4\u0010P{\u0019J\u007f\u0000\u001c";
        objectArray[101] = "+\u0011$\fo\u0013^1/\u0003~\\??$\bz\u0006K";
        objectArray[102] = "!3Fwne73C-}r x@+qf1?W<:w!";
        objectArray[103] = "!&<\u0003_TT\u00067\fN\u001b5\b<\u0007JAA";
        objectArray[104] = "!?Yq\\\u00137?\\+O\u0004 t_-C\u001013H:\b\u0001\b";
        objectArray[105] = "\u000e\rm:Tr{-f5E=\u001a#m>Agn";
        objectArray[106] = Long.TYPE;
        cS.c[106] = "java/lang/Long";
        objectArray[107] = "/\b\u000b[fMZ(\u0000Tw\u0002;&\u000b_sXO";
        objectArray[108] = "\u0003%Vm.fv\u0005]b?)\u0017\u000bVi;sc";
        objectArray[109] = "'+\u000f>_.1+\ndL9&`\tb@-7'\u001eu\u000b<\u0007";
        objectArray[110] = " 1\u001a&[ZU\u0011\u0011)J\u00154\u001f\u001a\"NO@";
        objectArray[111] = "{$\u0010\u0006\u00158\u000e\u0004\u001b\t\u0004wo\n\u0010\u0002\u0000-\u001b";
        objectArray[112] = "r\u007f4zR\u0013\u0007_?uC\\fQ4~G\u0006\u0012";
        objectArray[113] = "\u0000ID1&\u001d\u0016IAk5\n\u0001\u0002Bm9\u001e\u0010EUzr:";
        objectArray[114] = "\u000e`hbf;{@cmwt\u001aNhfs.n";
        objectArray[115] = "\u00032qW\u001e\u0015\u0001,84\u0015\u000e\u001e)nM\u0012";
        objectArray[116] = "]\u0010\u001dwp*(0\u0016xaeI>\u001dse?=";
        objectArray[117] = "U!/E\u001b$K)5\ny8L4";
        objectArray[118] = "\u00192&pJk\u000f2#*Y|\u0018y ,Uh\t>7;\u001ey3";
        objectArray[119] = "'sMU\b;RSFZ\u0019t3]MQ\u001d.G";
        objectArray[120] = "O9\u001f,{\u0013Y9\u001avh\u0004Nr\u0019pd\u0010_5\u000eg/\u0002\u001a";
        objectArray[121] = "frnH\u0011\t\u0013ReG\u0000Fr\\nL\u0004\u001c\u0006";
        objectArray[122] = Integer.TYPE;
        cS.c[122] = "java/lang/Integer";
        objectArray[123] = "I;JnD5<\u001bAaUz]\u0015JjQ )";
        objectArray[124] = "\u0017\u0018!0%9b8*?4v\u00036!40,w";
        objectArray[125] = "&3m1VT-<|~7Z&7x$";
        objectArray[126] = " \u0018\n\u001dw\u001cw\u0001V]uusq\b\u000f\u007f\u001f \u000eO\u001fe\u001ekq]\u001dj\n}\u001cR\u001e(K\u0019";
        objectArray[127] = "RIJD%\rU\u000e\u001fE\\Zo\tMP6\t\u0010N]J7Bo\f\u001d\u0003-H^R[\u0005!0";
        objectArray[128] = "Fhh%\u001fX\u0013`<?gT|3;2\r\u0007\u0003t+(\fL|3o$\u0001XD25;\u0005>";
        objectArray[129] = "A\u0006S#1\f\u0006\u001bTx,~\u0011a\bu9\u0014A\u001eOe#\u0015\na]g,\u0001\u001c\fRdn@x";
        objectArray[130] = "!m@\u000f\f\u001f~ D\u0019\u000b%q\u001fF\u0018^O!`\u0001\bDNj\u001f\u0011\n\u0004]ibG\u0007LX\u0018";
        objectArray[131] = "@I\u0001%;<\u001dM[>!\u0002\u00132_60h@M\u0018&*i\u000b2\n$%}\u001d_\u0005'g<y";
        objectArray[132] = "\u000b\u000fTQ+KI^OH\u0015\u001aw_FQ\u007fJ\b\u0018VK~\u0001w\u001b\u0013Yz\u0012\u001aY\u001aE,s";
        objectArray[133] = "\u001b8\u001a!\u0004\t[z\u0015$~\u0012a;\u0006-\u0014B\u001e|\u00167\u0015\tal\u0014w\u0006\n\u001c:\u0019?\u0003{";
        objectArray[134] = "7Q\u000f\u0018k<wS\nB7\u0002g>Z\u0014ah7A\u001d\u0004{i|>Y\u0019ue>U\u0007\u0001{za>";
        objectArray[135] = ";\u001b?Aaw1\u0004}\u0010\u0002r\u0000\\-\u0017h\"\u007f\u001b=\rii\u0000_qL<eg\b-\u0016:a\u0000";
        objectArray[136] = "4bJBq\\l9\t\u001b<;gZALgQ7%\u0006\\}P|ZA\u0018pVu<\u0011\u0018h\u0004dZ";
        objectArray[137] = "y)\f\u007f7e9s\u0016.\"\u0017)HNr7}y7\tb-|2HM}9p{xLmbx>H";
        objectArray[138] = "+`=&5z);=*-\u001byX:.\"q+'}>8p`Xf!/j-3m1yg\u0012";
        objectArray[139] = "\u000e\u000eRSCV\tI\u0007R:\u00003NUGPRL\tE]Q\u00193K\u0005\u0014K\u0013\u0002\u0015C\u0012Gk";
        objectArray[140] = "\u0011\u0002\\\u000bOo[SB\u0014-g!\u0005Q\u000eG7^BA\u0014F|!\u000e\u0000\n\u0015\u007fO][\u001fI\u000e";
        objectArray[141] = "c\u0007'-\u0001T<J#;\u0006n0u!:S\u0004c\nf*I\u0005(uv(\t\u0016+\b %A\u0013Z";
        objectArray[142] = "\u0012\u0006L(kP\u0010\u0003\t \u0011Im\u0003]{{\u0019\u0012DMazRmIL`\u007fK\u001dT^qu ";
        objectArray[143] = "8[sx\u001f\u001ff\u001dutgD\u0007\\&b\r\u0017x\u001b6x\f\\\u0007\u000b48\u001f_z]9p\u001a.";
        objectArray[144] = "0ZEPmX7\u001d\u0010Q\u0014\t\r\u001aBD~\\r]R^\u007f\u0017\r\u001f\u0012\u0017e\u001d<AT\u0011ie";
        objectArray[145] = "L&/bVbO'&5*7\"~z1@d]9j+A/\"~.'L;\u001a\u007ft8H]";
        objectArray[146] = "b \u0012*J\b?$H1P62[L9A\\b$\u000b)[])[\u0019+TI?6\u0016(\u0016\b[";
        objectArray[147] = "{\u001ah\u001deM3\u001di\u0012$*+p+\u001dp@{\u000fl\rjA0p|\u000f*R3\r*\u0002bWB";
        objectArray[148] = "\u0007*0\nD\u0011]\",@ \u00036j1\u0010JPI-!\nK\u001b6:3\u0019XUOoc\u0014@i";
        objectArray[149] = ";\u0010b|\u0015^`\u00178%/P[Wn+E\u0002$\u0010~1DI[\u0002|>P_6\r\u007f|\u0011;";
        objectArray[150] = "R f\u0005]RGz7I=X6{gPW\u000bI<wJV@6'h]L\r],x\u000bA2";
        objectArray[151] = "{Mhn\u0014n9\u0017)y\u0015\u0004(pboDn{\u000f%\u007f^o0p5}\u001e|3\rcpVyB";
        objectArray[152] = "$Z:*\u0016o'[3}j9J\u0002oy\u0000i5E\u007fc\u0001\"J\u0002;o\f6r\u0003ap\bP";
        objectArray[153] = "W\u0018fY^o\t\u001cjE\\\u000f\u0007g5K\beW\u0018r[\u0012d\u001cgc]\fu\u001c\u001ecMS`n";
        objectArray[154] = "^bIK\u0016jFs\u0010F.</9\u001eFDlP~\u000e\\E'/q\u0010@\\-Ce\u001f_NU";
        objectArray[155] = "U\u001c\u0012RZa\u0004\u001d)Tg+X\u0015C\u0007\u0018lH\u000fBLg+\f\u0003OX_*V\u001cK>";
        objectArray[156] = "Jpe\u001b\\6O)d\u0018\u0014Z\u0019N4\u0012\u00070I1s\u0002\u001d1\u0002N4OP1\u00132`N\u000e4\u0014N";
        objectArray[157] = "~X[\n\u0000N%\u000f\f\b\u00157-2\n\f\u0019]}MM\u001c\u0003\\62\n\rHK!I\r\u0004\u001dT;2";
        objectArray[158] = "J\u0002T\n`d\u0002\u0005U\u0005!\u0003\u001ah\u0017\nuiJ\u0017P\u001aoh\u0001h\u0014\fo;\u000b\u000eG\u001co\u007fMh";
        objectArray[159] = ":0sR\u0004Va7)\u000b>ZZw\u007f\u0005T\n%0o\u001fUAZw#S^\t+2t\u0015ZKZ";
        objectArray[160] = ",X3>rliD?4m]|4y6i7,K>&s6g4yb\u007f;s\fx8`?\u0015";
        objectArray[161] = "\u00048#\u001f\u000b\u000f\u000e'aNh\n?\u007f1I\u0002Z@8!S\u0003\u0011?y-L\u0014^T7mC\u0015c";
        objectArray[162] = "A\u0019S[W\u0012BP\u000b\u0007nJ QY\t\u0004\u001a_\u0016I\u0013\u0005Q \b[\u0004\nFQ\u000eY\u0004^#";
        objectArray[163] = "lCt5\u00107)M)a\u007f6\u0014\u0018\u007f4\u0015ek_o.\u0014.\u0014Omn\u0007-i\u0019`&\u0002\\";
        objectArray[164] = "E !SY\bG{!_Ai\u0016\u0018&[N\u0003EgaKT\u0002\u000e\u0018zTC\u0018CsqD\u0015\u0015|";
        objectArray[165] = "~JNfTM%M\u0014?nE\u001e\rB1\u0004\u0011aJR+\u0005Z\u001eXP$\u0011LsWSfP(";
        objectArray[166] = "kS0_2X1[,\u0015VIZ\u00131E<\u0019%T!_=RZC3L.\u001c#\u0016cA6 ";
        objectArray[167] = "d\u0018x-VI4\u001bi.5\\\u000fLj~_\fp\u000bzd^G\u000f\u001a|zOGv\u001al%Z5";
        objectArray[168] = "\u0019K:G-{\u001b\u0010:K5\u001aIs=O:p\u0019\fz_ qRsa@7k\u001f\u0018jPaf ";
        objectArray[169] = ".Nq\u0000u'-\u0007)\\L}O\u0006{R&/0AkH'dO\u0006/D*pw\u0007u[.\u0016";
        objectArray[170] = ":$9jo\u0017a<hj\u000f\u001e\\8*bn\u0017<c23nw";
        objectArray[171] = "\u0006~xUV\u0011\u00057 \toJg6r\u0007\u0005\u0019\u0018qb\u001d\u0004Rg6&\u0011\tF_7|\u000e\r ";
        objectArray[172] = "cz\u001a\u0015-s$g\u001dN0\u00011\u001dAC%kcb\u0006S?j(\u001dA\u00173g<%@M,cZ";
        objectArray[173] = "%j<^\u001aj'cv@NUu\u00137O\u0018?%lp_\u0002>n\u00134X\u0011%wy2P\u0001jf\u0013";
        objectArray[174] = ")jW13*c;I.Q!\u0019mZ4;rf*J.:9\u0019:Hn):dlE&,K";
        objectArray[175] = "=+_T\u001f\u0001\u007fzDM!SA{MTK\u0000><]NJKA?\u0018\\NX,}\u0011@\u00189";
        objectArray[176] = "%\\r&od\u007f\u000ep7\"\u001atg:'4p&\u0018}7.qmg:s\"|y_;)=x\u001f";
        objectArray[177] = "\u0016J\u0017g8%HJ\nj8\u0015G{R74\u007f\u0015\u0004\u0015'.~^{Rc\"sJCS9=w,";
        objectArray[178] = "\\aom_V\fb~n<@75}>V\u0013Hrm$WX7ck:FXNc{eS*";
        objectArray[179] = "\u0017/(uH\u0007P2/.UuDHs#@\u001f\u0017743Z\u001e\\HswV\u0013Hpr-I\u0017.";
        objectArray[180] = "Wt\\9\u000bz\u001d%B&irgsQ<\u0003\"\u00184A&\u0002ig$Cf\u0011j\u001arN.\u0014\u001b";
        objectArray[181] = ">v\u0006YfX+,W\u0015\u0006SZ-\u0007\fl\u0001%j\u0017\u0016mJZq\b\u0001w\u00071z\u0018Wz8";
        objectArray[182] = "/w\u0007bWetp];m`O0\u000b5\u000790w\u001b/\u0006rOe\u0019 \u0012d\"j\u001abS\u0000";
        objectArray[183] = "DFr43S\u0001H/`\\Q<\u001dy56\u0001CZi/7J<Jko$IA\u001cf'!8";
        objectArray[184] = "?Qt-z\u0002a\u0017r!\u0002Z\u0000V!7h\n\u007f\u00111-iA\u0000\u00013mzB}W>%\u007f3";
        objectArray[185] = "~\u001d\u000bBx>%\u0005ZB\u00187\u0018\b\u001d]g:u\u0007\u001e\u001f&^";
        objectArray[186] = "b\u001d)\u0004Zp)\u001a.\u0017\u001bA2~u\u0018\f+b\u00012\b\u0016*)~ \n\u0019>?\u0013/\t[\u007f[";
        objectArray[187] = "D\u0000\u0015?\\VQZDs<_ [\u0014jV\u000f_\u001c\u0004pWD \u0007\u001bgM\tK\f\u000b1@6";
        objectArray[188] = "\u0001\u001dG_iT\u0002\u001cN\b\u0015\u0002oE\u0012\f\u007fR\u0010\u0002\u0002\u0016~\u0019o\u0010\u0000\u0019j\u000f\u0002\u001f\u0003[+k";
        objectArray[189] = "YPAO7\u001a\u0013\u0001_PU\u0012iWLJ?B\u0016\u0010\\P>\ti\u0013\u0019B:\u001a\u0004Q\u0010^l{";
        objectArray[190] = ")sLll\u001frt\u00165V\u0016I4@;<C6sP!=\bIaR.)\u001e$nQlhz";
        objectArray[191] = "!s{\u0004K\u001c}{%L\u000emq\u0003'\u0010X\u0007!|`\u0000B\u0006j\u0003q\u0006\\\u0017jzq\u0016\u0003\u0002\u0018";
        objectArray[192] = "#\u0018Nm\fscZAhvhY\u001bRa\u001c8&\\B{\u001dsYZZi\u0014{3]_q\u001f\u0001";
        Object[] objectArray2 = objectArray;
        objectArray[193] = "b\fR\u0017C65\u0015\u000eWA_2eP\u0005K5b\u001a\u0017\u0015Q4)e\u0005\u0017^ ?\b\n\u0014\u001ca[";
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00c9' || c == '\u00a5' || c == 'R' || c == '\u00e2') {
                field = cS.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c9' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00a5' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'R' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = cS.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'v' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00da' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private static Field a(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/cS" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = cS.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
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

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (c[n3] != null) {
            return n3;
        }
        Object object = b[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 44;
            case 1 -> 63;
            case 2 -> 59;
            case 3 -> 28;
            case 4 -> 29;
            case 5 -> 42;
            case 6 -> 57;
            case 7 -> 45;
            case 8 -> 38;
            case 9 -> 27;
            case 10 -> 43;
            case 11 -> 48;
            case 12 -> 11;
            case 13 -> 46;
            case 14 -> 22;
            case 15 -> 52;
            case 16 -> 19;
            case 17 -> 60;
            case 18 -> 55;
            case 19 -> 0;
            case 20 -> 15;
            case 21 -> 31;
            case 22 -> 32;
            case 23 -> 33;
            case 24 -> 25;
            case 25 -> 56;
            case 26 -> 8;
            case 27 -> 17;
            case 28 -> 1;
            case 29 -> 6;
            case 30 -> 50;
            case 31 -> 20;
            case 32 -> 40;
            case 33 -> 51;
            case 34 -> 4;
            case 35 -> 13;
            case 36 -> 12;
            case 37 -> 2;
            case 38 -> 35;
            case 39 -> 54;
            case 40 -> 24;
            case 41 -> 41;
            case 42 -> 5;
            case 43 -> 61;
            case 44 -> 53;
            case 45 -> 58;
            case 46 -> 36;
            case 47 -> 34;
            case 48 -> 14;
            case 49 -> 10;
            case 50 -> 7;
            case 51 -> 30;
            case 52 -> 9;
            case 53 -> 49;
            case 54 -> 16;
            case 55 -> 18;
            case 56 -> 26;
            case 57 -> 47;
            case 58 -> 39;
            case 59 -> 62;
            case 60 -> 21;
            case 61 -> 23;
            case 62 -> 37;
            default -> 3;
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
        cS.c[n3] = new String(cArray);
        return n3;
    }

    public static boolean a(bO bO2, Class clazz) {
        long l = a ^ 0x4F4027001713L;
        long l2 = l ^ 0xFD54027F08EL;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = clazz;
        return (boolean)cS.a("v", (Object)bO2, (Object)objectArray, (long)2523047159471940494L, (long)l);
    }

    public static boolean cl(bx_0 bx_02) {
        long l = a ^ 0x16E65935ECE2L;
        long l2 = l ^ 0x42B15D1F5C5CL;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (boolean)cS.a("v", (Object)bx_02, (Object)objectArray, (long)-2813618223032117835L, (long)l);
    }

    public static br_0 cn() {
        return new br_0();
    }

    public static Color m(a2 a22) {
        long l = a ^ 0x7EF4E20BA988L;
        return cS.a("v", (Object)a22, (Object)new Object[0], (long)-7092841358140560710L, (long)l);
    }

    public static Vector4f o(float f, float f10, float f11, float f12) {
        return new Vector4f(f, f10, f11, f12);
    }

    public static boolean ex(bO bO2, Class clazz) {
        long l = a ^ 0x7096B9F76215L;
        long l2 = l ^ 0x3003DED08588L;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = clazz;
        return (boolean)cS.a("v", (Object)bO2, (Object)objectArray, (long)6198525184963860104L, (long)l);
    }

    public static Float p(a2 a22) {
        long l = a ^ 0x23ABBF8FBABBL;
        return cS.a("v", (Object)a22, (Object)new Object[0], (long)-8165554085769724728L, (long)l);
    }

    public static Color k(a2 a22) {
        long l = a ^ 0x24DD35349984L;
        return cS.a("v", (Object)a22, (Object)new Object[0], (long)-5936465086378272074L, (long)l);
    }

    public static float t(a2 a22) {
        long l = a ^ 0x4868D7ED968AL;
        return (float)cS.a("v", (Object)a22, (Object)new Object[0], (long)-6730687924452238245L, (long)l);
    }

    public static class_8685 g(bA bA2) {
        long l = a ^ 0x48132E0D64FDL;
        return cS.a("v", (Object)bA2, (Object)new Object[0], (long)5830705598502477289L, (long)l);
    }

    public static a2 v(float f, float f10, Color color) {
        return new a2(f, f10, color);
    }

    public static boolean db(bG bG2) {
        long l = a ^ 0x264008A07F02L;
        long l2 = l ^ 0x72170C8ACFBCL;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (boolean)cS.a("v", (Object)bG2, (Object)objectArray, (long)5410007895361144405L, (long)l);
    }

    public static boolean j(a2 a22) {
        long l = a ^ 0x362CEBD5DDC6L;
        long l2 = l ^ 0x627BEFFF6D78L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (boolean)cS.a("v", (Object)a22, (Object)objectArray, (long)-1598736186929912687L, (long)l);
    }

    public static bG dc() {
        return new bG();
    }

    public static float q(a2 a22) {
        long l = a ^ 0x1C797CBBD29CL;
        return (float)cS.a("v", (Object)a22, (Object)new Object[0], (long)-1835447676677822236L, (long)l);
    }

    public static boolean U(bO bO2, Class clazz) {
        long l = a ^ 0x4B4FB22A7ABAL;
        long l2 = l ^ 0xBDAD50D9D27L;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = clazz;
        return (boolean)cS.a("v", (Object)bO2, (Object)objectArray, (long)5668534437072621095L, (long)l);
    }

    public static boolean ct(aQ aQ2) {
        long l = a ^ 0x166446D5A9F0L;
        long l2 = l ^ 0x423342FF194EL;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (boolean)cS.a("v", (Object)aQ2, (Object)objectArray, (long)-7068956379327065945L, (long)l);
    }

    public static void bw() {
        long l = a ^ 0x3FB7E53E5DCEL;
        long l2 = l ^ 0x7CE47CBFEC80L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        cS.a("\u00da", (Object)objectArray, (long)7626587206251803896L, (long)l);
    }

    public static boolean cf(bC bC2) {
        long l = a ^ 0x7B7B2383D064L;
        long l2 = l ^ 0x2F2C27A960DAL;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (boolean)cS.a("v", (Object)bC2, (Object)objectArray, (long)-1985409314689586893L, (long)l);
    }

    public static boolean dn(aO aO2) {
        long l = a ^ 0x7C08FA422309L;
        long l2 = l ^ 0x285FFE6893B7L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (boolean)cS.a("v", (Object)aO2, (Object)objectArray, (long)1666173311294184030L, (long)l);
    }

    public static boolean af(bO bO2, Class clazz) {
        long l = a ^ 0x20787AA58E48L;
        long l2 = l ^ 0x60ED1D8269D5L;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = clazz;
        return (boolean)cS.a("v", (Object)bO2, (Object)objectArray, (long)-5019044913446667563L, (long)l);
    }

    public static float ao(dC dC2) {
        long l = a ^ 0xF2B7B27DD79L;
        return (float)cS.a("v", (Object)dC2, (Object)new Object[0], (long)-1630019782219172570L, (long)l);
    }

    public static boolean z(bO bO2, Class clazz) {
        long l = a ^ 0x7380B2DD779FL;
        long l2 = l ^ 0x3315D5FA9002L;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = clazz;
        return (boolean)cS.a("v", (Object)bO2, (Object)objectArray, (long)4868275501744997122L, (long)l);
    }

    public static boolean at(bd_0 bd_02) {
        long l = a ^ 0x21A97AFBA3DBL;
        long l2 = l ^ 0x75FE7ED11365L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (boolean)cS.a("v", (Object)bd_02, (Object)objectArray, (long)-7508289560001602932L, (long)l);
    }

    public static boolean ak(bD bD2) {
        long l = a ^ 0xCD4463F5CD6L;
        long l2 = l ^ 0x58834215EC68L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (boolean)cS.a("v", (Object)bD2, (Object)objectArray, (long)7548067130085762433L, (long)l);
    }

    public static boolean av(aK aK2) {
        long l = a ^ 0x66760DD60DE0L;
        long l2 = l ^ 0x322109FCBD5EL;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (boolean)cS.a("v", (Object)aK2, (Object)objectArray, (long)4176655113784997047L, (long)l);
    }

    public static boolean w(a2 a22) {
        long l = a ^ 0x2C9A94583111L;
        long l2 = l ^ 0x78CD907281AFL;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (boolean)cS.a("v", (Object)a22, (Object)objectArray, (long)362327972012034118L, (long)l);
    }

    public static boolean dw(be_0 be_02) {
        long l = a ^ 0x4D09CD0435E2L;
        long l2 = l ^ 0x195EC92E855CL;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (boolean)cS.a("v", (Object)be_02, (Object)objectArray, (long)140841725981297845L, (long)l);
    }

    public static boolean cj(bO bO2, Class clazz) {
        long l = a ^ 0x40B9F75DD79L;
        long l2 = l ^ 0x449EF8523AE4L;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = clazz;
        return (boolean)cS.a("v", (Object)bO2, (Object)objectArray, (long)-1627522066744350236L, (long)l);
    }

    public static boolean be(bO bO2, Class clazz) {
        long l = a ^ 0x343859BC0A19L;
        long l2 = l ^ 0x74AD3E9BED84L;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = clazz;
        return (boolean)cS.a("v", (Object)bO2, (Object)objectArray, (long)4470334445938687620L, (long)l);
    }

    public static boolean u(bO bO2, Class clazz) {
        long l = a ^ 0x185D8D2EB8F3L;
        long l2 = l ^ 0x58C8EA095F6EL;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = clazz;
        return (boolean)cS.a("v", (Object)bO2, (Object)objectArray, (long)-8294507793297404818L, (long)l);
    }

    public static float r(a2 a22) {
        long l = a ^ 0x76C3B399B5E9L;
        return (float)cS.a("v", (Object)a22, (Object)new Object[0], (long)-9082365901693026504L, (long)l);
    }

    public static a0 cp() {
        return new a0();
    }

    public static bd_0 as(y_0 y_02, float f, float f10) {
        return new bd_0(y_02, f, f10);
    }

    public static class_2561 ek(bb_0 bb_02) {
        long l = a ^ 0x668BB8853BC7L;
        return cS.a("v", (Object)bb_02, (Object)new Object[0], (long)1141605521841280664L, (long)l);
    }

    public static boolean eh(bO bO2, Class clazz) {
        long l = a ^ 0x61980DA24EE5L;
        long l2 = l ^ 0x210D6A85A978L;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = clazz;
        return (boolean)cS.a("v", (Object)bO2, (Object)objectArray, (long)8860133931765234296L, (long)l);
    }

    public static boolean ev(bM bM2) {
        long l = a ^ 0x37A98595EF24L;
        long l2 = l ^ 0x63FE81BF5F9AL;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (boolean)cS.a("v", (Object)bM2, (Object)objectArray, (long)-2652017175732496781L, (long)l);
    }

    public static aQ cv() {
        return new aQ();
    }

    public static boolean es(bj_0 bj_02) {
        long l = a ^ 0x24EC26080E5L;
        long l2 = l ^ 0x5619C64A305BL;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (boolean)cS.a("v", (Object)bj_02, (Object)objectArray, (long)-5407959440021276238L, (long)l);
    }

    public static boolean eq(bO bO2, Class clazz) {
        long l = a ^ 0x29CAC513CF05L;
        long l2 = l ^ 0x695FA2342898L;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = clazz;
        return (boolean)cS.a("v", (Object)bO2, (Object)objectArray, (long)-354152089817842792L, (long)l);
    }

    public static Vector4f y(float f, float f10, float f11, float f12) {
        return new Vector4f(f, f10, f11, f12);
    }

    public static Color ee(bB bB2) {
        long l = a ^ 0x6CEB8FE24984L;
        return cS.a("v", (Object)bB2, (Object)new Object[0], (long)9048676190436581669L, (long)l);
    }

    public static boolean az(aW aW2) {
        long l = a ^ 0xB5526E35FFL;
        long l2 = l ^ 0x54E256448541L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (boolean)cS.a("v", (Object)aW2, (Object)objectArray, (long)137662640364260520L, (long)l);
    }

    public static aT E(double d, double d10, double d11) {
        return new aT(d, d10, d11);
    }

    public static boolean ax(aW aW2) {
        long l = a ^ 0x5D8796A9FEFL;
        long l2 = l ^ 0x518F7D402F51L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (boolean)cS.a("v", (Object)aW2, (Object)objectArray, (long)-6054783914461518152L, (long)l);
    }

    public static aW ay(class_1297 class_12972, y_0 y_02) {
        return new aW(class_12972, y_02);
    }

    public static bK dt(double d, double d10) {
        return new bK(d, d10);
    }

    public static boolean bi(bb_0 bb_02) {
        long l = a ^ 0x2B79DC96AC8DL;
        long l2 = l ^ 0x7F2ED8BC1C33L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (boolean)cS.a("v", (Object)bb_02, (Object)objectArray, (long)-7450298771348810278L, (long)l);
    }

    public static void bv() {
        long l = a ^ 0x618D7F5F8D9AL;
        long l2 = l ^ 0x568A59B40586L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        cS.a("\u00da", (Object)objectArray, (long)-5079530511042265856L, (long)l);
    }

    public static bN A(class_2248 class_22482) {
        return new bN(class_22482);
    }

    public static boolean dl(aL aL2) {
        long l = a ^ 0xF871FCC0F53L;
        long l2 = l ^ 0x5BD01BE6BFEDL;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (boolean)cS.a("v", (Object)aL2, (Object)objectArray, (long)4270850897403393540L, (long)l);
    }

    public static bx_0 ck() {
        return new bx_0();
    }

    public static boolean bo(bq_0 bq_02) {
        long l = a ^ 0x2206D1A7D69AL;
        long l2 = l ^ 0x7651D58D6624L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (boolean)cS.a("v", (Object)bq_02, (Object)objectArray, (long)-2122266612252217395L, (long)l);
    }

    public static a9 di() {
        return new a9();
    }

    public static List bp() {
        long l = a ^ 0x67D181D04B6BL;
        long l2 = l ^ 0x30DAEB91F205L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return cS.a("\u00da", (Object)objectArray, (long)9185857664106958263L, (long)l);
    }

    public static bs_0 cc(class_4587 class_45872, class_1306 class_13062, float f, float f10) {
        return new bs_0(class_45872, class_13062, f, f10);
    }

    public static be_0 dv(int n, int n2) {
        return new be_0(n, n2);
    }

    public static bh_0 Y(class_2596 class_25962) {
        return new bh_0(class_25962);
    }

    public static boolean X(bO bO2, Class clazz) {
        long l = a ^ 0x40DBCD2F6735L;
        long l2 = l ^ 0x4EAA0880A8L;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = clazz;
        return (boolean)cS.a("v", (Object)bO2, (Object)objectArray, (long)5991376977071526824L, (long)l);
    }

    public static a3 L(float f, float f10) {
        return new a3(f, f10);
    }

    public static boolean cw(aQ aQ2) {
        long l = a ^ 0x1A530E1FB10FL;
        long l2 = l ^ 0x4E040A3501B1L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (boolean)cS.a("v", (Object)aQ2, (Object)objectArray, (long)-8856036646128154536L, (long)l);
    }

    public static gz_0 bt() {
        long l = a ^ 0x7D626552420EL;
        return cS.a("\u00da", (long)8508084003895934004L, (long)l);
    }

    public static boolean ds(bO bO2, Class clazz) {
        long l = a ^ 0x2AAC4EEE32DL;
        long l2 = l ^ 0x423FA3C904B0L;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = clazz;
        return (boolean)cS.a("v", (Object)bO2, (Object)objectArray, (long)-2936936377015806032L, (long)l);
    }

    public static boolean dh(bv_0 bv_02) {
        long l = a ^ 0x2230C1A4FA30L;
        long l2 = l ^ 0x7667C58E4A8EL;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (boolean)cS.a("v", (Object)bv_02, (Object)objectArray, (long)-3592128725618277529L, (long)l);
    }

    public static a4 bc() {
        return new a4();
    }

    public static void br() {
        long l = a ^ 0x5F96539BB5E6L;
        long l2 = l ^ 0x689175703DFAL;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        cS.a("\u00da", (Object)objectArray, (long)-9079855040896367236L, (long)l);
    }

    public static bb_0 ei(class_1297 class_12972, class_2561 class_25612) {
        return new bb_0(class_12972, class_25612);
    }

    public static boolean ci(aV aV2) {
        long l = a ^ 0x5FDC81DF2AF5L;
        long l2 = l ^ 0xB8B85F59A4BL;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (boolean)cS.a("v", (Object)aV2, (Object)objectArray, (long)2225706311015732130L, (long)l);
    }

    public static aW aw(class_1297 class_12972, y_0 y_02) {
        return new aW(class_12972, y_02);
    }

    public static boolean am(bd_0 bd_02) {
        long l = a ^ 0x179E99EBBF0EL;
        long l2 = l ^ 0x43C99DC10FB0L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (boolean)cS.a("v", (Object)bd_02, (Object)objectArray, (long)-8423978314606803367L, (long)l);
    }

    public static bc_0 em(String string, String string2) {
        return new bc_0(string, string2);
    }

    public static bd_0 al(y_0 y_02, float f, float f10) {
        return new bd_0(y_02, f, f10);
    }

    public static boolean df(a6 a62) {
        long l = a ^ 0x3790A8E2586AL;
        long l2 = l ^ 0x63C7ACC8E8D4L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (boolean)cS.a("v", (Object)a62, (Object)objectArray, (long)7817162999949254973L, (long)l);
    }

    public static boolean et(bO bO2, Class clazz) {
        long l = a ^ 0x7885DD9D7379L;
        long l2 = l ^ 0x3810BABA94E4L;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = clazz;
        return (boolean)cS.a("v", (Object)bO2, (Object)objectArray, (long)5145817513874900964L, (long)l);
    }

    public static boolean cu(bO bO2, Class clazz) {
        long l = a ^ 0x65E29213964AL;
        long l2 = l ^ 0x2577F53471D7L;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = clazz;
        return (boolean)cS.a("v", (Object)bO2, (Object)objectArray, (long)-6747939646863203625L, (long)l);
    }

    public static aO dm() {
        return new aO();
    }

    public static dC an(dD dD2) {
        long l = a ^ 0x36759EDD4910L;
        long l2 = l ^ 0x4E82D300447DL;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return cS.a("v", (Object)dD2, (Object)objectArray, (long)9007821100572353573L, (long)l);
    }

    public static boolean ac(a5 a52) {
        long l = a ^ 0x25563E1317EAL;
        long l2 = l ^ 0x71013A39A754L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (boolean)cS.a("v", (Object)a52, (Object)objectArray, (long)2593007487321648829L, (long)l);
    }

    public static a_ cx(int n, int n2) {
        return new a_(n, n2);
    }

    public static boolean M(a3 a32) {
        long l = a ^ 0x4AF0B8D2F723L;
        long l2 = l ^ 0x1EA7BCF8479DL;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (boolean)cS.a("v", (Object)a32, (Object)objectArray, (long)-4380496979394965900L, (long)l);
    }

    public static C N(class_4184 class_41842) {
        return new C(class_41842);
    }

    public static float P(a3 a32) {
        long l = a ^ 0x65EA7D3FF0E1L;
        return (float)cS.a("v", (Object)a32, (Object)new Object[0], (long)-4251498274783966546L, (long)l);
    }

    public static boolean ec(bB bB2) {
        long l = a ^ 0x5C30E3B3179CL;
        long l2 = l ^ 0x867E799A722L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (boolean)cS.a("v", (Object)bB2, (Object)objectArray, (long)2560947250056146635L, (long)l);
    }

    public static boolean W(bg_0 bg_02) {
        long l = a ^ 0x31004FE0884FL;
        long l2 = l ^ 0x65574BCA38F1L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (boolean)cS.a("v", (Object)bg_02, (Object)objectArray, (long)-4874826895565278952L, (long)l);
    }

    public static double H(aT aT2) {
        long l = a ^ 0x39B759465632L;
        return (double)cS.a("v", (Object)aT2, (Object)new Object[0], (long)7074649494605816260L, (long)l);
    }

    public static boolean bq() {
        long l = a ^ 0x1AD8B0E39D54L;
        long l2 = l ^ 0x69F01CFFB5E6L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (boolean)cS.a("\u00da", (Object)objectArray, (long)-6249207369313385627L, (long)l);
    }

    public static aL dk() {
        return new aL();
    }

    public static de_0 do() {
        long l = a ^ 0x34A3FCA1BE2CL;
        return cS.a("\u00da", (Object)new Object[0], (long)-8488526853111116201L, (long)l);
    }

    public static boolean T(bN bN2) {
        long l = a ^ 0x6D81A0A857AFL;
        long l2 = l ^ 0x39D6A482E711L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (boolean)cS.a("v", (Object)bN2, (Object)objectArray, (long)7185913518938877688L, (long)l);
    }

    public static boolean R(bO bO2, Class clazz) {
        long l = a ^ 0x44DC833E778AL;
        long l2 = l ^ 0x449E4199017L;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = clazz;
        return (boolean)cS.a("v", (Object)bO2, (Object)objectArray, (long)4871383632970531607L, (long)l);
    }

    public static bi_0 dz() {
        return new bi_0();
    }

    public static a6 de() {
        return new a6();
    }

    public static boolean co(br_0 br_02) {
        long l = a ^ 0x54775A3C6D92L;
        long l2 = l ^ 0x205E16DD2CL;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (boolean)cS.a("v", (Object)br_02, (Object)objectArray, (long)6450359400989414597L, (long)l);
    }

    public static Color ed(bB bB2) {
        long l = a ^ 0x35F9C4D2CDA5L;
        return cS.a("v", (Object)bB2, (Object)new Object[0], (long)-454298276323039996L, (long)l);
    }

    public static Optional dq(class_1921 class_19212) {
        long l = a ^ 0x709FDC0F8991L;
        long l2 = l ^ 0x67F7AD62C951L;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = class_19212;
        return cS.a("\u00da", (Object)objectArray, (long)-4789983687598917702L, (long)l);
    }

    public static boolean bd(a4 a42) {
        long l = a ^ 0x4830E9ABD2E2L;
        long l2 = l ^ 0x1C67ED81625CL;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (boolean)cS.a("v", (Object)a42, (Object)objectArray, (long)-1804716444688782411L, (long)l);
    }

    public static void K(C c, double d, double d10, double d11) {
        long l = a ^ 0x3086EA62877BL;
        long l2 = l ^ 0x9879FE36868L;
        Object[] objectArray = new Object[4];
        objectArray[3] = l2;
        objectArray[2] = d11;
        objectArray[1] = d10;
        objectArray[0] = d;
        cS.a("v", (Object)c, (Object)objectArray, (long)-5513127352316165310L, (long)l);
    }

    public static void Q(C c, float f, float f10) {
        long l = a ^ 0x329019C07BBFL;
        long l2 = l ^ 0x147B15C0F1EFL;
        Object[] objectArray = new Object[3];
        objectArray[2] = l2;
        objectArray[1] = Float.valueOf(f10);
        objectArray[0] = Float.valueOf(f);
        cS.a("v", (Object)c, (Object)objectArray, (long)5734917817693477635L, (long)l);
    }

    public static bj_0 er() {
        return new bj_0();
    }

    public static Color ea(int n, int n2, int n3) {
        return new Color(n, n2, n3);
    }

    public static I by(class_11228 class_112282) {
        return new I(class_112282);
    }

    public static bM eu(long l) {
        return new bM(l);
    }

    public static boolean dA(bi_0 bi_02) {
        long l = a ^ 0x7D99F97B8790L;
        long l2 = l ^ 0x29CEFD51372EL;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (boolean)cS.a("v", (Object)bi_02, (Object)objectArray, (long)-5510595746135228729L, (long)l);
    }

    public static boolean bg(bO bO2, Class clazz) {
        long l = a ^ 0x1CAFFD11A443L;
        long l2 = l ^ 0x5C3A9A3643DEL;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = clazz;
        return (boolean)cS.a("v", (Object)bO2, (Object)objectArray, (long)-8046813326804283170L, (long)l);
    }

    public static boolean bl(bn_0 bn_02) {
        long l = a ^ 0x3D41DEEB5F72L;
        long l2 = l ^ 0x6916DAC1EFCCL;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (boolean)cS.a("v", (Object)bn_02, (Object)objectArray, (long)7738361211267606053L, (long)l);
    }

    public static boolean cX(bf_0 bf_02) {
        long l = a ^ 0x8FDD591CA41L;
        long l2 = l ^ 0x5CAAD1BB7AFFL;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (boolean)cS.a("v", (Object)bf_02, (Object)objectArray, (long)-119596930551581930L, (long)l);
    }

    public static boolean cy(a_ a_2) {
        long l = a ^ 0x747B22FC8629L;
        long l2 = l ^ 0x202C26D63697L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (boolean)cS.a("v", (Object)a_2, (Object)objectArray, (long)-5602645339890532482L, (long)l);
    }

    public static boolean dy(bO bO2, Class clazz) {
        long l = a ^ 0x46D39594F32AL;
        long l2 = l ^ 0x646F2B314B7L;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = clazz;
        return (boolean)cS.a("v", (Object)bO2, (Object)objectArray, (long)-4090777448324085833L, (long)l);
    }

    public static ba_0 cz(y_0 y_02) {
        return new ba_0(y_02);
    }

    public static class_3298 dx(class_2960 class_29602) {
        long l = a ^ 0x5A99E73A77B7L;
        return cS.a("\u00da", (Object)new Object[]{class_29602}, (long)4875364832273596496L, (long)l);
    }

    public static boolean aY(bO bO2, Class clazz) {
        long l = a ^ 0x4D523722F4A0L;
        long l2 = l ^ 0xDC75005133DL;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = clazz;
        return (boolean)cS.a("v", (Object)bO2, (Object)objectArray, (long)-4561961618476318659L, (long)l);
    }

    public static boolean aX(dH dH2) {
        long l = a ^ 0x2CE39E1AD414L;
        return (boolean)cS.a("v", (Object)dH2, (Object)new Object[0], (long)-2302985819291555134L, (long)l);
    }

    public static aX aZ(class_1297 class_12972, y_0 y_02) {
        return new aX(class_12972, y_02);
    }

    public static boolean aC(bf_0 bf_02) {
        long l = a ^ 0x6F4B29D39B73L;
        long l2 = l ^ 0x3B1C2DF92BCDL;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (boolean)cS.a("v", (Object)bf_02, (Object)objectArray, (long)-5808099189418319324L, (long)l);
    }

    public static class_243 aF(bf_0 bf_02) {
        long l = a ^ 0x5554F8FB2965L;
        return cS.a("v", (Object)bf_02, (Object)new Object[0], (long)2117630059325757260L, (long)l);
    }

    public static class_243 aE(bf_0 bf_02) {
        long l = a ^ 0x6FF51904C7B9L;
        return cS.a("v", (Object)bf_02, (Object)new Object[0], (long)-882863923845203568L, (long)l);
    }

    public static float aD(bf_0 bf_02) {
        long l = a ^ 0x6FD919AEF3E3L;
        return (float)cS.a("v", (Object)bf_02, (Object)new Object[0], (long)-4038572526349222746L, (long)l);
    }

    public static W bA(class_11278 class_112782) {
        return new W(class_112782);
    }

    public static Matrix4f bC() {
        return new Matrix4f();
    }

    public static Matrix4f bB(W w, float f, float f10) {
        long l = a ^ 0x15606FCFB69FL;
        long l2 = l ^ 0x2ADF9FA6DF12L;
        Object[] objectArray = new Object[3];
        objectArray[2] = l2;
        objectArray[1] = Float.valueOf(f10);
        objectArray[0] = Float.valueOf(f);
        return cS.a("v", (Object)w, (Object)objectArray, (long)-9039222213821610539L, (long)l);
    }

    public static aM dU() {
        return new aM();
    }

    public static boolean dd(bG bG2) {
        long l = a ^ 0x35BD24264259L;
        long l2 = l ^ 0x61EA200CF2E7L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (boolean)cS.a("v", (Object)bG2, (Object)objectArray, (long)8525074922371382030L, (long)l);
    }

    public static bq_0 bn(class_2561 class_25612, class_2561 class_25613, class_1297 class_12972) {
        return new bq_0(class_25612, class_25613, class_12972);
    }

    public static float ar(bd_0 bd_02) {
        long l = a ^ 0x6EDBDF9EF40DL;
        return (float)cS.a("v", (Object)bd_02, (Object)new Object[0], (long)-4604897985081674842L, (long)l);
    }

    public static boolean dX(aY aY2) {
        long l = a ^ 0x50363F72B0B3L;
        long l2 = l ^ 0x4613B58000DL;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (boolean)cS.a("v", (Object)aY2, (Object)objectArray, (long)-8888623581729289756L, (long)l);
    }

    public static Color dZ(int n, int n2, int n3) {
        return new Color(n, n2, n3);
    }

    public static boolean cm(bO bO2, Class clazz) {
        long l = a ^ 0x520369C7F92AL;
        long l2 = l ^ 0x12960EE01EB7L;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = clazz;
        return (boolean)cS.a("v", (Object)bO2, (Object)objectArray, (long)-3658410238875939401L, (long)l);
    }

    public static void bx(gz_0 gz_02) {
        long l = a ^ 0x7C75DED170E3L;
        cS.a("v", (Object)gz_02, (long)4970608411888603194L, (long)l);
    }

    public static class_11278 bz(I i) {
        long l = a ^ 0x19153EC4DC5DL;
        long l2 = l ^ 0x1359AF2EBA3FL;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return cS.a("v", (Object)i, (Object)objectArray, (long)-1708968319624378054L, (long)l);
    }

    public static boolean ah(bD bD2) {
        long l = a ^ 0x542ADF66C45DL;
        long l2 = l ^ 0x7DDB4C74E3L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (boolean)cS.a("v", (Object)bD2, (Object)objectArray, (long)-1131731791061058294L, (long)l);
    }

    public static boolean cg(bO bO2, Class clazz) {
        long l = a ^ 0x115AE5034648L;
        long l2 = l ^ 0x51CF8224A1D5L;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = clazz;
        return (boolean)cS.a("v", (Object)bO2, (Object)objectArray, (long)8239603923026014933L, (long)l);
    }

    public static Color eg(bB bB2) {
        long l = a ^ 0x45412F550179L;
        return cS.a("v", (Object)bB2, (Object)new Object[0], (long)3847340836487144315L, (long)l);
    }

    public static bB eb(Color color, Color color2) {
        return new bB(color, color2);
    }

    public static aK au(class_1297 class_12972) {
        return new aK(class_12972);
    }

    public static dC aA(dD dD2) {
        long l = a ^ 0x424EE02B7633L;
        return cS.a("v", (Object)dD2, (Object)new Object[0], (long)4766924448849893603L, (long)l);
    }

    public static bf_0 aB(float f, class_243 class_2432) {
        return new bf_0(f, class_2432);
    }

    public static float aq(bd_0 bd_02) {
        long l = a ^ 0x2B809076709BL;
        return (float)cS.a("v", (Object)bd_02, (Object)new Object[0], (long)4939749706717305602L, (long)l);
    }

    public static bD aj(y_0 y_02) {
        return new bD(y_02);
    }

    public static bD ag(y_0 y_02) {
        return new bD(y_02);
    }

    public static dC aQ(dD dD2) {
        long l = a ^ 0x1090621A397AL;
        return cS.a("v", (Object)dD2, (Object)new Object[0], (long)967946648458352554L, (long)l);
    }

    public static double aN(bL bL2) {
        long l = a ^ 0x388677768A87L;
        return (double)cS.a("v", (Object)bL2, (Object)new Object[0], (long)-4710766421353323152L, (long)l);
    }

    public static float aS(dC dC2) {
        long l = a ^ 0x7E3AC67D3645L;
        return (float)cS.a("v", (Object)dC2, (Object)new Object[0], (long)170416284988448282L, (long)l);
    }

    public static dC aT(dD dD2) {
        long l = a ^ 0x75E51184D13DL;
        return cS.a("v", (Object)dD2, (Object)new Object[0], (long)-1939721929906302780L, (long)l);
    }

    public static boolean aU(bO bO2, Class clazz) {
        long l = a ^ 0x3CA85316FB34L;
        long l2 = l ^ 0x7C3D34311CA9L;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = clazz;
        return (boolean)cS.a("v", (Object)bO2, (Object)objectArray, (long)-3520449390593126487L, (long)l);
    }

    public static float aR(dC dC2) {
        long l = a ^ 0x3F9397DE9C52L;
        return (float)cS.a("v", (Object)dC2, (Object)new Object[0], (long)-6320841303904299054L, (long)l);
    }

    public static boolean bf(bO bO2, Class clazz) {
        long l = a ^ 0x5FCE5EC2CA01L;
        long l2 = l ^ 0x1F5B39E52D9CL;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = clazz;
        return (boolean)cS.a("v", (Object)bO2, (Object)objectArray, (long)-139125018547126628L, (long)l);
    }

    public static aX aV(class_1297 class_12972, y_0 y_02) {
        return new aX(class_12972, y_02);
    }

    public static boolean aW(aX aX2) {
        long l = a ^ 0x4E52E9DF4DC0L;
        long l2 = l ^ 0x1A05EDF5FD7EL;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (boolean)cS.a("v", (Object)aX2, (Object)objectArray, (long)8779307424888681623L, (long)l);
    }

    public static class_2561 bj(bb_0 bb_02) {
        long l = a ^ 0x68C49FE76556L;
        return cS.a("v", (Object)bb_02, (Object)new Object[0], (long)5856582097335683081L, (long)l);
    }

    public static boolean aM(bL bL2) {
        long l = a ^ 0x12FED6524934L;
        long l2 = l ^ 0x46A9D278F98AL;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (boolean)cS.a("v", (Object)bL2, (Object)objectArray, (long)9016770755487952995L, (long)l);
    }

    public static void bu(List list) {
        long l = a ^ 0x4DC4BC2A6C54L;
        long l2 = l ^ 0x7FDD8ECFD951L;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = list;
        cS.a("\u00da", (Object)objectArray, (long)6361069299981153415L, (long)l);
    }

    public static void bE(gK gK2) {
        long l = a ^ 0x527BBA028EC2L;
        long l2 = l ^ 0x1E43037C5E60L;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = gK2;
        cS.a("\u00da", (Object)objectArray, (long)-4981797055471662763L, (long)l);
    }

    public static class_243 aG(double d, double d10, double d11) {
        return new class_243(d, d10, d11);
    }

    public static gK bD(Matrix4f matrix4f, Matrix4f matrix4f2, class_4184 class_41842) {
        return new gK(matrix4f, matrix4f2, class_41842);
    }

    public static bL aL(double d, double d10, double d11) {
        return new bL(d, d10, d11);
    }

    public static String bm(bn_0 bn_02) {
        long l = a ^ 0x2A15913A5EB8L;
        return cS.a("v", (Object)bn_02, (Object)new Object[0], (long)7685485370377566541L, (long)l);
    }

    public static void bF(gz_0 gz_02) {
        long l = a ^ 0x43EAAFF37B5L;
        cS.a("v", (Object)gz_02, (long)264971618833274732L, (long)l);
    }

    public static void bG(gz_0 gz_02) {
        long l = a ^ 0xA4BB478056AL;
        cS.a("v", (Object)gz_02, (long)3562998480519112115L, (long)l);
    }

    public static double aP(bL bL2) {
        long l = a ^ 0x133AF382B9BFL;
        return (double)cS.a("v", (Object)bL2, (Object)new Object[0], (long)-8240321163185546426L, (long)l);
    }

    public static boolean aJ(aR aR2) {
        long l = a ^ 0x179EDA72B39DL;
        long l2 = l ^ 0x43C9DE580323L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (boolean)cS.a("v", (Object)aR2, (Object)objectArray, (long)-8679839069517280566L, (long)l);
    }

    public static bb_0 bh(class_1297 class_12972, class_2561 class_25612) {
        return new bb_0(class_12972, class_25612);
    }

    public static bn_0 bk(class_1657 class_16572, String string) {
        return new bn_0(class_16572, string);
    }

    public static boolean bH() {
        long l = a ^ 0x6C9A4B11AE11L;
        long l2 = l ^ 0x1FB2E70D86A3L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (boolean)cS.a("\u00da", (Object)objectArray, (long)-7348980400688943072L, (long)l);
    }

    public static class_4587 bI() {
        return new class_4587();
    }

    public static class_238 aK(aR aR2) {
        long l = a ^ 0x76C76C3684B8L;
        return cS.a("v", (Object)aR2, (Object)new Object[0], (long)-5718162672696160941L, (long)l);
    }

    public static aR aI(class_1297 class_12972, class_238 class_2382) {
        return new aR(class_12972, class_2382);
    }

    public static double aO(bL bL2) {
        long l = a ^ 0x2638F58B2181L;
        return (double)cS.a("v", (Object)bL2, (Object)new Object[0], (long)1554457666390478347L, (long)l);
    }

    public static boolean aH(bO bO2, Class clazz) {
        long l = a ^ 0x5FD8C2BC04C8L;
        long l2 = l ^ 0x1F4DA59BE355L;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = clazz;
        return (boolean)cS.a("v", (Object)bO2, (Object)objectArray, (long)3519768300825227349L, (long)l);
    }

    public static boolean cS(bO bO2, Class clazz) {
        long l = a ^ 0x4BFC07171909L;
        long l2 = l ^ 0xB696030FE94L;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = clazz;
        return (boolean)cS.a("v", (Object)bO2, (Object)objectArray, (long)3249820721017597332L, (long)l);
    }

    public static boolean cD(bY bY2) {
        long l = a ^ 0x5844C315608BL;
        long l2 = l ^ 0x5745EC3DBD2EL;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (boolean)cS.a("v", (Object)bY2, (Object)objectArray, (long)6093842396800119846L, (long)l);
    }

    public static boolean cC(ba_0 ba_02) {
        long l = a ^ 0x63BAFC651650L;
        long l2 = l ^ 0x37EDF84FA6EEL;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (boolean)cS.a("v", (Object)ba_02, (Object)objectArray, (long)2469785134405660423L, (long)l);
    }

    public static bf_0 cW(float f) {
        return new bf_0(f);
    }

    public static H bQ(class_757 class_7572) {
        return new H(class_7572);
    }

    public static ba_0 cB(y_0 y_02) {
        return new ba_0(y_02);
    }

    public static boolean cF(bY bY2) {
        long l = a ^ 0x49A137765718L;
        long l2 = l ^ 0x58E8105574A6L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (boolean)cS.a("v", (Object)bY2, (Object)objectArray, (long)7135203693451154314L, (long)l);
    }

    public static boolean cP(bO bO2, Class clazz) {
        long l = a ^ 0x5EC2363793F5L;
        long l2 = l ^ 0x1E5751107468L;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = clazz;
        return (boolean)cS.a("v", (Object)bO2, (Object)objectArray, (long)-6348461923916994712L, (long)l);
    }

    public static float bW(bk_0 bk_02) {
        long l = a ^ 0x60CDA39A57B7L;
        return (float)cS.a("v", (Object)bk_02, (Object)new Object[0], (long)7180299290785350098L, (long)l);
    }

    public static boolean cL(bI bI2) {
        long l = a ^ 0x4259D746F154L;
        long l2 = l ^ 0x160ED36C41EAL;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (boolean)cS.a("v", (Object)bI2, (Object)objectArray, (long)-4232730962122127357L, (long)l);
    }

    public static bE cQ(int n) {
        return new bE(n);
    }

    public static boolean dj(a9 a92) {
        long l = a ^ 0x758E6662E855L;
        long l2 = l ^ 0x21D9624858EBL;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (boolean)cS.a("v", (Object)a92, (Object)objectArray, (long)-2575102093412151038L, (long)l);
    }

    public static int bP(a1 a12) {
        long l = a ^ 0x4DE4AB23B657L;
        return (int)cS.a("v", (Object)a12, (Object)new Object[0], (long)-9059522271949896922L, (long)l);
    }

    public static boolean cq(a0 a02) {
        long l = a ^ 0x27467EBB1AE6L;
        long l2 = l ^ 0x73117A91AA58L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (boolean)cS.a("v", (Object)a02, (Object)objectArray, (long)3382261053190841265L, (long)l);
    }

    public static bv_0 dg(class_1041 class_10412) {
        return new bv_0(class_10412);
    }

    public static class_4588 dr(class_4588 class_45882, int n) {
        long l = a ^ 0x6377E7DEE617L;
        long l2 = l ^ 0x75E7631CE609L;
        Object[] objectArray = new Object[3];
        objectArray[2] = l2;
        objectArray[1] = n;
        objectArray[0] = class_45882;
        return cS.a("\u00da", (Object)objectArray, (long)-3312065866844937904L, (long)l);
    }

    public static a1 bN(int n) {
        return new a1(n);
    }

    public static boolean cI(a4 a42) {
        long l = a ^ 0x5F9D6C8016AFL;
        long l2 = l ^ 0xBCA68AAA611L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (boolean)cS.a("v", (Object)a42, (Object)objectArray, (long)2502115013505789944L, (long)l);
    }

    public static a4 cH() {
        return new a4();
    }

    public static class_10185 cE(boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6, boolean bl7) {
        return new class_10185(bl, bl2, bl3, bl4, bl5, bl6, bl7);
    }

    public static bk_0 bU(float f) {
        return new bk_0(f);
    }

    public static void bZ(K k, int n) {
        long l = a ^ 0x5F949B597591L;
        long l2 = l ^ 0x4974D667091DL;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = n;
        cS.a("v", (Object)k, (Object)objectArray, (long)4720831573738923072L, (long)l);
    }

    public static boolean cA(ba_0 ba_02) {
        long l = a ^ 0x6E7FB68A04DDL;
        long l2 = l ^ 0x3A28B2A0B463L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (boolean)cS.a("v", (Object)ba_02, (Object)objectArray, (long)3516042179646930314L, (long)l);
    }

    public static boolean bL(bH bH2) {
        long l = a ^ 0x117B1B899345L;
        long l2 = l ^ 0x452C1FA323FBL;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (boolean)cS.a("v", (Object)bH2, (Object)objectArray, (long)-6389760425333446126L, (long)l);
    }

    public static bH bK() {
        return new bH();
    }

    public static boolean cR(bE bE2) {
        long l = a ^ 0x30583900066CL;
        long l2 = l ^ 0x640F3D2AB6D2L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (boolean)cS.a("v", (Object)bE2, (Object)objectArray, (long)3637258803095748411L, (long)l);
    }

    public static boolean bS(bO bO2, Class clazz) {
        long l = a ^ 0x437C882CC25AL;
        long l2 = l ^ 0x3E9EF0B25C7L;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = clazz;
        return (boolean)cS.a("v", (Object)bO2, (Object)objectArray, (long)-699564021030914361L, (long)l);
    }

    public static boolean cG(bO bO2, Class clazz) {
        long l = a ^ 0x66EB70F8FDA5L;
        long l2 = l ^ 0x267E17DF1A38L;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = clazz;
        return (boolean)cS.a("v", (Object)bO2, (Object)objectArray, (long)-3912075920972003016L, (long)l);
    }

    public static boolean cU(by_0 by_02) {
        long l = a ^ 0x7E2DEE4681C3L;
        long l2 = l ^ 0x2A7AEA6C317DL;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (boolean)cS.a("v", (Object)by_02, (Object)objectArray, (long)-5344244532795295596L, (long)l);
    }

    public static boolean bO(a1 a12) {
        long l = a ^ 0x4C1E511536B4L;
        long l2 = l ^ 0x1849553F860AL;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (boolean)cS.a("v", (Object)a12, (Object)objectArray, (long)189819524927328227L, (long)l);
    }

    public static by_0 cT(class_1309 class_13092) {
        return new by_0(class_13092);
    }

    public static dC cV(dD dD2) {
        long l = a ^ 0x403399CB419CL;
        return cS.a("v", (Object)dD2, (Object)new Object[0], (long)8469167511147032396L, (long)l);
    }

    public static dC cM(dD dD2) {
        long l = a ^ 0x70BE0A690AB6L;
        return cS.a("v", (Object)dD2, (Object)new Object[0], (long)4513370399979922534L, (long)l);
    }

    public static bI cK(y_0 y_02, float f, float f10) {
        return new bI(y_02, f, f10);
    }

    public static boolean cO(bI bI2) {
        long l = a ^ 0x6BA5708446L;
        long l2 = l ^ 0x543CA15A34F8L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (boolean)cS.a("v", (Object)bI2, (Object)objectArray, (long)-5742067878817972975L, (long)l);
    }

    public static float cY(bf_0 bf_02) {
        long l = a ^ 0x4A99696F1792L;
        return (float)cS.a("v", (Object)bf_02, (Object)new Object[0], (long)2559521160782715095L, (long)l);
    }

    public static boolean cZ(class_583 class_5832) {
        long l = a ^ 0x4FC4B151502CL;
        long l2 = l ^ 0x124F485597EBL;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = class_5832;
        return (boolean)cS.a("\u00da", (Object)objectArray, (long)7219433703187866840L, (long)l);
    }

    public static boolean bV(bk_0 bk_02) {
        long l = a ^ 0xF76B2D0A334L;
        long l2 = l ^ 0x5B21B6FA138AL;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (boolean)cS.a("v", (Object)bk_02, (Object)objectArray, (long)-7556445670563931549L, (long)l);
    }

    public static dC cJ(dD dD2) {
        long l = a ^ 0x1717AAD8E02AL;
        return cS.a("v", (Object)dD2, (Object)new Object[0], (long)-3152851933838897414L, (long)l);
    }

    public static float bT() {
        long l = a ^ 0x534B7DC8019FL;
        long l2 = l ^ 0x79696B80C32FL;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (float)cS.a("\u00da", (Object)objectArray, (long)3858612177570174223L, (long)l);
    }

    public static Predicate bX() {
        long l = a ^ 0x49674CFD1EE7L;
        return cS.a("\u00da", (Object)new Object[0], (long)3095914371538314972L, (long)l);
    }

    public static boolean bJ(bO bO2, Class clazz) {
        long l = a ^ 0x56A87816A5FDL;
        long l2 = l ^ 0x163D1F314260L;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = clazz;
        return (boolean)cS.a("v", (Object)bO2, (Object)objectArray, (long)-7931485532789108384L, (long)l);
    }

    public static bI cN(y_0 y_02, float f, float f10) {
        return new bI(y_02, f, f10);
    }

    public static boolean bM(bO bO2, Class clazz) {
        long l = a ^ 0x7C005241B7ACL;
        long l2 = l ^ 0x3C9535665031L;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = clazz;
        return (boolean)cS.a("v", (Object)bO2, (Object)objectArray, (long)-8954113431336418511L, (long)l);
    }

    public static class_4603 bR(H h) {
        long l = a ^ 0x2D309A30333DL;
        long l2 = l ^ 0x77C17DDC9F53L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return cS.a("v", (Object)h, (Object)objectArray, (long)516024172393938379L, (long)l);
    }

    public static K bY(Object object) {
        return new K(object);
    }

    public static C G(class_4184 class_41842) {
        return new C(class_41842);
    }

    public static boolean dC(bu_0 bu_02) {
        long l = a ^ 0x17DB3AD43EF5L;
        long l2 = l ^ 0x438C3EFE8E4BL;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (boolean)cS.a("v", (Object)bu_02, (Object)objectArray, (long)784475292381677474L, (long)l);
    }

    public static boolean dG(bA bA2) {
        long l = a ^ 0x27F95901743L;
        long l2 = l ^ 0x562891BAA7FDL;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (boolean)cS.a("v", (Object)bA2, (Object)objectArray, (long)2545960663201558036L, (long)l);
    }

    public static class_8685 dH(bA bA2) {
        long l = a ^ 0x230132391805L;
        return cS.a("v", (Object)bA2, (Object)new Object[0], (long)3175803871023554833L, (long)l);
    }

    public static class_3298 dI(class_2960 class_29602) {
        long l = a ^ 0x3B11EB90D0C0L;
        return cS.a("\u00da", (Object)new Object[]{class_29602}, (long)-1954659046863460569L, (long)l);
    }

    public static boolean dD(bO bO2, Class clazz) {
        long l = a ^ 0x1675D1920124L;
        long l2 = l ^ 0x56E0B6B5E6B9L;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = clazz;
        return (boolean)cS.a("v", (Object)bO2, (Object)objectArray, (long)3833956587151570361L, (long)l);
    }

    public static bu_0 dB() {
        return new bu_0();
    }

    public static boolean du(bK bK2) {
        long l = a ^ 0x69F15E7012ABL;
        long l2 = l ^ 0x3DA65A5AA215L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (boolean)cS.a("v", (Object)bK2, (Object)objectArray, (long)2791521712726813692L, (long)l);
    }

    public static String dE(GameProfile gameProfile) {
        long l = a ^ 0x716C36380E0DL;
        long l2 = l ^ 0x48967851D73BL;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = gameProfile;
        return cS.a("\u00da", (Object)objectArray, (long)4185150177728727863L, (long)l);
    }

    public static bA dF(class_8685 class_86852, String string) {
        return new bA(class_86852, string);
    }

    public static class_3298 dK(String string) {
        long l = a ^ 0x53F7280C494EL;
        return cS.a("\u00da", (Object)new Object[]{string}, (long)9033485281968770276L, (long)l);
    }

    public static class_3298 dL(String string) {
        long l = a ^ 0x7E0E7C62BCE3L;
        return cS.a("\u00da", (Object)new Object[]{string}, (long)-8579270454641346231L, (long)l);
    }

    public static boolean eB() {
        long l = a ^ 0x7DF79B819D5FL;
        long l2 = l ^ 0x25B7EFD48062L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (boolean)cS.a("\u00da", (Object)objectArray, (long)-6246684356690006165L, (long)l);
    }

    public static boolean ez(aP aP2) {
        long l = a ^ 0x291B4024B282L;
        long l2 = l ^ 0x7D4C440E023CL;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (boolean)cS.a("v", (Object)aP2, (Object)objectArray, (long)-8749303445622912043L, (long)l);
    }

    public static boolean eC() {
        long l = a ^ 0x38163F6EEF84L;
        long l2 = l ^ 0x4B3E9372C736L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (boolean)cS.a("\u00da", (Object)objectArray, (long)-2623775801054596683L, (long)l);
    }

    public static gK eI(Matrix4f matrix4f, Matrix4f matrix4f2, class_4184 class_41842) {
        return new gK(matrix4f, matrix4f2, class_41842);
    }

    public static aP ey(class_2338 class_23382, class_2680 class_26802) {
        return new aP(class_23382, class_26802);
    }

    public static Color ef(bB bB2) {
        long l = a ^ 0x7176E8F14C43L;
        return cS.a("v", (Object)bB2, (Object)new Object[0], (long)8673568035968118337L, (long)l);
    }

    public static bJ eN(class_4604 class_46042) {
        return new bJ(class_46042);
    }

    public static void eG(gz_0 gz_02) {
        long l = a ^ 0x1386125F8B66L;
        cS.a("v", (Object)gz_02, (long)-4648196469575210049L, (long)l);
    }

    public static boolean eR(bw_0 bw_02) {
        long l = a ^ 0x5EED1FA58880L;
        long l2 = l ^ 0xABA1B8F383EL;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (boolean)cS.a("v", (Object)bw_02, (Object)objectArray, (long)-4857610307905080873L, (long)l);
    }

    public static boolean dT(aM aM2) {
        long l = a ^ 0x118E5D247C59L;
        long l2 = l ^ 0x45D9590ECCE7L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (boolean)cS.a("v", (Object)aM2, (Object)objectArray, (long)5210385811388450062L, (long)l);
    }

    public static aY dW(float f, double d, double d10, double d11) {
        return new aY(f, d, d10, d11);
    }

    public static gz_0 eE() {
        long l = a ^ 0x5CA8B45AC12BL;
        return cS.a("\u00da", (long)-776896670319313135L, (long)l);
    }

    public static boolean dV(aM aM2) {
        long l = a ^ 0x440B790CB1F1L;
        long l2 = l ^ 0x105C7D26014FL;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (boolean)cS.a("v", (Object)aM2, (Object)objectArray, (long)-8797966800430856026L, (long)l);
    }

    public static List eA() {
        long l = a ^ 0x447C317ECA86L;
        long l2 = l ^ 0x13775B3F73E8L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return cS.a("\u00da", (Object)objectArray, (long)-101441708309640102L, (long)l);
    }

    public static class_3298 dM(String string) {
        long l = a ^ 0x3336AADDB8CL;
        return cS.a("\u00da", (Object)new Object[]{string}, (long)-1180167656652251610L, (long)l);
    }

    public static Matrix4f eH(Matrix4fc matrix4fc) {
        return new Matrix4f(matrix4fc);
    }

    public static class_3298 dJ(String string) {
        long l = a ^ 0x46E828509836L;
        return cS.a("\u00da", (Object)new Object[]{string}, (long)-6042293446794076772L, (long)l);
    }

    public static void eJ(gK gK2) {
        long l = a ^ 0x12552BBE8FD8L;
        long l2 = l ^ 0x12AF9FCC00D9L;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = gK2;
        cS.a("\u00da", (Object)objectArray, (long)-4917438817103246438L, (long)l);
    }

    public static String ep(bc_0 bc_02) {
        long l = a ^ 0x7A17E0B3454BL;
        return cS.a("v", (Object)bc_02, (Object)new Object[0], (long)8165587029124225593L, (long)l);
    }

    public static long ew(bM bM2) {
        long l = a ^ 0x70A7B76DA4ABL;
        return (long)cS.a("v", (Object)bM2, (Object)new Object[0], (long)-8016576484719473922L, (long)l);
    }

    public static boolean eP(bO bO2, Class clazz) {
        long l = a ^ 0x21FCF0E45368L;
        long l2 = l ^ 0x616997C3B4F5L;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = clazz;
        return (boolean)cS.a("v", (Object)bO2, (Object)objectArray, (long)7455925489677789173L, (long)l);
    }

    public static class_3298 dR(String string) {
        long l = a ^ 0x55A36B715665L;
        return cS.a("\u00da", (Object)new Object[]{string}, (long)7094969678179259343L, (long)l);
    }

    public static class_3298 dN(String string) {
        long l = a ^ 0x66B36ACD177BL;
        return cS.a("\u00da", (Object)new Object[]{string}, (long)2551384042749989585L, (long)l);
    }

    public static class_3298 dO(String string) {
        long l = a ^ 0x6CB497015EAEL;
        return cS.a("\u00da", (Object)new Object[]{string}, (long)7691405181929052932L, (long)l);
    }

    public static aM dS() {
        return new aM();
    }

    public static void eL(gz_0 gz_02) {
        long l = a ^ 0x2D5EED20D57AL;
        cS.a("v", (Object)gz_02, (long)-2206069850155911773L, (long)l);
    }

    public static bw_0 eQ() {
        return new bw_0();
    }

    public static String eo(bc_0 bc_02) {
        long l = a ^ 0x420C94EF06CCL;
        return cS.a("v", (Object)bc_02, (Object)new Object[0], (long)3662429528559321246L, (long)l);
    }

    public static void eK(gz_0 gz_02) {
        long l = a ^ 0x5EF1032C8FAFL;
        cS.a("v", (Object)gz_02, (long)-4920459089042100362L, (long)l);
    }

    public static void eF(List list) {
        long l = a ^ 0x6213D3CB92DEL;
        long l2 = l ^ 0x500AE12E27DBL;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = list;
        cS.a("\u00da", (Object)objectArray, (long)-6427444791605917171L, (long)l);
    }

    public static boolean ej(bb_0 bb_02) {
        long l = a ^ 0x676514080C69L;
        long l2 = l ^ 0x33321022BCD7L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (boolean)cS.a("v", (Object)bb_02, (Object)objectArray, (long)4071100824878003518L, (long)l);
    }

    public static boolean dY(bO bO2, Class clazz) {
        long l = a ^ 0x147F637ED520L;
        long l2 = l ^ 0x54EA045932BDL;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = clazz;
        return (boolean)cS.a("v", (Object)bO2, (Object)objectArray, (long)-2220009387574107715L, (long)l);
    }

    public static boolean eM(bO bO2, Class clazz) {
        long l = a ^ 0x2B0D1638EA32L;
        long l2 = l ^ 0x6B98711F0DAFL;
        Object[] objectArray = new Object[2];
        objectArray[1] = l2;
        objectArray[0] = clazz;
        return (boolean)cS.a("v", (Object)bO2, (Object)objectArray, (long)-2440161225844531537L, (long)l);
    }

    public static boolean eO(bJ bJ2) {
        long l = a ^ 0x36C425FC7B34L;
        long l2 = l ^ 0x629321D6CB8AL;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        return (boolean)cS.a("v", (Object)bJ2, (Object)objectArray, (long)5702160761717211747L, (long)l);
    }

    public static void eD() {
        long l = a ^ 0x47A06CE52CEFL;
        long l2 = l ^ 0x718C659849A0L;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        cS.a("\u00da", (Object)objectArray, (long)1799174440063837839L, (long)l);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(cS.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


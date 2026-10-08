/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_304
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.N;
import dev.zprestige.prestige.bG;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.dL;
import dev.zprestige.prestige.dM;
import dev.zprestige.prestige.dV;
import dev.zprestige.prestige.hc;
import dev.zprestige.prestige.q_0;
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
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_304;

public class e1
extends dV {
    private dL f;
    private dM d;
    private boolean i = 0;
    private int a = -1;
    private int c = -1;
    private int e = -1;
    private static final long k;
    private static final long[] l;
    private static final Integer[] m;
    private static final Map n;
    private static final Object[] o;
    private static final String[] p;

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                e1.k = hc.a(5156813831293306342L, 8709450173787657746L, MethodHandles.lookup().lookupClass()).a(180877868874866L);
                e1.o = new Object[82];
                e1.p = new String[82];
                e1.f();
                e1.n = new HashMap<K, V>(13);
                var0 = e1.k ^ 33457169895572L;
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
                var8_3 = new long[4];
                var5_4 = 0;
                var6_5 = "\u00b5\u007f!\u00989D\u00d9u\u0016\u00cdA\u00e8\u0019\f\u00aeV";
                var7_6 = "\u00b5\u007f!\u00989D\u00d9u\u0016\u00cdA\u00e8\u0019\f\u00aeV".length();
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
                    var6_5 = "\u001c<K6\u00d9D\u00ce\u00fe\u00e1\u008cI\u00c5\u009d\u00fb\u0018\b";
                    var7_6 = "\u001c<K6\u00d9D\u00ce\u00fe\u00e1\u008cI\u00c5\u009d\u00fb\u0018\b".length();
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
        e1.l = var8_3;
        e1.m = new Integer[4];
    }

    @Override
    public void e(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x3EC103724ECEL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        e1.c("b", (Object)this, (Object)objectArray2, (long)3996610184243862500L, (long)l);
        e1.c("b", (Object)this, (Object)new Object[0], (long)3993542473161134084L, (long)l);
        this.i = 0;
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = e1.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/e1" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6A09;
        if (m[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = e1.l[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])e1.n.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    e1.n.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/e1", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            e1.m[n2] = n3;
        }
        return m[n2];
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/e1" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = e1.m(l, l2);
            object = o[n];
            try {
                if (!(object instanceof String)) break block2;
                e1.o[n] = clazz = Class.forName(p[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = e1.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = e1.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = e1.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = e1.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = o;
        o[0] = "m[m\u0019\u0005h{[hC\u0016\u007fl\u0010kE\u001ak}W|RQyA";
        objectArray[1] = "3XDp$UFxO\u007f5\u001a;`\\x<SS";
        objectArray[2] = "$bXy\f~2b]#\u001fi%)^%\u0013}4nI2Xm2";
        objectArray[3] = "`\u0014t\u0000G`\u00154\u007f\u000fV/t:t\u0004Ru\u0000";
        objectArray[4] = Boolean.TYPE;
        e1.p[4] = "java/lang/Boolean";
        objectArray[5] = "mee}\u00007\u0018Enr\u0011xyKey\u0015\"\r";
        objectArray[6] = Void.TYPE;
        e1.p[6] = "java/lang/Void";
        objectArray[7] = ",?\"OE;:?'\u0015V,-t$\u0013Z8<33\u0004\u0011.y";
        objectArray[8] = "Y8zz\u0016PR7k5u]G:d^@_V)xrWR";
        objectArray[9] = "\n@Z_PF\u007f`QPA\t\u001enZ[ESj";
        objectArray[10] = "\u007fhP\u001d}3z}[\u001dv(vm\u0019t]\u0002G";
        objectArray[11] = Long.TYPE;
        e1.p[11] = "java/lang/Long";
        objectArray[12] = Integer.TYPE;
        e1.p[12] = "java/lang/Integer";
        objectArray[13] = "vJX\u0001x\fvJO]t\u0003l\u0001OCt\u0016kp\u001f\u001e%";
        objectArray[14] = "4A\u001d\u0001OT4A\n]C[.\n\nCCN){X\u001f\u0016\f";
        objectArray[15] = "0+qD23&+t\u001e!$1`w\u0018-0 '`\u000ff\r";
        objectArray[16] = " T<RfpUt7]w?4z<Vse@";
        objectArray[17] = "2PT\u0017*[2PCK&T(\u001bCU&A/j\u0013\u000fp\u0007xVLX4A\u0003\u0006\u0010\u000f";
        objectArray[18] = "j@n\u0012vfj@yNzip\u000byPz|wz)\r.";
        objectArray[19] = "gDLac\u0013gD[=o\u001c}\u000f[#o\tz~\u000b\u007f:";
        objectArray[20] = "@?D\u0013*]^7^\\WM^";
        objectArray[21] = "lX .8MgW1aYCl\\5;";
        objectArray[22] = "]W\"[?z]W5\u00073uG\u001c5\u00193`@maAd";
        objectArray[23] = "\u0019V\u0012G;K\u0019V\u0005\u001b7D\u0003\u001d\u0005\u00057Q\u0004lW^o\u001b";
        objectArray[24] = " \u0000\u000bN{d \u0000\u001c\u0012wk:K\u001c\fw~=:NW/?";
        objectArray[25] = "C_gT\"-U_b\u000e1:B\u0014a\b=.SSv\u001fv>H";
        objectArray[26] = "\u0015Ago\u0000\b`al`\u0011G\u0001ogk\u0015\u001du";
        objectArray[27] = "X\u001d0l{/X\u001d'0w BV'.w5E'uz&t";
        objectArray[28] = "btkU6Y\u0017T`Z'\u0016vZkQ#L\u0002";
        objectArray[29] = "3}y}[j8rh27i6pj}\u001b";
        objectArray[30] = "X A87kX Vd;dBkVz;qE\u001a\u0004 l3";
        objectArray[31] = "I\u00192Vi\u001c<99YxS]72R|\t)";
        objectArray[32] = "n\u0017t=>hx\u0017qg-\u007fo\\ra!k~\u001bevj|A";
        objectArray[33] = "X\u0005I3t(N\u0005Lig?YNOok+H\tXx ;P\tZszvl\u0012Znz1[\u0005";
        objectArray[34] = "7l\"d\u0011|!l'>\u0002k6'$8\u000e\u007f'`3/En\n";
        objectArray[35] = "\u00073\u001c\u001c_{\u00073\u000b@St\u001dx\u000b^Sa\u001a\t^\u0001\n";
        objectArray[36] = "\u0019d\nF\u0017\n\u0019d\u001d\u001a\u001b\u0005\u0003/\u001d\u0004\u001b\u0010\u0004^J[M";
        objectArray[37] = "\u007f\u0002 d0m\n\"+k!\"k, `%x\u001f";
        objectArray[38] = "\u001fJ\nz\u0011\"\u0014E\u001b5v \u0001N\u001b~M";
        objectArray[39] = "^4\u001ab>8+\u0014\u0011m/wJ\u001a\u001af+->";
        objectArray[40] = "/\u001e\u0005=Z@Z>\u000e2K\u000f;0\u00059OUO";
        objectArray[41] = "Z'ep\u0018<L'`*\u000b+[lc,\u0007?J+t;L(r";
        objectArray[42] = "ru,\"\fG\u0007U'-\u001d\bf[,&\u0019R\u0012";
        objectArray[43] = "\u0001\u0010l#(\"t0g,9m\u0015>l'=7a";
        objectArray[44] = "\u0010\r\u001aL\nhJS\u0014Hg;K\f\u0000|\n(j\u0005\u0002H\n\u001eR\u001e\u0003T\u0001T\u0010\u001e\u000eY\b=QY\u001fHgdN\u0002EY\u000b+V\bD3W5OX\u0015_\u0018-EY\u007f";
        objectArray[45] = "WB\u0003\u0006R;\u000b\nK\u0017,%\u000b\u000fY\u0013@\u0017\\I\u0007D\u0017@\u000fBSEB$\u001f\u0019WE,";
        objectArray[46] = "\u0003\u000eI}{\u0019S_\u0005\u001ar#P[\u0012beC\u0004\\\u000ek\u0018";
        objectArray[47] = "\u007fV2VCJo\r6V-K{\u001b8\u0000Ay*[i_-\u0011j\u00162\bDP-\u0007#g";
        objectArray[48] = "s8c!dD/p+0\u001aQ#d=?M\u0006}3eStA(m;?'M>n";
        objectArray[49] = "<?\u0003k\u0007Hc6O}|ZZ5BiL@?mCo\u0001";
        objectArray[50] = "+7\u0018/S\nt.J!:\t\u00127Hw[\bpvI0Bg)p\u0017 WYi{K&:";
        objectArray[51] = "nM\u001bvW\u00112\u0005Sg)\u0004>\u0011Eh~SaL\u001e\u0004N\ngA[5S\u000e'\u000e";
        objectArray[52] = "]e.\u0015\u0006\u0019\u000ei8\u0016d\u0010^g$\u0016\b\"\u000e+|LdN\ty(\u001cZ\u000e\u0002%.q";
        objectArray[53] = "[\u001a&\u0016jlTY:\u0019\u001brY[;\u0010w@\u000b\u0016cF\u001bxSM+\u001d~}K\u001c'w";
        objectArray[54] = "v?hQ-&*w @S3&c6O\u0004dx3o#+ezh?Bj9||";
        objectArray[55] = "Cu5\u0006CF\u0010y#\u0005!O@w?\u0005M}\u00133c]!E\u0010v>\u0013ZJSj1b";
        objectArray[56] = "]\u0014*sz\u0010[L*j\u0005H`\tg(dE\u0002Hfo}*\\\rjyn\u0011\u001fJ%-\u0005";
        objectArray[57] = "n\u000ej\u000fKshVj\u00164 SP$\u0017_//U{\u000eYImPb\u0004R5h\u000f{\u00024";
        objectArray[58] = "\u001d-\u0010OzQN!\u0006L\u0018X\u001e/\u001aLtjHjG\u0017(=\u0017>\u0005Re\f\u0015h\u0010E\u0018";
        objectArray[59] = "\n\u0016\u0001I=o\fN\u0001PB17\u000bL\u0012#:UJMU:U\u000b\u000fAC)nHH\u000e\u0017B";
        objectArray[60] = "|[L\u0007eC~J\u001cPZ_\u007f1\u0011L7GsI\u0011Ya\u0000\u0011\\\u0007Z%Zi\\\u0012\fb8|[L\u0007eC~J\u001cPZ";
        objectArray[61] = "\u001eXP\u0002T\\B\u0010\u0018\u0013*IN\u0004\u000e\u001c}\u001e\u0011XRpAAI\u001b\u0013\u0013\u0017EA\u001b";
        objectArray[62] = "\u0010;^\r-\u0015\u0011nEIJF\u0013=^]\u001d\u0018Hm\u00071%O\u0018 PT WI,";
        objectArray[63] = "3az\u000f9LegyHXIZgy\u000b9O8&xL  1&#B8\u001cjh/\fX";
        objectArray[64] = "dr\u0013_\u0006h>,\u001d[k;?s\to\u0006(\u0018p\u0007 T(*w\u0019I\u0015o;fv\u0010\n4aw\u001a_\u0012>`\u001dFA\u000bn1q\tY\u0001o[";
        objectArray[65] = "\u001dH?l{\u001dKL7l\u0002\u0010\u0017C=rUGG\u0016e\u001en@\u0011N=/lGGW";
        objectArray[66] = "5\u000e!4\u001d5+\u0000a)oh*\u001d\u0002=\u000bt!al5\u000f3&\r#-\u00052L";
        objectArray[67] = "\u001dDAr[#\u001e\u001fM!!/\u0019G[tH# I[dLEE\u001a]uL{\u0005\u0011\u0001s!";
        objectArray[68] = "8JTrk(gS\u0006|\u0002,\u0001J\u0004*c*c\u000b\u0005mzE=N\t{i~~\tF/\u0002";
        objectArray[69] = "\u0016 9\"gJE,/!\u0005C\u0015\"3!iqFflw\u0005IE#27~F\u0006?=F";
        objectArray[70] = "d\u0005=x@ab]=a?7Y\u0018p#^4;YqdG[b_/tRe\"Tsr?";
        objectArray[71] = "!}\u0013,rV#+\u0006;\u000f\u0002(l\f2c0x,We\u000fW$pV?c\u0018<zWU`Z8q\u001d.o\u0019$~l";
        objectArray[72] = "#GIT.\u0010|^\u001bZG\u0014\u001aG\u0019\f&\u0012x\u0006\u0018K?}*[D\r-\u0011eCN\fG";
        objectArray[73] = "xD\u0004Aq\u0002mX\u001a\u0018\u000b\n\u001dJ\u0006\u0013t\u0001eJ\u0013E3c";
        objectArray[74] = "a)\u000b\u001fu79(\rR\u0012;\u0006hZ\u0014s=d)[SjR=/\u0005C\u007fl}$YE\u0012";
        objectArray[75] = "~M\u001a-!5b\u0019\u0014}P>\u001e^\u0016y1<|\u001f\u0017>(S%\u0019I.=me\u0012\u0015(P";
        objectArray[76] = "\u0012E{xe\u0001\rT$b\u001d\u0000i\u001d%fq\u0007W].:wj";
        objectArray[77] = ";SZ=Qn=\u000bZ$.7\u0006N\u0017fO;d\u000f\u0016!VT:J\u001a7Eoy\rUc.";
        objectArray[78] = "\r7?\u0006V~\u000f0i\u001f2*\fu8\u0001^\u0018[2dV\u000bOZ3:\n_q\u001a8f\f2s\u001892\r\t0_vff";
        objectArray[79] = "a\u000e/\u0014WzgV/\r(%\\\u0013bOI/>Rc\bP@`\u0017o\u001eC{#P J(";
        objectArray[80] = "a\u007fC\u001547:1O[Tng?D\u00008\\3\u007f\u0018[T;k#\u001e\r8ts)\u001fg";
        Object[] objectArray2 = objectArray;
        objectArray[81] = "rR)?\u0017PmCv%oP\tLpx\u000eTk\rq?\u0017;2\u000b//\u0002\u0005r\u0000s)o";
    }

    private void l(Object[] objectArray) {
        this.a = -1;
        this.c = -1;
        this.e = -1;
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == 'n' || c == 'c' || c == '\u00c0' || c == 'q') {
                field = e1.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == 'n' ? lookup.findGetter(clazz, string2, clazz2) : (c == 'c' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00c0' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = e1.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'b' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'A' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private boolean d(Object[] objectArray) {
        int n;
        block11: {
            block10: {
                CallSite callSite;
                CallSite callSite2;
                CallSite callSite3;
                long l;
                long l2;
                block8: {
                    block9: {
                        l2 = (Long)objectArray[0];
                        l = (l2 = k ^ l2) ^ 0x5654F81DC9ECL;
                        callSite3 = e1.c("A", (long)-7995906366376309940L, (long)l2);
                        try {
                            try {
                                CallSite callSite = e1.c("b", (Object)e1.c("b", (Object)e1.c("n", (Object)b, (long)-7994075991325127588L, (long)l2), (long)-7994255077181333416L, (long)l2), (long)-7994387584684198958L, (long)l2);
                                callSite = e1.c("\u00c0", (long)-7994793718825557949L, (long)l2);
                                if (callSite3 != null) break block8;
                                if (callSite2 != callSite) break block9;
                            }
                            catch (MatchException matchException) {
                                throw e1.c("A", (Object)matchException, (long)-7994704765838410009L, (long)l2);
                            }
                            return true;
                        }
                        catch (MatchException matchException) {
                            throw e1.c("A", (Object)matchException, (long)-7994704765838410009L, (long)l2);
                        }
                    }
                    CallSite callSite = e1.c("b", (Object)e1.c("b", (Object)e1.c("n", (Object)b, (long)-7994075991325127588L, (long)l2), (long)-7993298692441716398L, (long)l2), (long)-7994387584684198958L, (long)l2);
                    callSite = e1.c("\u00c0", (long)-7994793718825557949L, (long)l2);
                }
                try {
                    try {
                        if (callSite2 != callSite) break block10;
                        Object[] objectArray2 = new Object[1];
                        objectArray2[0] = l;
                        n = e1.c("A", (Object)objectArray2, (long)-7993445468465310837L, (long)l2);
                        if (callSite3 != null) break block11;
                    }
                    catch (MatchException matchException) {
                        throw e1.c("A", (Object)matchException, (long)-7994704765838410009L, (long)l2);
                    }
                    if (n != false) break block10;
                }
                catch (MatchException matchException) {
                    throw e1.c("A", (Object)matchException, (long)-7994704765838410009L, (long)l2);
                }
                n = 1;
                break block11;
            }
            n = false;
        }
        return n != 0;
    }

    private static Object d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = e1.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @bP
    public void a(bG var1_1) {
        block145: {
            block144: {
                block138: {
                    block139: {
                        block142: {
                            block141: {
                                block140: {
                                    block128: {
                                        block129: {
                                            block136: {
                                                block135: {
                                                    block130: {
                                                        block134: {
                                                            block133: {
                                                                block131: {
                                                                    block127: {
                                                                        block126: {
                                                                            block125: {
                                                                                block124: {
                                                                                    block123: {
                                                                                        block122: {
                                                                                            block121: {
                                                                                                block120: {
                                                                                                    block119: {
                                                                                                        block114: {
                                                                                                            block118: {
                                                                                                                block116: {
                                                                                                                    block115: {
                                                                                                                        block117: {
                                                                                                                            block112: {
                                                                                                                                block113: {
                                                                                                                                    block110: {
                                                                                                                                        block111: {
                                                                                                                                            block109: {
                                                                                                                                                v0 = var2_2 = e1.k ^ 3706150730477L;
                                                                                                                                                var4_3 = v0 ^ 124111639284428L;
                                                                                                                                                var6_4 = v0 ^ 99995386293230L;
                                                                                                                                                var8_5 = v0 ^ 96093898823876L;
                                                                                                                                                var10_6 = v0 ^ 137930590533967L;
                                                                                                                                                var12_7 = v0 ^ 95613170546953L;
                                                                                                                                                var14_8 = v0 ^ 59075611977478L;
                                                                                                                                                var16_9 = v0 ^ 60336313389472L;
                                                                                                                                                var18_10 = v0 ^ 94066683112626L;
                                                                                                                                                var20_11 = e1.c("A", (long)-7014742404978768670L, (long)var2_2);
                                                                                                                                                try {
                                                                                                                                                    try {
                                                                                                                                                        v1 = e1.b;
                                                                                                                                                        if (var20_11 != null) break block109;
                                                                                                                                                        if (e1.c("n", (Object)v1, (long)-7016287946633231374L, (long)var2_2) != null) {
                                                                                                                                                        }
                                                                                                                                                        ** GOTO lbl33
                                                                                                                                                    }
                                                                                                                                                    catch (MatchException v2) {
                                                                                                                                                        throw e1.c("A", (Object)v2, (long)-7015641562519424695L, (long)var2_2);
                                                                                                                                                    }
                                                                                                                                                    v1 = e1.b;
                                                                                                                                                }
                                                                                                                                                catch (MatchException v3) {
                                                                                                                                                    throw e1.c("A", (Object)v3, (long)-7015641562519424695L, (long)var2_2);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            try {
                                                                                                                                                try {
                                                                                                                                                    if (var20_11 != null) break block110;
                                                                                                                                                    if (e1.c("n", (Object)v1, (long)-7016085283091920930L, (long)var2_2) != null) break block111;
                                                                                                                                                }
                                                                                                                                                catch (MatchException v4) {
                                                                                                                                                    throw e1.c("A", (Object)v4, (long)-7015641562519424695L, (long)var2_2);
                                                                                                                                                }
lbl33:
                                                                                                                                                // 2 sources

                                                                                                                                                return;
                                                                                                                                            }
                                                                                                                                            catch (MatchException v5) {
                                                                                                                                                throw e1.c("A", (Object)v5, (long)-7015641562519424695L, (long)var2_2);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        v1 = e1.b;
                                                                                                                                    }
                                                                                                                                    try {
                                                                                                                                        try {
                                                                                                                                            v6 /* !! */  = e1.c("b", (Object)e1.c("n", (Object)v1, (long)-7016287946633231374L, (long)var2_2), (long)-7016591385648263399L, (long)var2_2);
                                                                                                                                            if (var20_11 != null) break block112;
                                                                                                                                            if (v6 /* !! */  != false) break block113;
                                                                                                                                        }
                                                                                                                                        catch (MatchException v7) {
                                                                                                                                            throw e1.c("A", (Object)v7, (long)-7015641562519424695L, (long)var2_2);
                                                                                                                                        }
                                                                                                                                        e1.c("b", (Object)this, (Object)new Object[0], (long)-7015514463547950644L, (long)var2_2);
                                                                                                                                        v8 = new Object[1];
                                                                                                                                        v8[0] = var14_8;
                                                                                                                                        e1.c("b", (Object)this, (Object)v8, (long)-7007947700314312148L, (long)var2_2);
                                                                                                                                        return;
                                                                                                                                    }
                                                                                                                                    catch (MatchException v9) {
                                                                                                                                        throw e1.c("A", (Object)v9, (long)-7015641562519424695L, (long)var2_2);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                v6 /* !! */  = (CallSite)this.c;
                                                                                                                            }
                                                                                                                            try {
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        try {
                                                                                                                                            try {
                                                                                                                                                v10 = -1;
                                                                                                                                                if (var20_11 != null) break block114;
                                                                                                                                                if (v6 /* !! */  == v10) break block115;
                                                                                                                                            }
                                                                                                                                            catch (MatchException v11) {
                                                                                                                                                throw e1.c("A", (Object)v11, (long)-7015641562519424695L, (long)var2_2);
                                                                                                                                            }
                                                                                                                                            v12 = e1.c("b", (Object)e1.c("b", (Object)e1.c("b", (Object)e1.c("n", (Object)e1.b, (long)-7016287946633231374L, (long)var2_2), (long)-7015565381557433374L, (long)var2_2), (int)this.c, (long)-7008467948129219423L, (long)var2_2), (long)-7016520611293889412L, (long)var2_2);
                                                                                                                                            if (var20_11 != null) break block116;
                                                                                                                                        }
                                                                                                                                        catch (MatchException v13) {
                                                                                                                                            throw e1.c("A", (Object)v13, (long)-7015641562519424695L, (long)var2_2);
                                                                                                                                        }
                                                                                                                                        if (v12 == e1.c("\u00c0", (long)-7015838508583161875L, (long)var2_2)) break block115;
                                                                                                                                    }
                                                                                                                                    catch (MatchException v14) {
                                                                                                                                        throw e1.c("A", (Object)v14, (long)-7015641562519424695L, (long)var2_2);
                                                                                                                                    }
                                                                                                                                    v15 = e1.c("\u00c0", (long)-7016251069951013005L, (long)var2_2);
                                                                                                                                    if (var20_11 != null) break block117;
                                                                                                                                }
                                                                                                                                catch (MatchException v16) {
                                                                                                                                    throw e1.c("A", (Object)v16, (long)-7015641562519424695L, (long)var2_2);
                                                                                                                                }
                                                                                                                                if (v15 != null) {
                                                                                                                                }
                                                                                                                                ** GOTO lbl101
                                                                                                                            }
                                                                                                                            catch (MatchException v17) {
                                                                                                                                throw e1.c("A", (Object)v17, (long)-7015641562519424695L, (long)var2_2);
                                                                                                                            }
                                                                                                                            v15 = e1.c("\u00c0", (long)-7016251069951013005L, (long)var2_2);
                                                                                                                        }
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                v18 = new Object[1];
                                                                                                                                v18[0] = var10_6;
                                                                                                                                v6 /* !! */  = e1.c("b", (Object)v15, (Object)v18, (long)-7007673965413710889L, (long)var2_2);
                                                                                                                                if (var20_11 != null) break block118;
                                                                                                                                if (v6 /* !! */  != false) break block115;
                                                                                                                            }
                                                                                                                            catch (MatchException v19) {
                                                                                                                                throw e1.c("A", (Object)v19, (long)-7015641562519424695L, (long)var2_2);
                                                                                                                            }
lbl101:
                                                                                                                            // 2 sources

                                                                                                                            e1.c("b", (Object)this, (Object)new Object[0], (long)-7015514463547950644L, (long)var2_2);
                                                                                                                        }
                                                                                                                        catch (MatchException v20) {
                                                                                                                            throw e1.c("A", (Object)v20, (long)-7015641562519424695L, (long)var2_2);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    v12 = e1.c("b", (Object)this.f, (long)-7007775573301408833L, (long)var2_2);
                                                                                                                }
                                                                                                                v6 /* !! */  = e1.c("b", (Object)((Integer)v12), (long)-7008249025395988575L, (long)var2_2);
                                                                                                            }
                                                                                                            try {
                                                                                                                if (var20_11 != null) break block119;
                                                                                                                v10 = -1;
                                                                                                            }
                                                                                                            catch (MatchException v21) {
                                                                                                                throw e1.c("A", (Object)v21, (long)-7015641562519424695L, (long)var2_2);
                                                                                                            }
                                                                                                        }
                                                                                                        try {
                                                                                                            if (v6 /* !! */  == v10) break block120;
                                                                                                            v22 = new Object[1];
                                                                                                            v22[0] = var16_9;
                                                                                                            v6 /* !! */  = e1.c("b", (Object)this.f, (Object)v22, (long)-7009450407316874245L, (long)var2_2);
                                                                                                        }
                                                                                                        catch (MatchException v23) {
                                                                                                            throw e1.c("A", (Object)v23, (long)-7015641562519424695L, (long)var2_2);
                                                                                                        }
                                                                                                    }
                                                                                                    try {
                                                                                                        if (var20_11 != null) break block121;
                                                                                                        if (v6 /* !! */  == false) break block120;
                                                                                                    }
                                                                                                    catch (MatchException v24) {
                                                                                                        throw e1.c("A", (Object)v24, (long)-7015641562519424695L, (long)var2_2);
                                                                                                    }
                                                                                                    v6 /* !! */  = (CallSite)1;
                                                                                                    break block121;
                                                                                                }
                                                                                                v6 /* !! */  = (CallSite)0;
                                                                                            }
                                                                                            var21_12 /* !! */  = v6 /* !! */ ;
                                                                                            try {
                                                                                                try {
                                                                                                    v25 /* !! */  = var21_12 /* !! */ ;
                                                                                                    if (var20_11 != null) break block122;
                                                                                                    if (v25 /* !! */  == false) break block123;
                                                                                                }
                                                                                                catch (MatchException v26) {
                                                                                                    throw e1.c("A", (Object)v26, (long)-7015641562519424695L, (long)var2_2);
                                                                                                }
                                                                                                v25 /* !! */  = (CallSite)this.i;
                                                                                            }
                                                                                            catch (MatchException v27) {
                                                                                                throw e1.c("A", (Object)v27, (long)-7015641562519424695L, (long)var2_2);
                                                                                            }
                                                                                        }
                                                                                        try {
                                                                                            if (var20_11 != null) break block124;
                                                                                            if (v25 /* !! */  != false) break block123;
                                                                                        }
                                                                                        catch (MatchException v28) {
                                                                                            throw e1.c("A", (Object)v28, (long)-7015641562519424695L, (long)var2_2);
                                                                                        }
                                                                                        v25 /* !! */  = (CallSite)1;
                                                                                        break block124;
                                                                                    }
                                                                                    v25 /* !! */  = (CallSite)0;
                                                                                }
                                                                                var22_13 /* !! */  = v25 /* !! */ ;
                                                                                try {
                                                                                    try {
                                                                                        v29 /* !! */  = var21_12 /* !! */ ;
                                                                                        if (var20_11 != null) break block125;
                                                                                        if (v29 /* !! */  != false) break block126;
                                                                                    }
                                                                                    catch (MatchException v30) {
                                                                                        throw e1.c("A", (Object)v30, (long)-7015641562519424695L, (long)var2_2);
                                                                                    }
                                                                                    v29 /* !! */  = (CallSite)this.i;
                                                                                }
                                                                                catch (MatchException v31) {
                                                                                    throw e1.c("A", (Object)v31, (long)-7015641562519424695L, (long)var2_2);
                                                                                }
                                                                            }
                                                                            try {
                                                                                if (var20_11 != null) break block127;
                                                                                if (v29 /* !! */  == false) break block126;
                                                                            }
                                                                            catch (MatchException v32) {
                                                                                throw e1.c("A", (Object)v32, (long)-7015641562519424695L, (long)var2_2);
                                                                            }
                                                                            v29 /* !! */  = (CallSite)1;
                                                                            break block127;
                                                                        }
                                                                        v29 /* !! */  = (CallSite)0;
                                                                    }
                                                                    var23_14 /* !! */  = v29 /* !! */ ;
                                                                    try {
                                                                        block132: {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        try {
                                                                                                            this.i = var21_12 /* !! */ ;
                                                                                                            v33 = e1.c("n", (Object)e1.b, (long)-7016428718199316140L, (long)var2_2);
                                                                                                            if (var20_11 != null) break block128;
                                                                                                            if (v33 != null) break block129;
                                                                                                        }
                                                                                                        catch (MatchException v34) {
                                                                                                            throw e1.c("A", (Object)v34, (long)-7015641562519424695L, (long)var2_2);
                                                                                                        }
                                                                                                        v35 /* !! */  = e1.c("b", (Object)this.f, (long)-7008132988552546382L, (long)var2_2);
                                                                                                        if (var20_11 != null) break block130;
                                                                                                    }
                                                                                                    catch (MatchException v36) {
                                                                                                        throw e1.c("A", (Object)v36, (long)-7015641562519424695L, (long)var2_2);
                                                                                                    }
                                                                                                    if (v35 /* !! */  != false) {
                                                                                                    }
                                                                                                    ** GOTO lbl278
                                                                                                }
                                                                                                catch (MatchException v37) {
                                                                                                    throw e1.c("A", (Object)v37, (long)-7015641562519424695L, (long)var2_2);
                                                                                                }
                                                                                                v38 /* !! */  = var22_13 /* !! */ ;
                                                                                                if (var20_11 != null) break block131;
                                                                                            }
                                                                                            catch (MatchException v39) {
                                                                                                throw e1.c("A", (Object)v39, (long)-7015641562519424695L, (long)var2_2);
                                                                                            }
                                                                                            if (v38 /* !! */  == false) break block132;
                                                                                        }
                                                                                        catch (MatchException v40) {
                                                                                            throw e1.c("A", (Object)v40, (long)-7015641562519424695L, (long)var2_2);
                                                                                        }
                                                                                        v38 /* !! */  = (CallSite)this.a;
                                                                                        if (var20_11 != null) break block131;
                                                                                    }
                                                                                    catch (MatchException v41) {
                                                                                        throw e1.c("A", (Object)v41, (long)-7015641562519424695L, (long)var2_2);
                                                                                    }
                                                                                    if (v38 /* !! */  != -1) break block132;
                                                                                }
                                                                                catch (MatchException v42) {
                                                                                    throw e1.c("A", (Object)v42, (long)-7015641562519424695L, (long)var2_2);
                                                                                }
                                                                                v43 = new Object[1];
                                                                                v43[0] = var4_3;
                                                                                e1.c("b", (Object)this, (Object)v43, (long)-7015715342512979458L, (long)var2_2);
                                                                                if (var20_11 == null) break block129;
                                                                            }
                                                                            catch (MatchException v44) {
                                                                                throw e1.c("A", (Object)v44, (long)-7015641562519424695L, (long)var2_2);
                                                                            }
                                                                        }
                                                                        v38 /* !! */  = var23_14 /* !! */ ;
                                                                    }
                                                                    catch (MatchException v45) {
                                                                        throw e1.c("A", (Object)v45, (long)-7015641562519424695L, (long)var2_2);
                                                                    }
                                                                }
                                                                try {
                                                                    try {
                                                                        try {
                                                                            if (var20_11 != null) break block133;
                                                                            if (v38 /* !! */  == false) break block129;
                                                                        }
                                                                        catch (MatchException v46) {
                                                                            throw e1.c("A", (Object)v46, (long)-7015641562519424695L, (long)var2_2);
                                                                        }
                                                                        v47 = this;
                                                                        if (var20_11 != null) break block134;
                                                                    }
                                                                    catch (MatchException v48) {
                                                                        throw e1.c("A", (Object)v48, (long)-7015641562519424695L, (long)var2_2);
                                                                    }
                                                                    v38 /* !! */  = (CallSite)v47.a;
                                                                }
                                                                catch (MatchException v49) {
                                                                    throw e1.c("A", (Object)v49, (long)-7015641562519424695L, (long)var2_2);
                                                                }
                                                            }
                                                            try {
                                                                if (v38 /* !! */  == -1) break block129;
                                                                v47 = this;
                                                            }
                                                            catch (MatchException v50) {
                                                                throw e1.c("A", (Object)v50, (long)-7015641562519424695L, (long)var2_2);
                                                            }
                                                        }
                                                        try {
                                                            v51 = new Object[1];
                                                            v51[0] = var8_5;
                                                            e1.c("b", (Object)v47, (Object)v51, (long)-7008056811159963602L, (long)var2_2);
                                                            if (var20_11 == null) break block129;
lbl278:
                                                            // 2 sources

                                                            v35 /* !! */  = var22_13 /* !! */ ;
                                                        }
                                                        catch (MatchException v52) {
                                                            throw e1.c("A", (Object)v52, (long)-7015641562519424695L, (long)var2_2);
                                                        }
                                                    }
                                                    try {
                                                        try {
                                                            try {
                                                                if (var20_11 != null) break block135;
                                                                if (v35 /* !! */  == false) break block129;
                                                            }
                                                            catch (MatchException v53) {
                                                                throw e1.c("A", (Object)v53, (long)-7015641562519424695L, (long)var2_2);
                                                            }
                                                            v54 = this;
                                                            if (var20_11 != null) break block136;
                                                        }
                                                        catch (MatchException v55) {
                                                            throw e1.c("A", (Object)v55, (long)-7015641562519424695L, (long)var2_2);
                                                        }
                                                        v35 /* !! */  = (CallSite)v54.a;
                                                    }
                                                    catch (MatchException v56) {
                                                        throw e1.c("A", (Object)v56, (long)-7015641562519424695L, (long)var2_2);
                                                    }
                                                }
                                                try {
                                                    block137: {
                                                        try {
                                                            if (v35 /* !! */  == -1) break block137;
                                                            v57 = new Object[1];
                                                            v57[0] = var8_5;
                                                            e1.c("b", (Object)this, (Object)v57, (long)-7008056811159963602L, (long)var2_2);
                                                            if (var20_11 == null) break block129;
                                                        }
                                                        catch (MatchException v58) {
                                                            throw e1.c("A", (Object)v58, (long)-7015641562519424695L, (long)var2_2);
                                                        }
                                                    }
                                                    v54 = this;
                                                }
                                                catch (MatchException v59) {
                                                    throw e1.c("A", (Object)v59, (long)-7015641562519424695L, (long)var2_2);
                                                }
                                            }
                                            v60 = new Object[1];
                                            v60[0] = var4_3;
                                            e1.c("b", (Object)v54, (Object)v60, (long)-7015715342512979458L, (long)var2_2);
                                        }
                                        v33 = e1.c("n", (Object)e1.b, (long)-7016428718199316140L, (long)var2_2);
                                    }
                                    try {
                                        try {
                                            try {
                                                try {
                                                    if (var20_11 != null) break block138;
                                                    if (v33 != null) break block139;
                                                }
                                                catch (MatchException v61) {
                                                    throw e1.c("A", (Object)v61, (long)-7015641562519424695L, (long)var2_2);
                                                }
                                                v62 /* !! */  = this.e;
                                                v63 = -1;
                                                if (var20_11 != null) break block140;
                                            }
                                            catch (MatchException v64) {
                                                throw e1.c("A", (Object)v64, (long)-7015641562519424695L, (long)var2_2);
                                            }
                                            if (v62 /* !! */  == v63) break block139;
                                        }
                                        catch (MatchException v65) {
                                            throw e1.c("A", (Object)v65, (long)-7015641562519424695L, (long)var2_2);
                                        }
                                        v62 /* !! */  = this.c;
                                        v63 = -1;
                                    }
                                    catch (MatchException v66) {
                                        throw e1.c("A", (Object)v66, (long)-7015641562519424695L, (long)var2_2);
                                    }
                                }
                                try {
                                    try {
                                        if (var20_11 != null) break block141;
                                        if (v62 /* !! */  == v63) break block139;
                                    }
                                    catch (MatchException v67) {
                                        throw e1.c("A", (Object)v67, (long)-7015641562519424695L, (long)var2_2);
                                    }
                                    v68 = new Object[1];
                                    v68[0] = var12_7;
                                    v62 /* !! */  = (int)e1.c("A", (Object)v68, (long)-7007839829368413944L, (long)var2_2);
                                    v63 = this.c;
                                }
                                catch (MatchException v69) {
                                    throw e1.c("A", (Object)v69, (long)-7015641562519424695L, (long)var2_2);
                                }
                            }
                            try {
                                try {
                                    if (var20_11 != null) break block142;
                                    if (v62 /* !! */  == v63) break block139;
                                }
                                catch (MatchException v70) {
                                    throw e1.c("A", (Object)v70, (long)-7015641562519424695L, (long)var2_2);
                                }
                                v62 /* !! */  = this.e;
                                v63 = this.c;
                            }
                            catch (MatchException v71) {
                                throw e1.c("A", (Object)v71, (long)-7015641562519424695L, (long)var2_2);
                            }
                        }
                        v72 = new Object[3];
                        v72[2] = var18_10;
                        v72[1] = v63;
                        v72[0] = v62 /* !! */ ;
                        e1.c("A", (Object)v72, (long)-7016118876915386462L, (long)var2_2);
                        e1.c("b", (Object)this, (Object)new Object[0], (long)-7015514463547950644L, (long)var2_2);
                    }
                    v33 = e1.c("n", (Object)e1.b, (long)-7016428718199316140L, (long)var2_2);
                }
                try {
                    block143: {
                        try {
                            try {
                                try {
                                    if (v33 != null) break block143;
                                    v73 = this;
                                    if (var20_11 != null) break block144;
                                }
                                catch (MatchException v74) {
                                    throw e1.c("A", (Object)v74, (long)-7015641562519424695L, (long)var2_2);
                                }
                                v75 = new Object[1];
                                v75[0] = var6_4;
                                if (e1.c("b", (Object)v73, (Object)v75, (long)-7008521061201580077L, (long)var2_2) == false) break block143;
                            }
                            catch (MatchException v76) {
                                throw e1.c("A", (Object)v76, (long)-7015641562519424695L, (long)var2_2);
                            }
                            e1.c("b", (Object)e1.c("n", (Object)e1.c("n", (Object)e1.b, (long)-7015929283330455279L, (long)var2_2), (long)-7008316866293279152L, (long)var2_2), (boolean)true, (long)-7007987285610843706L, (long)var2_2);
                            if (var20_11 == null) break block145;
                        }
                        catch (MatchException v77) {
                            throw e1.c("A", (Object)v77, (long)-7015641562519424695L, (long)var2_2);
                        }
                    }
                    v73 = this;
                }
                catch (MatchException v78) {
                    throw e1.c("A", (Object)v78, (long)-7015641562519424695L, (long)var2_2);
                }
            }
            v79 = new Object[1];
            v79[0] = var14_8;
            e1.c("b", (Object)v73, (Object)v79, (long)-7007947700314312148L, (long)var2_2);
        }
    }

    @Override
    public Set a(Object[] objectArray) {
        long l = (Long)objectArray[0];
        return e1.c("A", (Object)((Object)q_0.Sword), (Object)((Object)q_0.UHC), (long)-2445687219789243923L, (long)l);
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
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
            case 0 -> 49;
            case 1 -> 60;
            case 2 -> 48;
            case 3 -> 40;
            case 4 -> 30;
            case 5 -> 44;
            case 6 -> 41;
            case 7 -> 23;
            case 8 -> 55;
            case 9 -> 31;
            case 10 -> 20;
            case 11 -> 33;
            case 12 -> 61;
            case 13 -> 28;
            case 14 -> 58;
            case 15 -> 16;
            case 16 -> 35;
            case 17 -> 13;
            case 18 -> 6;
            case 19 -> 39;
            case 20 -> 53;
            case 21 -> 59;
            case 22 -> 7;
            case 23 -> 62;
            case 24 -> 50;
            case 25 -> 19;
            case 26 -> 47;
            case 27 -> 22;
            case 28 -> 21;
            case 29 -> 5;
            case 30 -> 14;
            case 31 -> 63;
            case 32 -> 0;
            case 33 -> 15;
            case 34 -> 34;
            case 35 -> 36;
            case 36 -> 32;
            case 37 -> 43;
            case 38 -> 26;
            case 39 -> 11;
            case 40 -> 2;
            case 41 -> 18;
            case 42 -> 12;
            case 43 -> 54;
            case 44 -> 24;
            case 45 -> 46;
            case 46 -> 9;
            case 47 -> 10;
            case 48 -> 52;
            case 49 -> 29;
            case 50 -> 45;
            case 51 -> 4;
            case 52 -> 8;
            case 53 -> 37;
            case 54 -> 38;
            case 55 -> 3;
            case 56 -> 42;
            case 57 -> 25;
            case 58 -> 57;
            case 59 -> 1;
            case 60 -> 27;
            case 61 -> 17;
            case 62 -> 51;
            default -> 56;
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
        e1.p[n3] = new String(cArray);
        return n3;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void m(Object[] var1_1) {
        block16: {
            block17: {
                block13: {
                    block14: {
                        block15: {
                            var2_2 = (Long)var1_1[0];
                            var4_3 = (var2_2 = e1.k ^ var2_2) ^ 82743220821503L;
                            v0 = new Object[1];
                            v0[0] = var4_3;
                            var7_4 = e1.c("b", (Object)e1.c("b", (Object)new N((class_304)e1.c("n", (Object)e1.c("n", (Object)e1.b, (long)-2457712766800065961L, (long)var2_2), (long)-2451243738444950250L, (long)var2_2)), (Object)v0, (long)-2457594611364947702L, (long)var2_2), (long)-2450169905881408552L, (long)var2_2);
                            var6_5 = e1.c("A", (long)-2458760004774377564L, (long)var2_2);
                            try {
                                try {
                                    try {
                                        try {
                                            v1 = var7_4;
                                            v2 /* !! */  = e1.b("c", (int)314, (long)(8301719063738463961L ^ var2_2));
                                            if (var6_5 != null) break block13;
                                            if (v1 < v2 /* !! */ ) {
                                            }
                                            ** GOTO lbl42
                                        }
                                        catch (MatchException v3) {
                                            throw e1.c("A", (Object)v3, (long)-2457429288912981489L, (long)var2_2);
                                        }
                                        v4 /* !! */  = e1.c("A", (long)e1.c("b", (Object)e1.c("b", (Object)e1.b, (long)-2458880712993717059L, (long)var2_2), (long)-2458705065056880601L, (long)var2_2), (int)var7_4, (long)-2458943309963505928L, (long)var2_2);
                                        if (var6_5 != null) break block14;
                                    }
                                    catch (MatchException v5) {
                                        throw e1.c("A", (Object)v5, (long)-2457429288912981489L, (long)var2_2);
                                    }
                                    if (v4 /* !! */  != 1) break block15;
                                }
                                catch (MatchException v6) {
                                    throw e1.c("A", (Object)v6, (long)-2457429288912981489L, (long)var2_2);
                                }
                                v4 /* !! */  = (CallSite)1;
                                break block14;
                            }
                            catch (MatchException v7) {
                                throw e1.c("A", (Object)v7, (long)-2457429288912981489L, (long)var2_2);
                            }
                        }
                        v4 /* !! */  = (CallSite)0;
                    }
                    var8_6 = v4 /* !! */ ;
                    try {
                        try {
                            if (var6_5 == null) break block16;
lbl42:
                            // 2 sources

                            v1 = e1.c("A", (long)e1.c("b", (Object)e1.c("b", (Object)e1.b, (long)-2458880712993717059L, (long)var2_2), (long)-2458705065056880601L, (long)var2_2), (int)var7_4, (long)-2451332728937847269L, (long)var2_2);
                            if (var6_5 != null) break block17;
                        }
                        catch (MatchException v8) {
                            throw e1.c("A", (Object)v8, (long)-2457429288912981489L, (long)var2_2);
                        }
                        v2 /* !! */  = (CallSite)1;
                    }
                    catch (MatchException v9) {
                        throw e1.c("A", (Object)v9, (long)-2457429288912981489L, (long)var2_2);
                    }
                }
                v1 = v1 == v2 /* !! */  ? (Object)1 : (Object)0;
            }
            var8_6 = v1;
        }
        e1.c("b", (Object)e1.c("n", (Object)e1.c("n", (Object)e1.b, (long)-2457712766800065961L, (long)var2_2), (long)-2451243738444950250L, (long)var2_2), (boolean)var8_6, (long)-2452004877424561536L, (long)var2_2);
    }

    private static Field o(long l, long l2) {
        int n = e1.m(l, l2);
        Object object = o[n];
        if (object instanceof String) {
            String string = p[n];
            int n2 = string.indexOf(8);
            Class clazz = e1.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = e1.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = e1.g(clazz3, string2, clazz2)) != null) {
                    e1.o[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = e1.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        e1.o[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = e1.n(1501998417619164L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = e1.m(l, l2);
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
                clazz3 = e1.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = e1.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = e1.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        e1.o[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = e1.n(1501998417619164L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = e1.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        e1.o[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = e1.n(1501998417619164L, 0L);
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

    private void k(Object[] objectArray) {
        long l;
        block8: {
            int n;
            long l2;
            block6: {
                l = (Long)objectArray[0];
                long l3 = l = k ^ l;
                l2 = l3 ^ 0x76394848B85EL;
                long l4 = l3 ^ 0x2D6D2A719036L;
                CallSite callSite = e1.c("A", (long)7071451938777593958L, (long)l);
                try {
                    block7: {
                        try {
                            try {
                                n = this.e;
                                if (callSite != null) break block6;
                                if (n == -1) break block7;
                            }
                            catch (MatchException matchException) {
                                throw e1.c("A", (Object)matchException, (long)7072647904411438541L, (long)l);
                            }
                            Object[] objectArray2 = new Object[3];
                            objectArray2[2] = l4;
                            objectArray2[1] = this.c;
                            objectArray2[0] = this.e;
                            e1.c("A", (Object)objectArray2, (long)7072276413142879014L, (long)l);
                            if (callSite == null) break block8;
                        }
                        catch (MatchException matchException) {
                            throw e1.c("A", (Object)matchException, (long)7072647904411438541L, (long)l);
                        }
                    }
                    n = this.a;
                }
                catch (MatchException matchException) {
                    throw e1.c("A", (Object)matchException, (long)7072647904411438541L, (long)l);
                }
            }
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = l2;
            objectArray3[0] = n;
            e1.c("A", (Object)objectArray3, (long)7077492223967296479L, (long)l);
        }
        e1.c("b", (Object)this, (Object)new Object[0], (long)7072791216312616264L, (long)l);
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

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private void j(Object[] var1_1) {
        block12: {
            block13: {
                var2_2 = (Long)var1_1[0];
                v0 = var2_2 = e1.k ^ var2_2;
                var4_3 = v0 ^ 89868647590486L;
                var6_4 = v0 ^ 10516105942917L;
                var8_5 = v0 ^ 11992872632894L;
                var10_6 = e1.c("A", (long)3470867487343356526L, (long)var2_2);
                try {
                    if (e1.c("b", (Object)e1.c("b", (Object)e1.c("n", (Object)e1.b, (long)3471567418453716350L, (long)var2_2), (long)3471317972476805498L, (long)var2_2), (long)3471167864131310320L, (long)var2_2) == e1.c("\u00c0", (long)3471962405338497377L, (long)var2_2)) {
                        return;
                    }
                }
                catch (MatchException v1) {
                    throw e1.c("A", (Object)v1, (long)3472046951695032261L, (long)var2_2);
                }
                for (var11_7 /* !! */  = 0; var11_7 /* !! */  < e1.b("c", (int)1206, (long)(6681048734556905117L ^ var2_2)); ++var11_7 /* !! */ ) {
                    try {
                        try {
                            v2 = e1.c("b", (Object)e1.c("b", (Object)e1.c("b", (Object)e1.c("n", (Object)e1.b, (long)3471567418453716350L, (long)var2_2), (long)3472252297188173166L, (long)var2_2), (int)var11_7 /* !! */ , (long)3472474243942228525L, (long)var2_2), (long)3471167864131310320L, (long)var2_2);
                            v3 = e1.c("\u00c0", (long)3471962405338497377L, (long)var2_2);
                            if (var10_6 == null) {
                                if (v2 != v3) continue;
                            }
                            ** GOTO lbl54
                        }
                        catch (MatchException v4) {
                            throw e1.c("A", (Object)v4, (long)3472046951695032261L, (long)var2_2);
                        }
                        v5 = new Object[1];
                        v5[0] = var6_4;
                        this.a = (int)e1.c("A", (Object)v5, (long)3473253500941225860L, (long)var2_2);
                        this.c = var11_7 /* !! */ ;
                        this.e = -1;
                        v6 = new Object[2];
                        v6[1] = var4_3;
                        v6[0] = var11_7 /* !! */ ;
                        e1.c("A", (Object)v6, (long)3472392035194939863L, (long)var2_2);
                        return;
                    }
                    catch (MatchException v7) {
                        throw e1.c("A", (Object)v7, (long)3472046951695032261L, (long)var2_2);
                    }
                }
                try {
                    v8 = e1.c("b", (Object)((Boolean)e1.c("b", (Object)this.d, (long)3473188300249326899L, (long)var2_2)), (long)3472701039049380425L, (long)var2_2);
                    if (var10_6 != null) break block12;
                    if (v8 != false) break block13;
                }
                catch (MatchException v9) {
                    throw e1.c("A", (Object)v9, (long)3472046951695032261L, (long)var2_2);
                }
                return;
            }
            v8 = e1.b("c", (int)4779, (long)(4953708877898860673L ^ var2_2));
        }
        for (var11_7 /* !! */  = (int)(v1723433); var11_7 /* !! */  < e1.b("c", (int)30017, (long)(7487427836068376425L ^ var2_2)); ++var11_7 /* !! */ ) {
            v2 = e1.c("b", (Object)e1.c("b", (Object)e1.c("b", (Object)e1.c("n", (Object)e1.b, (long)3471567418453716350L, (long)var2_2), (long)3472252297188173166L, (long)var2_2), (int)var11_7 /* !! */ , (long)3472474243942228525L, (long)var2_2), (long)3471167864131310320L, (long)var2_2);
            v3 = e1.c("\u00c0", (long)3471962405338497377L, (long)var2_2);
lbl54:
            // 2 sources

            if (v2 != v3) continue;
            v10 = new Object[1];
            v10[0] = var6_4;
            var12_8 = e1.c("A", (Object)v10, (long)3473253500941225860L, (long)var2_2);
            this.a = (int)var12_8;
            this.c = (int)var12_8;
            this.e = var11_7 /* !! */ ;
            v11 = new Object[3];
            v11[2] = var8_5;
            v11[1] = (int)var12_8;
            v11[0] = var11_7 /* !! */ ;
            e1.c("A", (Object)v11, (long)3471679825055914286L, (long)var2_2);
            return;
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(e1.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(e1.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


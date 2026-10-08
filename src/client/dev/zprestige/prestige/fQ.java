/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2248
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.a4;
import dev.zprestige.prestige.bN;
import dev.zprestige.prestige.bP;
import dev.zprestige.prestige.dM;
import dev.zprestige.prestige.dV;
import dev.zprestige.prestige.hc;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import net.minecraft.class_2248;

public class fQ
extends dV {
    private dM d;
    public static List a;
    private static final long k;
    private static final Object[] l;
    private static final String[] m;

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                fQ.k = hc.a(4409457842735416924L, -2983836042577478445L, MethodHandles.lookup().lookupClass()).a(172340263246121L);
                var11 = fQ.k ^ 132578566887329L;
                fQ.l = new Object[90];
                fQ.m = new String[90];
                fQ.f();
                var1_1 = Cipher.getInstance("DES/CBC/NoPadding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var11 >>> 56);
                for (var2_2 = 1; var2_2 < 8; ++var2_2) {
                    v2 = v2;
                    v2[var2_2] = (byte)(var11 << var2_2 * 8 >>> 56);
                }
                var1_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var0_3 = new long[49];
                var4_4 = 0;
                var5_5 = "\u008e\u0016N\u00f7\u00c2\u009eQg\u00d2\u00c1\r\u00ba\u00c9\u0015C\u00e9\u0005\u00f9t\u00b7^\u00adQ^\u00c1\u0002\u00cb*%/\u00c0\u0005Fp;\u009cm$\u00f8\u00f6\u009a\u00c2M\u0087\u00e6\u00acklp\u00f6\u0089H\u0081\u00c6\u00bf\u0019S\u0081P@~\u00f1\u00c2\u00f7\u00e1\b\u00d4\u00ed\u00c4cR\u00a0}\u00bc\u00c9\u0080WD\u00e4\u00ec\u0012\u00e9~{\u00ae/iMm\u00fa\u00bc\u00fa\u00e5cc\u00edA\u00b7\u00c3\u00963\u000e\u000e\u0000e\u00c9\u00a2e\u00e3HJ\u00dd\u00ec\u00e7\u00e8[\u0006g*\u00d5\u00e1\u00a5\u00f0\u0085\u00d2\u0083\u0090p\u00a7\u00c5w\u00fcJ\u001b\"\u001d\u008a\u000e\u009c\u00a1\u0081\u00a4\u000f\u00e7\u007f\u0012\u00f3f\u00fdvq\u00ed\u00a1\u0087\u00a7\u0083pr\n\u0087$Q|ZA\u00a0%\u00a5'\u00f9\u00b9\u00a6\u00f3\u00d7\u00e4\u00da\u00e1\u00d2\u00c3\u00f4#\u001b\u00b9\u00b5\u00190sX\u00fbJ\u0010J\u00b6\u00de\u00c9\u00b0\u00a3\u00dd\u00e6F\u00db\u0080cR[\"\u00fa\u00ee\u00d0Xg\u00a1}ourr<\u00f0M\u00b4\u00d7<\u00d2)b\u00be\u00bbdJ]\u00eac\u0005\u00f9\u00f2\u008cm\u00e0\u0092(n\u0013\u00b9\u0017x\u0083\u00b6\u0018}l\u00a5Z\u00e6\u00be\u00aa\u0014\u00ca\u0006\nZ2\rIL5>@b\u0015\u0090\u0019v|@f)L\u00e1\u00b4\b\u00dfo\u00e4G\u0000\u00e9\u001e\u008eF\u00eb\u00e3{`\u0091\u00c1\u00fc\u0010k6\u00a5\u0013\r\u00b5\u00cfF\u0096\u008aN\fo\u00a4\u00e5%y\u008f3\u008c\u00e4\u0002\u00d5f9\u00b7}5\u00a6\u00fbM\u00c2\u0004\u0096E@\u0088\u0014\u00a6\u001c\u0015a\u00f0\u009d(\u0092<\u00c6w\u0004?\u00b8\u00c4\u00b08\u00db\u0082\b\u00a2d\u00eb\u00ab\u00e04\u00daR=L\u00e0\u001b\u009d?\u00f1\u008c\u00f9\u00b1\u0084\u00bd";
                var6_6 = "\u008e\u0016N\u00f7\u00c2\u009eQg\u00d2\u00c1\r\u00ba\u00c9\u0015C\u00e9\u0005\u00f9t\u00b7^\u00adQ^\u00c1\u0002\u00cb*%/\u00c0\u0005Fp;\u009cm$\u00f8\u00f6\u009a\u00c2M\u0087\u00e6\u00acklp\u00f6\u0089H\u0081\u00c6\u00bf\u0019S\u0081P@~\u00f1\u00c2\u00f7\u00e1\b\u00d4\u00ed\u00c4cR\u00a0}\u00bc\u00c9\u0080WD\u00e4\u00ec\u0012\u00e9~{\u00ae/iMm\u00fa\u00bc\u00fa\u00e5cc\u00edA\u00b7\u00c3\u00963\u000e\u000e\u0000e\u00c9\u00a2e\u00e3HJ\u00dd\u00ec\u00e7\u00e8[\u0006g*\u00d5\u00e1\u00a5\u00f0\u0085\u00d2\u0083\u0090p\u00a7\u00c5w\u00fcJ\u001b\"\u001d\u008a\u000e\u009c\u00a1\u0081\u00a4\u000f\u00e7\u007f\u0012\u00f3f\u00fdvq\u00ed\u00a1\u0087\u00a7\u0083pr\n\u0087$Q|ZA\u00a0%\u00a5'\u00f9\u00b9\u00a6\u00f3\u00d7\u00e4\u00da\u00e1\u00d2\u00c3\u00f4#\u001b\u00b9\u00b5\u00190sX\u00fbJ\u0010J\u00b6\u00de\u00c9\u00b0\u00a3\u00dd\u00e6F\u00db\u0080cR[\"\u00fa\u00ee\u00d0Xg\u00a1}ourr<\u00f0M\u00b4\u00d7<\u00d2)b\u00be\u00bbdJ]\u00eac\u0005\u00f9\u00f2\u008cm\u00e0\u0092(n\u0013\u00b9\u0017x\u0083\u00b6\u0018}l\u00a5Z\u00e6\u00be\u00aa\u0014\u00ca\u0006\nZ2\rIL5>@b\u0015\u0090\u0019v|@f)L\u00e1\u00b4\b\u00dfo\u00e4G\u0000\u00e9\u001e\u008eF\u00eb\u00e3{`\u0091\u00c1\u00fc\u0010k6\u00a5\u0013\r\u00b5\u00cfF\u0096\u008aN\fo\u00a4\u00e5%y\u008f3\u008c\u00e4\u0002\u00d5f9\u00b7}5\u00a6\u00fbM\u00c2\u0004\u0096E@\u0088\u0014\u00a6\u001c\u0015a\u00f0\u009d(\u0092<\u00c6w\u0004?\u00b8\u00c4\u00b08\u00db\u0082\b\u00a2d\u00eb\u00ab\u00e04\u00daR=L\u00e0\u001b\u009d?\u00f1\u008c\u00f9\u00b1\u0084\u00bd".length();
                var3_7 = 0;
                while (true) {
                    var7_8 = var5_5.substring(var3_7, var3_7 += 8).getBytes("ISO-8859-1");
                    v3 = var0_3;
                    v4 = var4_4++;
                    v5 = ((long)var7_8[0] & 255L) << 56 | ((long)var7_8[1] & 255L) << 48 | ((long)var7_8[2] & 255L) << 40 | ((long)var7_8[3] & 255L) << 32 | ((long)var7_8[4] & 255L) << 24 | ((long)var7_8[5] & 255L) << 16 | ((long)var7_8[6] & 255L) << 8 | (long)var7_8[7] & 255L;
                    v6 = -1;
                    break block8;
                    break;
                }
lbl40:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var3_7 < var6_6) ** continue;
                    var5_5 = "\u00c1\u00f7T\u0018\u00da8\u0080M\u0089\u0011\u00c2\u009c\u00b5Rg:";
                    var6_6 = "\u00c1\u00f7T\u0018\u00da8\u0080M\u0089\u0011\u00c2\u009c\u00b5Rg:".length();
                    var3_7 = 0;
                    while (true) {
                        var7_8 = var5_5.substring(var3_7, var3_7 += 8).getBytes("ISO-8859-1");
                        v3 = var0_3;
                        v4 = var4_4++;
                        v5 = ((long)var7_8[0] & 255L) << 56 | ((long)var7_8[1] & 255L) << 48 | ((long)var7_8[2] & 255L) << 40 | ((long)var7_8[3] & 255L) << 32 | ((long)var7_8[4] & 255L) << 24 | ((long)var7_8[5] & 255L) << 16 | ((long)var7_8[6] & 255L) << 8 | (long)var7_8[7] & 255L;
                        v6 = 0;
                        break block8;
                        break;
                    }
                    break;
                }
lbl59:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var3_7 < var6_6) ** continue;
                    break block9;
                    break;
                }
            }
            var8_9 = v5;
            var10_10 = var1_1.doFinal(new byte[]{(byte)(var8_9 >>> 56), (byte)(var8_9 >>> 48), (byte)(var8_9 >>> 40), (byte)(var8_9 >>> 32), (byte)(var8_9 >>> 24), (byte)(var8_9 >>> 16), (byte)(var8_9 >>> 8), (byte)var8_9});
            v7 = ((long)var10_10[0] & 255L) << 56 | ((long)var10_10[1] & 255L) << 48 | ((long)var10_10[2] & 255L) << 40 | ((long)var10_10[3] & 255L) << 32 | ((long)var10_10[4] & 255L) << 24 | ((long)var10_10[5] & 255L) << 16 | ((long)var10_10[6] & 255L) << 8 | (long)var10_10[7] & 255L;
            switch (v6) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl72:
                // 1 sources

                ** continue;
            }
        }
        v8 = new class_2248[(int)var0_3[2]];
        v8[0] = fQ.b("D", (long)-4104439978130984203L, (long)var11);
        v8[1] = fQ.b("D", (long)-4098745479183128986L, (long)var11);
        v8[2] = fQ.b("D", (long)-4103845224556833208L, (long)var11);
        v8[3] = fQ.b("D", (long)-4102698608506668957L, (long)var11);
        v8[4] = fQ.b("D", (long)-4104962393189218250L, (long)var11);
        v8[5] = fQ.b("D", (long)-4104013751435278683L, (long)var11);
        v8[(int)var0_3[46]] = fQ.b("D", (long)-4098583605539997632L, (long)var11);
        v8[(int)var0_3[22]] = fQ.b("D", (long)-4102063304440617029L, (long)var11);
        v8[(int)var0_3[3]] = fQ.b("D", (long)-4101166171819484369L, (long)var11);
        v8[(int)var0_3[24]] = fQ.b("D", (long)-4100613288578400064L, (long)var11);
        v8[(int)var0_3[35]] = fQ.b("D", (long)-4103593329353996199L, (long)var11);
        v8[(int)var0_3[17]] = fQ.b("D", (long)-4101409823585681832L, (long)var11);
        v8[(int)var0_3[29]] = fQ.b("D", (long)-4101306210539911866L, (long)var11);
        v8[(int)var0_3[18]] = fQ.b("D", (long)-4099141829012475572L, (long)var11);
        v8[(int)var0_3[4]] = fQ.b("D", (long)-4104156050340353446L, (long)var11);
        v8[(int)var0_3[27]] = fQ.b("D", (long)-4102547545027275787L, (long)var11);
        v8[(int)var0_3[0]] = fQ.b("D", (long)-4102295563227380463L, (long)var11);
        v8[(int)var0_3[8]] = fQ.b("D", (long)-4104623001335011670L, (long)var11);
        v8[(int)var0_3[32]] = fQ.b("D", (long)-4101262286768036528L, (long)var11);
        v8[(int)var0_3[23]] = fQ.b("D", (long)-4103014985665828322L, (long)var11);
        v8[(int)var0_3[48]] = fQ.b("D", (long)-4104200104918045861L, (long)var11);
        v8[(int)var0_3[33]] = fQ.b("D", (long)-4104355601921536379L, (long)var11);
        v8[(int)var0_3[13]] = fQ.b("D", (long)-4102777359877702038L, (long)var11);
        v8[(int)var0_3[40]] = fQ.b("D", (long)-4101060296095232522L, (long)var11);
        v8[(int)var0_3[15]] = fQ.b("D", (long)-4104085902923417419L, (long)var11);
        v8[(int)var0_3[19]] = fQ.b("D", (long)-4101834962592952453L, (long)var11);
        v8[(int)var0_3[11]] = fQ.b("D", (long)-4101685709451402883L, (long)var11);
        v8[(int)var0_3[25]] = fQ.b("D", (long)-4102195591469637493L, (long)var11);
        v8[(int)var0_3[26]] = fQ.b("D", (long)-4098641647610727259L, (long)var11);
        v8[(int)var0_3[5]] = fQ.b("D", (long)-4100692568823211294L, (long)var11);
        v8[(int)var0_3[14]] = fQ.b("D", (long)-4101788423168687606L, (long)var11);
        v8[(int)var0_3[37]] = fQ.b("D", (long)-4102960676834332097L, (long)var11);
        v8[(int)var0_3[16]] = fQ.b("D", (long)-4100851805412189271L, (long)var11);
        v8[(int)var0_3[6]] = fQ.b("D", (long)-4102271417811344914L, (long)var11);
        v8[(int)var0_3[1]] = fQ.b("D", (long)-4101876843136936873L, (long)var11);
        v8[(int)var0_3[28]] = fQ.b("D", (long)-4104307797673061071L, (long)var11);
        v8[(int)var0_3[42]] = fQ.b("D", (long)-4103636248526523075L, (long)var11);
        v8[(int)var0_3[34]] = fQ.b("D", (long)-4103437122658649983L, (long)var11);
        v8[(int)var0_3[39]] = fQ.b("D", (long)-4104946979622687406L, (long)var11);
        v8[(int)var0_3[9]] = fQ.b("D", (long)-4100558939093981842L, (long)var11);
        v8[(int)var0_3[45]] = fQ.b("D", (long)-4101015703975136043L, (long)var11);
        v8[(int)var0_3[47]] = fQ.b("D", (long)-4099199768111745075L, (long)var11);
        v8[(int)var0_3[20]] = fQ.b("D", (long)-4103930894430603299L, (long)var11);
        v8[(int)var0_3[44]] = fQ.b("D", (long)-4103513338332703375L, (long)var11);
        v8[(int)var0_3[43]] = fQ.b("D", (long)-4104496660326649728L, (long)var11);
        v8[(int)var0_3[36]] = fQ.b("D", (long)-4103723205979103498L, (long)var11);
        v8[(int)var0_3[12]] = fQ.b("D", (long)-4098452298980276787L, (long)var11);
        v8[(int)var0_3[21]] = fQ.b("D", (long)-4103778970641597738L, (long)var11);
        v8[(int)var0_3[10]] = fQ.b("D", (long)-4098366630654888181L, (long)var11);
        v8[(int)var0_3[31]] = fQ.b("D", (long)-4102375649275689572L, (long)var11);
        v8[(int)var0_3[41]] = fQ.b("D", (long)-4098510424567257138L, (long)var11);
        v8[(int)var0_3[7]] = fQ.b("D", (long)-4102482348556904999L, (long)var11);
        v8[(int)var0_3[30]] = fQ.b("D", (long)-4102128309576431615L, (long)var11);
        v8[(int)var0_3[38]] = fQ.b("D", (long)-4104846486269919777L, (long)var11);
        fQ.a = fQ.b("\u00d1", (Object)v8, (long)-4101578077397072682L, (long)var11);
    }

    @Override
    public void e(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x2774B8EDCCDCL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        fQ.b("\u00dd", (Object)this, (Object)objectArray2, (long)3993187573297645044L, (long)l);
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/fQ" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class n(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = fQ.m(l, l2);
            object = fQ.l[n];
            try {
                if (!(object instanceof String)) break block2;
                fQ.l[n] = clazz = Class.forName(m[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private static Field h(Class clazz, String string, Class clazz2) {
        Field field = fQ.g(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = fQ.h(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static Method h(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = fQ.g(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = fQ.h(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    private static void f() {
        Object[] objectArray = l;
        l[0] = "\u0013q\u0010\u0000\u0018.\u0005q\u0015Z\u000b9\u0012:\u0016\\\u0007-\u0003}\u0001KL??";
        objectArray[1] = "\u0002>Xs\u0017Vw\u001eS|\u0006\u0019\n\u0006@{\u000fPb";
        objectArray[2] = "\bA;Qk\r\u001eA>\u000bx\u001a\t\n=\rt\u000e\u0018M*\u001a?\u001b=";
        objectArray[3] = "\u001cZoE%4\u0017U~\nF9\u0002Xqas;\u0013KmMd6";
        objectArray[4] = "y\\UY2xy\\B\u0005>wc\u0017B\u001b>bdf\u0016An";
        objectArray[5] = Void.TYPE;
        fQ.m[5] = "java/lang/Void";
        objectArray[6] = "\n}\u001dk!\r\n}\n7-\u0002\u00106\n)-\u0017\u0017GZt|";
        objectArray[7] = "[H\u001fk5\u001bE@\u0005$W\u0007B]";
        objectArray[8] = "gJOy\u0002ilE^6cggNZl";
        objectArray[9] = Boolean.TYPE;
        fQ.m[9] = "java/lang/Boolean";
        objectArray[10] = "_\u0019m+r!*9f$cnK7m/g4?";
        objectArray[11] = "Scxe\u0014\u0014Xli*x\u0017VnkeT";
        objectArray[12] = "lq+\u0006^\u0003zq.\\M\u0014m:-ZA\u0000|}:M\n\u0017C";
        objectArray[13] = "I~\u0011<]*<^\u001a3Le]P\u00118H?)";
        objectArray[14] = "1\u001aX)Tr'\u001a]sGe0Q^uKq!\u0016Ib\u0000`\u001b";
        objectArray[15] = "\b\n!4z\b}**;kG\u001c$!0o\u001dh";
        objectArray[16] = "]YCaB\u000b]YT=N\u0004G\u0012T#N\u0011@c\u0005}\u001bZ";
        objectArray[17] = "(^\u0011sZ\u0016]~\u001a|KY<p\u0011wO\u0003H";
        objectArray[18] = "o}D\u0019\u0016Y\u001a]O\u0016\u0007\u0016{SD\u001d\u0003L\u000f";
        objectArray[19] = ">)|4f\u0015>)khj\u001a$bkvj\u000f#\u0013:(?J";
        objectArray[20] = "v\u0015j\u0002}6h\u001dpM\u00121n\u0015e\u0010";
        objectArray[21] = "\u001a{\u001e1p\bo[\u0015>aG\u000eU\u001e5e\u001dz";
        objectArray[22] = "\u0018\u001ea=Yt\u001a\u00147!$y\u0015\tj3s.L]1c$}\u0018\td-Eo\u0004\u001d2";
        objectArray[23] = "j{\byAvhq^e<{gl\u0003wk,>=[\"<\u007fjl\ri]mvx[";
        objectArray[24] = "8@\u0007DzN:JQX\u0007C5W\fJP\u001ce\nY&mA9P\u001aG\u007f]-\u0006";
        objectArray[25] = "N8\u001d&p?L2K:\r2C/\u0016(Ze\u001axL|\r6N/\u00186l$R;N";
        objectArray[26] = "OB\bwW?MH^k*2BU\u0003y}e\u001b\u0006^.*6OU\rgK$SA[";
        objectArray[27] = "l\u0010G9A4(\u0005\rf'gUR\u0017;_ddR\u0013&^\u000eo\b\u001a.M?o\f\u0007/'";
        objectArray[28] = "B_`_{P@Gf-t\"NZ?Bl\\S[$\u0013\u001d\u0019EAc\u0010'\u0013CU,-";
        objectArray[29] = " &]6Z\u0007\",\u000b*'\n-1V8p]tf\th'\u000e 1X&F\u001c<%\u000e";
        objectArray[30] = "n?u=9Jl5#!DGc(~3\u0013\u0010:}!cDCn(p-%Qr<&";
        objectArray[31] = "q\u0010Y)\"Ys\u001a\u000f5_T|\u0007R'\b\u0003%P\u000fq_Pq\u0007\\9>Bm\u0013\n";
        objectArray[32] = "\u0018\u0004MoTW\u001a\u000e\u001bs)Z\u0015\u0013Fa~\rLF\u001f3)^\u0018\u0013H\u007fHL\u0004\u0007\u001e";
        objectArray[33] = "\u0016%41!?\u0014/b-\\2\u001b2??\u000beBdbm\\6\u001621!=$\n&g";
        objectArray[34] = "c^$U:8aTrIG5nI/[\u0010a>\u001eq\u000fG1cI!E&#\u007f]w";
        objectArray[35] = "\u00127]O3\u001b\u0010=\u000bSN\u0016\u001f VA\u0019A@v\t\u0016N\u0012\u0012 X_/\u0000\u000e4\u000e";
        objectArray[36] = ",1oz1..;9fL#!&dt\u001btxp0\"L',&jj-502<";
        objectArray[37] = "8\u001dcF\u0005\u0007:\u00175Zx\n5\nhH/]l]4\u001dx\u000e8\nfV\u0019\u001c$\u001e0";
        objectArray[38] = "\u0019|\u0005\u0016(+Ud\u0017\u0011J-Be\t\u0016+ ^\u0003H\u00187-\u0019{\u0005\u001dz?%=\r\u0001&=\u001db\u0017\u0000%F";
        objectArray[39] = "\u0004zs\u0005\u0006]\u0006p%\u0019{P\tmx\u000b,\u0004S8#X{T\u0004mv\u0015\u001aF\u0018y ";
        objectArray[40] = "$[3?eS&Qe#\u0018^)L81O\tv\u001aga\u0018Z$L6/yH8X`";
        objectArray[41] = "\u0015\u0016.\u001d\u0013S\u0017\u001cx\u0001n^\u0018\u0001%\u00139\nCP{DnZ\u0015\u0001+\r\u000fH\t\u0015}";
        objectArray[42] = "_VPz\u0014\u0001]\\\u0006fi\fRA[t>[\r\u0017\u0005(i\b_AUj\b\u001aCU\u0003";
        objectArray[43] = "f{aKN8dq7W35kljEdb2:4\u001631fld[R#zx2";
        objectArray[44] = "q&)+?fs,\u007f7Bk|1\"%\u0015<%`zrBoq1,;#}m%z";
        objectArray[45] = "TNz\u007f{cVD,c\u0006nYYqqQ9\u0000\r+$\u0006jTY\u007fogxHM)";
        objectArray[46] = "a@jKWhcJ<W*elWaE}25\u00025\u0014*aaWo[Ks}C9";
        objectArray[47] = ")mg}\n^gya'xIqz?-\u0011EHt?=\u0015#(e%,\u0003\u001bw\u007f$/x";
        objectArray[48] = "u4X'*Qw>\u000e;W\\x#S)\u0000\u000b!v\u0006}WXu#]76Ji7\u000b";
        objectArray[49] = "l(I\u0015mvn\"\u001f\t\u0010{a?B\u001bG/1j\u001cI\u0010\u007fl?L\u0005qmp+\u001a";
        objectArray[50] = "r ,ZYAp*zF$L\u007f7'Ts\u001b&fz\b$Hr7)JEZn#\u007f";
        objectArray[51] = "De}\u0001\u001cA\u0012?'\u0014uCt2}\r\u001e\u0016\f\u007fx@\f*";
        objectArray[52] = "68c\u0017)\u0004v 5\u000fYQa?i\u000e5c7y6XY\u000fj%6Tc\u0005l1yi";
        objectArray[53] = "~Bp+d~zHp+\\}hk,\" \u0014~R.6-jcS5g\\(l_$;1dtM#Y";
        objectArray[54] = "\u007f\u000b\u001f(R0-U\u001f+;5\"\u0000Ezlb|S\u0010\u0016\u0001 )\u0013Q&A8\u007f\u000b";
        objectArray[55] = "%x\u0016F0\u007f'r@ZMr(o\u001dH\u001a%q:A\u001eMv%o\u0013V,d9{E";
        objectArray[56] = "'\u0003o\u001e\u0018\\%\u001bil\u0014.\u007fBc\u0011\u0000L\"\u001b!\u000f~";
        objectArray[57] = "\u0006\u001ex\u001fW\t\u0004\u0014.\u0003*\u0004\u000b\ts\u0011}SR_'E*\u0000\u0006\t}\u000fK\u0012\u001a\u001d+";
        objectArray[58] = "\u0000Ja\u000b\u0001U\u0002@7\u0017|X\r]j\u0005+\u000fT\u000b>P|\\\u0000]d\u001b\u001dN\u001cI2";
        objectArray[59] = "}Q\t F\r\u007f[_<;\u0000pF\u0002.lW)\u0011\\r;\u0004}F\f0Z\u0016aRZ";
        objectArray[60] = "A* \u001dx\fC v\u0001\u0005\u0001L=+\u0013RV\u0015iqC\u0005\u0005A=%\rd\u0017])s";
        objectArray[61] = "I\u0015n. QK\u001f82]\\D\u0002e \n\u000b\u001dV>u]XI\u0002k><JU\u0016=";
        objectArray[62] = "D&6|^n\u00003|#86}3{pW%\u0003.zk\u0006TF8`,\u0005nL>tc8";
        objectArray[63] = "2\u0017<&[N0\u001dj:&C?\u00007(q\u0014fTc}&G2\u000096GU.\u0014o";
        objectArray[64] = "-c'rt.ivm-\u0012}\u0014vj~}ejkke,\u0014*ciqi,uyhr\u0012";
        objectArray[65] = "@ K/7YB*\u001d3JTM7@!\u001d\u0000\u001db\u001e|JP@7N?+B\\#\u0018";
        objectArray[66] = "f` E\u001ev)}bZo}WvaY\u0000f)k`BQ\u0017l}z\u0005R-f{nJo";
        objectArray[67] = "=Y\f\u0007=\u0019?SZ\u001b@\u00140N\u0007\t\u0017Cn\u0018^]@\u0010=N\t\u0017!\u0002!Z_";
        objectArray[68] = "\u0003N:\u0013\u0003l\u0001Dl\u000f~a\u000eY1\u001d)6W\tjH~e\u0003Y?\u0003\u001fw\u001fMi";
        objectArray[69] = "!5\u0019]>)#?OAC$,\"\u0012S\u0014suuN\u0007C !\"\u001cM\"2=6J";
        objectArray[70] = "b\u000f0\u00064y`\u0005f\u001aIto\u0018;\b\u001e#6L`UIpb\u00185\u0016(b~\fc";
        objectArray[71] = "\\j\u0005vD`\u0013wGi5hm|DjZp\u0013aEq\u000b\u0001\u0007}TcG`\u0015a@55";
        objectArray[72] = "W1C|'PU;\u0015`Z]Z&Hr\r\n\u0003q\u0015%ZYW&Fl;KK2\u0010";
        objectArray[73] = "l$$Q in.rM]da3/_\n38cw\u000b]`l3!A<rp'w";
        objectArray[74] = "\u0004~c<\b]\u0006t5 uP\tih2\"\u0007P>4cuT\u0004if,\u0014F\u0018}0";
        objectArray[75] = "sSf-SbqY01.o~Dm#y8'\u00122q.ksDc=OyoP5";
        objectArray[76] = "\u000fC:\u0015\u0016\u000f\rIl\tk\u0002\u0002T1\u001b<U[\u0001lLk\u0006\u000fT?\u0005\n\u0014\u0013@i";
        objectArray[77] = "\u000e<S\u0004\u0007\u0010\f6\u0005\u0018z\u001d\u0003+X\n-IX\u007f\u0004Wz\u0019\u000e+V\u0014\u001b\u000b\u0012?\u0000";
        objectArray[78] = "-!w3\u0000\u0012/+!/}\u001f 6|=*Hyf#l}\u001b-6r#\u001c\t1\"$";
        objectArray[79] = "MhdH>^Ob2TCS@\u007foF\u0014\u0007\u0010(2\u001bCWM\u007faX\"EQk7";
        objectArray[80] = "N.\u007f|cSL$)`\u001e^C9trI\t\u001al &\u001eZN9zl\u007fHR-,";
        objectArray[81] = "M\u000b\u0003xv,O\u0001Ud\u000b!@\u001c\bv\\u\u001bI] \u000b%M\u001c\u0006hj7Q\bP";
        objectArray[82] = "Y8wd=\n[2!x@\u0007T/|j\u0017P\ry#=@\u0003Y/rt!\u0011E;$";
        objectArray[83] = "DWJpL\u001a\u0004O\u001ch<O\u0013P@iP}E\u0016\u00114<\u0011\u0018J\u001f3\u0006\u001b\u001e^P\u000e";
        objectArray[84] = "\u001f\u0013LJyP\u001d\u0019\u001aV\u0004]\u0012\u0004GDS\nKU\u001f\u0012\u0004Y\u001f\u0004IZeK\u0003\u0010\u001f";
        objectArray[85] = "|a0s\u000f%~kfor(qv;}%\u007f( n!r,|v5c\u0013>`bc";
        objectArray[86] = "^.:'\nP\\$l;w]S91) \t\tdk}wY^9?7\u0016KB-i";
        objectArray[87] = " \u001a\u0006\u0003 ~\"\u0010P\u001f]s-\r\r\r\n$t\\Y\\]w \r\u0003\u0013<e<\u0019U";
        objectArray[88] = "$Ff-]>&L01 3)Qm#wgy\u00043p 7$Qc=A%8E5";
        Object[] objectArray2 = objectArray;
        objectArray[89] = "\u0013Z{u5\u0017\u0011P-iH\u001a\u001eMp{\u001fMG\u001b--H\u001e\u0013M~e)\f\u000fY(";
    }

    @Override
    public void d(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = l ^ 0x7CF7D5B7D6BFL;
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l2;
        fQ.b("\u00dd", (Object)this, (Object)objectArray2, (long)3245403679120105367L, (long)l);
    }

    private static MethodHandle d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00c0' || c == '\u00ba' || c == 'D' || c == 'F') {
                field = fQ.o(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c0' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00ba' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'D' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = fQ.p(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == '\u00dd' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00d1' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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
        MethodHandle methodHandle = fQ.d(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    @bP
    public void a(bN bN2) {
        bN bN3;
        long l;
        block6: {
            block7: {
                l = k ^ 0x3B493AAB5C42L;
                long l2 = l ^ 0x47B4AEE33B0BL;
                CallSite callSite = fQ.b("\u00d1", (long)-3678190123182697318L, (long)l);
                try {
                    try {
                        try {
                            bN3 = bN2;
                            if (callSite != null) break block6;
                            if (fQ.b("\u00dd", (Object)bN3, (Object)new Object[0], (long)-3680645008226996161L, (long)l) == null) break block7;
                        }
                        catch (MatchException matchException) {
                            throw fQ.b("\u00d1", (Object)matchException, (long)-3675884353874547475L, (long)l);
                        }
                        Object[] objectArray = new Object[2];
                        objectArray[1] = l2;
                        objectArray[0] = fQ.b("\u00dd", (Object)bN2, (Object)new Object[0], (long)-3680645008226996161L, (long)l);
                        if (fQ.b("\u00dd", (Object)this, (Object)objectArray, (long)-3681045282648652838L, (long)l) == false) break block7;
                    }
                    catch (MatchException matchException) {
                        throw fQ.b("\u00d1", (Object)matchException, (long)-3675884353874547475L, (long)l);
                    }
                    fQ.b("\u00dd", (Object)bN2, (Object)new Object[]{true}, (long)-3680863654681735744L, (long)l);
                }
                catch (MatchException matchException) {
                    throw fQ.b("\u00d1", (Object)matchException, (long)-3675884353874547475L, (long)l);
                }
            }
            bN3 = bN2;
        }
        fQ.b("\u00dd", (Object)bN3, (Object)new Object[0], (long)-3675706761656821692L, (long)l);
    }

    public boolean a(Object[] objectArray) {
        class_2248 class_22482 = (class_2248)objectArray[0];
        long l = (Long)objectArray[1];
        l = k ^ l;
        return (boolean)fQ.b("\u00dd", (Object)a, (Object)class_22482, (long)7440165316732865706L, (long)l);
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    @bP
    public void a(a4 a42) {
        long l = k ^ 0x1D44C9E799D1L;
        try {
            if (fQ.b("\u00dd", (Object)((Boolean)((Object)fQ.b("\u00dd", (Object)this.d, (long)677144301827119404L, (long)l))), (long)676294235601391521L, (long)l) != false) {
                fQ.b("\u00dd", (Object)a42, (Object)new Object[0], (long)679588488722341335L, (long)l);
            }
        }
        catch (MatchException matchException) {
            throw fQ.b("\u00d1", (Object)matchException, (long)679907934715046270L, (long)l);
        }
    }

    private static int m(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (m[n3] != null) {
            return n3;
        }
        Object object = fQ.l[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 22;
            case 1 -> 58;
            case 2 -> 40;
            case 3 -> 37;
            case 4 -> 30;
            case 5 -> 3;
            case 6 -> 26;
            case 7 -> 50;
            case 8 -> 61;
            case 9 -> 5;
            case 10 -> 10;
            case 11 -> 8;
            case 12 -> 20;
            case 13 -> 46;
            case 14 -> 4;
            case 15 -> 48;
            case 16 -> 36;
            case 17 -> 1;
            case 18 -> 38;
            case 19 -> 43;
            case 20 -> 33;
            case 21 -> 44;
            case 22 -> 49;
            case 23 -> 25;
            case 24 -> 19;
            case 25 -> 16;
            case 26 -> 0;
            case 27 -> 42;
            case 28 -> 51;
            case 29 -> 18;
            case 30 -> 9;
            case 31 -> 14;
            case 32 -> 53;
            case 33 -> 27;
            case 34 -> 34;
            case 35 -> 12;
            case 36 -> 52;
            case 37 -> 28;
            case 38 -> 62;
            case 39 -> 55;
            case 40 -> 2;
            case 41 -> 47;
            case 42 -> 6;
            case 43 -> 57;
            case 44 -> 41;
            case 45 -> 32;
            case 46 -> 21;
            case 47 -> 31;
            case 48 -> 15;
            case 49 -> 13;
            case 50 -> 24;
            case 51 -> 60;
            case 52 -> 39;
            case 53 -> 17;
            case 54 -> 56;
            case 55 -> 59;
            case 56 -> 35;
            case 57 -> 54;
            case 58 -> 45;
            case 59 -> 11;
            case 60 -> 63;
            case 61 -> 23;
            case 62 -> 7;
            default -> 29;
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
        fQ.m[n3] = new String(cArray);
        return n3;
    }

    private static Field o(long l, long l2) {
        int n = fQ.m(l, l2);
        Object object = fQ.l[n];
        if (object instanceof String) {
            String string = m[n];
            int n2 = string.indexOf(8);
            Class clazz = fQ.n(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = fQ.n(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = fQ.g(clazz3, string2, clazz2)) != null) {
                    fQ.l[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = fQ.h(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        fQ.l[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = fQ.n(577883752851626L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static Method p(long l, long l2) {
        int n = fQ.m(l, l2);
        Object object = fQ.l[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = m[n];
                int n3 = string2.indexOf(8);
                clazz3 = fQ.n(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = fQ.n(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = fQ.g(clazz, string, clazz2, n2, classArray2)) != null) {
                        fQ.l[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = fQ.n(577883752851626L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = fQ.h(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        fQ.l[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = fQ.n(577883752851626L, 0L);
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

    public void j(Object[] objectArray) {
        CallSite callSite;
        long l;
        block2: {
            block3: {
                l = (Long)objectArray[0];
                l = k ^ l;
                CallSite callSite2 = fQ.b("\u00d1", (long)7714466119062647649L, (long)l);
                try {
                    callSite = fQ.b("\u00c0", (Object)b, (long)7713809962235367273L, (long)l);
                    if (callSite2 != null) break block2;
                    if (callSite != null) break block3;
                }
                catch (MatchException matchException) {
                    throw fQ.b("\u00d1", (Object)matchException, (long)7712301362125441814L, (long)l);
                }
                return;
            }
            fQ.b("\u00dd", (Object)fQ.b("\u00c0", (Object)b, (long)7713809962235367273L, (long)l), (long)7713648186004211653L, (long)l);
            callSite = fQ.b("\u00c0", (Object)b, (long)7713809962235367273L, (long)l);
        }
        fQ.b("\u00dd", (Object)callSite, (long)7716251965990122668L, (long)l);
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(fQ.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


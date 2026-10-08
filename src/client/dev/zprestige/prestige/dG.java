/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1657
 *  net.minecraft.class_2338
 *  net.minecraft.class_239
 *  net.minecraft.class_243
 *  net.minecraft.class_3959
 *  net.minecraft.class_3959$class_242
 *  net.minecraft.class_3959$class_3960
 *  net.minecraft.class_3965
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.cz_0;
import dev.zprestige.prestige.dC;
import dev.zprestige.prestige.hc;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_2338;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_3959;
import net.minecraft.class_3965;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class dG
implements cz_0 {
    private static final long a = hc.a(7361658059797468102L, 7859688574070666492L, MethodHandles.lookup().lookupClass()).a(76681233032549L);
    private static final Object[] c = new Object[98];
    private static final String[] d = new String[98];

    static {
        dG.a();
    }

    private static int e(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (d[n3] != null) {
            return n3;
        }
        Object object = c[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 39;
            case 1 -> 22;
            case 2 -> 44;
            case 3 -> 30;
            case 4 -> 52;
            case 5 -> 53;
            case 6 -> 15;
            case 7 -> 36;
            case 8 -> 4;
            case 9 -> 62;
            case 10 -> 63;
            case 11 -> 16;
            case 12 -> 7;
            case 13 -> 46;
            case 14 -> 28;
            case 15 -> 19;
            case 16 -> 40;
            case 17 -> 60;
            case 18 -> 42;
            case 19 -> 11;
            case 20 -> 9;
            case 21 -> 50;
            case 22 -> 0;
            case 23 -> 61;
            case 24 -> 3;
            case 25 -> 24;
            case 26 -> 51;
            case 27 -> 27;
            case 28 -> 12;
            case 29 -> 29;
            case 30 -> 21;
            case 31 -> 5;
            case 32 -> 2;
            case 33 -> 33;
            case 34 -> 48;
            case 35 -> 25;
            case 36 -> 32;
            case 37 -> 56;
            case 38 -> 17;
            case 39 -> 59;
            case 40 -> 1;
            case 41 -> 34;
            case 42 -> 38;
            case 43 -> 13;
            case 44 -> 8;
            case 45 -> 58;
            case 46 -> 49;
            case 47 -> 14;
            case 48 -> 54;
            case 49 -> 18;
            case 50 -> 6;
            case 51 -> 55;
            case 52 -> 43;
            case 53 -> 26;
            case 54 -> 31;
            case 55 -> 41;
            case 56 -> 47;
            case 57 -> 23;
            case 58 -> 57;
            case 59 -> 45;
            case 60 -> 37;
            case 61 -> 10;
            case 62 -> 20;
            default -> 35;
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
        dG.d[n3] = new String(cArray);
        return n3;
    }

    public static boolean e(Object[] objectArray) {
        reference v5;
        block8: {
            block7: {
                CallSite callSite;
                long l;
                block6: {
                    dC dC2 = (dC)objectArray[0];
                    float f = ((Float)objectArray[1]).floatValue();
                    float f10 = ((Float)objectArray[2]).floatValue();
                    float f11 = ((Float)objectArray[3]).floatValue();
                    l = (Long)objectArray[4];
                    long l2 = l = a ^ l;
                    long l3 = l2 ^ 0x3A8885E7207AL;
                    long l4 = l2 ^ 0x224B649ED18L;
                    long l5 = l2 ^ 0x59DC8CC50F53L;
                    Object[] objectArray2 = new Object[3];
                    objectArray2[2] = l3;
                    objectArray2[1] = Float.valueOf(1.0f);
                    objectArray2[0] = Float.valueOf(0.5f);
                    Object[] objectArray3 = new Object[4];
                    objectArray3[3] = l5;
                    objectArray3[2] = Float.valueOf((float)(dG.a("p", (Object)dG.a("\u00eb", (long)8729164684131048795L, (long)l), (Object)new Object[0], (long)8730060106407270052L, (long)l) * (1.1f - f) * 7.0f / f11 * dG.a("c", (Object)objectArray2, (long)8728141616785032832L, (long)l)));
                    objectArray3[1] = Float.valueOf((float)(dG.a("p", (Object)dC2, (Object)new Object[0], (long)8728062013597059458L, (long)l) + f10 / 2.0f));
                    objectArray3[0] = Float.valueOf((float)dG.a("p", (Object)dG.a("\u00e7", (Object)b, (long)8735912765638476218L, (long)l), (long)8728914405020224896L, (long)l));
                    CallSite callSite2 = dG.a("c", (Object)objectArray3, (long)8729047669699253240L, (long)l);
                    CallSite callSite3 = dG.a("c", (long)8729823701465198605L, (long)l);
                    Object[] objectArray4 = new Object[2];
                    objectArray4[1] = l4;
                    objectArray4[0] = new dC((float)callSite2, (float)dG.a("p", (Object)dG.a("\u00e7", (Object)b, (long)8735912765638476218L, (long)l), (long)8728491021140835173L, (long)l));
                    dG.a("c", (Object)objectArray4, (long)8735816233184459835L, (long)l);
                    callSite = callSite3;
                    try {
                        try {
                            reference v5 = dG.a("p", (Object)dG.a("\u00e7", (Object)b, (long)8735912765638476218L, (long)l), (long)8728914405020224896L, (long)l) - 5.0f - dG.a("p", (Object)dC2, (Object)new Object[0], (long)8728062013597059458L, (long)l);
                            v5 = v5 == 0 ? 0 : (v5 < 0 ? -1 : 1);
                            if (callSite != null) break block6;
                            if (v5 >= 0) break block7;
                        }
                        catch (MatchException matchException) {
                            throw dG.a("c", (Object)matchException, (long)8729597698608734317L, (long)l);
                        }
                        reference v5 = dG.a("p", (Object)dG.a("\u00e7", (Object)b, (long)8735912765638476218L, (long)l), (long)8728914405020224896L, (long)l) + 5.0f - dG.a("p", (Object)dC2, (Object)new Object[0], (long)8728062013597059458L, (long)l);
                        v5 = v5 == 0 ? 0 : (v5 > 0 ? 1 : -1);
                    }
                    catch (MatchException matchException) {
                        throw dG.a("c", (Object)matchException, (long)8729597698608734317L, (long)l);
                    }
                }
                try {
                    if (callSite != null) break block8;
                    if (v5 <= 0) break block7;
                }
                catch (MatchException matchException) {
                    throw dG.a("c", (Object)matchException, (long)8729597698608734317L, (long)l);
                }
                v5 = (reference)1;
                break block8;
            }
            v5 = (reference)0;
        }
        return (boolean)v5;
    }

    public static dC e(Object[] objectArray) {
        Object object;
        CallSite callSite;
        float f;
        long l;
        long l2;
        float f10;
        float f11;
        float f12;
        block2: {
            block3: {
                f12 = ((Float)objectArray[0]).floatValue();
                f11 = ((Float)objectArray[1]).floatValue();
                float f13 = ((Float)objectArray[2]).floatValue();
                float f14 = ((Float)objectArray[3]).floatValue();
                float f15 = ((Float)objectArray[4]).floatValue();
                f10 = ((Float)objectArray[5]).floatValue();
                l2 = (Long)objectArray[6];
                l = (l2 = a ^ l2) ^ 0x539996DF2573L;
                CallSite callSite2 = dG.a("p", (Object)dG.a("\u00e7", (Object)b, (long)-4266843110484788145L, (long)l2), (long)-4264055439288357939L, (long)l2);
                double d = (double)f13 - dG.a("\u00e7", (Object)callSite2, (long)-4261985942637925583L, (long)l2);
                double d10 = (double)f14 - dG.a("\u00e7", (Object)callSite2, (long)-4264989354035258829L, (long)l2);
                double d11 = (double)f15 - dG.a("\u00e7", (Object)callSite2, (long)-4263745036368972226L, (long)l2);
                CallSite callSite3 = dG.a("c", (double)(d * d + d11 * d11), (long)-4265634144360648025L, (long)l2);
                CallSite callSite4 = dG.a("c", (long)-4263920611886379528L, (long)l2);
                float f16 = (float)dG.a("c", (double)dG.a("c", (double)d11, (double)d, (long)-4265401591892048173L, (long)l2), (long)-4262668962078168469L, (long)l2) - 90.0f;
                f = (float)(-dG.a("c", (double)dG.a("c", (double)d10, (double)callSite3, (long)-4265401591892048173L, (long)l2), (long)-4262668962078168469L, (long)l2));
                Object[] objectArray2 = new Object[2];
                objectArray2[1] = l;
                objectArray2[0] = Float.valueOf(f16 - f12);
                callSite = dG.a("c", (Object)objectArray2, (long)-4264715122302262799L, (long)l2);
                try {
                    reference cfr_temp_0 = dG.a("c", (float)callSite, (long)-4265542729629991435L, (long)l2) - f10;
                    object = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 > 0 ? 1 : -1);
                    if (callSite4 != null) break block2;
                    if (object <= 0) break block3;
                }
                catch (MatchException matchException) {
                    throw dG.a("c", (Object)matchException, (long)-4264679637227823720L, (long)l2);
                }
                object = 1;
                break block2;
            }
            object = 0;
        }
        Object object2 = object;
        callSite = dG.a("c", (float)callSite, (float)(-f10), (float)f10, (long)-4265393893568936404L, (long)l2);
        float f17 = f12 + callSite;
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l;
        objectArray3[0] = Float.valueOf(f - f11);
        dC dC2 = new dC(f17, f11 + dG.a("c", (Object)objectArray3, (long)-4264715122302262799L, (long)l2));
        dG.a("p", (Object)dC2, (Object)new Object[]{(boolean)object2}, (long)-4264394973954362504L, (long)l2);
        return dC2;
    }

    public static void b(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        float f10 = ((Float)objectArray[1]).floatValue();
        long l = (Long)objectArray[2];
        long l2 = (l = a ^ l) ^ 0x4044DDC361A9L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = new dC(f, f10);
        dG.a("c", (Object)objectArray2, (long)-753621813866106742L, (long)l);
    }

    private static class_243 b(Object[] objectArray) {
        class_1657 class_16572 = (class_1657)objectArray[0];
        long l = (Long)objectArray[1];
        l = a ^ l;
        float f = (float)Math.PI / 180;
        float f10 = (float)Math.PI;
        CallSite callSite = dG.a("c", (double)((double)(-dG.a("p", (Object)class_16572, (long)-5899974792561623737L, (long)l) * f - f10)), (long)-5908196612844998296L, (long)l);
        CallSite callSite2 = dG.a("c", (double)((double)(-dG.a("p", (Object)class_16572, (long)-5899974792561623737L, (long)l) * f - f10)), (long)-5901516208956673449L, (long)l);
        CallSite callSite3 = -dG.a("c", (double)((double)(-dG.a("p", (Object)class_16572, (long)-5900937593428925946L, (long)l) * f)), (long)-5908196612844998296L, (long)l);
        CallSite callSite4 = dG.a("c", (double)((double)(-dG.a("p", (Object)class_16572, (long)-5900937593428925946L, (long)l) * f)), (long)-5901516208956673449L, (long)l);
        return dG.a("p", (Object)new class_243((double)(callSite2 * callSite3), (double)callSite4, (double)(callSite * callSite3)), (long)-5900996349759739027L, (long)l);
    }

    public static class_239 b(Object[] objectArray) {
        dC dC2 = (dC)objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        long l = (Long)objectArray[2];
        long l2 = (l = a ^ l) ^ 0x7AF447602287L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = dC2;
        return dG.a("p", (Object)dG.a("\u00e7", (Object)b, (long)-5885222874043601141L, (long)l), (Object)new class_3959((class_243)dG.a("p", (Object)dG.a("\u00e7", (Object)b, (long)-5887773837416376628L, (long)l), (long)-5886129924851678898L, (long)l), (class_243)dG.a("p", (Object)dG.a("p", (Object)dG.a("c", (Object)objectArray2, (long)-5886803203312730992L, (long)l), (double)f, (long)-5885768067140639072L, (long)l), (Object)dG.a("p", (Object)dG.a("\u00e7", (Object)b, (long)-5887773837416376628L, (long)l), (long)-5886129924851678898L, (long)l), (long)-5887702519976752566L, (long)l), (class_3959.class_3960)dG.a("\u00eb", (long)-5887663752966820171L, (long)l), (class_3959.class_242)dG.a("\u00eb", (long)-5884231413057428479L, (long)l), (class_1297)dG.a("\u00e7", (Object)b, (long)-5887773837416376628L, (long)l)), (long)-5884957362205798782L, (long)l);
    }

    public static float b(Object[] objectArray) {
        float f;
        block7: {
            float f10;
            float f11;
            block5: {
                CallSite callSite;
                long l;
                block6: {
                    float f12 = ((Float)objectArray[0]).floatValue();
                    l = (Long)objectArray[1];
                    l = a ^ l;
                    f11 = f12 % 360.0f;
                    callSite = dG.a("c", (long)913307421990913415L, (long)l);
                    try {
                        float f13 = f11 - 180.0f;
                        f10 = f13 == 0.0f ? 0 : (f13 > 0.0f ? 1 : -1);
                        if (callSite != null) break block5;
                        if (f10 < 0) break block6;
                    }
                    catch (MatchException matchException) {
                        throw dG.a("c", (Object)matchException, (long)914207628409001447L, (long)l);
                    }
                    f11 -= 360.0f;
                }
                try {
                    f = f11;
                    if (callSite != null) break block7;
                    float f14 = f - -180.0f;
                    f10 = f14 == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1);
                }
                catch (MatchException matchException) {
                    throw dG.a("c", (Object)matchException, (long)914207628409001447L, (long)l);
                }
            }
            if (f10 < 0) {
                f11 += 360.0f;
            }
            f = f11;
        }
        return f;
    }

    public static dC b(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        float f10 = ((Float)objectArray[1]).floatValue();
        float f11 = ((Float)objectArray[2]).floatValue();
        long l = (Long)objectArray[3];
        long l2 = (l = a ^ l) ^ 0xCB6F88FA984L;
        CallSite callSite = dG.a("p", (Object)dG.a("\u00e7", (Object)b, (long)5205738833721405624L, (long)l), (long)5198375544868415290L, (long)l);
        double d = (double)f - dG.a("\u00e7", (Object)callSite, (long)5200880708092635078L, (long)l);
        double d10 = (double)f10 - dG.a("\u00e7", (Object)callSite, (long)5204166556022953668L, (long)l);
        double d11 = (double)f11 - dG.a("\u00e7", (Object)callSite, (long)5198136201629203145L, (long)l);
        CallSite callSite2 = dG.a("c", (double)(d * d + d11 * d11), (long)5204528909832142416L, (long)l);
        float f12 = (float)dG.a("c", (double)dG.a("c", (double)d11, (double)d, (long)5204297456307866148L, (long)l), (long)5197340915121776284L, (long)l) - 90.0f;
        float f13 = (float)(-dG.a("c", (double)dG.a("c", (double)d10, (double)callSite2, (long)5204297456307866148L, (long)l), (long)5197340915121776284L, (long)l));
        float[] fArray = new float[]{(float)dG.a("p", (Object)dG.a("\u00e7", (Object)b, (long)5205738833721405624L, (long)l), (long)5197462813227908226L, (long)l), (float)dG.a("p", (Object)dG.a("\u00e7", (Object)b, (long)5205738833721405624L, (long)l), (long)5198167539008146023L, (long)l)};
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = Float.valueOf(f12 - fArray[0]);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l2;
        objectArray3[0] = Float.valueOf(f13 - fArray[1]);
        return new dC(fArray[0] + dG.a("c", (Object)objectArray2, (long)5199387209043504390L, (long)l), fArray[1] + dG.a("c", (Object)objectArray3, (long)5199387209043504390L, (long)l));
    }

    private static MethodHandle b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00e7' || c == '\u00d5' || c == '\u00eb' || c == 'B') {
                field = dG.g(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00e7' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00d5' ? lookup.findSetter(clazz, string2, clazz2) : (c == '\u00eb' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = dG.h(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'p' ? lookup.findVirtual(clazz, string3, methodType2) : (c == 'c' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
            }
            return MethodHandles.dropArguments(methodHandle, methodType.parameterCount() - 2, new Class[]{Long.TYPE, Long.TYPE});
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(exception.getClass().getName()).append(" : ").append(field != null ? field.toString() : (method != null ? method.toString() : " null ")).append(" : ").append(exception.toString());
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public static class_3965 b(Object[] objectArray) {
        class_2338 class_23382 = (class_2338)objectArray[0];
        class_1657 class_16572 = (class_1657)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = (l = a ^ l) ^ 0x39165C5FFE72L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = class_16572;
        return dG.a("p", (Object)dG.a("\u00e7", (Object)b, (long)-4794077870198244320L, (long)l), (Object)dG.a("p", (Object)class_16572, (long)-4798742076539234465L, (long)l), (Object)dG.a("p", (Object)dG.a("p", (Object)dG.a("c", (Object)objectArray2, (long)-4792326930713305440L, (long)l), (double)6.0, (long)-4793252456050215541L, (long)l), (Object)dG.a("p", (Object)class_16572, (long)-4798742076539234465L, (long)l), (long)-4800324103158883999L, (long)l), (Object)class_23382, (Object)dG.a("c", (long)-4793592261896658829L, (long)l), (Object)dG.a("p", (Object)dG.a("\u00e7", (Object)b, (long)-4794077870198244320L, (long)l), (Object)class_23382, (long)-4791974594497175229L, (long)l), (long)-4793997047862943579L, (long)l);
    }

    public static boolean b(Object[] objectArray) {
        reference v0;
        block8: {
            block7: {
                CallSite callSite;
                long l;
                block6: {
                    dC dC2 = (dC)objectArray[0];
                    l = (Long)objectArray[1];
                    l = a ^ l;
                    callSite = dG.a("c", (long)1122744416159925951L, (long)l);
                    try {
                        try {
                            reference v0 = dG.a("c", (float)(dG.a("p", (Object)dG.a("\u00e7", (Object)b, (long)1120947836795811592L, (long)l), (long)1121694382867561266L, (long)l) - dG.a("p", (Object)dC2, (Object)new Object[0], (long)1121981616991960880L, (long)l)), (long)1119979787724043954L, (long)l) - 10.0f;
                            v0 = v0 == 0 ? 0 : (v0 < 0 ? -1 : 1);
                            if (callSite != null) break block6;
                            if (v0 >= 0) break block7;
                        }
                        catch (MatchException matchException) {
                            throw dG.a("c", (Object)matchException, (long)1123534468485633759L, (long)l);
                        }
                        reference v0 = dG.a("c", (float)(dG.a("p", (Object)dG.a("\u00e7", (Object)b, (long)1120947836795811592L, (long)l), (long)1122397038404914647L, (long)l) - dG.a("p", (Object)dC2, (Object)new Object[0], (long)1120148660546765104L, (long)l)), (long)1119979787724043954L, (long)l) - 10.0f;
                        v0 = v0 == 0 ? 0 : (v0 < 0 ? -1 : 1);
                    }
                    catch (MatchException matchException) {
                        throw dG.a("c", (Object)matchException, (long)1123534468485633759L, (long)l);
                    }
                }
                try {
                    if (callSite != null) break block8;
                    if (v0 >= 0) break block7;
                }
                catch (MatchException matchException) {
                    throw dG.a("c", (Object)matchException, (long)1123534468485633759L, (long)l);
                }
                v0 = (reference)1;
                break block8;
            }
            v0 = (reference)0;
        }
        return (boolean)v0;
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = dG.b(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public static float c(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        float f10 = ((Float)objectArray[1]).floatValue();
        float f11 = ((Float)objectArray[2]).floatValue();
        long l = (Long)objectArray[3];
        long l2 = (l = a ^ l) ^ 0x338EF97328CAL;
        float f12 = f;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = l2;
        objectArray2[2] = Float.valueOf(1.0f);
        objectArray2[1] = Float.valueOf(0.0f);
        objectArray2[0] = Float.valueOf(f11);
        f12 -= (f12 - f10) * dG.a("c", (Object)objectArray2, (long)-7249063696727195039L, (long)l);
        return f12;
    }

    public static dC c(Object[] objectArray) {
        dC dC2 = (dC)objectArray[0];
        class_243 class_2432 = (class_243)objectArray[1];
        float f = ((Float)objectArray[2]).floatValue();
        long l = (Long)objectArray[3];
        long l2 = (l = a ^ l) ^ 0x641780F48575L;
        Object[] objectArray2 = new Object[7];
        objectArray2[6] = l2;
        objectArray2[5] = Float.valueOf(f);
        objectArray2[4] = Float.valueOf((float)dG.a("\u00e7", (Object)class_2432, (long)-6004090513219969465L, (long)l));
        objectArray2[3] = Float.valueOf((float)dG.a("\u00e7", (Object)class_2432, (long)-6001403019919838646L, (long)l));
        objectArray2[2] = Float.valueOf((float)dG.a("\u00e7", (Object)class_2432, (long)-6006835044754865336L, (long)l));
        objectArray2[1] = Float.valueOf((float)dG.a("p", (Object)dC2, (Object)new Object[0], (long)-6001657211563695602L, (long)l));
        objectArray2[0] = Float.valueOf((float)dG.a("p", (Object)dC2, (Object)new Object[0], (long)-6004334576287982578L, (long)l));
        return dG.a("c", (Object)objectArray2, (long)-6004755132100289466L, (long)l);
    }

    public static boolean c(Object[] objectArray) {
        reference v7;
        block18: {
            block15: {
                CallSite callSite;
                long l;
                block17: {
                    dC dC2;
                    block16: {
                        block14: {
                            dC2 = (dC)objectArray[0];
                            float f = ((Float)objectArray[1]).floatValue();
                            float f10 = ((Float)objectArray[2]).floatValue();
                            float f11 = ((Float)objectArray[3]).floatValue();
                            l = (Long)objectArray[4];
                            long l2 = l = a ^ l;
                            long l3 = l2 ^ 0x5703379567DEL;
                            long l4 = l2 ^ 0x6FAF043BAABCL;
                            long l5 = l2 ^ 0x34573EB748F7L;
                            Object[] objectArray2 = new Object[3];
                            objectArray2[2] = l3;
                            objectArray2[1] = Float.valueOf(1.0f);
                            objectArray2[0] = Float.valueOf(0.5f);
                            Object[] objectArray3 = new Object[4];
                            objectArray3[3] = l5;
                            objectArray3[2] = Float.valueOf((float)(dG.a("p", (Object)dG.a("\u00eb", (long)4503692588816423679L, (long)l), (Object)new Object[0], (long)4504456018151117056L, (long)l) * (1.1f - f) * 7.0f / f11 * dG.a("c", (Object)objectArray2, (long)4505001527172448548L, (long)l)));
                            objectArray3[1] = Float.valueOf((float)(dG.a("p", (Object)dC2, (Object)new Object[0], (long)4504764713627471398L, (long)l) + f10));
                            objectArray3[0] = Float.valueOf((float)dG.a("p", (Object)dG.a("\u00e7", (Object)b, (long)4510460492197447198L, (long)l), (long)4505632542236805668L, (long)l));
                            CallSite callSite2 = dG.a("c", (Object)objectArray3, (long)4505749244972520540L, (long)l);
                            CallSite callSite3 = dG.a("c", (long)4504441771000608681L, (long)l);
                            Object[] objectArray4 = new Object[3];
                            objectArray4[2] = l3;
                            objectArray4[1] = Float.valueOf(1.0f);
                            objectArray4[0] = Float.valueOf(0.5f);
                            Object[] objectArray5 = new Object[4];
                            objectArray5[3] = l5;
                            objectArray5[2] = Float.valueOf((float)(dG.a("p", (Object)dG.a("\u00eb", (long)4503692588816423679L, (long)l), (Object)new Object[0], (long)4504456018151117056L, (long)l) * (1.1f - f) * 7.0f / f11 * dG.a("c", (Object)objectArray4, (long)4505001527172448548L, (long)l)));
                            objectArray5[1] = Float.valueOf((float)(dG.a("p", (Object)dC2, (Object)new Object[0], (long)4511945678060859430L, (long)l) + f10 / 2.0f));
                            objectArray5[0] = Float.valueOf((float)dG.a("p", (Object)dG.a("\u00e7", (Object)b, (long)4510460492197447198L, (long)l), (long)4505211361734393025L, (long)l));
                            CallSite callSite4 = dG.a("c", (Object)objectArray5, (long)4505749244972520540L, (long)l);
                            Object[] objectArray6 = new Object[2];
                            objectArray6[1] = l4;
                            objectArray6[0] = new dC((float)callSite2, (float)callSite4);
                            dG.a("c", (Object)objectArray6, (long)4512526699052579743L, (long)l);
                            callSite = callSite3;
                            try {
                                try {
                                    reference v7 = dG.a("p", (Object)dG.a("\u00e7", (Object)b, (long)4510460492197447198L, (long)l), (long)4505632542236805668L, (long)l) - 5.0f - dG.a("p", (Object)dC2, (Object)new Object[0], (long)4504764713627471398L, (long)l);
                                    v7 = v7 == 0 ? 0 : (v7 < 0 ? -1 : 1);
                                    if (callSite != null) break block14;
                                    if (v7 >= 0) break block15;
                                }
                                catch (MatchException matchException) {
                                    throw dG.a("c", (Object)matchException, (long)4504073863496624073L, (long)l);
                                }
                                reference v7 = dG.a("p", (Object)dG.a("\u00e7", (Object)b, (long)4510460492197447198L, (long)l), (long)4505632542236805668L, (long)l) + 5.0f - dG.a("p", (Object)dC2, (Object)new Object[0], (long)4504764713627471398L, (long)l);
                                v7 = v7 == 0 ? 0 : (v7 > 0 ? 1 : -1);
                            }
                            catch (MatchException matchException) {
                                throw dG.a("c", (Object)matchException, (long)4504073863496624073L, (long)l);
                            }
                        }
                        try {
                            try {
                                if (callSite != null) break block16;
                                if (v7 <= 0) break block15;
                            }
                            catch (MatchException matchException) {
                                throw dG.a("c", (Object)matchException, (long)4504073863496624073L, (long)l);
                            }
                            reference v7 = dG.a("p", (Object)dG.a("\u00e7", (Object)b, (long)4510460492197447198L, (long)l), (long)4505211361734393025L, (long)l) - 5.0f - dG.a("p", (Object)dC2, (Object)new Object[0], (long)4511945678060859430L, (long)l);
                            v7 = v7 == 0 ? 0 : (v7 < 0 ? -1 : 1);
                        }
                        catch (MatchException matchException) {
                            throw dG.a("c", (Object)matchException, (long)4504073863496624073L, (long)l);
                        }
                    }
                    try {
                        try {
                            if (callSite != null) break block17;
                            if (v7 >= 0) break block15;
                        }
                        catch (MatchException matchException) {
                            throw dG.a("c", (Object)matchException, (long)4504073863496624073L, (long)l);
                        }
                        reference v7 = dG.a("p", (Object)dG.a("\u00e7", (Object)b, (long)4510460492197447198L, (long)l), (long)4505211361734393025L, (long)l) + 5.0f - dG.a("p", (Object)dC2, (Object)new Object[0], (long)4511945678060859430L, (long)l);
                        v7 = v7 == 0 ? 0 : (v7 > 0 ? 1 : -1);
                    }
                    catch (MatchException matchException) {
                        throw dG.a("c", (Object)matchException, (long)4504073863496624073L, (long)l);
                    }
                }
                try {
                    if (callSite != null) break block18;
                    if (v7 <= 0) break block15;
                }
                catch (MatchException matchException) {
                    throw dG.a("c", (Object)matchException, (long)4504073863496624073L, (long)l);
                }
                v7 = (reference)1;
                break block18;
            }
            v7 = (reference)0;
        }
        return (boolean)v7;
    }

    private static Field c(Class clazz, String string, Class clazz2) {
        for (Field field : clazz.getDeclaredFields()) {
            if (!field.getName().equals(string) || field.getType() != clazz2) continue;
            return field;
        }
        return null;
    }

    public static class_3965 c(Object[] objectArray) {
        class_2338 class_23382 = (class_2338)objectArray[0];
        dC dC2 = (dC)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = (l = a ^ l) ^ 0xB222F65B229L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = dC2;
        return dG.a("p", (Object)dG.a("\u00e7", (Object)b, (long)4538798483576274853L, (long)l), (Object)dG.a("p", (Object)dG.a("\u00e7", (Object)b, (long)4531779242118137442L, (long)l), (long)4539124653170282976L, (long)l), (Object)dG.a("p", (Object)dG.a("p", (Object)dG.a("c", (Object)objectArray2, (long)4531657495313919038L, (long)l), (double)6.0, (long)4539625086926927374L, (long)l), (Object)dG.a("p", (Object)dG.a("\u00e7", (Object)b, (long)4531779242118137442L, (long)l), (long)4539124653170282976L, (long)l), (long)4531989115471174372L, (long)l), (Object)class_23382, (Object)dG.a("c", (long)4538699902497465334L, (long)l), (Object)dG.a("p", (Object)dG.a("\u00e7", (Object)b, (long)4538798483576274853L, (long)l), (Object)class_23382, (long)4538065749187240646L, (long)l), (long)4538858397725565728L, (long)l);
    }

    private static Method c(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
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

    private static Method h(long l, long l2) {
        int n = dG.e(l, l2);
        Object object = c[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = d[n];
                int n3 = string2.indexOf(8);
                clazz3 = dG.f(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = dG.f(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = dG.c(clazz, string, clazz2, n2, classArray2)) != null) {
                        dG.c[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = dG.f(3028168976322663L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = dG.d(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        dG.c[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = dG.f(3028168976322663L, 0L);
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

    private static Class f(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = dG.e(l, l2);
            object = c[n];
            try {
                if (!(object instanceof String)) break block2;
                dG.c[n] = clazz = Class.forName(d[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    public static dC f(Object[] objectArray) {
        class_1297 class_12972 = (class_1297)objectArray[0];
        class_243 class_2432 = (class_243)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = (l = a ^ l) ^ 0x3F2A57471C2EL;
        Object[] objectArray2 = new Object[5];
        objectArray2[4] = l2;
        objectArray2[3] = Float.valueOf((float)dG.a("\u00e7", (Object)class_2432, (long)-5326887095034575623L, (long)l));
        objectArray2[2] = Float.valueOf((float)dG.a("\u00e7", (Object)class_2432, (long)-5329855309477730060L, (long)l));
        objectArray2[1] = Float.valueOf((float)dG.a("\u00e7", (Object)class_2432, (long)-5324002085859632650L, (long)l));
        objectArray2[0] = class_12972;
        return dG.a("c", (Object)objectArray2, (long)-5325984282050860430L, (long)l);
    }

    public static boolean f(Object[] objectArray) {
        float f;
        block2: {
            block3: {
                dC dC2 = (dC)objectArray[0];
                dC dC3 = (dC)objectArray[1];
                float f10 = ((Float)objectArray[2]).floatValue();
                long l = (Long)objectArray[3];
                l = a ^ l;
                CallSite callSite = dG.a("c", (float)(dG.a("c", (float)dG.a("p", (Object)dC3, (Object)new Object[0], (long)2219715691518226028L, (long)l), (long)2222210108827871214L, (long)l) - dG.a("c", (float)dG.a("p", (Object)dC2, (Object)new Object[0], (long)2219715691518226028L, (long)l), (long)2222210108827871214L, (long)l)), (long)2222210108827871214L, (long)l);
                CallSite callSite2 = dG.a("c", (long)2218266797211850723L, (long)l);
                CallSite callSite3 = dG.a("c", (float)(dG.a("p", (Object)dC3, (Object)new Object[0], (long)2222393077733658732L, (long)l) - dG.a("c", (float)dG.a("p", (Object)dC2, (Object)new Object[0], (long)2222393077733658732L, (long)l), (long)2222210108827871214L, (long)l)), (long)2222210108827871214L, (long)l);
                float f11 = (float)dG.a("c", (double)((double)(callSite * callSite + callSite3 * callSite3)), (long)2222020047269521596L, (long)l);
                try {
                    f = f11 == f10 ? 0 : (f11 < f10 ? -1 : 1);
                    if (callSite2 != null) break block2;
                    if (f > 0) break block3;
                }
                catch (MatchException matchException) {
                    throw dG.a("c", (Object)matchException, (long)2219024859543979907L, (long)l);
                }
                f = 1;
                break block2;
            }
            f = 0;
        }
        return (boolean)f;
    }

    private static Field d(Class clazz, String string, Class clazz2) {
        Field field = dG.c(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = dG.d(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static float d(Object[] objectArray) {
        float f;
        float f10;
        long l;
        block4: {
            float f11;
            float f12;
            block5: {
                f12 = ((Float)objectArray[0]).floatValue();
                float f13 = ((Float)objectArray[1]).floatValue();
                f11 = ((Float)objectArray[2]).floatValue();
                l = (Long)objectArray[3];
                l = a ^ l;
                CallSite callSite = dG.a("c", (long)6827450665928251284L, (long)l);
                try {
                    try {
                        f10 = f12;
                        f = f13;
                        if (callSite != null) break block4;
                        if (!(f10 < f)) break block5;
                    }
                    catch (MatchException matchException) {
                        throw dG.a("c", (Object)matchException, (long)6826516443498153972L, (long)l);
                    }
                    return f13;
                }
                catch (MatchException matchException) {
                    throw dG.a("c", (Object)matchException, (long)6826516443498153972L, (long)l);
                }
            }
            f10 = f12;
            f = f11;
        }
        return (float)dG.a("c", (float)f10, (float)f, (long)6826003043112810951L, (long)l);
    }

    private static Method d(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = dG.c(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = dG.d(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public static class_3965 d(Object[] objectArray) {
        class_2338 class_23382 = (class_2338)objectArray[0];
        dC dC2 = (dC)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = (l = a ^ l) ^ 0x53646411C8E6L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = dC2;
        return dG.a("p", (Object)dG.a("\u00e7", (Object)b, (long)4914084057502008682L, (long)l), (Object)dG.a("p", (Object)dG.a("\u00e7", (Object)b, (long)4912096181443935405L, (long)l), (long)4913829154419026735L, (long)l), (Object)dG.a("p", (Object)dG.a("p", (Object)dG.a("c", (Object)objectArray2, (long)4912572036357314289L, (long)l), (double)6.0, (long)4913608272047459521L, (long)l), (Object)dG.a("p", (Object)dG.a("\u00e7", (Object)b, (long)4912096181443935405L, (long)l), (long)4913829154419026735L, (long)l), (long)4912165299906469931L, (long)l), (Object)class_23382, (Object)dG.a("c", (long)4914530853708781881L, (long)l), (Object)dG.a("p", (Object)dG.a("\u00e7", (Object)b, (long)4914084057502008682L, (long)l), (Object)class_23382, (long)4914881328070547465L, (long)l), (long)4914020845876107759L, (long)l);
    }

    public static dC d(Object[] objectArray) {
        dC dC2 = (dC)objectArray[0];
        class_243 class_2432 = (class_243)objectArray[1];
        long l = (Long)objectArray[2];
        long l2 = (l = a ^ l) ^ 0x3A8C374A4256L;
        CallSite callSite = dG.a("p", (Object)dG.a("p", (Object)dG.a("\u00e7", (Object)b, (long)1950114046179271574L, (long)l), (long)1948398942418760724L, (long)l), (Object)class_2432, (long)1946429816301757453L, (long)l);
        float f = (float)dG.a("c", (double)(0.18 / dG.a("c", (double)callSite, (double)1.0, (long)1949376993246131944L, (long)l)), (double)0.005, (double)0.15, (long)1951578316577330131L, (long)l);
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l2;
        objectArray2[1] = Float.valueOf(f);
        objectArray2[0] = Float.valueOf(-f);
        CallSite callSite2 = dG.a("c", (Object)objectArray2, (long)1949098259191162028L, (long)l);
        Object[] objectArray3 = new Object[3];
        objectArray3[2] = l2;
        objectArray3[1] = Float.valueOf(f);
        objectArray3[0] = Float.valueOf(-f);
        CallSite callSite3 = dG.a("c", (Object)objectArray3, (long)1949098259191162028L, (long)l);
        CallSite callSite4 = dG.a("c", (float)(dG.a("p", (Object)dC2, (Object)new Object[0], (long)1951689486495782318L, (long)l) + callSite3), (float)-89.9f, (float)89.9f, (long)1952121816244607477L, (long)l);
        dC dC3 = new dC((float)(dG.a("p", (Object)dC2, (Object)new Object[0], (long)1949018692996426670L, (long)l) + callSite2), (float)callSite4);
        dG.a("p", (Object)dC3, (Object)new Object[]{(boolean)dG.a("p", (Object)dC2, (Object)new Object[0], (long)1948720079461272997L, (long)l)}, (long)1948020100309576865L, (long)l);
        return dC3;
    }

    public static boolean d(Object[] objectArray) {
        reference v4;
        block8: {
            block7: {
                CallSite callSite;
                long l;
                block6: {
                    dC dC2 = (dC)objectArray[0];
                    float f = ((Float)objectArray[1]).floatValue();
                    float f10 = ((Float)objectArray[2]).floatValue();
                    float f11 = ((Float)objectArray[3]).floatValue();
                    l = (Long)objectArray[4];
                    long l2 = l = a ^ l;
                    long l3 = l2 ^ 0x742B9388B208L;
                    long l4 = l2 ^ 0x4C87A0267F6AL;
                    long l5 = l2 ^ 0x177F9AAA9D21L;
                    Object[] objectArray2 = new Object[3];
                    objectArray2[2] = l3;
                    objectArray2[1] = Float.valueOf(1.0f);
                    objectArray2[0] = Float.valueOf(0.5f);
                    Object[] objectArray3 = new Object[4];
                    objectArray3[3] = l5;
                    objectArray3[2] = Float.valueOf((float)(dG.a("p", (Object)dG.a("\u00eb", (long)-1488871076750717143L, (long)l), (Object)new Object[0], (long)-1489238151525743402L, (long)l) * (1.1f - f) * 7.0f / f11 * dG.a("c", (Object)objectArray2, (long)-1489890836242426638L, (long)l)));
                    objectArray3[1] = Float.valueOf((float)(dG.a("p", (Object)dC2, (Object)new Object[0], (long)-1491951959388658192L, (long)l) + f10 / 2.0f));
                    objectArray3[0] = Float.valueOf((float)dG.a("p", (Object)dG.a("\u00e7", (Object)b, (long)-1491117248733965368L, (long)l), (long)-1489676672488265449L, (long)l));
                    CallSite callSite2 = dG.a("c", (Object)objectArray3, (long)-1490269021569842806L, (long)l);
                    callSite = dG.a("c", (long)-1489320641412603265L, (long)l);
                    try {
                        try {
                            Object[] objectArray4 = new Object[2];
                            objectArray4[1] = l4;
                            objectArray4[0] = new dC((float)dG.a("p", (Object)dG.a("\u00e7", (Object)b, (long)-1491117248733965368L, (long)l), (long)-1490379471907528718L, (long)l), (float)callSite2);
                            dG.a("c", (Object)objectArray4, (long)-1492498835465605559L, (long)l);
                            reference v4 = dG.a("p", (Object)dG.a("\u00e7", (Object)b, (long)-1491117248733965368L, (long)l), (long)-1489676672488265449L, (long)l) - 1.0f - dG.a("p", (Object)dC2, (Object)new Object[0], (long)-1491951959388658192L, (long)l);
                            v4 = v4 == 0 ? 0 : (v4 < 0 ? -1 : 1);
                            if (callSite != null) break block6;
                            if (v4 >= 0) break block7;
                        }
                        catch (MatchException matchException) {
                            throw dG.a("c", (Object)matchException, (long)-1488566704399470049L, (long)l);
                        }
                        reference v4 = dG.a("p", (Object)dG.a("\u00e7", (Object)b, (long)-1491117248733965368L, (long)l), (long)-1489676672488265449L, (long)l) + 1.0f - dG.a("p", (Object)dC2, (Object)new Object[0], (long)-1491951959388658192L, (long)l);
                        v4 = v4 == 0 ? 0 : (v4 > 0 ? 1 : -1);
                    }
                    catch (MatchException matchException) {
                        throw dG.a("c", (Object)matchException, (long)-1488566704399470049L, (long)l);
                    }
                }
                try {
                    if (callSite != null) break block8;
                    if (v4 <= 0) break block7;
                }
                catch (MatchException matchException) {
                    throw dG.a("c", (Object)matchException, (long)-1488566704399470049L, (long)l);
                }
                v4 = (reference)1;
                break block8;
            }
            v4 = (reference)0;
        }
        return (boolean)v4;
    }

    public static class_3965 a(Object[] objectArray) {
        class_2338 class_23382 = (class_2338)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = (l = a ^ l) ^ 0x61BA9690DC19L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = dG.a("\u00e7", (Object)b, (long)-6986689243085052020L, (long)l);
        return dG.a("p", (Object)dG.a("\u00e7", (Object)b, (long)-6984138270786806197L, (long)l), (Object)dG.a("p", (Object)dG.a("\u00e7", (Object)b, (long)-6986689243085052020L, (long)l), (long)-6984973338044960754L, (long)l), (Object)dG.a("p", (Object)dG.a("p", (Object)dG.a("c", (Object)objectArray2, (long)-6983565005228294965L, (long)l), (double)6.0, (long)-6984613643386841120L, (long)l), (Object)dG.a("p", (Object)dG.a("\u00e7", (Object)b, (long)-6986689243085052020L, (long)l), (long)-6984973338044960754L, (long)l), (long)-6986620115236734198L, (long)l), (Object)class_23382, (Object)dG.a("c", (long)-6984267661343882728L, (long)l), (Object)dG.a("p", (Object)dG.a("\u00e7", (Object)b, (long)-6984138270786806197L, (long)l), (Object)class_23382, (long)-6983916637774445784L, (long)l), (long)-6984214711179640114L, (long)l);
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/dG" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public static float a(Object[] objectArray) {
        dC dC2 = (dC)objectArray[0];
        long l = (Long)objectArray[1];
        l = a ^ l;
        CallSite callSite = dG.a("c", (float)(dG.a("c", (float)dG.a("p", (Object)dC2, (Object)new Object[0], (long)5238098255103047699L, (long)l), (long)5235880301036106129L, (long)l) - dG.a("c", (float)dG.a("p", (Object)dG.a("\u00e7", (Object)b, (long)5236853847764545579L, (long)l), (long)5238370071370234897L, (long)l), (long)5235880301036106129L, (long)l)), (long)5235880301036106129L, (long)l);
        CallSite callSite2 = dG.a("c", (float)(dG.a("p", (Object)dC2, (Object)new Object[0], (long)5235702365827712531L, (long)l) - dG.a("c", (float)dG.a("p", (Object)dG.a("\u00e7", (Object)b, (long)5236853847764545579L, (long)l), (long)5237946824928725748L, (long)l), (long)5235880301036106129L, (long)l)), (long)5235880301036106129L, (long)l);
        return (float)dG.a("c", (double)((double)(callSite * callSite + callSite2 * callSite2)), (long)5235793285641191107L, (long)l);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static boolean a(Object[] var0) {
        block15: {
            block14: {
                block13: {
                    block12: {
                        block11: {
                            var1_1 = (dC)var0[0];
                            var4_2 = ((Float)var0[1]).floatValue();
                            var6_3 = ((Float)var0[2]).floatValue();
                            var5_4 = ((Float)var0[3]).floatValue();
                            var2_5 = (Long)var0[4];
                            var7_6 = (var2_5 = dG.a ^ var2_5) ^ 67172412028484L;
                            var10_7 = var4_2 * 5.0f;
                            var11_8 = dG.a("p", (Object)var1_1, (Object)new Object[0], (long)7096671473732981470L, (long)var2_5);
                            var12_9 = dG.a("p", (Object)var1_1, (Object)new Object[0], (long)7090341506067164382L, (long)var2_5);
                            var13_10 = dG.a("p", (Object)dG.a("\u00e7", (Object)dG.b, (long)7088680465177418470L, (long)var2_5), (long)7097508447566780124L, (long)var2_5);
                            var14_11 = dG.a("p", (Object)dG.a("\u00e7", (Object)dG.b, (long)7088680465177418470L, (long)var2_5), (long)7097087410751742009L, (long)var2_5);
                            var9_12 = dG.a("c", (long)7096176938591873873L, (long)var2_5);
                            var15_13 = var11_8 - var13_10;
                            var16_14 = var12_9 - var14_11;
                            try {
                                v0 = var11_8;
                                v1 /* !! */  = var13_10;
                                if (var9_12 != null) break block11;
                                if (v0 > v1 /* !! */ ) {
                                }
                                ** GOTO lbl29
                            }
                            catch (MatchException v2) {
                                throw dG.a("c", (Object)v2, (long)7095981862856440625L, (long)var2_5);
                            }
                            var13_10 += var10_7;
                            try {
                                if (var9_12 == null) break block12;
lbl29:
                                // 2 sources

                                v0 = var13_10;
                                v1 /* !! */  = (reference)var10_7;
                            }
                            catch (MatchException v3) {
                                throw dG.a("c", (Object)v3, (long)7095981862856440625L, (long)var2_5);
                            }
                        }
                        var13_10 = v0 - v1 /* !! */ ;
                    }
                    try {
                        try {
                            v4 = new Object[2];
                            v4[1] = var7_6;
                            v4[0] = new dC((float)var13_10, (float)var14_11);
                            dG.a("c", (Object)v4, (long)7090888644135020391L, (long)var2_5);
                            cfr_temp_0 = dG.a("c", (float)var15_13, (long)7089953220536752988L, (long)var2_5) - 0.5f;
                            v5 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 < 0 ? -1 : 1);
                            if (var9_12 != null) break block13;
                            if (v5 >= 0) break block14;
                        }
                        catch (MatchException v6) {
                            throw dG.a("c", (Object)v6, (long)7095981862856440625L, (long)var2_5);
                        }
                        cfr_temp_1 = dG.a("c", (float)var16_14, (long)7089953220536752988L, (long)var2_5) - 0.5f;
                        v5 = cfr_temp_1 == 0 ? 0 : (cfr_temp_1 < 0 ? -1 : 1);
                    }
                    catch (MatchException v7) {
                        throw dG.a("c", (Object)v7, (long)7095981862856440625L, (long)var2_5);
                    }
                }
                try {
                    if (var9_12 != null) break block15;
                    if (v5 >= 0) break block14;
                }
                catch (MatchException v8) {
                    throw dG.a("c", (Object)v8, (long)7095981862856440625L, (long)var2_5);
                }
                v5 = (reference)1;
                break block15;
            }
            v5 = (reference)0;
        }
        return (boolean)v5;
    }

    private static void a() {
        Object[] objectArray = c;
        c[0] = "R.ek\u001bUD.`1\bBSec7\u0004VB\"t OD~";
        objectArray[1] = "}\nb\u0012-[\b*i\u001d<\u0014u2z\u001a5]\u001d";
        objectArray[2] = "}BQtQ6}BF(]9g\tF6],`x\u0016k\f";
        objectArray[3] = "\u0017\u0019v\u0015~\u0011\u0017\u0019aIr\u001e\rRaWr\u000b\n#5\u000f%";
        objectArray[4] = "}WAwyekWD-jr|\u001cG+ffm[P<-qZ";
        objectArray[5] = "\u0010_\\/!ce\u007fW 0,\u0004q\\+4vp";
        objectArray[6] = Float.TYPE;
        dG.d[6] = "java/lang/Float";
        objectArray[7] = "O2H,O.Y2Mv\\9NyNpP-_>Yg\u001b:l";
        objectArray[8] = "+\u000b76L< \u0004&y/15\t)\u0012\u001a3$\u001a5>\r>";
        objectArray[9] = "'zR<\u007fORZY3n\u00003TR8jZG";
        objectArray[10] = "<\u001f\u001f7i\u00157\u0010\u000ex\n\u0018\"\u0016";
        objectArray[11] = "iQ$sd;\u001cq/|ut}\u007f$wq.\t";
        objectArray[12] = Void.TYPE;
        dG.d[12] = "java/lang/Void";
        objectArray[13] = "6\u0019K5\bn6\u0019\\i\u0004a,R\\w\u0004t+#\r/V";
        objectArray[14] = Double.TYPE;
        dG.d[14] = "java/lang/Double";
        objectArray[15] = "\n>U-B<\n>BqN3\u0010uBoN&\u0017\u0004\u00170\u0017";
        objectArray[16] = "\u0001[7A8e\u0001[ \u001d4j\u001b\u0010 \u00034\u007f\u001capV`5";
        objectArray[17] = "\u0014P\b\u0013k#\u0014P\u001fOg,\u000e\u001b\u001fQg9\tjO\u00040\u007f";
        objectArray[18] = "QsiO'\u0012Qs~\u0013+\u001dK8~\r+\bLI.X\u007fB\u001buq\u00009\b`$)S";
        objectArray[19] = "\u00061!(x:\u000616tt5\u001cz6jt \u001b\u000bf? jL79gf 7gl0%";
        objectArray[20] = "QN\u0001G\u001eH$n\nH\u000f\u0007E`\u0001C\u000b]1";
        objectArray[21] = "\u0006\"\u0017\\J\fs\u0002\u001cS[C\u0012\f\u0017X_\u0019f";
        objectArray[22] = "K=O\u0017LH>\u001dD\u0018]\u0007_\u0013O\u0013Y]+";
        objectArray[23] = "=\u0012yH\u000e\n=\u0012n\u0014\u0002\u0005'Yn\n\u0002\u0010 (>SPQ";
        objectArray[24] = "\u0013A3gL<\u0005A6=_+\u0012\n5;S?\u0003M\",\u0018(\u0019";
        objectArray[25] = "\u0016[\u0000rzSc{\u000b}k\u001c\u0002u\u0000voFv";
        objectArray[26] = "@QaH\u0003:5qjG\u0012uT\u007faL\u0016/ ";
        objectArray[27] = Boolean.TYPE;
        dG.d[27] = "java/lang/Boolean";
        objectArray[28] = "\u0007.\u000e0J\u0007r\u000e\u0005?[H\u0013\u0000\u000e4_\u0012g";
        objectArray[29] = "0$.&\u0019\u00040$9z\u0015\u000b*o9d\u0015\u001e-\u001eh;GU";
        objectArray[30] = "I\fc3-zI\fto!uSGtq!`T6%+x#";
        objectArray[31] = "] <-*x] +q&wGk+o&b@\u001az5r";
        objectArray[32] = "XR\u001e]\u0004eXR\t\u0001\bjB\u0019\t\u001f\b\u007fEhXFP";
        objectArray[33] = "2v\u0019\u000bSiGV\u0012\u0004B&&X\u0019\u000fF|R";
        objectArray[34] = "o)S2dB\u001a\tX=u\r{\u0007S6qW\u000f";
        objectArray[35] = "ijBk4i\u001cJId%&}DBo!|\t";
        objectArray[36] = "\\71|\u0016j)\u0017:s\u0007%H\u00191x\u0003\u007f<";
        objectArray[37] = "`Ko\u0011\u0003\u001f`KxM\u000f\u0010z\u0000xS\u000f\u0005}q*\t[A";
        objectArray[38] = "I\u0000`\u0015K,_\u0000eOX;HKfIT/Y\fq^\u001f?A\fsUEr}\u0017sHE5J\u0000";
        objectArray[39] = "1hJ\u0004\u001b\u0003'hO^\b\u00140#LX\u0004\u0000!d[OO\u0017-";
        objectArray[40] = "\u0016@n\u007fpRc`epa\u001d\u0002nn{eGv";
        objectArray[41] = "a92{\r:\u0014\u00199t\u001cuu\u00172\u007f\u0018/\u0001";
        objectArray[42] = "\u0015\u0013\u001fu$\\\u0015\u0013\b)(S\u000fX\b7(F\b)Zip\u0002";
        objectArray[43] = "g\u0013}\u0006D]l\u001clI%Sg\u0017h\u0013";
        objectArray[44] = "#\u001f=\nU;k\u0018|\u001f5?{\u001fd\u000fbh%H<c\u000f3#C9\tE<w\n";
        objectArray[45] = "\u0007jFQ\u001b|\u001akQ\u001bbz\u0013/KF\u000eHEm\u0017\u001c^\u001fB5IF\u000f\"\u00020DSb";
        objectArray[46] = "\tH\u0011\u007f\u001fW\nA\u0014y|\u0001\u0004I\u000fy+VZ\u0019V$|\u0003\t^\u0001vD\u0000\u0000[\u0007";
        objectArray[47] = "\u000e\u0012ff|\u000fU\u0000d%\u0015\rR\u0000t|y?\u0006D-*\u0015YQ\u000eirr\u0002C\f*\u001b$\u0006M\u0001}|\u007f\u0014OB\u0014";
        objectArray[48] = "1`\u0000n\nCr'V+n\u0012r4Zmn\u0012?cQk\u000eAw%YW\u0007J00\u00007T\u0002v8<>_Eca\\m\u0017\u0003k]";
        objectArray[49] = "\u0000JGi\t!\u000f\u0019Gu`<\u0002_\u001bi\f\u000eV\u001e@0[YSE\u0019i\rd\u0013@\u0014|`e\tA\u001cc]%\fL\t\u000e\\?\rD\u00163\u001c:\u0000Q{2\u0006;\bNFr\u00036\u001d#";
        objectArray[50] = "\u001b g\u0019\u0017*\u0017;y\r,1&0a\u001c]4H9iX\u0016X\u0017%i\u001eE?L7k],";
        objectArray[51] = "q5!pE\u0002}.?d~\u0019L%'u\u000f\u001c\",/1Dp|<9gE\r5%'5~";
        objectArray[52] = "GtvLV\u000e\r{\"\u0005o\u0001\u0010j/\u001a\u00033F(s@QdAp-\u001a\u0002Y\u0001u \u000foT\u001fr\"F\u0012\u001d\u0006lp}";
        objectArray[53] = "\n6\u0014\b9B\u00177\u0003B@D\u001es\u0019\u001f,vH4DGy!Ba\u000b\u0005)F\u0019s\tF@";
        objectArray[54] = "_\u0012s>}?\u0004\u0000q}\u00146\u000f\u0011e/CaUA8C}iP\u0011=#.!\u0016\u0019";
        objectArray[55] = "\u001e`:ZSM\u00113:F:P\u001cufZVbH4=\u0002\u00065\u001888P\u0006UKp~X:\t\u0017kaP\u0007I\u0012ft=";
        objectArray[56] = "+,?/7!'7!;\f?\u0016<9*}?x51n6S*!!2anj$,'\f";
        objectArray[57] = "uCkr4|z\u0010kn]awV7r1S#\u0017l(e\u0004s\u001bixad S/p]m+\u0014:)=>cR2\u001545$Gkug}bOW|l:w\u00167/$|\u007f*";
        objectArray[58] = "KH8I JGS&]\u001bRvX>LjT\u0018Q6\b!8MNu\u000f%E\b\u001a'S\u001b";
        objectArray[59] = "\u0007<\u007f+R\tBh-wl\u001e<*4h\u001d\u0018R#<,Vt\u00007,p\u0001I@2!el";
        objectArray[60] = "hWP1g\u001a3ERr\u000e\u00184EB+b*`\u0001\u0018}\u000eL7K_%i\u0017%I\u001cL";
        objectArray[61] = " \u0012hSC\u0018cU>\u0016'[fU(jN\u0011!Bh\n\u001dYgJT\u0003\u0016\u001er\u00134P^Xz/";
        objectArray[62] = " 8\u000fd5.c\u007fY!Q\u007fu~3a7txh\u000e!2ym\u0005\u000f;3qr8O>>d\u001f";
        objectArray[63] = "b-\rtu\u0015\u007f,\u001a>\f\u0013vh\u0000c`! *\\91v'r\u0002caKgw\u000fv\f";
        objectArray[64] = "\u00078N\u0017?oBl\u001cK\u0001{<.\u0005Tp~R'\r\u0010;\u0012^k\u001aRe,S5\r\u0016\u0001";
        objectArray[65] = "YK4:\u001b8I\u0002&6+6#\b>5Z3M\u00016q\u0011_\u001f\u0015&-Fb_\u0010+8+";
        objectArray[66] = "XLcwZ\u0015\u0012C7>c\u001a\u000fR:!\u000f(Y\u0010f{\\\u007f^H8!\u000eB\u001eM54cO\u0000J7}\u001e\u0006\u0019TeF";
        objectArray[67] = "`\u001e+~\rS;\f)=dQ<\f9d\bchHc:d]`N4?\u0004\u000e(\b<\u0003UZ#\r0d\u000eH!NY";
        objectArray[68] = "\fTers\u0011F[1;J\u001e[J<$&,\r\ra|s{\u0007X.>#\u001c\\J,}J";
        objectArray[69] = "sPOgCnv\bN`%:bOQfI\b4\r\r<\u0018_3USfHbsP^s%";
        objectArray[70] = "K\"fcaE\u0006fw\\h:Oj4:`\u000b\u00070d1\u0002";
        objectArray[71] = "G|\u000f\\\u0007*Kg\u0011H<5zl\tYM4\u0014e\u0001\u001d\u0006XAzB\u001a\u0002%\u0004.\u0010F<";
        objectArray[72] = "/j\u0012@3AgmSUSEwjKE\u0004\u0012(7\u0010)9\u0012ynFX3Jw>";
        objectArray[73] = "hthDQ=b,f\u00148)o1gJT\u001b;r8\u0011\u0005L3#uPQ+h1w\u00138}l?zD_&~=9-[(p3yF^\"x&\u0007ID%e,<P]#{Mc\u0012\b%22;G\u00034\u0002&9\u0014X0m,lU\tL";
        objectArray[74] = "b\u0019d8{Kn\u0002z,@S_\tb=1U1\u0000jyz9c\u0014z%-\u0004#\u0011w0@";
        objectArray[75] = "\u0017\u000eqt0Q\u001b\u0015o`\u000bJ*Xw1mQS\u001a7mh#\u0017\u001f2hyZU_nm\u000b";
        objectArray[76] = "j,\u0013C\n;t#\u0019J15\u00136F^Aet&\u000fLM";
        objectArray[77] = "DY\u0000\u0019OAHB\u001e\rt\\yI\u0006\u001c\u0005_\u0017@\u000eXN3B_M_JN\u0007\u000b\u001f\u0003t";
        objectArray[78] = "o\fI@\u0018\u007foA\u0019\u0018$fgOB\u0019HT3\u000b\u001dA$gvZE\u001f\u001f~o\\[~";
        objectArray[79] = "6i\u0016lv~s=D0Hh\r\u007f]/9ocvUkr\u0003=fC=s~t\u007f]oH";
        objectArray[80] = "\u0016[_/\u0007M\u001a@A;<U+KY*MSEBQn\u0006?\u001a^Q(UXALSk<";
        objectArray[81] = ";V=*}xqYicDwlHd|(E:\n8&x\u0012=Rf|)/}WkiD";
        objectArray[82] = "\u000fZ\bl\u007f\u001eL\u001d^)\u001bCQ\u00014i}DW\n\t)xIBg\b3yA]ZH6tT0[R7|K\r\u001bW:i&";
        objectArray[83] = "\u0019\u000eM\n\u001bX\u0015\u0015S\u001e A$\u001eK\u000fQFJ\u0017CK\u001a*\u0018\u0003S\u0017M\u0017X\u0006^\u0002 ";
        objectArray[84] = "\u0002?;Blv\bg5\u0012\u0005b\u0005z4LiPQ9k\u0017?\u0007\u0002\u007f5Ik}\u0002{oI\u0005lV?4Wjf\u0003~e+";
        objectArray[85] = "QPv\u0006R][\bxV;IV\u0015y\bW{\u000bR#W;O_\u001bg\u0011PJU\u0013ro_\u0013\u000b\u0000)\u0010\u0007F\u0000\u0011\u0019";
        objectArray[86] = "8[-.D\u00137\b-2-\u000e:Nq.A<n\u000f*w\u0017k>\u0003/$\u0011\u000bmKi,-W1Pv$\u0010\u00174]cI";
        objectArray[87] = "_TFM''\u001c\u0013\u0010\bCc\u0007%\u0017\u001b9r\r\u0012z\u001dr!\rU\u001aN:g\u0005i\u0013E}r\\\t@\r;z`";
        objectArray[88] = "ek8[P'>y:\u00189.5h.Jnyo8r&PqjhvF\u00039,`";
        objectArray[89] = "d5-;zMq>%4\u0007]n<&2P\n4mr^lW`4? y\\h;";
        objectArray[90] = "fX,kM\t%\u001fz.)T0\u0015\u0010;\u0018\u000f4YphPI<eyc\u0017\\e\u0005*+QTY\f!lD\r9_i*L1";
        objectArray[91] = "DQ NK*\u000e^t\u0007r%\u0013Oy\u0018\u001e\u0017E\r%BO@BU{\u0018\u001f}\u0002Pv\rr";
        objectArray[92] = "97\u0001}+l<o\u0000zM8((\u001f|!\n~oB$t]t:\rf$:/(\u000f%M";
        objectArray[93] = "\u0007uwXpoB!%\u0004N{<c<\u001b?~Rj4_t\u0012\u0000~$\u0003#/@{)\u0016N";
        objectArray[94] = "F}\u000fp)\u0013X}\u0004kM\u001c)yOr<\u0019GpG6wu\u0015dWj HUaZ\u007fM";
        objectArray[95] = "gPY\u0006HWb\bX\u0001.\u0003vOG\u0007B1 \r\u001b]\u0012f'UE\u0007C[gPH\u0012.";
        objectArray[96] = "dJ\u0015\u001d\u0003\u0015?X\u0017^j\u00178X\u0007\u0007\u0006%l\u001c]ZjC;V\u001a\t\r\u0018)TY`\u0003CkI[\u0000P\u000b-Ag";
        Object[] objectArray2 = objectArray;
        objectArray[97] = "2K,a7\u0005iY.\"^\fbH:p\t[8\u0018d\u001c7S=Hb|d\u001b{@";
    }

    public static dC a(Object[] objectArray) {
        class_243 class_2432 = (class_243)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = (l = a ^ l) ^ 0x6829AD26B69AL;
        Object[] objectArray2 = new Object[4];
        objectArray2[3] = l2;
        objectArray2[2] = Float.valueOf((float)dG.a("\u00e7", (Object)class_2432, (long)1420178060866068831L, (long)l));
        objectArray2[1] = Float.valueOf((float)dG.a("\u00e7", (Object)class_2432, (long)1418326918225857874L, (long)l));
        objectArray2[0] = Float.valueOf((float)dG.a("\u00e7", (Object)class_2432, (long)1421796402174262352L, (long)l));
        return dG.a("c", (Object)objectArray2, (long)1418017137478211986L, (long)l);
    }

    private static MatchException a(MatchException matchException) {
        return matchException;
    }

    public static class_239 a(Object[] objectArray) {
        dC dC2 = (dC)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = (l = a ^ l) ^ 0x4888B32BD0F0L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = dC2;
        return dG.a("p", (Object)dG.a("\u00e7", (Object)b, (long)6639518091387297148L, (long)l), (Object)new class_3959((class_243)dG.a("p", (Object)dG.a("\u00e7", (Object)b, (long)6646572663315539131L, (long)l), (long)6640406433401713465L, (long)l), (class_243)dG.a("p", (Object)dG.a("p", (Object)dG.a("c", (Object)objectArray2, (long)6645885686062927591L, (long)l), (double)6.0, (long)6640205104407729367L, (long)l), (Object)dG.a("p", (Object)dG.a("\u00e7", (Object)b, (long)6646572663315539131L, (long)l), (long)6640406433401713465L, (long)l), (long)6646644256311539773L, (long)l), (class_3959.class_3960)dG.a("\u00eb", (long)6646718756233141442L, (long)l), (class_3959.class_242)dG.a("\u00eb", (long)6638359487450158710L, (long)l), (class_1297)dG.a("\u00e7", (Object)b, (long)6646572663315539131L, (long)l)), (long)6639251471800777973L, (long)l);
    }

    public static class_243 a(Object[] objectArray) {
        dC dC2 = (dC)objectArray[0];
        long l = (Long)objectArray[1];
        l = a ^ l;
        float f = (float)Math.PI / 180;
        float f10 = (float)Math.PI;
        CallSite callSite = dG.a("c", (double)((double)(-dG.a("p", (Object)dC2, (Object)new Object[0], (long)7051796232281821567L, (long)l) * f - f10)), (long)7052605062558777014L, (long)l);
        CallSite callSite2 = dG.a("c", (double)((double)(-dG.a("p", (Object)dC2, (Object)new Object[0], (long)7051796232281821567L, (long)l) * f - f10)), (long)7045783543090757001L, (long)l);
        CallSite callSite3 = -dG.a("c", (double)((double)(-dG.a("p", (Object)dC2, (Object)new Object[0], (long)7044903447871582079L, (long)l) * f)), (long)7052605062558777014L, (long)l);
        CallSite callSite4 = dG.a("c", (double)((double)(-dG.a("p", (Object)dC2, (Object)new Object[0], (long)7044903447871582079L, (long)l) * f)), (long)7045783543090757001L, (long)l);
        return dG.a("p", (Object)new class_243((double)(callSite2 * callSite3), (double)callSite4, (double)(callSite * callSite3)), (long)7045124733279102131L, (long)l);
    }

    public static void a(Object[] objectArray) {
        dC dC2 = (dC)objectArray[0];
        long l = (Long)objectArray[1];
        l = a ^ l;
        dG.a("p", (Object)dG.a("\u00e7", (Object)b, (long)8730326097524982190L, (long)l), (float)dG.a("p", (Object)dC2, (Object)new Object[0], (long)8733646382837696918L, (long)l), (long)8732038755045059465L, (long)l);
        dG.a("p", (Object)dG.a("\u00e7", (Object)b, (long)8730326097524982190L, (long)l), (float)dG.a("p", (Object)dC2, (Object)new Object[0], (long)8731811240172418966L, (long)l), (long)8733551950444937019L, (long)l);
    }

    private static Field g(long l, long l2) {
        int n = dG.e(l, l2);
        Object object = c[n];
        if (object instanceof String) {
            String string = d[n];
            int n2 = string.indexOf(8);
            Class clazz = dG.f(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = dG.f(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = dG.c(clazz3, string2, clazz2)) != null) {
                    dG.c[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = dG.d(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        dG.c[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = dG.f(3028168976322663L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    public static dC g(Object[] objectArray) {
        class_1297 class_12972 = (class_1297)objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        float f10 = ((Float)objectArray[2]).floatValue();
        float f11 = ((Float)objectArray[3]).floatValue();
        long l = (Long)objectArray[4];
        long l2 = (l = a ^ l) ^ 0x3FB1FC8DA696L;
        CallSite callSite = dG.a("p", (Object)class_12972, (long)5129723363442732482L, (long)l);
        double d = (double)f - dG.a("\u00e7", (Object)callSite, (long)5133837999406655700L, (long)l);
        double d10 = (double)f10 - dG.a("\u00e7", (Object)callSite, (long)5128151849768409558L, (long)l);
        double d11 = (double)f11 - dG.a("\u00e7", (Object)callSite, (long)5129967567401055707L, (long)l);
        CallSite callSite2 = dG.a("c", (double)(d * d + d11 * d11), (long)5127348660988391746L, (long)l);
        float f12 = (float)dG.a("c", (double)dG.a("c", (double)d11, (double)d, (long)5128284897402750262L, (long)l), (long)5130331157424892302L, (long)l) - 90.0f;
        float f13 = (float)(-dG.a("c", (double)dG.a("c", (double)d10, (double)callSite2, (long)5128284897402750262L, (long)l), (long)5130331157424892302L, (long)l));
        float[] fArray = new float[]{(float)dG.a("p", (Object)class_12972, (long)5129748697729443242L, (long)l), (float)dG.a("p", (Object)class_12972, (long)5131337148920226387L, (long)l)};
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = Float.valueOf(f12 - fArray[0]);
        Object[] objectArray3 = new Object[2];
        objectArray3[1] = l2;
        objectArray3[0] = Float.valueOf(f13 - fArray[1]);
        return new dC(fArray[0] + dG.a("c", (Object)objectArray2, (long)5131249352416518676L, (long)l), fArray[1] + dG.a("c", (Object)objectArray3, (long)5131249352416518676L, (long)l));
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(dG.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


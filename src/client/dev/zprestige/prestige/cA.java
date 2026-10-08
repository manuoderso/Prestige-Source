/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 */
package dev.zprestige.prestige;

import com.google.gson.JsonElement;
import dev.zprestige.prestige.an_0;
import dev.zprestige.prestige.bW;
import dev.zprestige.prestige.cB;
import dev.zprestige.prestige.cD;
import dev.zprestige.prestige.cE;
import dev.zprestige.prestige.cp_0;
import dev.zprestige.prestige.dA;
import dev.zprestige.prestige.dt_0;
import dev.zprestige.prestige.fW;
import dev.zprestige.prestige.gB;
import dev.zprestige.prestige.gL;
import dev.zprestige.prestige.gQ;
import dev.zprestige.prestige.ga_0;
import dev.zprestige.prestige.gf_0;
import dev.zprestige.prestige.hc;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.awt.Color;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class cA {
    private static final int[][] a;
    private float b;
    private int c;
    private int d;
    private float e;
    private float f;
    private float g;
    private final Int2ObjectOpenHashMap h;
    private final Map i;
    private cD j;
    private bW k;
    private BiConsumer l;
    private Function m;
    private dt_0 n;
    private gL o;
    private static final long p;
    private static final String[] q;
    private static final String[] r;
    private static final Map s;
    private static final long[] t;
    private static final Integer[] u;
    private static final Map v;
    private static final Object[] w;
    private static final String[] x;

    /*
     * Unable to fully structure code
     */
    public cA(String var1_1, long var2_2) throws IOException {
        block21: {
            block20: {
                block18: {
                    v0 = var2_2 = cA.p ^ var2_2;
                    var4_3 = v0 ^ 35896062585652L;
                    var6_4 = v0 ^ 527467001456L;
                    var8_5 = v0 ^ 50316809022329L;
                    var10_6 = v0 ^ 101922796707186L;
                    super();
                    this.e = 8.0f;
                    this.h = new Int2ObjectOpenHashMap();
                    v1 = new Object[2];
                    v1[1] = var4_3;
                    v1[0] = (int)cA.b("t", (int)4052, (long)(8384785388237712541L ^ var2_2));
                    this.i = cA.c("\u00c5", (Object)v1, (long)6871381214892851720L, (long)var2_2);
                    this.m = (Function<cA, ga_0>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$new$0(dev.zprestige.prestige.cA ), (Ldev/zprestige/prestige/cA;)Ldev/zprestige/prestige/ga;)();
                    v2 = new Object[2];
                    v2[1] = var6_4;
                    v2[0] = (String)cA.a("v", (int)6826, (long)(1228666158223696265L ^ var2_2)) + var1_1 + (String)cA.a("v", (int)30794, (long)(7286180437074625382L ^ var2_2));
                    var13_7 = cA.c("\u00c5", (Object)v2, (long)6869953292080571803L, (long)var2_2);
                    v3 = new Object[2];
                    v3[1] = var6_4;
                    v3[0] = (String)cA.a("v", (int)3540, (long)(4194344353105721081L ^ var2_2)) + var1_1 + (String)cA.a("v", (int)25331, (long)(4426024508144867799L ^ var2_2));
                    var14_8 = cA.c("\u00c5", (Object)v3, (long)6869953292080571803L, (long)var2_2);
                    var12_9 = cA.c("\u00c5", (long)6872405841610038547L, (long)var2_2);
                    v4 = new Object[1];
                    v4[0] = var10_6;
                    var15_10 = cA.c("z", (Object)var13_7, (Object)v4, (long)6872067703347833065L, (long)var2_2);
                    try {
                        v5 = new Object[1];
                        v5[0] = var10_6;
                        var16_11 = cA.c("z", (Object)var14_8, (Object)v5, (long)6872067703347833065L, (long)var2_2);
                        try {
                            v6 = new Object[3];
                            v6[2] = var8_5;
                            v6[1] = var16_11;
                            v6[0] = new InputStreamReader((InputStream)var15_10);
                            cA.c("z", (Object)this, (Object)v6, (long)6872844429112423829L, (long)var2_2);
                            v7 = var16_11;
                            if (var12_9 != null) break block18;
                        }
                        catch (Throwable var17_13) {
                            block19: {
                                try {
                                    v8 = var16_11;
                                    if (var12_9 == null) {
                                        if (v8 == null) break block19;
                                    }
                                    ** GOTO lbl56
                                }
                                catch (Throwable v9) {
                                    throw cA.c("\u00c5", (Object)v9, (long)6874246006069066734L, (long)var2_2);
                                }
                                try {
                                    v8 = var16_11;
lbl56:
                                    // 2 sources

                                    cA.c("z", (Object)v8, (long)6874868910127339365L, (long)var2_2);
                                }
                                catch (Throwable var18_15) {
                                    cA.c("z", (Object)var17_13, (Object)var18_15, (long)6875854229859790158L, (long)var2_2);
                                }
                            }
                            throw var17_13;
                        }
                        try {
                            if (v7 == null) ** GOTO lbl68
                            cA.c("z", (Object)var16_11, (long)6874868910127339365L, (long)var2_2);
                        }
                        catch (Throwable v10) {
                            throw cA.c("\u00c5", (Object)v10, (long)6874246006069066734L, (long)var2_2);
                        }
lbl68:
                        // 2 sources

                        v7 = var15_10;
                    }
                    catch (Throwable var16_12) {
                        block22: {
                            try {
                                v11 = var15_10;
                                if (var12_9 == null) {
                                    if (v11 == null) break block22;
                                }
                                ** GOTO lbl80
                            }
                            catch (Throwable v12) {
                                throw cA.c("\u00c5", (Object)v12, (long)6874246006069066734L, (long)var2_2);
                            }
                            try {
                                v11 = var15_10;
lbl80:
                                // 2 sources

                                cA.c("z", (Object)v11, (long)6874868910127339365L, (long)var2_2);
                            }
                            catch (Throwable var17_14) {
                                cA.c("z", (Object)var16_12, (Object)var17_14, (long)6875854229859790158L, (long)var2_2);
                            }
                        }
                        throw var16_12;
                    }
                }
                try {
                    if (var12_9 != null) break block20;
                    if (v7 == null) break block21;
                }
                catch (Throwable v13) {
                    throw cA.c("\u00c5", (Object)v13, (long)6874246006069066734L, (long)var2_2);
                }
                v7 = var15_10;
            }
            cA.c("z", (Object)v7, (long)6874868910127339365L, (long)var2_2);
        }
    }

    public cA(Reader reader, InputStream inputStream, long l) throws IOException {
        long l2 = l = p ^ l;
        long l3 = l2 ^ 0x50CD47F906B1L;
        long l4 = l2 ^ 0x5DABB87106FCL;
        this.e = 8.0f;
        this.h = new Int2ObjectOpenHashMap();
        Object[] objectArray = new Object[2];
        objectArray[1] = l3;
        objectArray[0] = (int)cA.b("t", (int)8595, (long)(0x1C10174C0F8DEF41L ^ l));
        this.i = cA.c("\u00c5", (Object)objectArray, (long)8275782851233656717L, (long)l);
        this.m = cA::lambda$new$0;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l4;
        objectArray2[1] = inputStream;
        objectArray2[0] = reader;
        cA.c("z", (Object)this, (Object)objectArray2, (long)8278829910885308432L, (long)l);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block26: {
            block25: {
                block24: {
                    block23: {
                        cA.p = hc.a(1577348735923618555L, 4071491326179604661L, MethodHandles.lookup().lookupClass()).a(242527176355123L);
                        var20 = cA.p ^ 9008712696332L;
                        cA.w = new Object[171];
                        cA.x = new String[171];
                        cA.b();
                        cA.s = new HashMap<K, V>(13);
                        var11_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                        v0 = SecretKeyFactory.getInstance("DES");
                        v1 = new byte[8];
                        v2 = v1;
                        v1[0] = (byte)(var20 >>> 56);
                        for (var12_2 = 1; var12_2 < 8; ++var12_2) {
                            v2 = v2;
                            v2[var12_2] = (byte)(var20 << var12_2 * 8 >>> 56);
                        }
                        var11_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                        var18_3 = new String[16];
                        var16_4 = 0;
                        var15_5 = "\u0084\u001a(9\u00e8\u00a0\u00fd\u00fd\u00f4i`ac\u00ab?\u00f7\u0010\u00ebC\u009c\u0083l)\u00a2Q\u00eb\u0018\u00e2\u00b7\u0012J\u00fb=\u0010\u00daC0U@\u0011B\u00c7\u00b6\u00e6|\u0084Y\u00fd\u00f27\u0010\u0019\u008e\u00a3^\u00b0I\u00b7\u00bb\u0011\n$\u00ca\u00f2\u00d1/?\u0010\u00fd\u00a1\u0014\u00818/\u00025\u001b\u00ce\u00a3\u0093\u00f1\u0097\u00f4\u00e3\u0010Iy\u00fe\u00f6\u0015\u00c4\u00fc\u00a8\u0012\u00a3\b\u00bd\u00b1n\u00844 @\u0097\u0091\u0086\\\u00fb}\u00d5\u001bWZ\"\u00a28\u0099\u00a11 \u007f\u0090\u00f5\u0005\u0004\u008a\u00d2\u00f1#Q\u009c8;I(g\u00dbl\u00c7\u00b2\u00e3\u00f8\u008e\u00f26\u00f0\u0097\u00bf\u00cf)O@]1\u001a\u00fa\u00c9\u00fb\\5\u00ceja\u00db\u001f\u00df\u00f0&+\u00e77\u00d4\u00f9k\u0096\u0010+\u00fbyN\u00ee\u0017\u00da\u00ffnQ\u00a3\u00b6\u0098.\u00fb\u00d0(\u00fe\u00a2\u00a0h\u00d0\u00d4|\t\b)\u00b4\u0018\u0091\u00b1\u00cc\u001f\u00fd'n\u00c9~\u00b05\u00e5\u00b9~7\u00f4\u0092P\u00f6\u00c6LX{5\u000b\u00fe\u00e1\u00ba\u0010\u00ef\u0007\u00ee\u00f2Tr\u001cX@]wc\u0001['*\u0010\u00c0\u0098\u0000\u00ebT\u00f1\u00a4\u0086\u001c\u0089\u00f2;H\u00da+\u00d9\u0010\u00e2\u00d4G)\\\r?\r\u00a0\u001eR/\rY\u0014e 7\u00c1\u0089\u008ankM>\u0085\u0084\u008a\u00a5\u00813\u00f72\u00eap<\u00d3\u00be\"Yk\u00f4\u00fc\u00b1K\u008d\u007f\u00afd";
                        var17_6 = "\u0084\u001a(9\u00e8\u00a0\u00fd\u00fd\u00f4i`ac\u00ab?\u00f7\u0010\u00ebC\u009c\u0083l)\u00a2Q\u00eb\u0018\u00e2\u00b7\u0012J\u00fb=\u0010\u00daC0U@\u0011B\u00c7\u00b6\u00e6|\u0084Y\u00fd\u00f27\u0010\u0019\u008e\u00a3^\u00b0I\u00b7\u00bb\u0011\n$\u00ca\u00f2\u00d1/?\u0010\u00fd\u00a1\u0014\u00818/\u00025\u001b\u00ce\u00a3\u0093\u00f1\u0097\u00f4\u00e3\u0010Iy\u00fe\u00f6\u0015\u00c4\u00fc\u00a8\u0012\u00a3\b\u00bd\u00b1n\u00844 @\u0097\u0091\u0086\\\u00fb}\u00d5\u001bWZ\"\u00a28\u0099\u00a11 \u007f\u0090\u00f5\u0005\u0004\u008a\u00d2\u00f1#Q\u009c8;I(g\u00dbl\u00c7\u00b2\u00e3\u00f8\u008e\u00f26\u00f0\u0097\u00bf\u00cf)O@]1\u001a\u00fa\u00c9\u00fb\\5\u00ceja\u00db\u001f\u00df\u00f0&+\u00e77\u00d4\u00f9k\u0096\u0010+\u00fbyN\u00ee\u0017\u00da\u00ffnQ\u00a3\u00b6\u0098.\u00fb\u00d0(\u00fe\u00a2\u00a0h\u00d0\u00d4|\t\b)\u00b4\u0018\u0091\u00b1\u00cc\u001f\u00fd'n\u00c9~\u00b05\u00e5\u00b9~7\u00f4\u0092P\u00f6\u00c6LX{5\u000b\u00fe\u00e1\u00ba\u0010\u00ef\u0007\u00ee\u00f2Tr\u001cX@]wc\u0001['*\u0010\u00c0\u0098\u0000\u00ebT\u00f1\u00a4\u0086\u001c\u0089\u00f2;H\u00da+\u00d9\u0010\u00e2\u00d4G)\\\r?\r\u00a0\u001eR/\rY\u0014e 7\u00c1\u0089\u008ankM>\u0085\u0084\u008a\u00a5\u00813\u00f72\u00eap<\u00d3\u00be\"Yk\u00f4\u00fc\u00b1K\u008d\u007f\u00afd".length();
                        var14_7 = 16;
                        var13_8 = -1;
lbl32:
                        // 2 sources

                        while (true) {
                            v3 = ++var13_8;
                            v4 = var15_5.substring(v3, v3 + var14_7);
                            v5 = -1;
                            break block23;
                            break;
                        }
lbl37:
                        // 1 sources

                        while (true) {
                            var18_3[var16_4++] = cA.a(var19_9).intern();
                            if ((var13_8 += var14_7) < var17_6) {
                                var14_7 = var15_5.charAt(var13_8);
                                ** continue;
                            }
                            var15_5 = "\u00c6\u0017D\u00d7?\u00ba\u00c1\u001f*\u00dc\u008dP\u00a1JL\u0004\u0010\u00d5\u00f4D\u00a3\u00a7)\u00cf\u00a6\u009b\u001b\u001aC&\b\u00a6~";
                            var17_6 = "\u00c6\u0017D\u00d7?\u00ba\u00c1\u001f*\u00dc\u008dP\u00a1JL\u0004\u0010\u00d5\u00f4D\u00a3\u00a7)\u00cf\u00a6\u009b\u001b\u001aC&\b\u00a6~".length();
                            var14_7 = 16;
                            var13_8 = -1;
lbl46:
                            // 2 sources

                            while (true) {
                                v6 = ++var13_8;
                                v4 = var15_5.substring(v6, v6 + var14_7);
                                v5 = 0;
                                break block23;
                                break;
                            }
                            break;
                        }
lbl51:
                        // 1 sources

                        while (true) {
                            var18_3[var16_4++] = cA.a(var19_9).intern();
                            if ((var13_8 += var14_7) < var17_6) {
                                var14_7 = var15_5.charAt(var13_8);
                                ** continue;
                            }
                            break block24;
                            break;
                        }
                    }
                    var19_9 = var11_1.doFinal(v4.getBytes("ISO-8859-1"));
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
                cA.q = var18_3;
                cA.r = new String[16];
                cA.v = new HashMap<K, V>(13);
                var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
                v7 = SecretKeyFactory.getInstance("DES");
                v8 = new byte[8];
                v9 = v8;
                v8[0] = (byte)(var20 >>> 56);
                for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                    v9 = v9;
                    v9[var1_11] = (byte)(var20 << var1_11 * 8 >>> 56);
                }
                var0_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                var6_12 = new long[32];
                var3_13 = 0;
                var4_14 = "\u00ef\u0088K\"\u00fa\u00fd\u009a\u00b9\u00cem49\u009cS\u0095|\u00a6(a,K}\r\u00fd\u00b7\u009d)\u0000\u00be\u0094\u0080\u00c3\u00bd]\u00d1\u00cd\u00c9\u0080\u00b2\u00dd^\u0096\u00eb\u00bb\u009b(\u0001\u008c\u0096r[\u009f\u00dc@eg\u001c\u00e3o\u00c9B\u00abE\u00bb\u00d7\u00b2o1\nP3\u00c2\u00a77\u0012\u00b4l9\u00ae\u0018\u00b1\u00a1sXa\u00ecB+VC\u0086\u009f\u0095g\u0096\u009b\u0004\u00aa\u00c05\"Q\u00d0s\u0098\u00d0\u0017\u00ffZ\u00bd\t\u0091\u00df3m\u008c\u00caP\u001bU_<UqQN\u0002\u008c\u0015\u00ad\u00f0\u00db\u001a^(\u00ed\u00c4\u00b1W\u00b7CH\u00cb\u00b1\u00aa\u00e7\u0000\u00ad\u00b2!\u00e5#g\"\u00bax\u00c6h\u00f4\u00e3sH\u00a963\u0081\u00e2\u00bb\f\n\u001b\u00e0\u00aa\u0012\u00c1g\b&\u0006\u00a7H\u0089\u00b2\u001b\u0099E\u0084\u00ac7b\b\u0088\u0080T\u0005y\u00ef\u00f8g9WX\u008bG\u00ac\u00f3\t\u00ba\u00d8|c/3-\u00f1\u00b0\r\u0094\u008a\u0096XR(\u0011\u00fdH\u000f;\u0094(\u00fb\u001a\u0017\u001c\u0093\u0085I\u0086'%";
                var5_15 = "\u00ef\u0088K\"\u00fa\u00fd\u009a\u00b9\u00cem49\u009cS\u0095|\u00a6(a,K}\r\u00fd\u00b7\u009d)\u0000\u00be\u0094\u0080\u00c3\u00bd]\u00d1\u00cd\u00c9\u0080\u00b2\u00dd^\u0096\u00eb\u00bb\u009b(\u0001\u008c\u0096r[\u009f\u00dc@eg\u001c\u00e3o\u00c9B\u00abE\u00bb\u00d7\u00b2o1\nP3\u00c2\u00a77\u0012\u00b4l9\u00ae\u0018\u00b1\u00a1sXa\u00ecB+VC\u0086\u009f\u0095g\u0096\u009b\u0004\u00aa\u00c05\"Q\u00d0s\u0098\u00d0\u0017\u00ffZ\u00bd\t\u0091\u00df3m\u008c\u00caP\u001bU_<UqQN\u0002\u008c\u0015\u00ad\u00f0\u00db\u001a^(\u00ed\u00c4\u00b1W\u00b7CH\u00cb\u00b1\u00aa\u00e7\u0000\u00ad\u00b2!\u00e5#g\"\u00bax\u00c6h\u00f4\u00e3sH\u00a963\u0081\u00e2\u00bb\f\n\u001b\u00e0\u00aa\u0012\u00c1g\b&\u0006\u00a7H\u0089\u00b2\u001b\u0099E\u0084\u00ac7b\b\u0088\u0080T\u0005y\u00ef\u00f8g9WX\u008bG\u00ac\u00f3\t\u00ba\u00d8|c/3-\u00f1\u00b0\r\u0094\u008a\u0096XR(\u0011\u00fdH\u000f;\u0094(\u00fb\u001a\u0017\u001c\u0093\u0085I\u0086'%".length();
                var2_16 = 0;
                while (true) {
                    var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                    v10 = var6_12;
                    v11 = var3_13++;
                    v12 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                    v13 = -1;
                    break block25;
                    break;
                }
lbl102:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_16 < var5_15) ** continue;
                    var4_14 = "`l!\u009b\u0082\u00f5\u00c1\u00bd\u000b\u00baS0WCk\u000f";
                    var5_15 = "`l!\u009b\u0082\u00f5\u00c1\u00bd\u000b\u00baS0WCk\u000f".length();
                    var2_16 = 0;
                    while (true) {
                        var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                        v10 = var6_12;
                        v11 = var3_13++;
                        v12 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                        v13 = 0;
                        break block25;
                        break;
                    }
                    break;
                }
lbl121:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_16 < var5_15) ** continue;
                    break block26;
                    break;
                }
            }
            var8_18 = v12;
            var10_19 = var0_10.doFinal(new byte[]{(byte)(var8_18 >>> 56), (byte)(var8_18 >>> 48), (byte)(var8_18 >>> 40), (byte)(var8_18 >>> 32), (byte)(var8_18 >>> 24), (byte)(var8_18 >>> 16), (byte)(var8_18 >>> 8), (byte)var8_18});
            v14 = ((long)var10_19[0] & 255L) << 56 | ((long)var10_19[1] & 255L) << 48 | ((long)var10_19[2] & 255L) << 40 | ((long)var10_19[3] & 255L) << 32 | ((long)var10_19[4] & 255L) << 24 | ((long)var10_19[5] & 255L) << 16 | ((long)var10_19[6] & 255L) << 8 | (long)var10_19[7] & 255L;
            switch (v13) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl134:
                // 1 sources

                ** continue;
            }
        }
        cA.t = var6_12;
        cA.u = new Integer[32];
        cA.a = new int[cA.b("t", (int)5612, (long)(6481362835960215857L ^ var20))][3];
        for (var22_20 = 0; var22_20 < cA.b("t", (int)15912, (long)(5966669834543174399L ^ var20)); ++var22_20) {
            var23_21 = (var22_20 >> 3 & 1) * cA.b("t", (int)12228, (long)(1484684600393696008L ^ var20));
            var24_22 = (var22_20 >> 2 & 1) * cA.b("t", (int)18218, (long)(998757723372153852L ^ var20)) + var23_21;
            var25_23 = (var22_20 >> 1 & 1) * cA.b("t", (int)21056, (long)(1569490185505701505L ^ var20)) + var23_21;
            var26_24 = (var22_20 & 1) * cA.b("t", (int)21056, (long)(1569490185505701505L ^ var20)) + var23_21;
            try {
                if (var22_20 == cA.b("t", (int)2760, (long)(4499445872295716378L ^ var20))) {
                    var24_22 += 85;
                }
            }
            catch (RuntimeException v15) {
                throw cA.c("\u00c5", (Object)v15, (long)1221436646271530107L, (long)var20);
            }
            if (var22_20 >= cA.b("t", (int)28361, (long)(5016390582047130121L ^ var20))) {
                var24_22 /= 4;
                var25_23 /= 4;
                var26_24 /= 4;
            }
            cA.a[var22_20][0] = var24_22;
            cA.a[var22_20][1] = var25_23;
            cA.a[var22_20][2] = var26_24;
        }
    }

    public float e(Object[] objectArray) {
        return this.e;
    }

    public void e(Object[] objectArray) {
        String string = (String)objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        float f10 = ((Float)objectArray[2]).floatValue();
        Color color = (Color)objectArray[3];
        long l = (Long)objectArray[4];
        long l2 = (l = p ^ l) ^ 0x1E5874FFE0DDL;
        Object[] objectArray2 = new Object[6];
        objectArray2[5] = l2;
        objectArray2[4] = (int)cA.c("z", (Object)color, (long)-4088598055657678873L, (long)l);
        objectArray2[3] = Float.valueOf(this.e);
        objectArray2[2] = Float.valueOf(f10);
        objectArray2[1] = Float.valueOf(f);
        objectArray2[0] = string;
        cA.c("z", (Object)this, (Object)objectArray2, (long)-4073687765556042766L, (long)l);
    }

    public void i(Object[] objectArray) {
        String string = (String)objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        float f10 = ((Float)objectArray[2]).floatValue();
        float f11 = ((Float)objectArray[3]).floatValue();
        int n = (Integer)objectArray[4];
        long l = (Long)objectArray[5];
        long l2 = l = p ^ l;
        long l3 = l2 ^ 0x3B3467392B51L;
        long l4 = l2 ^ 0x6DB16E8392F3L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l3;
        objectArray2[1] = Float.valueOf(f11);
        objectArray2[0] = string;
        Object[] objectArray3 = new Object[6];
        objectArray3[5] = l4;
        objectArray3[4] = n;
        objectArray3[3] = Float.valueOf(f11);
        objectArray3[2] = Float.valueOf(f10);
        objectArray3[1] = Float.valueOf(f - cA.c("z", (Object)this, (Object)objectArray2, (long)-5381538201514736135L, (long)l));
        objectArray3[0] = string;
        cA.c("z", (Object)this, (Object)objectArray3, (long)-5379222759264939556L, (long)l);
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = cA.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3C33;
        if (u[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = t[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().threadId();
            Object[] objectArray = (Object[])v.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    v.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/cA", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            cA.u[n2] = n3;
        }
        return u[n2];
    }

    public void b(Object[] objectArray) {
        BiConsumer biConsumer = (BiConsumer)objectArray[0];
        this.l = biConsumer;
    }

    private static Method b(Class clazz, String string, Class clazz2, int n, Class[] classArray) {
        Method method = cA.a(clazz, string, clazz2, n, classArray);
        if (method != null) {
            return method;
        }
        Class<?>[] classArray2 = clazz.getInterfaces();
        if (classArray2 != null) {
            for (int i = 0; i < classArray2.length; ++i) {
                method = cA.b(classArray2[i], string, clazz2, n, classArray);
                if (method == null) continue;
                return method;
            }
        }
        return null;
    }

    public float b(Object[] objectArray) {
        Object object;
        float f;
        block12: {
            long l;
            long l2;
            String string;
            block11: {
                Float f10;
                CallSite callSite;
                block10: {
                    Object object2;
                    block8: {
                        block9: {
                            string = (String)objectArray[0];
                            f = ((Float)objectArray[1]).floatValue();
                            l2 = (Long)objectArray[2];
                            l = (l2 = p ^ l2) ^ 0x17DA539C933L;
                            callSite = cA.c("\u00c5", (long)5540706248171409064L, (long)l2);
                            try {
                                try {
                                    object2 = string;
                                    if (callSite != null) break block8;
                                    if (cA.c("z", (Object)object2, (long)5539319173398162117L, (long)l2) == false) break block9;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw cA.c("\u00c5", (Object)runtimeException, (long)5538583235788007509L, (long)l2);
                                }
                                return 0.0f;
                            }
                            catch (RuntimeException runtimeException) {
                                throw cA.c("\u00c5", (Object)runtimeException, (long)5538583235788007509L, (long)l2);
                            }
                        }
                        object2 = cA.c("z", (Object)this.i, (Object)string, (long)5535742439082965594L, (long)l2);
                    }
                    Float f11 = (Float)object2;
                    try {
                        f10 = f11;
                        if (callSite != null) break block10;
                        if (f10 == null) break block11;
                    }
                    catch (RuntimeException runtimeException) {
                        throw cA.c("\u00c5", (Object)runtimeException, (long)5538583235788007509L, (long)l2);
                    }
                    f10 = f11;
                }
                object = cA.c("z", (Object)f10, (long)5542975422832758528L, (long)l2);
                if (callSite == null) break block12;
            }
            float[] fArray = new float[]{0.0f};
            Object[] objectArray2 = new Object[3];
            objectArray2[2] = l;
            objectArray2[1] = (arg_0, arg_1) -> cA.lambda$getWidth$3(fArray, arg_0, arg_1);
            objectArray2[0] = string;
            cA.c("z", (Object)this, (Object)objectArray2, (long)5539945142275605683L, (long)l2);
            object = fArray[0];
            cA.c("z", (Object)this.i, (Object)string, (Object)cA.c("\u00c5", (float)object, (long)5540282056890058875L, (long)l2), (long)5535513688133981372L, (long)l2);
        }
        return f * object;
    }

    private static Field b(Class clazz, String string, Class clazz2) {
        Field field = cA.a(clazz, string, clazz2);
        if (field != null) {
            return field;
        }
        Class<?>[] classArray = clazz.getInterfaces();
        if (classArray != null) {
            for (int i = 0; i < classArray.length; ++i) {
                field = cA.b(classArray[i], string, clazz2);
                if (field == null) continue;
                return field;
            }
        }
        return null;
    }

    private static void b() {
        Object[] objectArray = w;
        w[0] = "@\u0001\u001fR\u0014\u001eV\u0001\u001a\b\u0007\tAJ\u0019\u000e\u000b\u001dP\r\u000e\u0019@\re";
        objectArray[1] = "9k\u0005{S\u000bLK\u000etBD-E\u0005\u007fF\u001eY";
        objectArray[2] = "tQtNY\u001cbQq\u0014J\u000bu\u001ar\u0012F\u001fd]e\u0005\r\u000b\\";
        objectArray[3] = "\u0014p>\bb>\u0002p;Rq)\u0015;8T}=\u0004|/C6-4";
        objectArray[4] = "]c\u0002A)\u0002(C\tN8MIM\u0002E<\u0017=";
        objectArray[5] = Float.TYPE;
        cA.x[5] = "java/lang/Float";
        objectArray[6] = "#\u0018\u0018{h4=\u0010\u00024 4'\u001a\u001as)/g?\u001bt%5 \u0016\u0000";
        objectArray[7] = "CWm1\u0004DHX|~eJCSx$";
        objectArray[8] = "`\u0005\u0012^,S\u0015%\u0019Q=\u001ct+\u0012Z9F\u0000";
        objectArray[9] = Void.TYPE;
        cA.x[9] = "java/lang/Void";
        objectArray[10] = "vu+u\u0016``u./\u0005ww>-)\tcfy:>Bwp";
        objectArray[11] = "n\u0003^\u0018sR\u001b#U\u0017b\u001dz-^\u001cfG\u000e";
        objectArray[12] = "\u0013\u0016 LTN\r\u001e:\u00037Z\t";
        objectArray[13] = "\b1\u000bB(>}\u0011\u0000M9q\u001c\u001f\u000bF=+h";
        objectArray[14] = "\\\u001bK2\u000e\u0012);@=\u001f]H5K6\u001b\u0007<";
        objectArray[15] = "c\u0011_c%U~\u0004\u0007AdXf\u0002";
        objectArray[16] = Integer.TYPE;
        cA.x[16] = "java/lang/Integer";
        objectArray[17] = "$n-$\u0007XQN&+\u0016\u00170@- \u0012MD";
        objectArray[18] = "&A\u0005R\u0003\u001e0A\u0000\b\u0010\t'\n\u0003\u000e\u001c\u001d6M\u0014\u0019W\u000f\n";
        objectArray[19] = "42H\u001749A\u0012C\u0018%v<\nP\u001f,?T";
        objectArray[20] = "10N\u0001\u0019}=8OJPu!0M\u00014a=1fC\u001b\u007f71W";
        objectArray[21] = "6M\u0002y\u0013?Cm\tv\u0002p\"c\u0002}\u0006*V";
        objectArray[22] = "Q\u0000'Nf\u0001G\u0000\"\u0014u\u0016PK!\u0012y\u0002A\f6\u00052\u0013b";
        objectArray[23] = "nIC&\r_\u001biH)\u001c\u0010zgC\"\u0018J\u000e";
        objectArray[24] = "Xl\bx\u0000ZNl\r\"\u0013MY'\u000e$\u001fYH`\u00193TIy";
        objectArray[25] = "hK~h\u0012Q\u001dkug\u0003\u001e|e~l\u0007D\b";
        objectArray[26] = "Hhn\u0012gqCg\u007f]\u001duPfo\u0012+qG";
        objectArray[27] = ">pk@uY>p|\u001cyV$;|\u0002yC#J.^)\u0001";
        objectArray[28] = "\ff3_)5\u0012n)\u0010N4\u0003u$Jh2";
        objectArray[29] = Boolean.TYPE;
        cA.x[29] = "java/lang/Boolean";
        objectArray[30] = "k\u0014$\u000be_n\u0001/\u000bfXa\b$I'oHWr";
        objectArray[31] = "[%[\u0004\u0011,W-ZOX$K%X\u0004<0W$fK\u00040]8";
        objectArray[32] = "ljd\u0016c\u0002i%@\u0012,\u000fcy";
        objectArray[33] = "\u001ex\u001b\r}*kX\u0010\u0002le\nV\u001b\th?~";
        objectArray[34] = "\u001c8^i9\n\u00100_\"p\u0002\f8]i\u0014\u0016\u00109|%4\u0000\u001c#";
        objectArray[35] = "P(\f%vV['\u001dj\u000bNH \u0014#";
        objectArray[36] = "&wLr\u001en*\u007fM9Wf6wOr3r*v`.\u000b`<";
        objectArray[37] = "ts\\\u000bdfw}\u0004(3|{P_\f,ml";
        objectArray[38] = "6b@N2RCBKA#\u001d\"L@J'GV";
        objectArray[39] = "l\u000eCee<\u0019.Hjtsx Cap)\f";
        objectArray[40] = "\t\u001bR5\u001bQ\f\u000eY55S\u0000\u000fPi\"R\u000f\u0005F";
        objectArray[41] = "\u0006x=\t\u0007HsX6\u0006\u0016\u0007\u0012V=\r\u0012]f";
        objectArray[42] = "*jWl\"H)d\u000fOuR%DSiiT";
        objectArray[43] = "\"$Z) <'ke&~ <\u0016X:k4%";
        objectArray[44] = "?N7Ga\f;S7V|\fx\\xA{\u0010\"Su\u001cf\u000b\"I7{a\u0011du{Xj\u0006\"uiWa-7Iq\u007fn\u0015";
        objectArray[45] = "497d _A\u0019<k1\u0010 \u00177`5JT";
        objectArray[46] = "K>Wu`]>\u001e\\zq\u0012_\u0010WquH+";
        objectArray[47] = "|\u0004\u0005xD,j\u0004\u0000\"W;}O\u0003$[/l\b\u00143\u00108z";
        objectArray[48] = "X$T\u0014\ti-\u0004_\u001b\u0018&L\nT\u0010\u001c|8";
        objectArray[49] = "\"p6KByWP=DS66^6OWlB";
        objectArray[50] = "d)zAF,\u0011\tqNWcp\u0007zES9\u0004";
        objectArray[51] = "P\u0001{;'?%!p46pD/{?2*0";
        objectArray[52] = "AK?\u0014\u0011/4k4\u001b\u0000`Ue?\u0010\u0004:!";
        objectArray[53] = "qN\u0005*3t\u0004n\u000e%\";e`\u0005.&a\u0011";
        objectArray[54] = "\u001b\u0002h\u000e\u0011\u0015n\"c\u0001\u0000Z\u000f,h\n\u0004\u0000{";
        objectArray[55] = "\u0010\u0012eo (e2n`1g\u0004<ek5=p";
        objectArray[56] = "G\u007f)\u0013\u0000y2_\"\u001c\u00116SQ)\u0017\u0015l'";
        objectArray[57] = "b!/\u000b\u0012.\u0017\u0001$\u0004\u0003av\u000f/\u000f\u0007;\u0002";
        objectArray[58] = "e-F#\u007fOs-CylXdf@\u007f`Lu!Wh+X`";
        objectArray[59] = "_\u00182X u*89W1:K62\\5`?";
        objectArray[60] = "{x\u000f]S4\u000eX\u0004RB{oV\u000fYF!\u001b";
        objectArray[61] = "q3\u0012\u000e\re\u0004\u0013\u0019\u0001\u001c*e\u001d\u0012\n\u0018p\u0011";
        objectArray[62] = "slm5l4\u0006Lf:}{gBm1y!\u0013";
        objectArray[63] = "z\u0005\u0012'Df\u000f%\u0019(U)n+\u0012#Qs\u001a";
        objectArray[64] = "Mo\u0017W`>[o\u0012\rs)L$\u0011\u000b\u007f=]c\u0006\u001c4(~";
        objectArray[65] = "\u0013o\u0017\u0012&nfO\u001c\u001d7!\u0007A\u0017\u00163{s";
        objectArray[66] = "lO_%\u001dXzOZ\u007f\u000eOm\u0004Yy\u0002[|CNnIOY";
        objectArray[67] = "m{r\u000bt\u001esshD<\u001eiyp\u00035\u0005)Xm)5\u0005toi\u000f(";
        objectArray[68] = "=/1:|\tH\u000f:5mF)\u00011>i\u001c]";
        objectArray[69] = "\u0019zCyv|\u000fzF#ek\u00181E%i\u007f\tvR2\"k)";
        objectArray[70] = ";\u0010(\u0015,HN0#\u001a=\u0007/>(\u00119][";
        objectArray[71] = "\u0000\u0015\u0000\u00043?\u0016\u0015\u0005^ (\u0001^\u0006X,<\u0010\u0019\u0011Og(7";
        objectArray[72] = "{8I30\u000fm8Li#\u0018zsOo/\fk4Xxd\u001b^";
        objectArray[73] = "-\u0004fV\u0017)X$mY\u0006f9*fR\u0002<M";
        objectArray[74] = "c\u00075-#a}\u000f/bn{g\u00056>\u007fqg\u0012m-y{d\u000f bL`f\u000b*/_qo\u00031)cwl";
        objectArray[75] = "\u000e/\njt4\u0005 \u001b%\u001c4\u000b/\b";
        objectArray[76] = "d\u0005ac{c\u0011%jlj,p+agnv\u0004";
        objectArray[77] = "d`\u0005\u0015R\r\u0011@\u000e\u001aCBpN\u0005\u0011G\u0018\u0004";
        objectArray[78] = "\u001aI/p\u0013j\fI**\u0000}\u001b\u0002),\fi\nE>;G~\n";
        objectArray[79] = "T/b\tl0!\u000fi\u0006}\u007f@\u0001b\ry%4";
        objectArray[80] = "h?u+7`\u001d\u001f~$&/|\u0011u/\"u\b";
        objectArray[81] = "\u0015F\u0017Z'\u0015\u001eI\u0006\u0015Z\r\rN\u000f\\K\f\u0016K\u0005^{";
        objectArray[82] = "\\VA#buWYPl\u000fqWEV!8|D";
        objectArray[83] = "\u0001\u001d0uq'\u0017\u001d5/b0\u0000V6)n$\u0011\u0011!>%4'";
        objectArray[84] = "B\u0015\u0003$p/75\b+a`V;\u0003 e:\"";
        objectArray[85] = "c>yvLaj!4nB\u00183S\u007fs@\"4i-,Ya6Sx{C#%/-\u007f\u0002tZ";
        objectArray[86] = "R;s7f4Vd-]4TR`1g3n\u0000?($1TRd|96=\u000f|%3!T";
        objectArray[87] = "7\"hHU\u00160#,\u0013;\u001e:tJ\u0004C\u000f,uj\u0002V\u001bVy+\u0000\n\u00197~*DQwhuoBD\u000b=q.\u0015;";
        objectArray[88] = "\u0016Eb\u000b\"o\u0001E'FHf\u0016\b\u0010O\to\u0007t3\u000544\u0019\u0018(T8p{";
        objectArray[89] = "\b\u001cz3t<\u000bM&t\nn\u0011F:g\n;\u0018_zuvn\u001c\u001e-\n";
        objectArray[90] = ",<\u0016\u000bPM>?\u0014\n5PC{\u0011L\u000f^y)NUL\\Cy\u000bOE\f)x\u0017LE0";
        objectArray[91] = "\u001f{$I;\r\rx&H^\u001cp<#\u000ed\u001eJn|\u0017'\u001cp>9\r.L\u001a?%\u000e.p";
        objectArray[92] = "#g4(\u000eql&w2q2nkMvK;h&$tK0*\u0017pq\u00001\"~rq\u000bs\u0013*w:\n{z(w1HJ";
        objectArray[93] = "\u001dw%fD\u0004\u001c{~x$\ns(&x\u001e\u000fIzya]\rs/.{\u001f\u001e\u000fz*:Ha";
        objectArray[94] = "ZLQfsf\u0007ATqq\u0000\fOH\tv:\u0012Y\u0005`t:\u0019\u001b4";
        objectArray[95] = "\t\u001fPq=OF^\u0013kB\u001bT\u0013)/x\u0005B^@-x\u000e\u0000o\u0014(3\u000f\b\u0006\u0016(8M9";
        objectArray[96] = "\u0003lW\b\u0012\u0000\u00073\tb@`[h\u0011SG\u0001\\iU\b)\u0001\u0000+Y\fH\u0006\u0001o\u0002b";
        objectArray[97] = "T\u0006so*1F\u0005qnO';At(u\"\u0001\u0013+16 ;Cn+?pQBr(?L";
        objectArray[98] = "\r\u0011iW!\u0011T\u000fp\u001c\u0018\u000b\u0006\fR\u000bh\u0017o\u0014\u007fZ%\bP\u000b*\u0002{k";
        objectArray[99] = "Lz\u0002<Zq\u001ex\u00020*vC<X&FD\u0012{\u0002z*y\u001f<\u0005#FbN0AA";
        objectArray[100] = "d7\\\u0015r\u001b;`[I\u0012\u0017d\u0005\\\u0000\u007f\u001c[!Z\n\u007f\u0019\u00007\f\f/\u001al,]\u0000kxjlAMp\u0014q=M\t\u0012Fm#\u0006\u000fn\u0013ibQp";
        objectArray[101] = ";ZV\u007fHh1\\\u0015a&v6XVk|c6N@|&koH\u0016g@h;\u001d\u0013\u0006K?d\u001dG`\\?!P-";
        objectArray[102] = "\u000b%{qH5\n) o(9ezxo\u0012>_('vQ<e-{tK0\u0000,w/UP";
        objectArray[103] = "$z_>x=&kY9\u0002h/y< hj(`D\u007f3lx\u0005Qv98(cFv|uB";
        objectArray[104] = "e\u001a9m_f\u007f\f{d48a\u001d9uH>gp!zIh$\nxdP#\u001d";
        objectArray[105] = ">$1p\u0002/k%&drvzl?\u007fr\"8e ?\u001b 8nb\u000eO%sojgM%x-[";
        objectArray[106] = "6q\u001c<C\u0012i*\u001al&\u000b*V\u0014.Z\u001bQx\u001aj\u001b\tngO2Ej";
        objectArray[107] = "\u001dp\u00178c\u000e\npRu\t\u0007\u001d=e|K\u0013\u0017'kmk\u0005\u001b=,av\u000b\t;\u0016cg\r\u000eA";
        objectArray[108] = "IWXk\b\u0003KF^lrVBTri0BHN|x\u0010TDT;u\u0018TEMC*CR\u0015(]m\u0011@U\u0012_|\u0017G/";
        objectArray[109] = "t|E9H}p#\u001bS\u001c\u001dt'\u0007i\u001d'&x\u001e*\u001f\u001dv=\u0004#Oww!\u0007#s";
        objectArray[110] = "(\u0001X\u0006]')\r\u0003\u0018=/F^[\u0018\u0007,|\f\u0004\u0001D.FYS\u001b\u0006=:\fWZQB";
        objectArray[111] = "v&[:;g'?TmZbL\u007f\u000f.`ev-P7#gL}\u0015-*7&|\t.*\u000b";
        objectArray[112] = "\u0001\u0010Y\u0011L\u0007\u0000\u001c\u0002\u000f,\t\u000b\u0011D\u001f,\\\u0002\b\u0004\rP\t\u0006ISr";
        objectArray[113] = "xC\b/HB'\u0018\u000e\u007f-QxE\b\u001dJ[yU,9-P.UX'AK\u007fY\u001cEG\u000bc\u0014\u0007)\\ZoPe";
        objectArray[114] = "Xk\u0017t\"\u0014\\4I\u001eptX0U$wN\noLgutX3Pzy\u0019\u001f8Ds\u0019";
        objectArray[115] = "b\u0002C.a3'KQ's\f12\n)c65\bXvzu72\n%/n8YC+f1j2";
        objectArray[116] = "zJF]\u0003\u0015?\u0013IX\n~*HLM\u000b\u0002C\u001e\u001dQ\bO*\u001c\u001dZJ~~\u0019V[B\u0017|\u0019]\u0019s@.]\u001c_\u000f\u0015*\u001cK ";
        objectArray[117] = "%rd\u0004\u0017`7qf\u0005r|J5cCHspg<Z\u000bqJ7y@\u0002! 6eC\u0002\u001d";
        objectArray[118] = "3\u0018%\u0002I9j\u001cs[RRa\u001c Gh5w\u001a5=IcvA+QR2z\u0005IW\u0012.7\u001e%LC\"s|";
        objectArray[119] = "\u0018*lf\r\u001b\u0019&7xm\u0012vuoxW\u0010L'0a\u0014\u0012vrg{V\u0001\n'c:\u0001~";
        objectArray[120] = "^,\u000bp\u0004+\u00186L'n)B1\rH\u0016;Xh\u001f$P!\u001f?u";
        objectArray[121] = "kZuf&\u001b V`s0r8f z$H<\\r%=\u000b>f'r'I-\u001arvf\u001eR";
        objectArray[122] = "xB  z@zL\"1\u001b\u0002x@B#*\u00068^.8{\n|<\u007fsj\u00014U}saC\u0005\u0001x8`Kl\u0003x3\"z";
        objectArray[123] = "\u001cF`\u0019%\u001aND`\u0015U\u0013\u001a\u001b!\tUF\u0013\u0002a\u001b)\u0013\u0017C6d";
        objectArray[124] = "\u0017Po4+F\u0013\u000f1^y&\u0017\u000b-d~\u001cET4'|&\u0010\u0003.eoZE\u0007o2\u0010";
        objectArray[125] = "\\{\u0017\u0017\n}Tj\u001aIzlXi=:0\u0003_$\u001bH\u0018oDu\u0017\fz";
        objectArray[126] = "DLr\t#\u0012\u0019@k\u0005x~\u0001HN\u00052\u001f\u001b@\u0015\u001e\"\u0013\u0017JmAy\u0015G/";
        objectArray[127] = "\u0004i73l\u0012\u0005el-\f\u001dj64-6\u0019Pdk4u\u001bj1<.7\b\u0016d8o`w";
        objectArray[128] = "\u0001\u001ad\u0013\u0013^\u0005E:yF>\u0001A&CF\u0004S\u001e?\u0000D>\u0003[%\t\u0014T\u0002G&\t(";
        objectArray[129] = "_\t\u001e5\rpD\u0017\bhjk J\u0016*Pl\u001a\u0018I3\u0013n \u000eNlS|\u0019\r\u001f0\u0014\u0002";
        objectArray[130] = "V8lh/\u0006\tcj8J\u0013H/hf1~\fhpy{\u0017\u000eh{;J\u001dZn<au\u0002\u000f6b\u0002";
        objectArray[131] = "K\u001ckNT~Y\u001fiO1j$[l\t\u000bm\u001e\t3\u0010Ho$Yv\nA?NXj\tA\u0003";
        objectArray[132] = "kD\\o%:yG^n@)\u0004\u0003[(z)>Q\u000419+\u0004\u0001A+0{n\u0000](0G";
        objectArray[133] = "\t\"5\"T\u0004\r}kH\nd\tywr\u0001^[&n1\u0003d\u000eqts\u0010\u0018[u5$o";
        objectArray[134] = "\u0006\t<?\u00125U\u0019u,k.m\u001c\u007f}\u0004~\r\u00198\u007f\u0010D";
        objectArray[135] = "~a\u0006H$clb\u0004IAq\u0011&\u0001\u000f{p+t^\u00168r\u0011$\u001b\f1\"{%\u0007\u000f1\u001e";
        objectArray[136] = "ZNq!wj\u000bM'b\u00158d\u0005z%/?^W%<l=d\fo!v._C.blQ";
        objectArray[137] = "~\u0012HE<Bi\u0012\r\bVK~_:\u0001\u0018@tJ\u000fzm[mSO\u0010lGnSs";
        objectArray[138] = "YjO\\\u00161\bs@\u000bw4c3\u001bHM3YaDQ\u000e1c0\u001e\u0004\u001e<\u000fa\u0007\u000bI]";
        objectArray[139] = "Q#t\u000en\rS-v\u001f\u000fXA!\u0016\r>K\u0011?z\u0016oGU]+]~L\u001d4)]u\u000e,";
        objectArray[140] = "!\u000b3EKA3\b1D.UNL4\u0002\u0014Rt\u001ek\u001bWPN\u001f`\u0003\u0013^\"\u00041\u000fW<";
        objectArray[141] = "#syM\u0007\u001aqqyAw\u001d,5#W\u001b/}r{\u000fw\u0012p5~R\u001b\t!9:0";
        objectArray[142] = "a\u0016\u0005\u0002hleI[h9\faMGR=63\u0012^\u0011?\fcWD\u0018ofbKG\u0018S";
        objectArray[143] = "3I\u0016a\rnaK\u0016m}i<\u000fL{\u0011[oJ\u001d E\f;BP!\u001f` \u0013\\e}f`\u000f\u0011~\u0011}1\u0003U\u001c\u0017=-NNp\fl!\n,";
        objectArray[144] = "oi#h$\u0014)sd?N\u0000ji\u001c62x}$!m,\u0014fu-)N\u0000kke:\"Fq,2P";
        objectArray[145] = "(Vx\u0007\u0019t,\t&mN\u0014(\r:WL.zR#\u0014N\u0014*\u00179\u001d\u001e~+\u000b:\u001d\"";
        objectArray[146] = "+yA4\"\u00019zC5G\u0015D>Fs}\u0012~l\u0019j>\u0010Dh]l}\u00199z^n||";
        objectArray[147] = "W$GlF3S{\u0019\u0006\rSW\u007f\u0005<\u0013i\u0005 \u001c\u007f\u0011SPw\u0006=\u0002/\u0005sGj}";
        objectArray[148] = "M%A\u0015\u007fo\blS\u001cmP\u001d\u0015\b\u0012}j\u001a/ZMd)\u0018\u0015\b\u001b{,EzH\u001dio\u0019\u0015";
        objectArray[149] = "W4trh1Sk*\u00185QWo6\"=k\u00050/a?QPg5#,-\u0005cttS";
        objectArray[150] = "\u0015|\u001fv\u000f\u001fHp\u0006zTsEg\u0000k\u0002\u001f,x\u0012k\u000e\u0016T'Im^s\u0015|\u001fv\u000f\u001fHp\u0006zTs";
        objectArray[151] = "n8[4\u001a\u0007~2S0eTn/]0\bue>Y\u0006\u0018Qz/NL\u000f\u000eh\u007fV \u0014_d;44\u0019A,(Xr\u0003\u0006{B";
        objectArray[152] = "D\u0002\u000fVeA\u0004R\u0001]h?\u0003\u0004\bOgx\u0013mWMtOA\u0007VQwO}T\u0003QnP\u0003\u0014S_e]}";
        objectArray[153] = "3q3\u000eJ{jo*Esg<g2?N; l\u007fVL;+.N";
        objectArray[154] = "\u0017V>\u0003\"\u0007\u0000V{NH\u000e\u0017\u001bLG\u0013\u001d\u0000\u0006cSH\u0006\u0010\noY0YK\f?<";
        objectArray[155] = "25d\nQ\u0001mnbZ4\u001d89f\u001cTy?nu]V\u0015$?y\u00194";
        objectArray[156] = "(U\u0007\u001d@\u001e:V\u0005\u001c%\tG\u0012\u0000Z\u001f\r}@_C\\\u000fG\u0010\u001aYU_-\u0011\u0006ZUc";
        objectArray[157] = "\u001eT\u0007\u001f\f\u0017XN@Hf\u001c\u001cD\u0014]f\u0007\u0005E\u0001\u001e\u001cE\u0019\u0011\u000b'\u001e\u0007\u0018\u0010\u0013KX\u001d_Gy";
        objectArray[158] = "Uf_;#Q\u0007d_7SVZ \u0005!?d\u000bg]wSN\ng\\8jM[;\u001bF1\t\r!\u0015$c\u000b\r-e";
        objectArray[159] = "KCTQm#\u000b^\u0012\u0003#J\u001b&\u0003\u0003.w\u0010J\u0018R\"3rI\u0017Ph/\u000f[\u0014RiJ\u0011MU\u000f1u\u000e\u0018\rQR";
        objectArray[160] = "iU\\eX-m\n\u0002\u000f\u0003Mi\u000e\u001e5\rw;Q\u0007v\u000fMn\u0006\u001d4\u001c1;\u0002\\cc";
        objectArray[161] = "`HU<8Qd\u0017\u000bVj1`\u0013\u0017lm\u000b2L\u000e/o1b\t\u0014&?[c\u0015\u0017&\u0003";
        objectArray[162] = "\n_\u0003\u0001C[WS\u001a\r\u00187ZD\u001c\u001cN[x[\b\u001cpPRZ\u0018qB\u0006O\u0001\u0006\u001dYWCEdHKPCW\b\u0015GIO\fd";
        objectArray[163] = "n`\u001fRTQu~\t\u000f3J\u0011#\u0017M\tM+qHTJO\u0011e\b]QDc~\u0016K\f#";
        objectArray[164] = "]ptDSP\fi{\u00132Vg) P\bR]{\u007fIKPg+:SB\u0000\r*&PB<";
        objectArray[165] = " 8\u0016r*\u0006\")\u0010uPS+;<p\u0012G!!<q*U7G\u0012a=V#?M:;\u0006F?\u001fq!Wy%\t3(<";
        objectArray[166] = "O,\u0001\u001fc4\u000f|\u000f\u0014nJ\u0018'\u0005\u0012p\u0014\u001f'\u001f\u0016\fq\t=\u0012Gfp\u0015>\u0012{";
        objectArray[167] = "I\u0002\u000b0Kb\fK\u00199Y]\u00192B7Ig\u001e\b\u0010hP$\u001c2B9]\"\u000f\b\n+F\"\u00132";
        objectArray[168] = "_$q\u0005RHM's\u00047X0cvB\r[\n1)[NY0alAG\tZ`pBG5";
        objectArray[169] = "Uhwr\u0010aQ7)\u0018E\u0001U35\"E;\u0007l,aG\u0001R;6#T}\u0007?wt+";
        Object[] objectArray2 = objectArray;
        objectArray[170] = "#t\u000ff`\nah[lY4\u001eK>Z\u0014'\u0012Q._\u00106_k\u0001s!I%)\u001d'+";
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/cA" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Class b(long l, long l2) {
        Object object;
        Class<?> clazz;
        block2: {
            clazz = null;
            int n = cA.a(l, l2);
            object = w[n];
            try {
                if (!(object instanceof String)) break block2;
                cA.w[n] = clazz = Class.forName(x[n]);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        clazz = (Class<?>)object;
        return clazz;
    }

    private void x(Object[] objectArray) {
        String string = (String)objectArray[0];
        cB cB2 = (cB)objectArray[1];
        long l = (Long)objectArray[2];
        l = p ^ l;
        CallSite callSite = cA.c("z", string, (long)6284702696835657147L, (long)l);
        CallSite callSite2 = cA.c("\u00c5", (long)6282745018239178108L, (long)l);
        Object object = 0;
        while (object < callSite) {
            CallSite callSite3;
            Object object2;
            CallSite callSite4;
            block15: {
                block16: {
                    callSite4 = cA.c("z", string, (int)object, (long)6272672347265371603L, (long)l);
                    try {
                        try {
                            try {
                                try {
                                    object2 = callSite4;
                                    callSite3 = cA.b("t", (int)12943, (long)(0x39E98592D548D9A1L ^ l));
                                    if (callSite2 != null) break block15;
                                    if (object2 != callSite3) break block16;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw cA.c("\u00c5", (Object)runtimeException, (long)6271616176864424833L, (long)l);
                                }
                                object2 = object + 1;
                                callSite3 = callSite;
                                if (callSite2 != null) break block15;
                            }
                            catch (RuntimeException runtimeException) {
                                throw cA.c("\u00c5", (Object)runtimeException, (long)6271616176864424833L, (long)l);
                            }
                            if (object2 >= callSite3) break block16;
                        }
                        catch (RuntimeException runtimeException) {
                            throw cA.c("\u00c5", (Object)runtimeException, (long)6271616176864424833L, (long)l);
                        }
                        object += 2;
                        if (callSite2 == null) continue;
                    }
                    catch (RuntimeException runtimeException) {
                        throw cA.c("\u00c5", (Object)runtimeException, (long)6271616176864424833L, (long)l);
                    }
                }
                object2 = object;
                callSite3 = cA.c("\u00c5", (int)callSite4, (long)6272651305191460210L, (long)l);
            }
            object = object2 + callSite3;
            cE cE2 = (cE)((Object)cA.c("z", (Object)this.h, (int)callSite4, (long)6283544380185793361L, (long)l));
            try {
                if (cE2 == null) {
                    continue;
                }
            }
            catch (RuntimeException runtimeException) {
                throw cA.c("\u00c5", (Object)runtimeException, (long)6271616176864424833L, (long)l);
            }
            try {
                if (cA.c("z", (Object)cB2, (int)callSite4, (Object)cE2, (long)6284386964478278354L, (long)l) == false) {
                    return;
                }
            }
            catch (RuntimeException runtimeException) {
                throw cA.c("\u00c5", (Object)runtimeException, (long)6271616176864424833L, (long)l);
            }
            if (callSite2 == null) continue;
        }
    }

    public void s(Object[] objectArray) {
        String string = (String)objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        float f10 = ((Float)objectArray[2]).floatValue();
        float f11 = ((Float)objectArray[3]).floatValue();
        Color color = (Color)objectArray[4];
        long l = (Long)objectArray[5];
        long l2 = (l = p ^ l) ^ 0x6554D47F27FAL;
        Object[] objectArray2 = new Object[6];
        objectArray2[5] = l2;
        objectArray2[4] = (int)cA.c("z", (Object)color, (long)1435378521370657614L, (long)l);
        objectArray2[3] = Float.valueOf(f11);
        objectArray2[2] = Float.valueOf(f10);
        objectArray2[1] = Float.valueOf(f);
        objectArray2[0] = string;
        cA.c("z", (Object)this, (Object)objectArray2, (long)1429163661007213553L, (long)l);
    }

    private static Field c(long l, long l2) {
        int n = cA.a(l, l2);
        Object object = w[n];
        if (object instanceof String) {
            String string = x[n];
            int n2 = string.indexOf(8);
            Class clazz = cA.b(Long.parseLong(string.substring(0, n2), 36), 0L);
            int n3 = string.indexOf(8, ++n2);
            String string2 = string.substring(n2, n3);
            Class clazz2 = cA.b(Long.parseLong(string.substring(++n3), 36), 0L);
            Class clazz3 = clazz;
            while (true) {
                Field field;
                if ((field = cA.a(clazz3, string2, clazz2)) != null) {
                    cA.w[n] = field;
                    return field;
                }
                Class<?>[] classArray = clazz3.getInterfaces();
                if (classArray != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        field = cA.b(classArray[i], string2, clazz2);
                        if (field == null) continue;
                        cA.w[n] = field;
                        return field;
                    }
                }
                if (clazz3.getName().equals("java.lang.Object")) break;
                if ((clazz3 = clazz3.getSuperclass()) != null) continue;
                clazz3 = cA.b(516167895963565L, 0L);
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("NoSuchFieldException in ").append(clazz.getName()).append(' ').append(clazz2.getName()).append(' ').append(string2);
            throw new RuntimeException(stringBuffer.toString());
        }
        return (Field)object;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string, methodType), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/cA" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    public float c(Object[] objectArray) {
        long l = (Long)objectArray[0];
        long l2 = (l = p ^ l) ^ 0x1B9A987393DBL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l2;
        objectArray2[0] = Float.valueOf(this.e);
        return (float)cA.c("z", (Object)this, (Object)objectArray2, (long)7436976165680019902L, (long)l);
    }

    public void c(Object[] objectArray) {
        Function function = (Function)objectArray[0];
        this.m = function;
    }

    public void n(Object[] objectArray) {
        Matrix4f matrix4f = (Matrix4f)objectArray[0];
        String string = (String)objectArray[1];
        float f = ((Float)objectArray[2]).floatValue();
        float f10 = ((Float)objectArray[3]).floatValue();
        float f11 = ((Float)objectArray[4]).floatValue();
        Color color = (Color)objectArray[5];
        long l = (Long)objectArray[6];
        long l2 = (l = p ^ l) ^ 0xBB1C61829D7L;
        CallSite callSite = cA.c("z", (Object)color, (long)-4459668387519147335L, (long)l);
        int n = (callSite >>> cA.b("t", (int)14559, (long)(0x9D9240933E5C6F8L ^ l)) & cA.b("t", (int)19208, (long)(0x5A7D4C0393DA352DL ^ l))) * cA.b("t", (int)7124, (long)(0x1907BED705FCE5F5L ^ l)) >> cA.b("t", (int)21583, (long)(0x17CE5B0861C7AA7FL ^ l));
        int n2 = n << cA.b("t", (int)21212, (long)(0x6E5461929C0D2CF7L ^ l));
        Object[] objectArray2 = new Object[7];
        objectArray2[6] = l2;
        objectArray2[5] = n2;
        objectArray2[4] = Float.valueOf(f11);
        objectArray2[3] = Float.valueOf(f10 + 0.5f);
        objectArray2[2] = Float.valueOf(f + 0.5f);
        objectArray2[1] = string;
        objectArray2[0] = matrix4f;
        cA.c("z", (Object)this, (Object)objectArray2, (long)-4455356943667048847L, (long)l);
        Object[] objectArray3 = new Object[7];
        objectArray3[6] = l2;
        objectArray3[5] = (int)callSite;
        objectArray3[4] = Float.valueOf(f11);
        objectArray3[3] = Float.valueOf(f10);
        objectArray3[2] = Float.valueOf(f);
        objectArray3[1] = string;
        objectArray3[0] = matrix4f;
        cA.c("z", (Object)this, (Object)objectArray3, (long)-4455356943667048847L, (long)l);
    }

    public void h(Object[] objectArray) {
        Matrix4f matrix4f = (Matrix4f)objectArray[0];
        String string = (String)objectArray[1];
        float f = ((Float)objectArray[2]).floatValue();
        float f10 = ((Float)objectArray[3]).floatValue();
        float f11 = ((Float)objectArray[4]).floatValue();
        int n = (Integer)objectArray[5];
        long l = (Long)objectArray[6];
        long l2 = l = p ^ l;
        long l3 = l2 ^ 0x414C2E30BAACL;
        long l4 = l2 ^ 0x3090C8AEBCC5L;
        ga_0 ga_02 = (ga_0)((Object)cA.c("z", (Object)this.m, (Object)this, (long)4118914361816150009L, (long)l));
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        CallSite callSite = cA.c("z", (Object)this, (Object)objectArray2, (long)4120670505400408221L, (long)l);
        Matrix4f matrix4f2 = new Matrix4f((Matrix4fc)matrix4f);
        reference var17_14 = cA.c("z", (Object)this.j, (Object)new Object[0], (long)4114621532095398467L, (long)l) * f11;
        float[] fArray = new float[]{f};
        Object[] objectArray3 = new Object[3];
        objectArray3[2] = l4;
        objectArray3[1] = (arg_0, arg_1) -> this.lambda$render$2(fArray, ga_02, (gL)((Object)callSite), matrix4f2, f10, f11, (float)var17_14, n, arg_0, arg_1);
        objectArray3[0] = string;
        cA.c("z", (Object)this, (Object)objectArray3, (long)4114010961426936133L, (long)l);
    }

    public void f(Object[] objectArray) {
        String string = (String)objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        float f10 = ((Float)objectArray[2]).floatValue();
        float f11 = ((Float)objectArray[3]).floatValue();
        int n = (Integer)objectArray[4];
        long l = (Long)objectArray[5];
        long l2 = l = p ^ l;
        long l3 = l2 ^ 0x26244A1D76F8L;
        long l4 = l2 ^ 0x57F8AC837091L;
        ga_0 ga_02 = (ga_0)((Object)cA.c("z", (Object)this.m, (Object)this, (long)-757390190810258515L, (long)l));
        Object[] objectArray2 = new Object[1];
        objectArray2[0] = l3;
        CallSite callSite = cA.c("z", (Object)this, (Object)objectArray2, (long)-757756379543907127L, (long)l);
        reference var15_12 = cA.c("z", (Object)this.j, (Object)new Object[0], (long)-770549758252708329L, (long)l) * f11;
        float[] fArray = new float[]{f};
        Object[] objectArray3 = new Object[3];
        objectArray3[2] = l4;
        objectArray3[1] = (arg_0, arg_1) -> this.lambda$render$1(fArray, ga_02, (gL)((Object)callSite), f10, f11, (float)var15_12, n, arg_0, arg_1);
        objectArray3[0] = string;
        cA.c("z", (Object)this, (Object)objectArray3, (long)-773633680327852783L, (long)l);
    }

    private float f(Object[] objectArray) {
        Object object;
        Object object2;
        block2: {
            long l;
            float f;
            cE cE2;
            block3: {
                ga_0 ga_02 = (ga_0)objectArray[0];
                gL gL2 = (gL)objectArray[1];
                cE2 = (cE)objectArray[2];
                float f10 = ((Float)objectArray[3]).floatValue();
                float f11 = ((Float)objectArray[4]).floatValue();
                f = ((Float)objectArray[5]).floatValue();
                float f12 = ((Float)objectArray[6]).floatValue();
                int n = (Integer)objectArray[7];
                l = (Long)objectArray[8];
                long l2 = l = p ^ l;
                long l3 = l2 ^ 0x47730F2FF7D0L;
                long l4 = l2 ^ 0x14FC70D25A12L;
                CallSite callSite = cA.c("\u00c5", (long)-5031092891871627167L, (long)l);
                try {
                    object2 = cA.c("z", (Object)cE2, (Object)new Object[0], (long)-5036570201100993091L, (long)l) - cA.c("z", (Object)cE2, (Object)new Object[0], (long)-5031814155167201234L, (long)l);
                    object = 0.0f;
                    if (callSite != null) break block2;
                    if (object2 == object) break block3;
                }
                catch (RuntimeException runtimeException) {
                    throw cA.c("\u00c5", (Object)runtimeException, (long)-5038264326257434980L, (long)l);
                }
                float f13 = f10 + cA.c("z", (Object)cE2, (Object)new Object[0], (long)-5031814155167201234L, (long)l) * f;
                float f14 = f10 + cA.c("z", (Object)cE2, (Object)new Object[0], (long)-5036570201100993091L, (long)l) * f;
                float f15 = f11 + f12 - cA.c("z", (Object)cE2, (Object)new Object[0], (long)-5033237240030688920L, (long)l) * f;
                float f16 = f11 + f12 - cA.c("z", (Object)cE2, (Object)new Object[0], (long)-5038334454014619176L, (long)l) * f;
                reference var21_18 = cA.c("z", (Object)cE2, (Object)new Object[0], (long)-5031266219399672326L, (long)l) * this.f;
                reference var22_19 = cA.c("z", (Object)cE2, (Object)new Object[0], (long)-5036456947634906190L, (long)l) * this.f;
                float f17 = 1.0f - cA.c("z", (Object)cE2, (Object)new Object[0], (long)-5039231767174237891L, (long)l) * this.g;
                float f18 = 1.0f - cA.c("z", (Object)cE2, (Object)new Object[0], (long)-5031211913068126953L, (long)l) * this.g;
                Object[] objectArray2 = new Object[2];
                objectArray2[1] = l3;
                objectArray2[0] = new an_0(gL2, f13, f15, f14, f16, n, (float)var21_18, f17, (float)var22_19, f18, null, l4);
                cA.c("z", (Object)ga_02, (Object)objectArray2, (long)-5038898178656941434L, (long)l);
            }
            object2 = f;
            object = cA.c("z", (Object)cE2, (Object)new Object[0], (long)-5031505189963644088L, (long)l);
        }
        return (float)(object2 * object);
    }

    public void l(Object[] objectArray) {
        String string = (String)objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        float f10 = ((Float)objectArray[2]).floatValue();
        float f11 = ((Float)objectArray[3]).floatValue();
        int n = (Integer)objectArray[4];
        long l = (Long)objectArray[5];
        long l2 = l = p ^ l;
        long l3 = l2 ^ 0x61CD34E66AC8L;
        long l4 = l2 ^ 0x37483D5CD36AL;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l3;
        objectArray2[1] = Float.valueOf(f11);
        objectArray2[0] = string;
        Object[] objectArray3 = new Object[6];
        objectArray3[5] = l4;
        objectArray3[4] = n;
        objectArray3[3] = Float.valueOf(f11);
        objectArray3[2] = Float.valueOf(f10);
        objectArray3[1] = Float.valueOf(f - cA.c("z", (Object)this, (Object)objectArray2, (long)-807915105863187360L, (long)l) / 2.0f);
        objectArray3[0] = string;
        cA.c("z", (Object)this, (Object)objectArray3, (long)-810520802808147899L, (long)l);
    }

    public void d(Object[] objectArray) {
        String string = (String)objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        float f10 = ((Float)objectArray[2]).floatValue();
        int n = (Integer)objectArray[3];
        long l = (Long)objectArray[4];
        long l2 = (l = p ^ l) ^ 0x46CCE767C5D8L;
        Object[] objectArray2 = new Object[6];
        objectArray2[5] = l2;
        objectArray2[4] = n;
        objectArray2[3] = Float.valueOf(this.e);
        objectArray2[2] = Float.valueOf(f10);
        objectArray2[1] = Float.valueOf(f);
        objectArray2[0] = string;
        cA.c("z", (Object)this, (Object)objectArray2, (long)-2129637358474803465L, (long)l);
    }

    private static Method d(long l, long l2) {
        int n = cA.a(l, l2);
        Object object = w[n];
        if (object instanceof String) {
            Class<?>[] classArray;
            Class clazz;
            Class clazz2;
            Class[] classArray2;
            int n2;
            String string;
            Class clazz3;
            block10: {
                String string2 = x[n];
                int n3 = string2.indexOf(8);
                clazz3 = cA.b(Long.parseLong(string2.substring(0, n3), 36), 0L);
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
                    clazz2 = cA.b(Long.parseLong(string2.substring(n6, n7), 36), 0L);
                    if (i < n2) {
                        classArray2[i] = clazz2;
                    }
                    n6 = n7 + 1;
                }
                clazz = clazz3;
                do {
                    if ((classArray = cA.a(clazz, string, clazz2, n2, classArray2)) != null) {
                        cA.w[n] = classArray;
                        return classArray;
                    }
                    if (clazz.getName().equals("java.lang.Object")) break block10;
                } while ((clazz = clazz.getSuperclass()) != null);
                clazz = cA.b(516167895963565L, 0L);
            }
            clazz = clazz3;
            while (true) {
                if ((classArray = clazz.getInterfaces()) != null) {
                    for (int i = 0; i < classArray.length; ++i) {
                        Method method = cA.b(classArray[i], string, clazz2, n2, classArray2);
                        if (method == null) continue;
                        cA.w[n] = method;
                        return method;
                    }
                }
                if (clazz.getName().equals("java.lang.Object")) break;
                if ((clazz = clazz.getSuperclass()) != null) continue;
                clazz = cA.b(516167895963565L, 0L);
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

    public float d(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        long l = (Long)objectArray[1];
        l = p ^ l;
        return (float)(cA.c("z", (Object)this.j, (Object)new Object[0], (long)2753598982427861008L, (long)l) * f);
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
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

    private void a(Object[] objectArray) throws IOException {
        Object object;
        CallSite callSite;
        CallSite callSite2;
        CallSite callSite3;
        long l;
        long l2;
        long l3;
        long l4;
        block12: {
            long l5;
            long l6;
            long l7;
            InputStream inputStream;
            block10: {
                long l8;
                block11: {
                    Reader reader = (Reader)objectArray[0];
                    inputStream = (InputStream)objectArray[1];
                    l4 = (Long)objectArray[2];
                    long l9 = l4 = p ^ l4;
                    l7 = l9 ^ 0x12D4B7EBD819L;
                    l8 = l9 ^ 0x3F7C94155EE7L;
                    l6 = l9 ^ 0x3ECABFA02E30L;
                    l3 = l9 ^ 0x7E65ECE119C5L;
                    l5 = l9 ^ 0x753EFFE5AADDL;
                    l2 = l9 ^ 0x3D806C27302AL;
                    l = l9 ^ 0x1B3FE3C0CDFDL;
                    callSite3 = cA.c("z", (Object)cA.c("\u00c5", (Object)reader, (long)-6415084635420378384L, (long)l4), (long)-6414651887302739078L, (long)l4);
                    callSite2 = cA.c("\u00c5", (long)-6430615002271865715L, (long)l4);
                    try {
                        try {
                            if (callSite2 != null) break block10;
                            if (cA.c("z", (Object)cA.a("v", (int)31629, (long)(0x4B417648AC30B93BL ^ l4)), (Object)cA.c("z", (Object)cA.c("z", (Object)cA.c("z", (Object)callSite3, (Object)cA.a("v", (int)27989, (long)(0x3C639EE89B5C2FEAL ^ l4)), (long)-6414442338487075570L, (long)l4), (Object)cA.a("v", (int)31009, (long)(0x5FCB6436F6FBB98L ^ l4)), (long)-6414926207429871673L, (long)l4), (long)-6429181859743131669L, (long)l4), (long)-6430876421673088276L, (long)l4) != false) break block11;
                        }
                        catch (IOException iOException) {
                            throw cA.c("\u00c5", (Object)iOException, (long)-6415281632222051728L, (long)l4);
                        }
                        throw new RuntimeException((String)((Object)cA.a("v", (int)6550, (long)(0x41EDA1DF20FFDB21L ^ l4))));
                    }
                    catch (IOException iOException) {
                        throw cA.c("\u00c5", (Object)iOException, (long)-6415281632222051728L, (long)l4);
                    }
                }
                this.c = (int)cA.c("z", (Object)cA.c("z", (Object)cA.c("z", (Object)callSite3, (Object)cA.a("v", (int)10255, (long)(0x3BC485540ED46ABAL ^ l4)), (long)-6414442338487075570L, (long)l4), (Object)cA.a("v", (int)28698, (long)(0x73AB67C611D532A1L ^ l4)), (long)-6414926207429871673L, (long)l4), (long)-6415860857715044274L, (long)l4);
                this.d = (int)cA.c("z", (Object)cA.c("z", (Object)cA.c("z", (Object)callSite3, (Object)cA.a("v", (int)10255, (long)(0x3BC485540ED46ABAL ^ l4)), (long)-6414442338487075570L, (long)l4), (Object)cA.a("v", (int)21337, (long)(0x77944B7614F211E1L ^ l4)), (long)-6414926207429871673L, (long)l4), (long)-6415860857715044274L, (long)l4);
                this.b = (float)cA.c("z", (Object)cA.c("z", (Object)cA.c("z", (Object)callSite3, (Object)cA.a("v", (int)10255, (long)(0x3BC485540ED46ABAL ^ l4)), (long)-6414442338487075570L, (long)l4), (Object)cA.a("v", (int)9636, (long)(0x48104E22E1B96718L ^ l4)), (long)-6414926207429871673L, (long)l4), (long)-6430538807401010046L, (long)l4);
                Object[] objectArray2 = new Object[2];
                objectArray2[1] = l8;
                objectArray2[0] = cA.c("z", (Object)callSite3, (Object)cA.a("v", (int)18481, (long)(0x3B590FD23C560A80L ^ l4)), (long)-6414442338487075570L, (long)l4);
                this.j = cA.c("\u00c5", (Object)objectArray2, (long)-6430349752723462216L, (long)l4);
                this.f = 1.0f / (float)this.c;
                this.g = 1.0f / (float)this.d;
            }
            callSite = cA.c("\u00c5", (Object)inputStream, (long)-6428916534376731750L, (long)l4);
            Object[] objectArray3 = new Object[2];
            objectArray3[1] = l5;
            objectArray3[0] = (int)cA.b("t", (int)18619, (long)(0x591F5B02F44DD26AL ^ l4));
            this.k = cA.c("\u00c5", (Object)objectArray3, (long)-6414869640671725765L, (long)l4);
            Object[] objectArray4 = new Object[4];
            objectArray4[3] = l7;
            objectArray4[2] = (int)cA.c("z", (Object)callSite, (long)-6415174923099194798L, (long)l4);
            objectArray4[1] = (int)cA.c("z", (Object)callSite, (long)-6430280761019451314L, (long)l4);
            objectArray4[0] = (int)cA.b("t", (int)847, (long)(0x1FF82EABD7F59991L ^ l4));
            cA.c("z", (Object)this.k, (Object)objectArray4, (long)-6415656967899072228L, (long)l4);
            CallSite callSite4 = cA.c("z", (Object)callSite, (long)-6430280761019451314L, (long)l4);
            CallSite callSite5 = cA.c("z", (Object)callSite, (long)-6415174923099194798L, (long)l4);
            CallSite callSite6 = cA.c("\u00c5", (int)(callSite4 * callSite5 * 4), (long)-6429557075194877560L, (long)l4);
            cA.c("z", (Object)callSite6, (Object)cA.c("M", (long)-6428081098085343239L, (long)l4), (long)-6429128317401078801L, (long)l4);
            int n = 0;
            while (n < callSite5) {
                block13: {
                    object = 0;
                    if (callSite2 != null) break block12;
                    for (int i = v613388; i < callSite4; ++i) {
                        CallSite callSite7 = cA.c("z", (Object)callSite, (int)i, (int)n, (long)-6430131933522022050L, (long)l4);
                        try {
                            cA.c("z", (Object)callSite6, (int)callSite7, (long)-6429930887368614019L, (long)l4);
                            if (callSite2 == null) {
                                if (callSite2 == null) continue;
                                break;
                            }
                            break block13;
                        }
                        catch (IOException iOException) {
                            throw cA.c("\u00c5", (Object)iOException, (long)-6415281632222051728L, (long)l4);
                        }
                    }
                    ++n;
                }
                if (callSite2 == null) continue;
            }
            cA.c("z", (Object)callSite6, (long)-6413597760938117268L, (long)l4);
            cA.c("\u00c5", (int)cA.b("t", (int)3627, (long)(0x29740C82931214EEL ^ l4)), (int)1, (long)-6414964624760205876L, (long)l4);
            cA.c("\u00c5", (int)cA.b("t", (int)13759, (long)(0x13E51732CADCAF71L ^ l4)), (int)0, (long)-6414964624760205876L, (long)l4);
            cA.c("\u00c5", (int)cA.b("t", (int)19736, (long)(0x4E0BDA801F93D7C0L ^ l4)), (int)0, (long)-6414964624760205876L, (long)l4);
            cA.c("\u00c5", (int)cA.b("t", (int)10555, (long)(0x538E12C68DBD33E0L ^ l4)), (int)0, (long)-6414964624760205876L, (long)l4);
            Object[] objectArray5 = new Object[8];
            objectArray5[7] = l6;
            objectArray5[6] = callSite6;
            objectArray5[5] = (int)cA.b("t", (int)26293, (long)(0xB6D0A682B0B7C60L ^ l4));
            objectArray5[4] = (int)cA.b("t", (int)20056, (long)(0x4043A5387013D495L ^ l4));
            objectArray5[3] = (int)callSite5;
            objectArray5[2] = (int)callSite4;
            objectArray5[1] = 0;
            objectArray5[0] = 0;
            cA.c("z", (Object)this.k, (Object)objectArray5, (long)-6413785337190667825L, (long)l4);
            object = cA.b("t", (int)19468, (long)(0x45A05569F57856CDL ^ l4));
        }
        cA.c("\u00c5", (int)object, (int)4, (long)-6414964624760205876L, (long)l4);
        Object[] objectArray6 = new Object[2];
        objectArray6[1] = l3;
        objectArray6[0] = (int)cA.b("t", (int)16144, (long)(0x614BB527C5DA25DCL ^ l4));
        cA.c("z", (Object)this.k, (Object)objectArray6, (long)-6413251209048854674L, (long)l4);
        Object[] objectArray7 = new Object[2];
        objectArray7[1] = l;
        objectArray7[0] = (int)cA.b("t", (int)21847, (long)(0x7B41274AC4F1CF87L ^ l4));
        cA.c("z", (Object)this.k, (Object)objectArray7, (long)-6414280482900501271L, (long)l4);
        cA.c("z", (Object)callSite, (long)-6413546980081640725L, (long)l4);
        CallSite callSite8 = cA.c("z", (Object)cA.c("z", (Object)callSite3, (Object)cA.a("v", (int)6422, (long)(0xBFD0F6AB066DBA2L ^ l4)), (long)-6428604217030601945L, (long)l4), (long)-6414739367212726980L, (long)l4);
        while (cA.c("z", (Object)callSite8, (long)-6415146456102308332L, (long)l4) != false) {
            JsonElement jsonElement = (JsonElement)cA.c("z", (Object)callSite8, (long)-6429414081206223265L, (long)l4);
            CallSite callSite9 = cA.c("z", (Object)jsonElement, (long)-6414651887302739078L, (long)l4);
            Object[] objectArray8 = new Object[2];
            objectArray8[1] = l2;
            objectArray8[0] = callSite9;
            CallSite callSite10 = cA.c("\u00c5", (Object)objectArray8, (long)-6429746660788431258L, (long)l4);
            cA.c("z", (Object)this.h, (int)cA.c("z", (Object)callSite10, (Object)new Object[0], (long)-6430206147485460719L, (long)l4), (Object)callSite10, (long)-6413476528452769256L, (long)l4);
            if (callSite2 == null) continue;
        }
    }

    private static MethodHandle a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, long l, long l2) {
        char c = string.charAt(0);
        MethodHandle methodHandle = null;
        Field field = null;
        Method method = null;
        try {
            if (c == '\u00c1' || c == '\u00d4' || c == 'M' || c == '\u00ef') {
                field = cA.c(l, l2);
                Class<?> clazz = field.getDeclaringClass();
                String string2 = field.getName();
                Class<?> clazz2 = field.getType();
                methodHandle = c == '\u00c1' ? lookup.findGetter(clazz, string2, clazz2) : (c == '\u00d4' ? lookup.findSetter(clazz, string2, clazz2) : (c == 'M' ? lookup.findStaticGetter(clazz, string2, clazz2) : lookup.findStaticSetter(clazz, string2, clazz2)));
            } else {
                method = cA.d(l, l2);
                Class<?> clazz = method.getDeclaringClass();
                String string3 = method.getName();
                MethodType methodType2 = MethodType.methodType(method.getReturnType(), method.getParameterTypes());
                methodHandle = c == 'z' ? lookup.findVirtual(clazz, string3, methodType2) : (c == '\u00c5' ? lookup.findStatic(clazz, string3, methodType2) : lookup.findSpecial(clazz, string3, methodType2, clazz));
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

    private static int a(long l, long l2) {
        int n;
        int n2;
        int n3 = (int)((l ^= l2 << 48 | l2) >>> 46);
        if (x[n3] != null) {
            return n3;
        }
        Object object = w[n3];
        if (!(object instanceof String)) {
            return n3;
        }
        int n4 = 0;
        n4 = switch ((int)(l >>> 42 & 0x3FL)) {
            case 0 -> 60;
            case 1 -> 39;
            case 2 -> 44;
            case 3 -> 4;
            case 4 -> 53;
            case 5 -> 29;
            case 6 -> 31;
            case 7 -> 21;
            case 8 -> 40;
            case 9 -> 61;
            case 10 -> 7;
            case 11 -> 46;
            case 12 -> 11;
            case 13 -> 32;
            case 14 -> 55;
            case 15 -> 45;
            case 16 -> 51;
            case 17 -> 12;
            case 18 -> 47;
            case 19 -> 41;
            case 20 -> 28;
            case 21 -> 54;
            case 22 -> 26;
            case 23 -> 25;
            case 24 -> 16;
            case 25 -> 13;
            case 26 -> 14;
            case 27 -> 56;
            case 28 -> 38;
            case 29 -> 19;
            case 30 -> 62;
            case 31 -> 10;
            case 32 -> 34;
            case 33 -> 18;
            case 34 -> 0;
            case 35 -> 9;
            case 36 -> 63;
            case 37 -> 42;
            case 38 -> 22;
            case 39 -> 50;
            case 40 -> 2;
            case 41 -> 17;
            case 42 -> 33;
            case 43 -> 20;
            case 44 -> 37;
            case 45 -> 6;
            case 46 -> 3;
            case 47 -> 30;
            case 48 -> 1;
            case 49 -> 8;
            case 50 -> 35;
            case 51 -> 23;
            case 52 -> 43;
            case 53 -> 5;
            case 54 -> 36;
            case 55 -> 57;
            case 56 -> 58;
            case 57 -> 48;
            case 58 -> 49;
            case 59 -> 24;
            case 60 -> 52;
            case 61 -> 27;
            case 62 -> 15;
            default -> 59;
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
        cA.x[n3] = new String(cArray);
        return n3;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("dev/zprestige/prestige/cA" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = cA.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x645A;
        if (r[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().threadId();
                objectArray = (Object[])s.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    s.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("dev/zprestige/prestige/cA", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = q[n2].getBytes("ISO-8859-1");
            cA.r[n2] = cA.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return r[n2];
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

    public float a(Object[] objectArray) {
        String string = (String)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = (l = p ^ l) ^ 0x94CB0C155D6L;
        Object[] objectArray2 = new Object[3];
        objectArray2[2] = l2;
        objectArray2[1] = Float.valueOf(this.e);
        objectArray2[0] = string;
        return (float)cA.c("z", (Object)this, (Object)objectArray2, (long)-3758291287896392834L, (long)l);
    }

    public String a(Object[] objectArray) {
        String string = (String)objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        float f10 = ((Float)objectArray[2]).floatValue();
        long l = (Long)objectArray[3];
        long l2 = l = p ^ l;
        long l3 = l2 ^ 0x917E20C170FL;
        long l4 = l2 ^ 0x48A36F870CDBL;
        try {
            Object[] objectArray2 = new Object[3];
            objectArray2[2] = l3;
            objectArray2[1] = Float.valueOf(f10);
            objectArray2[0] = string;
            if (cA.c("z", (Object)this, (Object)objectArray2, (long)-8570669330626233945L, (long)l) <= f) {
                return string;
            }
        }
        catch (RuntimeException runtimeException) {
            throw cA.c("\u00c5", (Object)runtimeException, (long)-8559854404366422595L, (long)l);
        }
        StringBuilder stringBuilder = new StringBuilder();
        Object[] objectArray3 = new Object[3];
        objectArray3[2] = l3;
        objectArray3[1] = Float.valueOf(f10);
        objectArray3[0] = cA.a("v", (int)6025, (long)(0x2450B8E76A6C7AFAL ^ l));
        CallSite callSite = cA.c("z", (Object)this, (Object)objectArray3, (long)-8570669330626233945L, (long)l);
        float[] fArray = new float[]{0.0f};
        Object[] objectArray4 = new Object[3];
        objectArray4[2] = l4;
        objectArray4[1] = (arg_0, arg_1) -> cA.lambda$truncate$4(f10, fArray, (float)callSite, f, stringBuilder, arg_0, arg_1);
        objectArray4[0] = string;
        cA.c("z", (Object)this, (Object)objectArray4, (long)-8572145458036358821L, (long)l);
        return cA.c("z", (Object)stringBuilder, (long)-8560528263716852270L, (long)l);
    }

    public gL a(Object[] objectArray) {
        gL gL2;
        block4: {
            block5: {
                long l = (Long)objectArray[0];
                long l2 = (l = p ^ l) ^ 0x6C3AA3B83A4EL;
                CallSite callSite = cA.c("\u00c5", (long)5861921527907111701L, (long)l);
                try {
                    try {
                        gL2 = this.o;
                        if (callSite != null) break block4;
                        if (gL2 != null) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw cA.c("\u00c5", (Object)runtimeException, (long)5863739988856206824L, (long)l);
                    }
                    Object[] objectArray2 = new Object[1];
                    objectArray2[0] = l2;
                    this.o = new gL(null, (dt_0)((Object)cA.c("z", (Object)this, (Object)objectArray2, (long)5867553808516130184L, (long)l)));
                }
                catch (RuntimeException runtimeException) {
                    throw cA.c("\u00c5", (Object)runtimeException, (long)5863739988856206824L, (long)l);
                }
            }
            gL2 = this.o;
        }
        return gL2;
    }

    public void a() {
        block5: {
            bW bW2;
            long l;
            block4: {
                l = p ^ 0xF1EDE7F61EBL;
                CallSite callSite = cA.c("\u00c5", (long)-5535513390315622047L, (long)l);
                try {
                    try {
                        bW2 = this.k;
                        if (callSite != null) break block4;
                        if (bW2 == null) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw cA.c("\u00c5", (Object)runtimeException, (long)-5542685360933759076L, (long)l);
                    }
                    bW2 = this.k;
                }
                catch (RuntimeException runtimeException) {
                    throw cA.c("\u00c5", (Object)runtimeException, (long)-5542685360933759076L, (long)l);
                }
            }
            cA.c("z", (Object)bW2, (long)-5543804193698718821L, (long)l);
        }
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, MethodType methodType, Object[] objectArray) {
        int n = objectArray.length - 2;
        long l = (Long)objectArray[n];
        long l2 = (Long)objectArray[++n];
        MethodHandle methodHandle = cA.a(lookup, mutableCallSite, string, methodType, l, l2);
        mutableCallSite.setTarget(MethodHandles.explicitCastArguments(methodHandle, methodType));
        return methodHandle.asSpreader(Object[].class, objectArray.length).invoke(objectArray);
    }

    public dt_0 a(Object[] objectArray) {
        dt_0 dt_02;
        block8: {
            cA cA2;
            block10: {
                block9: {
                    long l = (Long)objectArray[0];
                    long l2 = (l = p ^ l) ^ 0x43D45155DD98L;
                    CallSite callSite = cA.c("\u00c5", (long)-5048369834915218500L, (long)l);
                    try {
                        try {
                            try {
                                try {
                                    dt_02 = this.n;
                                    if (callSite != null) break block8;
                                    if (dt_02 != null) break block9;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw cA.c("\u00c5", (Object)runtimeException, (long)-5059481368815461055L, (long)l);
                                }
                                fW[] fWArray = new fW[cA.b("t", (int)4238, (long)(0x25DAF546CC479570L ^ l))];
                                fWArray[0] = fW.a;
                                fWArray[1] = cA.c("\u00c5", (Object)new Object[]{cp_0.e}, (long)-5047378917631485116L, (long)l);
                                Object[] objectArray2 = new Object[3];
                                objectArray2[2] = true;
                                objectArray2[1] = false;
                                objectArray2[0] = (int)cA.b("t", (int)3179, (long)(0x1B3504664D288980L ^ l));
                                fWArray[2] = cA.c("\u00c5", (Object)objectArray2, (long)-5058125508612236930L, (long)l);
                                Object[] objectArray3 = new Object[2];
                                objectArray3[1] = true;
                                objectArray3[0] = true;
                                fWArray[3] = cA.c("\u00c5", (Object)objectArray3, (long)-5046068087891312063L, (long)l);
                                fWArray[4] = new gQ((int)cA.b("t", (int)598, (long)(0x3D2E56CA19C687A4L ^ l)), false);
                                fWArray[5] = new gB(this.k, this.b / (float)this.c, this.b / (float)this.d);
                                this.n = new dt_0(gf_0.c, 4, false, fWArray, l2);
                                cA2 = this;
                                if (callSite != null) break block10;
                            }
                            catch (RuntimeException runtimeException) {
                                throw cA.c("\u00c5", (Object)runtimeException, (long)-5059481368815461055L, (long)l);
                            }
                            if (cA2.l == null) break block9;
                        }
                        catch (RuntimeException runtimeException) {
                            throw cA.c("\u00c5", (Object)runtimeException, (long)-5059481368815461055L, (long)l);
                        }
                        cA.c("z", (Object)this.l, (Object)this, (Object)this.n, (long)-5058639595549104670L, (long)l);
                    }
                    catch (RuntimeException runtimeException) {
                        throw cA.c("\u00c5", (Object)runtimeException, (long)-5059481368815461055L, (long)l);
                    }
                }
                cA2 = this;
            }
            dt_02 = cA2.n;
        }
        return dt_02;
    }

    public void m(Object[] objectArray) {
        String string = (String)objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        float f10 = ((Float)objectArray[2]).floatValue();
        float f11 = ((Float)objectArray[3]).floatValue();
        int n = (Integer)objectArray[4];
        long l = (Long)objectArray[5];
        long l2 = (l = p ^ l) ^ 0x2757839FC169L;
        int n2 = (n >>> cA.b("t", (int)21212, (long)(0x6E542A1CBDA7081DL ^ l)) & cA.b("t", (int)4483, (long)(0x4E49B690B02CCB5EL ^ l))) * cA.b("t", (int)17960, (long)(0x39332114BDA61CE1L ^ l)) >> cA.b("t", (int)27686, (long)(0x5A1D3275D61FB6FDL ^ l));
        int n3 = n2 << cA.b("t", (int)21212, (long)(0x6E542A1CBDA7081DL ^ l));
        Object[] objectArray2 = new Object[6];
        objectArray2[5] = l2;
        objectArray2[4] = n3;
        objectArray2[3] = Float.valueOf(f11);
        objectArray2[2] = Float.valueOf(f10 + 0.5f);
        objectArray2[1] = Float.valueOf(f + 0.5f);
        objectArray2[0] = string;
        cA.c("z", (Object)this, (Object)objectArray2, (long)-1818500421119032762L, (long)l);
        Object[] objectArray3 = new Object[6];
        objectArray3[5] = l2;
        objectArray3[4] = n;
        objectArray3[3] = Float.valueOf(f11);
        objectArray3[2] = Float.valueOf(f10);
        objectArray3[1] = Float.valueOf(f);
        objectArray3[0] = string;
        cA.c("z", (Object)this, (Object)objectArray3, (long)-1818500421119032762L, (long)l);
    }

    public void o(Object[] objectArray) {
        String string = (String)objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        float f10 = ((Float)objectArray[2]).floatValue();
        int n = (Integer)objectArray[3];
        long l = (Long)objectArray[4];
        long l2 = (l = p ^ l) ^ 0x2A25FFA82330L;
        Object[] objectArray2 = new Object[6];
        objectArray2[5] = l2;
        objectArray2[4] = n;
        objectArray2[3] = Float.valueOf(this.e);
        objectArray2[2] = Float.valueOf(f10);
        objectArray2[1] = Float.valueOf(f);
        objectArray2[0] = string;
        cA.c("z", (Object)this, (Object)objectArray2, (long)1666094050860357435L, (long)l);
    }

    public void p(Object[] objectArray) {
        String string = (String)objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        float f10 = ((Float)objectArray[2]).floatValue();
        int n = (Integer)objectArray[3];
        long l = (Long)objectArray[4];
        long l2 = (l = p ^ l) ^ 0xD03A20A6FL;
        Object[] objectArray2 = new Object[6];
        objectArray2[5] = l2;
        objectArray2[4] = n;
        objectArray2[3] = Float.valueOf(this.e);
        objectArray2[2] = Float.valueOf(f10);
        objectArray2[1] = Float.valueOf(f);
        objectArray2[0] = string;
        cA.c("z", (Object)this, (Object)objectArray2, (long)4485600204403670628L, (long)l);
    }

    public void k(Object[] objectArray) {
        String string = (String)objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        float f10 = ((Float)objectArray[2]).floatValue();
        int n = (Integer)objectArray[3];
        long l = (Long)objectArray[4];
        long l2 = l = p ^ l;
        long l3 = l2 ^ 0x73E8B0F4F83BL;
        long l4 = l2 ^ 0x6CE8213DC6A8L;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l3;
        objectArray2[0] = string;
        Object[] objectArray3 = new Object[6];
        objectArray3[5] = l4;
        objectArray3[4] = n;
        objectArray3[3] = Float.valueOf(this.e);
        objectArray3[2] = Float.valueOf(f10);
        objectArray3[1] = Float.valueOf(f - cA.c("z", (Object)this, (Object)objectArray2, (long)-2233733400846487964L, (long)l) / 2.0f);
        objectArray3[0] = string;
        cA.c("z", (Object)this, (Object)objectArray3, (long)-2233178210585066105L, (long)l);
    }

    public void t(Object[] objectArray) {
        String string = (String)objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        float f10 = ((Float)objectArray[2]).floatValue();
        float f11 = ((Float)objectArray[3]).floatValue();
        Color color = (Color)objectArray[4];
        long l = (Long)objectArray[5];
        long l2 = (l = p ^ l) ^ 0x1D4E55902E12L;
        Object[] objectArray2 = new Object[6];
        objectArray2[5] = l2;
        objectArray2[4] = (int)cA.c("z", (Object)color, (long)1874347588755983014L, (long)l);
        objectArray2[3] = Float.valueOf(this.e * f11);
        objectArray2[2] = Float.valueOf(f10);
        objectArray2[1] = Float.valueOf(f);
        objectArray2[0] = string;
        cA.c("z", (Object)this, (Object)objectArray2, (long)1890685962453015065L, (long)l);
    }

    public void g(Object[] objectArray) {
        String string = (String)objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        float f10 = ((Float)objectArray[2]).floatValue();
        float f11 = ((Float)objectArray[3]).floatValue();
        float f12 = ((Float)objectArray[4]).floatValue();
        int n = (Integer)objectArray[5];
        long l = (Long)objectArray[6];
        long l2 = (l = p ^ l) ^ 0x42AF88C72167L;
        Object[] objectArray2 = new Object[6];
        objectArray2[5] = l2;
        objectArray2[4] = n;
        objectArray2[3] = Float.valueOf(f12);
        objectArray2[2] = Float.valueOf(f10);
        objectArray2[1] = Float.valueOf(f);
        objectArray2[0] = string;
        cA.c("z", (Object)this, (Object)objectArray2, (long)490055049000886856L, (long)l);
    }

    private float g(Object[] objectArray) {
        Object object;
        Object object2;
        block2: {
            long l;
            float f;
            cE cE2;
            block3: {
                ga_0 ga_02 = (ga_0)objectArray[0];
                gL gL2 = (gL)objectArray[1];
                Matrix4f matrix4f = (Matrix4f)objectArray[2];
                cE2 = (cE)objectArray[3];
                float f10 = ((Float)objectArray[4]).floatValue();
                float f11 = ((Float)objectArray[5]).floatValue();
                f = ((Float)objectArray[6]).floatValue();
                float f12 = ((Float)objectArray[7]).floatValue();
                int n = (Integer)objectArray[8];
                l = (Long)objectArray[9];
                long l2 = l = p ^ l;
                long l3 = l2 ^ 0x68E397B661DFL;
                long l4 = l2 ^ 0x3B6CE84BCC1DL;
                CallSite callSite = cA.c("\u00c5", (long)3180342035519778414L, (long)l);
                try {
                    object2 = cA.c("z", (Object)cE2, (Object)new Object[0], (long)3176635906934647730L, (long)l) - cA.c("z", (Object)cE2, (Object)new Object[0], (long)3180746672684899873L, (long)l);
                    object = 0.0f;
                    if (callSite != null) break block2;
                    if (object2 == object) break block3;
                }
                catch (RuntimeException runtimeException) {
                    throw cA.c("\u00c5", (Object)runtimeException, (long)3178225060921903251L, (long)l);
                }
                float f13 = f10 + cA.c("z", (Object)cE2, (Object)new Object[0], (long)3180746672684899873L, (long)l) * f;
                float f14 = f10 + cA.c("z", (Object)cE2, (Object)new Object[0], (long)3176635906934647730L, (long)l) * f;
                float f15 = f11 + f12 - cA.c("z", (Object)cE2, (Object)new Object[0], (long)3182205406976778087L, (long)l) * f;
                float f16 = f11 + f12 - cA.c("z", (Object)cE2, (Object)new Object[0], (long)3178153833650014167L, (long)l) * f;
                reference var22_19 = cA.c("z", (Object)cE2, (Object)new Object[0], (long)3180233578929396725L, (long)l) * this.f;
                reference var23_20 = cA.c("z", (Object)cE2, (Object)new Object[0], (long)3176663398477057469L, (long)l) * this.f;
                float f17 = 1.0f - cA.c("z", (Object)cE2, (Object)new Object[0], (long)3179016838607447858L, (long)l) * this.g;
                float f18 = 1.0f - cA.c("z", (Object)cE2, (Object)new Object[0], (long)3180285686754691864L, (long)l) * this.g;
                Object[] objectArray2 = new Object[2];
                objectArray2[1] = l3;
                objectArray2[0] = new an_0(gL2, f13, f15, f14, f16, n, (float)var22_19, f17, (float)var23_20, f18, matrix4f, l4);
                cA.c("z", (Object)ga_02, (Object)objectArray2, (long)3178718203644992649L, (long)l);
            }
            object2 = f;
            object = cA.c("z", (Object)cE2, (Object)new Object[0], (long)3180578316146398535L, (long)l);
        }
        return (float)(object2 * object);
    }

    public void v(Object[] objectArray) {
        Matrix4f matrix4f = (Matrix4f)objectArray[0];
        String string = (String)objectArray[1];
        float f = ((Float)objectArray[2]).floatValue();
        float f10 = ((Float)objectArray[3]).floatValue();
        Color color = (Color)objectArray[4];
        long l = (Long)objectArray[5];
        long l2 = (l = p ^ l) ^ 0x796EE43734E3L;
        Object[] objectArray2 = new Object[7];
        objectArray2[6] = l2;
        objectArray2[5] = color;
        objectArray2[4] = Float.valueOf(this.e);
        objectArray2[3] = Float.valueOf(f10);
        objectArray2[2] = Float.valueOf(f);
        objectArray2[1] = string;
        objectArray2[0] = matrix4f;
        cA.c("z", (Object)this, (Object)objectArray2, (long)2603707272375148276L, (long)l);
    }

    public void j(Object[] objectArray) {
        String string = (String)objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        float f10 = ((Float)objectArray[2]).floatValue();
        int n = (Integer)objectArray[3];
        long l = (Long)objectArray[4];
        long l2 = l = p ^ l;
        long l3 = l2 ^ 0x4B680344002FL;
        long l4 = l2 ^ 0x5468928D3EBCL;
        Object[] objectArray2 = new Object[2];
        objectArray2[1] = l3;
        objectArray2[0] = string;
        Object[] objectArray3 = new Object[6];
        objectArray3[5] = l4;
        objectArray3[4] = n;
        objectArray3[3] = Float.valueOf(this.e);
        objectArray3[2] = Float.valueOf(f10);
        objectArray3[1] = Float.valueOf(f - cA.c("z", (Object)this, (Object)objectArray2, (long)1807095524888565360L, (long)l));
        objectArray3[0] = string;
        cA.c("z", (Object)this, (Object)objectArray3, (long)1807650714678181267L, (long)l);
    }

    public void q(Object[] objectArray) {
        String string = (String)objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        float f10 = ((Float)objectArray[2]).floatValue();
        float f11 = ((Float)objectArray[3]).floatValue();
        int n = (Integer)objectArray[4];
        long l = (Long)objectArray[5];
        long l2 = (l = p ^ l) ^ 0x6669583BE4FAL;
        Object[] objectArray2 = new Object[6];
        objectArray2[5] = l2;
        objectArray2[4] = n;
        objectArray2[3] = Float.valueOf(f11);
        objectArray2[2] = Float.valueOf(f10);
        objectArray2[1] = Float.valueOf(f);
        objectArray2[0] = string;
        cA.c("z", (Object)this, (Object)objectArray2, (long)-3398691619736678159L, (long)l);
    }

    public void w(Object[] objectArray) {
        Matrix4f matrix4f = (Matrix4f)objectArray[0];
        String string = (String)objectArray[1];
        float f = ((Float)objectArray[2]).floatValue();
        float f10 = ((Float)objectArray[3]).floatValue();
        float f11 = ((Float)objectArray[4]).floatValue();
        Color color = (Color)objectArray[5];
        long l = (Long)objectArray[6];
        long l2 = (l = p ^ l) ^ 0x755BC81FAC37L;
        Object[] objectArray2 = new Object[7];
        objectArray2[6] = l2;
        objectArray2[5] = color;
        objectArray2[4] = Float.valueOf(this.e * f11);
        objectArray2[3] = Float.valueOf(f10);
        objectArray2[2] = Float.valueOf(f);
        objectArray2[1] = string;
        objectArray2[0] = matrix4f;
        cA.c("z", (Object)this, (Object)objectArray2, (long)-4830614394898676192L, (long)l);
    }

    public void u(Object[] objectArray) {
        String string = (String)objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        float f10 = ((Float)objectArray[2]).floatValue();
        Color color = (Color)objectArray[3];
        float f11 = ((Float)objectArray[4]).floatValue();
        long l = (Long)objectArray[5];
        long l2 = (l = p ^ l) ^ 0x70A303E84422L;
        Object[] objectArray2 = new Object[6];
        objectArray2[5] = l2;
        objectArray2[4] = (int)cA.c("z", (Object)color, (long)8084921062293332118L, (long)l);
        objectArray2[3] = Float.valueOf(this.e * f11);
        objectArray2[2] = Float.valueOf(f10);
        objectArray2[1] = Float.valueOf(f);
        objectArray2[0] = string;
        cA.c("z", (Object)this, (Object)objectArray2, (long)8074247355339911209L, (long)l);
    }

    public void r(Object[] objectArray) {
        String string = (String)objectArray[0];
        float f = ((Float)objectArray[1]).floatValue();
        float f10 = ((Float)objectArray[2]).floatValue();
        Color color = (Color)objectArray[3];
        long l = (Long)objectArray[4];
        long l2 = (l = p ^ l) ^ 0x76F85DF432FAL;
        Object[] objectArray2 = new Object[6];
        objectArray2[5] = l2;
        objectArray2[4] = (int)cA.c("z", (Object)color, (long)498613703630722638L, (long)l);
        objectArray2[3] = Float.valueOf(this.e);
        objectArray2[2] = Float.valueOf(f10);
        objectArray2[1] = Float.valueOf(f);
        objectArray2[0] = string;
        cA.c("z", (Object)this, (Object)objectArray2, (long)492435436404229873L, (long)l);
    }

    public void y(Object[] objectArray) {
        float f = ((Float)objectArray[0]).floatValue();
        this.e = f;
    }

    private static ga_0 lambda$new$0(cA cA2) {
        long l = p ^ 0x783D70B3EFD6L;
        long l2 = l ^ 0x18CA7729B9AEL;
        Object[] objectArray = new Object[1];
        objectArray[0] = l2;
        cA.c("\u00c5", (Object)objectArray, (long)4405729023369416839L, (long)l);
        return (ga_0)((Object)cA.c("z", (Object)dA.a, (long)4406368237397839640L, (long)l));
    }

    private static boolean lambda$truncate$4(float f, float[] fArray, float f10, float f11, StringBuilder stringBuilder, int n, cE cE2) {
        float f12;
        block4: {
            float f13;
            long l;
            block5: {
                l = p ^ 0x67597ECB5486L;
                f13 = f * cA.c("z", (Object)cE2, (Object)new Object[0], (long)-8772457119762546907L, (long)l);
                CallSite callSite = cA.c("\u00c5", (long)-8772854149237341172L, (long)l);
                try {
                    try {
                        float f14 = fArray[0] + f13 + f10 - f11;
                        f12 = f14 == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1);
                        if (callSite != null) break block4;
                        if (f12 <= 0) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw cA.c("\u00c5", (Object)runtimeException, (long)-8756962226004483343L, (long)l);
                    }
                    cA.c("z", (Object)stringBuilder, (Object)cA.a("v", (int)26310, (long)(0x5A9BD6E7085E84F7L ^ l)), (long)-8771704051420790404L, (long)l);
                    return false;
                }
                catch (RuntimeException runtimeException) {
                    throw cA.c("\u00c5", (Object)runtimeException, (long)-8756962226004483343L, (long)l);
                }
            }
            fArray[0] = fArray[0] + f13;
            cA.c("z", (Object)stringBuilder, (int)n, (long)-8770270867239576268L, (long)l);
            f12 = 1;
        }
        return (boolean)f12;
    }

    private boolean lambda$render$2(float[] fArray, ga_0 ga_02, gL gL2, Matrix4f matrix4f, float f, float f10, float f11, int n, int n2, cE cE2) {
        long l = p ^ 0x5DF61BE40155L;
        long l2 = l ^ 0x2DFCA69E2D56L;
        Object[] objectArray = new Object[10];
        objectArray[9] = l2;
        objectArray[8] = n;
        objectArray[7] = Float.valueOf(f11);
        objectArray[6] = Float.valueOf(f10);
        objectArray[5] = Float.valueOf(f);
        objectArray[4] = Float.valueOf(fArray[0]);
        objectArray[3] = cE2;
        objectArray[2] = matrix4f;
        objectArray[1] = gL2;
        objectArray[0] = ga_02;
        fArray[0] = fArray[0] + cA.c("z", (Object)this, (Object)objectArray, (long)-3194943564462450403L, (long)l);
        return true;
    }

    private static boolean lambda$getWidth$3(float[] fArray, int n, cE cE2) {
        long l = p ^ 0x58FB80303DE0L;
        fArray[0] = fArray[0] + cA.c("z", (Object)cE2, (Object)new Object[0], (long)-1213782665978735037L, (long)l);
        return true;
    }

    private boolean lambda$render$1(float[] fArray, ga_0 ga_02, gL gL2, float f, float f10, float f11, int n, int n2, cE cE2) {
        long l = p ^ 0x4775129886FBL;
        long l2 = l ^ 0x18EF377B3CF7L;
        Object[] objectArray = new Object[9];
        objectArray[8] = l2;
        objectArray[7] = n;
        objectArray[6] = Float.valueOf(f11);
        objectArray[5] = Float.valueOf(f10);
        objectArray[4] = Float.valueOf(f);
        objectArray[3] = Float.valueOf(fArray[0]);
        objectArray[2] = cE2;
        objectArray[1] = gL2;
        objectArray[0] = ga_02;
        fArray[0] = fArray[0] + cA.c("z", (Object)this, (Object)objectArray, (long)6069731735287970414L, (long)l);
        return true;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(cA.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(cA.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;Ljava/lang/invoke/MethodType;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(cA.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}


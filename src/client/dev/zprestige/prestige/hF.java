/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.lenni0451.classtransform.InjectionCallback
 *  net.lenni0451.classtransform.annotations.CTransformer
 *  net.minecraft.class_10209
 *  net.minecraft.class_1041
 *  net.minecraft.class_11228
 *  net.minecraft.class_1297
 *  net.minecraft.class_1309
 *  net.minecraft.class_1533
 *  net.minecraft.class_1675
 *  net.minecraft.class_2338
 *  net.minecraft.class_2350
 *  net.minecraft.class_2374
 *  net.minecraft.class_238
 *  net.minecraft.class_243
 *  net.minecraft.class_310
 *  net.minecraft.class_3965
 *  net.minecraft.class_3966
 *  net.minecraft.class_4184
 *  net.minecraft.class_4587
 *  net.minecraft.class_757
 *  net.minecraft.class_7833
 *  net.minecraft.class_9779
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.joml.Quaternionfc
 */
package dev.zprestige.prestige;

import com.mojang.blaze3d.systems.RenderSystem;
import dev.zprestige.prestige.a1;
import dev.zprestige.prestige.bH;
import dev.zprestige.prestige.bk_0;
import dev.zprestige.prestige.cS;
import dev.zprestige.prestige.client.Prestige;
import dev.zprestige.prestige.dB;
import dev.zprestige.prestige.gK;
import dev.zprestige.prestige.gz_0;
import java.util.List;
import java.util.function.Predicate;
import net.lenni0451.classtransform.InjectionCallback;
import net.lenni0451.classtransform.annotations.CTransformer;
import net.minecraft.class_10209;
import net.minecraft.class_1041;
import net.minecraft.class_11228;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1533;
import net.minecraft.class_1675;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2374;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_3965;
import net.minecraft.class_3966;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_757;
import net.minecraft.class_7833;
import net.minecraft.class_9779;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Quaternionfc;

@CTransformer(value={class_757.class})
public class hF {
    class_310 client;
    private class_11228 guiRenderer;

    public void e(float tickDelta, InjectionCallback ci) {
        if (Prestige.w || Prestige.b == null || !cS.bS(Prestige.b, bk_0.class)) {
            return;
        }
        class_1297 entity2 = this.client.method_1560();
        if (entity2 == null) {
            return;
        }
        if (this.client.field_1687 == null) {
            return;
        }
        class_10209.method_64146().method_15396("pick");
        this.client.field_1692 = null;
        double d = cS.bT();
        bk_0 reachEvent = cS.bU(0.0f);
        boolean call = cS.bV(reachEvent);
        if (call) {
            d += (double)cS.bW(reachEvent);
        }
        this.client.field_1765 = entity2.method_5745(d, tickDelta, false);
        class_243 vec3d = entity2.method_5836(tickDelta);
        boolean bl = false;
        int i = 3;
        double e = d;
        if (this.client.field_1724.method_68878()) {
            e = 6.0;
            d = 6.0;
        } else {
            if (e > 3.0 && !call) {
                bl = true;
            }
            d = e;
        }
        e *= e;
        if (this.client.field_1765 != null) {
            e = this.client.field_1765.method_17784().method_1025(vec3d);
        }
        class_243 vec3d2 = entity2.method_5828(1.0f);
        class_243 vec3d3 = vec3d.method_1031(vec3d2.field_1352 * d, vec3d2.field_1351 * d, vec3d2.field_1350 * d);
        float f = 1.0f;
        class_238 box = entity2.method_5829().method_18804(vec3d2.method_1021(d)).method_1009(1.0, 1.0, 1.0);
        class_3966 entityHitResult = class_1675.method_18075((class_1297)entity2, (class_243)vec3d, (class_243)vec3d3, (class_238)box, (Predicate)cS.bX(), (double)e);
        if (entityHitResult != null) {
            class_1297 entity22 = entityHitResult.method_17782();
            class_243 vec3d4 = entityHitResult.method_17784();
            double g = vec3d.method_1025(vec3d4);
            if (bl && g > 9.0) {
                this.client.field_1765 = class_3965.method_17778((class_243)vec3d4, (class_2350)class_2350.method_10142((double)vec3d2.field_1352, (double)vec3d2.field_1351, (double)vec3d2.field_1350), (class_2338)class_2338.method_49638((class_2374)vec3d4));
            } else if (g < e || this.client.field_1765 == null) {
                this.client.field_1765 = entityHitResult;
                if (entity22 instanceof class_1309 || entity22 instanceof class_1533) {
                    this.client.field_1692 = entity22;
                }
            }
        }
        class_10209.method_64146().method_15407();
        ci.cancel();
    }

    private void b(class_9779 tickCounter) {
        if (Prestige.w || !cS.bH()) {
            return;
        }
        class_4184 camera = this.client.field_1773.method_19418();
        class_4587 matrixStack = cS.bI();
        RenderSystem.getModelViewStack().pushMatrix().mul((Matrix4fc)matrixStack.method_23760().method_23761());
        matrixStack.method_22907((Quaternionfc)class_7833.field_40714.rotationDegrees(camera.method_19329()));
        matrixStack.method_22907((Quaternionfc)class_7833.field_40716.rotationDegrees(camera.method_19330() + 180.0f));
        dB.e.set((Matrix4fc)RenderSystem.getModelViewMatrix());
        dB.f.set((Matrix4fc)matrixStack.method_23760().method_23761());
        RenderSystem.getModelViewStack().popMatrix();
    }

    private void c(class_4587 matrices, float tickDelta, InjectionCallback ci) {
        if (Prestige.w || Prestige.b == null || !cS.bJ(Prestige.b, bH.class)) {
            return;
        }
        bH event = cS.bK();
        if (cS.bL(event)) {
            ci.cancel();
        }
    }

    private void d() {
        if (Prestige.w || Prestige.b == null || !cS.bM(Prestige.b, a1.class)) {
            return;
        }
        a1 event = cS.bN(0);
        cS.bO(event);
        for (int i = 0; i < cS.bP(event); ++i) {
            cS.bR(cS.bQ((class_757)this)).method_70937();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void a(class_9779 tickCounter, boolean tick) {
        gz_0 cap;
        block4: {
            boolean renderWork;
            List delayedActions = cS.bp();
            boolean bl = renderWork = !Prestige.w && Prestige.b != null && cS.bq();
            if (!renderWork && delayedActions.isEmpty()) {
                cS.br();
                cS.bs();
                return;
            }
            cap = cS.bt();
            try {
                cS.bu(delayedActions);
                if (renderWork) break block4;
                cS.bv();
                cS.bw();
            }
            catch (Throwable throwable) {
                cS.bG(cap);
                throw throwable;
            }
            cS.bx(cap);
            return;
        }
        class_1041 window = this.client.method_22683();
        Matrix4f proj = cS.bB(cS.bA(cS.bz(cS.by(this.guiRenderer))), (float)window.method_4489() / (float)window.method_4495(), (float)window.method_4506() / (float)window.method_4495());
        gK context = cS.bD(proj, cS.bC().setTranslation(0.0f, 0.0f, -10000.0f), null);
        cS.bE(context);
        cS.bF(cap);
    }
}


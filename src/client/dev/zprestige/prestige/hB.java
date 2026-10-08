/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.lenni0451.classtransform.InjectionCallback
 *  net.lenni0451.classtransform.annotations.CTransformer
 *  net.minecraft.class_1297
 *  net.minecraft.class_238
 *  net.minecraft.class_243
 *  net.minecraft.class_310
 *  net.minecraft.class_3532
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.aR;
import dev.zprestige.prestige.bL;
import dev.zprestige.prestige.bf_0;
import dev.zprestige.prestige.cS;
import dev.zprestige.prestige.client.Prestige;
import dev.zprestige.prestige.dC;
import net.lenni0451.classtransform.InjectionCallback;
import net.lenni0451.classtransform.annotations.CTransformer;
import net.minecraft.class_1297;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_3532;

@CTransformer(value={class_1297.class})
public abstract class hB {
    private void b(InjectionCallback cir) {
        if (Prestige.w) {
            return;
        }
        class_1297 entity = (class_1297)this;
        if (entity == null) {
            return;
        }
        if (!cS.aH(Prestige.b, aR.class)) {
            return;
        }
        class_238 box = (class_238)cir.getReturnValue();
        aR event = cS.aI(entity, box);
        if (cS.aJ(event)) {
            cir.setReturnValue((Object)cS.aK(event));
        }
    }

    public void c(class_243 velocity, InjectionCallback ci) {
        if (Prestige.w) {
            return;
        }
        class_1297 entity = (class_1297)this;
        if (entity != class_310.method_1551().field_1724) {
            return;
        }
        bL event = cS.aL(velocity.field_1352, velocity.field_1351, velocity.field_1350);
        if (cS.aM(event)) {
            entity.method_18800(cS.aN(event), cS.aO(event), cS.aP(event));
            ci.cancel();
        }
    }

    public void d(float tickDelta, InjectionCallback cir) {
        class_310 mc = class_310.method_1551();
        if (mc == null || mc.field_1724 == null || this != mc.field_1724 || Prestige.w || Prestige.o == null) {
            return;
        }
        dC rot = cS.aQ(Prestige.o);
        if (rot != null) {
            cir.setReturnValue((Object)mc.field_1724.method_5631(cS.aR(rot), cS.aS(rot)));
        }
    }

    private void a(float speed, class_243 movementInput, InjectionCallback ci) {
        if (Prestige.w) {
            return;
        }
        class_1297 entity = (class_1297)this;
        class_310 mc = class_310.method_1551();
        if (entity != mc.field_1724 || Prestige.o == null || cS.aA(Prestige.o) == null) {
            return;
        }
        bf_0 event = cS.aB(entity.method_36454(), movementInput);
        if (cS.aC(event)) {
            class_243 vec3d;
            float yaw = cS.aD(event);
            class_243 input = cS.aE(event) != null ? cS.aF(event) : movementInput;
            double d = input.method_1027();
            if (d < 1.0E-7) {
                vec3d = class_243.field_1353;
            } else {
                class_243 scaled = (d > 1.0 ? input.method_1029() : input).method_1021((double)speed);
                float f = class_3532.method_15374((double)(yaw * ((float)Math.PI / 180)));
                float g = class_3532.method_15362((double)(yaw * ((float)Math.PI / 180)));
                vec3d = cS.aG(scaled.field_1352 * (double)g - scaled.field_1350 * (double)f, scaled.field_1351, scaled.field_1350 * (double)g + scaled.field_1352 * (double)f);
            }
            entity.method_18799(entity.method_18798().method_1019(vec3d));
            ci.cancel();
        }
    }
}


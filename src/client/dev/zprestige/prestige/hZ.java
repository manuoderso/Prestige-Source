/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.lenni0451.classtransform.InjectionCallback
 *  net.lenni0451.classtransform.annotations.CTransformer
 *  net.minecraft.class_1309
 *  net.minecraft.class_243
 *  net.minecraft.class_310
 *  net.minecraft.class_3532
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.bE;
import dev.zprestige.prestige.bI;
import dev.zprestige.prestige.bf_0;
import dev.zprestige.prestige.by_0;
import dev.zprestige.prestige.cS;
import dev.zprestige.prestige.client.Prestige;
import dev.zprestige.prestige.y_0;
import net.lenni0451.classtransform.InjectionCallback;
import net.lenni0451.classtransform.annotations.CTransformer;
import net.minecraft.class_1309;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_3532;

@CTransformer(value={class_1309.class})
public abstract class hZ {
    private void e(InjectionCallback ci) {
        if (Prestige.w) {
            return;
        }
        class_1309 entity = (class_1309)this;
        if (entity != class_310.method_1551().field_1724 || Prestige.o == null || cS.cV(Prestige.o) == null) {
            return;
        }
        float yaw = entity.method_36454();
        bf_0 event = cS.cW(yaw);
        if (cS.cX(event)) {
            yaw = cS.cY(event);
            float f = yaw * ((float)Math.PI / 180);
            entity.method_18799(entity.method_18798().method_1031((double)(-class_3532.method_15374((double)f) * 0.2f), 0.0, (double)(class_3532.method_15362((double)f) * 0.2f)));
            entity.field_64356 = true;
            ci.cancel();
        }
    }

    private void b(class_243 movementInput) {
        if (Prestige.w) {
            return;
        }
        if (class_310.method_1551().field_1724 == null) {
            return;
        }
        if (!((class_1309)this).equals((Object)class_310.method_1551().field_1724)) {
            return;
        }
        if (Prestige.o == null || cS.cM(Prestige.o) == null) {
            return;
        }
        bI event = cS.cN(y_0.POST, ((class_1309)this).method_36454(), ((class_1309)this).method_36455());
        if (cS.cO(event)) {
            ((class_1309)this).method_36456(bI.c);
            ((class_1309)this).method_36457(bI.d);
        }
    }

    private void c(InjectionCallback ci) {
        if (Prestige.w || Prestige.b == null || !cS.cP(Prestige.b, bE.class)) {
            return;
        }
        bE event = cS.cQ(0);
        if (cS.cR(event)) {
            ci.setReturnValue((Object)event.a);
        }
    }

    private void d(byte status) {
        if (Prestige.w || Prestige.b == null || !cS.cS(Prestige.b, by_0.class)) {
            return;
        }
        if (status == 30) {
            cS.cU(cS.cT((class_1309)this));
        }
    }

    private void a(class_243 movementInput, InjectionCallback ci) {
        if (Prestige.w) {
            return;
        }
        if (class_310.method_1551().field_1724 == null) {
            return;
        }
        if (!((class_1309)this).equals((Object)class_310.method_1551().field_1724)) {
            return;
        }
        if (Prestige.o == null || cS.cJ(Prestige.o) == null) {
            return;
        }
        bI event = cS.cK(y_0.PRE, ((class_1309)this).method_36454(), ((class_1309)this).method_36455());
        if (cS.cL(event)) {
            bI.c = ((class_1309)this).method_36454();
            bI.d = ((class_1309)this).method_36455();
            ((class_1309)this).method_36456(event.a);
            ((class_1309)this).method_36457(event.b);
        }
    }
}


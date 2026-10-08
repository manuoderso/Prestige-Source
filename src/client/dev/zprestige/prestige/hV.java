/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.lenni0451.classtransform.InjectionCallback
 *  net.lenni0451.classtransform.annotations.CTransformer
 *  net.minecraft.class_241
 *  net.minecraft.class_310
 *  net.minecraft.class_743
 *  net.minecraft.class_744
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.ba_0;
import dev.zprestige.prestige.cS;
import dev.zprestige.prestige.client.Prestige;
import dev.zprestige.prestige.y_0;
import net.lenni0451.classtransform.InjectionCallback;
import net.lenni0451.classtransform.annotations.CTransformer;
import net.minecraft.class_241;
import net.minecraft.class_310;
import net.minecraft.class_743;
import net.minecraft.class_744;

@CTransformer(value={class_743.class})
public class hV
extends class_744 {
    private void b(InjectionCallback ci) {
        if (Prestige.w) {
            return;
        }
        ba_0 keyboardTickEvent = cS.cB(y_0.POST);
        cS.cC(keyboardTickEvent);
    }

    private void c(InjectionCallback ci) {
        if (Prestige.w || Prestige.u == null) {
            return;
        }
        if (cS.cD(Prestige.u)) {
            this.field_54155 = cS.cE(false, false, false, false, false, false, false);
            this.field_55868 = class_241.field_1340;
        } else if (cS.cF(Prestige.u) && this.method_20622()) {
            class_310 client = class_310.method_1551();
            if (client.field_1724 != null && !client.field_1724.method_5624()) {
                client.field_1724.method_5728(true);
            }
        }
    }

    private void a(InjectionCallback ci) {
        ba_0 event = cS.cz(y_0.PRE);
        cS.cA(event);
    }
}


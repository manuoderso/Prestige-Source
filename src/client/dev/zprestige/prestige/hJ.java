/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.lenni0451.classtransform.InjectionCallback
 *  net.lenni0451.classtransform.annotations.CTransformer
 *  net.minecraft.class_1306
 *  net.minecraft.class_4587
 *  net.minecraft.class_759
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.bs_0;
import dev.zprestige.prestige.cS;
import dev.zprestige.prestige.client.Prestige;
import net.lenni0451.classtransform.InjectionCallback;
import net.lenni0451.classtransform.annotations.CTransformer;
import net.minecraft.class_1306;
import net.minecraft.class_4587;
import net.minecraft.class_759;

@CTransformer(value={class_759.class})
public abstract class hJ {
    private void a(float swingProgress, class_4587 matrixStack, int i, class_1306 arm, InjectionCallback ci) {
        if (Prestige.w || !cS.cb(Prestige.b, bs_0.class)) {
            return;
        }
        bs_0 event = cS.cc(matrixStack, arm, swingProgress, 1.0f);
        if (cS.cd(event)) {
            matrixStack.method_22905(2.0f, 2.0f, 2.0f);
            ci.cancel();
        }
    }
}


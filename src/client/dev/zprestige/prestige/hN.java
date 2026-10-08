/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.lenni0451.classtransform.InjectionCallback
 *  net.lenni0451.classtransform.annotations.CTransformer
 *  net.minecraft.class_4587
 *  net.minecraft.class_4597
 *  net.minecraft.class_4603
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.a0;
import dev.zprestige.prestige.cS;
import dev.zprestige.prestige.client.Prestige;
import net.lenni0451.classtransform.InjectionCallback;
import net.lenni0451.classtransform.annotations.CTransformer;
import net.minecraft.class_4587;
import net.minecraft.class_4597;
import net.minecraft.class_4603;

@CTransformer(value={class_4603.class})
public class hN {
    private static void a(class_4587 matrices, class_4597 vertexConsumers, InjectionCallback ci) {
        if (Prestige.w) {
            return;
        }
        a0 event = cS.cp();
        if (cS.cq(event)) {
            ci.cancel();
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.lenni0451.classtransform.InjectionCallback
 *  net.lenni0451.classtransform.annotations.CTransformer
 *  net.minecraft.class_2960
 *  net.minecraft.class_332
 *  net.minecraft.class_437
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.aM;
import dev.zprestige.prestige.cS;
import dev.zprestige.prestige.client.Prestige;
import net.lenni0451.classtransform.InjectionCallback;
import net.lenni0451.classtransform.annotations.CTransformer;
import net.minecraft.class_2960;
import net.minecraft.class_332;
import net.minecraft.class_437;

@CTransformer(value={class_437.class})
public class iv {
    private static void b(class_332 drawContext, class_2960 identifier, int i, int j, float f, float g, int k, int l, InjectionCallback ci) {
        if (Prestige.w) {
            return;
        }
        aM event = cS.dU();
        if (cS.dV(event)) {
            ci.cancel();
        }
    }

    private void a(class_332 drawContext, int i, int j, float f, InjectionCallback ci) {
        if (Prestige.w) {
            return;
        }
        aM event = cS.dS();
        if (cS.dT(event)) {
            ci.cancel();
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.lenni0451.classtransform.InjectionCallback
 *  net.lenni0451.classtransform.annotations.CTransformer
 *  net.minecraft.class_329
 *  net.minecraft.class_332
 *  net.minecraft.class_9779
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.aV;
import dev.zprestige.prestige.bC;
import dev.zprestige.prestige.br_0;
import dev.zprestige.prestige.bx_0;
import dev.zprestige.prestige.cS;
import dev.zprestige.prestige.client.Prestige;
import net.lenni0451.classtransform.InjectionCallback;
import net.lenni0451.classtransform.annotations.CTransformer;
import net.minecraft.class_329;
import net.minecraft.class_332;
import net.minecraft.class_9779;

@CTransformer(value={class_329.class})
public class hL {
    private void b(class_332 context, class_9779 tickCounter, InjectionCallback ci) {
        if (Prestige.w || !cS.cg(Prestige.b, aV.class)) {
            return;
        }
        aV event = cS.ch();
        if (cS.ci(event)) {
            ci.cancel();
        }
    }

    private void c(class_332 context, class_9779 counter, InjectionCallback ci) {
        if (Prestige.w || !cS.cj(Prestige.b, bx_0.class)) {
            return;
        }
        if (cS.cl(cS.ck())) {
            ci.cancel();
        }
    }

    private void d(class_332 context, class_9779 tickCounter, InjectionCallback ci) {
        if (Prestige.w || !cS.cm(Prestige.b, br_0.class)) {
            return;
        }
        if (cS.co(cS.cn())) {
            ci.cancel();
        }
    }

    private void a(class_332 context, class_9779 tickCounter, InjectionCallback ci) {
        if (Prestige.w) {
            return;
        }
        bC event = cS.ce();
        if (cS.cf(event)) {
            ci.cancel();
        }
    }
}


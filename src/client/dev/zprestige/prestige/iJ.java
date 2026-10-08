/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.lenni0451.classtransform.InjectionCallback
 *  net.lenni0451.classtransform.annotations.CTransformer
 *  net.minecraft.class_1937
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.bM;
import dev.zprestige.prestige.bj_0;
import dev.zprestige.prestige.cS;
import dev.zprestige.prestige.client.Prestige;
import net.lenni0451.classtransform.InjectionCallback;
import net.lenni0451.classtransform.annotations.CTransformer;
import net.minecraft.class_1937;

@CTransformer(value={class_1937.class})
public class iJ {
    private void b(InjectionCallback cir) {
        if (Prestige.w || !cS.et(Prestige.b, bM.class)) {
            return;
        }
        bM event = cS.eu((Long)cir.getReturnValue());
        if (cS.ev(event)) {
            cir.setReturnValue((Object)cS.ew(event));
        }
    }

    private void a(float delta, InjectionCallback cir) {
        if (Prestige.w || !cS.eq(Prestige.b, bj_0.class)) {
            return;
        }
        if (cS.es(cS.er())) {
            cir.setReturnValue((Object)Float.valueOf(0.0f));
        }
    }
}


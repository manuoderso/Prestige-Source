/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.lenni0451.classtransform.InjectionCallback
 *  net.lenni0451.classtransform.annotations.CTransformer
 *  net.minecraft.class_1799
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.aQ;
import dev.zprestige.prestige.cS;
import dev.zprestige.prestige.client.Prestige;
import net.lenni0451.classtransform.InjectionCallback;
import net.lenni0451.classtransform.annotations.CTransformer;
import net.minecraft.class_1799;

@CTransformer(value={class_1799.class})
public class hR {
    public void b(int bobbingAnimationTime, InjectionCallback ci) {
        if (Prestige.w || !cS.cu(Prestige.b, aQ.class)) {
            return;
        }
        if (cS.cw(cS.cv())) {
            ci.cancel();
        }
    }

    private void a(InjectionCallback info) {
        if (Prestige.w || !cS.cr(Prestige.b, aQ.class)) {
            return;
        }
        if (cS.ct(cS.cs())) {
            info.setReturnValue((Object)0);
        }
    }
}


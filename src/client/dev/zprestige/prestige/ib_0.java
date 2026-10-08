/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.lenni0451.classtransform.InjectionCallback
 *  net.lenni0451.classtransform.annotations.CTransformer
 *  net.minecraft.class_10042
 *  net.minecraft.class_583
 *  net.minecraft.class_922
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.aG;
import dev.zprestige.prestige.cS;
import dev.zprestige.prestige.client.Prestige;
import net.lenni0451.classtransform.InjectionCallback;
import net.lenni0451.classtransform.annotations.CTransformer;
import net.minecraft.class_10042;
import net.minecraft.class_583;
import net.minecraft.class_922;

/*
 * Renamed from dev.zprestige.prestige.ib
 */
@CTransformer(value={class_922.class})
public class ib_0 {
    private class_583<?> model;

    private void a(class_10042 state, InjectionCallback ci) {
        if (Prestige.w) {
            return;
        }
        if (!aG.e || !aG.f) {
            return;
        }
        if (this.model == null) {
            return;
        }
        if (!cS.cZ(this.model)) {
            return;
        }
        ci.setReturnValue((Object)true);
    }
}


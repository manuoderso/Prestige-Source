/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.lenni0451.classtransform.InjectionCallback
 *  net.lenni0451.classtransform.annotations.CTransformer
 *  net.minecraft.class_2338
 *  net.minecraft.class_852
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.bN;
import dev.zprestige.prestige.cS;
import dev.zprestige.prestige.client.Prestige;
import net.lenni0451.classtransform.InjectionCallback;
import net.lenni0451.classtransform.annotations.CTransformer;
import net.minecraft.class_2338;
import net.minecraft.class_852;

/*
 * Renamed from dev.zprestige.prestige.hn
 */
@CTransformer(value={class_852.class})
public class hn_0 {
    private void a(class_2338 pos, InjectionCallback ci) {
        if (Prestige.w) {
            return;
        }
        if (!cS.R(Prestige.b, bN.class)) {
            return;
        }
        if (cS.T(cS.S(null))) {
            ci.cancel();
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.lenni0451.classtransform.InjectionCallback
 *  net.lenni0451.classtransform.annotations.CTransformer
 *  net.minecraft.class_1657
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.cS;
import dev.zprestige.prestige.client.Prestige;
import net.lenni0451.classtransform.InjectionCallback;
import net.lenni0451.classtransform.annotations.CTransformer;
import net.minecraft.class_1657;

/*
 * Renamed from dev.zprestige.prestige.in
 */
@CTransformer(value={class_1657.class})
public class in_0 {
    private void a(InjectionCallback ci) {
        if (Prestige.w) {
            return;
        }
        if (cS.dC(cS.dB())) {
            ci.cancel();
        }
    }
}


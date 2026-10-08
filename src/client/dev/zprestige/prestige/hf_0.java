/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.lenni0451.classtransform.InjectionCallback
 *  net.lenni0451.classtransform.annotations.CTransformer
 *  net.minecraft.class_742
 *  net.minecraft.class_8685
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.bA;
import dev.zprestige.prestige.cS;
import dev.zprestige.prestige.client.Prestige;
import net.lenni0451.classtransform.InjectionCallback;
import net.lenni0451.classtransform.annotations.CTransformer;
import net.minecraft.class_742;
import net.minecraft.class_8685;

/*
 * Renamed from dev.zprestige.prestige.hf
 */
@CTransformer(value={class_742.class})
public class hf_0 {
    private void a(InjectionCallback ci) {
        if (Prestige.w || !cS.d(Prestige.b, bA.class)) {
            return;
        }
        bA event = cS.e((class_8685)ci.getReturnValue(), ((class_742)this).method_5477().getString());
        if (cS.f(event)) {
            ci.setReturnValue((Object)cS.g(event));
        }
    }
}


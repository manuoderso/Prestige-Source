/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.lenni0451.classtransform.InjectionCallback
 *  net.lenni0451.classtransform.annotations.CTransformer
 *  net.minecraft.class_702
 *  net.minecraft.class_703
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.bi_0;
import dev.zprestige.prestige.cS;
import dev.zprestige.prestige.client.Prestige;
import net.lenni0451.classtransform.InjectionCallback;
import net.lenni0451.classtransform.annotations.CTransformer;
import net.minecraft.class_702;
import net.minecraft.class_703;

/*
 * Renamed from dev.zprestige.prestige.il
 */
@CTransformer(value={class_702.class})
public class il_0 {
    private void a(class_703 particle, InjectionCallback ci) {
        if (Prestige.w) {
            return;
        }
        if (!cS.dy(Prestige.b, bi_0.class)) {
            return;
        }
        bi_0 event = cS.dz();
        if (cS.dA(event)) {
            ci.cancel();
        }
    }
}


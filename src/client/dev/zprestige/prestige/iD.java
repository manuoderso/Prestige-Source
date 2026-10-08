/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.lenni0451.classtransform.InjectionCallback
 *  net.lenni0451.classtransform.annotations.CTransformer
 *  net.minecraft.class_12076
 *  net.minecraft.class_4184
 *  net.minecraft.class_638
 *  net.minecraft.class_9975
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.bB;
import dev.zprestige.prestige.cS;
import dev.zprestige.prestige.client.Prestige;
import java.awt.Color;
import net.lenni0451.classtransform.InjectionCallback;
import net.lenni0451.classtransform.annotations.CTransformer;
import net.minecraft.class_12076;
import net.minecraft.class_4184;
import net.minecraft.class_638;
import net.minecraft.class_9975;

@CTransformer(value={class_9975.class})
public class iD {
    private void a(class_638 world, float tickDelta, class_4184 camera, class_12076 state, InjectionCallback ci) {
        int hzPacked;
        Color initialHorizon;
        if (Prestige.w) {
            return;
        }
        if (!cS.dY(Prestige.b, bB.class)) {
            return;
        }
        int skyPacked = state.field_63097;
        Color initialSky = cS.dZ(skyPacked >> 16 & 0xFF, skyPacked >> 8 & 0xFF, skyPacked & 0xFF);
        bB event = cS.eb(initialSky, initialHorizon = cS.ea((hzPacked = state.field_63095) >> 16 & 0xFF, hzPacked >> 8 & 0xFF, hzPacked & 0xFF));
        if (!cS.ec(event)) {
            return;
        }
        if (cS.ed(event) != null) {
            Color c = cS.ee(event);
            state.field_63097 = 0xFF000000 | (c.getRed() & 0xFF) << 16 | (c.getGreen() & 0xFF) << 8 | c.getBlue() & 0xFF;
        }
        if (cS.ef(event) != null) {
            Color h = cS.eg(event);
            int origAlpha = hzPacked >> 24 & 0xFF;
            state.field_63095 = origAlpha << 24 | (h.getRed() & 0xFF) << 16 | (h.getGreen() & 0xFF) << 8 | h.getBlue() & 0xFF;
        }
    }
}


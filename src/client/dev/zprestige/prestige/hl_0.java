/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.lenni0451.classtransform.InjectionCallback
 *  net.lenni0451.classtransform.annotations.CTransformer
 *  net.minecraft.class_4184
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.a3;
import dev.zprestige.prestige.aT;
import dev.zprestige.prestige.cS;
import dev.zprestige.prestige.client.Prestige;
import net.lenni0451.classtransform.InjectionCallback;
import net.lenni0451.classtransform.annotations.CTransformer;
import net.minecraft.class_4184;

/*
 * Renamed from dev.zprestige.prestige.hl
 */
@CTransformer(value={class_4184.class})
public class hl_0 {
    private void b(float yaw, float pitch, InjectionCallback ci) {
        if (a3.a || Prestige.w) {
            return;
        }
        a3 event = cS.L(yaw, pitch);
        if (cS.M(event)) {
            a3.a = true;
            cS.Q(cS.N((class_4184)this), cS.O(event), cS.P(event));
            a3.a = false;
            ci.cancel();
        }
    }

    private void a(double x, double y, double z, InjectionCallback ci) {
        if (aT.a || Prestige.w || !cS.D(Prestige.b, aT.class)) {
            return;
        }
        aT event = cS.E(x, y, z);
        if (cS.F(event)) {
            aT.a = true;
            cS.K(cS.G((class_4184)this), cS.H(event), cS.I(event), cS.J(event));
            aT.a = false;
            ci.cancel();
        }
    }
}


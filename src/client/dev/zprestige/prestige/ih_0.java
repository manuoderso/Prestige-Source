/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.lenni0451.classtransform.InjectionCallback
 *  net.lenni0451.classtransform.annotations.CTransformer
 *  net.minecraft.class_11910
 *  net.minecraft.class_312
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.bK;
import dev.zprestige.prestige.cS;
import dev.zprestige.prestige.client.Prestige;
import net.lenni0451.classtransform.InjectionCallback;
import net.lenni0451.classtransform.annotations.CTransformer;
import net.minecraft.class_11910;
import net.minecraft.class_312;

/*
 * Renamed from dev.zprestige.prestige.ih
 */
@CTransformer(value={class_312.class})
public class ih_0 {
    public double cursorDeltaX;
    public double cursorDeltaY;

    private void b(long window, class_11910 input, int action, InjectionCallback ci) {
        int button = input.comp_4801();
        if (Prestige.w) {
            return;
        }
        if (button != -1) {
            cS.dw(cS.dv(button, action));
        }
    }

    private void a(double timeDelta, InjectionCallback ci) {
        if (Prestige.w || !cS.ds(Prestige.b, bK.class)) {
            return;
        }
        bK event = cS.dt(this.cursorDeltaX, this.cursorDeltaY);
        if (cS.du(event)) {
            ci.cancel();
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.lenni0451.classtransform.InjectionCallback
 *  net.lenni0451.classtransform.annotations.CTransformer
 *  net.minecraft.class_2248
 *  net.minecraft.class_2350
 *  net.minecraft.class_2680
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.bN;
import dev.zprestige.prestige.cS;
import dev.zprestige.prestige.client.Prestige;
import net.lenni0451.classtransform.InjectionCallback;
import net.lenni0451.classtransform.annotations.CTransformer;
import net.minecraft.class_2248;
import net.minecraft.class_2350;
import net.minecraft.class_2680;

/*
 * Renamed from dev.zprestige.prestige.hj
 */
@CTransformer(value={class_2248.class})
public class hj_0 {
    public static void a(class_2680 state, class_2680 otherState, class_2350 side, InjectionCallback cir) {
        if (Prestige.w) {
            return;
        }
        if (!cS.z(Prestige.b, bN.class)) {
            return;
        }
        bN event = cS.A(state.method_26204());
        if (cS.B(event)) {
            cir.setReturnValue((Object)cS.C(event));
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.lenni0451.classtransform.InjectionCallback
 *  net.lenni0451.classtransform.annotations.CTransformer
 *  net.minecraft.class_1937
 *  net.minecraft.class_2338
 *  net.minecraft.class_2680
 *  net.minecraft.class_2818
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.aP;
import dev.zprestige.prestige.cS;
import dev.zprestige.prestige.client.Prestige;
import net.lenni0451.classtransform.InjectionCallback;
import net.lenni0451.classtransform.annotations.CTransformer;
import net.minecraft.class_1937;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import net.minecraft.class_2818;

@CTransformer(value={class_2818.class})
public class iL {
    public class_1937 world;

    private void a(class_2338 pos, class_2680 state, int flags, InjectionCallback cir) {
        if (Prestige.w) {
            return;
        }
        if (!cS.ex(Prestige.b, aP.class)) {
            return;
        }
        if (this.world.method_8608()) {
            aP event = cS.ey(pos, state);
            cS.ez(event);
        }
    }
}


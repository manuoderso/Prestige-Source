/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.lenni0451.classtransform.InjectionCallback
 *  net.lenni0451.classtransform.annotations.CTransformer
 *  net.minecraft.class_310
 *  net.minecraft.class_9919
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.client.Prestige;
import net.lenni0451.classtransform.InjectionCallback;
import net.lenni0451.classtransform.annotations.CTransformer;
import net.minecraft.class_310;
import net.minecraft.class_9919;

@CTransformer(value={class_9919.class})
public class hP {
    public void a(InjectionCallback cir) {
        if (Prestige.w) {
            return;
        }
        class_310 mc = class_310.method_1551();
        if (Prestige.k != null && mc.field_1755 == Prestige.k) {
            int maxFps = (Integer)mc.field_1690.method_42524().method_41753();
            cir.setReturnValue((Object)maxFps);
        }
    }
}


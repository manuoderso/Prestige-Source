/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.lenni0451.classtransform.InjectionCallback
 *  net.lenni0451.classtransform.annotations.CTransformer
 *  net.minecraft.class_1282
 *  net.minecraft.class_1297
 *  net.minecraft.class_1937$class_7867
 *  net.minecraft.class_2394
 *  net.minecraft.class_3218
 *  net.minecraft.class_3414
 *  net.minecraft.class_5362
 *  net.minecraft.class_6880
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.aY;
import dev.zprestige.prestige.cS;
import dev.zprestige.prestige.client.Prestige;
import net.lenni0451.classtransform.InjectionCallback;
import net.lenni0451.classtransform.annotations.CTransformer;
import net.minecraft.class_1282;
import net.minecraft.class_1297;
import net.minecraft.class_1937;
import net.minecraft.class_2394;
import net.minecraft.class_3218;
import net.minecraft.class_3414;
import net.minecraft.class_5362;
import net.minecraft.class_6880;

@CTransformer(value={class_3218.class})
public class ix {
    public void a(class_1297 entity, class_1282 damageSource, class_5362 behavior, double x, double y, double z, float power, boolean createFire, class_1937.class_7867 explosionSourceType, class_2394 smallParticle, class_2394 largeParticle, class_6880<class_3414> soundEvent, InjectionCallback ci) {
        if (Prestige.w) {
            return;
        }
        aY event = cS.dW(power, x, y, z);
        cS.dX(event);
    }
}


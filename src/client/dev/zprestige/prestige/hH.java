/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.lenni0451.classtransform.InjectionCallback
 *  net.lenni0451.classtransform.annotations.CTransformer
 *  net.minecraft.class_2794
 *  net.minecraft.class_5539
 *  net.minecraft.class_5868
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.K;
import dev.zprestige.prestige.cS;
import net.lenni0451.classtransform.InjectionCallback;
import net.lenni0451.classtransform.annotations.CTransformer;
import net.minecraft.class_2794;
import net.minecraft.class_5539;
import net.minecraft.class_5868;

@CTransformer(value={class_5868.class})
public class hH {
    private void a(class_2794 generator, class_5539 world, InjectionCallback ci) {
        if (generator == null) {
            K accessor = cS.bY(this);
            cS.bZ(accessor, -9999999);
            cS.ca(accessor, 100000000);
            ci.cancel();
        }
    }
}


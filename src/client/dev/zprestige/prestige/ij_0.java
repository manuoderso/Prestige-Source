/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.lenni0451.classtransform.InjectionCallback
 *  net.lenni0451.classtransform.annotations.CTransformer
 *  net.minecraft.class_2960
 *  net.minecraft.class_3294
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.cS;
import java.util.Optional;
import net.lenni0451.classtransform.InjectionCallback;
import net.lenni0451.classtransform.annotations.CTransformer;
import net.minecraft.class_2960;
import net.minecraft.class_3294;

/*
 * Renamed from dev.zprestige.prestige.ij
 */
@CTransformer(value={class_3294.class})
public class ij_0 {
    public void a(class_2960 identifier, InjectionCallback callbackInfoReturnable) {
        if (identifier.method_12836().equals("prestige")) {
            callbackInfoReturnable.setReturnValue(Optional.of(cS.dx(identifier)));
        }
    }
}


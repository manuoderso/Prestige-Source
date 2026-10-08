/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.lenni0451.classtransform.InjectionCallback
 *  net.lenni0451.classtransform.annotations.CTransformer
 *  net.minecraft.class_1922
 *  net.minecraft.class_2338
 *  net.minecraft.class_4970$class_4971
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.bN;
import dev.zprestige.prestige.cS;
import dev.zprestige.prestige.client.Prestige;
import net.lenni0451.classtransform.InjectionCallback;
import net.lenni0451.classtransform.annotations.CTransformer;
import net.minecraft.class_1922;
import net.minecraft.class_2338;
import net.minecraft.class_4970;

/*
 * Renamed from dev.zprestige.prestige.hd
 */
@CTransformer(value={class_4970.class_4971.class})
public class hd_0 {
    private void a(class_1922 blockView, class_2338 blockPos, InjectionCallback cir) {
        if (Prestige.w) {
            return;
        }
        if (!cS.a(Prestige.b, bN.class)) {
            return;
        }
        bN event = cS.b(null);
        if (cS.c(event)) {
            cir.setReturnValue((Object)Float.valueOf(1.0f));
        }
    }
}


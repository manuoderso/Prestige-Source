/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.lenni0451.classtransform.InjectionCallback
 *  net.lenni0451.classtransform.annotations.CTransformer
 *  net.minecraft.class_1297
 *  net.minecraft.class_1657
 *  net.minecraft.class_310
 *  net.minecraft.class_636
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.aK;
import dev.zprestige.prestige.cS;
import dev.zprestige.prestige.client.Prestige;
import net.lenni0451.classtransform.InjectionCallback;
import net.lenni0451.classtransform.annotations.CTransformer;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_310;
import net.minecraft.class_636;

/*
 * Renamed from dev.zprestige.prestige.hv
 */
@CTransformer(value={class_636.class})
public class hv_0 {
    private void a(class_1657 player, class_1297 target, InjectionCallback ci) {
        aK event;
        if (Prestige.w) {
            return;
        }
        if (class_310.method_1551().field_1724 == null) {
            return;
        }
        if (player.equals((Object)class_310.method_1551().field_1724) && cS.av(event = cS.au(target))) {
            ci.cancel();
        }
    }
}


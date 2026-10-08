/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.lenni0451.classtransform.InjectionCallback
 *  net.lenni0451.classtransform.annotations.CTransformer
 *  net.minecraft.class_2535
 *  net.minecraft.class_2547
 *  net.minecraft.class_2596
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.bg_0;
import dev.zprestige.prestige.bh_0;
import dev.zprestige.prestige.cS;
import dev.zprestige.prestige.client.Prestige;
import net.lenni0451.classtransform.InjectionCallback;
import net.lenni0451.classtransform.annotations.CTransformer;
import net.minecraft.class_2535;
import net.minecraft.class_2547;
import net.minecraft.class_2596;

/*
 * Renamed from dev.zprestige.prestige.hp
 */
@CTransformer(value={class_2535.class})
public class hp_0 {
    private void b(class_2596<?> packet, InjectionCallback ci) {
        bh_0 event;
        if (Prestige.w) {
            return;
        }
        if (Prestige.b != null && cS.X(Prestige.b, bh_0.class) && cS.Z(event = cS.Y(packet))) {
            ci.cancel();
            return;
        }
        if (Prestige.u != null) {
            cS.aa(Prestige.u, packet);
        }
    }

    private static <T extends class_2547> void a(class_2596<T> packet, class_2547 listener, InjectionCallback ci) {
        if (Prestige.w) {
            return;
        }
        if (!cS.U(Prestige.b, bg_0.class)) {
            return;
        }
        bg_0 event = cS.V(packet);
        if (cS.W(event)) {
            ci.cancel();
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  net.lenni0451.classtransform.InjectionCallback
 *  net.lenni0451.classtransform.annotations.CTransformer
 *  net.minecraft.class_1268
 *  net.minecraft.class_638
 *  net.minecraft.class_742
 *  net.minecraft.class_746
 */
package dev.zprestige.prestige;

import com.mojang.authlib.GameProfile;
import dev.zprestige.prestige.bD;
import dev.zprestige.prestige.bd_0;
import dev.zprestige.prestige.cS;
import dev.zprestige.prestige.client.Prestige;
import dev.zprestige.prestige.dC;
import dev.zprestige.prestige.y_0;
import net.lenni0451.classtransform.InjectionCallback;
import net.lenni0451.classtransform.annotations.CTransformer;
import net.minecraft.class_1268;
import net.minecraft.class_638;
import net.minecraft.class_742;
import net.minecraft.class_746;

/*
 * Renamed from dev.zprestige.prestige.ht
 */
@CTransformer(value={class_746.class})
public abstract class ht_0
extends class_742 {
    public ht_0(class_638 world, GameProfile profile) {
        super(world, profile);
    }

    private void b() {
        dC movementOverride;
        if (Prestige.w) {
            return;
        }
        bd_0.c = this.method_36454();
        bd_0.d = this.method_36455();
        bd_0 event = cS.al(y_0.PRE, bd_0.c, bd_0.d);
        boolean changed = cS.am(event);
        dC dC2 = movementOverride = Prestige.o == null ? null : cS.an(Prestige.o);
        if (movementOverride != null) {
            this.method_36456(cS.ao(movementOverride));
            this.method_36457(cS.ap(movementOverride));
        } else if (changed) {
            this.method_36456(cS.aq(event));
            this.method_36457(cS.ar(event));
        }
    }

    private void c() {
        if (Prestige.w) {
            return;
        }
        bd_0 event = cS.as(y_0.POST, bd_0.c, bd_0.d);
        cS.at(event);
        this.method_36456(bd_0.c);
        this.method_36457(bd_0.d);
    }

    private void a(class_1268 hand, InjectionCallback ci) {
        if (Prestige.w || Prestige.b == null || !cS.af(Prestige.b, bD.class)) {
            return;
        }
        bD event = cS.ag(y_0.PRE);
        if (cS.ah(event)) {
            ci.cancel();
        } else if (!cS.ai(event) && cS.ak(cS.aj(y_0.POST))) {
            ci.cancel();
        }
    }
}


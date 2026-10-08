/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  net.lenni0451.classtransform.InjectionCallback
 *  net.lenni0451.classtransform.annotations.CTransformer
 *  net.minecraft.class_640
 *  net.minecraft.class_8685
 */
package dev.zprestige.prestige;

import com.mojang.authlib.GameProfile;
import dev.zprestige.prestige.bA;
import dev.zprestige.prestige.cS;
import dev.zprestige.prestige.client.Prestige;
import net.lenni0451.classtransform.InjectionCallback;
import net.lenni0451.classtransform.annotations.CTransformer;
import net.minecraft.class_640;
import net.minecraft.class_8685;

@CTransformer(value={class_640.class})
public class ip {
    public GameProfile profile;

    private void a(InjectionCallback ci) {
        if (this.profile == null || Prestige.w || !cS.dD(Prestige.b, bA.class)) {
            return;
        }
        bA event = cS.dF((class_8685)ci.getReturnValue(), cS.dE(this.profile));
        if (cS.dG(event)) {
            ci.setReturnValue((Object)cS.dH(event));
        }
    }
}


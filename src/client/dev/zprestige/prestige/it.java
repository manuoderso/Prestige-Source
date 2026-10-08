/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.lenni0451.classtransform.InjectionCallback
 *  net.lenni0451.classtransform.annotations.CTransformer
 *  net.minecraft.class_2960
 *  net.minecraft.class_3304
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.cS;
import java.util.Optional;
import net.lenni0451.classtransform.InjectionCallback;
import net.lenni0451.classtransform.annotations.CTransformer;
import net.minecraft.class_2960;
import net.minecraft.class_3304;

@CTransformer(value={class_3304.class})
public class it {
    public void a(class_2960 identifier, InjectionCallback callbackInfoReturnable) {
        if (identifier.method_12836().equals("prestige")) {
            callbackInfoReturnable.setReturnValue(Optional.of(cS.dI(identifier)));
        }
        if (identifier.method_12832().equals("shaders/post/glow.json")) {
            callbackInfoReturnable.setReturnValue(Optional.of(cS.dJ("assets/prestige/shaders/post/glow.json")));
        }
        if (identifier.method_12832().equals("shaders/program/glow.json")) {
            callbackInfoReturnable.setReturnValue(Optional.of(cS.dK("assets/prestige/shaders/program/glow.json")));
        }
        if (identifier.method_12832().equals("shaders/program/glow.fsh")) {
            callbackInfoReturnable.setReturnValue(Optional.of(cS.dL("assets/prestige/shaders/program/glow.fsh")));
        }
        if (identifier.method_12832().equals("shaders/core/blur.json")) {
            callbackInfoReturnable.setReturnValue(Optional.of(cS.dM("assets/minecraft/shaders/core/blur.json")));
        }
        if (identifier.method_12832().equals("shaders/core/blur.fsh")) {
            callbackInfoReturnable.setReturnValue(Optional.of(cS.dN("assets/minecraft/shaders/core/blur.fsh")));
        }
        if (identifier.method_12832().equals("shaders/core/rounded_rect.json")) {
            callbackInfoReturnable.setReturnValue(Optional.of(cS.dO("assets/minecraft/shaders/core/rounded_rect.json")));
        }
        if (identifier.method_12832().equals("shaders/core/rounded_rect.fsh")) {
            callbackInfoReturnable.setReturnValue(Optional.of(cS.dP("assets/minecraft/shaders/core/rounded_rect.fsh")));
        }
        if (identifier.method_12832().equals("shaders/core/rounded_rect_glow.json")) {
            callbackInfoReturnable.setReturnValue(Optional.of(cS.dQ("assets/minecraft/shaders/core/rounded_rect_glow.json")));
        }
        if (identifier.method_12832().equals("shaders/core/rounded_rect_glow.fsh")) {
            callbackInfoReturnable.setReturnValue(Optional.of(cS.dR("assets/minecraft/shaders/core/rounded_rect_glow.fsh")));
        }
    }
}


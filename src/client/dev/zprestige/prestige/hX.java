/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.blaze3d.textures.GpuTexture
 *  net.lenni0451.classtransform.InjectionCallback
 *  net.lenni0451.classtransform.annotations.CTransformer
 *  net.minecraft.class_10209
 *  net.minecraft.class_765
 *  net.minecraft.class_9848
 */
package dev.zprestige.prestige;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTexture;
import dev.zprestige.prestige.a4;
import dev.zprestige.prestige.cS;
import dev.zprestige.prestige.client.Prestige;
import net.lenni0451.classtransform.InjectionCallback;
import net.lenni0451.classtransform.annotations.CTransformer;
import net.minecraft.class_10209;
import net.minecraft.class_765;
import net.minecraft.class_9848;

@CTransformer(value={class_765.class})
public class hX {
    private GpuTexture glTexture;

    private void a(float tickProgress, InjectionCallback ci) {
        if (Prestige.w) {
            return;
        }
        if (!cS.cG(Prestige.b, a4.class)) {
            return;
        }
        a4 event = cS.cH();
        if (cS.cI(event)) {
            RenderSystem.getDevice().createCommandEncoder().clearColorTexture(this.glTexture, class_9848.method_61324((int)255, (int)255, (int)255, (int)255));
            class_10209.method_64146().method_15407();
            ci.cancel();
        }
    }
}


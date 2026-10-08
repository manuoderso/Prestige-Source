/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.GpuBufferSlice
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.lenni0451.classtransform.InjectionCallback
 *  net.lenni0451.classtransform.annotations.CTransformer
 *  net.minecraft.class_243
 *  net.minecraft.class_4184
 *  net.minecraft.class_4604
 *  net.minecraft.class_761
 *  net.minecraft.class_9779
 *  net.minecraft.class_9922
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fStack
 *  org.joml.Matrix4fc
 *  org.joml.Vector4f
 */
package dev.zprestige.prestige;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.systems.RenderSystem;
import dev.zprestige.prestige.bJ;
import dev.zprestige.prestige.bw_0;
import dev.zprestige.prestige.cS;
import dev.zprestige.prestige.client.Prestige;
import dev.zprestige.prestige.dB;
import dev.zprestige.prestige.gK;
import dev.zprestige.prestige.gz_0;
import java.util.List;
import net.lenni0451.classtransform.InjectionCallback;
import net.lenni0451.classtransform.annotations.CTransformer;
import net.minecraft.class_243;
import net.minecraft.class_4184;
import net.minecraft.class_4604;
import net.minecraft.class_761;
import net.minecraft.class_9779;
import net.minecraft.class_9922;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;
import org.joml.Matrix4fc;
import org.joml.Vector4f;

@CTransformer(value={class_761.class})
public class iN {
    private class_4604 frustum;

    private void b(Matrix4f matrix4f, Matrix4f matrix4f2, class_243 vec3d, InjectionCallback ci) {
        if (Prestige.w) {
            return;
        }
        if (Prestige.b == null || !cS.eM(Prestige.b, bJ.class)) {
            return;
        }
        bJ event = cS.eN((class_4604)ci.getReturnValue());
        cS.eO(event);
    }

    private void c(InjectionCallback ci) {
        if (Prestige.w || Prestige.b == null || !cS.eP(Prestige.b, bw_0.class)) {
            return;
        }
        cS.eR(cS.eQ());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void a(class_9922 allocator, class_9779 tickCounter, boolean renderBlockOutline, class_4184 camera, Matrix4f theCameraRotation, Matrix4f actualRealProjMatrix, Matrix4f projectionMatrix, GpuBufferSlice fogBuffer, Vector4f fogColor, boolean renderSky) {
        gz_0 cap;
        block7: {
            if (Prestige.w || Prestige.b == null) {
                return;
            }
            List delayedActions = cS.eA();
            boolean renderWork = cS.eB();
            boolean hudWork = cS.eC();
            if (hudWork) {
                dB.d.set((Matrix4fc)actualRealProjMatrix);
                if (!renderWork) {
                    cS.eD();
                }
            }
            if (!renderWork && delayedActions.isEmpty()) {
                return;
            }
            cap = cS.eE();
            try {
                cS.eF(delayedActions);
                if (renderWork) break block7;
            }
            catch (Throwable throwable) {
                cS.eL(cap);
                throw throwable;
            }
            cS.eG(cap);
            return;
        }
        Matrix4fStack actualRealModView = RenderSystem.getModelViewStack();
        gK context = cS.eI(actualRealProjMatrix, cS.eH((Matrix4fc)actualRealModView), camera);
        cS.eJ(context);
        cS.eK(cap);
    }
}


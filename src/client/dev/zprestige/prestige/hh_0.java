/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.Std140Builder
 *  net.lenni0451.classtransform.InjectionCallback
 *  net.lenni0451.classtransform.annotations.CTransformer
 *  net.minecraft.class_4184
 *  net.minecraft.class_638
 *  net.minecraft.class_758
 *  net.minecraft.class_9779
 *  org.joml.Vector4f
 *  org.joml.Vector4fc
 */
package dev.zprestige.prestige;

import com.mojang.blaze3d.buffers.Std140Builder;
import dev.zprestige.prestige.a2;
import dev.zprestige.prestige.cS;
import dev.zprestige.prestige.client.Prestige;
import java.awt.Color;
import java.nio.ByteBuffer;
import net.lenni0451.classtransform.InjectionCallback;
import net.lenni0451.classtransform.annotations.CTransformer;
import net.minecraft.class_4184;
import net.minecraft.class_638;
import net.minecraft.class_758;
import net.minecraft.class_9779;
import org.joml.Vector4f;
import org.joml.Vector4fc;

/*
 * Renamed from dev.zprestige.prestige.hh
 */
@CTransformer(value={class_758.class})
public class hh_0 {
    private void b(class_4184 camera, int viewDistance, class_9779 tickCounter, float tickProgress, class_638 world, InjectionCallback ci) {
        if (Prestige.w) {
            return;
        }
        if (!cS.u(Prestige.b, a2.class)) {
            return;
        }
        a2 event = cS.v(0.0f, 0.0f, Color.WHITE);
        if (cS.w(event)) {
            Color c = cS.x(event);
            ci.setReturnValue((Object)cS.y((float)c.getRed() / 255.0f, (float)c.getGreen() / 255.0f, (float)c.getBlue() / 255.0f, (float)c.getAlpha() / 255.0f));
        }
    }

    private void a(ByteBuffer buffer, int bufPos, Vector4f fogColor, float environmentalStart, float environmentalEnd, float renderDistanceStart, float renderDistanceEnd, float skyEnd, float cloudEnd, InjectionCallback ci) {
        if (Prestige.w) {
            return;
        }
        if (!cS.h(Prestige.b, a2.class)) {
            return;
        }
        a2 event = cS.i(0.0f, 0.0f, Color.WHITE);
        if (cS.j(event)) {
            Vector4f color = cS.o((float)cS.k(event).getRed() / 255.0f, (float)cS.l(event).getGreen() / 255.0f, (float)cS.m(event).getBlue() / 255.0f, (float)cS.n(event).getAlpha() / 255.0f);
            Float skyOv = cS.p(event);
            float effectiveSkyEnd = skyOv == null ? skyEnd : skyOv.floatValue();
            buffer.position(bufPos);
            Std140Builder.intoBuffer((ByteBuffer)buffer).putVec4((Vector4fc)color).putFloat(cS.q(event)).putFloat(cS.r(event)).putFloat(cS.s(event)).putFloat(cS.t(event)).putFloat(effectiveSkyEnd).putFloat(cloudEnd);
            ci.cancel();
        }
    }
}


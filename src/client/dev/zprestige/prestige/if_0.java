/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.lenni0451.classtransform.annotations.CTransformer
 *  net.minecraft.class_11661$class_11670
 *  net.minecraft.class_11683
 *  net.minecraft.class_1921
 *  net.minecraft.class_3879
 *  net.minecraft.class_408
 *  net.minecraft.class_4587
 *  net.minecraft.class_4588
 *  net.minecraft.class_4597$class_4598
 *  net.minecraft.class_4618
 *  net.minecraft.class_583
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.aG;
import dev.zprestige.prestige.cS;
import dev.zprestige.prestige.cz_0;
import dev.zprestige.prestige.eG;
import java.util.Optional;
import net.lenni0451.classtransform.annotations.CTransformer;
import net.minecraft.class_11661;
import net.minecraft.class_11683;
import net.minecraft.class_1921;
import net.minecraft.class_3879;
import net.minecraft.class_408;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_4597;
import net.minecraft.class_4618;
import net.minecraft.class_583;

/*
 * Renamed from dev.zprestige.prestige.if
 */
@CTransformer(value={class_11683.class})
public class if_0 {
    private void b() {
        if (aG.e) {
            eG.u.remove();
        }
    }

    private void c(class_3879 model, class_4587 matrices, class_4588 originalConsumer, int light, int overlay, int color) {
        class_4588 consumer = originalConsumer;
        class_1921 layer = (class_1921)eG.u.get();
        if (aG.e && layer != null && model instanceof class_583) {
            Optional textureId;
            Integer id;
            class_583 entityModel = (class_583)model;
            if ((layer.method_24295() || layer.method_23289().isPresent()) && cS.do() != null && cS.dp(entityModel) && (cz_0.b.field_1755 == null || cz_0.b.field_1755 instanceof class_408) && (id = (Integer)(textureId = cS.dq(layer)).orElse(null)) != null) {
                consumer = cS.dr(originalConsumer, id);
            }
        }
        model.method_62100(matrices, consumer, light, overlay, color);
    }

    private void a(class_11661.class_11670<?> model, class_1921 renderLayer, class_4588 vertexConsumer, class_4618 outlineVertexConsumers, class_4597.class_4598 crumblingOverlayVertexConsumers) {
        if (aG.e) {
            eG.u.set(renderLayer);
        }
    }
}


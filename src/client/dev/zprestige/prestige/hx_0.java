/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.lenni0451.classtransform.InjectionCallback
 *  net.lenni0451.classtransform.annotations.CTransformer
 *  net.minecraft.class_1297
 *  net.minecraft.class_1297$class_5529
 *  net.minecraft.class_638
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.aW;
import dev.zprestige.prestige.cS;
import dev.zprestige.prestige.client.Prestige;
import dev.zprestige.prestige.y_0;
import net.lenni0451.classtransform.InjectionCallback;
import net.lenni0451.classtransform.annotations.CTransformer;
import net.minecraft.class_1297;
import net.minecraft.class_638;

/*
 * Renamed from dev.zprestige.prestige.hx
 */
@CTransformer(value={class_638.class})
public class hx_0 {
    private void b(int entityId, class_1297.class_5529 removalReason, InjectionCallback ci) {
        if (Prestige.w) {
            return;
        }
        class_638 world = (class_638)this;
        if (world == null) {
            return;
        }
        class_1297 entity = world.method_8469(entityId);
        if (entity != null) {
            aW event = cS.ay(entity, y_0.POST);
            cS.az(event);
        }
    }

    private void a(class_1297 entity, InjectionCallback ci) {
        if (Prestige.w) {
            return;
        }
        if (entity != null) {
            aW event = cS.aw(entity, y_0.PRE);
            cS.ax(event);
        }
    }
}


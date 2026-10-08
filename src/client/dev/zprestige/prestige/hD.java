/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.lenni0451.classtransform.InjectionCallback
 *  net.lenni0451.classtransform.annotations.CTransformer
 *  net.minecraft.class_10017
 *  net.minecraft.class_1297
 *  net.minecraft.class_1657
 *  net.minecraft.class_2338
 *  net.minecraft.class_2561
 *  net.minecraft.class_310
 *  net.minecraft.class_897
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.a4;
import dev.zprestige.prestige.aX;
import dev.zprestige.prestige.bb_0;
import dev.zprestige.prestige.bn_0;
import dev.zprestige.prestige.bq_0;
import dev.zprestige.prestige.cS;
import dev.zprestige.prestige.client.Prestige;
import dev.zprestige.prestige.y_0;
import net.lenni0451.classtransform.InjectionCallback;
import net.lenni0451.classtransform.annotations.CTransformer;
import net.minecraft.class_10017;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_2338;
import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_897;

@CTransformer(value={class_897.class})
public abstract class hD<T extends class_1297, S extends class_10017> {
    public void b(T entity, float tickDelta) {
        if (Prestige.w || entity != class_310.method_1551().field_1724) {
            return;
        }
        if (Prestige.b == null || Prestige.p == null || !cS.aX(Prestige.p) || !cS.aY(Prestige.b, aX.class)) {
            return;
        }
        cS.ba(cS.aZ(entity, y_0.POST));
    }

    private void c(T entity, class_2338 pos, InjectionCallback cir) {
        if (Prestige.w) {
            return;
        }
        if (!cS.bb(Prestige.b, a4.class)) {
            return;
        }
        a4 event = cS.bc();
        if (cS.bd(event)) {
            cir.setReturnValue((Object)15);
        }
    }

    public void d(T entity, S state, float tickDelta) {
        bq_0 event;
        class_2561 originalDisplayName;
        if (Prestige.w || Prestige.b == null || ((class_10017)state).field_53337 == null) {
            return;
        }
        boolean hasLabelText = cS.be(Prestige.b, bb_0.class);
        boolean hasHealthIndicators = cS.bf(Prestige.b, bn_0.class);
        boolean hasRenderLabel = cS.bg(Prestige.b, bq_0.class);
        if (!(hasLabelText || hasHealthIndicators || hasRenderLabel)) {
            return;
        }
        class_2561 displayName = originalDisplayName = ((class_10017)state).field_53337;
        if (entity instanceof class_1657) {
            class_1657 player = (class_1657)entity;
            if (entity.method_5805() && (hasLabelText || hasHealthIndicators)) {
                bn_0 event2;
                bb_0 labelTextEvent = cS.bh(entity, displayName);
                boolean labelTextCancelled = cS.bi(labelTextEvent);
                displayName = cS.bj(labelTextEvent);
                if (!labelTextCancelled && cS.bl(event2 = cS.bk(player, ""))) {
                    displayName = class_2561.method_30163((String)(displayName.getString() + cS.bm(event2)));
                }
            }
        }
        if (hasRenderLabel && cS.bo(event = cS.bn(originalDisplayName, displayName, entity))) {
            ((class_10017)state).field_53337 = null;
            return;
        }
        ((class_10017)state).field_53337 = displayName == null || displayName.getString().isEmpty() ? null : displayName;
    }

    public void a(T entity, float tickDelta) {
        if (Prestige.w || entity != class_310.method_1551().field_1724) {
            return;
        }
        if (Prestige.b == null || Prestige.o == null || cS.aT(Prestige.o) == null || !cS.aU(Prestige.b, aX.class)) {
            return;
        }
        cS.aW(cS.aV(entity, y_0.PRE));
    }
}


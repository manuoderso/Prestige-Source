/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.lenni0451.classtransform.InjectionCallback
 *  net.lenni0451.classtransform.annotations.CTransformer
 *  net.minecraft.class_2672
 *  net.minecraft.class_2678
 *  net.minecraft.class_2818
 *  net.minecraft.class_634
 *  net.minecraft.class_638
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.a5;
import dev.zprestige.prestige.cS;
import dev.zprestige.prestige.client.Prestige;
import net.lenni0451.classtransform.InjectionCallback;
import net.lenni0451.classtransform.annotations.CTransformer;
import net.minecraft.class_2672;
import net.minecraft.class_2678;
import net.minecraft.class_2818;
import net.minecraft.class_634;
import net.minecraft.class_638;

/*
 * Renamed from dev.zprestige.prestige.hr
 */
@CTransformer(value={class_634.class})
public class hr_0 {
    private class_638 world;

    private void b(class_2672 packet, InjectionCallback info) {
        if (Prestige.w) {
            return;
        }
        class_2818 chunk = this.world.method_8497(packet.method_11523(), packet.method_11524());
        cS.ae(cS.ad(chunk));
    }

    private void a(class_2678 gameJoinS2CPacket, InjectionCallback ci) {
        if (Prestige.w) {
            return;
        }
        if (this.world != null) {
            a5 event = cS.ab();
            cS.ac(event);
        }
    }
}


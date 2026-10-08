/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.lenni0451.classtransform.annotations.CTransformer
 *  net.lenni0451.classtransform.utils.CArgs
 *  net.minecraft.class_1297
 *  net.minecraft.class_1657
 *  net.minecraft.class_2561
 *  net.minecraft.class_310
 *  net.minecraft.class_638
 *  net.minecraft.class_8138$class_8141
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.bb_0;
import dev.zprestige.prestige.cS;
import dev.zprestige.prestige.client.Prestige;
import net.lenni0451.classtransform.annotations.CTransformer;
import net.lenni0451.classtransform.utils.CArgs;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_638;
import net.minecraft.class_8138;

@CTransformer(value={class_8138.class_8141.class})
public class iF {
    public void a(CArgs cArgs) {
        if (Prestige.w || !cS.eh(Prestige.b, bb_0.class)) {
            return;
        }
        class_2561 text = (class_2561)cArgs.get(0);
        String stringText = text.getString();
        class_638 world = class_310.method_1551().field_1687;
        if (!stringText.isBlank() && world != null) {
            for (class_1657 player : world.method_18456()) {
                bb_0 labelTextEvent;
                int index = stringText.indexOf(player.method_5820());
                boolean surrounded = index == -1 || index > 0 && Character.isLetterOrDigit(stringText.charAt(index - 1)) || index + player.method_5820().length() < stringText.length() && Character.isLetterOrDigit(stringText.charAt(index + player.method_5820().length()));
                if (surrounded || !cS.ej(labelTextEvent = cS.ei((class_1297)player, text))) continue;
                cArgs.set(0, (Object)cS.ek(labelTextEvent));
            }
        }
    }
}


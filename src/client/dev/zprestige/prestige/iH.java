/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.lenni0451.classtransform.annotations.CTransformer
 *  net.lenni0451.classtransform.utils.CArgs
 *  net.minecraft.class_5223
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.bc_0;
import dev.zprestige.prestige.cS;
import dev.zprestige.prestige.client.Prestige;
import net.lenni0451.classtransform.annotations.CTransformer;
import net.lenni0451.classtransform.utils.CArgs;
import net.minecraft.class_5223;

@CTransformer(value={class_5223.class})
public class iH {
    private static void a(CArgs cArgs) {
        String text = (String)cArgs.get(0);
        if (text != null) {
            if (!Prestige.w) {
                if (!cS.el(Prestige.b, bc_0.class)) {
                    return;
                }
                bc_0 event = cS.em("", text);
                if (cS.en(event)) {
                    cArgs.set(0, (Object)text.replace(cS.eo(event), cS.ep(event)));
                }
            } else {
                cArgs.set(0, (Object)text);
            }
        }
    }
}


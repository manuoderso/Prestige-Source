/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.lenni0451.classtransform.InjectionCallback
 *  net.lenni0451.classtransform.annotations.CTransformer
 *  net.minecraft.class_11908
 *  net.minecraft.class_309
 *  net.minecraft.class_310
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.a_;
import dev.zprestige.prestige.cS;
import dev.zprestige.prestige.client.Prestige;
import net.lenni0451.classtransform.InjectionCallback;
import net.lenni0451.classtransform.annotations.CTransformer;
import net.minecraft.class_11908;
import net.minecraft.class_309;
import net.minecraft.class_310;

@CTransformer(value={class_309.class})
public class hT {
    public class_310 client;

    private void a(long window, int action, class_11908 input, InjectionCallback ci) {
        a_ event;
        int key = input.method_74228();
        if (Prestige.w) {
            return;
        }
        if (key != -1 && cS.cy(event = cS.cx(key, action))) {
            ci.cancel();
        }
    }
}


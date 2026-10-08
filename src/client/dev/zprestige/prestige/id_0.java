/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.lenni0451.classtransform.InjectionCallback
 *  net.lenni0451.classtransform.annotations.CTransformer
 *  net.minecraft.class_310
 */
package dev.zprestige.prestige;

import dev.zprestige.prestige.bG;
import dev.zprestige.prestige.cJ;
import dev.zprestige.prestige.cS;
import dev.zprestige.prestige.client.Prestige;
import net.lenni0451.classtransform.InjectionCallback;
import net.lenni0451.classtransform.annotations.CTransformer;
import net.minecraft.class_310;

/*
 * Renamed from dev.zprestige.prestige.id
 */
@CTransformer(value={class_310.class})
public class id_0 {
    public void e(InjectionCallback ci) {
        if (Prestige.w) {
            return;
        }
        if (cS.dj(cS.di())) {
            ci.cancel();
        }
    }

    public void b(InjectionCallback ci) {
        if (Prestige.w || !cJ.f) {
            return;
        }
        if (class_310.method_1551().field_1687 == null || class_310.method_1551().field_1724 == null) {
            return;
        }
        bG event = cS.dc();
        if (cS.dd(event)) {
            ci.cancel();
        }
    }

    public void c(InjectionCallback ci) {
        if (Prestige.w) {
            return;
        }
        cS.df(cS.de());
    }

    public void f(InjectionCallback cir) {
        if (Prestige.w) {
            return;
        }
        if (cS.dl(cS.dk())) {
            cir.setReturnValue((Object)false);
        }
    }

    public void d(InjectionCallback ci) {
        if (Prestige.w) {
            return;
        }
        cS.dh(cS.dg(class_310.method_1551().method_22683()));
    }

    public void a(InjectionCallback ci) {
        if (Prestige.w) {
            return;
        }
        if (class_310.method_1551().field_1687 == null || class_310.method_1551().field_1724 == null) {
            return;
        }
        cJ.f = false;
        bG event = cS.da();
        if (cS.db(event)) {
            ci.cancel();
        }
    }

    public void g(boolean bl, InjectionCallback ci) {
        if (Prestige.w) {
            return;
        }
        if (cS.dn(cS.dm())) {
            ci.cancel();
        }
    }
}


package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class s0 implements androidx.lifecycle.h, c1.f, androidx.lifecycle.p0 {

    /* renamed from: f, reason: collision with root package name */
    public final u f486f;

    /* renamed from: g, reason: collision with root package name */
    public final androidx.lifecycle.o0 f487g;
    public androidx.lifecycle.t h = null;

    /* renamed from: i, reason: collision with root package name */
    public c1.e f488i = null;

    public s0(u uVar, androidx.lifecycle.o0 o0Var) {
        this.f486f = uVar;
        this.f487g = o0Var;
    }

    @Override // androidx.lifecycle.h
    public final w0.c a() {
        Application application;
        u uVar = this.f486f;
        Context applicationContext = uVar.B().getApplicationContext();
        while (true) {
            if (applicationContext instanceof ContextWrapper) {
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            } else {
                application = null;
                break;
            }
        }
        w0.c cVar = new w0.c(0);
        LinkedHashMap linkedHashMap = cVar.f3194a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.m0.f573a, application);
        }
        linkedHashMap.put(androidx.lifecycle.g0.f557a, this);
        linkedHashMap.put(androidx.lifecycle.g0.f558b, this);
        Bundle bundle = uVar.f495k;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.g0.f559c, bundle);
        }
        return cVar;
    }

    @Override // c1.f
    public final c1.d b() {
        d();
        return this.f488i.f1098b;
    }

    public final void c(androidx.lifecycle.l lVar) {
        this.h.d(lVar);
    }

    public final void d() {
        if (this.h == null) {
            this.h = new androidx.lifecycle.t(this);
            c1.e eVar = new c1.e(this);
            this.f488i = eVar;
            eVar.a();
            androidx.lifecycle.g0.a(this);
        }
    }

    @Override // androidx.lifecycle.p0
    public final androidx.lifecycle.o0 e() {
        d();
        return this.f487g;
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t f() {
        d();
        return this.h;
    }
}

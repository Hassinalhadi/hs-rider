package com.logistics.rider.lsposed;

import a.b;
import a.f0;
import a.q;
import a.u;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import c1.a;
import g.h;
import g.i;
import j0.c0;
import j0.j0;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class MainActivity extends i {
    public static final /* synthetic */ int E = 0;

    public MainActivity() {
        this.f42i.f1098b.e("androidx:appcompat", new a(this));
        d(new h(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // g.i, a.n, android.app.Activity
    public final void onCreate(Bundle bundle) {
        u uVar;
        super.onCreate(bundle);
        b bVar = new b(1);
        f0 f0Var = new f0(0, 0, bVar);
        int i3 = q.f62a;
        int i4 = q.f63b;
        b bVar2 = new b(1);
        f0 f0Var2 = new f0(i3, i4, bVar2);
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        Resources resources = decorView.getResources();
        resources.getClass();
        boolean booleanValue = ((Boolean) bVar.b(resources)).booleanValue();
        Resources resources2 = decorView.getResources();
        resources2.getClass();
        boolean booleanValue2 = ((Boolean) bVar2.b(resources2)).booleanValue();
        u uVar2 = q.f64c;
        u uVar3 = uVar2;
        if (uVar2 == null) {
            if (Build.VERSION.SDK_INT >= 35) {
                uVar = new Object();
            } else {
                uVar = new Object();
            }
            q.f64c = uVar;
            uVar3 = uVar;
        }
        u uVar4 = uVar3;
        Window window = getWindow();
        window.getClass();
        uVar4.a(f0Var, f0Var2, window, decorView, booleanValue, booleanValue2);
        Window window2 = getWindow();
        window2.getClass();
        uVar4.b(window2);
        setContentView(R.layout.activity_main);
        View findViewById = findViewById(R.id.main);
        b bVar3 = new b(15);
        WeakHashMap weakHashMap = j0.f2160a;
        c0.i(findViewById, bVar3);
    }
}

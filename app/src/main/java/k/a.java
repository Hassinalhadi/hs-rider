package k;

import androidx.appcompat.widget.ActionBarContextView;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class a implements j0.l0 {

    /* renamed from: f, reason: collision with root package name */
    public boolean f2209f = false;

    /* renamed from: g, reason: collision with root package name */
    public int f2210g;
    public final /* synthetic */ ActionBarContextView h;

    public a(ActionBarContextView actionBarContextView) {
        this.h = actionBarContextView;
    }

    @Override // j0.l0
    public final void a() {
        if (this.f2209f) {
            return;
        }
        ActionBarContextView actionBarContextView = this.h;
        actionBarContextView.f119k = null;
        super/*android.view.View*/.setVisibility(this.f2210g);
    }

    @Override // j0.l0
    public final void c() {
        this.f2209f = true;
    }

    @Override // j0.l0
    public final void g() {
        super/*android.view.View*/.setVisibility(0);
        this.f2209f = false;
    }
}

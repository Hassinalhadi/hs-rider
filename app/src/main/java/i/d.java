package i;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.emoji2.text.p;
import androidx.emoji2.text.w;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class d extends a implements j.k {
    public Context h;

    /* renamed from: i, reason: collision with root package name */
    public ActionBarContextView f1920i;

    /* renamed from: j, reason: collision with root package name */
    public p f1921j;

    /* renamed from: k, reason: collision with root package name */
    public WeakReference f1922k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1923l;

    /* renamed from: m, reason: collision with root package name */
    public j.m f1924m;

    @Override // i.a
    public final void a() {
        if (this.f1923l) {
            return;
        }
        this.f1923l = true;
        this.f1921j.A(this);
    }

    @Override // i.a
    public final View b() {
        WeakReference weakReference = this.f1922k;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // i.a
    public final j.m c() {
        return this.f1924m;
    }

    @Override // i.a
    public final MenuInflater d() {
        return new h(this.f1920i.getContext());
    }

    @Override // i.a
    public final CharSequence e() {
        return this.f1920i.getSubtitle();
    }

    @Override // i.a
    public final CharSequence f() {
        return this.f1920i.getTitle();
    }

    @Override // j.k
    public final void g(j.m mVar) {
        i();
        k.k kVar = this.f1920i.f117i;
        if (kVar != null) {
            kVar.l();
        }
    }

    @Override // j.k
    public final boolean h(j.m mVar, MenuItem menuItem) {
        return ((w) this.f1921j.f301g).n(this, menuItem);
    }

    @Override // i.a
    public final void i() {
        this.f1921j.B(this, this.f1924m);
    }

    @Override // i.a
    public final boolean j() {
        return this.f1920i.f132x;
    }

    @Override // i.a
    public final void k(View view) {
        WeakReference weakReference;
        this.f1920i.setCustomView(view);
        if (view != null) {
            weakReference = new WeakReference(view);
        } else {
            weakReference = null;
        }
        this.f1922k = weakReference;
    }

    @Override // i.a
    public final void l(int i3) {
        m(this.h.getString(i3));
    }

    @Override // i.a
    public final void m(CharSequence charSequence) {
        this.f1920i.setSubtitle(charSequence);
    }

    @Override // i.a
    public final void n(int i3) {
        o(this.h.getString(i3));
    }

    @Override // i.a
    public final void o(CharSequence charSequence) {
        this.f1920i.setTitle(charSequence);
    }

    @Override // i.a
    public final void p(boolean z2) {
        this.f1914g = z2;
        this.f1920i.setTitleOptional(z2);
    }
}

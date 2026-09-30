package g;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class l0 extends i.a implements j.k {
    public final Context h;

    /* renamed from: i, reason: collision with root package name */
    public final j.m f1727i;

    /* renamed from: j, reason: collision with root package name */
    public androidx.emoji2.text.p f1728j;

    /* renamed from: k, reason: collision with root package name */
    public WeakReference f1729k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ m0 f1730l;

    public l0(m0 m0Var, Context context, androidx.emoji2.text.p pVar) {
        this.f1730l = m0Var;
        this.h = context;
        this.f1728j = pVar;
        j.m mVar = new j.m(context);
        mVar.f2082l = 1;
        this.f1727i = mVar;
        mVar.f2076e = this;
    }

    @Override // i.a
    public final void a() {
        m0 m0Var = this.f1730l;
        if (m0Var.f1739i != this) {
            return;
        }
        if (m0Var.f1746p) {
            m0Var.f1740j = this;
            m0Var.f1741k = this.f1728j;
        } else {
            this.f1728j.A(this);
        }
        this.f1728j = null;
        m0Var.a(false);
        ActionBarContextView actionBarContextView = m0Var.f1737f;
        if (actionBarContextView.f124p == null) {
            actionBarContextView.e();
        }
        m0Var.f1735c.setHideOnContentScrollEnabled(m0Var.f1751u);
        m0Var.f1739i = null;
    }

    @Override // i.a
    public final View b() {
        WeakReference weakReference = this.f1729k;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // i.a
    public final j.m c() {
        return this.f1727i;
    }

    @Override // i.a
    public final MenuInflater d() {
        return new i.h(this.h);
    }

    @Override // i.a
    public final CharSequence e() {
        return this.f1730l.f1737f.getSubtitle();
    }

    @Override // i.a
    public final CharSequence f() {
        return this.f1730l.f1737f.getTitle();
    }

    @Override // j.k
    public final void g(j.m mVar) {
        if (this.f1728j != null) {
            i();
            k.k kVar = this.f1730l.f1737f.f117i;
            if (kVar != null) {
                kVar.l();
            }
        }
    }

    @Override // j.k
    public final boolean h(j.m mVar, MenuItem menuItem) {
        androidx.emoji2.text.p pVar = this.f1728j;
        if (pVar != null) {
            return ((androidx.emoji2.text.w) pVar.f301g).n(this, menuItem);
        }
        return false;
    }

    @Override // i.a
    public final void i() {
        if (this.f1730l.f1739i != this) {
            return;
        }
        j.m mVar = this.f1727i;
        mVar.w();
        try {
            this.f1728j.B(this, mVar);
        } finally {
            mVar.v();
        }
    }

    @Override // i.a
    public final boolean j() {
        return this.f1730l.f1737f.f132x;
    }

    @Override // i.a
    public final void k(View view) {
        this.f1730l.f1737f.setCustomView(view);
        this.f1729k = new WeakReference(view);
    }

    @Override // i.a
    public final void l(int i3) {
        m(this.f1730l.f1733a.getResources().getString(i3));
    }

    @Override // i.a
    public final void m(CharSequence charSequence) {
        this.f1730l.f1737f.setSubtitle(charSequence);
    }

    @Override // i.a
    public final void n(int i3) {
        o(this.f1730l.f1733a.getResources().getString(i3));
    }

    @Override // i.a
    public final void o(CharSequence charSequence) {
        this.f1730l.f1737f.setTitle(charSequence);
    }

    @Override // i.a
    public final void p(boolean z2) {
        this.f1914g = z2;
        this.f1730l.f1737f.setTitleOptional(z2);
    }
}

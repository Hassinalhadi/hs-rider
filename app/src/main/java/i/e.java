package i;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import j.b0;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class e extends ActionMode {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1925a;

    /* renamed from: b, reason: collision with root package name */
    public final a f1926b;

    public e(Context context, a aVar) {
        this.f1925a = context;
        this.f1926b = aVar;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f1926b.a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f1926b.b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new b0(this.f1925a, this.f1926b.c());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f1926b.d();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f1926b.e();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f1926b.f1913f;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f1926b.f();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f1926b.f1914g;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f1926b.i();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f1926b.j();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f1926b.k(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f1926b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f1926b.f1913f = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f1926b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z2) {
        this.f1926b.p(z2);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i3) {
        this.f1926b.l(i3);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i3) {
        this.f1926b.n(i3);
    }
}

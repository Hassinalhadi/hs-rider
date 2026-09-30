package k0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: f, reason: collision with root package name */
    public final int f2464f;

    /* renamed from: g, reason: collision with root package name */
    public final d f2465g;
    public final int h;

    public a(int i3, d dVar, int i4) {
        this.f2464f = i3;
        this.f2465g = dVar;
        this.h = i4;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f2464f);
        this.f2465g.f2476a.performAction(this.h, bundle);
    }
}

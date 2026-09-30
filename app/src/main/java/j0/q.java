package j0;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class q implements r {

    /* renamed from: f, reason: collision with root package name */
    public final ScrollFeedbackProvider f2175f;

    public q(NestedScrollView nestedScrollView) {
        this.f2175f = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // j0.r
    public final void onScrollLimit(int i3, int i4, int i5, boolean z2) {
        this.f2175f.onScrollLimit(i3, i4, i5, z2);
    }

    @Override // j0.r
    public final void onScrollProgress(int i3, int i4, int i5, int i6) {
        this.f2175f.onScrollProgress(i3, i4, i5, i6);
    }
}

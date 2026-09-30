package j;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class q extends FrameLayout implements i.b {

    /* renamed from: f, reason: collision with root package name */
    public final CollapsibleActionView f2123f;

    /* JADX WARN: Multi-variable type inference failed */
    public q(View view) {
        super(view.getContext());
        this.f2123f = (CollapsibleActionView) view;
        addView(view);
    }
}

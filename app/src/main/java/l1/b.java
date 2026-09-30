package l1;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import k2.h;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class b extends h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2497a;

    @Override // k2.h
    public final int s(View view, ViewGroup.MarginLayoutParams marginLayoutParams) {
        int measuredHeight;
        int i3;
        switch (this.f2497a) {
            case 0:
                measuredHeight = view.getMeasuredHeight();
                i3 = marginLayoutParams.bottomMargin;
                break;
            case 1:
                measuredHeight = view.getMeasuredWidth();
                i3 = marginLayoutParams.leftMargin;
                break;
            default:
                measuredHeight = view.getMeasuredWidth();
                i3 = marginLayoutParams.rightMargin;
                break;
        }
        return measuredHeight + i3;
    }

    @Override // k2.h
    public final int u() {
        switch (this.f2497a) {
            case 0:
                return 1;
            case 1:
                return 2;
            default:
                return 0;
        }
    }

    @Override // k2.h
    public final ViewPropertyAnimator w(View view, int i3) {
        switch (this.f2497a) {
            case 0:
                return view.animate().translationY(i3);
            case 1:
                return view.animate().translationX(-i3);
            default:
                return view.animate().translationX(i3);
        }
    }
}

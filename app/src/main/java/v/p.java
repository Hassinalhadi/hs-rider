package v;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class p extends View {

    /* renamed from: f, reason: collision with root package name */
    public boolean f3166f;

    public p(Context context) {
        super(context);
        this.f3166f = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i4) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z2) {
        this.f3166f = z2;
    }

    public void setGuidelineBegin(int i3) {
        e eVar = (e) getLayoutParams();
        if (this.f3166f && eVar.f3037a == i3) {
            return;
        }
        eVar.f3037a = i3;
        setLayoutParams(eVar);
    }

    public void setGuidelineEnd(int i3) {
        e eVar = (e) getLayoutParams();
        if (this.f3166f && eVar.f3038b == i3) {
            return;
        }
        eVar.f3038b = i3;
        setLayoutParams(eVar);
    }

    public void setGuidelinePercent(float f3) {
        e eVar = (e) getLayoutParams();
        if (this.f3166f && eVar.f3040c == f3) {
            return;
        }
        eVar.f3040c = f3;
        setLayoutParams(eVar);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int i3) {
    }
}

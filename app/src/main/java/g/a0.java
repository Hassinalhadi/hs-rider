package g;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class a0 extends ContentFrameLayout {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ c0 f1631n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(c0 c0Var, i.c cVar) {
        super(cVar, null);
        this.f1631n = c0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f1631n.t(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x3 = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            if (x3 < -5 || y2 < -5 || x3 > getWidth() + 5 || y2 > getHeight() + 5) {
                c0 c0Var = this.f1631n;
                c0Var.r(c0Var.y(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i3) {
        setBackgroundDrawable(a.y.B(getContext(), i3));
    }
}

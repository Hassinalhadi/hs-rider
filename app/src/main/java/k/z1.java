package k;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class z1 implements View.OnTouchListener {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a2 f2463f;

    public z1(a2 a2Var) {
        this.f2463f = a2Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        a2 a2Var = this.f2463f;
        w1 w1Var = a2Var.f2230w;
        Handler handler = a2Var.A;
        b0 b0Var = a2Var.E;
        int action = motionEvent.getAction();
        int x3 = (int) motionEvent.getX();
        int y2 = (int) motionEvent.getY();
        if (action == 0 && b0Var != null && b0Var.isShowing() && x3 >= 0 && x3 < b0Var.getWidth() && y2 >= 0 && y2 < b0Var.getHeight()) {
            handler.postDelayed(w1Var, 250L);
            return false;
        }
        if (action == 1) {
            handler.removeCallbacks(w1Var);
            return false;
        }
        return false;
    }
}

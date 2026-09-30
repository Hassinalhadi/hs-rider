package q0;

import android.view.View;
import b2.x;
import k2.h;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class d extends h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2758a;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k2.h
    public final void X(x xVar, float f3) {
        switch (this.f2758a) {
            case 0:
                ((View) xVar).setAlpha(f3);
                return;
            case 1:
                ((View) xVar).setScaleX(f3);
                return;
            case 2:
                ((View) xVar).setScaleY(f3);
                return;
            case 3:
                ((View) xVar).setRotation(f3);
                return;
            case 4:
                ((View) xVar).setRotationX(f3);
                return;
            default:
                ((View) xVar).setRotationY(f3);
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k2.h
    public final float t(x xVar) {
        switch (this.f2758a) {
            case 0:
                return ((View) xVar).getAlpha();
            case 1:
                return ((View) xVar).getScaleX();
            case 2:
                return ((View) xVar).getScaleY();
            case 3:
                return ((View) xVar).getRotation();
            case 4:
                return ((View) xVar).getRotationX();
            default:
                return ((View) xVar).getRotationY();
        }
    }
}

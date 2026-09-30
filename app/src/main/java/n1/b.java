package n1;

import a.y;
import android.view.View;
import android.view.WindowInsetsAnimation;
import androidx.emoji2.text.p;
import j0.c1;
import j0.n0;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class b extends y {

    /* renamed from: f, reason: collision with root package name */
    public final View f2606f;

    /* renamed from: g, reason: collision with root package name */
    public int f2607g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f2608i = new int[2];

    public b(View view) {
        this.f2606f = view;
    }

    @Override // a.y
    public final void P(n0 n0Var) {
        this.f2606f.setTranslationY(0.0f);
    }

    @Override // a.y
    public final void U(n0 n0Var) {
        View view = this.f2606f;
        int[] iArr = this.f2608i;
        view.getLocationOnScreen(iArr);
        this.f2607g = iArr[1];
    }

    @Override // a.y
    public final c1 V(c1 c1Var, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((((WindowInsetsAnimation) ((n0) it.next()).f2171a.f299g).getTypeMask() & 8) != 0) {
                this.f2606f.setTranslationY(j1.a.c(this.h, 0, ((WindowInsetsAnimation) r0.f2171a.f299g).getInterpolatedFraction()));
                break;
            }
        }
        return c1Var;
    }

    @Override // a.y
    public final p W(n0 n0Var, p pVar) {
        View view = this.f2606f;
        int[] iArr = this.f2608i;
        view.getLocationOnScreen(iArr);
        int i3 = this.f2607g - iArr[1];
        this.h = i3;
        view.setTranslationY(i3);
        return pVar;
    }
}

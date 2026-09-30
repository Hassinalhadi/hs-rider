package k;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.logistics.rider.lsposed.R;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class n0 extends a2 implements p0 {
    public CharSequence F;
    public l0 G;
    public final Rect H;
    public int I;
    public final /* synthetic */ q0 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(q0 q0Var, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle, 0);
        this.J = q0Var;
        this.H = new Rect();
        this.f2227t = q0Var;
        this.D = true;
        this.E.setFocusable(true);
        this.f2228u = new e2.v(1, this);
    }

    @Override // k.p0
    public final void e(int i3, int i4) {
        ViewTreeObserver viewTreeObserver;
        b0 b0Var = this.E;
        boolean isShowing = b0Var.isShowing();
        s();
        b0Var.setInputMethodMode(2);
        f();
        n1 n1Var = this.h;
        n1Var.setChoiceMode(1);
        n1Var.setTextDirection(i3);
        n1Var.setTextAlignment(i4);
        q0 q0Var = this.J;
        int selectedItemPosition = q0Var.getSelectedItemPosition();
        n1 n1Var2 = this.h;
        if (b0Var.isShowing() && n1Var2 != null) {
            n1Var2.setListSelectionHidden(false);
            n1Var2.setSelection(selectedItemPosition);
            if (n1Var2.getChoiceMode() != 0) {
                n1Var2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (!isShowing && (viewTreeObserver = q0Var.getViewTreeObserver()) != null) {
            j.d dVar = new j.d(3, this);
            viewTreeObserver.addOnGlobalLayoutListener(dVar);
            b0Var.setOnDismissListener(new m0(this, dVar));
        }
    }

    @Override // k.p0
    public final CharSequence i() {
        return this.F;
    }

    @Override // k.p0
    public final void l(CharSequence charSequence) {
        this.F = charSequence;
    }

    @Override // k.a2, k.p0
    public final void o(ListAdapter listAdapter) {
        super.o(listAdapter);
        this.G = (l0) listAdapter;
    }

    @Override // k.p0
    public final void p(int i3) {
        this.I = i3;
    }

    public final void s() {
        int i3;
        int i4;
        b0 b0Var = this.E;
        Drawable background = b0Var.getBackground();
        q0 q0Var = this.J;
        Rect rect = q0Var.f2364m;
        if (background != null) {
            background.getPadding(rect);
            if (q0Var.getLayoutDirection() == 1) {
                i3 = rect.right;
            } else {
                i3 = -rect.left;
            }
        } else {
            i3 = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = q0Var.getPaddingLeft();
        int paddingRight = q0Var.getPaddingRight();
        int width = q0Var.getWidth();
        int i5 = q0Var.f2363l;
        if (i5 == -2) {
            int a3 = q0Var.a(this.G, b0Var.getBackground());
            int i6 = (q0Var.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (a3 > i6) {
                a3 = i6;
            }
            r(Math.max(a3, (width - paddingLeft) - paddingRight));
        } else if (i5 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i5);
        }
        if (q0Var.getLayoutDirection() == 1) {
            i4 = (((width - paddingRight) - this.f2217j) - this.I) + i3;
        } else {
            i4 = paddingLeft + this.I + i3;
        }
        this.f2218k = i4;
    }
}

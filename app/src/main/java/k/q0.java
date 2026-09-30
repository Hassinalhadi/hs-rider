package k;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class q0 extends Spinner {

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f2357n = {R.attr.spinnerMode};

    /* renamed from: f, reason: collision with root package name */
    public final p f2358f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f2359g;
    public final i0 h;

    /* renamed from: i, reason: collision with root package name */
    public SpinnerAdapter f2360i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f2361j;

    /* renamed from: k, reason: collision with root package name */
    public final p0 f2362k;

    /* renamed from: l, reason: collision with root package name */
    public int f2363l;

    /* renamed from: m, reason: collision with root package name */
    public final Rect f2364m;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        if (r7 == null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public q0(android.content.Context r13, android.util.AttributeSet r14) {
        /*
            r12 = this;
            r0 = 2130904135(0x7f030447, float:1.7415108E38)
            r12.<init>(r13, r14, r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r12.f2364m = r1
            android.content.Context r1 = r12.getContext()
            k.m2.a(r12, r1)
            int[] r1 = f.a.f1547u
            androidx.emoji2.text.s r2 = androidx.emoji2.text.s.r(r13, r14, r1, r0)
            java.lang.Object r3 = r2.f310c
            android.content.res.TypedArray r3 = (android.content.res.TypedArray) r3
            k.p r4 = new k.p
            r4.<init>(r12)
            r12.f2358f = r4
            r4 = 4
            r5 = 0
            int r4 = r3.getResourceId(r4, r5)
            if (r4 == 0) goto L35
            i.c r6 = new i.c
            r6.<init>(r13, r4)
            r12.f2359g = r6
            goto L37
        L35:
            r12.f2359g = r13
        L37:
            r4 = -1
            r6 = 0
            int[] r7 = k.q0.f2357n     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L57
            android.content.res.TypedArray r7 = r13.obtainStyledAttributes(r14, r7, r0, r5)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L57
            boolean r8 = r7.hasValue(r5)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4e
            if (r8 == 0) goto L50
            int r4 = r7.getInt(r5, r5)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4e
            goto L50
        L4a:
            r12 = move-exception
            r6 = r7
            goto Ld5
        L4e:
            r8 = move-exception
            goto L59
        L50:
            r7.recycle()
            goto L63
        L54:
            r12 = move-exception
            goto Ld5
        L57:
            r8 = move-exception
            r7 = r6
        L59:
            java.lang.String r9 = "AppCompatSpinner"
            java.lang.String r10 = "Could not read android:spinnerMode"
            android.util.Log.i(r9, r10, r8)     // Catch: java.lang.Throwable -> L4a
            if (r7 == 0) goto L63
            goto L50
        L63:
            r7 = 2
            r8 = 1
            if (r4 == 0) goto L9d
            if (r4 == r8) goto L6a
            goto Laa
        L6a:
            k.n0 r4 = new k.n0
            android.content.Context r9 = r12.f2359g
            r4.<init>(r12, r9, r14)
            android.content.Context r9 = r12.f2359g
            androidx.emoji2.text.s r1 = androidx.emoji2.text.s.r(r9, r14, r1, r0)
            java.lang.Object r9 = r1.f310c
            android.content.res.TypedArray r9 = (android.content.res.TypedArray) r9
            r10 = 3
            r11 = -2
            int r9 = r9.getLayoutDimension(r10, r11)
            r12.f2363l = r9
            android.graphics.drawable.Drawable r9 = r1.i(r8)
            r4.m(r9)
            java.lang.String r7 = r3.getString(r7)
            r4.F = r7
            r1.t()
            r12.f2362k = r4
            k.i0 r1 = new k.i0
            r1.<init>(r12, r12, r4)
            r12.h = r1
            goto Laa
        L9d:
            k.k0 r1 = new k.k0
            r1.<init>(r12)
            r12.f2362k = r1
            java.lang.String r4 = r3.getString(r7)
            r1.h = r4
        Laa:
            java.lang.CharSequence[] r1 = r3.getTextArray(r5)
            if (r1 == 0) goto Lc1
            android.widget.ArrayAdapter r3 = new android.widget.ArrayAdapter
            r4 = 17367048(0x1090008, float:2.5162948E-38)
            r3.<init>(r13, r4, r1)
            r13 = 2131427437(0x7f0b006d, float:1.847649E38)
            r3.setDropDownViewResource(r13)
            r12.setAdapter(r3)
        Lc1:
            r2.t()
            r12.f2361j = r8
            android.widget.SpinnerAdapter r13 = r12.f2360i
            if (r13 == 0) goto Lcf
            r12.setAdapter(r13)
            r12.f2360i = r6
        Lcf:
            k.p r12 = r12.f2358f
            r12.d(r14, r0)
            return
        Ld5:
            if (r6 == 0) goto Lda
            r6.recycle()
        Lda:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: k.q0.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i3 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i4 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i4 = Math.max(i4, view.getMeasuredWidth());
        }
        if (drawable != null) {
            Rect rect = this.f2364m;
            drawable.getPadding(rect);
            return rect.left + rect.right + i4;
        }
        return i4;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        p pVar = this.f2358f;
        if (pVar != null) {
            pVar.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        p0 p0Var = this.f2362k;
        if (p0Var != null) {
            return p0Var.d();
        }
        return super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        p0 p0Var = this.f2362k;
        if (p0Var != null) {
            return p0Var.g();
        }
        return super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        if (this.f2362k != null) {
            return this.f2363l;
        }
        return super.getDropDownWidth();
    }

    public final p0 getInternalPopup() {
        return this.f2362k;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        p0 p0Var = this.f2362k;
        if (p0Var != null) {
            return p0Var.h();
        }
        return super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f2359g;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        p0 p0Var = this.f2362k;
        if (p0Var != null) {
            return p0Var.i();
        }
        return super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        p pVar = this.f2358f;
        if (pVar != null) {
            return pVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        p pVar = this.f2358f;
        if (pVar != null) {
            return pVar.c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        p0 p0Var = this.f2362k;
        if (p0Var != null && p0Var.b()) {
            p0Var.dismiss();
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i3, int i4) {
        super.onMeasure(i3, i4);
        if (this.f2362k != null && View.MeasureSpec.getMode(i3) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i3)), getMeasuredHeight());
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        o0 o0Var = (o0) parcelable;
        super.onRestoreInstanceState(o0Var.getSuperState());
        if (o0Var.f2344f && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new j.d(2, this));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, k.o0] */
    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z2;
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        p0 p0Var = this.f2362k;
        if (p0Var != null && p0Var.b()) {
            z2 = true;
        } else {
            z2 = false;
        }
        baseSavedState.f2344f = z2;
        return baseSavedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        i0 i0Var = this.h;
        if (i0Var != null && i0Var.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        p0 p0Var = this.f2362k;
        if (p0Var != null) {
            if (!p0Var.b()) {
                p0Var.e(getTextDirection(), getTextAlignment());
                return true;
            }
            return true;
        }
        return super.performClick();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.widget.ListAdapter, k.l0, java.lang.Object] */
    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f2361j) {
            this.f2360i = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        p0 p0Var = this.f2362k;
        if (p0Var != 0) {
            Context context = this.f2359g;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            ?? obj = new Object();
            obj.f2311a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                obj.f2312b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                j0.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            p0Var.o(obj);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        p pVar = this.f2358f;
        if (pVar != null) {
            pVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        p pVar = this.f2358f;
        if (pVar != null) {
            pVar.f(i3);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i3) {
        p0 p0Var = this.f2362k;
        if (p0Var != null) {
            p0Var.p(i3);
            p0Var.a(i3);
        } else {
            super.setDropDownHorizontalOffset(i3);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i3) {
        p0 p0Var = this.f2362k;
        if (p0Var != null) {
            p0Var.n(i3);
        } else {
            super.setDropDownVerticalOffset(i3);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i3) {
        if (this.f2362k != null) {
            this.f2363l = i3;
        } else {
            super.setDropDownWidth(i3);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        p0 p0Var = this.f2362k;
        if (p0Var != null) {
            p0Var.m(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i3) {
        setPopupBackgroundDrawable(a.y.B(getPopupContext(), i3));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        p0 p0Var = this.f2362k;
        if (p0Var != null) {
            p0Var.l(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        p pVar = this.f2358f;
        if (pVar != null) {
            pVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        p pVar = this.f2358f;
        if (pVar != null) {
            pVar.i(mode);
        }
    }
}

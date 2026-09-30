package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import g.c0;
import g.r;
import j.m;
import j0.k0;
import k.f1;
import k.g;
import k.k;
import k.y2;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: f, reason: collision with root package name */
    public TypedValue f163f;

    /* renamed from: g, reason: collision with root package name */
    public TypedValue f164g;
    public TypedValue h;

    /* renamed from: i, reason: collision with root package name */
    public TypedValue f165i;

    /* renamed from: j, reason: collision with root package name */
    public TypedValue f166j;

    /* renamed from: k, reason: collision with root package name */
    public TypedValue f167k;

    /* renamed from: l, reason: collision with root package name */
    public final Rect f168l;

    /* renamed from: m, reason: collision with root package name */
    public f1 f169m;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f168l = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f166j == null) {
            this.f166j = new TypedValue();
        }
        return this.f166j;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f167k == null) {
            this.f167k = new TypedValue();
        }
        return this.f167k;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.h == null) {
            this.h = new TypedValue();
        }
        return this.h;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f165i == null) {
            this.f165i = new TypedValue();
        }
        return this.f165i;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f163f == null) {
            this.f163f = new TypedValue();
        }
        return this.f163f;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f164g == null) {
            this.f164g = new TypedValue();
        }
        return this.f164g;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f1 f1Var = this.f169m;
        if (f1Var != null) {
            f1Var.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        k kVar;
        super.onDetachedFromWindow();
        f1 f1Var = this.f169m;
        if (f1Var != null) {
            c0 c0Var = ((r) f1Var).f1769g;
            ActionBarOverlayLayout actionBarOverlayLayout = c0Var.f1676w;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.k();
                ActionMenuView actionMenuView = ((y2) actionBarOverlayLayout.f137j).f2443a.f173f;
                if (actionMenuView != null && (kVar = actionMenuView.f158y) != null) {
                    kVar.f();
                    g gVar = kVar.f2306y;
                    if (gVar != null && gVar.b()) {
                        gVar.f2137i.dismiss();
                    }
                }
            }
            if (c0Var.B != null) {
                c0Var.f1670q.getDecorView().removeCallbacks(c0Var.C);
                if (c0Var.B.isShowing()) {
                    try {
                        c0Var.B.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                c0Var.B = null;
            }
            k0 k0Var = c0Var.D;
            if (k0Var != null) {
                k0Var.b();
            }
            m mVar = c0Var.y(0).h;
            if (mVar != null) {
                mVar.c(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b3  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(f1 f1Var) {
        this.f169m = f1Var;
    }
}

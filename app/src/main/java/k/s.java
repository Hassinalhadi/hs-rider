package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class s extends CheckedTextView {

    /* renamed from: f, reason: collision with root package name */
    public final c1.d f2382f;

    /* renamed from: g, reason: collision with root package name */
    public final p f2383g;
    public final w0 h;

    /* renamed from: i, reason: collision with root package name */
    public x f2384i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0089 A[Catch: all -> 0x0068, TryCatch #1 {all -> 0x0068, blocks: (B:3:0x004f, B:5:0x0056, B:8:0x005c, B:9:0x0082, B:11:0x0089, B:12:0x0090, B:14:0x0097, B:21:0x006b, B:23:0x0071, B:25:0x0077), top: B:2:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0097 A[Catch: all -> 0x0068, TRY_LEAVE, TryCatch #1 {all -> 0x0068, blocks: (B:3:0x004f, B:5:0x0056, B:8:0x005c, B:9:0x0082, B:11:0x0089, B:12:0x0090, B:14:0x0097, B:21:0x006b, B:23:0x0071, B:25:0x0077), top: B:2:0x004f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public s(android.content.Context r9, android.util.AttributeSet r10) {
        /*
            r8 = this;
            k.n2.a(r9)
            r5 = 2130903233(0x7f0300c1, float:1.7413278E38)
            r8.<init>(r9, r10, r5)
            android.content.Context r9 = r8.getContext()
            k.m2.a(r8, r9)
            k.w0 r9 = new k.w0
            r9.<init>(r8)
            r8.h = r9
            r9.f(r10, r5)
            r9.b()
            k.p r9 = new k.p
            r9.<init>(r8)
            r8.f2383g = r9
            r9.d(r10, r5)
            c1.d r9 = new c1.d
            r9.<init>(r8)
            r8.f2382f = r9
            android.content.Context r9 = r8.getContext()
            int[] r2 = f.a.f1538l
            androidx.emoji2.text.s r9 = androidx.emoji2.text.s.r(r9, r10, r2, r5)
            java.lang.Object r0 = r9.f310c
            r7 = r0
            android.content.res.TypedArray r7 = (android.content.res.TypedArray) r7
            android.content.Context r1 = r8.getContext()
            java.lang.Object r0 = r9.f310c
            r4 = r0
            android.content.res.TypedArray r4 = (android.content.res.TypedArray) r4
            java.util.WeakHashMap r0 = j0.j0.f2160a
            r6 = 0
            r0 = r8
            r3 = r10
            j0.g0.b(r0, r1, r2, r3, r4, r5, r6)
            r8 = 1
            boolean r10 = r7.hasValue(r8)     // Catch: java.lang.Throwable -> L68
            r1 = 0
            if (r10 == 0) goto L6b
            int r8 = r7.getResourceId(r8, r1)     // Catch: java.lang.Throwable -> L68
            if (r8 == 0) goto L6b
            android.content.Context r10 = r0.getContext()     // Catch: java.lang.Throwable -> L68 android.content.res.Resources.NotFoundException -> L6b
            android.graphics.drawable.Drawable r8 = a.y.B(r10, r8)     // Catch: java.lang.Throwable -> L68 android.content.res.Resources.NotFoundException -> L6b
            r0.setCheckMarkDrawable(r8)     // Catch: java.lang.Throwable -> L68 android.content.res.Resources.NotFoundException -> L6b
            goto L82
        L68:
            r0 = move-exception
            r8 = r0
            goto Laf
        L6b:
            boolean r8 = r7.hasValue(r1)     // Catch: java.lang.Throwable -> L68
            if (r8 == 0) goto L82
            int r8 = r7.getResourceId(r1, r1)     // Catch: java.lang.Throwable -> L68
            if (r8 == 0) goto L82
            android.content.Context r10 = r0.getContext()     // Catch: java.lang.Throwable -> L68
            android.graphics.drawable.Drawable r8 = a.y.B(r10, r8)     // Catch: java.lang.Throwable -> L68
            r0.setCheckMarkDrawable(r8)     // Catch: java.lang.Throwable -> L68
        L82:
            r8 = 2
            boolean r10 = r7.hasValue(r8)     // Catch: java.lang.Throwable -> L68
            if (r10 == 0) goto L90
            android.content.res.ColorStateList r8 = r9.h(r8)     // Catch: java.lang.Throwable -> L68
            r0.setCheckMarkTintList(r8)     // Catch: java.lang.Throwable -> L68
        L90:
            r8 = 3
            boolean r10 = r7.hasValue(r8)     // Catch: java.lang.Throwable -> L68
            if (r10 == 0) goto La4
            r10 = -1
            int r8 = r7.getInt(r8, r10)     // Catch: java.lang.Throwable -> L68
            r10 = 0
            android.graphics.PorterDuff$Mode r8 = k.h1.b(r8, r10)     // Catch: java.lang.Throwable -> L68
            r0.setCheckMarkTintMode(r8)     // Catch: java.lang.Throwable -> L68
        La4:
            r9.t()
            k.x r8 = r0.getEmojiTextViewHelper()
            r8.a(r3, r5)
            return
        Laf:
            r9.t()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: k.s.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private x getEmojiTextViewHelper() {
        if (this.f2384i == null) {
            this.f2384i = new x(this);
        }
        return this.f2384i;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        w0 w0Var = this.h;
        if (w0Var != null) {
            w0Var.b();
        }
        p pVar = this.f2383g;
        if (pVar != null) {
            pVar.a();
        }
        c1.d dVar = this.f2382f;
        if (dVar != null) {
            dVar.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    public ColorStateList getSupportBackgroundTintList() {
        p pVar = this.f2383g;
        if (pVar != null) {
            return pVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        p pVar = this.f2383g;
        if (pVar != null) {
            return pVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        c1.d dVar = this.f2382f;
        if (dVar != null) {
            return (ColorStateList) dVar.f1095e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        c1.d dVar = this.f2382f;
        if (dVar != null) {
            return (PorterDuff.Mode) dVar.f1096f;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.h.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.h.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        a.y.O(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().b(z2);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        p pVar = this.f2383g;
        if (pVar != null) {
            pVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        p pVar = this.f2383g;
        if (pVar != null) {
            pVar.f(i3);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        c1.d dVar = this.f2382f;
        if (dVar != null) {
            if (dVar.f1094c) {
                dVar.f1094c = false;
            } else {
                dVar.f1094c = true;
                dVar.b();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        w0 w0Var = this.h;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        w0 w0Var = this.h;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().c(z2);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        p pVar = this.f2383g;
        if (pVar != null) {
            pVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        p pVar = this.f2383g;
        if (pVar != null) {
            pVar.i(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        c1.d dVar = this.f2382f;
        if (dVar != null) {
            dVar.f1095e = colorStateList;
            dVar.f1092a = true;
            dVar.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        c1.d dVar = this.f2382f;
        if (dVar != null) {
            dVar.f1096f = mode;
            dVar.f1093b = true;
            dVar.b();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        w0 w0Var = this.h;
        w0Var.h(colorStateList);
        w0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        w0 w0Var = this.h;
        w0Var.i(mode);
        w0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i3) {
        super.setTextAppearance(context, i3);
        w0 w0Var = this.h;
        if (w0Var != null) {
            w0Var.g(context, i3);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i3) {
        setCheckMarkDrawable(a.y.B(getContext(), i3));
    }
}

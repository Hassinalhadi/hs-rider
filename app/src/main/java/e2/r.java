package e2;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f1472a;

    /* renamed from: b, reason: collision with root package name */
    public final q f1473b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f1474c;
    public final CheckableImageButton d;

    public r(q qVar) {
        this.f1472a = qVar.f1452f;
        this.f1473b = qVar;
        this.f1474c = qVar.getContext();
        this.d = qVar.f1457l;
    }

    public int c() {
        return 0;
    }

    public int d() {
        return 0;
    }

    public View.OnFocusChangeListener e() {
        return null;
    }

    public View.OnClickListener f() {
        return null;
    }

    public View.OnFocusChangeListener g() {
        return null;
    }

    public AccessibilityManager.TouchExplorationStateChangeListener h() {
        return null;
    }

    public boolean i(int i3) {
        return true;
    }

    public boolean j() {
        return this instanceof m;
    }

    public boolean k() {
        return false;
    }

    public final void p() {
        this.f1473b.f(false);
    }

    public void l(EditText editText) {
    }

    public void m(k0.d dVar) {
    }

    public void n(AccessibilityEvent accessibilityEvent) {
    }

    public void o(boolean z2) {
    }

    public void a() {
    }

    public void b() {
    }

    public void q() {
    }

    public void r() {
    }
}

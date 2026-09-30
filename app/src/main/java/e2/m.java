package e2;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.logistics.rider.lsposed.R;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class m extends r {

    /* renamed from: e, reason: collision with root package name */
    public final int f1434e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1435f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f1436g;
    public AutoCompleteTextView h;

    /* renamed from: i, reason: collision with root package name */
    public final com.google.android.material.datepicker.n f1437i;

    /* renamed from: j, reason: collision with root package name */
    public final a f1438j;

    /* renamed from: k, reason: collision with root package name */
    public final k f1439k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1440l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1441m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1442n;

    /* renamed from: o, reason: collision with root package name */
    public long f1443o;

    /* renamed from: p, reason: collision with root package name */
    public AccessibilityManager f1444p;

    /* renamed from: q, reason: collision with root package name */
    public ValueAnimator f1445q;

    /* renamed from: r, reason: collision with root package name */
    public ValueAnimator f1446r;

    /* JADX WARN: Type inference failed for: r0v2, types: [e2.k] */
    public m(q qVar) {
        super(qVar);
        this.f1437i = new com.google.android.material.datepicker.n(2, this);
        this.f1438j = new a(this, 1);
        this.f1439k = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: e2.k
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z2) {
                int i3;
                m mVar = m.this;
                AutoCompleteTextView autoCompleteTextView = mVar.h;
                if (autoCompleteTextView == null || autoCompleteTextView.getInputType() != 0) {
                    return;
                }
                CheckableImageButton checkableImageButton = mVar.d;
                if (z2) {
                    i3 = 2;
                } else {
                    i3 = 1;
                }
                checkableImageButton.setImportantForAccessibility(i3);
            }
        };
        this.f1443o = Long.MAX_VALUE;
        this.f1435f = k2.h.R(qVar.getContext(), R.attr.motionDurationShort3, 67);
        this.f1434e = k2.h.R(qVar.getContext(), R.attr.motionDurationShort3, 50);
        this.f1436g = k2.h.S(qVar.getContext(), R.attr.motionEasingLinearInterpolator, j1.a.f2193a);
    }

    @Override // e2.r
    public final void a() {
        if (this.f1444p.isTouchExplorationEnabled() && this.h.getInputType() != 0 && !this.d.hasFocus()) {
            this.h.dismissDropDown();
        }
        this.h.post(new a.k(6, this));
    }

    @Override // e2.r
    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // e2.r
    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // e2.r
    public final View.OnFocusChangeListener e() {
        return this.f1438j;
    }

    @Override // e2.r
    public final View.OnClickListener f() {
        return this.f1437i;
    }

    @Override // e2.r
    public final AccessibilityManager.TouchExplorationStateChangeListener h() {
        return this.f1439k;
    }

    @Override // e2.r
    public final boolean i(int i3) {
        if (i3 != 0) {
            return true;
        }
        return false;
    }

    @Override // e2.r
    public final boolean k() {
        return this.f1442n;
    }

    @Override // e2.r
    public final void l(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            this.h = autoCompleteTextView;
            autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: e2.i
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getAction() == 1) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        m mVar = m.this;
                        long j3 = uptimeMillis - mVar.f1443o;
                        if (j3 < 0 || j3 > 300) {
                            mVar.f1441m = false;
                        }
                        mVar.t();
                        mVar.f1441m = true;
                        mVar.f1443o = SystemClock.uptimeMillis();
                    }
                    return false;
                }
            });
            this.h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: e2.j
                @Override // android.widget.AutoCompleteTextView.OnDismissListener
                public final void onDismiss() {
                    m mVar = m.this;
                    mVar.f1441m = true;
                    mVar.f1443o = SystemClock.uptimeMillis();
                    mVar.s(false);
                }
            });
            this.h.setThreshold(0);
            TextInputLayout textInputLayout = this.f1472a;
            textInputLayout.setErrorIconDrawable((Drawable) null);
            if (editText.getInputType() == 0 && this.f1444p.isTouchExplorationEnabled()) {
                this.d.setImportantForAccessibility(2);
            }
            textInputLayout.setEndIconVisible(true);
            return;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    @Override // e2.r
    public final void m(k0.d dVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.f2476a;
        if (this.h.getInputType() == 0) {
            dVar.h(Spinner.class.getName());
        }
        if (accessibilityNodeInfo.isShowingHintText()) {
            accessibilityNodeInfo.setHintText(null);
        }
    }

    @Override // e2.r
    public final void n(AccessibilityEvent accessibilityEvent) {
        boolean z2;
        if (!this.f1444p.isEnabled() || this.h.getInputType() != 0) {
            return;
        }
        if ((accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f1442n && !this.h.isPopupShowing()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (accessibilityEvent.getEventType() == 1 || z2) {
            t();
            this.f1441m = true;
            this.f1443o = SystemClock.uptimeMillis();
        }
    }

    @Override // e2.r
    public final void q() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f1436g;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(this.f1435f);
        ofFloat.addUpdateListener(new h(this));
        this.f1446r = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(this.f1434e);
        ofFloat2.addUpdateListener(new h(this));
        this.f1445q = ofFloat2;
        ofFloat2.addListener(new l(0, this));
        this.f1444p = (AccessibilityManager) this.f1474c.getSystemService("accessibility");
    }

    @Override // e2.r
    public final void r() {
        AutoCompleteTextView autoCompleteTextView = this.h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.h.setOnDismissListener(null);
        }
    }

    public final void s(boolean z2) {
        if (this.f1442n != z2) {
            this.f1442n = z2;
            this.f1446r.cancel();
            this.f1445q.start();
        }
    }

    public final void t() {
        if (this.h == null) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis() - this.f1443o;
        if (uptimeMillis < 0 || uptimeMillis > 300) {
            this.f1441m = false;
        }
        if (!this.f1441m) {
            s(!this.f1442n);
            boolean z2 = this.f1442n;
            AutoCompleteTextView autoCompleteTextView = this.h;
            if (z2) {
                autoCompleteTextView.requestFocus();
                this.h.showDropDown();
                return;
            } else {
                autoCompleteTextView.dismissDropDown();
                return;
            }
        }
        this.f1441m = false;
    }
}

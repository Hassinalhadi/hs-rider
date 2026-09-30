package g;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.logistics.rider.lsposed.R;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class g extends a.p implements DialogInterface, j {

    /* renamed from: j, reason: collision with root package name */
    public c0 f1711j;

    /* renamed from: k, reason: collision with root package name */
    public final d0 f1712k;

    /* renamed from: l, reason: collision with root package name */
    public final e f1713l;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g(android.view.ContextThemeWrapper r5, int r6) {
        /*
            r4 = this;
            int r6 = h(r5, r6)
            r0 = 1
            r1 = 2130903448(0x7f030198, float:1.7413714E38)
            if (r6 != 0) goto L19
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r3 = r5.getTheme()
            r3.resolveAttribute(r1, r2, r0)
            int r2 = r2.resourceId
            goto L1a
        L19:
            r2 = r6
        L1a:
            r4.<init>(r5, r2)
            g.d0 r2 = new g.d0
            r2.<init>(r4)
            r4.f1712k = r2
            g.p r2 = r4.e()
            if (r6 != 0) goto L38
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            android.content.res.Resources$Theme r5 = r5.getTheme()
            r5.resolveAttribute(r1, r6, r0)
            int r6 = r6.resourceId
        L38:
            r5 = r2
            g.c0 r5 = (g.c0) r5
            r5.Y = r6
            r2.c()
            g.e r5 = new g.e
            android.content.Context r6 = r4.getContext()
            android.view.Window r0 = r4.getWindow()
            r5.<init>(r6, r4, r0)
            r4.f1713l = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.g.<init>(android.view.ContextThemeWrapper, int):void");
    }

    public static int h(Context context, int i3) {
        if (((i3 >>> 24) & 255) >= 1) {
            return i3;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // a.p, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        d();
        c0 c0Var = (c0) e();
        c0Var.v();
        ((ViewGroup) c0Var.F.findViewById(android.R.id.content)).addView(view, layoutParams);
        c0Var.f1671r.a(c0Var.f1670q.getCallback());
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        e().d();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        getWindow().getDecorView();
        d0 d0Var = this.f1712k;
        if (d0Var == null) {
            return false;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final p e() {
        if (this.f1711j == null) {
            n nVar = p.f1758f;
            this.f1711j = new c0(getContext(), getWindow(), this, this);
        }
        return this.f1711j;
    }

    @Override // android.app.Dialog
    public final View findViewById(int i3) {
        c0 c0Var = (c0) e();
        c0Var.v();
        return c0Var.f1670q.findViewById(i3);
    }

    public final void g(Bundle bundle) {
        e().a();
        super.onCreate(bundle);
        e().c();
    }

    public final void i(CharSequence charSequence) {
        super.setTitle(charSequence);
        e().l(charSequence);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        c0 c0Var = (c0) e();
        if (c0Var.f1673t != null) {
            c0Var.z();
            c0Var.f1673t.getClass();
            c0Var.A(0);
        }
    }

    @Override // a.p, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i3;
        boolean z2;
        int i4;
        boolean z3;
        ListAdapter listAdapter;
        int i5;
        int i6;
        View view;
        View findViewById;
        g(bundle);
        e eVar = this.f1713l;
        eVar.f1682b.setContentView(eVar.f1695q);
        Context context = eVar.f1681a;
        Window window = eVar.f1683c;
        View findViewById2 = window.findViewById(R.id.parentPanel);
        View findViewById3 = findViewById2.findViewById(R.id.topPanel);
        View findViewById4 = findViewById2.findViewById(R.id.contentPanel);
        View findViewById5 = findViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(R.id.customPanel);
        window.setFlags(131072, 131072);
        viewGroup.setVisibility(8);
        View findViewById6 = viewGroup.findViewById(R.id.topPanel);
        View findViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View findViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup a3 = e.a(findViewById6, findViewById3);
        ViewGroup a4 = e.a(findViewById7, findViewById4);
        ViewGroup a5 = e.a(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        eVar.f1687i = nestedScrollView;
        int i7 = 0;
        nestedScrollView.setFocusable(false);
        eVar.f1687i.setNestedScrollingEnabled(false);
        TextView textView = (TextView) a4.findViewById(android.R.id.message);
        eVar.f1691m = textView;
        if (textView != null) {
            textView.setVisibility(8);
            eVar.f1687i.removeView(eVar.f1691m);
            if (eVar.f1684e != null) {
                ViewGroup viewGroup2 = (ViewGroup) eVar.f1687i.getParent();
                int indexOfChild = viewGroup2.indexOfChild(eVar.f1687i);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(eVar.f1684e, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                a4.setVisibility(8);
            }
        }
        Button button = (Button) a5.findViewById(android.R.id.button1);
        eVar.f1685f = button;
        com.google.android.material.datepicker.l lVar = eVar.f1701w;
        button.setOnClickListener(lVar);
        boolean isEmpty = TextUtils.isEmpty(null);
        Button button2 = eVar.f1685f;
        if (isEmpty) {
            button2.setVisibility(8);
            i3 = 0;
        } else {
            button2.setText((CharSequence) null);
            eVar.f1685f.setVisibility(0);
            i3 = 1;
        }
        Button button3 = (Button) a5.findViewById(android.R.id.button2);
        eVar.f1686g = button3;
        button3.setOnClickListener(lVar);
        boolean isEmpty2 = TextUtils.isEmpty(null);
        Button button4 = eVar.f1686g;
        if (isEmpty2) {
            button4.setVisibility(8);
        } else {
            button4.setText((CharSequence) null);
            eVar.f1686g.setVisibility(0);
            i3 |= 2;
        }
        Button button5 = (Button) a5.findViewById(android.R.id.button3);
        eVar.h = button5;
        button5.setOnClickListener(lVar);
        boolean isEmpty3 = TextUtils.isEmpty(null);
        Button button6 = eVar.h;
        if (isEmpty3) {
            button6.setVisibility(8);
        } else {
            button6.setText((CharSequence) null);
            eVar.h.setVisibility(0);
            i3 |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i3 == 1) {
                Button button7 = eVar.f1685f;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button7.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button7.setLayoutParams(layoutParams);
            } else if (i3 == 2) {
                Button button8 = eVar.f1686g;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button8.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button8.setLayoutParams(layoutParams2);
            } else if (i3 == 4) {
                Button button9 = eVar.h;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button9.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button9.setLayoutParams(layoutParams3);
            }
        }
        if (i3 == 0) {
            a5.setVisibility(8);
        }
        if (eVar.f1692n != null) {
            a3.addView(eVar.f1692n, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            eVar.f1689k = (ImageView) window.findViewById(android.R.id.icon);
            if (!TextUtils.isEmpty(eVar.d) && eVar.f1699u) {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                eVar.f1690l = textView2;
                textView2.setText(eVar.d);
                Drawable drawable = eVar.f1688j;
                if (drawable != null) {
                    eVar.f1689k.setImageDrawable(drawable);
                } else {
                    eVar.f1690l.setPadding(eVar.f1689k.getPaddingLeft(), eVar.f1689k.getPaddingTop(), eVar.f1689k.getPaddingRight(), eVar.f1689k.getPaddingBottom());
                    eVar.f1689k.setVisibility(8);
                }
            } else {
                window.findViewById(R.id.title_template).setVisibility(8);
                eVar.f1689k.setVisibility(8);
                a3.setVisibility(8);
            }
        }
        if (viewGroup.getVisibility() != 8) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (a3 != null && a3.getVisibility() != 8) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        if (a5.getVisibility() != 8) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3 && (findViewById = a4.findViewById(R.id.textSpacerNoButtons)) != null) {
            findViewById.setVisibility(0);
        }
        if (i4 != 0) {
            NestedScrollView nestedScrollView2 = eVar.f1687i;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            if (eVar.f1684e != null) {
                view = a3.findViewById(R.id.titleDividerNoCustom);
            } else {
                view = null;
            }
            if (view != null) {
                view.setVisibility(0);
            }
        } else {
            View findViewById9 = a4.findViewById(R.id.textSpacerNoTitle);
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = eVar.f1684e;
        if (alertController$RecycleListView != null && (!z3 || i4 == 0)) {
            int paddingLeft = alertController$RecycleListView.getPaddingLeft();
            if (i4 != 0) {
                i5 = alertController$RecycleListView.getPaddingTop();
            } else {
                i5 = alertController$RecycleListView.f76f;
            }
            int paddingRight = alertController$RecycleListView.getPaddingRight();
            if (z3) {
                i6 = alertController$RecycleListView.getPaddingBottom();
            } else {
                i6 = alertController$RecycleListView.f77g;
            }
            alertController$RecycleListView.setPadding(paddingLeft, i5, paddingRight, i6);
        }
        if (!z2) {
            View view2 = eVar.f1684e;
            if (view2 == null) {
                view2 = eVar.f1687i;
            }
            if (view2 != null) {
                if (z3) {
                    i7 = 2;
                }
                View findViewById10 = window.findViewById(R.id.scrollIndicatorUp);
                View findViewById11 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = j0.j0.f2160a;
                j0.d0.b(view2, i4 | i7, 3);
                if (findViewById10 != null) {
                    a4.removeView(findViewById10);
                }
                if (findViewById11 != null) {
                    a4.removeView(findViewById11);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = eVar.f1684e;
        if (alertController$RecycleListView2 != null && (listAdapter = eVar.f1693o) != null) {
            alertController$RecycleListView2.setAdapter(listAdapter);
            int i8 = eVar.f1694p;
            if (i8 > -1) {
                alertController$RecycleListView2.setItemChecked(i8, true);
                alertController$RecycleListView2.setSelection(i8);
            }
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i3, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f1713l.f1687i;
        if (nestedScrollView != null && nestedScrollView.i(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i3, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i3, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f1713l.f1687i;
        if (nestedScrollView != null && nestedScrollView.i(keyEvent)) {
            return true;
        }
        return super.onKeyUp(i3, keyEvent);
    }

    @Override // a.p, android.app.Dialog
    public final void onStop() {
        super.onStop();
        c0 c0Var = (c0) e();
        c0Var.z();
        m0 m0Var = c0Var.f1673t;
        if (m0Var != null) {
            m0Var.f1750t = false;
            i.j jVar = m0Var.f1749s;
            if (jVar != null) {
                jVar.a();
            }
        }
    }

    @Override // a.p, android.app.Dialog
    public final void setContentView(int i3) {
        d();
        e().i(i3);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i3) {
        super.setTitle(i3);
        e().l(getContext().getString(i3));
    }

    @Override // a.p, android.app.Dialog
    public final void setContentView(View view) {
        d();
        e().j(view);
    }

    @Override // a.p, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        d();
        e().k(view, layoutParams);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        i(charSequence);
        e eVar = this.f1713l;
        eVar.d = charSequence;
        TextView textView = eVar.f1690l;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}

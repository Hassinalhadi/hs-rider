package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.ColorStateListDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsetsController;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import com.logistics.rider.lsposed.R;
import j0.c0;
import j0.j0;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public class p<S> extends androidx.fragment.app.p {
    public CharSequence A0;
    public int B0;
    public CharSequence C0;
    public TextView D0;
    public CheckableImageButton E0;
    public b2.j F0;
    public boolean G0;
    public CharSequence H0;
    public CharSequence I0;

    /* renamed from: l0, reason: collision with root package name */
    public final LinkedHashSet f1254l0;

    /* renamed from: m0, reason: collision with root package name */
    public final LinkedHashSet f1255m0;

    /* renamed from: n0, reason: collision with root package name */
    public int f1256n0;

    /* renamed from: o0, reason: collision with root package name */
    public w f1257o0;

    /* renamed from: p0, reason: collision with root package name */
    public b f1258p0;

    /* renamed from: q0, reason: collision with root package name */
    public m f1259q0;

    /* renamed from: r0, reason: collision with root package name */
    public int f1260r0;

    /* renamed from: s0, reason: collision with root package name */
    public CharSequence f1261s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f1262t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f1263u0;

    /* renamed from: v0, reason: collision with root package name */
    public int f1264v0;

    /* renamed from: w0, reason: collision with root package name */
    public CharSequence f1265w0;

    /* renamed from: x0, reason: collision with root package name */
    public int f1266x0;

    /* renamed from: y0, reason: collision with root package name */
    public CharSequence f1267y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f1268z0;

    public p() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.f1254l0 = new LinkedHashSet();
        this.f1255m0 = new LinkedHashSet();
    }

    public static int H(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar b3 = z.b();
        b3.set(5, 1);
        Calendar a3 = z.a(b3);
        a3.get(2);
        a3.get(1);
        int maximum = a3.getMaximum(7);
        a3.getActualMaximum(5);
        a3.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean I(Context context, int i3) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(k2.h.T(context, R.attr.materialCalendarStyle, m.class.getCanonicalName()).data, new int[]{i3});
        boolean z2 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z2;
    }

    @Override // androidx.fragment.app.p
    public final Dialog F() {
        Context B = B();
        B();
        int i3 = this.f1256n0;
        if (i3 != 0) {
            Dialog dialog = new Dialog(B, i3);
            Context context = dialog.getContext();
            this.f1262t0 = I(context, android.R.attr.windowFullscreen);
            this.F0 = new b2.j(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, i1.a.f1980m, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
            int color = obtainStyledAttributes.getColor(1, 0);
            obtainStyledAttributes.recycle();
            this.F0.j(context);
            this.F0.m(ColorStateList.valueOf(color));
            this.F0.l(dialog.getWindow().getDecorView().getElevation());
            return dialog;
        }
        G();
        throw null;
    }

    public final void G() {
        if (this.f495k.getParcelable("DATE_SELECTOR_KEY") == null) {
            return;
        }
        a.b.c();
    }

    @Override // androidx.fragment.app.p, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f1254l0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.p, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f1255m0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.J;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.p, androidx.fragment.app.u
    public final void r(Bundle bundle) {
        super.r(bundle);
        if (bundle == null) {
            bundle = this.f495k;
        }
        this.f1256n0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") == null) {
            this.f1258p0 = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
            if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") == null) {
                this.f1260r0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
                this.f1261s0 = bundle.getCharSequence("TITLE_TEXT_KEY");
                this.f1263u0 = bundle.getInt("INPUT_MODE_KEY");
                this.f1264v0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
                this.f1265w0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
                this.f1266x0 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
                this.f1267y0 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
                this.f1268z0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
                this.A0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
                this.B0 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
                this.C0 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
                CharSequence charSequence = this.f1261s0;
                if (charSequence == null) {
                    charSequence = B().getResources().getText(this.f1260r0);
                }
                this.H0 = charSequence;
                if (charSequence != null) {
                    CharSequence[] split = TextUtils.split(String.valueOf(charSequence), "\n");
                    if (split.length > 1) {
                        charSequence = split[0];
                    }
                } else {
                    charSequence = null;
                }
                this.I0 = charSequence;
                return;
            }
            a.b.c();
            return;
        }
        a.b.c();
    }

    @Override // androidx.fragment.app.u
    public final View s(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i3;
        String string;
        if (this.f1262t0) {
            i3 = R.layout.mtrl_picker_fullscreen;
        } else {
            i3 = R.layout.mtrl_picker_dialog;
        }
        View inflate = layoutInflater.inflate(i3, viewGroup);
        Context context = inflate.getContext();
        if (this.f1262t0) {
            inflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(H(context), -2));
        } else {
            inflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(H(context), -1));
        }
        ((TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text)).setAccessibilityLiveRegion(1);
        this.E0 = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.D0 = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        this.E0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.E0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, a.y.B(context, R.drawable.material_ic_calendar_black_24dp));
        boolean z2 = false;
        stateListDrawable.addState(new int[0], a.y.B(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        CheckableImageButton checkableImageButton2 = this.E0;
        if (this.f1263u0 != 0) {
            z2 = true;
        }
        checkableImageButton2.setChecked(z2);
        j0.h(this.E0, null);
        CheckableImageButton checkableImageButton3 = this.E0;
        if (this.f1263u0 == 1) {
            string = checkableImageButton3.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode);
        } else {
            string = checkableImageButton3.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode);
        }
        this.E0.setContentDescription(string);
        this.E0.setOnClickListener(new n(0, this));
        G();
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.google.android.material.datepicker.a] */
    @Override // androidx.fragment.app.p, androidx.fragment.app.u
    public final void w(Bundle bundle) {
        r rVar;
        r b3;
        super.w(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f1256n0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        b bVar = this.f1258p0;
        ?? obj = new Object();
        int i3 = a.f1216b;
        int i4 = a.f1216b;
        long j3 = bVar.f1219f.f1273k;
        long j4 = bVar.f1220g.f1273k;
        obj.f1217a = Long.valueOf(bVar.f1221i.f1273k);
        int i5 = bVar.f1222j;
        d dVar = bVar.h;
        m mVar = this.f1259q0;
        if (mVar == null) {
            rVar = null;
        } else {
            rVar = mVar.f1238b0;
        }
        if (rVar != null) {
            obj.f1217a = Long.valueOf(rVar.f1273k);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", dVar);
        r b4 = r.b(j3);
        r b5 = r.b(j4);
        d dVar2 = (d) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l3 = obj.f1217a;
        if (l3 == null) {
            b3 = null;
        } else {
            b3 = r.b(l3.longValue());
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new b(b4, b5, dVar2, b3, i5));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f1260r0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f1261s0);
        bundle.putInt("INPUT_MODE_KEY", this.f1263u0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f1264v0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f1265w0);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f1266x0);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f1267y0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f1268z0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.A0);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.B0);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.C0);
    }

    @Override // androidx.fragment.app.p, androidx.fragment.app.u
    public final void x() {
        CharSequence charSequence;
        ColorStateList colorStateList;
        Integer num;
        boolean z2;
        boolean z3;
        androidx.emoji2.text.p pVar;
        boolean z4;
        androidx.emoji2.text.p pVar2;
        super.x();
        Dialog dialog = this.f458h0;
        if (dialog != null) {
            Window window = dialog.getWindow();
            if (this.f1262t0) {
                window.setLayout(-1, -1);
                window.setBackgroundDrawable(this.F0);
                if (!this.G0) {
                    View findViewById = C().findViewById(R.id.fullscreen_header);
                    Drawable background = findViewById.getBackground();
                    if (background instanceof ColorDrawable) {
                        colorStateList = ColorStateList.valueOf(((ColorDrawable) background).getColor());
                    } else if (background instanceof ColorStateListDrawable) {
                        colorStateList = ((ColorStateListDrawable) background).getColorStateList();
                    } else {
                        colorStateList = null;
                    }
                    if (colorStateList != null) {
                        num = Integer.valueOf(colorStateList.getDefaultColor());
                    } else {
                        num = null;
                    }
                    if (num != null && num.intValue() != 0) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    int j3 = k2.h.j(window.getContext(), android.R.attr.colorBackground, -16777216);
                    if (z2) {
                        num = Integer.valueOf(j3);
                    }
                    a.y.a0(window, false);
                    window.getContext();
                    window.getContext();
                    window.setStatusBarColor(0);
                    window.setNavigationBarColor(0);
                    boolean z5 = k2.h.z(num.intValue());
                    if (!k2.h.z(0) && !z5) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    b2.f fVar = new b2.f(window.getDecorView());
                    if (Build.VERSION.SDK_INT >= 35) {
                        pVar = new androidx.emoji2.text.p(window, fVar);
                    } else {
                        pVar = new androidx.emoji2.text.p(window, fVar);
                    }
                    WindowInsetsController windowInsetsController = (WindowInsetsController) pVar.f301g;
                    Window window2 = (Window) pVar.h;
                    if (z3) {
                        if (window2 != null) {
                            View decorView = window2.getDecorView();
                            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
                        }
                        windowInsetsController.setSystemBarsAppearance(8, 8);
                    } else {
                        if (window2 != null) {
                            View decorView2 = window2.getDecorView();
                            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
                        }
                        windowInsetsController.setSystemBarsAppearance(0, 8);
                    }
                    boolean z6 = k2.h.z(j3);
                    if (!k2.h.z(0) && !z6) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    b2.f fVar2 = new b2.f(window.getDecorView());
                    if (Build.VERSION.SDK_INT >= 35) {
                        pVar2 = new androidx.emoji2.text.p(window, fVar2);
                    } else {
                        pVar2 = new androidx.emoji2.text.p(window, fVar2);
                    }
                    WindowInsetsController windowInsetsController2 = (WindowInsetsController) pVar2.f301g;
                    Window window3 = (Window) pVar2.h;
                    if (z4) {
                        if (window3 != null) {
                            View decorView3 = window3.getDecorView();
                            decorView3.setSystemUiVisibility(decorView3.getSystemUiVisibility() | 16);
                        }
                        windowInsetsController2.setSystemBarsAppearance(16, 16);
                    } else {
                        if (window3 != null) {
                            View decorView4 = window3.getDecorView();
                            decorView4.setSystemUiVisibility(decorView4.getSystemUiVisibility() & (-17));
                        }
                        windowInsetsController2.setSystemBarsAppearance(0, 16);
                    }
                    o oVar = new o(findViewById, findViewById.getLayoutParams().height, findViewById.getPaddingLeft(), findViewById.getPaddingTop(), findViewById.getPaddingRight());
                    WeakHashMap weakHashMap = j0.f2160a;
                    c0.i(findViewById, oVar);
                    this.G0 = true;
                }
            } else {
                window.setLayout(-2, -2);
                int dimensionPixelOffset = B().getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
                Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
                window.setBackgroundDrawable(new InsetDrawable((Drawable) this.F0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
                View decorView5 = window.getDecorView();
                Dialog dialog2 = this.f458h0;
                if (dialog2 != null) {
                    decorView5.setOnTouchListener(new t1.a(dialog2, rect));
                } else {
                    throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
                }
            }
            B();
            int i3 = this.f1256n0;
            if (i3 != 0) {
                G();
                b bVar = this.f1258p0;
                m mVar = new m();
                Bundle bundle = new Bundle();
                bundle.putInt("THEME_RES_ID_KEY", i3);
                bundle.putParcelable("GRID_SELECTOR_KEY", null);
                bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar);
                bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
                bundle.putParcelable("CURRENT_MONTH_KEY", bVar.f1221i);
                mVar.E(bundle);
                this.f1259q0 = mVar;
                w wVar = mVar;
                if (this.f1263u0 == 1) {
                    G();
                    b bVar2 = this.f1258p0;
                    w qVar = new q();
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("THEME_RES_ID_KEY", i3);
                    bundle2.putParcelable("DATE_SELECTOR_KEY", null);
                    bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar2);
                    qVar.E(bundle2);
                    wVar = qVar;
                }
                this.f1257o0 = wVar;
                TextView textView = this.D0;
                if (this.f1263u0 == 1 && B().getResources().getConfiguration().orientation == 2) {
                    charSequence = this.I0;
                } else {
                    charSequence = this.H0;
                }
                textView.setText(charSequence);
                G();
                throw null;
            }
            G();
            throw null;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    @Override // androidx.fragment.app.p, androidx.fragment.app.u
    public final void y() {
        this.f1257o0.Y.clear();
        super.y();
    }
}

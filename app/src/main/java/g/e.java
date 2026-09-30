package g;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.logistics.rider.lsposed.R;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1681a;

    /* renamed from: b, reason: collision with root package name */
    public final g f1682b;

    /* renamed from: c, reason: collision with root package name */
    public final Window f1683c;
    public CharSequence d;

    /* renamed from: e, reason: collision with root package name */
    public AlertController$RecycleListView f1684e;

    /* renamed from: f, reason: collision with root package name */
    public Button f1685f;

    /* renamed from: g, reason: collision with root package name */
    public Button f1686g;
    public Button h;

    /* renamed from: i, reason: collision with root package name */
    public NestedScrollView f1687i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f1688j;

    /* renamed from: k, reason: collision with root package name */
    public ImageView f1689k;

    /* renamed from: l, reason: collision with root package name */
    public TextView f1690l;

    /* renamed from: m, reason: collision with root package name */
    public TextView f1691m;

    /* renamed from: n, reason: collision with root package name */
    public View f1692n;

    /* renamed from: o, reason: collision with root package name */
    public ListAdapter f1693o;

    /* renamed from: q, reason: collision with root package name */
    public final int f1695q;

    /* renamed from: r, reason: collision with root package name */
    public final int f1696r;

    /* renamed from: s, reason: collision with root package name */
    public final int f1697s;

    /* renamed from: t, reason: collision with root package name */
    public final int f1698t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f1699u;

    /* renamed from: v, reason: collision with root package name */
    public final c f1700v;

    /* renamed from: p, reason: collision with root package name */
    public int f1694p = -1;

    /* renamed from: w, reason: collision with root package name */
    public final com.google.android.material.datepicker.l f1701w = new com.google.android.material.datepicker.l(1, this);

    /* JADX WARN: Type inference failed for: r6v1, types: [android.os.Handler, g.c] */
    public e(Context context, g gVar, Window window) {
        this.f1681a = context;
        this.f1682b = gVar;
        this.f1683c = window;
        ?? handler = new Handler();
        handler.f1654a = new WeakReference(gVar);
        this.f1700v = handler;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, f.a.f1532e, R.attr.alertDialogStyle, 0);
        this.f1695q = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.f1696r = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.f1697s = obtainStyledAttributes.getResourceId(7, 0);
        this.f1698t = obtainStyledAttributes.getResourceId(3, 0);
        this.f1699u = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        gVar.e().f(1);
    }

    public static ViewGroup a(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }
}

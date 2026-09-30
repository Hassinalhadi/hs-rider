package g;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class f implements k0.m {

    /* renamed from: f, reason: collision with root package name */
    public final int f1705f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f1706g;

    public f(Context context) {
        int h = g.h(context, 0);
        this.f1706g = new b(new ContextThemeWrapper(context, g.h(context, h)));
        this.f1705f = h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [android.widget.ListAdapter] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    public g a() {
        int i3;
        b bVar = (b) this.f1706g;
        g gVar = new g(bVar.f1632a, this.f1705f);
        View view = bVar.f1635e;
        e eVar = gVar.f1713l;
        if (view != null) {
            eVar.f1692n = view;
        } else {
            CharSequence charSequence = bVar.d;
            if (charSequence != null) {
                eVar.d = charSequence;
                TextView textView = eVar.f1690l;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = bVar.f1634c;
            if (drawable != null) {
                eVar.f1688j = drawable;
                ImageView imageView = eVar.f1689k;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    eVar.f1689k.setImageDrawable(drawable);
                }
            }
        }
        if (bVar.f1637g != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) bVar.f1633b.inflate(eVar.f1696r, (ViewGroup) null);
            if (bVar.f1638i) {
                i3 = eVar.f1697s;
            } else {
                i3 = eVar.f1698t;
            }
            Object obj = bVar.f1637g;
            ?? r6 = obj;
            if (obj == null) {
                r6 = new ArrayAdapter(bVar.f1632a, i3, R.id.text1, (Object[]) null);
            }
            eVar.f1693o = r6;
            eVar.f1694p = bVar.f1639j;
            if (bVar.h != null) {
                alertController$RecycleListView.setOnItemClickListener(new a(bVar, eVar));
            }
            if (bVar.f1638i) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            eVar.f1684e = alertController$RecycleListView;
        }
        gVar.setCancelable(true);
        gVar.setCanceledOnTouchOutside(true);
        gVar.setOnCancelListener(null);
        gVar.setOnDismissListener(null);
        j.n nVar = bVar.f1636f;
        if (nVar != null) {
            gVar.setOnKeyListener(nVar);
        }
        return gVar;
    }

    @Override // k0.m
    public boolean i(View view) {
        ((BottomSheetBehavior) this.f1706g).B(this.f1705f);
        return true;
    }

    public f() {
        this.f1705f = 1;
        this.f1706g = Collections.singletonList(null);
    }

    public f(ArrayList arrayList) {
        this.f1705f = 0;
        this.f1706g = arrayList;
    }

    public f(BottomSheetBehavior bottomSheetBehavior, int i3) {
        this.f1706g = bottomSheetBehavior;
        this.f1705f = i3;
    }
}

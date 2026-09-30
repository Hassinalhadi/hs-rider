package e2;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class w extends ArrayAdapter {

    /* renamed from: a, reason: collision with root package name */
    public ColorStateList f1506a;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f1507b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f1508c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x xVar, Context context, int i3, String[] strArr) {
        super(context, i3, strArr);
        this.f1508c = xVar;
        a();
    }

    public final void a() {
        ColorStateList colorStateList;
        x xVar = this.f1508c;
        ColorStateList colorStateList2 = xVar.f1516q;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.f1507b = colorStateList;
        if (xVar.f1515p != 0 && xVar.f1516q != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{c0.a.b(xVar.f1516q.getColorForState(iArr3, 0), xVar.f1515p), c0.a.b(xVar.f1516q.getColorForState(iArr2, 0), xVar.f1515p), xVar.f1515p});
        }
        this.f1506a = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i3, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i3, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            x xVar = this.f1508c;
            Drawable drawable = null;
            if (xVar.getText().toString().contentEquals(textView.getText()) && xVar.f1515p != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(xVar.f1515p);
                if (this.f1507b != null) {
                    colorDrawable.setTintList(this.f1506a);
                    drawable = new RippleDrawable(this.f1507b, colorDrawable, null);
                } else {
                    drawable = colorDrawable;
                }
            }
            textView.setBackground(drawable);
        }
        return view2;
    }
}

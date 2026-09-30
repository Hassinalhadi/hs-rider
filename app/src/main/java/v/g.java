package v;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final float f3081a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3082b;

    /* renamed from: c, reason: collision with root package name */
    public final float f3083c;
    public final float d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3084e;

    public g(Context context, XmlResourceParser xmlResourceParser) {
        this.f3081a = Float.NaN;
        this.f3082b = Float.NaN;
        this.f3083c = Float.NaN;
        this.d = Float.NaN;
        this.f3084e = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), r.f3174j);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i3 = 0; i3 < indexCount; i3++) {
            int index = obtainStyledAttributes.getIndex(i3);
            if (index == 0) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f3084e);
                this.f3084e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new n().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.d = obtainStyledAttributes.getDimension(index, this.d);
            } else if (index == 2) {
                this.f3082b = obtainStyledAttributes.getDimension(index, this.f3082b);
            } else if (index == 3) {
                this.f3083c = obtainStyledAttributes.getDimension(index, this.f3083c);
            } else if (index == 4) {
                this.f3081a = obtainStyledAttributes.getDimension(index, this.f3081a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        obtainStyledAttributes.recycle();
    }
}

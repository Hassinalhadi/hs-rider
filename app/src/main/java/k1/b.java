package k1;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import v.n;
import v.r;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public int f2480a;

    /* renamed from: b, reason: collision with root package name */
    public int f2481b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2482c;

    public b(Context context, XmlResourceParser xmlResourceParser) {
        this.f2482c = new ArrayList();
        this.f2481b = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), r.h);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i3 = 0; i3 < indexCount; i3++) {
            int index = obtainStyledAttributes.getIndex(i3);
            if (index == 0) {
                this.f2480a = obtainStyledAttributes.getResourceId(index, this.f2480a);
            } else if (index == 1) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f2481b);
                this.f2481b = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new n().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        obtainStyledAttributes.recycle();
    }

    public b(View view) {
        this.f2482c = view;
    }
}

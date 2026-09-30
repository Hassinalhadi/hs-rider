package m0;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class e extends View {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f2543f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g f2544g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, Context context, ViewGroup viewGroup) {
        super(context);
        this.f2544g = gVar;
        this.f2543f = viewGroup;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        int i3;
        g gVar = this.f2544g;
        ArrayList arrayList = gVar.f2548b;
        Drawable background = this.f2543f.getBackground();
        if (background instanceof ColorDrawable) {
            i3 = ((ColorDrawable) background).getColor();
        } else {
            i3 = 0;
        }
        if (gVar.f2550e != i3) {
            gVar.f2550e = i3;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((c) arrayList.get(size)).b(i3);
            }
        }
    }
}

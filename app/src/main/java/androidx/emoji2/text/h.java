package androidx.emoji2.text;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import b1.n0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class h implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f283f;

    /* renamed from: g, reason: collision with root package name */
    public final int f284g;
    public final Object h;

    public h(List list, int i3, Throwable th) {
        this.f283f = 0;
        a.y.n(list, "initCallbacks cannot be null");
        this.h = new ArrayList(list);
        this.f284g = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f283f) {
            case 0:
                ArrayList arrayList = (ArrayList) this.h;
                int size = arrayList.size();
                int i3 = 0;
                if (this.f284g != 1) {
                    while (i3 < size) {
                        ((g) arrayList.get(i3)).getClass();
                        i3++;
                    }
                    return;
                } else {
                    while (i3 < size) {
                        ((g) arrayList.get(i3)).a();
                        i3++;
                    }
                    return;
                }
            case 1:
                RecyclerView recyclerView = ((com.google.android.material.datepicker.m) this.h).f1241f0;
                if (!recyclerView.A) {
                    n0 n0Var = recyclerView.f633q;
                    if (n0Var == null) {
                        Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                        return;
                    } else {
                        n0Var.y0(recyclerView, this.f284g);
                        return;
                    }
                }
                return;
            default:
                b0.b bVar = (b0.b) ((m) this.h).f299g;
                if (bVar != null) {
                    bVar.g(this.f284g);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ h(Object obj, int i3, int i4) {
        this.f283f = i4;
        this.h = obj;
        this.f284g = i3;
    }
}

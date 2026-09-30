package b1;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class g1 {

    /* renamed from: a, reason: collision with root package name */
    public int f769a;

    /* renamed from: b, reason: collision with root package name */
    public int f770b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f771c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f772e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f773f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f774g;

    public g1(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f774g = staggeredGridLayoutManager;
        a();
    }

    public final void a() {
        this.f769a = -1;
        this.f770b = Integer.MIN_VALUE;
        this.f771c = false;
        this.d = false;
        this.f772e = false;
        int[] iArr = this.f773f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}

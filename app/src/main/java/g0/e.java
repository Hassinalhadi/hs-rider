package g0;

import android.content.Context;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class e implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1790a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f1791b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f1792c;
    public final /* synthetic */ int d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1793e;

    public /* synthetic */ e(String str, Context context, Object obj, int i3, int i4) {
        this.f1790a = i4;
        this.f1791b = str;
        this.f1792c = context;
        this.f1793e = obj;
        this.d = i3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f1790a) {
            case 0:
                return h.b(this.f1791b, this.f1792c, List.of((d) this.f1793e), this.d);
            default:
                try {
                    return h.b(this.f1791b, this.f1792c, (List) this.f1793e, this.d);
                } catch (Throwable unused) {
                    return new g(-3);
                }
        }
    }
}

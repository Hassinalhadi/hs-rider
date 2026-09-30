package androidx.emoji2.text;

import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class l extends a.y {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a.y f296f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f297g;

    public l(a.y yVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f296f = yVar;
        this.f297g = threadPoolExecutor;
    }

    @Override // a.y
    public final void Q(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f297g;
        try {
            this.f296f.Q(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // a.y
    public final void T(w wVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f297g;
        try {
            this.f296f.T(wVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}

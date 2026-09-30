package g;

import android.content.Context;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1723f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Context f1724g;

    public /* synthetic */ k(Context context, int i3) {
        this.f1723f = i3;
        this.f1724g = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x008a, code lost:
    
        if (r2 != null) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0099  */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r10 = this;
            int r0 = r10.f1723f
            switch(r0) {
                case 0: goto L2f;
                case 1: goto L13;
                default: goto L5;
            }
        L5:
            z0.d r0 = new z0.d
            r0.<init>()
            b2.f r1 = z0.f.f3331a
            r2 = 0
            android.content.Context r10 = r10.f1724g
            z0.f.t(r10, r0, r1, r2)
            return
        L13:
            java.util.concurrent.ThreadPoolExecutor r3 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.LinkedBlockingQueue r9 = new java.util.concurrent.LinkedBlockingQueue
            r9.<init>()
            r4 = 0
            r5 = 1
            r6 = 0
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MILLISECONDS
            r3.<init>(r4, r5, r6, r8, r9)
            g.k r0 = new g.k
            r1 = 2
            android.content.Context r10 = r10.f1724g
            r0.<init>(r10, r1)
            r3.execute(r0)
            return
        L2f:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 1
            r2 = 33
            if (r0 < r2) goto Lb1
            android.content.ComponentName r3 = new android.content.ComponentName
            java.lang.String r4 = "androidx.appcompat.app.AppLocalesMetadataHolderService"
            android.content.Context r10 = r10.f1724g
            r3.<init>(r10, r4)
            android.content.pm.PackageManager r4 = r10.getPackageManager()
            int r4 = r4.getComponentEnabledSetting(r3)
            if (r4 == r1) goto Lb1
            java.lang.String r4 = "locale"
            if (r0 < r2) goto L88
            n.g r0 = g.p.f1763l
            r0.getClass()
            n.b r2 = new n.b
            r2.<init>(r0)
        L57:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L76
            java.lang.Object r0 = r2.next()
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
            java.lang.Object r0 = r0.get()
            g.p r0 = (g.p) r0
            if (r0 == 0) goto L57
            g.c0 r0 = (g.c0) r0
            android.content.Context r0 = r0.f1669p
            if (r0 == 0) goto L57
            java.lang.Object r0 = r0.getSystemService(r4)
            goto L77
        L76:
            r0 = 0
        L77:
            if (r0 == 0) goto L8d
            android.os.LocaleList r0 = g.m.a(r0)
            f0.e r2 = new f0.e
            f0.f r5 = new f0.f
            r5.<init>(r0)
            r2.<init>(r5)
            goto L8f
        L88:
            f0.e r2 = g.p.h
            if (r2 == 0) goto L8d
            goto L8f
        L8d:
            f0.e r2 = f0.e.f1557b
        L8f:
            f0.f r0 = r2.f1558a
            android.os.LocaleList r0 = r0.f1559a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Laa
            java.lang.String r0 = z.a.e(r10)
            java.lang.Object r2 = r10.getSystemService(r4)
            if (r2 == 0) goto Laa
            android.os.LocaleList r0 = g.l.a(r0)
            g.m.b(r2, r0)
        Laa:
            android.content.pm.PackageManager r10 = r10.getPackageManager()
            r10.setComponentEnabledSetting(r3, r1, r1)
        Lb1:
            g.p.f1762k = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g.k.run():void");
    }
}

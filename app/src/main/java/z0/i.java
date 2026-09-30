package z0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final p.h f3342a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f3343b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static b2.f f3344c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            return g.a(packageManager, context).lastUpdateTime;
        }
        return packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static b2.f b() {
        b2.f fVar = new b2.f(26);
        f3344c = fVar;
        p.h hVar = f3342a;
        hVar.getClass();
        if (p.g.f2658k.f(hVar, null, fVar)) {
            p.g.b(hVar);
        }
        return f3344c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:34|35|36|(2:76|77)(1:38)|39|(9:46|(1:50)|(1:57)|58|(2:66|67)|62|63|64|65)|(1:73)(1:(1:75))|(1:50)|(3:52|55|57)|58|(1:60)|66|67|62|63|64|65) */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00c5, code lost:
    
        r5 = 327680;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(android.content.Context r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z0.i.c(android.content.Context, boolean):void");
    }
}

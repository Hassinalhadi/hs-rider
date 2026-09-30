package z0;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f3318a;

    /* renamed from: b, reason: collision with root package name */
    public final e f3319b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f3320c;
    public final File d;

    /* renamed from: e, reason: collision with root package name */
    public final String f3321e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3322f = false;

    /* renamed from: g, reason: collision with root package name */
    public c[] f3323g;
    public byte[] h;

    public b(AssetManager assetManager, Executor executor, e eVar, String str, File file) {
        byte[] bArr;
        this.f3318a = executor;
        this.f3319b = eVar;
        this.f3321e = str;
        this.d = file;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 31) {
            bArr = f.d;
        } else if (i3 != 30) {
            bArr = null;
        } else {
            bArr = f.f3334e;
        }
        this.f3320c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e3) {
            String message = e3.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f3319b.c();
                return null;
            }
            return null;
        }
    }

    public final void b(final int i3, final Serializable serializable) {
        this.f3318a.execute(new Runnable() { // from class: z0.a
            @Override // java.lang.Runnable
            public final void run() {
                b.this.f3319b.e(i3, serializable);
            }
        });
    }
}

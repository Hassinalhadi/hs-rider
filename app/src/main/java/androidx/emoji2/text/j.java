package androidx.emoji2.text;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f285j = new Object();

    /* renamed from: k, reason: collision with root package name */
    public static volatile j f286k;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantReadWriteLock f287a;

    /* renamed from: b, reason: collision with root package name */
    public final n.g f288b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f289c;
    public final Handler d;

    /* renamed from: e, reason: collision with root package name */
    public final e f290e;

    /* renamed from: f, reason: collision with root package name */
    public final i f291f;

    /* renamed from: g, reason: collision with root package name */
    public final b2.f f292g;
    public final int h;

    /* renamed from: i, reason: collision with root package name */
    public final c f293i;

    public j(u uVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f287a = reentrantReadWriteLock;
        this.f289c = 3;
        i iVar = (i) uVar.f281b;
        this.f291f = iVar;
        int i3 = uVar.f280a;
        this.h = i3;
        this.f293i = (c) uVar.f282c;
        this.d = new Handler(Looper.getMainLooper());
        this.f288b = new n.g();
        this.f292g = new b2.f(1);
        e eVar = new e(this);
        this.f290e = eVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i3 == 0) {
            try {
                this.f289c = 0;
            } catch (Throwable th) {
                this.f287a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                iVar.p(new d(eVar));
            } catch (Throwable th2) {
                d(th2);
            }
        }
    }

    public static j a() {
        j jVar;
        boolean z2;
        synchronized (f285j) {
            try {
                jVar = f286k;
                if (jVar != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return jVar;
    }

    public final int b() {
        this.f287a.readLock().lock();
        try {
            return this.f289c;
        } finally {
            this.f287a.readLock().unlock();
        }
    }

    public final void c() {
        boolean z2;
        if (this.h == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (b() == 1) {
                return;
            }
            this.f287a.writeLock().lock();
            try {
                if (this.f289c == 0) {
                    return;
                }
                this.f289c = 0;
                this.f287a.writeLock().unlock();
                e eVar = this.f290e;
                j jVar = eVar.f277a;
                try {
                    jVar.f291f.p(new d(eVar));
                    return;
                } catch (Throwable th) {
                    jVar.d(th);
                    return;
                }
            } finally {
                this.f287a.writeLock().unlock();
            }
        }
        a.b.i("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
    }

    public final void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f287a.writeLock().lock();
        try {
            this.f289c = 2;
            arrayList.addAll(this.f288b);
            this.f288b.clear();
            this.f287a.writeLock().unlock();
            this.d.post(new h(arrayList, this.f289c, th));
        } catch (Throwable th2) {
            this.f287a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x009f A[Catch: all -> 0x0082, TryCatch #0 {all -> 0x0082, blocks: (B:28:0x005a, B:31:0x005f, B:33:0x0063, B:35:0x0070, B:37:0x008f, B:39:0x0099, B:41:0x009c, B:43:0x009f, B:45:0x00af, B:46:0x00b2), top: B:27:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v13, types: [androidx.emoji2.text.b0, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence e(java.lang.CharSequence r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.j.e(java.lang.CharSequence, int, int):java.lang.CharSequence");
    }

    public final void f(g gVar) {
        a.y.n(gVar, "initCallback cannot be null");
        this.f287a.writeLock().lock();
        try {
            if (this.f289c != 1 && this.f289c != 2) {
                this.f288b.add(gVar);
                this.f287a.writeLock().unlock();
            }
            this.d.post(new h(Arrays.asList(gVar), this.f289c, (Throwable) null));
            this.f287a.writeLock().unlock();
        } catch (Throwable th) {
            this.f287a.writeLock().unlock();
            throw th;
        }
    }
}

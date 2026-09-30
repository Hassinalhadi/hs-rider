package g0;

import b1.k1;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final k1 f1798a = new k1(16);

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f1799b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f1800c;
    public static final n.j d;

    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, java.util.concurrent.ThreadFactory] */
    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), (ThreadFactory) new Object());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f1799b = threadPoolExecutor;
        f1800c = new Object();
        d = new n.j(0);
    }

    public static String a(List list, int i3) {
        StringBuilder sb = new StringBuilder();
        for (int i4 = 0; i4 < list.size(); i4++) {
            sb.append(((d) list.get(i4)).f1789e);
            sb.append("-");
            sb.append(i3);
            if (i4 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0050 A[Catch: all -> 0x00a3, TRY_LEAVE, TryCatch #2 {all -> 0x00a3, NameNotFoundException -> 0x0099, all -> 0x0073, blocks: (B:3:0x0007, B:5:0x000f, B:10:0x0018, B:11:0x001c, B:16:0x0050, B:19:0x0059, B:21:0x005f, B:24:0x006f, B:26:0x0084, B:29:0x0090, B:34:0x0074, B:35:0x0077, B:36:0x0078, B:38:0x002d, B:40:0x0035, B:43:0x0039, B:45:0x003d, B:47:0x0048, B:56:0x0099, B:23:0x0066), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059 A[Catch: all -> 0x00a3, TRY_ENTER, TryCatch #2 {all -> 0x00a3, NameNotFoundException -> 0x0099, all -> 0x0073, blocks: (B:3:0x0007, B:5:0x000f, B:10:0x0018, B:11:0x001c, B:16:0x0050, B:19:0x0059, B:21:0x005f, B:24:0x006f, B:26:0x0084, B:29:0x0090, B:34:0x0074, B:35:0x0077, B:36:0x0078, B:38:0x002d, B:40:0x0035, B:43:0x0039, B:45:0x003d, B:47:0x0048, B:56:0x0099, B:23:0x0066), top: B:2:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static g0.g b(java.lang.String r8, android.content.Context r9, java.util.List r10, int r11) {
        /*
            b1.k1 r0 = g0.h.f1798a
            java.lang.String r1 = "getFontSync"
            a.y.i(r1)
            java.lang.Object r1 = r0.f(r8)     // Catch: java.lang.Throwable -> La3
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1     // Catch: java.lang.Throwable -> La3
            if (r1 == 0) goto L18
            g0.g r8 = new g0.g     // Catch: java.lang.Throwable -> La3
            r8.<init>(r1)     // Catch: java.lang.Throwable -> La3
            android.os.Trace.endSection()
            return r8
        L18:
            g.f r10 = g0.c.a(r9, r10)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L99 java.lang.Throwable -> La3
            java.lang.Object r1 = r10.f1706g     // Catch: java.lang.Throwable -> La3
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> La3
            int r10 = r10.f1705f     // Catch: java.lang.Throwable -> La3
            r2 = 1
            r3 = -3
            r4 = 0
            if (r10 == 0) goto L2d
            if (r10 == r2) goto L2b
        L29:
            r10 = r3
            goto L4e
        L2b:
            r10 = -2
            goto L4e
        L2d:
            java.lang.Object r10 = r1.get(r4)     // Catch: java.lang.Throwable -> La3
            g0.i[] r10 = (g0.i[]) r10     // Catch: java.lang.Throwable -> La3
            if (r10 == 0) goto L4d
            int r5 = r10.length     // Catch: java.lang.Throwable -> La3
            if (r5 != 0) goto L39
            goto L4d
        L39:
            int r5 = r10.length     // Catch: java.lang.Throwable -> La3
            r6 = r4
        L3b:
            if (r6 >= r5) goto L4b
            r7 = r10[r6]     // Catch: java.lang.Throwable -> La3
            int r7 = r7.f1804e     // Catch: java.lang.Throwable -> La3
            if (r7 == 0) goto L48
            if (r7 >= 0) goto L46
            goto L29
        L46:
            r10 = r7
            goto L4e
        L48:
            int r6 = r6 + 1
            goto L3b
        L4b:
            r10 = r4
            goto L4e
        L4d:
            r10 = r2
        L4e:
            if (r10 == 0) goto L59
            g0.g r8 = new g0.g     // Catch: java.lang.Throwable -> La3
            r8.<init>(r10)     // Catch: java.lang.Throwable -> La3
            android.os.Trace.endSection()
            return r8
        L59:
            int r10 = r1.size()     // Catch: java.lang.Throwable -> La3
            if (r10 <= r2) goto L78
            b2.f r10 = c0.e.f1088a     // Catch: java.lang.Throwable -> La3
            java.lang.String r10 = "TypefaceCompat.createFromFontInfoWithFallback"
            a.y.i(r10)     // Catch: java.lang.Throwable -> La3
            b2.f r10 = c0.e.f1088a     // Catch: java.lang.Throwable -> L73
            r10.getClass()     // Catch: java.lang.Throwable -> L73
            android.graphics.Typeface r9 = b2.f.g(r9, r1, r11)     // Catch: java.lang.Throwable -> L73
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> La3
            goto L82
        L73:
            r8 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> La3
            throw r8     // Catch: java.lang.Throwable -> La3
        L78:
            java.lang.Object r10 = r1.get(r4)     // Catch: java.lang.Throwable -> La3
            g0.i[] r10 = (g0.i[]) r10     // Catch: java.lang.Throwable -> La3
            android.graphics.Typeface r9 = c0.e.a(r9, r10, r11)     // Catch: java.lang.Throwable -> La3
        L82:
            if (r9 == 0) goto L90
            r0.j(r8, r9)     // Catch: java.lang.Throwable -> La3
            g0.g r8 = new g0.g     // Catch: java.lang.Throwable -> La3
            r8.<init>(r9)     // Catch: java.lang.Throwable -> La3
            android.os.Trace.endSection()
            return r8
        L90:
            g0.g r8 = new g0.g     // Catch: java.lang.Throwable -> La3
            r8.<init>(r3)     // Catch: java.lang.Throwable -> La3
            android.os.Trace.endSection()
            return r8
        L99:
            g0.g r8 = new g0.g     // Catch: java.lang.Throwable -> La3
            r9 = -1
            r8.<init>(r9)     // Catch: java.lang.Throwable -> La3
            android.os.Trace.endSection()
            return r8
        La3:
            r8 = move-exception
            android.os.Trace.endSection()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.h.b(java.lang.String, android.content.Context, java.util.List, int):g0.g");
    }
}

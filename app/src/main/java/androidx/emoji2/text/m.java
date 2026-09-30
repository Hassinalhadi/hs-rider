package androidx.emoji2.text;

import android.content.ClipData;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.fragment.app.d0;
import androidx.fragment.app.v0;
import androidx.lifecycle.l0;
import androidx.lifecycle.n0;
import com.google.android.material.behavior.SwipeDismissBehavior;
import j.e0;
import j0.j0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k.b2;
import k.r2;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public class m implements i, q, f0.b, b2, j0.d, j0.f, j.x, j.k, k0.m, o1.b, n0 {
    public static m h;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f298f;

    /* renamed from: g, reason: collision with root package name */
    public Object f299g;

    public m(int i3) {
        this.f298f = i3;
        switch (i3) {
            case 19:
                this.f299g = new k0.e(this);
                return;
            case 24:
                this.f299g = new LinkedHashMap(0, 0.75f, true);
                return;
            default:
                this.f299g = new Object();
                new Handler(Looper.getMainLooper(), new d2.e(this));
                return;
        }
    }

    @Override // j.x
    public void a(j.m mVar, boolean z2) {
        if (mVar instanceof e0) {
            ((e0) mVar).f2037z.k().c(false);
        }
        j.x xVar = ((k.k) this.f299g).f2291j;
        if (xVar != null) {
            xVar.a(mVar, z2);
        }
    }

    @Override // j.x
    public boolean b(j.m mVar) {
        k.k kVar = (k.k) this.f299g;
        if (mVar != kVar.h) {
            ((e0) mVar).A.getClass();
            j.x xVar = kVar.f2291j;
            if (xVar != null) {
                return xVar.b(mVar);
            }
            return false;
        }
        return false;
    }

    @Override // j0.d
    public j0.g build() {
        ContentInfo build;
        build = ((ContentInfo.Builder) this.f299g).build();
        return new j0.g(new m(build));
    }

    @Override // k.b2
    public void c(j.m mVar, j.o oVar) {
        j.g gVar = (j.g) this.f299g;
        Handler handler = gVar.f2044k;
        j.f fVar = null;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = gVar.f2046m;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 < size) {
                if (mVar == ((j.f) arrayList.get(i3)).f2039b) {
                    break;
                } else {
                    i3++;
                }
            } else {
                i3 = -1;
                break;
            }
        }
        if (i3 == -1) {
            return;
        }
        int i4 = i3 + 1;
        if (i4 < arrayList.size()) {
            fVar = (j.f) arrayList.get(i4);
        }
        handler.postAtTime(new j.e(this, fVar, oVar, mVar), mVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // j0.f
    public ClipData f() {
        ClipData clip;
        clip = ((ContentInfo) this.f299g).getClip();
        return clip;
    }

    @Override // j.k
    public void g(j.m mVar) {
        r2 r2Var = ((ActionMenuView) this.f299g).f159z;
        if (r2Var != null) {
            r2Var.g(mVar);
        }
    }

    @Override // j.k
    public boolean h(j.m mVar, MenuItem menuItem) {
        k.n nVar = ((ActionMenuView) this.f299g).E;
        if (nVar != null) {
            Iterator it = ((CopyOnWriteArrayList) ((r2) nVar).f2381f.L.f310c).iterator();
            while (it.hasNext()) {
                if (((d0) it.next()).f373a.o()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // k0.m
    public boolean i(View view) {
        int width;
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f299g;
        boolean z2 = false;
        if (!swipeDismissBehavior.r(view)) {
            return false;
        }
        if (view.getLayoutDirection() == 1) {
            z2 = true;
        }
        int i3 = swipeDismissBehavior.d;
        if ((i3 == 0 && z2) || (i3 == 1 && !z2)) {
            width = -view.getWidth();
        } else {
            width = view.getWidth();
        }
        WeakHashMap weakHashMap = j0.f2160a;
        view.offsetLeftAndRight(width);
        view.setAlpha(0.0f);
        return true;
    }

    @Override // k.b2
    public void j(j.m mVar, MenuItem menuItem) {
        ((j.g) this.f299g).f2044k.removeCallbacksAndMessages(mVar);
    }

    @Override // j0.f
    public int k() {
        int flags;
        flags = ((ContentInfo) this.f299g).getFlags();
        return flags;
    }

    @Override // j0.f
    public ContentInfo l() {
        return (ContentInfo) this.f299g;
    }

    @Override // androidx.emoji2.text.q
    public boolean m(CharSequence charSequence, int i3, int i4, z zVar) {
        if (TextUtils.equals(charSequence.subSequence(i3, i4), (String) this.f299g)) {
            zVar.f329c = (zVar.f329c & 3) | 4;
            return false;
        }
        return true;
    }

    @Override // j0.d
    public void n(Uri uri) {
        ((ContentInfo.Builder) this.f299g).setLinkUri(uri);
    }

    @Override // j0.f
    public int o() {
        int source;
        source = ((ContentInfo) this.f299g).getSource();
        return source;
    }

    @Override // f0.b
    public void onCancel() {
        ((v0) this.f299g).a();
    }

    @Override // androidx.emoji2.text.i
    public void p(final a.y yVar) {
        a aVar = new a("EmojiCompatInitializer");
        final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), aVar);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new Runnable() { // from class: androidx.emoji2.text.k
            @Override // java.lang.Runnable
            public final void run() {
                m mVar = m.this;
                a.y yVar2 = yVar;
                ThreadPoolExecutor threadPoolExecutor2 = threadPoolExecutor;
                try {
                    u w3 = a.y.w((Context) mVar.f299g);
                    if (w3 != null) {
                        t tVar = (t) ((i) w3.f281b);
                        synchronized (tVar.f313i) {
                            tVar.f315k = threadPoolExecutor2;
                        }
                        ((i) w3.f281b).p(new l(yVar2, threadPoolExecutor2));
                        return;
                    }
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                } catch (Throwable th) {
                    yVar2.Q(th);
                    threadPoolExecutor2.shutdown();
                }
            }
        });
    }

    @Override // androidx.lifecycle.n0
    public l0 q(Class cls, w0.c cVar) {
        androidx.lifecycle.j0 j0Var = null;
        for (w0.d dVar : (w0.d[]) this.f299g) {
            dVar.getClass();
            if (androidx.lifecycle.j0.class.equals(cls)) {
                j0Var = new androidx.lifecycle.j0();
            }
        }
        if (j0Var != null) {
            return j0Var;
        }
        a.b.m("No initializer set for given class ".concat(cls.getName()));
        return null;
    }

    @Override // j0.d
    public void r(int i3) {
        ((ContentInfo.Builder) this.f299g).setFlags(i3);
    }

    public k0.d s(int i3) {
        return null;
    }

    @Override // j0.d
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.f299g).setExtras(bundle);
    }

    public k0.d t(int i3) {
        return null;
    }

    public String toString() {
        switch (this.f298f) {
            case 14:
                return "ContentInfoCompat{" + ((ContentInfo) this.f299g) + "}";
            default:
                return super.toString();
        }
    }

    public void u() {
        ((androidx.fragment.app.w) this.f299g).f523i.L();
    }

    public boolean v(int i3, int i4, Bundle bundle) {
        return false;
    }

    public void w(boolean z2) {
        p pVar = (p) this.f299g;
        WindowInsetsController windowInsetsController = (WindowInsetsController) pVar.f301g;
        Window window = (Window) pVar.h;
        if (z2) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            windowInsetsController.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        windowInsetsController.setSystemBarsAppearance(0, 16);
    }

    public void x(boolean z2) {
        p pVar = (p) this.f299g;
        WindowInsetsController windowInsetsController = (WindowInsetsController) pVar.f301g;
        Window window = (Window) pVar.h;
        if (z2) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            windowInsetsController.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        windowInsetsController.setSystemBarsAppearance(0, 8);
    }

    public /* synthetic */ m(int i3, boolean z2) {
        this.f298f = i3;
    }

    public /* synthetic */ m(int i3, Object obj) {
        this.f298f = i3;
        this.f299g = obj;
    }

    public m(TextView textView) {
        this.f298f = 28;
        this.f299g = new s0.g(textView);
    }

    public m(EditText editText) {
        this.f298f = 27;
        this.f299g = new p(editText);
    }

    public m(Window window, View view) {
        this.f298f = 16;
        b2.f fVar = new b2.f(view);
        if (Build.VERSION.SDK_INT >= 35) {
            this.f299g = new p(window, fVar);
        } else {
            this.f299g = new p(window, fVar);
        }
    }

    public m(Context context) {
        this.f298f = 0;
        this.f299g = context.getApplicationContext();
    }

    public m(ContentInfo contentInfo) {
        this.f298f = 14;
        contentInfo.getClass();
        this.f299g = j0.c.g(contentInfo);
    }

    public m(ClipData clipData, int i3) {
        this.f298f = 13;
        this.f299g = j0.c.e(clipData, i3);
    }

    @Override // androidx.emoji2.text.q
    public Object e() {
        return this;
    }
}

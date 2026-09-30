package a;

import android.content.res.Resources;
import android.util.AndroidRuntimeException;
import android.view.View;
import com.logistics.rider.lsposed.MainActivity;
import j0.c1;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements o2.l, e2.c0, f1.m, j0.n {

    /* renamed from: f */
    public final /* synthetic */ int f4f;

    public /* synthetic */ b(int i3) {
        this.f4f = i3;
    }

    public static /* synthetic */ void c() {
        throw new ClassCastException();
    }

    public static /* synthetic */ void e(Object obj, Object obj2) {
        throw new AndroidRuntimeException("Fragment " + obj + obj2);
    }

    public static /* synthetic */ void f(Object obj, Object obj2, Object obj3, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        sb.append(obj3);
        throw new IllegalStateException(sb.toString(), th);
    }

    public static /* synthetic */ void g(Object obj, Object obj2, Throwable th) {
        throw new RuntimeException("Unable to instantiate fragment " + obj + obj2, th);
    }

    public static /* synthetic */ void h(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void i(String str) {
        throw new IllegalStateException(str);
    }

    public static /* synthetic */ void j(String str, int i3, Object obj, int i4) {
        throw new IndexOutOfBoundsException(str + i3 + obj + i4);
    }

    public static /* synthetic */ void k(String str, Object obj, Object obj2) {
        throw new IllegalStateException(str + obj + obj2);
    }

    public static /* synthetic */ void l(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void m(String str) {
        throw new IllegalArgumentException(str);
    }

    public static /* synthetic */ void n(String str) {
        throw new UnsupportedOperationException(str);
    }

    @Override // f1.m
    public void a(f1.l lVar, f1.n nVar) {
        switch (this.f4f) {
            case 10:
                lVar.f(nVar);
                return;
            case 11:
                lVar.c(nVar);
                return;
            case 12:
                lVar.b(nVar);
                return;
            case 13:
                lVar.d();
                return;
            default:
                lVar.e();
                return;
        }
    }

    public Object b(Object obj) {
        boolean z2;
        Resources resources = (Resources) obj;
        resources.getClass();
        if ((resources.getConfiguration().uiMode & 48) == 32) {
            z2 = true;
        } else {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }

    @Override // j0.n
    public c1 d(View view, c1 c1Var) {
        int i3 = MainActivity.E;
        view.getClass();
        c0.b f3 = c1Var.f2146a.f(519);
        f3.getClass();
        view.setPadding(f3.f1082a, f3.f1083b, f3.f1084c, f3.d);
        return c1Var;
    }
}

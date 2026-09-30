package j0;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class m0 extends WindowInsetsAnimation.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final a.y f2168a;

    /* renamed from: b, reason: collision with root package name */
    public List f2169b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f2170c;
    public final HashMap d;

    public m0(a.y yVar) {
        super(0);
        this.d = new HashMap();
        this.f2168a = yVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [j0.n0, java.lang.Object] */
    public final n0 a(WindowInsetsAnimation windowInsetsAnimation) {
        HashMap hashMap = this.d;
        n0 n0Var = (n0) hashMap.get(windowInsetsAnimation);
        if (n0Var == null) {
            ?? obj = new Object();
            new WindowInsetsAnimation(0, null, 0L);
            obj.f2171a = new androidx.emoji2.text.m(15, windowInsetsAnimation);
            hashMap.put(windowInsetsAnimation, obj);
            return obj;
        }
        return n0Var;
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.f2168a.P(a(windowInsetsAnimation));
        this.d.remove(windowInsetsAnimation);
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.f2168a.U(a(windowInsetsAnimation));
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.f2170c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f2170c = arrayList2;
            this.f2169b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimation = (WindowInsetsAnimation) list.get(size);
            n0 a3 = a(windowInsetsAnimation);
            ((WindowInsetsAnimation) a3.f2171a.f299g).setFraction(windowInsetsAnimation.getFraction());
            this.f2170c.add(a3);
        }
        return this.f2168a.V(c1.f(null, windowInsets), this.f2169b).e();
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        androidx.emoji2.text.p W = this.f2168a.W(a(windowInsetsAnimation), new androidx.emoji2.text.p(bounds));
        W.getClass();
        return new WindowInsetsAnimation.Bounds(((c0.b) W.f301g).d(), ((c0.b) W.h).d());
    }
}

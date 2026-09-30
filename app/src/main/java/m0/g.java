package m0;

import a.c0;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import j0.j0;
import j0.m0;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final e f2547a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f2548b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public c0.b f2549c;
    public c0.b d;

    /* renamed from: e, reason: collision with root package name */
    public int f2550e;

    public g(ViewGroup viewGroup) {
        int i3;
        c0.b bVar = c0.b.f1081e;
        this.f2549c = bVar;
        this.d = bVar;
        Drawable background = viewGroup.getBackground();
        if (background instanceof ColorDrawable) {
            i3 = ((ColorDrawable) background).getColor();
        } else {
            i3 = 0;
        }
        this.f2550e = i3;
        e eVar = new e(this, viewGroup.getContext(), viewGroup);
        this.f2547a = eVar;
        eVar.setWillNotDraw(true);
        c0 c0Var = new c0(this);
        WeakHashMap weakHashMap = j0.f2160a;
        j0.c0.i(eVar, c0Var);
        eVar.setWindowInsetsAnimationCallback(new m0(new f(this)));
        viewGroup.addView(eVar, 0);
    }
}

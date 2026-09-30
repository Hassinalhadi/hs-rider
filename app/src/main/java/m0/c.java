package m0;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.FrameLayout;
import androidx.emoji2.text.p;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2536a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final g f2537b;

    /* renamed from: c, reason: collision with root package name */
    public c0.b f2538c;
    public c0.b d;

    /* renamed from: e, reason: collision with root package name */
    public int f2539e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2540f;

    public c(g gVar, ArrayList arrayList) {
        c0.b bVar = c0.b.f1081e;
        this.f2538c = bVar;
        this.d = bVar;
        a(arrayList, false);
        a(arrayList, true);
        ArrayList arrayList2 = gVar.f2548b;
        if (!arrayList2.contains(this)) {
            arrayList2.add(this);
            c0.b bVar2 = gVar.f2549c;
            c0.b bVar3 = gVar.d;
            this.f2538c = bVar2;
            this.d = bVar3;
            c();
            b(gVar.f2550e);
        }
        this.f2537b = gVar;
    }

    public final void a(List list, boolean z2) {
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            a aVar = (a) list.get(i3);
            aVar.getClass();
            if (true == z2) {
                c cVar = aVar.f2526e;
                if (cVar == null) {
                    aVar.f2526e = this;
                    this.f2536a.add(aVar);
                } else {
                    throw new IllegalStateException(aVar + " is already controlled by " + cVar);
                }
            }
        }
    }

    public final void b(int i3) {
        ArrayList arrayList = this.f2536a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            a aVar = (a) arrayList.get(size);
            if (!aVar.f2528g) {
                ColorDrawable colorDrawable = aVar.f2527f;
                if (aVar.h != i3) {
                    aVar.h = i3;
                    colorDrawable.setColor(i3);
                    b bVar = aVar.f2524b;
                    bVar.f2532e = colorDrawable;
                    p pVar = bVar.f2535i;
                    if (pVar != null) {
                        ((View) pVar.h).setBackground(colorDrawable);
                    }
                }
            }
        }
    }

    public final void c() {
        int i3;
        c0.b b3;
        boolean z2;
        float f3;
        ArrayList arrayList = this.f2536a;
        c0.b bVar = c0.b.f1081e;
        c0.b bVar2 = bVar;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            a aVar = (a) arrayList.get(size);
            c0.b bVar3 = this.f2538c;
            c0.b bVar4 = this.d;
            aVar.f2525c = bVar3;
            b bVar5 = aVar.f2524b;
            aVar.d = bVar4;
            if (!bVar5.f2531c.equals(bVar2)) {
                bVar5.f2531c = bVar2;
                p pVar = bVar5.f2535i;
                if (pVar != null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) pVar.f301g;
                    layoutParams.leftMargin = bVar2.f1082a;
                    layoutParams.topMargin = bVar2.f1083b;
                    layoutParams.rightMargin = bVar2.f1084c;
                    layoutParams.bottomMargin = bVar2.d;
                    ((View) pVar.h).setLayoutParams(layoutParams);
                }
            }
            int i4 = aVar.f2523a;
            int i5 = 4;
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 4) {
                        if (i4 != 8) {
                            b3 = bVar;
                            i3 = 0;
                        } else {
                            i3 = aVar.f2525c.d;
                            int i6 = aVar.d.d;
                            if (bVar5.f2530b != i6) {
                                bVar5.f2530b = i6;
                                p pVar2 = bVar5.f2535i;
                                if (pVar2 != null) {
                                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) pVar2.f301g;
                                    layoutParams2.height = i6;
                                    ((View) pVar2.h).setLayoutParams(layoutParams2);
                                }
                            }
                            b3 = c0.b.b(0, 0, 0, i3);
                        }
                    } else {
                        i3 = aVar.f2525c.f1084c;
                        int i7 = aVar.d.f1084c;
                        if (bVar5.f2529a != i7) {
                            bVar5.f2529a = i7;
                            p pVar3 = bVar5.f2535i;
                            if (pVar3 != null) {
                                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) pVar3.f301g;
                                layoutParams3.width = i7;
                                ((View) pVar3.h).setLayoutParams(layoutParams3);
                            }
                        }
                        b3 = c0.b.b(0, 0, i3, 0);
                    }
                } else {
                    i3 = aVar.f2525c.f1083b;
                    int i8 = aVar.d.f1083b;
                    if (bVar5.f2530b != i8) {
                        bVar5.f2530b = i8;
                        p pVar4 = bVar5.f2535i;
                        if (pVar4 != null) {
                            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) pVar4.f301g;
                            layoutParams4.height = i8;
                            ((View) pVar4.h).setLayoutParams(layoutParams4);
                        }
                    }
                    b3 = c0.b.b(0, i3, 0, 0);
                }
            } else {
                i3 = aVar.f2525c.f1082a;
                int i9 = aVar.d.f1082a;
                if (bVar5.f2529a != i9) {
                    bVar5.f2529a = i9;
                    p pVar5 = bVar5.f2535i;
                    if (pVar5 != null) {
                        FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) pVar5.f301g;
                        layoutParams5.width = i9;
                        ((View) pVar5.h).setLayoutParams(layoutParams5);
                    }
                }
                b3 = c0.b.b(i3, 0, 0, 0);
            }
            if (i3 > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (bVar5.d != z2) {
                bVar5.d = z2;
                p pVar6 = bVar5.f2535i;
                if (pVar6 != null) {
                    View view = (View) pVar6.h;
                    if (z2) {
                        i5 = 0;
                    }
                    view.setVisibility(i5);
                }
            }
            float f4 = 0.0f;
            if (i3 > 0) {
                f3 = 1.0f;
            } else {
                f3 = 0.0f;
            }
            aVar.a(f3);
            if (i3 > 0) {
                f4 = 1.0f;
            }
            aVar.b(f4);
            bVar2 = c0.b.b(Math.max(bVar2.f1082a, b3.f1082a), Math.max(bVar2.f1083b, b3.f1083b), Math.max(bVar2.f1084c, b3.f1084c), Math.max(bVar2.d, b3.d));
        }
    }
}

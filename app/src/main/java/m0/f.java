package m0;

import a.y;
import android.graphics.RectF;
import android.view.View;
import android.view.WindowInsetsAnimation;
import androidx.emoji2.text.p;
import j0.c1;
import j0.n0;
import j0.y0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class f extends y {

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f2545f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g f2546g;

    public f(g gVar) {
        this.f2546g = gVar;
    }

    @Override // a.y
    public final void P(n0 n0Var) {
        boolean z2;
        ArrayList arrayList = this.f2546g.f2548b;
        if ((((WindowInsetsAnimation) n0Var.f2171a.f299g).getTypeMask() & 519) != 0) {
            this.f2545f.remove(n0Var);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                c cVar = (c) arrayList.get(size);
                int i3 = cVar.f2539e;
                if (i3 > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                int i4 = i3 - 1;
                cVar.f2539e = i4;
                if (z2 && i4 == 0) {
                    cVar.c();
                }
            }
        }
    }

    @Override // a.y
    public final void U(n0 n0Var) {
        ArrayList arrayList = this.f2546g.f2548b;
        if ((((WindowInsetsAnimation) n0Var.f2171a.f299g).getTypeMask() & 519) != 0) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((c) arrayList.get(size)).f2539e++;
            }
        }
    }

    @Override // a.y
    public final c1 V(c1 c1Var, List list) {
        ArrayList arrayList = this.f2546g.f2548b;
        RectF rectF = new RectF(1.0f, 1.0f, 1.0f, 1.0f);
        int i3 = 0;
        for (int size = list.size() - 1; size >= 0; size--) {
            n0 n0Var = (n0) list.get(size);
            Integer num = (Integer) this.f2545f.get(n0Var);
            if (num != null) {
                int intValue = num.intValue();
                float alpha = ((WindowInsetsAnimation) n0Var.f2171a.f299g).getAlpha();
                if ((intValue & 1) != 0) {
                    rectF.left = alpha;
                }
                if ((intValue & 2) != 0) {
                    rectF.top = alpha;
                }
                if ((intValue & 4) != 0) {
                    rectF.right = alpha;
                }
                if ((intValue & 8) != 0) {
                    rectF.bottom = alpha;
                }
                i3 |= intValue;
            }
        }
        y0 y0Var = c1Var.f2146a;
        c0.b a3 = c0.b.a(y0Var.f(519), y0Var.f(64));
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            c cVar = (c) arrayList.get(size2);
            c0.b bVar = cVar.d;
            ArrayList arrayList2 = cVar.f2536a;
            for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
                a aVar = (a) arrayList2.get(size3);
                int i4 = aVar.f2523a;
                if ((i4 & i3) != 0) {
                    b bVar2 = aVar.f2524b;
                    if (!bVar2.d) {
                        bVar2.d = true;
                        p pVar = bVar2.f2535i;
                        if (pVar != null) {
                            ((View) pVar.h).setVisibility(0);
                        }
                    }
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 4) {
                                if (i4 == 8) {
                                    int i5 = bVar.d;
                                    if (i5 > 0) {
                                        aVar.b(a3.d / i5);
                                    }
                                    aVar.a(rectF.bottom);
                                }
                            } else {
                                int i6 = bVar.f1084c;
                                if (i6 > 0) {
                                    aVar.b(a3.f1084c / i6);
                                }
                                aVar.a(rectF.right);
                            }
                        } else {
                            int i7 = bVar.f1083b;
                            if (i7 > 0) {
                                aVar.b(a3.f1083b / i7);
                            }
                            aVar.a(rectF.top);
                        }
                    } else {
                        int i8 = bVar.f1082a;
                        if (i8 > 0) {
                            aVar.b(a3.f1082a / i8);
                        }
                        aVar.a(rectF.left);
                    }
                }
            }
        }
        return c1Var;
    }

    @Override // a.y
    public final p W(n0 n0Var, p pVar) {
        int i3;
        if ((((WindowInsetsAnimation) n0Var.f2171a.f299g).getTypeMask() & 519) != 0) {
            c0.b bVar = (c0.b) pVar.h;
            c0.b bVar2 = (c0.b) pVar.f301g;
            if (bVar.f1082a != bVar2.f1082a) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            if (bVar.f1083b != bVar2.f1083b) {
                i3 |= 2;
            }
            if (bVar.f1084c != bVar2.f1084c) {
                i3 |= 4;
            }
            if (bVar.d != bVar2.d) {
                i3 |= 8;
            }
            this.f2545f.put(n0Var, Integer.valueOf(i3));
        }
        return pVar;
    }
}

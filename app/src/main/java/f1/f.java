package f1;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class f extends n {
    public static final String[] F = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final b G = new b(PointF.class, "topLeft", 0);
    public static final b H = new b(PointF.class, "bottomRight", 1);
    public static final b I = new b(PointF.class, "bottomRight", 2);
    public static final b J = new b(PointF.class, "topLeft", 3);
    public static final b K = new b(PointF.class, "position", 4);

    public static void I(u uVar) {
        View view = uVar.f1617b;
        HashMap hashMap = uVar.f1616a;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        hashMap.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        hashMap.put("android:changeBounds:parent", view.getParent());
    }

    @Override // f1.n
    public final void d(u uVar) {
        I(uVar);
    }

    @Override // f1.n
    public final void g(u uVar) {
        I(uVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f1.n
    public final Animator k(ViewGroup viewGroup, u uVar, u uVar2) {
        int i3;
        f fVar;
        ObjectAnimator a3;
        if (uVar != null) {
            HashMap hashMap = uVar.f1616a;
            if (uVar2 != null) {
                HashMap hashMap2 = uVar2.f1616a;
                ViewGroup viewGroup2 = (ViewGroup) hashMap.get("android:changeBounds:parent");
                ViewGroup viewGroup3 = (ViewGroup) hashMap2.get("android:changeBounds:parent");
                if (viewGroup2 != null && viewGroup3 != null) {
                    View view = uVar2.f1617b;
                    Rect rect = (Rect) hashMap.get("android:changeBounds:bounds");
                    Rect rect2 = (Rect) hashMap2.get("android:changeBounds:bounds");
                    int i4 = rect.left;
                    int i5 = rect2.left;
                    int i6 = rect.top;
                    int i7 = rect2.top;
                    int i8 = rect.right;
                    int i9 = rect2.right;
                    int i10 = rect.bottom;
                    int i11 = rect2.bottom;
                    int i12 = i8 - i4;
                    int i13 = i10 - i6;
                    int i14 = i9 - i5;
                    int i15 = i11 - i7;
                    Rect rect3 = (Rect) hashMap.get("android:changeBounds:clip");
                    Rect rect4 = (Rect) hashMap2.get("android:changeBounds:clip");
                    if ((i12 != 0 && i13 != 0) || (i14 != 0 && i15 != 0)) {
                        if (i4 == i5 && i6 == i7) {
                            i3 = 0;
                        } else {
                            i3 = 1;
                        }
                        if (i8 != i9 || i10 != i11) {
                            i3++;
                        }
                    } else {
                        i3 = 0;
                    }
                    if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
                        i3++;
                    }
                    int i16 = i3;
                    if (i16 > 0) {
                        b bVar = w.f1619a;
                        view.setLeftTopRightBottom(i4, i6, i8, i10);
                        if (i16 == 2) {
                            if (i12 == i14 && i13 == i15) {
                                fVar = this;
                                fVar.A.getClass();
                                a3 = i.a(view, K, b2.f.k(i4, i6, i5, i7));
                            } else {
                                fVar = this;
                                e eVar = new e(view);
                                fVar.A.getClass();
                                ObjectAnimator a4 = i.a(eVar, G, b2.f.k(i4, i6, i5, i7));
                                fVar.A.getClass();
                                ObjectAnimator a5 = i.a(eVar, H, b2.f.k(i8, i10, i9, i11));
                                AnimatorSet animatorSet = new AnimatorSet();
                                animatorSet.playTogether(a4, a5);
                                animatorSet.addListener(new c(eVar));
                                a3 = animatorSet;
                            }
                        } else {
                            fVar = this;
                            if (i4 == i5 && i6 == i7) {
                                fVar.A.getClass();
                                a3 = i.a(view, I, b2.f.k(i8, i10, i9, i11));
                            } else {
                                fVar.A.getClass();
                                a3 = i.a(view, J, b2.f.k(i4, i6, i5, i7));
                            }
                        }
                        if (view.getParent() instanceof ViewGroup) {
                            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                            v.b(viewGroup4, true);
                            fVar.o().a(new d(viewGroup4));
                        }
                        return a3;
                    }
                    return null;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    @Override // f1.n
    public final String[] q() {
        return F;
    }
}

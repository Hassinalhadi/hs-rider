package f1;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class b extends Property {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1565a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Class cls, String str, int i3) {
        super(cls, str);
        this.f1565a = i3;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f1565a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return null;
            case 5:
                return Float.valueOf(((View) obj).getTransitionAlpha());
            default:
                return ((View) obj).getClipBounds();
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f1565a) {
            case 0:
                e eVar = (e) obj;
                PointF pointF = (PointF) obj2;
                eVar.getClass();
                eVar.f1568a = Math.round(pointF.x);
                int round = Math.round(pointF.y);
                eVar.f1569b = round;
                int i3 = eVar.f1572f + 1;
                eVar.f1572f = i3;
                if (i3 == eVar.f1573g) {
                    View view = eVar.f1571e;
                    int i4 = eVar.f1568a;
                    int i5 = eVar.f1570c;
                    int i6 = eVar.d;
                    b bVar = w.f1619a;
                    view.setLeftTopRightBottom(i4, round, i5, i6);
                    eVar.f1572f = 0;
                    eVar.f1573g = 0;
                    return;
                }
                return;
            case 1:
                e eVar2 = (e) obj;
                PointF pointF2 = (PointF) obj2;
                eVar2.getClass();
                eVar2.f1570c = Math.round(pointF2.x);
                int round2 = Math.round(pointF2.y);
                eVar2.d = round2;
                int i7 = eVar2.f1573g + 1;
                eVar2.f1573g = i7;
                if (eVar2.f1572f == i7) {
                    View view2 = eVar2.f1571e;
                    int i8 = eVar2.f1568a;
                    int i9 = eVar2.f1569b;
                    int i10 = eVar2.f1570c;
                    b bVar2 = w.f1619a;
                    view2.setLeftTopRightBottom(i8, i9, i10, round2);
                    eVar2.f1572f = 0;
                    eVar2.f1573g = 0;
                    return;
                }
                return;
            case 2:
                View view3 = (View) obj;
                PointF pointF3 = (PointF) obj2;
                int left = view3.getLeft();
                int top = view3.getTop();
                int round3 = Math.round(pointF3.x);
                int round4 = Math.round(pointF3.y);
                b bVar3 = w.f1619a;
                view3.setLeftTopRightBottom(left, top, round3, round4);
                return;
            case 3:
                View view4 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                int round5 = Math.round(pointF4.x);
                int round6 = Math.round(pointF4.y);
                int right = view4.getRight();
                int bottom = view4.getBottom();
                b bVar4 = w.f1619a;
                view4.setLeftTopRightBottom(round5, round6, right, bottom);
                return;
            case 4:
                View view5 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int round7 = Math.round(pointF5.x);
                int round8 = Math.round(pointF5.y);
                int width = view5.getWidth() + round7;
                int height = view5.getHeight() + round8;
                b bVar5 = w.f1619a;
                view5.setLeftTopRightBottom(round7, round8, width, height);
                return;
            case 5:
                ((View) obj).setTransitionAlpha(((Float) obj2).floatValue());
                return;
            default:
                ((View) obj).setClipBounds((Rect) obj2);
                return;
        }
    }
}

package p1;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import b1.k0;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.logistics.rider.lsposed.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class b extends k0 {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f2698a;

    /* renamed from: b, reason: collision with root package name */
    public final List f2699b;

    public b() {
        Paint paint = new Paint();
        this.f2698a = paint;
        this.f2699b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0087. Please report as an issue. */
    @Override // b1.k0
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        int F;
        Canvas canvas2;
        int i3;
        float dimension = recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width);
        Paint paint = this.f2698a;
        paint.setStrokeWidth(dimension);
        Iterator it = this.f2699b.iterator();
        while (it.hasNext()) {
            ((d) it.next()).getClass();
            ThreadLocal threadLocal = c0.a.f1080a;
            float f3 = 1.0f - 0.0f;
            paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * 0.0f) + (Color.alpha(-65281) * f3)), (int) ((Color.red(-16776961) * 0.0f) + (Color.red(-65281) * f3)), (int) ((Color.green(-16776961) * 0.0f) + (Color.green(-65281) * f3)), (int) ((Color.blue(-16776961) * 0.0f) + (Color.blue(-65281) * f3))));
            int i4 = 0;
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).C0()) {
                c cVar = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f1196q;
                switch (cVar.f2701b) {
                    case 0:
                        break;
                    default:
                        i4 = cVar.f2702c.G();
                        break;
                }
                float f4 = i4;
                c cVar2 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f1196q;
                switch (cVar2.f2701b) {
                    case 0:
                        i3 = cVar2.f2702c.f875o;
                        break;
                    default:
                        CarouselLayoutManager carouselLayoutManager = cVar2.f2702c;
                        i3 = carouselLayoutManager.f875o - carouselLayoutManager.D();
                        break;
                }
                float f5 = i3;
                canvas2 = canvas;
                canvas2.drawLine(0.0f, f4, 0.0f, f5, paint);
            } else {
                c cVar3 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f1196q;
                switch (cVar3.f2701b) {
                    case 0:
                        i4 = cVar3.f2702c.E();
                    default:
                        float f6 = i4;
                        c cVar4 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f1196q;
                        switch (cVar4.f2701b) {
                            case 0:
                                CarouselLayoutManager carouselLayoutManager2 = cVar4.f2702c;
                                F = carouselLayoutManager2.f874n - carouselLayoutManager2.F();
                                break;
                            default:
                                F = cVar4.f2702c.f874n;
                                break;
                        }
                        canvas2 = canvas;
                        canvas2.drawLine(f6, 0.0f, F, 0.0f, paint);
                        break;
                }
            }
            canvas = canvas2;
        }
    }
}

package p1;

import com.google.android.material.carousel.CarouselLayoutManager;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f2700a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2701b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f2702c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(CarouselLayoutManager carouselLayoutManager, int i3) {
        this(1);
        this.f2701b = i3;
        switch (i3) {
            case 1:
                this.f2702c = carouselLayoutManager;
                this(0);
                return;
            default:
                this.f2702c = carouselLayoutManager;
                return;
        }
    }

    public final int a() {
        switch (this.f2701b) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f2702c;
                if (carouselLayoutManager.D0()) {
                    return carouselLayoutManager.f874n;
                }
                return 0;
        }
    }

    public c(int i3) {
        this.f2700a = i3;
    }
}

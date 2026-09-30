package androidx.lifecycle;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: f, reason: collision with root package name */
    public final androidx.emoji2.text.m f587f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f588g;
    public int h = -1;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ x f589i;

    public w(x xVar, androidx.emoji2.text.m mVar) {
        this.f589i = xVar;
        this.f587f = mVar;
    }

    public final void c(boolean z2) {
        int i3;
        if (z2 != this.f588g) {
            this.f588g = z2;
            if (z2) {
                i3 = 1;
            } else {
                i3 = -1;
            }
            x xVar = this.f589i;
            int i4 = xVar.f593c;
            xVar.f593c = i3 + i4;
            if (!xVar.d) {
                xVar.d = true;
                while (true) {
                    try {
                        int i5 = xVar.f593c;
                        if (i4 == i5) {
                            break;
                        } else {
                            i4 = i5;
                        }
                    } finally {
                        xVar.d = false;
                    }
                }
            }
            if (this.f588g) {
                xVar.c(this);
            }
        }
    }

    public abstract boolean e();

    public void d() {
    }
}

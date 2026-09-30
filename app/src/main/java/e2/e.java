package e2;

import com.google.android.material.internal.CheckableImageButton;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class e extends r {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1425e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(q qVar, int i3) {
        super(qVar);
        this.f1425e = i3;
    }

    @Override // e2.r
    public void q() {
        switch (this.f1425e) {
            case 0:
                q qVar = this.f1473b;
                qVar.f1465t = null;
                CheckableImageButton checkableImageButton = qVar.f1457l;
                checkableImageButton.setOnLongClickListener(null);
                a.y.b0(checkableImageButton, null);
                return;
            default:
                return;
        }
    }
}

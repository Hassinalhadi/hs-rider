package c1;

import android.os.Bundle;
import com.logistics.rider.lsposed.MainActivity;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1090a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1091b;

    public a(d dVar) {
        this.f1090a = 0;
        this.f1091b = new LinkedHashSet();
        dVar.e("androidx.savedstate.Restarter", this);
    }

    @Override // c1.c
    public final Bundle a() {
        switch (this.f1090a) {
            case 0:
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("classes_to_restore", new ArrayList<>((LinkedHashSet) this.f1091b));
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                ((MainActivity) this.f1091b).k().getClass();
                return bundle2;
        }
    }

    public a(MainActivity mainActivity) {
        this.f1090a = 1;
        this.f1091b = mainActivity;
    }
}

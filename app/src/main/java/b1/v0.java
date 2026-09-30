package b1;

import android.os.Parcel;
import android.os.Parcelable;
import k.w2;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class v0 implements Parcelable.ClassLoaderCreator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f919a;

    public /* synthetic */ v0(int i3) {
        this.f919a = i3;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f919a) {
            case 0:
                return new w0(parcel, null);
            case 1:
                return new c2.d(parcel, null);
            case 2:
                return new e2.d0(parcel, null);
            case 3:
                return new w2(parcel, null);
            case 4:
                return new n1.a(parcel, null);
            case 5:
                if (parcel.readParcelable(null) == null) {
                    return o0.b.f2611g;
                }
                a.b.i("superState must be null");
                return null;
            case 6:
                return new o1.c(parcel, null);
            case 7:
                return new w1.a(parcel, null);
            default:
                return new x.f(parcel, null);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i3) {
        switch (this.f919a) {
            case 0:
                return new w0[i3];
            case 1:
                return new c2.d[i3];
            case 2:
                return new e2.d0[i3];
            case 3:
                return new w2[i3];
            case 4:
                return new n1.a[i3];
            case 5:
                return new o0.b[i3];
            case 6:
                return new o1.c[i3];
            case 7:
                return new w1.a[i3];
            default:
                return new x.f[i3];
        }
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f919a) {
            case 0:
                return new w0(parcel, classLoader);
            case 1:
                return new c2.d(parcel, classLoader);
            case 2:
                return new e2.d0(parcel, classLoader);
            case 3:
                return new w2(parcel, classLoader);
            case 4:
                return new n1.a(parcel, classLoader);
            case 5:
                if (parcel.readParcelable(classLoader) == null) {
                    return o0.b.f2611g;
                }
                a.b.i("superState must be null");
                return null;
            case 6:
                return new o1.c(parcel, classLoader);
            case 7:
                return new w1.a(parcel, classLoader);
            default:
                return new x.f(parcel, classLoader);
        }
    }
}

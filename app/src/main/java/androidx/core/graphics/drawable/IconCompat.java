package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Parcelable;
import androidx.versionedparcelable.CustomVersionedParcelable;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f237k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a, reason: collision with root package name */
    public int f238a;

    /* renamed from: b, reason: collision with root package name */
    public Object f239b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f240c;
    public Parcelable d;

    /* renamed from: e, reason: collision with root package name */
    public int f241e;

    /* renamed from: f, reason: collision with root package name */
    public int f242f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f243g;
    public PorterDuff.Mode h;

    /* renamed from: i, reason: collision with root package name */
    public String f244i;

    /* renamed from: j, reason: collision with root package name */
    public String f245j;

    public final String toString() {
        String str;
        int i3;
        if (this.f238a == -1) {
            return String.valueOf(this.f239b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f238a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f238a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f239b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f239b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f245j);
                sb.append(" id=");
                int i4 = this.f238a;
                if (i4 == -1) {
                    i3 = ((Icon) this.f239b).getResId();
                } else if (i4 == 2) {
                    i3 = this.f241e;
                } else {
                    throw new IllegalStateException("called getResId() on " + this);
                }
                sb.append(String.format("0x%08x", Integer.valueOf(i3)));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f241e);
                if (this.f242f != 0) {
                    sb.append(" off=");
                    sb.append(this.f242f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f239b);
                break;
        }
        if (this.f243g != null) {
            sb.append(" tint=");
            sb.append(this.f243g);
        }
        if (this.h != f237k) {
            sb.append(" mode=");
            sb.append(this.h);
        }
        sb.append(")");
        return sb.toString();
    }
}

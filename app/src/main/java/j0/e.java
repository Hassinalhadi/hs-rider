package j0;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class e implements d, f {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2147f = 0;

    /* renamed from: g, reason: collision with root package name */
    public ClipData f2148g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public int f2149i;

    /* renamed from: j, reason: collision with root package name */
    public Uri f2150j;

    /* renamed from: k, reason: collision with root package name */
    public Bundle f2151k;

    public e(e eVar) {
        ClipData clipData = eVar.f2148g;
        clipData.getClass();
        this.f2148g = clipData;
        int i3 = eVar.h;
        if (i3 >= 0) {
            if (i3 <= 5) {
                this.h = i3;
                int i4 = eVar.f2149i;
                if ((i4 & 1) == i4) {
                    this.f2149i = i4;
                    this.f2150j = eVar.f2150j;
                    this.f2151k = eVar.f2151k;
                    return;
                }
                throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i4) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
            }
            Locale locale = Locale.US;
            a.b.m("source is out of range of [0, 5] (too high)");
            throw null;
        }
        Locale locale2 = Locale.US;
        a.b.m("source is out of range of [0, 5] (too low)");
        throw null;
    }

    @Override // j0.d
    public g build() {
        return new g(new e(this));
    }

    @Override // j0.f
    public ClipData f() {
        return this.f2148g;
    }

    @Override // j0.f
    public int k() {
        return this.f2149i;
    }

    @Override // j0.f
    public ContentInfo l() {
        return null;
    }

    @Override // j0.d
    public void n(Uri uri) {
        this.f2150j = uri;
    }

    @Override // j0.f
    public int o() {
        return this.h;
    }

    @Override // j0.d
    public void r(int i3) {
        this.f2149i = i3;
    }

    @Override // j0.d
    public void setExtras(Bundle bundle) {
        this.f2151k = bundle;
    }

    public String toString() {
        String str;
        String valueOf;
        String str2;
        switch (this.f2147f) {
            case 1:
                Uri uri = this.f2150j;
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(this.f2148g.getDescription());
                sb.append(", source=");
                int i3 = this.h;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                if (i3 != 4) {
                                    if (i3 != 5) {
                                        str = String.valueOf(i3);
                                    } else {
                                        str = "SOURCE_PROCESS_TEXT";
                                    }
                                } else {
                                    str = "SOURCE_AUTOFILL";
                                }
                            } else {
                                str = "SOURCE_DRAG_AND_DROP";
                            }
                        } else {
                            str = "SOURCE_INPUT_METHOD";
                        }
                    } else {
                        str = "SOURCE_CLIPBOARD";
                    }
                } else {
                    str = "SOURCE_APP";
                }
                sb.append(str);
                sb.append(", flags=");
                int i4 = this.f2149i;
                if ((i4 & 1) != 0) {
                    valueOf = "FLAG_CONVERT_TO_PLAIN_TEXT";
                } else {
                    valueOf = String.valueOf(i4);
                }
                sb.append(valueOf);
                String str3 = "";
                if (uri == null) {
                    str2 = "";
                } else {
                    str2 = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str2);
                if (this.f2151k != null) {
                    str3 = ", hasExtras";
                }
                sb.append(str3);
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ e() {
    }
}

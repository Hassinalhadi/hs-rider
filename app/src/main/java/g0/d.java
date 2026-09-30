package g0;

import android.util.Base64;
import java.util.List;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f1786a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1787b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1788c;
    public final List d;

    /* renamed from: e, reason: collision with root package name */
    public final String f1789e;

    public d(String str, String str2, String str3, List list) {
        str.getClass();
        this.f1786a = str;
        str2.getClass();
        this.f1787b = str2;
        this.f1788c = str3;
        list.getClass();
        this.d = list;
        this.f1789e = str + "-" + str2 + "-" + str3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f1786a + ", mProviderPackage: " + this.f1787b + ", mQuery: " + this.f1788c + ", mCertificates:");
        int i3 = 0;
        while (true) {
            List list = this.d;
            if (i3 < list.size()) {
                sb.append(" [");
                List list2 = (List) list.get(i3);
                for (int i4 = 0; i4 < list2.size(); i4++) {
                    sb.append(" \"");
                    sb.append(Base64.encodeToString((byte[]) list2.get(i4), 0));
                    sb.append("\"");
                }
                sb.append(" ]");
                i3++;
            } else {
                sb.append("}mCertificatesArray: 0");
                return sb.toString();
            }
        }
    }
}

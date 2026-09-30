package f0;

import android.os.LocaleList;
import java.util.Locale;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final e f1557b = new e(new f(new LocaleList(new Locale[0])));

    /* renamed from: a, reason: collision with root package name */
    public final f f1558a;

    public e(f fVar) {
        this.f1558a = fVar;
    }

    public static e a(String str) {
        if (str != null && !str.isEmpty()) {
            String[] split = str.split(",", -1);
            int length = split.length;
            Locale[] localeArr = new Locale[length];
            for (int i3 = 0; i3 < length; i3++) {
                String str2 = split[i3];
                int i4 = d.f1556a;
                localeArr[i3] = Locale.forLanguageTag(str2);
            }
            return new e(new f(new LocaleList(localeArr)));
        }
        return f1557b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            if (this.f1558a.equals(((e) obj).f1558a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f1558a.f1559a.hashCode();
    }

    public final String toString() {
        return this.f1558a.f1559a.toString();
    }
}

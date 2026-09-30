package g;

import android.content.res.Configuration;
import android.os.LocaleList;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public abstract class u {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (!locales.equals(locales2)) {
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }
    }

    public static f0.e b(Configuration configuration) {
        return f0.e.a(configuration.getLocales().toLanguageTags());
    }

    public static void c(f0.e eVar) {
        LocaleList.setDefault(LocaleList.forLanguageTags(eVar.f1558a.f1559a.toLanguageTags()));
    }

    public static void d(Configuration configuration, f0.e eVar) {
        configuration.setLocales(LocaleList.forLanguageTags(eVar.f1558a.f1559a.toLanguageTags()));
    }
}

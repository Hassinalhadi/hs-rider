package j0;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public abstract class i0 {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static g b(View view, g gVar) {
        ContentInfo l3 = gVar.f2152a.l();
        Objects.requireNonNull(l3);
        ContentInfo performReceiveContent = view.performReceiveContent(l3);
        if (performReceiveContent == null) {
            return null;
        }
        if (performReceiveContent == l3) {
            return gVar;
        }
        return new g(new androidx.emoji2.text.m(performReceiveContent));
    }
}

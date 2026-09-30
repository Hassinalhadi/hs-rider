package f1;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.util.Property;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public abstract class i {
    public static <T, V> ObjectAnimator a(T t3, Property<T, V> property, Path path) {
        return ObjectAnimator.ofObject(t3, property, (TypeConverter) null, path);
    }
}

package k;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public abstract class m1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Field f2322a;

    static {
        Field field = null;
        try {
            field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            field.setAccessible(true);
        } catch (NoSuchFieldException e3) {
            e3.printStackTrace();
        }
        f2322a = field;
    }
}

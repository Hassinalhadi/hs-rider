package i;

import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.Window;
import java.util.List;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public abstract class l {
    public static void a(Window.Callback callback, List<KeyboardShortcutGroup> list, Menu menu, int i3) {
        callback.onProvideKeyboardShortcuts(list, menu, i3);
    }
}

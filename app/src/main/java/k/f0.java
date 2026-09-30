package k;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public abstract class f0 {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        j0.d dVar;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                dVar = new androidx.emoji2.text.m(clipData, 3);
            } else {
                j0.e eVar = new j0.e();
                eVar.f2148g = clipData;
                eVar.h = 3;
                dVar = eVar;
            }
            j0.j0.e(textView, dVar.build());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        j0.d dVar;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            dVar = new androidx.emoji2.text.m(clipData, 3);
        } else {
            j0.e eVar = new j0.e();
            eVar.f2148g = clipData;
            eVar.h = 3;
            dVar = eVar;
        }
        j0.j0.e(view, dVar.build());
        return true;
    }
}

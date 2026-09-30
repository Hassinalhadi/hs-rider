package s0;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class b extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f2947a;

    /* renamed from: b, reason: collision with root package name */
    public final b2.f f2948b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        super(inputConnection, false);
        int i3;
        b2.f fVar = new b2.f(18);
        this.f2947a = textView;
        this.f2948b = fVar;
        if (androidx.emoji2.text.j.f286k != null) {
            androidx.emoji2.text.j a3 = androidx.emoji2.text.j.a();
            if (a3.b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            androidx.emoji2.text.e eVar = a3.f290e;
            eVar.getClass();
            Bundle bundle = editorInfo.extras;
            r0.b bVar = (r0.b) eVar.f279c.f320f;
            int a4 = bVar.a(4);
            if (a4 != 0) {
                i3 = ((ByteBuffer) bVar.d).getInt(a4 + bVar.f2190a);
            } else {
                i3 = 0;
            }
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", i3);
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i3, int i4) {
        Editable editableText = this.f2947a.getEditableText();
        this.f2948b.getClass();
        if (!b2.f.l(this, editableText, i3, i4, false) && !super.deleteSurroundingText(i3, i4)) {
            return false;
        }
        return true;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i3, int i4) {
        Editable editableText = this.f2947a.getEditableText();
        this.f2948b.getClass();
        if (b2.f.l(this, editableText, i3, i4, true) || super.deleteSurroundingTextInCodePoints(i3, i4)) {
            return true;
        }
        return false;
    }
}

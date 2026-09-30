package s0;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
import androidx.emoji2.text.s;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class e implements KeyListener {

    /* renamed from: a, reason: collision with root package name */
    public final KeyListener f2953a;

    public e(KeyListener keyListener) {
        this.f2953a = keyListener;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i3) {
        this.f2953a.clearMetaKeyState(view, editable, i3);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f2953a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i3, KeyEvent keyEvent) {
        boolean c3;
        boolean z2;
        if (i3 != 67) {
            if (i3 != 112) {
                c3 = false;
            } else {
                c3 = s.c(editable, keyEvent, true);
            }
        } else {
            c3 = s.c(editable, keyEvent, false);
        }
        if (c3) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 || this.f2953a.onKeyDown(view, editable, i3, keyEvent)) {
            return true;
        }
        return false;
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f2953a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i3, KeyEvent keyEvent) {
        return this.f2953a.onKeyUp(view, editable, i3, keyEvent);
    }
}

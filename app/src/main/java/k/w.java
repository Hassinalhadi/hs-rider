package k;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import com.logistics.rider.lsposed.R;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public class w extends EditText implements j0.o {

    /* renamed from: f, reason: collision with root package name */
    public final p f2416f;

    /* renamed from: g, reason: collision with root package name */
    public final w0 f2417g;
    public final n0.h h;

    /* renamed from: i, reason: collision with root package name */
    public final c0 f2418i;

    /* renamed from: j, reason: collision with root package name */
    public v f2419j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, n0.h] */
    public w(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        n2.a(context);
        m2.a(this, getContext());
        p pVar = new p(this);
        this.f2416f = pVar;
        pVar.d(attributeSet, R.attr.editTextStyle);
        w0 w0Var = new w0(this);
        this.f2417g = w0Var;
        w0Var.f(attributeSet, R.attr.editTextStyle);
        w0Var.b();
        this.h = new Object();
        c0 c0Var = new c0(this);
        this.f2418i = c0Var;
        c0Var.c(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener b3 = c0Var.b(keyListener);
            if (b3 != keyListener) {
                super.setKeyListener(b3);
                super.setRawInputType(inputType);
                super.setFocusable(isFocusable);
                super.setClickable(isClickable);
                super.setLongClickable(isLongClickable);
            }
        }
    }

    private v getSuperCaller() {
        if (this.f2419j == null) {
            this.f2419j = new v(this);
        }
        return this.f2419j;
    }

    @Override // j0.o
    public final j0.g a(j0.g gVar) {
        this.h.getClass();
        return n0.h.a(this, gVar);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        p pVar = this.f2416f;
        if (pVar != null) {
            pVar.a();
        }
        w0 w0Var = this.f2417g;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    public ColorStateList getSupportBackgroundTintList() {
        p pVar = this.f2416f;
        if (pVar != null) {
            return pVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        p pVar = this.f2416f;
        if (pVar != null) {
            return pVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2417g.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2417g.e();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        return super.getTextClassifier();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] c3;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f2417g.getClass();
        a.y.O(editorInfo, onCreateInputConnection, this);
        if (onCreateInputConnection != null && Build.VERSION.SDK_INT <= 30 && (c3 = j0.j0.c(this)) != null) {
            editorInfo.contentMimeTypes = c3;
            onCreateInputConnection = new l0.a(onCreateInputConnection, new a.c0(this));
        }
        return this.f2418i.d(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (Build.VERSION.SDK_INT < 33) {
            ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean z2 = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && j0.j0.c(this) != null) {
            Context context = getContext();
            while (true) {
                if (context instanceof ContextWrapper) {
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    activity = null;
                    break;
                }
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                z2 = f0.a(dragEvent, this, activity);
            }
        }
        if (z2) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i3) {
        ClipData primaryClip;
        j0.d dVar;
        int i4;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < 31 && j0.j0.c(this) != null && (i3 == 16908322 || i3 == 16908337)) {
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            if (clipboardManager == null) {
                primaryClip = null;
            } else {
                primaryClip = clipboardManager.getPrimaryClip();
            }
            if (primaryClip != null && primaryClip.getItemCount() > 0) {
                if (i5 >= 31) {
                    dVar = new androidx.emoji2.text.m(primaryClip, 1);
                } else {
                    j0.e eVar = new j0.e();
                    eVar.f2148g = primaryClip;
                    eVar.h = 1;
                    dVar = eVar;
                }
                if (i3 == 16908322) {
                    i4 = 0;
                } else {
                    i4 = 1;
                }
                dVar.r(i4);
                j0.j0.e(this, dVar.build());
            }
            return true;
        }
        return super.onTextContextMenuItem(i3);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        p pVar = this.f2416f;
        if (pVar != null) {
            pVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        p pVar = this.f2416f;
        if (pVar != null) {
            pVar.f(i3);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        w0 w0Var = this.f2417g;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        w0 w0Var = this.f2417g;
        if (w0Var != null) {
            w0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z2) {
        this.f2418i.e(z2);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f2418i.b(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        p pVar = this.f2416f;
        if (pVar != null) {
            pVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        p pVar = this.f2416f;
        if (pVar != null) {
            pVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        w0 w0Var = this.f2417g;
        w0Var.h(colorStateList);
        w0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        w0 w0Var = this.f2417g;
        w0Var.i(mode);
        w0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i3) {
        super.setTextAppearance(context, i3);
        w0 w0Var = this.f2417g;
        if (w0Var != null) {
            w0Var.g(context, i3);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        super.setTextClassifier(textClassifier);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return super.getText();
    }
}

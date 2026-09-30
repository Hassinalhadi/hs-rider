package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.g;
import k.l2;
import k.o;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public class SearchView$SearchAutoComplete extends o {

    /* renamed from: j, reason: collision with root package name */
    public int f170j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f171k;

    /* renamed from: l, reason: collision with root package name */
    public final g f172l;

    public SearchView$SearchAutoComplete(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f172l = new g(8, this);
        this.f170j = getThreshold();
    }

    private int getSearchViewTextMinWidthDp() {
        Configuration configuration = getResources().getConfiguration();
        int i3 = configuration.screenWidthDp;
        int i4 = configuration.screenHeightDp;
        if (i3 >= 960 && i4 >= 720 && configuration.orientation == 2) {
            return 256;
        }
        if (i3 < 600) {
            if (i3 < 640 || i4 < 480) {
                return 160;
            }
            return 192;
        }
        return 192;
    }

    @Override // android.widget.AutoCompleteTextView
    public final boolean enoughToFilter() {
        if (this.f170j > 0 && !super.enoughToFilter()) {
            return false;
        }
        return true;
    }

    @Override // k.o, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (this.f171k) {
            g gVar = this.f172l;
            removeCallbacks(gVar);
            post(gVar);
        }
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z2, int i3, Rect rect) {
        super.onFocusChanged(z2, i3, rect);
        throw null;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i3, KeyEvent keyEvent) {
        if (i3 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                if (keyDispatcherState != null) {
                    keyDispatcherState.startTracking(keyEvent, this);
                }
                return true;
            }
            if (keyEvent.getAction() == 1) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.handleUpEvent(keyEvent);
                }
                if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                    throw null;
                }
            }
        }
        return super.onKeyPreIme(i3, keyEvent);
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        if (!z2) {
        } else {
            throw null;
        }
    }

    public void setImeVisibility(boolean z2) {
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        g gVar = this.f172l;
        if (!z2) {
            this.f171k = false;
            removeCallbacks(gVar);
            inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        } else {
            if (inputMethodManager.isActive(this)) {
                this.f171k = false;
                removeCallbacks(gVar);
                inputMethodManager.showSoftInput(this, 0);
                return;
            }
            this.f171k = true;
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setThreshold(int i3) {
        super.setThreshold(i3);
        this.f170j = i3;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void replaceText(CharSequence charSequence) {
    }

    public void setSearchView(l2 l2Var) {
    }

    @Override // android.widget.AutoCompleteTextView
    public final void performCompletion() {
    }
}

package l0;

import a.c0;
import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import androidx.emoji2.text.m;
import j0.d;
import j0.e;
import j0.j0;
import k.w;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class a extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c0 f2493a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(InputConnection inputConnection, c0 c0Var) {
        super(inputConnection, false);
        this.f2493a = c0Var;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i3, Bundle bundle) {
        m mVar;
        Bundle bundle2;
        d dVar;
        if (inputContentInfo == null) {
            mVar = null;
        } else {
            mVar = new m(21, new m(20, inputContentInfo));
        }
        w wVar = (w) this.f2493a.f9f;
        if ((i3 & 1) != 0) {
            try {
                ((InputContentInfo) ((m) mVar.f299g).f299g).requestPermission();
                InputContentInfo inputContentInfo2 = (InputContentInfo) ((m) mVar.f299g).f299g;
                if (bundle == null) {
                    bundle2 = new Bundle();
                } else {
                    bundle2 = new Bundle(bundle);
                }
                bundle2.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo2);
            } catch (Exception e3) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e3);
            }
        } else {
            bundle2 = bundle;
        }
        InputContentInfo inputContentInfo3 = (InputContentInfo) ((m) mVar.f299g).f299g;
        ClipData clipData = new ClipData(inputContentInfo3.getDescription(), new ClipData.Item(inputContentInfo3.getContentUri()));
        if (Build.VERSION.SDK_INT >= 31) {
            dVar = new m(clipData, 2);
        } else {
            e eVar = new e();
            eVar.f2148g = clipData;
            eVar.h = 2;
            dVar = eVar;
        }
        dVar.n(inputContentInfo3.getLinkUri());
        dVar.setExtras(bundle2);
        if (j0.e(wVar, dVar.build()) == null) {
            return true;
        }
        return super.commitContent(inputContentInfo, i3, bundle);
    }
}

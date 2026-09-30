package androidx.fragment.app;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.logistics.rider.lsposed.R;
import java.io.PrintWriter;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public class p extends u implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public final m Y;
    public final n Z;
    public int a0;

    /* renamed from: b0, reason: collision with root package name */
    public int f453b0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f454c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f455d0;
    public int e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f456f0;

    /* renamed from: g0, reason: collision with root package name */
    public final androidx.emoji2.text.m f457g0;

    /* renamed from: h0, reason: collision with root package name */
    public Dialog f458h0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f459i0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f460j0;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f461k0;

    public p() {
        new g(1, this);
        this.Y = new m(this);
        this.Z = new n(this);
        this.a0 = 0;
        this.f453b0 = 0;
        this.f454c0 = true;
        this.f455d0 = true;
        this.e0 = -1;
        this.f457g0 = new androidx.emoji2.text.m(2, this);
        this.f461k0 = false;
    }

    @Override // androidx.fragment.app.u
    public final void A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.A(layoutInflater, viewGroup, bundle);
        if (this.J == null && this.f458h0 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.f458h0.onRestoreInstanceState(bundle2);
        }
    }

    public Dialog F() {
        if (k0.F(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new a.p(B(), this.f453b0);
    }

    @Override // androidx.fragment.app.u
    public final a.y c() {
        return new o(this, new r(this));
    }

    @Override // androidx.fragment.app.u
    public final void o() {
        this.H = true;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.f459i0) {
            if (k0.F(3)) {
                Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
            }
            if (!this.f460j0) {
                this.f460j0 = true;
                Dialog dialog = this.f458h0;
                if (dialog != null) {
                    dialog.setOnDismissListener(null);
                    this.f458h0.dismiss();
                }
                this.f459i0 = true;
                if (this.e0 >= 0) {
                    k0 j3 = j();
                    int i3 = this.e0;
                    if (i3 >= 0) {
                        j3.w(new j0(j3, i3), true);
                        this.e0 = -1;
                        return;
                    } else {
                        a.b.m(w0.d("Bad id: ", i3));
                        return;
                    }
                }
                a aVar = new a(j());
                aVar.f346o = true;
                k0 k0Var = this.f507w;
                if (k0Var != null && k0Var != aVar.f347p) {
                    throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
                }
                aVar.b(new r0(3, this));
                if (!aVar.f348q) {
                    if (k0.F(2)) {
                        Log.v("FragmentManager", "Commit: " + aVar);
                        PrintWriter printWriter = new PrintWriter(new t0());
                        aVar.d("  ", printWriter, true);
                        printWriter.close();
                    }
                    aVar.f348q = true;
                    boolean z2 = aVar.f339g;
                    k0 k0Var2 = aVar.f347p;
                    if (z2) {
                        aVar.f349r = k0Var2.f403i.getAndIncrement();
                    } else {
                        aVar.f349r = -1;
                    }
                    k0Var2.w(aVar, true);
                    return;
                }
                a.b.i("commit already called");
            }
        }
    }

    @Override // androidx.fragment.app.u
    public final void q(Context context) {
        super.q(context);
        this.T.d(this.f457g0);
        this.f460j0 = false;
    }

    @Override // androidx.fragment.app.u
    public void r(Bundle bundle) {
        boolean z2;
        super.r(bundle);
        new Handler();
        if (this.B == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f455d0 = z2;
        if (bundle != null) {
            this.a0 = bundle.getInt("android:style", 0);
            this.f453b0 = bundle.getInt("android:theme", 0);
            this.f454c0 = bundle.getBoolean("android:cancelable", true);
            this.f455d0 = bundle.getBoolean("android:showsDialog", this.f455d0);
            this.e0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.u
    public final void t() {
        this.H = true;
        Dialog dialog = this.f458h0;
        if (dialog != null) {
            this.f459i0 = true;
            dialog.setOnDismissListener(null);
            this.f458h0.dismiss();
            if (!this.f460j0) {
                onDismiss(this.f458h0);
            }
            this.f458h0 = null;
            this.f461k0 = false;
        }
    }

    @Override // androidx.fragment.app.u
    public final void u() {
        this.H = true;
        if (!this.f460j0) {
            this.f460j0 = true;
        }
        androidx.lifecycle.x xVar = this.T;
        xVar.getClass();
        androidx.lifecycle.x.a("removeObserver");
        androidx.lifecycle.w wVar = (androidx.lifecycle.w) xVar.f592b.b(this.f457g0);
        if (wVar == null) {
            return;
        }
        wVar.d();
        wVar.c(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0044 A[Catch: all -> 0x004c, TryCatch #0 {all -> 0x004c, blocks: (B:10:0x001a, B:12:0x0026, B:18:0x003e, B:20:0x0044, B:21:0x004e, B:23:0x0030, B:25:0x0036, B:26:0x003b, B:27:0x0066), top: B:9:0x001a }] */
    @Override // androidx.fragment.app.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.LayoutInflater v(android.os.Bundle r8) {
        /*
            r7 = this;
            android.view.LayoutInflater r8 = super.v(r8)
            boolean r0 = r7.f455d0
            java.lang.String r1 = "FragmentManager"
            r2 = 2
            if (r0 == 0) goto L98
            boolean r3 = r7.f456f0
            if (r3 == 0) goto L11
            goto L98
        L11:
            if (r0 != 0) goto L14
            goto L6f
        L14:
            boolean r0 = r7.f461k0
            if (r0 != 0) goto L6f
            r0 = 0
            r3 = 1
            r7.f456f0 = r3     // Catch: java.lang.Throwable -> L4c
            android.app.Dialog r4 = r7.F()     // Catch: java.lang.Throwable -> L4c
            r7.f458h0 = r4     // Catch: java.lang.Throwable -> L4c
            boolean r5 = r7.f455d0     // Catch: java.lang.Throwable -> L4c
            if (r5 == 0) goto L66
            int r5 = r7.a0     // Catch: java.lang.Throwable -> L4c
            if (r5 == r3) goto L3b
            if (r5 == r2) goto L3b
            r6 = 3
            if (r5 == r6) goto L30
            goto L3e
        L30:
            android.view.Window r5 = r4.getWindow()     // Catch: java.lang.Throwable -> L4c
            if (r5 == 0) goto L3b
            r6 = 24
            r5.addFlags(r6)     // Catch: java.lang.Throwable -> L4c
        L3b:
            r4.requestWindowFeature(r3)     // Catch: java.lang.Throwable -> L4c
        L3e:
            android.content.Context r4 = r7.h()     // Catch: java.lang.Throwable -> L4c
            if (r4 == 0) goto L4e
            android.app.Dialog r5 = r7.f458h0     // Catch: java.lang.Throwable -> L4c
            android.app.Activity r4 = (android.app.Activity) r4     // Catch: java.lang.Throwable -> L4c
            r5.setOwnerActivity(r4)     // Catch: java.lang.Throwable -> L4c
            goto L4e
        L4c:
            r8 = move-exception
            goto L6c
        L4e:
            android.app.Dialog r4 = r7.f458h0     // Catch: java.lang.Throwable -> L4c
            boolean r5 = r7.f454c0     // Catch: java.lang.Throwable -> L4c
            r4.setCancelable(r5)     // Catch: java.lang.Throwable -> L4c
            android.app.Dialog r4 = r7.f458h0     // Catch: java.lang.Throwable -> L4c
            androidx.fragment.app.m r5 = r7.Y     // Catch: java.lang.Throwable -> L4c
            r4.setOnCancelListener(r5)     // Catch: java.lang.Throwable -> L4c
            android.app.Dialog r4 = r7.f458h0     // Catch: java.lang.Throwable -> L4c
            androidx.fragment.app.n r5 = r7.Z     // Catch: java.lang.Throwable -> L4c
            r4.setOnDismissListener(r5)     // Catch: java.lang.Throwable -> L4c
            r7.f461k0 = r3     // Catch: java.lang.Throwable -> L4c
            goto L69
        L66:
            r3 = 0
            r7.f458h0 = r3     // Catch: java.lang.Throwable -> L4c
        L69:
            r7.f456f0 = r0
            goto L6f
        L6c:
            r7.f456f0 = r0
            throw r8
        L6f:
            boolean r0 = androidx.fragment.app.k0.F(r2)
            if (r0 == 0) goto L8b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "get layout inflater for DialogFragment "
            r0.<init>(r2)
            r0.append(r7)
            java.lang.String r2 = " from dialog context"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L8b:
            android.app.Dialog r7 = r7.f458h0
            if (r7 == 0) goto Lc3
            android.content.Context r7 = r7.getContext()
            android.view.LayoutInflater r7 = r8.cloneInContext(r7)
            return r7
        L98:
            boolean r0 = androidx.fragment.app.k0.F(r2)
            if (r0 == 0) goto Lc3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "getting layout inflater for DialogFragment "
            r0.<init>(r2)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            boolean r7 = r7.f455d0
            if (r7 != 0) goto Lba
            java.lang.String r7 = "mShowsDialog = false: "
            java.lang.String r7 = r7.concat(r0)
            android.util.Log.d(r1, r7)
            return r8
        Lba:
            java.lang.String r7 = "mCreatingDialog = true: "
            java.lang.String r7 = r7.concat(r0)
            android.util.Log.d(r1, r7)
        Lc3:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.p.v(android.os.Bundle):android.view.LayoutInflater");
    }

    @Override // androidx.fragment.app.u
    public void w(Bundle bundle) {
        Dialog dialog = this.f458h0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i3 = this.a0;
        if (i3 != 0) {
            bundle.putInt("android:style", i3);
        }
        int i4 = this.f453b0;
        if (i4 != 0) {
            bundle.putInt("android:theme", i4);
        }
        boolean z2 = this.f454c0;
        if (!z2) {
            bundle.putBoolean("android:cancelable", z2);
        }
        boolean z3 = this.f455d0;
        if (!z3) {
            bundle.putBoolean("android:showsDialog", z3);
        }
        int i5 = this.e0;
        if (i5 != -1) {
            bundle.putInt("android:backStackId", i5);
        }
    }

    @Override // androidx.fragment.app.u
    public void x() {
        this.H = true;
        Dialog dialog = this.f458h0;
        if (dialog != null) {
            this.f459i0 = false;
            dialog.show();
            View decorView = this.f458h0.getWindow().getDecorView();
            decorView.getClass();
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // androidx.fragment.app.u
    public void y() {
        this.H = true;
        Dialog dialog = this.f458h0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.u
    public final void z(Bundle bundle) {
        Bundle bundle2;
        this.H = true;
        if (this.f458h0 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.f458h0.onRestoreInstanceState(bundle2);
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }
}

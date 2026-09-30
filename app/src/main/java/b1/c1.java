package b1;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public abstract class c1 {

    /* renamed from: t, reason: collision with root package name */
    public static final List f728t = Collections.EMPTY_LIST;

    /* renamed from: a, reason: collision with root package name */
    public final View f729a;

    /* renamed from: b, reason: collision with root package name */
    public WeakReference f730b;

    /* renamed from: j, reason: collision with root package name */
    public int f736j;

    /* renamed from: r, reason: collision with root package name */
    public RecyclerView f744r;

    /* renamed from: s, reason: collision with root package name */
    public e0 f745s;

    /* renamed from: c, reason: collision with root package name */
    public int f731c = -1;
    public int d = -1;

    /* renamed from: e, reason: collision with root package name */
    public long f732e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f733f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f734g = -1;
    public c1 h = null;

    /* renamed from: i, reason: collision with root package name */
    public c1 f735i = null;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f737k = null;

    /* renamed from: l, reason: collision with root package name */
    public final List f738l = null;

    /* renamed from: m, reason: collision with root package name */
    public int f739m = 0;

    /* renamed from: n, reason: collision with root package name */
    public t0 f740n = null;

    /* renamed from: o, reason: collision with root package name */
    public boolean f741o = false;

    /* renamed from: p, reason: collision with root package name */
    public int f742p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f743q = -1;

    public c1(View view) {
        if (view != null) {
            this.f729a = view;
        } else {
            a.b.m("itemView may not be null");
            throw null;
        }
    }

    public final void a(int i3) {
        this.f736j = i3 | this.f736j;
    }

    public final int b() {
        int i3 = this.f734g;
        if (i3 == -1) {
            return this.f731c;
        }
        return i3;
    }

    public final List c() {
        ArrayList arrayList;
        if ((this.f736j & 1024) == 0 && (arrayList = this.f737k) != null && arrayList.size() != 0) {
            return this.f738l;
        }
        return f728t;
    }

    public final boolean d() {
        View view = this.f729a;
        if (view.getParent() != null && view.getParent() != this.f744r) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if ((this.f736j & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        if ((this.f736j & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        if ((this.f736j & 16) == 0) {
            WeakHashMap weakHashMap = j0.j0.f2160a;
            if (!this.f729a.hasTransientState()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean h() {
        if ((this.f736j & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean i() {
        if (this.f740n != null) {
            return true;
        }
        return false;
    }

    public final boolean j() {
        if ((this.f736j & 256) != 0) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        if ((this.f736j & 2) != 0) {
            return true;
        }
        return false;
    }

    public final void l(int i3, boolean z2) {
        if (this.d == -1) {
            this.d = this.f731c;
        }
        if (this.f734g == -1) {
            this.f734g = this.f731c;
        }
        if (z2) {
            this.f734g += i3;
        }
        this.f731c += i3;
        View view = this.f729a;
        if (view.getLayoutParams() != null) {
            ((o0) view.getLayoutParams()).f879c = true;
        }
    }

    public final void m() {
        this.f736j = 0;
        this.f731c = -1;
        this.d = -1;
        this.f732e = -1L;
        this.f734g = -1;
        this.f739m = 0;
        this.h = null;
        this.f735i = null;
        ArrayList arrayList = this.f737k;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f736j &= -1025;
        this.f742p = 0;
        this.f743q = -1;
        RecyclerView.j(this);
    }

    public final void n(boolean z2) {
        int i3;
        int i4 = this.f739m;
        if (z2) {
            i3 = i4 - 1;
        } else {
            i3 = i4 + 1;
        }
        this.f739m = i3;
        if (i3 < 0) {
            this.f739m = 0;
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            return;
        }
        if (!z2 && i3 == 1) {
            this.f736j |= 16;
        } else if (z2 && i3 == 0) {
            this.f736j &= -17;
        }
    }

    public final boolean o() {
        if ((this.f736j & 128) != 0) {
            return true;
        }
        return false;
    }

    public final boolean p() {
        if ((this.f736j & 32) != 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String simpleName;
        String str;
        if (getClass().isAnonymousClass()) {
            simpleName = "ViewHolder";
        } else {
            simpleName = getClass().getSimpleName();
        }
        StringBuilder sb = new StringBuilder(simpleName + "{" + Integer.toHexString(hashCode()) + " position=" + this.f731c + " id=" + this.f732e + ", oldPos=" + this.d + ", pLpos:" + this.f734g);
        if (i()) {
            sb.append(" scrap ");
            if (this.f741o) {
                str = "[changeScrap]";
            } else {
                str = "[attachedScrap]";
            }
            sb.append(str);
        }
        if (f()) {
            sb.append(" invalid");
        }
        if (!e()) {
            sb.append(" unbound");
        }
        if ((this.f736j & 2) != 0) {
            sb.append(" update");
        }
        if (h()) {
            sb.append(" removed");
        }
        if (o()) {
            sb.append(" ignored");
        }
        if (j()) {
            sb.append(" tmpDetached");
        }
        if (!g()) {
            sb.append(" not recyclable(" + this.f739m + ")");
        }
        if ((this.f736j & 512) != 0 || f()) {
            sb.append(" undefined adapter position");
        }
        if (this.f729a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }
}

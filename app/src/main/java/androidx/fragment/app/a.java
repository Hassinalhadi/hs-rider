package androidx.fragment.app;

import android.util.Log;
import java.io.PrintWriter;
import java.util.ArrayList;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class a implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f334a;

    /* renamed from: b, reason: collision with root package name */
    public int f335b;

    /* renamed from: c, reason: collision with root package name */
    public int f336c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f337e;

    /* renamed from: f, reason: collision with root package name */
    public int f338f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f339g;
    public String h;

    /* renamed from: i, reason: collision with root package name */
    public int f340i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f341j;

    /* renamed from: k, reason: collision with root package name */
    public int f342k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f343l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f344m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f345n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f346o;

    /* renamed from: p, reason: collision with root package name */
    public final k0 f347p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f348q;

    /* renamed from: r, reason: collision with root package name */
    public int f349r;

    public a(k0 k0Var) {
        k0Var.C();
        w wVar = k0Var.f414t;
        if (wVar != null) {
            wVar.f522g.getClassLoader();
        }
        this.f334a = new ArrayList();
        this.f346o = false;
        this.f349r = -1;
        this.f347p = k0Var;
    }

    @Override // androidx.fragment.app.i0
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (k0.F(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (this.f339g) {
            k0 k0Var = this.f347p;
            if (k0Var.d == null) {
                k0Var.d = new ArrayList();
            }
            k0Var.d.add(this);
            return true;
        }
        return true;
    }

    public final void b(r0 r0Var) {
        this.f334a.add(r0Var);
        r0Var.d = this.f335b;
        r0Var.f473e = this.f336c;
        r0Var.f474f = this.d;
        r0Var.f475g = this.f337e;
    }

    public final void c(int i3) {
        if (this.f339g) {
            if (k0.F(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i3);
            }
            ArrayList arrayList = this.f334a;
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                r0 r0Var = (r0) arrayList.get(i4);
                u uVar = r0Var.f471b;
                if (uVar != null) {
                    uVar.f506v += i3;
                    if (k0.F(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + r0Var.f471b + " to " + r0Var.f471b.f506v);
                    }
                }
            }
        }
    }

    public final void d(String str, PrintWriter printWriter, boolean z2) {
        String str2;
        if (z2) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.h);
            printWriter.print(" mIndex=");
            printWriter.print(this.f349r);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f348q);
            if (this.f338f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f338f));
            }
            if (this.f335b != 0 || this.f336c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f335b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f336c));
            }
            if (this.d != 0 || this.f337e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f337e));
            }
            if (this.f340i != 0 || this.f341j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f340i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f341j);
            }
            if (this.f342k != 0 || this.f343l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f342k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f343l);
            }
        }
        ArrayList arrayList = this.f334a;
        if (!arrayList.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                r0 r0Var = (r0) arrayList.get(i3);
                switch (r0Var.f470a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + r0Var.f470a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(r0Var.f471b);
                if (z2) {
                    if (r0Var.d != 0 || r0Var.f473e != 0) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(r0Var.d));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(r0Var.f473e));
                    }
                    if (r0Var.f474f != 0 || r0Var.f475g != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(r0Var.f474f));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(r0Var.f475g));
                    }
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f349r >= 0) {
            sb.append(" #");
            sb.append(this.f349r);
        }
        if (this.h != null) {
            sb.append(" ");
            sb.append(this.h);
        }
        sb.append("}");
        return sb.toString();
    }
}

package androidx.emoji2.text;

import android.animation.Animator;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.ActionMode;
import android.view.Choreographer;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsController;
import android.view.animation.Animation;
import android.widget.EditText;
import androidx.fragment.app.v0;
import b1.c1;
import b1.i0;
import b1.i1;
import b1.l0;
import b1.l1;
import b1.m1;
import g.c0;
import j0.j0;
import j0.k0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public class p implements q, f0.b, j0.n {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f300f;

    /* renamed from: g, reason: collision with root package name */
    public Object f301g;
    public Object h;

    public p(int i3) {
        this.f300f = i3;
        switch (i3) {
            case 8:
                this.f301g = new n.j(0);
                this.h = new n.h();
                return;
            case 17:
                this.f301g = Choreographer.getInstance();
                this.h = Looper.myLooper();
                return;
            default:
                this.f301g = new SparseIntArray();
                this.h = new SparseIntArray();
                return;
        }
    }

    public static int v(int i3, int i4) {
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < i3; i7++) {
            i5++;
            if (i5 == i4) {
                i6++;
                i5 = 0;
            } else if (i5 > i4) {
                i6++;
                i5 = 1;
            }
        }
        if (i5 + 1 > i4) {
            return i6 + 1;
        }
        return i6;
    }

    public void A(i.a aVar) {
        w wVar = (w) this.f301g;
        ((ActionMode.Callback) wVar.f320f).onDestroyActionMode(wVar.h(aVar));
        c0 c0Var = (c0) this.h;
        if (c0Var.B != null) {
            c0Var.f1670q.getDecorView().removeCallbacks(c0Var.C);
        }
        if (c0Var.A != null) {
            k0 k0Var = c0Var.D;
            if (k0Var != null) {
                k0Var.b();
            }
            k0 a3 = j0.a(c0Var.A);
            a3.a(0.0f);
            c0Var.D = a3;
            a3.d(new g.s(2, this));
        }
        c0Var.f1679z = null;
        ViewGroup viewGroup = c0Var.F;
        WeakHashMap weakHashMap = j0.f2160a;
        j0.a0.b(viewGroup);
        c0Var.H();
    }

    public boolean B(i.a aVar, Menu menu) {
        ViewGroup viewGroup = ((c0) this.h).F;
        WeakHashMap weakHashMap = j0.f2160a;
        j0.a0.b(viewGroup);
        w wVar = (w) this.f301g;
        ActionMode.Callback callback = (ActionMode.Callback) wVar.f320f;
        i.e h = wVar.h(aVar);
        n.j jVar = (n.j) wVar.f322i;
        Menu menu2 = (Menu) jVar.get(menu);
        if (menu2 == null) {
            menu2 = new j.b0((Context) wVar.f321g, (j.m) menu);
            jVar.put(menu, menu2);
        }
        return callback.onPrepareActionMode(h, menu2);
    }

    public void C(g0.g gVar) {
        g0.l lVar = (g0.l) this.h;
        m mVar = (m) this.f301g;
        int i3 = gVar.f1797b;
        if (i3 == 0) {
            lVar.execute(new androidx.fragment.app.e(mVar, gVar.f1796a, 1));
        } else {
            lVar.execute(new h(mVar, i3, 2));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x0209, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x0082. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:56:0x00c9. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0109 A[Catch: IOException -> 0x0091, XmlPullParserException -> 0x0094, TryCatch #2 {IOException -> 0x0091, XmlPullParserException -> 0x0094, blocks: (B:19:0x0062, B:28:0x0209, B:29:0x0074, B:30:0x0082, B:33:0x0087, B:41:0x0097, B:44:0x00b1, B:47:0x00a0, B:51:0x00a9, B:54:0x00bf, B:57:0x00ce, B:59:0x00d6, B:62:0x00e0, B:66:0x0109, B:69:0x0110, B:70:0x0128, B:72:0x00e9, B:74:0x00f1, B:77:0x00ff, B:80:0x0129, B:82:0x0131, B:85:0x013f, B:88:0x0149, B:91:0x0154, B:92:0x016c, B:94:0x016d, B:97:0x0177, B:100:0x0182, B:101:0x019a, B:103:0x019b, B:105:0x01a3, B:108:0x01ac, B:111:0x01b6, B:114:0x01c0, B:115:0x01d8, B:117:0x01d9, B:120:0x01e3, B:123:0x01ed, B:124:0x0205, B:127:0x0206), top: B:18:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0110 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void D(android.content.Context r12, android.content.res.XmlResourceParser r13) {
        /*
            Method dump skipped, instructions count: 608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.p.D(android.content.Context, android.content.res.XmlResourceParser):void");
    }

    public i0 E(c1 c1Var, int i3) {
        m1 m1Var;
        i0 i0Var;
        n.j jVar = (n.j) this.f301g;
        int d = jVar.d(c1Var);
        if (d >= 0 && (m1Var = (m1) jVar.i(d)) != null) {
            int i4 = m1Var.f836a;
            if ((i4 & i3) != 0) {
                int i5 = i4 & (~i3);
                m1Var.f836a = i5;
                if (i3 == 4) {
                    i0Var = m1Var.f837b;
                } else if (i3 == 8) {
                    i0Var = m1Var.f838c;
                } else {
                    a.b.m("Must provide flag PRE or POST");
                    return null;
                }
                if ((i5 & 12) == 0) {
                    jVar.g(d);
                    m1Var.f836a = 0;
                    m1Var.f837b = null;
                    m1Var.f838c = null;
                    m1.d.c(m1Var);
                }
                return i0Var;
            }
        }
        return null;
    }

    public void F(c1 c1Var) {
        m1 m1Var = (m1) ((n.j) this.f301g).get(c1Var);
        if (m1Var == null) {
            return;
        }
        m1Var.f836a &= -2;
    }

    public void G(c1 c1Var) {
        n.h hVar = (n.h) this.h;
        int e3 = hVar.e() - 1;
        while (true) {
            if (e3 < 0) {
                break;
            }
            if (c1Var == hVar.f(e3)) {
                Object[] objArr = hVar.h;
                Object obj = objArr[e3];
                Object obj2 = n.i.f2571a;
                if (obj != obj2) {
                    objArr[e3] = obj2;
                    hVar.f2568f = true;
                }
            } else {
                e3--;
            }
        }
        m1 m1Var = (m1) ((n.j) this.f301g).remove(c1Var);
        if (m1Var != null) {
            m1Var.f836a = 0;
            m1Var.f837b = null;
            m1Var.f838c = null;
            m1.d.c(m1Var);
        }
    }

    public void H() {
        Object parcelable;
        Integer num;
        a.m mVar = (a.m) this.f301g;
        String str = (String) this.h;
        Bundle bundle = mVar.f38g;
        LinkedHashMap linkedHashMap = mVar.f37f;
        if (!mVar.d.contains(str) && (num = (Integer) mVar.f34b.remove(str)) != null) {
            mVar.f33a.remove(num);
        }
        mVar.f36e.remove(str);
        if (linkedHashMap.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + linkedHashMap.get(str));
            linkedHashMap.remove(str);
        }
        if (bundle.containsKey(str)) {
            if (Build.VERSION.SDK_INT >= 34) {
                parcelable = f0.a.a(bundle, str);
            } else {
                parcelable = bundle.getParcelable(str);
                if (!c.a.class.isInstance(parcelable)) {
                    parcelable = null;
                }
            }
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((c.a) parcelable));
            bundle.remove(str);
        }
        if (mVar.f35c.get(str) == null) {
            return;
        }
        a.b.c();
    }

    public void a(c1 c1Var, i0 i0Var) {
        n.j jVar = (n.j) this.f301g;
        m1 m1Var = (m1) jVar.get(c1Var);
        if (m1Var == null) {
            m1Var = m1.a();
            jVar.put(c1Var, m1Var);
        }
        m1Var.f838c = i0Var;
        m1Var.f836a |= 8;
    }

    public void b() {
        int[] iArr = (int[]) this.f301g;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.h = null;
    }

    public void c(boolean z2) {
        androidx.fragment.app.u uVar = ((androidx.fragment.app.k0) this.h).f416v;
        if (uVar != null) {
            uVar.j().f406l.c(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f301g).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z2) {
                    throw null;
                }
                throw null;
            }
            a.b.c();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a2  */
    @Override // j0.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public j0.c1 d(android.view.View r18, j0.c1 r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            java.lang.Object r3 = r0.f301g
            h0.f r3 = (h0.f) r3
            java.lang.Object r0 = r0.h
            w1.l r0 = (w1.l) r0
            int r4 = r0.f3256a
            int r5 = r0.f3257b
            int r0 = r0.f3258c
            j0.y0 r6 = r2.f2146a
            r7 = 519(0x207, float:7.27E-43)
            c0.b r7 = r6.f(r7)
            r8 = 32
            c0.b r6 = r6.f(r8)
            java.lang.Object r8 = r3.f1894b
            com.google.android.material.bottomsheet.BottomSheetBehavior r8 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r8
            int r9 = r7.f1083b
            int r10 = r7.f1084c
            int r11 = r7.f1082a
            r8.f1166w = r9
            int r9 = r1.getLayoutDirection()
            r13 = 1
            if (r9 != r13) goto L37
            r9 = r13
            goto L38
        L37:
            r9 = 0
        L38:
            int r14 = r1.getPaddingBottom()
            int r15 = r1.getPaddingLeft()
            int r16 = r1.getPaddingRight()
            boolean r12 = r8.f1158o
            if (r12 == 0) goto L4f
            int r14 = r2.a()
            r8.f1165v = r14
            int r14 = r14 + r0
        L4f:
            boolean r0 = r8.f1159p
            if (r0 == 0) goto L5a
            if (r9 == 0) goto L57
            r0 = r5
            goto L58
        L57:
            r0 = r4
        L58:
            int r15 = r0 + r11
        L5a:
            boolean r0 = r8.f1160q
            if (r0 == 0) goto L64
            if (r9 == 0) goto L61
            goto L62
        L61:
            r4 = r5
        L62:
            int r16 = r4 + r10
        L64:
            r0 = r16
            android.view.ViewGroup$LayoutParams r4 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            boolean r5 = r8.f1162s
            if (r5 == 0) goto L78
            int r5 = r4.leftMargin
            if (r5 == r11) goto L78
            r4.leftMargin = r11
            r5 = r13
            goto L79
        L78:
            r5 = 0
        L79:
            boolean r9 = r8.f1163t
            if (r9 == 0) goto L84
            int r9 = r4.rightMargin
            if (r9 == r10) goto L84
            r4.rightMargin = r10
            r5 = r13
        L84:
            boolean r9 = r8.f1164u
            if (r9 == 0) goto L91
            int r9 = r4.topMargin
            int r7 = r7.f1083b
            if (r9 == r7) goto L91
            r4.topMargin = r7
            goto L92
        L91:
            r13 = r5
        L92:
            if (r13 == 0) goto L97
            r1.setLayoutParams(r4)
        L97:
            int r4 = r1.getPaddingTop()
            r1.setPadding(r15, r4, r0, r14)
            boolean r0 = r3.f1893a
            if (r0 == 0) goto La6
            int r1 = r6.d
            r8.f1156m = r1
        La6:
            if (r12 != 0) goto Lac
            if (r0 == 0) goto Lab
            goto Lac
        Lab:
            return r2
        Lac:
            r8.I()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.p.d(android.view.View, j0.c1):j0.c1");
    }

    @Override // androidx.emoji2.text.q
    public Object e() {
        return (b0) this.f301g;
    }

    public void f(boolean z2) {
        androidx.fragment.app.k0 k0Var = (androidx.fragment.app.k0) this.h;
        g.i iVar = k0Var.f414t.f522g;
        androidx.fragment.app.u uVar = k0Var.f416v;
        if (uVar != null) {
            uVar.j().f406l.f(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f301g).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z2) {
                    throw null;
                }
                throw null;
            }
            a.b.c();
        }
    }

    public void g(boolean z2) {
        androidx.fragment.app.u uVar = ((androidx.fragment.app.k0) this.h).f416v;
        if (uVar != null) {
            uVar.j().f406l.g(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f301g).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z2) {
                    throw null;
                }
                throw null;
            }
            a.b.c();
        }
    }

    public void h(boolean z2) {
        androidx.fragment.app.u uVar = ((androidx.fragment.app.k0) this.h).f416v;
        if (uVar != null) {
            uVar.j().f406l.h(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f301g).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z2) {
                    throw null;
                }
                throw null;
            }
            a.b.c();
        }
    }

    public void i(boolean z2) {
        androidx.fragment.app.u uVar = ((androidx.fragment.app.k0) this.h).f416v;
        if (uVar != null) {
            uVar.j().f406l.i(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f301g).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z2) {
                    throw null;
                }
                throw null;
            }
            a.b.c();
        }
    }

    public void j(boolean z2) {
        androidx.fragment.app.u uVar = ((androidx.fragment.app.k0) this.h).f416v;
        if (uVar != null) {
            uVar.j().f406l.j(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f301g).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z2) {
                    throw null;
                }
                throw null;
            }
            a.b.c();
        }
    }

    public void k(boolean z2) {
        androidx.fragment.app.k0 k0Var = (androidx.fragment.app.k0) this.h;
        g.i iVar = k0Var.f414t.f522g;
        androidx.fragment.app.u uVar = k0Var.f416v;
        if (uVar != null) {
            uVar.j().f406l.k(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f301g).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z2) {
                    throw null;
                }
                throw null;
            }
            a.b.c();
        }
    }

    public void l(boolean z2) {
        androidx.fragment.app.u uVar = ((androidx.fragment.app.k0) this.h).f416v;
        if (uVar != null) {
            uVar.j().f406l.l(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f301g).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z2) {
                    throw null;
                }
                throw null;
            }
            a.b.c();
        }
    }

    @Override // androidx.emoji2.text.q
    public boolean m(CharSequence charSequence, int i3, int i4, z zVar) {
        Spannable spannableString;
        if ((zVar.f329c & 4) > 0) {
            return true;
        }
        if (((b0) this.f301g) == null) {
            if (charSequence instanceof Spannable) {
                spannableString = (Spannable) charSequence;
            } else {
                spannableString = new SpannableString(charSequence);
            }
            this.f301g = new b0(spannableString);
        }
        ((b2.f) this.h).getClass();
        ((b0) this.f301g).setSpan(new a0(zVar), i3, i4, 33);
        return true;
    }

    public void n(boolean z2) {
        androidx.fragment.app.u uVar = ((androidx.fragment.app.k0) this.h).f416v;
        if (uVar != null) {
            uVar.j().f406l.n(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f301g).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z2) {
                    throw null;
                }
                throw null;
            }
            a.b.c();
        }
    }

    public void o(boolean z2) {
        androidx.fragment.app.u uVar = ((androidx.fragment.app.k0) this.h).f416v;
        if (uVar != null) {
            uVar.j().f406l.o(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f301g).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z2) {
                    throw null;
                }
                throw null;
            }
            a.b.c();
        }
    }

    @Override // f0.b
    public void onCancel() {
        ((Animator) this.f301g).end();
        if (androidx.fragment.app.k0.F(2)) {
            Log.v("FragmentManager", "Animator from operation " + ((v0) this.h) + " has been canceled.");
        }
    }

    public void p(boolean z2) {
        androidx.fragment.app.u uVar = ((androidx.fragment.app.k0) this.h).f416v;
        if (uVar != null) {
            uVar.j().f406l.p(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f301g).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z2) {
                    throw null;
                }
                throw null;
            }
            a.b.c();
        }
    }

    public void q(boolean z2) {
        androidx.fragment.app.u uVar = ((androidx.fragment.app.k0) this.h).f416v;
        if (uVar != null) {
            uVar.j().f406l.q(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f301g).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z2) {
                    throw null;
                }
                throw null;
            }
            a.b.c();
        }
    }

    public void r(boolean z2) {
        androidx.fragment.app.u uVar = ((androidx.fragment.app.k0) this.h).f416v;
        if (uVar != null) {
            uVar.j().f406l.r(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f301g).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z2) {
                    throw null;
                }
                throw null;
            }
            a.b.c();
        }
    }

    public void s(boolean z2) {
        androidx.fragment.app.u uVar = ((androidx.fragment.app.k0) this.h).f416v;
        if (uVar != null) {
            uVar.j().f406l.s(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f301g).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z2) {
                    throw null;
                }
                throw null;
            }
            a.b.c();
        }
    }

    public void t(int i3) {
        int[] iArr = (int[]) this.f301g;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i3, 10) + 1];
            this.f301g = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i3 >= iArr.length) {
            int length = iArr.length;
            while (length <= i3) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f301g = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.f301g;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public String toString() {
        switch (this.f300f) {
            case 12:
                return "Bounds{lower=" + ((c0.b) this.f301g) + " upper=" + ((c0.b) this.h) + "}";
            case 15:
                String str = "[ ";
                if (((q.f) this.f301g) != null) {
                    for (int i3 = 0; i3 < 9; i3++) {
                        str = str + ((q.f) this.f301g).f2743m[i3] + " ";
                    }
                }
                return str + "] " + ((q.f) this.f301g);
            default:
                return super.toString();
        }
    }

    public View u(int i3, int i4, int i5, int i6) {
        int i7;
        View u2;
        l1 l1Var = (l1) this.h;
        l0 l0Var = (l0) this.f301g;
        int d = l0Var.d();
        int c3 = l0Var.c();
        if (i4 > i3) {
            i7 = 1;
        } else {
            i7 = -1;
        }
        View view = null;
        while (i3 != i4) {
            switch (l0Var.f825a) {
                case 0:
                    u2 = l0Var.f826b.u(i3);
                    break;
                default:
                    u2 = l0Var.f826b.u(i3);
                    break;
            }
            int b3 = l0Var.b(u2);
            int a3 = l0Var.a(u2);
            l1Var.f828b = d;
            l1Var.f829c = c3;
            l1Var.d = b3;
            l1Var.f830e = a3;
            if (i5 != 0) {
                l1Var.f827a = i5;
                if (l1Var.a()) {
                    return u2;
                }
            }
            if (i6 != 0) {
                l1Var.f827a = i6;
                if (l1Var.a()) {
                    view = u2;
                }
            }
            i3 += i7;
        }
        return view;
    }

    public void w() {
        ((SparseIntArray) this.f301g).clear();
    }

    public boolean x(View view) {
        l1 l1Var = (l1) this.h;
        l0 l0Var = (l0) this.f301g;
        int d = l0Var.d();
        int c3 = l0Var.c();
        int b3 = l0Var.b(view);
        int a3 = l0Var.a(view);
        l1Var.f828b = d;
        l1Var.f829c = c3;
        l1Var.d = b3;
        l1Var.f830e = a3;
        l1Var.f827a = 24579;
        return l1Var.a();
    }

    public void y(int i3, int i4) {
        int[] iArr = (int[]) this.f301g;
        if (iArr != null && i3 < iArr.length) {
            int i5 = i3 + i4;
            t(i5);
            int[] iArr2 = (int[]) this.f301g;
            System.arraycopy(iArr2, i3, iArr2, i5, (iArr2.length - i3) - i4);
            Arrays.fill((int[]) this.f301g, i3, i5, -1);
            ArrayList arrayList = (ArrayList) this.h;
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    i1 i1Var = (i1) ((ArrayList) this.h).get(size);
                    int i6 = i1Var.f787f;
                    if (i6 >= i3) {
                        i1Var.f787f = i6 + i4;
                    }
                }
            }
        }
    }

    public void z(int i3, int i4) {
        int[] iArr = (int[]) this.f301g;
        if (iArr != null && i3 < iArr.length) {
            int i5 = i3 + i4;
            t(i5);
            int[] iArr2 = (int[]) this.f301g;
            System.arraycopy(iArr2, i5, iArr2, i3, (iArr2.length - i3) - i4);
            int[] iArr3 = (int[]) this.f301g;
            Arrays.fill(iArr3, iArr3.length - i4, iArr3.length, -1);
            ArrayList arrayList = (ArrayList) this.h;
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    i1 i1Var = (i1) ((ArrayList) this.h).get(size);
                    int i6 = i1Var.f787f;
                    if (i6 >= i3) {
                        if (i6 < i5) {
                            ((ArrayList) this.h).remove(size);
                        } else {
                            i1Var.f787f = i6 - i4;
                        }
                    }
                }
            }
        }
    }

    public /* synthetic */ p(int i3, boolean z2) {
        this.f300f = i3;
    }

    public /* synthetic */ p(Object obj, Object obj2, int i3) {
        this.f300f = i3;
        this.f301g = obj;
        this.h = obj2;
    }

    public p(androidx.fragment.app.k0 k0Var) {
        this.f300f = 3;
        this.f301g = new CopyOnWriteArrayList();
        this.h = k0Var;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, b1.l1] */
    public p(l0 l0Var) {
        this.f300f = 7;
        this.f301g = l0Var;
        ?? obj = new Object();
        obj.f827a = 0;
        this.h = obj;
    }

    public p(Animation animation) {
        this.f300f = 2;
        this.f301g = animation;
        this.h = null;
    }

    public p(Animator animator) {
        this.f300f = 2;
        this.f301g = null;
        this.h = animator;
    }

    public p(ArrayList arrayList, ArrayList arrayList2) {
        this.f300f = 4;
        int size = arrayList.size();
        this.f301g = new int[size];
        this.h = new float[size];
        for (int i3 = 0; i3 < size; i3++) {
            ((int[]) this.f301g)[i3] = ((Integer) arrayList.get(i3)).intValue();
            ((float[]) this.h)[i3] = ((Float) arrayList2.get(i3)).floatValue();
        }
    }

    public p(int i3, int i4) {
        this.f300f = 4;
        this.f301g = new int[]{i3, i4};
        this.h = new float[]{0.0f, 1.0f};
    }

    public p(WindowInsetsAnimation.Bounds bounds) {
        this.f300f = 12;
        this.f301g = c0.b.c(bounds.getLowerBound());
        this.h = c0.b.c(bounds.getUpperBound());
    }

    public p(int i3, int i4, int i5) {
        this.f300f = 4;
        this.f301g = new int[]{i3, i4, i5};
        this.h = new float[]{0.0f, 0.5f, 1.0f};
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.text.Editable$Factory, s0.a] */
    public p(EditText editText) {
        this.f300f = 18;
        this.f301g = editText;
        s0.i iVar = new s0.i(editText);
        this.h = iVar;
        editText.addTextChangedListener(iVar);
        if (s0.a.f2945b == null) {
            synchronized (s0.a.f2944a) {
                try {
                    if (s0.a.f2945b == null) {
                        ?? factory = new Editable.Factory();
                        try {
                            s0.a.f2946c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, s0.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        s0.a.f2945b = factory;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(s0.a.f2945b);
    }

    public p(Window window, b2.f fVar) {
        this.f300f = 13;
        WindowInsetsController insetsController = window.getInsetsController();
        this.f300f = 13;
        this.f301g = insetsController;
        this.h = window;
    }

    public /* synthetic */ p(int i3, Object obj) {
        this.f300f = i3;
        this.h = obj;
    }

    public p(c0 c0Var, w wVar) {
        this.f300f = 10;
        this.h = c0Var;
        this.f301g = wVar;
    }
}

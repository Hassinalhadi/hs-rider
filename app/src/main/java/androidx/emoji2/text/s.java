package androidx.emoji2.text;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.l0;
import androidx.lifecycle.m0;
import androidx.lifecycle.n0;
import androidx.lifecycle.o0;
import androidx.recyclerview.widget.RecyclerView;
import b1.c1;
import b1.d0;
import j0.j0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import k.r0;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: e, reason: collision with root package name */
    public static s f307e;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f308a;

    /* renamed from: b, reason: collision with root package name */
    public Object f309b;

    /* renamed from: c, reason: collision with root package name */
    public Object f310c;
    public Object d;

    public s(w wVar, b2.f fVar, c cVar, Set set) {
        this.f308a = 0;
        this.f309b = fVar;
        this.f310c = wVar;
        this.d = cVar;
        if (!set.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                int[] iArr = (int[]) it.next();
                String str = new String(iArr, 0, iArr.length);
                s(str, 0, str.length(), 1, true, new m(1, str));
            }
        }
    }

    public static boolean c(Editable editable, KeyEvent keyEvent, boolean z2) {
        a0[] a0VarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (a0VarArr = (a0[]) editable.getSpans(selectionStart, selectionEnd, a0.class)) != null && a0VarArr.length > 0) {
                for (a0 a0Var : a0VarArr) {
                    int spanStart = editable.getSpanStart(a0Var);
                    int spanEnd = editable.getSpanEnd(a0Var);
                    if ((z2 && spanStart == selectionStart) || ((!z2 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static s r(Context context, AttributeSet attributeSet, int[] iArr, int i3) {
        return new s(context, context.obtainStyledAttributes(attributeSet, iArr, i3, 0));
    }

    public void a(View view, int i3, boolean z2) {
        int l3;
        RecyclerView recyclerView = ((d0) this.f309b).f748a;
        if (i3 < 0) {
            l3 = recyclerView.getChildCount();
        } else {
            l3 = l(i3);
        }
        ((b1.c) this.f310c).e(l3, z2);
        if (z2) {
            p(view);
        }
        recyclerView.addView(view, l3);
        RecyclerView.I(view);
    }

    public void b(View view, int i3, ViewGroup.LayoutParams layoutParams, boolean z2) {
        int l3;
        RecyclerView recyclerView = ((d0) this.f309b).f748a;
        if (i3 < 0) {
            l3 = recyclerView.getChildCount();
        } else {
            l3 = l(i3);
        }
        ((b1.c) this.f310c).e(l3, z2);
        if (z2) {
            p(view);
        }
        c1 I = RecyclerView.I(view);
        if (I != null) {
            if (!I.j() && !I.o()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + I + recyclerView.y());
            }
            I.f736j &= -257;
        }
        RecyclerView.b(recyclerView, view, l3, layoutParams);
    }

    public void d(int i3) {
        c1 I;
        int l3 = l(i3);
        ((b1.c) this.f310c).f(l3);
        RecyclerView recyclerView = ((d0) this.f309b).f748a;
        View childAt = recyclerView.getChildAt(l3);
        if (childAt != null && (I = RecyclerView.I(childAt)) != null) {
            if (I.j() && !I.o()) {
                throw new IllegalArgumentException("called detach on an already detached child " + I + recyclerView.y());
            }
            I.a(256);
        }
        RecyclerView.c(recyclerView, l3);
    }

    public l0 e(String str, Class cls) {
        l0 d;
        n0 n0Var = (n0) this.f310c;
        o0 o0Var = (o0) this.f309b;
        o0Var.getClass();
        LinkedHashMap linkedHashMap = o0Var.f576a;
        l0 l0Var = (l0) linkedHashMap.get(str);
        if (cls.isInstance(l0Var)) {
            l0Var.getClass();
            return l0Var;
        }
        w0.c cVar = new w0.c((w0.b) this.d);
        cVar.f3194a.put(m0.f574b, str);
        try {
            d = n0Var.q(cls, cVar);
        } catch (AbstractMethodError unused) {
            d = n0Var.d(cls);
        }
        d.getClass();
        l0 l0Var2 = (l0) linkedHashMap.put(str, d);
        if (l0Var2 != null) {
            l0Var2.b();
        }
        return d;
    }

    public View f(int i3) {
        return ((d0) this.f309b).f748a.getChildAt(l(i3));
    }

    public int g() {
        return ((d0) this.f309b).f748a.getChildCount() - ((ArrayList) this.d).size();
    }

    public ColorStateList h(int i3) {
        int resourceId;
        ColorStateList z2;
        TypedArray typedArray = (TypedArray) this.f310c;
        if (typedArray.hasValue(i3) && (resourceId = typedArray.getResourceId(i3, 0)) != 0 && (z2 = a.y.z((Context) this.f309b, resourceId)) != null) {
            return z2;
        }
        return typedArray.getColorStateList(i3);
    }

    public Drawable i(int i3) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f310c;
        if (typedArray.hasValue(i3) && (resourceId = typedArray.getResourceId(i3, 0)) != 0) {
            return a.y.B((Context) this.f309b, resourceId);
        }
        return typedArray.getDrawable(i3);
    }

    public Drawable j(int i3) {
        int resourceId;
        Drawable d;
        if (((TypedArray) this.f310c).hasValue(i3) && (resourceId = ((TypedArray) this.f310c).getResourceId(i3, 0)) != 0) {
            k.u a3 = k.u.a();
            Context context = (Context) this.f309b;
            synchronized (a3) {
                d = a3.f2412a.d(context, resourceId, true);
            }
            return d;
        }
        return null;
    }

    public Typeface k(int i3, int i4, r0 r0Var) {
        int resourceId = ((TypedArray) this.f310c).getResourceId(i3, 0);
        if (resourceId != 0) {
            if (((TypedValue) this.d) == null) {
                this.d = new TypedValue();
            }
            Context context = (Context) this.f309b;
            TypedValue typedValue = (TypedValue) this.d;
            ThreadLocal threadLocal = b0.l.f696a;
            if (context.isRestricted()) {
                return null;
            }
            return b0.l.a(context, resourceId, typedValue, i4, r0Var, true, false);
        }
        return null;
    }

    public int l(int i3) {
        b1.c cVar = (b1.c) this.f310c;
        if (i3 >= 0) {
            int childCount = ((d0) this.f309b).f748a.getChildCount();
            int i4 = i3;
            while (i4 < childCount) {
                int b3 = i3 - (i4 - cVar.b(i4));
                if (b3 == 0) {
                    while (cVar.d(i4)) {
                        i4++;
                    }
                    return i4;
                }
                i4 += b3;
            }
            return -1;
        }
        return -1;
    }

    public View m(int i3) {
        return ((d0) this.f309b).f748a.getChildAt(i3);
    }

    public int n() {
        return ((d0) this.f309b).f748a.getChildCount();
    }

    public boolean o(CharSequence charSequence, int i3, int i4, z zVar) {
        int i5;
        if ((zVar.f329c & 3) == 0) {
            c cVar = (c) this.d;
            r0.a b3 = zVar.b();
            int a3 = b3.a(8);
            if (a3 != 0) {
                ((ByteBuffer) b3.d).getShort(a3 + b3.f2190a);
            }
            cVar.getClass();
            ThreadLocal threadLocal = c.f274b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i3 < i4) {
                sb.append(charSequence.charAt(i3));
                i3++;
            }
            TextPaint textPaint = cVar.f275a;
            String sb2 = sb.toString();
            int i6 = c0.c.f1085a;
            boolean hasGlyph = textPaint.hasGlyph(sb2);
            int i7 = zVar.f329c & 4;
            if (hasGlyph) {
                i5 = i7 | 2;
            } else {
                i5 = i7 | 1;
            }
            zVar.f329c = i5;
        }
        if ((zVar.f329c & 3) != 2) {
            return false;
        }
        return true;
    }

    public void p(View view) {
        ((ArrayList) this.d).add(view);
        d0 d0Var = (d0) this.f309b;
        c1 I = RecyclerView.I(view);
        if (I != null) {
            View view2 = I.f729a;
            RecyclerView recyclerView = d0Var.f748a;
            int i3 = I.f743q;
            if (i3 != -1) {
                I.f742p = i3;
            } else {
                WeakHashMap weakHashMap = j0.f2160a;
                I.f742p = view2.getImportantForAccessibility();
            }
            if (recyclerView.L()) {
                I.f743q = 4;
                recyclerView.f644v0.add(I);
            } else {
                WeakHashMap weakHashMap2 = j0.f2160a;
                view2.setImportantForAccessibility(4);
            }
        }
    }

    public boolean q(int i3, s.d dVar, v.f fVar) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        t.b bVar = (t.b) this.f310c;
        int[] iArr = dVar.f2888p0;
        int[] iArr2 = dVar.f2892t;
        bVar.f2962a = iArr[0];
        bVar.f2963b = iArr[1];
        bVar.f2964c = dVar.q();
        bVar.d = dVar.k();
        bVar.f2968i = false;
        bVar.f2969j = i3;
        if (bVar.f2962a == 3) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (bVar.f2963b == 3) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z2 && dVar.W > 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 && dVar.W > 0.0f) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z4 && iArr2[0] == 4) {
            bVar.f2962a = 1;
        }
        if (z5 && iArr2[1] == 4) {
            bVar.f2963b = 1;
        }
        fVar.b(dVar, bVar);
        dVar.O(bVar.f2965e);
        dVar.L(bVar.f2966f);
        dVar.E = bVar.h;
        dVar.I(bVar.f2967g);
        bVar.f2969j = 0;
        return bVar.f2968i;
    }

    public Object s(CharSequence charSequence, int i3, int i4, int i5, boolean z2, q qVar) {
        int i6;
        v vVar;
        char c3;
        r rVar = new r((v) ((w) this.f310c).h);
        int codePointAt = Character.codePointAt(charSequence, i3);
        int i7 = 0;
        boolean z3 = true;
        int i8 = i3;
        loop0: while (true) {
            i6 = i8;
            while (i8 < i4 && i7 < i5 && z3) {
                SparseArray sparseArray = rVar.f304c.f318a;
                if (sparseArray == null) {
                    vVar = null;
                } else {
                    vVar = (v) sparseArray.get(codePointAt);
                }
                if (rVar.f302a != 2) {
                    if (vVar == null) {
                        rVar.a();
                        c3 = 1;
                    } else {
                        rVar.f302a = 2;
                        rVar.f304c = vVar;
                        rVar.f306f = 1;
                        c3 = 2;
                    }
                } else {
                    if (vVar != null) {
                        rVar.f304c = vVar;
                        rVar.f306f++;
                    } else {
                        if (codePointAt == 65038) {
                            rVar.a();
                        } else if (codePointAt != 65039) {
                            v vVar2 = rVar.f304c;
                            if (vVar2.f319b != null) {
                                if (rVar.f306f == 1) {
                                    if (rVar.b()) {
                                        rVar.d = rVar.f304c;
                                        rVar.a();
                                    } else {
                                        rVar.a();
                                    }
                                } else {
                                    rVar.d = vVar2;
                                    rVar.a();
                                }
                                c3 = 3;
                            } else {
                                rVar.a();
                            }
                        }
                        c3 = 1;
                    }
                    c3 = 2;
                }
                rVar.f305e = codePointAt;
                if (c3 != 1) {
                    if (c3 != 2) {
                        if (c3 == 3) {
                            if (z2 || !o(charSequence, i6, i8, rVar.d.f319b)) {
                                z3 = qVar.m(charSequence, i6, i8, rVar.d.f319b);
                                i7++;
                            }
                        }
                    } else {
                        int charCount = Character.charCount(codePointAt) + i8;
                        if (charCount < i4) {
                            codePointAt = Character.codePointAt(charSequence, charCount);
                        }
                        i8 = charCount;
                    }
                } else {
                    i8 = Character.charCount(Character.codePointAt(charSequence, i6)) + i6;
                    if (i8 < i4) {
                        codePointAt = Character.codePointAt(charSequence, i8);
                    }
                }
            }
        }
        if (rVar.f302a == 2 && rVar.f304c.f319b != null && ((rVar.f306f > 1 || rVar.b()) && i7 < i5 && z3 && (z2 || !o(charSequence, i6, i8, rVar.f304c.f319b)))) {
            qVar.m(charSequence, i6, i8, rVar.f304c.f319b);
        }
        return qVar.e();
    }

    public void t() {
        ((TypedArray) this.f310c).recycle();
    }

    public String toString() {
        switch (this.f308a) {
            case 2:
                return ((b1.c) this.f310c).toString() + ", hidden list:" + ((ArrayList) this.d).size();
            default:
                return super.toString();
        }
    }

    public void u(s.e eVar, int i3, int i4, int i5) {
        eVar.getClass();
        int i6 = eVar.f2863b0;
        int i7 = eVar.f2865c0;
        eVar.f2863b0 = 0;
        eVar.f2865c0 = 0;
        eVar.O(i4);
        eVar.L(i5);
        if (i6 < 0) {
            eVar.f2863b0 = 0;
        } else {
            eVar.f2863b0 = i6;
        }
        if (i7 < 0) {
            eVar.f2865c0 = 0;
        } else {
            eVar.f2865c0 = i7;
        }
        s.e eVar2 = (s.e) this.d;
        eVar2.f2902t0 = i3;
        eVar2.U();
    }

    public void v(View view) {
        if (((ArrayList) this.d).remove(view)) {
            d0 d0Var = (d0) this.f309b;
            c1 I = RecyclerView.I(view);
            if (I != null) {
                RecyclerView recyclerView = d0Var.f748a;
                int i3 = I.f742p;
                if (recyclerView.L()) {
                    I.f743q = i3;
                    recyclerView.f644v0.add(I);
                } else {
                    View view2 = I.f729a;
                    WeakHashMap weakHashMap = j0.f2160a;
                    view2.setImportantForAccessibility(i3);
                }
                I.f742p = 0;
            }
        }
    }

    public void w(s.e eVar) {
        ArrayList arrayList = (ArrayList) this.f309b;
        arrayList.clear();
        int size = eVar.f2899q0.size();
        for (int i3 = 0; i3 < size; i3++) {
            s.d dVar = (s.d) eVar.f2899q0.get(i3);
            int[] iArr = dVar.f2888p0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(dVar);
            }
        }
        eVar.f2901s0.f2973b = true;
    }

    public s(o0 o0Var, n0 n0Var, w0.b bVar) {
        this.f308a = 1;
        o0Var.getClass();
        bVar.getClass();
        this.f309b = o0Var;
        this.f310c = n0Var;
        this.d = bVar;
    }

    public s(d0 d0Var) {
        this.f308a = 2;
        this.f309b = d0Var;
        this.f310c = new b1.c();
        this.d = new ArrayList();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s(o0 o0Var, n0 n0Var) {
        this(o0Var, n0Var, w0.a.f3193b);
        this.f308a = 1;
        o0Var.getClass();
    }

    public s(Context context, TypedArray typedArray) {
        this.f308a = 5;
        this.f309b = context;
        this.f310c = typedArray;
    }

    public s(Runnable runnable) {
        this.f308a = 4;
        this.f310c = new CopyOnWriteArrayList();
        this.d = new HashMap();
        this.f309b = runnable;
    }

    public s(Context context, LocationManager locationManager) {
        this.f308a = 3;
        this.d = new Object();
        this.f309b = context;
        this.f310c = locationManager;
    }

    public s(s.e eVar) {
        this.f308a = 7;
        this.f309b = new ArrayList();
        this.f310c = new Object();
        this.d = eVar;
    }

    public /* synthetic */ s() {
        this.f308a = 6;
    }
}

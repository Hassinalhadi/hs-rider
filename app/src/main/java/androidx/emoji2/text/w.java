package androidx.emoji2.text;

import a.c0;
import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.k0;
import androidx.fragment.app.m0;
import androidx.fragment.app.q0;
import androidx.fragment.app.v0;
import androidx.fragment.app.w0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class w implements f0.b {

    /* renamed from: f, reason: collision with root package name */
    public final Object f320f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f321g;
    public final Object h;

    /* renamed from: i, reason: collision with root package name */
    public Object f322i;

    public w(Typeface typeface, r0.b bVar) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2;
        int i7;
        this.f322i = typeface;
        this.f320f = bVar;
        this.h = new v(1024);
        int a3 = bVar.a(6);
        if (a3 != 0) {
            int i8 = a3 + bVar.f2190a;
            i3 = ((ByteBuffer) bVar.d).getInt(((ByteBuffer) bVar.d).getInt(i8) + i8);
        } else {
            i3 = 0;
        }
        this.f321g = new char[i3 * 2];
        int a4 = bVar.a(6);
        if (a4 != 0) {
            int i9 = a4 + bVar.f2190a;
            i4 = ((ByteBuffer) bVar.d).getInt(((ByteBuffer) bVar.d).getInt(i9) + i9);
        } else {
            i4 = 0;
        }
        for (int i10 = 0; i10 < i4; i10++) {
            z zVar = new z(this, i10);
            r0.a b3 = zVar.b();
            int a5 = b3.a(4);
            if (a5 != 0) {
                i5 = ((ByteBuffer) b3.d).getInt(a5 + b3.f2190a);
            } else {
                i5 = 0;
            }
            Character.toChars(i5, (char[]) this.f321g, i10 * 2);
            r0.a b4 = zVar.b();
            int a6 = b4.a(16);
            if (a6 != 0) {
                int i11 = a6 + b4.f2190a;
                i6 = ((ByteBuffer) b4.d).getInt(((ByteBuffer) b4.d).getInt(i11) + i11);
            } else {
                i6 = 0;
            }
            if (i6 > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            a.y.l(z2, "invalid metadata codepoint length");
            v vVar = (v) this.h;
            r0.a b5 = zVar.b();
            int a7 = b5.a(16);
            if (a7 != 0) {
                int i12 = a7 + b5.f2190a;
                i7 = ((ByteBuffer) b5.d).getInt(((ByteBuffer) b5.d).getInt(i12) + i12);
            } else {
                i7 = 0;
            }
            vVar.a(zVar, 0, i7 - 1);
        }
    }

    public void a(androidx.fragment.app.u uVar) {
        if (!((ArrayList) this.f320f).contains(uVar)) {
            synchronized (((ArrayList) this.f320f)) {
                ((ArrayList) this.f320f).add(uVar);
            }
            uVar.f500p = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + uVar);
    }

    public void b(y0.d dVar) {
        if (((LinkedHashSet) this.f322i).add(dVar)) {
            ((y0.e) this.f321g).a(this, dVar, -1);
        }
    }

    public void c(y0.i iVar, int i3) {
        if (i3 != 1 && i3 != 0) {
            throw new IllegalArgumentException(w0.d("Unsupported priority value: ", i3).toString());
        }
        if (((LinkedHashSet) this.f322i).add(iVar)) {
            ((y0.e) this.f321g).a(this, iVar, i3);
        }
    }

    public void d(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (!hashSet.contains(obj)) {
            hashSet.add(obj);
            ArrayList arrayList2 = (ArrayList) ((n.j) this.f321g).get(obj);
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i3 = 0; i3 < size; i3++) {
                    d(arrayList2.get(i3), arrayList, hashSet);
                }
            }
            hashSet.remove(obj);
            arrayList.add(obj);
            return;
        }
        throw new RuntimeException("This graph contains cyclic dependencies");
    }

    public void e(y0.d dVar, y0.b bVar) {
        y0.e eVar = (y0.e) this.f321g;
        eVar.getClass();
        if (eVar.f3297g == 0) {
            a.a0 c3 = eVar.c(-1);
            eVar.f3296f = c3;
            eVar.f3297g = -1;
            eVar.h = dVar;
            if (bVar != null) {
                if (c3 != null) {
                    c3.d.getClass();
                }
                eVar.f3292a.b(new y0.g(bVar));
            }
        }
    }

    public androidx.fragment.app.u f(String str) {
        q0 q0Var = (q0) ((HashMap) this.f321g).get(str);
        if (q0Var != null) {
            return q0Var.f467c;
        }
        return null;
    }

    public androidx.fragment.app.u g(String str) {
        for (q0 q0Var : ((HashMap) this.f321g).values()) {
            if (q0Var != null) {
                androidx.fragment.app.u uVar = q0Var.f467c;
                if (!str.equals(uVar.f494j)) {
                    uVar = uVar.f509y.f399c.g(str);
                }
                if (uVar != null) {
                    return uVar;
                }
            }
        }
        return null;
    }

    public i.e h(i.a aVar) {
        ArrayList arrayList = (ArrayList) this.h;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            i.e eVar = (i.e) arrayList.get(i3);
            if (eVar != null && eVar.f1926b == aVar) {
                return eVar;
            }
        }
        i.e eVar2 = new i.e((Context) this.f321g, aVar);
        arrayList.add(eVar2);
        return eVar2;
    }

    public ArrayList i() {
        ArrayList arrayList = new ArrayList();
        for (q0 q0Var : ((HashMap) this.f321g).values()) {
            if (q0Var != null) {
                arrayList.add(q0Var);
            }
        }
        return arrayList;
    }

    public ArrayList j() {
        ArrayList arrayList = new ArrayList();
        for (q0 q0Var : ((HashMap) this.f321g).values()) {
            if (q0Var != null) {
                arrayList.add(q0Var.f467c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public List k() {
        ArrayList arrayList;
        if (((ArrayList) this.f320f).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.f320f)) {
            arrayList = new ArrayList((ArrayList) this.f320f);
        }
        return arrayList;
    }

    public void l(q0 q0Var) {
        androidx.fragment.app.u uVar = q0Var.f467c;
        String str = uVar.f494j;
        HashMap hashMap = (HashMap) this.f321g;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(uVar.f494j, q0Var);
        if (k0.F(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + uVar);
        }
    }

    public void m(q0 q0Var) {
        androidx.fragment.app.u uVar = q0Var.f467c;
        if (uVar.F) {
            ((m0) this.f322i).e(uVar);
        }
        if (((q0) ((HashMap) this.f321g).put(uVar.f494j, null)) != null && k0.F(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + uVar);
        }
    }

    public boolean n(i.a aVar, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f320f).onActionItemClicked(h(aVar), new j.t((Context) this.f321g, (d0.a) menuItem));
    }

    public boolean o(i.a aVar, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.f320f;
        i.e h = h(aVar);
        n.j jVar = (n.j) this.f322i;
        Menu menu2 = (Menu) jVar.get(menu);
        if (menu2 == null) {
            menu2 = new j.b0((Context) this.f321g, (j.m) menu);
            jVar.put(menu, menu2);
        }
        return callback.onCreateActionMode(h, menu2);
    }

    @Override // f0.b
    public void onCancel() {
        View view = (View) this.f320f;
        view.clearAnimation();
        ((ViewGroup) this.f321g).endViewTransition(view);
        ((androidx.fragment.app.i) this.h).d();
        if (k0.F(2)) {
            Log.v("FragmentManager", "Animation from operation " + ((v0) this.f322i) + " has been cancelled.");
        }
    }

    public w(c0 c0Var) {
        this.f320f = c0Var;
        this.f321g = new y0.e();
        new LinkedHashSet();
        this.h = new LinkedHashSet();
        this.f322i = new LinkedHashSet();
    }

    public w(int i3) {
        switch (i3) {
            case 3:
                this.f320f = new n.j(0);
                this.f321g = new SparseArray();
                this.h = new n.h();
                this.f322i = new n.j(0);
                return;
            case 4:
            default:
                this.f320f = new ArrayList();
                this.f321g = new HashMap();
                this.h = new HashMap();
                return;
            case 5:
                this.f320f = new i0.b(10);
                this.f321g = new n.j(0);
                this.h = new ArrayList();
                this.f322i = new HashSet();
                return;
        }
    }

    public w(Context context, ActionMode.Callback callback) {
        this.f321g = context;
        this.f320f = callback;
        this.h = new ArrayList();
        this.f322i = new n.j(0);
    }

    public w(View view, ViewGroup viewGroup, androidx.fragment.app.i iVar, v0 v0Var) {
        this.f320f = view;
        this.f321g = viewGroup;
        this.h = iVar;
        this.f322i = v0Var;
    }
}

package j;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class j extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final m f2067a;

    /* renamed from: b, reason: collision with root package name */
    public int f2068b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2069c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final LayoutInflater f2070e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2071f;

    public j(m mVar, LayoutInflater layoutInflater, boolean z2, int i3) {
        this.d = z2;
        this.f2070e = layoutInflater;
        this.f2067a = mVar;
        this.f2071f = i3;
        a();
    }

    public final void a() {
        m mVar = this.f2067a;
        o oVar = mVar.f2092v;
        if (oVar != null) {
            mVar.i();
            ArrayList arrayList = mVar.f2080j;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (((o) arrayList.get(i3)) == oVar) {
                    this.f2068b = i3;
                    return;
                }
            }
        }
        this.f2068b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final o getItem(int i3) {
        ArrayList l3;
        boolean z2 = this.d;
        m mVar = this.f2067a;
        if (z2) {
            mVar.i();
            l3 = mVar.f2080j;
        } else {
            l3 = mVar.l();
        }
        int i4 = this.f2068b;
        if (i4 >= 0 && i3 >= i4) {
            i3++;
        }
        return (o) l3.get(i3);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList l3;
        boolean z2 = this.d;
        m mVar = this.f2067a;
        if (z2) {
            mVar.i();
            l3 = mVar.f2080j;
        } else {
            l3 = mVar.l();
        }
        if (this.f2068b < 0) {
            return l3.size();
        }
        return l3.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i3) {
        return i3;
    }

    @Override // android.widget.Adapter
    public final View getView(int i3, View view, ViewGroup viewGroup) {
        int i4;
        boolean z2 = false;
        if (view == null) {
            view = this.f2070e.inflate(this.f2071f, viewGroup, false);
        }
        int i5 = getItem(i3).f2098b;
        int i6 = i3 - 1;
        if (i6 >= 0) {
            i4 = getItem(i6).f2098b;
        } else {
            i4 = i5;
        }
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f2067a.m() && i5 != i4) {
            z2 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z2);
        z zVar = (z) view;
        if (this.f2069c) {
            listMenuItemView.setForceShowIcon(true);
        }
        zVar.c(getItem(i3));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}

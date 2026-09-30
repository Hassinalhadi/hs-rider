package j;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.logistics.rider.lsposed.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class h extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public int f2060a = -1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f2061b;

    public h(i iVar) {
        this.f2061b = iVar;
        a();
    }

    public final void a() {
        m mVar = this.f2061b.h;
        o oVar = mVar.f2092v;
        if (oVar != null) {
            mVar.i();
            ArrayList arrayList = mVar.f2080j;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (((o) arrayList.get(i3)) == oVar) {
                    this.f2060a = i3;
                    return;
                }
            }
        }
        this.f2060a = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final o getItem(int i3) {
        i iVar = this.f2061b;
        m mVar = iVar.h;
        mVar.i();
        ArrayList arrayList = mVar.f2080j;
        iVar.getClass();
        int i4 = this.f2060a;
        if (i4 >= 0 && i3 >= i4) {
            i3++;
        }
        return (o) arrayList.get(i3);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        i iVar = this.f2061b;
        m mVar = iVar.h;
        mVar.i();
        int size = mVar.f2080j.size();
        iVar.getClass();
        if (this.f2060a < 0) {
            return size;
        }
        return size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i3) {
        return i3;
    }

    @Override // android.widget.Adapter
    public final View getView(int i3, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f2061b.f2063g.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((z) view).c(getItem(i3));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}

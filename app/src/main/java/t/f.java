package t;

import java.util.ArrayList;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public class f implements d {
    public final o d;

    /* renamed from: f, reason: collision with root package name */
    public int f2982f;

    /* renamed from: g, reason: collision with root package name */
    public int f2983g;

    /* renamed from: a, reason: collision with root package name */
    public o f2978a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2979b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2980c = false;

    /* renamed from: e, reason: collision with root package name */
    public int f2981e = 1;
    public int h = 1;

    /* renamed from: i, reason: collision with root package name */
    public g f2984i = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2985j = false;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f2986k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f2987l = new ArrayList();

    public f(o oVar) {
        this.d = oVar;
    }

    @Override // t.d
    public final void a(d dVar) {
        ArrayList arrayList = this.f2987l;
        int size = arrayList.size();
        int i3 = 0;
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            if (!((f) obj).f2985j) {
                return;
            }
        }
        this.f2980c = true;
        o oVar = this.f2978a;
        if (oVar != null) {
            oVar.a(this);
        }
        if (this.f2979b) {
            this.d.a(this);
            return;
        }
        int size2 = arrayList.size();
        f fVar = null;
        int i5 = 0;
        while (i5 < size2) {
            Object obj2 = arrayList.get(i5);
            i5++;
            f fVar2 = (f) obj2;
            if (!(fVar2 instanceof g)) {
                i3++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i3 == 1 && fVar.f2985j) {
            g gVar = this.f2984i;
            if (gVar != null) {
                if (gVar.f2985j) {
                    this.f2982f = this.h * gVar.f2983g;
                } else {
                    return;
                }
            }
            d(fVar.f2983g + this.f2982f);
        }
        o oVar2 = this.f2978a;
        if (oVar2 != null) {
            oVar2.a(this);
        }
    }

    public final void b(o oVar) {
        this.f2986k.add(oVar);
        if (this.f2985j) {
            oVar.a(oVar);
        }
    }

    public final void c() {
        this.f2987l.clear();
        this.f2986k.clear();
        this.f2985j = false;
        this.f2983g = 0;
        this.f2980c = false;
        this.f2979b = false;
    }

    public void d(int i3) {
        if (!this.f2985j) {
            this.f2985j = true;
            this.f2983g = i3;
            ArrayList arrayList = this.f2986k;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                d dVar = (d) obj;
                dVar.a(dVar);
            }
        }
    }

    public final String toString() {
        String str;
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.f3001b.f2872h0);
        sb.append(":");
        switch (this.f2981e) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append("(");
        if (this.f2985j) {
            obj = Integer.valueOf(this.f2983g);
        } else {
            obj = "unresolved";
        }
        sb.append(obj);
        sb.append(") <t=");
        sb.append(this.f2987l.size());
        sb.append(":d=");
        sb.append(this.f2986k.size());
        sb.append(">");
        return sb.toString();
    }
}

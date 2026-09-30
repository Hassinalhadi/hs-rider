package b1;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class b {
    public final d0 d;

    /* renamed from: a, reason: collision with root package name */
    public final i0.b f712a = new i0.b(30);

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f713b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f714c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final androidx.emoji2.text.m f715e = new androidx.emoji2.text.m(5, this);

    public b(d0 d0Var) {
        this.d = d0Var;
    }

    public final boolean a(int i3) {
        ArrayList arrayList = this.f714c;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            a aVar = (a) arrayList.get(i4);
            int i5 = aVar.f708a;
            if (i5 == 8) {
                if (e(aVar.f710c, i4 + 1) == i3) {
                    return true;
                }
            } else {
                if (i5 == 1) {
                    int i6 = aVar.f709b;
                    int i7 = aVar.f710c + i6;
                    while (i6 < i7) {
                        if (e(i6, i4 + 1) == i3) {
                            return true;
                        }
                        i6++;
                    }
                } else {
                    continue;
                }
            }
        }
        return false;
    }

    public final void b() {
        ArrayList arrayList = this.f714c;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.d.a((a) arrayList.get(i3));
        }
        i(arrayList);
        ArrayList arrayList2 = this.f713b;
        int size2 = arrayList2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            a aVar = (a) arrayList2.get(i4);
            int i5 = aVar.f708a;
            d0 d0Var = this.d;
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 != 4) {
                        if (i5 == 8) {
                            d0Var.a(aVar);
                            d0Var.e(aVar.f709b, aVar.f710c);
                        }
                    } else {
                        d0Var.a(aVar);
                        d0Var.c(aVar.f709b, aVar.f710c);
                    }
                } else {
                    d0Var.a(aVar);
                    int i6 = aVar.f709b;
                    int i7 = aVar.f710c;
                    RecyclerView recyclerView = d0Var.f748a;
                    recyclerView.O(i6, i7, true);
                    recyclerView.f624l0 = true;
                    recyclerView.f618i0.f954c += i7;
                }
            } else {
                d0Var.a(aVar);
                d0Var.d(aVar.f709b, aVar.f710c);
            }
        }
        i(arrayList2);
    }

    public final void c(a aVar) {
        int i3;
        i0.b bVar;
        int i4 = aVar.f708a;
        if (i4 != 1 && i4 != 8) {
            int j3 = j(aVar.f709b, i4);
            int i5 = aVar.f709b;
            int i6 = aVar.f708a;
            if (i6 != 2) {
                if (i6 == 4) {
                    i3 = 1;
                } else {
                    a.b.h(aVar, "op should be remove or update.");
                    return;
                }
            } else {
                i3 = 0;
            }
            int i7 = 1;
            int i8 = 1;
            while (true) {
                int i9 = aVar.f710c;
                bVar = this.f712a;
                if (i7 >= i9) {
                    break;
                }
                int j4 = j((i3 * i7) + aVar.f709b, aVar.f708a);
                int i10 = aVar.f708a;
                if (i10 == 2 ? j4 == j3 : !(i10 != 4 || j4 != j3 + 1)) {
                    i8++;
                } else {
                    a g3 = g(i10, j3, i8);
                    d(g3, i5);
                    bVar.c(g3);
                    if (aVar.f708a == 4) {
                        i5 += i8;
                    }
                    i8 = 1;
                    j3 = j4;
                }
                i7++;
            }
            bVar.c(aVar);
            if (i8 > 0) {
                a g4 = g(aVar.f708a, j3, i8);
                d(g4, i5);
                bVar.c(g4);
                return;
            }
            return;
        }
        a.b.m("should not dispatch add or move for pre layout");
    }

    public final void d(a aVar, int i3) {
        d0 d0Var = this.d;
        d0Var.a(aVar);
        int i4 = aVar.f708a;
        if (i4 != 2) {
            if (i4 == 4) {
                d0Var.c(i3, aVar.f710c);
                return;
            } else {
                a.b.m("only remove and update ops can be dispatched in first pass");
                return;
            }
        }
        int i5 = aVar.f710c;
        RecyclerView recyclerView = d0Var.f748a;
        recyclerView.O(i3, i5, true);
        recyclerView.f624l0 = true;
        recyclerView.f618i0.f954c += i5;
    }

    public final int e(int i3, int i4) {
        ArrayList arrayList = this.f714c;
        int size = arrayList.size();
        while (i4 < size) {
            a aVar = (a) arrayList.get(i4);
            int i5 = aVar.f708a;
            int i6 = aVar.f709b;
            if (i5 == 8) {
                if (i6 == i3) {
                    i3 = aVar.f710c;
                } else {
                    if (i6 < i3) {
                        i3--;
                    }
                    if (aVar.f710c <= i3) {
                        i3++;
                    }
                }
            } else if (i6 > i3) {
                continue;
            } else if (i5 == 2) {
                int i7 = aVar.f710c;
                if (i3 < i6 + i7) {
                    return -1;
                }
                i3 -= i7;
            } else if (i5 == 1) {
                i3 += aVar.f710c;
            }
            i4++;
        }
        return i3;
    }

    public final boolean f() {
        if (this.f713b.size() > 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, b1.a] */
    public final a g(int i3, int i4, int i5) {
        a aVar = (a) this.f712a.a();
        if (aVar == null) {
            ?? obj = new Object();
            obj.f708a = i3;
            obj.f709b = i4;
            obj.f710c = i5;
            return obj;
        }
        aVar.f708a = i3;
        aVar.f709b = i4;
        aVar.f710c = i5;
        return aVar;
    }

    public final void h(a aVar) {
        this.f714c.add(aVar);
        int i3 = aVar.f708a;
        d0 d0Var = this.d;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 4) {
                    if (i3 == 8) {
                        d0Var.e(aVar.f709b, aVar.f710c);
                        return;
                    } else {
                        a.b.h(aVar, "Unknown update op type for ");
                        return;
                    }
                }
                d0Var.c(aVar.f709b, aVar.f710c);
                return;
            }
            int i4 = aVar.f709b;
            int i5 = aVar.f710c;
            RecyclerView recyclerView = d0Var.f748a;
            recyclerView.O(i4, i5, false);
            recyclerView.f624l0 = true;
            return;
        }
        d0Var.d(aVar.f709b, aVar.f710c);
    }

    public final void i(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            a aVar = (a) arrayList.get(i3);
            aVar.getClass();
            this.f712a.c(aVar);
        }
        arrayList.clear();
    }

    public final int j(int i3, int i4) {
        int i5;
        int i6;
        ArrayList arrayList = this.f714c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            a aVar = (a) arrayList.get(size);
            int i7 = aVar.f708a;
            int i8 = aVar.f709b;
            if (i7 == 8) {
                int i9 = aVar.f710c;
                if (i8 < i9) {
                    i6 = i9;
                    i5 = i8;
                } else {
                    i5 = i9;
                    i6 = i8;
                }
                if (i3 >= i5 && i3 <= i6) {
                    if (i5 == i8) {
                        if (i4 == 1) {
                            aVar.f710c = i9 + 1;
                        } else if (i4 == 2) {
                            aVar.f710c = i9 - 1;
                        }
                        i3++;
                    } else {
                        if (i4 == 1) {
                            aVar.f709b = i8 + 1;
                        } else if (i4 == 2) {
                            aVar.f709b = i8 - 1;
                        }
                        i3--;
                    }
                } else if (i3 < i8) {
                    if (i4 == 1) {
                        aVar.f709b = i8 + 1;
                        aVar.f710c = i9 + 1;
                    } else if (i4 == 2) {
                        aVar.f709b = i8 - 1;
                        aVar.f710c = i9 - 1;
                    }
                }
            } else if (i8 <= i3) {
                if (i7 == 1) {
                    i3 -= aVar.f710c;
                } else if (i7 == 2) {
                    i3 += aVar.f710c;
                }
            } else if (i4 == 1) {
                aVar.f709b = i8 + 1;
            } else if (i4 == 2) {
                aVar.f709b = i8 - 1;
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            a aVar2 = (a) arrayList.get(size2);
            int i10 = aVar2.f708a;
            int i11 = aVar2.f710c;
            i0.b bVar = this.f712a;
            if (i10 == 8) {
                if (i11 == aVar2.f709b || i11 < 0) {
                    arrayList.remove(size2);
                    bVar.c(aVar2);
                }
            } else if (i11 <= 0) {
                arrayList.remove(size2);
                bVar.c(aVar2);
            }
        }
        return i3;
    }
}

package k2;

import java.util.AbstractList;
import java.util.List;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public abstract class a extends AbstractList implements List, q2.a {
    public abstract int a();

    public abstract Object b(int i3);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i3) {
        return b(i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return a();
    }
}

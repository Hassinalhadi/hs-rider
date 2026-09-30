package e2;

import android.content.res.TypedArray;
import android.util.SparseArray;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f1449a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public final q f1450b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1451c;
    public final int d;

    public p(q qVar, androidx.emoji2.text.s sVar) {
        this.f1450b = qVar;
        TypedArray typedArray = (TypedArray) sVar.f310c;
        this.f1451c = typedArray.getResourceId(28, 0);
        this.d = typedArray.getResourceId(53, 0);
    }
}

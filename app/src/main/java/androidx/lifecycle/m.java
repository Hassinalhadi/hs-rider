package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: f, reason: collision with root package name */
    public static final m f568f;

    /* renamed from: g, reason: collision with root package name */
    public static final m f569g;
    public static final m h;

    /* renamed from: i, reason: collision with root package name */
    public static final m f570i;

    /* renamed from: j, reason: collision with root package name */
    public static final m f571j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ m[] f572k;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.lifecycle.m] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.lifecycle.m] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, androidx.lifecycle.m] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, androidx.lifecycle.m] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, androidx.lifecycle.m] */
    static {
        ?? r02 = new Enum("DESTROYED", 0);
        f568f = r02;
        ?? r12 = new Enum("INITIALIZED", 1);
        f569g = r12;
        ?? r22 = new Enum("CREATED", 2);
        h = r22;
        ?? r3 = new Enum("STARTED", 3);
        f570i = r3;
        ?? r4 = new Enum("RESUMED", 4);
        f571j = r4;
        f572k = new m[]{r02, r12, r22, r3, r4};
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f572k.clone();
    }
}

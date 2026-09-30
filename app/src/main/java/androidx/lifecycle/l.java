package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class l {
    private static final /* synthetic */ l[] $VALUES;
    public static final j Companion;
    public static final l ON_ANY;
    public static final l ON_CREATE;
    public static final l ON_DESTROY;
    public static final l ON_PAUSE;
    public static final l ON_RESUME;
    public static final l ON_START;
    public static final l ON_STOP;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.lifecycle.l] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, androidx.lifecycle.j] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.lifecycle.l] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, androidx.lifecycle.l] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, androidx.lifecycle.l] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, androidx.lifecycle.l] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, androidx.lifecycle.l] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, androidx.lifecycle.l] */
    static {
        ?? r02 = new Enum("ON_CREATE", 0);
        ON_CREATE = r02;
        ?? r12 = new Enum("ON_START", 1);
        ON_START = r12;
        ?? r22 = new Enum("ON_RESUME", 2);
        ON_RESUME = r22;
        ?? r3 = new Enum("ON_PAUSE", 3);
        ON_PAUSE = r3;
        ?? r4 = new Enum("ON_STOP", 4);
        ON_STOP = r4;
        ?? r5 = new Enum("ON_DESTROY", 5);
        ON_DESTROY = r5;
        ?? r6 = new Enum("ON_ANY", 6);
        ON_ANY = r6;
        $VALUES = new l[]{r02, r12, r22, r3, r4, r5, r6};
        Companion = new Object();
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }

    public final m a() {
        switch (k.f565a[ordinal()]) {
            case 1:
            case 2:
                return m.h;
            case 3:
            case 4:
                return m.f570i;
            case 5:
                return m.f571j;
            case 6:
                return m.f568f;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}

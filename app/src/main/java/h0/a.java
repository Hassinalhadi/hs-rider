package h0;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f1881e = new byte[1792];

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f1882a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1883b;

    /* renamed from: c, reason: collision with root package name */
    public int f1884c;
    public char d;

    static {
        for (int i3 = 0; i3 < 1792; i3++) {
            f1881e[i3] = Character.getDirectionality(i3);
        }
    }

    public a(CharSequence charSequence) {
        this.f1882a = charSequence;
        this.f1883b = charSequence.length();
    }

    public final byte a() {
        int i3 = this.f1884c - 1;
        CharSequence charSequence = this.f1882a;
        char charAt = charSequence.charAt(i3);
        this.d = charAt;
        boolean isLowSurrogate = Character.isLowSurrogate(charAt);
        int i4 = this.f1884c;
        if (isLowSurrogate) {
            int codePointBefore = Character.codePointBefore(charSequence, i4);
            this.f1884c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f1884c = i4 - 1;
        char c3 = this.d;
        if (c3 < 1792) {
            return f1881e[c3];
        }
        return Character.getDirectionality(c3);
    }
}

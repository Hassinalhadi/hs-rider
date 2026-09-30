package b1;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f708a;

    /* renamed from: b, reason: collision with root package name */
    public int f709b;

    /* renamed from: c, reason: collision with root package name */
    public int f710c;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                int i3 = this.f708a;
                if (i3 == aVar.f708a) {
                    if (i3 != 8 || Math.abs(this.f710c - this.f709b) != 1 || this.f710c != aVar.f709b || this.f709b != aVar.f710c) {
                        if (this.f710c == aVar.f710c && this.f709b == aVar.f709b) {
                            return true;
                        }
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f708a * 31) + this.f709b) * 31) + this.f710c;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i3 = this.f708a;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 4) {
                    if (i3 != 8) {
                        str = "??";
                    } else {
                        str = "mv";
                    }
                } else {
                    str = "up";
                }
            } else {
                str = "rm";
            }
        } else {
            str = "add";
        }
        sb.append(str);
        sb.append(",s:");
        sb.append(this.f709b);
        sb.append("c:");
        sb.append(this.f710c);
        sb.append(",p:null]");
        return sb.toString();
    }
}

package z0;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f3339a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3340b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3341c;
    public final long d;

    public h(int i3, int i4, long j3, long j4) {
        this.f3339a = i3;
        this.f3340b = i4;
        this.f3341c = j3;
        this.d = j4;
    }

    public static h a(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            h hVar = new h(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return hVar;
        } finally {
        }
    }

    public final void b(File file) {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f3339a);
            dataOutputStream.writeInt(this.f3340b);
            dataOutputStream.writeLong(this.f3341c);
            dataOutputStream.writeLong(this.d);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof h)) {
            h hVar = (h) obj;
            if (this.f3340b == hVar.f3340b && this.f3341c == hVar.f3341c && this.f3339a == hVar.f3339a && this.d == hVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f3340b), Long.valueOf(this.f3341c), Integer.valueOf(this.f3339a), Long.valueOf(this.d));
    }
}

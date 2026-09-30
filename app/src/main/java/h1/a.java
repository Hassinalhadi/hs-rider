package h1;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import n.f;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final f f1898a;

    /* renamed from: b, reason: collision with root package name */
    public final f f1899b;

    /* renamed from: c, reason: collision with root package name */
    public final f f1900c;

    public a(f fVar, f fVar2, f fVar3) {
        this.f1898a = fVar;
        this.f1899b = fVar2;
        this.f1900c = fVar3;
    }

    public abstract b a();

    public final Class b(Class cls) {
        String name = cls.getName();
        f fVar = this.f1900c;
        Class cls2 = (Class) fVar.get(name);
        if (cls2 == null) {
            Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
            fVar.put(cls.getName(), cls3);
            return cls3;
        }
        return cls2;
    }

    public final Method c(String str) {
        f fVar = this.f1898a;
        Method method = (Method) fVar.get(str);
        if (method == null) {
            System.currentTimeMillis();
            Method declaredMethod = Class.forName(str, true, a.class.getClassLoader()).getDeclaredMethod("read", a.class);
            fVar.put(str, declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    public final Method d(Class cls) {
        String name = cls.getName();
        f fVar = this.f1899b;
        Method method = (Method) fVar.get(name);
        if (method == null) {
            Class b3 = b(cls);
            System.currentTimeMillis();
            Method declaredMethod = b3.getDeclaredMethod("write", cls, a.class);
            fVar.put(cls.getName(), declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    public abstract boolean e(int i3);

    public final Parcelable f(Parcelable parcelable, int i3) {
        if (!e(i3)) {
            return parcelable;
        }
        return ((b) this).f1901e.readParcelable(b.class.getClassLoader());
    }

    public final c g() {
        String readString = ((b) this).f1901e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (c) c(readString).invoke(null, a());
        } catch (ClassNotFoundException e3) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e3);
        } catch (IllegalAccessException e4) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e4);
        } catch (NoSuchMethodException e5) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e5);
        } catch (InvocationTargetException e6) {
            if (e6.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e6.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e6);
        }
    }

    public abstract void h(int i3);

    public final void i(c cVar) {
        if (cVar == null) {
            ((b) this).f1901e.writeString(null);
            return;
        }
        try {
            ((b) this).f1901e.writeString(b(cVar.getClass()).getName());
            b a3 = a();
            try {
                d(cVar.getClass()).invoke(null, cVar, a3);
                Parcel parcel = a3.f1901e;
                int i3 = a3.f1904i;
                if (i3 >= 0) {
                    int i4 = a3.d.get(i3);
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i4);
                    parcel.writeInt(dataPosition - i4);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (ClassNotFoundException e3) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e3);
            } catch (IllegalAccessException e4) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e4);
            } catch (NoSuchMethodException e5) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e5);
            } catch (InvocationTargetException e6) {
                if (e6.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e6.getCause());
                }
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e6);
            }
        } catch (ClassNotFoundException e7) {
            throw new RuntimeException(cVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e7);
        }
    }
}

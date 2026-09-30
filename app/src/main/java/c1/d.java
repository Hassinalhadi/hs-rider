package c1;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.lifecycle.i;
import java.util.LinkedHashSet;
import k.s;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1092a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1093b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1094c;
    public final Object d;

    /* renamed from: e, reason: collision with root package name */
    public Parcelable f1095e;

    /* renamed from: f, reason: collision with root package name */
    public Object f1096f;

    public /* synthetic */ d(TextView textView) {
        this.f1095e = null;
        this.f1096f = null;
        this.f1092a = false;
        this.f1093b = false;
        this.d = textView;
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.d;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.f1092a || this.f1093b) {
                Drawable mutate = buttonDrawable.mutate();
                if (this.f1092a) {
                    mutate.setTintList((ColorStateList) this.f1095e);
                }
                if (this.f1093b) {
                    mutate.setTintMode((PorterDuff.Mode) this.f1096f);
                }
                if (mutate.isStateful()) {
                    mutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(mutate);
            }
        }
    }

    public void b() {
        s sVar = (s) this.d;
        Drawable checkMarkDrawable = sVar.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f1092a || this.f1093b) {
                Drawable mutate = checkMarkDrawable.mutate();
                if (this.f1092a) {
                    mutate.setTintList((ColorStateList) this.f1095e);
                }
                if (this.f1093b) {
                    mutate.setTintMode((PorterDuff.Mode) this.f1096f);
                }
                if (mutate.isStateful()) {
                    mutate.setState(sVar.getDrawableState());
                }
                sVar.setCheckMarkDrawable(mutate);
            }
        }
    }

    public Bundle c(String str) {
        if (this.f1093b) {
            Bundle bundle = (Bundle) this.f1095e;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            Bundle bundle3 = (Bundle) this.f1095e;
            if (bundle3 != null) {
                bundle3.remove(str);
            }
            Bundle bundle4 = (Bundle) this.f1095e;
            if (bundle4 != null && !bundle4.isEmpty()) {
                return bundle2;
            }
            this.f1095e = null;
            return bundle2;
        }
        a.b.i("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0060 A[Catch: all -> 0x003f, TryCatch #1 {all -> 0x003f, blocks: (B:3:0x0026, B:5:0x002d, B:8:0x0033, B:9:0x0059, B:11:0x0060, B:12:0x0067, B:14:0x006e, B:21:0x0042, B:23:0x0048, B:25:0x004e), top: B:2:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006e A[Catch: all -> 0x003f, TRY_LEAVE, TryCatch #1 {all -> 0x003f, blocks: (B:3:0x0026, B:5:0x002d, B:8:0x0033, B:9:0x0059, B:11:0x0060, B:12:0x0067, B:14:0x006e, B:21:0x0042, B:23:0x0048, B:25:0x004e), top: B:2:0x0026 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(android.util.AttributeSet r9, int r10) {
        /*
            r8 = this;
            java.lang.Object r8 = r8.d
            r0 = r8
            android.widget.CompoundButton r0 = (android.widget.CompoundButton) r0
            android.content.Context r8 = r0.getContext()
            int[] r2 = f.a.f1539m
            androidx.emoji2.text.s r8 = androidx.emoji2.text.s.r(r8, r9, r2, r10)
            java.lang.Object r1 = r8.f310c
            r7 = r1
            android.content.res.TypedArray r7 = (android.content.res.TypedArray) r7
            android.content.Context r1 = r0.getContext()
            java.lang.Object r3 = r8.f310c
            r4 = r3
            android.content.res.TypedArray r4 = (android.content.res.TypedArray) r4
            java.util.WeakHashMap r3 = j0.j0.f2160a
            r6 = 0
            r3 = r9
            r5 = r10
            j0.g0.b(r0, r1, r2, r3, r4, r5, r6)
            r9 = 1
            boolean r10 = r7.hasValue(r9)     // Catch: java.lang.Throwable -> L3f
            r1 = 0
            if (r10 == 0) goto L42
            int r9 = r7.getResourceId(r9, r1)     // Catch: java.lang.Throwable -> L3f
            if (r9 == 0) goto L42
            android.content.Context r10 = r0.getContext()     // Catch: java.lang.Throwable -> L3f android.content.res.Resources.NotFoundException -> L42
            android.graphics.drawable.Drawable r9 = a.y.B(r10, r9)     // Catch: java.lang.Throwable -> L3f android.content.res.Resources.NotFoundException -> L42
            r0.setButtonDrawable(r9)     // Catch: java.lang.Throwable -> L3f android.content.res.Resources.NotFoundException -> L42
            goto L59
        L3f:
            r0 = move-exception
            r9 = r0
            goto L7f
        L42:
            boolean r9 = r7.hasValue(r1)     // Catch: java.lang.Throwable -> L3f
            if (r9 == 0) goto L59
            int r9 = r7.getResourceId(r1, r1)     // Catch: java.lang.Throwable -> L3f
            if (r9 == 0) goto L59
            android.content.Context r10 = r0.getContext()     // Catch: java.lang.Throwable -> L3f
            android.graphics.drawable.Drawable r9 = a.y.B(r10, r9)     // Catch: java.lang.Throwable -> L3f
            r0.setButtonDrawable(r9)     // Catch: java.lang.Throwable -> L3f
        L59:
            r9 = 2
            boolean r10 = r7.hasValue(r9)     // Catch: java.lang.Throwable -> L3f
            if (r10 == 0) goto L67
            android.content.res.ColorStateList r9 = r8.h(r9)     // Catch: java.lang.Throwable -> L3f
            r0.setButtonTintList(r9)     // Catch: java.lang.Throwable -> L3f
        L67:
            r9 = 3
            boolean r10 = r7.hasValue(r9)     // Catch: java.lang.Throwable -> L3f
            if (r10 == 0) goto L7b
            r10 = -1
            int r9 = r7.getInt(r9, r10)     // Catch: java.lang.Throwable -> L3f
            r10 = 0
            android.graphics.PorterDuff$Mode r9 = k.h1.b(r9, r10)     // Catch: java.lang.Throwable -> L3f
            r0.setButtonTintMode(r9)     // Catch: java.lang.Throwable -> L3f
        L7b:
            r8.t()
            return
        L7f:
            r8.t()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.d.d(android.util.AttributeSet, int):void");
    }

    public void e(String str, c cVar) {
        Object obj;
        cVar.getClass();
        m.f fVar = (m.f) this.d;
        m.c a3 = fVar.a(str);
        if (a3 != null) {
            obj = a3.f2516g;
        } else {
            m.c cVar2 = new m.c(str, cVar);
            fVar.f2522i++;
            m.c cVar3 = fVar.f2521g;
            if (cVar3 == null) {
                fVar.f2520f = cVar2;
                fVar.f2521g = cVar2;
            } else {
                cVar3.h = cVar2;
                cVar2.f2517i = cVar3;
                fVar.f2521g = cVar2;
            }
            obj = null;
        }
        if (((c) obj) == null) {
            return;
        }
        a.b.m("SavedStateProvider with the given key is already registered");
    }

    public void f() {
        if (this.f1094c) {
            a aVar = (a) this.f1096f;
            if (aVar == null) {
                aVar = new a(this);
            }
            this.f1096f = aVar;
            try {
                i.class.getDeclaredConstructor(null);
                a aVar2 = (a) this.f1096f;
                if (aVar2 != null) {
                    ((LinkedHashSet) aVar2.f1091b).add(i.class.getName());
                    return;
                }
                return;
            } catch (NoSuchMethodException e3) {
                throw new IllegalArgumentException("Class " + i.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e3);
            }
        }
        a.b.i("Can not perform this action after onSaveInstanceState");
    }

    public d() {
        this.d = new m.f();
        this.f1094c = true;
    }
}

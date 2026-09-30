package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class x extends AnimationSet implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public final ViewGroup f525f;

    /* renamed from: g, reason: collision with root package name */
    public final View f526g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f527i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f528j;

    public x(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f528j = true;
        this.f525f = viewGroup;
        this.f526g = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j3, Transformation transformation) {
        this.f528j = true;
        if (this.h) {
            return !this.f527i;
        }
        if (!super.getTransformation(j3, transformation)) {
            this.h = true;
            j0.p.a(this.f525f, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z2 = this.h;
        ViewGroup viewGroup = this.f525f;
        if (!z2 && this.f528j) {
            this.f528j = false;
            viewGroup.post(this);
        } else {
            viewGroup.endViewTransition(this.f526g);
            this.f527i = true;
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j3, Transformation transformation, float f3) {
        this.f528j = true;
        if (this.h) {
            return !this.f527i;
        }
        if (!super.getTransformation(j3, transformation, f3)) {
            this.h = true;
            j0.p.a(this.f525f, this);
        }
        return true;
    }
}

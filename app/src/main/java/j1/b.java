package j1;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import n.j;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final j f2196a = new j(0);

    /* renamed from: b, reason: collision with root package name */
    public final j f2197b = new j(0);

    public static b a(Context context, int i3) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i3);
            if (loadAnimator instanceof AnimatorSet) {
                return b(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return b(arrayList);
        } catch (Exception e3) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i3), e3);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, j1.c] */
    public static b b(ArrayList arrayList) {
        b bVar = new b();
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            Animator animator = (Animator) arrayList.get(i3);
            if (animator instanceof ObjectAnimator) {
                ObjectAnimator objectAnimator = (ObjectAnimator) animator;
                bVar.f2197b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
                String propertyName = objectAnimator.getPropertyName();
                long startDelay = objectAnimator.getStartDelay();
                long duration = objectAnimator.getDuration();
                TimeInterpolator interpolator = objectAnimator.getInterpolator();
                ?? obj = new Object();
                obj.d = 0;
                obj.f2201e = 1;
                obj.f2198a = startDelay;
                obj.f2199b = duration;
                obj.f2200c = interpolator;
                obj.d = objectAnimator.getRepeatCount();
                obj.f2201e = objectAnimator.getRepeatMode();
                bVar.f2196a.put(propertyName, obj);
            } else {
                a.b.h(animator, "Animator must be an ObjectAnimator: ");
                return null;
            }
        }
        return bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        return this.f2196a.equals(((b) obj).f2196a);
    }

    public final int hashCode() {
        return this.f2196a.hashCode();
    }

    public final String toString() {
        return "\n" + b.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f2196a + "}\n";
    }
}

package b1;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    public int f952a;

    /* renamed from: b, reason: collision with root package name */
    public int f953b;

    /* renamed from: c, reason: collision with root package name */
    public int f954c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f955e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f956f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f957g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f958i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f959j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f960k;

    /* renamed from: l, reason: collision with root package name */
    public int f961l;

    /* renamed from: m, reason: collision with root package name */
    public long f962m;

    /* renamed from: n, reason: collision with root package name */
    public int f963n;

    public final void a(int i3) {
        if ((this.d & i3) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i3) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        if (this.f957g) {
            return this.f953b - this.f954c;
        }
        return this.f955e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f952a + ", mData=null, mItemCount=" + this.f955e + ", mIsMeasuring=" + this.f958i + ", mPreviousLayoutItemCount=" + this.f953b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f954c + ", mStructureChanged=" + this.f956f + ", mInPreLayout=" + this.f957g + ", mRunSimpleAnimations=" + this.f959j + ", mRunPredictiveAnimations=" + this.f960k + '}';
    }
}

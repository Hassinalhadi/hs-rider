package j0;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public ViewParent f2163a;

    /* renamed from: b, reason: collision with root package name */
    public ViewParent f2164b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f2165c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f2166e;

    public k(ViewGroup viewGroup) {
        this.f2165c = viewGroup;
    }

    public final boolean a(float f3, float f4, boolean z2) {
        ViewParent e3;
        if (this.d && (e3 = e(0)) != null) {
            try {
                return e3.onNestedFling(this.f2165c, f3, f4, z2);
            } catch (AbstractMethodError e4) {
                Log.e("ViewParentCompat", "ViewParent " + e3 + " does not implement interface method onNestedFling", e4);
            }
        }
        return false;
    }

    public final boolean b(float f3, float f4) {
        ViewParent e3;
        if (this.d && (e3 = e(0)) != null) {
            try {
                return e3.onNestedPreFling(this.f2165c, f3, f4);
            } catch (AbstractMethodError e4) {
                Log.e("ViewParentCompat", "ViewParent " + e3 + " does not implement interface method onNestedPreFling", e4);
            }
        }
        return false;
    }

    public final boolean c(int i3, int i4, int i5, int[] iArr, int[] iArr2) {
        ViewParent e3;
        int i6;
        int i7;
        int[] iArr3;
        if (!this.d || (e3 = e(i5)) == null) {
            return false;
        }
        if (i3 == 0 && i4 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        ViewGroup viewGroup = this.f2165c;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i6 = iArr2[0];
            i7 = iArr2[1];
        } else {
            i6 = 0;
            i7 = 0;
        }
        if (iArr == null) {
            if (this.f2166e == null) {
                this.f2166e = new int[2];
            }
            iArr3 = this.f2166e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (e3 instanceof l) {
            ((l) e3).c(viewGroup, i3, i4, iArr3, i5);
            viewGroup = viewGroup;
        } else if (i5 == 0) {
            try {
                e3.onNestedPreScroll(viewGroup, i3, i4, iArr3);
            } catch (AbstractMethodError e4) {
                Log.e("ViewParentCompat", "ViewParent " + e3 + " does not implement interface method onNestedPreScroll", e4);
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i6;
            iArr2[1] = iArr2[1] - i7;
        }
        if (iArr3[0] == 0 && iArr3[1] == 0) {
            return false;
        }
        return true;
    }

    public final boolean d(int i3, int i4, int i5, int i6, int[] iArr, int i7, int[] iArr2) {
        ViewParent e3;
        int i8;
        int i9;
        int[] iArr3;
        if (this.d && (e3 = e(i7)) != null) {
            if (i3 == 0 && i4 == 0 && i5 == 0 && i6 == 0) {
                if (iArr != null) {
                    iArr[0] = 0;
                    iArr[1] = 0;
                    return false;
                }
            } else {
                ViewGroup viewGroup = this.f2165c;
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    i8 = iArr[0];
                    i9 = iArr[1];
                } else {
                    i8 = 0;
                    i9 = 0;
                }
                if (iArr2 == null) {
                    if (this.f2166e == null) {
                        this.f2166e = new int[2];
                    }
                    int[] iArr4 = this.f2166e;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (e3 instanceof m) {
                    ((m) e3).d(viewGroup, i3, i4, i5, i6, i7, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i5;
                    iArr3[1] = iArr3[1] + i6;
                    if (e3 instanceof l) {
                        ((l) e3).e(viewGroup, i3, i4, i5, i6, i7);
                    } else if (i7 == 0) {
                        try {
                            e3.onNestedScroll(viewGroup, i3, i4, i5, i6);
                        } catch (AbstractMethodError e4) {
                            Log.e("ViewParentCompat", "ViewParent " + e3 + " does not implement interface method onNestedScroll", e4);
                        }
                    }
                }
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i8;
                    iArr[1] = iArr[1] - i9;
                }
                return true;
            }
        }
        return false;
    }

    public final ViewParent e(int i3) {
        if (i3 != 0) {
            if (i3 != 1) {
                return null;
            }
            return this.f2164b;
        }
        return this.f2163a;
    }

    public final boolean f(int i3) {
        if (e(i3) != null) {
            return true;
        }
        return false;
    }

    public final boolean g(int i3, int i4) {
        boolean onStartNestedScroll;
        if (!f(i4)) {
            if (this.d) {
                View view = this.f2165c;
                View view2 = view;
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    boolean z2 = parent instanceof l;
                    if (z2) {
                        onStartNestedScroll = ((l) parent).f(view2, view, i3, i4);
                    } else {
                        if (i4 == 0) {
                            try {
                                onStartNestedScroll = parent.onStartNestedScroll(view2, view, i3);
                            } catch (AbstractMethodError e3) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e3);
                            }
                        }
                        onStartNestedScroll = false;
                    }
                    if (onStartNestedScroll) {
                        if (i4 != 0) {
                            if (i4 == 1) {
                                this.f2164b = parent;
                            }
                        } else {
                            this.f2163a = parent;
                        }
                        if (z2) {
                            ((l) parent).a(view2, view, i3, i4);
                        } else if (i4 == 0) {
                            try {
                                parent.onNestedScrollAccepted(view2, view, i3);
                            } catch (AbstractMethodError e4) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e4);
                            }
                        }
                    } else {
                        if (parent instanceof View) {
                            view2 = parent;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void h(int i3) {
        ViewParent e3 = e(i3);
        if (e3 != null) {
            boolean z2 = e3 instanceof l;
            ViewGroup viewGroup = this.f2165c;
            if (z2) {
                ((l) e3).b(viewGroup, i3);
            } else if (i3 == 0) {
                try {
                    e3.onStopNestedScroll(viewGroup);
                } catch (AbstractMethodError e4) {
                    Log.e("ViewParentCompat", "ViewParent " + e3 + " does not implement interface method onStopNestedScroll", e4);
                }
            }
            if (i3 != 0) {
                if (i3 == 1) {
                    this.f2164b = null;
                    return;
                }
                return;
            }
            this.f2163a = null;
        }
    }
}

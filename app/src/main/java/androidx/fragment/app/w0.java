package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public abstract /* synthetic */ class w0 {
    public static final void a(View view, int i3) {
        int a3 = q.e.a(i3);
        if (a3 != 0) {
            if (a3 != 1) {
                if (a3 != 2) {
                    if (a3 == 3) {
                        if (k0.F(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                        }
                        view.setVisibility(4);
                        return;
                    }
                    return;
                }
                if (k0.F(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                }
                view.setVisibility(8);
                return;
            }
            if (k0.F(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            view.setVisibility(0);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            if (k0.F(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
            }
            viewGroup.removeView(view);
        }
    }

    public static int b(int i3) {
        if (i3 != 0) {
            if (i3 == 4) {
                return 4;
            }
            if (i3 == 8) {
                return 3;
            }
            a.b.m(d("Unknown visibility ", i3));
            return 0;
        }
        return 2;
    }

    public static int c(View view) {
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return 4;
        }
        return b(view.getVisibility());
    }

    public static String d(String str, int i3) {
        return str + i3;
    }

    public static /* synthetic */ String e(int i3) {
        switch (i3) {
            case 1:
                return "NONE";
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case 6:
                return "BASELINE";
            case 7:
                return "CENTER";
            case 8:
                return "CENTER_X";
            case 9:
                return "CENTER_Y";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String f(int i3) {
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    return "null";
                }
                return "REMOVING";
            }
            return "ADDING";
        }
        return "NONE";
    }

    public static /* synthetic */ String g(int i3) {
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        return "null";
                    }
                    return "INVISIBLE";
                }
                return "GONE";
            }
            return "VISIBLE";
        }
        return "REMOVED";
    }
}

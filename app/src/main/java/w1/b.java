package w1;

import android.util.Log;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.profileinstaller.ProfileInstallReceiver;
import j0.c1;
import j0.j0;
import j0.n;
import j0.y0;
import java.util.Objects;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class b implements n, z0.e {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f3195f;

    public /* synthetic */ b(Object obj) {
        this.f3195f = obj;
    }

    @Override // z0.e
    public void c() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // j0.n
    public c1 d(View view, c1 c1Var) {
        boolean z2;
        y0 y0Var = c1Var.f2146a;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f3195f;
        if (!Objects.equals(coordinatorLayout.f226s, c1Var)) {
            coordinatorLayout.f226s = c1Var;
            boolean z3 = true;
            if (c1Var.d() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            coordinatorLayout.f227t = z2;
            if (z2 || coordinatorLayout.getBackground() != null) {
                z3 = false;
            }
            coordinatorLayout.setWillNotDraw(z3);
            if (!y0Var.k()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = coordinatorLayout.getChildAt(i3);
                    WeakHashMap weakHashMap = j0.f2160a;
                    if (childAt.getFitsSystemWindows() && ((x.d) childAt.getLayoutParams()).f3262a != null && y0Var.k()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return c1Var;
    }

    @Override // z0.e
    public void e(int i3, Object obj) {
        String str;
        switch (i3) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i3 != 6 && i3 != 7 && i3 != 8) {
            Log.d("ProfileInstaller", str);
        } else {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        }
        ((ProfileInstallReceiver) this.f3195f).setResultCode(i3);
    }
}

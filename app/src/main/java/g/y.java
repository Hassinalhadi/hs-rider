package g;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class y extends androidx.fragment.app.j {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1778c = 0;
    public final /* synthetic */ c0 d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f1779e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(c0 c0Var, Context context) {
        super(c0Var);
        this.d = c0Var;
        this.f1779e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @Override // androidx.fragment.app.j
    public final IntentFilter e() {
        switch (this.f1778c) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [g.i0, java.lang.Object] */
    @Override // androidx.fragment.app.j
    public final int f() {
        Location location;
        boolean z2;
        long j3;
        Location location2;
        switch (this.f1778c) {
            case 0:
                if (t.a((PowerManager) this.f1779e)) {
                    return 2;
                }
                return 1;
            default:
                androidx.emoji2.text.s sVar = (androidx.emoji2.text.s) this.f1779e;
                j0 j0Var = (j0) sVar.d;
                LocationManager locationManager = (LocationManager) sVar.f310c;
                if (j0Var.f1722b > System.currentTimeMillis()) {
                    z2 = j0Var.f1721a;
                } else {
                    Context context = (Context) sVar.f309b;
                    Location location3 = null;
                    if (a.y.p(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                        try {
                        } catch (Exception e3) {
                            Log.d("TwilightManager", "Failed to get last known location", e3);
                        }
                        if (locationManager.isProviderEnabled("network")) {
                            location2 = locationManager.getLastKnownLocation("network");
                            location = location2;
                        }
                        location2 = null;
                        location = location2;
                    } else {
                        location = null;
                    }
                    if (a.y.p(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                location3 = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e4) {
                            Log.d("TwilightManager", "Failed to get last known location", e4);
                        }
                    }
                    if (location3 == null || location == null ? location3 != null : location3.getTime() > location.getTime()) {
                        location = location3;
                    }
                    z2 = false;
                    if (location != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (i0.d == null) {
                            i0.d = new Object();
                        }
                        i0 i0Var = i0.d;
                        i0Var.a(location.getLatitude(), location.getLongitude(), currentTimeMillis - 86400000);
                        i0Var.a(location.getLatitude(), location.getLongitude(), currentTimeMillis);
                        if (i0Var.f1720c == 1) {
                            z2 = true;
                        }
                        long j4 = i0Var.f1719b;
                        long j5 = i0Var.f1718a;
                        i0Var.a(location.getLatitude(), location.getLongitude(), currentTimeMillis + 86400000);
                        long j6 = i0Var.f1719b;
                        if (j4 != -1 && j5 != -1) {
                            if (currentTimeMillis > j5) {
                                j4 = j6;
                            } else if (currentTimeMillis > j4) {
                                j4 = j5;
                            }
                            j3 = j4 + 60000;
                        } else {
                            j3 = currentTimeMillis + 43200000;
                        }
                        j0Var.f1721a = z2;
                        j0Var.f1722b = j3;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i3 = Calendar.getInstance().get(11);
                        if (i3 < 6 || i3 >= 22) {
                            z2 = true;
                        }
                    }
                }
                if (!z2) {
                    return 1;
                }
                return 2;
        }
    }

    @Override // androidx.fragment.app.j
    public final void h() {
        switch (this.f1778c) {
            case 0:
                this.d.m(true, true);
                return;
            default:
                this.d.m(true, true);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(c0 c0Var, androidx.emoji2.text.s sVar) {
        super(c0Var);
        this.d = c0Var;
        this.f1779e = sVar;
    }
}

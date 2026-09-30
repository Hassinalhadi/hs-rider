package i2;

import de.robv.android.xposed.XC_MethodHook;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class a extends XC_MethodHook {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1994a;

    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        int i3 = this.f1994a;
        methodHookParam.getClass();
        switch (i3) {
            case 0:
                super.beforeHookedMethod(methodHookParam);
                methodHookParam.setResult((Object) null);
                return;
            default:
                super.beforeHookedMethod(methodHookParam);
                methodHookParam.setResult("com.android.vending");
                return;
        }
    }
}

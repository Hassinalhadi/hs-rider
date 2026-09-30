package i2;

import android.app.Application;
import android.content.SharedPreferences;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import r2.d;
import r2.e;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class b extends XC_MethodHook {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1995a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1996b;

    public /* synthetic */ b(int i3, Object obj) {
        this.f1995a = i3;
        this.f1996b = obj;
    }

    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        ClassLoader classLoader;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        switch (this.f1995a) {
            case 1:
                ClassLoader classLoader2 = (ClassLoader) this.f1996b;
                methodHookParam.getClass();
                super.afterHookedMethod(methodHookParam);
                Object obj = methodHookParam.thisObject;
                obj.getClass();
                SharedPreferences sharedPreferences = ((Application) obj).getSharedPreferences("com.logistics.rider.settings", 0);
                String string = sharedPreferences.getString("brand", "someBrand");
                String string2 = sharedPreferences.getString("model", "someModel");
                String string3 = sharedPreferences.getString("manufacturer", "someManufacturer");
                String string4 = sharedPreferences.getString("product", "someProduct");
                String string5 = sharedPreferences.getString("board", "someBoard");
                String string6 = sharedPreferences.getString("device", "someDevice");
                String string7 = sharedPreferences.getString("bootloader", "someBootloader");
                String string8 = sharedPreferences.getString("fingerprint", "someFingerprint");
                if (!sharedPreferences.getBoolean("spoof_device", false)) {
                    d dVar = e.f2833f;
                    String str6 = h2.a.f1907a[dVar.a(10)];
                    String str7 = h2.a.f1909c[dVar.a(10)];
                    str5 = h2.a.f1908b[dVar.a(10)];
                    String str8 = h2.a.f1911f[dVar.a(10)];
                    classLoader = classLoader2;
                    String str9 = h2.a.f1910e[dVar.a(10)];
                    String str10 = h2.a.d[dVar.a(10)];
                    String str11 = h2.a.f1912g[dVar.a(10)];
                    str4 = h2.a.h[dVar.a(10)];
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.putString("brand", str6);
                    edit.putString("model", str7);
                    edit.putString("manufacturer", str5);
                    edit.putString("product", str8);
                    edit.putString("board", str9);
                    edit.putString("device", str10);
                    edit.putString("bootloader", str11);
                    edit.putString("fingerprint", str4);
                    edit.putBoolean("spoof_device", true);
                    edit.apply();
                    string4 = str8;
                    str2 = str11;
                    str3 = str7;
                    string6 = str10;
                    str = str6;
                    string5 = str9;
                } else {
                    classLoader = classLoader2;
                    str = string;
                    str2 = string7;
                    str3 = string2;
                    str4 = string8;
                    str5 = string3;
                }
                ClassLoader classLoader3 = classLoader;
                XposedHelpers.setStaticObjectField(classLoader3.loadClass("android.os.Build"), "BRAND", str);
                XposedHelpers.setStaticObjectField(classLoader3.loadClass("android.os.Build"), "MODEL", str3);
                XposedHelpers.setStaticObjectField(classLoader3.loadClass("android.os.Build"), "MANUFACTURER", str5);
                XposedHelpers.setStaticObjectField(classLoader3.loadClass("android.os.Build"), "PRODUCT", string4);
                XposedHelpers.setStaticObjectField(classLoader3.loadClass("android.os.Build"), "BOARD", string5);
                XposedHelpers.setStaticObjectField(classLoader3.loadClass("android.os.Build"), "DEVICE", string6);
                XposedHelpers.setStaticObjectField(classLoader3.loadClass("android.os.Build"), "BOOTLOADER", str2);
                XposedHelpers.setStaticObjectField(classLoader3.loadClass("android.os.Build"), "FINGERPRINT", str4);
                return;
            default:
                super.afterHookedMethod(methodHookParam);
                return;
        }
    }

    public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        switch (this.f1995a) {
            case 0:
                methodHookParam.getClass();
                super.beforeHookedMethod(methodHookParam);
                if (p2.d.a(methodHookParam.args[0], (String) this.f1996b)) {
                    methodHookParam.setResult("com.android.vending");
                    return;
                }
                return;
            default:
                super.beforeHookedMethod(methodHookParam);
                return;
        }
    }
}

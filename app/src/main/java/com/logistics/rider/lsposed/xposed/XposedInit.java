package com.logistics.rider.lsposed.xposed;

import android.app.Application;
import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import i2.a;
import i2.b;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class XposedInit implements IXposedHookLoadPackage {
    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam loadPackageParam) {
        loadPackageParam.getClass();
        String str = loadPackageParam.packageName;
        if (!"com.logistics.rider.hungerstation".equals(str)) {
            return;
        }
        ClassLoader classLoader = loadPackageParam.classLoader;
        Class<?> loadClass = classLoader.loadClass("o.ewG");
        Class findClass = XposedHelpers.findClass("android.app.ApplicationPackageManager", classLoader);
        Class<?> loadClass2 = classLoader.loadClass("android.content.pm.InstallSourceInfo");
        XposedHelpers.findAndHookMethod(loadClass, "serializer", new Object[]{new a(0)});
        XposedHelpers.findAndHookMethod(findClass, "getInstallerPackageName", new Object[]{String.class, new b(0, str)});
        XposedHelpers.findAndHookMethod(loadClass2, "getInstallingPackageName", new Object[]{new a(1)});
        XposedBridge.hookMethod(Application.class.getDeclaredMethod("onCreate", null), new b(1, classLoader));
    }
}

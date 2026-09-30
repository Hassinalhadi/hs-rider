package g0;

import a.y;
import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import android.os.Trace;
import android.util.Log;
import b1.k1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final k1 f1784a = new k1(2);

    /* renamed from: b, reason: collision with root package name */
    public static final a f1785b = new Object();

    public static g.f a(Context context, List list) {
        y.i("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < list.size(); i3++) {
                d dVar = (d) list.get(i3);
                ProviderInfo b3 = b(context.getPackageManager(), dVar, context.getResources());
                if (b3 == null) {
                    return new g.f();
                }
                arrayList.add(c(context, dVar, b3.authority));
            }
            return new g.f(arrayList);
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [g0.b, java.lang.Object] */
    public static ProviderInfo b(PackageManager packageManager, d dVar, Resources resources) {
        a aVar = f1785b;
        k1 k1Var = f1784a;
        y.i("FontProvider.getProvider");
        try {
            List list = dVar.d;
            String str = dVar.f1786a;
            String str2 = dVar.f1787b;
            if (list == null) {
                list = b0.b.j(resources, 0);
            }
            ?? obj = new Object();
            obj.f1781a = str;
            obj.f1782b = str2;
            obj.f1783c = list;
            ProviderInfo providerInfo = (ProviderInfo) k1Var.f(obj);
            if (providerInfo != null) {
                return providerInfo;
            }
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (resolveContentProvider != null) {
                if (resolveContentProvider.packageName.equals(str2)) {
                    Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
                    ArrayList arrayList = new ArrayList();
                    for (Signature signature : signatureArr) {
                        arrayList.add(signature.toByteArray());
                    }
                    Collections.sort(arrayList, aVar);
                    for (int i3 = 0; i3 < list.size(); i3++) {
                        ArrayList arrayList2 = new ArrayList((Collection) list.get(i3));
                        Collections.sort(arrayList2, aVar);
                        if (arrayList.size() == arrayList2.size()) {
                            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                                if (!Arrays.equals((byte[]) arrayList.get(i4), (byte[]) arrayList2.get(i4))) {
                                    break;
                                }
                            }
                            k1Var.j(obj, resolveContentProvider);
                            return resolveContentProvider;
                        }
                    }
                    Trace.endSection();
                    return null;
                }
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
            }
            throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
        } finally {
            Trace.endSection();
        }
    }

    public static i[] c(Context context, d dVar, String str) {
        int i3;
        int i4;
        Uri withAppendedId;
        int i5;
        boolean z2;
        y.i("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri build = new Uri.Builder().scheme("content").authority(str).build();
            Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(build);
            Cursor cursor = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                y.i("ContentQueryWrapper.query");
                try {
                    String[] strArr2 = {dVar.f1788c};
                    if (acquireUnstableContentProviderClient != null) {
                        try {
                            cursor = acquireUnstableContentProviderClient.query(build, strArr, "query = ?", strArr2, null, null);
                        } catch (RemoteException e3) {
                            Log.w("FontsProvider", "Unable to query the content provider", e3);
                        }
                    }
                    Trace.endSection();
                    if (cursor != null && cursor.getCount() > 0) {
                        int columnIndex = cursor.getColumnIndex("result_code");
                        ArrayList arrayList2 = new ArrayList();
                        int columnIndex2 = cursor.getColumnIndex("_id");
                        int columnIndex3 = cursor.getColumnIndex("file_id");
                        int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursor.getColumnIndex("font_weight");
                        int columnIndex6 = cursor.getColumnIndex("font_italic");
                        while (cursor.moveToNext()) {
                            if (columnIndex != -1) {
                                i3 = cursor.getInt(columnIndex);
                            } else {
                                i3 = 0;
                            }
                            if (columnIndex4 != -1) {
                                i4 = cursor.getInt(columnIndex4);
                            } else {
                                i4 = 0;
                            }
                            if (columnIndex3 == -1) {
                                withAppendedId = ContentUris.withAppendedId(build, cursor.getLong(columnIndex2));
                            } else {
                                withAppendedId = ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                            }
                            Uri uri = withAppendedId;
                            if (columnIndex5 != -1) {
                                i5 = cursor.getInt(columnIndex5);
                            } else {
                                i5 = 400;
                            }
                            if (columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            arrayList2.add(new i(uri, i4, i5, z2, i3));
                        }
                        arrayList = arrayList2;
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (acquireUnstableContentProviderClient != null) {
                        acquireUnstableContentProviderClient.close();
                    }
                    return (i[]) arrayList.toArray(new i[0]);
                } finally {
                }
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                if (acquireUnstableContentProviderClient != null) {
                    acquireUnstableContentProviderClient.close();
                }
                throw th;
            }
        } finally {
        }
    }
}

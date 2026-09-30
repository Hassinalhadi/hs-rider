package a;

import android.R;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.Trace;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b1.n0;
import b1.z0;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import j0.c1;
import j0.l0;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import k.h2;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public abstract class y implements l0 {
    public static Drawable B(Context context, int i3) {
        return h2.b().c(context, i3);
    }

    public static Set C() {
        try {
            Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (invoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) invoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static MappedByteBuffer N(Context context, Uri uri) {
        ParcelFileDescriptor openFileDescriptor;
        try {
            openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
        } catch (IOException unused) {
        }
        if (openFileDescriptor == null) {
            if (openFileDescriptor != null) {
                openFileDescriptor.close();
                return null;
            }
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                openFileDescriptor.close();
                return map;
            } finally {
            }
        } finally {
        }
    }

    public static void O(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [j0.z, r0.b] */
    public static r0.b Y(MappedByteBuffer mappedByteBuffer) {
        long j3;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i3 = duplicate.getShort() & 65535;
        if (i3 <= 100) {
            duplicate.position(duplicate.position() + 6);
            int i4 = 0;
            while (true) {
                if (i4 < i3) {
                    int i5 = duplicate.getInt();
                    duplicate.position(duplicate.position() + 4);
                    j3 = duplicate.getInt() & 4294967295L;
                    duplicate.position(duplicate.position() + 4);
                    if (1835365473 == i5) {
                        break;
                    }
                    i4++;
                } else {
                    j3 = -1;
                    break;
                }
            }
            if (j3 != -1) {
                duplicate.position(duplicate.position() + ((int) (j3 - duplicate.position())));
                duplicate.position(duplicate.position() + 12);
                long j4 = duplicate.getInt() & 4294967295L;
                for (int i6 = 0; i6 < j4; i6++) {
                    int i7 = duplicate.getInt();
                    long j5 = duplicate.getInt() & 4294967295L;
                    duplicate.getInt();
                    if (1164798569 == i7 || 1701669481 == i7) {
                        duplicate.position((int) (j5 + j3));
                        ?? zVar = new j0.z();
                        duplicate.order(ByteOrder.LITTLE_ENDIAN);
                        int position = duplicate.position() + duplicate.getInt(duplicate.position());
                        zVar.d = duplicate;
                        zVar.f2190a = position;
                        int i8 = position - duplicate.getInt(position);
                        zVar.f2191b = i8;
                        zVar.f2192c = ((ByteBuffer) zVar.d).getShort(i8);
                        return zVar;
                    }
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }

    public static void Z(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() != null && colorStateList != null && colorStateList.isStateful()) {
            int[] drawableState = textInputLayout.getDrawableState();
            int[] drawableState2 = checkableImageButton.getDrawableState();
            int length = drawableState.length;
            int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
            System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
            int colorForState = colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor());
            Drawable mutate = drawable.mutate();
            mutate.setTintList(ColorStateList.valueOf(colorForState));
            checkableImageButton.setImageDrawable(mutate);
        }
    }

    public static void a0(Window window, boolean z2) {
        int i3;
        if (Build.VERSION.SDK_INT >= 35) {
            window.setDecorFitsSystemWindows(z2);
            return;
        }
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        if (z2) {
            i3 = systemUiVisibility & (-257);
        } else {
            i3 = systemUiVisibility | 256;
        }
        decorView.setSystemUiVisibility(i3);
        window.setDecorFitsSystemWindows(z2);
    }

    public static void b0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean z2;
        boolean hasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z3 = false;
        int i3 = 1;
        if (onLongClickListener != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (hasOnClickListeners || z2) {
            z3 = true;
        }
        checkableImageButton.setFocusable(z3);
        checkableImageButton.setClickable(hasOnClickListeners);
        checkableImageButton.setPressable(hasOnClickListeners);
        checkableImageButton.setLongClickable(z2);
        if (!z3) {
            i3 = 2;
        }
        checkableImageButton.setImportantForAccessibility(i3);
    }

    public static void c0(View view, b2.j jVar) {
        v1.a aVar = jVar.f999g.f984c;
        if (aVar != null && aVar.f3182a) {
            float f3 = 0.0f;
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                f3 += ((View) parent).getElevation();
            }
            b2.h hVar = jVar.f999g;
            if (hVar.f992m != f3) {
                hVar.f992m = f3;
                jVar.r();
            }
        }
    }

    public static int e0(Context context, int i3) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i3});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static void h(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList != null && colorStateList.isStateful()) {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
                drawable.setTintList(ColorStateList.valueOf(colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor())));
            } else {
                drawable.setTintList(colorStateList);
            }
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static void i(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    public static void l(boolean z2, String str) {
        if (z2) {
            return;
        }
        b.m(str);
    }

    public static void m(int i3) {
        if (i3 >= 0) {
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static void n(Object obj, String str) {
        if (obj != null) {
        } else {
            throw new NullPointerException(str);
        }
    }

    public static void o(int i3, int i4, int i5) {
        if (i3 >= 0 && i4 <= i5) {
            if (i3 <= i4) {
                return;
            }
            throw new IllegalArgumentException("fromIndex: " + i3 + " > toIndex: " + i4);
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i3 + ", toIndex: " + i4 + ", size: " + i5);
    }

    public static int p(Context context, String str) {
        int noteProxyOpNoThrow;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) != -1) {
            String permissionToOp = AppOpsManager.permissionToOp(str);
            if (permissionToOp != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int myUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (myUid2 == myUid && Objects.equals(packageName2, packageName)) {
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                    int callingUid = Binder.getCallingUid();
                    int i3 = 1;
                    if (appOpsManager == null) {
                        noteProxyOpNoThrow = 1;
                    } else {
                        noteProxyOpNoThrow = appOpsManager.checkOpNoThrow(permissionToOp, callingUid, packageName);
                    }
                    if (noteProxyOpNoThrow == 0) {
                        String opPackageName = context.getOpPackageName();
                        if (appOpsManager != null) {
                            i3 = appOpsManager.checkOpNoThrow(permissionToOp, myUid, opPackageName);
                        }
                        noteProxyOpNoThrow = i3;
                    }
                } else {
                    noteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, packageName);
                }
                if (noteProxyOpNoThrow != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    public static int q(int i3, int i4, int i5) {
        if (i3 < i4) {
            return i4;
        }
        if (i3 > i5) {
            return i5;
        }
        return i3;
    }

    public static int r(z0 z0Var, androidx.emoji2.text.f fVar, View view, View view2, n0 n0Var, boolean z2) {
        if (n0Var.v() != 0 && z0Var.b() != 0 && view != null && view2 != null) {
            if (!z2) {
                return Math.abs(n0.H(view) - n0.H(view2)) + 1;
            }
            return Math.min(fVar.l(), fVar.b(view2) - fVar.e(view));
        }
        return 0;
    }

    public static int s(z0 z0Var, androidx.emoji2.text.f fVar, View view, View view2, n0 n0Var, boolean z2, boolean z3) {
        int max;
        if (n0Var.v() == 0 || z0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(n0.H(view), n0.H(view2));
        int max2 = Math.max(n0.H(view), n0.H(view2));
        if (z3) {
            max = Math.max(0, (z0Var.b() - max2) - 1);
        } else {
            max = Math.max(0, min);
        }
        if (!z2) {
            return max;
        }
        return Math.round((max * (Math.abs(fVar.b(view2) - fVar.e(view)) / (Math.abs(n0.H(view) - n0.H(view2)) + 1))) + (fVar.k() - fVar.e(view)));
    }

    public static int t(z0 z0Var, androidx.emoji2.text.f fVar, View view, View view2, n0 n0Var, boolean z2) {
        if (n0Var.v() != 0 && z0Var.b() != 0 && view != null && view2 != null) {
            if (!z2) {
                return z0Var.b();
            }
            return (int) (((fVar.b(view2) - fVar.e(view)) / (Math.abs(n0.H(view) - n0.H(view2)) + 1)) * z0Var.b());
        }
        return 0;
    }

    public static ImageView.ScaleType u(int i3) {
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 != 5) {
                            if (i3 != 6) {
                                return ImageView.ScaleType.CENTER;
                            }
                            return ImageView.ScaleType.CENTER_INSIDE;
                        }
                        return ImageView.ScaleType.CENTER_CROP;
                    }
                    return ImageView.ScaleType.FIT_END;
                }
                return ImageView.ScaleType.FIT_CENTER;
            }
            return ImageView.ScaleType.FIT_START;
        }
        return ImageView.ScaleType.FIT_XY;
    }

    public static float[] v(float[] fArr, int i3) {
        if (i3 >= 0) {
            int length = fArr.length;
            if (length >= 0) {
                int min = Math.min(i3, length);
                float[] fArr2 = new float[i3];
                System.arraycopy(fArr, 0, fArr2, 0, min);
                return fArr2;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.emoji2.text.u, androidx.emoji2.text.f] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.emoji2.text.u w(android.content.Context r8) {
        /*
            android.content.pm.PackageManager r0 = r8.getPackageManager()
            java.lang.String r1 = "Package manager required to locate emoji font provider"
            n(r0, r1)
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "androidx.content.action.LOAD_EMOJI_FONT"
            r1.<init>(r2)
            r2 = 0
            java.util.List r1 = r0.queryIntentContentProviders(r1, r2)
            java.util.Iterator r1 = r1.iterator()
        L19:
            boolean r3 = r1.hasNext()
            r4 = 0
            if (r3 == 0) goto L35
            java.lang.Object r3 = r1.next()
            android.content.pm.ResolveInfo r3 = (android.content.pm.ResolveInfo) r3
            android.content.pm.ProviderInfo r3 = r3.providerInfo
            if (r3 == 0) goto L19
            android.content.pm.ApplicationInfo r5 = r3.applicationInfo
            if (r5 == 0) goto L19
            int r5 = r5.flags
            r6 = 1
            r5 = r5 & r6
            if (r5 != r6) goto L19
            goto L36
        L35:
            r3 = r4
        L36:
            if (r3 != 0) goto L3a
        L38:
            r2 = r4
            goto L6d
        L3a:
            java.lang.String r1 = r3.authority     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
            java.lang.String r3 = r3.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
            r5 = 64
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r3, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
            android.content.pm.Signature[] r0 = r0.signatures     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
            r5.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
            int r6 = r0.length     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
        L4c:
            if (r2 >= r6) goto L5a
            r7 = r0[r2]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
            byte[] r7 = r7.toByteArray()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
            r5.add(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
            int r2 = r2 + 1
            goto L4c
        L5a:
            java.util.List r0 = java.util.Collections.singletonList(r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
            g0.d r2 = new g0.d     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
            java.lang.String r5 = "emojicompat-emoji-font"
            r2.<init>(r1, r3, r5, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L66
            goto L6d
        L66:
            r0 = move-exception
            java.lang.String r1 = "emoji2.text.DefaultEmojiConfig"
            android.util.Log.wtf(r1, r0)
            goto L38
        L6d:
            if (r2 != 0) goto L70
            goto L7a
        L70:
            androidx.emoji2.text.u r4 = new androidx.emoji2.text.u
            androidx.emoji2.text.t r0 = new androidx.emoji2.text.t
            r0.<init>(r8, r2)
            r4.<init>(r0)
        L7a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: a.y.w(android.content.Context):androidx.emoji2.text.u");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, a.y] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, a.y] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, a.y] */
    public static y x(int i3) {
        if (i3 != 0) {
            if (i3 != 1) {
                return new Object();
            }
            return new Object();
        }
        return new Object();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x007a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0096 A[Catch: NumberFormatException -> 0x00aa, LOOP:3: B:25:0x0068->B:35:0x0096, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e2 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static c0.d[] y(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.y.y(java.lang.String):c0.d[]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0047, code lost:
    
        if (r5.f691c == r8.hashCode()) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.res.ColorStateList z(android.content.Context r8, int r9) {
        /*
            android.content.res.Resources r0 = r8.getResources()
            android.content.res.Resources$Theme r8 = r8.getTheme()
            b0.j r1 = new b0.j
            r1.<init>(r0, r8)
            java.lang.Object r2 = b0.l.f698c
            monitor-enter(r2)
            java.util.WeakHashMap r3 = b0.l.f697b     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Throwable -> L3c
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch: java.lang.Throwable -> L3c
            r4 = 0
            if (r3 == 0) goto L50
            int r5 = r3.size()     // Catch: java.lang.Throwable -> L3c
            if (r5 <= 0) goto L50
            java.lang.Object r5 = r3.get(r9)     // Catch: java.lang.Throwable -> L3c
            b0.i r5 = (b0.i) r5     // Catch: java.lang.Throwable -> L3c
            if (r5 == 0) goto L50
            android.content.res.Configuration r6 = r5.f690b     // Catch: java.lang.Throwable -> L3c
            android.content.res.Configuration r7 = r0.getConfiguration()     // Catch: java.lang.Throwable -> L3c
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L4d
            if (r8 != 0) goto L3f
            int r6 = r5.f691c     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L49
            goto L3f
        L3c:
            r8 = move-exception
            goto Lb8
        L3f:
            if (r8 == 0) goto L4d
            int r6 = r5.f691c     // Catch: java.lang.Throwable -> L3c
            int r7 = r8.hashCode()     // Catch: java.lang.Throwable -> L3c
            if (r6 != r7) goto L4d
        L49:
            android.content.res.ColorStateList r3 = r5.f689a     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            goto L52
        L4d:
            r3.remove(r9)     // Catch: java.lang.Throwable -> L3c
        L50:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            r3 = r4
        L52:
            if (r3 == 0) goto L55
            return r3
        L55:
            java.lang.ThreadLocal r2 = b0.l.f696a
            java.lang.Object r3 = r2.get()
            android.util.TypedValue r3 = (android.util.TypedValue) r3
            if (r3 != 0) goto L67
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            r2.set(r3)
        L67:
            r2 = 1
            r0.getValue(r9, r3, r2)
            int r2 = r3.type
            r3 = 28
            if (r2 < r3) goto L76
            r3 = 31
            if (r2 > r3) goto L76
            goto L87
        L76:
            android.content.res.XmlResourceParser r2 = r0.getXml(r9)
            android.content.res.ColorStateList r4 = b0.c.a(r0, r2, r8)     // Catch: java.lang.Exception -> L7f
            goto L87
        L7f:
            r2 = move-exception
            java.lang.String r3 = "ResourcesCompat"
            java.lang.String r5 = "Failed to inflate ColorStateList, leaving it to the framework"
            android.util.Log.w(r3, r5, r2)
        L87:
            if (r4 == 0) goto Lb3
            java.lang.Object r2 = b0.l.f698c
            monitor-enter(r2)
            java.util.WeakHashMap r0 = b0.l.f697b     // Catch: java.lang.Throwable -> L9f
            java.lang.Object r3 = r0.get(r1)     // Catch: java.lang.Throwable -> L9f
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch: java.lang.Throwable -> L9f
            if (r3 != 0) goto La1
            android.util.SparseArray r3 = new android.util.SparseArray     // Catch: java.lang.Throwable -> L9f
            r3.<init>()     // Catch: java.lang.Throwable -> L9f
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> L9f
            goto La1
        L9f:
            r8 = move-exception
            goto Lb1
        La1:
            b0.i r0 = new b0.i     // Catch: java.lang.Throwable -> L9f
            android.content.res.Resources r1 = r1.f692a     // Catch: java.lang.Throwable -> L9f
            android.content.res.Configuration r1 = r1.getConfiguration()     // Catch: java.lang.Throwable -> L9f
            r0.<init>(r4, r1, r8)     // Catch: java.lang.Throwable -> L9f
            r3.append(r9, r0)     // Catch: java.lang.Throwable -> L9f
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9f
            goto Lb7
        Lb1:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9f
            throw r8
        Lb3:
            android.content.res.ColorStateList r4 = r0.getColorStateList(r9, r8)
        Lb7:
            return r4
        Lb8:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.y.z(android.content.Context, int):android.content.res.ColorStateList");
    }

    public abstract void A(b2.w wVar, float f3, float f4);

    public abstract int D();

    public abstract int E();

    public abstract int F();

    public abstract int G();

    public abstract int H(View view);

    public abstract int I(CoordinatorLayout coordinatorLayout);

    public abstract int J();

    public abstract boolean K(float f3);

    public abstract boolean L(View view);

    public abstract boolean M(float f3, float f4);

    public abstract void P(j0.n0 n0Var);

    public abstract void Q(Throwable th);

    public abstract View R(int i3);

    public abstract boolean S();

    public abstract void T(androidx.emoji2.text.w wVar);

    public abstract void U(j0.n0 n0Var);

    public abstract c1 V(c1 c1Var, List list);

    public abstract androidx.emoji2.text.p W(j0.n0 n0Var, androidx.emoji2.text.p pVar);

    public abstract Object X(Intent intent, int i3);

    public abstract boolean d0(View view, float f3);

    public abstract void f0(ViewGroup.MarginLayoutParams marginLayoutParams, int i3, int i4);

    public abstract int j(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract float k(int i3);

    @Override // j0.l0
    public void c() {
    }

    @Override // j0.l0
    public void g() {
    }
}

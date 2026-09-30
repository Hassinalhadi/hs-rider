package p0;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.emoji2.text.m;
import com.google.android.material.chip.Chip;
import j0.j0;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class a extends m {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b f2662i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar) {
        super(19);
        this.f2662i = bVar;
    }

    @Override // androidx.emoji2.text.m
    public final k0.d s(int i3) {
        return new k0.d(AccessibilityNodeInfo.obtain(this.f2662i.n(i3).f2476a));
    }

    @Override // androidx.emoji2.text.m
    public final k0.d t(int i3) {
        int i4;
        b bVar = this.f2662i;
        if (i3 == 2) {
            i4 = bVar.f2671k;
        } else {
            i4 = bVar.f2672l;
        }
        if (i4 == Integer.MIN_VALUE) {
            return null;
        }
        return s(i4);
    }

    @Override // androidx.emoji2.text.m
    public final boolean v(int i3, int i4, Bundle bundle) {
        int i5;
        b bVar = this.f2662i;
        Chip chip = bVar.f2669i;
        if (i3 != -1) {
            if (i4 != 1) {
                if (i4 != 2) {
                    boolean z2 = false;
                    if (i4 != 64) {
                        if (i4 != 128) {
                            Chip chip2 = ((r1.d) bVar).f2808q;
                            if (i4 == 16) {
                                if (i3 == 0) {
                                    return chip2.performClick();
                                }
                                if (i3 == 1) {
                                    chip2.playSoundEffect(0);
                                    View.OnClickListener onClickListener = chip2.f1201m;
                                    if (onClickListener != null) {
                                        onClickListener.onClick(chip2);
                                        z2 = true;
                                    }
                                    if (chip2.f1212x) {
                                        chip2.f1211w.r(1, 1);
                                    }
                                }
                            }
                            return z2;
                        }
                        if (bVar.f2671k != i3) {
                            return false;
                        }
                        bVar.f2671k = Integer.MIN_VALUE;
                        chip.invalidate();
                        bVar.r(i3, 65536);
                        return true;
                    }
                    AccessibilityManager accessibilityManager = bVar.h;
                    if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i5 = bVar.f2671k) == i3) {
                        return false;
                    }
                    if (i5 != Integer.MIN_VALUE) {
                        bVar.f2671k = Integer.MIN_VALUE;
                        chip.invalidate();
                        bVar.r(i5, 65536);
                    }
                    bVar.f2671k = i3;
                    chip.invalidate();
                    bVar.r(i3, 32768);
                    return true;
                }
                return bVar.j(i3);
            }
            return bVar.q(i3);
        }
        WeakHashMap weakHashMap = j0.f2160a;
        return chip.performAccessibilityAction(i4, bundle);
    }
}

package com.google.android.material.datepicker;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;
import com.logistics.rider.lsposed.R;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class j extends j0.b {
    public final /* synthetic */ int d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1233e;

    public /* synthetic */ j(int i3, Object obj) {
        this.d = i3;
        this.f1233e = obj;
    }

    @Override // j0.b
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.d) {
            case 2:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.f1233e).f1294i);
                return;
            default:
                super.c(view, accessibilityEvent);
                return;
        }
    }

    @Override // j0.b
    public final void d(View view, k0.d dVar) {
        String string;
        int i3;
        int i4 = this.d;
        Object obj = this.f1233e;
        View.AccessibilityDelegate accessibilityDelegate = this.f2142a;
        switch (i4) {
            case 0:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, dVar.f2476a);
                m mVar = (m) obj;
                if (mVar.f1245j0.getVisibility() == 0) {
                    string = mVar.B().getResources().getString(R.string.mtrl_picker_toggle_to_year_selection);
                } else {
                    string = mVar.B().getResources().getString(R.string.mtrl_picker_toggle_to_day_selection);
                }
                dVar.b(new k0.c(string, 16));
                return;
            case 1:
                AccessibilityNodeInfo accessibilityNodeInfo = dVar.f2476a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                int i5 = MaterialButtonToggleGroup.f1188v;
                if (view instanceof MaterialButton) {
                    int i6 = 0;
                    for (int i7 = 0; i7 < materialButtonToggleGroup.getChildCount(); i7++) {
                        if (materialButtonToggleGroup.getChildAt(i7) == view) {
                            i3 = i6;
                            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, i3, 1, false, ((MaterialButton) view).f1181t));
                            return;
                        } else {
                            if ((materialButtonToggleGroup.getChildAt(i7) instanceof MaterialButton) && materialButtonToggleGroup.getChildAt(i7).getVisibility() != 8) {
                                i6++;
                            }
                        }
                    }
                }
                i3 = -1;
                accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, i3, 1, false, ((MaterialButton) view).f1181t));
                return;
            case 2:
                AccessibilityNodeInfo accessibilityNodeInfo2 = dVar.f2476a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo2.setCheckable(checkableImageButton.f1295j);
                accessibilityNodeInfo2.setChecked(checkableImageButton.f1294i);
                return;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo3 = dVar.f2476a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                accessibilityNodeInfo3.setCheckable(((NavigationMenuItemView) obj).C);
                return;
        }
    }
}

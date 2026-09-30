package r1;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.google.android.material.chip.Chip;
import com.logistics.rider.lsposed.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class d extends p0.b {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Chip f2808q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Chip chip, Chip chip2) {
        super(chip2);
        this.f2808q = chip;
    }

    @Override // p0.b
    public final void l(ArrayList arrayList) {
        e eVar;
        arrayList.add(0);
        Rect rect = Chip.B;
        Chip chip = this.f2808q;
        if (chip.c() && (eVar = chip.f1198j) != null && eVar.V && chip.f1201m != null) {
            arrayList.add(1);
        }
    }

    @Override // p0.b
    public final void o(int i3, k0.d dVar) {
        Rect closeIconTouchBoundsInt;
        AccessibilityNodeInfo accessibilityNodeInfo = dVar.f2476a;
        CharSequence charSequence = "";
        if (i3 == 1) {
            Chip chip = this.f2808q;
            CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
            } else {
                CharSequence text = chip.getText();
                Context context = chip.getContext();
                if (!TextUtils.isEmpty(text)) {
                    charSequence = text;
                }
                accessibilityNodeInfo.setContentDescription(context.getString(R.string.mtrl_chip_close_icon_content_description, charSequence).trim());
            }
            closeIconTouchBoundsInt = chip.getCloseIconTouchBoundsInt();
            accessibilityNodeInfo.setBoundsInParent(closeIconTouchBoundsInt);
            dVar.b(k0.c.f2466e);
            accessibilityNodeInfo.setEnabled(chip.isEnabled());
            dVar.h(Button.class.getName());
            return;
        }
        accessibilityNodeInfo.setContentDescription("");
        accessibilityNodeInfo.setBoundsInParent(Chip.B);
    }

    @Override // p0.b
    public final void p(int i3, boolean z2) {
        int[] iArr;
        Chip chip = this.f2808q;
        if (i3 == 1) {
            chip.f1206r = z2;
        }
        e eVar = chip.f1198j;
        boolean z3 = chip.f1206r;
        boolean z4 = false;
        if (eVar.W != null) {
            if (z3) {
                iArr = new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled};
            } else {
                iArr = e.Q0;
            }
            z4 = eVar.Q(iArr);
        }
        if (z4) {
            chip.refreshDrawableState();
        }
    }
}

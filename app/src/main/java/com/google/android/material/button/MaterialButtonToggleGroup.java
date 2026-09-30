package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import b2.y;
import com.google.android.material.timepicker.i;
import com.logistics.rider.lsposed.R;
import g2.a;
import j0.j0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import o1.e;
import w1.j;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public class MaterialButtonToggleGroup extends e {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f1188v = 0;

    /* renamed from: p, reason: collision with root package name */
    public final LinkedHashSet f1189p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1190q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1191r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1192s;

    /* renamed from: t, reason: collision with root package name */
    public final int f1193t;

    /* renamed from: u, reason: collision with root package name */
    public HashSet f1194u;

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), attributeSet);
        this.f1189p = new LinkedHashSet();
        this.f1190q = false;
        this.f1194u = new HashSet();
        TypedArray e3 = j.e(getContext(), attributeSet, i1.a.f1979l, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        setSingleSelection(e3.getBoolean(7, false));
        this.f1193t = e3.getResourceId(2, -1);
        this.f1192s = e3.getBoolean(4, false);
        if (this.f2618k == null) {
            this.f2618k = y.b(new b2.a(0.0f));
        }
        setEnabled(e3.getBoolean(0, true));
        e3.recycle();
        setImportantForAccessibility(1);
    }

    private String getChildrenA11yClassName() {
        Class cls;
        if (this.f1191r) {
            cls = RadioButton.class;
        } else {
            cls = ToggleButton.class;
        }
        return cls.getName();
    }

    private int getVisibleButtonCount() {
        int i3 = 0;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            if ((getChildAt(i4) instanceof MaterialButton) && getChildAt(i4).getVisibility() != 8) {
                i3++;
            }
        }
        return i3;
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setA11yClassName(getChildrenA11yClassName());
    }

    @Override // o1.e, android.view.ViewGroup
    public final void addView(View view, int i3, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i3, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setupButtonChild(materialButton);
        f(materialButton.getId(), materialButton.f1181t);
        j0.h(materialButton, new com.google.android.material.datepicker.j(1, this));
    }

    public final void f(int i3, boolean z2) {
        if (i3 == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i3);
            return;
        }
        HashSet hashSet = new HashSet(this.f1194u);
        if (z2 && !hashSet.contains(Integer.valueOf(i3))) {
            if (this.f1191r && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i3));
        } else if (!z2 && hashSet.contains(Integer.valueOf(i3))) {
            if (!this.f1192s || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i3));
            }
        } else {
            return;
        }
        g(hashSet);
    }

    public final void g(Set set) {
        HashSet hashSet = this.f1194u;
        this.f1194u = new HashSet(set);
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            int id = ((MaterialButton) getChildAt(i3)).getId();
            boolean contains = set.contains(Integer.valueOf(id));
            View findViewById = findViewById(id);
            if (findViewById instanceof MaterialButton) {
                this.f1190q = true;
                ((MaterialButton) findViewById).setChecked(contains);
                this.f1190q = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                set.contains(Integer.valueOf(id));
                Iterator it = this.f1189p.iterator();
                while (it.hasNext()) {
                    ((i) it.next()).a();
                }
            }
        }
        invalidate();
    }

    public int getCheckedButtonId() {
        if (this.f1191r && !this.f1194u.isEmpty()) {
            return ((Integer) this.f1194u.iterator().next()).intValue();
        }
        return -1;
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            int id = ((MaterialButton) getChildAt(i3)).getId();
            if (this.f1194u.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i3 = this.f1193t;
        if (i3 != -1) {
            g(Collections.singleton(Integer.valueOf(i3)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i3;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        int visibleButtonCount = getVisibleButtonCount();
        if (this.f1191r) {
            i3 = 1;
        } else {
            i3 = 2;
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, visibleButtonCount, false, i3));
    }

    public void setSelectionRequired(boolean z2) {
        this.f1192s = z2;
    }

    public void setSingleSelection(boolean z2) {
        if (this.f1191r != z2) {
            this.f1191r = z2;
            g(new HashSet());
        }
        String childrenA11yClassName = getChildrenA11yClassName();
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            ((MaterialButton) getChildAt(i3)).setA11yClassName(childrenA11yClassName);
        }
    }

    public void setSingleSelection(int i3) {
        setSingleSelection(getResources().getBoolean(i3));
    }
}

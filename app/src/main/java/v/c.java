package v;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public abstract class c extends View {

    /* renamed from: f, reason: collision with root package name */
    public int[] f3030f;

    /* renamed from: g, reason: collision with root package name */
    public int f3031g;
    public Context h;

    /* renamed from: i, reason: collision with root package name */
    public s.i f3032i;

    /* renamed from: j, reason: collision with root package name */
    public String f3033j;

    /* renamed from: k, reason: collision with root package name */
    public String f3034k;

    /* renamed from: l, reason: collision with root package name */
    public HashMap f3035l;

    /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r6) {
        /*
            r5 = this;
            android.content.Context r0 = r5.h
            int r1 = r6.length()
            if (r1 != 0) goto La
            goto L96
        La:
            if (r0 != 0) goto Le
            goto L96
        Le:
            java.lang.String r6 = r6.trim()
            android.view.ViewParent r1 = r5.getParent()
            boolean r1 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout
            r2 = 0
            if (r1 == 0) goto L22
            android.view.ViewParent r1 = r5.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            goto L23
        L22:
            r1 = r2
        L23:
            boolean r3 = r5.isInEditMode()
            if (r3 == 0) goto L4a
            if (r1 == 0) goto L4a
            if (r6 == 0) goto L3e
            java.util.HashMap r3 = r1.f209r
            if (r3 == 0) goto L3e
            boolean r3 = r3.containsKey(r6)
            if (r3 == 0) goto L3e
            java.util.HashMap r3 = r1.f209r
            java.lang.Object r3 = r3.get(r6)
            goto L3f
        L3e:
            r3 = r2
        L3f:
            boolean r4 = r3 instanceof java.lang.Integer
            if (r4 == 0) goto L4a
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            goto L4b
        L4a:
            r3 = 0
        L4b:
            if (r3 != 0) goto L53
            if (r1 == 0) goto L53
            int r3 = r5.f(r1, r6)
        L53:
            if (r3 != 0) goto L5f
            java.lang.Class<v.q> r1 = v.q.class
            java.lang.reflect.Field r1 = r1.getField(r6)     // Catch: java.lang.Exception -> L5f
            int r3 = r1.getInt(r2)     // Catch: java.lang.Exception -> L5f
        L5f:
            if (r3 != 0) goto L6f
            android.content.res.Resources r1 = r0.getResources()
            java.lang.String r2 = "id"
            java.lang.String r0 = r0.getPackageName()
            int r3 = r1.getIdentifier(r6, r2, r0)
        L6f:
            if (r3 == 0) goto L7e
            java.util.HashMap r0 = r5.f3035l
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r0.put(r1, r6)
            r5.b(r3)
            goto L96
        L7e:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "Could not find id of \""
            r5.<init>(r0)
            r5.append(r6)
            java.lang.String r6 = "\""
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "ConstraintHelper"
            android.util.Log.w(r6, r5)
        L96:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v.c.a(java.lang.String):void");
    }

    public final void b(int i3) {
        if (i3 == getId()) {
            return;
        }
        int i4 = this.f3031g + 1;
        int[] iArr = this.f3030f;
        if (i4 > iArr.length) {
            this.f3030f = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f3030f;
        int i5 = this.f3031g;
        iArr2[i5] = i3;
        this.f3031g = i5 + 1;
    }

    public final void c(String str) {
        ConstraintLayout constraintLayout;
        if (str.length() != 0 && this.h != null) {
            String trim = str.trim();
            if (getParent() instanceof ConstraintLayout) {
                constraintLayout = (ConstraintLayout) getParent();
            } else {
                constraintLayout = null;
            }
            if (constraintLayout == null) {
                Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
                return;
            }
            int childCount = constraintLayout.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = constraintLayout.getChildAt(i3);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if ((layoutParams instanceof e) && trim.equals(((e) layoutParams).Y)) {
                    if (childAt.getId() == -1) {
                        Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                    } else {
                        b(childAt.getId());
                    }
                }
            }
        }
    }

    public final void d(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i3 = 0; i3 < this.f3031g; i3++) {
            View view = (View) constraintLayout.f198f.get(this.f3030f[i3]);
            if (view != null) {
                view.setVisibility(visibility);
                if (elevation > 0.0f) {
                    view.setTranslationZ(view.getTranslationZ() + elevation);
                }
            }
        }
    }

    public final int f(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String str2;
        if (str != null && (resources = this.h.getResources()) != null) {
            int childCount = constraintLayout.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = constraintLayout.getChildAt(i3);
                if (childAt.getId() != -1) {
                    try {
                        str2 = resources.getResourceEntryName(childAt.getId());
                    } catch (Resources.NotFoundException unused) {
                        str2 = null;
                    }
                    if (str.equals(str2)) {
                        return childAt.getId();
                    }
                }
            }
        }
        return 0;
    }

    public void g(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, r.f3168b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == 35) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f3033j = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f3034k = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f3030f, this.f3031g);
    }

    public abstract void h(s.d dVar, boolean z2);

    public final void i() {
        if (this.f3032i != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof e) {
                ((e) layoutParams).f3064p0 = this.f3032i;
            }
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f3033j;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f3034k;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i3, int i4) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f3033j = str;
        if (str == null) {
            return;
        }
        int i3 = 0;
        this.f3031g = 0;
        while (true) {
            int indexOf = str.indexOf(44, i3);
            if (indexOf == -1) {
                a(str.substring(i3));
                return;
            } else {
                a(str.substring(i3, indexOf));
                i3 = indexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f3034k = str;
        if (str == null) {
            return;
        }
        int i3 = 0;
        this.f3031g = 0;
        while (true) {
            int indexOf = str.indexOf(44, i3);
            if (indexOf == -1) {
                c(str.substring(i3));
                return;
            } else {
                c(str.substring(i3, indexOf));
                i3 = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f3033j = null;
        this.f3031g = 0;
        for (int i3 : iArr) {
            b(i3);
        }
    }

    @Override // android.view.View
    public final void setTag(int i3, Object obj) {
        super.setTag(i3, obj);
        if (obj == null && this.f3033j == null) {
            b(i3);
        }
    }

    public void e(ConstraintLayout constraintLayout) {
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }
}

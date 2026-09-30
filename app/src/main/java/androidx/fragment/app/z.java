package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class z implements LayoutInflater.Factory2 {

    /* renamed from: f, reason: collision with root package name */
    public final k0 f531f;

    public z(k0 k0Var) {
        this.f531f = k0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z2;
        u uVar;
        ?? r18;
        g.i iVar;
        q0 f3;
        int i3;
        g.i iVar2;
        boolean equals = FragmentContainerView.class.getName().equals(str);
        k0 k0Var = this.f531f;
        if (equals) {
            return new FragmentContainerView(context, attributeSet, k0Var);
        }
        Object obj = null;
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t0.a.f3008a);
            int i4 = 0;
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(0);
            }
            int resourceId = obtainStyledAttributes.getResourceId(1, -1);
            String string = obtainStyledAttributes.getString(2);
            obtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    z2 = u.class.isAssignableFrom(e0.b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    z2 = false;
                }
                if (z2) {
                    if (view != null) {
                        i4 = view.getId();
                    }
                    if (i4 == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    if (resourceId != -1) {
                        uVar = k0Var.A(resourceId);
                    } else {
                        uVar = null;
                    }
                    if (uVar == null && string != null) {
                        androidx.emoji2.text.w wVar = k0Var.f399c;
                        ArrayList arrayList = (ArrayList) wVar.f320f;
                        int size = arrayList.size() - 1;
                        while (true) {
                            if (size >= 0) {
                                u uVar2 = (u) arrayList.get(size);
                                r18 = obj;
                                if (uVar2 != null && string.equals(uVar2.C)) {
                                    uVar = uVar2;
                                    break;
                                }
                                size--;
                                obj = r18;
                            } else {
                                r18 = obj;
                                Iterator it = ((HashMap) wVar.f321g).values().iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        q0 q0Var = (q0) it.next();
                                        if (q0Var != null) {
                                            uVar = q0Var.f467c;
                                            if (string.equals(uVar.C)) {
                                                break;
                                            }
                                        }
                                    } else {
                                        uVar = r18;
                                        break;
                                    }
                                }
                            }
                        }
                    } else {
                        r18 = 0;
                    }
                    if (uVar == null && i4 != -1) {
                        uVar = k0Var.A(i4);
                    }
                    if (uVar == null) {
                        e0 C = k0Var.C();
                        context.getClassLoader();
                        uVar = C.a(attributeValue);
                        uVar.f502r = true;
                        if (resourceId != 0) {
                            i3 = resourceId;
                        } else {
                            i3 = i4;
                        }
                        uVar.A = i3;
                        uVar.B = i4;
                        uVar.C = string;
                        uVar.f503s = true;
                        uVar.f507w = k0Var;
                        w wVar2 = k0Var.f414t;
                        uVar.f508x = wVar2;
                        g.i iVar3 = wVar2.f522g;
                        uVar.H = true;
                        if (wVar2 == null) {
                            iVar2 = r18;
                        } else {
                            iVar2 = wVar2.f521f;
                        }
                        if (iVar2 != null) {
                            uVar.H = true;
                        }
                        f3 = k0Var.a(uVar);
                        if (k0.F(2)) {
                            Log.v("FragmentManager", "Fragment " + uVar + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else if (!uVar.f503s) {
                        uVar.f503s = true;
                        uVar.f507w = k0Var;
                        w wVar3 = k0Var.f414t;
                        uVar.f508x = wVar3;
                        g.i iVar4 = wVar3.f522g;
                        uVar.H = true;
                        if (wVar3 == null) {
                            iVar = r18;
                        } else {
                            iVar = wVar3.f521f;
                        }
                        if (iVar != null) {
                            uVar.H = true;
                        }
                        f3 = k0Var.f(uVar);
                        if (k0.F(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + uVar + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(i4) + " with another fragment for " + attributeValue);
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    u0.b bVar = u0.c.f3020a;
                    u0.c.b(new u0.a(uVar, "Attempting to use <fragment> tag to add fragment " + uVar + " to container " + viewGroup));
                    u0.c.a(uVar).getClass();
                    uVar.I = viewGroup;
                    f3.k();
                    f3.j();
                    View view2 = uVar.J;
                    if (view2 != null) {
                        if (resourceId != 0) {
                            view2.setId(resourceId);
                        }
                        if (uVar.J.getTag() == null) {
                            uVar.J.setTag(string);
                        }
                        uVar.J.addOnAttachStateChangeListener(new y(this, f3));
                        return uVar.J;
                    }
                    a.b.k("Fragment ", attributeValue, " did not create a view.");
                    return r18;
                }
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}

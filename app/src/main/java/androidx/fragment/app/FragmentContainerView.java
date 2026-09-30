package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.logistics.rider.lsposed.R;
import j0.c1;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f331f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f332g;
    public View.OnApplyWindowInsetsListener h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f333i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, k0 k0Var) {
        super(context, attributeSet);
        View view;
        g.i iVar;
        String str;
        context.getClass();
        attributeSet.getClass();
        this.f331f = new ArrayList();
        this.f332g = new ArrayList();
        this.f333i = true;
        String classAttribute = attributeSet.getClassAttribute();
        int i3 = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t0.a.f3009b, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        u A = k0Var.A(id);
        if (classAttribute != null && A == null) {
            if (id == -1) {
                if (string != null) {
                    str = " with tag ".concat(string);
                } else {
                    str = "";
                }
                a.b.k("FragmentContainerView must have an android:id to add Fragment ", classAttribute, str);
                throw null;
            }
            e0 C = k0Var.C();
            context.getClassLoader();
            u a3 = C.a(classAttribute);
            a3.getClass();
            a3.H = true;
            w wVar = a3.f508x;
            if (wVar == null) {
                iVar = null;
            } else {
                iVar = wVar.f521f;
            }
            if (iVar != null) {
                a3.H = true;
            }
            a aVar = new a(k0Var);
            aVar.f346o = true;
            a3.I = this;
            int id2 = getId();
            String str2 = a3.P;
            if (str2 != null) {
                u0.c.c(a3, str2);
            }
            Class<?> cls = a3.getClass();
            int modifiers = cls.getModifiers();
            if (!cls.isAnonymousClass() && Modifier.isPublic(modifiers) && (!cls.isMemberClass() || Modifier.isStatic(modifiers))) {
                if (string != null) {
                    String str3 = a3.C;
                    if (str3 != null && !string.equals(str3)) {
                        StringBuilder sb = new StringBuilder("Can't change tag of fragment ");
                        sb.append(a3);
                        String str4 = a3.C;
                        sb.append(": was ");
                        sb.append(str4);
                        sb.append(" now ");
                        sb.append(string);
                        throw new IllegalStateException(sb.toString());
                    }
                    a3.C = string;
                }
                if (id2 != 0) {
                    if (id2 != -1) {
                        int i4 = a3.A;
                        if (i4 != 0 && i4 != id2) {
                            StringBuilder sb2 = new StringBuilder("Can't change container ID of fragment ");
                            sb2.append(a3);
                            int i5 = a3.A;
                            sb2.append(": was ");
                            sb2.append(i5);
                            sb2.append(" now ");
                            sb2.append(id2);
                            throw new IllegalStateException(sb2.toString());
                        }
                        a3.A = id2;
                        a3.B = id2;
                    } else {
                        throw new IllegalArgumentException("Can't add fragment " + a3 + " with tag " + string + " to container view with no id");
                    }
                }
                aVar.b(new r0(1, a3));
                k0 k0Var2 = aVar.f347p;
                a3.f507w = k0Var2;
                if (!aVar.f339g) {
                    if (k0Var2.f414t != null && !k0Var2.G) {
                        k0Var2.x(true);
                        aVar.a(k0Var2.I, k0Var2.J);
                        k0Var2.f398b = true;
                        try {
                            k0Var2.Q(k0Var2.I, k0Var2.J);
                            k0Var2.d();
                            k0Var2.b0();
                            k0Var2.u();
                            ((HashMap) k0Var2.f399c.f321g).values().removeAll(Collections.singleton(null));
                        } catch (Throwable th) {
                            k0Var2.d();
                            throw th;
                        }
                    }
                } else {
                    a.b.i("This transaction is already being added to the back stack");
                    throw null;
                }
            } else {
                throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
            }
        }
        ArrayList i6 = k0Var.f399c.i();
        int size = i6.size();
        while (i3 < size) {
            Object obj = i6.get(i3);
            i3++;
            q0 q0Var = (q0) obj;
            u uVar = q0Var.f467c;
            if (uVar.B == getId() && (view = uVar.J) != null && view.getParent() == null) {
                uVar.I = this;
                q0Var.b();
            }
        }
    }

    public final void a(View view) {
        if (this.f332g.contains(view)) {
            this.f331f.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i3, ViewGroup.LayoutParams layoutParams) {
        u uVar;
        view.getClass();
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if (tag instanceof u) {
            uVar = (u) tag;
        } else {
            uVar = null;
        }
        if (uVar != null) {
            super.addView(view, i3, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        c1 c1Var;
        windowInsets.getClass();
        c1 f3 = c1.f(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.h;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            onApplyWindowInsets.getClass();
            c1Var = c1.f(null, onApplyWindowInsets);
        } else {
            WeakHashMap weakHashMap = j0.j0.f2160a;
            WindowInsets e3 = f3.e();
            if (e3 != null) {
                WindowInsets a3 = j0.a0.a(this, e3);
                if (!a3.equals(e3)) {
                    f3 = c1.f(this, a3);
                }
            }
            c1Var = f3;
        }
        if (!c1Var.f2146a.k()) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                WeakHashMap weakHashMap2 = j0.j0.f2160a;
                WindowInsets e4 = c1Var.e();
                if (e4 != null) {
                    WindowInsets a4 = j0.h0.a(childAt, e4);
                    if (!a4.equals(e4)) {
                        c1.f(childAt, a4);
                    }
                }
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.getClass();
        if (this.f333i) {
            ArrayList arrayList = this.f331f;
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                super.drawChild(canvas, (View) obj, getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        canvas.getClass();
        view.getClass();
        if (this.f333i) {
            ArrayList arrayList = this.f331f;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        view.getClass();
        this.f332g.remove(view);
        if (this.f331f.remove(view)) {
            this.f333i = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends u> F getFragment() {
        g.i iVar;
        u uVar;
        k0 k0Var;
        View view = this;
        while (true) {
            iVar = null;
            if (view != null) {
                Object tag = view.getTag(R.id.fragment_container_view_tag);
                if (tag instanceof u) {
                    uVar = (u) tag;
                } else {
                    uVar = null;
                }
                if (uVar != null) {
                    break;
                }
                Object parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                } else {
                    view = null;
                }
            } else {
                uVar = null;
                break;
            }
        }
        if (uVar != null) {
            if (uVar.f508x != null && uVar.f500p) {
                k0Var = uVar.g();
            } else {
                throw new IllegalStateException("The Fragment " + uVar + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
        } else {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                if (context instanceof g.i) {
                    iVar = (g.i) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (iVar != null) {
                k0Var = ((w) iVar.f1716y.f299g).f523i;
            } else {
                a.b.k("View ", this, " is not within a subclass of FragmentActivity.");
                return null;
            }
        }
        return (F) k0Var.A(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        windowInsets.getClass();
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 < childCount) {
                View childAt = getChildAt(childCount);
                childAt.getClass();
                a(childAt);
            } else {
                super.removeAllViewsInLayout();
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        view.getClass();
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i3) {
        View childAt = getChildAt(i3);
        childAt.getClass();
        a(childAt);
        super.removeViewAt(i3);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        view.getClass();
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i3, int i4) {
        int i5 = i3 + i4;
        for (int i6 = i3; i6 < i5; i6++) {
            View childAt = getChildAt(i6);
            childAt.getClass();
            a(childAt);
        }
        super.removeViews(i3, i4);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i3, int i4) {
        int i5 = i3 + i4;
        for (int i6 = i3; i6 < i5; i6++) {
            View childAt = getChildAt(i6);
            childAt.getClass();
            a(childAt);
        }
        super.removeViewsInLayout(i3, i4);
    }

    public final void setDrawDisappearingViewsLast(boolean z2) {
        this.f333i = z2;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        onApplyWindowInsetsListener.getClass();
        this.h = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        view.getClass();
        if (view.getParent() == this) {
            this.f332g.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        String str;
        context.getClass();
        this.f331f = new ArrayList();
        this.f332g = new ArrayList();
        this.f333i = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t0.a.f3009b, 0, 0);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }
}

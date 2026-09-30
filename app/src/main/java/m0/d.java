package m0;

import a.k;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.logistics.rider.lsposed.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class d extends FrameLayout {
    public static final Object h = new Object();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f2541f;

    /* renamed from: g, reason: collision with root package name */
    public c f2542g;

    public d(Context context, List list) {
        super(context);
        this.f2541f = new ArrayList();
        setProtections(list);
    }

    private g getOrInstallSystemBarStateMonitor() {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof g) {
            return (g) tag;
        }
        g gVar = new g(viewGroup);
        viewGroup.setTag(R.id.tag_system_bar_state_monitor, gVar);
        return gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ae A[LOOP:0: B:4:0x0023->B:18:0x00ae, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r13 = this;
            java.util.ArrayList r0 = r13.f2541f
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto La
            goto Lbc
        La:
            m0.g r1 = r13.getOrInstallSystemBarStateMonitor()
            m0.c r2 = new m0.c
            r2.<init>(r1, r0)
            r13.f2542g = r2
            int r0 = r13.getChildCount()
            m0.c r1 = r13.f2542g
            java.util.ArrayList r1 = r1.f2536a
            int r1 = r1.size()
            r2 = 0
            r3 = r2
        L23:
            if (r3 >= r1) goto Lbc
            m0.c r4 = r13.f2542g
            java.util.ArrayList r4 = r4.f2536a
            java.lang.Object r4 = r4.get(r3)
            m0.a r4 = (m0.a) r4
            android.content.Context r5 = r13.getContext()
            int r6 = r3 + r0
            m0.b r7 = r4.f2524b
            int r4 = r4.f2523a
            r8 = 1
            r9 = 4
            r10 = -1
            if (r4 == r8) goto L62
            r8 = 2
            if (r4 == r8) goto L5d
            if (r4 == r9) goto L56
            r8 = 8
            if (r4 != r8) goto L4c
            int r4 = r7.f2530b
            r8 = 80
            goto L66
        L4c:
            java.lang.String r13 = "Unexpected side: "
            java.lang.String r13 = androidx.fragment.app.w0.d(r13, r4)
            a.b.m(r13)
            return
        L56:
            int r4 = r7.f2529a
            r8 = 5
        L59:
            r12 = r10
            r10 = r4
            r4 = r12
            goto L66
        L5d:
            int r4 = r7.f2530b
            r8 = 48
            goto L66
        L62:
            int r4 = r7.f2529a
            r8 = 3
            goto L59
        L66:
            android.widget.FrameLayout$LayoutParams r11 = new android.widget.FrameLayout$LayoutParams
            r11.<init>(r10, r4, r8)
            c0.b r4 = r7.f2531c
            int r8 = r4.f1082a
            r11.leftMargin = r8
            int r8 = r4.f1083b
            r11.topMargin = r8
            int r8 = r4.f1084c
            r11.rightMargin = r8
            int r4 = r4.d
            r11.bottomMargin = r4
            android.view.View r4 = new android.view.View
            r4.<init>(r5)
            java.lang.Object r5 = m0.d.h
            r4.setTag(r5)
            float r5 = r7.f2533f
            r4.setTranslationX(r5)
            float r5 = r7.f2534g
            r4.setTranslationY(r5)
            float r5 = r7.h
            r4.setAlpha(r5)
            boolean r5 = r7.d
            if (r5 == 0) goto L9b
            r9 = r2
        L9b:
            r4.setVisibility(r9)
            android.graphics.drawable.ColorDrawable r5 = r7.f2532e
            r4.setBackground(r5)
            androidx.emoji2.text.p r5 = new androidx.emoji2.text.p
            r8 = 14
            r5.<init>(r11, r4, r8)
            androidx.emoji2.text.p r8 = r7.f2535i
            if (r8 != 0) goto Lb7
            r7.f2535i = r5
            r13.addView(r4, r6, r11)
            int r3 = r3 + 1
            goto L23
        Lb7:
            java.lang.String r13 = "Trying to overwrite the existing callback. Did you send one protection to multiple ProtectionLayouts?"
            a.b.i(r13)
        Lbc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.d.a():void");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i3, ViewGroup.LayoutParams layoutParams) {
        int i4;
        if (view != null && view.getTag() != h) {
            c cVar = this.f2542g;
            if (cVar != null) {
                i4 = cVar.f2536a.size();
            } else {
                i4 = 0;
            }
            int childCount = getChildCount() - i4;
            if (i3 > childCount || i3 < 0) {
                i3 = childCount;
            }
        }
        super.addView(view, i3, layoutParams);
    }

    public final void b() {
        c cVar;
        if (this.f2542g != null) {
            removeViews(getChildCount() - this.f2542g.f2536a.size(), this.f2542g.f2536a.size());
            int size = this.f2542g.f2536a.size();
            int i3 = 0;
            while (true) {
                cVar = this.f2542g;
                if (i3 >= size) {
                    break;
                }
                ((a) cVar.f2536a.get(i3)).f2524b.f2535i = null;
                i3++;
            }
            ArrayList arrayList = cVar.f2536a;
            if (!cVar.f2540f) {
                cVar.f2540f = true;
                cVar.f2537b.f2548b.remove(cVar);
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    ((a) arrayList.get(size2)).f2526e = null;
                }
                arrayList.clear();
            }
            this.f2542g = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f2542g != null) {
            b();
        }
        a();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof g) {
            g gVar = (g) tag;
            if (!gVar.f2548b.isEmpty()) {
                return;
            }
            gVar.f2547a.post(new k(8, gVar));
            viewGroup.setTag(R.id.tag_system_bar_state_monitor, null);
        }
    }

    public void setProtections(List<a> list) {
        ArrayList arrayList = this.f2541f;
        arrayList.clear();
        arrayList.addAll(list);
        if (isAttachedToWindow()) {
            b();
            a();
            requestApplyInsets();
        }
    }
}

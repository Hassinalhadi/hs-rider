package g1;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class f extends g implements Animatable {
    public final Context h;

    /* renamed from: i, reason: collision with root package name */
    public e2.l f1821i = null;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f1822j = null;

    /* renamed from: k, reason: collision with root package name */
    public final c f1823k = new c(this);

    /* renamed from: g, reason: collision with root package name */
    public final d f1820g = new Drawable.ConstantState();

    /* JADX WARN: Type inference failed for: r2v1, types: [android.graphics.drawable.Drawable$ConstantState, g1.d] */
    public f(Context context) {
        this.h = context;
    }

    @Override // g1.g, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f1824f;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f1824f;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f1824f;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        d dVar = this.f1820g;
        dVar.f1816a.draw(canvas);
        if (dVar.f1817b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f1824f;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.f1820g.f1816a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f1824f;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f1820g.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f1824f;
        if (drawable != null) {
            return drawable.getColorFilter();
        }
        return this.f1820g.f1816a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f1824f != null) {
            return new e(this.f1824f.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f1824f;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.f1820g.f1816a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f1824f;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.f1820g.f1816a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f1824f;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.f1820g.f1816a.getOpacity();
    }

    /* JADX WARN: Type inference failed for: r7v8, types: [n.f, n.j] */
    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        d dVar;
        Drawable drawable = this.f1824f;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            dVar = this.f1820g;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray f3 = b0.b.f(resources, theme, attributeSet, a.f1812e);
                    int resourceId = f3.getResourceId(0, 0);
                    if (resourceId != 0) {
                        p pVar = new p();
                        ThreadLocal threadLocal = b0.l.f696a;
                        pVar.f1824f = resources.getDrawable(resourceId, theme);
                        new o(pVar.f1824f.getConstantState());
                        pVar.f1875k = false;
                        pVar.setCallback(this.f1823k);
                        p pVar2 = dVar.f1816a;
                        if (pVar2 != null) {
                            pVar2.setCallback(null);
                        }
                        dVar.f1816a = pVar;
                    }
                    f3.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, a.f1813f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.h;
                        if (context != null) {
                            Animator loadAnimator = AnimatorInflater.loadAnimator(context, resourceId2);
                            loadAnimator.setTarget(dVar.f1816a.f1872g.f1861b.f1859o.get(string));
                            if (dVar.f1818c == null) {
                                dVar.f1818c = new ArrayList();
                                dVar.d = new n.j(0);
                            }
                            dVar.f1818c.add(loadAnimator);
                            dVar.d.put(loadAnimator, string);
                        } else {
                            obtainAttributes.recycle();
                            a.b.i("Context can't be null when inflating animators");
                            return;
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        if (dVar.f1817b == null) {
            dVar.f1817b = new AnimatorSet();
        }
        dVar.f1817b.playTogether(dVar.f1818c);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f1824f;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.f1820g.f1816a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f1824f;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.f1820g.f1817b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f1824f;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.f1820g.f1816a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f1824f;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f1824f;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f1820g.f1816a.setBounds(rect);
        }
    }

    @Override // g1.g, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i3) {
        Drawable drawable = this.f1824f;
        if (drawable != null) {
            return drawable.setLevel(i3);
        }
        return this.f1820g.f1816a.setLevel(i3);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f1824f;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.f1820g.f1816a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i3) {
        Drawable drawable = this.f1824f;
        if (drawable != null) {
            drawable.setAlpha(i3);
        } else {
            this.f1820g.f1816a.setAlpha(i3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        Drawable drawable = this.f1824f;
        if (drawable != null) {
            drawable.setAutoMirrored(z2);
        } else {
            this.f1820g.f1816a.setAutoMirrored(z2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f1824f;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f1820g.f1816a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i3) {
        Drawable drawable = this.f1824f;
        if (drawable != null) {
            drawable.setTint(i3);
        } else {
            this.f1820g.f1816a.setTint(i3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f1824f;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        } else {
            this.f1820g.f1816a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f1824f;
        if (drawable != null) {
            drawable.setTintMode(mode);
        } else {
            this.f1820g.f1816a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        Drawable drawable = this.f1824f;
        if (drawable != null) {
            return drawable.setVisible(z2, z3);
        }
        this.f1820g.f1816a.setVisible(z2, z3);
        return super.setVisible(z2, z3);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f1824f;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        d dVar = this.f1820g;
        if (dVar.f1817b.isStarted()) {
            return;
        }
        dVar.f1817b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f1824f;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f1820g.f1817b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}

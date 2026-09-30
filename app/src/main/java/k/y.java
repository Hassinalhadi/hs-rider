package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public class y extends ImageButton {

    /* renamed from: f, reason: collision with root package name */
    public final p f2439f;

    /* renamed from: g, reason: collision with root package name */
    public final b0.d f2440g;
    public boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        n2.a(context);
        this.h = false;
        m2.a(this, getContext());
        p pVar = new p(this);
        this.f2439f = pVar;
        pVar.d(attributeSet, i3);
        b0.d dVar = new b0.d(this);
        this.f2440g = dVar;
        dVar.d(attributeSet, i3);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        p pVar = this.f2439f;
        if (pVar != null) {
            pVar.a();
        }
        b0.d dVar = this.f2440g;
        if (dVar != null) {
            dVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        p pVar = this.f2439f;
        if (pVar != null) {
            return pVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        p pVar = this.f2439f;
        if (pVar != null) {
            return pVar.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        o2 o2Var;
        b0.d dVar = this.f2440g;
        if (dVar == null || (o2Var = (o2) dVar.f679c) == null) {
            return null;
        }
        return o2Var.f2345a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        o2 o2Var;
        b0.d dVar = this.f2440g;
        if (dVar == null || (o2Var = (o2) dVar.f679c) == null) {
            return null;
        }
        return o2Var.f2346b;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        if (!(((ImageView) this.f2440g.f678b).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering()) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        p pVar = this.f2439f;
        if (pVar != null) {
            pVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        p pVar = this.f2439f;
        if (pVar != null) {
            pVar.f(i3);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        b0.d dVar = this.f2440g;
        if (dVar != null) {
            dVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        b0.d dVar = this.f2440g;
        if (dVar != null && drawable != null && !this.h) {
            dVar.f677a = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (dVar != null) {
            dVar.a();
            if (!this.h) {
                ImageView imageView = (ImageView) dVar.f678b;
                if (imageView.getDrawable() != null) {
                    imageView.getDrawable().setLevel(dVar.f677a);
                }
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i3) {
        super.setImageLevel(i3);
        this.h = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i3) {
        b0.d dVar = this.f2440g;
        ImageView imageView = (ImageView) dVar.f678b;
        if (i3 != 0) {
            Drawable B = a.y.B(imageView.getContext(), i3);
            if (B != null) {
                h1.a(B);
            }
            imageView.setImageDrawable(B);
        } else {
            imageView.setImageDrawable(null);
        }
        dVar.a();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        b0.d dVar = this.f2440g;
        if (dVar != null) {
            dVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        p pVar = this.f2439f;
        if (pVar != null) {
            pVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        p pVar = this.f2439f;
        if (pVar != null) {
            pVar.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        b0.d dVar = this.f2440g;
        if (dVar != null) {
            if (((o2) dVar.f679c) == null) {
                dVar.f679c = new Object();
            }
            o2 o2Var = (o2) dVar.f679c;
            o2Var.f2345a = colorStateList;
            o2Var.d = true;
            dVar.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        b0.d dVar = this.f2440g;
        if (dVar != null) {
            if (((o2) dVar.f679c) == null) {
                dVar.f679c = new Object();
            }
            o2 o2Var = (o2) dVar.f679c;
            o2Var.f2346b = mode;
            o2Var.f2347c = true;
            dVar.a();
        }
    }
}

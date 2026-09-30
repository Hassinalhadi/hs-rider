package k;

import android.R;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AbsSeekBar;
import android.widget.EditText;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public class c0 implements x0 {
    public static final int[] d = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2238a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final View f2239b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2240c;

    public c0(EditText editText) {
        this.f2239b = editText;
        this.f2240c = new androidx.emoji2.text.m(editText);
    }

    public KeyListener b(KeyListener keyListener) {
        if (!(keyListener instanceof NumberKeyListener)) {
            ((androidx.emoji2.text.p) ((androidx.emoji2.text.m) this.f2240c).f299g).getClass();
            if (keyListener instanceof s0.e) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            if (keyListener instanceof NumberKeyListener) {
                return keyListener;
            }
            return new s0.e(keyListener);
        }
        return keyListener;
    }

    public void c(AttributeSet attributeSet, int i3) {
        switch (this.f2238a) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.f2239b;
                androidx.emoji2.text.s r3 = androidx.emoji2.text.s.r(absSeekBar.getContext(), attributeSet, d, i3);
                Drawable j3 = r3.j(0);
                if (j3 != null) {
                    if (j3 instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) j3;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i4 = 0; i4 < numberOfFrames; i4++) {
                            Drawable f3 = f(animationDrawable.getFrame(i4), true);
                            f3.setLevel(10000);
                            animationDrawable2.addFrame(f3, animationDrawable.getDuration(i4));
                        }
                        animationDrawable2.setLevel(10000);
                        j3 = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(j3);
                }
                Drawable j4 = r3.j(1);
                if (j4 != null) {
                    absSeekBar.setProgressDrawable(f(j4, false));
                }
                r3.t();
                return;
            default:
                TypedArray obtainStyledAttributes = ((EditText) this.f2239b).getContext().obtainStyledAttributes(attributeSet, f.a.f1535i, i3, 0);
                try {
                    boolean z2 = true;
                    if (obtainStyledAttributes.hasValue(14)) {
                        z2 = obtainStyledAttributes.getBoolean(14, true);
                    }
                    obtainStyledAttributes.recycle();
                    e(z2);
                    return;
                } catch (Throwable th) {
                    obtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    public s0.b d(InputConnection inputConnection, EditorInfo editorInfo) {
        InputConnection inputConnection2;
        androidx.emoji2.text.m mVar = (androidx.emoji2.text.m) this.f2240c;
        if (inputConnection == null) {
            mVar.getClass();
            inputConnection2 = null;
        } else {
            androidx.emoji2.text.p pVar = (androidx.emoji2.text.p) mVar.f299g;
            pVar.getClass();
            if (!(inputConnection instanceof s0.b)) {
                inputConnection = new s0.b(editorInfo, inputConnection, (EditText) pVar.f301g);
            }
            inputConnection2 = inputConnection;
        }
        return (s0.b) inputConnection2;
    }

    public void e(boolean z2) {
        s0.i iVar = (s0.i) ((androidx.emoji2.text.p) ((androidx.emoji2.text.m) this.f2240c).f299g).h;
        if (iVar.h != z2) {
            if (iVar.f2960g != null) {
                androidx.emoji2.text.j a3 = androidx.emoji2.text.j.a();
                s0.h hVar = iVar.f2960g;
                a3.getClass();
                a.y.n(hVar, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = a3.f287a;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    a3.f288b.remove(hVar);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            iVar.h = z2;
            if (z2) {
                s0.i.a(iVar.f2959f, androidx.emoji2.text.j.a().b());
            }
        }
    }

    public Drawable f(Drawable drawable, boolean z2) {
        boolean z3;
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i3 = 0; i3 < numberOfLayers; i3++) {
                int id = layerDrawable.getId(i3);
                Drawable drawable2 = layerDrawable.getDrawable(i3);
                if (id != 16908301 && id != 16908303) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                drawableArr[i3] = f(drawable2, z3);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i4 = 0; i4 < numberOfLayers; i4++) {
                layerDrawable2.setId(i4, layerDrawable.getId(i4));
                layerDrawable2.setLayerGravity(i4, layerDrawable.getLayerGravity(i4));
                layerDrawable2.setLayerWidth(i4, layerDrawable.getLayerWidth(i4));
                layerDrawable2.setLayerHeight(i4, layerDrawable.getLayerHeight(i4));
                layerDrawable2.setLayerInsetLeft(i4, layerDrawable.getLayerInsetLeft(i4));
                layerDrawable2.setLayerInsetRight(i4, layerDrawable.getLayerInsetRight(i4));
                layerDrawable2.setLayerInsetTop(i4, layerDrawable.getLayerInsetTop(i4));
                layerDrawable2.setLayerInsetBottom(i4, layerDrawable.getLayerInsetBottom(i4));
                layerDrawable2.setLayerInsetStart(i4, layerDrawable.getLayerInsetStart(i4));
                layerDrawable2.setLayerInsetEnd(i4, layerDrawable.getLayerInsetEnd(i4));
            }
            return layerDrawable2;
        }
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (((Bitmap) this.f2240c) == null) {
                this.f2240c = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            if (z2) {
                return new ClipDrawable(shapeDrawable, 3, 1);
            }
            return shapeDrawable;
        }
        return drawable;
    }

    public c0(AbsSeekBar absSeekBar) {
        this.f2239b = absSeekBar;
    }

    public c0(z0 z0Var) {
        this.f2240c = z0Var;
        this.f2239b = z0Var;
    }

    @Override // k.x0
    public void a(int i3, float f3) {
    }
}

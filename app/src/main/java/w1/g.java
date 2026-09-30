package w1;

import a.c0;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f3237a;

    /* renamed from: b, reason: collision with root package name */
    public final TextPaint f3238b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3239c;
    public int d;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3245k;

    /* renamed from: m, reason: collision with root package name */
    public c0 f3247m;

    /* renamed from: e, reason: collision with root package name */
    public Layout.Alignment f3240e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f, reason: collision with root package name */
    public int f3241f = Integer.MAX_VALUE;

    /* renamed from: g, reason: collision with root package name */
    public float f3242g = 0.0f;
    public float h = 1.0f;

    /* renamed from: i, reason: collision with root package name */
    public int f3243i = 1;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3244j = true;

    /* renamed from: l, reason: collision with root package name */
    public TextUtils.TruncateAt f3246l = null;

    public g(CharSequence charSequence, TextPaint textPaint, int i3) {
        this.f3237a = charSequence;
        this.f3238b = textPaint;
        this.f3239c = i3;
        this.d = charSequence.length();
    }

    public final StaticLayout a() {
        TextDirectionHeuristic textDirectionHeuristic;
        if (this.f3237a == null) {
            this.f3237a = "";
        }
        int max = Math.max(0, this.f3239c);
        CharSequence charSequence = this.f3237a;
        int i3 = this.f3241f;
        TextPaint textPaint = this.f3238b;
        if (i3 == 1) {
            charSequence = TextUtils.ellipsize(charSequence, textPaint, max, this.f3246l);
        }
        int min = Math.min(charSequence.length(), this.d);
        this.d = min;
        if (this.f3245k && this.f3241f == 1) {
            this.f3240e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, textPaint, max);
        obtain.setAlignment(this.f3240e);
        obtain.setIncludePad(this.f3244j);
        if (this.f3245k) {
            textDirectionHeuristic = TextDirectionHeuristics.RTL;
        } else {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        }
        obtain.setTextDirection(textDirectionHeuristic);
        TextUtils.TruncateAt truncateAt = this.f3246l;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f3241f);
        float f3 = this.f3242g;
        if (f3 != 0.0f || this.h != 1.0f) {
            obtain.setLineSpacing(f3, this.h);
        }
        if (this.f3241f > 1) {
            obtain.setHyphenationFrequency(this.f3243i);
        }
        c0 c0Var = this.f3247m;
        if (c0Var != null) {
            obtain.setBreakStrategy(((TextInputLayout) c0Var.f9f).f1365z.getBreakStrategy());
        }
        return obtain.build();
    }
}

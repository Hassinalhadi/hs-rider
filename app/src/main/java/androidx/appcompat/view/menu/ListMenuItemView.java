package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.emoji2.text.s;
import com.logistics.rider.lsposed.R;
import f.a;
import j.m;
import j.o;
import j.z;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements z, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: f, reason: collision with root package name */
    public o f91f;

    /* renamed from: g, reason: collision with root package name */
    public ImageView f92g;
    public RadioButton h;

    /* renamed from: i, reason: collision with root package name */
    public TextView f93i;

    /* renamed from: j, reason: collision with root package name */
    public CheckBox f94j;

    /* renamed from: k, reason: collision with root package name */
    public TextView f95k;

    /* renamed from: l, reason: collision with root package name */
    public ImageView f96l;

    /* renamed from: m, reason: collision with root package name */
    public ImageView f97m;

    /* renamed from: n, reason: collision with root package name */
    public LinearLayout f98n;

    /* renamed from: o, reason: collision with root package name */
    public final Drawable f99o;

    /* renamed from: p, reason: collision with root package name */
    public final int f100p;

    /* renamed from: q, reason: collision with root package name */
    public final Context f101q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f102r;

    /* renamed from: s, reason: collision with root package name */
    public final Drawable f103s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f104t;

    /* renamed from: u, reason: collision with root package name */
    public LayoutInflater f105u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f106v;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        s r3 = s.r(getContext(), attributeSet, a.f1544r, R.attr.listMenuViewStyle);
        this.f99o = r3.i(5);
        TypedArray typedArray = (TypedArray) r3.f310c;
        this.f100p = typedArray.getResourceId(1, -1);
        this.f102r = typedArray.getBoolean(7, false);
        this.f101q = context;
        this.f103s = r3.i(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f104t = obtainStyledAttributes.hasValue(0);
        r3.t();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f105u == null) {
            this.f105u = LayoutInflater.from(getContext());
        }
        return this.f105u;
    }

    private void setSubMenuArrowVisible(boolean z2) {
        int i3;
        ImageView imageView = this.f96l;
        if (imageView != null) {
            if (z2) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            imageView.setVisibility(i3);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f97m;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f97m.getLayoutParams();
            rect.top = this.f97m.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (r0 == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011b  */
    @Override // j.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(j.o r11) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.c(j.o):void");
    }

    @Override // j.z
    public o getItemData() {
        return this.f91f;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f99o);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f93i = textView;
        int i3 = this.f100p;
        if (i3 != -1) {
            textView.setTextAppearance(this.f101q, i3);
        }
        this.f95k = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f96l = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f103s);
        }
        this.f97m = (ImageView) findViewById(R.id.group_divider);
        this.f98n = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i3, int i4) {
        if (this.f92g != null && this.f102r) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f92g.getLayoutParams();
            int i5 = layoutParams.height;
            if (i5 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i5;
            }
        }
        super.onMeasure(i3, i4);
    }

    public void setCheckable(boolean z2) {
        CompoundButton compoundButton;
        View view;
        if (z2 || this.h != null || this.f94j != null) {
            if ((this.f91f.f2118x & 4) != 0) {
                if (this.h == null) {
                    RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                    this.h = radioButton;
                    LinearLayout linearLayout = this.f98n;
                    if (linearLayout != null) {
                        linearLayout.addView(radioButton, -1);
                    } else {
                        addView(radioButton, -1);
                    }
                }
                compoundButton = this.h;
                view = this.f94j;
            } else {
                if (this.f94j == null) {
                    CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                    this.f94j = checkBox;
                    LinearLayout linearLayout2 = this.f98n;
                    if (linearLayout2 != null) {
                        linearLayout2.addView(checkBox, -1);
                    } else {
                        addView(checkBox, -1);
                    }
                }
                compoundButton = this.f94j;
                view = this.h;
            }
            if (z2) {
                compoundButton.setChecked(this.f91f.isChecked());
                if (compoundButton.getVisibility() != 0) {
                    compoundButton.setVisibility(0);
                }
                if (view != null && view.getVisibility() != 8) {
                    view.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox2 = this.f94j;
            if (checkBox2 != null) {
                checkBox2.setVisibility(8);
            }
            RadioButton radioButton2 = this.h;
            if (radioButton2 != null) {
                radioButton2.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z2) {
        CompoundButton compoundButton;
        if ((this.f91f.f2118x & 4) != 0) {
            if (this.h == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.h = radioButton;
                LinearLayout linearLayout = this.f98n;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.h;
        } else {
            if (this.f94j == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f94j = checkBox;
                LinearLayout linearLayout2 = this.f98n;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f94j;
        }
        compoundButton.setChecked(z2);
    }

    public void setForceShowIcon(boolean z2) {
        this.f106v = z2;
        this.f102r = z2;
    }

    public void setGroupDividerEnabled(boolean z2) {
        int i3;
        ImageView imageView = this.f97m;
        if (imageView != null) {
            if (!this.f104t && z2) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            imageView.setVisibility(i3);
        }
    }

    public void setIcon(Drawable drawable) {
        m mVar = this.f91f.f2108n;
        boolean z2 = this.f106v;
        if (z2 || this.f102r) {
            ImageView imageView = this.f92g;
            if (imageView != null || drawable != null || this.f102r) {
                if (imageView == null) {
                    ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                    this.f92g = imageView2;
                    LinearLayout linearLayout = this.f98n;
                    if (linearLayout != null) {
                        linearLayout.addView(imageView2, 0);
                    } else {
                        addView(imageView2, 0);
                    }
                }
                if (drawable == null && !this.f102r) {
                    this.f92g.setVisibility(8);
                    return;
                }
                ImageView imageView3 = this.f92g;
                if (!z2) {
                    drawable = null;
                }
                imageView3.setImageDrawable(drawable);
                if (this.f92g.getVisibility() != 0) {
                    this.f92g.setVisibility(0);
                }
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView = this.f93i;
        if (charSequence != null) {
            textView.setText(charSequence);
            if (this.f93i.getVisibility() != 0) {
                this.f93i.setVisibility(0);
                return;
            }
            return;
        }
        if (textView.getVisibility() != 8) {
            this.f93i.setVisibility(8);
        }
    }
}

package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.logistics.rider.lsposed.R;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f2402a = {R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};

    /* renamed from: b, reason: collision with root package name */
    public final int[] f2403b = {R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};

    /* renamed from: c, reason: collision with root package name */
    public final int[] f2404c = {R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
    public final int[] d = {R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};

    /* renamed from: e, reason: collision with root package name */
    public final int[] f2405e = {R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};

    /* renamed from: f, reason: collision with root package name */
    public final int[] f2406f = {R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};

    public static boolean a(int[] iArr, int i3) {
        for (int i4 : iArr) {
            if (i4 == i3) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList b(Context context, int i3) {
        int c3 = m2.c(context, R.attr.colorControlHighlight);
        int b3 = m2.b(context, R.attr.colorButtonNormal);
        int[] iArr = m2.f2324b;
        int[] iArr2 = m2.d;
        int b4 = c0.a.b(c3, i3);
        return new ColorStateList(new int[][]{iArr, iArr2, m2.f2325c, m2.f2327f}, new int[]{b3, b4, c0.a.b(c3, i3), i3});
    }

    public static LayerDrawable c(h2 h2Var, Context context, int i3) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i3);
        Drawable c3 = h2Var.c(context, R.drawable.abc_star_black_48dp);
        Drawable c4 = h2Var.c(context, R.drawable.abc_star_half_black_48dp);
        if ((c3 instanceof BitmapDrawable) && c3.getIntrinsicWidth() == dimensionPixelSize && c3.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) c3;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            c3.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            c3.draw(canvas);
            bitmapDrawable = new BitmapDrawable(createBitmap);
            bitmapDrawable2 = new BitmapDrawable(createBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((c4 instanceof BitmapDrawable) && c4.getIntrinsicWidth() == dimensionPixelSize && c4.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) c4;
        } else {
            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            c4.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            c4.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(createBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static void e(Drawable drawable, int i3, PorterDuff.Mode mode) {
        Drawable mutate = drawable.mutate();
        if (mode == null) {
            mode = u.f2410b;
        }
        mutate.setColorFilter(u.c(i3, mode));
    }

    public final ColorStateList d(Context context, int i3) {
        if (i3 == R.drawable.abc_edit_text_material) {
            return a.y.z(context, R.color.abc_tint_edittext);
        }
        if (i3 == R.drawable.abc_switch_track_mtrl_alpha) {
            return a.y.z(context, R.color.abc_tint_switch_track);
        }
        if (i3 == R.drawable.abc_switch_thumb_material) {
            int[][] iArr = new int[3];
            int[] iArr2 = new int[3];
            ColorStateList d = m2.d(context, R.attr.colorSwitchThumbNormal);
            if (d != null && d.isStateful()) {
                int[] iArr3 = m2.f2324b;
                iArr[0] = iArr3;
                iArr2[0] = d.getColorForState(iArr3, 0);
                iArr[1] = m2.f2326e;
                iArr2[1] = m2.c(context, R.attr.colorControlActivated);
                iArr[2] = m2.f2327f;
                iArr2[2] = d.getDefaultColor();
            } else {
                iArr[0] = m2.f2324b;
                iArr2[0] = m2.b(context, R.attr.colorSwitchThumbNormal);
                iArr[1] = m2.f2326e;
                iArr2[1] = m2.c(context, R.attr.colorControlActivated);
                iArr[2] = m2.f2327f;
                iArr2[2] = m2.c(context, R.attr.colorSwitchThumbNormal);
            }
            return new ColorStateList(iArr, iArr2);
        }
        if (i3 == R.drawable.abc_btn_default_mtrl_shape) {
            return b(context, m2.c(context, R.attr.colorButtonNormal));
        }
        if (i3 == R.drawable.abc_btn_borderless_material) {
            return b(context, 0);
        }
        if (i3 == R.drawable.abc_btn_colored_material) {
            return b(context, m2.c(context, R.attr.colorAccent));
        }
        if (i3 != R.drawable.abc_spinner_mtrl_am_alpha && i3 != R.drawable.abc_spinner_textfield_background_material) {
            if (a(this.f2403b, i3)) {
                return m2.d(context, R.attr.colorControlNormal);
            }
            if (a(this.f2405e, i3)) {
                return a.y.z(context, R.color.abc_tint_default);
            }
            if (a(this.f2406f, i3)) {
                return a.y.z(context, R.color.abc_tint_btn_checkable);
            }
            if (i3 == R.drawable.abc_seekbar_thumb_material) {
                return a.y.z(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        return a.y.z(context, R.color.abc_tint_spinner);
    }
}

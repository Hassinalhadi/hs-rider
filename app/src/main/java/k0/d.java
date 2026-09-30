package k0;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import j0.t;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final AccessibilityNodeInfo f2476a;

    /* renamed from: b, reason: collision with root package name */
    public int f2477b = -1;

    public d(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f2476a = accessibilityNodeInfo;
    }

    public static String d(int i3) {
        if (i3 != 1) {
            if (i3 != 2) {
                switch (i3) {
                    case 4:
                        return "ACTION_SELECT";
                    case 8:
                        return "ACTION_CLEAR_SELECTION";
                    case 16:
                        return "ACTION_CLICK";
                    case 32:
                        return "ACTION_LONG_CLICK";
                    case 64:
                        return "ACTION_ACCESSIBILITY_FOCUS";
                    case 128:
                        return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                    case 256:
                        return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                    case 512:
                        return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                    case 1024:
                        return "ACTION_NEXT_HTML_ELEMENT";
                    case 2048:
                        return "ACTION_PREVIOUS_HTML_ELEMENT";
                    case 4096:
                        return "ACTION_SCROLL_FORWARD";
                    case 8192:
                        return "ACTION_SCROLL_BACKWARD";
                    case 16384:
                        return "ACTION_COPY";
                    case 32768:
                        return "ACTION_PASTE";
                    case 65536:
                        return "ACTION_CUT";
                    case 131072:
                        return "ACTION_SET_SELECTION";
                    case 262144:
                        return "ACTION_EXPAND";
                    case 524288:
                        return "ACTION_COLLAPSE";
                    case 2097152:
                        return "ACTION_SET_TEXT";
                    case R.id.accessibilityActionMoveWindow:
                        return "ACTION_MOVE_WINDOW";
                    case R.id.KEYCODE_3D_MODE:
                        return "ACTION_SCROLL_IN_DIRECTION";
                    default:
                        switch (i3) {
                            case R.id.accessibilityActionShowOnScreen:
                                return "ACTION_SHOW_ON_SCREEN";
                            case R.id.accessibilityActionScrollToPosition:
                                return "ACTION_SCROLL_TO_POSITION";
                            case R.id.accessibilityActionScrollUp:
                                return "ACTION_SCROLL_UP";
                            case R.id.accessibilityActionScrollLeft:
                                return "ACTION_SCROLL_LEFT";
                            case R.id.accessibilityActionScrollDown:
                                return "ACTION_SCROLL_DOWN";
                            case R.id.accessibilityActionScrollRight:
                                return "ACTION_SCROLL_RIGHT";
                            case R.id.accessibilityActionContextClick:
                                return "ACTION_CONTEXT_CLICK";
                            case R.id.accessibilityActionSetProgress:
                                return "ACTION_SET_PROGRESS";
                            default:
                                switch (i3) {
                                    case R.id.accessibilityActionShowTooltip:
                                        return "ACTION_SHOW_TOOLTIP";
                                    case R.id.accessibilityActionHideTooltip:
                                        return "ACTION_HIDE_TOOLTIP";
                                    case R.id.accessibilityActionPageUp:
                                        return "ACTION_PAGE_UP";
                                    case R.id.accessibilityActionPageDown:
                                        return "ACTION_PAGE_DOWN";
                                    case R.id.accessibilityActionPageLeft:
                                        return "ACTION_PAGE_LEFT";
                                    case R.id.accessibilityActionPageRight:
                                        return "ACTION_PAGE_RIGHT";
                                    case R.id.accessibilityActionPressAndHold:
                                        return "ACTION_PRESS_AND_HOLD";
                                    default:
                                        switch (i3) {
                                            case R.id.accessibilityActionImeEnter:
                                                return "ACTION_IME_ENTER";
                                            case R.id.ALT:
                                                return "ACTION_DRAG_START";
                                            case R.id.CTRL:
                                                return "ACTION_DRAG_DROP";
                                            case R.id.FUNCTION:
                                                return "ACTION_DRAG_CANCEL";
                                            default:
                                                return "ACTION_UNKNOWN";
                                        }
                                }
                        }
                }
            }
            return "ACTION_CLEAR_FOCUS";
        }
        return "ACTION_FOCUS";
    }

    public final void a(int i3) {
        this.f2476a.addAction(i3);
    }

    public final void b(c cVar) {
        this.f2476a.addAction((AccessibilityNodeInfo.AccessibilityAction) cVar.f2473a);
    }

    public final ArrayList c(String str) {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f2476a;
        ArrayList<Integer> integerArrayList = accessibilityNodeInfo.getExtras().getIntegerArrayList(str);
        if (integerArrayList == null) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            accessibilityNodeInfo.getExtras().putIntegerArrayList(str, arrayList);
            return arrayList;
        }
        return integerArrayList;
    }

    public final boolean e(int i3) {
        Bundle extras = this.f2476a.getExtras();
        if (extras == null || (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i3) != i3) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof d)) {
            d dVar = (d) obj;
            AccessibilityNodeInfo accessibilityNodeInfo = dVar.f2476a;
            AccessibilityNodeInfo accessibilityNodeInfo2 = this.f2476a;
            if (accessibilityNodeInfo2 == null) {
                if (accessibilityNodeInfo != null) {
                    return false;
                }
            } else if (!accessibilityNodeInfo2.equals(accessibilityNodeInfo)) {
                return false;
            }
            if (this.f2477b == dVar.f2477b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void f(Rect rect) {
        this.f2476a.getBoundsInParent(rect);
    }

    public final CharSequence g() {
        boolean isEmpty = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
        AccessibilityNodeInfo accessibilityNodeInfo = this.f2476a;
        if (!isEmpty) {
            ArrayList c3 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            ArrayList c4 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            ArrayList c5 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            ArrayList c6 = c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SpannableString spannableString = new SpannableString(TextUtils.substring(accessibilityNodeInfo.getText(), 0, accessibilityNodeInfo.getText().length()));
            for (int i3 = 0; i3 < c3.size(); i3++) {
                spannableString.setSpan(new a(((Integer) c6.get(i3)).intValue(), this, accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) c3.get(i3)).intValue(), ((Integer) c4.get(i3)).intValue(), ((Integer) c5.get(i3)).intValue());
            }
            return spannableString;
        }
        return accessibilityNodeInfo.getText();
    }

    public final void h(CharSequence charSequence) {
        this.f2476a.setClassName(charSequence);
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f2476a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public final String toString() {
        String string;
        CharSequence charSequence;
        boolean e3;
        boolean e4;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        f(rect);
        sb.append("; boundsInParent: " + rect);
        AccessibilityNodeInfo accessibilityNodeInfo = this.f2476a;
        accessibilityNodeInfo.getBoundsInScreen(rect);
        sb.append("; boundsInScreen: " + rect);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 34) {
            t.c(accessibilityNodeInfo, rect);
        } else {
            Rect rect2 = (Rect) accessibilityNodeInfo.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
            if (rect2 != null) {
                rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
            }
        }
        sb.append("; boundsInWindow: " + rect);
        sb.append("; packageName: ");
        sb.append(accessibilityNodeInfo.getPackageName());
        sb.append("; className: ");
        sb.append(accessibilityNodeInfo.getClassName());
        sb.append("; text: ");
        sb.append(g());
        sb.append("; error: ");
        sb.append(accessibilityNodeInfo.getError());
        sb.append("; maxTextLength: ");
        sb.append(accessibilityNodeInfo.getMaxTextLength());
        sb.append("; stateDescription: ");
        sb.append(accessibilityNodeInfo.getStateDescription());
        sb.append("; contentDescription: ");
        sb.append(accessibilityNodeInfo.getContentDescription());
        sb.append("; tooltipText: ");
        sb.append(accessibilityNodeInfo.getTooltipText());
        sb.append("; viewIdResName: ");
        sb.append(accessibilityNodeInfo.getViewIdResourceName());
        sb.append("; uniqueId: ");
        if (i3 >= 33) {
            string = f0.a.b(accessibilityNodeInfo);
        } else {
            string = accessibilityNodeInfo.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
        }
        sb.append(string);
        sb.append("; checkable: ");
        sb.append(accessibilityNodeInfo.isCheckable());
        sb.append("; checked: ");
        sb.append(accessibilityNodeInfo.isChecked());
        sb.append("; fieldRequired: ");
        sb.append(accessibilityNodeInfo.getExtras().getBoolean("androidx.view.accessibility.AccessibilityNodeInfoCompat.IS_REQUIRED_KEY"));
        sb.append("; focusable: ");
        sb.append(accessibilityNodeInfo.isFocusable());
        sb.append("; focused: ");
        sb.append(accessibilityNodeInfo.isFocused());
        sb.append("; selected: ");
        sb.append(accessibilityNodeInfo.isSelected());
        sb.append("; clickable: ");
        sb.append(accessibilityNodeInfo.isClickable());
        sb.append("; longClickable: ");
        sb.append(accessibilityNodeInfo.isLongClickable());
        sb.append("; contextClickable: ");
        sb.append(accessibilityNodeInfo.isContextClickable());
        sb.append("; enabled: ");
        sb.append(accessibilityNodeInfo.isEnabled());
        sb.append("; password: ");
        sb.append(accessibilityNodeInfo.isPassword());
        sb.append("; scrollable: " + accessibilityNodeInfo.isScrollable());
        sb.append("; containerTitle: ");
        if (i3 >= 34) {
            charSequence = t.d(accessibilityNodeInfo);
        } else {
            charSequence = accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
        }
        sb.append(charSequence);
        sb.append("; granularScrollingSupported: ");
        sb.append(e(67108864));
        sb.append("; importantForAccessibility: ");
        sb.append(accessibilityNodeInfo.isImportantForAccessibility());
        sb.append("; visible: ");
        sb.append(accessibilityNodeInfo.isVisibleToUser());
        sb.append("; isTextSelectable: ");
        if (i3 >= 33) {
            e3 = f0.a.c(accessibilityNodeInfo);
        } else {
            e3 = e(8388608);
        }
        sb.append(e3);
        sb.append("; accessibilityDataSensitive: ");
        if (i3 >= 34) {
            e4 = t.g(accessibilityNodeInfo);
        } else {
            e4 = e(64);
        }
        sb.append(e4);
        sb.append("; [");
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = accessibilityNodeInfo.getActionList();
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i4 = 0; i4 < size; i4++) {
            arrayList.add(new c(actionList.get(i4), 0, null, null, null));
        }
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            c cVar = (c) arrayList.get(i5);
            int a3 = cVar.a();
            Object obj = cVar.f2473a;
            String d = d(a3);
            if (d.equals("ACTION_UNKNOWN") && ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                d = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
            sb.append(d);
            if (i5 != arrayList.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}

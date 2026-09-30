package j0;

import android.view.WindowInsets;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public abstract class b1 {
    public static int a(int i3) {
        int statusBars;
        int i4 = 0;
        for (int i5 = 1; i5 <= 512; i5 <<= 1) {
            if ((i3 & i5) != 0) {
                if (i5 != 1) {
                    if (i5 != 2) {
                        if (i5 != 4) {
                            if (i5 != 8) {
                                if (i5 != 16) {
                                    if (i5 != 32) {
                                        if (i5 != 64) {
                                            if (i5 != 128) {
                                                if (i5 == 512) {
                                                    statusBars = WindowInsets.Type.systemOverlays();
                                                }
                                            } else {
                                                statusBars = WindowInsets.Type.displayCutout();
                                            }
                                        } else {
                                            statusBars = WindowInsets.Type.tappableElement();
                                        }
                                    } else {
                                        statusBars = WindowInsets.Type.mandatorySystemGestures();
                                    }
                                } else {
                                    statusBars = WindowInsets.Type.systemGestures();
                                }
                            } else {
                                statusBars = WindowInsets.Type.ime();
                            }
                        } else {
                            statusBars = WindowInsets.Type.captionBar();
                        }
                    } else {
                        statusBars = WindowInsets.Type.navigationBars();
                    }
                } else {
                    statusBars = WindowInsets.Type.statusBars();
                }
                i4 |= statusBars;
            }
        }
        return i4;
    }
}

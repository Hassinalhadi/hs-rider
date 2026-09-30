package b2;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import com.logistics.rider.lsposed.R;
import java.io.IOException;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f965a;

    /* renamed from: b, reason: collision with root package name */
    public final n f966b;

    /* renamed from: c, reason: collision with root package name */
    public final int[][] f967c;
    public final n[] d;

    /* renamed from: e, reason: collision with root package name */
    public final y f968e;

    /* renamed from: f, reason: collision with root package name */
    public final y f969f;

    /* renamed from: g, reason: collision with root package name */
    public final y f970g;
    public final y h;

    public a0(z zVar) {
        this.f965a = zVar.f1070a;
        this.f966b = zVar.f1071b;
        this.f967c = zVar.f1072c;
        this.d = zVar.d;
        this.f968e = zVar.f1073e;
        this.f969f = zVar.f1074f;
        this.f970g = zVar.f1075g;
        this.h = zVar.h;
    }

    public static void a(z zVar, Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray obtainStyledAttributes;
        int depth = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next != 1) {
                int depth2 = xmlResourceParser.getDepth();
                if (depth2 >= depth || next != 3) {
                    if (next == 2 && depth2 <= depth && xmlResourceParser.getName().equals("item")) {
                        Resources resources = context.getResources();
                        int[] iArr = i1.a.f1985r;
                        if (theme == null) {
                            obtainStyledAttributes = resources.obtainAttributes(attributeSet, iArr);
                        } else {
                            obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                        }
                        n a3 = n.a(context, obtainStyledAttributes.getResourceId(0, 0), obtainStyledAttributes.getResourceId(1, 0), new a(0)).a();
                        obtainStyledAttributes.recycle();
                        int attributeCount = attributeSet.getAttributeCount();
                        int[] iArr2 = new int[attributeCount];
                        int i3 = 0;
                        for (int i4 = 0; i4 < attributeCount; i4++) {
                            int attributeNameResource = attributeSet.getAttributeNameResource(i4);
                            if (attributeNameResource != R.attr.shapeAppearance && attributeNameResource != R.attr.shapeAppearanceOverlay) {
                                int i5 = i3 + 1;
                                if (!attributeSet.getAttributeBooleanValue(i4, false)) {
                                    attributeNameResource = -attributeNameResource;
                                }
                                iArr2[i3] = attributeNameResource;
                                i3 = i5;
                            }
                        }
                        zVar.a(StateSet.trimStateSet(iArr2, i3), a3);
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [b2.z, java.lang.Object] */
    public static a0 b(Context context, TypedArray typedArray, int i3) {
        XmlResourceParser xml;
        int next;
        int resourceId = typedArray.getResourceId(i3, 0);
        if (resourceId == 0 || !Objects.equals(context.getResources().getResourceTypeName(resourceId), "xml")) {
            return null;
        }
        ?? obj = new Object();
        obj.b();
        try {
            xml = context.getResources().getXml(resourceId);
        } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
            obj.b();
        }
        try {
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                if (xml.getName().equals("selector")) {
                    a(obj, context, xml, asAttributeSet, context.getTheme());
                }
                xml.close();
                if (obj.f1070a == 0) {
                    return null;
                }
                return new a0(obj);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (Throwable th) {
            if (xml != null) {
                try {
                    xml.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public final n c() {
        n nVar = this.f966b;
        y yVar = this.h;
        y yVar2 = this.f970g;
        y yVar3 = this.f969f;
        y yVar4 = this.f968e;
        if (yVar4 == null && yVar3 == null && yVar2 == null && yVar == null) {
            return nVar;
        }
        m f3 = nVar.f();
        if (yVar4 != null) {
            f3.f1022e = yVar4.f1068b;
        }
        if (yVar3 != null) {
            f3.f1023f = yVar3.f1068b;
        }
        if (yVar2 != null) {
            f3.h = yVar2.f1068b;
        }
        if (yVar != null) {
            f3.f1024g = yVar.f1068b;
        }
        return f3.a();
    }

    public final boolean d() {
        y yVar;
        y yVar2;
        y yVar3;
        y yVar4;
        if (this.f965a > 1 || (((yVar = this.f968e) != null && yVar.f1067a > 1) || (((yVar2 = this.f969f) != null && yVar2.f1067a > 1) || (((yVar3 = this.f970g) != null && yVar3.f1067a > 1) || ((yVar4 = this.h) != null && yVar4.f1067a > 1))))) {
            return true;
        }
        return false;
    }
}

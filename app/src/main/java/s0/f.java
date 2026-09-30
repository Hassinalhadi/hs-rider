package s0;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class f extends k2.h {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f2954a;

    /* renamed from: b, reason: collision with root package name */
    public final d f2955b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2956c = true;

    public f(TextView textView) {
        this.f2954a = textView;
        this.f2955b = new d(textView);
    }

    @Override // k2.h
    public final void U(boolean z2) {
        if (z2) {
            Z();
        }
    }

    @Override // k2.h
    public final void V(boolean z2) {
        this.f2956c = z2;
        Z();
        TextView textView = this.f2954a;
        textView.setFilters(p(textView.getFilters()));
    }

    public final void Z() {
        TextView textView = this.f2954a;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (this.f2956c) {
            if (!(transformationMethod instanceof j) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new j(transformationMethod);
            }
        } else if (transformationMethod instanceof j) {
            transformationMethod = ((j) transformationMethod).f2961f;
        }
        textView.setTransformationMethod(transformationMethod);
    }

    @Override // k2.h
    public final InputFilter[] p(InputFilter[] inputFilterArr) {
        if (!this.f2956c) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i3 = 0; i3 < inputFilterArr.length; i3++) {
                InputFilter inputFilter = inputFilterArr[i3];
                if (inputFilter instanceof d) {
                    sparseArray.put(i3, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i4 = 0;
            for (int i5 = 0; i5 < length; i5++) {
                if (sparseArray.indexOfKey(i5) < 0) {
                    inputFilterArr2[i4] = inputFilterArr[i5];
                    i4++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i6 = 0;
        while (true) {
            d dVar = this.f2955b;
            if (i6 < length2) {
                if (inputFilterArr[i6] == dVar) {
                    return inputFilterArr;
                }
                i6++;
            } else {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = dVar;
                return inputFilterArr3;
            }
        }
    }
}

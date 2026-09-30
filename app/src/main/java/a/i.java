package a;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements b.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g.i f26b;

    public /* synthetic */ i(g.i iVar, int i3) {
        this.f25a = i3;
        this.f26b = iVar;
    }

    @Override // b.b
    public final void a(n nVar) {
        switch (this.f25a) {
            case 0:
                nVar.getClass();
                g.i iVar = this.f26b;
                Bundle c3 = iVar.f42i.f1098b.c("android:support:activity-result");
                if (c3 != null) {
                    m mVar = iVar.f46m;
                    LinkedHashMap linkedHashMap = mVar.f34b;
                    LinkedHashMap linkedHashMap2 = mVar.f33a;
                    Bundle bundle = mVar.f38g;
                    ArrayList<Integer> integerArrayList = c3.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = c3.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList != null && integerArrayList != null) {
                        ArrayList<String> stringArrayList2 = c3.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                        if (stringArrayList2 != null) {
                            mVar.d.addAll(stringArrayList2);
                        }
                        Bundle bundle2 = c3.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                        if (bundle2 != null) {
                            bundle.putAll(bundle2);
                        }
                        int size = stringArrayList.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            String str = stringArrayList.get(i3);
                            if (linkedHashMap.containsKey(str)) {
                                Integer num = (Integer) linkedHashMap.remove(str);
                                if (bundle.containsKey(str)) {
                                    continue;
                                } else if (!(linkedHashMap2 instanceof q2.a)) {
                                    linkedHashMap2.remove(num);
                                } else {
                                    ClassCastException classCastException = new ClassCastException(linkedHashMap2.getClass().getName().concat(" cannot be cast to kotlin.collections.MutableMap"));
                                    String name = p2.d.class.getName();
                                    StackTraceElement[] stackTrace = classCastException.getStackTrace();
                                    int length = stackTrace.length;
                                    int i4 = -1;
                                    for (int i5 = 0; i5 < length; i5++) {
                                        if (name.equals(stackTrace[i5].getClassName())) {
                                            i4 = i5;
                                        }
                                    }
                                    classCastException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i4 + 1, length));
                                    throw classCastException;
                                }
                            }
                            Integer num2 = integerArrayList.get(i3);
                            num2.getClass();
                            int intValue = num2.intValue();
                            String str2 = stringArrayList.get(i3);
                            str2.getClass();
                            String str3 = str2;
                            linkedHashMap2.put(Integer.valueOf(intValue), str3);
                            mVar.f34b.put(str3, Integer.valueOf(intValue));
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                androidx.fragment.app.w wVar = (androidx.fragment.app.w) this.f26b.f1716y.f299g;
                wVar.f523i.b(wVar, wVar, null);
                return;
        }
    }
}

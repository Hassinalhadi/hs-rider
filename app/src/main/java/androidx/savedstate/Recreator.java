package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.SavedStateHandleController;
import androidx.lifecycle.l;
import androidx.lifecycle.l0;
import androidx.lifecycle.m;
import androidx.lifecycle.o0;
import androidx.lifecycle.p;
import androidx.lifecycle.p0;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import c1.b;
import c1.d;
import c1.f;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public final class Recreator implements p {

    /* renamed from: f, reason: collision with root package name */
    public final f f664f;

    public Recreator(f fVar) {
        this.f664f = fVar;
    }

    @Override // androidx.lifecycle.p
    public final void b(r rVar, l lVar) {
        Object obj;
        f fVar = this.f664f;
        if (lVar == l.ON_CREATE) {
            rVar.f().f(this);
            Bundle c3 = fVar.b().c("androidx.savedstate.Restarter");
            if (c3 != null) {
                ArrayList<String> stringArrayList = c3.getStringArrayList("classes_to_restore");
                if (stringArrayList != null) {
                    int size = stringArrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        String str = stringArrayList.get(i3);
                        i3++;
                        String str2 = str;
                        try {
                            Class<? extends U> asSubclass = Class.forName(str2, false, Recreator.class.getClassLoader()).asSubclass(b.class);
                            asSubclass.getClass();
                            try {
                                Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                                declaredConstructor.setAccessible(true);
                                try {
                                    Object newInstance = declaredConstructor.newInstance(null);
                                    newInstance.getClass();
                                    if (fVar instanceof p0) {
                                        o0 e3 = ((p0) fVar).e();
                                        final d b3 = fVar.b();
                                        e3.getClass();
                                        LinkedHashMap linkedHashMap = e3.f576a;
                                        Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                        while (it.hasNext()) {
                                            String str3 = (String) it.next();
                                            str3.getClass();
                                            l0 l0Var = (l0) linkedHashMap.get(str3);
                                            l0Var.getClass();
                                            final t f3 = fVar.f();
                                            b3.getClass();
                                            f3.getClass();
                                            HashMap hashMap = l0Var.f566a;
                                            if (hashMap == null) {
                                                obj = null;
                                            } else {
                                                synchronized (hashMap) {
                                                    obj = l0Var.f566a.get("androidx.lifecycle.savedstate.vm.tag");
                                                }
                                            }
                                            SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
                                            if (savedStateHandleController != null && !savedStateHandleController.f540f) {
                                                savedStateHandleController.getClass();
                                                b3.getClass();
                                                f3.getClass();
                                                if (!savedStateHandleController.f540f) {
                                                    savedStateHandleController.f540f = true;
                                                    f3.a(savedStateHandleController);
                                                    b3.e(null, null);
                                                } else {
                                                    a.b.i("Already attached to lifecycleOwner");
                                                }
                                                m mVar = f3.f581c;
                                                if (mVar != m.f569g && mVar.compareTo(m.f570i) < 0) {
                                                    f3.a(new p() { // from class: androidx.lifecycle.LegacySavedStateHandleController$tryToAddRecreator$1
                                                        @Override // androidx.lifecycle.p
                                                        public final void b(r rVar2, l lVar2) {
                                                            if (lVar2 == l.ON_START) {
                                                                t.this.f(this);
                                                                b3.f();
                                                            }
                                                        }
                                                    });
                                                } else {
                                                    b3.f();
                                                }
                                            }
                                        }
                                        if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                            b3.f();
                                        }
                                    } else {
                                        a.b.i("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                                        return;
                                    }
                                } catch (Exception e4) {
                                    throw new RuntimeException("Failed to instantiate " + str2, e4);
                                }
                            } catch (NoSuchMethodException e5) {
                                throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e5);
                            }
                        } catch (ClassNotFoundException e6) {
                            throw new RuntimeException("Class " + str2 + " wasn't found", e6);
                        }
                    }
                    return;
                }
                a.b.i("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                return;
            }
            return;
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}

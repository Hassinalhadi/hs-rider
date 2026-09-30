package p;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public abstract class g implements Future {

    /* renamed from: i, reason: collision with root package name */
    public static final boolean f2656i = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: j, reason: collision with root package name */
    public static final Logger f2657j = Logger.getLogger(g.class.getName());

    /* renamed from: k, reason: collision with root package name */
    public static final k2.h f2658k;

    /* renamed from: l, reason: collision with root package name */
    public static final Object f2659l;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f2660f;

    /* renamed from: g, reason: collision with root package name */
    public volatile c f2661g;
    public volatile f h;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [k2.h] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    static {
        ?? r3;
        try {
            th = null;
            r3 = new d(AtomicReferenceFieldUpdater.newUpdater(f.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(f.class, f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, f.class, "h"), AtomicReferenceFieldUpdater.newUpdater(g.class, c.class, "g"), AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "f"));
        } catch (Throwable th) {
            th = th;
            r3 = new Object();
        }
        f2658k = r3;
        if (th != null) {
            f2657j.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f2659l = new Object();
    }

    public static void b(g gVar) {
        f fVar;
        c cVar;
        do {
            fVar = gVar.h;
        } while (!f2658k.g(gVar, fVar, f.f2653c));
        while (fVar != null) {
            Thread thread = fVar.f2654a;
            if (thread != null) {
                fVar.f2654a = null;
                LockSupport.unpark(thread);
            }
            fVar = fVar.f2655b;
        }
        do {
            cVar = gVar.f2661g;
        } while (!f2658k.e(gVar, cVar));
        c cVar2 = null;
        while (cVar != null) {
            c cVar3 = cVar.f2648a;
            cVar.f2648a = cVar2;
            cVar2 = cVar;
            cVar = cVar3;
        }
        while (cVar2 != null) {
            cVar2 = cVar2.f2648a;
            try {
                throw null;
                break;
            } catch (RuntimeException e3) {
                f2657j.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", (Throwable) e3);
            }
        }
    }

    public static Object c(Object obj) {
        if (!(obj instanceof a)) {
            if (!(obj instanceof b)) {
                if (obj == f2659l) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException((Throwable) null);
        }
        Throwable th = ((a) obj).f2646a;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th);
        throw cancellationException;
    }

    public static Object d(g gVar) {
        Object obj;
        boolean z2 = false;
        while (true) {
            try {
                obj = gVar.get();
                break;
            } catch (InterruptedException unused) {
                z2 = true;
            } catch (Throwable th) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public final void a(StringBuilder sb) {
        String valueOf;
        try {
            Object d = d(this);
            sb.append("SUCCESS, result=[");
            if (d == this) {
                valueOf = "this future";
            } else {
                valueOf = String.valueOf(d);
            }
            sb.append(valueOf);
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e3) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e3.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e4) {
            sb.append("FAILURE, cause=[");
            sb.append(e4.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z2) {
        a aVar;
        Object obj = this.f2660f;
        if (obj == null) {
            if (f2656i) {
                aVar = new a(z2, new CancellationException("Future.cancel() was called."));
            } else if (z2) {
                aVar = a.f2644b;
            } else {
                aVar = a.f2645c;
            }
            if (f2658k.f(this, obj, aVar)) {
                b(this);
                return true;
            }
            return false;
        }
        return false;
    }

    public final void e(f fVar) {
        fVar.f2654a = null;
        while (true) {
            f fVar2 = this.h;
            if (fVar2 != f.f2653c) {
                f fVar3 = null;
                while (fVar2 != null) {
                    f fVar4 = fVar2.f2655b;
                    if (fVar2.f2654a != null) {
                        fVar3 = fVar2;
                    } else if (fVar3 != null) {
                        fVar3.f2655b = fVar4;
                        if (fVar3.f2654a == null) {
                            break;
                        }
                    } else if (!f2658k.g(this, fVar2, fVar4)) {
                        break;
                    }
                    fVar2 = fVar4;
                }
                return;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j3, TimeUnit timeUnit) {
        long j4;
        boolean z2;
        f fVar = f.f2653c;
        long nanos = timeUnit.toNanos(j3);
        if (!Thread.interrupted()) {
            Object obj = this.f2660f;
            if (obj != null) {
                return c(obj);
            }
            if (nanos > 0) {
                j4 = System.nanoTime() + nanos;
            } else {
                j4 = 0;
            }
            if (nanos >= 1000) {
                f fVar2 = this.h;
                if (fVar2 != fVar) {
                    f fVar3 = new f();
                    do {
                        k2.h hVar = f2658k;
                        hVar.N(fVar3, fVar2);
                        if (hVar.g(this, fVar2, fVar3)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f2660f;
                                    if (obj2 != null) {
                                        return c(obj2);
                                    }
                                    nanos = j4 - System.nanoTime();
                                } else {
                                    e(fVar3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            e(fVar3);
                        } else {
                            fVar2 = this.h;
                        }
                    } while (fVar2 != fVar);
                }
                return c(this.f2660f);
            }
            while (nanos > 0) {
                Object obj3 = this.f2660f;
                if (obj3 != null) {
                    return c(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = j4 - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String gVar = toString();
            String obj4 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj4.toLowerCase(locale);
            String str = "Waited " + j3 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String concat = str.concat(" (plus ");
                long j5 = -nanos;
                long convert = timeUnit.convert(j5, TimeUnit.NANOSECONDS);
                long nanos2 = j5 - timeUnit.toNanos(convert);
                if (convert != 0 && nanos2 <= 1000) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (convert > 0) {
                    String str2 = concat + convert + " " + lowerCase;
                    if (z2) {
                        str2 = str2.concat(",");
                    }
                    concat = str2.concat(" ");
                }
                if (z2) {
                    concat = concat + nanos2 + " nanoseconds ";
                }
                str = concat.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(str.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(str + " for " + gVar);
        }
        throw new InterruptedException();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f2660f instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        if (this.f2660f != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f2660f instanceof a) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                if (this instanceof ScheduledFuture) {
                    str = "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                } else {
                    str = null;
                }
            } catch (RuntimeException e3) {
                str = "Exception thrown from implementation: " + e3.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        f fVar = f.f2653c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f2660f;
            if (obj2 != null) {
                return c(obj2);
            }
            f fVar2 = this.h;
            if (fVar2 != fVar) {
                f fVar3 = new f();
                do {
                    k2.h hVar = f2658k;
                    hVar.N(fVar3, fVar2);
                    if (hVar.g(this, fVar2, fVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f2660f;
                            } else {
                                e(fVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return c(obj);
                    }
                    fVar2 = this.h;
                } while (fVar2 != fVar);
            }
            return c(this.f2660f);
        }
        throw new InterruptedException();
    }
}

package z0;

import android.content.pm.PackageInfo;
import androidx.fragment.app.w0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

/* compiled from: r8-map-id-490f0dba1d768a4affb4e870be6bc488cb830058e87a4b15c3a9e69aab618a3c */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final b2.f f3331a = new b2.f(23);

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f3332b = {112, 114, 111, 0};

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f3333c = {112, 114, 109, 0};
    public static final byte[] d = {48, 49, 53, 0};

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f3334e = {48, 49, 48, 0};

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f3335f = {48, 48, 57, 0};

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f3336g = {48, 48, 53, 0};
    public static final byte[] h = {48, 48, 49, 0};

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f3337i = {48, 48, 49, 0};

    /* renamed from: j, reason: collision with root package name */
    public static final byte[] f3338j = {48, 48, 50, 0};

    public static byte[] a(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static byte[] b(c[] cVarArr, byte[] bArr) {
        int i3 = 0;
        int i4 = 0;
        for (c cVar : cVarArr) {
            i4 += ((((cVar.f3329g * 2) + 7) & (-8)) / 8) + (cVar.f3327e * 2) + d(cVar.f3324a, cVar.f3325b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + cVar.f3328f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i4);
        if (Arrays.equals(bArr, f3335f)) {
            int length = cVarArr.length;
            while (i3 < length) {
                c cVar2 = cVarArr[i3];
                q(byteArrayOutputStream, cVar2, d(cVar2.f3324a, cVar2.f3325b, bArr));
                p(byteArrayOutputStream, cVar2);
                i3++;
            }
        } else {
            for (c cVar3 : cVarArr) {
                q(byteArrayOutputStream, cVar3, d(cVar3.f3324a, cVar3.f3325b, bArr));
            }
            int length2 = cVarArr.length;
            while (i3 < length2) {
                p(byteArrayOutputStream, cVarArr[i3]);
                i3++;
            }
        }
        if (byteArrayOutputStream.size() == i4) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i4);
    }

    public static boolean c(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return false;
            }
            boolean z2 = true;
            for (File file2 : listFiles) {
                if (c(file2) && z2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            return z2;
        }
        file.delete();
        return true;
    }

    public static String d(String str, String str2, byte[] bArr) {
        Object obj;
        byte[] bArr2 = h;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f3336g;
        String str3 = "!";
        if (!equals && !Arrays.equals(bArr, bArr3)) {
            obj = "!";
        } else {
            obj = ":";
        }
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            if (":".equals(obj)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (!str2.contains("!") && !str2.contains(":")) {
                if (!str2.endsWith(".apk")) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    if (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) {
                        str3 = ":";
                    }
                    sb.append(str3);
                    sb.append(str2);
                    return sb.toString();
                }
            } else {
                if ("!".equals(obj)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(obj)) {
                    return str2.replace("!", ":");
                }
            }
        }
        return str2;
    }

    public static void e(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    public static byte[] f(InputStream inputStream, int i3) {
        byte[] bArr = new byte[i3];
        int i4 = 0;
        while (i4 < i3) {
            int read = inputStream.read(bArr, i4, i3 - i4);
            if (read >= 0) {
                i4 += read;
            } else {
                a.b.i(w0.d("Not enough bytes to read: ", i3));
                return null;
            }
        }
        return bArr;
    }

    public static int[] g(ByteArrayInputStream byteArrayInputStream, int i3) {
        int[] iArr = new int[i3];
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            i4 += (int) m(byteArrayInputStream, 2);
            iArr[i5] = i4;
        }
        return iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        if (r0.finished() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        throw new java.lang.IllegalStateException("Inflater did not finish");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] h(java.io.FileInputStream r8, int r9, int r10) {
        /*
            java.util.zip.Inflater r0 = new java.util.zip.Inflater
            r0.<init>()
            byte[] r1 = new byte[r10]     // Catch: java.lang.Throwable -> L2e
            r2 = 2048(0x800, float:2.87E-42)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L2e
            r3 = 0
            r4 = r3
            r5 = r4
        Le:
            boolean r6 = r0.finished()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L57
            boolean r6 = r0.needsDictionary()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L57
            if (r4 >= r9) goto L57
            int r6 = r8.read(r2)     // Catch: java.lang.Throwable -> L2e
            if (r6 < 0) goto L3b
            r0.setInput(r2, r3, r6)     // Catch: java.lang.Throwable -> L2e
            int r7 = r10 - r5
            int r7 = r0.inflate(r1, r5, r7)     // Catch: java.lang.Throwable -> L2e java.util.zip.DataFormatException -> L30
            int r5 = r5 + r7
            int r4 = r4 + r6
            goto Le
        L2e:
            r8 = move-exception
            goto L8a
        L30:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L3b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r8.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = "Invalid zip data. Stream ended after $totalBytesRead bytes. Expected "
            r8.append(r10)     // Catch: java.lang.Throwable -> L2e
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r9 = " bytes"
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L57:
            if (r4 != r9) goto L6b
            boolean r8 = r0.finished()     // Catch: java.lang.Throwable -> L2e
            if (r8 == 0) goto L63
            r0.end()
            return r1
        L63:
            java.lang.String r8 = "Inflater did not finish"
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L6b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r8.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = "Didn't read enough bytes during decompression. expected="
            r8.append(r10)     // Catch: java.lang.Throwable -> L2e
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r9 = " actual="
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            r8.append(r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L8a:
            r0.end()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: z0.f.h(java.io.FileInputStream, int, int):byte[]");
    }

    public static c[] i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, c[] cVarArr) {
        byte[] bArr3 = f3337i;
        if (Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(d, bArr2)) {
                if (Arrays.equals(bArr, bArr3)) {
                    int m3 = (int) m(fileInputStream, 1);
                    byte[] h3 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
                    if (fileInputStream.read() <= 0) {
                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h3);
                        try {
                            c[] j3 = j(byteArrayInputStream, m3, cVarArr);
                            byteArrayInputStream.close();
                            return j3;
                        } catch (Throwable th) {
                            try {
                                byteArrayInputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    a.b.i("Content found after the end of file");
                    return null;
                }
                a.b.i("Unsupported meta version");
                return null;
            }
            a.b.i("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            return null;
        }
        if (Arrays.equals(bArr, f3338j)) {
            int m4 = (int) m(fileInputStream, 2);
            byte[] h4 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(h4);
                try {
                    c[] k3 = k(byteArrayInputStream2, bArr2, m4, cVarArr);
                    byteArrayInputStream2.close();
                    return k3;
                } catch (Throwable th3) {
                    try {
                        byteArrayInputStream2.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
            a.b.i("Content found after the end of file");
            return null;
        }
        a.b.i("Unsupported meta version");
        return null;
    }

    public static c[] j(ByteArrayInputStream byteArrayInputStream, int i3, c[] cVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        if (i3 == cVarArr.length) {
            String[] strArr = new String[i3];
            int[] iArr = new int[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                int m3 = (int) m(byteArrayInputStream, 2);
                iArr[i4] = (int) m(byteArrayInputStream, 2);
                strArr[i4] = new String(f(byteArrayInputStream, m3), StandardCharsets.UTF_8);
            }
            for (int i5 = 0; i5 < i3; i5++) {
                c cVar = cVarArr[i5];
                if (cVar.f3325b.equals(strArr[i5])) {
                    int i6 = iArr[i5];
                    cVar.f3327e = i6;
                    cVar.h = g(byteArrayInputStream, i6);
                } else {
                    a.b.i("Order of dexfiles in metadata did not match baseline");
                    return null;
                }
            }
            return cVarArr;
        }
        a.b.i("Mismatched number of dex files found in metadata");
        return null;
    }

    public static c[] k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i3, c[] cVarArr) {
        String str;
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        if (i3 == cVarArr.length) {
            for (int i4 = 0; i4 < i3; i4++) {
                m(byteArrayInputStream, 2);
                String str2 = new String(f(byteArrayInputStream, (int) m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
                long m3 = m(byteArrayInputStream, 4);
                int m4 = (int) m(byteArrayInputStream, 2);
                c cVar = null;
                if (cVarArr.length > 0) {
                    int indexOf = str2.indexOf("!");
                    if (indexOf < 0) {
                        indexOf = str2.indexOf(":");
                    }
                    if (indexOf > 0) {
                        str = str2.substring(indexOf + 1);
                    } else {
                        str = str2;
                    }
                    int i5 = 0;
                    while (true) {
                        if (i5 >= cVarArr.length) {
                            break;
                        }
                        if (cVarArr[i5].f3325b.equals(str)) {
                            cVar = cVarArr[i5];
                            break;
                        }
                        i5++;
                    }
                }
                if (cVar != null) {
                    cVar.d = m3;
                    int[] g3 = g(byteArrayInputStream, m4);
                    if (Arrays.equals(bArr, h)) {
                        cVar.f3327e = m4;
                        cVar.h = g3;
                    }
                } else {
                    a.b.i("Missing profile key: ".concat(str2));
                    return null;
                }
            }
            return cVarArr;
        }
        a.b.i("Mismatched number of dex files found in metadata");
        return null;
    }

    public static c[] l(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (Arrays.equals(bArr, f3334e)) {
            int m3 = (int) m(fileInputStream, 1);
            byte[] h3 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h3);
                try {
                    c[] n2 = n(byteArrayInputStream, str, m3);
                    byteArrayInputStream.close();
                    return n2;
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            a.b.i("Content found after the end of file");
            return null;
        }
        a.b.i("Unsupported version");
        return null;
    }

    public static long m(InputStream inputStream, int i3) {
        byte[] f3 = f(inputStream, i3);
        long j3 = 0;
        for (int i4 = 0; i4 < i3; i4++) {
            j3 += (f3[i4] & 255) << (i4 * 8);
        }
        return j3;
    }

    public static c[] n(ByteArrayInputStream byteArrayInputStream, String str, int i3) {
        int i4;
        int i5 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new c[0];
        }
        c[] cVarArr = new c[i3];
        for (int i6 = 0; i6 < i3; i6++) {
            int m3 = (int) m(byteArrayInputStream, 2);
            int m4 = (int) m(byteArrayInputStream, 2);
            cVarArr[i6] = new c(str, new String(f(byteArrayInputStream, m3), StandardCharsets.UTF_8), m(byteArrayInputStream, 4), m4, (int) m(byteArrayInputStream, 4), (int) m(byteArrayInputStream, 4), new int[m4], new TreeMap());
        }
        int i7 = 0;
        while (i7 < i3) {
            c cVar = cVarArr[i7];
            int available = byteArrayInputStream.available();
            int i8 = cVar.f3328f;
            int i9 = cVar.f3329g;
            TreeMap treeMap = cVar.f3330i;
            int i10 = available - i8;
            int i11 = i5;
            while (byteArrayInputStream.available() > i10) {
                i11 += (int) m(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(i11), 1);
                int m5 = (int) m(byteArrayInputStream, 2);
                while (m5 > 0) {
                    m(byteArrayInputStream, 2);
                    int m6 = (int) m(byteArrayInputStream, 1);
                    if (m6 != 6 && m6 != 7) {
                        while (m6 > 0) {
                            m(byteArrayInputStream, 1);
                            int i12 = i5;
                            int i13 = i7;
                            for (int m7 = (int) m(byteArrayInputStream, 1); m7 > 0; m7--) {
                                m(byteArrayInputStream, 2);
                            }
                            m6--;
                            i5 = i12;
                            i7 = i13;
                        }
                    }
                    m5--;
                    i5 = i5;
                    i7 = i7;
                }
            }
            int i14 = i5;
            int i15 = i7;
            if (byteArrayInputStream.available() == i10) {
                cVar.h = g(byteArrayInputStream, cVar.f3327e);
                BitSet valueOf = BitSet.valueOf(f(byteArrayInputStream, (((i9 * 2) + 7) & (-8)) / 8));
                for (int i16 = i14; i16 < i9; i16++) {
                    if (valueOf.get(i16)) {
                        i4 = 2;
                    } else {
                        i4 = i14;
                    }
                    if (valueOf.get(i16 + i9)) {
                        i4 |= 4;
                    }
                    if (i4 != 0) {
                        Integer num = (Integer) treeMap.get(Integer.valueOf(i16));
                        if (num == null) {
                            num = Integer.valueOf(i14);
                        }
                        treeMap.put(Integer.valueOf(i16), Integer.valueOf(i4 | num.intValue()));
                    }
                }
                i7 = i15 + 1;
                i5 = i14;
            } else {
                a.b.i("Read too much data during profile line parse");
                return null;
            }
        }
        return cVarArr;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, c[] cVarArr) {
        long j3;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = d;
        int i3 = 0;
        if (Arrays.equals(bArr, bArr2)) {
            ArrayList arrayList2 = new ArrayList(3);
            ArrayList arrayList3 = new ArrayList(3);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                v(byteArrayOutputStream2, cVarArr.length);
                int i4 = 2;
                int i5 = 2;
                for (c cVar : cVarArr) {
                    u(byteArrayOutputStream2, cVar.f3326c, 4);
                    u(byteArrayOutputStream2, cVar.d, 4);
                    u(byteArrayOutputStream2, cVar.f3329g, 4);
                    String d3 = d(cVar.f3324a, cVar.f3325b, bArr2);
                    Charset charset = StandardCharsets.UTF_8;
                    int length2 = d3.getBytes(charset).length;
                    v(byteArrayOutputStream2, length2);
                    i5 = i5 + 14 + length2;
                    byteArrayOutputStream2.write(d3.getBytes(charset));
                }
                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                if (i5 == byteArray.length) {
                    j jVar = new j(1, byteArray, false);
                    byteArrayOutputStream2.close();
                    arrayList2.add(jVar);
                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                    int i6 = 0;
                    int i7 = 0;
                    while (i6 < cVarArr.length) {
                        try {
                            c cVar2 = cVarArr[i6];
                            v(byteArrayOutputStream3, i6);
                            v(byteArrayOutputStream3, cVar2.f3327e);
                            i7 = i7 + 4 + (cVar2.f3327e * i4);
                            int[] iArr = cVar2.h;
                            int length3 = iArr.length;
                            int i8 = i3;
                            int i9 = i4;
                            int i10 = i8;
                            while (i10 < length3) {
                                int i11 = iArr[i10];
                                v(byteArrayOutputStream3, i11 - i8);
                                i10++;
                                i8 = i11;
                            }
                            i6++;
                            i4 = i9;
                            i3 = 0;
                        } catch (Throwable th) {
                        }
                    }
                    byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
                    if (i7 == byteArray2.length) {
                        j jVar2 = new j(3, byteArray2, true);
                        byteArrayOutputStream3.close();
                        arrayList2.add(jVar2);
                        byteArrayOutputStream3 = new ByteArrayOutputStream();
                        int i12 = 0;
                        int i13 = 0;
                        while (i12 < cVarArr.length) {
                            try {
                                c cVar3 = cVarArr[i12];
                                Iterator it = cVar3.f3330i.entrySet().iterator();
                                int i14 = 0;
                                while (it.hasNext()) {
                                    i14 |= ((Integer) ((Map.Entry) it.next()).getValue()).intValue();
                                }
                                ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                                try {
                                    r(byteArrayOutputStream4, i14, cVar3);
                                    byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                                    byteArrayOutputStream4.close();
                                    byteArrayOutputStream4 = new ByteArrayOutputStream();
                                    try {
                                        s(byteArrayOutputStream4, cVar3);
                                        byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                                        byteArrayOutputStream4.close();
                                        v(byteArrayOutputStream3, i12);
                                        int length4 = byteArray3.length + 2 + byteArray4.length;
                                        int i15 = i13 + 6;
                                        ArrayList arrayList4 = arrayList3;
                                        u(byteArrayOutputStream3, length4, 4);
                                        v(byteArrayOutputStream3, i14);
                                        byteArrayOutputStream3.write(byteArray3);
                                        byteArrayOutputStream3.write(byteArray4);
                                        i13 = i15 + length4;
                                        i12++;
                                        arrayList3 = arrayList4;
                                    } finally {
                                    }
                                } finally {
                                }
                            } finally {
                                try {
                                    byteArrayOutputStream3.close();
                                    throw th;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                        }
                        ArrayList arrayList5 = arrayList3;
                        byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
                        if (i13 == byteArray5.length) {
                            j jVar3 = new j(4, byteArray5, true);
                            byteArrayOutputStream3.close();
                            arrayList2.add(jVar3);
                            long j4 = 4;
                            long size = j4 + j4 + 4 + (arrayList2.size() * 16);
                            u(byteArrayOutputStream, arrayList2.size(), 4);
                            int i16 = 0;
                            while (i16 < arrayList2.size()) {
                                j jVar4 = (j) arrayList2.get(i16);
                                int i17 = jVar4.f3345a;
                                byte[] bArr3 = jVar4.f3346b;
                                if (i17 != 1) {
                                    if (i17 != 2) {
                                        if (i17 != 3) {
                                            if (i17 != 4) {
                                                if (i17 == 5) {
                                                    j3 = 4;
                                                } else {
                                                    throw null;
                                                }
                                            } else {
                                                j3 = 3;
                                            }
                                        } else {
                                            j3 = 2;
                                        }
                                    } else {
                                        j3 = 1;
                                    }
                                } else {
                                    j3 = 0;
                                }
                                u(byteArrayOutputStream, j3, 4);
                                u(byteArrayOutputStream, size, 4);
                                if (jVar4.f3347c) {
                                    long length5 = bArr3.length;
                                    byte[] a3 = a(bArr3);
                                    arrayList = arrayList5;
                                    arrayList.add(a3);
                                    u(byteArrayOutputStream, a3.length, 4);
                                    u(byteArrayOutputStream, length5, 4);
                                    length = a3.length;
                                } else {
                                    arrayList = arrayList5;
                                    arrayList.add(bArr3);
                                    u(byteArrayOutputStream, bArr3.length, 4);
                                    u(byteArrayOutputStream, 0L, 4);
                                    length = bArr3.length;
                                }
                                size += length;
                                i16++;
                                arrayList5 = arrayList;
                            }
                            ArrayList arrayList6 = arrayList5;
                            for (int i18 = 0; i18 < arrayList6.size(); i18++) {
                                byteArrayOutputStream.write((byte[]) arrayList6.get(i18));
                            }
                            return true;
                        }
                        throw new IllegalStateException("Expected size " + i13 + ", does not match actual size " + byteArray5.length);
                    }
                    throw new IllegalStateException("Expected size " + i7 + ", does not match actual size " + byteArray2.length);
                }
                throw new IllegalStateException("Expected size " + i5 + ", does not match actual size " + byteArray.length);
            } catch (Throwable th3) {
                try {
                    byteArrayOutputStream2.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        }
        byte[] bArr4 = f3334e;
        if (Arrays.equals(bArr, bArr4)) {
            byte[] b3 = b(cVarArr, bArr4);
            u(byteArrayOutputStream, cVarArr.length, 1);
            u(byteArrayOutputStream, b3.length, 4);
            byte[] a4 = a(b3);
            u(byteArrayOutputStream, a4.length, 4);
            byteArrayOutputStream.write(a4);
            return true;
        }
        byte[] bArr5 = f3336g;
        if (Arrays.equals(bArr, bArr5)) {
            u(byteArrayOutputStream, cVarArr.length, 1);
            for (c cVar4 : cVarArr) {
                int size2 = cVar4.f3330i.size() * 4;
                String d4 = d(cVar4.f3324a, cVar4.f3325b, bArr5);
                Charset charset2 = StandardCharsets.UTF_8;
                v(byteArrayOutputStream, d4.getBytes(charset2).length);
                v(byteArrayOutputStream, cVar4.h.length);
                u(byteArrayOutputStream, size2, 4);
                u(byteArrayOutputStream, cVar4.f3326c, 4);
                byteArrayOutputStream.write(d4.getBytes(charset2));
                Iterator it2 = cVar4.f3330i.keySet().iterator();
                while (it2.hasNext()) {
                    v(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                    v(byteArrayOutputStream, 0);
                }
                for (int i19 : cVar4.h) {
                    v(byteArrayOutputStream, i19);
                }
            }
            return true;
        }
        byte[] bArr6 = f3335f;
        if (Arrays.equals(bArr, bArr6)) {
            byte[] b4 = b(cVarArr, bArr6);
            u(byteArrayOutputStream, cVarArr.length, 1);
            u(byteArrayOutputStream, b4.length, 4);
            byte[] a5 = a(b4);
            u(byteArrayOutputStream, a5.length, 4);
            byteArrayOutputStream.write(a5);
            return true;
        }
        byte[] bArr7 = h;
        if (Arrays.equals(bArr, bArr7)) {
            v(byteArrayOutputStream, cVarArr.length);
            for (c cVar5 : cVarArr) {
                String str = cVar5.f3324a;
                TreeMap treeMap = cVar5.f3330i;
                String d5 = d(str, cVar5.f3325b, bArr7);
                Charset charset3 = StandardCharsets.UTF_8;
                v(byteArrayOutputStream, d5.getBytes(charset3).length);
                v(byteArrayOutputStream, treeMap.size());
                v(byteArrayOutputStream, cVar5.h.length);
                u(byteArrayOutputStream, cVar5.f3326c, 4);
                byteArrayOutputStream.write(d5.getBytes(charset3));
                Iterator it3 = treeMap.keySet().iterator();
                while (it3.hasNext()) {
                    v(byteArrayOutputStream, ((Integer) it3.next()).intValue());
                }
                for (int i20 : cVar5.h) {
                    v(byteArrayOutputStream, i20);
                }
            }
            return true;
        }
        return false;
    }

    public static void p(ByteArrayOutputStream byteArrayOutputStream, c cVar) {
        s(byteArrayOutputStream, cVar);
        int i3 = cVar.f3329g;
        int[] iArr = cVar.h;
        int length = iArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int i6 = iArr[i4];
            v(byteArrayOutputStream, i6 - i5);
            i4++;
            i5 = i6;
        }
        byte[] bArr = new byte[(((i3 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : cVar.f3330i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i7 = intValue / 8;
                bArr[i7] = (byte) (bArr[i7] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i8 = intValue + i3;
                int i9 = i8 / 8;
                bArr[i9] = (byte) ((1 << (i8 % 8)) | bArr[i9]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void q(ByteArrayOutputStream byteArrayOutputStream, c cVar, String str) {
        Charset charset = StandardCharsets.UTF_8;
        v(byteArrayOutputStream, str.getBytes(charset).length);
        v(byteArrayOutputStream, cVar.f3327e);
        u(byteArrayOutputStream, cVar.f3328f, 4);
        u(byteArrayOutputStream, cVar.f3326c, 4);
        u(byteArrayOutputStream, cVar.f3329g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void r(ByteArrayOutputStream byteArrayOutputStream, int i3, c cVar) {
        int i4 = cVar.f3329g;
        byte[] bArr = new byte[(((Integer.bitCount(i3 & (-2)) * i4) + 7) & (-8)) / 8];
        for (Map.Entry entry : cVar.f3330i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            int i5 = 0;
            for (int i6 = 1; i6 <= 4; i6 <<= 1) {
                if (i6 != 1 && (i6 & i3) != 0) {
                    if ((i6 & intValue2) == i6) {
                        int i7 = (i5 * i4) + intValue;
                        int i8 = i7 / 8;
                        bArr[i8] = (byte) ((1 << (i7 % 8)) | bArr[i8]);
                    }
                    i5++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void s(ByteArrayOutputStream byteArrayOutputStream, c cVar) {
        int i3 = 0;
        for (Map.Entry entry : cVar.f3330i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                v(byteArrayOutputStream, intValue - i3);
                v(byteArrayOutputStream, 0);
                i3 = intValue;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0105 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02c9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01fa  */
    /* JADX WARN: Type inference failed for: r7v24, types: [java.io.OutputStream, java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r7v25, types: [int] */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void t(android.content.Context r18, java.util.concurrent.Executor r19, z0.e r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 731
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z0.f.t(android.content.Context, java.util.concurrent.Executor, z0.e, boolean):void");
    }

    public static void u(ByteArrayOutputStream byteArrayOutputStream, long j3, int i3) {
        byte[] bArr = new byte[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            bArr[i4] = (byte) ((j3 >> (i4 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void v(ByteArrayOutputStream byteArrayOutputStream, int i3) {
        u(byteArrayOutputStream, i3, 2);
    }
}

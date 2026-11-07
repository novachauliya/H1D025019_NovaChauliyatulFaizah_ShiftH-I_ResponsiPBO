## Deskripsi Program
Program simulasi bengkel sederhana pakai Java dengan tema Otomotif. Di program ini ada dua jenis mobil, yaitu mobil listrik (Wuling New Air ev sama Ioniq 5) dan mobil bensin (Porsche 718 Spyder). Tiap mobil punya kemampuan masing-masing, kayak nyalain mesin, servis, ngisi daya (khusus mobil listrik), dan ngaktifin airbag (khusus mobil listrik). Pas servis, program ngecek kondisi mobilnya dulu. Kalau baterainya di bawah 20% atau bensinnya di bawah 10 liter, mobilnya langsung diisi ulang (Skenario 1). Kalau kondisinya masih cukup, program cuma nampilin kalau mobilnya aman (Skenario 2). Semua skenario dijalanin di class Main dan hasilnya muncul di terminal.

## Identitas Mahasiswa
- Nama: Nova Chauliyatul Faizah
- NIM: H1D025019
- Shift awal: C
- Shift akhir: H-I
- Tema: Otomotif (Digit terakhir 9)

## Petunjuk Compile dan Run
Pastikan perangkat udah install Java Development Kit (JDK). Buka CMD di tempat file Java disimpan, lalu jalankan perintah berikut:
1. compile semua file Java sekaligus dengan: javac *.java
2. jalankan: java Main

## hasil output:
<img width="445" height="744" alt="a8f8200f-8788-4435-b565-e28bd0af1123" src="https://github.com/user-attachments/assets/f2edc02f-e22b-43c7-87ec-436c9504efac" />

## pas di running di cmd
<img width="468" height="682" alt="f5b2d0d8-c749-427a-ab1e-f6eebd305ea3" src="https://github.com/user-attachments/assets/c9d0cc96-6525-4ca0-a8f3-7369229d69d7" />

* **Skenario 1 (cabang IF)**: Wuling (baterai 10%) dan Porsche (bensin 2L) masuk cabang if saat servis() dipanggil, sehingga baterai Wuling terisi jadi 100% dan bensin Porsche bertambah jadi 42L.
* **Skenario 2 (cabang ELSE)**: dibuat objek baru dengan kondisi awal berbeda, yaitu Wuling (baterai 100%) dan Porsche (bensin 42L), sehingga keduanya masuk cabang else saat servis() dipanggil dan state tidak berubah.

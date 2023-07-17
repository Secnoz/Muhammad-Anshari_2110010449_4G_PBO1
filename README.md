# Proyek Aplikasi Pengiriman Makanan
Proyek ini merupakan contoh sederhana aplikasi pengiriman makanan menggunakan bahasa Java. Aplikasi ini memungkinkan pengguna untuk memesan makanan dari restoran dan mengirimkannya menggunakan jasa kurir. Proyek ini dikembangkan sebagai tugas akhir dalam mata kuliah Pemrograman Berorientasi Objek 1.
## Deskripsi
Aplikasi ini memiliki fitur berikut:
-	Menampilkan menu makanan dari restoran.
-	Memilih makanan yang akan dipesan dan menentukan jumlah pesanan.
-	Memilih kurir untuk pengiriman pesanan.
-	Menghitung total harga pesanan termasuk ongkos kirim.
Proyek ini mengimplementasikan berbagai konsep penting dalam pemrograman berorientasi objek (PBO) seperti objek, atribut, konstruktor, mutator, accessor, enkapsulasi, pewarisan, polimorfisme, seleksi, perulangan, IO sederhana, array, dan penanganan kesalahan.
## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Makanan`, `Pesanan`, `Kendaraan`, `Mobil`, `Motor`, `KurumaMain` adalah contoh dari class.

```bash
class Makanan{
    ...
}

class Pesanan{
    ...
}
abstract class Kendaraan {
    ...
}


class Motor Extends Kendaraan{
    ...
}
class Mobil Extends Kendaraan{
    ...
}
```

2. **Object** Setiap entitas dalam aplikasi ini, seperti makanan, restoran, kurir, dan pesanan, diwakili oleh objek-objek yang sesuai dengan kelas yang telah dibuat.
```bash
public Pesanan() {
        makanan = new Makanan[10];
        jumlahMakanan = new int[10];
    }
```

3. **Atribut** Adalah  Setiap kelas memiliki atribut yang merepresentasikan karakteristik atau properti dari objek tersebut. Contohnya, kelas `Makanan` memiliki atribut `Nama` dan `Harga`.
```bash
    private String nama;
    private double harga;
```

4. **Constructor** adalah Setiap kelas memiliki konstruktor untuk menginisialisasi objek saat dibuat. Konstruktor digunakan untuk mengatur nilai awal atribut. Contohnya, kelas `makanan` memiliki konstruktor untuk menginisialisasi nama dan harga makanan.

```bash
public Makanan(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
}
```

5. **Mutator** Metode mutator (setter) digunakan untuk mengubah nilai atribut suatu objek. Contohnya, dalam kelas `Pesanan`, terdapat metode `setRestoran`, `tambahMakanan`, dan `setKurir` untuk mengatur nilai atribut restaurant, `Makanan`, dan `Kurir`.
```bash
public void setRestoran(Restoran restoran) {
        this.restoran = restoran;
    }
public void setKurir(Kurir kurir) {
        this.kurir = kurir;
    }
public void setOngkosKirim(double ongkosKirim) {
        this.ongkosKirim = ongkosKirim;
    }
```

6. **Accessor**  Metode accessor (getter) digunakan untuk mengambil nilai atribut suatu objek. Contohnya, dalam kelas `Pesanan`, terdapat metode `getRestoran`, `getMakanan`, `getJumlahMakanan`, dan `getKurir` untuk mengambil nilai atribut `restoran`, `makanan`, `JumlahMakanan`, dan `Kurir`.
```bash
public Restoran getRestoran() {
        return restoran;
  }
public Makanan[] getMakanan() {
        return makanan;
    }
public int[] getJumlahMakanan() {
        return jumlahMakanan;
    }

    public Kurir getKurir() {
        return kurir;
    }
```

7. **Encapsulation** Konsep enkapsulasi diimplementasikan dengan menggunakan akses modifier `private` pada atribut kelas dan menyediakan metode getter dan setter untuk mengakses dan mengubah nilai atribut tersebut.
```bash
    private Restoran restoran;
    private Makanan[] makanan;
    private int[] jumlahMakanan;
    private Kurir kurir;
    private double ongkosKirim;
```

8. **Inheritance** Pewarisan diterapkan dalam kelas Motor dan Mobil yang merupakan kelas turunan dari kelas Kendaraan. Keduanya mewarisi atribut dan metode dari kelas Kendaraan.
```bash
class Mobil extends Kendaraan {
    public Mobil() {
        super("Mobil");
 }

class Motor extends Kendaraan {
    public Motor() {
        super("Motor");
    }
```

9. **Polymorphism** Polimorfisme diterapkan dalam kelas `Kendaraan` dengan adanya metode `kirim` yang diimplementasikan secara berbeda dalam kelas turunannya yaitu `Motor` dan `Mobil`.
```bash
public abstract void kirim();
…..
public void kirim() {
        System.out.println("Mengirim dengan mobil");
    }
public void kirim() {
        System.out.println("Mengirim dengan motor");
    }
```

10. **Seleksi** Pada aplikasi ini, seleksi dilakukan dengan menggunakan statement if-else dan switch-case. Misalnya, dalam kelas `Restoran`, digunakan seleksi if-else dalam metode `getMakanan` untuk mengembalikan objek makanan berdasarkan nomor makanan yang dipilih.

```bash
public Makanan getMakanan(int nomorMakanan) throws IllegalArgumentException {
        //mengecek apakah nomor makanan yang dimasukan valid
        if (nomorMakanan < 1 || nomorMakanan > menu.length) {
            throw new IllegalArgumentException("Nomor makanan tidak valid");
        }
        return menu[nomorMakanan - 1];
    }
```

11. **Perulangan** Perulangan digunakan dalam beberapa bagian kode, seperti dalam metode `tampilkanMenu` pada kelas `Restoran` untuk menampilkan menu makanan dalam loop
```bash
for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i].getNama() + " (Rp " + menu[i].getHarga() + ")");
        }
```

12. **Input Output Sederhana** IO Sederhana: Input dan output sederhana dilakukan menggunakan kelas Scanner untuk menerima input dari pengguna dan metode System.out.println untuk menampilkan output.

```bash
System.out.print("Masukkan nomor makanan yang ingin dipesan: ");
            int nomorMakanan = input.nextInt();
            input.nextLine();
System.out.println("Restoran: " + pesanan.getRestoran().getNama());
            System.out.println("Kurir: " + pesanan.getKurir().getNama());
            System.out.println("Kendaraan: " + pesanan.getKurir().getKendaraan().getDeskripsi());
```

13. **Array** Array digunakan dalam beberapa kelas, seperti dalam kelas `Pesanan` untuk menyimpan makanan dan jumlah pesanan dalam array `Makanan` dan `jumlahMakanan`.
```bash
        menu[0] = new Makanan("Burger", 5.0);
        menu[1] = new Makanan("Pizza", 8.0);
        menu[2] = new Makanan("Ayam Goreng", 6.0);
```

14. **Error Handling Penanganan Kesalahan: Penanganan kesalahan dilakukan dengan menggunakan blok `try-catch` untuk menangkap dan menangani kemungkinan error yang terjadi selama runtime.
```bash
try {
       System.out.println("Selamat Datang Di Aplikasi KURAMA(KurirAntarMakanan)");} catch (Exception e) {
    System.out.println("Terjadi kesalahan: " + e.getMessage());
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Muhammad Anshari

NPM: 2110010449

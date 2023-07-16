/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kurama;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class KuramaMain {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Selamat Datang Di Aplikasi KURAMA(KurirAntarMakanan)");
            System.out.println("Pilihan Kurir:");
            System.out.println("1. John (Motorcycle)");
            System.out.println("2. Jane (Car)");
            System.out.print("Pilih kurir (masukkan nomor): ");
            int kurirPilihan = input.nextInt();
            input.nextLine();

            Kurir courier;

            if (kurirPilihan == 1) {
                courier = new Kurir("Wahyu", "0511678943", new Motor());
            } else if (kurirPilihan == 2) {
                courier = new Kurir("Bima", "05112347654", new Mobil());
            } else {
                System.out.println("Pilihan kurir tidak valid");
                return;
            }

            // Menentukan ongkos kirim berdasarkan wilayah
            System.out.print("Masukkan wilayah pengiriman (1. Jakarta, 2. Bandung): ");
            int wilayahPengiriman = input.nextInt();
            input.nextLine();

            double ongkosKirim;

            if (wilayahPengiriman == 1) {
                ongkosKirim = 20000; // Ongkos kirim untuk Jakarta
            } else if (wilayahPengiriman == 2) {
                ongkosKirim = 25000; // Ongkos kirim untuk Bandung
            } else {
                System.out.println("Wilayah pengiriman tidak valid");
                return;
            }

            
            Restoran restoran = new Restoran("Delicious Resto");
            restoran.tampilkanMenu();

            // Meminta input nomor makanan yang akan dipesan
            System.out.print("Masukkan nomor makanan yang ingin dipesan: ");
            int nomorMakanan = input.nextInt();
            input.nextLine();

            // Meminta input jumlah pesanan
            System.out.print("Masukkan jumlah pesanan: ");
            int jumlahPesanan = input.nextInt();
            input.nextLine();

            // Membuat objek pesanan
            Pesanan pesanan = new Pesanan();
            pesanan.setRestoran(restoran);
            pesanan.tambahMakanan(restoran.getMakanan(nomorMakanan), jumlahPesanan);
            pesanan.setKurir(courier);
            pesanan.setOngkosKirim(ongkosKirim); // Menyimpan nilai ongkos kirim ke dalam objek pesanan

            // Menampilkan informasi pesanan
            System.out.println("\nInformasi Pesanan:");
            System.out.println("Restoran: " + pesanan.getRestoran().getNama());
            System.out.println("Kurir: " + pesanan.getKurir().getNama());
            System.out.println("Kendaraan: " + pesanan.getKurir().getKendaraan().getDeskripsi());
            System.out.println("Makanan: " + pesanan.getMakanan()[0].getNama());
            System.out.println("Jumlah: " + pesanan.getJumlahMakanan()[0]);
            System.out.println("Total Harga Makanan: Rp " + pesanan.hitungTotalHargaMakanan());
            System.out.println("Ongkos Kirim: Rp " + pesanan.getOngkosKirim());
            System.out.println("Total Harga: Rp " + pesanan.hitungTotalHarga());
        } catch (Exception e) { //apabila salah memasukan nomor makanan
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }

}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kurama;

/**
 *
 * @author ASUS
 */
class Pesanan {
    private Restoran restoran;
    private Makanan[] makanan;
    private int[] jumlahMakanan;
    private Kurir kurir;
    private double ongkosKirim;

    public Pesanan() {
        makanan = new Makanan[10];
        jumlahMakanan = new int[10];
    }

    public void setRestoran(Restoran restoran) {
        this.restoran = restoran;
    }

    public void tambahMakanan(Makanan makanan, int jumlah) {
        for (int i = 0; i < this.makanan.length; i++) {
            if (this.makanan[i] == null) {
                this.makanan[i] = makanan;
                jumlahMakanan[i] = jumlah;
                break;
            }
        }
    }

    public void setKurir(Kurir kurir) {
        this.kurir = kurir;
    }

    public void setOngkosKirim(double ongkosKirim) {
        this.ongkosKirim = ongkosKirim;
    }

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

    public double getOngkosKirim() {
        return ongkosKirim;
    }

    public double hitungTotalHargaMakanan() {
        double totalHarga = 0.0;
        for (int i = 0; i < makanan.length; i++) {
            if (makanan[i] != null) {
                totalHarga += makanan[i].getHarga() * jumlahMakanan[i];
            }
        }
        return totalHarga;
    }

    public double hitungTotalHarga() {
        double totalHargaMakanan = hitungTotalHargaMakanan();
        return totalHargaMakanan + ongkosKirim;
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kurama;

/**
 *
 * @author ASUS
 */
    class Makanan {
    private String nama;
    private double harga;

    public Makanan(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }
}

class Restoran {
    private String nama;
    private Makanan[] menu;

    public Restoran(String nama) {
        this.nama = nama;
        menu = new Makanan[3];
        menu[0] = new Makanan("Burger", 5.0);
        menu[1] = new Makanan("Pizza", 8.0);
        menu[2] = new Makanan("Ayam Goreng", 6.0);
    }

    public String getNama() {
        return nama;
    }

    public Makanan[] getMenu() {
        return menu;
    }

    public void tampilkanMenu() {
        System.out.println("Menu:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i].getNama() + " (Rp " + menu[i].getHarga() + ")");
        }
    }

    public Makanan getMakanan(int nomorMakanan) throws IllegalArgumentException {
        if (nomorMakanan < 1 || nomorMakanan > menu.length) {
            throw new IllegalArgumentException("Nomor makanan tidak valid");
        }
        return menu[nomorMakanan - 1];
    }
}


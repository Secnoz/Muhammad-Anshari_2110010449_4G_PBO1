/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kurama;

/**
 *
 * @author ASUS
 */
class Kurir {
    private String nama;
    private String email;
    private Kendaraan kendaraan;

    public Kurir(String nama, String email, Kendaraan kendaraan) {
        this.nama = nama;
        this.email = email;
        this.kendaraan = kendaraan;
    }

    public String getNama() {
        return nama;
    }

    public String getEmail() {
        return email;
    }

    public Kendaraan getKendaraan() {
        return kendaraan;
    }
}

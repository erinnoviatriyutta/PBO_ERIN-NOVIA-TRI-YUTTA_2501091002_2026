/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package erin07042026;

/**
 *
 * @author user
 */
public class BukuAlamat {
    private String nama;
    private String alamat;
    private String nomorTelepon;
    private String email;

    // Constructor
    public BukuAlamat(String nama, String alamat, String nomorTelepon, String email) {
        this.nama = nama;
        this.alamat = alamat;
        this.nomorTelepon = nomorTelepon;
        this.email = email;
    }

    // Accessor (Getter)
    public String getNama() { return nama; }
    public String getAlamat() { return alamat; }
    public String getNomorTelepon() { return nomorTelepon; }
    public String getEmail() { return email; }

    // Mutator (Setter)
    public void setNama(String nama) { this.nama = nama; }
    public void setAlamat(String alamat) { this.alamat = alamat; }
    public void setNomorTelepon(String nomorTelepon) { this.nomorTelepon = nomorTelepon; }
    public void setEmail(String email) { this.email = email; }
}

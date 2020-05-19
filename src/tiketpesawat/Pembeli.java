/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiketpesawat;


public class Pembeli {
    public String id_pembeli;
    public String nama_pembeli;
    public int usia;

    public String getId_pembeli() {
        return id_pembeli;
    }

    public String getNama_pembeli() {
        return nama_pembeli;
    }

    public int getUsia() {
        return usia;
    }

    public void setId_pembeli(String id_pembeli) {
        this.id_pembeli = id_pembeli;
    }

    public void setNama_pembeli(String nama_pembeli) {
        this.nama_pembeli = nama_pembeli;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }
}

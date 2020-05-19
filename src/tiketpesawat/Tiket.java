/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiketpesawat;

import java.util.UUID;


public class Tiket {
    public String id_tiket;
    public int jumlah_tiket;
    public int harga_tiket;
    public int total_biaya;
    public int uang_bayar;
    public int uang_kembali;
    
    public Tiket() {
        this.id_tiket = UUID.randomUUID().toString();
    }
    
    public String getId_tiket() {
        return id_tiket;
    }

    public int getJumlah_tiket() {
        return jumlah_tiket;
    }

    public int getHarga_tiket() {
        return harga_tiket;
    }

    public int getTotal_biaya() {
        return total_biaya;
    }

    public int getUang_bayar() {
        return uang_bayar;
    }

    public int getUang_kembali() {
        return uang_kembali;
    }

}

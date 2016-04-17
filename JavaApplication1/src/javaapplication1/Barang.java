/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.Serializable;

/**
 *
 * @author martaniadewi
 */
public class Barang implements Serializable {

    private String namaBarang;
    private int jumlah;
    private String kondisi;
    private String status;
    private long id;

    public Barang(String nama, int jumlah, String kondisi, String status, long id) {
        setnamaBarang(nama);
        setjumlah(jumlah);
        setkondisi(kondisi);
        setstatus(status);
        setId(id);

    }

    public void setnamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public void setjumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public void setkondisi(String kondisi) {
        this.kondisi = kondisi;
    }

    public void setstatus(String status) {
        this.status = status;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public int getJumlah() {
        return jumlah;
    }

    public String getKondisi() {
        return kondisi;
    }

    public String getStatus() {
        return status;
    }

    public long getId() {
        return id;
    }

    public String displayBarang() {
        String tampil = "=========================================== \n"
                + "Nama Barang      : " + getNamaBarang() + "\n"
                + "ID Barang        : " + getId() + "\n"
                + "Status Barang    : " + getStatus() + "\n"
                + "Kondisi Barang   : " + getKondisi() + "\n"
                + "Jumlah Barang    : " + getJumlah() + "\n"
                + "=========================================== \n";
        return tampil;

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author idoarif
 */
public class Anggota extends Orang implements Serializable {

    private ArrayList<Peminjaman> riwayatPinjaman = new ArrayList();
    private Peminjaman p;
    private int nPeminjaman;
    int i = 0;
    String kota;

    public Anggota(String nama, long id, String kota) {
        super(nama, id);
        this.kota = kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public String getKota() {
        return kota;
    }

    public void createPeminjaman(Date tanggal, long id) {
        p = new Peminjaman(tanggal, id);
        riwayatPinjaman.add(p);
        i = this.riwayatPinjaman.size() - 1;

        riwayatPinjaman.get(i).setStatus("sedang meminjam");
    }

    public ArrayList<Peminjaman> getAllPinjaman() {
        return riwayatPinjaman;
    }

    public void KembalikanPinjaman(long id) {
        for (int i = 0; i < this.riwayatPinjaman.size(); i++) {
            if (riwayatPinjaman.get(i).getId() == id) {
                riwayatPinjaman.get(i).setStatus("sudah dikembalikan");
                for (int j = 0; j < riwayatPinjaman.get(i).getnBarang() + 1; j++) {
                    riwayatPinjaman.get(i).getBarangPinjaman(j).setstatus("Tersedia");
                }

            }
        }
    }

    public Peminjaman getPinjaman(int i) {
        return riwayatPinjaman.get(i);
    }

    public void display() {
        System.out.println("Anggota Berhasil Dibuat");
        System.out.println("Nama : "
                + getNama());
        System.out.println("Id  : " + getId());

    }

    public String displayAnggota() {
        String tampil = "================================================================================ \n"
                + "Nama Anggota: " + getNama() + "\n"
                + "ID Anggota  : " + getId() + "\n"
                + "Asal Kota   : " + getKota() + "\n";
        return tampil;
    }
    public String displayAnggotasatu(){
        String tampil ="================================================================================ \n"
                + "Nama Anggota: " + getNama() + "\n"
                + "ID Anggota  : " + getId() + "\n";
        return tampil;
    }
    

    public int getJumlahPinjaman() {
        return this.riwayatPinjaman.size();
    }
}

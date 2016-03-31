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

    public Anggota(String nama, long id) {
        super(nama, id);
    }

    public void createPeminjaman(Date tanggal, long id) {
        p = new Peminjaman(tanggal, id);
        riwayatPinjaman.add(p);
        i = this.riwayatPinjaman.size() - 1;

        riwayatPinjaman.get(i).setStatus("sedang meminjam");
    }

    public void KembalikanPinjaman(long id) {
        for (int i = 0; i < this.riwayatPinjaman.size(); i++) {
            if (riwayatPinjaman.get(i).getId() == id) {
                riwayatPinjaman.get(i).setStatus("sudah dikembalikan");
                for (int j = 0; j < riwayatPinjaman.get(i).getnBarang()+1; j++) {
                    riwayatPinjaman.get(i).getPinjaman(j).setstatus("Tersedia");
                }

            }
        }
    }

    public Peminjaman getPinjaman(int i) {
        return riwayatPinjaman.get(i);
    }

    public void displayPeminjaman() {
        System.out.println("Nama: " + getNama());
        System.out.println("Id  : " + getId());
        for (int i = 0; i < this.riwayatPinjaman.size(); i++) {
            System.out.println("\nPinjaman pada Tanggal: " + riwayatPinjaman.get(i).getTanggal());
            System.out.println("Status Peminjaman: "+riwayatPinjaman.get(i).getStatus());
            System.out.println("Meminjam Barang Berikut: ");
            if (riwayatPinjaman.get(i).getnBarang() != -1) {
                for (int j = 0; j <= riwayatPinjaman.get(i).getnBarang(); j++) {
                    if (j != -1) {
                        System.out.println("Nama Barang: " + riwayatPinjaman.get(i).getPinjaman(j).getNamaBarang() + "\n"
                                + "ID   : " + riwayatPinjaman.get(i).getPinjaman(j).getId() + "\n"
                                + "Jumlah :" + riwayatPinjaman.get(i).getPinjaman(j).getJumlah() + "\n"
                                + "Kondisi: " + riwayatPinjaman.get(i).getPinjaman(j).getKondisi());
                    }
                }

            } else {
                System.out.println("Anda Belum Input Barang");
            }

        }
    }

    public void display() {
        System.out.println("Anggota Berhasil Dibuat");
        System.out.println("Nama : "
                + getNama());
        System.out.println("Id  : " + getId());

    }

    public int getJumlahPinjaman() {
        return this.riwayatPinjaman.size();
    }
}

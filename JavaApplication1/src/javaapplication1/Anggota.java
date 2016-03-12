/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author idoarif
 */
public class Anggota extends Orang {

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
                riwayatPinjaman.get(i).getPinjaman(i).setstatus("Tersedia");
            }

        }

    }

    public Peminjaman getPinjaman(int i) {
        return riwayatPinjaman.get(i);
    }

    public void display() {
        System.out.println("nama: " + getNama());
        System.out.println("id  : " + getId());
        for (int i = 0; i < this.riwayatPinjaman.size(); i++) {
            System.out.println("pinjaman pada tanggal: " + riwayatPinjaman.get(i).getTanggal());
            for (int j = 0; j < riwayatPinjaman.get(i).getnBarang(); j++) {
                System.out.println("nama: " + riwayatPinjaman.get(i).getPinjaman(j).getNamaBarang() + "\n"
                        + "ID  : " + riwayatPinjaman.get(i).getPinjaman(j).getId() + "\n"
                        + "Jumlah :" + riwayatPinjaman.get(i).getPinjaman(j).getJumlah() + "\n"
                        + "Kondisi: " + riwayatPinjaman.get(i).getPinjaman(j).getKondisi());

            }

        }
    }

    public int getJumlahPinjaman() {
        return this.riwayatPinjaman.size();
    }
}

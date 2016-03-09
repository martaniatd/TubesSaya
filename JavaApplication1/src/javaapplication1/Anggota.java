/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Date;

/**
 *
 * @author idoarif
 */
public class Anggota extends Orang {
    private ArrayList<Peminjaman> riwayatPinjaman = new ArrayList();
    private Peminjaman p;
    private int nPeminjaman;
    int i=0;
    
    public Anggota (String nama,long id){
        super(nama,id);
    }
    public void createPeminjaman (Date tanggal){
        p = new Peminjaman(tanggal);
        riwayatPinjaman.add(p);
        i=this.riwayatPinjaman.size();
        riwayatPinjaman.get(i).setStatus("sedang meminjam");
    }
    public void KembalikanPinjaman (int i){
        riwayatPinjaman.get(i).setStatus("sudah dikembalikan");
        riwayatPinjaman.remove(i);
    }
    public void displayPinjaman (){
        for (int i=0;i<this.riwayatPinjaman.size();i++){
            System.out.println("pinjaman pada tanggal: "+riwayatPinjaman.get(i).getTanggal());
            riwayatPinjaman.get(i).displayBarang();
        }
    }
}

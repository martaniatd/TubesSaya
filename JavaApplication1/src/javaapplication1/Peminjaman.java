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
 * @author martaniadewi
 */
public class Peminjaman
{
    private ArrayList<Barang> pinjaman;
    private String status;
    private int nBarang;
    private Date tanggal;
    public Peminjaman(Date tanggal)
    {
        this.tanggal=tanggal;
        pinjaman=new ArrayList();
    }
    public void addPinjaman(Barang b)
    {
        nBarang=this.pinjaman.size();
        pinjaman.add(b);
        pinjaman.get(nBarang).setstatus("Terpinjam");
    }
    public void deletePinjaman(long id)
    {
        for(int i=0;i<10;i++)
        {
            if(pinjaman.get(i).getId()==id)
            {
                pinjaman.get(i).setstatus("tersedia");
                pinjaman.remove(i);
            }
        }
    }
    public void displayBarang(){
        for (int i=0;i<nBarang;i++){
            System.out.println("Nama Barang : "+pinjaman.get(i).getNamaBarang());
            System.out.println("ID Barang   : "+pinjaman.get(i).getId());
            System.out.println("Status Barang   : "+pinjaman.get(i).getStatus());
            System.out.println("Kondisi Barang  :"+pinjaman.get(i).getKondisi());
            
        }
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getnBarang() {
        return nBarang;
    }

    public void setnBarang(int nBarang) {
        this.nBarang = nBarang;
    }

    public Barang getPinjaman(int i) {
        return pinjaman.get(i);
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }    
}

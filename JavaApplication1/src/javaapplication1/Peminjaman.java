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
    private ArrayList<Barang> pinjaman = new ArrayList();
    private String status;
    private long id;
    private int nBarang;
    private Date tanggal;
    public Peminjaman(Date tanggal,long id)
    {
        this.tanggal=tanggal;
        this.id = id;
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
        for(int i=0;i<this.pinjaman.size();i++)
        {
            if(pinjaman.get(i).getId()==id)
            {
                pinjaman.get(i).setstatus("tersedia");
                pinjaman.remove(i);
            }
        }
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getnBarang() {
        return nBarang+1;
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
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}

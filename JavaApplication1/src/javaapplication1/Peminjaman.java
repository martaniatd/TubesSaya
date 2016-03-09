/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author martaniadewi
 */
public class Peminjaman extends Barang
{
    private Barang[] pinjaman;
    private String status;
    private int nBarang;
    private date tanggal;
    public Peminjaman(String status,int nBarang,date tanggal)
    {
        this.status=status;
        this.nBarang=nBarang;
        this.tanggal=tanggal;
        pinjaman=new Barang[10];
    }
    p
    
}

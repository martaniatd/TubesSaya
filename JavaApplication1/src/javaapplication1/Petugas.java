/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;

/**
 *
 * @author martaniadewi
 */
public class Petugas extends Orang{
    private ArrayList<Anggota> dataAnggota=new ArrayList();
    public Petugas (String nama, long id)
    {
        super(nama,id);
    }
    public void addAnggota(Anggota a){
        dataAnggota.add(a);
    }
    public void deleteAnggota(long id){
        for (int i=0;i<this.dataAnggota.size();i++){
            if (dataAnggota.get(i).getId()==id){
                dataAnggota.remove(i);
            }
            else{
                System.out.println("maaf data tidak ditemukan");
                
            }
        }
    }
    public void EditAnggota(String nama,long id){
        for (int i=0;i<this.dataAnggota.size();i++){
            if (dataAnggota.get(i).getId()==id){
                dataAnggota.get(i).setNama(nama);
            }
            else{
                System.out.println("maaf data tidak ditemukan");
            }
        }
    }
    
    
}

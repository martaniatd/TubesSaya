/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Date;
/**
 *
 * @author martaniadewi
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Anggota a = new Anggota ("marta",1234);
        Petugas b = new Petugas ("Acong",324928);
        Barang c = new Barang ("mobil",3,"bagus","tersedia",1);
        Barang c2 = new Barang ("motor",3,"bagus","tersedia",2);
        Barang c3 = new Barang ("panci",4,"rusak","tersedia",3);
        Date d = new Date();
        b.addAnggota(a);
        a.createPeminjaman(d,1);
        a.createPeminjaman(d,2);
        a.getPinjaman(0).addPinjaman(c);
        a.getPinjaman(0).addPinjaman(c2);
        a.getPinjaman(1).addPinjaman(c3);
        //c.displayBarang();
        //b.display();
        a.display();
        //b.EditAnggota("Sudah mengembalikan",1234,1);
        //.display();
        //a.display();
        //.displayBarang();
        
    }    
}
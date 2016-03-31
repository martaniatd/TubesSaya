/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author martaniadewi
 */
public class Konsol {

    private ArrayList<Petugas> daftarPetugas = new ArrayList();
    private ArrayList<Anggota> daftarAnggota = new ArrayList();
    private ArrayList<Barang> daftarBarang = new ArrayList();
    Scanner in = new Scanner(System.in);
    Petugas p;
    Anggota a;
    Peminjaman q;
    Date date = new Date();
    String nama;
    long id;

    public void addPetugas(Petugas p) {
        daftarPetugas.add(p);
    }
    public void SavePetugas (ArrayList<Petugas> p){
        try {
            FileOutputStream fos = new FileOutputStream("Petugas.txt");
            ObjectOutputStream os = new ObjectOutputStream(fos);
            os.writeObject(p);
            os.flush();
        }
        catch (IOException e){
            System.out.println("data tidak ditemukan");
        }
    }
    
    public void LoadPetugas (ArrayList<Petugas> p){
        try {
            FileInputStream fis = new FileInputStream("Petugas.txt");
            ObjectInputStream ois = new ObjectInputStream (fis);
            while ((p = (ArrayList<Petugas>)ois.readObject())!=null){
                System.out.println("data berhasil di load");
            }
        }
        catch (ClassNotFoundException e){
            System.out.println("data error");
        }
        catch (IOException e){
            System.out.println("data tidak ditemukan");
        }
    }

    public Petugas getPetugas(long id) {
        int t = 0;
        for (int i = 0; i < this.daftarPetugas.size(); i++) {
            if (daftarPetugas.get(i).getId() == id) {
                t = i;
            }
        }
        return daftarPetugas.get(t);
    }

    public void deletePetugas(long id) {
        for (int i = 0; i < this.daftarPetugas.size(); i++) {
            if (daftarPetugas.get(i).getId() == id) {
                daftarPetugas.remove(i);
            }
            
        }
    }

    public void addAnggota(Anggota x) {
        daftarAnggota.add(x);
    }

    public Anggota getAnggota(long id) {
        int t = 0;
        for (int i = 0; i < this.daftarAnggota.size(); i++) {
            if (daftarAnggota.get(i).getId() == id) {
                t = i;
            }
        }
        return daftarAnggota.get(t);
    }

    public void deleteAnggota(long id) {
        for (int i = 0; i < this.daftarAnggota.size(); i++) {
            if (daftarAnggota.get(i).getId() == id) {
                daftarAnggota.remove(i);
                System.out.println("Anggota dengan ID Anggota : "+id+"\nBerhasil Dihapus");
            }
        }
    }

    public void Ngembaliin(long id, long idPinjaman) {
        for (int i = 0; i < this.daftarAnggota.size(); i++) {
            if (daftarAnggota.get(i).getId() == id) {
                daftarAnggota.get(i).KembalikanPinjaman(idPinjaman);
                System.out.println("Barang Berhasil Dikembalikan");
            }
        }
    }

    public void addBarang(Barang a) {
        daftarBarang.add(a);
    }

    public Barang getBarang(long id) {
        int t = 0;
        for (int i = 0; i < this.daftarBarang.size(); i++) {
            if (daftarBarang.get(i).getId() == id) {
                t = i;
            }
        }
        return daftarBarang.get(t);
    }

    public int getJumlahBarang() {
        return this.daftarBarang.size();
    }

    public void displayPetugas() {
        for (int i = 0; i < this.daftarPetugas.size(); i++) {
            daftarPetugas.get(i).display();
        }
    }

    public void displayAnggota() {
        for (int i = 0; i < this.daftarAnggota.size(); i++) {
            daftarAnggota.get(i).display();
        }
    }

    public void displayBarang() {
        for (int i = 0; i < this.daftarBarang.size(); i++) {
            daftarBarang.get(i).displayBarang();
        }
    }

    public void displayPeminjaman(int i) {
        daftarAnggota.get(i).displayPeminjaman();
    }

    public void menuSatu() {
        System.out.print("Nama Petugas  : ");
        in.nextLine();
        nama = in.next();
        System.out.print("ID Petugas    : ");
        id = in.nextLong();
        Petugas p = new Petugas(nama, id);
        addPetugas(p);
        
        System.out.println("Petugas Berhasil Login!");
        SavePetugas(daftarPetugas);
    }
    public void menuSebelas(){
        System.out.println("Data Petugas");
        displayPetugas();
    }

    public void menuDua() {
        System.out.print("Nama Anggota  : ");
        in.nextLine();
        nama = in.nextLine();
        System.out.print("Id Anggota    : ");
        id = in.nextLong();
        Anggota a = new Anggota(nama, id);
        addAnggota(a);
        displayAnggota();
    }

    public void menuTiga() {
        System.out.print("Nama Barang   : ");
        in.nextLine();
        String nama = in.next();
        System.out.print("Jumlah Barang : ");
        int jumlah = in.nextInt();
        System.out.print("Kondisi Barang: ");
        String kondisi = in.next();
        System.out.print("Status Barang : ");
        String status = in.next();
        System.out.print("ID Barang : ");
        long id = in.nextLong();
        Barang b = new Barang(nama, jumlah, kondisi, status, id);
        addBarang(b);
        System.out.println("Barang Berhasil Ditambahkan!");
        System.out.println("Data Barang  ");
    }

    public void menuEmpat() {
        System.out.print("ID Anggota : ");
        long id = in.nextLong();
        deleteAnggota(id);
    }

    public void menuLima() {
        System.out.print("Masukkan ID Anggota:");
        long id = in.nextLong();
        System.out.print("Masukkan ID Peminjaman:");
        long idPeminjaman = in.nextLong();
        Ngembaliin(id, idPeminjaman);
    }

    public void menuEnam() {
        int t = 0;
        System.out.println("Tanggal : " + date);
        System.out.print("ID Anggota : ");
        long idAnggota = in.nextLong();
        System.out.print("ID Peminjaman : ");
        id = in.nextLong();
        for (int i = 0; i < this.daftarAnggota.size(); i++) {
            if (daftarAnggota.get(i).getId() == idAnggota) {
                daftarAnggota.get(i).createPeminjaman(date, id);
                System.out.println("Data Berhasil Dibuat ! ");
            }
        }
    }

    public void menuTujuh() {
        System.out.print("Masukkan ID Anggota: ");
        long idAnggota = in.nextLong();
        System.out.print("Masukkan ID Peminjaman: ");
        long idPeminjaman = in.nextLong();
        System.out.print("Masukkan ID Barang : ");
        long idBarang = in.nextLong();
        int count = 0;
        for (int i = 0; i < this.daftarAnggota.size(); i++) {
            if (daftarAnggota.get(i).getId() == idAnggota) {
                for (int j = 0; j < daftarAnggota.get(i).getJumlahPinjaman(); j++) {
                    if (daftarAnggota.get(i).getPinjaman(j).getId() == idPeminjaman) {
                        for (int k = 0; k < this.daftarBarang.size(); k++) {
                            if (daftarBarang.get(k).getId() == idBarang) {
                                daftarAnggota.get(i).getPinjaman(j).addPinjaman(daftarBarang.get(k));
                            }
                        }
                    }
                }
            } else {
                count++;
            }
        }
        if (count == this.daftarAnggota.size()) {
            System.out.println("Data Anggota Tidak Ditemukan");
        }
    }

    public void menuDelapan() {
        System.out.print("ID Anggota : ");
        long idAnggota = in.nextLong();
        System.out.print("ID Peminjaman: ");
        id = in.nextLong();
        for (int i = 0; i < this.daftarAnggota.size(); i++) {
            if (daftarAnggota.get(i).getId() == idAnggota) {
                displayPeminjaman(i);
            }
        }
    }

    public void menuSembilan() {
        System.out.print("ID Anggota : ");
        long idAnggota = in.nextLong();
        System.out.print("ID Peminjaman : ");
        id = in.nextLong();
        Ngembaliin(idAnggota, id);
    }

    public void mainMenu() {
        int pilihan;
        System.out.println("==============================================");
        System.out.println("Sistem Informasi Pengelolaan Peminjaman Barang");
        System.out.println("==============================================");
        System.out.println("Main Menu");
        System.out.println("\n1. Add Petugas ");
        System.out.println("2. Tampil Data Petugas");
        System.out.println("3. Add Anggota");
        System.out.println("4. Add Barang");
        System.out.println("5. Add Barang ke Toko");
        System.out.println("6. Delete Anggota");
        System.out.println("7. Kembalikan Barang");
        System.out.println("8. Membuat Laporan Peminjaman");
        System.out.println("9. Menambahkan Barang Pinjaman");
        System.out.println("10. Display Riwayat Peminjaman dan Daftar Barang");
        System.out.println("11. Kembalikan barang Pinjaman");
        System.out.println("0. Exit!");
        do {
            System.out.println("===============================");
            System.out.print("Masukkan Pilihan Anda : ");
            pilihan = in.nextInt();
            System.out.println("===============================");
            switch (pilihan) {
                case 1:
                    System.out.println("Add Petugas");
                    menuSatu();
                    break;
                case 2:
                    menuSebelas();
                    break;
                case 3:
                    System.out.println("Add Anggota");
                    menuDua();                    
                    break;
                case 4:
                    System.out.println("Add Barang");    
                    menuTiga();
                    break;
                case 5:
                    System.out.println("Delete Anggota");
                    menuEmpat();
                    break;
                case 6:
                    System.out.println("Kembalikan Barang");
                    menuLima();
                    break;
                case 7:
                    System.out.println("Membuat Laporan Peminjaman");
                    menuEnam();
                    break;
                case 8:
                    System.out.println("Menambahkan Barang Pinjaman");
                    menuTujuh();
                    break;
                case 9:
                    System.out.println("Display Riwayat Peminjaman dan Daftar Barang");
                    menuDelapan();
                    break;
                case 10:
                    System.out.println("Kembalikan barang Pinjaman");
                    menuSembilan();
                    break;
                case 11:
                    System.out.println("Display Barang yang Ada di Toko");
                    displayBarang();
            }
        } while (pilihan != 0);
    }
}
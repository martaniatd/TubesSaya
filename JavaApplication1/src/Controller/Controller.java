/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.BarangAtauAnggota;
import View.DataBarang;
import View.Home;
import View.NewFrame;
import View.LoginPetugas;
import View.LoginAnggota;
import View.ListBarang;
import View.ListAnggota;
import View.ListBarangPetugas;
import View.SignUpPetugas;
import View.question;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaapplication1.Anggota;
import javaapplication1.Barang;
import javaapplication1.Petugas;
import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import oracle.jrockit.jfr.JFR;

/**
 *
 * @author idoarif
 */
public class Controller implements ActionListener {

    private NewFrame nf = new NewFrame();
    private LoginAnggota la = new LoginAnggota();
    private LoginPetugas lp = new LoginPetugas();
    private ListBarang listB = new ListBarang();
    private ListAnggota listA = new ListAnggota();
    private Home home = new Home();
    private SignUpPetugas suPetugas = new SignUpPetugas();
    private question q = new question();
    private Date d;
    private BarangAtauAnggota BA = new BarangAtauAnggota();
    private DataBarang DB = new DataBarang();
    private ListBarangPetugas LBP = new ListBarangPetugas();
    Konsol k = new Konsol();

    public Controller() {
        home.listener(this);
        home.setVisible(true);
        suPetugas.listener(this);
        nf.listener(this);
        la.listener(this);
        lp.listener(this);
        listB.listener(this);
        listA.listener(this);
        q.listener(this);
        BA.listener(this);
        DB.listener(this);
        LBP.listener(this);
    }

    public void LoginPetugas() {
        String username = lp.getKetikNamaPetugas().getText();
        long id = Long.parseLong(lp.getKetikIdPetugas().getText());
        boolean x = false;
        for (int i = 0; i < k.getJumlahPetugas(); i++) {
            if (id == k.getAllPetugas().get(i).getId() && username.equals(k.getAllPetugas().get(i).getNama())) {
                x = true;
            }
        }
        if (x == true) {
            BA.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(lp, "Username & ID Salah!");
            lp.getKetikNamaPetugas().setText("");
            lp.getKetikIdPetugas().setText("");
        }
    }

    public void SignUpPetugas() {
        try {
            String nama = suPetugas.getTextFieldNamaPetugasTambah().getText();
            long id = Long.parseLong(suPetugas.getTextFieldIdPetugasTambah().getText());
            Petugas p = new Petugas(nama, id);
            boolean x = false;
            for (int i = 0; i < k.getJumlahPetugas(); i++) {
                if (k.getAllPetugas().get(i).getId() == id) {
                    x = true;
                }
            }
            if (x == false) {
                k.addPetugas(p);
                JOptionPane.showMessageDialog(suPetugas, "Petugas Berhasil Sign Up!");
                suPetugas.setVisible(false);
                home.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(suPetugas, "ID Petugas sudah ada!");
            }
            k.SavePetugas(k.getAllPetugas());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(home, "Terjadi error");
        }

    }

    public void LoginAnggota() {
        boolean x = false;
        String username = la.getTextFieldNamaAnggota().getText();
        long Id = Long.parseLong(la.getTextFieldIdAnggota().getText());
        for (int i = 0; i < k.getJumlahAnggota(); i++) {
            if (Id == k.getAllAnggota().get(i).getId() && username.equals(k.getAllAnggota().get(i).getNama())) {
                la.setVisible(false);
                listB.setVisible(true);
                x = true;
            }
        }
        if (x == false) {
            JOptionPane.showMessageDialog(la, "ID dan nama Anggota Salah!");
        }
    }

    public void EditAnggota() {
        boolean x = false;
        String Nama = listA.getTextFieldEditNamaAnggota().getText();
        long id = Long.parseLong(listA.getTextFieldEditIDAnggota().getText());
        String kota = listA.getTextFieldEditKotaAnggota().getText();
        for (int i = 0; i < k.getJumlahAnggota(); i++) {
            if (k.getAllAnggota().get(i).getId() == id) {
                x = true;
            }
        }
        if (x == true) {
            try {
                k.getAnggota(id).setNama(Nama);
                k.getAnggota(id).setKota(kota);
                JOptionPane.showMessageDialog(listA, "Data berhasil terupdate");
                listA.getTextFieldEditIDAnggota().setText("");
                listA.getTextFieldEditKotaAnggota().setText("");
                listA.getTextFieldEditNamaAnggota().setText("");
                k.SaveAnggota(k.getAllAnggota());
            } catch (Exception ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(listA, "ID Anggota tidak ditemukan!");
            listA.getTextFieldEditIDAnggota().setText("");
            listA.getTextFieldEditKotaAnggota().setText("");
            listA.getTextFieldEditNamaAnggota().setText("");
        }
    }

    public void AddAnggota() {
        try {
            boolean x = false;
            String Nama = listA.getTextFieldNamaAnggotaTambah().getText();
            long id = Long.parseLong(listA.getTextFieldIdAnggotaTambah().getText());
            String kota = listA.getTextFieldKotaTambah().getText();
            for (int i = 0; i < k.getJumlahAnggota(); i++) {
                if (k.getAllAnggota().get(i).getId() == id) {
                    x = true;
                }
            }
            if (x == true) {
                JOptionPane.showMessageDialog(listA, "ID Anggota sudah ada!");
                listA.getTextFieldIdAnggotaTambah().setText("");
                listA.getTextFieldNamaAnggotaTambah().setText("");
                listA.getTextFieldKotaTambah().setText("");
            } else {
                k.addAnggota(new Anggota(Nama, id, kota));
                k.SaveAnggota(k.getAllAnggota());
                JOptionPane.showMessageDialog(listA, "Data berhasil dibuat");
                listA.getTextFieldIdAnggotaTambah().setText("");
                listA.getTextFieldNamaAnggotaTambah().setText("");
                listA.getTextFieldKotaTambah().setText("");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(nf, "Terjadi Error");
        }

    }

    public void ViewAnggota() {
        listA.getTampilListAnggota().setText("");
        for (int i = 0; i < k.getJumlahAnggota(); i++) {
            listA.getTampilListAnggota().append(k.getAllAnggota().get(i).displayAnggota() + "\n");
            for (int j = 0; j < k.getAllAnggota().get(i).getJumlahPinjaman(); j++) {
                listA.getTampilListAnggota().append(k.getAllAnggota().get(i).getAllPinjaman().get(j).displayPinjaman());
                for (int m = 0; m < k.getAllAnggota().get(i).getPinjaman(j).getnBarang(); m++) {
                    listA.getTampilListAnggota().append(k.getAllAnggota().get(i).getPinjaman(j).getBarangPinjaman(m).displayBarang());
                }
            }
        }
    }

    public void ViewBarangPetugas() {
        LBP.getTampilListBarang().setText("");
        for (int i = 0; i < k.getJumlahBarang(); i++) {
            LBP.getTampilListBarang().append(k.getAllBarang().get(i).displayBarang() + "\n");
        }
    }

    public void ViewBarang() {
        listB.getTextAreaTampilBarang().setText("");
        for (int i = 0; i < k.getJumlahBarang(); i++) {
            listB.getTextAreaTampilBarang().append(k.getAllBarang().get(i).displayBarang() + "\n");
        }
    }

    public void ViewBarangSuatuAnggota() {
        listB.getTextAreaTampilBarang().setText("");
        long Id = Long.parseLong(la.getTextFieldIdAnggota().getText());
        for (int i = 0; i < k.getAnggota(Id).getJumlahPinjaman(); i++) {
            for (int j = 0; j < k.getAnggota(Id).getPinjaman(i).getnBarang(); j++) {
                listB.getTextAreaTampilBarang().append(
                        k.getAnggota(Id).getPinjaman(i).
                        getBarangPinjaman(j).displayBarang() + "\n");
            }
        }

    }

    public void SearchAnggota() {
        boolean x = false;
        long id = Long.parseLong(listA.getTextFieldCarId().getText());
        for (int i = 0; i < k.getJumlahAnggota(); i++) {
            if (k.getAllAnggota().get(i).getId() == id) {
                listA.getTampilListAnggota().setText("");
                listA.getTampilListAnggota().append(k.getAnggota(id).displayAnggota());
                for (int j = 0; j < k.getAllAnggota().get(i).getJumlahPinjaman(); j++) {
                    listA.getTampilListAnggota().append(k.getAllAnggota().get(i).getAllPinjaman().get(j).displayPinjaman());
                    for (int m = 0; m < k.getAllAnggota().get(i).getPinjaman(j).getnBarang(); m++) {
                        listA.getTampilListAnggota().append(k.getAllAnggota().get(i).getPinjaman(j).getBarangPinjaman(m).displayBarang());
                    }
                }
                x = true;
            }
        }
        if (x == false) {
            JOptionPane.showMessageDialog(listA, "ID Anggota tidak ditemukan!");
            listA.getTextFieldCarId().setText("");
        } else {
            q.setVisible(true);
        }
    }

    public void SearchBarang() {
        boolean cantik = false;
        long id = Long.parseLong(LBP.getTextFieldCarId().getText());
        for (int c = 0; c < k.getJumlahBarang(); c++) {
            if (k.getAllBarang().get(c).getId() == id) {
                LBP.getTampilListBarang().setText("");
                LBP.getTampilListBarang().setText("Data Barang yang Dicari\n");
                LBP.getTampilListBarang().append(k.getBarang(id).displayBarang());
                cantik = true;
            }
        }
        if (cantik == false) {
            JOptionPane.showMessageDialog(LBP, "ID Barang Tidak Ditemukan!");
            LBP.getTextFieldCarId().setText("");
        }
    }

    public void searchBarangDiAnggota() {
        boolean cantik = false;
        long id = Long.parseLong(listB.getTextFieldCarId().getText());
        for (int c = 0; c < k.getJumlahBarang(); c++) {
            if (k.getAllBarang().get(c).getId() == id) {
                listB.getTextAreaTampilBarang().setText("");
                listB.getTextAreaTampilBarang().setText("Data Barang yang Dicari\n");
                listB.getTextAreaTampilBarang().append(k.getBarang(id).displayBarang());
                cantik = true;
            }
        }
        if (cantik == false) {
            JOptionPane.showMessageDialog(listB, "ID Barang Tidak Ditemukan!");
            LBP.getTextFieldCarId().setText("");
        }
    }

    public void DeleteAnggota() {
        long id = Long.parseLong(listA.getTextFieldCarId().getText());
        for (int i = 0; i < k.getJumlahAnggota(); i++) {
            if (k.getAllAnggota().get(i).getId() == id) {
                try {
                    k.getAllAnggota().remove(i);
                    k.SaveAnggota(k.getAllAnggota());
                } catch (Exception ex) {
                    Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public void AddBarang() {
        try {
            boolean x = false;
            String Nama = DB.getTextFiledNamaBarang().getText();
            long id = Long.parseLong(DB.getTextFieldIdBarang().getText());
            String kondisi = DB.getTextFieldKondisiBarang().getText();
            String status = DB.getTextFieldStatusBarang().getText();
            int jumlah = Integer.parseInt(DB.getTextFieldJumlahBarang().getText());
            for (int i = 0; i < k.getJumlahBarang(); i++) {
                if (k.getAllBarang().get(i).getId() == id) {
                    x = true;
                }
            }
            if (x == true) {
                JOptionPane.showMessageDialog(DB, "ID Barang sudah ada!");
                DB.getTextFieldIdBarang().setText("");
                DB.getTextFieldJumlahBarang().setText("");
                DB.getTextFieldKondisiBarang().setText("");
                DB.getTextFieldStatusBarang().setText("");
                DB.getTextFiledNamaBarang().setText("");
            } else {
                k.addBarang(new Barang(Nama, jumlah, kondisi, status, id));
                DB.getTextFieldIdBarang().setText("");
                DB.getTextFieldJumlahBarang().setText("");
                DB.getTextFieldKondisiBarang().setText("");
                DB.getTextFieldStatusBarang().setText("");
                DB.getTextFiledNamaBarang().setText("");
                k.SaveBarang(k.getAllBarang());
                JOptionPane.showMessageDialog(DB, "Data Barang Berhasil Dibuat!\n"
                        + "Nama Barang : " + Nama
                        + "\nID Barang : " + id
                        + "\nKondisi : " + kondisi
                        + "\nKetersediaan Barang : " + status
                        + "\nJumlah Barang : " + jumlah);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(nf, "Terjadi Error");
        }

    }

    public void DeleteBarang() {
        long id = Long.parseLong(LBP.getTextFieldCarId().getText());
        if (LBP.getTextFieldCarId().getText().equals("")) {
            JOptionPane.showMessageDialog(LBP, "Tidak ada data yang ingin dihapus");
        }
        for (int i = 0; i < k.getJumlahBarang(); i++) {
            if (k.getAllBarang().get(i).getId() == id) {
                k.getAllBarang().remove(i);
            }
        }
    }

    public void CreatePeminjaman() {
        d = new Date();
        long id = Long.parseLong(listA.getTextFieldIdPelanggan().getText());
        long idPinjam = Long.parseLong(listA.getTextFieldIdPeminjaman().getText());
        boolean x = false;
        for (int i = 0; i < k.getJumlahAnggota(); i++) {
            if (k.getAllAnggota().get(i).getId() == id) {
                try {
                    listA.getTextFieldIdPelanggan().setText("");
                    listA.getTextFieldIdPeminjaman().setText("");
                    k.getAllAnggota().get(i).createPeminjaman(d, idPinjam);
                    k.SaveAnggota(k.getAllAnggota());
                    JOptionPane.showMessageDialog(listA, "Data berhasil buat!");
                    x = true;
                    break;
                } catch (Exception ex) {
                    Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        if (x == false) {
            JOptionPane.showMessageDialog(listA, "ID Anggota tidak ditemukan!");
            listA.getTextFieldIdPelanggan().setText("");
            listA.getTextFieldIdPeminjaman().setText("");
        }
    }

    public void addBarangKePinjaman() {
        long idAnggota = Long.parseLong(listB.getTextFieldIdAnggota().getText());
        long idPinjam = Long.parseLong(listB.getTextFieldIdPinjam().getText());
        long idBarang = Long.parseLong(listB.getTextFieldIdBarang().getText());
        boolean x = false, y = false, z = false, a = false;
        int anggota = 0, pinjaman = 0;
        for (int i = 0; i < k.getJumlahAnggota(); i++) {
            if (k.getAllAnggota().get(i).getId() == idAnggota) {
                x = true;
                for (int j = 0; j < k.getAllAnggota().get(i).getJumlahPinjaman(); j++) {
                    if (k.getAllAnggota().get(i).getPinjaman(j).getId() == idPinjam) {
                        y = true;
                        for (int l = 0; l < k.getJumlahBarang(); l++) {
                            if (k.getAllBarang().get(l).getId() == idBarang) {
                                z = true;
                                anggota = i;
                                pinjaman = j;
                                if (k.getAllBarang().get(l).getStatus().equals("Terpinjam")) {
                                    a = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (x == false) {
            JOptionPane.showMessageDialog(listB, "ID Anggota tidak ditemukan!");
        }
        if (y == false) {
            JOptionPane.showMessageDialog(listB, "ID Pinjaman Tidak Ditemukan!");
        }
        if (z == false) {
            JOptionPane.showMessageDialog(listB, "ID Barang Tidak Ditemukan!");
        }
        if (a == true) {
            JOptionPane.showMessageDialog(listB, "Barang Sedang Terpinjam");
        }
        if (z == true && y == true && x == true && a == false) {
            try {
                k.getAllAnggota().get(anggota).getPinjaman(pinjaman).addPinjaman(k.getBarang(idBarang));
                k.SaveAnggota(k.getAllAnggota());
                k.SaveBarang(k.getAllBarang());
                JOptionPane.showMessageDialog(listB, "Data Peminjaman Barang Berhasil Dibuat");
            } catch (Exception ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void kembalikanBarangAnggota() {
        long idAnggota = Long.parseLong(listB.getTextFieldIdAnggota().getText());
        long idPinjam = Long.parseLong(listB.getTextFieldIdPinjam().getText());
        long idBarang = Long.parseLong(listB.getTextFieldIdBarang().getText());
        boolean x = false, y = false, z = false, a = false;
        int anggota = 0, pinjaman = 0, barang = 0;
        for (int i = 0; i < k.getAnggota(idAnggota).getJumlahPinjaman(); i++) {
            if (k.getAnggota(idAnggota).getPinjaman(i).getId() == idPinjam) {
                x = true;
                pinjaman = i;
                for (int j = 0; j < k.getAnggota(idAnggota).getPinjaman(i).getnBarang(); j++) {
                    if (k.getAnggota(idAnggota).getPinjaman(i).getBarangPinjaman(j).getId() == idBarang) {
                        y = true;
                        barang = j;
                        if (k.getBarang(idBarang).getStatus().equals("Tersedia")) {
                            z = true;
                        }
                    }
                }
            }
        }
        if (x == true && y == true && z == false) {
            try {
                k.getBarang(idBarang).setstatus("Tersedia");
                k.getAnggota(idAnggota).getPinjaman(pinjaman).getBarangPinjaman().remove(barang);
                k.SaveAnggota(k.getAllAnggota());
                k.SaveBarang(k.getAllBarang());
                JOptionPane.showMessageDialog(listB, "Barang Berhasil Dikembalikan");
            } catch (Exception ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (x == false) {
            JOptionPane.showMessageDialog(listB, "ID Anggota Tidak Ditemukan");
        }
        if (y == false) {
            JOptionPane.showMessageDialog(listB, "ID Peminjaman Tidak Ditemukan");
        }
        if (z == true) {
            JOptionPane.showMessageDialog(listB, "Anda Tidak Meminjam Barang Tersebut");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //frame Home
        if (e.getSource().equals(home.getButtonLogin())) {
            home.setVisible(false);
            nf.setVisible(true);
        } else if (e.getSource().equals(home.getButtonSignup())) {
            home.setVisible(false);
            suPetugas.setVisible(true);
        } //frame new frame
        else if (e.getSource().equals(nf.getButtonPetugas())) {
            nf.setVisible(false);
            lp.setVisible(true);
        } else if (e.getSource().equals(nf.getButtonBackLogin())) {
            nf.setVisible(false);
            home.setVisible(true);
        } else if (e.getSource().equals(nf.getButtonAnggota())) {
            nf.setVisible(false);
            la.setVisible(true);
            //frame login petugas
        } else if (e.getSource().equals(lp.getButtonBack())) {
            lp.setVisible(false);
            nf.setVisible(true);
        } else if (e.getSource().equals(lp.getButtonLoginPetugas())) {
            LoginPetugas();
        } // frame SignUpPetugas
        else if (e.getSource().equals(suPetugas.getButtonSignUp())) {
            SignUpPetugas();
        } else if (e.getSource().equals(suPetugas.getButtonBack())) {
            suPetugas.setVisible(false);
            home.setVisible(true);
        } // frame login Anggota 
        else if (e.getSource().equals(la.getButtonBack())) {
            la.setVisible(false);
            nf.setVisible(true);
        } else if (e.getSource().equals(la.getButtonLoginAnggota())) {
            LoginAnggota();
            //frame list Anggota
        } else if (e.getSource().equals(listA.getButtonSelesai())) { //buat edit data anggota
            EditAnggota();
        } else if (e.getSource().equals(listA.getButtonKeluar())) {
            listA.setVisible(false);
            nf.setVisible(true);
        } else if (e.getSource().equals(listA.getButtonSave())) { //buat add anggota
            AddAnggota();
        } else if (e.getSource().equals(listA.getButtonRefresh())) { //buat nampilin data anggota
            ViewAnggota();
        } else if (e.getSource().equals(listA.getButtonCari())) { // buat nyari anggota
            SearchAnggota();
        } else if (e.getSource().equals(listA.getButtonBack())) {
            listA.setVisible(false);
            nf.setVisible(true);
        } else if (e.getSource().equals(listA.getButtonBack1())) {
            listA.setVisible(false);
            nf.setVisible(true);
        } else if (e.getSource().equals(listA.getButtonBack2())) {
            listA.setVisible(false);
            nf.setVisible(true);
        } else if (e.getSource().equals(listA.getButtonSelesaiCreate())) {
            CreatePeminjaman();
            //frame list barang di anggota
        } else if (e.getSource().equals(listB.getButtonBack())) {
            try {
                listB.setVisible(false);
                la.setVisible(true);
                k.SaveAnggota(k.getAllAnggota());
                k.SaveBarang(k.getAllBarang());
            } catch (Exception ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (e.getSource().equals(listB.getButtonRefresh())) {
            try {
                ViewBarang();
                k.SaveAnggota(k.getAllAnggota());
                k.SaveBarang(k.getAllBarang());
            } catch (Exception ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (e.getSource().equals(listB.getButtonPinjam())) {
            addBarangKePinjaman();
        } else if (e.getSource().equals(listB.getButtonTampilPinjaman())) {
            ViewBarangSuatuAnggota();
        } else if (e.getSource().equals(listB.getButtonCari())) {
            searchBarangDiAnggota();
        } else if (e.getSource().equals(DB.getButtonBack())) {
            DB.setVisible(false);
            nf.setVisible(true);
        } else if (e.getSource().equals(DB.getButtonSelesai())) {
            AddBarang();
        } else if (e.getSource().equals(DB.getButtonListBarang())) {
            DB.setVisible(false);
            LBP.setVisible(true);
        } else if (e.getSource().equals(listB.getButtonBalikin())) {
            kembalikanBarangAnggota();
            //frame question
        } else if (e.getSource().equals(BA.getButtonBarang())) {
            BA.setVisible(false);
            lp.setVisible(false);
            DB.setVisible(true);
        } else if (e.getSource().equals(BA.getButtonAnggota())) {
            BA.setVisible(false);
            lp.setVisible(false);
            listA.setVisible(true);
        } else if (e.getSource().equals(q.getButtonNO())) {
            q.setVisible(false);
        } else if (e.getSource().equals(q.getButtonYES())) {
            DeleteAnggota();
            q.setVisible(false);
            JOptionPane.showMessageDialog(q, "Data Terhapus");
            ViewAnggota();
            //frame List BarangPetugas
        } else if (e.getSource().equals(LBP.getButtonRefresh())) {
            ViewBarangPetugas();
        } else if (e.getSource().equals(LBP.getButtonBack())) {
            LBP.setVisible(false);
            DB.setVisible(true);
        } else if (e.getSource().equals(LBP.getButtonCari())) {
            SearchBarang();
        } else if (e.getSource().equals((LBP.getButtonDelete()))) {
            DeleteBarang();
            JOptionPane.showMessageDialog(q, "Data Terhapus");
            ViewBarangPetugas();
        }
    }
}

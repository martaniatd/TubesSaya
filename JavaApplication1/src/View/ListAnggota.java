/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

/**
 *
 * @author martaniadewi
 */
public class ListAnggota extends javax.swing.JFrame {

    /**
     * Creates new form ListAnggota
     */
    public ListAnggota() {
        initComponents();
    }

    public void listener(ActionListener al) {
        ButtonSelesai.addActionListener(al);
        ButtonKeluar.addActionListener(al);
        ButtonCari.addActionListener(al);
        ButtonRefresh.addActionListener(al);
        ButtonSave.addActionListener(al);
        ButtonBack.addActionListener(al);
        ButtonBack1.addActionListener(al);
        ButtonBack2.addActionListener(al);
        ButtonBack3.addActionListener(al);
        ButtonSelesaiCreate.addActionListener(al);
    }

    public JToggleButton getButtonSelesaiCreate() {
        return ButtonSelesaiCreate;
    }

    public JButton getButtonBack3() {
        return ButtonBack3;
    }

    public void setButtonSelesaiCreate(JToggleButton ButtonSelesaiCreate) {
        this.ButtonSelesaiCreate = ButtonSelesaiCreate;
    }

    public JTextField getTextFieldIdPelanggan() {
        return TextFieldIdPelanggan;
    }

    public void setTextFieldIdPelanggan(JTextField TextFieldIdPelanggan) {
        this.TextFieldIdPelanggan = TextFieldIdPelanggan;
    }

    public JTextField getTextFieldIdPeminjaman() {
        return TextFieldIdPeminjaman;
    }

    public void setTextFieldIdPeminjaman(JTextField TextFieldIdPeminjaman) {
        this.TextFieldIdPeminjaman = TextFieldIdPeminjaman;
    }

    public JButton getButtonCari() {
        return ButtonCari;
    }

    public JButton getButtonBack() {
        return ButtonBack;
    }

    public JToggleButton getButtonRefresh() {
        return ButtonRefresh;
    }

    public JButton getButtonKeluar() {
        return ButtonKeluar;
    }

    public void setjTextArea1(JTextArea jTextArea1) {
        this.TampilListAnggota = jTextArea1;
    }

    public void setButtonKeluar(JButton ButtonKeluar) {
        this.ButtonKeluar = ButtonKeluar;
    }

    public JButton getButtonSelesai() {
        return ButtonSelesai;
    }

    public void setButtonSelesai(JButton ButtonSelesai) {
        this.ButtonSelesai = ButtonSelesai;
    }

    public JTextArea getTampilListAnggota() {
        return TampilListAnggota;
    }

    public void setTampilListAnggota(JTextArea TampilListAnggota) {
        this.TampilListAnggota = TampilListAnggota;
    }

    public JButton getButtonSave() {
        return ButtonSave;
    }

    public JTextField getTextFieldIdAnggotaTambah() {
        return TextFieldIdAnggotaTambah;
    }

    public JTextField getTextFieldNamaAnggotaTambah() {
        return TextFieldNamaAnggotaTambah;
    }

    public JTextField getTextFieldEditIDAnggota() {
        return TextFieldEditIDAnggota;
    }

    public void setTextFieldEditIDAnggota(JTextField TextFieldEditIDAnggota) {
        this.TextFieldEditIDAnggota = TextFieldEditIDAnggota;
    }

    public JTextField getTextFieldEditKotaAnggota() {
        return TextFieldEditKotaAnggota;
    }

    public void setTextFieldEditKotaAnggota(JTextField TextFieldEditKotaAnggota) {
        this.TextFieldEditKotaAnggota = TextFieldEditKotaAnggota;
    }

    public JTextField getTextFieldEditNamaAnggota() {
        return TextFieldEditNamaAnggota;
    }

    public void setTextFieldEditNamaAnggota(JTextField TextFieldEditNamaAnggota) {
        this.TextFieldEditNamaAnggota = TextFieldEditNamaAnggota;
    }

    public JTextField getTextFieldCarId() {
        return TextFieldCarId;
    }

    public void setTextFieldCarId(JTextField TextFieldCarId) {
        this.TextFieldCarId = TextFieldCarId;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        TextFieldNamaAnggotaTambah = new javax.swing.JTextField();
        TextFieldIdAnggotaTambah = new javax.swing.JTextField();
        ButtonSave = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        TextFieldKotaTambah = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        ButtonBack = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TextFieldEditIDAnggota = new javax.swing.JTextField();
        TextFieldEditNamaAnggota = new javax.swing.JTextField();
        TextFieldEditKotaAnggota = new javax.swing.JTextField();
        ButtonSelesai = new javax.swing.JButton();
        ButtonKeluar = new javax.swing.JButton();
        ButtonBack1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TampilListAnggota = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        TextFieldCarId = new javax.swing.JTextField();
        ButtonCari = new javax.swing.JButton();
        ButtonRefresh = new javax.swing.JToggleButton();
        ButtonBack3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        TextFieldIdPelanggan = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ButtonSelesaiCreate = new javax.swing.JToggleButton();
        jLabel7 = new javax.swing.JLabel();
        TextFieldIdPeminjaman = new javax.swing.JTextField();
        ButtonBack2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setForeground(new java.awt.Color(0, 51, 102));

        jPanel5.setBackground(new java.awt.Color(0, 51, 102));
        jPanel5.setAutoscrolls(true);
        jPanel5.setPreferredSize(new java.awt.Dimension(400, 300));

        TextFieldNamaAnggotaTambah.setForeground(new java.awt.Color(0, 0, 255));
        TextFieldNamaAnggotaTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldNamaAnggotaTambahActionPerformed(evt);
            }
        });

        TextFieldIdAnggotaTambah.setForeground(new java.awt.Color(0, 0, 255));

        ButtonSave.setForeground(new java.awt.Color(0, 51, 102));
        ButtonSave.setText("SAVE");
        ButtonSave.setBorder(null);
        ButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSaveActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("MASUKKAN DATA ANGGOTA ");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("NAMA     :");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("ID           :");

        TextFieldKotaTambah.setForeground(new java.awt.Color(0, 0, 255));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Kota       :");

        ButtonBack.setForeground(new java.awt.Color(0, 51, 102));
        ButtonBack.setText("< BACK");
        ButtonBack.setBorder(null);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jLabel8)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TextFieldNamaAnggotaTambah, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                            .addComponent(TextFieldIdAnggotaTambah)
                            .addComponent(TextFieldKotaTambah))))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(ButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(TextFieldNamaAnggotaTambah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(TextFieldIdAnggotaTambah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldKotaTambah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(38, 38, 38)
                .addComponent(ButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(160, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("ADD ANGGOTA", jPanel5);

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));
        jPanel2.setEnabled(false);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID ANGGOTA :");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NAMA            :");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ASAL KOTA   : ");

        TextFieldEditIDAnggota.setForeground(new java.awt.Color(0, 0, 255));

        TextFieldEditNamaAnggota.setForeground(new java.awt.Color(0, 0, 255));
        TextFieldEditNamaAnggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldEditNamaAnggotaActionPerformed(evt);
            }
        });

        TextFieldEditKotaAnggota.setForeground(new java.awt.Color(0, 0, 255));

        ButtonSelesai.setForeground(new java.awt.Color(0, 51, 102));
        ButtonSelesai.setText("SELESAI");
        ButtonSelesai.setBorder(null);

        ButtonKeluar.setForeground(new java.awt.Color(0, 51, 102));
        ButtonKeluar.setText("KELUAR");
        ButtonKeluar.setBorder(null);

        ButtonBack1.setForeground(new java.awt.Color(0, 51, 102));
        ButtonBack1.setText("< BACK");
        ButtonBack1.setBorder(null);

        jLabel12.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("EDIT DATA ANGGOTA ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(ButtonKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ButtonSelesai, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ButtonBack1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(jLabel12))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TextFieldEditIDAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TextFieldEditKotaAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TextFieldEditNamaAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonBack1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldEditIDAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldEditNamaAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldEditKotaAnggota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonSelesai, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );

        jTabbedPane1.addTab("EDIT ANGGOTA", jPanel2);

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));
        jPanel1.setForeground(new java.awt.Color(0, 51, 102));

        TampilListAnggota.setColumns(20);
        TampilListAnggota.setForeground(new java.awt.Color(0, 0, 255));
        TampilListAnggota.setRows(5);
        jScrollPane1.setViewportView(TampilListAnggota);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Search by id: ");

        TextFieldCarId.setForeground(new java.awt.Color(0, 0, 255));

        ButtonCari.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ButtonCari.setForeground(new java.awt.Color(0, 51, 102));
        ButtonCari.setText("CARI");
        ButtonCari.setBorder(null);

        ButtonRefresh.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ButtonRefresh.setForeground(new java.awt.Color(0, 51, 102));
        ButtonRefresh.setText("REFRESH");
        ButtonRefresh.setBorder(null);

        ButtonBack3.setForeground(new java.awt.Color(0, 51, 102));
        ButtonBack3.setText("< BACK");
        ButtonBack3.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(ButtonBack3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(TextFieldCarId, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ButtonRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                            .addComponent(ButtonCari, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TextFieldCarId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonCari, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonBack3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(ButtonRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        jTabbedPane1.addTab("LIST ANGGOTA", jPanel1);

        jPanel3.setBackground(new java.awt.Color(0, 51, 102));
        jPanel3.setForeground(new java.awt.Color(0, 51, 102));

        TextFieldIdPelanggan.setForeground(new java.awt.Color(0, 0, 255));
        TextFieldIdPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldIdPelangganActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ID  ANGGOTA           : ");

        ButtonSelesaiCreate.setForeground(new java.awt.Color(0, 51, 102));
        ButtonSelesaiCreate.setText("SELESAI");
        ButtonSelesaiCreate.setBorder(null);
        ButtonSelesaiCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSelesaiCreateActionPerformed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ID PEMINJAMAN       :");

        TextFieldIdPeminjaman.setForeground(new java.awt.Color(0, 0, 255));
        TextFieldIdPeminjaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldIdPeminjamanActionPerformed(evt);
            }
        });

        ButtonBack2.setForeground(new java.awt.Color(0, 51, 102));
        ButtonBack2.setText("< BACK");
        ButtonBack2.setBorder(null);

        jLabel13.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("CREATE PEMINJAMAN");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ButtonBack2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(ButtonSelesaiCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(TextFieldIdPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextFieldIdPeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(107, 107, 107))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel13)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonBack2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(43, 43, 43)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldIdPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextFieldIdPeminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(ButtonSelesaiCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(173, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("CREATE PEMINJAMAN", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextFieldEditNamaAnggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldEditNamaAnggotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldEditNamaAnggotaActionPerformed

    private void TextFieldNamaAnggotaTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldNamaAnggotaTambahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldNamaAnggotaTambahActionPerformed

    private void TextFieldIdPelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldIdPelangganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldIdPelangganActionPerformed

    private void TextFieldIdPeminjamanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldIdPeminjamanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldIdPeminjamanActionPerformed

    private void ButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonSaveActionPerformed

    private void ButtonSelesaiCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSelesaiCreateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonSelesaiCreateActionPerformed

    public JTextField getTextFieldKotaTambah() {
        return TextFieldKotaTambah;
    }

    public JButton getButtonBack1() {
        return ButtonBack1;
    }

    public JButton getButtonBack2() {
        return ButtonBack2;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ListAnggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListAnggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListAnggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListAnggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListAnggota().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonBack;
    private javax.swing.JButton ButtonBack1;
    private javax.swing.JButton ButtonBack2;
    private javax.swing.JButton ButtonBack3;
    private javax.swing.JButton ButtonCari;
    private javax.swing.JButton ButtonKeluar;
    private javax.swing.JToggleButton ButtonRefresh;
    private javax.swing.JButton ButtonSave;
    private javax.swing.JButton ButtonSelesai;
    private javax.swing.JToggleButton ButtonSelesaiCreate;
    private javax.swing.JTextArea TampilListAnggota;
    private javax.swing.JTextField TextFieldCarId;
    private javax.swing.JTextField TextFieldEditIDAnggota;
    private javax.swing.JTextField TextFieldEditKotaAnggota;
    private javax.swing.JTextField TextFieldEditNamaAnggota;
    private javax.swing.JTextField TextFieldIdAnggotaTambah;
    private javax.swing.JTextField TextFieldIdPelanggan;
    private javax.swing.JTextField TextFieldIdPeminjaman;
    private javax.swing.JTextField TextFieldKotaTambah;
    private javax.swing.JTextField TextFieldNamaAnggotaTambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    // End of variables declaration//GEN-END:variables
}
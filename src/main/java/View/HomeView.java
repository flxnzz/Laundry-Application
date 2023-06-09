/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Model.*;
import Controller.MenuController;


/**
 *
 * @author Haikal
 */
public class HomeView extends javax.swing.JFrame {
    private MenuController menu;
    public HomeView() {
        initComponents();
        menu = new MenuController(Contains);
        menu.prepareMenuBar(addPelanggan);
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Menubar = new javax.swing.JPanel();
        addPelangganBtn = new javax.swing.JButton();
        PelangganBtn = new javax.swing.JButton();
        TransaksiBtn = new javax.swing.JButton();
        KeluarBtn = new javax.swing.JButton();
        Contains = new javax.swing.JPanel();
        addPelanggan = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        totalHargaValue = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();
        namaLabel4 = new javax.swing.JLabel();
        dataPelangganPanel = new javax.swing.JPanel();
        namaLabel = new javax.swing.JLabel();
        namaTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        alamatTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        kontakTextField = new javax.swing.JTextField();
        dataTransaksiPanel = new javax.swing.JPanel();
        namaLabel3 = new javax.swing.JLabel();
        jumlahCucianField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLayananCombo = new javax.swing.JComboBox<>();
        jCucianCombo = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cekHargaButton = new javax.swing.JButton();
        Pelanggan = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        searchField = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        cetakPelangganBtn = new javax.swing.JButton();
        Transaksi = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1005, 550));

        Menubar.setBackground(new java.awt.Color(18, 20, 21));

        addPelangganBtn.setFont(new java.awt.Font("Poppins Medium", 0, 16)); // NOI18N
        addPelangganBtn.setForeground(new java.awt.Color(0, 204, 204));
        addPelangganBtn.setText("Tambah Pelanggan");
        addPelangganBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        addPelangganBtn.setContentAreaFilled(false);
        addPelangganBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        addPelangganBtn.setMargin(new java.awt.Insets(2, 20, 3, 14));
        addPelangganBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPelangganBtnActionPerformed(evt);
            }
        });

        PelangganBtn.setFont(new java.awt.Font("Poppins Medium", 0, 16)); // NOI18N
        PelangganBtn.setForeground(new java.awt.Color(0, 204, 204));
        PelangganBtn.setText("Pelanggan");
        PelangganBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        PelangganBtn.setContentAreaFilled(false);
        PelangganBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        PelangganBtn.setMargin(new java.awt.Insets(2, 20, 3, 14));
        PelangganBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PelangganBtnActionPerformed(evt);
            }
        });

        TransaksiBtn.setFont(new java.awt.Font("Poppins Medium", 0, 16)); // NOI18N
        TransaksiBtn.setForeground(new java.awt.Color(0, 204, 204));
        TransaksiBtn.setText("Transaksi");
        TransaksiBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        TransaksiBtn.setContentAreaFilled(false);
        TransaksiBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TransaksiBtn.setMargin(new java.awt.Insets(2, 20, 3, 14));
        TransaksiBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransaksiBtnActionPerformed(evt);
            }
        });

        KeluarBtn.setFont(new java.awt.Font("Poppins Medium", 0, 16)); // NOI18N
        KeluarBtn.setForeground(new java.awt.Color(255, 0, 51));
        KeluarBtn.setText("Keluar");
        KeluarBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        KeluarBtn.setContentAreaFilled(false);
        KeluarBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        KeluarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeluarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenubarLayout = new javax.swing.GroupLayout(Menubar);
        Menubar.setLayout(MenubarLayout);
        MenubarLayout.setHorizontalGroup(
            MenubarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenubarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenubarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addPelangganBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PelangganBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                    .addComponent(TransaksiBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(KeluarBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        MenubarLayout.setVerticalGroup(
            MenubarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenubarLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(addPelangganBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PelangganBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TransaksiBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(KeluarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Poppins SemiBold", 0, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tambah Data Pelanggan");

        totalHargaValue.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        totalHargaValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalHargaValue.setText("{harga}");

        submitButton.setBackground(new java.awt.Color(0, 204, 204));
        submitButton.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        submitButton.setForeground(new java.awt.Color(255, 255, 255));
        submitButton.setText("Submit");
        submitButton.setBorder(null);
        submitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        submitButton.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        submitButton.setFocusable(false);
        submitButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        namaLabel4.setFont(new java.awt.Font("Poppins", 0, 16)); // NOI18N
        namaLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        namaLabel4.setText("Total Harga");

        dataPelangganPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Data Pelanggan", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        namaLabel.setFont(new java.awt.Font("Poppins", 0, 16)); // NOI18N
        namaLabel.setText("Nama");

        namaTextField1.setPreferredSize(new java.awt.Dimension(80, 28));
        namaTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaTextField1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Poppins", 0, 16)); // NOI18N
        jLabel6.setText("Alamat");

        alamatTextField.setPreferredSize(new java.awt.Dimension(80, 28));
        alamatTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alamatTextFieldActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Poppins", 0, 16)); // NOI18N
        jLabel7.setText("Nomor HP");

        kontakTextField.setPreferredSize(new java.awt.Dimension(80, 28));
        kontakTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kontakTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dataPelangganPanelLayout = new javax.swing.GroupLayout(dataPelangganPanel);
        dataPelangganPanel.setLayout(dataPelangganPanelLayout);
        dataPelangganPanelLayout.setHorizontalGroup(
            dataPelangganPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataPelangganPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dataPelangganPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(namaLabel)
                    .addComponent(namaTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(alamatTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(kontakTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        dataPelangganPanelLayout.setVerticalGroup(
            dataPelangganPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataPelangganPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(namaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(namaTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alamatTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kontakTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        dataTransaksiPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Data Transaksi"));

        namaLabel3.setFont(new java.awt.Font("Poppins", 0, 16)); // NOI18N
        namaLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        namaLabel3.setText("Berat /Jumlah Cucian");

        jumlahCucianField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlahCucianFieldActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Poppins", 0, 16)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Jenis Layanan");

        jLayananCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Regular", "Express", "Kilat" }));
        jLayananCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLayananComboActionPerformed(evt);
            }
        });

        jCucianCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kiloan", "Satuan" }));
        jCucianCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCucianComboActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Poppins", 0, 16)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Jenis Cucian");

        javax.swing.GroupLayout dataTransaksiPanelLayout = new javax.swing.GroupLayout(dataTransaksiPanel);
        dataTransaksiPanel.setLayout(dataTransaksiPanelLayout);
        dataTransaksiPanelLayout.setHorizontalGroup(
            dataTransaksiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dataTransaksiPanelLayout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(dataTransaksiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLayananCombo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namaLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jumlahCucianField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCucianCombo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        dataTransaksiPanelLayout.setVerticalGroup(
            dataTransaksiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataTransaksiPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(namaLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jumlahCucianField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayananCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCucianCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cekHargaButton.setBackground(new java.awt.Color(0, 204, 204));
        cekHargaButton.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        cekHargaButton.setForeground(new java.awt.Color(255, 255, 255));
        cekHargaButton.setText("Cek Harga");
        cekHargaButton.setBorder(null);
        cekHargaButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cekHargaButton.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        cekHargaButton.setFocusable(false);
        cekHargaButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cekHargaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cekHargaButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addPelangganLayout = new javax.swing.GroupLayout(addPelanggan);
        addPelanggan.setLayout(addPelangganLayout);
        addPelangganLayout.setHorizontalGroup(
            addPelangganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPelangganLayout.createSequentialGroup()
                .addGroup(addPelangganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addPelangganLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(dataPelangganPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 211, Short.MAX_VALUE)
                        .addComponent(dataTransaksiPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addPelangganLayout.createSequentialGroup()
                        .addGap(317, 317, 317)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(addPelangganLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(addPelangganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totalHargaValue)
                    .addComponent(namaLabel4)
                    .addComponent(cekHargaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addPelangganLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        addPelangganLayout.setVerticalGroup(
            addPelangganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPelangganLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(addPelangganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dataTransaksiPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dataPelangganPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(47, 47, 47)
                .addComponent(cekHargaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(namaLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalHargaValue)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Data Pelanggan");

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setFont(new java.awt.Font("Poppins", 0, 15)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setEditingColumn(0);
        jTable1.setEditingRow(0);
        jTable1.setRowHeight(35);
        jScrollPane1.setViewportView(jTable1);

        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });

        searchBtn.setText("Cari");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        cetakPelangganBtn.setBackground(new java.awt.Color(0, 204, 204));
        cetakPelangganBtn.setText("Cetak Laporan");
        cetakPelangganBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cetakPelangganBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PelangganLayout = new javax.swing.GroupLayout(Pelanggan);
        Pelanggan.setLayout(PelangganLayout);
        PelangganLayout.setHorizontalGroup(
            PelangganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PelangganLayout.createSequentialGroup()
                .addGroup(PelangganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PelangganLayout.createSequentialGroup()
                        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchBtn))
                    .addGroup(PelangganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PelangganLayout.createSequentialGroup()
                            .addGap(320, 320, 320)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PelangganLayout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(cetakPelangganBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        PelangganLayout.setVerticalGroup(
            PelangganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PelangganLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PelangganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cetakPelangganBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        Transaksi.setPreferredSize(new java.awt.Dimension(715, 511));

        jLabel3.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Detail Transaksi");

        jTable3.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nama", "Waktu Pemesanan", "Jadwal Pengiriman", "Status Pembayaran", "Total Harga"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.setRowHeight(40);
        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout TransaksiLayout = new javax.swing.GroupLayout(Transaksi);
        Transaksi.setLayout(TransaksiLayout);
        TransaksiLayout.setHorizontalGroup(
            TransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TransaksiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 934, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(TransaksiLayout.createSequentialGroup()
                .addGap(384, 384, 384)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TransaksiLayout.setVerticalGroup(
            TransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TransaksiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout ContainsLayout = new javax.swing.GroupLayout(Contains);
        Contains.setLayout(ContainsLayout);
        ContainsLayout.setHorizontalGroup(
            ContainsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addPelanggan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(ContainsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ContainsLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Pelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(ContainsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ContainsLayout.createSequentialGroup()
                    .addComponent(Transaksi, javax.swing.GroupLayout.DEFAULT_SIZE, 946, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        ContainsLayout.setVerticalGroup(
            ContainsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainsLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(addPelanggan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(ContainsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContainsLayout.createSequentialGroup()
                    .addContainerGap(15, Short.MAX_VALUE)
                    .addComponent(Pelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(ContainsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContainsLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Transaksi, javax.swing.GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Menubar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Contains, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Menubar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Contains, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addPelangganBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPelangganBtnActionPerformed
        // TODO add your handling code here:
        menu.prepareMenuBar(addPelanggan);
    }//GEN-LAST:event_addPelangganBtnActionPerformed

    private void PelangganBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PelangganBtnActionPerformed
        // TODO add your handling code here:
        
        
        // Menambahkan panel
        ShowCustomer customer = new ShowCustomer(jTable1);
        customer.showData();
        menu.prepareMenuBar(Pelanggan);
    }//GEN-LAST:event_PelangganBtnActionPerformed

    private void TransaksiBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransaksiBtnActionPerformed
        // TODO add your handling code here:
        menu.prepareMenuBar(Transaksi);
        AddCustomer customer = new AddCustomer(jTable3);
        customer.showData();
    }//GEN-LAST:event_TransaksiBtnActionPerformed

    private void KeluarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeluarBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_KeluarBtnActionPerformed

    private void namaTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaTextField1ActionPerformed

    private void jumlahCucianFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlahCucianFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jumlahCucianFieldActionPerformed

    private void jLayananComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLayananComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLayananComboActionPerformed

    private void jCucianComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCucianComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCucianComboActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
            // 1. Create a database connection
        Customer customer = new Customer(
                namaTextField1.getText(),
                alamatTextField.getText(),
                kontakTextField.getText(), 
                Double.parseDouble(jumlahCucianField.getText()), 
                jLayananCombo.getSelectedItem().toString(), 
                jCucianCombo.getSelectedItem().toString()
        );
        String jumlahCucian = jumlahCucianField.getText();
        Transaksi transaksi = new Transaksi(jCucianCombo.getSelectedItem().toString(),
                jLayananCombo.getSelectedItem().toString(),
                Double.parseDouble(jumlahCucian));
        AddCustomer newCustomer = new AddCustomer(customer);
        newCustomer.insertData(this, transaksi.getBiaya());
        
    }//GEN-LAST:event_submitButtonActionPerformed

    private void kontakTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kontakTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kontakTextFieldActionPerformed

    private void alamatTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alamatTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alamatTextFieldActionPerformed

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFieldActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        ShowCustomer customer = new ShowCustomer(jTable1); 
        ShowCustomer.Search searching = customer.new Search(searchField);
        searching.searchData();
        /*SearchModel search = new SearchModel(jTable1, searchField);
        search.searchData();*/
    }//GEN-LAST:event_searchBtnActionPerformed

    private void cekHargaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cekHargaButtonActionPerformed
        String jumlahCucian = jumlahCucianField.getText();
        Transaksi transaksi = new Transaksi(jCucianCombo.getSelectedItem().toString(),
                jLayananCombo.getSelectedItem().toString(),
                Double.parseDouble(jumlahCucian));
        totalHargaValue.setText(String.valueOf(transaksi.getBiaya()));
    }//GEN-LAST:event_cekHargaButtonActionPerformed

    private void cetakPelangganBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cetakPelangganBtnActionPerformed
        // TODO add your handling code here:
        ShowCustomer customer = new ShowCustomer();
        // True: ShowCustomer customer = new ShowCustomer(jTable1);
        CetakLaporan report = new CetakLaporan(customer.getCustomerList());
        report.DownloadAsTxt(this);
    }//GEN-LAST:event_cetakPelangganBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Contains;
    private javax.swing.JButton KeluarBtn;
    private javax.swing.JPanel Menubar;
    private javax.swing.JPanel Pelanggan;
    private javax.swing.JButton PelangganBtn;
    private javax.swing.JPanel Transaksi;
    private javax.swing.JButton TransaksiBtn;
    private javax.swing.JPanel addPelanggan;
    private javax.swing.JButton addPelangganBtn;
    private javax.swing.JTextField alamatTextField;
    private javax.swing.JButton cekHargaButton;
    private javax.swing.JButton cetakPelangganBtn;
    private javax.swing.JPanel dataPelangganPanel;
    private javax.swing.JPanel dataTransaksiPanel;
    private javax.swing.JComboBox<String> jCucianCombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> jLayananCombo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JTable jTable1;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jumlahCucianField;
    private javax.swing.JTextField kontakTextField;
    private javax.swing.JLabel namaLabel;
    private javax.swing.JLabel namaLabel3;
    private javax.swing.JLabel namaLabel4;
    private javax.swing.JTextField namaTextField1;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchField;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel totalHargaValue;
    // End of variables declaration//GEN-END:variables

    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
/**
 *
 * @author ASUS
 */
public class DataAnakForm extends javax.swing.JInternalFrame {
    
    /**
     * Creates new form DataAnakForm
     */
    public DataAnakForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JK_rb = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        NamaAnak_txt = new javax.swing.JTextField();
        NIK_txt = new javax.swing.JTextField();
        UmurAnak_txt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Alamat_ta = new javax.swing.JTextArea();
        Lakilaki_rb = new javax.swing.JRadioButton();
        Perempuan_rb = new javax.swing.JRadioButton();
        RI_cb = new javax.swing.JComboBox<>();
        Delete_bt = new javax.swing.JButton();
        BackMenu_bt = new javax.swing.JButton();
        Ibu_txt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Bapak_txt = new javax.swing.JTextField();
        Save_bt = new javax.swing.JButton();
        TanggalLahir_dc = new com.toedter.calendar.JDateChooser();
        Update_bt = new javax.swing.JButton();

        setTitle("FORM DATA ANAK");
        setPreferredSize(new java.awt.Dimension(1535, 1000));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("FORMULIR DATA ANAK");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("NAMA ANAK ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("JENIS KELAMIN");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("NIK ");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("UMUR (BULAN)");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("IBU");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("RIWAYAT IMUNISASI");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("ALAMAT");

        NamaAnak_txt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        NamaAnak_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NamaAnak_txtActionPerformed(evt);
            }
        });

        NIK_txt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        NIK_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NIK_txtActionPerformed(evt);
            }
        });

        UmurAnak_txt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        Alamat_ta.setColumns(20);
        Alamat_ta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Alamat_ta.setRows(5);
        jScrollPane1.setViewportView(Alamat_ta);

        JK_rb.add(Lakilaki_rb);
        Lakilaki_rb.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Lakilaki_rb.setText("LAKI-LAKI");
        Lakilaki_rb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lakilaki_rbActionPerformed(evt);
            }
        });

        JK_rb.add(Perempuan_rb);
        Perempuan_rb.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Perempuan_rb.setText("PEREMPUAN");

        RI_cb.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        RI_cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---Pilih---", "Belum Imunisasi", "1 Bulan : BCG Polio 1", "2 Bulan : DPT-HB-Hib 1 Polio 2", "3 Bulan : DPT-HB-Hib 2 Polio 3", "4 Bulan : DPT-HB-Hib 3 Polio 4", "9 Bulan : Campak", "18-24 Bulan : DPT-HB-Hib 1", "18-24 Bulan : Campak Rubella 1", " " }));
        RI_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RI_cbActionPerformed(evt);
            }
        });

        Delete_bt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Delete_bt.setText("HAPUS");
        Delete_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_btActionPerformed(evt);
            }
        });

        BackMenu_bt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BackMenu_bt.setText("KEMBALI");
        BackMenu_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackMenu_btActionPerformed(evt);
            }
        });

        Ibu_txt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("TANGGAL LAHIR");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("ORANG TUA");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("BAPAK");

        Bapak_txt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Bapak_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bapak_txtActionPerformed(evt);
            }
        });

        Save_bt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Save_bt.setText("SIMPAN");
        Save_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Save_btActionPerformed(evt);
            }
        });

        TanggalLahir_dc.setDateFormatString("yyyy-MM-dd");
        TanggalLahir_dc.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        Update_bt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Update_bt.setText("UPDATE");
        Update_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update_btActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(BackMenu_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(477, 477, 477)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(UmurAnak_txt)
                                            .addComponent(TanggalLahir_dc, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(NIK_txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel11)
                                    .addGap(8, 8, 8)
                                    .addComponent(Bapak_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NamaAnak_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Ibu_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Lakilaki_rb, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Perempuan_rb, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(RI_cb, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Save_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Update_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Delete_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(323, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BackMenu_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NamaAnak_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NIK_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UmurAnak_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TanggalLahir_dc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bapak_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ibu_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lakilaki_rb, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Perempuan_rb, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RI_cb, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Save_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Update_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Delete_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(296, Short.MAX_VALUE))
        );

        jLabel1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    public void setFields(String nama, String nik, String umur, java.util.Date tanggalLahir, String bapak, String ibu, String alamat, String jk, String riwayatImunisasi) {
        NamaAnak_txt.setText(nama);
        NIK_txt.setText(nik);
        UmurAnak_txt.setText(umur);
        TanggalLahir_dc.setDate(tanggalLahir);
        Bapak_txt.setText(bapak);
        Ibu_txt.setText(ibu);
        Alamat_ta.setText(alamat);
        if (jk.equals("Laki-laki")) {
            Lakilaki_rb.setSelected(true);
        } else if (jk.equals("Perempuan")) {
            Perempuan_rb.setSelected(true);
        }
        RI_cb.setSelectedItem(riwayatImunisasi);
    }
    
    private void NamaAnak_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NamaAnak_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NamaAnak_txtActionPerformed

    private void Lakilaki_rbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lakilaki_rbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Lakilaki_rbActionPerformed

    private void RI_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RI_cbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RI_cbActionPerformed

    private void Bapak_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bapak_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Bapak_txtActionPerformed

    private void Delete_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_btActionPerformed
        NamaAnak_txt.setText("");
        NIK_txt.setText("");
        UmurAnak_txt.setText("");
        TanggalLahir_dc.setDate(null);
        Bapak_txt.setText("");
        Ibu_txt.setText("");
        Alamat_ta.setText("");
        RI_cb.setSelectedIndex(0);
        JK_rb.clearSelection();
    }//GEN-LAST:event_Delete_btActionPerformed

    private void BackMenu_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackMenu_btActionPerformed
        OptionMenu optionMenu = new OptionMenu();
        optionMenu.setVisible(true);
        this.getDesktopPane().add(optionMenu);
        this.dispose();
    }//GEN-LAST:event_BackMenu_btActionPerformed

    private void Save_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Save_btActionPerformed
        // Mendapatkan nilai input dari komponen-komponen
        String nama = NamaAnak_txt.getText();
        String nik = NIK_txt.getText();
        String umur_bulan = UmurAnak_txt.getText();
        java.util.Date tanggal_lahir = TanggalLahir_dc.getDate();
        String bapak = Bapak_txt.getText();
        String ibu = Ibu_txt.getText();
        String alamat = Alamat_ta.getText();
        String riwayat_imunisasi = (String) RI_cb.getSelectedItem();
        String jk = "";

        // Mengecek pilihan jenis kelamin
        if (Lakilaki_rb.isSelected()){
            jk = "Laki-laki";
        }else{
            if (Perempuan_rb.isSelected()){
                jk = "Perempuan";
            }
        }    
        // Memeriksa apakah ada data yang kosong
        if (nama.isEmpty() || nik.isEmpty() || umur_bulan.isEmpty() || tanggal_lahir == null ||
        bapak.isEmpty() || ibu.isEmpty() || alamat.isEmpty() || jk.isEmpty() || riwayat_imunisasi.isEmpty()) {
            // Menampilkan pesan error jika ada data yang kosong
            JOptionPane.showMessageDialog(this, "Error: Terdapat data yang kosong", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            try{
                // Kode untuk menyimpan data ke database
                // Menghubungkan ke database
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pbo_aplikasi_kesehatan", "root", "");
                // Membuat pernyataan SQL
                String sql = "INSERT INTO anak (nama, nik, umur, tanggal_lahir, bapak, ibu, alamat, jk, riwayat_imunisasi) " +
                            "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
                // Membuat prepared statement
                PreparedStatement pstmt = conn.prepareStatement(sql);
                // Mengatur nilai parameter pada prepared statement
                pstmt.setString(1, nama);
                pstmt.setString(2, nik);
                pstmt.setString(3, umur_bulan);
                pstmt.setDate(4, new java.sql.Date(tanggal_lahir.getTime()));
                pstmt.setString(5, bapak);
                pstmt.setString(6, ibu);
                pstmt.setString(7, alamat);
                pstmt.setString(8, jk);
                pstmt.setString(9, riwayat_imunisasi);
                // Menjalankan pernyataan SQL untuk menyimpan data
                pstmt.executeUpdate();
                // Menampilkan pesan sukses
                JOptionPane.showMessageDialog(this, "Data berhasil diinput", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                // Menutup koneksi ke database
                pstmt.close();
                conn.close();
                NamaAnak_txt.setText("");
                NIK_txt.setText("");
                UmurAnak_txt.setText("");
                TanggalLahir_dc.setDate(null);
                Bapak_txt.setText("");
                Ibu_txt.setText("");
                Alamat_ta.setText("");
                RI_cb.setSelectedIndex(0);
                JK_rb.clearSelection();
            }catch(SQLException ex){
                // Menampilkan pesan error jika terjadi kesalahan dalam operasi database
                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_Save_btActionPerformed

    private void NIK_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NIK_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NIK_txtActionPerformed

    private void Update_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update_btActionPerformed
        String nama = NamaAnak_txt.getText();
        String nik = NIK_txt.getText();
        String umur_bulan = UmurAnak_txt.getText();
        java.util.Date tanggal_lahir = TanggalLahir_dc.getDate();
        String bapak = Bapak_txt.getText();
        String ibu = Ibu_txt.getText();
        String alamat = Alamat_ta.getText();
        String riwayat_imunisasi = (String) RI_cb.getSelectedItem();
        String jk = "";

        // Mengecek pilihan jenis kelamin
        if (Lakilaki_rb.isSelected()) {
            jk = "Laki-laki";
        } else {
            if (Perempuan_rb.isSelected()) {
                jk = "Perempuan";
            }
        }

        // Memeriksa apakah ada data yang kosong
        if (nama.isEmpty() || nik.isEmpty() || umur_bulan.isEmpty() || tanggal_lahir == null ||
                bapak.isEmpty() || ibu.isEmpty() || alamat.isEmpty() || jk.isEmpty() || riwayat_imunisasi.isEmpty()) {
            // Menampilkan pesan error jika ada data yang kosong
            JOptionPane.showMessageDialog(this, "Error: Terdapat data yang kosong", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                // Kode untuk mengupdate data ke database
                // Menghubungkan ke database
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pbo_aplikasi_kesehatan", "root", "");
                // Membuat pernyataan SQL
                String sql = "UPDATE anak SET nama = ?, umur = ?, tanggal_lahir = ?, bapak = ?, ibu = ?, alamat = ?, jk = ?, riwayat_imunisasi = ? WHERE nik = ?";
                // Membuat prepared statement
                PreparedStatement pstmt = conn.prepareStatement(sql);
                // Mengatur nilai parameter pada prepared statement
                pstmt.setString(1, nama);
                pstmt.setString(2, umur_bulan);
                pstmt.setDate(3, new java.sql.Date(tanggal_lahir.getTime()));
                pstmt.setString(4, bapak);
                pstmt.setString(5, ibu);
                pstmt.setString(6, alamat);
                pstmt.setString(7, jk);
                pstmt.setString(8, riwayat_imunisasi);
                pstmt.setString(9, nik);
                // Menjalankan pernyataan SQL untuk mengupdate data
                int rowsUpdated = pstmt.executeUpdate();
                if (rowsUpdated > 0) {
                    JOptionPane.showMessageDialog(this, "Data berhasil diupdate", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Gagal mengupdate data", "Error", JOptionPane.ERROR_MESSAGE);
                }
                // Menutup koneksi ke database
                pstmt.close();
                conn.close();NamaAnak_txt.setText("");
                NIK_txt.setText("");
                UmurAnak_txt.setText("");
                TanggalLahir_dc.setDate(null);
                Bapak_txt.setText("");
                Ibu_txt.setText("");
                Alamat_ta.setText("");
                RI_cb.setSelectedIndex(0);
                JK_rb.clearSelection();
            } catch (SQLException ex) {
                // Menampilkan pesan error jika terjadi kesalahan dalam operasi database
                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_Update_btActionPerformed
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Alamat_ta;
    private javax.swing.JButton BackMenu_bt;
    private javax.swing.JTextField Bapak_txt;
    private javax.swing.JButton Delete_bt;
    private javax.swing.JTextField Ibu_txt;
    private javax.swing.ButtonGroup JK_rb;
    private javax.swing.JRadioButton Lakilaki_rb;
    private javax.swing.JTextField NIK_txt;
    private javax.swing.JTextField NamaAnak_txt;
    private javax.swing.JRadioButton Perempuan_rb;
    private javax.swing.JComboBox<String> RI_cb;
    private javax.swing.JButton Save_bt;
    private com.toedter.calendar.JDateChooser TanggalLahir_dc;
    private javax.swing.JTextField UmurAnak_txt;
    private javax.swing.JButton Update_bt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

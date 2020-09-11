
package BilKomplexs;
public class bilkomp extends javax.swing.JFrame {

    public bilkomp() {
        initComponents();
    }
    bilkomp3 a = new bilkomp3();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        PanelInput = new javax.swing.JPanel();
        Bilkomp1 = new javax.swing.JRadioButton();
        Bilkomp2 = new javax.swing.JRadioButton();
        Hasil = new javax.swing.JRadioButton();
        real1 = new javax.swing.JTextField();
        real2 = new javax.swing.JTextField();
        real3 = new javax.swing.JTextField();
        imajiner1 = new javax.swing.JTextField();
        imajiner2 = new javax.swing.JTextField();
        imajiner3 = new javax.swing.JTextField();
        Enter1 = new javax.swing.JButton();
        Enter2 = new javax.swing.JButton();
        Enter3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        PanelOperasi = new javax.swing.JPanel();
        clear = new javax.swing.JButton();
        kali = new javax.swing.JButton();
        konjugate = new javax.swing.JButton();
        argumen = new javax.swing.JButton();
        Salin = new javax.swing.JButton();
        modulus = new javax.swing.JButton();
        tambah = new javax.swing.JButton();
        pangkat2 = new javax.swing.JButton();
        kurang = new javax.swing.JButton();
        pangkat3 = new javax.swing.JButton();
        close = new javax.swing.JButton();
        polar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        display = new javax.swing.JTextArea();

        buttonGroup1.add(Bilkomp1);
        buttonGroup1.add(Bilkomp2);
        buttonGroup1.add(Hasil);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kalkulator Bilangan Komplek");

        PanelInput.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.white, null, java.awt.Color.white));
        PanelInput.setToolTipText("Input");
        PanelInput.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PanelInput.setName("Input"); // NOI18N
        PanelInput.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Bilkomp1.setText("Bilangan Komplek 1");
        PanelInput.add(Bilkomp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 180, -1));

        Bilkomp2.setText("Bilangan Komplek 2");
        PanelInput.add(Bilkomp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 180, -1));

        Hasil.setText("Hasil Operasi");
        PanelInput.add(Hasil, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        real1.setText("0");
        PanelInput.add(real1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 70, -1));

        real2.setText("0");
        PanelInput.add(real2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 70, -1));

        real3.setText("0");
        PanelInput.add(real3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 70, -1));

        imajiner1.setText("0");
        imajiner1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                imajiner1KeyReleased(evt);
            }
        });
        PanelInput.add(imajiner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 70, -1));

        imajiner2.setText("0");
        imajiner2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                imajiner2KeyReleased(evt);
            }
        });
        PanelInput.add(imajiner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 70, -1));

        imajiner3.setText("0");
        imajiner3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                imajiner3KeyReleased(evt);
            }
        });
        PanelInput.add(imajiner3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 70, -1));

        Enter1.setText(">>");
        Enter1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Enter1MouseClicked(evt);
            }
        });
        PanelInput.add(Enter1, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 27, -1, -1));

        Enter2.setText(">>");
        PanelInput.add(Enter2, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 61, -1, -1));

        Enter3.setText(">>");
        PanelInput.add(Enter3, new org.netbeans.lib.awtextra.AbsoluteConstraints(455, 93, -1, -1));

        jLabel1.setText("+");
        PanelInput.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, -1, 30));

        jLabel2.setText("+");
        PanelInput.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, -1, 30));

        jLabel3.setText("i");
        PanelInput.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 35, -1, -1));

        jLabel4.setText("i");
        PanelInput.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 65, -1, -1));

        jLabel5.setText("+");
        PanelInput.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, -1, 30));

        jLabel6.setText("i");
        PanelInput.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 95, -1, -1));

        PanelOperasi.setLayout(null);

        clear.setText("Clear");
        PanelOperasi.add(clear);
        clear.setBounds(15, 16, 161, 105);

        kali.setText("Kali");
        PanelOperasi.add(kali);
        kali.setBounds(406, 54, 103, 29);

        konjugate.setText("Konjugate");
        PanelOperasi.add(konjugate);
        konjugate.setBounds(406, 16, 103, 29);

        argumen.setText("Argument");
        PanelOperasi.add(argumen);
        argumen.setBounds(294, 16, 103, 29);

        Salin.setText("Salin Hasil");
        PanelOperasi.add(Salin);
        Salin.setBounds(15, 130, 494, 29);

        modulus.setText("Modulus");
        modulus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modulusMouseClicked(evt);
            }
        });
        PanelOperasi.add(modulus);
        modulus.setBounds(185, 16, 100, 29);

        tambah.setText("Tambah");
        PanelOperasi.add(tambah);
        tambah.setBounds(185, 54, 100, 29);

        pangkat2.setText("Pangkat2");
        PanelOperasi.add(pangkat2);
        pangkat2.setBounds(185, 92, 100, 29);

        kurang.setText("Kurang");
        PanelOperasi.add(kurang);
        kurang.setBounds(294, 54, 103, 29);

        pangkat3.setText("Pangkat3");
        PanelOperasi.add(pangkat3);
        pangkat3.setBounds(296, 92, 101, 29);

        close.setText("Close");
        PanelOperasi.add(close);
        close.setBounds(15, 168, 494, 29);

        polar.setText("Polar");
        PanelOperasi.add(polar);
        polar.setBounds(406, 92, 103, 29);

        display.setColumns(20);
        display.setRows(5);
        jScrollPane1.setViewportView(display);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanelOperasi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelInput, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PanelInput, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PanelOperasi, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelInput.getAccessibleContext().setAccessibleName("Input");
        PanelInput.getAccessibleContext().setAccessibleParent(PanelInput);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void modulusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modulusMouseClicked

    }//GEN-LAST:event_modulusMouseClicked

    private void Enter1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Enter1MouseClicked

    }//GEN-LAST:event_Enter1MouseClicked

    private void imajiner1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_imajiner1KeyReleased
        try{
            Double.valueOf(imajiner1.getText());
        }
        catch(Exception e){
            display.setText("Hanya masukan angka");
        }
    }//GEN-LAST:event_imajiner1KeyReleased

    private void imajiner2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_imajiner2KeyReleased
        try{
            Double.valueOf(imajiner2.getText());
        }
        catch(Exception e){
            display.setText("Hanya masukan angka");
        }
    }//GEN-LAST:event_imajiner2KeyReleased

    private void imajiner3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_imajiner3KeyReleased
        try{
            Double.valueOf(imajiner3.getText());
        }
        catch(Exception e){
            display.setText("Hanya masukan angka");
        }
    }//GEN-LAST:event_imajiner3KeyReleased
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Bilkomp1;
    private javax.swing.JRadioButton Bilkomp2;
    private javax.swing.JButton Enter1;
    private javax.swing.JButton Enter2;
    private javax.swing.JButton Enter3;
    private javax.swing.JRadioButton Hasil;
    private javax.swing.JPanel PanelInput;
    private javax.swing.JPanel PanelOperasi;
    private javax.swing.JButton Salin;
    private javax.swing.JButton argumen;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clear;
    private javax.swing.JButton close;
    private javax.swing.JTextArea display;
    private javax.swing.JTextField imajiner1;
    private javax.swing.JTextField imajiner2;
    private javax.swing.JTextField imajiner3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton kali;
    private javax.swing.JButton konjugate;
    private javax.swing.JButton kurang;
    private javax.swing.JButton modulus;
    private javax.swing.JButton pangkat2;
    private javax.swing.JButton pangkat3;
    private javax.swing.JButton polar;
    private javax.swing.JTextField real1;
    private javax.swing.JTextField real2;
    private javax.swing.JTextField real3;
    private javax.swing.JButton tambah;
    // End of variables declaration//GEN-END:variables
}

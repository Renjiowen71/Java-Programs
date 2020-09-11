

package BilKomplexs;

public class bilkomp3 extends javax.swing.JFrame {

    
    public bilkomp3() {
        initComponents();
    }
    cKomplek a = new cKomplek();
    cKomplek c = new cKomplek();
    String b = "";
    String f;
    int d = 0;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        PanelInput = new javax.swing.JPanel();
        real1 = new javax.swing.JTextField();
        imajiner1 = new javax.swing.JTextField();
        Enter1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Enter2 = new javax.swing.JButton();
        imajiner2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        real2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        salin2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelOperasi.setLayout(null);

        clear.setText("Clear");
        clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearMouseClicked(evt);
            }
        });
        PanelOperasi.add(clear);
        clear.setBounds(15, 16, 161, 105);

        kali.setText("Kali");
        kali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kaliMouseClicked(evt);
            }
        });
        PanelOperasi.add(kali);
        kali.setBounds(406, 54, 103, 29);

        konjugate.setText("Konjugate");
        konjugate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                konjugateMouseClicked(evt);
            }
        });
        PanelOperasi.add(konjugate);
        konjugate.setBounds(406, 16, 103, 29);

        argumen.setText("Argument");
        argumen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                argumenMouseClicked(evt);
            }
        });
        PanelOperasi.add(argumen);
        argumen.setBounds(294, 16, 103, 29);

        Salin.setText("Salin Hasil");
        Salin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalinMouseClicked(evt);
            }
        });
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
        tambah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tambahMouseClicked(evt);
            }
        });
        PanelOperasi.add(tambah);
        tambah.setBounds(185, 54, 100, 29);

        pangkat2.setText("Pangkat2");
        pangkat2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pangkat2MouseClicked(evt);
            }
        });
        PanelOperasi.add(pangkat2);
        pangkat2.setBounds(185, 92, 100, 29);

        kurang.setText("Kurang");
        kurang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kurangMouseClicked(evt);
            }
        });
        PanelOperasi.add(kurang);
        kurang.setBounds(294, 54, 103, 29);

        pangkat3.setText("Pangkat3");
        pangkat3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pangkat3MouseClicked(evt);
            }
        });
        PanelOperasi.add(pangkat3);
        pangkat3.setBounds(296, 92, 101, 29);

        close.setText("Close");
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        PanelOperasi.add(close);
        close.setBounds(15, 168, 494, 29);

        polar.setText("Polar");
        polar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                polarMouseClicked(evt);
            }
        });
        PanelOperasi.add(polar);
        polar.setBounds(406, 92, 103, 29);

        display.setColumns(20);
        display.setRows(5);
        jScrollPane1.setViewportView(display);

        PanelInput.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.white, null, java.awt.Color.white));
        PanelInput.setToolTipText("Input");
        PanelInput.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PanelInput.setName("Input"); // NOI18N
        PanelInput.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        real1.setText("0");
        real1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                real1KeyReleased(evt);
            }
        });
        PanelInput.add(real1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 70, -1));

        imajiner1.setText("0");
        imajiner1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                imajiner1KeyReleased(evt);
            }
        });
        PanelInput.add(imajiner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 70, -1));

        Enter1.setText(">>");
        Enter1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Enter1MouseClicked(evt);
            }
        });
        PanelInput.add(Enter1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, -1, -1));

        jLabel2.setText("+");
        PanelInput.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, -1, 30));

        jLabel3.setText("i");
        PanelInput.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 45, -1, -1));

        jLabel1.setText("Bilangan Komplek2 = ");
        PanelInput.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 160, -1));

        Enter2.setText(">>");
        Enter2.setEnabled(false);
        Enter2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Enter2MouseClicked(evt);
            }
        });
        PanelInput.add(Enter2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, -1, -1));

        imajiner2.setText("0");
        imajiner2.setEnabled(false);
        imajiner2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                imajiner2KeyReleased(evt);
            }
        });
        PanelInput.add(imajiner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 70, -1));

        jLabel4.setText("i");
        PanelInput.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 75, -1, -1));

        jLabel5.setText("+");
        PanelInput.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, -1, 30));

        real2.setText("0");
        real2.setEnabled(false);
        real2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                real2KeyReleased(evt);
            }
        });
        PanelInput.add(real2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 70, -1));

        jLabel6.setText("Bilangan Komplek1 = ");
        PanelInput.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 160, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(PanelOperasi, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(PanelInput, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
                    .addComponent(salin2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(salin2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PanelInput, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(PanelOperasi, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hitungan(){
        switch (d){
            case 1:
                a.addkomplek(c);
            break;
            
            case 2:
                a.subkomplek(c);
            break;
            
            case 3:
                a.mulkomplek(c);
            break;
        }
        
        b += " "+ a.infokomplek();
        display.setText(b);
        f=a.infokomplek();
            
    }
    
    
    private void modulusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modulusMouseClicked
        display.setText(String.valueOf(a.modulus()));
        f= String.valueOf(a.modulus());
    }//GEN-LAST:event_modulusMouseClicked

    private void imajiner1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_imajiner1KeyReleased
        try{
            Double.valueOf(imajiner1.getText());
        }
        catch(Exception e){
            display.setText("Hanya masukan angka");
        }
    }//GEN-LAST:event_imajiner1KeyReleased

    private void Enter1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Enter1MouseClicked
        try{
            a.setReal(Double.valueOf(real1.getText()));
            a.setImajiner(Double.valueOf(imajiner1.getText()));
            b = a.infokomplek();
            display.setText(b);
        }
        catch(Exception e){
            display.setText("Hanya masukan angka");
        }
    }//GEN-LAST:event_Enter1MouseClicked

    private void real1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_real1KeyReleased
        try{
            Double.valueOf(real1.getText());
        }
        catch(Exception e){
            display.setText("Hanya masukan angka");
        }
    }//GEN-LAST:event_real1KeyReleased

    private void Enter2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Enter2MouseClicked
        try{
            c.setReal(Double.valueOf(real2.getText()));
            c.setImajiner(Double.valueOf(imajiner2.getText()));
            b += c.infokomplek() + ") = ";
            hitungan();
        }
        catch(Exception e){
            display.setText("Hanya masukan angka");
        }
        real2.setEnabled(false);
        imajiner2.setEnabled(false);
        Enter2.setEnabled(false);
    }//GEN-LAST:event_Enter2MouseClicked

    private void imajiner2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_imajiner2KeyReleased
        try{
            Double.valueOf(imajiner1.getText());
        }
        catch(Exception e){
            display.setText("Hanya masukan angka");
        }
    }//GEN-LAST:event_imajiner2KeyReleased

    private void real2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_real2KeyReleased
         try{
            Double.valueOf(real2.getText());
        }
        catch(Exception e){
            display.setText("Hanya masukan angka");
        }
    }//GEN-LAST:event_real2KeyReleased

    private void argumenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_argumenMouseClicked
        display.setText(String.valueOf(a.argument()));
        f= String.valueOf(a.argument());
    }//GEN-LAST:event_argumenMouseClicked

    private void konjugateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_konjugateMouseClicked
        a.konjugate();
        display.setText(a.infokomplek());
        f=a.infokomplek();
    }//GEN-LAST:event_konjugateMouseClicked

    private void tambahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tambahMouseClicked
        b+= " + (";
        real2.setEnabled(true);
        imajiner2.setEnabled(true);
        Enter2.setEnabled(true);
        d = 1;
    }//GEN-LAST:event_tambahMouseClicked

    private void kurangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kurangMouseClicked
        b+= " - (";
        real2.setEnabled(true);
        imajiner2.setEnabled(true);
        Enter2.setEnabled(true);
        d = 2;        
    }//GEN-LAST:event_kurangMouseClicked

    private void kaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kaliMouseClicked
        b+= " x (";
        real2.setEnabled(true);
        imajiner2.setEnabled(true);
        Enter2.setEnabled(true);
        d = 3;        
    }//GEN-LAST:event_kaliMouseClicked

    private void clearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseClicked
        real1.setText("0");
        real2.setText("0");
        imajiner1.setText("0");
        imajiner2.setText("0");
        a.setReal(0);
        a.setImajiner(0);
        b="";
        f="";
        salin2.setText(b);
        display.setText(b);
    }//GEN-LAST:event_clearMouseClicked

    private void pangkat2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pangkat2MouseClicked
       a.kuadrat();
        display.setText(a.infokomplek());
        f=a.infokomplek();
    }//GEN-LAST:event_pangkat2MouseClicked

    private void pangkat3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pangkat3MouseClicked
        a.pangkat3();
        display.setText(a.infokomplek());
        f=a.infokomplek();
    }//GEN-LAST:event_pangkat3MouseClicked

    private void polarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_polarMouseClicked
        display.setText(a.bentukpolar());
        f=a.bentukpolar();
    }//GEN-LAST:event_polarMouseClicked

    private void SalinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalinMouseClicked
        salin2.setText(f);
    }//GEN-LAST:event_SalinMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Enter1;
    private javax.swing.JButton Enter2;
    private javax.swing.JPanel PanelInput;
    private javax.swing.JPanel PanelOperasi;
    private javax.swing.JButton Salin;
    private javax.swing.JButton argumen;
    private javax.swing.JButton clear;
    private javax.swing.JButton close;
    private javax.swing.JTextArea display;
    private javax.swing.JTextField imajiner1;
    private javax.swing.JTextField imajiner2;
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
    private javax.swing.JTextField salin2;
    private javax.swing.JButton tambah;
    // End of variables declaration//GEN-END:variables

}

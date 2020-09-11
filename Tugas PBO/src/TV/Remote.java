package TV;
public class Remote extends javax.swing.JFrame {

    public Remote() {
        initComponents();
    }
    Smart_TV_GUI a = new Smart_TV_GUI();
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        On_Power = new javax.swing.JButton();
        On_Cable = new javax.swing.JButton();
        Volume_Up = new javax.swing.JButton();
        Volume_Down = new javax.swing.JButton();
        Channel_Up = new javax.swing.JButton();
        Channel_Down = new javax.swing.JButton();
        Return = new javax.swing.JButton();
        Mute = new javax.swing.JButton();
        Display = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);

        On_Power.setText("On Power");
        On_Power.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                On_PowerMouseClicked(evt);
            }
        });

        On_Cable.setText("On Cable");
        On_Cable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                On_CableMouseClicked(evt);
            }
        });

        Volume_Up.setText("Volume Up");
        Volume_Up.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Volume_UpMouseClicked(evt);
            }
        });

        Volume_Down.setText("Volume Down");
        Volume_Down.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Volume_DownMouseClicked(evt);
            }
        });

        Channel_Up.setText("Channel Up");
        Channel_Up.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Channel_UpMouseClicked(evt);
            }
        });

        Channel_Down.setText("Channel Down");
        Channel_Down.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Channel_DownMouseClicked(evt);
            }
        });

        Return.setText("Return");
        Return.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReturnMouseClicked(evt);
            }
        });

        Mute.setText("Mute");
        Mute.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MuteMouseClicked(evt);
            }
        });

        Display.setText("Display");
        Display.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DisplayMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(On_Cable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Channel_Up, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Channel_Down, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Return, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(On_Power, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Volume_Up, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Volume_Down, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Mute, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(Display, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(On_Power)
                    .addComponent(On_Cable))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Channel_Up)
                    .addComponent(Volume_Up, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Channel_Down)
                    .addComponent(Volume_Down))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Return)
                    .addComponent(Mute))
                .addGap(35, 35, 35)
                .addComponent(Display)
                .addContainerGap(401, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void On_PowerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_On_PowerMouseClicked
        a.ontv();
        if(a.getontv() == false)
            a.setVisible(false);
        else a.setVisible(true);
    }//GEN-LAST:event_On_PowerMouseClicked

    private void On_CableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_On_CableMouseClicked
        a.oncable();
    }//GEN-LAST:event_On_CableMouseClicked

    private void ReturnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReturnMouseClicked
        a.returnchannel();
    }//GEN-LAST:event_ReturnMouseClicked

    private void Channel_UpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Channel_UpMouseClicked
        a.channelup();
    }//GEN-LAST:event_Channel_UpMouseClicked

    private void Channel_DownMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Channel_DownMouseClicked
        a.channeldown();
    }//GEN-LAST:event_Channel_DownMouseClicked

    private void Volume_UpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Volume_UpMouseClicked
        a.volumeup();
    }//GEN-LAST:event_Volume_UpMouseClicked

    private void Volume_DownMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Volume_DownMouseClicked
        a.volumedown();
    }//GEN-LAST:event_Volume_DownMouseClicked

    private void MuteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MuteMouseClicked
        a.mute();
    }//GEN-LAST:event_MuteMouseClicked

    private void DisplayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DisplayMouseClicked
        a.display();
    }//GEN-LAST:event_DisplayMouseClicked
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Channel_Down;
    private javax.swing.JButton Channel_Up;
    private javax.swing.JButton Display;
    private javax.swing.JButton Mute;
    private javax.swing.JButton On_Cable;
    private javax.swing.JButton On_Power;
    private javax.swing.JButton Return;
    private javax.swing.JButton Volume_Down;
    private javax.swing.JButton Volume_Up;
    // End of variables declaration//GEN-END:variables
}

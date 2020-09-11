package TV;

public class Smart_TV_GUI extends javax.swing.JFrame {

    public boolean getontv(){
       return P.getontv();
    }
    
    public boolean getoncable(){
        return P.getoncable();
    }
    
    public void ontv(){
        if (P.getontv() == false)
            P.on();
        else 
            P.off();
    }
    
     public void oncable(){
        if (P.getoncable() == false)
            P.oncable();
        else 
            P.offcable();
    }
    
    public Smart_TV_GUI() {
        initComponents();
        Channel.setVisible(false);
        Volume_Bar.setVisible(false);
        Volume.setVisible(false);

    }
    
    public void channelup(){
        if(P.getoncable()==true&&P.getontv()==true){
        P.channelup();
        Channel.setText(String.valueOf(P.getchannel()));
        Channel.setVisible(true);
        }
    }
    
    public void channeldown(){
        if(P.getoncable()==true&&P.getontv()==true){
        P.channeldown();
        Channel.setText(String.valueOf(P.getchannel()));
        Channel.setVisible(true);
        }
    }
    
    
    public void mute(){
        if(P.getoncable()==true&&P.getontv()==true)
        P.mutevolume();
        Volume_Bar.setValue(P.getvolume());
        Volume.setText(String.valueOf(P.getvolume()));
        Volume_Bar.setVisible(true);
        Volume.setVisible(true);
        
    }
    
    public void returnchannel(){
        if(P.getoncable()==true&&P.getontv()==true)
        P.returnchannel();
        Channel.setText(String.valueOf(P.getchannel()));
    }
    
    public void display(){
        if(P.getontv()==true)
        Channel.setVisible(true);
        Volume_Bar.setVisible(true);
        Volume.setVisible(true);
    }
    
    public void volumeup(){
        if(P.getoncable()==true&&P.getontv()==true){
        P.volumeup();
        Volume_Bar.setValue(P.getvolume());
        Volume.setText(String.valueOf(P.getvolume()));
        Volume_Bar.setVisible(true);
        Volume.setVisible(true);
        }
    }
    
    public void volumedown(){
        if(P.getoncable()==true&&P.getontv()==true){
            P.volumedown();
            Volume_Bar.setValue(P.getvolume());
            Volume.setText(String.valueOf(P.getvolume()));
            Volume_Bar.setVisible(true);
            Volume.setVisible(true);
        }
    }
    smarttv P = new smarttv();
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Channel = new javax.swing.JLabel();
        Volume_Bar = new javax.swing.JProgressBar();
        Volume = new javax.swing.JLabel();
        TV_Image = new javax.swing.JLabel();
        Channel_Down = new javax.swing.JButton();
        Channel_Up = new javax.swing.JButton();
        Display = new javax.swing.JButton();
        Power = new javax.swing.JToggleButton();
        Volume_Up = new javax.swing.JButton();
        Volume_Down = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        Channel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(Channel);
        Channel.setBounds(650, 10, 50, 50);

        Volume_Bar.setMaximum(10);
        getContentPane().add(Volume_Bar);
        Volume_Bar.setBounds(166, 360, 400, 14);
        getContentPane().add(Volume);
        Volume.setBounds(120, 350, 40, 30);

        TV_Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TV/Image/Smart TV.JPG"))); // NOI18N
        getContentPane().add(TV_Image);
        TV_Image.setBounds(0, 0, 712, 467);

        Channel_Down.setText("Channel Down");
        Channel_Down.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Channel_DownMouseClicked(evt);
            }
        });
        getContentPane().add(Channel_Down);
        Channel_Down.setBounds(70, 500, 130, 29);

        Channel_Up.setText("Channel Up");
        Channel_Up.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Channel_UpMouseClicked(evt);
            }
        });
        getContentPane().add(Channel_Up);
        Channel_Up.setBounds(70, 470, 130, 29);

        Display.setText("Display");
        Display.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DisplayMouseClicked(evt);
            }
        });
        getContentPane().add(Display);
        Display.setBounds(450, 470, 90, 29);

        Power.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TV/Image/Button.JPG"))); // NOI18N
        Power.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PowerActionPerformed(evt);
            }
        });
        getContentPane().add(Power);
        Power.setBounds(650, 480, 30, 23);

        Volume_Up.setText("Volume Up");
        Volume_Up.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Volume_UpMouseClicked(evt);
            }
        });
        getContentPane().add(Volume_Up);
        Volume_Up.setBounds(230, 470, 150, 29);

        Volume_Down.setText("Volume Down");
        Volume_Down.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Volume_DownMouseClicked(evt);
            }
        });
        getContentPane().add(Volume_Down);
        Volume_Down.setBounds(230, 500, 150, 29);

        setSize(new java.awt.Dimension(757, 616));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Channel_UpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Channel_UpMouseClicked
        if(P.getoncable()==true&&P.getontv()==true){
        P.channelup();
        Channel.setText(String.valueOf(P.getchannel()));
        Channel.setVisible(true);
        }
    }//GEN-LAST:event_Channel_UpMouseClicked

    private void Channel_DownMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Channel_DownMouseClicked
        if(P.getoncable()==true&&P.getontv()==true){
        P.channeldown();
        Channel.setText(String.valueOf(P.getchannel()));
        Channel.setVisible(true);
        }
    }//GEN-LAST:event_Channel_DownMouseClicked

    private void DisplayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DisplayMouseClicked
        if(P.getoncable()==true&&P.getontv()==true)
        Channel.setVisible(true);
        Volume_Bar.setVisible(true);
        Volume.setVisible(true);
    }//GEN-LAST:event_DisplayMouseClicked

    private void PowerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PowerActionPerformed
        if(Power.isSelected()){
        P.on();
        P.oncable();
        }
        else{
        P.off();
        P.offcable();
        Channel.setVisible(false);
        Volume_Bar.setVisible(false);
        Volume.setVisible(false);
        }
    }//GEN-LAST:event_PowerActionPerformed

    private void Volume_UpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Volume_UpMouseClicked
        if(P.getoncable()==true&&P.getontv()==true){
        P.volumeup();
        Volume_Bar.setValue(P.getvolume());
        Volume.setText(String.valueOf(P.getvolume()));
        Volume_Bar.setVisible(true);
        Volume.setVisible(true);
        }
    }//GEN-LAST:event_Volume_UpMouseClicked

    private void Volume_DownMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Volume_DownMouseClicked
        if(P.getoncable()==true&&P.getontv()==true){
            P.volumedown();
            Volume_Bar.setValue(P.getvolume());
            Volume.setText(String.valueOf(P.getvolume()));
            Volume_Bar.setVisible(true);
            Volume.setVisible(true);
        }
    }//GEN-LAST:event_Volume_DownMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Channel;
    private javax.swing.JButton Channel_Down;
    private javax.swing.JButton Channel_Up;
    private javax.swing.JButton Display;
    private javax.swing.JToggleButton Power;
    private javax.swing.JLabel TV_Image;
    private javax.swing.JLabel Volume;
    private javax.swing.JProgressBar Volume_Bar;
    private javax.swing.JButton Volume_Down;
    private javax.swing.JButton Volume_Up;
    // End of variables declaration//GEN-END:variables
}

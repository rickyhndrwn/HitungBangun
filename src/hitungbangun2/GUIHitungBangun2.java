package hitungbangun2;

import java.text.DecimalFormat;

public class GUIHitungBangun2 extends javax.swing.JFrame {
    public GUIHitungBangun2(){
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        sisi = new javax.swing.JLabel();
        jari = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        clear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        sisi.setText("Sisi (cm):");
        jPanel1.add(sisi);
        sisi.setBounds(10, 40, 80, 30);

        jari.setText("Jari-jari (cm):");
        jPanel1.add(jari);
        jari.setBounds(10, 10, 80, 30);

        jariText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jariTextKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jariTextKeyTyped(evt);
            }
        });
        jPanel1.add(jariText);
        jariText.setBounds(90, 10, 160, 30);

        sisiText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sisiTextKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sisiTextKeyTyped(evt);
            }
        });
        jPanel1.add(sisiText);
        sisiText.setBounds(90, 40, 160, 30);

        jLabel1.setText("Keliling Lingkaran:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 120, 140, 30);

        kelilingL.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(kelilingL);
        kelilingL.setBounds(170, 120, 150, 30);

        jLabel3.setText("Volum Bola:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 160, 140, 30);

        jLabel4.setText("Luas Lingkaran:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 80, 140, 30);

        luasL.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(luasL);
        luasL.setBounds(170, 80, 150, 30);

        volumB.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(volumB);
        volumB.setBounds(170, 160, 150, 30);

        jLabel7.setText("Keliling Persegi:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 240, 140, 30);

        kelilingP.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(kelilingP);
        kelilingP.setBounds(170, 240, 150, 30);

        jLabel9.setText("Volum Kubus:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(10, 280, 140, 30);

        jLabel10.setText("Luas Persegi:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(10, 200, 140, 30);

        luasP.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(luasP);
        luasP.setBounds(170, 200, 150, 30);

        volumK.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(volumK);
        volumK.setBounds(170, 280, 150, 30);

        clear.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel1.add(clear);
        clear.setBounds(260, 10, 63, 60);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jariTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jariTextKeyReleased
        HitungBangun2 hB = new HitungBangun2();
        hB.luasLingkaran(Integer.parseInt(jariText.getText()));
        
        hB.kelilingLingkaran(Integer.parseInt(jariText.getText()));
        
        hB.volumBola(Integer.parseInt(jariText.getText()));
    }//GEN-LAST:event_jariTextKeyReleased

    private void jariTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jariTextKeyTyped
        if(!(Character.isDigit(evt.getKeyChar()))){
            evt.consume();
        }
    }//GEN-LAST:event_jariTextKeyTyped

    private void sisiTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sisiTextKeyReleased
        HitungBangun2 hB = new HitungBangun2();
        hB.luasPersegi(Integer.parseInt(sisiText.getText()));
        
        hB.kelilingPersegi(Integer.parseInt(sisiText.getText()));
        
        hB.volumKubus(Integer.parseInt(sisiText.getText()));
    }//GEN-LAST:event_sisiTextKeyReleased

    private void sisiTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sisiTextKeyTyped
        // TODO add your handling code here:
        if(!(Character.isDigit(evt.getKeyChar()))){
            evt.consume();
        }
    }//GEN-LAST:event_sisiTextKeyTyped

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        HitungBangun2 hB = new HitungBangun2();
        hB.clear();
    }//GEN-LAST:event_clearActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIHitungBangun2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new GUIHitungBangun2().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jari;
    public final javax.swing.JTextField jariText = new javax.swing.JTextField();
    public final javax.swing.JLabel kelilingL = new javax.swing.JLabel();
    public final javax.swing.JLabel kelilingP = new javax.swing.JLabel();
    public final javax.swing.JLabel luasL = new javax.swing.JLabel();
    public final javax.swing.JLabel luasP = new javax.swing.JLabel();
    private javax.swing.JLabel sisi;
    public final javax.swing.JTextField sisiText = new javax.swing.JTextField();
    public final javax.swing.JLabel volumB = new javax.swing.JLabel();
    public final javax.swing.JLabel volumK = new javax.swing.JLabel();
    // End of variables declaration//GEN-END:variables
}

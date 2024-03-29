/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author yunuspektas
 */
public class KelimeveHarfSayısı extends javax.swing.JFrame {

    /**
     * Creates new form KelimeveHarfSayısı
     */
    public KelimeveHarfSayısı() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        yazi_alani = new javax.swing.JTextArea();
        goster = new javax.swing.JButton();
        kelime_alani = new javax.swing.JLabel();
        harf_alani = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kelime ve Harf Sayısı");

        yazi_alani.setColumns(20);
        yazi_alani.setRows(5);
        jScrollPane1.setViewportView(yazi_alani);

        goster.setText("Kelime ve Harf Sayısı Göster");
        goster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gosterActionPerformed(evt);
            }
        });

        kelime_alani.setText("Kelime Sayısı:");

        harf_alani.setText("Harf Sayısı:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(goster)
                .addContainerGap(106, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(kelime_alani)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(harf_alani)
                .addGap(86, 86, 86))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kelime_alani)
                    .addComponent(harf_alani))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(goster)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gosterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gosterActionPerformed
   String yazi = yazi_alani.getText(); // getText ile textarea dan yazımızı aldık
   
   int karakter_sayisi = 0;
   int kelime_sayisi = 0 ;
   
        for (int i = 0 ; i < yazi.length()  ; i++) {
            if (yazi.charAt(i) != ' ') { // " " boşluk kontrolü için bu değil. ' ' bu kullanılır
                //charAt ile indexdeki karakterimizi direkt alabiliyorduk
                // boşlukları almak istemedik
                
                karakter_sayisi++;
         
                
            }
        }
       String[] kelime_array =  yazi.split(" "); //split yazımızı girdiğimiz değere göre parşçalıyor  
   // split metodu string array[] ile tanımlandığı için string arraye eşitlememiz gerekiy
   
        for (String kelime : kelime_array) {
            kelime_sayisi++;
        }
        
        kelime_alani.setText("Kelime Sayısı : " + kelime_sayisi);
       harf_alani.setText("Harf Sayısı : " + karakter_sayisi);
   
    }//GEN-LAST:event_gosterActionPerformed

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
            java.util.logging.Logger.getLogger(KelimeveHarfSayısı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KelimeveHarfSayısı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KelimeveHarfSayısı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KelimeveHarfSayısı.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KelimeveHarfSayısı().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton goster;
    private javax.swing.JLabel harf_alani;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel kelime_alani;
    private javax.swing.JTextArea yazi_alani;
    // End of variables declaration//GEN-END:variables
}

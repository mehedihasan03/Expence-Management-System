/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application.DataConnector;

import Application.LogInPage;
import javax.swing.UIManager;

/**
 *
 * @author 88016
 */
public class Splash extends javax.swing.JFrame {

    /**
     * Creates new form Splash
     */
    public Splash() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loadingBar = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        loadvalue = new javax.swing.JLabel();
        loadText = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loadingBar.setBackground(new java.awt.Color(51, 51, 51));
        getContentPane().add(loadingBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 760, 30));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\88016\\Downloads\\ex_bg-removebg-preview (1).png")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -50, 310, 200));

        loadvalue.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        loadvalue.setText("0%");
        getContentPane().add(loadvalue, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 440, 60, 30));

        loadText.setBackground(new java.awt.Color(255, 255, 255));
        loadText.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        loadText.setText("Loading....");
        getContentPane().add(loadText, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 180, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon("G:\\J2EE\\Advance_JAVA\\login bg\\aplash.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        
        /* Create and display the form */
        
        Splash splash = new Splash();
        splash.setVisible(true);
        
        try {
            for (int i = 0; i < 100; i++) {
                Thread.sleep(20);
                splash.loadvalue.setText(i + "%");
                
                if(i==30){
                    splash.loadText.setText("Starting...");
                }
                if(i==55){
                    splash.loadText.setText("Connecting...");
                }
                if(i==80){
                    splash.loadText.setText("Opening...");
                }
                splash.loadingBar.setValue(i);
            }
            
            
        } catch (InterruptedException e) {
            
        }
        splash.dispose();
        new LogInPage().setVisible(true);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel loadText;
    private javax.swing.JProgressBar loadingBar;
    private javax.swing.JLabel loadvalue;
    // End of variables declaration//GEN-END:variables
}

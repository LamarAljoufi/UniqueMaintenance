/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

/**
 *
 * @author ra52m
 */
public class receipt extends javax.swing.JFrame {

    /**
     * Creates new form receipt
     */
    public receipt() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setForeground(new java.awt.Color(0, 0, 51));
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 400, 150, 50));

        jLabel2.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 153));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 510, 90, 24));

        jLabel3.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 153));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 540, 180, 20));

        jLabel4.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 153));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 590, 130, 20));

        jLabel5.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 153));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 640, 110, 20));

        jLabel6.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 0, 153));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 720, 280, 40));

        jLabel7.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 0, 153));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 760, 120, 30));

        jLabel8.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 0, 153));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 810, 150, 20));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 810, 110, 30));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 0, 153));
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 480, 90, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/8.gif"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(receipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new receipt().setVisible(true);

            }
        });
    }

    public void setGender(String g) {
        jLabel2.setText(g);
    } // Set Gender

    public void setName(String g) {
        jLabel3.setText(g);
    } // Set Name

    public void setPhone(String g) {
        jLabel4.setText(g);
    } // Set Phone

    public void setDeviceInfo(String g) {
        jLabel5.setText(g);
    } // Set Device Info

    public void setOrderInfo(String g) {
        jLabel6.setText(g);
    } // Set order Info

    public void setLocation(String g) {
        jLabel7.setText(g);
    } // Set location

    public void setTime(String g) {
        jLabel8.setText(g);
    } // Set Time
    
    public void Random(String g) {
        jLabel10.setText(g);
    } // Random Number for ID
    
    // additional for payment
     public void PaymentMethod(String g) {
        jLabel11.setText(g);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    public static javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

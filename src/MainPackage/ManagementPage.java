package MainPackage;

public class ManagementPage extends javax.swing.JFrame {

    public ManagementPage() {
        initComponents();
    }

    ManagementPage(String un) {
        this();
        jLabel2.setText("Logged in as: " + un);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbtnRegisterUser = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jbtnRegisterVehicle = new javax.swing.JButton();
        jbtnSearchVehicle = new javax.swing.JButton();
        jbtnRemoveVehicle = new javax.swing.JButton();
        btnRemoveUser = new javax.swing.JButton();
        jbtnCheckDurationVehicle = new javax.swing.JButton();
        jbtnOverdueVehicles = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbtnRegisterUser.setForeground(new java.awt.Color(255, 0, 51));
        jbtnRegisterUser.setText("Register new managment user");
        jbtnRegisterUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegisterUserActionPerformed(evt);
            }
        });

        jbtnRegisterVehicle.setForeground(new java.awt.Color(255, 153, 0));
        jbtnRegisterVehicle.setText("Register new vehicle");
        jbtnRegisterVehicle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegisterVehicleActionPerformed(evt);
            }
        });

        jbtnSearchVehicle.setForeground(new java.awt.Color(204, 204, 0));
        jbtnSearchVehicle.setText("Search for vehicle");
        jbtnSearchVehicle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSearchVehicleActionPerformed(evt);
            }
        });

        jbtnRemoveVehicle.setForeground(new java.awt.Color(0, 204, 51));
        jbtnRemoveVehicle.setText("Remove vehicles");
        jbtnRemoveVehicle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRemoveVehicleActionPerformed(evt);
            }
        });

        btnRemoveUser.setForeground(new java.awt.Color(0, 51, 255));
        btnRemoveUser.setText("Remove management user");
        btnRemoveUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveUserActionPerformed(evt);
            }
        });

        jbtnCheckDurationVehicle.setForeground(new java.awt.Color(153, 0, 153));
        jbtnCheckDurationVehicle.setText("Check duration of vehicle");
        jbtnCheckDurationVehicle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCheckDurationVehicleActionPerformed(evt);
            }
        });

        jbtnOverdueVehicles.setText("Check overdue vehicles");
        jbtnOverdueVehicles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnOverdueVehiclesActionPerformed(evt);
            }
        });

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(64, 64, 64))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jbtnOverdueVehicles)
                    .addComponent(jbtnRegisterVehicle)
                    .addComponent(jbtnRegisterUser)
                    .addComponent(jbtnSearchVehicle)
                    .addComponent(jbtnRemoveVehicle)
                    .addComponent(btnRemoveUser)
                    .addComponent(jbtnCheckDurationVehicle))
                .addContainerGap(137, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jbtnRegisterUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnRegisterVehicle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnSearchVehicle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnRemoveVehicle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRemoveUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnCheckDurationVehicle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnOverdueVehicles)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnRegisterUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegisterUserActionPerformed
        this.setVisible(false);
        new ManagementUserRegistration().setVisible(true);
    }//GEN-LAST:event_jbtnRegisterUserActionPerformed

    private void jbtnRegisterVehicleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegisterVehicleActionPerformed
        this.setVisible(false);
        new ManagementVehicle().setVisible(true);
    }//GEN-LAST:event_jbtnRegisterVehicleActionPerformed

    private void jbtnSearchVehicleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSearchVehicleActionPerformed
        this.setVisible(false);
        new ManagementSearchVehicle().setVisible(true);
    }//GEN-LAST:event_jbtnSearchVehicleActionPerformed

    private void jbtnRemoveVehicleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRemoveVehicleActionPerformed
        this.setVisible(false);
        new ManagementRemoveVehicle().setVisible(true);
    }//GEN-LAST:event_jbtnRemoveVehicleActionPerformed

    private void btnRemoveUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveUserActionPerformed
        this.setVisible(false);
        new ManagementRemoveUser().setVisible(true);
    }//GEN-LAST:event_btnRemoveUserActionPerformed

    private void jbtnCheckDurationVehicleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCheckDurationVehicleActionPerformed
        this.setVisible(false);
        new ManagementCheckDuration().setVisible(true);
    }//GEN-LAST:event_jbtnCheckDurationVehicleActionPerformed

    private void jbtnOverdueVehiclesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnOverdueVehiclesActionPerformed
        this.setVisible(false);
        new ManagementOverdueVehicle().setVisible(true);
    }//GEN-LAST:event_jbtnOverdueVehiclesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        new VehicleUserIdentification().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ManagementPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagementPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagementPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagementPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagementPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRemoveUser;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jbtnCheckDurationVehicle;
    private javax.swing.JButton jbtnOverdueVehicles;
    private javax.swing.JButton jbtnRegisterUser;
    private javax.swing.JButton jbtnRegisterVehicle;
    private javax.swing.JButton jbtnRemoveVehicle;
    private javax.swing.JButton jbtnSearchVehicle;
    // End of variables declaration//GEN-END:variables
}

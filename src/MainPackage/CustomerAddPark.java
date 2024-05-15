package MainPackage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CustomerAddPark extends javax.swing.JFrame {
    
    private int minutes = 0;
    private int cents = 0;
    Connection con = null;
    PreparedStatement pst = null;

    public CustomerAddPark() {
        initComponents();
        con = Connect.mycon();
    }
    
    private void updateTimeField() {
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        jlblTime.setText(String.format("%d:%02d", hours, remainingMinutes));
    }
    
    private void updatePriceField() {
        int euros = cents / 100;
        int remainingCents = cents % 100;
        jlblPrice.setText(String.format("€ %d:%02d", euros, remainingCents));
    }
        
        

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtxtMake = new javax.swing.JTextField();
        jtxtModel = new javax.swing.JTextField();
        jtxtColour = new javax.swing.JTextField();
        jtxtNumberplate = new javax.swing.JTextField();
        jlblTime = new javax.swing.JLabel();
        add30Minutes = new javax.swing.JButton();
        add1Hour = new javax.swing.JButton();
        add2Hour = new javax.swing.JButton();
        jbtnCheckout = new javax.swing.JButton();
        jbtnBack = new javax.swing.JButton();
        jlblPrice = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtxtColour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtColourActionPerformed(evt);
            }
        });

        jlblTime.setText("00:00");

        add30Minutes.setText("+ 30 mins");
        add30Minutes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add30MinutesActionPerformed(evt);
            }
        });

        add1Hour.setText("+ 1 hour");
        add1Hour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add1HourActionPerformed(evt);
            }
        });

        add2Hour.setText("+ 2 hour");
        add2Hour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add2HourActionPerformed(evt);
            }
        });

        jbtnCheckout.setText("Checkout");
        jbtnCheckout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCheckoutActionPerformed(evt);
            }
        });

        jbtnBack.setText("Back");
        jbtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBackActionPerformed(evt);
            }
        });

        jlblPrice.setText("€ 0.00");

        jLabel1.setText("Make");

        jLabel2.setText("Model");

        jLabel3.setText("Colour");

        jLabel4.setText("Numberplate");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jlblTime))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(add30Minutes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(add1Hour)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(add2Hour)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtxtModel, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtxtMake, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtxtNumberplate, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtxtColour, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jbtnBack)
                                .addGap(47, 47, 47)
                                .addComponent(jbtnCheckout)
                                .addGap(101, 101, 101))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jlblPrice)
                                .addGap(123, 123, 123))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtMake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtColour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtNumberplate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(13, 13, 13)
                .addComponent(jlblTime)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add30Minutes)
                    .addComponent(add2Hour)
                    .addComponent(add1Hour))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jlblPrice)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnCheckout)
                    .addComponent(jbtnBack))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtColourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtColourActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtColourActionPerformed

    private void jbtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBackActionPerformed
        this.setVisible(false);
        new CustomerMainPage().setVisible(true);
    }//GEN-LAST:event_jbtnBackActionPerformed

    private void add30MinutesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add30MinutesActionPerformed
        minutes = minutes + 30;
        cents = cents + 50;
        updateTimeField();
        updatePriceField();
    }//GEN-LAST:event_add30MinutesActionPerformed

    private void add1HourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add1HourActionPerformed
        minutes = minutes + 60;
        cents = cents + 100;
        updateTimeField();
        updatePriceField();
    }//GEN-LAST:event_add1HourActionPerformed

    private void add2HourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add2HourActionPerformed
        minutes = minutes + 120;
        cents = cents + 200;
        updateTimeField();
        updatePriceField();
    }//GEN-LAST:event_add2HourActionPerformed

    private void jbtnCheckoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCheckoutActionPerformed
        try
        {
            int duration;
            String make,model,colour,numberplate;
            make = jtxtMake.getText();
            model = jtxtModel.getText();
            colour = jtxtColour.getText();
            numberplate = jtxtNumberplate.getText();
            duration = minutes;

            pst = con.prepareStatement("INSERT INTO vehicles (make,model,colour,numberplate,duration) VALUES (?,?,?,?,?)");

            pst.setString(1,make);
            pst.setString(2,model);
            pst.setString(3,colour);
            pst.setString(4,numberplate); 
            pst.setInt(5, duration);

            pst.executeUpdate();

            JOptionPane.showMessageDialog(this,"Thanks for using our services.");
        }
        catch (SQLException ex)
        {
            Logger.getLogger(CustomerAddPark.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnCheckoutActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerAddPark.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerAddPark.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerAddPark.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerAddPark.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerAddPark().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add1Hour;
    private javax.swing.JButton add2Hour;
    private javax.swing.JButton add30Minutes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jbtnBack;
    private javax.swing.JButton jbtnCheckout;
    private javax.swing.JLabel jlblPrice;
    private javax.swing.JLabel jlblTime;
    private javax.swing.JTextField jtxtColour;
    private javax.swing.JTextField jtxtMake;
    private javax.swing.JTextField jtxtModel;
    private javax.swing.JTextField jtxtNumberplate;
    // End of variables declaration//GEN-END:variables
}

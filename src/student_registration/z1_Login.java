package student_registration;

import java.awt.Color;
import javax.swing.JOptionPane;


public class z1_Login extends javax.swing.JFrame {

    connect c = new connect();
//z1_Login z1=new z1_Login();

    public z1_Login() {
        initComponents();
        username.setBackground(new Color(210,28,80,80));
        Password.setBackground(new Color(210,28,80,80));
               }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        Password = new javax.swing.JPasswordField();
        username = new javax.swing.JTextField();
        Next = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        panel1.setBackground(new java.awt.Color(0, 51, 51));
        panel1.setForeground(new java.awt.Color(153, 255, 153));
        panel1.setLayout(null);

        Password.setBackground(java.awt.SystemColor.inactiveCaption);
        panel1.add(Password);
        Password.setBounds(290, 220, 180, 40);

        username.setBackground(java.awt.SystemColor.inactiveCaption);
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        panel1.add(username);
        username.setBounds(290, 140, 180, 40);

        Next.setBackground(java.awt.Color.lightGray);
        Next.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        Next.setText("Login");
        Next.setToolTipText("");
        Next.setMaximumSize(new java.awt.Dimension(95, 29));
        Next.setMinimumSize(new java.awt.Dimension(95, 29));
        Next.setPreferredSize(new java.awt.Dimension(95, 29));
        Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextActionPerformed(evt);
            }
        });
        panel1.add(Next);
        Next.setBounds(330, 280, 90, 50);

        jLabel1.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Usre Name");
        panel1.add(jLabel1);
        jLabel1.setBounds(290, 100, 120, 40);

        jLabel2.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabel2.setText("Password ");
        panel1.add(jLabel2);
        jLabel2.setBounds(290, 180, 130, 40);

        jLabel5.setForeground(new java.awt.Color(255, 0, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/123.jpg"))); // NOI18N
        panel1.add(jLabel5);
        jLabel5.setBounds(-70, -30, 680, 430);

        getContentPane().add(panel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed

    }//GEN-LAST:event_usernameActionPerformed

    private void NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextActionPerformed
        z1_Login g1 = new z1_Login();
        z2_Students st1 = new z2_Students();
        String s1, s2;
        s1 = username.getText();
        s2 = Password.getText();
        try {
            c.rs = c.stmt.executeQuery("select * from Login where Username='" + s1 + "' and Password='" + s2 + "'");
            if (c.rs.next()) {
                st1.setLocationRelativeTo(st1);
                st1.setTitle("Informations");
                st1.setVisible(true);
                st1.setSize(922, 722);
                st1.setLocation(220, 10);
                this.dispose();
            } else {
                JOptionPane.showConfirmDialog(null, "UesrName Or Password Error");
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "There was a problem with the connection");
        }
        //------------------------------------------------------------
        /*Gate g1=new Gate();
       Students st1=new Students();
       if (username.getText().equalsIgnoreCase("mohemd")&&Password.getText().equalsIgnoreCase("ali12345")) {
           st1.setTitle("Student_Registration");
           st1.setLocationRelativeTo(st1);
           st1.setVisible(true);
           g1.setVisible(false);
           g1.setEnabled(false);
          
       }else
             JOptionPane.showMessageDialog(null, "error");*/

    }//GEN-LAST:event_NextActionPerformed

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
            java.util.logging.Logger.getLogger(z1_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(z1_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(z1_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(z1_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new z1_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Next;
    private javax.swing.JPasswordField Password;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private java.awt.Panel panel1;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}

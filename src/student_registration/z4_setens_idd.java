package student_registration;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class z4_setens_idd extends javax.swing.JFrame {
z1_Login  z1=new z1_Login();

    connect c = new connect();
    String s = "q";//مايعيد بعد

    public z4_setens_idd() {
        initComponents();
         jTable1.setBackground(new Color(0,0,0,0));
        ((DefaultTableCellRenderer)jTable1.getDefaultRenderer(Object.class)).setBackground(new Color(0,0,0,80));
        jTable1.setGridColor(Color.black);
        jTable1.setForeground(Color.black);
        
        jScrollPane1.setBackground(new Color(0,0,0,80));
                jScrollPane1.setOpaque(false);
                jTable1.setOpaque(false);
                // jTable1.setBackground(new Color(0,0,0,80));
                ((DefaultTableCellRenderer)jTable1.getDefaultRenderer(Object.class)).setOpaque(false);
                jScrollPane1.getViewport().setOpaque(false);
        
    }
    void updet(){ //للحذف
            String sgl = "select * from Login";
            try {
             c.pd=c.con.prepareStatement(sgl);
             c.rs=c.pd.executeQuery();
             jTable1.setModel(DbUtils.resultSetToTableModel(c.rs));
             
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }finally{
                try {
                    c.rs.close();
                    c.pd.close();
                } catch (Exception e) {
                }
            }
    } 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jTable1.setBackground(new java.awt.Color(182, 89, 6));
        jTable1.setFont(new java.awt.Font("MV Boli", 1, 20)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "USERNAME", "PASSWORD"
            }
        ));
        jTable1.setRowHeight(35);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 10, 281, 267);

        jButton1.setBackground(new java.awt.Color(172, 87, 21));
        jButton1.setActionCommand("Review");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jButton1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButton1.setLabel("Review");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(343, 10, 140, 57);

        jButton2.setBackground(new java.awt.Color(172, 87, 21));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/add user.jpg"))); // NOI18N
        jButton2.setText("Add user ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(343, 80, 140, 56);

        jButton4.setBackground(new java.awt.Color(172, 87, 21));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/open.jpg"))); // NOI18N
        jButton4.setText("back");
        jButton4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(343, 220, 140, 55);

        jButton3.setBackground(new java.awt.Color(172, 87, 21));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Exit.jpg"))); // NOI18N
        jButton3.setText("delet");
        jButton3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(343, 150, 140, 58);

        jLabel1.setBackground(new java.awt.Color(0, 255, 153));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/apple 2.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-10, -20, 570, 360);

        jMenuBar1.setBackground(new java.awt.Color(153, 153, 255));
        jMenuBar1.setAutoscrolls(true);

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/login-o.png"))); // NOI18N
        jMenuItem1.setText("Login");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Student");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuItem3.setText("jMenuItem3");
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (s == "q") {
            try {
                String sgl = "select * from Login";
                c.rs = c.stmt.executeQuery(sgl);
                while (c.rs.next()) {
                    String Username = c.rs.getString("Username");
                    String Password = c.rs.getString("Password");

                    String tbData[] = {Username, Password};
                    DefaultTableModel tblmodel = (DefaultTableModel) jTable1.getModel();
                    tblmodel.addRow(tbData);
                }

            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, "Error calling data");
            }

        }
        s = "w";

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String s1 = JOptionPane.showInputDialog("enter username");
        String s2 = JOptionPane.showInputDialog("enter password");
        try {
            c.rs = c.stmt.executeQuery("select * from Idmin where username='" + s1 + "' and password='" + s2 + "'");
            if (c.rs.next()) {

                z5_AddUser g1 = new z5_AddUser();
                g1.setLocationRelativeTo(g1);
                g1.setVisible(true);
                g1.setEnabled(true);
                g1.setTitle("Security");
                g1.setLocation(250, 150);
                g1.setSize(455, 340);
            } else {
                JOptionPane.showConfirmDialog(null, "UesrName Or Password Error");
            }

        } catch (Exception e) {

            JOptionPane.showConfirmDialog(null, "Error in connection");
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        z3_Stenge_more g1 = new z3_Stenge_more();
        g1.setLocationRelativeTo(g1);
        g1.setVisible(true);
        g1.setEnabled(true);
         g1.setSize(855, 560);
        g1.setLocation(250,50);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String s1 = JOptionPane.showInputDialog("enter username");
        String s2 = JOptionPane.showInputDialog("enter password");
        try {
            c.rs = c.stmt.executeQuery("select * from Idmin where username='" + s1 + "' and password='" + s2 + "'");
            if (c.rs.next()) {

                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                int selectedIndex = jTable1.getSelectedRow();
//        int id = Integer.parseInt(model.getValueAt(selectedIndex, 0).toString());
                String id = model.getValueAt(selectedIndex, 0).toString();
                int dialogresult = JOptionPane.showConfirmDialog(null, "do you want delet", "waring", JOptionPane.YES_NO_OPTION);
                if (dialogresult == JOptionPane.YES_NO_OPTION) {
                    try {
                        c.pd = c.con.prepareStatement("delete from  Login where Username = ?");
                        c.pd.setString(1, id);
                        c.pd.executeUpdate();
                        JOptionPane.showMessageDialog(this, "recor deleted");
                        updet();

                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(this, " error");
                    }
                }
            } else {
                JOptionPane.showConfirmDialog(null, "UesrName Or Password Error");
            }

        } catch (Exception e) {

            JOptionPane.showConfirmDialog(null, "Error in connection");
        }
//--------------------------------------------------------------------        
//     DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
//        int selectedIndex=jTable1.getSelectedRow();
//      //  int id = Integer.parseInt(model.getValueAt(selectedIndex, 0).toString());
//      String id= model.getValueAt(selectedIndex, 0).toString();
//        int dialogresult=JOptionPane.showConfirmDialog(null, "do you want delet","waring",JOptionPane.YES_NO_OPTION);
//        if(dialogresult== JOptionPane.YES_NO_OPTION){
//            try {
//                c.pd=c.con.prepareStatement("delete from  Login where Username = ?");
//                c.pd.setString(1, id);
//                c.pd.executeUpdate();
//                JOptionPane.showMessageDialog(this, "recor deleted");
//                updet();
//                
//            } catch (Exception e) {
//                 JOptionPane.showMessageDialog(this, " error");
//            }
//        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        z1.setTitle("Login");
    //  st.setLocationRelativeTo(st);
       z1.setLocation(300, 150);
        z1.setSize(556,400);
        z1.setVisible(true);
        this.dispose();  
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       z2_Students st1 = new z2_Students();
        st1.setTitle("Student_Registration");
        st1.setLocationRelativeTo(st1);
         st1.setSize(922, 722);
        st1.setLocation(220, 10);
        st1.setVisible(true);
        int i = jTable1.getSelectedRow();
        st1.txID.setText(jTable1.getModel().getValueAt(i, 0).toString());
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(z4_setens_idd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(z4_setens_idd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(z4_setens_idd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(z4_setens_idd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new z4_setens_idd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}

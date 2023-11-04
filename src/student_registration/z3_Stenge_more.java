package student_registration;

import java.awt.Color;
import java.text.MessageFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;

public class z3_Stenge_more extends javax.swing.JFrame {
      // z2_Students z2 = new z2_Students();
       z1_Login  z1=new z1_Login();

  
    int t = 0;
        int t1 = 0;
    connect c = new connect();
    DefaultTableModel tblmodel;

    public void updet() { //للحذف
        String sgl = "select * from informashn";
        try {
            c.pd = c.con.prepareStatement(sgl);
            c.rs = c.pd.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(c.rs));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                c.rs.close();
                c.pd.close();
            } catch (Exception e) {
            }
        }
    }
public void delet(){
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int selectedIndex = jTable1.getSelectedRow();
        //  int id = Integer.parseInt(model.getValueAt(selectedIndex, 0).toString());
        String id = model.getValueAt(selectedIndex, 0).toString();
        int dialogresult = JOptionPane.showConfirmDialog(null, "do you want delet", "waring", JOptionPane.YES_NO_OPTION);
        if (dialogresult == JOptionPane.YES_NO_OPTION) {
            try {
                c.pd = c.con.prepareStatement("delete from  informashn where id = ?");
                c.pd.setString(1, id);
                c.pd.executeUpdate();
                JOptionPane.showMessageDialog(this, "recor deleted");
            //    updet();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, " error");
            }
        }
}
    public z3_Stenge_more() {
        initComponents();
        jButton6.setVisible(false);
        jButton5.setVisible(false);

        jTable1.setBackground(new Color(0, 0, 0, 0));
        ((DefaultTableCellRenderer) jTable1.getDefaultRenderer(Object.class)).setBackground(new Color(0, 0, 0, 0));
        jTable1.setGridColor(Color.BLUE);
        jTable1.setForeground(Color.RED);
        jScrollPane1.setBackground(new Color(0,0,0, 0));
//       jScrollPane1.setBackground(new Color(210, 28, 80, 100));
//       jScrollPane1.setOpaque(false);
//       jTable1.setOpaque(false);
    // jScrollPane1.setBackground(new Color(249,155,249, 150));
     //jTable1.setBackground(new Color(249,155,249, 150));
        jScrollPane1.setOpaque(false);
        jTable1.setOpaque(false);
        ((DefaultTableCellRenderer) jTable1.getDefaultRenderer(Object.class)).setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);

    }

    public void serch(String str) {
        tblmodel = (DefaultTableModel) jTable1.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(tblmodel);
        jTable1.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setFont(new java.awt.Font("MV Boli", 2, 14)); // NOI18N
        jButton2.setText("Show_User");
        jButton2.setActionCommand("Show User");
        jButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(260, 430, 110, 50);

        jButton3.setBackground(new java.awt.Color(102, 102, 102));
        jButton3.setFont(new java.awt.Font("MV Boli", 3, 14)); // NOI18N
        jButton3.setText("sho_student");
        jButton3.setActionCommand("show_studanet");
        jButton3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton3.setInheritsPopupMenu(true);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(370, 430, 130, 50);

        jButton4.setBackground(new java.awt.Color(102, 102, 102));
        jButton4.setFont(new java.awt.Font("MV Boli", 2, 18)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/open.jpg"))); // NOI18N
        jButton4.setText("back");
        jButton4.setAlignmentX(0.6F);
        jButton4.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        jButton4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton4.setRolloverEnabled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(130, 430, 130, 50);

        jTable1.setBackground(new java.awt.Color(153, 153, 153));
        jTable1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Emaile", "Number", "Governorate", "BirthDaye", "Sex", "University", "Stage", "Img"
            }
        ));
        jTable1.setAutoscrolls(false);
        jTable1.setFocusTraversalPolicyProvider(true);
        jTable1.setRowHeight(30);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 140, 820, 270);

        jPanel2.setLayout(null);
        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 534, 0, 0);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(350, 100, 190, 40);

        jButton6.setBackground(new java.awt.Color(255, 0, 0));
        jButton6.setFont(new java.awt.Font("MV Boli", 2, 18)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Exit.jpg"))); // NOI18N
        jButton6.setText("Delete");
        jButton6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(710, 430, 120, 50);

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Find a record");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(200, 100, 150, 40);

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("MV Boli", 2, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icon edit1.jpg"))); // NOI18N
        jButton1.setText("Edit Record");
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(501, 430, 209, 50);

        jButton5.setBackground(new java.awt.Color(255, 51, 51));
        jButton5.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        jButton5.setText("PrntPDF");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(30, 430, 100, 50);

        jLabel1.setBackground(new java.awt.Color(204, 255, 204));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/كيبورد كوب.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 850, 500);

        jMenuBar1.setBackground(new java.awt.Color(153, 153, 255));

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/login-o.png"))); // NOI18N
        jMenuItem1.setText("Loigin");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/add user.jpg"))); // NOI18N
        jMenuItem2.setText("Admin");
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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        z4_setens_idd g1 = new z4_setens_idd();
        g1.setLocationRelativeTo(g1);
        g1.setVisible(true);
        g1.setTitle("Admin Manage");
        g1.setEnabled(true);
        g1.setSize(575, 390);
        g1.setLocation(350, 200);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        z2_Students st1 = new z2_Students();
        st1.setTitle("Student_Registration");
        st1.setLocationRelativeTo(st1);
         st1.setSize(922, 722);
        st1.setLocation(220, 10);
        st1.setVisible(true);
        int i = jTable1.getSelectedRow();
        st1.txID.setText(jTable1.getModel().getValueAt(i, 0).toString());
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (t == 0) {
            try {

                String sgl = "select * from informashn";
                c.rs = c.stmt.executeQuery(sgl);
                while (c.rs.next()) {
                    //   String id=String.valueOf(rs.getInt("id"));//للقيمه الي تكون انتجر
                    String id = c.rs.getString("id");
                    String namestudent = c.rs.getString("namestudent");
                    String emal = c.rs.getString("emel");
                    String number = c.rs.getString("number");
                    String gove = c.rs.getString("gove");
                    String dateofbirth = c.rs.getString("dataofbe");
                    String sex = c.rs.getString("sex");
                    String univ = c.rs.getString("uneverse");
                    String stag = c.rs.getString("stage");
                    String img = c.rs.getString("imege");//لان معرفه مرفق

                    String tbData[] = {id, namestudent, emal, number, gove, dateofbirth, sex, univ, stag, img};
                    tblmodel = (DefaultTableModel) jTable1.getModel();
                    tblmodel.addRow(tbData);
                }

            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, "Error calling data");
            }

        }
        t = 1;
        jButton6.setVisible(true);
        jButton5.setVisible(true);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        String serch = jTextField1.getText();
        serch(serch);
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        /* DefaultTableModel model=(DefaultTableModel)jTable1.getModel(); اذا جان انتجر
        int selectedIndex=jTable1.getSelectedRow();
        int id = Integer.parseInt(model.getValueAt(selectedIndex, 0).toString());
        int dialogresult=JOptionPane.showConfirmDialog(null, "do you want delet","waring",JOptionPane.YES_NO_OPTION);
        if(dialogresult== JOptionPane.YES_NO_OPTION){
            try {
                c.pd=c.con.prepareStatement("delete from  informashn where id = ?");
                c.pd.setInt(1, id);
                c.pd.executeUpdate();
                JOptionPane.showMessageDialog(this, "recor deleted");
                updet();
                
            } catch (Exception e) {
            }
        }*/
        //----------------------------------------------------------------------------
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int selectedIndex = jTable1.getSelectedRow();
        //  int id = Integer.parseInt(model.getValueAt(selectedIndex, 0).toString());
        String id = model.getValueAt(selectedIndex, 0).toString();
        int dialogresult = JOptionPane.showConfirmDialog(null, "do you want delet", "waring", JOptionPane.YES_NO_OPTION);
        if (dialogresult == JOptionPane.YES_NO_OPTION) {
            try {
                c.pd = c.con.prepareStatement("delete from  informashn where id = ?");
                c.pd.setString(1, id);
                c.pd.executeUpdate();
                JOptionPane.showMessageDialog(this, "recor deleted");
                updet();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, " error");
            }
        }
        /*   DefaultTableModel table=(DefaultTableModel)jTable1.getModel();
               String serch=jTextField1.getText().toLowerCase();
               TableRowSorter<DefaultTableModel> tr=new TableRowSorter<DefaultTableModel>(table);
               jTable1.setRowSorter(tr);
               tr.setRowFilter(RowFilter.regexFilter(serch));*/
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       z1.setTitle("Login");
    //  st.setLocationRelativeTo(st);
        z1.setLocation(300, 150);
        z1.setSize(556,400);
        z1.setVisible(true);
        this.dispose();  
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        z2_Students z2 = new z2_Students();
        z2.setTitle("Student_Registration");
        z2.setSize(922, 722);
        z2.setLocation(220, 10);
        z2.setVisible(true);  
        int i = jTable1.getSelectedRow();
        z2.txID.setText(jTable1.getModel().getValueAt(i, 0).toString());
        z2.txNAME.setText(jTable1.getModel().getValueAt(i, 1).toString());
        z2.txEMAIL.setText(jTable1.getModel().getValueAt(i, 2).toString());
        z2.txnumber.setText(jTable1.getModel().getValueAt(i, 3).toString());
        String knoe = jTable1.getModel().getValueAt(i, 4).toString();
        switch (knoe) {
            case "البصره":
                z2.coGovernorate.setSelectedIndex(1);
                break;
            case "بغداد":
                z2.coGovernorate.setSelectedIndex(2);
                break;
            case "بابل":
                z2.coGovernorate.setSelectedIndex(3);
                break;
            case "ذي قار":
                z2.coGovernorate.setSelectedIndex(4);
                break;
            case "كربلاء":
                z2.coGovernorate.setSelectedIndex(5);
                break;
            case "نجف":
                z2.coGovernorate.setSelectedIndex(6);
                break;
            case "واسط":
                z2.coGovernorate.setSelectedIndex(7);
                break;
            case "نينوى":
                z2.coGovernorate.setSelectedIndex(8);
                break;
            case"ميسان":
                z2.coGovernorate.setSelectedIndex(9);
                break;
            case "المثنى":
                z2.coGovernorate.setSelectedIndex(10);
                break;
            case "كركوك":
                z2.coGovernorate.setSelectedIndex(11);
                break;
            case "صلاح الدين":
                z2.coGovernorate.setSelectedIndex(12);
                break;
            case "السليمانيه":
                z2.coGovernorate.setSelectedIndex(13);
                break;
            case "ديالى":
                z2.coGovernorate.setSelectedIndex(14);
                break;
            case "القادسيه":
                z2.coGovernorate.setSelectedIndex(15);
                break;
            case "دهوك":
                z2.coGovernorate.setSelectedIndex(16);
                break;
            case "الانبار":
                z2.coGovernorate.setSelectedIndex(17);
                break;
            case "أربيل":
                z2.coGovernorate.setSelectedIndex(18);
                break;
        }
         z2.date.setText(jTable1.getModel().getValueAt(i, 5).toString());
        String sex = jTable1.getModel().getValueAt(i, 6).toString();
        if (sex.equals("MALE")) {
            z2.MALE.setSelected(true);
        } else {
            z2.FEMALE.setSelected(true);
        }
        z2.txUniversity.setText(jTable1.getModel().getValueAt(i, 7).toString());
        String st = jTable1.getModel().getValueAt(i, 8).toString();
        switch (st) {
            case "First  Stage ":
                z2.costage.setSelectedIndex(1);
                break;
            case "Second Stage":
                z2.costage.setSelectedIndex(2);
                break;
            case "Third  Stage":
                z2.costage.setSelectedIndex(3);
                break;
            case "Fourth Stage":
                z2.costage.setSelectedIndex(4);
                break;
            case "Fifth  Stage":
                z2.costage.setSelectedIndex(5);
                break;
            case "Sixth  Stage":
                z2.costage.setSelectedIndex(6);
                break;
        }
        z2.path.setText(jTable1.getModel().getValueAt(i, 9).toString());
        z2.jButton2.setVisible(true);
  
       this.dispose();     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
//        z2_Students z2 = new z2_Students();
//         int i = jTable1.getSelectedRow();
//        z2.txID.setText(jTable1.getModel().getValueAt(i, 0).toString());
//        z2.txNAME.setText(jTable1.getModel().getValueAt(i, 1).toString());
//        z2.txEMAIL.setText(jTable1.getModel().getValueAt(i, 2).toString());
//        z2.txnumber.setText(jTable1.getModel().getValueAt(i, 3).toString());
//        String knoe = jTable1.getModel().getValueAt(i, 4).toString();
//        switch (knoe) {
//            case "البصره":
//                z2.coGovernorate.setSelectedIndex(1);
//                break;
//            case "بغداد":
//                z2.coGovernorate.setSelectedIndex(2);
//                break;
//            case "بابل":
//                z2.coGovernorate.setSelectedIndex(3);
//                break;
//            case "ذي قار":
//                z2.coGovernorate.setSelectedIndex(4);
//                break;
//            case "كربلاء":
//                z2.coGovernorate.setSelectedIndex(5);
//                break;
//            case "نجف":
//                z2.coGovernorate.setSelectedIndex(6);
//                break;
//            case "واسط":
//                z2.coGovernorate.setSelectedIndex(7);
//                break;
//            case "نينوى":
//                z2.coGovernorate.setSelectedIndex(8);
//                break;
//            case"ميسان":
//                z2.coGovernorate.setSelectedIndex(9);
//                break;
//            case "المثنى":
//                z2.coGovernorate.setSelectedIndex(10);
//                break;
//            case "كركوك":
//                z2.coGovernorate.setSelectedIndex(11);
//                break;
//            case "صلاح الدين":
//                z2.coGovernorate.setSelectedIndex(12);
//                break;
//            case "السليمانيه":
//                z2.coGovernorate.setSelectedIndex(13);
//                break;
//            case "ديالى":
//                z2.coGovernorate.setSelectedIndex(14);
//                break;
//            case "القادسيه":
//                z2.coGovernorate.setSelectedIndex(15);
//                break;
//            case "دهوك":
//                z2.coGovernorate.setSelectedIndex(16);
//                break;
//            case "الانبار":
//                z2.coGovernorate.setSelectedIndex(17);
//                break;
//            case "أربيل":
//                z2.coGovernorate.setSelectedIndex(18);
//                break;
//        }
//         z2.date.setText(jTable1.getModel().getValueAt(i, 5).toString());
//        String sex = jTable1.getModel().getValueAt(i, 6).toString();
//        if (sex.equals("MALE")) {
//            z2.MALE.setSelected(true);
//        } else {
//            z2.FEMALE.setSelected(true);
//        }
//        z2.txUniversity.setText(jTable1.getModel().getValueAt(i, 7).toString());
//        String st = jTable1.getModel().getValueAt(i, 8).toString();
//        switch (st) {
//            case "First  Stage ":
//                z2.costage.setSelectedIndex(1);
//                break;
//            case "Second Stage":
//                z2.costage.setSelectedIndex(2);
//                break;
//            case "Third  Stage":
//                z2.costage.setSelectedIndex(3);
//                break;
//            case "Fourth Stage":
//                z2.costage.setSelectedIndex(4);
//                break;
//            case "Fifth  Stage":
//                z2.costage.setSelectedIndex(5);
//                break;
//            case "Sixth  Stage":
//                z2.costage.setSelectedIndex(6);
//                break;
//        }
//        z2.path.setText(jTable1.getModel().getValueAt(i, 9).toString());
//        
   
    }//GEN-LAST:event_jTable1MouseClicked

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
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
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        MessageFormat header=new MessageFormat("Employees");
        MessageFormat footer =new MessageFormat("page(1)");
       
            try {
             //   t2.print(t2.printMode.NORMAL,header,footer);
                jTable1.print(JTable.PrintMode.NORMAL, footer, footer);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
    }//GEN-LAST:event_jButton5ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new z3_Stenge_more().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    public javax.swing.JButton jButton5;
    public javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}


package student_registration;

import java.awt.Color;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import static java.lang.System.exit;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class z2_Students extends javax.swing.JFrame {
//z3_Stenge_more z3=new z3_Stenge_more();
    z1_Login  z1=new z1_Login();
    connect c = new connect();
int s=0,d=0;
    private ImageIcon format = null;
    String filename = null;
    byte[] person_image = null;

//    void updet() { //للحذف
//        String sgl = "select * from informashn";
//        try {
//            z3_Stenge_more z3=new z3_Stenge_more();
//            c.pd = c.con.prepareStatement(sgl);
//            c.rs = c.pd.executeQuery();
//            z3.jTable1.setModel(DbUtils.resultSetToTableModel(c.rs));
//
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e);
//        } finally {
//            try {
//                c.rs.close();
//                c.pd.close();
//            } catch (Exception e) {
//            }
//        }
//    }
    public z2_Students() {
        initComponents();
        jButton2.setVisible(false);
        jLabel1.setBackground(new Color(210,28,80,80));
        jPanel2.setBackground(new Color(210,28,80,80));
      if (s==0){
        costage.addItem("First  Stage ");
        costage.addItem("Second Stage");
        costage.addItem("Third  Stage");
        costage.addItem("Fourth Stage");
        costage.addItem("Fifth  Stage");
        costage.addItem("Sixth  Stage");
       s=1;
}
      if(d==0){
                coGovernorate.addItem("البصره");
        coGovernorate.addItem("بغداد");
        coGovernorate.addItem("بابل");
        coGovernorate.addItem("ذي قار");
        coGovernorate.addItem("كربلاء");
        coGovernorate.addItem("نجف");
        coGovernorate.addItem("واسط");
        coGovernorate.addItem("نينوى");
        coGovernorate.addItem("ميسان");
        coGovernorate.addItem("المثنى");
        coGovernorate.addItem("كركوك");
        coGovernorate.addItem("صلاح الدين");
        coGovernorate.addItem("السليمانيه");
        coGovernorate.addItem("ديالى");
        coGovernorate.addItem("القادسيه");
        coGovernorate.addItem("دهوك");
        coGovernorate.addItem("الانبار");
        coGovernorate.addItem("أربيل");
d=1;
      }
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        sex = new javax.swing.JLabel();
        txNAME = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        MALE = new javax.swing.JRadioButton();
        FEMALE = new javax.swing.JRadioButton();
        txUniversity = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        costage = new javax.swing.JComboBox<>();
        governorate1 = new javax.swing.JLabel();
        AddNew = new javax.swing.JButton();
        save = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        UpdImg = new javax.swing.JButton();
        ID_Student = new javax.swing.JLabel();
        txID = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        Name = new javax.swing.JLabel();
        Email1 = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        txnumber = new javax.swing.JTextField();
        date = new javax.swing.JTextField();
        txEMAIL = new javax.swing.JTextField();
        path = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        coGovernorate = new javax.swing.JComboBox<>();
        governorate = new javax.swing.JLabel();
        jLabel1img = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setVerifyInputWhenFocusTarget(false);
        jPanel1.setLayout(null);

        sex.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        sex.setForeground(new java.awt.Color(255, 0, 51));
        sex.setText("Gander");
        sex.setToolTipText("");
        sex.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jPanel1.add(sex);
        sex.setBounds(57, 334, 100, 30);

        txNAME.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(txNAME);
        txNAME.setBounds(176, 69, 222, 38);

        jLabel6.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 51));
        jLabel6.setText("birth daye");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(57, 274, 100, 30);

        MALE.setBackground(new java.awt.Color(204, 0, 0));
        buttonGroup1.add(MALE);
        MALE.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        MALE.setText("MALE");
        jPanel1.add(MALE);
        MALE.setBounds(185, 330, 79, 37);

        FEMALE.setBackground(new java.awt.Color(204, 0, 0));
        buttonGroup1.add(FEMALE);
        FEMALE.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        FEMALE.setText("FEMALE");
        jPanel1.add(FEMALE);
        FEMALE.setBounds(282, 330, 101, 37);

        txUniversity.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(txUniversity);
        txUniversity.setBounds(175, 423, 222, 38);

        jLabel7.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 51));
        jLabel7.setText("The Colleg");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(57, 428, 100, 30);

        costage.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        costage.setMaximumRowCount(20);
        costage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costageActionPerformed(evt);
            }
        });
        jPanel1.add(costage);
        costage.setBounds(175, 479, 222, 47);

        governorate1.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        governorate1.setForeground(new java.awt.Color(255, 0, 51));
        governorate1.setText("Stage");
        jPanel1.add(governorate1);
        governorate1.setBounds(58, 489, 99, 30);

        AddNew.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AddNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/add user.jpg"))); // NOI18N
        AddNew.setText("Add A New record");
        AddNew.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        AddNew.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        AddNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddNewActionPerformed(evt);
            }
        });
        jPanel1.add(AddNew);
        AddNew.setBounds(220, 600, 215, 60);

        save.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/save.jpg"))); // NOI18N
        save.setText("Save");
        save.setActionCommand("       Save");
        save.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        save.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel1.add(save);
        save.setBounds(650, 600, 102, 61);

        Exit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Exit.jpg"))); // NOI18N
        Exit.setText("Exit");
        Exit.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        Exit.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jPanel1.add(Exit);
        Exit.setBounds(770, 600, 95, 61);

        UpdImg.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        UpdImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/add photo.png"))); // NOI18N
        UpdImg.setText("upload photo ");
        UpdImg.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        UpdImg.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        UpdImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdImgActionPerformed(evt);
            }
        });
        jPanel1.add(UpdImg);
        UpdImg.setBounds(530, 420, 308, 61);

        ID_Student.setBackground(new java.awt.Color(255, 255, 51));
        ID_Student.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        ID_Student.setForeground(new java.awt.Color(255, 0, 51));
        ID_Student.setText("ID Student");
        ID_Student.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(ID_Student);
        ID_Student.setBounds(58, 25, 108, 30);

        txID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txIDActionPerformed(evt);
            }
        });
        jPanel1.add(txID);
        txID.setBounds(176, 25, 222, 38);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/more setting.jpg"))); // NOI18N
        jButton1.setText("More Settings");
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(450, 600, 183, 61);

        Name.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        Name.setForeground(new java.awt.Color(255, 0, 51));
        Name.setText("Name");
        jPanel1.add(Name);
        Name.setBounds(58, 69, 108, 30);

        Email1.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        Email1.setForeground(new java.awt.Color(255, 0, 51));
        Email1.setText("Number");
        jPanel1.add(Email1);
        Email1.setBounds(60, 163, 108, 30);

        Email.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        Email.setForeground(new java.awt.Color(255, 0, 51));
        Email.setText("Email");
        Email.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(Email);
        Email.setBounds(58, 122, 108, 30);

        txnumber.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txnumberActionPerformed(evt);
            }
        });
        jPanel1.add(txnumber);
        txnumber.setBounds(176, 162, 222, 38);

        date.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(date);
        date.setBounds(175, 274, 222, 38);

        txEMAIL.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txEMAIL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txEMAILActionPerformed(evt);
            }
        });
        jPanel1.add(txEMAIL);
        txEMAIL.setBounds(176, 113, 222, 38);

        path.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.add(path);
        path.setBounds(530, 380, 307, 30);

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(530, 20, 307, 342);

        coGovernorate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        coGovernorate.setMaximumRowCount(20);
        coGovernorate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "اختر المحافظه", "البصره", "بغداد", "بابل", "ذي قار", "كربلاء", "نجف", "واسط", "نينوى", " ميسان", "المثنى", " كركوك", "صلاح الدين", "السليمانيه", "ديالى", "القادسيه", "دهوك", " الانبار", "أربيل" }));
        coGovernorate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coGovernorateActionPerformed(evt);
            }
        });
        jPanel1.add(coGovernorate);
        coGovernorate.setBounds(175, 216, 222, 47);

        governorate.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        governorate.setForeground(new java.awt.Color(255, 0, 51));
        governorate.setText("Governorate");
        jPanel1.add(governorate);
        governorate.setBounds(49, 226, 108, 30);

        jLabel1img.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(jLabel1img);
        jLabel1img.setBounds(972, 56, 110, 342);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/updates1-icon.png"))); // NOI18N
        jButton2.setText("Updaet ");
        jButton2.setActionCommand(" Updaet ");
        jButton2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(30, 600, 150, 59);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/اسود.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 920, 700);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 940, 710);

        jMenuBar1.setBackground(new java.awt.Color(153, 153, 255));

        jMenu1.setBackground(java.awt.SystemColor.activeCaptionBorder);
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

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
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

    private void costageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costageActionPerformed
/*if (s==0){
        costage.addItem("First  Stage ");
        costage.addItem("Second Stage");
        costage.addItem("Third  Stage");
        costage.addItem("Fourth Stage");
        costage.addItem("Fifth  Stage");
        costage.addItem("Sixth  Stage");
        s=1;
}
*/
    }//GEN-LAST:event_costageActionPerformed

    private void AddNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddNewActionPerformed
        coGovernorate.setSelectedIndex(0);
        costage.setSelectedIndex(0);
        buttonGroup1.clearSelection();
        txID.setText("");
        txNAME.setText("");
        txEMAIL.setText("");
        date.setText("");
        txnumber.setText("");
        txUniversity.setText("");
        jLabel1img.setIcon(null);
        path.setText("");
    }//GEN-LAST:event_AddNewActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        String id, name, email, number, gov, data, sex, uni, stag, imge3;
        id = txID.getText();
        name = txNAME.getText();
        email = txEMAIL.getText();
        number = txnumber.getText();
        gov = coGovernorate.getSelectedItem().toString();
        data = date.getText();
        sex = "";
        if (MALE.isSelected()) {
            sex = MALE.getText();
        }
        if (FEMALE.isSelected()) {
            sex = FEMALE.getText();
        }
        uni = txUniversity.getText();
        stag = costage.getSelectedItem().toString();
        imge3 = path.getText();
        imge3 = imge3.replace("\\", "\\\\");
            try {
                int a = c.stmt.executeUpdate("insert into informashn values"
                    + "('" + id + "','" + name + "','" + email + "','" + number + "','" + gov + "','" + data + "',"
                    + "'" + sex + "','" + uni + "','" + stag + "','" + imge3 + "')");
                if (a == 1) {
                    JOptionPane.showMessageDialog(null, "Information saved");
                } else {
                    JOptionPane.showMessageDialog(null, "Error");
                }
            } catch (Exception e) {
                System.out.println("Connection error");
            }
    }//GEN-LAST:event_saveActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void UpdImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdImgActionPerformed
        /* JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String filename = f.getAbsolutePath();
        path.setText(filename);
        Image getAbsolutepath = null;
        ImageIcon icon = new ImageIcon(filename);
        Image image = icon.getImage().getScaledInstance(imglable.getWidth(), imglable.getHeight(), Image.SCALE_SMOOTH);
        imglable.setIcon(icon);*/
        JFileChooser Chooser = new JFileChooser();
        Chooser.showOpenDialog(null);
        File f = Chooser.getSelectedFile();

        filename = f.getAbsolutePath();
        path.setText(filename);
        ImageIcon imageIcon;
        imageIcon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_DEFAULT));
        jLabel1.setIcon(imageIcon);

        try {
            File image = new File(filename);
            FileInputStream fix = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            for (int number; (number = fix.read(buf)) != -1;) {
                bos.write(buf, 0, number);
            }
            person_image = bos.toByteArray();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_UpdImgActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        z3_Stenge_more st1 = new z3_Stenge_more();
        st1.setTitle("Admin");
        st1.setLocationRelativeTo(st1);
        st1.setVisible(true); 
        st1.setSize(855, 560);
        st1.setLocation(250,50);
        this.dispose();
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txnumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txnumberActionPerformed

    private void txEMAILActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txEMAILActionPerformed

    }//GEN-LAST:event_txEMAILActionPerformed

    private void coGovernorateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coGovernorateActionPerformed

//        coGovernorate.addItem("البصره");
//        coGovernorate.addItem("بغداد");
//        coGovernorate.addItem("بابل");
//        coGovernorate.addItem("ذي قار");
//        coGovernorate.addItem("كربلاء");
//        coGovernorate.addItem("نجف");
//        coGovernorate.addItem("واسط");
//        coGovernorate.addItem("نينوى");
//        coGovernorate.addItem("ميسان");
//        coGovernorate.addItem("المثنى");
//        coGovernorate.addItem("كركوك");
//        coGovernorate.addItem("صلاح الدين");
//        coGovernorate.addItem("السليمانيه");
//        coGovernorate.addItem("ديالى");
//        coGovernorate.addItem("القادسيه");
//        coGovernorate.addItem("دهوك");
//        coGovernorate.addItem("الانبار");
//        coGovernorate.addItem("أربيل");

    }//GEN-LAST:event_coGovernorateActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
         
        z1.setTitle("Login");
    //  st.setLocationRelativeTo(st);
        z1.setLocation(300, 150);
        z1.setSize(556,400);
        z1.setVisible(true);
        this.dispose();  
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        z3_Stenge_more z3=new z3_Stenge_more();
//////       // z3.setVisible(true);
//////     
//////        String id, name, email, number, gov, data, sex, uni, stag, imge3;
//////        id = txID.getText();
//////        name = txNAME.getText();
//////        email = txEMAIL.getText();
//////        number = txnumber.getText();
//////        gov = coGovernorate.getSelectedItem().toString();
//////        data = date.getText();
//////        sex = "";
//////        if (MALE.isSelected()) {
//////            sex = MALE.getText();
//////        }
//////        if (FEMALE.isSelected()) {
//////            sex = FEMALE.getText();
//////        }
//////        uni = txUniversity.getText();
//////        stag = costage.getSelectedItem().toString();
//////        imge3 = path.getText();
//////        imge3 = imge3.replace("\\", "\\\\");
//////        try {
//////            int a = c.stmt.executeUpdate("insert into informashn values"
//////                    + "('" + id + "','" + name + "','" + email + "','" + number + "','" + gov + "','" + data + "',"
//////                    + "'" + sex + "','" + uni + "','" + stag + "','" + imge3 + "')");
//////        } catch (Exception e) {
//////            System.out.println("Connection error");
//////        }
////////           DefaultTableModel model = (DefaultTableModel) z3.jTable1.getModel();
////////        int selectedIndex = z3.jTable1.getSelectedRow();
////////        //  int id = Integer.parseInt(model.getValueAt(selectedIndex, 0).toString());
////////        String idd = model.getValueAt(selectedIndex, 0).toString();
////////        int dialogresult = JOptionPane.showConfirmDialog(null, "do you want ubdet", "waring", JOptionPane.YES_NO_OPTION);
////////        if (dialogresult == JOptionPane.YES_NO_OPTION) {
////////            try {
////////                c.pd = c.con.prepareStatement("delete from  informashn where id = ?");
////////                c.pd.setString(1, idd);
////////                c.pd.executeUpdate();
////////              
////////               // updet();
////////
////////            } catch (Exception e) {
////////                JOptionPane.showMessageDialog(this, " error");
////////            }
////////        }
//////        z3.delet();
//////        z3.updet();
//////          JOptionPane.showMessageDialog(this, "recor ubdeted");
        try {
            c.pd = c.con.prepareStatement("UPDATE informashn SET id=?, namestudent=?, emel=?, number=?, gove=?, dataofbe=?, sex=?, uneverse=?, stage=?, imege=?  WHERE id='" + txID.getText() + "'");
            c.pd.setString(1, txID.getText());
            c.pd.setString(2, txNAME.getText());
            c.pd.setString(3, txEMAIL.getText());
            c.pd.setString(4, txnumber.getText());
            String course;
            course = coGovernorate.getSelectedItem().toString();
            c.pd.setString(5, course);
            c.pd.setString(6, date.getText());
            if (MALE.isSelected()) {
                c.pd.setString(7, MALE.getText());
            } else {
                c.pd.setString(7, FEMALE.getText());
            }
            c.pd.setString(8, txUniversity.getText());
            String course1;
            course1 = costage.getSelectedItem().toString();
            c.pd.setString(9, course1);
            c.pd.setString(10, path.getText());
            c.pd.execute();
            System.out.println("ok");
        } catch (Exception e) {
            System.out.println("Connection error");
        } finally {
            try {
                c.pd.close();
                c.rs.close();
            } catch (Exception e) {
            }
        }
        z3.updet();
         z3.setSize(855, 560);
        z3.setLocation(250,50);
        z3.setVisible(true);
        this.dispose();
        z3. jButton6.setVisible(true);
       z3. jButton5.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txIDActionPerformed

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
            java.util.logging.Logger.getLogger(z2_Students.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(z2_Students.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(z2_Students.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(z2_Students.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new z2_Students().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddNew;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel Email1;
    private javax.swing.JButton Exit;
    public javax.swing.JRadioButton FEMALE;
    private javax.swing.JLabel ID_Student;
    public javax.swing.JRadioButton MALE;
    private javax.swing.JLabel Name;
    private javax.swing.JButton UpdImg;
    private javax.swing.ButtonGroup buttonGroup1;
    public javax.swing.JComboBox<String> coGovernorate;
    public javax.swing.JComboBox<String> costage;
    public javax.swing.JTextField date;
    private javax.swing.JLabel governorate;
    private javax.swing.JLabel governorate1;
    private javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1img;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JTextField path;
    private javax.swing.JButton save;
    private javax.swing.JLabel sex;
    public javax.swing.JTextField txEMAIL;
    public javax.swing.JTextField txID;
    public javax.swing.JTextField txNAME;
    public javax.swing.JTextField txUniversity;
    public javax.swing.JTextField txnumber;
    // End of variables declaration//GEN-END:variables
}

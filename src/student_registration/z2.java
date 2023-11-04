package student_registration;

import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import static java.lang.System.exit;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class z2 extends javax.swing.JFrame {
    z1_Login  z1=new z1_Login();
    connect c = new connect();

    private ImageIcon format = null;
    String filename = null;
    byte[] person_image = null;

    public z2() {
        initComponents();
         coGovernorate.addItem("Choose the province");
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
        //--------------------------------------------------------------
        costage.addItem("Choose the stage ");
        costage.addItem("First  Stage ");
        costage.addItem("Second Stage");
        costage.addItem("Third  Stage");
        costage.addItem("Fourth Stage");
        costage.addItem("Fifth  Stage");
        costage.addItem("Sixth  Stage");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        ID_Student = new javax.swing.JLabel();
        txID = new javax.swing.JTextField();
        Name = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        txEMAIL = new javax.swing.JTextField();
        coGovernorate = new javax.swing.JComboBox<>();
        governorate = new javax.swing.JLabel();
        txNAME = new javax.swing.JTextField();
        sex = new javax.swing.JLabel();
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
        panel1 = new java.awt.Panel();
        imglable = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Email1 = new javax.swing.JLabel();
        txnumber = new javax.swing.JTextField();
        path = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1img = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 102));

        ID_Student.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        ID_Student.setForeground(new java.awt.Color(255, 0, 51));
        ID_Student.setText("ID Student");
        ID_Student.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        Name.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        Name.setText("Name");

        Email.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        Email.setText("Email");
        Email.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        date.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txEMAIL.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txEMAIL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txEMAILActionPerformed(evt);
            }
        });

        coGovernorate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        coGovernorate.setMaximumRowCount(20);
        coGovernorate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coGovernorateActionPerformed(evt);
            }
        });

        governorate.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        governorate.setText("Governorate");

        txNAME.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        sex.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        sex.setText("Gander");

        jLabel6.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jLabel6.setText("date of birth");

        buttonGroup1.add(MALE);
        MALE.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        MALE.setText("MALE");

        buttonGroup1.add(FEMALE);
        FEMALE.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        FEMALE.setText("FEMALE");

        txUniversity.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jLabel7.setText("University");

        costage.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        costage.setMaximumRowCount(20);
        costage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costageActionPerformed(evt);
            }
        });

        governorate1.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        governorate1.setText("Stage");

        AddNew.setText("Add A New record");
        AddNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddNewActionPerformed(evt);
            }
        });

        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        UpdImg.setText("upload photo ");
        UpdImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdImgActionPerformed(evt);
            }
        });

        panel1.setLayout(null);

        imglable.setBackground(new java.awt.Color(204, 255, 0));
        panel1.add(imglable);
        imglable.setBounds(10, 20, 221, 176);

        jButton1.setText("More Settings");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Email1.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        Email1.setText("number");

        txnumber.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txnumberActionPerformed(evt);
            }
        });

        path.setBackground(new java.awt.Color(204, 204, 255));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1img.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1img, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.setLayout(null);

        jPanel3.setLayout(new java.awt.GridBagLayout());

        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        jMenu1.setText("File");

        jMenuItem1.setText("jMenuItem1");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("jMenuItem2");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuItem3.setText("jMenuItem3");
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(governorate1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(costage, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ID_Student, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                                    .addComponent(Email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txNAME, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txID, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txEMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Email1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(governorate, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(coGovernorate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(date, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(MALE)
                                        .addGap(42, 42, 42)
                                        .addComponent(FEMALE))
                                    .addComponent(txUniversity, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(149, 149, 149)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(path, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UpdImg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(155, 155, 155))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(AddNew, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(path, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(UpdImg, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddNew, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txID, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ID_Student))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txNAME, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txEMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Email)))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Email1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(governorate)
                    .addComponent(coGovernorate, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sex)
                    .addComponent(FEMALE)
                    .addComponent(MALE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txUniversity, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(costage, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(governorate1))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
        imageIcon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(jLabel1img.getWidth(), jLabel1img.getHeight(), Image.SCALE_DEFAULT));
        jLabel1img.setIcon(imageIcon);

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

    private void costageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costageActionPerformed

//        costage.addItem("First  Stage ");
//        costage.addItem("Second Stage");
//        costage.addItem("Third  Stage");
//        costage.addItem("Fourth Stage");
//        costage.addItem("Fifth  Stage");
//        costage.addItem("Sixth  Stage");


    }//GEN-LAST:event_costageActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        z3_Stenge_more st1 = new z3_Stenge_more();
        st1.setTitle("Admin");
        st1.setLocationRelativeTo(st1);
        st1.setVisible(true);
        this.dispose();
        st1.setSize(765, 525);
        st1.setLocation(250, 150);
    }//GEN-LAST:event_jButton1ActionPerformed

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

    private void txEMAILActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txEMAILActionPerformed

    }//GEN-LAST:event_txEMAILActionPerformed

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

    private void txnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txnumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txnumberActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
          z1.setVisible(true);
                this.dispose();     
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new z2().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddNew;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel Email1;
    private javax.swing.JButton Exit;
    private javax.swing.JRadioButton FEMALE;
    private javax.swing.JLabel ID_Student;
    private javax.swing.JRadioButton MALE;
    private javax.swing.JLabel Name;
    private javax.swing.JButton UpdImg;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> coGovernorate;
    private javax.swing.JComboBox<String> costage;
    private javax.swing.JTextField date;
    private javax.swing.JLabel governorate;
    private javax.swing.JLabel governorate1;
    private javax.swing.JLabel imglable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1img;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private java.awt.Panel panel1;
    private javax.swing.JTextField path;
    private javax.swing.JButton save;
    private javax.swing.JLabel sex;
    private javax.swing.JTextField txEMAIL;
    private javax.swing.JTextField txID;
    private javax.swing.JTextField txNAME;
    private javax.swing.JTextField txUniversity;
    private javax.swing.JTextField txnumber;
    // End of variables declaration//GEN-END:variables
}

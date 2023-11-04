package student_registration;

import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class z6 extends javax.swing.JFrame {

    z1_Login z1 = new z1_Login();
    connect c = new connect();
int s=0,d=0;
    private ImageIcon format = null;
    String filename = null;
    byte[] person_image = null;

    z2_Students z2 = new z2_Students();
    int i = 0;
    DefaultTableModel tblmodel;

    void updet() { //للحذف
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

    public void serch(String str) {
        tblmodel = (DefaultTableModel) jTable1.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(tblmodel);
        jTable1.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));
    }

    public void show_infor_in_teblr() {
        int i = jTable1.getSelectedRow();
        txID.setText(jTable1.getModel().getValueAt(i, 0).toString());
        txNAME.setText(jTable1.getModel().getValueAt(i, 1).toString());
        txEMAIL.setText(jTable1.getModel().getValueAt(i, 2).toString());
        txnumber.setText(jTable1.getModel().getValueAt(i, 3).toString());
        String knoe = jTable1.getModel().getValueAt(i, 4).toString();
        switch (knoe) {
            case "البصره":
                coGovernorate.setSelectedIndex(1);
                break;
            case "بغداد":
                coGovernorate.setSelectedIndex(2);
                break;
            case "بابل":
                coGovernorate.setSelectedIndex(3);
                break;
            case "ذي قار":
                coGovernorate.setSelectedIndex(4);
                break;
            case "كربلاء":
                coGovernorate.setSelectedIndex(5);
                break;
            case "نجف":
                coGovernorate.setSelectedIndex(6);
                break;
            case "واسط":
                coGovernorate.setSelectedIndex(7);
                break;
            case "نينوى":
                coGovernorate.setSelectedIndex(8);
                break;
            case"ميسان":
                coGovernorate.setSelectedIndex(9);
                break;
            case "المثنى":
                coGovernorate.setSelectedIndex(10);
                break;
            case "كركوك":
                coGovernorate.setSelectedIndex(11);
                break;
            case "صلاح الدين":
                coGovernorate.setSelectedIndex(12);
                break;
            case "السليمانيه":
                coGovernorate.setSelectedIndex(13);
                break;
            case "ديالى":
                coGovernorate.setSelectedIndex(14);
                break;
            case "القادسيه":
                coGovernorate.setSelectedIndex(15);
                break;
            case "دهوك":
                coGovernorate.setSelectedIndex(16);
                break;
            case "الانبار":
                coGovernorate.setSelectedIndex(17);
                break;
            case "أربيل":
                coGovernorate.setSelectedIndex(18);
                break;
        }
         date.setText(jTable1.getModel().getValueAt(i, 5).toString());
        String sex = jTable1.getModel().getValueAt(i, 6).toString();
        if (sex.equals("MALE")) {
            MALE.setSelected(true);
        } else {
            FEMALE.setSelected(true);
        }
        txUniversity.setText(jTable1.getModel().getValueAt(i, 7).toString());
        String st = jTable1.getModel().getValueAt(i, 8).toString();
        switch (st) {
            case "First  Stage ":
                costage.setSelectedIndex(1);
                break;
            case "Second Stage":
                costage.setSelectedIndex(2);
                break;
            case "Third  Stage":
                costage.setSelectedIndex(3);
                break;
            case "Fourth Stage":
                costage.setSelectedIndex(4);
                break;
            case "Fifth  Stage":
                costage.setSelectedIndex(5);
                break;
            case "Sixth  Stage":
                costage.setSelectedIndex(6);
                break;
        }
        path.setText(jTable1.getModel().getValueAt(i, 9).toString());

    }
    public z6() {
        initComponents();
        jButton6.setVisible(false);
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txID = new javax.swing.JTextField();
        Name = new javax.swing.JLabel();
        Email1 = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        txnumber = new javax.swing.JTextField();
        txEMAIL = new javax.swing.JTextField();
        txNAME = new javax.swing.JTextField();
        ID_Student = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        coGovernorate = new javax.swing.JComboBox<>();
        governorate = new javax.swing.JLabel();
        sex = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        MALE = new javax.swing.JRadioButton();
        FEMALE = new javax.swing.JRadioButton();
        txUniversity = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        costage = new javax.swing.JComboBox<>();
        governorate1 = new javax.swing.JLabel();
        path = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1img = new javax.swing.JLabel();
        UpdImg = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton2.setFont(new java.awt.Font("MV Boli", 2, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/photo_2021-11-19_17-03-56.jpg"))); // NOI18N
        jButton2.setText(" Show_User");
        jButton2.setActionCommand("Show User");
        jButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("MV Boli", 2, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/open.jpg"))); // NOI18N
        jButton3.setText(" Show student");
        jButton3.setActionCommand("show_studanet");
        jButton3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton3.setInheritsPopupMenu(true);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("MV Boli", 2, 18)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/open.jpg"))); // NOI18N
        jButton4.setText(" Back");
        jButton4.setActionCommand("  Back");
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

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Emaile", "Number", "Governorate", "BirthDaye", "Sex", "University", "Stage", "Img"
            }
        ));
        jTable1.setAutoscrolls(false);
        jTable1.setFocusTraversalPolicyProvider(true);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

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

        jButton6.setFont(new java.awt.Font("MV Boli", 2, 18)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Exit.jpg"))); // NOI18N
        jButton6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton6.setLabel("   Delet");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Find a record");

        jButton1.setFont(new java.awt.Font("MV Boli", 2, 18)); // NOI18N
        jButton1.setText("edit record");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        Name.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        Name.setText("Name");

        Email1.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        Email1.setText("Number");

        Email.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        Email.setText("Email");
        Email.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txnumber.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txnumberActionPerformed(evt);
            }
        });

        txEMAIL.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txEMAIL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txEMAILActionPerformed(evt);
            }
        });

        txNAME.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        ID_Student.setFont(new java.awt.Font("Traditional Arabic", 2, 18)); // NOI18N
        ID_Student.setText("ID Student");
        ID_Student.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        date.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        coGovernorate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        coGovernorate.setMaximumRowCount(20);
        coGovernorate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coGovernorateActionPerformed(evt);
            }
        });

        governorate.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        governorate.setText("Governorate");

        sex.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        sex.setText("Gander");

        jLabel6.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jLabel6.setText("Date of Birth");

        MALE.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        MALE.setText("MALE");

        FEMALE.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        FEMALE.setText("FEMALE");

        txUniversity.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jLabel7.setText("The College");

        costage.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        costage.setMaximumRowCount(20);
        costage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costageActionPerformed(evt);
            }
        });

        governorate1.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        governorate1.setText("Stage");

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

        UpdImg.setText("upload photo ");
        UpdImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdImgActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ID_Student, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txNAME, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txID, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txEMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Email1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(governorate1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(costage, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
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
                                        .addComponent(sex, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(MALE)
                                            .addGap(42, 42, 42)
                                            .addComponent(FEMALE))
                                        .addComponent(txUniversity, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(path, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UpdImg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 924, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txID, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ID_Student))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txNAME, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txEMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Email))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Email1)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
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
                                    .addComponent(governorate1)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(path, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(UpdImg, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        z4_setens_idd g1 = new z4_setens_idd();
        g1.setLocationRelativeTo(g1);
        g1.setVisible(true);
        g1.setTitle("Admin Manage");
        g1.setEnabled(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (i == 0) {
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
        i = 1;
        jButton6.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        z2 st1 = new z2();
        st1.setTitle("Student_Registration");
        st1.setLocationRelativeTo(st1);
        st1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
show_infor_in_teblr();
        //هنا نكتب
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        String serch = jTextField1.getText();
        serch(serch);
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

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
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int selectedIndex = jTable1.getSelectedRow();
        //  int id = Integer.parseInt(model.getValueAt(selectedIndex, 0).toString());
        String idd = model.getValueAt(selectedIndex, 0).toString();
        int dialogresult = JOptionPane.showConfirmDialog(null, "do you want ubdet", "waring", JOptionPane.YES_NO_OPTION);
        if (dialogresult == JOptionPane.YES_NO_OPTION) {
            try {
                c.pd = c.con.prepareStatement("delete from  informashn where id = ?");
                c.pd.setString(1, idd);
                c.pd.executeUpdate();
              
               // updet();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, " error");
            }
        }
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
        } catch (Exception e) {
            System.out.println("Connection error");
        }
       
        updet();
          JOptionPane.showMessageDialog(this, "recor ubdeted");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txnumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txnumberActionPerformed

    private void txEMAILActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txEMAILActionPerformed

    }//GEN-LAST:event_txEMAILActionPerformed

    private void coGovernorateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coGovernorateActionPerformed

 

    }//GEN-LAST:event_coGovernorateActionPerformed

    private void costageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costageActionPerformed

    }//GEN-LAST:event_costageActionPerformed

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
            java.util.logging.Logger.getLogger(z6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(z6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(z6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(z6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new z6().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Email;
    private javax.swing.JLabel Email1;
    private javax.swing.JRadioButton FEMALE;
    private javax.swing.JLabel ID_Student;
    private javax.swing.JRadioButton MALE;
    private javax.swing.JLabel Name;
    private javax.swing.JButton UpdImg;
    private javax.swing.JComboBox<String> coGovernorate;
    private javax.swing.JComboBox<String> costage;
    private javax.swing.JTextField date;
    private javax.swing.JLabel governorate;
    private javax.swing.JLabel governorate1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1img;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField path;
    private javax.swing.JLabel sex;
    private javax.swing.JTextField txEMAIL;
    private javax.swing.JTextField txID;
    private javax.swing.JTextField txNAME;
    private javax.swing.JTextField txUniversity;
    private javax.swing.JTextField txnumber;
    // End of variables declaration//GEN-END:variables
}

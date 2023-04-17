
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author mg
 */
public class Inpatient extends javax.swing.JFrame {

    /**
     * Creates new form Inpatient
     */
    
    
    public Inpatient() {
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

        buttonGroup_iNPATIENT = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        InPatient_Doctor_ID = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        inLabNo = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        InP_RoomNo = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        AdmitDate = new javax.swing.JTextField();
        In_Patient_Delete = new javax.swing.JButton();
        PatientUpdate = new javax.swing.JButton();
        In_PatientAdd = new javax.swing.JButton();
        In_P_ShowTable = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable20 = new javax.swing.JTable();
        InPatientID = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Inpatient");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setText("DoctorID");

        InPatient_Doctor_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InPatient_Doctor_IDActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel21.setText("Lab no");

        inLabNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inLabNoActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel22.setText("Room no");

        InP_RoomNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InP_RoomNoActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setText("Admission Date");

        AdmitDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdmitDateActionPerformed(evt);
            }
        });

        In_Patient_Delete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        In_Patient_Delete.setText("Delete");
        In_Patient_Delete.setToolTipText("");
        In_Patient_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In_Patient_DeleteActionPerformed(evt);
            }
        });

        PatientUpdate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PatientUpdate.setText("Update");
        PatientUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientUpdateActionPerformed(evt);
            }
        });

        In_PatientAdd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        In_PatientAdd.setText("Add");
        In_PatientAdd.setToolTipText("");
        In_PatientAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In_PatientAddActionPerformed(evt);
            }
        });

        In_P_ShowTable.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        In_P_ShowTable.setText("Show Table");
        In_P_ShowTable.setToolTipText("");
        In_P_ShowTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                In_P_ShowTableActionPerformed(evt);
            }
        });

        Back.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        jTable20.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient_ID", "DoctorID", "Lab_No", "Room_No", "Admission_Date"
            }
        ));
        jScrollPane1.setViewportView(jTable20);

        InPatientID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InPatientIDActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setText("Patient ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel20))
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AdmitDate, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(InPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(InP_RoomNo, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel19))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inLabNo, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(InPatient_Doctor_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(79, 79, 79)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(PatientUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                                .addComponent(In_Patient_Delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(In_P_ShowTable, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(In_PatientAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Back))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PatientUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(InPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(In_Patient_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(In_PatientAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(InPatient_Doctor_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(inLabNo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel21))))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel22)
                            .addComponent(InP_RoomNo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 18, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(In_P_ShowTable, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AdmitDate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InPatient_Doctor_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InPatient_Doctor_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InPatient_Doctor_IDActionPerformed

    private void inLabNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inLabNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inLabNoActionPerformed

    private void InP_RoomNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InP_RoomNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InP_RoomNoActionPerformed

    private void AdmitDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdmitDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AdmitDateActionPerformed

    private void In_Patient_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In_Patient_DeleteActionPerformed
        // TODO add your handling code here:
        try {

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection(
                "jdbc:sqlserver://localhost:1433;databaseName=ProjectDB;selectMethod=cursor", "sa", "123456");
            int row = jTable20.getSelectedRow();
            String value = (jTable20.getModel().getValueAt(row, 0).toString());
            String  sql = "DELETE FROM Inpatient WHERE PatientID ="+value;
            PreparedStatement ps = connection.prepareStatement(sql);

            ps.executeUpdate();
            DefaultTableModel model = (DefaultTableModel)jTable20.getModel();
            model.setRowCount(0);
            JOptionPane.showMessageDialog(null, "DELETE Complete");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_In_Patient_DeleteActionPerformed

    private void PatientUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientUpdateActionPerformed

        try {

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection(
                "jdbc:sqlserver://localhost:1433;databaseName=ProjectDB;selectMethod=cursor", "sa", "123456");
            int row = jTable20.getSelectedRow();
            String value = (jTable20.getModel().getValueAt(row, 0).toString());
            String sql = "UPDATE Inpatient  SET DoctorID =?,Lab_No =?,Room_NO =?,Admission_date=? WHERE PatientID =" + value;
            PreparedStatement ps = connection.prepareStatement(sql);
            
            ps.setString(1, InPatient_Doctor_ID.getText());
            ps.setString(2, inLabNo.getText());
            
            ps.setString(3, InP_RoomNo.getText());
            ps.setString(4, AdmitDate.getText());
            

            

            ps.executeUpdate();
            DefaultTableModel model = (DefaultTableModel) jTable20.getModel();
            model.setRowCount(0);

            JOptionPane.showMessageDialog(null, "UPDATE Complete");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
        InPatientID.setText("");
        InPatient_Doctor_ID.setText("");
        inLabNo.setText("");
        InP_RoomNo.setText("");
        AdmitDate.setText("");
       

        // TODO add your handling code here:
    }//GEN-LAST:event_PatientUpdateActionPerformed

    private void In_PatientAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In_PatientAddActionPerformed

           

                String In_P_Id = InPatientID.getText();
                String In_P_Doc_Id = InPatient_Doctor_ID.getText();
                String In_P_Lab_No = inLabNo.getText();
                String In_P_Room_No = InP_RoomNo.getText();
                String In_P_Ad_Date = AdmitDate.getText();
              
                try {

                    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                    Connection connection = DriverManager.getConnection(
                        "jdbc:sqlserver://localhost:1433;databaseName=ProjectDB;selectMethod=cursor", "sa", "123456");

                    String  sqlquery = "INSERT INTO Inpatient(PatientID, DoctorID ,Lab_No ,Room_NO ,Admission_date) VALUES ('"+In_P_Id+"','"+In_P_Doc_Id+"','"+In_P_Lab_No+"','"+In_P_Room_No+"','"+In_P_Ad_Date+"')";

                    PreparedStatement pst = connection.prepareStatement(sqlquery);

                    pst.execute();
                    JOptionPane.showMessageDialog(null, "Patient Added");

                    ////////////////Clear The Text Field

                    
                    InPatientID.setText("");
                    InPatient_Doctor_ID.setText("");
                    inLabNo.setText("");
                    InP_RoomNo.setText("");
                    AdmitDate.setText("");
                    

                    // this.hide();
                    // new login().show();

                } catch (Exception e) {
                    e.printStackTrace();
                }

    }//GEN-LAST:event_In_PatientAddActionPerformed

    private void In_P_ShowTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_In_P_ShowTableActionPerformed

        DefaultTableModel model = (DefaultTableModel) jTable20.getModel();
        model.setRowCount(0);

        try{

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection(
                "jdbc:sqlserver://localhost:1433;databaseName=ProjectDB;selectMethod=cursor", "sa", "123456");

            Statement st = connection.createStatement();
            String sql = "select Bill.BillID,Bill.PatientID,Patient.Patient_Name,Bill.Release_Date,Lab.Admission_Date,DATEDIFF(day,Lab.Admission_Date,Bill.Release_Date) As N0_Of_Dayes from Bill join Lab on Bill.PatientID = Lab.PatientID join Patient on Patient.PatientID = Lab.PatientID  join Lab_Report on Lab_Report.PatientID = patient.PatientID where Lab_Report.Patient_Category='In'";

            ResultSet rs = st.executeQuery(sql);

            while(rs.next()){

                
                String In_P_Id = String.valueOf(rs.getString("PatientID"));
                
                String In_P_Doc_Id = String.valueOf(rs.getString("Patient_Name"));
                
                String In_P_Lab_No = String.valueOf(rs.getString("Release_Date"));
                String In_Room_No = String.valueOf(rs.getString("Admission_Date"));
                String In_P_Ad_Date=  String.valueOf(rs.getString("N0_Of_Dayes"));
                

                String tbData[] = {In_P_Id ,In_P_Doc_Id,In_P_Lab_No,In_Room_No, In_P_Ad_Date};

                DefaultTableModel tblModel = (DefaultTableModel)jTable20.getModel();

                tblModel.addRow(tbData);

            }

        } catch (Exception e) {

            e.printStackTrace();

        }

    }//GEN-LAST:event_In_P_ShowTableActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        this.hide();
        new Patient_Type().show();
    }//GEN-LAST:event_BackActionPerformed

    private void InPatientIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InPatientIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InPatientIDActionPerformed

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
            java.util.logging.Logger.getLogger(Inpatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inpatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inpatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inpatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inpatient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AdmitDate;
    private javax.swing.JButton Back;
    private javax.swing.JTextField InP_RoomNo;
    private javax.swing.JTextField InPatientID;
    private javax.swing.JTextField InPatient_Doctor_ID;
    private javax.swing.JButton In_P_ShowTable;
    private javax.swing.JButton In_PatientAdd;
    private javax.swing.JButton In_Patient_Delete;
    private javax.swing.JButton PatientUpdate;
    private javax.swing.ButtonGroup buttonGroup_iNPATIENT;
    private javax.swing.JTextField inLabNo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable20;
    // End of variables declaration//GEN-END:variables
}

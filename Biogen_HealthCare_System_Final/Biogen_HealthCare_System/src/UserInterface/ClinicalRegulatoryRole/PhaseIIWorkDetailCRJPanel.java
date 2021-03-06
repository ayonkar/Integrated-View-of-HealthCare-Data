/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ClinicalRegulatoryRole;

import UserInterface.NewDrugApproval.*;
import Business.Enterprise.Enterprise;
import Business.Organization.ResearchAndDevelopment.ClinicalRegulatoryOrganisation;
import Business.Organization.ResearchAndDevelopment.NewDrugApprovalOrganisation;
import Business.Role.RegulatorySpecialistNDA;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ClinicalDrugPhaseOneTestWorkRequest;
import Business.WorkQueue.ClinicalDrugPhaseTwoTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import Disease.Disease;
import Drug.AvailableDrug;
import UserInterface.DrugDiscoveryScientistDDRole.DrugDetailJPanel;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo
 */
public class PhaseIIWorkDetailCRJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PhaseIIWorkDetailCRJPanel
     */
    private  JPanel userprocesscontainer;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private ClinicalRegulatoryOrganisation organization;
    public PhaseIIWorkDetailCRJPanel(JPanel regulatorySpecialistRightjPanel, ClinicalRegulatoryOrganisation organization, UserAccount userAccount, Enterprise enterprise) {
        initComponents();
        this.userprocesscontainer = regulatorySpecialistRightjPanel;
        this.userAccount = userAccount;
        this.organization =  organization;
        this.enterprise = enterprise;
         populateComboBox();
         
         
    }
      private void populateComboBox() {
        diseasejComboBox.removeAllItems();
        for (Disease disease : organization.getDiseasediretory().getDisease()) {
            diseasejComboBox.addItem(disease);
        }

    }
       public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) testjTable.getModel();

        model.setRowCount(0);

        Disease disease = (Disease) diseasejComboBox.getSelectedItem();

        for (WorkRequest request : organization.getPhaseTwoWorkQueue().getWorkRequestList()) {
            ClinicalDrugPhaseTwoTestWorkRequest clinicalDrugwr = (ClinicalDrugPhaseTwoTestWorkRequest) request;
            if (disease.getDiseaseName().equals(clinicalDrugwr.getPhaseTwoDrug().getDiseaseName())) {

                String phaseII = "II";
                if ((phaseII).equals(clinicalDrugwr.getPhaseTwoDrug().getPhaseNumber())) {
                    //    if(diseasejComboBox.getSelectedItem().toString().equals(ABORT))
                    {
                        Object[] row = new Object[7];
                        row[0] = clinicalDrugwr;
                        row[1] = clinicalDrugwr.getPhaseTwoDrug().getDrugID();
                        row[2] = clinicalDrugwr.getPhaseTwoDrug().getDrugName();
                        row[3] = clinicalDrugwr.getPhaseTwoDrug().getPhaseNumber();

                        row[4] = clinicalDrugwr.getReceiver() == null ? "Not Assigned" : clinicalDrugwr.getReceiver();

                        row[5] = clinicalDrugwr.getTestResult() == null ? "NA" : clinicalDrugwr.getTestResult();
                        String statusInfo = clinicalDrugwr.getStatus();
                        row[6] = statusInfo == null ? "Waiting" : statusInfo;

                        model.addRow(row);
                    }
                }

            }
        }
        if (model.getRowCount() <= 0) {
            JOptionPane.showConfirmDialog(null, "No tests avlaible");
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        diseasejComboBox = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        testjTable = new javax.swing.JTable();
        retestjButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        testjButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        diseaseDescriptionjTextArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        categoryjTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        availaiblejComboBox = new javax.swing.JComboBox();
        viewDrugjButton = new javax.swing.JButton();
        jLabel = new javax.swing.JLabel();
        backjButton = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        diseasejComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diseasejComboBoxActionPerformed(evt);
            }
        });

        testjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TestID", "DrugID", "DrugName", "Phase ", "Receiver", "Test Result", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(testjTable);

        retestjButton.setText("Re-Test");
        retestjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retestjButtonActionPerformed(evt);
            }
        });

        jLabel5.setText("Disease");

        testjButton.setText("Test");
        testjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testjButtonActionPerformed(evt);
            }
        });

        diseaseDescriptionjTextArea.setEditable(false);
        diseaseDescriptionjTextArea.setColumns(20);
        diseaseDescriptionjTextArea.setLineWrap(true);
        diseaseDescriptionjTextArea.setRows(5);
        jScrollPane2.setViewportView(diseaseDescriptionjTextArea);

        jLabel1.setText("Description");

        jLabel3.setText("Category");

        categoryjTextField.setEditable(false);

        jLabel4.setText("Avalaible Drugs");

        availaiblejComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availaiblejComboBoxActionPerformed(evt);
            }
        });

        viewDrugjButton.setText("View Details");
        viewDrugjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDrugjButtonActionPerformed(evt);
            }
        });

        jLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel.setText("Phase  II  Test Lab  Work Area ");

        backjButton.setText("Back");
        backjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(diseasejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(categoryjTextField)
                                .addGap(150, 150, 150))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(availaiblejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(viewDrugjButton, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE))
                            .addComponent(backjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(164, 164, 164)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(testjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(retestjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE))
                .addGap(423, 423, 423))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(644, 644, 644)
                .addComponent(jLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel)
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diseasejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(categoryjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(availaiblejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewDrugjButton))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(testjButton)
                            .addComponent(retestjButton))
                        .addGap(392, 392, 392)
                        .addComponent(backjButton)
                        .addGap(77, 77, 77))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2016, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 866, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2016, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 866, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void diseasejComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diseasejComboBoxActionPerformed
        // TODO add your handling code here:
        availaiblejComboBox.removeAllItems();

        Disease disease = (Disease) diseasejComboBox.getSelectedItem();
        diseaseDescriptionjTextArea.setText(disease.getDiseaseDescription());
        categoryjTextField.setText(disease.getDiseaseCategory());
        for (AvailableDrug availdrug : disease.getAvalaibleDrug()) {
            availaiblejComboBox.addItem(availdrug);
        }

        populateTable();
    }//GEN-LAST:event_diseasejComboBoxActionPerformed

    private void retestjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retestjButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = testjTable.getSelectedRow();

        if (selectedRow >= 0) {
            ClinicalDrugPhaseTwoTestWorkRequest request = (ClinicalDrugPhaseTwoTestWorkRequest) testjTable.getValueAt(selectedRow, 0);
            //            ViewSupplierJPanel panel = new ViewSupplierJPanel(userProcessContainer,supplier);
            //            userProcessContainer.add("ViewSupplierJPanel",panel);
            //            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            //            layout.next(userProcessContainer);
            //add code for srequest a the sae test
            ClinicalRegulatoryOrganisation newDrugOrg = (ClinicalRegulatoryOrganisation) organization;

            // LabTestWorkRequest.count++;
            ClinicalDrugPhaseTwoTestWorkRequest drugtest = new ClinicalDrugPhaseTwoTestWorkRequest();
            drugtest.setPhaseTwoDrug(request.getPhaseTwoDrug());

            drugtest.setSender(userAccount);
            drugtest.setStatus("Sent");
            newDrugOrg.getPhaseTwoWorkQueue().getWorkRequestList().add(drugtest);

            //drugdd.getWorkQueue().getWorkRequestList().size();
            userAccount.getWorkQueue().getWorkRequestList().add(drugtest);

            JOptionPane.showConfirmDialog(null, "Please confirm on re-testing the same setup ");

            populateTable();
        } else {
            JOptionPane.showMessageDialog(null, "Please Select a WorkRequest to Re-Test");
        }
    }//GEN-LAST:event_retestjButtonActionPerformed

    private void testjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testjButtonActionPerformed
        // TODO add your handling code here:
   int selectedRow = testjTable.getSelectedRow();

        if (selectedRow >= 0) {
            ClinicalDrugPhaseTwoTestWorkRequest cdtwr = (ClinicalDrugPhaseTwoTestWorkRequest) testjTable.getValueAt(selectedRow, 0);
            CardLayout layout = (CardLayout) userprocesscontainer.getLayout();
            userprocesscontainer.add("PhaseTestTwoDetailCRJPanel", new UserInterface.ClinicalRegulatoryRole.PhaseTestTwoDetailCRJPanel(userprocesscontainer, userAccount, organization, cdtwr));
            layout.next(userprocesscontainer);

        } else {
            JOptionPane.showMessageDialog(null, "Please Select a Drug to Re-Test");
        }
    }//GEN-LAST:event_testjButtonActionPerformed

    private void availaiblejComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availaiblejComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_availaiblejComboBoxActionPerformed

    private void viewDrugjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDrugjButtonActionPerformed
        // TODO add your handling code here:

        AvailableDrug availdrug = (AvailableDrug) availaiblejComboBox.getSelectedItem();
        CardLayout layout = (CardLayout) userprocesscontainer.getLayout();
        userprocesscontainer.add("DrugDetailJPanel", new DrugDetailJPanel(userprocesscontainer, availdrug));
        layout.next(userprocesscontainer);        userprocesscontainer.add("DrugDetailJPanel", new DrugDetailJPanel(userprocesscontainer, availdrug));

    }//GEN-LAST:event_viewDrugjButtonActionPerformed

    private void backjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButtonActionPerformed
        // TODO add your handling code here:

        userprocesscontainer.remove(this);
        Component[] componentArray = userprocesscontainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        //        DrugDiscoveryScientistWorkAreaJPanel dwjp = (DrugDiscoveryScientistWorkAreaJPanel) component;
        //        dwjp.populateRequestTable();
        CardLayout layout = (CardLayout)userprocesscontainer.getLayout();
        layout.previous(userprocesscontainer);
    }//GEN-LAST:event_backjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox availaiblejComboBox;
    private javax.swing.JButton backjButton;
    private javax.swing.JTextField categoryjTextField;
    private javax.swing.JTextArea diseaseDescriptionjTextArea;
    private javax.swing.JComboBox diseasejComboBox;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton retestjButton;
    private javax.swing.JButton testjButton;
    private javax.swing.JTable testjTable;
    private javax.swing.JButton viewDrugjButton;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.DrugDiscoveryScientistDDRole;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.ResearchAndDevelopment.DrugDiscoveryOrganisation;
import Disease.Disease;
import Drug.AvailableDrug;
import javax.swing.JPanel;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import Drug.NewDiscoveredDrug;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo
 */
public class DiscoveryDevelopmentJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DiscoveryDevelopment
     */
    private Organization organization;
    JPanel userprocesscontainer;
    private UserAccount userAccount;
    private Enterprise enterprise;

    public DiscoveryDevelopmentJPanel(JPanel userprocesscontainer, DrugDiscoveryOrganisation organization, UserAccount userAccount, Enterprise enterprise) {
        initComponents();
        this.userprocesscontainer = userprocesscontainer;
        this.organization = organization;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        populateComboBox();

    }

    private void populateComboBox() {
        diseasejComboBox.removeAllItems();

        DrugDiscoveryOrganisation drugdd = (DrugDiscoveryOrganisation) organization;

        for (Disease disease : drugdd.getDd().getDisease()) {
            diseasejComboBox.addItem(disease);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        diseasejComboBox = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        testjTable = new javax.swing.JTable();
        retestjButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        checkDetailsjButton = new javax.swing.JButton();
        requestNewDrugjButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        diseaseDescriptionjTextArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        categoryjTextField = new javax.swing.JTextField();
        approvejButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        availaiblejComboBox = new javax.swing.JComboBox();
        viewDrugjButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        newDrugNamejTextField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(153, 153, 153));

        diseasejComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diseasejComboBoxActionPerformed(evt);
            }
        });

        testjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TestID", "DrugID", "Score", "DGE", "Receiver", "Test Result", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        retestjButton.setPreferredSize(new java.awt.Dimension(150, 25));
        retestjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retestjButtonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Disease");

        checkDetailsjButton.setText("Check Details");
        checkDetailsjButton.setPreferredSize(new java.awt.Dimension(150, 25));
        checkDetailsjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkDetailsjButtonActionPerformed(evt);
            }
        });

        requestNewDrugjButton.setText("Request New Drug");
        requestNewDrugjButton.setPreferredSize(new java.awt.Dimension(150, 25));
        requestNewDrugjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestNewDrugjButtonActionPerformed(evt);
            }
        });

        diseaseDescriptionjTextArea.setEditable(false);
        diseaseDescriptionjTextArea.setColumns(20);
        diseaseDescriptionjTextArea.setLineWrap(true);
        diseaseDescriptionjTextArea.setRows(5);
        jScrollPane2.setViewportView(diseaseDescriptionjTextArea);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Description");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Category");

        categoryjTextField.setEditable(false);

        approvejButton.setText("Approve Drug");
        approvejButton.setPreferredSize(new java.awt.Dimension(150, 25));
        approvejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approvejButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
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

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("New Drug Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(availaiblejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(viewDrugjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(diseasejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(categoryjTextField)
                                .addGap(150, 150, 150)))))
                .addGap(164, 164, 164)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(newDrugNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(checkDetailsjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(retestjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(88, 88, 88)
                                    .addComponent(requestNewDrugjButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE))
                            .addGap(423, 423, 423))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(approvejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addContainerGap()))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diseasejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(categoryjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(availaiblejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewDrugjButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(checkDetailsjButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(retestjButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(requestNewDrugjButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(newDrugNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addComponent(approvejButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void diseasejComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diseasejComboBoxActionPerformed
        // TODO add your handling code here:
        availaiblejComboBox.removeAllItems();
        DrugDiscoveryOrganisation drugdd = (DrugDiscoveryOrganisation) organization;
        Disease disease = (Disease) diseasejComboBox.getSelectedItem();
        diseaseDescriptionjTextArea.setText(disease.getDiseaseDescription());
        categoryjTextField.setText(disease.getDiseaseCategory());
        for (AvailableDrug availdrug : disease.getAvalaibleDrug()) {
            availaiblejComboBox.addItem(availdrug);
        }

        populateTable(organization);

    }//GEN-LAST:event_diseasejComboBoxActionPerformed

    public void populateTable(Organization organization) {
        DefaultTableModel model = (DefaultTableModel) testjTable.getModel();

        model.setRowCount(0);

        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()) {
            LabTestWorkRequest lwr = (LabTestWorkRequest) request;

            if (String.valueOf(diseasejComboBox.getSelectedItem()).equals(lwr.getTestdrug().getDiseasename())) {
                Object[] row = new Object[7];
                row[0] = (LabTestWorkRequest) request;
                row[1] = ((LabTestWorkRequest) request).getTestdrug().getDrugID();
                row[2] = ((LabTestWorkRequest) request).getScore();
                row[3] = ((LabTestWorkRequest) request).getDge();
                row[4] = request.getReceiver() == null ? "Not Assigned" : request.getReceiver();
                String result = ((LabTestWorkRequest) request).getTestResult();
                row[5] = result == null ? "Waiting" : result;
                String statusInfo = ((LabTestWorkRequest) request).getStatus();
                row[6] = statusInfo == null ? "Waiting" : statusInfo;

                model.addRow(row);
            }

        }
        if (model.getRowCount() <= 0) {
            JOptionPane.showConfirmDialog(null, "No tests avlaible");
        }

    }
    private void availaiblejComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availaiblejComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_availaiblejComboBoxActionPerformed

    private void retestjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retestjButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = testjTable.getSelectedRow();

        if (selectedRow >= 0) {
            if (JOptionPane.showConfirmDialog(null, "Are you sure?", "Confirmation", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                LabTestWorkRequest request = (LabTestWorkRequest) testjTable.getValueAt(selectedRow, 0);
//            ViewSupplierJPanel panel = new ViewSupplierJPanel(userProcessContainer,supplier);
//            userProcessContainer.add("ViewSupplierJPanel",panel);
//            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//            layout.next(userProcessContainer);
                //add code for srequest a the sae test 
                DrugDiscoveryOrganisation drugdd = (DrugDiscoveryOrganisation) organization;

                // LabTestWorkRequest.count++;
                LabTestWorkRequest lwr = new LabTestWorkRequest();
                lwr.setTestdrug(request.getTestdrug());
                lwr.setDge(request.getDge());
                lwr.setSender(userAccount);
                lwr.setStatus("Sent");
                drugdd.getWorkQueue().getWorkRequestList().add(lwr);

                //drugdd.getWorkQueue().getWorkRequestList().size();
                userAccount.getWorkQueue().getWorkRequestList().add(lwr);

                Organization org = drugdd;

                populateTable(org);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please Select a WorkRequest to Re-Test");
        }
    }//GEN-LAST:event_retestjButtonActionPerformed

    private void viewDrugjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDrugjButtonActionPerformed
        // TODO add your handling code here:

        AvailableDrug availdrug = (AvailableDrug) availaiblejComboBox.getSelectedItem();
        CardLayout layout = (CardLayout) userprocesscontainer.getLayout();
        userprocesscontainer.add("DrugDetailJPanel", new DrugDetailJPanel(userprocesscontainer, availdrug));
        layout.next(userprocesscontainer);


    }//GEN-LAST:event_viewDrugjButtonActionPerformed

    private void checkDetailsjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkDetailsjButtonActionPerformed
        // TODO add your handling code here:

        int selectedRow = testjTable.getSelectedRow();

        if (selectedRow >= 0) {
            LabTestWorkRequest lwr = (LabTestWorkRequest) testjTable.getValueAt(selectedRow, 0);
            CardLayout layout = (CardLayout) userprocesscontainer.getLayout();
            userprocesscontainer.add("TestResultDetailJPanel", new TestResultDetailJPanel(userprocesscontainer, lwr));
            layout.next(userprocesscontainer);

        } else {
            JOptionPane.showMessageDialog(null, "Please Select a Drug to Check the Details ");
        }


    }//GEN-LAST:event_checkDetailsjButtonActionPerformed

    private void requestNewDrugjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestNewDrugjButtonActionPerformed
        // TODO add your handling code here:

        CardLayout layout = (CardLayout) userprocesscontainer.getLayout();
        userprocesscontainer.add("ReasearchNewChemicalDrugJPanel", new ReasearchNewChemicalDrugJPanel(userprocesscontainer, userAccount, enterprise, organization));
        layout.next(userprocesscontainer);


    }//GEN-LAST:event_requestNewDrugjButtonActionPerformed

    private void approvejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approvejButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = testjTable.getSelectedRow();
        try {
            if (selectedRow >= 0) {

                String str = newDrugNamejTextField.getText();
                String EMPTY = "";
                if (null == str || EMPTY.equals(str.trim())) {
                    JOptionPane.showMessageDialog(null, "Please enter the new Drug Nomenclature to add ");
                } else {

                    LabTestWorkRequest lwr = (LabTestWorkRequest) testjTable.getValueAt(selectedRow, 0);
                    if (lwr.getTestResult() == (null)) {
                        JOptionPane.showMessageDialog(null, "Please Review/Complete the experiment before approving", "Warning", JOptionPane.WARNING_MESSAGE);
                    }

                    if (lwr.getTestResult().equals("Pass")) {
                        JOptionPane.showMessageDialog(null, "New Drugs sent to Pre-Clinical Analysis  ");
                        lwr.getTestdrug().setDrugName(str);
                        lwr.getTestdrug().setActiveDate(new Date());
                        lwr.setStatus("New Drug");
                        DrugDiscoveryOrganisation drugdd = (DrugDiscoveryOrganisation) organization;
                        for (Disease d : drugdd.getDd().getDisease()) {
                            if (diseasejComboBox.getSelectedItem().equals(d)) {
                                NewDiscoveredDrug newddrug = d.addNewDrug(lwr.getTestdrug().getDrugName(),
                                        lwr.getTestdrug().getAbsorbility(),
                                        lwr.getTestdrug().getAcitivity(),
                                        lwr.getStatus(),
                                        lwr.getTestdrug().getActiveDate());
                                newddrug.setTcd(lwr.getTestdrug().getTcd());
                                newddrug.setDiseasename(String.valueOf(diseasejComboBox.getSelectedItem()));

                            }
                        }
                    }

                }

            } else {
                JOptionPane.showMessageDialog(null, "Please Select the best Drug from the Lab result");
            }
        } catch (NullPointerException e) {
            System.out.println("Status is null & without testing the drug is tried to approved ! , no need to worry ! ! ");
        }


    }//GEN-LAST:event_approvejButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton approvejButton;
    private javax.swing.JComboBox availaiblejComboBox;
    private javax.swing.JTextField categoryjTextField;
    private javax.swing.JButton checkDetailsjButton;
    private javax.swing.JTextArea diseaseDescriptionjTextArea;
    private javax.swing.JComboBox diseasejComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField newDrugNamejTextField;
    private javax.swing.JButton requestNewDrugjButton;
    private javax.swing.JButton retestjButton;
    private javax.swing.JTable testjTable;
    private javax.swing.JButton viewDrugjButton;
    // End of variables declaration//GEN-END:variables
}

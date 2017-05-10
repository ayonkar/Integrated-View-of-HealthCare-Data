/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.NewDrugApproval;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.ResearchAndDevelopment.ClinicalRegulatoryOrganisation;
import Business.Organization.ResearchAndDevelopment.NewDrugApprovalOrganisation;
import Business.WorkQueue.ClinicalDrugPhaseThreeTestWorkRequest;
import Drug.ClinicalPhaseThreeDrug;
import Pharmacokinetics.Pharmacokinetics;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Lenovo
 */
public class PhaseThreeTestDetailJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PhaseThreeTestDetailJPanel
     */
     private NewDrugApprovalOrganisation organization;
     private  JPanel userprocesscontainer;
     private ClinicalDrugPhaseThreeTestWorkRequest cdtwr;
     private Enterprise enterprise;
    public PhaseThreeTestDetailJPanel(JPanel userprocesscontainer,NewDrugApprovalOrganisation organization,ClinicalDrugPhaseThreeTestWorkRequest cdtwr,Enterprise enterprise) {
        initComponents();
        this.userprocesscontainer = userprocesscontainer;
        this.organization = organization;
        this.cdtwr = cdtwr;
        this.enterprise = enterprise;              
        ovverideDosejTextField.setEnabled(false);
        preferredDosejTextField.setText(String.valueOf(cdtwr.getPhaseThreeDrug().getDoseLevel()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        requestMonitoringjButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        targetAreajComboBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        preferredDosejTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        yesjRadioButton = new javax.swing.JRadioButton();
        nojRadioButton = new javax.swing.JRadioButton();
        ovverideDosejTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jDateChooser = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        notesjTextArea = new javax.swing.JTextArea();
        editjButton = new javax.swing.JButton();
        jSlider1 = new javax.swing.JSlider();
        healthyjLabel = new javax.swing.JLabel();
        jSlider2 = new javax.swing.JSlider();
        unhealthyjLabel = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        requestMonitoringjButton.setText("Request Montoring");
        requestMonitoringjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestMonitoringjButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Select Number Of Healthy People ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Test Request Details ");

        jLabel3.setText("Select Target  Area ");

        targetAreajComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Brain", "Tissue", "Liver", "Kidney", "Other" }));

        jLabel4.setText("Preferred Dose ");

        jLabel5.setText("Overrride Dose ");

        yesjRadioButton.setBackground(new java.awt.Color(153, 153, 153));
        yesjRadioButton.setText("Yes");
        yesjRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesjRadioButtonActionPerformed(evt);
            }
        });

        nojRadioButton.setBackground(new java.awt.Color(153, 153, 153));
        nojRadioButton.setText("No");
        nojRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nojRadioButtonActionPerformed(evt);
            }
        });

        ovverideDosejTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ovverideDosejTextFieldActionPerformed(evt);
            }
        });

        jLabel7.setText("Select Number Of Disease People ");

        jLabel6.setText("Estimated  Duration ");

        jLabel8.setText("Special Notes");

        notesjTextArea.setColumns(20);
        notesjTextArea.setRows(5);
        jScrollPane1.setViewportView(notesjTextArea);

        editjButton.setText("Back");
        editjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editjButtonActionPerformed(evt);
            }
        });

        jSlider1.setBackground(new java.awt.Color(153, 153, 153));
        jSlider1.setMinimum(20);
        jSlider1.setMinorTickSpacing(5);
        jSlider1.setPaintTicks(true);
        jSlider1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jSlider1MouseMoved(evt);
            }
        });

        healthyjLabel.setText("23");

        jSlider2.setBackground(new java.awt.Color(153, 153, 153));
        jSlider2.setMinimum(20);
        jSlider2.setMinorTickSpacing(5);
        jSlider2.setPaintTicks(true);
        jSlider2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jSlider2MouseMoved(evt);
            }
        });

        unhealthyjLabel.setText("23");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addGap(90, 90, 90)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2)
                                .addComponent(targetAreajComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(preferredDosejTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(yesjRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(nojRadioButton))
                                .addComponent(ovverideDosejTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(healthyjLabel))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jSlider2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(unhealthyjLabel))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(editjButton)
                        .addGap(495, 495, 495)
                        .addComponent(requestMonitoringjButton)))
                .addGap(841, 841, 841))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel7)
                        .addGap(27, 27, 27))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(healthyjLabel)
                            .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(unhealthyjLabel)
                            .addComponent(jSlider2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(targetAreajComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(preferredDosejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(yesjRadioButton)
                            .addComponent(nojRadioButton))
                        .addGap(18, 18, 18)
                        .addComponent(ovverideDosejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel6))
                    .addComponent(jDateChooser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(81, 81, 81)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(requestMonitoringjButton)
                            .addComponent(editjButton))))
                .addGap(100, 100, 100))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void requestMonitoringjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestMonitoringjButtonActionPerformed
        // TODO add your handling code here:
        try{
            JOptionPane.showMessageDialog(null, "Test requested ");
        ClinicalPhaseThreeDrug clinicalDrug = cdtwr.getPhaseThreeDrug();
        Pharmacokinetics pk = new Pharmacokinetics();
        pk.setNumberHealthyPeople(Integer.parseInt(String.valueOf(jSlider1.getValue())));
        pk.setUnhealthyPeople(Integer.parseInt(String.valueOf(jSlider2.getValue())));
        pk.setDuration(jDateChooser.getDate());
        pk.setTargetArea(String.valueOf(targetAreajComboBox.getSelectedItem()));
        pk.setNotes(notesjTextArea.getText());
        if(yesjRadioButton.isSelected()){
            pk.setNewDose(Double.valueOf(ovverideDosejTextField.getText()));}
        clinicalDrug.setPharmacokinetics(pk);

        Calendar choosenDate = jDateChooser.getCalendar();
        Calendar currentDate = Calendar.getInstance();
        if((choosenDate == null) || choosenDate.compareTo(currentDate) < 0){

            jDateChooser.setBackground(Color.red);
            JOptionPane.showMessageDialog(null," Invalid Date");
            jDateChooser.setBackground(Color.white);
        }
        cdtwr.setTestResult("Requested");

        Organization org = null;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof ClinicalRegulatoryOrganisation){
                org = organization;
                break;
            }
        }
        if (org!=null){
            
            
            ((ClinicalRegulatoryOrganisation)org).getPhaseThreeWorkQueue().getWorkRequestList().add(cdtwr);
            // userAccount.getWorkQueue().getWorkRequestList().add(cdtwr);
        }
        }
       catch(Exception e){JOptionPane.showMessageDialog(null, "Input invalid ");}
    }//GEN-LAST:event_requestMonitoringjButtonActionPerformed

    private void yesjRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesjRadioButtonActionPerformed
        // TODO add your handling code here:
        ovverideDosejTextField.setEnabled(true);
    }//GEN-LAST:event_yesjRadioButtonActionPerformed

    private void nojRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nojRadioButtonActionPerformed
        // TODO add your handling code here:

        ovverideDosejTextField.setEnabled(false);
    }//GEN-LAST:event_nojRadioButtonActionPerformed

    private void ovverideDosejTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ovverideDosejTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ovverideDosejTextFieldActionPerformed

    private void editjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editjButtonActionPerformed
        // TODO add your handling code here:

        userprocesscontainer.remove(this);
        Component[] componentArray = userprocesscontainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        //        DrugDiscoveryScientistWorkAreaJPanel dwjp = (DrugDiscoveryScientistWorkAreaJPanel) component;
        //        dwjp.populateRequestTable();
        CardLayout layout = (CardLayout)userprocesscontainer.getLayout();
        layout.previous(userprocesscontainer);
    }//GEN-LAST:event_editjButtonActionPerformed

    private void jSlider1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSlider1MouseMoved
        // TODO add your handling code here:

        healthyjLabel.setText(String.valueOf(jSlider1.getValue()));
    }//GEN-LAST:event_jSlider1MouseMoved

    private void jSlider2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSlider2MouseMoved
        // TODO add your handling code here:
        unhealthyjLabel.setText(String.valueOf(jSlider2.getValue()));
    }//GEN-LAST:event_jSlider2MouseMoved


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton editjButton;
    private javax.swing.JLabel healthyjLabel;
    private com.toedter.calendar.JDateChooser jDateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSlider jSlider2;
    private javax.swing.JRadioButton nojRadioButton;
    private javax.swing.JTextArea notesjTextArea;
    private javax.swing.JTextField ovverideDosejTextField;
    private javax.swing.JTextField preferredDosejTextField;
    private javax.swing.JButton requestMonitoringjButton;
    private javax.swing.JComboBox<String> targetAreajComboBox;
    private javax.swing.JLabel unhealthyjLabel;
    private javax.swing.JRadioButton yesjRadioButton;
    // End of variables declaration//GEN-END:variables
}

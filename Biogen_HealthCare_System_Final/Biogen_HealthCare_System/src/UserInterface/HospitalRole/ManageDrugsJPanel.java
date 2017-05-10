/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.HospitalRole;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.DrugDistributor.HospitalOrganization;
import Business.Organization.Organization;
import static Business.Organization.Organization.Type.Hospital;
import Business.Organization.ResearchAndDevelopment.DrugDiscoveryOrganisation;
import Business.UserAccount.UserAccount;
import Disease.Disease;
import Drug.AvailableDrug;
import Drug.MarketDrug;
import Drug.MasterOrderDrugCatalog;
import Drug.OrderDrug;
import Drug.OrderDrugItem;
import java.awt.CardLayout;
import javax.swing.JPanel;
import Hospital.Hospital;
import UserInterface.DrugDiscoveryScientistDDRole.DrugDetailJPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Random;



/**
 *
 * @author ayonk
 */
public class ManageDrugsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageDrugsJPanel
     */
    private JPanel userProcessContainer;
    private HospitalOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private AvailableDrug availdrug;
    //private Hospital hospital;
    private OrderDrug orderdrug;
    private MasterOrderDrugCatalog masterOrderDrugCatalog;


    public ManageDrugsJPanel(JPanel userProcessContainer, Enterprise enterprise, Organization organization, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = (HospitalOrganization)organization;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        orderdrug = new OrderDrug();
        masterOrderDrugCatalog = new MasterOrderDrugCatalog();
        
      populateComboBox();
      
//      if(!isCheckedOut)
//      order = new Order();
        
    }
    
        private void populateComboBox(){
        hospitalJComboBox.removeAllItems();
        //HospitalOrganization hospitalOrganization = (HospitalOrganization)organization;
        for (Hospital hospital : organization.getHd().getHospitalList()){
             //System.out.println("Hospital name "+hospital );
            hospitalJComboBox.addItem(hospital); 
           
        }
        
    }
        
        private void populateTable(){
        
          DefaultTableModel model = (DefaultTableModel) hospitalJTable.getModel();
          model.setRowCount(0);
          //System.out.println("chceking"+String.valueOf(hospitalJComboBox.getSelectedItem()));
          
          Hospital hospital = (Hospital)hospitalJComboBox.getSelectedItem();
          
          //HospitalOrganization hospitalOrganization = (HospitalOrganization)organization;
          
          
          for (MarketDrug md : hospital.getDrugDetails()){
              
          if(md.getDrugStatus().equalsIgnoreCase("Active")){
              
            Object[] row = new Object[7];
            row[0] = md.getDrugID();
            row[1] = md;
            row[2] = md.getQuantity();
            row[3] = md.getUnitPrice();
            row[4] = md.getExipryDate();
            row[5] = hospital.getHospitalId();
            row[6] = hospital.getHospitalName();
            
            model.addRow(row);
        
        }
      }
    }
  public void refreshDrugTable(String keyword){
       boolean flag= false;
       DefaultTableModel model = (DefaultTableModel) hospitalJTable.getModel();
       model.setRowCount(0); 

       for(Hospital hospital : organization.getHd().getHospitalList())
       {
           for(MarketDrug md : hospital.getDrugDetails()){
               
           if(md.getDrugName().equalsIgnoreCase(keyword))    
           {
               
               flag = true;
            Object[] row = new Object[7];
            row[0] = md.getDrugID();
            row[1] = md;
            row[2] = md.getQuantity();
            row[3] = md.getUnitPrice();
            row[4] = md.getExipryDate();
            row[5] = hospital.getHospitalId();
            row[6] = hospital.getHospitalName();
            
            model.addRow(row);
           }
          
           }    
       }
       if(flag == false)
        JOptionPane.showMessageDialog(null, "Please enter the correct drug name!", "Warning", JOptionPane.WARNING_MESSAGE);
        
}
  
  public void refreshTable(){
        
       DefaultTableModel model = (DefaultTableModel) hospitalCartJTable.getModel();
       model.setRowCount(0); 

       //for(Hospital hospital : o)
       {
           for(OrderDrugItem oi : orderdrug.getOrderdrugList()){
               
            Object[] row = new Object[6];
            row[0] = oi.getMd().getDrugID();
            row[1] = oi;
            row[2] = oi.getQuantity();
            row[3] = oi.getMd().getUnitPrice();
            row[4] = oi.getMd().getExipryDate();
            row[5] = oi.getHospitalName();
             
            
            model.addRow(row);
           }
      
  }
}
  
    public void emptyTable(){
        
       DefaultTableModel model = (DefaultTableModel) hospitalCartJTable.getModel();
       //model.setRowCount(0); 
       int rowCount = model.getRowCount();
       for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        hospitalJTable = new javax.swing.JTable();
        viewjButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        removeBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        searchTextField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        hospitalJComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        quantitySpinner = new javax.swing.JSpinner();
        addToCartBtn = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        hospitalCartJTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtValue = new javax.swing.JTextField();
        modifyBtn = new javax.swing.JButton();
        checkOutBtn = new javax.swing.JButton();
        requestQuantityTxtField = new javax.swing.JTextField();
        requestQuantityBtn = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DrugId", "DrugName", "UnitPrice", "Quantity", "ExpiryDate", "HospitalId", "HospitalName"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setBackground(new java.awt.Color(153, 153, 153));

        hospitalJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DrugId", "DrugName", "Quantity", "UnitPrice", "ExpiryDate", "HospitalId", "HospitalName"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(hospitalJTable);
        if (hospitalJTable.getColumnModel().getColumnCount() > 0) {
            hospitalJTable.getColumnModel().getColumn(0).setResizable(false);
        }

        viewjButton.setText("View Drug Details");
        viewjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewjButtonActionPerformed(evt);
            }
        });

        jButton2.setText(">> Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        removeBtn.setText("Remove Drug");
        removeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText(" Drug Request Catalog");

        searchTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTextFieldActionPerformed(evt);
            }
        });

        searchButton.setText("Search Drug Name");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        hospitalJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitalJComboBoxActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel2.setText("Hospitals");

        quantitySpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        addToCartBtn.setText("Add to cart");
        addToCartBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCartBtnActionPerformed(evt);
            }
        });

        hospitalCartJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DrugId", "DrugName", "Quantity", "UnitPrice", "ExpiryDate", "HospitalName"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(hospitalCartJTable);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel3.setText("Drugs in cart");

        modifyBtn.setText("Modify Quantity");
        modifyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyBtnActionPerformed(evt);
            }
        });

        checkOutBtn.setText("Check Out");
        checkOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkOutBtnActionPerformed(evt);
            }
        });

        requestQuantityTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestQuantityTxtFieldActionPerformed(evt);
            }
        });

        requestQuantityBtn.setText("Request Quantity");
        requestQuantityBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestQuantityBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(493, 493, 493)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(checkOutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1068, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1068, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(hospitalJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(61, 61, 61)
                                    .addComponent(requestQuantityTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(requestQuantityBtn)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(viewjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(quantitySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(addToCartBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(removeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtValue, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(modifyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(hospitalJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(requestQuantityTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(requestQuantityBtn))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(searchButton)
                        .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewjButton)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(addToCartBtn)
                        .addComponent(quantitySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modifyBtn)
                    .addComponent(txtValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(checkOutBtn)
                .addGap(9, 9, 9)
                .addComponent(jButton2)
                .addGap(18, 18, 18))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void removeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBtnActionPerformed
        // TODO add your handling code here:
        int row = hospitalCartJTable.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a row!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        OrderDrugItem oi = (OrderDrugItem)hospitalCartJTable.getValueAt(row, 1);
        int oldAvail = oi.getMd().getQuantity();
        int oldQty = oi.getQuantity();
        int newQty = oldAvail + oldQty;
        oi.getMd().setQuantity(newQty);
        orderdrug.removeOrderItem(oi);
        JOptionPane.showMessageDialog(null, "Order item removed from the cart");
        refreshTable();
        populateTable();
    }//GEN-LAST:event_removeBtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer); 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void hospitalJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitalJComboBoxActionPerformed
        // TODO add your handling code here:
        populateTable();
        
    }//GEN-LAST:event_hospitalJComboBoxActionPerformed

    private void viewjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewjButtonActionPerformed
        // TODO add your handling code here:
                int row = hospitalJTable.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a row!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
         MarketDrug md = (MarketDrug)hospitalJTable.getValueAt(row, 1);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        ViewDrugDetailJPanel vddjp = new ViewDrugDetailJPanel(userProcessContainer, md);
        userProcessContainer.add("ViewDrugDetailJPanel", vddjp);
        
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewjButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        String drugName = searchTextField.getText();
        refreshDrugTable(drugName);
    }//GEN-LAST:event_searchButtonActionPerformed

    private void searchTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTextFieldActionPerformed
        // TODO add your handling code here:
         
        
    }//GEN-LAST:event_searchTextFieldActionPerformed

    private void addToCartBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToCartBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = hospitalJTable.getSelectedRow();
        if(selectedRow < 0)
        {
            JOptionPane.showMessageDialog(null,"Please select a row");
            return;
        }
        MarketDrug selectedDrug = (MarketDrug)hospitalJTable.getValueAt(selectedRow,1);
        int fetchQuantity = (Integer)quantitySpinner.getValue();
        if(fetchQuantity < 0)
        {
            JOptionPane.showMessageDialog(null,"Quantity cannnot be less than equal to 0");
            return;
        }
                if(fetchQuantity > selectedDrug.getQuantity())
        {
           JOptionPane.showMessageDialog(null,"Quantity is more than availability");
            return; 
        }
        if(fetchQuantity <= selectedDrug.getQuantity())
            {
                boolean alreadyPresent = false;
                for(OrderDrugItem oi : orderdrug.getOrderdrugList()){        
                            if(oi.getMd().equals(selectedDrug))
                                {
                                    int oldAvail = selectedDrug.getQuantity();
                                    int newAvail = oldAvail - fetchQuantity;
                                    selectedDrug.setQuantity(newAvail);
                                    oi.setQuantity(fetchQuantity + oi.getQuantity());
                                    alreadyPresent = true;
                                    populateTable();
                                    refreshTable();
                                    break;
                                 }
                }
                            if(!alreadyPresent)
                            {
                                int oldAvail = selectedDrug.getQuantity();
                                int newAvail = oldAvail - fetchQuantity;
                                selectedDrug.setQuantity(newAvail);
                                Hospital hospital = (Hospital)hospitalJComboBox.getSelectedItem();
                                orderdrug.addOrderItem(selectedDrug, fetchQuantity,hospital);
                                populateTable();
                                refreshTable();
                            }
                            
                        
                    
                }
      if(fetchQuantity > selectedDrug.getQuantity())
        {
           JOptionPane.showMessageDialog(null,"Quantity is more than availability");
            return; 
        }
            
    }//GEN-LAST:event_addToCartBtnActionPerformed

    private void modifyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = hospitalCartJTable.getSelectedRow();
        if(selectedRow < 0)
        {
            JOptionPane.showMessageDialog(null,"Please select a row");
            return;
        }
        OrderDrugItem oi = (OrderDrugItem)hospitalCartJTable.getValueAt(selectedRow, 1);
        int currentAvail = oi.getMd().getQuantity();
        int oldQty = oi.getQuantity();
        int newQty = Integer.parseInt(txtValue.getText());
        if(newQty > (currentAvail + oldQty))
        {
            JOptionPane.showMessageDialog(null,"Quantity is more than availability");
            return;
        }
        else
        {
            if(newQty <= 0)
            {
                JOptionPane.showMessageDialog(null,"Quantity should be greater than 0");
                return;
            }
            oi.setQuantity(newQty);
            oi.getMd().setQuantity(currentAvail + (oldQty - newQty));
            refreshTable();
            populateTable();
        }
    }//GEN-LAST:event_modifyBtnActionPerformed

    private void checkOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkOutBtnActionPerformed
        // TODO add your handling code here:
        if(orderdrug.getOrderdrugList().size() > 0)
        {
           masterOrderDrugCatalog.addOrder(orderdrug);
           JOptionPane.showMessageDialog(null, "Order placed successfully");
           emptyTable();

        }
        else
        {
           JOptionPane.showMessageDialog(null,"No order placed"); 
        }
    }//GEN-LAST:event_checkOutBtnActionPerformed

    
    private void requestQuantityBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestQuantityBtnActionPerformed
        // TODO add your handling code here:
        Random generator = new Random();
        int num = generator.nextInt(20) + 1;

        requestQuantityBtn.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent arg0) {
        int num = generator.nextInt(20) + 1;
        requestQuantityTxtField.setText(String.valueOf(num));
    }
});
        
        
        
        
    }//GEN-LAST:event_requestQuantityBtnActionPerformed

    private void requestQuantityTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestQuantityTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_requestQuantityTxtFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToCartBtn;
    private javax.swing.JButton checkOutBtn;
    private javax.swing.JTable hospitalCartJTable;
    private javax.swing.JComboBox hospitalJComboBox;
    private javax.swing.JTable hospitalJTable;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton modifyBtn;
    private javax.swing.JSpinner quantitySpinner;
    private javax.swing.JButton removeBtn;
    private javax.swing.JButton requestQuantityBtn;
    private javax.swing.JTextField requestQuantityTxtField;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JTextField txtValue;
    private javax.swing.JButton viewjButton;
    // End of variables declaration//GEN-END:variables
}

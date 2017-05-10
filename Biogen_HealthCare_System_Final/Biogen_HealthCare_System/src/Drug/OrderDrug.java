/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Drug;

import static Business.Organization.Organization.Type.Hospital;
import Clinic.Clinic;
import Hospital.Hospital;
import Pharmacy.Pharmacy;
import java.util.ArrayList;

/**
 *
 * @author ayonk
 */
public class OrderDrug {
    
    private ArrayList<OrderDrugItem> orderdrugList;
    private int orderNumber;
    private static int count = 0;
    
    public OrderDrug(){
        count++;
        orderNumber = count;
        orderdrugList = new ArrayList<>();
                
    }

    public ArrayList<OrderDrugItem> getOrderdrugList() {
        return orderdrugList;
    }

    public void setOrderdrugList(ArrayList<OrderDrugItem> orderdrugList) {
        this.orderdrugList = orderdrugList;
    }


   

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }
    
      public OrderDrugItem addOrderItem(MarketDrug md, int q,Hospital h)
    {
        OrderDrugItem odi = new OrderDrugItem();
        odi.setMd(md);
        odi.setQuantity(q);
        odi.setHospitalName(h.getHospitalName());
        
        orderdrugList.add(odi);
        return odi;
    }
      
     public OrderDrugItem addOrderItemClinic(MarketDrug md, int q,Clinic h)
    {
        OrderDrugItem odi = new OrderDrugItem();
        odi.setMd(md);
        odi.setQuantity(q);
        odi.setClinicName(h.getClinicName());
        
        orderdrugList.add(odi);
        return odi;
    }
     
          public OrderDrugItem addOrderItemPharmacy(MarketDrug md, int q,Pharmacy h)
    {
        OrderDrugItem odi = new OrderDrugItem();
        odi.setMd(md);
        odi.setQuantity(q);
        odi.setPharmacyName(h.getPharmacyName());
        
        orderdrugList.add(odi);
        return odi;
    }
    
    public void removeOrderItem(OrderDrugItem o)
    {
        orderdrugList.remove(o);
    }
    
    
    
}

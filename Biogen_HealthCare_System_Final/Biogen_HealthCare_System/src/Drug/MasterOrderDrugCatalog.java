/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Drug;

import java.util.ArrayList;

/**
 *
 * @author ayonk
 */
public class MasterOrderDrugCatalog {
    
    private ArrayList<OrderDrug> orderDrug;
    
        public MasterOrderDrugCatalog()
    {
        orderDrug = new ArrayList();
    }

    public ArrayList<OrderDrug> getOrderDrug() {
        return orderDrug;
    }

    public void setOrderDrug(ArrayList<OrderDrug> orderDrug) {
        this.orderDrug = orderDrug;
    }
        
        public OrderDrug addOrder(OrderDrug od)
    {
        orderDrug.add(od);
        return od;
    }
    
    public void removeOrder(OrderDrug od)
    {
        orderDrug.remove(od);
    }    
    
}

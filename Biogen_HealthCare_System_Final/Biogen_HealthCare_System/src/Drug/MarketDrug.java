/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Drug;

/**
 *
 * @author Lenovo
 */
public class MarketDrug extends AvailableDrug{
       public int quantity;
    private String unitPrice;
    private String ExipryDate;
    private String drugStatus;

    public String getDrugStatus() {
        return drugStatus;
    }

    public void setDrugStatus(String drugStatus) {
        this.drugStatus = drugStatus;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getExipryDate() {
        return ExipryDate;
    }

    public void setExipryDate(String ExipryDate) {
        this.ExipryDate = ExipryDate;
    }
    
}

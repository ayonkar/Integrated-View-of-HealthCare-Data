/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Drug;

/**
 *
 * @author ayonk
 */
public class OrderDrugItem {
    private int quantity;
    private String hospitalName;
    private String clinicName;
    private String pharmacyName;
    private MarketDrug md;

    public String getClinicName() {
        return clinicName;
    }

    public void setClinicName(String clinicName) {
        this.clinicName = clinicName;
    }

    public String getPharmacyName() {
        return pharmacyName;
    }

    public void setPharmacyName(String pharmacyName) {
        this.pharmacyName = pharmacyName;
    }
    
    
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public MarketDrug getMd() {
        return md;
    }

    public void setMd(MarketDrug md) {
        this.md = md;
    }
    
    public String toString(){
        
        return String.valueOf(quantity);
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }
    
    
    
    
}

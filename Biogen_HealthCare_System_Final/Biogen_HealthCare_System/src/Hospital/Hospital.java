/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hospital;

import Drug.AvailableDrug;
import java.util.ArrayList;
import Drug.MarketDrug;

/**
 *
 * @author ayonk
 */
public class Hospital {
    
    private String hospitalId;
    private String hospitalName;
    private ArrayList<AvailableDrug> avalaibleDrugList;
    private ArrayList<MarketDrug> drugDetails;
    
    public Hospital(){
        
        avalaibleDrugList = new ArrayList<>();
        drugDetails = new ArrayList<>();
    
    }
    
    
    public String getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(String hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public ArrayList<AvailableDrug> getAvalaibleDrugList() {
        return avalaibleDrugList;
    }

    public void setAvalaibleDrugList(ArrayList<AvailableDrug> avalaibleDrugList) {
        this.avalaibleDrugList = avalaibleDrugList;
    }

    public ArrayList<MarketDrug> getDrugDetails() {
        return drugDetails;
    }

    public void setDrugDetails(ArrayList<MarketDrug> drugDetails) {
        this.drugDetails = drugDetails;
    }
    
    
    public MarketDrug addDrugDetail(int drugId,String drugName,int quantity,String unitPrice,String expiryDate, String status){
        
        MarketDrug dd = new MarketDrug();
        dd.setDrugID(drugId);
        dd.setDrugName(drugName);
        dd.setQuantity(quantity);
        dd.setUnitPrice(unitPrice);
        dd.setExipryDate(expiryDate);
        dd.setDrugStatus(status);
        
        drugDetails.add(dd);
        //System.out.println("Added array of drug Detail"+drugDetails.size());
        return dd;
        
    }
     @Override
    public String toString(){
        return hospitalName;
    }
     
}

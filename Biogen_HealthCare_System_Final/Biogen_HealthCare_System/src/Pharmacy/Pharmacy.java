/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pharmacy;

import Drug.AvailableDrug;
import Drug.MarketDrug;
import java.util.ArrayList;

/**
 *
 * @author ayonk
 */
public class Pharmacy {
    
    private String pharmacyId;
    private String pharmacyName;
    private ArrayList<AvailableDrug> avalaibleDrugList;
    private ArrayList<MarketDrug> drugDetails;
    
    public Pharmacy(){
        
        avalaibleDrugList = new ArrayList<>();
        drugDetails = new ArrayList<>();
    
    }

    public String getPharmacyId() {
        return pharmacyId;
    }

    public void setPharmacyId(String pharmacyId) {
        this.pharmacyId = pharmacyId;
    }

    public String getPharmacyName() {
        return pharmacyName;
    }

    public void setPharmacyName(String pharmacyName) {
        this.pharmacyName = pharmacyName;
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
        return pharmacyName;
    }
     
    
}

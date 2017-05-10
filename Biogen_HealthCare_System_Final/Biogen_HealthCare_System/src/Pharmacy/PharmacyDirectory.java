/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pharmacy;

import Hospital.Hospital;
import java.util.ArrayList;

/**
 *
 * @author ayonk
 */
public class PharmacyDirectory {
    
    private ArrayList<Pharmacy> pharmacyList;
    
    public PharmacyDirectory(){
        
        pharmacyList = new ArrayList<>();
        
    }

    public ArrayList<Pharmacy> getPharmacyList() {
        return pharmacyList;
    }

    public void setPharmacyList(ArrayList<Pharmacy> pharmacyList) {
        this.pharmacyList = pharmacyList;
    }


    
    
    
    public Pharmacy addPharmacy(String h){
    
        Pharmacy pharmacy = new Pharmacy();
        pharmacy.setPharmacyName(h);
        pharmacyList.add(pharmacy);
        System.out.println("Pharmacy added no." + pharmacyList.size());
        return pharmacy;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clinic;

import Hospital.Hospital;
import java.util.ArrayList;

/**
 *
 * @author ayonk
 */
public class ClinicDirectory {
    
    private ArrayList<Clinic> clinicList;
    
    public ClinicDirectory(){
        
        clinicList = new ArrayList<>();
        
    }

    public ArrayList<Clinic> getClinicList() {
        return clinicList;
    }

    public void setClinicList(ArrayList<Clinic> clinicList) {
        this.clinicList = clinicList;
    }


   
    public Clinic addClinic(String h){
    
        Clinic clinic = new Clinic();
        clinic.setClinicName(h);
        clinicList.add(clinic);
        System.out.println("Clinic added no." + clinicList.size());
        return clinic;
    }
}

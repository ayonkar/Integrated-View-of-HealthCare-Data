/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hospital;

import java.util.ArrayList;

/**
 *
 * @author ayonk
 */
public class HospitalDirectory {
    
    private ArrayList<Hospital> hospitalList;
    
    public HospitalDirectory(){
        
        hospitalList = new ArrayList<>();
        
    }

    public ArrayList<Hospital> getHospitalList() {
        return hospitalList;
    }

    public void setHospitalList(ArrayList<Hospital> hospitalList) {
        this.hospitalList = hospitalList;
    }
    
    
    
    public Hospital addHospital(String h){
    
        Hospital hospital = new Hospital();
        hospital.setHospitalName(h);
        hospitalList.add(hospital);
        System.out.println("Hospital added no." + hospitalList.size());
        return hospital;
    }
    
    
}

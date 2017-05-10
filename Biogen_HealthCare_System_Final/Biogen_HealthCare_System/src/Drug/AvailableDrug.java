/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Drug;

import Chemical.Chemical;
import Chemical.ChemicalDirectory;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Lenovo
 */
public class AvailableDrug {
    
    private int drugID;
    
    private String drugName;
    
    private ChemicalDirectory chemicalList;
    
    private double absorbility;
    
    private String acitivity;
    
    private String Status;
    
    private Date activeDate;
    
   
    
    private static int  count=100;
    
    public AvailableDrug(){
        count = count +5;
        drugID = count;
    }

    public int getDrugID() {
        return drugID;
    }

    public void setDrugID(int drugID) {
        this.drugID = drugID;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }


    public double getAbsorbility() {
        return absorbility;
    }

    public void setAbsorbility(double absorbility) {
        this.absorbility = absorbility;
    }

    public String getAcitivity() {
        return acitivity;
    }

    public void setAcitivity(String acitivity) {
        this.acitivity = acitivity;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public Date getActiveDate() {
        return activeDate;
    }

    public void setActiveDate(Date activeDate) {
        this.activeDate = activeDate;
    }

    public ChemicalDirectory getChemicalList() {
        return chemicalList;
    }

    public void setChemicalList(ChemicalDirectory chemicalList) {
        this.chemicalList = chemicalList;
    }

  
    
    
    
    
    
    
    @Override
    public String toString(){    
        return drugName;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}

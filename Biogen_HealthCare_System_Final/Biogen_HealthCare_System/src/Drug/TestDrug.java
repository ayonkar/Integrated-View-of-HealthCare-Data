/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Drug;

import Chemical.TestChemicalDirectory;

/**
 *
 * @author Lenovo
 */
public class TestDrug extends AvailableDrug {
    
    
    private int drugID;
    private TestChemicalDirectory tcd;
    private double areaunderCurve;
     private String diseasename;
    public static int count;
    

    public TestChemicalDirectory getTcd() {
        return tcd;
    }

    public void setTcd(TestChemicalDirectory tcd) {
        this.tcd = tcd;
    }
    
    public TestDrug(){
        super();
        count++;
        drugID = count;
        
        tcd = new TestChemicalDirectory();
        
    }

    public int getDrugID() {
        return drugID;
    }

    public void setDrugID(int drugID) {
        this.drugID = drugID;
    }

    public double getAreaunderCurve() {
        return areaunderCurve;
    }

    public void setAreaunderCurve(double areaunderCurve) {
        this.areaunderCurve = areaunderCurve;
    }

    public String getDiseasename() {
        return diseasename;
    }

    public void setDiseasename(String diseasename) {
        this.diseasename = diseasename;
    }
    
    

    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.Date;
import java.util.ArrayList;


/**
 *
 * @author Lenovo
 */
public class PriclinicalWorkRequest extends WorkRequest{
    
    private int PriClinicalTestID;
    private int drugID;
    private String drugName;
    private int totalSetTitter;   
    private int experimentTime;
    private int temperature;
    private int exposure;
    private int wavelength;
    private int lysistime;
    private String dyeName;
    private String priority;
    private Date estimatedDayofDelivery;
    private static int count;
    private String diseaseName;
     
    private String PreClinicalTestResult;
        
    private ArrayList<TiterTest> titerPlate;
    
    
    
    public PriclinicalWorkRequest(){
        
        titerPlate= new ArrayList<>();
        count++;
        PriClinicalTestID = count;
    }

    public int getTotalSetTitter() {
        return totalSetTitter;
    }

    public void setTotalSetTitter(int totalSetTitter) {
        this.totalSetTitter = totalSetTitter;
    }

    public int getExperimentTime() {
        return experimentTime;
    }

    public void setExperimentTime(int experimentTime) {
        this.experimentTime = experimentTime;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getExposure() {
        return exposure;
    }

    public void setExposure(int exposure) {
        this.exposure = exposure;
    }

    public int getWavelength() {
        return wavelength;
    }

    public void setWavelength(int wavelength) {
        this.wavelength = wavelength;
    }

    public int getLysistime() {
        return lysistime;
    }

    public void setLysistime(int lysistime) {
        this.lysistime = lysistime;
    }

    public String getDyeName() {
        return dyeName;
    }

    public void setDyeName(String dyeName) {
        this.dyeName = dyeName;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public Date getEstimatedDayofDelivery() {
        return estimatedDayofDelivery;
    }

    public void setEstimatedDayofDelivery(Date estimatedDayofDelivery) {
        this.estimatedDayofDelivery = estimatedDayofDelivery;
    }

    public ArrayList<TiterTest> getTiterPlate() {
        return titerPlate;
    }

    public void setTiterPlate(ArrayList<TiterTest> titerPlate) {
        this.titerPlate = titerPlate;
    }

    public int getPriClinicalTestID() {
        return PriClinicalTestID;
    }

    public void setPriClinicalTestID(int PriClinicalTestID) {
        this.PriClinicalTestID = PriClinicalTestID;
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
 
    
   public String toString(){
       
       return String.valueOf(PriClinicalTestID);
       
   } 

    public String getPreClinicalTestResult() {
        return PreClinicalTestResult;
    }

    public void setPreClinicalTestResult(String PreClinicalTestResult) {
        this.PreClinicalTestResult = PreClinicalTestResult;
    }

    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }
    
    
 
    
    
    
    
    
    
    
    
    
    
    
}

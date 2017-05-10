/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Disease;

import Drug.AvailableDrug;
import Drug.ClinicalPhaseOneDrug;
import Drug.ClinicalPhaseThreeDrug;
import Drug.ClinicalPhaseTwoDrug;
import Drug.MarketDrug;
import Drug.NewDiscoveredDrug;
import Drug.TestDrug;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Lenovo
 */
public class Disease {
    
    private String diseaseName;
    private String diseaseDescription;
    private String diseaseCategory;
    private ArrayList<AvailableDrug> avalaibleDrugList; 
    private ArrayList<TestDrug> testdrug;
    private ArrayList<NewDiscoveredDrug> newDrugList;
    private ArrayList<ClinicalPhaseOneDrug> clinicalPhaseDrugList;
    private ArrayList<ClinicalPhaseTwoDrug> clinicalPhaseDrugTwoList;
    private ArrayList<ClinicalPhaseThreeDrug> clinicalPhaseDrugThreeList;
    private String gene;
      
    private ArrayList<MarketDrug> marketDrug;
     
    

    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }

    public String getDiseaseDescription() {
        return diseaseDescription;
    }

    public void setDiseaseDescription(String diseaseDescription) {
        this.diseaseDescription = diseaseDescription;
    }

    public String getDiseaseCategory() {
        return diseaseCategory;
    }

    public void setDiseaseCategory(String diseaseCategory) {
        this.diseaseCategory = diseaseCategory;
    }

    public ArrayList<AvailableDrug> getAvalaibleDrug() {
        return avalaibleDrugList;
    }

    public void setAvalaibleDrug(ArrayList<AvailableDrug> avalaibleDrug) {
        this.avalaibleDrugList = avalaibleDrug;
    }

    public ArrayList<TestDrug> getTestdrug() {
        return testdrug;
    }

    public void setTestdrug(ArrayList<TestDrug> testdrug) {
        this.testdrug = testdrug;
    }
    
    
    public  Disease(){
        avalaibleDrugList = new ArrayList<>(); 
        testdrug = new ArrayList<>(); 
        newDrugList = new ArrayList<>();
        clinicalPhaseDrugList = new ArrayList<>();
        clinicalPhaseDrugTwoList = new ArrayList<>();
        clinicalPhaseDrugThreeList = new ArrayList<>();
        marketDrug = new ArrayList<>();

    }
    
    public AvailableDrug addAvailableDrug(String name,double absorbility,String acitivity,String Status,Date activeDate){
        
        AvailableDrug ad = new AvailableDrug();
        ad.setDrugName(name);
        ad.setAbsorbility(absorbility);
        ad.setAcitivity(acitivity);
        ad.setStatus(Status);
        ad.setActiveDate(activeDate);
        avalaibleDrugList.add(ad);
        return ad;
        
    }
    
    public TestDrug addTestDrug(String name,double absorbility,String acitivity,String Status,Date activeDate){
        
        TestDrug td = new TestDrug();
        td.setDrugName(name);
        td.setAbsorbility(absorbility);
        td.setAcitivity(acitivity);
        td.setStatus(Status);
        td.setActiveDate(activeDate);
        avalaibleDrugList.add(td);
        return td;
        
    }

    public ArrayList<NewDiscoveredDrug> getNewDrugList() {
        return newDrugList;
    }

    public void setNewDrugList(ArrayList<NewDiscoveredDrug> newDrugList) {
        this.newDrugList = newDrugList;
    }
    

    
    @Override
    public String toString(){
        return diseaseName;
    }
  public NewDiscoveredDrug addNewDrug(String name,double absorbility,String acitivity,String Status,Date activeDate){
        
        NewDiscoveredDrug newDrug = new NewDiscoveredDrug();
        newDrug.setDrugName(name);
        newDrug.setAbsorbility(absorbility);
        newDrug.setAcitivity(acitivity);
        newDrug.setStatus(Status);
        newDrug.setActiveDate(activeDate);
        newDrugList.add(newDrug);
        return newDrug;
        
    }

    public ArrayList<ClinicalPhaseOneDrug> getClinicalPhaseDrugList() {
        return clinicalPhaseDrugList;
    }

    public void setClinicalPhaseDrugList(ArrayList<ClinicalPhaseOneDrug> clinicalPhaseDrugList) {
        this.clinicalPhaseDrugList = clinicalPhaseDrugList;
    }

  

    public ArrayList<MarketDrug> getMarketDrug() {
        return marketDrug;
    }

    public void setMarketDrug(ArrayList<MarketDrug> marketDrug) {
        this.marketDrug = marketDrug;
    }
    
    public ClinicalPhaseOneDrug addClinicalDrug(ClinicalPhaseOneDrug cpd){

        clinicalPhaseDrugList.add(cpd);
        return cpd;
        
    }
    

    
    public ClinicalPhaseTwoDrug addClinicalDrug(ClinicalPhaseTwoDrug cpd){

        clinicalPhaseDrugTwoList.add(cpd);
        return cpd;
        
    }
    
    
    public ClinicalPhaseThreeDrug addClinicalDrug(ClinicalPhaseThreeDrug cpd){

        clinicalPhaseDrugThreeList.add(cpd);
        return cpd;
        
    }

    public String getGene() {
        return gene;
    }

    public void setGene(String gene) {
        this.gene = gene;
    }
    
    
    
    
    

    
}

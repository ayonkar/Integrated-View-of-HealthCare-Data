/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Drug;

import Pharmacokinetics.Pharmacokinetics;

/**
 *
 * @author Lenovo
 */
public class ClinicalPhaseOneDrug extends AvailableDrug{
    
    
    private String PhaseNumber;
    private double DoseLevel;
    private String phaseApprovedStatus;
    private int NumberofTestedPeople;
    private Pharmacokinetics pharmacokinetics;
    private String diseaseName;

    public double getDoseLevel() {
        return DoseLevel;
    }

    public void setDoseLevel(double DoseLevel) {
        this.DoseLevel = DoseLevel;
    }

    public String getPhaseNumber() {
        return PhaseNumber;
    }

    public void setPhaseNumber(String PhaseNumber) {
        this.PhaseNumber = PhaseNumber;
    }

    public String getPhaseApprovedStatus() {
        return phaseApprovedStatus;
    }

    public void setPhaseApprovedStatus(String phaseApprovedStatus) {
        this.phaseApprovedStatus = phaseApprovedStatus;
    }

    public int getNumberofTestedPeople() {
        return NumberofTestedPeople;
    }

    public void setNumberofTestedPeople(int NumberofTestedPeople) {
        this.NumberofTestedPeople = NumberofTestedPeople;
    }

    public Pharmacokinetics getPharmacokinetics() {
        return pharmacokinetics;
    }

    public void setPharmacokinetics(Pharmacokinetics pharmacokinetics) {
        this.pharmacokinetics = pharmacokinetics;
    }

    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }
    
    
    
    
    
    
    
    
    
    
    
}

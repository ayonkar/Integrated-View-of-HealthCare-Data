/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pharmacokinetics;

import java.util.Date;
import java.util.Random;

/**
 *
 * @author Lenovo
 */
public class Pharmacokinetics {
    
    private int numberHealthyPeople;
    private int unhealthyPeople;
    private String targetArea;
    private double preferredDose;
    private double newDose;
    
    private String notes;
    
    
    
    private  Date duration;
    
    private double  compoundSolubility;
    private double  GastricEmptyingTime;
    private double  intestinalTransitTime;
    private double  chemicalInstability;
    
    private double  glucuronideFormation;
    private double  rateOfDissolution;
    private double  cLogPvalue;
    
    private double  bloodFlowRate;
    private double  molecularSize;
    private double  serumProtein;
    private double  polarity;
    
    private double  drugConcentration;
    private double  clearanceTime;
    private double  plasmaHalfLife; 

     Random r = new Random();
          

    public int getNumberHealthyPeople() {
        return numberHealthyPeople;
    }

    public void setNumberHealthyPeople(int numberHealthyPeople) {
        this.numberHealthyPeople = numberHealthyPeople;
    }

    public int getUnhealthyPeople() {
        return unhealthyPeople;
    }

    public void setUnhealthyPeople(int unhealthyPeople) {
        this.unhealthyPeople = unhealthyPeople;
    }

    public String getTargetArea() {
        return targetArea;
    }

    public void setTargetArea(String targetArea) {
        this.targetArea = targetArea;
    }

    public double getPreferredDose() {
        return preferredDose;
    }

    public void setPreferredDose(double preferredDose) {
        this.preferredDose = preferredDose;
    }

    public double getNewDose() {
        return newDose;
    }

    public void setNewDose(double newDose) {
        this.newDose = newDose;
    }

    public Date getDuration() {
        return duration;
    }

    public void setDuration(Date duration) {
        this.duration = duration;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
    
    
    public double calculatecompoundSolubility(){
        
        double temp = r.nextDouble();
    
        return temp;
    }
    
      public double calculateGastricEmptyingTime(){
        
        double temp = r.nextDouble();
    
        return temp+1;
    }
      public double calculateintestinalTransitTime(){
        
        double temp = r.nextDouble()*100;
    
        return temp;
    }
      public double calculatechemicalInstability(){
        
        double temp = r.nextDouble();
    
        return temp*10;
    }
      public double calculateglucuronideFormation(){
        
        double temp = r.nextDouble();
    
        return temp;
    }
      public double calculaterateOfDissolution(){
        
        double temp = r.nextDouble()*10;
    
        return temp;
    }
      public double calculatecLogPvalue(){
        
        double temp = r.nextDouble()*100;
    
        return temp;
    }
      public double calculatebloodFlowRate(){
        
        double temp = r.nextDouble();
    
        return temp;
    }
      public double calculatemolecularSize(){
        
        double temp = r.nextDouble()*01;
    
        return temp;
    }
      public double calculateserumProtein(){
        
        double temp = r.nextDouble()*100;
    
        return temp;
    }
      public double calculatepolarity(){
        
        double temp = r.nextDouble()*10;
    
        return temp;
    }
      public double calculatedrugConcentration(){
        
        double temp = r.nextDouble()*10;
    
        return temp;
    }
      public double calculateclearanceTime(){
        
        double temp = r.nextDouble()*100;
    
        return temp;
    }
       public double calculateplasmaHalfLife(){
        
        double temp = r.nextDouble();
    
        return temp;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
        
    
    
}

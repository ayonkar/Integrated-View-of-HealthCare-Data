/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chemical;

 
import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class ChemicalDirectory {
    
    private ArrayList<Chemical> chemicalList;
    
    public  ChemicalDirectory(){
        chemicalList = new  ArrayList<Chemical>();
    }
    
    public Chemical addChemical(String name,double molecularWeight,String formula,String Comment){
        
        Chemical c = new Chemical();
        c.setChemicalName(name);
        c.setMolecularWeight(molecularWeight);
        c.setFormula(formula);
        c.setComment(Comment);
        chemicalList.add(c);
        return c;

    }
    
    public void removeChemical(Chemical chemical){
        chemicalList.remove(chemical);
    }

    public ArrayList<Chemical> getChemical() {
        return chemicalList;
    }

    public void setChemical(ArrayList<Chemical> chemical) {
        this.chemicalList = chemical;
    }
    
    
    
}

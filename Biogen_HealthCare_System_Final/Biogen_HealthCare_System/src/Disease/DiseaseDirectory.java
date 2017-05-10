/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Disease;

 
import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class DiseaseDirectory {
    
    private ArrayList<Disease> diseaseList;

    public ArrayList<Disease> getDisease() {
        return diseaseList;
    }

    public void setDisease(ArrayList<Disease> disease) {
        this.diseaseList = disease;
    }
    
    public DiseaseDirectory(){
        diseaseList = new ArrayList<>();
    }
 
    public Disease addDiseaseList(String disease, String description,String category,String gene){
        Disease d = new Disease();
        d.setDiseaseName(disease);
        d.setDiseaseDescription(description);
        d.setDiseaseCategory(category);
        d.setGene(gene);
        diseaseList.add(d);        
        return  d; 
    }
 
}

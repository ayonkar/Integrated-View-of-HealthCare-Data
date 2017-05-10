package Business;

import Business.Employee.Employee;
import static Business.Organization.Organization.Type.Clinic;
import static Business.Organization.Organization.Type.Hospital;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import Chemical.Chemical;
import Chemical.ChemicalDirectory;
import Clinic.ClinicDirectory;
import Disease.Disease;
import Disease.DiseaseDirectory;
import Drug.AvailableDrug;
import Hospital.HospitalDirectory;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import Clinic.Clinic;
import Pharmacy.Pharmacy;
import Pharmacy.PharmacyDirectory;
import Hospital.Hospital;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
     
    
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("Tapadyuti_Maiti","Creator",0);
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        
        return system;
    }
    
    
       public static DiseaseDirectory configureDisease() throws ParseException  {
        
        DiseaseDirectory dd = new DiseaseDirectory();
         SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
         
         
        String Asthmadesc = "Asthma is a complex syndrome with many clinical phenotypes in both adults and children. Its major characteristics include a variable degree of airflow obstruction, bronchial hyperresponsiveness, and airway inflammation. Inhaled allergens encounter antigen presenting cells (APC) that line the airway";
        String Alzheimerdesc = "Alzheimer's disease (AD) is a chronic disorder that slowly destroys neurons and causes serious cognitive disability. AD is associated with senile plaques and neurofibrillary tangles (NFTs). Amyloid-beta (Abeta), a major component of senile plaques, has various pathological effects on cell and organelle function.";
        String Anaphylaxisdesc = "Anaphylaxis is a severe, life-threatening, systemic allergic reaction that is almost always unanticipated and may lead to death by airway obstruction or vascular collapse.";
        String Cutaneousdesc = "Cutaneous lupus erythematosus (CLE) is the skin-related form of lupus erythematosus (LE), with a broad spectrum of clinical manifestations and a variable course.";
        
        
        
        
        Disease d1 = dd.addDiseaseList("Asthama",Asthmadesc, "Immune system disease"," AA  SeQ: MGLT SQLL PPLF FLLA CAGN FVHG HKCD ITLQ EIIK TLNS LTEQ KTLC TELT VTDI FAAS" +
"KNTTEKETFCRAATVLRQFYSHHEKDTRCLGATAQQFHRHKQLIRFLKRLDRNLWGLAGL\n" +
"NSCPVKEANQSTLENFLERLKTIMREKYSKCSS ");
        AvailableDrug ad1 =  d1.addAvailableDrug("Epinephrine", 100,"Anti-inflammatory","Approved", sdf.parse("23/11/2013"));
            ChemicalDirectory cd1 = new ChemicalDirectory();
            cd1.addChemical("Methylprednisolone",374.4706,"C3H6O", "Strongly Active");
            cd1.addChemical("Prednisolone", 454.5, "C21H28O5", "Adhesive");
        ad1.setChemicalList(cd1);
        
        Disease d2 = dd.addDiseaseList("Alzheimer",Alzheimerdesc, "Neurodegenerative disease","AA SeQ: MGEE GGSA SHDE EERA SVLL GHSP GCEM CSQE AFQA QRSQ LVEL LVSG SLEG FESV LDWL" );
 
        AvailableDrug ad2 =  d2.addAvailableDrug("Donepezil", 100,"Anti-inflammatory","Approved", sdf.parse("23/11/2013"));
            ChemicalDirectory cd2 = new ChemicalDirectory();
            cd2.addChemical("Cubane", 454.5, "C2H3N", "Highly Dangerous");
            cd2.addChemical("Fenestrane", 278.987, "CFTY6", "Weak");
        ad2.setChemicalList(cd2);
        
        Disease d3 = dd.addDiseaseList("Anaphylaxis",Anaphylaxisdesc, "Immune system disease"," AA  SeQ: MGPT SQLL PPLA FXLL CAGN TVHG UKCD IILQ EOIK TMNS LQEQ KWLC TALT VXDI FGAS" +
"MRGARGAWDFLCVLLLLLRVQTGSSQPSVSPGEPS\n" +
"CSVDQEGKSVLSEKFILKVRPAFKAVPVVSVSKASYLLREGEEFTVFMCYANNTFG");
        AvailableDrug ad3 =  d3.addAvailableDrug("Anaphyl", 90,"Anti-inflammatory","Approved", sdf.parse("23/10/2014"));
            ChemicalDirectory cd3 = new ChemicalDirectory();
            cd3.addChemical("Olympiadane",100.345,"AlCl3", "Reactive");
            cd3.addChemical("Penguinone", 450.98, "SbCl3", "Safe");
        ad3.setChemicalList(cd3);
        
        
                Disease d4 = dd.addDiseaseList("Cutaneous",Cutaneousdesc, "Immune system disease"," AA  SeQ: PGPT SQLL PTLA FXLA CANO TVZG QKCD IQLQ EOQK TRNS LREQ KPLC TLLT UXDI QGAS" +
"BVHJBHUJVJHBKJNLKQPSVSPGEPS\n" +
"VQIBIJKNJKSJXNKJQNLKEMDKLQNDFJNVFMCYANNTFG");
        AvailableDrug ad4 =  d4.addAvailableDrug("Cutan", 120,"Anti-inflammatory","Approved", sdf.parse("08/10/2015"));
            ChemicalDirectory cd4 = new ChemicalDirectory();
            cd4.addChemical("Arsole",120.895,"C4H10O", "Harmful Agent");
            cd4.addChemical("Mimimycin", 90.89, "LiCl", "Dangerous");
        ad4.setChemicalList(cd4);
        
        
        
        

//        Calendar now = Calendar.getInstance();
//
//                            String currentDate = String.valueOf(now.get(Calendar.MONTH) - m)
//                                    + "/" + String.valueOf(now.get(Calendar.DATE)) + "/"
//                                    + String.valueOf(now.get(Calendar.YEAR));


  return dd;
        
    }
    
     public static HospitalDirectory configureHospital(){
    
           HospitalDirectory hd = new HospitalDirectory();
           
           Hospital hospital = hd.addHospital("Boston Medical Hospital");
           hospital.setHospitalId("1");
           hospital.addDrugDetail(100, "Salmeterol 25mcg",5,"10","12/09/2017","Active");
           hospital.addDrugDetail(101, "Acetaminophen",10,"15","06/10/2018","Active");
           
           
           
           Hospital hospital1 = hd.addHospital("New York Medical School");
           hospital1.setHospitalId("2");
           hospital1.addDrugDetail(103, "Adderal",100,"10","07/11/2019","Active");
           hospital1.addDrugDetail(104, "Alprazolam",120,"12.79","03/09/2020","Active");
           hospital1.addDrugDetail(105, "Amitriptyline",36,"6","01/04/2019","Active");
           
           
           Hospital hospital2 = hd.addHospital("Harvard School of Medicine");
           hospital2.setHospitalId("3");
           hospital2.addDrugDetail(106, "Citalopram",70,"11","09/12/2018","Active");
           hospital2.addDrugDetail(107, "Meloxicam",20,"13.3","12/06/2020","Active");
           hospital2.addDrugDetail(108, "Trazodone",50,"21","03/28/2019","Active");
           hospital2.addDrugDetail(109, "Omeprazole",30,"15","07/24/2022","Active");
           
           
           //System.out.print("Size of Hospital Direc "+hd.getHospitalList().size());
           
           
           
           return hd;
        
    }
    
    
    public static ClinicDirectory configureClinic(){
    
           ClinicDirectory hd = new ClinicDirectory();
           
           Clinic clinic = hd.addClinic("Boston Medical Hospital");
           clinic.setCliniclId("1");
           clinic.addDrugDetail(100, "Salmeterol 25mcg",5,"10","12/09/2017","Active");
           clinic.addDrugDetail(101, "Acetaminophen",10,"15","06/10/2018","Active");
           clinic.getDrugDetails().size();
           
           
           
           Clinic clinic1 = hd.addClinic("New York Medical School");
           clinic1.setCliniclId("2");
           clinic1.addDrugDetail(103, "Adderal",100,"10","07/11/2019","Active");
           clinic1.addDrugDetail(104, "Alprazolam",120,"12.79","03/09/2020","Active");
           clinic1.addDrugDetail(105, "Amitriptyline",36,"6","01/04/2019","Active");
           
           
           Clinic clinic2 = hd.addClinic("Harvard School of Medicine");
           clinic2.setCliniclId("3");
           clinic2.addDrugDetail(106, "Citalopram",70,"11","09/12/2018","Active");
           clinic2.addDrugDetail(107, "Meloxicam",20,"13.3","12/06/2020","Active");
           clinic2.addDrugDetail(108, "Trazodone",50,"21","03/28/2019","Active");
           clinic2.addDrugDetail(109, "Omeprazole",30,"15","07/24/2022","Active");
           
           
           //System.out.print("Size of Hospital Direc "+hd.getHospitalList().size());
           
           
           
           return hd;
        
    }
    
     public static PharmacyDirectory configurePharmacy(){
    
           PharmacyDirectory hd = new PharmacyDirectory();
           
           Pharmacy pharmacy = hd.addPharmacy("Boston Medical Hospital");
           pharmacy.setPharmacyId("1");
           pharmacy.addDrugDetail(100, "Salmeterol 25mcg",5,"10","12/09/2017","Active");
           pharmacy.addDrugDetail(101, "Acetaminophen",10,"15","06/10/2018","Active");
           
           
           
           Pharmacy pharmacy1 = hd.addPharmacy("New York Medical School");
           pharmacy1.setPharmacyId("2");
           pharmacy1.addDrugDetail(103, "Adderal",100,"10","07/11/2019","Active");
           pharmacy1.addDrugDetail(104, "Alprazolam",120,"12.79","03/09/2020","Active");
           pharmacy1.addDrugDetail(105, "Amitriptyline",36,"6","01/04/2019","Active");
           
           
           Pharmacy pharmacy2 = hd.addPharmacy("Harvard School of Medicine");
           pharmacy2.setPharmacyId("3");
           pharmacy2.addDrugDetail(106, "Citalopram",70,"11","09/12/2018","Active");
           pharmacy2.addDrugDetail(107, "Meloxicam",20,"13.3","12/06/2020","Active");
           pharmacy2.addDrugDetail(108, "Trazodone",50,"21","03/28/2019","Active");
           pharmacy2.addDrugDetail(109, "Omeprazole",30,"15","07/24/2022","Active");
           
           
           //System.out.print("Size of Hospital Direc "+hd.getHospitalList().size());
           
           
           
           return hd;
        
    }
    
    
}

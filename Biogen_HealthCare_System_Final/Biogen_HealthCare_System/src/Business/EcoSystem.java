/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import java.util.ArrayList;
import Business.Role.SystemAdminRole;
/**
 *
 * @author Lenovo
 */
public class EcoSystem extends Organization{ //EcoSystem is a serires of Network 
    
    private static EcoSystem business;
    private ArrayList<Network> networkList;

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    

    
    public Network createAndAddNetwork(){
        Network network = new Network();
        networkList.add(network);
        return network;
        
    }
    
    public static EcoSystem getInstance(){
        if(business == null){ business = new EcoSystem();}
        return business;
    }
     
    @Override
    public ArrayList<Role> getSupportedRole() {
      ArrayList<Role> roleList = new ArrayList<>();
       SystemAdminRole sar = new SystemAdminRole();
      roleList.add(sar);
      return roleList;
    }

    private EcoSystem(){
    super("null",0);
     networkList=new ArrayList();
    //Constrctor no problem
    }
    
    
    public boolean checkIfUserNameisUnique(String userName)
    {
     if(this.getUserAccountDirectory().checkIfUsernameIsUnique(userName))
       {
           return false;
       }
       for(Network network:networkList)
       {
           for(Enterprise enterprise:network.getEnterpriseDirectory().getEl()){
               if(!enterprise.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
                   return false;
               }
               for(Organization organization:enterprise.getOrganizationDirectory().getOrganizationList()){
                   if(!organization.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
                       return false;
                   }
               }
           }
       }
       return true;  

    }
    
    
    
    
}
